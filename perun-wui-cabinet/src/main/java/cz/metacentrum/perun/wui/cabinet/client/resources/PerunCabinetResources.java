package cz.metacentrum.perun.wui.cabinet.client.resources;

import com.google.gwt.core.client.GWT;
import com.google.gwt.resources.client.ClientBundle;
import com.google.gwt.resources.client.CssResource;

/**
 * Perun Cabinet app resources
 *
 * @author Vojtech Sassmann &lt;vojtech.sassmann@gmail.com&gt;
 */
public interface PerunCabinetResources extends ClientBundle {

	PerunCabinetResources INSTANCE = GWT.create(PerunCabinetResources.class);

	interface PerunCabinetCss extends CssResource {

		String app();

		String logoWrapper();

		String pubDetailAlert();

		String margin();

		String detailTextArea();

		String detailRow();

		String squareButton();
	}

	@Source("css/PerunCabinet.gss")
	PerunCabinetCss gss();
}