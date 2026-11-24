package a;

/* JADX INFO: loaded from: classes5.dex */
public enum hh0 implements sgf0 {
    /* JADX INFO: Fake field, exist only in values array */
    FULL("full"),
    ICON_LEFT("iconLeft"),
    ICON_LEFT_VIRTUAL("iconLeftVirtual"),
    /* JADX INFO: Fake field, exist only in values array */
    ICON_RIGHT("iconRight"),
    /* JADX INFO: Fake field, exist only in values array */
    RECTANGLE("rectangle");


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f13038a;

    hh0(String str) {
        this.f13038a = str;
    }

    @Override // a.sgf0
    public final String a() {
        return "aggregatorCategoryButtonStyle";
    }

    @Override // a.sgf0
    public final String getValue() {
        return this.f13038a;
    }
}
