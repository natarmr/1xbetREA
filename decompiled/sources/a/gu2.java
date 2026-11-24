package a;

/* JADX INFO: loaded from: classes4.dex */
public final class gu2 implements vj50 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ rv2 f11909a;

    public gu2(rv2 rv2Var) {
        this.f11909a = rv2Var;
    }

    @Override // a.vj50
    public final long C(int i, long j) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j & 4294967295L));
        if (fIntBitsToFloat >= 0.0f) {
            return 0L;
        }
        float fC = this.f11909a.c(fIntBitsToFloat);
        return (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(fC)) & 4294967295L);
    }

    @Override // a.vj50
    public final long S(int i, long j, long j2) {
        return (((long) Float.floatToRawIntBits(this.f11909a.c(Float.intBitsToFloat((int) (j2 & 4294967295L))))) & 4294967295L) | (Float.floatToRawIntBits(0.0f) << 32);
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    @Override // a.vj50
    public final Object g(long j, long j2, zje zjeVar) {
        eu2 eu2Var;
        if (zjeVar instanceof eu2) {
            eu2Var = (eu2) zjeVar;
            int i = eu2Var.m;
            if ((i & Integer.MIN_VALUE) != 0) {
                eu2Var.m = i - Integer.MIN_VALUE;
            } else {
                eu2Var = new eu2(this, zjeVar);
            }
        } else {
            eu2Var = new eu2(this, zjeVar);
        }
        eu2 eu2Var2 = eu2Var;
        Object obj = eu2Var2.k;
        Object obj2 = wne.f39444a;
        int i2 = eu2Var2.m;
        if (i2 == 0) {
            z1x.P(obj);
            uts0 uts0VarM0 = ro4.m0(0, 0, null, 7);
            eu2Var2.i = j;
            eu2Var2.j = j2;
            eu2Var2.m = 1;
            if (this.f11909a.g(uts0VarM0, eu2Var2) != obj2) {
            }
        }
        if (i2 != 1) {
            if (i2 == 2) {
                z1x.P(obj);
                return obj;
            }
            jf4.n("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        j2 = eu2Var2.j;
        j = eu2Var2.i;
        z1x.P(obj);
        eu2Var2.i = j;
        eu2Var2.j = j2;
        eu2Var2.m = 2;
        Object objG = super.g(j, j2, eu2Var2);
        return objG == obj2 ? obj2 : objG;
    }
}
