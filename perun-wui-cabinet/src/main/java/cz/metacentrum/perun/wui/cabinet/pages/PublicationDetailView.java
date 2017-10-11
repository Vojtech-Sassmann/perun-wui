package cz.metacentrum.perun.wui.cabinet.pages;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Widget;
import com.google.inject.Inject;
import com.gwtplatform.mvp.client.ViewWithUiHandlers;
import cz.metacentrum.perun.wui.cabinet.client.resources.PerunCabinetTranslation;
import org.gwtbootstrap3.client.ui.Alert;
import org.gwtbootstrap3.client.ui.Button;
import org.gwtbootstrap3.client.ui.TextArea;
import org.gwtbootstrap3.client.ui.TextBox;
import org.gwtbootstrap3.client.ui.constants.ButtonType;
import org.gwtbootstrap3.client.ui.constants.IconType;
import org.gwtbootstrap3.client.ui.html.Strong;
import org.gwtbootstrap3.client.ui.html.Text;
import org.gwtbootstrap3.extras.datepicker.client.ui.DatePicker;
import org.gwtbootstrap3.extras.datepicker.client.ui.base.constants.DatePickerMinView;


public class PublicationDetailView extends ViewWithUiHandlers<PublicationDetailUiHandlers> implements PublicationDetailPresenter.MyView {

	interface PublicationDetailViewUiBinder extends UiBinder<Widget, PublicationDetailView> {}

	private PerunCabinetTranslation translation = GWT.create(PerunCabinetTranslation.class);

	@UiField Button saveButton;
	@UiField Button backButton;
	@UiField Text pageName;
	@UiField Strong alertStrong;
	@UiField Text alertText;
	@UiField Alert alert;

	@UiField Strong titleLabel;
	@UiField Strong authorsLabel;
	@UiField Strong yearLabel;
	@UiField Strong ISBNLabel;
	@UiField Strong ISSNLabel;
	@UiField Strong DOILabel;
	@UiField Strong thanksLabel;
	@UiField Strong citationLabel;

//	@UiField Strong idLabel;
//	@UiField Strong sourceLabel;

	@UiField TextArea titleTextArea;
	@UiField Text authorsText;
	@UiField Button removeAuthorButton;
	@UiField Button addAuthorButton;
	@UiField DatePicker yearPicker;
	@UiField TextBox ISBNTextBox;
	@UiField Text thanksText;

	@Inject
	public PublicationDetailView(PublicationDetailViewUiBinder binder) {

		initWidget(binder.createAndBindUi(this));

		init();
	}


	private void init() {
		pageName.setText(translation.pubDetail());

		backButton.setIcon(IconType.ARROW_LEFT);
		backButton.setType(ButtonType.DEFAULT);
		backButton.setText(translation.back());

		saveButton.setType(ButtonType.PRIMARY);
		saveButton.setText(translation.saveChanges());

		//TODO change this to setPublication
		alertStrong.setText(translation.unCheckedPubMessage());
		alertText.setText(translation.unCheckedPubMessageAdditional());

		titleLabel.setText(translation.title() + ":");
		authorsLabel.setText(translation.authors() + ":");
		yearLabel.setText(translation.year() + ":");
		ISBNLabel.setText(translation.ISBN() + ":");
		ISSNLabel.setText(translation.ISSN() + ":");
		DOILabel.setText(translation.DOI() + ":");
		thanksLabel.setText(translation.thanks() + ":");
		citationLabel.setText(translation.citation() + ":");

		//TODO change this to setPublication
		titleTextArea.setText("Lorem ups ordert fouks.");
		authorsText.setText("Vojtech Sassmann");

		yearPicker.setViewSelect(DatePickerMinView.YEAR);
		yearPicker.setFormat("yyyy");

		//TODO
		thanksText.setText("MetaCentrum");

//		idLabel.setText("#1");
//		sourceLabel.setText("Imported from IS MU with ID #256627");
	}
}