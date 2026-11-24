package a;

/* JADX INFO: loaded from: classes3.dex */
public final class hmj extends upj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f13309a;
    public final boolean b;

    public hmj(String str, boolean z) {
        this.f13309a = str;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hmj)) {
            return false;
        }
        hmj hmjVar = (hmj) obj;
        return this.f13309a.equals(hmjVar.f13309a) && this.b == hmjVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + brm0.e(this.f13309a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return ua80.j("Coupon(id=", this.f13309a, ", afterBet=", this.b, ", hasBackStack=false)");
    }
}
