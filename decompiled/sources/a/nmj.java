package a;

/* JADX INFO: loaded from: classes3.dex */
public final class nmj extends upj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f23775a;

    public nmj(int i) {
        this.f23775a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof nmj) && this.f23775a == ((nmj) obj).f23775a;
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + (Integer.hashCode(this.f23775a) * 31);
    }

    public final String toString() {
        return ua80.e(this.f23775a, "CyberHltv(cyberType=", ", hasBackStack=false)");
    }
}
