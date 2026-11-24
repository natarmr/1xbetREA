package a;

import kotlin.Unit;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class h7m implements xdr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f12582a;
    public final /* synthetic */ float b;
    public final /* synthetic */ Object c;

    public /* synthetic */ h7m(q7m q7mVar, float f) {
        this.f12582a = (byte) 0;
        this.c = q7mVar;
        this.b = f;
    }

    @Override // a.xdr
    public final Object F(Object obj, Object obj2, Object obj3) {
        byte b = this.f12582a;
        Object obj4 = this.c;
        float f = this.b;
        switch (b) {
            case 0:
                q7m q7mVar = (q7m) obj4;
                fet fetVar = (fet) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((g9z) obj).getClass();
                if (fetVar.U(iIntValue & 1, (iIntValue & 17) != 16)) {
                    dub.Y(q7mVar, f, fetVar, 0);
                } else {
                    fetVar.X();
                }
                return Unit.f46060a;
            case 1:
                vj30 vj30Var = (vj30) obj;
                pj30 pj30Var = (pj30) obj2;
                p4e p4eVar = (p4e) obj3;
                vj30Var.getClass();
                pj30Var.getClass();
                int i = p4e.i(p4eVar.f26347a);
                float f2 = i;
                int i2 = (int) (f * f2);
                pu90 pu90VarS = pj30Var.S(p4e.b(p4eVar.f26347a, i2, i2, 0, 0, 12));
                int iFloatValue = (int) (((Number) ((l7m0) obj4).getValue()).floatValue() * f2);
                int i3 = i - i2;
                if (i3 < 0) {
                    i3 = 0;
                }
                return vj30.x(vj30Var, i2, pu90VarS.b, new n7(pu90VarS, l1e0.d(iFloatValue, 0, i3), (byte) 13));
            case 2:
                kec0 kec0Var = (kec0) obj4;
                fet fetVar2 = (fet) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ((g9z) obj).getClass();
                if (fetVar2.U(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    mm40 mm40VarD = o7k0.d(jm40.b, 1.0f);
                    zcl zclVar = qmk.f28987a;
                    float f3 = f + 12.0f;
                    mm40 mm40VarN = s5x0.N(mm40VarD, f3, 40.0f, f3, 0.0f, 8);
                    tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
                    int iHashCode = Long.hashCode(fetVar2.T);
                    bh90 bh90VarM = fetVar2.m();
                    mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarN);
                    mkd.c0.getClass();
                    fetVar2.i0();
                    if (fetVar2.S) {
                        fetVar2.l(e7z.u1);
                    } else {
                        fetVar2.r0();
                    }
                    jpm0.o(fetVar2, tj30VarC, gqw0.x);
                    jpm0.o(fetVar2, bh90VarM, gqw0.w);
                    jpm0.o(fetVar2, Integer.valueOf(iHashCode), gqw0.y);
                    jpm0.n(fetVar2);
                    jpm0.o(fetVar2, mm40VarC0, gqw0.v);
                    jcb.l(null, kec0Var.d, true, null, fetVar2, 384, 9);
                    fetVar2.r(true);
                } else {
                    fetVar2.X();
                }
                return Unit.f46060a;
            default:
                w03 w03Var = (w03) obj;
                zie0 zie0Var = fpk0.V1;
                w03Var.getClass();
                ((k6z) obj3).getClass();
                float fD = (1.0f - ((f3d) obj4).d()) * f;
                w03.b(w03Var, r8x.u(k9x.r(0L, ((h7k0) obj2).f12579a), (((long) Float.floatToRawIntBits(fD)) << 32) | (((long) Float.floatToRawIntBits(fD)) & 4294967295L), (((long) Float.floatToRawIntBits(fD)) << 32) | (4294967295L & ((long) Float.floatToRawIntBits(fD))), 0L, 0L));
                return Unit.f46060a;
        }
    }

    public /* synthetic */ h7m(float f, Object obj, byte b) {
        this.f12582a = b;
        this.b = f;
        this.c = obj;
    }
}
