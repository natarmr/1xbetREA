package a;

/* JADX INFO: loaded from: classes2.dex */
public enum zlf0 {
    IGNORE("ignore"),
    WARN("warn"),
    STRICT("strict");


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f44579a;

    zlf0(String str) {
        this.f44579a = str;
    }

    public final boolean a() {
        return this == WARN;
    }
}
