package a;

/* JADX INFO: loaded from: classes.dex */
public abstract class cne implements yjj0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ene f4649a;
    public final ene b;
    public final ene c;
    public final ene d;

    public cne(ene eneVar, ene eneVar2, ene eneVar3, ene eneVar4) {
        this.f4649a = eneVar;
        this.b = eneVar2;
        this.c = eneVar3;
        this.d = eneVar4;
    }

    public static /* synthetic */ cne c(cne cneVar, ene eneVar, ene eneVar2, ene eneVar3, ene eneVar4, int i) {
        if ((i & 1) != 0) {
            eneVar = cneVar.f4649a;
        }
        if ((i & 2) != 0) {
            eneVar2 = cneVar.b;
        }
        if ((i & 4) != 0) {
            eneVar3 = cneVar.c;
        }
        if ((i & 8) != 0) {
            eneVar4 = cneVar.d;
        }
        return cneVar.b(eneVar, eneVar2, eneVar3, eneVar4);
    }

    @Override // a.yjj0
    public final x1x a(long j, k6z k6zVar, w6k w6kVar) {
        float fA = this.f4649a.a(j, w6kVar);
        float fA2 = this.b.a(j, w6kVar);
        float fA3 = this.c.a(j, w6kVar);
        float fA4 = this.d.a(j, w6kVar);
        float fD = h7k0.d(j);
        float f = fA + fA4;
        if (f > fD) {
            float f2 = fD / f;
            fA *= f2;
            fA4 *= f2;
        }
        float f3 = fA2 + fA3;
        if (f3 > fD) {
            float f4 = fD / f3;
            fA2 *= f4;
            fA3 *= f4;
        }
        if (fA < 0.0f || fA2 < 0.0f || fA3 < 0.0f || fA4 < 0.0f) {
            StringBuilder sbS = dw9.s(fA, fA2, "Corner size in Px can't be negative(topStart = ", ", topEnd = ", ", bottomEnd = ");
            sbS.append(fA3);
            sbS.append(", bottomStart = ");
            sbS.append(fA4);
            sbS.append(")!");
            adx.a(sbS.toString());
        }
        return d(j, fA, fA2, fA3, fA4, k6zVar);
    }

    public cne b(ene eneVar, ene eneVar2, ene eneVar3, ene eneVar4) {
        return new s0(eneVar, eneVar2, eneVar3, eneVar4);
    }

    public x1x d(long j, float f, float f2, float f3, float f4, k6z k6zVar) {
        if (f + f2 + f3 + f4 == 0.0f) {
            return new oe80(k9x.r(0L, j));
        }
        return new pe80(r8x.u(k9x.r(0L, j), (((long) Float.floatToRawIntBits(f)) << 32) | (((long) Float.floatToRawIntBits(f)) & 4294967295L), (((long) Float.floatToRawIntBits(f2)) << 32) | (((long) Float.floatToRawIntBits(f2)) & 4294967295L), (((long) Float.floatToRawIntBits(f3)) << 32) | (((long) Float.floatToRawIntBits(f3)) & 4294967295L), (((long) Float.floatToRawIntBits(f4)) << 32) | (((long) Float.floatToRawIntBits(f4)) & 4294967295L)));
    }
}
