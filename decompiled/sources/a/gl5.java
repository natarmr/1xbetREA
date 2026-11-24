package a;

import android.content.ComponentCallbacks2;
import androidx.fragment.app.Fragment;
import com.huawei.hms.adapter.internal.AvailableCode;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.text.Charsets;
import org.xplatform.sportgame.markets.betbuilder.api.navigation.BetBuilderMarketsParams;

/* JADX INFO: loaded from: classes3.dex */
public final class gl5 implements pz5, kotlin.coroutines.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f11474a;

    public /* synthetic */ gl5(byte b) {
        this.f11474a = b;
    }

    public static boolean g(d9a0 d9a0Var, ArrayList arrayList, ArrayList arrayList2, boolean z) {
        boolean z2;
        if (arrayList2.size() >= 5) {
            z2 = false;
        } else {
            if (!arrayList2.isEmpty()) {
                Iterator it = arrayList2.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (((d9a0) it.next()).f5691a == d9a0Var.f5691a) {
                            z2 = false;
                        }
                    }
                }
            }
            z2 = true;
        }
        if (z) {
            return z2 && arrayList.size() > 1;
        }
        return z2;
    }

    public static qg9 h(String str) {
        if (str.length() % 2 != 0) {
            c99.s("Unexpected hex string: ".concat(str));
            return null;
        }
        int length = str.length() / 2;
        byte[] bArr = new byte[length];
        for (int i = 0; i < length; i++) {
            int i2 = i * 2;
            bArr[i] = (byte) (s5x0.D(str.charAt(i2 + 1)) + (s5x0.D(str.charAt(i2)) << 4));
        }
        return new qg9(bArr);
    }

    public static qg9 i(String str) {
        str.getClass();
        byte[] bytes = str.getBytes(Charsets.UTF_8);
        bytes.getClass();
        qg9 qg9Var = new qg9(bytes);
        qg9Var.c = str;
        return qg9Var;
    }

    public static je8 j(esr esrVar) {
        int iOrdinal = esrVar.ordinal();
        if (iOrdinal == 1) {
            return je8.DOUBLE_BONUS;
        }
        if (iOrdinal == 2) {
            return je8.RETURN_HALF;
        }
        if (iOrdinal != 3) {
            return iOrdinal != 5 ? je8.ALL : je8.WILD_FREE_BET;
        }
        return je8.FREE_BET;
    }

    public static void k(Fragment fragment, String str, Function0 function0, Function1 function1) {
        fragment.getClass();
        fragment.F().u0(str, fragment, new hi(str, function0, function1));
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0037  */
    /* JADX WARN: Code duplicated, block: B:20:0x0041  */
    /* JADX WARN: Code duplicated, block: B:63:0x004d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:64:0x004b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:65:? A[LOOP:1: B:18:0x003b->B:65:?, LOOP_END, SYNTHETIC] */
    public static jyb l(d9a0 d9a0Var, ArrayList arrayList, ArrayList arrayList2, bop0 bop0Var, boolean z) {
        boolean zG;
        Iterator it;
        d9a0Var.getClass();
        int i = d9a0Var.b;
        bop0Var.getClass();
        int iOrdinal = bop0Var.ordinal();
        byte b = bop0Var.f2946a;
        boolean z2 = false;
        if (iOrdinal == 0) {
            zG = g(d9a0Var, arrayList2, arrayList, z);
        } else if (iOrdinal == 1) {
            zG = g(d9a0Var, arrayList, arrayList2, z);
        } else if (arrayList.isEmpty()) {
            if (!arrayList2.isEmpty()) {
                it = arrayList2.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (((d9a0) it.next()).b == i) {
                            zG = true;
                        }
                    }
                }
            }
            zG = false;
        } else {
            Iterator it2 = arrayList.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    if (!arrayList2.isEmpty()) {
                        it = arrayList2.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                if (((d9a0) it.next()).b == i) {
                                }
                            }
                        }
                    }
                    zG = false;
                } else if (((d9a0) it2.next()).b == i) {
                }
                zG = true;
            }
        }
        boolean z3 = arrayList.size() == 5;
        boolean z4 = arrayList2.size() == 5;
        if (z3 && z4) {
            z2 = true;
        }
        if (!d9a0Var.equals(d9a0.g)) {
            if (z2 && bop0Var != bop0.UNDEFINED) {
                return new fyb(b);
            }
            if (z3 && bop0Var == bop0.FIRST) {
                return new gyb(b);
            }
            if (z4 && bop0Var == bop0.SECOND) {
                return new gyb(b);
            }
            if (zG) {
                return ujn.f;
            }
        }
        return iyb.f15580a;
    }

    public static qg9 m(byte[] bArr) {
        qg9 qg9Var = qg9.d;
        int length = bArr.length;
        bArr.getClass();
        cy2.x(bArr.length, 0L, length);
        return new qg9(qx3.j(bArr, 0, length));
    }

    public static void n(androidx.fragment.app.e eVar, String str, String str2, double d, double d2, double d3, boolean z) {
        eVar.getClass();
        str.getClass();
        if (eVar.J("BET_SALE_CONFIRM_TAG") != null) {
            return;
        }
        tj7 tj7Var = new tj7();
        iiy[] iiyVarArr = tj7.u2;
        tj7Var.m2.x(tj7Var, iiyVarArr[0], "REQUEST_CONFIRM_SALE_DIALOG_KEY");
        tj7Var.o2.x(tj7Var, iiyVarArr[2], str2);
        tj7Var.n2.x(tj7Var, iiyVarArr[1], str);
        tj7Var.q2.f0(tj7Var, iiyVarArr[4], d2);
        tj7Var.p2.f0(tj7Var, iiyVarArr[3], d);
        tj7Var.r2.f0(tj7Var, iiyVarArr[5], d3);
        tj7Var.s2.v(tj7Var, iiyVarArr[6], z);
        tj7Var.H0(eVar, "BET_SALE_CONFIRM_TAG");
    }

    public static /* synthetic */ void o(gl5 gl5Var, androidx.fragment.app.e eVar, String str, String str2, double d, int i) {
        double d2 = (i & 16) != 0 ? -1.0d : d;
        gl5Var.getClass();
        n(eVar, str, str2, -1.0d, d2, -1.0d, false);
    }

    public static void p(Fragment fragment, String str, d7a d7aVar, String str2) {
        fragment.getClass();
        d7aVar.getClass();
        str2.getClass();
        i7a i7aVar = d7aVar.f5586a;
        int iOrdinal = i7aVar.d.ordinal();
        if (iOrdinal == 0) {
            mi70 mi70Var = et90.j2;
            androidx.fragment.app.e eVarF = fragment.F();
            mi70Var.getClass();
            mi70.c(i7aVar, str, eVarF);
            return;
        }
        if (iOrdinal == 2) {
            svs0 svs0Var = a2v0.g2;
            androidx.fragment.app.e eVarF2 = fragment.F();
            c2v0 c2v0Var = new c2v0(str, i7aVar, d7aVar.b, str2, "");
            svs0Var.getClass();
            svs0.d(eVarF2, c2v0Var);
            return;
        }
        if (iOrdinal != 3) {
            return;
        }
        xi70 xi70Var = sdd0.i2;
        String str3 = i7aVar.b;
        androidx.fragment.app.e eVarF3 = fragment.F();
        xi70Var.getClass();
        xi70.g(eVarF3, str3, str, i7aVar);
    }

    public static void q(Fragment fragment, String str, d7a d7aVar, String str2) {
        fragment.getClass();
        d7aVar.getClass();
        str2.getClass();
        i7a i7aVar = d7aVar.f5586a;
        int iOrdinal = i7aVar.d.ordinal();
        if (iOrdinal == 0) {
            mi70 mi70Var = et90.j2;
            androidx.fragment.app.e eVarF = fragment.F();
            mi70Var.getClass();
            mi70.c(i7aVar, str, eVarF);
            return;
        }
        if (iOrdinal != 2) {
            if (iOrdinal != 3) {
                return;
            }
            xi70 xi70Var = sdd0.i2;
            String str3 = i7aVar.b;
            androidx.fragment.app.e eVarF2 = fragment.F();
            xi70Var.getClass();
            xi70.g(eVarF2, str3, str, i7aVar);
            return;
        }
        bzs0 bzs0Var = w1v0.j2;
        androidx.fragment.app.e eVarF3 = fragment.F();
        String str4 = d7aVar.b;
        bzs0Var.getClass();
        str4.getClass();
        String simpleName = w1v0.class.getSimpleName();
        if (eVarF3.J(simpleName) == null) {
            w1v0 w1v0Var = new w1v0();
            iiy[] iiyVarArr = w1v0.k2;
            w1v0Var.b2.x(w1v0Var, iiyVarArr[0], str);
            w1v0Var.e2.u(w1v0Var, iiyVarArr[3], i7aVar);
            w1v0Var.d2.x(w1v0Var, iiyVarArr[2], str4);
            w1v0Var.c2.x(w1v0Var, iiyVarArr[1], str2);
            sj3.E0(w1v0Var, eVarF3, simpleName);
        }
    }

    @Override // a.pz5
    public boolean a(float f) {
        throw new IllegalStateException("not implemented");
    }

    @Override // a.pz5
    public cmy b() {
        throw new IllegalStateException("not implemented");
    }

    @Override // a.pz5
    public boolean c(float f) {
        return false;
    }

    @Override // a.pz5
    public float d() {
        return 0.0f;
    }

    @Override // a.pz5
    public float e() {
        return 1.0f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v3 */
    /* JADX WARN: Type inference failed for: r13v4, types: [androidx.fragment.app.Fragment] */
    /* JADX WARN: Type inference failed for: r13v8 */
    /* JADX WARN: Type inference failed for: r41v0, types: [a.fet] */
    /* JADX WARN: Type inference failed for: r8v15 */
    /* JADX WARN: Type inference failed for: r8v16, types: [androidx.fragment.app.Fragment] */
    /* JADX WARN: Type inference failed for: r8v21 */
    public void f(mm40 mm40Var, Fragment fragment, BetBuilderMarketsParams betBuilderMarketsParams, Function1 function1, fet fetVar, int i) {
        Fragment fragment2;
        boolean z;
        Object tg4Var;
        cl5 cl5Var;
        function1.getClass();
        fetVar.g0(-1170573315);
        BetBuilderMarketsParams betBuilderMarketsParams2 = betBuilderMarketsParams;
        int i2 = i | (fetVar.g(mm40Var) ? 4 : 2) | (fetVar.i(fragment) ? 32 : 16) | (fetVar.i(betBuilderMarketsParams2) ? 256 : 128) | (fetVar.i(function1) ? 2048 : 1024);
        byte b = 0;
        if (fetVar.U(i2 & 1, (i2 & 1171) != 1170)) {
            Object objP = fetVar.P();
            cl5 cl5Var2 = ukd.f35823a;
            if (objP == cl5Var2) {
                ComponentCallbacks2 componentCallbacks2I = vqd.i(fragment);
                af3 af3Var = componentCallbacks2I instanceof af3 ? (af3) componentCallbacks2I : null;
                if (af3Var != null) {
                    o5d0 o5d0Var = (o5d0) af3Var.d().get(ri6.class);
                    ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
                    if (!(ze3Var instanceof ri6)) {
                        ze3Var = null;
                    }
                    ri6 ri6Var = (ri6) ze3Var;
                    if (ri6Var != null) {
                        ?? r8 = fragment;
                        while (true) {
                            if (r8 == 0) {
                                jf4.n("Can't find feature provider!");
                                return;
                            }
                            if (r8 instanceof ocl0) {
                                ocl0 ocl0Var = (ocl0) r8;
                                ?? r13 = fragment;
                                while (true) {
                                    if (r13 == 0) {
                                        jf4.n("Can't find feature provider!");
                                        return;
                                    }
                                    if (r13 instanceof odf0) {
                                        odf0 odf0Var = (odf0) r13;
                                        pcl0 pcl0VarU = ocl0Var.u(new ti6(fragment, b));
                                        cad cadVar = ri6Var.f30524a;
                                        iw20 iw20Var = ri6Var.b;
                                        zfo zfoVar = ri6Var.c;
                                        edo edoVar = ri6Var.d;
                                        j1q0 j1q0Var = ri6Var.e;
                                        peg0 peg0Var = ri6Var.f;
                                        ctf0 ctf0Var = ri6Var.g;
                                        g2v g2vVar = ri6Var.h;
                                        r9u r9uVar = ri6Var.i;
                                        edu eduVar = ri6Var.j;
                                        jw20 jw20Var = ri6Var.k;
                                        ndf0 ndf0Var = ri6Var.l;
                                        pdf0 pdf0VarB = odf0Var.b();
                                        d1p d1pVar = ri6Var.m;
                                        gst0 gst0Var = ri6Var.n;
                                        kt2 kt2Var = ri6Var.o;
                                        knf0 knf0Var = ri6Var.p;
                                        qoi qoiVar = ri6Var.q;
                                        sue sueVar = ri6Var.r;
                                        pcl0VarU.getClass();
                                        d1pVar.getClass();
                                        qoiVar.getClass();
                                        sueVar.getClass();
                                        zfoVar.getClass();
                                        edoVar.getClass();
                                        j1q0Var.getClass();
                                        ctf0Var.getClass();
                                        r9uVar.getClass();
                                        gst0Var.getClass();
                                        kt2Var.getClass();
                                        knf0Var.getClass();
                                        u9i u9iVar = new u9i(cadVar, pcl0VarU, iw20Var, jw20Var, pdf0VarB, d1pVar, qoiVar, sueVar, betBuilderMarketsParams2, zfoVar, edoVar, j1q0Var, peg0Var, ctf0Var, g2vVar, r9uVar, eduVar, ndf0Var, gst0Var, kt2Var, knf0Var);
                                        fetVar.o0(u9iVar);
                                        objP = u9iVar;
                                        break;
                                    }
                                    betBuilderMarketsParams2 = betBuilderMarketsParams;
                                    b = 0;
                                    r13 = r13.y;
                                }
                            } else {
                                betBuilderMarketsParams2 = betBuilderMarketsParams;
                                b = 0;
                                r8 = r8.y;
                            }
                        }
                    }
                }
                jf4.n(b1j.i(ri6.class, "Cannot create dependency "));
                return;
            }
            u9i u9iVar2 = (u9i) objP;
            q0h0 q0h0Var = new q0h0((t9i) u9iVar2.v.get());
            sgy sgyVarB = sre0.f32672a.b(dk6.class);
            int i3 = dk6.K;
            i3t0 i3t0Var = (i3t0) n4c.X(sgyVarB, null, q0h0Var, fetVar, 14);
            pz40 pz40VarY = i3t0Var.y(fetVar);
            xcz xczVarA = ddz.a(0, 0, fetVar, 0, 3);
            Object objP2 = fetVar.P();
            if (objP2 == cl5Var2) {
                objP2 = m0x0.I(kotlin.coroutines.g.f46065a, fetVar);
                fetVar.o0(objP2);
            }
            vne vneVar = (vne) objP2;
            Object objP3 = fetVar.P();
            if (objP3 == cl5Var2) {
                objP3 = u9iVar2.u;
                fetVar.o0(objP3);
            }
            ndf0 ndf0Var2 = (ndf0) objP3;
            Object objP4 = fetVar.P();
            if (objP4 == cl5Var2) {
                objP4 = u9iVar2.s.a();
                fetVar.o0(objP4);
            }
            qta0 qta0Var = (qta0) objP4;
            Object objP5 = fetVar.P();
            if (objP5 == cl5Var2) {
                objP5 = u9iVar2.f.w();
                x1x.x(objP5);
                fetVar.o0(objP5);
            }
            vq vqVar = (vq) objP5;
            boolean zG = fetVar.g(u9iVar2);
            Object objP6 = fetVar.P();
            if (zG || objP6 == cl5Var2) {
                vqVar.f(fragment, new zq2(), new ui6(i3t0Var, (byte) 0));
                fetVar.o0(Unit.f46060a);
            }
            Object objP7 = fetVar.P();
            if (objP7 == cl5Var2) {
                z = false;
                objP7 = androidx.compose.runtime.e.e(null);
                fetVar.o0(objP7);
            } else {
                z = false;
            }
            pz40 pz40Var = (pz40) objP7;
            boolean zI = fetVar.i(vneVar) | fetVar.g(xczVarA) | fetVar.i(fragment) | fetVar.i(qta0Var) | fetVar.i(vqVar) | fetVar.i(i3t0Var);
            Object objP8 = fetVar.P();
            if (zI || objP8 == cl5Var2) {
                cl5Var = cl5Var2;
                tg4Var = new tg4((Object) vneVar, (Object) fragment, (Object) qta0Var, (Object) vqVar, (Object) pz40Var, (Object) i3t0Var, (Object) xczVarA, (byte) 2);
                fetVar.o0(tg4Var);
            } else {
                tg4Var = objP8;
                cl5Var = cl5Var2;
            }
            pz40 pz40VarF = androidx.compose.runtime.e.f((Function1) tg4Var, fetVar);
            boolean zI2 = fetVar.i(i3t0Var) | fetVar.g(pz40VarF);
            Object objP9 = fetVar.P();
            if (zI2 || objP9 == cl5Var) {
                objP9 = new xw5(i3t0Var, pz40VarF, z, (byte) 9);
                fetVar.o0(objP9);
            }
            m0x0.t(fetVar, u9iVar2, (Function2) objP9);
            boolean zI3 = fetVar.i(i3t0Var);
            Object objP10 = fetVar.P();
            if (zI3 || objP10 == cl5Var) {
                objP10 = new vi6(i3t0Var, (byte) 0);
                fetVar.o0(objP10);
            }
            ju70.f(mm40Var, pz40VarY, xczVarA, function1, (Function1) objP10, u1c.M(152126745, new ab4((Object) ndf0Var2, (Object) fragment, (byte) 4), fetVar), fetVar, (i2 & 14) | 196608 | (i2 & 7168));
        } else {
            fragment2 = fragment;
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ba00((Object) this, (Object) mm40Var, (Object) fragment2, (Object) betBuilderMarketsParams, (Object) function1, i, (byte) 11);
        }
    }

    @Override // a.pz5
    public boolean isEmpty() {
        return true;
    }

    public String toString() {
        switch (this.f11474a) {
            case AvailableCode.HMS_IS_SPOOF /* 29 */:
                return "CompositionErrorContext";
            default:
                return super.toString();
        }
    }
}
