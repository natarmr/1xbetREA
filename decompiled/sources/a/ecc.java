package a;

import androidx.fragment.app.Fragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class ecc implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f7559a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;

    public /* synthetic */ ecc(mm40 mm40Var, e530 e530Var, boolean z, Function1 function1, Function1 function2, Function2 function3, Function1 function4, int i) {
        this.f7559a = (byte) 12;
        this.e = mm40Var;
        this.f = e530Var;
        this.b = z;
        this.c = function1;
        this.d = function2;
        this.g = function3;
        this.h = function4;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f7559a;
        jm40 jm40Var = jm40.b;
        zhg0 zhg0Var = zhg0.f44392a;
        pcy pcyVar = e7z.u1;
        Object obj3 = this.d;
        Object obj4 = this.c;
        Object obj5 = this.h;
        Object obj6 = this.g;
        Object obj7 = this.f;
        Object obj8 = this.e;
        switch (b) {
            case 0:
                ((Integer) obj2).getClass();
                lcc.c((vxl) obj8, (lxl) obj7, (syl) obj6, (jyl) obj5, this.b, (Function1) obj4, (Function1) obj3, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 1:
                ((Integer) obj2).getClass();
                eeq.C((mm40) obj8, (xcz) obj7, this.b, (l7m0) obj6, (Function1) obj4, (Function1) obj3, (Function2) obj5, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 2:
                ((Integer) obj2).getClass();
                pzb.h((mm40) obj8, (l7m0) obj7, (mqk) obj6, this.b, (Function0) obj5, (Function1) obj4, (Function1) obj3, (fet) obj, x8x.L(24577));
                return Unit.f46060a;
            case 3:
                String str = (String) obj8;
                a4x a4xVar = (a4x) obj7;
                String str2 = (String) obj6;
                kpm kpmVar = (kpm) obj5;
                String str3 = (String) obj4;
                a4x a4xVar2 = (a4x) obj3;
                fet fetVar = (fet) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (fetVar.U(iIntValue & 1, (iIntValue & 3) != 2)) {
                    zcl zclVar = qmk.f28987a;
                    qw3 qw3Var = new qw3(8.0f, true, new jf4((byte) 14));
                    mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
                    thg0 thg0VarA = shg0.a(qw3Var, gqw0.j, fetVar, 0);
                    int iHashCode = Long.hashCode(fetVar.T);
                    bh90 bh90VarM = fetVar.m();
                    mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarD);
                    mkd.c0.getClass();
                    fetVar.i0();
                    if (fetVar.S) {
                        fetVar.l(pcyVar);
                    } else {
                        fetVar.r0();
                    }
                    jpm0.o(fetVar, thg0VarA, gqw0.x);
                    jpm0.o(fetVar, bh90VarM, gqw0.w);
                    jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
                    jpm0.n(fetVar);
                    jpm0.o(fetVar, mm40VarC0, gqw0.v);
                    xkb.x(zhg0Var.a(1.0f, jm40Var, true), str, a4xVar, true, fetVar, 3072);
                    xkb.d(zhg0Var.a(1.0f, jm40Var, true), str2, kpmVar, this.b, fetVar, 0);
                    xkb.x(zhg0Var.a(1.0f, jm40Var, true), str3, a4xVar2, false, fetVar, 3072);
                    fetVar.r(true);
                } else {
                    fetVar.X();
                }
                return Unit.f46060a;
            case 4:
                String str4 = (String) obj8;
                a4x a4xVar3 = (a4x) obj7;
                String str5 = (String) obj6;
                y1m y1mVar = (y1m) obj5;
                String str6 = (String) obj4;
                a4x a4xVar4 = (a4x) obj3;
                fet fetVar2 = (fet) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (fetVar2.U(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    zcl zclVar2 = qmk.f28987a;
                    thg0 thg0VarA2 = shg0.a(new qw3(8.0f, true, new jf4((byte) 14)), gqw0.j, fetVar2, 0);
                    int iHashCode2 = Long.hashCode(fetVar2.T);
                    bh90 bh90VarM2 = fetVar2.m();
                    mm40 mm40VarC1 = kbc.c0(fetVar2, jm40Var);
                    mkd.c0.getClass();
                    fetVar2.i0();
                    if (fetVar2.S) {
                        fetVar2.l(pcyVar);
                    } else {
                        fetVar2.r0();
                    }
                    jpm0.o(fetVar2, thg0VarA2, gqw0.x);
                    jpm0.o(fetVar2, bh90VarM2, gqw0.w);
                    jpm0.o(fetVar2, Integer.valueOf(iHashCode2), gqw0.y);
                    jpm0.n(fetVar2);
                    jpm0.o(fetVar2, mm40VarC1, gqw0.v);
                    tlb.x(zhg0Var.a(1.0f, jm40Var, true), str4, a4xVar3, true, fetVar2, 3072);
                    tlb.b(0, y1mVar, fetVar2, zhg0Var.a(1.0f, jm40Var, true), str5, this.b);
                    tlb.x(zhg0Var.a(1.0f, jm40Var, true), str6, a4xVar4, false, fetVar2, 3072);
                    fetVar2.r(true);
                } else {
                    fetVar2.X();
                }
                return Unit.f46060a;
            case 5:
                mm40 mm40Var = (mm40) obj8;
                jvm jvmVar = (jvm) obj7;
                jvm jvmVar2 = (jvm) obj6;
                a2m a2mVar = (a2m) obj5;
                a4x a4xVar5 = (a4x) obj4;
                String str7 = (String) obj3;
                fet fetVar3 = (fet) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                if (fetVar3.U(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    mm40 mm40VarD2 = o7k0.d(mm40Var, 1.0f);
                    zcl zclVar3 = qmk.f28987a;
                    mm40 mm40VarN = s5x0.N(s5x0.L(mm40VarD2, 12.0f, 0.0f, 2), 0.0f, 0.0f, 0.0f, 12.0f, 7);
                    x5d x5dVarA = w5d.a(new qw3(4.0f, true, new jf4((byte) 14)), gqw0.m, fetVar3, 0);
                    int iHashCode3 = Long.hashCode(fetVar3.T);
                    bh90 bh90VarM3 = fetVar3.m();
                    mm40 mm40VarC2 = kbc.c0(fetVar3, mm40VarN);
                    mkd.c0.getClass();
                    fetVar3.i0();
                    if (fetVar3.S) {
                        fetVar3.l(pcyVar);
                    } else {
                        fetVar3.r0();
                    }
                    jpm0.o(fetVar3, x5dVarA, gqw0.x);
                    jpm0.o(fetVar3, bh90VarM3, gqw0.w);
                    jpm0.o(fetVar3, Integer.valueOf(iHashCode3), gqw0.y);
                    jpm0.n(fetVar3);
                    jpm0.o(fetVar3, mm40VarC2, gqw0.v);
                    wvb.E(null, jvmVar, jvmVar2, a2mVar, this.b, fetVar3, 0);
                    if (!a4xVar5.isEmpty() || str7.length() > 0) {
                        fetVar3.e0(-397517223);
                        wvb.b(0, fetVar3, a4xVar5, null, str7);
                        fetVar3.r(false);
                    } else {
                        fetVar3.e0(-397357697);
                        fetVar3.r(false);
                    }
                    fetVar3.r(true);
                } else {
                    fetVar3.X();
                }
                return Unit.f46060a;
            case 6:
                ((Integer) obj2).getClass();
                ozb.C((mm40) obj8, (String) obj7, (String) obj6, (a4x) obj5, (a4x) obj4, (kpm) obj3, this.b, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 7:
                ((Integer) obj2).getClass();
                ahb.r((mm40) obj8, (String) obj7, (String) obj6, (c280) obj5, (c280) obj4, (kpm) obj3, this.b, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 8:
                mm40 mm40Var2 = (mm40) obj8;
                i2n i2nVar = (i2n) obj7;
                String str8 = (String) obj6;
                String str9 = (String) obj5;
                kpm kpmVar2 = (kpm) obj4;
                i2n i2nVar2 = (i2n) obj3;
                fet fetVar4 = (fet) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                if (fetVar4.U(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    mm40 mm40VarD3 = o7k0.d(mm40Var2, 1.0f);
                    zcl zclVar4 = qmk.f28987a;
                    mm40 mm40VarJ = s5x0.J(mm40VarD3, 8.0f);
                    thg0 thg0VarA3 = shg0.a(new qw3(8.0f, true, new gne(gqw0.n, (byte) 12)), gqw0.j, fetVar4, 0);
                    int iHashCode4 = Long.hashCode(fetVar4.T);
                    bh90 bh90VarM4 = fetVar4.m();
                    mm40 mm40VarC3 = kbc.c0(fetVar4, mm40VarJ);
                    mkd.c0.getClass();
                    fetVar4.i0();
                    if (fetVar4.S) {
                        fetVar4.l(pcyVar);
                    } else {
                        fetVar4.r0();
                    }
                    jpm0.o(fetVar4, thg0VarA3, gqw0.x);
                    jpm0.o(fetVar4, bh90VarM4, gqw0.w);
                    jpm0.o(fetVar4, Integer.valueOf(iHashCode4), gqw0.y);
                    jpm0.n(fetVar4);
                    jpm0.o(fetVar4, mm40VarC3, gqw0.v);
                    ibc.D(zhg0Var.a(1.0f, jm40Var, true), i2nVar, false, fetVar4, 384);
                    ibc.a(0, kpmVar2, fetVar4, zhg0Var.a(1.0f, jm40Var, true), str8, str9, this.b);
                    ibc.D(zhg0Var.a(1.0f, jm40Var, true), i2nVar2, true, fetVar4, 384);
                    fetVar4.r(true);
                } else {
                    fetVar4.X();
                }
                return Unit.f46060a;
            case 9:
                ((Integer) obj2).getClass();
                ibc.t((mm40) obj8, (tvw) obj7, (String) obj6, this.b, (String) obj5, (String) obj4, (a4x) obj3, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 10:
                ((Integer) obj2).getClass();
                aac.t((mm40) obj8, this.b, (xdr) obj7, (xdr) obj6, (xdr) obj5, (ugd) obj4, (ugd) obj3, (fet) obj, x8x.L(1769473));
                return Unit.f46060a;
            case 11:
                ((Integer) obj2).getClass();
                qxw.g((mm40) obj8, (eao) obj7, (a4x) obj6, (xdr) obj5, (Function1) obj4, (Function1) obj3, (fet) obj, x8x.L(1), this.b ? 1 : 0);
                return Unit.f46060a;
            case 12:
                ((Integer) obj2).getClass();
                zdx.g((mm40) obj8, (e530) obj7, this.b, (Function1) obj4, (Function1) obj3, (Function2) obj6, (Function1) obj5, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 13:
                ((Integer) obj2).getClass();
                gq80.I((aw50) obj8, (Fragment) obj7, this.b, (Function1) obj4, (Function0) obj6, (Function0) obj5, (Function1) obj3, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 14:
                ((Integer) obj2).getClass();
                w9x.k((mm40) obj8, (jx80) obj7, this.b, (qdz) obj6, (Function1) obj4, (Function1) obj3, (Function2) obj5, (fet) obj, x8x.L(7));
                return Unit.f46060a;
            case 15:
                ((Integer) obj2).getClass();
                qxw.l((mm40) obj8, (String) obj7, (String) obj6, this.b, (String) obj5, (Function1) obj4, (Function0) obj3, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 16:
                ql5 ql5Var = (ql5) obj8;
                m2c0 m2c0Var = (m2c0) obj7;
                twi0 twi0Var = (twi0) obj2;
                pn40 pn40Var = pn40.f27267a;
                String strC = pn40.c(ql5Var.b, p3u0.c);
                String str10 = ql5Var.f;
                boolean z = m2c0Var.b0;
                return twi0.a(twi0Var, false, false, null, (String) obj6, (String) obj5, (String) obj4, strC, str10, null, null, false, this.b, (mrh0) obj3, null, false, false, false, false, z, false, z, false, null, false, false, m2c0Var.s0, false, 0, false, false, 0, -139473393, 2097151);
            case 17:
                ((Integer) obj2).getClass();
                aem0.k((mm40) obj8, (gy40) obj7, (gk5) obj6, this.b, (Function0) obj5, (Function0) obj4, (Function0) obj3, (fet) obj, x8x.L(49));
                return Unit.f46060a;
            default:
                ((Integer) obj2).getClass();
                qsm0.q((mm40) obj8, (tsv0) obj7, (l7m0) obj6, (fuj0) obj5, (w6k) obj4, (ugd) obj3, (fet) obj, x8x.L(196657), this.b ? 1 : 0);
                return Unit.f46060a;
        }
    }

    public /* synthetic */ ecc(vxl vxlVar, lxl lxlVar, syl sylVar, jyl jylVar, boolean z, Function1 function1, Function1 function2, int i) {
        this.f7559a = (byte) 0;
        this.e = vxlVar;
        this.f = lxlVar;
        this.g = sylVar;
        this.h = jylVar;
        this.b = z;
        this.c = function1;
        this.d = function2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ ecc(mm40 mm40Var, Object obj, Object obj2, Object obj3, Object obj4, wdr wdrVar, int i, int i2, byte b) {
        this.f7559a = b;
        this.e = mm40Var;
        this.f = obj;
        this.g = obj2;
        this.h = obj3;
        this.c = obj4;
        this.d = wdrVar;
        this.b = i2;
    }

    public /* synthetic */ ecc(mm40 mm40Var, Object obj, Object obj2, boolean z, Object obj3, Object obj4, Object obj5, int i, byte b) {
        this.f7559a = b;
        this.e = mm40Var;
        this.f = obj;
        this.g = obj2;
        this.b = z;
        this.h = obj3;
        this.c = obj4;
        this.d = obj5;
    }

    public /* synthetic */ ecc(mm40 mm40Var, Object obj, boolean z, Object obj2, Function1 function1, Function1 function2, Function2 function3, int i, byte b) {
        this.f7559a = b;
        this.e = mm40Var;
        this.f = obj;
        this.b = z;
        this.g = obj2;
        this.c = function1;
        this.d = function2;
        this.h = function3;
    }

    public /* synthetic */ ecc(mm40 mm40Var, String str, String str2, Object obj, Object obj2, kpm kpmVar, boolean z, int i, byte b) {
        this.f7559a = b;
        this.e = mm40Var;
        this.f = str;
        this.g = str2;
        this.h = obj;
        this.c = obj2;
        this.d = kpmVar;
        this.b = z;
    }

    public /* synthetic */ ecc(mm40 mm40Var, boolean z, xdr xdrVar, xdr xdrVar2, xdr xdrVar3, ugd ugdVar, ugd ugdVar2, int i) {
        this.f7559a = (byte) 10;
        this.e = mm40Var;
        this.b = z;
        this.f = xdrVar;
        this.g = xdrVar2;
        this.h = xdrVar3;
        this.c = ugdVar;
        this.d = ugdVar2;
    }

    public /* synthetic */ ecc(aw50 aw50Var, Fragment fragment, boolean z, Function1 function1, Function0 function0, Function0 function2, Function1 function3, int i) {
        this.f7559a = (byte) 13;
        this.e = aw50Var;
        this.f = fragment;
        this.b = z;
        this.c = function1;
        this.g = function0;
        this.h = function2;
        this.d = function3;
    }

    public /* synthetic */ ecc(Object obj, Object obj2, Object obj3, Object obj4, boolean z, Object obj5, Object obj6, byte b) {
        this.f7559a = b;
        this.e = obj;
        this.f = obj2;
        this.g = obj3;
        this.h = obj4;
        this.b = z;
        this.c = obj5;
        this.d = obj6;
    }

    public /* synthetic */ ecc(Object obj, Object obj2, String str, String str2, Object obj3, boolean z, Object obj4, byte b) {
        this.f7559a = b;
        this.e = obj;
        this.f = obj2;
        this.g = str;
        this.h = str2;
        this.c = obj3;
        this.b = z;
        this.d = obj4;
    }
}
