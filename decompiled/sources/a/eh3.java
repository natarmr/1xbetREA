package a;

/* JADX INFO: loaded from: classes2.dex */
public enum eh3 implements sgf0 {
    IMAGE("img"),
    REMOTE_IMAGE("remoteImg"),
    /* JADX INFO: Fake field, exist only in values array */
    LOTTIE("lottie"),
    VIDEO("video"),
    SMART_IMAGE("smartImage");


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f7790a;

    eh3(String str) {
        this.f7790a = str;
    }

    @Override // a.sgf0
    public final String a() {
        return "startScreenBackgroundDemo";
    }

    @Override // a.sgf0
    public final String getValue() {
        return this.f7790a;
    }
}
