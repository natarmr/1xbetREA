package a;

/* JADX INFO: loaded from: classes6.dex */
public final class pg90 implements vj50 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ mg90 f26942a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ pz40 c;
    public final /* synthetic */ pz40 d;

    public pg90(mg90 mg90Var, boolean z, pz40 pz40Var, pz40 pz40Var2) {
        this.f26942a = mg90Var;
        this.b = z;
        this.c = pz40Var;
        this.d = pz40Var2;
    }

    @Override // a.vj50
    public final long C(int i, long j) {
        fk50 fk50Var;
        boolean z = false;
        mg90 mg90Var = this.f26942a;
        if (i == 1 && ((fk50Var = mg90Var.c) == null || fk50Var.f9674a != 1)) {
            mg90Var.b = false;
        }
        if (i == 1 && !mg90Var.b) {
            int i2 = (int) (j >> 32);
            if (Float.intBitsToFloat(i2) != 0.0f) {
                mg90Var.b = true;
                boolean z2 = this.b;
                pz40 pz40Var = this.d;
                pz40 pz40Var2 = this.c;
                if (!z2 ? !((Float.intBitsToFloat(i2) <= 0.0f || !((Boolean) pz40Var2.getValue()).booleanValue()) && (Float.intBitsToFloat(i2) >= 0.0f || !((Boolean) pz40Var.getValue()).booleanValue())) : !((Float.intBitsToFloat(i2) >= 0.0f || !((Boolean) pz40Var2.getValue()).booleanValue()) && (Float.intBitsToFloat(i2) <= 0.0f || !((Boolean) pz40Var.getValue()).booleanValue()))) {
                    z = true;
                }
                mg90Var.f21731a = z;
            }
        }
        mg90Var.c = new fk50(i);
        return 0L;
    }

    @Override // a.vj50
    public final long S(int i, long j, long j2) {
        if (this.f26942a.f21731a && i == 1) {
            return 0L;
        }
        return j2;
    }

    @Override // a.vj50
    public final Object g(long j, long j2, zje zjeVar) {
        if (this.f26942a.f21731a) {
            j2 = 0;
        }
        return new g6u0(j2);
    }
}
