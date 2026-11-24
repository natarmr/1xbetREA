package a;

/* JADX INFO: loaded from: classes3.dex */
public final class rmj extends upj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f30745a;
    public final int b;

    public rmj(boolean z, int i) {
        this.f30745a = z;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rmj)) {
            return false;
        }
        rmj rmjVar = (rmj) obj;
        return this.f30745a == rmjVar.f30745a && this.b == rmjVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + twn.a(this.b, Boolean.hashCode(this.f30745a) * 31, 31);
    }

    public final String toString() {
        return "CyberTopChamps(live=" + this.f30745a + ", cyberType=" + this.b + ", hasBackStack=false)";
    }
}
