package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;
import java.util.Collection;

/* JADX INFO: loaded from: classes3.dex */
public final class zzr implements b0s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f45268a;
    public final dur b;
    public final qtr c;
    public final vzr d;
    public final wzr e;
    public final uzr f;
    public final fus g;

    public zzr(long j, dur durVar, qtr qtrVar, vzr vzrVar, wzr wzrVar, uzr uzrVar, fus fusVar) {
        this.f45268a = j;
        this.b = durVar;
        this.c = qtrVar;
        this.d = vzrVar;
        this.e = wzrVar;
        this.f = uzrVar;
        this.g = fusVar;
    }

    @Override // a.b0s
    public final long a() {
        return this.f45268a;
    }

    @Override // a.b0s
    public final void d(ArrayList arrayList, p6t0 p6t0Var, p6t0 p6t0Var2) {
        p6t0Var.getClass();
        p6t0Var2.getClass();
        if ((p6t0Var instanceof zzr) && (p6t0Var2 instanceof zzr)) {
            zzr zzrVar = (zzr) p6t0Var;
            zzr zzrVar2 = (zzr) p6t0Var2;
            k9x.G(arrayList, zzrVar.d, zzrVar2.d);
            k9x.G(arrayList, zzrVar.e, zzrVar2.e);
            k9x.G(arrayList, zzrVar.f, zzrVar2.f);
            k9x.G(arrayList, new xzr(zzrVar.g), new xzr(zzrVar2.g));
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzr)) {
            return false;
        }
        zzr zzrVar = (zzr) obj;
        return this.f45268a == zzrVar.f45268a && this.b.equals(zzrVar.b) && this.c.equals(zzrVar.c) && this.d.equals(zzrVar.d) && this.e.equals(zzrVar.e) && this.f.equals(zzrVar.f) && this.g.equals(zzrVar.g);
    }

    @Override // a.b0s
    public final dur getHeader() {
        return this.b;
    }

    public final int hashCode() {
        return this.g.hashCode() + ((this.f.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (Long.hashCode(this.f45268a) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    @Override // a.p6t0
    public final /* bridge */ /* synthetic */ Collection o(p6t0 p6t0Var, p6t0 p6t0Var2) {
        return o(p6t0Var, p6t0Var2);
    }

    public final String toString() {
        String strI = axq.i("Timer(value=", this.g, Separators.RPAREN);
        StringBuilder sb = new StringBuilder("GameCardType9UiModel(gameId=");
        sb.append(this.f45268a);
        sb.append(", header=");
        sb.append(this.b);
        sb.append(", footer=");
        sb.append(this.c);
        sb.append(", teamFirst=");
        sb.append(this.d);
        sb.append(", teamSecond=");
        sb.append(this.e);
        sb.append(", description=");
        sb.append(this.f);
        return rw2.o(sb, ", timer=", strI, Separators.RPAREN);
    }

    @Override // a.b0s
    public final qtr w0() {
        return this.c;
    }
}
