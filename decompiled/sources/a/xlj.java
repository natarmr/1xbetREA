package a;

/* JADX INFO: loaded from: classes3.dex */
public final class xlj extends upj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f41076a;
    public final String b;
    public final int c;
    public final String d;
    public final boolean e;

    public xlj(int i, String str, String str2, String str3, boolean z) {
        this.f41076a = str;
        this.b = str2;
        this.c = i;
        this.d = str3;
        this.e = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xlj)) {
            return false;
        }
        xlj xljVar = (xlj) obj;
        return this.f41076a.equals(xljVar.f41076a) && this.b.equals(xljVar.b) && this.c == xljVar.c && this.d.equals(xljVar.d) && this.e == xljVar.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + brm0.e(ua80.b(twn.a(this.c, ua80.b(this.f41076a.hashCode() * 31, 31, this.b), 31), 31, this.d), 31, this.e);
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("BetWithoutRisk(title=", this.f41076a, ", translateId=", this.b, ", lotteryId=");
        kng0.w(this.c, ", imageUrl=", this.d, ", needAuth=", sbN);
        return rw2.p(sbN, this.e, ", hasBackStack=false)");
    }
}
