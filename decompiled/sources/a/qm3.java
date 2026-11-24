package a;

/* JADX INFO: loaded from: classes2.dex */
public enum qm3 implements sgf0 {
    IMAGE("img"),
    REMOTE_IMAGE("remoteImg"),
    /* JADX INFO: Fake field, exist only in values array */
    LOTTIE("lottie"),
    VIDEO("video");


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f28963a;

    qm3(String str) {
        this.f28963a = str;
    }

    @Override // a.sgf0
    public final String a() {
        return "updateScreenBackgroundStyle";
    }

    @Override // a.sgf0
    public final String getValue() {
        return this.f28963a;
    }
}
