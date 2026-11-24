package a;

/* JADX INFO: loaded from: classes.dex */
public final class ygk {
    public static final /* synthetic */ int c = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f42588a = 0;
    public final int b = 0;

    static {
        vtt0.H(0);
        vtt0.H(1);
        vtt0.H(2);
        vtt0.H(3);
    }

    public ygk(nek nekVar) {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ygk)) {
            return false;
        }
        ygk ygkVar = (ygk) obj;
        return this.f42588a == ygkVar.f42588a && this.b == ygkVar.b;
    }

    public final int hashCode() {
        return (((16337 + this.f42588a) * 31) + this.b) * 31;
    }
}
