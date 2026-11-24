package a;

/* JADX INFO: loaded from: classes5.dex */
public enum daj0 implements sgf0 {
    LIST("list"),
    /* JADX INFO: Fake field, exist only in values array */
    WIDGETS("widgets"),
    /* JADX INFO: Fake field, exist only in values array */
    TABS("tabs"),
    /* JADX INFO: Fake field, exist only in values array */
    ACCORDION("accordion");


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f5751a;

    daj0(String str) {
        this.f5751a = str;
    }

    @Override // a.sgf0
    public final String a() {
        return "settingsScreenStyle";
    }

    @Override // a.sgf0
    public final String getValue() {
        return this.f5751a;
    }
}
