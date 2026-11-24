package a;

import android.content.Context;
import android.content.res.Configuration;
import android.gov.nist.core.Separators;
import android.os.Build;
import android.view.WindowManager;
import java.util.WeakHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt;
import org.xbet.client1.R;
import org.xplatform.uikit.compose.color.StaticColors;

/* JADX INFO: loaded from: classes3.dex */
public abstract class km10 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final wul f18517a = new wul(oul.e, oe9.c, new te9(R.drawable.ic_glyph_chevron_right_small), true, false, false);

    public static final void a(int i, fet fetVar) {
        fetVar.g0(1240637393);
        if (fetVar.U(i & 1, i != 0)) {
            n0q n0qVar = o7k0.c;
            tj30 tj30VarC = zq8.c(gqw0.e, false);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, n0qVar);
            mkd.c0.getClass();
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(e7z.u1);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, tj30VarC, gqw0.x);
            jpm0.o(fetVar, bh90VarM, gqw0.w);
            jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar);
            jpm0.o(fetVar, mm40VarC0, gqw0.v);
            kpb.j(null, null, fetVar, 0, 3);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new gm10(i, (byte) 0);
        }
    }

    public static final void b(int i, fet fetVar, mm40 mm40Var, boolean z) {
        fetVar.g0(987686688);
        int i2 = i | (fetVar.h(z) ? 32 : 16);
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            Context context = (Context) fetVar.k(dy2.b);
            Object objP = fetVar.P();
            Object obj = ukd.f35823a;
            if (objP == obj) {
                StringBuilder sb = new StringBuilder(ujn.h);
                String strL = kng0.l("/static/img/android/games/resforgames/luckywheel", (Build.VERSION.SDK_INT >= 30 ? ((WindowManager) context.getSystemService(WindowManager.class)).getCurrentWindowMetrics().getBounds().width() : context.getResources().getDisplayMetrics().widthPixels) < 1080 ? "/small" : "/large", "/background.webp");
                if (strL.length() == 0) {
                    sb.setLength(0);
                } else if (StringsKt.O(strL, ujn.h, false) || kotlin.text.c.x(strL, "https://", false)) {
                    sb.setLength(0);
                    sb.append(strL);
                } else {
                    if (sb.length() > 0 && !StringsKt.S(sb, Separators.SLASH)) {
                        sb.append('/');
                    }
                    sb.append(StringsKt.y0(strL, '/'));
                }
                objP = sb.toString();
                fetVar.o0(objP);
            }
            String str = (String) objP;
            pm80 pm80VarF = a8k0.F(R.drawable.game_lucky_wheel_placeholder, 0, fetVar);
            pge pgeVar = gqw0.A;
            mz3 mz3VarY = l7x.Y(str, pm80VarF, pm80VarF, null, null, null, fetVar, 12583494, 376);
            Object objP2 = fetVar.P();
            if (objP2 == obj) {
                objP2 = androidx.compose.runtime.e.e(Boolean.valueOf(z));
                fetVar.o0(objP2);
            }
            pz40 pz40Var = (pz40) objP2;
            Boolean boolValueOf = Boolean.valueOf(z);
            boolean zG = fetVar.g(mz3VarY) | ((i2 & 112) == 32);
            Object objP3 = fetVar.P();
            if (zG || objP3 == obj) {
                objP3 = new juy(z, mz3VarY, pz40Var, (yje) null);
                fetVar.o0(objP3);
            }
            m0x0.t(fetVar, boolValueOf, (Function2) objP3);
            j0x.b(mz3VarY, null, mm40Var, null, pgeVar, 0.0f, null, fetVar, 25008, 104);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new i00(mm40Var, z, i, (byte) 10);
        }
    }

    public static final void c(int i, fet fetVar) {
        fetVar.g0(-443330218);
        if (fetVar.U(i & 1, i != 0)) {
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarE = o7k0.e(o7k0.s(jm40.b, 128.0f), 32.0f);
            zcl zclVar2 = qmk.g;
            ugg0 ugg0Var = vgg0.f37379a;
            zq8.a(0, fetVar, xbc.c0(h97.e(zclVar2, zclVar2, zclVar2, zclVar2, mm40VarE), vbc.d0(vqm.c, fetVar, 6, 0)));
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new gm10(i, (byte) 2);
        }
    }

    public static final void d(wul wulVar, Function0 function0, fet fetVar, int i) {
        fetVar.g0(2098382655);
        int i2 = (fetVar.g(wulVar) ? 4 : 2) | i | (fetVar.i(function0) ? 32 : 16);
        byte b = 1;
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            obc.d(bmd.n.a(k6z.f17794a), u1c.M(-1899906433, new auo(wulVar, function0, b), fetVar), fetVar, 56);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new auo(wulVar, function0, i);
        }
    }

    public static final void e(int i, int i2, long j, fet fetVar, mm40 mm40Var, String str, Function0 function0) {
        int i3;
        Function0 function1;
        mm40 mm40Var2;
        fet fetVar2 = fetVar;
        fetVar2.g0(1321817524);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else {
            i3 = i | (fetVar.g(mm40Var) ? 4 : 2);
        }
        int i5 = i3 | (fetVar2.g(str) ? 32 : 16) | (fetVar2.f(j) ? 256 : 128) | (fetVar2.i(function0) ? 2048 : 1024);
        if (fetVar2.U(i5 & 1, (i5 & 1171) != 1170)) {
            jm40 jm40Var = jm40.b;
            mm40 mm40Var3 = i4 != 0 ? jm40Var : mm40Var;
            mm40 mm40VarA = o7k0.A(mm40Var3, null, 3);
            zfn zfnVar = m8m0.f21378a;
            long jM76getBlack700d7_KjU = ((StaticColors) fetVar2.k(zfnVar)).m76getBlack700d7_KjU();
            zcl zclVar = qmk.i;
            ugg0 ugg0Var = vgg0.f37379a;
            mm40 mm40VarJ = s5x0.J(i120.Q(mm40VarA, jM76getBlack700d7_KjU, new ugg0(zclVar, zclVar, zclVar, zclVar)), 10.0f);
            x5d x5dVarA = w5d.a(uc9.c, gqw0.n, fetVar2, 48);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarJ);
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
            ((g1t0) fetVar2.k(j1t0.e)).getClass();
            v8q0.a(str, null, ((StaticColors) fetVar2.k(zfnVar)).m123getWhite0d7_KjU(), null, 0L, null, null, null, 0L, new f2q0(3), 0L, 2, false, 1, 0, null, g1t0.h(), fetVar2, (i5 >> 3) & 14, 24960, 109562);
            fetVar2 = fetVar2;
            qxw.o(fetVar2, o7k0.e(jm40Var, 6.0f));
            function1 = function0;
            v7n.c(null, new c8n(r7n.c, new w7n(new z7n(), 0L, true, 0, false, Long.valueOf(j), 24)), function1, fetVar2, 1);
            fetVar2.r(true);
            mm40Var2 = mm40Var3;
        } else {
            function1 = function0;
            fetVar2.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new u13(i, i2, j, mm40Var2, str, function1);
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0201  */
    /* JADX WARN: Code duplicated, block: B:101:0x0205  */
    /* JADX WARN: Code duplicated, block: B:104:0x0218  */
    /* JADX WARN: Code duplicated, block: B:106:0x0224  */
    /* JADX WARN: Code duplicated, block: B:107:0x0231  */
    /* JADX WARN: Code duplicated, block: B:110:0x0258  */
    /* JADX WARN: Code duplicated, block: B:111:0x025c  */
    /* JADX WARN: Code duplicated, block: B:113:0x0279  */
    /* JADX WARN: Code duplicated, block: B:116:0x02c5  */
    /* JADX WARN: Code duplicated, block: B:117:0x02c9  */
    /* JADX WARN: Code duplicated, block: B:145:0x0379  */
    /* JADX WARN: Code duplicated, block: B:147:0x037d  */
    /* JADX WARN: Code duplicated, block: B:151:0x0387  */
    /* JADX WARN: Code duplicated, block: B:154:0x0399  */
    /* JADX WARN: Code duplicated, block: B:155:0x03a6  */
    /* JADX WARN: Code duplicated, block: B:158:0x03ce  */
    /* JADX WARN: Code duplicated, block: B:160:0x03d5  */
    /* JADX WARN: Code duplicated, block: B:162:0x03e5  */
    /* JADX WARN: Code duplicated, block: B:169:0x041e  */
    /* JADX WARN: Code duplicated, block: B:170:0x042b  */
    /* JADX WARN: Code duplicated, block: B:173:0x044f  */
    /* JADX WARN: Code duplicated, block: B:175:0x045f  */
    /* JADX WARN: Code duplicated, block: B:178:0x047a  */
    /* JADX WARN: Code duplicated, block: B:181:0x049c  */
    /* JADX WARN: Code duplicated, block: B:182:0x04b5  */
    /* JADX WARN: Code duplicated, block: B:184:0x04ba  */
    /* JADX WARN: Code duplicated, block: B:185:0x04ce  */
    /* JADX WARN: Code duplicated, block: B:187:0x04d9  */
    /* JADX WARN: Code duplicated, block: B:189:0x0502  */
    /* JADX WARN: Code duplicated, block: B:190:0x0506  */
    /* JADX WARN: Code duplicated, block: B:192:0x0528  */
    /* JADX WARN: Code duplicated, block: B:194:0x0536  */
    /* JADX WARN: Code duplicated, block: B:196:0x053a  */
    /* JADX WARN: Code duplicated, block: B:55:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:56:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:58:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:59:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:61:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:62:0x00d3 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:63:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:65:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:66:0x00df  */
    /* JADX WARN: Code duplicated, block: B:68:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:69:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:71:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:72:0x00f3 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:73:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:81:0x0105  */
    /* JADX WARN: Code duplicated, block: B:84:0x0111  */
    /* JADX WARN: Code duplicated, block: B:87:0x0126  */
    /* JADX WARN: Code duplicated, block: B:90:0x013c  */
    /* JADX WARN: Code duplicated, block: B:93:0x0175  */
    /* JADX WARN: Code duplicated, block: B:96:0x01aa  */
    /* JADX WARN: Code duplicated, block: B:97:0x01ae  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v10 */
    /* JADX WARN: Type inference failed for: r14v5, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r14v7 */
    /* JADX WARN: Type inference failed for: r14v9 */
    public static final void f(l7m0 l7m0Var, Function1 function1, fet fetVar, int i) {
        fet fetVar2;
        sd sdVar;
        boolean z;
        boolean z2;
        boolean z3;
        String str;
        vo10 vo10Var;
        boolean z4;
        boolean z5;
        Object objP;
        boolean z6;
        Object obj;
        Object obj2;
        pz40 pz40Var;
        Object objP2;
        Object obj3;
        pz40 pz40Var2;
        Object objP3;
        Object obj4;
        byte b;
        vo10 vo10Var2;
        ugd ugdVarM;
        Object objP4;
        Object obj5;
        boolean z7;
        Function0 function0;
        shd shdVar;
        shd shdVar2;
        shd shdVar3;
        shd shdVar4;
        mw3 mw3Var;
        xx7 xx7Var;
        jm40 jm40Var;
        Object obj6;
        pz40 pz40Var3;
        Object obj7;
        boolean z8;
        ym10 ym10Var;
        boolean z9;
        shd shdVar5;
        Object obj8;
        shd shdVar6;
        ?? r14;
        fet fetVar3;
        w6k w6kVar;
        float fR0;
        float f;
        Float fValueOf;
        boolean z10;
        float f2;
        Object obj9;
        Function1 function2;
        Object obj10;
        boolean z11;
        Object obj11;
        Object objP5;
        pz40 pz40Var4;
        Object obj12;
        fet fetVar4;
        vm10 vm10Var;
        Object objP6;
        Object obj13;
        Function1 function3 = function1;
        fet fetVar5 = fetVar;
        l7m0Var.getClass();
        function3.getClass();
        fetVar5.g0(753413897);
        int i2 = i | (fetVar5.g(l7m0Var) ? 4 : 2) | (fetVar5.i(function3) ? 32 : 16);
        if (fetVar5.U(i2 & 1, (i2 & 19) != 18)) {
            ym10 ym10Var2 = (ym10) l7m0Var.getValue();
            if (ym10Var2 != null) {
                boolean z12 = ym10Var2 instanceof vm10;
                if (z12) {
                    sdVar = ((vm10) ym10Var2).f37655a;
                } else if (ym10Var2 instanceof xm10) {
                    sdVar = ((xm10) ym10Var2).f41100a;
                } else if (ym10Var2 instanceof wm10) {
                    sdVar = ((wm10) ym10Var2).f39383a;
                } else if (ym10Var2 instanceof um10) {
                    sdVar = null;
                }
                if (z12) {
                    z = ((vm10) ym10Var2).k;
                } else if (ym10Var2 instanceof xm10) {
                    z = ((xm10) ym10Var2).n;
                } else if (ym10Var2 instanceof wm10) {
                    z = ((wm10) ym10Var2).g;
                } else {
                    if (!(ym10Var2 instanceof um10)) {
                        t9f.b();
                        return;
                    }
                    z = false;
                }
                if (z12) {
                    z2 = ((vm10) ym10Var2).l;
                } else if (ym10Var2 instanceof xm10) {
                    z2 = ((xm10) ym10Var2).o;
                } else {
                    if (ym10Var2 instanceof wm10) {
                        z2 = ((wm10) ym10Var2).h;
                    } else {
                        if (!(ym10Var2 instanceof um10)) {
                            t9f.b();
                            return;
                        }
                        z2 = true;
                    }
                    z3 = ym10Var2 instanceof um10;
                    if (z12) {
                        str = ((vm10) ym10Var2).c;
                    } else if (ym10Var2 instanceof xm10) {
                        str = ((xm10) ym10Var2).c;
                    } else if (ym10Var2 instanceof wm10) {
                        str = ((wm10) ym10Var2).c;
                    } else {
                        if (z3) {
                            t9f.b();
                            return;
                        }
                        str = null;
                    }
                    if (z12) {
                        vo10Var = ((vm10) ym10Var2).b;
                    } else if (ym10Var2 instanceof xm10) {
                        vo10Var = ((xm10) ym10Var2).b;
                    } else if (ym10Var2 instanceof wm10) {
                        vo10Var = ((wm10) ym10Var2).b;
                    } else {
                        if (z3) {
                            t9f.b();
                            return;
                        }
                        vo10Var = null;
                    }
                    z4 = ym10Var2 instanceof xm10;
                    if (!z4 || (ym10Var2 instanceof wm10)) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    objP = fetVar5.P();
                    z6 = z5;
                    obj = ukd.f35823a;
                    obj2 = objP;
                    if (objP == obj) {
                        Object objE = androidx.compose.runtime.e.e(Integer.valueOf((int) r3));
                        fetVar5.o0(objE);
                        obj2 = objE;
                    }
                    pz40Var = (pz40) obj2;
                    objP2 = fetVar5.P();
                    obj3 = objP2;
                    if (objP2 == obj) {
                        Object objE2 = androidx.compose.runtime.e.e(Float.valueOf(0.0f));
                        fetVar5.o0(objE2);
                        obj3 = objE2;
                    }
                    pz40Var2 = (pz40) obj3;
                    objP3 = fetVar5.P();
                    obj4 = objP3;
                    if (objP3 == obj) {
                        Object objE3 = androidx.compose.runtime.e.e(null);
                        fetVar5.o0(objE3);
                        obj4 = objE3;
                    }
                    pz40 pz40Var5 = (pz40) obj4;
                    b = 13;
                    vo10Var2 = vo10Var;
                    ugdVarM = u1c.M(705920341, new lg(sdVar, z3, ym10Var2, z, z2, function3, str), fetVar5);
                    n0q n0qVar = o7k0.c;
                    objP4 = fetVar5.P();
                    obj5 = objP4;
                    if (objP4 == obj) {
                        Object y9vVar = new y9v(pz40Var2, b);
                        fetVar5.o0(y9vVar);
                        obj5 = y9vVar;
                    }
                    mm40 mm40VarD0 = ro4.d0(n0qVar, (Function1) obj5);
                    zx7 zx7Var = gqw0.f11754a;
                    tj30 tj30VarC = zq8.c(zx7Var, false);
                    int iHashCode = Long.hashCode(fetVar5.T);
                    bh90 bh90VarM = fetVar5.m();
                    mm40 mm40VarC0 = kbc.c0(fetVar5, mm40VarD0);
                    mkd.c0.getClass();
                    fetVar5.i0();
                    z7 = fetVar5.S;
                    function0 = e7z.u1;
                    if (z7) {
                        fetVar5.l(function0);
                    } else {
                        fetVar5.r0();
                    }
                    shdVar = gqw0.x;
                    jpm0.o(fetVar5, tj30VarC, shdVar);
                    shdVar2 = gqw0.w;
                    jpm0.o(fetVar5, bh90VarM, shdVar2);
                    Integer numValueOf = Integer.valueOf(iHashCode);
                    shdVar3 = gqw0.y;
                    jpm0.o(fetVar5, numValueOf, shdVar3);
                    jpm0.n(fetVar5);
                    shdVar4 = gqw0.v;
                    jpm0.o(fetVar5, mm40VarC0, shdVar4);
                    b(6, fetVar5, n0qVar, ym10Var2.a());
                    mm40 mm40VarW = o050.W(n0qVar);
                    mw3Var = uc9.c;
                    pz40 pz40Var6 = pz40Var5;
                    xx7Var = gqw0.m;
                    x5d x5dVarA = w5d.a(mw3Var, xx7Var, fetVar5, 0);
                    int iHashCode2 = Long.hashCode(fetVar5.T);
                    bh90 bh90VarM2 = fetVar5.m();
                    mm40 mm40VarC1 = kbc.c0(fetVar5, mm40VarW);
                    fetVar5.i0();
                    if (fetVar5.S) {
                        fetVar5.l(function0);
                    } else {
                        fetVar5.r0();
                    }
                    jpm0.o(fetVar5, x5dVarA, shdVar);
                    jpm0.o(fetVar5, bh90VarM2, shdVar2);
                    vqd.u(iHashCode2, fetVar5, shdVar3, fetVar5);
                    jpm0.o(fetVar5, mm40VarC1, shdVar4);
                    jm40Var = jm40.b;
                    if (z6) {
                        obj6 = obj;
                        pz40Var3 = pz40Var;
                        obj7 = 6;
                        fetVar5.e0(-1223596686);
                        qxw.o(fetVar5, o7k0.e(jm40Var, ((w6k) fetVar5.k(bmd.h)).r0(((Number) pz40Var3.getValue()).intValue())));
                        z8 = false;
                        fetVar5.r(false);
                    } else {
                        fetVar5.e0(-1223878662);
                        objP6 = fetVar5.P();
                        if (objP6 == obj) {
                            pz40Var3 = pz40Var;
                            Object y9vVar2 = new y9v(pz40Var3, (byte) 14);
                            fetVar5.o0(y9vVar2);
                            obj13 = y9vVar2;
                        } else {
                            pz40Var3 = pz40Var;
                            obj13 = objP6;
                        }
                        mm40 mm40VarD1 = ro4.d0(jm40Var, (Function1) obj13);
                        x5d x5dVarA2 = w5d.a(mw3Var, xx7Var, fetVar5, 0);
                        int iHashCode3 = Long.hashCode(fetVar5.T);
                        bh90 bh90VarM3 = fetVar5.m();
                        mm40 mm40VarC2 = kbc.c0(fetVar5, mm40VarD1);
                        fetVar5.i0();
                        obj6 = obj;
                        if (fetVar5.S) {
                            fetVar5.l(function0);
                        } else {
                            fetVar5.r0();
                        }
                        jpm0.o(fetVar5, x5dVarA2, shdVar);
                        jpm0.o(fetVar5, bh90VarM3, shdVar2);
                        vqd.u(iHashCode3, fetVar5, shdVar3, fetVar5);
                        jpm0.o(fetVar5, mm40VarC2, shdVar4);
                        obj7 = 6;
                        ugdVarM.invoke(fetVar5, 6);
                        fetVar5.r(true);
                        z8 = false;
                        fetVar5.r(false);
                    }
                    tj30 tj30VarC2 = zq8.c(zx7Var, z8);
                    int iHashCode4 = Long.hashCode(fetVar5.T);
                    bh90 bh90VarM4 = fetVar5.m();
                    mm40 mm40VarC3 = kbc.c0(fetVar5, n0qVar);
                    fetVar5.i0();
                    if (fetVar5.S) {
                        fetVar5.l(function0);
                    } else {
                        fetVar5.r0();
                    }
                    jpm0.o(fetVar5, tj30VarC2, shdVar);
                    jpm0.o(fetVar5, bh90VarM4, shdVar2);
                    vqd.u(iHashCode4, fetVar5, shdVar3, fetVar5);
                    jpm0.o(fetVar5, mm40VarC3, shdVar4);
                    if (vo10Var2 != null || (ym10Var2 instanceof wm10)) {
                        ym10Var = ym10Var2;
                        z9 = false;
                        shdVar5 = shdVar;
                        obj8 = obj7;
                        shdVar6 = shdVar2;
                        if (vo10Var2 == null) {
                            fetVar5.e0(-2091267709);
                            a(z9 ? 1 : 0, fetVar5);
                            fetVar5.r(z9);
                            fetVar3 = fetVar5;
                            r14 = z9;
                        } else {
                            fetVar5.e0(-2091213893);
                            fetVar5.r(z9);
                            fetVar3 = fetVar5;
                            r14 = z9;
                        }
                    } else {
                        fetVar5.e0(-2092686734);
                        x5d x5dVarA3 = w5d.a(mw3Var, xx7Var, fetVar5, 0);
                        int iHashCode5 = Long.hashCode(fetVar5.T);
                        bh90 bh90VarM5 = fetVar5.m();
                        mm40 mm40VarC4 = kbc.c0(fetVar5, n0qVar);
                        fetVar5.i0();
                        if (fetVar5.S) {
                            fetVar5.l(function0);
                        } else {
                            fetVar5.r0();
                        }
                        jpm0.o(fetVar5, x5dVarA3, shdVar);
                        jpm0.o(fetVar5, bh90VarM5, shdVar2);
                        vqd.u(iHashCode5, fetVar5, shdVar3, fetVar5);
                        jpm0.o(fetVar5, mm40VarC4, shdVar4);
                        mm40 mm40VarH = dw9.h(1.0f, o7k0.d(jm40Var, 1.0f), true);
                        if (((Configuration) fetVar5.k(dy2.f6873a)).smallestScreenWidthDp >= 600) {
                            zcl zclVar = qmk.f28987a;
                            f2 = 32.0f;
                        } else {
                            zcl zclVar2 = qmk.f28987a;
                            f2 = 24.0f;
                        }
                        mm40 mm40VarN = s5x0.N(mm40VarH, 0.0f, f2, 0.0f, 0.0f, 13);
                        int i3 = i2 & 112;
                        boolean z13 = i3 == 32;
                        Object objP7 = fetVar5.P();
                        if (z13) {
                            obj9 = obj6;
                        } else {
                            obj9 = obj6;
                            if (objP7 != obj9) {
                                function2 = function1;
                                obj10 = objP7;
                            }
                            Function0 function4 = (Function0) obj10;
                            if (i3 == 32) {
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                            Object objP8 = fetVar5.P();
                            obj11 = objP8;
                            if (z11 || objP8 == obj9) {
                                Object pd10Var = new pd10(function2, (byte) 18);
                                fetVar5.o0(pd10Var);
                                obj11 = pd10Var;
                            }
                            Function0 function5 = (Function0) obj11;
                            objP5 = fetVar5.P();
                            if (objP5 == obj9) {
                                pz40Var4 = pz40Var6;
                                Object y9vVar3 = new y9v(pz40Var4, (byte) 12);
                                fetVar5.o0(y9vVar3);
                                obj12 = y9vVar3;
                            } else {
                                pz40Var4 = pz40Var6;
                                obj12 = objP5;
                            }
                            Function1 function6 = (Function1) obj12;
                            pz40Var6 = pz40Var4;
                            shdVar3 = shdVar3;
                            ym10Var = ym10Var2;
                            r14 = 0;
                            mw3Var = mw3Var;
                            shdVar4 = shdVar4;
                            obj8 = obj7;
                            pz40Var3 = pz40Var3;
                            shdVar6 = shdVar2;
                            shdVar5 = shdVar;
                            function1 = function1;
                            y0x0.s(mm40VarN, vo10Var2, function4, function5, function6, fetVar5, 24640);
                            fetVar4 = fetVar5;
                            if (z12) {
                                vm10Var = (vm10) ym10Var;
                                if (vm10Var.d) {
                                    fetVar4.e0(-967122012);
                                    i(vm10Var, function1, fetVar4, 8 | i3);
                                    fetVar4.r(false);
                                } else {
                                    fetVar4.e0(-967022068);
                                    fetVar4.r(false);
                                }
                            } else {
                                fetVar4.e0(-967022068);
                                fetVar4.r(false);
                            }
                            fetVar4.r(true);
                            fetVar4.r(false);
                            fetVar3 = fetVar4;
                        }
                        function2 = function1;
                        Object pd10Var2 = new pd10(function2, (byte) 17);
                        fetVar5.o0(pd10Var2);
                        obj10 = pd10Var2;
                        Function0 function7 = (Function0) obj10;
                        if (i3 == 32) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        Object objP9 = fetVar5.P();
                        obj11 = objP9;
                        if (z11) {
                            Object pd10Var3 = new pd10(function2, (byte) 18);
                            fetVar5.o0(pd10Var3);
                            obj11 = pd10Var3;
                        } else {
                            Object pd10Var4 = new pd10(function2, (byte) 18);
                            fetVar5.o0(pd10Var4);
                            obj11 = pd10Var4;
                        }
                        Function0 function8 = (Function0) obj11;
                        objP5 = fetVar5.P();
                        if (objP5 == obj9) {
                            pz40Var4 = pz40Var6;
                            Object y9vVar4 = new y9v(pz40Var4, (byte) 12);
                            fetVar5.o0(y9vVar4);
                            obj12 = y9vVar4;
                        } else {
                            pz40Var4 = pz40Var6;
                            obj12 = objP5;
                        }
                        Function1 function9 = (Function1) obj12;
                        pz40Var6 = pz40Var4;
                        shdVar3 = shdVar3;
                        ym10Var = ym10Var2;
                        r14 = 0;
                        mw3Var = mw3Var;
                        shdVar4 = shdVar4;
                        obj8 = obj7;
                        pz40Var3 = pz40Var3;
                        shdVar6 = shdVar2;
                        shdVar5 = shdVar;
                        function1 = function1;
                        y0x0.s(mm40VarN, vo10Var2, function7, function8, function9, fetVar5, 24640);
                        fetVar4 = fetVar5;
                        if (z12) {
                            vm10Var = (vm10) ym10Var;
                            if (vm10Var.d) {
                                fetVar4.e0(-967122012);
                                i(vm10Var, function1, fetVar4, 8 | i3);
                                fetVar4.r(false);
                            } else {
                                fetVar4.e0(-967022068);
                                fetVar4.r(false);
                            }
                        } else {
                            fetVar4.e0(-967022068);
                            fetVar4.r(false);
                        }
                        fetVar4.r(true);
                        fetVar4.r(false);
                        fetVar3 = fetVar4;
                    }
                    fetVar3.r(true);
                    fetVar3.r(true);
                    w6kVar = (w6k) fetVar3.k(bmd.h);
                    if (((Number) pz40Var3.getValue()).intValue() > 0) {
                        fR0 = w6kVar.r0(((Number) pz40Var3.getValue()).intValue());
                    } else {
                        zcl zclVar3 = qmk.f28987a;
                        fR0 = 56.0f;
                    }
                    f = fR0;
                    WeakHashMap weakHashMap = djv0.w;
                    int i4 = zcm0.i(fetVar3).f.e().b;
                    ne60 ne60Var = (ne60) pz40Var6.getValue();
                    fValueOf = ne60Var != null ? Float.valueOf((Float.intBitsToFloat((int) (ne60Var.f23370a & 4294967295L)) - ((Number) pz40Var2.getValue()).floatValue()) - i4) : null;
                    if (z4) {
                        fetVar3.e0(863624657);
                        function3 = function1;
                        m((xm10) ym10Var, f, fValueOf, function3, fetVar3, 8 | ((i2 << 6) & 7168));
                        fetVar3.r(r14);
                    } else {
                        function3 = function1;
                        if (ym10Var instanceof wm10) {
                            fetVar3.e0(863632720);
                            l((wm10) ym10Var, f, function3, fetVar3, (i2 << 3) & 896);
                            fetVar3.r(r14);
                        } else {
                            fetVar3.e0(863637767);
                            fetVar3.r(r14);
                        }
                    }
                    if (z6) {
                        fetVar3.e0(1003017719);
                        mm40 mm40VarW2 = o050.W(o7k0.d(jm40Var, 1.0f));
                        x5d x5dVarA4 = w5d.a(mw3Var, xx7Var, fetVar3, r14);
                        int iHashCode6 = Long.hashCode(fetVar3.T);
                        bh90 bh90VarM6 = fetVar3.m();
                        mm40 mm40VarC5 = kbc.c0(fetVar3, mm40VarW2);
                        fetVar3.i0();
                        if (fetVar3.S) {
                            fetVar3.l(function0);
                        } else {
                            fetVar3.r0();
                        }
                        jpm0.o(fetVar3, x5dVarA4, shdVar5);
                        jpm0.o(fetVar3, bh90VarM6, shdVar6);
                        vqd.u(iHashCode6, fetVar3, shdVar3, fetVar3);
                        jpm0.o(fetVar3, mm40VarC5, shdVar4);
                        ugdVarM.invoke(fetVar3, obj8);
                        z10 = true;
                        fetVar3.r(true);
                        fetVar3.r(r14);
                    } else {
                        z10 = true;
                        fetVar3.e0(1003209919);
                        fetVar3.r(r14);
                    }
                    fetVar3.r(z10);
                    fetVar2 = fetVar3;
                }
                z3 = ym10Var2 instanceof um10;
                if (z12) {
                    str = ((vm10) ym10Var2).c;
                } else if (ym10Var2 instanceof xm10) {
                    str = ((xm10) ym10Var2).c;
                } else if (ym10Var2 instanceof wm10) {
                    str = ((wm10) ym10Var2).c;
                } else {
                    if (z3) {
                        t9f.b();
                        return;
                    }
                    str = null;
                }
                if (z12) {
                    vo10Var = ((vm10) ym10Var2).b;
                } else if (ym10Var2 instanceof xm10) {
                    vo10Var = ((xm10) ym10Var2).b;
                } else if (ym10Var2 instanceof wm10) {
                    vo10Var = ((wm10) ym10Var2).b;
                } else {
                    if (z3) {
                        t9f.b();
                        return;
                    }
                    vo10Var = null;
                }
                z4 = ym10Var2 instanceof xm10;
                if (z4) {
                    z5 = true;
                } else {
                    z5 = true;
                }
                objP = fetVar5.P();
                z6 = z5;
                obj = ukd.f35823a;
                obj2 = objP;
                if (objP == obj) {
                    Object objE4 = androidx.compose.runtime.e.e(Integer.valueOf((int) r3));
                    fetVar5.o0(objE4);
                    obj2 = objE4;
                }
                pz40Var = (pz40) obj2;
                objP2 = fetVar5.P();
                obj3 = objP2;
                if (objP2 == obj) {
                    Object objE5 = androidx.compose.runtime.e.e(Float.valueOf(0.0f));
                    fetVar5.o0(objE5);
                    obj3 = objE5;
                }
                pz40Var2 = (pz40) obj3;
                objP3 = fetVar5.P();
                obj4 = objP3;
                if (objP3 == obj) {
                    Object objE6 = androidx.compose.runtime.e.e(null);
                    fetVar5.o0(objE6);
                    obj4 = objE6;
                }
                pz40 pz40Var7 = (pz40) obj4;
                b = 13;
                vo10Var2 = vo10Var;
                ugdVarM = u1c.M(705920341, new lg(sdVar, z3, ym10Var2, z, z2, function3, str), fetVar5);
                n0q n0qVar2 = o7k0.c;
                objP4 = fetVar5.P();
                obj5 = objP4;
                if (objP4 == obj) {
                    Object y9vVar5 = new y9v(pz40Var2, b);
                    fetVar5.o0(y9vVar5);
                    obj5 = y9vVar5;
                }
                mm40 mm40VarD2 = ro4.d0(n0qVar2, (Function1) obj5);
                zx7 zx7Var2 = gqw0.f11754a;
                tj30 tj30VarC3 = zq8.c(zx7Var2, false);
                int iHashCode7 = Long.hashCode(fetVar5.T);
                bh90 bh90VarM7 = fetVar5.m();
                mm40 mm40VarC6 = kbc.c0(fetVar5, mm40VarD2);
                mkd.c0.getClass();
                fetVar5.i0();
                z7 = fetVar5.S;
                function0 = e7z.u1;
                if (z7) {
                    fetVar5.l(function0);
                } else {
                    fetVar5.r0();
                }
                shdVar = gqw0.x;
                jpm0.o(fetVar5, tj30VarC3, shdVar);
                shdVar2 = gqw0.w;
                jpm0.o(fetVar5, bh90VarM7, shdVar2);
                Integer numValueOf2 = Integer.valueOf(iHashCode7);
                shdVar3 = gqw0.y;
                jpm0.o(fetVar5, numValueOf2, shdVar3);
                jpm0.n(fetVar5);
                shdVar4 = gqw0.v;
                jpm0.o(fetVar5, mm40VarC6, shdVar4);
                b(6, fetVar5, n0qVar2, ym10Var2.a());
                mm40 mm40VarW3 = o050.W(n0qVar2);
                mw3Var = uc9.c;
                pz40 pz40Var8 = pz40Var7;
                xx7Var = gqw0.m;
                x5d x5dVarA5 = w5d.a(mw3Var, xx7Var, fetVar5, 0);
                int iHashCode8 = Long.hashCode(fetVar5.T);
                bh90 bh90VarM8 = fetVar5.m();
                mm40 mm40VarC7 = kbc.c0(fetVar5, mm40VarW3);
                fetVar5.i0();
                if (fetVar5.S) {
                    fetVar5.l(function0);
                } else {
                    fetVar5.r0();
                }
                jpm0.o(fetVar5, x5dVarA5, shdVar);
                jpm0.o(fetVar5, bh90VarM8, shdVar2);
                vqd.u(iHashCode8, fetVar5, shdVar3, fetVar5);
                jpm0.o(fetVar5, mm40VarC7, shdVar4);
                jm40Var = jm40.b;
                if (z6) {
                    fetVar5.e0(-1223878662);
                    objP6 = fetVar5.P();
                    if (objP6 == obj) {
                        pz40Var3 = pz40Var;
                        Object y9vVar6 = new y9v(pz40Var3, (byte) 14);
                        fetVar5.o0(y9vVar6);
                        obj13 = y9vVar6;
                    } else {
                        pz40Var3 = pz40Var;
                        obj13 = objP6;
                    }
                    mm40 mm40VarD3 = ro4.d0(jm40Var, (Function1) obj13);
                    x5d x5dVarA6 = w5d.a(mw3Var, xx7Var, fetVar5, 0);
                    int iHashCode9 = Long.hashCode(fetVar5.T);
                    bh90 bh90VarM9 = fetVar5.m();
                    mm40 mm40VarC8 = kbc.c0(fetVar5, mm40VarD3);
                    fetVar5.i0();
                    obj6 = obj;
                    if (fetVar5.S) {
                        fetVar5.l(function0);
                    } else {
                        fetVar5.r0();
                    }
                    jpm0.o(fetVar5, x5dVarA6, shdVar);
                    jpm0.o(fetVar5, bh90VarM9, shdVar2);
                    vqd.u(iHashCode9, fetVar5, shdVar3, fetVar5);
                    jpm0.o(fetVar5, mm40VarC8, shdVar4);
                    obj7 = 6;
                    ugdVarM.invoke(fetVar5, 6);
                    fetVar5.r(true);
                    z8 = false;
                    fetVar5.r(false);
                } else {
                    obj6 = obj;
                    pz40Var3 = pz40Var;
                    obj7 = 6;
                    fetVar5.e0(-1223596686);
                    qxw.o(fetVar5, o7k0.e(jm40Var, ((w6k) fetVar5.k(bmd.h)).r0(((Number) pz40Var3.getValue()).intValue())));
                    z8 = false;
                    fetVar5.r(false);
                }
                tj30 tj30VarC4 = zq8.c(zx7Var2, z8);
                int iHashCode10 = Long.hashCode(fetVar5.T);
                bh90 bh90VarM10 = fetVar5.m();
                mm40 mm40VarC9 = kbc.c0(fetVar5, n0qVar2);
                fetVar5.i0();
                if (fetVar5.S) {
                    fetVar5.l(function0);
                } else {
                    fetVar5.r0();
                }
                jpm0.o(fetVar5, tj30VarC4, shdVar);
                jpm0.o(fetVar5, bh90VarM10, shdVar2);
                vqd.u(iHashCode10, fetVar5, shdVar3, fetVar5);
                jpm0.o(fetVar5, mm40VarC9, shdVar4);
                if (vo10Var2 != null) {
                    ym10Var = ym10Var2;
                    z9 = false;
                } else {
                    ym10Var = ym10Var2;
                    z9 = false;
                }
                shdVar5 = shdVar;
                obj8 = obj7;
                shdVar6 = shdVar2;
                if (vo10Var2 == null) {
                    fetVar5.e0(-2091267709);
                    a(z9 ? 1 : 0, fetVar5);
                    fetVar5.r(z9);
                    fetVar3 = fetVar5;
                    r14 = z9;
                } else {
                    fetVar5.e0(-2091213893);
                    fetVar5.r(z9);
                    fetVar3 = fetVar5;
                    r14 = z9;
                }
                fetVar3.r(true);
                fetVar3.r(true);
                w6kVar = (w6k) fetVar3.k(bmd.h);
                if (((Number) pz40Var3.getValue()).intValue() > 0) {
                    fR0 = w6kVar.r0(((Number) pz40Var3.getValue()).intValue());
                } else {
                    zcl zclVar4 = qmk.f28987a;
                    fR0 = 56.0f;
                }
                f = fR0;
                WeakHashMap weakHashMap2 = djv0.w;
                int i5 = zcm0.i(fetVar3).f.e().b;
                ne60 ne60Var2 = (ne60) pz40Var8.getValue();
                fValueOf = ne60Var2 != null ? Float.valueOf((Float.intBitsToFloat((int) (ne60Var2.f23370a & 4294967295L)) - ((Number) pz40Var2.getValue()).floatValue()) - i5) : null;
                if (z4) {
                    fetVar3.e0(863624657);
                    function3 = function1;
                    m((xm10) ym10Var, f, fValueOf, function3, fetVar3, 8 | ((i2 << 6) & 7168));
                    fetVar3.r(r14);
                } else {
                    function3 = function1;
                    if (ym10Var instanceof wm10) {
                        fetVar3.e0(863632720);
                        l((wm10) ym10Var, f, function3, fetVar3, (i2 << 3) & 896);
                        fetVar3.r(r14);
                    } else {
                        fetVar3.e0(863637767);
                        fetVar3.r(r14);
                    }
                }
                if (z6) {
                    fetVar3.e0(1003017719);
                    mm40 mm40VarW4 = o050.W(o7k0.d(jm40Var, 1.0f));
                    x5d x5dVarA7 = w5d.a(mw3Var, xx7Var, fetVar3, r14);
                    int iHashCode11 = Long.hashCode(fetVar3.T);
                    bh90 bh90VarM11 = fetVar3.m();
                    mm40 mm40VarC10 = kbc.c0(fetVar3, mm40VarW4);
                    fetVar3.i0();
                    if (fetVar3.S) {
                        fetVar3.l(function0);
                    } else {
                        fetVar3.r0();
                    }
                    jpm0.o(fetVar3, x5dVarA7, shdVar5);
                    jpm0.o(fetVar3, bh90VarM11, shdVar6);
                    vqd.u(iHashCode11, fetVar3, shdVar3, fetVar3);
                    jpm0.o(fetVar3, mm40VarC10, shdVar4);
                    ugdVarM.invoke(fetVar3, obj8);
                    z10 = true;
                    fetVar3.r(true);
                    fetVar3.r(r14);
                } else {
                    z10 = true;
                    fetVar3.e0(1003209919);
                    fetVar3.r(r14);
                }
                fetVar3.r(z10);
                fetVar2 = fetVar3;
            }
            t9f.b();
            return;
        }
        fet fetVar6 = fetVar5;
        fetVar6.X();
        fetVar2 = fetVar6;
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new s000(l7m0Var, function3, i, (byte) 13);
        }
    }

    public static final void g(final sd sdVar, final boolean z, boolean z2, final boolean z3, boolean z4, Function0 function0, Function0 function1, final Function0 function2, fet fetVar, int i) {
        long jC;
        fetVar.g0(-1174049464);
        int i2 = i | (fetVar.g(sdVar) ? 4 : 2) | (fetVar.h(z) ? 32 : 16) | (fetVar.h(z2) ? 256 : 128) | (fetVar.h(z3) ? 2048 : 1024) | (fetVar.h(z4) ? 16384 : 8192) | (fetVar.i(function0) ? 131072 : 65536) | (fetVar.i(function1) ? 1048576 : 524288) | (fetVar.i(function2) ? 8388608 : 4194304);
        if (fetVar.U(i2 & 1, (4793491 & i2) != 4793490)) {
            if (z4) {
                fetVar.e0(2106415277);
                long jM123getWhite0d7_KjU = afn0.p(fetVar).m123getWhite0d7_KjU();
                fetVar.r(false);
                jC = jM123getWhite0d7_KjU;
            } else {
                fetVar.e0(2106466644);
                jC = y3d.c(0.5f, afn0.p(fetVar).m123getWhite0d7_KjU());
                fetVar.r(false);
            }
            float f = 0.5f;
            imm immVar = new imm(new ilm(jC), mlm.f21997a, z2 ? new dmm(new ta50(new wkm(1, R.drawable.ic_info_new, z3, ra50.f30118a, afn0.p(fetVar).m123getWhite0d7_KjU()))) : fmm.f9790a, y3d.f, false, null);
            if (z3) {
                f = 1.0f;
            }
            mm40 mm40VarD = o7k0.d(jm40.b, 1.0f);
            boolean z5 = ((57344 & i2) == 16384) | ((458752 & i2) == 131072);
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (z5 || objP == cl5Var) {
                objP = new jw7(z4, function0, (byte) 11);
                fetVar.o0(objP);
            }
            Function0 function3 = (Function0) objP;
            boolean z6 = ((i2 & 7168) == 2048) | ((3670016 & i2) == 1048576);
            Object objP2 = fetVar.P();
            if (z6 || objP2 == cl5Var) {
                objP2 = new dd(z3, function1, (byte) 3);
                fetVar.o0(objP2);
            }
            final float f2 = f;
            hlm.c(mm40VarD, immVar, null, function3, null, (Function1) objP2, null, null, null, null, u1c.M(925287862, new Function2() { // from class: a.hm10
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    fet fetVar2 = (fet) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    if (!fetVar2.U(iIntValue & 1, (iIntValue & 3) != 2)) {
                        fetVar2.X();
                    } else if (z) {
                        fetVar2.e0(143406896);
                        km10.c(0, fetVar2);
                        fetVar2.r(false);
                    } else {
                        sd sdVar2 = sdVar;
                        if (sdVar2 != null) {
                            fetVar2.e0(143409570);
                            mm40 mm40VarN = epv0.N(jm40.b, f2);
                            zfn zfnVar = m8m0.f21378a;
                            r2v0 r2v0Var = new r2v0(new y3d(((StaticColors) fetVar2.k(zfnVar)).m73getBlack400d7_KjU()), new y3d(((StaticColors) fetVar2.k(zfnVar)).m73getBlack400d7_KjU()), new y3d(((StaticColors) fetVar2.k(zfnVar)).m123getWhite0d7_KjU()));
                            boolean z7 = z3;
                            boolean zH = fetVar2.h(z7);
                            Function0 function4 = function2;
                            boolean zG = zH | fetVar2.g(function4);
                            Object objP3 = fetVar2.P();
                            cl5 cl5Var2 = ukd.f35823a;
                            if (zG || objP3 == cl5Var2) {
                                objP3 = new jw7(z7, function4, (byte) 12);
                                fetVar2.o0(objP3);
                            }
                            Function0 function5 = (Function0) objP3;
                            Object objP4 = fetVar2.P();
                            if (objP4 == cl5Var2) {
                                objP4 = new gf10((byte) 7);
                                fetVar2.o0(objP4);
                            }
                            ozb.w(mm40VarN, false, sdVar2, r2v0Var, function5, (Function0) objP4, fetVar2, 196656);
                            fetVar2.r(false);
                        } else {
                            fetVar2.e0(151431340);
                            fetVar2.r(false);
                        }
                    }
                    return Unit.f46060a;
                }
            }, fetVar), null, fetVar, 6, 6, 3028);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new im10(sdVar, z, z2, z3, z4, function0, function1, function2, i);
        }
    }

    public static final void h(int i, fet fetVar, mm40 mm40Var, String str) {
        String str2;
        mm40 mm40Var2;
        fetVar.g0(1595998977);
        int i2 = i | 6 | (fetVar.g(str) ? 32 : 16);
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            ((g1t0) fetVar.k(j1t0.e)).getClass();
            y9q0 y9q0VarE = g1t0.e();
            long jM123getWhite0d7_KjU = ((StaticColors) fetVar.k(m8m0.f21378a)).m123getWhite0d7_KjU();
            jm40 jm40Var = jm40.b;
            mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
            zcl zclVar = qmk.f28987a;
            str2 = str;
            v8q0.a(str2, s5x0.N(mm40VarD, 0.0f, 0.0f, 0.0f, 8.0f, 7), jM123getWhite0d7_KjU, null, 0L, null, null, null, 0L, new f2q0(3), 0L, 0, false, 0, 0, null, y9q0VarE, fetVar, (i2 >> 3) & 14, 0, 130040);
            mm40Var2 = jm40Var;
        } else {
            str2 = str;
            fetVar.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ndp(mm40Var2, str2, i, (byte) 27);
        }
    }

    public static final void i(vm10 vm10Var, Function1 function1, fet fetVar, int i) {
        fetVar.g0(-2144210555);
        int i2 = (fetVar.i(vm10Var) ? 4 : 2) | i | (fetVar.i(function1) ? 32 : 16);
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            mm40 mm40VarS = o050.S(o7k0.d(jm40.b, 1.0f));
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarK = s5x0.K(mm40VarS, qmk.a(fetVar).d, 16.0f);
            x5d x5dVarA = w5d.a(new qw3(12.0f, true, new jf4((byte) 14)), gqw0.m, fetVar, 0);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarK);
            mkd.c0.getClass();
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(e7z.u1);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, x5dVarA, gqw0.x);
            jpm0.o(fetVar, bh90VarM, gqw0.w);
            jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar);
            jpm0.o(fetVar, mm40VarC0, gqw0.v);
            boolean z = vm10Var.g;
            cl5 cl5Var = ukd.f35823a;
            if (z) {
                fetVar.e0(-935631946);
                wkw wkwVar = new wkw(gqw0.n);
                String str = vm10Var.i;
                long j = vm10Var.h;
                boolean z2 = (i2 & 112) == 32;
                Object objP = fetVar.P();
                if (z2 || objP == cl5Var) {
                    objP = new pd10(function1, (byte) 10);
                    fetVar.o0(objP);
                }
                e(0, 0, j, fetVar, wkwVar, str, (Function0) objP);
                fetVar.r(false);
            } else {
                fetVar.e0(-935308089);
                fetVar.r(false);
            }
            wul wulVar = vm10Var.e;
            int i3 = i2 & 112;
            boolean z3 = i3 == 32;
            Object objP2 = fetVar.P();
            if (z3 || objP2 == cl5Var) {
                objP2 = new pd10(function1, (byte) 11);
                fetVar.o0(objP2);
            }
            d(wulVar, (Function0) objP2, fetVar, 0);
            wul wulVar2 = vm10Var.f;
            if (wulVar2 == null) {
                fetVar.e0(-935116665);
                fetVar.r(false);
            } else {
                fetVar.e0(-935116664);
                boolean z4 = i3 == 32;
                Object objP3 = fetVar.P();
                if (z4 || objP3 == cl5Var) {
                    objP3 = new pd10(function1, (byte) 12);
                    fetVar.o0(objP3);
                }
                d(wulVar2, (Function0) objP3, fetVar, 0);
                fetVar.r(false);
            }
            wul wulVar3 = vm10Var.j;
            if (wulVar3 == null) {
                fetVar.e0(-934895387);
                fetVar.r(false);
            } else {
                fetVar.e0(-934895386);
                boolean z5 = i3 == 32;
                Object objP4 = fetVar.P();
                if (z5 || objP4 == cl5Var) {
                    objP4 = new pd10(function1, (byte) 13);
                    fetVar.o0(objP4);
                }
                d(wulVar3, (Function0) objP4, fetVar, 0);
                fetVar.r(false);
            }
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new k110((Object) vm10Var, (Object) function1, i, (byte) 6);
        }
    }

    public static final void j(mm40 mm40Var, int i, int i2, fet fetVar, int i3) {
        fetVar.g0(2129265692);
        int i4 = i3 | (fetVar.g(mm40Var) ? 4 : 2) | (fetVar.e(i) ? 32 : 16) | (fetVar.e(i2) ? 256 : 128);
        if (fetVar.U(i4 & 1, (i4 & 147) != 146)) {
            zx7 zx7Var = gqw0.f11754a;
            tj30 tj30VarC = zq8.c(zx7Var, false);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40Var);
            mkd.c0.getClass();
            fetVar.i0();
            boolean z = fetVar.S;
            pcy pcyVar = e7z.u1;
            if (z) {
                fetVar.l(pcyVar);
            } else {
                fetVar.r0();
            }
            shd shdVar = gqw0.x;
            jpm0.o(fetVar, tj30VarC, shdVar);
            shd shdVar2 = gqw0.w;
            jpm0.o(fetVar, bh90VarM, shdVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            shd shdVar3 = gqw0.y;
            jpm0.o(fetVar, numValueOf, shdVar3);
            jpm0.n(fetVar);
            shd shdVar4 = gqw0.v;
            jpm0.o(fetVar, mm40VarC0, shdVar4);
            zcl zclVar = qmk.f28987a;
            jm40 jm40Var = jm40.b;
            mm40 mm40VarN = o7k0.n(jm40Var, 56.0f);
            tj30 tj30VarC2 = zq8.c(zx7Var, false);
            int iHashCode2 = Long.hashCode(fetVar.T);
            bh90 bh90VarM2 = fetVar.m();
            mm40 mm40VarC1 = kbc.c0(fetVar, mm40VarN);
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(pcyVar);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, tj30VarC2, shdVar);
            jpm0.o(fetVar, bh90VarM2, shdVar2);
            vqd.u(iHashCode2, fetVar, shdVar3, fetVar);
            jpm0.o(fetVar, mm40VarC1, shdVar4);
            j0x.b(a8k0.F(i, (i4 >> 3) & 14, fetVar), null, lgb.J(o7k0.c, vgg0.a(12.0f)), null, gqw0.B, 0.0f, null, fetVar, 24632, 104);
            tdc.e(new rpe(i2), new gpe(((StaticColors) fetVar.k(m8m0.f21378a)).m62getBlack0d7_KjU()), ffb0.R(jr8.f16991a.b(jm40Var, gqw0.i), 0.0f, -4.0f, 1), fetVar, 0, 0);
            fetVar.r(true);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new s48(mm40Var, i, i2, i3, (byte) 3);
        }
    }

    public static final void k(co10 co10Var, Function1 function1, fet fetVar, int i) {
        fet fetVar2 = fetVar;
        fetVar2.g0(1078059542);
        byte b = 16;
        int i2 = i | (fetVar2.i(co10Var) ? 4 : 2) | (fetVar2.i(function1) ? 32 : 16);
        if (fetVar2.U(i2 & 1, (i2 & 19) != 18)) {
            boolean z = ((i2 & 14) == 4 || fetVar2.i(co10Var)) | ((i2 & 112) == 32);
            Object objP = fetVar2.P();
            if (z || objP == ukd.f35823a) {
                objP = new mbz(function1, co10Var, b);
                fetVar2.o0(objP);
            }
            Function0 function0 = (Function0) objP;
            jm40 jm40Var = jm40.b;
            mm40 mm40VarE = o7k0.d(jm40Var, 1.0f).e(co10Var.e ? y860.Y(jm40Var, false, null, null, function0, 15) : jm40Var);
            tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarE);
            mkd.c0.getClass();
            fetVar2.i0();
            boolean z2 = fetVar2.S;
            pcy pcyVar = e7z.u1;
            if (z2) {
                fetVar2.l(pcyVar);
            } else {
                fetVar2.r0();
            }
            shd shdVar = gqw0.x;
            jpm0.o(fetVar2, tj30VarC, shdVar);
            shd shdVar2 = gqw0.w;
            jpm0.o(fetVar2, bh90VarM, shdVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            shd shdVar3 = gqw0.y;
            jpm0.o(fetVar2, numValueOf, shdVar3);
            jpm0.n(fetVar2);
            shd shdVar4 = gqw0.v;
            jpm0.o(fetVar2, mm40VarC0, shdVar4);
            mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarG = o7k0.g(mm40VarD, 56.0f, 0.0f, 2);
            thg0 thg0VarA = shg0.a(new qw3(4.0f, true, new jf4((byte) 14)), gqw0.k, fetVar2, 48);
            int iHashCode2 = Long.hashCode(fetVar2.T);
            bh90 bh90VarM2 = fetVar2.m();
            mm40 mm40VarC1 = kbc.c0(fetVar2, mm40VarG);
            fetVar2.i0();
            if (fetVar2.S) {
                fetVar2.l(pcyVar);
            } else {
                fetVar2.r0();
            }
            jpm0.o(fetVar2, thg0VarA, shdVar);
            jpm0.o(fetVar2, bh90VarM2, shdVar2);
            vqd.u(iHashCode2, fetVar2, shdVar3, fetVar2);
            jpm0.o(fetVar2, mm40VarC1, shdVar4);
            j(s5x0.N(jm40Var, 0.0f, 0.0f, 4.0f, 0.0f, 11), co10Var.b, co10Var.d, fetVar2, 0);
            String str = co10Var.c;
            ((g1t0) fetVar2.k(j1t0.e)).getClass();
            v8q0.a(str, s5x0.M(new x7z(1.0f, true), 4.0f, 6.0f, 16.0f, 6.0f), ((StaticColors) fetVar2.k(m8m0.f21378a)).m123getWhite0d7_KjU(), null, 0L, null, null, null, 0L, null, 0L, 2, false, 3, 0, null, g1t0.d(), fetVar, 0, 24960, 110584);
            fetVar2 = fetVar;
            if (co10Var.e) {
                fetVar2.e0(1187052310);
                qzb.n(null, f18517a, function0, fetVar2, 48, 1);
                fetVar2.r(false);
            } else {
                fetVar2.e0(1187217602);
                fetVar2.r(false);
            }
            fetVar2.r(true);
            mbc.o(wfi0.f39073a, jr8.f16991a.b(jm40Var, gqw0.h), false, fetVar2, 6, 4);
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new k110((Object) co10Var, (Object) function1, i, (byte) 7);
        }
    }

    public static final void l(wm10 wm10Var, float f, Function1 function1, fet fetVar, int i) {
        int i2;
        Function1 function2 = function1;
        fetVar.g0(-1914725839);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? fetVar.g(wm10Var) : fetVar.i(wm10Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.d(f) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.i(function2) ? 256 : 128;
        }
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            mm40 mm40VarQ = i120.Q(o7k0.c, obc.O(R.color.result_bg_color, fetVar), jd8.n);
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar, 0);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarQ);
            mkd.c0.getClass();
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(e7z.u1);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, x5dVarA, gqw0.x);
            jpm0.o(fetVar, bh90VarM, gqw0.w);
            jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar);
            jpm0.o(fetVar, mm40VarC0, gqw0.v);
            jm40 jm40Var = jm40.b;
            mm40 mm40VarN = s5x0.N(o050.W(o7k0.d(jm40Var, 1.0f).e(new x7z(1.0f, true))), 0.0f, f, 0.0f, 0.0f, 13);
            zcl zclVar = qmk.f28987a;
            lh80 lh80Var = new lh80(qmk.a(fetVar).e, 12.0f, qmk.a(fetVar).e, 0.0f);
            qw3 qw3Var = new qw3(8.0f, true, new jf4((byte) 14));
            boolean z = (i2 & 14) == 4 || ((i2 & 8) != 0 && fetVar.i(wm10Var));
            int i3 = i2 & 896;
            boolean z2 = z | (i3 == 256);
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (z2 || objP == cl5Var) {
                objP = new u400(wm10Var, function2, (byte) 18);
                fetVar.o0(objP);
            }
            b8k0.e(mm40VarN, null, lh80Var, qw3Var, null, null, false, null, (Function1) objP, fetVar, 0, 490);
            mm40 mm40VarK = s5x0.K(o050.S(o7k0.d(jm40Var, 1.0f)), qmk.a(fetVar).d, 12.0f);
            wul wulVar = wm10Var.f;
            boolean z3 = i3 == 256;
            Object objP2 = fetVar.P();
            if (z3 || objP2 == cl5Var) {
                function2 = function1;
                objP2 = new pd10(function2, (byte) 19);
                fetVar.o0(objP2);
            } else {
                function2 = function1;
            }
            qzb.n(mm40VarK, wulVar, (Function0) objP2, fetVar, 0, 0);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new svm((Object) wm10Var, f, (wdr) function2, i, (byte) 4);
        }
    }

    public static final void m(xm10 xm10Var, float f, Float f2, Function1 function1, fet fetVar, int i) {
        int i2;
        zfn zfnVar;
        long jM123getWhite0d7_KjU;
        pcy pcyVar;
        int i3;
        cl5 cl5Var;
        int i4;
        fet fetVar2 = fetVar;
        fetVar2.g0(-979862327);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? fetVar2.g(xm10Var) : fetVar2.i(xm10Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar2.d(f) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar2.g(f2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= fetVar2.i(function1) ? 2048 : 1024;
        }
        if (fetVar2.U(i2 & 1, (i2 & 1171) != 1170)) {
            mm40 mm40VarS = o050.S(o050.W(i120.Q(o7k0.c, obc.O(R.color.result_bg_color, fetVar2), jd8.n)));
            boolean z = ((i2 & 112) == 32) | ((i2 & 896) == 256);
            Object objP = fetVar2.P();
            cl5 cl5Var2 = ukd.f35823a;
            if (z || objP == cl5Var2) {
                objP = new dlb(f, f2);
                fetVar2.o0(objP);
            }
            tj30 tj30Var = (tj30) objP;
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarS);
            mkd.c0.getClass();
            fetVar2.i0();
            boolean z2 = fetVar2.S;
            pcy pcyVar2 = e7z.u1;
            if (z2) {
                fetVar2.l(pcyVar2);
            } else {
                fetVar2.r0();
            }
            shd shdVar = gqw0.x;
            jpm0.o(fetVar2, tj30Var, shdVar);
            shd shdVar2 = gqw0.w;
            jpm0.o(fetVar2, bh90VarM, shdVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            shd shdVar3 = gqw0.y;
            jpm0.o(fetVar2, numValueOf, shdVar3);
            jpm0.n(fetVar2);
            shd shdVar4 = gqw0.v;
            jpm0.o(fetVar2, mm40VarC0, shdVar4);
            int i5 = i2;
            String str = xm10Var.f;
            boolean z3 = xm10Var.e;
            zfn zfnVar2 = j1t0.e;
            ((g1t0) fetVar2.k(zfnVar2)).getClass();
            y9q0 y9q0VarS = g1t0.s();
            if (z3) {
                fetVar2.e0(-50132750);
                zfnVar = m8m0.f21378a;
                jM123getWhite0d7_KjU = ((StaticColors) fetVar2.k(zfnVar)).m94getGamesTextVictory0d7_KjU();
                fetVar2.r(false);
            } else {
                fetVar2.e0(-50047779);
                zfnVar = m8m0.f21378a;
                jM123getWhite0d7_KjU = ((StaticColors) fetVar2.k(zfnVar)).m123getWhite0d7_KjU();
                fetVar2.r(false);
            }
            zcl zclVar = qmk.f28987a;
            float f3 = qmk.a(fetVar2).e;
            jm40 jm40Var = jm40.b;
            zfn zfnVar3 = zfnVar;
            v8q0.a(str, o7k0.d(s5x0.L(jm40Var, f3, 0.0f, 2), 1.0f), jM123getWhite0d7_KjU, null, 0L, null, null, null, 0L, new f2q0(3), 0L, 2, false, 1, 0, null, y9q0VarS, fetVar, 0, 24960, 109560);
            mm40 mm40VarD = o7k0.d(s5x0.L(jm40Var, qmk.a(fetVar).e, 0.0f, 2), 1.0f);
            tj30 tj30VarC = zq8.c(gqw0.e, false);
            int iHashCode2 = Long.hashCode(fetVar.T);
            bh90 bh90VarM2 = fetVar.m();
            mm40 mm40VarC1 = kbc.c0(fetVar, mm40VarD);
            fetVar.i0();
            if (fetVar.S) {
                pcyVar = pcyVar2;
                fetVar.l(pcyVar);
            } else {
                pcyVar = pcyVar2;
                fetVar.r0();
            }
            jpm0.o(fetVar, tj30VarC, shdVar);
            jpm0.o(fetVar, bh90VarM2, shdVar2);
            vqd.u(iHashCode2, fetVar, shdVar3, fetVar);
            jpm0.o(fetVar, mm40VarC1, shdVar4);
            pm80 pm80VarF = a8k0.F(R.drawable.ic_light, 0, fetVar);
            pge pgeVar = gqw0.A;
            pcy pcyVar3 = pcyVar;
            j0x.b(pm80VarF, null, epv0.N(jr8.f16991a.a(jm40Var), z3 ? 1.0f : 0.0f), null, pgeVar, 0.0f, null, fetVar, 24632, 104);
            j0x.b(a8k0.F(xm10Var.d, 0, fetVar), null, ny9.O(1.5058824f, o7k0.d(o7k0.u(jm40Var, 0.0f, 560.0f, 1), 1.0f), false), null, pgeVar, 0.0f, null, fetVar, 25016, 104);
            fetVar.r(true);
            String str2 = xm10Var.g;
            ((g1t0) fetVar.k(zfnVar2)).getClass();
            v8q0.a(str2, lgb.K(o7k0.d(s5x0.L(jm40Var, qmk.a(fetVar).e, 0.0f, 2), 1.0f)), ((StaticColors) fetVar.k(zfnVar3)).m131getWhite800d7_KjU(), null, 0L, null, null, null, 0L, new f2q0(3), 0L, 1, false, 0, 0, null, g1t0.k(), fetVar, 0, 384, 125944);
            fetVar2 = fetVar;
            mm40 mm40VarN = s5x0.N(s5x0.L(i120.P(o7k0.d(jm40Var, 1.0f), yk5.n(q3d.j(new y3d(((StaticColors) fetVar2.k(zfnVar3)).m121getTransparent0d7_KjU()), new y3d(((StaticColors) fetVar2.k(zfnVar3)).m62getBlack0d7_KjU())), 0.0f, 0.0f, 14), null, 6), qmk.a(fetVar2).d, 0.0f, 2), 0.0f, 0.0f, 0.0f, 16.0f, 7);
            x5d x5dVarA = w5d.a(new qw3(12.0f, true, new jf4((byte) 14)), gqw0.n, fetVar2, 48);
            int iHashCode3 = Long.hashCode(fetVar2.T);
            bh90 bh90VarM3 = fetVar2.m();
            mm40 mm40VarC2 = kbc.c0(fetVar2, mm40VarN);
            fetVar2.i0();
            if (fetVar2.S) {
                fetVar2.l(pcyVar3);
            } else {
                fetVar2.r0();
            }
            jpm0.o(fetVar2, x5dVarA, shdVar);
            jpm0.o(fetVar2, bh90VarM3, shdVar2);
            vqd.u(iHashCode3, fetVar2, shdVar3, fetVar2);
            jpm0.o(fetVar2, mm40VarC2, shdVar4);
            if (xm10Var.h) {
                fetVar2.e0(950947092);
                String str3 = xm10Var.j;
                long j = xm10Var.i;
                i3 = i5;
                i4 = 2048;
                boolean z4 = (i3 & 7168) == 2048;
                Object objP2 = fetVar2.P();
                if (z4) {
                    cl5Var = cl5Var2;
                } else {
                    cl5Var = cl5Var2;
                    if (objP2 == cl5Var) {
                    }
                    e(0, 1, j, fetVar, null, str3, (Function0) objP2);
                    fetVar2 = fetVar;
                    fetVar2.r(false);
                }
                objP2 = new pd10(function1, (byte) 6);
                fetVar2.o0(objP2);
                e(0, 1, j, fetVar, null, str3, (Function0) objP2);
                fetVar2 = fetVar;
                fetVar2.r(false);
            } else {
                i3 = i5;
                cl5Var = cl5Var2;
                i4 = 2048;
                fetVar2.e0(951246924);
                fetVar2.r(false);
            }
            wul wulVar = xm10Var.k;
            fetVar2.e0(951288712);
            boolean z5 = (i3 & 7168) == i4;
            Object objP3 = fetVar2.P();
            if (z5 || objP3 == cl5Var) {
                objP3 = new pd10(function1, (byte) 7);
                fetVar2.o0(objP3);
            }
            d(wulVar, (Function0) objP3, fetVar2, 0);
            fetVar2.r(false);
            wul wulVar2 = xm10Var.l;
            if (wulVar2 == null) {
                fetVar2.e0(951553885);
                fetVar2.r(false);
            } else {
                fetVar2.e0(951553886);
                boolean z6 = (i3 & 7168) == i4;
                Object objP4 = fetVar2.P();
                if (z6 || objP4 == cl5Var) {
                    objP4 = new pd10(function1, (byte) 8);
                    fetVar2.o0(objP4);
                }
                d(wulVar2, (Function0) objP4, fetVar2, 0);
                fetVar2.r(false);
            }
            wul wulVar3 = xm10Var.m;
            fetVar2.e0(951828670);
            boolean z7 = (i3 & 7168) == i4;
            Object objP5 = fetVar2.P();
            if (z7 || objP5 == cl5Var) {
                objP5 = new pd10(function1, (byte) 9);
                fetVar2.o0(objP5);
            }
            d(wulVar3, (Function0) objP5, fetVar2, 0);
            ohs0.x(fetVar2, false, true, true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new zm2((Object) xm10Var, f, (Object) f2, (wdr) function1, i, (byte) 3);
        }
    }
}
