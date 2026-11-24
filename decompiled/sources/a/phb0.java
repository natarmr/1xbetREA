package a;

/* JADX INFO: loaded from: classes5.dex */
public enum phb0 implements sgf0 {
    LOGO_CENTER("logoCenter"),
    /* JADX INFO: Fake field, exist only in values array */
    LOGO_RIGHT("logoRight"),
    /* JADX INFO: Fake field, exist only in values array */
    LOGO_LEFT("logoLeft");


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f26988a;

    phb0(String str) {
        this.f26988a = str;
    }

    @Override // a.sgf0
    public final String a() {
        return "popularScreenHeaderStyle";
    }

    @Override // a.sgf0
    public final String getValue() {
        return this.f26988a;
    }
}
