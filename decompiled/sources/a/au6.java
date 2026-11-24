package a;

/* JADX INFO: loaded from: classes5.dex */
public enum au6 implements sgf0 {
    NONE("none"),
    IMAGE("image"),
    /* JADX INFO: Fake field, exist only in values array */
    LOTTIE("lottie");


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f1462a;

    au6(String str) {
        this.f1462a = str;
    }

    @Override // a.sgf0
    public final String a() {
        return "betDoneIconStyle";
    }

    @Override // a.sgf0
    public final String getValue() {
        return this.f1462a;
    }
}
