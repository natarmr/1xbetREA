package a;

/* JADX INFO: loaded from: classes4.dex */
public enum j8l0 implements sgf0 {
    MEDIUM_ITEMS_SPACE_SEPARATOR("mediumItemsSpaceSeparator"),
    MEDIUM_ITEMS_LINE_SEPARATOR("mediumItemsLineSeparator"),
    MEDIUM_ITEMS_LINE_SEPARATOR_WITH_EVENTS("mediumItemsLineSeparatorWithEvents"),
    /* JADX INFO: Fake field, exist only in values array */
    LARGE_ITEM_SPACE_SEPARATOR("largeItemSpaceSeparator"),
    SMALL_ITEM_LINE_SEPARATOR("smallItemLineSeparator");


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f16089a;

    j8l0(String str) {
        this.f16089a = str;
    }

    @Override // a.sgf0
    public final String a() {
        return "sportFeedListStyle";
    }

    @Override // a.sgf0
    public final String getValue() {
        return this.f16089a;
    }
}
