package a;

/* JADX INFO: loaded from: classes2.dex */
public final class ju2 implements vj50 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f17130a;
    public final /* synthetic */ rv2 b;

    public ju2(boolean z, rv2 rv2Var) {
        this.f17130a = z;
        this.b = rv2Var;
    }

    @Override // a.vj50
    public final long C(int i, long j) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j & 4294967295L));
        if (fIntBitsToFloat >= 0.0f || !this.f17130a) {
            return 0L;
        }
        float fC = this.b.c(fIntBitsToFloat);
        return (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(fC)) & 4294967295L);
    }

    @Override // a.vj50
    public final long S(int i, long j, long j2) {
        if (!this.f17130a) {
            return 0L;
        }
        return (((long) Float.floatToRawIntBits(this.b.c(Float.intBitsToFloat((int) (j2 & 4294967295L))))) & 4294967295L) | (Float.floatToRawIntBits(0.0f) << 32);
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    @Override // a.vj50
    public final Object g(long j, long j2, zje zjeVar) {
        iu2 iu2Var;
        if (zjeVar instanceof iu2) {
            iu2Var = (iu2) zjeVar;
            int i = iu2Var.m;
            if ((i & Integer.MIN_VALUE) != 0) {
                iu2Var.m = i - Integer.MIN_VALUE;
            } else {
                iu2Var = new iu2(this, zjeVar);
            }
        } else {
            iu2Var = new iu2(this, zjeVar);
        }
        iu2 iu2Var2 = iu2Var;
        Object obj = iu2Var2.k;
        Object obj2 = wne.f39444a;
        int i2 = iu2Var2.m;
        if (i2 == 0) {
            z1x.P(obj);
            uts0 uts0VarM0 = ro4.m0(0, 0, null, 7);
            iu2Var2.i = j;
            iu2Var2.j = j2;
            iu2Var2.m = 1;
            if (this.b.g(uts0VarM0, iu2Var2) != obj2) {
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
        j2 = iu2Var2.j;
        j = iu2Var2.i;
        z1x.P(obj);
        iu2Var2.i = j;
        iu2Var2.j = j2;
        iu2Var2.m = 2;
        Object objG = super.g(j, j2, iu2Var2);
        return objG == obj2 ? obj2 : objG;
    }
}
