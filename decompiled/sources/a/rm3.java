package a;

/* JADX INFO: loaded from: classes2.dex */
public enum rm3 implements sgf0 {
    /* JADX INFO: Fake field, exist only in values array */
    THIN_LINE("thinLine"),
    /* JADX INFO: Fake field, exist only in values array */
    THICK_LINE_WITH_ICON("thickLineWithIcon"),
    THICK_LINE("thickLine"),
    CIRCLE("circle");


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f30727a;

    rm3(String str) {
        this.f30727a = str;
    }

    @Override // a.sgf0
    public final String a() {
        return "updateScreenLoaderType";
    }

    @Override // a.sgf0
    public final String getValue() {
        return this.f30727a;
    }
}
