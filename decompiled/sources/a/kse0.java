package a;

/* JADX INFO: loaded from: classes4.dex */
public enum kse0 implements sgf0 {
    DEFAULT("defaultScreenStyle"),
    /* JADX INFO: Fake field, exist only in values array */
    VISUAL_SCREEN("visualScreenStyle"),
    SIMPLE_SCREEN("simpleScreenStyle");


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f18810a;

    kse0(String str) {
        this.f18810a = str;
    }

    @Override // a.sgf0
    public final String a() {
        return "regAndAuthScreenStyles";
    }

    @Override // a.sgf0
    public final String getValue() {
        return this.f18810a;
    }
}
