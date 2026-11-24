package a;

/* JADX INFO: loaded from: classes5.dex */
public final class w1d implements vj50 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ rv2 f38393a;

    public w1d(rv2 rv2Var) {
        this.f38393a = rv2Var;
    }

    @Override // a.vj50
    public final long C(int i, long j) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j & 4294967295L));
        if (fIntBitsToFloat >= 0.0f) {
            return 0L;
        }
        float fC = this.f38393a.c(fIntBitsToFloat);
        return (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(fC)) & 4294967295L);
    }

    @Override // a.vj50
    public final long S(int i, long j, long j2) {
        return (((long) Float.floatToRawIntBits(this.f38393a.c(Float.intBitsToFloat((int) (j2 & 4294967295L))))) & 4294967295L) | (Float.floatToRawIntBits(0.0f) << 32);
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    @Override // a.vj50
    public final Object g(long j, long j2, zje zjeVar) {
        v1d v1dVar;
        if (zjeVar instanceof v1d) {
            v1dVar = (v1d) zjeVar;
            int i = v1dVar.m;
            if ((i & Integer.MIN_VALUE) != 0) {
                v1dVar.m = i - Integer.MIN_VALUE;
            } else {
                v1dVar = new v1d(this, zjeVar);
            }
        } else {
            v1dVar = new v1d(this, zjeVar);
        }
        v1d v1dVar2 = v1dVar;
        Object obj = v1dVar2.k;
        Object obj2 = wne.f39444a;
        int i2 = v1dVar2.m;
        if (i2 == 0) {
            z1x.P(obj);
            uts0 uts0VarM0 = ro4.m0(0, 0, null, 7);
            v1dVar2.i = j;
            v1dVar2.j = j2;
            v1dVar2.m = 1;
            if (this.f38393a.g(uts0VarM0, v1dVar2) != obj2) {
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
        j2 = v1dVar2.j;
        j = v1dVar2.i;
        z1x.P(obj);
        v1dVar2.i = j;
        v1dVar2.j = j2;
        v1dVar2.m = 2;
        Object objG = super.g(j, j2, v1dVar2);
        return objG == obj2 ? obj2 : objG;
    }
}
