package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;
import java.util.Collection;

/* JADX INFO: loaded from: classes3.dex */
public final class myr implements b0s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f22616a;
    public final dur b;
    public final qtr c;
    public final String d;
    public final iyr e;
    public final jyr f;
    public final kyr g;

    public myr(long j, dur durVar, qtr qtrVar, String str, iyr iyrVar, jyr jyrVar, kyr kyrVar) {
        this.f22616a = j;
        this.b = durVar;
        this.c = qtrVar;
        this.d = str;
        this.e = iyrVar;
        this.f = jyrVar;
        this.g = kyrVar;
    }

    @Override // a.b0s
    public final long a() {
        return this.f22616a;
    }

    @Override // a.b0s
    public final void d(ArrayList arrayList, p6t0 p6t0Var, p6t0 p6t0Var2) {
        p6t0Var.getClass();
        p6t0Var2.getClass();
        if ((p6t0Var instanceof myr) && (p6t0Var2 instanceof myr)) {
            myr myrVar = (myr) p6t0Var;
            myr myrVar2 = (myr) p6t0Var2;
            k9x.G(arrayList, new hyr(myrVar.d), new hyr(myrVar2.d));
            k9x.G(arrayList, myrVar.e, myrVar2.e);
            k9x.G(arrayList, myrVar.f, myrVar2.f);
            k9x.G(arrayList, myrVar.g, myrVar2.g);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof myr)) {
            return false;
        }
        myr myrVar = (myr) obj;
        return this.f22616a == myrVar.f22616a && this.b.equals(myrVar.b) && this.c.equals(myrVar.c) && this.d.equals(myrVar.d) && this.e.equals(myrVar.e) && this.f.equals(myrVar.f) && this.g.equals(myrVar.g);
    }

    @Override // a.b0s
    public final dur getHeader() {
        return this.b;
    }

    public final int hashCode() {
        return this.g.hashCode() + ((this.f.hashCode() + ((this.e.f15602a.hashCode() + ua80.b((this.c.hashCode() + ((this.b.hashCode() + (Long.hashCode(this.f22616a) * 31)) * 31)) * 31, 31, this.d)) * 31)) * 31);
    }

    @Override // a.p6t0
    public final /* bridge */ /* synthetic */ Collection o(p6t0 p6t0Var, p6t0 p6t0Var2) {
        return o(p6t0Var, p6t0Var2);
    }

    public final String toString() {
        return "GameCardType4UiModel(gameId=" + this.f22616a + ", header=" + this.b + ", footer=" + this.c + ", information=" + kng0.l("Information(value=", this.d, Separators.RPAREN) + ", score=" + this.e + ", teamFirst=" + this.f + ", teamSecond=" + this.g + Separators.RPAREN;
    }

    @Override // a.b0s
    public final qtr w0() {
        return this.c;
    }
}
