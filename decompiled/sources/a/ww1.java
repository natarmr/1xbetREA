package a;

/* JADX INFO: loaded from: classes5.dex */
public enum ww1 implements sgf0 {
    PICTURE("picture"),
    /* JADX INFO: Fake field, exist only in values array */
    PICTURE_HEAD("pictureHead"),
    /* JADX INFO: Fake field, exist only in values array */
    GRADIENT("gradient"),
    /* JADX INFO: Fake field, exist only in values array */
    FIXED("fixed");


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f39865a;

    ww1(String str) {
        this.f39865a = str;
    }

    @Override // a.sgf0
    public final String a() {
        return "aggregatorTournamentScreenStyle";
    }

    @Override // a.sgf0
    public final String getValue() {
        return this.f39865a;
    }
}
