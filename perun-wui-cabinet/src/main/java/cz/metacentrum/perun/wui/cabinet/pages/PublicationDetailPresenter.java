package cz.metacentrum.perun.wui.cabinet.pages;

import com.google.inject.Inject;
import com.google.web.bindery.event.shared.EventBus;
import com.gwtplatform.mvp.client.HasUiHandlers;
import com.gwtplatform.mvp.client.Presenter;
import com.gwtplatform.mvp.client.View;
import com.gwtplatform.mvp.client.annotations.NameToken;
import com.gwtplatform.mvp.client.annotations.ProxyStandard;
import com.gwtplatform.mvp.client.proxy.PlaceManager;
import com.gwtplatform.mvp.client.proxy.ProxyPlace;
import cz.metacentrum.perun.wui.cabinet.client.resources.PerunCabinetPlaceTokens;
import cz.metacentrum.perun.wui.client.PerunPresenter;
import cz.metacentrum.perun.wui.client.resources.PerunSession;


public class PublicationDetailPresenter extends Presenter<PublicationDetailPresenter.MyView, PublicationDetailPresenter.MyProxy> implements PublicationDetailUiHandlers {

	private PlaceManager placeManager = PerunSession.getPlaceManager();

	public interface MyView extends View, HasUiHandlers<PublicationDetailUiHandlers> {
	}

	@NameToken(PerunCabinetPlaceTokens.PUBLICATION_DETAIL)
	@ProxyStandard
	public interface MyProxy extends ProxyPlace<PublicationDetailPresenter> {
	}

	@Inject
	public PublicationDetailPresenter(final EventBus eventBus, final MyView view, final MyProxy proxy) {
		super(eventBus, view, proxy, PerunPresenter.SLOT_MAIN_CONTENT);

		getView().setUiHandlers(this);
	}
}