package a;

/* JADX INFO: loaded from: classes2.dex */
public enum tyw0 {
    UNINITIALIZED("uninitialized"),
    POLICY("eu_consent_policy"),
    DENIED("denied"),
    GRANTED("granted");


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f34777a;

    tyw0(String str) {
        this.f34777a = str;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.f34777a;
    }
}
