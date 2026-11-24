package a;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes.dex */
public final class hwj implements fvh0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ iwj f13772a;

    public hwj(iwj iwjVar) {
        this.f13772a = iwjVar;
    }

    @Override // a.fvh0
    public final evh0 b(long j) {
        iwj iwjVar = this.f13772a;
        long j2 = (((long) iwjVar.d.i) * j) / 1000000;
        long j3 = iwjVar.b;
        BigInteger bigIntegerValueOf = BigInteger.valueOf(j2);
        long j4 = iwjVar.c;
        hvh0 hvh0Var = new hvh0(j, vtt0.j((bigIntegerValueOf.multiply(BigInteger.valueOf(j4 - j3)).divide(BigInteger.valueOf(iwjVar.f)).longValue() + j3) - 30000, iwjVar.b, j4 - 1));
        return new evh0(hvh0Var, hvh0Var);
    }

    @Override // a.fvh0
    public final boolean d() {
        return true;
    }

    @Override // a.fvh0
    public final long g() {
        iwj iwjVar = this.f13772a;
        return (iwjVar.f * 1000000) / ((long) iwjVar.d.i);
    }
}
