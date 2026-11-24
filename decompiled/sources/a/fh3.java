package a;

/* JADX INFO: loaded from: classes3.dex */
public enum fh3 implements sgf0 {
    BALLS("balls"),
    /* JADX INFO: Fake field, exist only in values array */
    DOTS("dots"),
    /* JADX INFO: Fake field, exist only in values array */
    ARROWS("chevrons"),
    /* JADX INFO: Fake field, exist only in values array */
    SPORTSMEN("men");


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f9524a;

    fh3(String str) {
        this.f9524a = str;
    }

    @Override // a.sgf0
    public final String a() {
        return "startScreenLoaderType";
    }

    @Override // a.sgf0
    public final String getValue() {
        return this.f9524a;
    }
}
