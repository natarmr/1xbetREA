package a;

/* JADX INFO: loaded from: classes4.dex */
public enum aeo0 implements sgf0 {
    COLOR_SELECTION_ICONS("colorSelectionIcons"),
    /* JADX INFO: Fake field, exist only in values array */
    BUBBLE_SELECTION_ICONS("bubbleSelectionIcons"),
    /* JADX INFO: Fake field, exist only in values array */
    COLOR_SELECTION_TEXT("colorSelectionText");


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f739a;

    aeo0(String str) {
        this.f739a = str;
    }

    @Override // a.sgf0
    public final String a() {
        return "tabsStyle";
    }

    @Override // a.sgf0
    public final String getValue() {
        return this.f739a;
    }
}
