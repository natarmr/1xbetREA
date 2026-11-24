package a;

/* JADX INFO: loaded from: classes5.dex */
public enum ay10 implements sgf0 {
    TABS_LINE_ITEMS("tabsLineItems"),
    TABS_CARD_ITEMS("tabsCardItems"),
    /* JADX INFO: Fake field, exist only in values array */
    ACCORDEON_LINE_ITEMS_BACKGROUND("accordeonLineItemsBackground"),
    /* JADX INFO: Fake field, exist only in values array */
    ACCORDEON_LINE_ITEMS_OFFSET("accordeonLineItemsOffset"),
    /* JADX INFO: Fake field, exist only in values array */
    ACCORDEON_CARDS("accordeonCards"),
    /* JADX INFO: Fake field, exist only in values array */
    ACCORDEON_COMPACT_CARDS("accordeonCompactCards"),
    /* JADX INFO: Fake field, exist only in values array */
    PLAIN_CATEGORIZED_CARDS("plainCategorizedCards"),
    /* JADX INFO: Fake field, exist only in values array */
    PLAIN_LIST_ITEMS("plainListItems");


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f1650a;

    ay10(String str) {
        this.f1650a = str;
    }

    @Override // a.sgf0
    public final String a() {
        return "menuStyle";
    }

    @Override // a.sgf0
    public final String getValue() {
        return this.f1650a;
    }
}
