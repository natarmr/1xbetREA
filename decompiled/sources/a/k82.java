package a;

import kotlin.Unit;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class k82 implements xdr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f17852a;
    public final /* synthetic */ float b;

    public /* synthetic */ k82(float f, byte b) {
        this.f17852a = b;
        this.b = f;
    }

    @Override // a.xdr
    public final Object F(Object obj, Object obj2, Object obj3) {
        byte b = this.f17852a;
        float f = this.b;
        switch (b) {
            case 0:
                w03 w03Var = (w03) obj;
                qek0 qek0Var = y82.V1;
                w03Var.getClass();
                ((k6z) obj3).getClass();
                w03.b(w03Var, r8x.u(k9x.r(0L, ((h7k0) obj2).f12579a), (((long) Float.floatToRawIntBits(f)) << 32) | (((long) Float.floatToRawIntBits(f)) & 4294967295L), (((long) Float.floatToRawIntBits(f)) << 32) | (((long) Float.floatToRawIntBits(f)) & 4294967295L), 0L, 0L));
                return Unit.f46060a;
            case 1:
                vj30 vj30Var = (vj30) obj;
                pj30 pj30Var = (pj30) obj2;
                vj30Var.getClass();
                pj30Var.getClass();
                long j = ((p4e) obj3).f26347a;
                pu90 pu90VarS = pj30Var.S(p4e.b(j, 0, (vj30Var.T(f) * 2) + p4e.i(j), 0, 0, 13));
                return vj30.x(vj30Var, pu90VarS.f27604a, pu90VarS.b, new y1(pu90VarS, (byte) 9));
            case 2:
                vj30 vj30Var2 = (vj30) obj;
                pj30 pj30Var2 = (pj30) obj2;
                vj30Var2.getClass();
                pj30Var2.getClass();
                long j2 = ((p4e) obj3).f26347a;
                pu90 pu90VarS2 = pj30Var2.S(p4e.b(j2, 0, (vj30Var2.T(f) * 2) + p4e.i(j2), 0, 0, 13));
                return vj30.x(vj30Var2, pu90VarS2.f27604a, pu90VarS2.b, new cam(pu90VarS2, (byte) 7));
            case 3:
                mm40 mm40Var = (mm40) obj;
                fet fetVar = (fet) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                mm40Var.getClass();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= fetVar.g(mm40Var) ? 4 : 2;
                }
                if (fetVar.U(iIntValue & 1, (iIntValue & 19) != 18)) {
                    pym0.c(mm40Var, 0L, s5x0.u(0.0f, 0.0f, f, 0.0f, 11), fetVar, iIntValue & 14, 2);
                } else {
                    fetVar.X();
                }
                return Unit.f46060a;
            case 4:
                vj30 vj30Var3 = (vj30) obj;
                pj30 pj30Var3 = (pj30) obj2;
                p4e p4eVar = (p4e) obj3;
                vj30Var3.getClass();
                pj30Var3.getClass();
                boolean zE = p4e.e(p4eVar.f26347a);
                long jB = p4eVar.f26347a;
                if (zE) {
                    int i = (int) (p4e.i(jB) * f);
                    int i2 = p4e.i(jB);
                    jB = p4e.b(p4eVar.f26347a, 0, i > i2 ? i2 : i, 0, 0, 13);
                }
                pu90 pu90VarS3 = pj30Var3.S(jB);
                return vj30.x(vj30Var3, pu90VarS3.f27604a, pu90VarS3.b, new cam(pu90VarS3, (byte) 14));
            case 5:
                vj30 vj30Var4 = (vj30) obj;
                pj30 pj30Var4 = (pj30) obj2;
                vj30Var4.getClass();
                pj30Var4.getClass();
                long j3 = ((p4e) obj3).f26347a;
                pu90 pu90VarS4 = pj30Var4.S(p4e.b(j3, 0, (vj30Var4.T(f) * 2) + p4e.i(j3), 0, 0, 13));
                return vj30.x(vj30Var4, pu90VarS4.f27604a, pu90VarS4.b, new cam(pu90VarS4, (byte) 29));
            case 6:
                vj30 vj30Var5 = (vj30) obj;
                pj30 pj30Var5 = (pj30) obj2;
                vj30Var5.getClass();
                pj30Var5.getClass();
                long j4 = ((p4e) obj3).f26347a;
                pu90 pu90VarS5 = pj30Var5.S(p4e.b(j4, 0, (vj30Var5.T(f) * 2) + p4e.i(j4), 0, 0, 13));
                return vj30.x(vj30Var5, pu90VarS5.f27604a, pu90VarS5.b, new klo0(pu90VarS5, (byte) 0));
            case 7:
                vj30 vj30Var6 = (vj30) obj;
                pj30 pj30Var6 = (pj30) obj2;
                vj30Var6.getClass();
                pj30Var6.getClass();
                long j5 = ((p4e) obj3).f26347a;
                pu90 pu90VarS6 = pj30Var6.S(p4e.b(j5, 0, (vj30Var6.T(f) * 2) + p4e.i(j5), 0, 0, 13));
                return vj30.x(vj30Var6, pu90VarS6.f27604a, pu90VarS6.b, new klo0(pu90VarS6, (byte) 1));
            case 8:
                vj30 vj30Var7 = (vj30) obj;
                pj30 pj30Var7 = (pj30) obj2;
                vj30Var7.getClass();
                pj30Var7.getClass();
                long j6 = ((p4e) obj3).f26347a;
                pu90 pu90VarS7 = pj30Var7.S(p4e.b(j6, 0, (vj30Var7.T(f) * 2) + p4e.i(j6), 0, 0, 13));
                return vj30.x(vj30Var7, pu90VarS7.f27604a, pu90VarS7.b, new klo0(pu90VarS7, (byte) 2));
            default:
                vj30 vj30Var8 = (vj30) obj;
                pj30 pj30Var8 = (pj30) obj2;
                vj30Var8.getClass();
                pj30Var8.getClass();
                long j7 = ((p4e) obj3).f26347a;
                pu90 pu90VarS8 = pj30Var8.S(p4e.b(j7, 0, (vj30Var8.T(f) * 2) + p4e.i(j7), 0, 0, 13));
                return vj30.x(vj30Var8, pu90VarS8.f27604a, pu90VarS8.b, new klo0(pu90VarS8, (byte) 6));
        }
    }
}
