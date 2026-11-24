package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.xplatform.uikit.compose.color.ThemeColors;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class nj8 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f23622a;
    public final /* synthetic */ qj8 b;

    public /* synthetic */ nj8(qj8 qj8Var, byte b) {
        this.f23622a = b;
        this.b = qj8Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f23622a;
        final qj8 qj8Var = this.b;
        switch (b) {
            case 0:
                return sre0.f32672a.b(qj8Var.e.get(((Integer) obj).intValue()).getClass());
            case 1:
                hcz hczVar = (hcz) obj;
                hczVar.getClass();
                final byte b2 = 0;
                final byte b3 = 1;
                hcz.e(hczVar, null, null, new ugd(-146511736, true, new xdr() { // from class: a.oj8
                    @Override // a.xdr
                    public final Object F(Object obj2, Object obj3, Object obj4) {
                        fet fetVar;
                        byte b4 = b2;
                        jm40 jm40Var = jm40.b;
                        qj8 qj8Var2 = qj8Var;
                        switch (b4) {
                            case 0:
                                fet fetVar2 = (fet) obj3;
                                int iIntValue = ((Integer) obj4).intValue();
                                ((g9z) obj2).getClass();
                                if (fetVar2.U(iIntValue & 1, (iIntValue & 17) != 16)) {
                                    x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar2, 0);
                                    int iHashCode = Long.hashCode(fetVar2.T);
                                    bh90 bh90VarM = fetVar2.m();
                                    mm40 mm40VarC0 = kbc.c0(fetVar2, jm40Var);
                                    mkd.c0.getClass();
                                    fetVar2.i0();
                                    if (fetVar2.S) {
                                        fetVar2.l(e7z.u1);
                                    } else {
                                        fetVar2.r0();
                                    }
                                    jpm0.o(fetVar2, x5dVarA, gqw0.x);
                                    jpm0.o(fetVar2, bh90VarM, gqw0.w);
                                    jpm0.o(fetVar2, Integer.valueOf(iHashCode), gqw0.y);
                                    jpm0.n(fetVar2);
                                    jpm0.o(fetVar2, mm40VarC0, gqw0.v);
                                    if (qj8Var2.b) {
                                        fetVar2.e0(-1983750340);
                                        mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
                                        zcl zclVar = qmk.f28987a;
                                        mm40 mm40VarE = o7k0.e(mm40VarD, 66.0f);
                                        zcl zclVar2 = qmk.i;
                                        ugg0 ugg0Var = vgg0.f37379a;
                                        zq8.a(0, fetVar2, xbc.c0(h97.e(zclVar2, zclVar2, zclVar2, zclVar2, mm40VarE), vbc.d0(null, fetVar2, 0, 1)));
                                        rz4.t(jm40Var, 8.0f, fetVar2, false);
                                        fetVar = fetVar2;
                                    } else if (qj8Var2.c.length() > 0) {
                                        fetVar2.e0(-1983267453);
                                        mm40 mm40VarD2 = o7k0.d(jm40Var, 1.0f);
                                        zfn zfnVar = zaq0.b;
                                        long backgroundContent = ((ThemeColors) fetVar2.k(zfnVar)).getBackgroundContent();
                                        zcl zclVar3 = qmk.i;
                                        ugg0 ugg0Var2 = vgg0.f37379a;
                                        mm40 mm40VarJ = s5x0.J(i120.Q(mm40VarD2, backgroundContent, new ugg0(zclVar3, zclVar3, zclVar3, zclVar3)), 12.0f);
                                        String str = qj8Var2.c;
                                        long secondary = ((ThemeColors) fetVar2.k(zfnVar)).getSecondary();
                                        ((g1t0) fetVar2.k(j1t0.e)).getClass();
                                        v8q0.a(str, mm40VarJ, secondary, null, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, g1t0.d(), fetVar2, 0, 0, 131064);
                                        fetVar = fetVar2;
                                        rz4.t(jm40Var, 8.0f, fetVar, false);
                                    } else {
                                        fetVar = fetVar2;
                                        fetVar.e0(-1982541340);
                                        fetVar.r(false);
                                    }
                                    fetVar.r(true);
                                } else {
                                    fetVar2.X();
                                }
                                break;
                            default:
                                fet fetVar3 = (fet) obj3;
                                int iIntValue2 = ((Integer) obj4).intValue();
                                ((g9z) obj2).getClass();
                                if (fetVar3.U(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                                    mm40 mm40VarD3 = o7k0.d(jm40Var, 1.0f);
                                    zcl zclVar4 = qmk.f28987a;
                                    nkb.h(s5x0.L(mm40VarD3, 8.0f, 0.0f, 2), qj8Var2.d, kjm.f18392a, null, null, null, fetVar3, 384, 56);
                                } else {
                                    fetVar3.X();
                                }
                                break;
                        }
                        return Unit.f46060a;
                    }
                }), 3);
                hcz.e(hczVar, null, null, new ugd(-313261313, true, new xdr() { // from class: a.oj8
                    @Override // a.xdr
                    public final Object F(Object obj2, Object obj3, Object obj4) {
                        fet fetVar;
                        byte b4 = b3;
                        jm40 jm40Var = jm40.b;
                        qj8 qj8Var2 = qj8Var;
                        switch (b4) {
                            case 0:
                                fet fetVar2 = (fet) obj3;
                                int iIntValue = ((Integer) obj4).intValue();
                                ((g9z) obj2).getClass();
                                if (fetVar2.U(iIntValue & 1, (iIntValue & 17) != 16)) {
                                    x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar2, 0);
                                    int iHashCode = Long.hashCode(fetVar2.T);
                                    bh90 bh90VarM = fetVar2.m();
                                    mm40 mm40VarC0 = kbc.c0(fetVar2, jm40Var);
                                    mkd.c0.getClass();
                                    fetVar2.i0();
                                    if (fetVar2.S) {
                                        fetVar2.l(e7z.u1);
                                    } else {
                                        fetVar2.r0();
                                    }
                                    jpm0.o(fetVar2, x5dVarA, gqw0.x);
                                    jpm0.o(fetVar2, bh90VarM, gqw0.w);
                                    jpm0.o(fetVar2, Integer.valueOf(iHashCode), gqw0.y);
                                    jpm0.n(fetVar2);
                                    jpm0.o(fetVar2, mm40VarC0, gqw0.v);
                                    if (qj8Var2.b) {
                                        fetVar2.e0(-1983750340);
                                        mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
                                        zcl zclVar = qmk.f28987a;
                                        mm40 mm40VarE = o7k0.e(mm40VarD, 66.0f);
                                        zcl zclVar2 = qmk.i;
                                        ugg0 ugg0Var = vgg0.f37379a;
                                        zq8.a(0, fetVar2, xbc.c0(h97.e(zclVar2, zclVar2, zclVar2, zclVar2, mm40VarE), vbc.d0(null, fetVar2, 0, 1)));
                                        rz4.t(jm40Var, 8.0f, fetVar2, false);
                                        fetVar = fetVar2;
                                    } else if (qj8Var2.c.length() > 0) {
                                        fetVar2.e0(-1983267453);
                                        mm40 mm40VarD2 = o7k0.d(jm40Var, 1.0f);
                                        zfn zfnVar = zaq0.b;
                                        long backgroundContent = ((ThemeColors) fetVar2.k(zfnVar)).getBackgroundContent();
                                        zcl zclVar3 = qmk.i;
                                        ugg0 ugg0Var2 = vgg0.f37379a;
                                        mm40 mm40VarJ = s5x0.J(i120.Q(mm40VarD2, backgroundContent, new ugg0(zclVar3, zclVar3, zclVar3, zclVar3)), 12.0f);
                                        String str = qj8Var2.c;
                                        long secondary = ((ThemeColors) fetVar2.k(zfnVar)).getSecondary();
                                        ((g1t0) fetVar2.k(j1t0.e)).getClass();
                                        v8q0.a(str, mm40VarJ, secondary, null, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, g1t0.d(), fetVar2, 0, 0, 131064);
                                        fetVar = fetVar2;
                                        rz4.t(jm40Var, 8.0f, fetVar, false);
                                    } else {
                                        fetVar = fetVar2;
                                        fetVar.e0(-1982541340);
                                        fetVar.r(false);
                                    }
                                    fetVar.r(true);
                                } else {
                                    fetVar2.X();
                                }
                                break;
                            default:
                                fet fetVar3 = (fet) obj3;
                                int iIntValue2 = ((Integer) obj4).intValue();
                                ((g9z) obj2).getClass();
                                if (fetVar3.U(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                                    mm40 mm40VarD3 = o7k0.d(jm40Var, 1.0f);
                                    zcl zclVar4 = qmk.f28987a;
                                    nkb.h(s5x0.L(mm40VarD3, 8.0f, 0.0f, 2), qj8Var2.d, kjm.f18392a, null, null, null, fetVar3, 384, 56);
                                } else {
                                    fetVar3.X();
                                }
                                break;
                        }
                        return Unit.f46060a;
                    }
                }), 3);
                hczVar.f(qj8Var.e.size(), new nj8(qj8Var, (byte) 2), new nj8(qj8Var, b2), new ugd(2070400401, true, new awh(qj8Var, (byte) 4)));
                return Unit.f46060a;
            default:
                int iIntValue = ((Integer) obj).intValue();
                return rz4.h(iIntValue, sre0.f32672a.b(qj8Var.e.get(iIntValue).getClass()).J());
        }
    }
}
