package a;

import android.graphics.ColorMatrixColorFilter;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.xbet.client1.R;
import org.xplatform.uikit.compose.color.StaticColors;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class p2n implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f26258a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ p2n(zx7 zx7Var, ejv ejvVar, boolean z, float[] fArr) {
        this.f26258a = (byte) 13;
        this.c = zx7Var;
        this.d = ejvVar;
        this.b = z;
        this.e = fArr;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f26258a;
        byte b2 = 7;
        byte b3 = 6;
        pcy pcyVar = e7z.u1;
        jm40 jm40Var = jm40.b;
        byte b4 = 27;
        h4d h4dVar = null;
        cl5 cl5Var = ukd.f35823a;
        boolean z = this.b;
        boolean z2 = false;
        final byte b5 = 1;
        Object obj3 = this.e;
        Object obj4 = this.d;
        Object obj5 = this.c;
        switch (b) {
            case 0:
                n2n n2nVar = (n2n) obj5;
                y1m y1mVar = (y1m) obj3;
                n2n n2nVar2 = (n2n) obj4;
                fet fetVar = (fet) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (fetVar.U(iIntValue & 1, (iIntValue & 3) != 2)) {
                    zcl zclVar = qmk.f28987a;
                    thg0 thg0VarA = shg0.a(new qw3(8.0f, true, new gne(gqw0.n, (byte) 12)), gqw0.j, fetVar, 0);
                    int iHashCode = Long.hashCode(fetVar.T);
                    bh90 bh90VarM = fetVar.m();
                    mm40 mm40VarC0 = kbc.c0(fetVar, jm40Var);
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
                    zhg0 zhg0Var = zhg0.f44392a;
                    vbc.K(zhg0Var.a(1.0f, jm40Var, true), n2nVar, false, fetVar, 384);
                    vbc.b(zhg0Var.a(1.0f, jm40Var, true), y1mVar, z, fetVar, 0);
                    vbc.K(zhg0Var.a(1.0f, jm40Var, true), n2nVar2, true, fetVar, 384);
                    fetVar.r(true);
                } else {
                    fetVar.X();
                }
                return Unit.f46060a;
            case 1:
                ((Integer) obj2).getClass();
                vic.i((mm40) obj5, (bjl0) obj4, this.b, (Function1) obj3, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 2:
                ((Integer) obj2).getClass();
                vdb.A((mm40) obj5, (cml0) obj4, this.b, (Function1) obj3, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 3:
                c6q0 c6q0Var = (c6q0) obj5;
                pz40 pz40Var = (pz40) obj4;
                Function1 function1 = (Function1) obj3;
                fet fetVar2 = (fet) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (fetVar2.U(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    p6q0 p6q0Var = c6q0Var.c;
                    q7q0 q7q0Var = c6q0Var.h;
                    boolean z3 = c6q0Var.f;
                    boolean z4 = c6q0Var.e;
                    boolean zBooleanValue = ((Boolean) pz40Var.getValue()).booleanValue();
                    boolean zH = fetVar2.h(z) | fetVar2.g(pz40Var) | fetVar2.g(function1);
                    Object objP = fetVar2.P();
                    if (zH || objP == cl5Var) {
                        objP = new ka2(z, function1, pz40Var, (byte) 4);
                        fetVar2.o0(objP);
                    }
                    g7x.l(null, p6q0Var, q7q0Var, z3, zBooleanValue, z4, true, (Function1) objP, fetVar2, 1572864);
                } else {
                    fetVar2.X();
                }
                return Unit.f46060a;
            case 4:
                s6q0 s6q0Var = (s6q0) obj5;
                pz40 pz40Var2 = (pz40) obj4;
                Function1 function2 = (Function1) obj3;
                fet fetVar3 = (fet) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                if (fetVar3.U(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    p6q0 p6q0Var2 = s6q0Var.c;
                    boolean z5 = s6q0Var.f;
                    boolean z6 = s6q0Var.e;
                    boolean zBooleanValue2 = ((Boolean) pz40Var2.getValue()).booleanValue();
                    boolean zH2 = fetVar3.h(z) | fetVar3.g(pz40Var2) | fetVar3.g(function2);
                    Object objP2 = fetVar3.P();
                    if (zH2 || objP2 == cl5Var) {
                        objP2 = new ka2(z, function2, pz40Var2, (byte) 5);
                        fetVar3.o0(objP2);
                    }
                    g7x.l(null, p6q0Var2, q7q0.f28265a, z5, zBooleanValue2, z6, true, (Function1) objP2, fetVar3, 1573248);
                } else {
                    fetVar3.X();
                }
                return Unit.f46060a;
            case 5:
                x6q0 x6q0Var = (x6q0) obj5;
                pz40 pz40Var3 = (pz40) obj4;
                Function1 function3 = (Function1) obj3;
                fet fetVar4 = (fet) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                if (fetVar4.U(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    p6q0 p6q0Var3 = x6q0Var.b;
                    q7q0 q7q0Var2 = x6q0Var.g;
                    boolean z7 = x6q0Var.e;
                    boolean z8 = x6q0Var.d;
                    boolean zBooleanValue3 = ((Boolean) pz40Var3.getValue()).booleanValue();
                    boolean zH3 = fetVar4.h(z) | fetVar4.g(pz40Var3) | fetVar4.g(function3);
                    Object objP3 = fetVar4.P();
                    if (zH3 || objP3 == cl5Var) {
                        objP3 = new ka2(z, function3, pz40Var3, b3);
                        fetVar4.o0(objP3);
                    }
                    g7x.l(null, p6q0Var3, q7q0Var2, z7, zBooleanValue3, z8, false, (Function1) objP3, fetVar4, 1572864);
                } else {
                    fetVar4.X();
                }
                return Unit.f46060a;
            case 6:
                y6q0 y6q0Var = (y6q0) obj5;
                pz40 pz40Var4 = (pz40) obj4;
                Function1 function4 = (Function1) obj3;
                fet fetVar5 = (fet) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                if (fetVar5.U(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    boolean z9 = y6q0Var.c;
                    boolean zBooleanValue4 = ((Boolean) pz40Var4.getValue()).booleanValue();
                    boolean zH4 = fetVar5.h(z) | fetVar5.g(pz40Var4) | fetVar5.g(function4);
                    Object objP4 = fetVar5.P();
                    if (zH4 || objP4 == cl5Var) {
                        objP4 = new ka2(z, function4, pz40Var4, b2);
                        fetVar5.o0(objP4);
                    }
                    g7x.l(null, o6q0.f24750a, q7q0.f28265a, z9, zBooleanValue4, true, false, (Function1) objP4, fetVar5, 1573248);
                } else {
                    fetVar5.X();
                }
                return Unit.f46060a;
            case 7:
                ((Integer) obj2).getClass();
                lmc.t(this.b, (Function0) obj5, (xdr) obj4, (ugd) obj3, (fet) obj, x8x.L(27655));
                return Unit.f46060a;
            case 8:
                ((Integer) obj2).getClass();
                p8a.t((mm40) obj5, (a2n) obj4, this.b, (Function1) obj3, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 9:
                ((Integer) obj2).getClass();
                wzb.H(x8x.L(3457), (fet) obj, (a4x) obj5, (Function0) obj4, (Function1) obj3, this.b);
                return Unit.f46060a;
            case 10:
                ((Integer) obj2).getClass();
                jiq0.c0((vbs) obj5, this.b, (Function1) obj4, (Function1) obj3, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 11:
                nhn0 nhn0Var = (nhn0) obj5;
                String str = (String) obj4;
                String str2 = (String) obj3;
                zht zhtVar = (zht) obj2;
                ((oyg0) obj).getClass();
                zhtVar.getClass();
                boolean z10 = nhn0Var.f23541a;
                if (!z10) {
                    str = null;
                }
                yo80 yo80Var = new yo80(str, z10);
                boolean z11 = nhn0Var.b;
                return zht.a(zhtVar, null, null, this.b, yo80Var, new yo80(z11 ? str2 : null, z11), false, false, null, null, 995);
            case 12:
                ((Integer) obj2).getClass();
                r9v.a((mm40) obj5, (u9v) obj4, this.b, (String) obj3, (fet) obj, x8x.L(7));
                return Unit.f46060a;
            case 13:
                zx7 zx7Var = (zx7) obj5;
                ejv ejvVar = (ejv) obj4;
                float[] fArr = (float[]) obj3;
                fet fetVar6 = (fet) obj;
                int iIntValue6 = ((Integer) obj2).intValue();
                if (fetVar6.U(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    zcl zclVar2 = qmk.f28987a;
                    mm40 mm40VarJ = s5x0.J(jm40Var, 12.0f);
                    tj30 tj30VarC = zq8.c(zx7Var, false);
                    int iHashCode2 = Long.hashCode(fetVar6.T);
                    bh90 bh90VarM2 = fetVar6.m();
                    mm40 mm40VarC1 = kbc.c0(fetVar6, mm40VarJ);
                    mkd.c0.getClass();
                    fetVar6.i0();
                    if (fetVar6.S) {
                        fetVar6.l(pcyVar);
                    } else {
                        fetVar6.r0();
                    }
                    jpm0.o(fetVar6, tj30VarC, gqw0.x);
                    jpm0.o(fetVar6, bh90VarM2, gqw0.w);
                    jpm0.o(fetVar6, Integer.valueOf(iHashCode2), gqw0.y);
                    jpm0.n(fetVar6);
                    jpm0.o(fetVar6, mm40VarC1, gqw0.v);
                    mm40 mm40VarN = o7k0.n(jm40Var, 48.0f);
                    zcl zclVar3 = qmk.e;
                    ugg0 ugg0Var = vgg0.f37379a;
                    mm40 mm40VarE = h97.e(zclVar3, zclVar3, zclVar3, zclVar3, mm40VarN);
                    mm40 mm40VarE2 = h97.e(zclVar3, zclVar3, zclVar3, zclVar3, o7k0.n(jm40Var, 48.0f));
                    StaticColors staticColors = StaticColors.INSTANCE;
                    mm40 mm40VarJ2 = s5x0.J(i120.Q(mm40VarE2, staticColors.m125getWhite100d7_KjU(), jd8.n), 6.0f);
                    n0x n0xVar = ejvVar.f7925a;
                    m0x m0xVar = new m0x(R.drawable.ic_glyph_placeholder_player, null, 6);
                    long jM126getWhite200d7_KjU = staticColors.m126getWhite200d7_KjU();
                    if (!z) {
                        h4dVar = new h4d(new ColorMatrixColorFilter(fArr));
                        h4dVar.b = fArr;
                    }
                    lgb.w(mm40VarE, mm40VarJ2, n0xVar, m0xVar, jM126getWhite200d7_KjU, null, h4dVar, gqw0.B, fetVar6, 12582912, 32);
                    if (z) {
                        fetVar6.e0(1945763422);
                        j0x.b(a8k0.F(R.drawable.ic_glyph_crown, 0, fetVar6), null, o2e.e0(s5x0.J(jm40Var, 2.0f), "GUILTY_GEAR_PLAYER_CROWN"), null, null, 0.0f, null, fetVar6, 56, 120);
                        fetVar6.r(false);
                    } else {
                        fetVar6.e0(1946013716);
                        fetVar6.r(false);
                    }
                    fetVar6.r(true);
                } else {
                    fetVar6.X();
                }
                return Unit.f46060a;
            case 14:
                ((Integer) obj2).getClass();
                efx.b((mm40) obj5, (String) obj4, this.b, (Function1) obj3, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 15:
                ((Integer) obj2).getClass();
                o2e.A((xkp) obj5, this.b, (String) obj4, (Function1) obj3, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 16:
                ((Integer) obj2).getClass();
                o2e.B((alp) obj5, this.b, (String) obj4, (Function1) obj3, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 17:
                ((Integer) obj2).getClass();
                o2e.O((ilp) obj5, this.b, (String) obj4, (Function1) obj3, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 18:
                ((Integer) obj2).getClass();
                zvw.h((mm40) obj5, (p3w) obj4, this.b, (Function1) obj3, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                nn20 nn20Var = (nn20) obj5;
                m97 m97Var = (m97) obj4;
                m97 m97Var2 = (m97) obj3;
                b820 b820Var = (b820) obj2;
                ly6 ly6Var = b820Var.f2138a;
                jur jurVar = ly6Var.d;
                String str3 = m97Var.m;
                String str4 = m97Var2.m;
                double d = m97Var2.l;
                double d2 = m97Var.l;
                int i = nn20.c1;
                return b820.a(b820Var, ly6.a(ly6Var, null, jur.a(jurVar, nn20.Y(str3, str4, nn20Var.a0(d, d2, this.b)), null, 27), null, null, 87), null, null, null, null, null, null, false, false, false, false, false, 8190);
            case 20:
                ((Integer) obj2).getClass();
                l7x.a((mm40) obj5, (qdm) obj4, this.b, (Function0) obj3, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 21:
                ((Integer) obj2).getClass();
                b5x.g((mm40) obj5, (qa40) obj4, (Function0) obj3, (fet) obj, x8x.L(1), this.b ? 1 : 0);
                return Unit.f46060a;
            case 22:
                ((Integer) obj2).getClass();
                r8x.A((mm40) obj5, (String) obj4, (j83) obj3, (fet) obj, x8x.L(1), this.b ? 1 : 0);
                return Unit.f46060a;
            case 23:
                ((Integer) obj2).getClass();
                c9x.d((mm40) obj5, (mpm) obj4, (c8n) obj3, this.b, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 24:
                ((Integer) obj2).getClass();
                ohq0.w((mm40) obj5, (mdm) obj4, (Function0) obj3, (fet) obj, x8x.L(1), this.b ? 1 : 0);
                return Unit.f46060a;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                ((Integer) obj2).getClass();
                aad.u((hh80) obj5, (dv80) obj4, this.b, (Function1) obj3, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                ((Integer) obj2).getClass();
                ucx.y((mm40) obj5, (sx80) obj4, this.b, (Function0) obj3, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                ((Integer) obj2).getClass();
                x1x.n((mm40) obj5, (szy) obj4, this.b, (Function1) obj3, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                ((Integer) obj2).getClass();
                int i2 = kia0.m2;
                ((kia0) obj5).P0(x8x.L(1), (fet) obj, (String) obj4, (Function0) obj3, this.b);
                return Unit.f46060a;
            default:
                final pfc0 pfc0Var = (pfc0) obj5;
                final Function1 function5 = (Function1) obj4;
                mm40 mm40Var = (mm40) obj3;
                fet fetVar7 = (fet) obj;
                int iIntValue7 = ((Integer) obj2).intValue();
                if (fetVar7.U(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                    s6q0 s6q0Var2 = pfc0Var.f26896a;
                    j3x j3xVar = pfc0Var.c;
                    int i3 = j3xVar != null ? j3xVar.f15856a : -1;
                    boolean zG = fetVar7.g(function5) | fetVar7.g(pfc0Var);
                    Object objP5 = fetVar7.P();
                    if (zG || objP5 == cl5Var) {
                        final byte b6 = z2 ? (byte) 1 : (byte) 0;
                        objP5 = new Function1() { // from class: a.mfc0
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj6) {
                                byte b7 = b6;
                                pfc0 pfc0Var2 = pfc0Var;
                                Function1 function6 = function5;
                                ((jly) obj6).getClass();
                                switch (b7) {
                                    case 0:
                                        pfc0Var2.getClass();
                                        function6.invoke(new b9f0(u0f0.u));
                                        break;
                                    default:
                                        pfc0Var2.getClass();
                                        function6.invoke(new d9f0(u0f0.u));
                                        break;
                                }
                                return Unit.f46060a;
                            }
                        };
                        fetVar7.o0(objP5);
                    }
                    Function1 function6 = (Function1) objP5;
                    boolean zG2 = fetVar7.g(function5) | fetVar7.g(pfc0Var);
                    Object objP6 = fetVar7.P();
                    if (zG2 || objP6 == cl5Var) {
                        objP6 = new Function1() { // from class: a.mfc0
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj6) {
                                byte b7 = b5;
                                pfc0 pfc0Var2 = pfc0Var;
                                Function1 function7 = function5;
                                ((jly) obj6).getClass();
                                switch (b7) {
                                    case 0:
                                        pfc0Var2.getClass();
                                        function7.invoke(new b9f0(u0f0.u));
                                        break;
                                    default:
                                        pfc0Var2.getClass();
                                        function7.invoke(new d9f0(u0f0.u));
                                        break;
                                }
                                return Unit.f46060a;
                            }
                        };
                        fetVar7.o0(objP6);
                    }
                    kly klyVar = new kly(function6, (Function1) objP6, null, 58);
                    boolean zG3 = fetVar7.g(function5) | fetVar7.g(pfc0Var);
                    Object objP7 = fetVar7.P();
                    if (zG3 || objP7 == cl5Var) {
                        objP7 = new r91(function5, z, pfc0Var, b4);
                        fetVar7.o0(objP7);
                    }
                    jwb.o(mm40Var, s6q0Var2, i3, klyVar, (Function1) objP7, fetVar7, 0, 0);
                } else {
                    fetVar7.X();
                }
                return Unit.f46060a;
        }
    }

    public /* synthetic */ p2n(byte b, int i, Object obj, Object obj2, Object obj3, boolean z) {
        this.f26258a = b;
        this.c = obj;
        this.d = obj2;
        this.b = z;
        this.e = obj3;
    }

    public /* synthetic */ p2n(n2n n2nVar, y1m y1mVar, boolean z, n2n n2nVar2) {
        this.f26258a = (byte) 0;
        this.c = n2nVar;
        this.e = y1mVar;
        this.b = z;
        this.d = n2nVar2;
    }

    public /* synthetic */ p2n(mm40 mm40Var, mpm mpmVar, c8n c8nVar, boolean z, int i) {
        this.f26258a = (byte) 23;
        this.c = mm40Var;
        this.d = mpmVar;
        this.e = c8nVar;
        this.b = z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ p2n(mm40 mm40Var, Object obj, Object obj2, int i, int i2, byte b) {
        this.f26258a = b;
        this.c = mm40Var;
        this.d = obj;
        this.e = obj2;
        this.b = i2;
    }

    public /* synthetic */ p2n(Object obj, Object obj2, Object obj3, boolean z, byte b) {
        this.f26258a = b;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.b = z;
    }

    public /* synthetic */ p2n(Object obj, boolean z, pz40 pz40Var, Function1 function1, byte b) {
        this.f26258a = b;
        this.c = obj;
        this.b = z;
        this.d = pz40Var;
        this.e = function1;
    }

    public /* synthetic */ p2n(Object obj, boolean z, Object obj2, Function1 function1, int i, byte b) {
        this.f26258a = b;
        this.c = obj;
        this.b = z;
        this.d = obj2;
        this.e = function1;
    }

    public /* synthetic */ p2n(boolean z, nhn0 nhn0Var, String str, String str2) {
        this.f26258a = (byte) 11;
        this.b = z;
        this.c = nhn0Var;
        this.d = str;
        this.e = str2;
    }

    public /* synthetic */ p2n(boolean z, Function0 function0, xdr xdrVar, ugd ugdVar, int i) {
        this.f26258a = (byte) 7;
        this.b = z;
        this.c = function0;
        this.d = xdrVar;
        this.e = ugdVar;
    }
}
