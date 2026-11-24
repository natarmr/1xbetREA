package a;

/* JADX INFO: loaded from: classes.dex */
public final class dv40 implements cd40 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f6728a;

    public dv40(int i) {
        this.f6728a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dv40) && this.f6728a == ((dv40) obj).f6728a;
    }

    public final int hashCode() {
        return this.f6728a;
    }

    public final String toString() {
        return "Mp4AlternateGroup: " + this.f6728a;
    }
}
