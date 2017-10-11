package cz.metacentrum.perun.wui.cabinet.client.resources;

import cz.metacentrum.perun.wui.client.resources.PerunTranslation;

/**
 * Perun Cabinet translations.
 *
 * @author Vojtech Sassmann &lt;vojtech.sassmann@gmail.com&gt;
 */
public interface PerunCabinetTranslation extends PerunTranslation {

	@DefaultMessage("Publications")
	String appName();

	@DefaultMessage("Publications")
	String publications();

	@DefaultMessage("Title")
	String title();

	@DefaultMessage("Authors")
	String authors();

	@DefaultMessage("Year")
	String year();

	@DefaultMessage("Thanks")
	String thanks();

	@DefaultMessage("Cite")
	String cite();

	@DefaultMessage("New publication")
	String newPublication();

	@DefaultMessage("Loading publications")
	String loadingPublications();

	@DefaultMessage("Search by title")
	String filterText();

	@DefaultMessage("List all")
	String listAll();

	@DefaultMessage("Publication details")
	String pubDetail();

	@DefaultMessage("Save changes")
	String saveChanges();

	@DefaultMessage("Publication was not checked by administrator yet")
	String unCheckedPubMessage();

	@DefaultMessage(", you can modify any details until then.")
	String unCheckedPubMessageAdditional();

	@DefaultMessage("Publication was checked by administrator")
	String checkedPubMessage();

	@DefaultMessage("and is locked for changes. To unlock publication please contact support.")
	String checkedPubMessageAdditional();

	@DefaultMessage("Citation")
	String citation();

	@DefaultMessage("ISBN")
	String ISBN();

	@DefaultMessage("ISSN")
	String ISSN();

	@DefaultMessage("DOI")
	String DOI();
}