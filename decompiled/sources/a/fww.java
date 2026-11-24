package a;

import android.graphics.ColorFilter;
import android.javax.sip.message.Response;
import android.util.Log;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;
import org.xplatform.uikit.compose.color.StaticColors;
import org.xplatform.uikit.compose.color.ThemeColors;

/* JADX INFO: loaded from: classes5.dex */
public abstract class fww {
    public static final String A(String str, ArrayList arrayList) {
        Object next;
        Object next2;
        Iterator it = arrayList.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!((c4h) next).f3725a.equals(str));
        c4h c4hVar = (c4h) next;
        String str2 = c4hVar != null ? c4hVar.f3725a : null;
        Iterator it2 = arrayList.iterator();
        do {
            if (!it2.hasNext()) {
                next2 = null;
                break;
            }
            next2 = it2.next();
        } while (Intrinsics.d((c4h) next2, new c4h("", "", "", "", 0.0f, 0.0f, 0.0f, 0, 0, iun.f15405a)));
        c4h c4hVar2 = (c4h) next2;
        String str3 = c4hVar2 != null ? c4hVar2.f3725a : null;
        if (str3 == null) {
            str3 = "";
        }
        return sj3.j0(str2, str3);
    }

    public static final String B(String str, double d) {
        pn40 pn40Var = pn40.f27267a;
        return pn40.d(d, str, p3u0.c);
    }

    public static final float C(z9p z9pVar, float f, float f2) {
        int iOrdinal = z9pVar.ordinal();
        if (iOrdinal == 0) {
            return f2;
        }
        if (iOrdinal == 1) {
            return f;
        }
        t9f.b();
        return 0.0f;
    }

    public static final mm40 D(w6n w6nVar, z9p z9pVar, k6z k6zVar) {
        Pair pair;
        Pair pair2;
        k6zVar.getClass();
        int iOrdinal = k6zVar.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal != 1) {
                t9f.b();
                return null;
            }
            int iOrdinal2 = z9pVar.ordinal();
            if (iOrdinal2 == 0) {
                z9pVar = z9p.b;
            } else {
                if (iOrdinal2 != 1) {
                    t9f.b();
                    return null;
                }
                z9pVar = z9p.f44030a;
            }
        }
        int iOrdinal3 = w6nVar.ordinal();
        if (iOrdinal3 != 7) {
            if (iOrdinal3 != 9) {
                zcl zclVar = qmk.f28987a;
                pair2 = new Pair(new ycl(C(z9pVar, 0.0f, 0.0f)), new ycl(0.0f));
            } else {
                zcl zclVar2 = qmk.f28987a;
                pair = new Pair(new ycl(C(z9pVar, -8.0f, 16.0f)), new ycl(12.0f));
            }
            return new tnf0(((ycl) pair2.f46059a).f42389a, ((ycl) pair2.b).f42389a);
        }
        zcl zclVar3 = qmk.f28987a;
        pair = new Pair(new ycl(C(z9pVar, -8.0f, 24.0f)), new ycl(20.0f));
        pair2 = pair;
        return new tnf0(((ycl) pair2.f46059a).f42389a, ((ycl) pair2.b).f42389a);
    }

    public static final ArrayList E(List list) {
        ArrayList arrayList = new ArrayList(r3d.q(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            c4h c4hVar = (c4h) it.next();
            if (c4hVar.b.length() == 0) {
                c4hVar = new c4h("", "", "", "", 0.0f, 0.0f, 0.0f, 0, 0, iun.f15405a);
            }
            arrayList.add(c4hVar);
        }
        return arrayList;
    }

    public static final va80 F(int i) {
        switch (i) {
            case 1:
                return va80.e;
            case 2:
            case 4:
            case 6:
            case 8:
            case 10:
            case 12:
            case 14:
            case 16:
            case 18:
            case 20:
            case 22:
            case 24:
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
            case AvailableCode.USER_ALREADY_KNOWS_SERVICE_UNAVAILABLE /* 30 */:
            case 32:
            case 34:
            case 36:
            case 38:
            case 40:
            case 42:
            default:
                return va80.b;
            case 3:
                return va80.g;
            case 5:
                return va80.f37074a;
            case 7:
                return va80.h;
            case 9:
                return va80.i;
            case 11:
                return va80.j;
            case 13:
                return va80.f;
            case 15:
                return va80.k;
            case 17:
                return va80.l;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                return va80.m;
            case 21:
                return va80.n;
            case 23:
                return va80.o;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                return va80.p;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
            case AvailableCode.HMS_IS_SPOOF /* 29 */:
                return va80.c;
            case AvailableCode.CURRENT_SHOWING_SERVICE_UNAVAILABLE /* 31 */:
            case 37:
                return va80.d;
            case 33:
            case 35:
            case 39:
            case 41:
                return va80.q;
            case 43:
                return va80.r;
        }
    }

    public static final ArrayList G(List list, gtc0 gtc0Var) {
        ArrayList arrayListU = twn.u(list);
        for (Object obj : list) {
            p6t0 p6t0Var = (p6t0) obj;
            if (!(p6t0Var instanceof ptc0) || ((ptc0) p6t0Var).b != gtc0Var) {
                if (!(p6t0Var instanceof htc0) || ((htc0) p6t0Var).f13626a != gtc0Var) {
                    arrayListU.add(obj);
                }
            }
        }
        return arrayListU;
    }

    public static final ArrayList H(List list, zuc0 zuc0Var, gtc0 gtc0Var, String str, qho qhoVar) {
        zuc0 zuc0Var2;
        gtc0 gtc0Var2;
        String str2;
        list.getClass();
        zuc0Var.getClass();
        str.getClass();
        qhoVar.getClass();
        ArrayList arrayList = new ArrayList(r3d.q(list, 10));
        for (Object obj : list) {
            if (((obj instanceof ptc0) && ((ptc0) obj).b == gtc0Var) || ((obj instanceof htc0) && ((htc0) obj).f13626a == gtc0Var)) {
                zuc0Var2 = zuc0Var;
                gtc0Var2 = gtc0Var;
                str2 = str;
                ptc0 ptc0Var = new ptc0(zuc0Var2, gtc0Var2, str2, z1x.N(gtc0Var.c, qhoVar), new itc0(gtc0Var.b(zuc0Var)));
                if (ptc0Var.equals(obj)) {
                    ptc0Var = null;
                }
                if (ptc0Var != null) {
                    obj = ptc0Var;
                }
            } else {
                zuc0Var2 = zuc0Var;
                gtc0Var2 = gtc0Var;
                str2 = str;
            }
            arrayList.add(obj);
            zuc0Var = zuc0Var2;
            gtc0Var = gtc0Var2;
            str = str2;
        }
        return arrayList;
    }

    public static final p9n I(hcs hcsVar) {
        hcsVar.getClass();
        int iOrdinal = hcsVar.ordinal();
        if (iOrdinal == 0) {
            return null;
        }
        if (iOrdinal == 1) {
            return p9n.NEW;
        }
        if (iOrdinal == 2) {
            return p9n.FREE;
        }
        if (iOrdinal == 3) {
            return p9n.BEST;
        }
        if (iOrdinal != 4) {
            if (iOrdinal == 5) {
                return p9n.SPECIAL;
            }
            t9f.b();
        }
        return null;
    }

    public static final xyy J(qk80 qk80Var, n3q n3qVar, long j, ctf0 ctf0Var, v5l0 v5l0Var) {
        qk80Var.getClass();
        ctf0Var.getClass();
        List list = qk80Var.n;
        cys0 cys0Var = qk80Var.p;
        List list2 = qk80Var.o;
        String str = qk80Var.i;
        String str2 = qk80Var.h;
        y3n0 y3n0Var = (y3n0) CollectionsKt.f0(list);
        String str3 = y3n0Var != null ? y3n0Var.b : null;
        if (str3 == null) {
            str3 = "";
        }
        String strT = vsm0.t(str3);
        y3n0 y3n0Var2 = (y3n0) CollectionsKt.f0(list2);
        String str4 = y3n0Var2 != null ? y3n0Var2.b : null;
        if (str4 == null) {
            str4 = "";
        }
        String strT2 = vsm0.t(str4);
        String strW = a8k0.w(qk80Var.f, list, cys0Var);
        String strW2 = a8k0.w(qk80Var.g, list2, cys0Var);
        boolean z = (tx3.l0(new Long[]{189L, 56L, 9L, 182L}).contains(Long.valueOf(j)) && Intrinsics.d(str2, "0") && Intrinsics.d(str, "0")) || n3qVar == n3q.b;
        kbo kboVar = new kbo(qk80Var.d, strW, qk80Var.e, strW2, strT, strT2, z ? "" : str2, z ? "" : str, z, "", "", qk80Var.j, qk80Var.k, ctf0Var.h(), kotlin.collections.a.c(new Pair(str2, str)));
        n3q n3qVar2 = n3q.b;
        long j2 = qk80Var.l;
        oim0 oim0Var = oim0.f25320a;
        return new xyy(n3qVar != n3qVar2 ? wwb.S(j2, cys0Var, kboVar, v5l0Var, ctf0Var, oim0Var) : ntb.c0(j2, cys0Var, kboVar, v5l0Var, oim0Var), qk80Var.f28874a);
    }

    public static final rqm K(tdn tdnVar, String str, boolean z, boolean z2, wui0 wui0Var) {
        Integer numValueOf = Integer.valueOf(R.drawable.ic_glyph_placeholder_player);
        String str2 = tdnVar.b;
        List list = u0d.f34849a;
        n0x n0xVar = new n0x(u0d.c(str2) ? "" : ohs0.n(ujn.h, str2));
        pz40 pz40Var = s6t0.f31722a;
        nui0 nui0Var = new nui0(null, null, new n0x(""), null, null, new qc5(numValueOf, n0xVar, new y3d(s6t0.b().f33626a.getSecondary60())), 0.0f, 216);
        String str3 = tdnVar.c;
        return new rqm(str != null ? new uui0(str3, new y3d(s6t0.b().f33626a.getTextPrimary()), str, new y3d(s6t0.b().f33626a.getSecondary()), null, 48) : new tui0(str3, new y3d(s6t0.b().f33626a.getTextPrimary())), nui0Var, new lvi0(tc00.f33696a, z), (d4d) null, (tvi0) null, wui0Var, z2, (e900) null, 312);
    }

    public static final String L(int i) {
        if (i != 0) {
            return i != 1 ? "" : "IOS";
        }
        return "android";
    }

    public static final boolean M(String str, Function0 function0) {
        try {
            boolean zBooleanValue = ((Boolean) function0.invoke()).booleanValue();
            if (!zBooleanValue) {
                Log.e("ReflectionGuard", str);
            }
            return zBooleanValue;
        } catch (ClassNotFoundException unused) {
            Log.e("ReflectionGuard", "ClassNotFound: ".concat(str));
            return false;
        } catch (NoSuchFieldException unused2) {
            Log.e("ReflectionGuard", "NoSuchField: ".concat(str));
            return false;
        } catch (NoSuchMethodException unused3) {
            Log.e("ReflectionGuard", "NoSuchMethod: ".concat(str));
            return false;
        }
    }

    public static final void a(String str, String str2, ugd ugdVar, fet fetVar, int i) {
        fet fetVar2;
        fetVar.g0(965881471);
        int i2 = (fetVar.g(str) ? 4 : 2) | i | (fetVar.g(str2) ? 32 : 16);
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (objP == cl5Var) {
                objP = androidx.compose.runtime.e.e(hz3.f13888a);
                fetVar.o0(objP);
            }
            pz40 pz40Var = (pz40) objP;
            Object objP2 = fetVar.P();
            if (objP2 == cl5Var) {
                objP2 = androidx.compose.runtime.e.e(Boolean.FALSE);
                fetVar.o0(objP2);
            }
            pz40 pz40Var2 = (pz40) objP2;
            String str3 = ((Boolean) pz40Var2.getValue()).booleanValue() ? str2 : str;
            Object objP3 = fetVar.P();
            if (objP3 == cl5Var) {
                objP3 = new cw7(pz40Var, pz40Var2, (byte) 7);
                fetVar.o0(objP3);
            }
            fetVar2 = fetVar;
            mz3 mz3VarX = l7x.X(str3, (Function1) objP3, null, fetVar2, 384, 26);
            if (((lz3) pz40Var.getValue()) instanceof kz3) {
                fetVar2.e0(-1705212519);
                ugdVar.F(mz3VarX, fetVar2, 48);
                fetVar2.r(false);
            } else {
                fetVar2.e0(-1705172157);
                fetVar2.r(false);
            }
        } else {
            fetVar2 = fetVar;
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new aok(str, str2, ugdVar, i, (byte) 1);
        }
    }

    public static final void b(dlg0 dlg0Var, Function2 function2, mm40 mm40Var, fet fetVar, int i) {
        int i2;
        fet fetVar2;
        float f;
        int i3;
        y9q0 y9q0VarN;
        dlg0Var.getClass();
        function2.getClass();
        fetVar.g0(1562840740);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? fetVar.g(dlg0Var) : fetVar.i(dlg0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.i(function2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.g(mm40Var) ? 256 : 128;
        }
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            boolean z = dlg0Var.f;
            pge pgeVar = z ? gqw0.Z : gqw0.B;
            mw3 mw3Var = uc9.c;
            xx7 xx7Var = gqw0.m;
            x5d x5dVarA = w5d.a(mw3Var, xx7Var, fetVar, 0);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40Var);
            mkd.c0.getClass();
            fetVar.i0();
            boolean z2 = fetVar.S;
            pcy pcyVar = e7z.u1;
            if (z2) {
                fetVar.l(pcyVar);
            } else {
                fetVar.r0();
            }
            shd shdVar = gqw0.x;
            jpm0.o(fetVar, x5dVarA, shdVar);
            shd shdVar2 = gqw0.w;
            jpm0.o(fetVar, bh90VarM, shdVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            shd shdVar3 = gqw0.y;
            jpm0.o(fetVar, numValueOf, shdVar3);
            jpm0.n(fetVar);
            shd shdVar4 = gqw0.v;
            jpm0.o(fetVar, mm40VarC0, shdVar4);
            xx7 xx7Var2 = gqw0.n;
            wkw wkwVar = new wkw(xx7Var2);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarD = o7k0.d(s5x0.K(wkwVar, 12.0f, 8.0f), 1.0f);
            tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
            int iHashCode2 = Long.hashCode(fetVar.T);
            bh90 bh90VarM2 = fetVar.m();
            mm40 mm40VarC1 = kbc.c0(fetVar, mm40VarD);
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(pcyVar);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, tj30VarC, shdVar);
            jpm0.o(fetVar, bh90VarM2, shdVar2);
            vqd.u(iHashCode2, fetVar, shdVar3, fetVar);
            jpm0.o(fetVar, mm40VarC1, shdVar4);
            a(dlg0Var.f6280a, dlg0Var.b, u1c.M(-1274036574, new sqc0((Object) function2, (Object) dlg0Var, (Object) pgeVar, (byte) 7), fetVar), fetVar, 384);
            fetVar.r(true);
            if (dlg0Var.c.length() > 0) {
                fetVar.e0(2071833269);
                if (z) {
                    f = 16.0f;
                    i3 = 5;
                } else {
                    f = 4.0f;
                    i3 = 13;
                }
                lh80 lh80VarU = s5x0.u(0.0f, f, 0.0f, 0.0f, i3);
                if (z) {
                    fetVar.e0(2006502693);
                    y9q0VarN = ibm0.t(new y9q0(0L, qmk.u, null, j1t0.b, 0L, null, 0, 0, qmk.H, 16646109), fetVar);
                } else {
                    fetVar.e0(2006504099);
                    y9q0VarN = ibm0.n(new y9q0(0L, qmk.s, null, j1t0.c, 0L, null, 0, 0, qmk.G, 16646109), fetVar);
                }
                fetVar.r(false);
                y9q0 y9q0Var = y9q0VarN;
                if (!z) {
                    xx7Var = xx7Var2;
                }
                v8q0.a(dlg0Var.c, s5x0.I(s5x0.L(new wkw(xx7Var), qmk.a(fetVar).e, 0.0f, 2), lh80VarU), 0L, null, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, y9q0Var, fetVar, 0, 0, 131068);
                fetVar2 = fetVar;
                fetVar2.r(false);
            } else {
                fetVar2 = fetVar;
                fetVar2.e0(2072497320);
                fetVar2.r(false);
            }
            fetVar2.r(true);
        } else {
            fetVar2 = fetVar;
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new wbg0((Object) dlg0Var, (Object) function2, mm40Var, i, (byte) 3);
        }
    }

    /* JADX WARN: Code duplicated, block: B:35:0x0073  */
    /* JADX WARN: Code duplicated, block: B:36:0x0076  */
    /* JADX WARN: Code duplicated, block: B:39:0x0081  */
    /* JADX WARN: Code duplicated, block: B:40:0x0084  */
    /* JADX WARN: Code duplicated, block: B:43:0x008f  */
    /* JADX WARN: Code duplicated, block: B:44:0x0092  */
    /* JADX WARN: Code duplicated, block: B:47:0x009d  */
    /* JADX WARN: Code duplicated, block: B:48:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:51:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:52:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:55:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:64:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:66:0x00da  */
    /* JADX WARN: Code duplicated, block: B:69:0x00ef A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:70:0x00f1 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:71:0x00f3 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:72:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:73:0x0117  */
    /* JADX WARN: Code duplicated, block: B:75:0x011f  */
    /* JADX WARN: Code duplicated, block: B:76:0x014d  */
    /* JADX WARN: Code duplicated, block: B:77:0x017a  */
    /* JADX WARN: Code duplicated, block: B:79:0x0182  */
    /* JADX WARN: Code duplicated, block: B:80:0x01af  */
    /* JADX WARN: Code duplicated, block: B:83:0x01e0  */
    /* JADX WARN: Code duplicated, block: B:86:0x01ea  */
    /* JADX WARN: Code duplicated, block: B:88:? A[RETURN, SYNTHETIC] */
    public static final void c(final mm40 mm40Var, final pz40 pz40Var, final udl0 udl0Var, final boolean z, xcz xczVar, final hh80 hh80Var, final Function1 function1, final Function1 function2, final xdr xdrVar, fet fetVar, final int i, final int i2) {
        int i3;
        xcz xczVarA;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        boolean z2;
        final xcz xczVar2;
        yfe0 yfe0VarU;
        xcz xczVar3;
        int iOrdinal;
        function1.getClass();
        function2.getClass();
        xdrVar.getClass();
        fetVar.g0(1501099356);
        if ((i & 6) == 0) {
            i3 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i9 = i3 | (fetVar.g(pz40Var) ? 32 : 16) | (fetVar.e(udl0Var.ordinal()) ? 256 : 128);
        if ((i & 3072) == 0) {
            i9 |= fetVar.h(z) ? 2048 : 1024;
        }
        if ((i2 & 16) == 0) {
            xczVarA = xczVar;
            int i10 = fetVar.g(xczVarA) ? 16384 : 8192;
            int i11 = i9 | i10;
            if (fetVar.g(hh80Var)) {
                i4 = 131072;
            } else {
                i4 = 65536;
            }
            int i12 = i11 | i4;
            if (fetVar.i(function1)) {
                i5 = 1048576;
            } else {
                i5 = 524288;
            }
            int i13 = i12 | i5;
            if (fetVar.i(function2)) {
                i6 = 8388608;
            } else {
                i6 = 4194304;
            }
            int i14 = i13 | i6;
            if (fetVar.i(xdrVar)) {
                i7 = 67108864;
            } else {
                i7 = 33554432;
            }
            i8 = i14 | i7;
            if ((38347923 & i8) != 38347922) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (fetVar.U(i8 & 1, z2)) {
                fetVar.Z();
                if ((i & 1) == 0 && !fetVar.B()) {
                    fetVar.X();
                    if ((i2 & 16) != 0) {
                        i8 &= -57345;
                    }
                } else if ((i2 & 16) != 0) {
                    xczVarA = ddz.a(0, 0, fetVar, 0, 3);
                    i8 &= -57345;
                }
                xczVar3 = xczVarA;
                fetVar.s();
                iOrdinal = udl0Var.ordinal();
                if (iOrdinal != 0) {
                    fetVar.e0(-552510982);
                    if (z) {
                        fetVar.e0(52045484);
                        int i15 = i8 & 126;
                        int i16 = i8 >> 6;
                        xvw.a(mm40Var, pz40Var, xczVar3, hh80Var, function1, function2, xdrVar, fetVar, i15 | (i16 & 896) | (i16 & 7168) | (i16 & 57344) | (i16 & 458752) | (i16 & 3670016));
                        fetVar.r(false);
                    } else {
                        fetVar.e0(52426598);
                        int i17 = i8 & 126;
                        int i18 = i8 >> 6;
                        zvw.f(mm40Var, pz40Var, xczVar3, hh80Var, function1, function2, xdrVar, fetVar, i17 | (i18 & 896) | (i18 & 7168) | (i18 & 57344) | (i18 & 458752) | (i18 & 3670016));
                        fetVar.r(false);
                    }
                    fetVar.r(false);
                } else if (iOrdinal != 1) {
                    fetVar.e0(-552484801);
                    int i19 = i8 & 126;
                    int i20 = i8 >> 6;
                    vvw.a(mm40Var, pz40Var, xczVar3, hh80Var, function1, function2, xdrVar, fetVar, i19 | (i20 & 896) | (i20 & 7168) | (i20 & 57344) | (i20 & 458752) | (i20 & 3670016));
                    fetVar.r(false);
                } else if (iOrdinal != 2) {
                    fetVar.e0(-552473312);
                    int i21 = i8 & 126;
                    int i22 = i8 >> 6;
                    cww.a(mm40Var, pz40Var, xczVar3, hh80Var, function1, function2, xdrVar, fetVar, i21 | (i22 & 896) | (i22 & 7168) | (i22 & 57344) | (i22 & 458752) | (i22 & 3670016));
                    fetVar.r(false);
                } else {
                    if (iOrdinal == 3) {
                        throw b1j.f(-552511644, fetVar, false);
                    }
                    fetVar.e0(-552461957);
                    int i23 = i8 & 126;
                    int i24 = i8 >> 6;
                    xww.b(mm40Var, pz40Var, xczVar3, hh80Var, function1, function2, xdrVar, fetVar, i23 | (i24 & 896) | (i24 & 7168) | (i24 & 57344) | (i24 & 458752) | (i24 & 3670016));
                    fetVar.r(false);
                }
                xczVar2 = xczVar3;
            } else {
                fetVar.X();
                xczVar2 = xczVarA;
            }
            yfe0VarU = fetVar.u();
            if (yfe0VarU != null) {
                yfe0VarU.d = new Function2() { // from class: a.ngx
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        fww.c(mm40Var, pz40Var, udl0Var, z, xczVar2, hh80Var, function1, function2, xdrVar, (fet) obj, x8x.L(i | 1), i2);
                        return Unit.f46060a;
                    }
                };
            }
        }
        xczVarA = xczVar;
        int i110 = i9 | i10;
        if (fetVar.g(hh80Var)) {
            i4 = 131072;
        } else {
            i4 = 65536;
        }
        int i111 = i110 | i4;
        if (fetVar.i(function1)) {
            i5 = 1048576;
        } else {
            i5 = 524288;
        }
        int i112 = i111 | i5;
        if (fetVar.i(function2)) {
            i6 = 8388608;
        } else {
            i6 = 4194304;
        }
        int i113 = i112 | i6;
        if (fetVar.i(xdrVar)) {
            i7 = 67108864;
        } else {
            i7 = 33554432;
        }
        i8 = i113 | i7;
        if ((38347923 & i8) != 38347922) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (fetVar.U(i8 & 1, z2)) {
            fetVar.Z();
            if ((i & 1) == 0) {
                if ((i2 & 16) != 0) {
                    xczVarA = ddz.a(0, 0, fetVar, 0, 3);
                    i8 &= -57345;
                }
            } else if ((i2 & 16) != 0) {
                xczVarA = ddz.a(0, 0, fetVar, 0, 3);
                i8 &= -57345;
            }
            xczVar3 = xczVarA;
            fetVar.s();
            iOrdinal = udl0Var.ordinal();
            if (iOrdinal != 0) {
                fetVar.e0(-552510982);
                if (z) {
                    fetVar.e0(52045484);
                    int i114 = i8 & 126;
                    int i115 = i8 >> 6;
                    xvw.a(mm40Var, pz40Var, xczVar3, hh80Var, function1, function2, xdrVar, fetVar, i114 | (i115 & 896) | (i115 & 7168) | (i115 & 57344) | (i115 & 458752) | (i115 & 3670016));
                    fetVar.r(false);
                } else {
                    fetVar.e0(52426598);
                    int i116 = i8 & 126;
                    int i117 = i8 >> 6;
                    zvw.f(mm40Var, pz40Var, xczVar3, hh80Var, function1, function2, xdrVar, fetVar, i116 | (i117 & 896) | (i117 & 7168) | (i117 & 57344) | (i117 & 458752) | (i117 & 3670016));
                    fetVar.r(false);
                }
                fetVar.r(false);
            } else if (iOrdinal != 1) {
                fetVar.e0(-552484801);
                int i118 = i8 & 126;
                int i25 = i8 >> 6;
                vvw.a(mm40Var, pz40Var, xczVar3, hh80Var, function1, function2, xdrVar, fetVar, i118 | (i25 & 896) | (i25 & 7168) | (i25 & 57344) | (i25 & 458752) | (i25 & 3670016));
                fetVar.r(false);
            } else if (iOrdinal != 2) {
                fetVar.e0(-552473312);
                int i26 = i8 & 126;
                int i27 = i8 >> 6;
                cww.a(mm40Var, pz40Var, xczVar3, hh80Var, function1, function2, xdrVar, fetVar, i26 | (i27 & 896) | (i27 & 7168) | (i27 & 57344) | (i27 & 458752) | (i27 & 3670016));
                fetVar.r(false);
            } else {
                if (iOrdinal == 3) {
                    throw b1j.f(-552511644, fetVar, false);
                }
                fetVar.e0(-552461957);
                int i28 = i8 & 126;
                int i29 = i8 >> 6;
                xww.b(mm40Var, pz40Var, xczVar3, hh80Var, function1, function2, xdrVar, fetVar, i28 | (i29 & 896) | (i29 & 7168) | (i29 & 57344) | (i29 & 458752) | (i29 & 3670016));
                fetVar.r(false);
            }
            xczVar2 = xczVar3;
        } else {
            fetVar.X();
            xczVar2 = xczVarA;
        }
        yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new Function2() { // from class: a.ngx
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    fww.c(mm40Var, pz40Var, udl0Var, z, xczVar2, hh80Var, function1, function2, xdrVar, (fet) obj, x8x.L(i | 1), i2);
                    return Unit.f46060a;
                }
            };
        }
    }

    public static final void d(mm40 mm40Var, oea0 oea0Var, l7m0 l7m0Var, Function1 function1, fet fetVar, int i) {
        mm40 mm40Var2;
        fet fetVar2 = fetVar;
        l7m0Var.getClass();
        fetVar2.g0(1689181774);
        int i2 = i | 6 | (fetVar2.g(oea0Var) ? 32 : 16) | (fetVar2.g(l7m0Var) ? 256 : 128) | (fetVar2.i(function1) ? 2048 : 1024);
        byte b = 0;
        if (fetVar2.U(i2 & 1, (i2 & 1171) != 1170)) {
            boolean z = oea0Var.e;
            boolean z2 = oea0Var.f;
            byte b2 = 14;
            l7m0 l7m0VarK0 = sac.k0(l7m0Var, z, fetVar2, (i2 >> 6) & 14);
            yx7 yx7Var = gqw0.k;
            zcl zclVar = qmk.f28987a;
            jm40 jm40Var = jm40.b;
            mm40 mm40VarN = epv0.N(o7k0.d(o7k0.e(jm40Var, 48.0f), 1.0f), z2 ? 0.6f : 1.0f);
            boolean z3 = !z2;
            boolean z4 = ((i2 & 112) == 32) | ((i2 & 7168) == 2048);
            Object objP = fetVar2.P();
            cl5 cl5Var = ukd.f35823a;
            if (z4 || objP == cl5Var) {
                objP = new jf00(function1, oea0Var, b);
                fetVar2.o0(objP);
            }
            mm40 mm40VarW = y860.W(mm40VarN, null, null, z3, null, (Function0) objP, 24);
            boolean zG = fetVar2.g(l7m0VarK0);
            Object objP2 = fetVar2.P();
            if (zG || objP2 == cl5Var) {
                objP2 = new ufp(l7m0VarK0, b2);
                fetVar2.o0(objP2);
            }
            mm40 mm40VarL = s5x0.L(rq8.K(mm40VarW, (Function1) objP2), 8.0f, 0.0f, 2);
            thg0 thg0VarA = shg0.a(uc9.f35418a, yx7Var, fetVar2, 48);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarL);
            mkd.c0.getClass();
            fetVar2.i0();
            if (fetVar2.S) {
                fetVar2.l(e7z.u1);
            } else {
                fetVar2.r0();
            }
            jpm0.o(fetVar2, thg0VarA, gqw0.x);
            jpm0.o(fetVar2, bh90VarM, gqw0.w);
            jpm0.o(fetVar2, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar2);
            jpm0.o(fetVar2, mm40VarC0, gqw0.v);
            c280 c280Var = oea0Var.b;
            boolean zG2 = fetVar2.g(c280Var);
            Object objP3 = fetVar2.P();
            if (zG2 || objP3 == cl5Var) {
                objP3 = new t6n(d4d.STATIC_WHITE60, w6n.h, c280Var);
                fetVar2.o0(objP3);
            }
            t6n t6nVar = (t6n) objP3;
            boolean zG3 = fetVar2.g(t6nVar);
            Object objP4 = fetVar2.P();
            if (zG3 || objP4 == cl5Var) {
                objP4 = new m2m(t6nVar, (byte) 2);
                fetVar2.o0(objP4);
            }
            kkb.p(1, fetVar2, null, (Function0) objP4);
            long jM123getWhite0d7_KjU = ((StaticColors) fetVar2.k(m8m0.f21378a)).m123getWhite0d7_KjU();
            mm40 mm40VarH = dw9.h(1.0f, s5x0.N(jm40Var, 6.0f, 0.0f, 0.0f, 0.0f, 14), true);
            String str = oea0Var.c;
            y9q0 y9q0Var = new y9q0(0L, qmk.q, null, j1t0.b, 0L, null, 0, 0, qmk.D, 16646045);
            boolean zF = fetVar2.f(jM123getWhite0d7_KjU);
            Object objP5 = fetVar2.P();
            if (zF || objP5 == cl5Var) {
                objP5 = new f15((byte) 10, jM123getWhite0d7_KjU);
                fetVar2.o0(objP5);
            }
            aad.e(str, mm40VarH, y9q0Var, null, 2, false, 3, 0, (n4d) objP5, new n05(idm0.t(8), idm0.t(12), idm0.t(1)), fetVar, 1597440, 168);
            fetVar2 = fetVar;
            if (oea0Var.d) {
                fetVar2.e0(-693952771);
                j6n.h(xsm0.s(R.string.bets_on_players_captain_tag_value, fetVar2), lso0.f20590a, o7k0.s(s5x0.N(jm40Var, 6.0f, 0.0f, 0.0f, 0.0f, 14), 16.0f), 0, 0, fetVar2, 48, 24);
                fetVar2.r(false);
            } else {
                fetVar2.e0(-693640136);
                fetVar2.r(false);
            }
            fetVar2.r(true);
            mm40Var2 = jm40Var;
        } else {
            fetVar2.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new cbr((byte) 17, i, (Object) mm40Var2, (Object) oea0Var, (Object) l7m0Var, (Object) function1);
        }
    }

    public static final void e(mm40 mm40Var, eao eaoVar, a4x a4xVar, qw3 qw3Var, xdr xdrVar, Function1 function1, Function1 function2, ugd ugdVar, fet fetVar, int i) {
        int i2;
        Object obj;
        Object obj2;
        eao eaoVar2 = eaoVar;
        fet fetVar2 = fetVar;
        a4xVar.getClass();
        xdrVar.getClass();
        function1.getClass();
        function2.getClass();
        fetVar2.g0(-353900060);
        if ((i & 6) == 0) {
            i2 = (fetVar2.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? fetVar2.g(eaoVar2) : fetVar2.i(eaoVar2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= (i & 512) == 0 ? fetVar2.g(a4xVar) : fetVar2.i(a4xVar) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= fetVar2.g(qw3Var) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            obj = xdrVar;
            i2 |= fetVar2.i(obj) ? 16384 : 8192;
        } else {
            obj = xdrVar;
        }
        if ((196608 & i) == 0) {
            i2 |= fetVar2.i(function1) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= fetVar2.i(function2) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            obj2 = ugdVar;
            i2 |= fetVar2.i(obj2) ? 8388608 : 4194304;
        } else {
            obj2 = ugdVar;
        }
        int i3 = i2;
        if (fetVar2.U(i3 & 1, (i3 & 4793491) != 4793490)) {
            byte b = 14;
            x5d x5dVarA = w5d.a(qw3Var, gqw0.m, fetVar2, (((i3 & 14) | ((i3 >> 6) & 112)) >> 3) & 14);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40Var);
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
            mm40 mm40VarD = o7k0.d(jm40.b, 1.0f);
            zcl zclVar = qmk.f28987a;
            eaoVar2 = eaoVar;
            jwb.p(mm40VarD, new qw3(8.0f, true, new jf4(b)), new qw3(8.0f, true, new jf4(b)), gqw0.k, 0, 0, u1c.M(280675305, new x2g((Object) a4xVar, obj, (Object) eaoVar, obj2, (byte) 22), fetVar2), fetVar, 1575942, 48);
            fetVar2 = fetVar;
            pz40 pz40VarF = androidx.compose.runtime.e.f(eaoVar2.g, fetVar2);
            qil0 qil0Var = eaoVar2.i;
            boolean z = (i3 & 458752) == 131072;
            Object objP = fetVar2.P();
            cl5 cl5Var = ukd.f35823a;
            if (z || objP == cl5Var) {
                objP = new lj00(function1, (byte) 13);
                fetVar2.o0(objP);
            }
            Function1 function3 = (Function1) objP;
            boolean z2 = (i3 & 3670016) == 1048576;
            Object objP2 = fetVar2.P();
            if (z2 || objP2 == cl5Var) {
                objP2 = new lj00(function2, b);
                fetVar2.o0(objP2);
            }
            vfc.q(null, pz40VarF, qil0Var, function3, (Function1) objP2, fetVar2, 0, 1);
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ff4(mm40Var, eaoVar2, a4xVar, qw3Var, xdrVar, function1, function2, ugdVar, i);
        }
    }

    public static final void f(mm40 mm40Var, l7m0 l7m0Var, Function1 function1, Function1 function2, fet fetVar, int i) {
        fet fetVar2;
        mm40 mm40Var2;
        l7m0Var.getClass();
        function1.getClass();
        function2.getClass();
        fetVar.g0(-1738844566);
        int i2 = i | 6;
        if ((i & 48) == 0) {
            i2 |= fetVar.g(l7m0Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.i(function1) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= fetVar.i(function2) ? 2048 : 1024;
        }
        byte b = 0;
        if (fetVar.U(i2 & 1, (i2 & 1171) != 1170)) {
            float f = xfn.a(fetVar).c;
            zqg zqgVar = (zqg) l7m0Var.getValue();
            boolean z = zqgVar instanceof xqg;
            jm40 jm40Var = jm40.b;
            if (z) {
                fetVar.e0(-317547839);
                mm40 mm40VarL = s5x0.L(jm40Var, f, 0.0f, 2);
                o5m o5mVar = ((xqg) zqgVar).f41317a;
                int i3 = (i2 & 896) ^ 384;
                boolean z2 = (i3 > 256 && fetVar.g(function1)) || (i2 & 384) == 256;
                Object objP = fetVar.P();
                cl5 cl5Var = ukd.f35823a;
                if (z2 || objP == cl5Var) {
                    objP = new lj00(function1, (byte) 27);
                    fetVar.o0(objP);
                }
                Function1 function3 = (Function1) objP;
                int i4 = (i2 & 7168) ^ 3072;
                boolean z3 = (i4 > 2048 && fetVar.g(function2)) || (i2 & 3072) == 2048;
                Object objP2 = fetVar.P();
                if (z3 || objP2 == cl5Var) {
                    objP2 = new ia30(function2, b);
                    fetVar.o0(objP2);
                }
                Function0 function0 = (Function0) objP2;
                boolean z4 = (i4 > 2048 && fetVar.g(function2)) || (i2 & 3072) == 2048;
                Object objP3 = fetVar.P();
                if (z4 || objP3 == cl5Var) {
                    objP3 = new ia30(function2, (byte) 1);
                    fetVar.o0(objP3);
                }
                Function0 function4 = (Function0) objP3;
                boolean z5 = (i4 > 2048 && fetVar.g(function2)) || (i2 & 3072) == 2048;
                Object objP4 = fetVar.P();
                if (z5 || objP4 == cl5Var) {
                    objP4 = new ia30(function2, (byte) 2);
                    fetVar.o0(objP4);
                }
                Function0 function5 = (Function0) objP4;
                boolean z6 = (i3 > 256 && fetVar.g(function1)) || (i2 & 384) == 256;
                Object objP5 = fetVar.P();
                if (z6 || objP5 == cl5Var) {
                    objP5 = new lj00(function1, (byte) 28);
                    fetVar.o0(objP5);
                }
                Function1 function6 = (Function1) objP5;
                mm40Var2 = jm40Var;
                j5m.a(mm40VarL, o5mVar, null, function3, function0, function4, function5, function6, null, fetVar, 0, 260);
                fetVar2 = fetVar;
                fetVar2.r(false);
            } else {
                fetVar2 = fetVar;
                mm40Var2 = jm40Var;
                if (!Intrinsics.d(zqgVar, yqg.f43074a)) {
                    throw b1j.f(-287340942, fetVar2, false);
                }
                fetVar2.e0(-287328114);
                fetVar2.r(false);
            }
        } else {
            fetVar2 = fetVar;
            fetVar2.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new vho((byte) 15, i, (Object) mm40Var2, (Object) l7m0Var, (Object) function1, (Object) function2);
        }
    }

    public static final void g(h2h0 h2h0Var, gf50 gf50Var, Function0 function0, Function0 function1, fet fetVar, int i) {
        int i2;
        Function0 function2;
        Function0 function3;
        fetVar.g0(-1784101165);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(h2h0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.g(gf50Var) ? 32 : 16;
        }
        int i3 = i2 | 384;
        if ((i & 3072) == 0) {
            i3 |= fetVar.i(function1) ? 2048 : 1024;
        }
        if (fetVar.U(i3 & 1, (i3 & 1171) != 1170)) {
            fetVar.Z();
            int i4 = i & 1;
            cl5 cl5Var = ukd.f35823a;
            if (i4 == 0 || fetVar.B()) {
                Object objP = fetVar.P();
                if (objP == cl5Var) {
                    objP = new ec40((byte) 27);
                    fetVar.o0(objP);
                }
                function3 = (Function0) objP;
            } else {
                fetVar.X();
                function3 = function0;
            }
            fetVar.s();
            boolean z = !h2h0Var.c.a().isEmpty();
            boolean z2 = ((i3 & 14) == 4) | ((i3 & 7168) == 2048);
            Object objP2 = fetVar.P();
            if (z2 || objP2 == cl5Var) {
                objP2 = new a540((Object) h2h0Var, (Object) function1, (byte) 7);
                fetVar.o0(objP2);
            }
            cww.e(gf50Var, z, function3, (Function0) objP2, fetVar, ((i3 >> 3) & 14) | (i3 & 896));
            function2 = function3;
        } else {
            fetVar.X();
            function2 = function0;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new vho((byte) 17, i, (Object) h2h0Var, (Object) gf50Var, (Object) function2, (Object) function1);
        }
    }

    public static final void h(mm40 mm40Var, mc90 mc90Var, fet fetVar, int i) {
        mc90 mc90Var2;
        fet fetVar2;
        mc90Var.getClass();
        fetVar.g0(-215800050);
        int i2 = i | 6 | (fetVar.g(mc90Var) ? 32 : 16);
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            Object objP = fetVar.P();
            if (objP == ukd.f35823a) {
                objP = new ev80((byte) 21);
                fetVar.o0(objP);
            }
            jm40 jm40Var = jm40.b;
            mc90Var2 = mc90Var;
            fetVar2 = fetVar;
            ay3.f(mc90Var2, jm40Var, (Function1) objP, null, null, null, j120.e, fetVar2, ((i2 >> 3) & 14) | 1573296, 56);
            mm40Var = jm40Var;
        } else {
            mc90Var2 = mc90Var;
            fetVar2 = fetVar;
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new xd80(mm40Var, mc90Var2, i, (byte) 13);
        }
    }

    public static final void i(mm40 mm40Var, rqm rqmVar, Function0 function0, fet fetVar, int i) {
        mm40 mm40Var2;
        function0.getClass();
        fetVar.g0(-458974279);
        int i2 = i | 6 | (fetVar.g(rqmVar) ? 32 : 16) | (fetVar.i(function0) ? 256 : 128);
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            jm40 jm40Var = jm40.b;
            mm40 mm40VarH = phu0.H(o7k0.d(jm40Var, 1.0f), null, 1);
            boolean z = (i2 & 896) == 256;
            Object objP = fetVar.P();
            if (z || objP == ukd.f35823a) {
                objP = new l3c0(function0, (byte) 6);
                fetVar.o0(objP);
            }
            obc.q(mm40VarH, rqmVar, false, null, (Function0) objP, null, null, null, fetVar, i2 & 112, 236);
            mm40Var2 = jm40Var;
        } else {
            fetVar.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new rwc0(mm40Var2, rqmVar, function0, i, (byte) 9);
        }
    }

    public static final void j(elg0 elg0Var, Function2 function2, mm40 mm40Var, fet fetVar, int i) {
        int i2;
        fet fetVar2;
        int i3;
        int i4;
        boolean z;
        fet fetVar3 = fetVar;
        elg0Var.getClass();
        function2.getClass();
        fetVar3.g0(-284392812);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? fetVar3.g(elg0Var) : fetVar3.i(elg0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar3.i(function2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar3.g(mm40Var) ? 256 : 128;
        }
        if (fetVar3.U(i2 & 1, (i2 & 147) != 146)) {
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarL = s5x0.L(mm40Var, qmk.a(fetVar3).e, 0.0f, 2);
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar3, 0);
            int iHashCode = Long.hashCode(fetVar3.T);
            bh90 bh90VarM = fetVar3.m();
            mm40 mm40VarC0 = kbc.c0(fetVar3, mm40VarL);
            mkd.c0.getClass();
            fetVar3.i0();
            if (fetVar3.S) {
                fetVar3.l(e7z.u1);
            } else {
                fetVar3.r0();
            }
            jpm0.o(fetVar3, x5dVarA, gqw0.x);
            jpm0.o(fetVar3, bh90VarM, gqw0.w);
            jpm0.o(fetVar3, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar3);
            jpm0.o(fetVar3, mm40VarC0, gqw0.v);
            int length = elg0Var.f7996a.length();
            int i5 = i2;
            jm40 jm40Var = jm40.b;
            if (length > 0) {
                fetVar3.e0(1953666816);
                String str = elg0Var.f7996a;
                y9q0 y9q0VarN = ibm0.n(new y9q0(0L, qmk.s, null, j1t0.c, 0L, null, 0, 0, qmk.G, 16646109), fetVar3);
                i3 = i5;
                i4 = 32;
                z = false;
                v8q0.a(str, jm40Var, 0L, null, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, y9q0VarN, fetVar3, 48, 0, 131068);
                fetVar2 = fetVar3;
                fetVar2.r(false);
            } else {
                fetVar2 = fetVar3;
                i3 = i5;
                i4 = 32;
                z = false;
                fetVar2.e0(1953822808);
                fetVar2.r(false);
            }
            if (elg0Var.e) {
                fetVar2.e0(1953883723);
                mm40 mm40VarE = o7k0.e(jm40Var, 32.0f);
                Unit unit = Unit.f46060a;
                boolean z2 = (((i3 & 14) == 4 || ((i3 & 8) != 0 && fetVar2.i(elg0Var))) ? true : z) | ((i3 & 112) == i4 ? true : z);
                Object objP = fetVar2.P();
                if (z2 || objP == ukd.f35823a) {
                    objP = new wme(function2, elg0Var, (byte) 2);
                    fetVar2.o0(objP);
                }
                fet fetVar4 = fetVar2;
                v8q0.a(elg0Var.b, s5x0.L(fnn0.a(mm40VarE, unit, (PointerInputEventHandler) objP), 0.0f, 6.0f, 1), 0L, null, 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, ibm0.l(new y9q0(0L, qmk.s, null, j1t0.b, 0L, null, 0, 0, qmk.G, 16646109), fetVar2), fetVar4, 0, 24960, 110588);
                fetVar3 = fetVar4;
                fetVar3.r(z);
            } else {
                fetVar3 = fetVar2;
                fetVar3.e0(1954398168);
                fetVar3.r(z);
            }
            fetVar3.r(true);
        } else {
            fetVar3.X();
        }
        yfe0 yfe0VarU = fetVar3.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new wbg0((Object) elg0Var, (Object) function2, mm40Var, i, (byte) 4);
        }
    }

    public static final void k(glg0 glg0Var, Function2 function2, mm40 mm40Var, fet fetVar, int i) {
        glg0Var.getClass();
        function2.getClass();
        fetVar.g0(1372682023);
        int i2 = (fetVar.g(glg0Var) ? 4 : 2) | i | (fetVar.i(function2) ? 32 : 16);
        if (!fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            fetVar.X();
        } else if (glg0Var instanceof dlg0) {
            fetVar.e0(592469985);
            b((dlg0) glg0Var, function2, mm40Var, fetVar, i2 & 1022);
            fetVar.r(false);
        } else if (glg0Var instanceof elg0) {
            fetVar.e0(592475007);
            j((elg0) glg0Var, function2, mm40Var, fetVar, i2 & 1022);
            fetVar.r(false);
        } else {
            if (!(glg0Var instanceof flg0)) {
                throw b1j.f(592468683, fetVar, false);
            }
            fetVar.e0(592479961);
            q((flg0) glg0Var, mm40Var, fetVar, (i2 & 14) | 48);
            fetVar.r(false);
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new rwc0(glg0Var, function2, mm40Var, i, (byte) 25);
        }
    }

    public static final void l(mm40 mm40Var, xdr xdrVar, ugd ugdVar, fet fetVar, int i, int i2) {
        int i3;
        xdr xdrVar2;
        fetVar.g0(-852799889);
        int i4 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        int i5 = i2 & 2;
        if (i5 != 0) {
            i3 = i4 | 48;
        } else {
            i3 = i4 | (fetVar.i(xdrVar) ? 32 : 16);
        }
        int i6 = i3 | 3072;
        if (fetVar.U(i6 & 1, (i6 & 1171) != 1170)) {
            xdr xdrVar3 = i5 != 0 ? null : xdrVar;
            thg0 thg0VarA = shg0.a(uc9.f35418a, gqw0.k, fetVar, 48);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40Var);
            mkd.c0.getClass();
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(e7z.u1);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, thg0VarA, gqw0.x);
            jpm0.o(fetVar, bh90VarM, gqw0.w);
            jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar);
            jpm0.o(fetVar, mm40VarC0, gqw0.v);
            zhg0 zhg0Var = zhg0.f44392a;
            if (xdrVar3 == null) {
                fetVar.e0(1086617538);
            } else {
                fetVar.e0(450694175);
                xdrVar3.F(zhg0Var, fetVar, Integer.valueOf((i6 & 112) | 6));
            }
            fetVar.r(false);
            ugdVar.F(zhg0Var, fetVar, 54);
            fetVar.e0(1086684994);
            fetVar.r(false);
            fetVar.r(true);
            xdrVar2 = xdrVar3;
        } else {
            fetVar.X();
            xdrVar2 = xdrVar;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new l51(mm40Var, (Object) xdrVar2, (Object) ugdVar, i, i2, (byte) 14);
        }
    }

    public static final void m(mm40 mm40Var, t0i0 t0i0Var, Function1 function1, fet fetVar, int i) {
        mm40 mm40Var2;
        t0i0Var.getClass();
        long j = t0i0Var.b;
        function1.getClass();
        fetVar.g0(-1056099074);
        int i2 = i | 6 | (fetVar.g(t0i0Var) ? 32 : 16) | (fetVar.i(function1) ? 256 : 128);
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            wfn wfnVarA = xfn.a(fetVar);
            pz40 pz40VarF = androidx.compose.runtime.e.f(function1, fetVar);
            Object objP = fetVar.P();
            Object obj = ukd.f35823a;
            if (objP == obj) {
                objP = new ryc0(pz40VarF, (byte) 13);
                fetVar.o0(objP);
            }
            Function1 function2 = (Function1) objP;
            ThemeColors themeColors = (ThemeColors) fetVar.k(zaq0.b);
            String strW = rsm0.w(R.string.now_points_available, 0, fetVar);
            boolean zF = fetVar.f(j) | fetVar.g(themeColors);
            Object objP2 = fetVar.P();
            if (zF || objP2 == obj) {
                objP2 = new rqm((vui0) new tui0(strW, new y3d(themeColors.getTextPrimary())), (pui0) new nui0(Integer.valueOf(R.drawable.ic_glyph_money), null, new m0x(R.drawable.ic_glyph_money, null, 6), new y3d(themeColors.getPrimary()), null, new pc5(new y3d(themeColors.getBackground())), 0.0f, 210), (pvi0) new mvi0(String.valueOf(j), new y3d(themeColors.getTextPrimary())), (d4d) null, (tvi0) null, (wui0) null, false, (e900) null, Response.SERVER_TIMEOUT);
                fetVar.o0(objP2);
            }
            rqm rqmVar = (rqm) objP2;
            float f = wfnVarA.d;
            jm40 jm40Var = jm40.b;
            mm40 mm40VarL = s5x0.L(jm40Var, f, 0.0f, 2);
            boolean zG = fetVar.g(rqmVar) | ((i2 & 112) == 32) | ((i2 & 896) == 256);
            Object objP3 = fetVar.P();
            if (zG || objP3 == obj) {
                objP3 = new l0i0(t0i0Var, function1, rqmVar, function2);
                fetVar.o0(objP3);
            }
            mm40Var2 = jm40Var;
            b8k0.e(mm40VarL, null, null, null, null, null, false, null, (Function1) objP3, fetVar, 0, 510);
        } else {
            fetVar.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new rwc0(mm40Var2, t0i0Var, function1, i, (byte) 28);
        }
    }

    public static final void n(mm40 mm40Var, e0k0 e0k0Var, Function1 function1, fet fetVar, int i) {
        function1.getClass();
        fetVar.g0(-1999548619);
        int i2 = i | (fetVar.g(mm40Var) ? 4 : 2) | (fetVar.g(e0k0Var) ? 32 : 16) | (fetVar.i(function1) ? 256 : 128);
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            b34.h(e0k0Var != null, mm40Var, kzn.d(null, 0.0f, 3), kzn.e(null, 3), null, u1c.M(1719571293, new in80(e0k0Var, function1, (byte) 26), fetVar), fetVar, ((i2 << 3) & 112) | 200064, 16);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new fzi0(mm40Var, (Object) e0k0Var, function1, i, (byte) 20);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    public static final void o(mm40 mm40Var, kal0 kal0Var, fet fetVar, int i) {
        mm40 mm40Var2;
        fet fetVar2;
        int i2;
        jm40 jm40Var;
        int i3;
        boolean z;
        int i4;
        fet fetVar3;
        float f;
        fet fetVar4;
        fet fetVar5;
        fet fetVar6;
        ?? r0;
        fet fetVar7 = fetVar;
        fetVar7.g0(-952423703);
        int i5 = i | (fetVar7.g(mm40Var) ? 4 : 2) | (fetVar7.g(kal0Var) ? 32 : 16);
        if (fetVar7.U(i5 & 1, (i5 & 19) != 18)) {
            Unit unit = null;
            if (kal0Var == null) {
                fetVar7.e0(-1100343933);
                fetVar7.r(false);
                r0 = 0;
                fetVar6 = fetVar7;
            } else {
                int i6 = kal0Var.c;
                int i7 = kal0Var.b;
                int i8 = kal0Var.f17970a;
                fetVar7.e0(-1100343932);
                thg0 thg0VarA = shg0.a(uc9.e, gqw0.k, fetVar7, 54);
                int iHashCode = Long.hashCode(fetVar7.T);
                bh90 bh90VarM = fetVar7.m();
                mm40 mm40VarC0 = kbc.c0(fetVar7, mm40Var);
                mkd.c0.getClass();
                fetVar7.i0();
                if (fetVar7.S) {
                    fetVar7.l(e7z.u1);
                } else {
                    fetVar7.r0();
                }
                jpm0.o(fetVar7, thg0VarA, gqw0.x);
                jpm0.o(fetVar7, bh90VarM, gqw0.w);
                jpm0.o(fetVar7, Integer.valueOf(iHashCode), gqw0.y);
                jpm0.n(fetVar7);
                jpm0.o(fetVar7, mm40VarC0, gqw0.v);
                jm40 jm40Var2 = jm40.b;
                if (i8 > 0) {
                    fetVar7.e0(-280564441);
                    zcl zclVar = qmk.f28987a;
                    i2 = i7;
                    j0x.b(iom0.r(jpm0.t(R.drawable.ic_game_red_card, 6, fetVar7), fetVar7), null, o7k0.n(jm40Var2, 12.0f), null, null, 0.0f, null, fetVar7, 56, 120);
                    i4 = i6;
                    jm40Var = jm40Var2;
                    z = false;
                    i3 = 3;
                    v8q0.a(String.valueOf(i8), s5x0.N(o7k0.A(jm40Var2, null, 3), 4.0f, 0.0f, 0.0f, 0.0f, 14), ((StaticColors) fetVar7.k(m8m0.f21378a)).m123getWhite0d7_KjU(), null, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, new y9q0(0L, qmk.q, null, j1t0.b, 0L, null, 0, 0, qmk.D, 16646045), fetVar, 0, 0, 131064);
                    fet fetVar8 = fetVar;
                    fetVar8.r(false);
                    fetVar3 = fetVar8;
                } else {
                    i2 = i7;
                    jm40Var = jm40Var2;
                    i3 = 3;
                    z = false;
                    i4 = i6;
                    fetVar7.e0(-279925376);
                    fetVar7.r(false);
                    fetVar3 = fetVar7;
                }
                if (i2 > 0) {
                    fetVar3.e0(-279868336);
                    zcl zclVar2 = qmk.f28987a;
                    jm40 jm40Var3 = jm40Var;
                    j0x.b(iom0.r(jpm0.t(R.drawable.ic_game_yellow_card, 6, fetVar3), fetVar3), null, o7k0.n(s5x0.N(jm40Var3, 4.0f, 0.0f, 0.0f, 0.0f, 14), 12.0f), null, null, 0.0f, null, fetVar3, 56, 120);
                    jm40Var = jm40Var3;
                    f = 12.0f;
                    v8q0.a(String.valueOf(i2), s5x0.N(o7k0.A(jm40Var3, null, i3), 4.0f, 0.0f, 0.0f, 0.0f, 14), ((StaticColors) fetVar3.k(m8m0.f21378a)).m123getWhite0d7_KjU(), null, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, new y9q0(0L, qmk.q, null, j1t0.b, 0L, null, 0, 0, qmk.D, 16646045), fetVar, 0, 0, 131064);
                    fet fetVar9 = fetVar;
                    fetVar9.r(z);
                    fetVar4 = fetVar9;
                } else {
                    f = 12.0f;
                    fetVar3.e0(-279145664);
                    fetVar3.r(z);
                    fetVar4 = fetVar3;
                }
                if (i4 > 0) {
                    fetVar4.e0(-279092747);
                    zcl zclVar3 = qmk.f28987a;
                    jm40 jm40Var4 = jm40Var;
                    j0x.b(iom0.r(jpm0.t(R.drawable.ic_game_cornerkick, 6, fetVar4), fetVar4), null, o7k0.n(s5x0.N(jm40Var4, 4.0f, 0.0f, 0.0f, 0.0f, 14), f), null, null, 0.0f, null, fetVar4, 56, 120);
                    v8q0.a(String.valueOf(i4), s5x0.N(o7k0.A(jm40Var4, null, 3), 4.0f, 0.0f, 0.0f, 0.0f, 14), ((StaticColors) fetVar4.k(m8m0.f21378a)).m123getWhite0d7_KjU(), null, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, new y9q0(0L, qmk.q, null, j1t0.b, 0L, null, 0, 0, qmk.D, 16646045), fetVar, 0, 0, 131064);
                    fet fetVar10 = fetVar;
                    fetVar10.r(z);
                    fetVar5 = fetVar10;
                } else {
                    fetVar4.e0(-278374880);
                    fetVar4.r(z);
                    fetVar5 = fetVar4;
                }
                fetVar5.r(true);
                fetVar5.r(z);
                unit = Unit.f46060a;
                r0 = z;
                fetVar6 = fetVar5;
            }
            if (unit == null) {
                fetVar6.e0(-1097980585);
                zcl zclVar4 = qmk.f28987a;
                mm40Var2 = mm40Var;
                zq8.a(r0, fetVar6, o7k0.e(mm40Var2, 14.0f));
                fetVar6.r(r0);
                fetVar2 = fetVar6;
            } else {
                mm40Var2 = mm40Var;
                fetVar6.e0(-451137171);
                fetVar6.r(r0);
                fetVar2 = fetVar6;
            }
        } else {
            mm40Var2 = mm40Var;
            fetVar7.X();
            fetVar2 = fetVar7;
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new a5k0(mm40Var2, kal0Var, i, (byte) 19);
        }
    }

    public static final void p(mm40 mm40Var, ugd ugdVar, xdr xdrVar, xdr xdrVar2, ugd ugdVar2, ugd ugdVar3, fet fetVar, int i) {
        int i2;
        xdr xdrVar3;
        ugd ugdVar4;
        float f;
        Integer num;
        boolean z;
        xdr xdrVar4 = xdrVar2;
        ugd ugdVar5 = ugdVar3;
        fetVar.g0(-1923011579);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.i(ugdVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.i(xdrVar) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= fetVar.i(xdrVar4) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= fetVar.i(ugdVar2) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= fetVar.i(ugdVar5) ? 131072 : 65536;
        }
        if (fetVar.U(i2 & 1, (74899 & i2) != 74898)) {
            Object objP = fetVar.P();
            Object obj = ukd.f35823a;
            if (objP == obj) {
                zcl zclVar = qmk.f28987a;
                objP = twn.j(2.0f, fetVar);
            }
            float f2 = ((ycl) objP).f42389a;
            Object objP2 = fetVar.P();
            if (objP2 == obj) {
                zcl zclVar2 = qmk.f28987a;
                objP2 = twn.j(4.0f, fetVar);
            }
            float f3 = ((ycl) objP2).f42389a;
            Object objP3 = fetVar.P();
            if (objP3 == obj) {
                zcl zclVar3 = qmk.f28987a;
                objP3 = twn.j(12.0f, fetVar);
            }
            float f4 = ((ycl) objP3).f42389a;
            Object objP4 = fetVar.P();
            if (objP4 == obj) {
                zcl zclVar4 = qmk.f28987a;
                objP4 = twn.j(28.0f, fetVar);
            }
            float f5 = ((ycl) objP4).f42389a;
            Object objP5 = fetVar.P();
            if (objP5 == obj) {
                objP5 = gqw0.n;
                fetVar.o0(objP5);
            }
            xx7 xx7Var = (xx7) objP5;
            Object objP6 = fetVar.P();
            if (objP6 == obj) {
                objP6 = new qw3(f3, true, new jf4((byte) 14));
                fetVar.o0(objP6);
            }
            pw3 pw3Var = (pw3) objP6;
            pz40 pz40VarZ = v3c.Z(null, new Object[0], fetVar);
            zcl zclVar5 = qmk.f28987a;
            pz40 pz40VarZ2 = v3c.Z(new ycl(96.0f), new Object[0], fetVar);
            Object[] objArr = new Object[0];
            Object objP7 = fetVar.P();
            if (objP7 == obj) {
                objP7 = new ttl0(f2, f5, (byte) 0);
                fetVar.o0(objP7);
            }
            l7m0 l7m0VarY = v3c.Y(objArr, (Function0) objP7, fetVar);
            boolean zG = fetVar.g(pz40VarZ) | fetVar.g(pz40VarZ2);
            Object objP8 = fetVar.P();
            if (zG || objP8 == obj) {
                objP8 = new wtl0(f4, pz40VarZ, pz40VarZ2, (byte) 1);
                fetVar.o0(objP8);
            }
            tj30 tj30Var = (tj30) objP8;
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40Var);
            mkd.c0.getClass();
            fetVar.i0();
            boolean z2 = fetVar.S;
            Function0 function0 = e7z.u1;
            if (z2) {
                fetVar.l(function0);
            } else {
                fetVar.r0();
            }
            shd shdVar = gqw0.x;
            jpm0.o(fetVar, tj30Var, shdVar);
            shd shdVar2 = gqw0.w;
            jpm0.o(fetVar, bh90VarM, shdVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            shd shdVar3 = gqw0.y;
            jpm0.o(fetVar, numValueOf, shdVar3);
            jpm0.n(fetVar);
            shd shdVar4 = gqw0.v;
            jpm0.o(fetVar, mm40VarC0, shdVar4);
            jm40 jm40Var = jm40.b;
            mm40 mm40VarS = o7k0.s(mrv.k0(jm40Var, "INNING_CONTENT_ID"), f4);
            x5d x5dVarA = w5d.a(pw3Var, xx7Var, fetVar, 54);
            int iHashCode2 = Long.hashCode(fetVar.T);
            bh90 bh90VarM2 = fetVar.m();
            mm40 mm40VarC1 = kbc.c0(fetVar, mm40VarS);
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(function0);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, x5dVarA, shdVar);
            jpm0.o(fetVar, bh90VarM2, shdVar2);
            vqd.u(iHashCode2, fetVar, shdVar3, fetVar);
            jpm0.o(fetVar, mm40VarC1, shdVar4);
            y5d y5dVar = y5d.f42040a;
            vqd.t(6 | (i2 & 112), ugdVar, y5dVar, fetVar, true);
            if (xdrVar2 == null) {
                fetVar.e0(1997133703);
                z = false;
                fetVar.r(false);
                xdrVar4 = xdrVar2;
                f = f2;
                num = 6;
            } else {
                fetVar.e0(1997133704);
                f = f2;
                mm40 mm40VarS2 = o7k0.s(s5x0.L(mrv.k0(jm40Var, "POINTS_CONTENT_ID"), f, 0.0f, 2), f5);
                x5d x5dVarA2 = w5d.a(pw3Var, xx7Var, fetVar, 54);
                int iHashCode3 = Long.hashCode(fetVar.T);
                bh90 bh90VarM3 = fetVar.m();
                mm40 mm40VarC2 = kbc.c0(fetVar, mm40VarS2);
                fetVar.i0();
                if (fetVar.S) {
                    fetVar.l(function0);
                } else {
                    fetVar.r0();
                }
                jpm0.o(fetVar, x5dVarA2, shdVar);
                jpm0.o(fetVar, bh90VarM3, shdVar2);
                vqd.u(iHashCode3, fetVar, shdVar3, fetVar);
                jpm0.o(fetVar, mm40VarC2, shdVar4);
                xdrVar4 = xdrVar2;
                num = 6;
                xdrVar4.F(y5dVar, fetVar, 6);
                fetVar.r(true);
                z = false;
                fetVar.r(false);
            }
            if (xdrVar == null) {
                fetVar.e0(1997616745);
                fetVar.r(z);
                xdrVar3 = xdrVar;
            } else {
                fetVar.e0(1997616746);
                mm40 mm40VarS3 = o7k0.s(s5x0.L(mrv.k0(jm40Var, "GAME_CONTENT_ID"), f, 0.0f, 2), f5);
                x5d x5dVarA3 = w5d.a(pw3Var, xx7Var, fetVar, 54);
                int iHashCode4 = Long.hashCode(fetVar.T);
                bh90 bh90VarM4 = fetVar.m();
                mm40 mm40VarC3 = kbc.c0(fetVar, mm40VarS3);
                fetVar.i0();
                if (fetVar.S) {
                    fetVar.l(function0);
                } else {
                    fetVar.r0();
                }
                jpm0.o(fetVar, x5dVarA3, shdVar);
                jpm0.o(fetVar, bh90VarM4, shdVar2);
                vqd.u(iHashCode4, fetVar, shdVar3, fetVar);
                jpm0.o(fetVar, mm40VarC3, shdVar4);
                xdrVar3 = xdrVar;
                xdrVar3.F(y5dVar, fetVar, num);
                fetVar.r(true);
                fetVar.r(false);
            }
            ugdVar4 = ugdVar2;
            ugdVar4.F(mrv.k0(jm40Var, "PERIOD_CONTENT_ID"), fetVar, Integer.valueOf(((i2 >> 9) & 112) | 6));
            mm40 mm40Var2 = (mm40) l7m0VarY.getValue();
            x5d x5dVarA4 = w5d.a(pw3Var, xx7Var, fetVar, 54);
            int iHashCode5 = Long.hashCode(fetVar.T);
            bh90 bh90VarM5 = fetVar.m();
            mm40 mm40VarC4 = kbc.c0(fetVar, mm40Var2);
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(function0);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, x5dVarA4, shdVar);
            jpm0.o(fetVar, bh90VarM5, shdVar2);
            vqd.u(iHashCode5, fetVar, shdVar3, fetVar);
            jpm0.o(fetVar, mm40VarC4, shdVar4);
            ugdVar5 = ugdVar3;
            vqd.t(6 | ((i2 >> 12) & 112), ugdVar5, y5dVar, fetVar, true);
            fetVar.r(true);
        } else {
            xdrVar3 = xdrVar;
            ugdVar4 = ugdVar2;
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new utl0(mm40Var, ugdVar, xdrVar3, xdrVar4, ugdVar4, ugdVar5, i, (byte) 0);
        }
    }

    public static final void q(flg0 flg0Var, mm40 mm40Var, fet fetVar, int i) {
        int i2;
        lh80 lh80VarU;
        y9q0 y9q0VarT;
        flg0Var.getClass();
        png0 png0Var = flg0Var.b;
        fetVar.g0(-485910510);
        if ((i & 6) == 0) {
            i2 = i | ((i & 8) == 0 ? fetVar.g(flg0Var) : fetVar.i(flg0Var) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.g(mm40Var) ? 32 : 16;
        }
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            int iOrdinal = png0Var.ordinal();
            if (iOrdinal == 0) {
                zcl zclVar = qmk.f28987a;
                lh80VarU = s5x0.u(0.0f, 16.0f, 0.0f, 0.0f, 5);
            } else if (iOrdinal == 1) {
                zcl zclVar2 = qmk.f28987a;
                lh80VarU = s5x0.u(0.0f, 12.0f, 0.0f, 0.0f, 5);
            } else if (iOrdinal != 2) {
                t9f.b();
                return;
            } else {
                zcl zclVar3 = qmk.f28987a;
                lh80VarU = s5x0.u(0.0f, 8.0f, 0.0f, 2.0f, 5);
            }
            mm40 mm40VarI = s5x0.I(s5x0.L(mm40Var, qmk.a(fetVar).e, 0.0f, 2), lh80VarU);
            String str = flg0Var.f9736a;
            int iOrdinal2 = png0Var.ordinal();
            if (iOrdinal2 == 0) {
                fetVar.e0(1191460797);
                y9q0VarT = ibm0.t(new y9q0(0L, qmk.u, null, j1t0.b, 0L, null, 0, 0, qmk.H, 16646109), fetVar);
                fetVar.r(false);
            } else {
                if (iOrdinal2 != 1 && iOrdinal2 != 2) {
                    throw b1j.f(1191458248, fetVar, false);
                }
                fetVar.e0(1191464283);
                y9q0VarT = ibm0.n(new y9q0(0L, qmk.s, null, j1t0.c, 0L, null, 0, 0, qmk.G, 16646109), fetVar);
                fetVar.r(false);
            }
            v8q0.a(str, mm40VarI, 0L, null, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, y9q0VarT, fetVar, 0, 0, 131068);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new o680((byte) 23, i, mm40Var, (Object) flg0Var);
        }
    }

    public static final void r(lc00 lc00Var, y3h y3hVar, o4i0 o4i0Var, ctf0 ctf0Var, List list) {
        Object obj;
        Object next;
        y3hVar.getClass();
        ctf0Var.getClass();
        list.getClass();
        List list2 = y3hVar.c;
        String str = y3hVar.e;
        String str2 = y3hVar.f41953a;
        ArrayList arrayListE = E(list2);
        ArrayList arrayListE2 = E(y3hVar.g);
        if (arrayListE.isEmpty() || arrayListE2.isEmpty() || CollectionsKt.q0(arrayListE, arrayListE2).size() != 10 || str2.length() == 0 || str.length() == 0) {
            return;
        }
        String strA = A(o4i0Var.f24637a, arrayListE);
        String strA2 = A(o4i0Var.b, arrayListE2);
        ArrayList arrayListQ0 = CollectionsKt.q0(arrayListE, arrayListE2);
        if (strA.length() == 0 || strA2.length() == 0) {
            return;
        }
        lc00Var.add(new psv("PLAYERS_COMPOSITION_HEADER", R.string.composition));
        String strK = y3hVar.b;
        if (strK.length() == 0) {
            strK = zsm0.k(str2, list, iun.f15405a);
        }
        gfa0 gfa0Var = new gfa0(str2, vsm0.t(strK), "");
        String strK2 = y3hVar.f;
        if (strK2.length() == 0) {
            strK2 = zsm0.k(str, list, iun.f15405a);
        }
        gfa0 gfa0Var2 = new gfa0(str, vsm0.t(strK2), "");
        i4 i4VarW = xvw.w(strA, arrayListE);
        i4 i4VarW2 = xvw.w(strA2, arrayListE2);
        Iterator it = arrayListQ0.iterator();
        do {
            obj = null;
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!((c4h) next).f3725a.equals(strA));
        c4h c4hVar = (c4h) next;
        if (c4hVar == null) {
            c4hVar = new c4h("", "", "", "", 0.0f, 0.0f, 0.0f, 0, 0, iun.f15405a);
        }
        for (Object obj2 : arrayListQ0) {
            if (((c4h) obj2).f3725a.equals(strA2)) {
                obj = obj2;
                break;
            }
        }
        c4h c4hVar2 = (c4h) obj;
        if (c4hVar2 == null) {
            c4hVar2 = new c4h("", "", "", "", 0.0f, 0.0f, 0.0f, 0, 0, iun.f15405a);
        }
        dfa0 dfa0VarC = tfx.C(c4hVar, c4hVar2);
        dfa0 dfa0VarC2 = tfx.C(c4hVar2, c4hVar);
        lsm0 lsm0Var = ctf0Var.b;
        lc00Var.add(new ifa0("PLAYERS_COMPOSITION", gfa0Var, gfa0Var2, i4VarW, i4VarW2, new efa0(dfa0VarC, dfa0VarC2, dyb.g0(uvw.u(lsm0Var.a(R.string.cyber_kda, Arrays.copyOf(new Object[0], 0))), uvw.u(lsm0Var.a(R.string.lol_composition_dpm, Arrays.copyOf(new Object[0], 0))), uvw.u(lsm0Var.a(R.string.lol_composition_gpm, Arrays.copyOf(new Object[0], 0)))), lsm0Var.a(R.string.statistic, Arrays.copyOf(new Object[0], 0)))));
    }

    public static Object s(u910 u910Var, fa10 fa10Var, int i, float f, float f2, bnn0 bnn0Var, int i2) {
        ea10 ea10Var = ea10.f7448a;
        int iE = u910Var.e();
        boolean zBooleanValue = (i2 & 8) != 0 ? ((Boolean) ((hgk0) u910Var.d).getValue()).booleanValue() : false;
        if ((i2 & 32) != 0) {
            u910Var.b();
        }
        Object objA = g050.a(u910Var.n, new q910(u910Var, iE, i, zBooleanValue, f, fa10Var, f2, false, ea10Var, null), bnn0Var);
        return objA == wne.f39444a ? objA : Unit.f46060a;
    }

    public static final icy t(rkj rkjVar) {
        rkjVar.getClass();
        icy icyVar = rkjVar instanceof icy ? (icy) rkjVar : null;
        if (icyVar != null) {
            return icyVar;
        }
        jf4.n(kng0.g(sre0.f32672a, rkjVar.getClass(), new StringBuilder("This serializer can be used only with Json format.Expected Decoder to be JsonDecoder, got ")));
        return null;
    }

    public static final void u(bwn bwnVar) {
        bwnVar.getClass();
        if ((bwnVar instanceof scy ? (scy) bwnVar : null) != null) {
            return;
        }
        jf4.n(kng0.g(sre0.f32672a, bwnVar.getClass(), new StringBuilder("This serializer can be used only with Json format.Expected Encoder to be JsonEncoder, got ")));
    }

    public static final ahz v(g2v g2vVar, long j, long j2) {
        return new ahz(new vgz(j2, g2v.b(g2vVar, ozb.N(j, j2), null, null, 0, 0, R.string.data_retrieval_error, 0, R.string.try_again_text, 10000L, 0L, Response.SESSION_NOT_ACCEPTABLE)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v10, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r11v6 */
    /* JADX WARN: Type inference failed for: r11v7, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r11v8, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v6, types: [java.util.ArrayList] */
    public static List w(List list, zuc0 zuc0Var, ctf0 ctf0Var, lc00 lc00Var, gfe gfeVar, gfe gfeVar2, gfe gfeVar3, gfe gfeVar4, gfe gfeVar5, gfe gfeVar6, qho qhoVar, String str, int i) {
        List listG;
        ?? arrayList;
        ?? arrayList2;
        Iterator it;
        afe afeVar;
        boolean z;
        boolean z2;
        int i2;
        int i3 = i & 16;
        yee yeeVar = yee.f42482a;
        gfe gfeVar7 = i3 != 0 ? yeeVar : gfeVar2;
        gfe gfeVar8 = (i & 256) != 0 ? yeeVar : gfeVar6;
        list.getClass();
        zuc0Var.getClass();
        ctf0Var.getClass();
        lc00Var.getClass();
        gfeVar.getClass();
        gfeVar3.getClass();
        gfeVar4.getClass();
        gfeVar5.getClass();
        qhoVar.getClass();
        str.getClass();
        if (!q3d.j(gfeVar, gfeVar7, gfeVar3, gfeVar4, gfeVar5, gfeVar8, yeeVar).contains(dfe.f5996a)) {
            List listX = x(list, gfeVar, ctf0Var, lc00Var);
            if (gfeVar7 instanceof afe) {
                gtc0 gtc0Var = gtc0.USER_PROMO_CODES;
                mgc0 mgc0Var = (mgc0) ((afe) gfeVar7).f774a;
                listG = H(listX, zuc0Var, gtc0Var, mgc0Var.b ? ctf0Var.f(R.string.user_active_promo_codes_v2, Integer.valueOf(mgc0Var.f21735a.size())) : "", qhoVar);
            } else {
                listG = gfeVar7.equals(yeeVar) ? G(listX, gtc0.USER_PROMO_CODES) : lc00Var;
            }
            Iterable iterableH = gfeVar8 instanceof afe ? H(listG, zuc0Var, gtc0.CHAMPIONS_CLUB, ctf0Var.b.a(R.string.promo_menu_champions_club_subtitle, Arrays.copyOf(new Object[0], 0)), qhoVar) : gfeVar8.equals(yeeVar) ? G(listG, gtc0.CHAMPIONS_CLUB) : lc00Var;
            int i4 = 10;
            if (gfeVar4 instanceof afe) {
                afe afeVar2 = (afe) gfeVar4;
                boolean zContains = q3d.j(zuc0.CARDS_WITH_GAMES, zuc0.CARDS_WITH_GAMES_AND_STORE).contains(zuc0Var);
                arrayList = new ArrayList(r3d.q(iterableH, 10));
                Iterator it2 = iterableH.iterator();
                while (it2.hasNext()) {
                    p6t0 v4c0Var = (p6t0) it2.next();
                    if (v4c0Var instanceof n4c0) {
                        Object obj = afeVar2.f774a;
                        if (zContains) {
                            ArrayList arrayList3 = new ArrayList(r3d.q((Iterable) obj, i4));
                            for (Iterator it3 = r13.iterator(); it3.hasNext(); it3 = it3) {
                                etc0 etc0Var = (etc0) it3.next();
                                etc0Var.getClass();
                                soc0 soc0Var = etc0Var.d;
                                Iterator it4 = it2;
                                long j = g1x.E(soc0Var).f11874a;
                                afe afeVar3 = afeVar2;
                                String strA = soc0Var == soc0.c ? str : ctf0Var.b.a(g1x.E(soc0Var).b, Arrays.copyOf(new Object[0], 0));
                                n0x n0xVarB = g1x.E(soc0Var).b(etc0Var.b);
                                if (n0xVarB == null) {
                                    n0xVarB = new n0x("static/img/android/promo_store/styles/cardsWithGamesAndStore/img/additional_other_s.webp");
                                }
                                arrayList3.add(new o4c0(j, strA, n0xVarB));
                                it2 = it4;
                                afeVar2 = afeVar3;
                                zContains = zContains;
                            }
                            it = it2;
                            afeVar = afeVar2;
                            z = zContains;
                            v4c0Var = new l4c0(arrayList3);
                            z2 = true;
                        } else {
                            it = it2;
                            afeVar = afeVar2;
                            z = zContains;
                            ArrayList arrayList4 = new ArrayList(r3d.q((Iterable) obj, 10));
                            for (Iterator it5 = r13.iterator(); it5.hasNext(); it5 = it5) {
                                etc0 etc0Var2 = (etc0) it5.next();
                                etc0Var2.getClass();
                                gtc0 gtc0VarE = g1x.E(etc0Var2.d);
                                zuc0 zuc0Var2 = etc0Var2.b;
                                arrayList4.add(new ptc0(zuc0Var2, gtc0VarE, (zuc0Var2 == zuc0.LIST_WITH_GAMES_AND_STORE || (i2 = gtc0VarE.d) == 0) ? "" : ctf0Var.b.a(i2, Arrays.copyOf(new Object[0], 0)), z1x.N(gtc0VarE.c, qhoVar), new itc0(gtc0VarE.b(zuc0Var2))));
                            }
                            nmk0 nmk0Var = nmk0.SPACE_8;
                            omk0 omk0Var = new omk0();
                            ArrayList arrayList5 = new ArrayList();
                            Iterator it6 = arrayList4.iterator();
                            while (it6.hasNext()) {
                                w3d.u(arrayList5, q3d.j(it6.next(), omk0Var));
                            }
                            z2 = true;
                            v4c0Var = new v4c0(CollectionsKt.N0(CollectionsKt.P(1, arrayList5)));
                        }
                    } else {
                        it = it2;
                        afeVar = afeVar2;
                        z = zContains;
                        z2 = true;
                    }
                    arrayList.add(v4c0Var);
                    it2 = it;
                    afeVar2 = afeVar;
                    i4 = 10;
                    zContains = z;
                }
            } else if (gfeVar4.equals(yeeVar)) {
                arrayList = new ArrayList();
                for (Object obj2 : iterableH) {
                    if (!(((p6t0) obj2) instanceof n4c0)) {
                        arrayList.add(obj2);
                    }
                }
            } else {
                arrayList = lc00Var;
            }
            if (gfeVar3 instanceof afe) {
                afe afeVar4 = (afe) gfeVar3;
                arrayList2 = new ArrayList(r3d.q(arrayList, 10));
                for (Object n7c0Var : arrayList) {
                    if (n7c0Var instanceof k7c0) {
                        Iterable iterable = (Iterable) afeVar4.f774a;
                        ArrayList arrayList6 = new ArrayList(r3d.q(iterable, 10));
                        Iterator it7 = iterable.iterator();
                        while (it7.hasNext()) {
                            arrayList6.add(qjj.c0((pe8) it7.next()));
                        }
                        n7c0Var = new n7c0(arrayList6);
                    }
                    arrayList2.add(n7c0Var);
                }
            } else if (gfeVar3.equals(yeeVar)) {
                arrayList2 = new ArrayList();
                for (Object obj3 : arrayList) {
                    if (!(((p6t0) obj3) instanceof k7c0)) {
                        arrayList2.add(obj3);
                    }
                }
            } else {
                arrayList2 = lc00Var;
            }
            if (gfeVar5 instanceof afe) {
                return H(arrayList2, zuc0Var, gtc0.REFERRAL_PROGRAM, "", qhoVar);
            }
            if (gfeVar5.equals(yeeVar)) {
                return G(arrayList2, gtc0.REFERRAL_PROGRAM);
            }
        }
        return lc00Var;
    }

    /* JADX WARN: Code duplicated, block: B:151:0x0027 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:152:0x0045 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:153:? A[LOOP:0: B:19:0x0035->B:153:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:154:0x0062 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:18:0x0031  */
    /* JADX WARN: Code duplicated, block: B:21:0x003b  */
    /* JADX WARN: Code duplicated, block: B:26:0x0053  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0, types: [a.h5c0] */
    /* JADX WARN: Type inference failed for: r12v1 */
    /* JADX WARN: Type inference failed for: r12v2 */
    /* JADX WARN: Type inference failed for: r20v0 */
    /* JADX WARN: Type inference failed for: r20v1, types: [a.n0x] */
    /* JADX WARN: Type inference failed for: r20v2 */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v13, types: [a.h5c0] */
    /* JADX WARN: Type inference failed for: r2v26 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v12, types: [a.h5c0] */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v15, types: [a.h5c0] */
    /* JADX WARN: Type inference failed for: r6v19 */
    /* JADX WARN: Type inference failed for: r6v20, types: [a.h5c0] */
    /* JADX WARN: Type inference failed for: r6v25 */
    /* JADX WARN: Type inference failed for: r6v26, types: [a.h5c0] */
    /* JADX WARN: Type inference failed for: r6v28 */
    /* JADX WARN: Type inference failed for: r6v29, types: [a.b5c0] */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6, types: [a.h5c0] */
    /* JADX WARN: Type inference failed for: r6v62 */
    /* JADX WARN: Type inference failed for: r6v63 */
    /* JADX WARN: Type inference failed for: r6v64 */
    /* JADX WARN: Type inference failed for: r6v65 */
    /* JADX WARN: Type inference failed for: r6v66 */
    /* JADX WARN: Type inference failed for: r6v67 */
    /* JADX WARN: Type inference failed for: r7v3, types: [a.p6t0, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v4, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v5, types: [a.i5c0] */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v7, types: [a.i5c0] */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r8v13 */
    /* JADX WARN: Type inference failed for: r8v14, types: [a.c5c0] */
    /* JADX WARN: Type inference failed for: r8v18 */
    /* JADX WARN: Type inference failed for: r8v19 */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9, types: [a.z4c0] */
    /* JADX WARN: Type inference failed for: r9v2, types: [a.t5c0] */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v8 */
    public static final List x(List list, gfe gfeVar, ctf0 ctf0Var, List list2) {
        Iterable<??> iterable;
        ArrayList arrayList;
        n0x n0xVar;
        ?? n0xVar2;
        Iterator it;
        Iterator it2;
        Object next;
        if (!(gfeVar instanceof afe)) {
            if (!gfeVar.equals(yee.f42482a)) {
                return list2;
            }
            ArrayList arrayListU = twn.u(list);
            for (Object obj : list) {
                if (!(((p6t0) obj) instanceof i5c0)) {
                    arrayListU.add(obj);
                }
            }
            return arrayListU;
        }
        ArrayList arrayList2 = null;
        if (list == null || !list.isEmpty()) {
            Iterator it3 = list.iterator();
            while (true) {
                if (it3.hasNext()) {
                    if (((p6t0) it3.next()) instanceof i5c0) {
                    }
                } else if (!list2.isEmpty()) {
                    it = list2.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            if (((p6t0) it.next()) instanceof i5c0) {
                                ArrayList arrayListN0 = CollectionsKt.N0(list);
                                it2 = list2.iterator();
                                do {
                                    if (it2.hasNext()) {
                                        v4i0.o("Collection contains no element matching the predicate.");
                                        return null;
                                    }
                                    next = it2.next();
                                } while (!(((p6t0) next) instanceof i5c0));
                                arrayListN0.add(0, next);
                                iterable = arrayListN0;
                                break;
                            }
                        }
                    }
                }
                iterable = list;
                break;
            }
        }
        if (!list2.isEmpty()) {
            iterable = list;
            break;
        }
        it = list2.iterator();
        while (true) {
            if (!it.hasNext()) {
                iterable = list;
                break;
            }
            if (((p6t0) it.next()) instanceof i5c0) {
                ArrayList arrayListN1 = CollectionsKt.N0(list);
                it2 = list2.iterator();
                do {
                    if (it2.hasNext()) {
                        v4i0.o("Collection contains no element matching the predicate.");
                        return null;
                    }
                    next = it2.next();
                } while (!(((p6t0) next) instanceof i5c0));
                arrayListN1.add(0, next);
                iterable = arrayListN1;
                break;
            }
        }
        afe afeVar = (afe) gfeVar;
        iterable.getClass();
        ctf0Var.getClass();
        int i = 10;
        ArrayList arrayList3 = new ArrayList(r3d.q(iterable, 10));
        for (?? r7 : iterable) {
            if (r7 instanceof i5c0) {
                Object obj2 = afeVar.f774a;
                zrc0 zrc0Var = (zrc0) obj2;
                if (zrc0Var == null) {
                    arrayList = arrayList2;
                } else if (zrc0Var instanceof eic0) {
                    eic0 eic0Var = (eic0) obj2;
                    eic0Var.getClass();
                    int i2 = eic0Var.f7853a;
                    String strF = ctf0Var.f(R.string.pts, new Object[0]);
                    boolean z = eic0Var.b;
                    List<vrc0> list3 = eic0Var.f;
                    ArrayList arrayList4 = new ArrayList(r3d.q(list3, i));
                    for (vrc0 vrc0Var : list3) {
                        vrc0Var.getClass();
                        long id = vrc0Var.getId();
                        String name = vrc0Var.getName();
                        boolean z2 = vrc0Var instanceof trc0;
                        ArrayList arrayList5 = arrayList2;
                        if (z2) {
                            n0xVar = new n0x(((trc0) vrc0Var).k);
                        } else {
                            if (!(vrc0Var instanceof urc0)) {
                                t9f.b();
                                return arrayList5;
                            }
                            n0xVar = new n0x(((urc0) vrc0Var).l.f12884a);
                        }
                        n0x n0xVar3 = n0xVar;
                        if (z2) {
                            n0xVar2 = arrayList5;
                        } else {
                            if (!(vrc0Var instanceof urc0)) {
                                t9f.b();
                                return arrayList5;
                            }
                            n0xVar2 = new n0x(azw.R(((urc0) vrc0Var).l.f12884a));
                        }
                        arrayList4.add(new euc0(id, n0xVar3, n0xVar2, name));
                        arrayList2 = arrayList5;
                    }
                    arrayList = arrayList2;
                    ?? h5c0Var = new h5c0(i2, strF, z, eic0Var.c, eic0Var.d, eic0Var.e, arrayList4);
                    boolean z3 = r7 instanceof h5c0;
                    ?? r6 = z3 ? (h5c0) r7 : arrayList;
                    Object obj3 = r6 != 0 ? r6.b : arrayList;
                    if (obj3 == null ? false : h5c0Var.b.equals(obj3)) {
                        ?? r8 = z3 ? (h5c0) r7 : arrayList;
                        ?? z4c0Var = r8 != 0 ? new z4c0(r8.f12473a) : arrayList;
                        if (z4c0Var != 0) {
                            if (h5c0Var.f12473a == z4c0Var.f43764a) {
                                ?? r9 = z3 ? (h5c0) r7 : arrayList;
                                if (h5c0Var.h.equals(r9 != 0 ? r9.h : arrayList)) {
                                    ?? r10 = z3 ? (h5c0) r7 : arrayList;
                                    ArrayList arrayList6 = r10 != 0 ? r10.g : arrayList;
                                    if (arrayList6 == null ? false : h5c0Var.g.equals(arrayList6)) {
                                        ?? r11 = z3 ? (h5c0) r7 : arrayList;
                                        ?? c5c0Var = r11 != 0 ? new c5c0(r11.d) : arrayList;
                                        if (c5c0Var != 0) {
                                            if (h5c0Var.d == c5c0Var.f3765a) {
                                                ?? r2 = z3 ? (h5c0) r7 : arrayList;
                                                ?? b5c0Var = r2 != 0 ? new b5c0(r2.e) : arrayList;
                                                if (b5c0Var != 0) {
                                                    if (h5c0Var.e == b5c0Var.f1997a) {
                                                        h5c0Var = arrayList;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    r7 = h5c0Var != 0 ? h5c0Var : (i5c0) r7;
                } else {
                    arrayList = arrayList2;
                    if (zrc0Var instanceof ftc0) {
                        ftc0 ftc0Var = (ftc0) obj2;
                        ftc0Var.getClass();
                        ?? t5c0Var = new t5c0(ctf0Var.f(R.string.pts, new Object[0]), ftc0Var.c, ftc0Var.f10105a);
                        boolean zEquals = t5c0Var.equals(r7);
                        ?? r12 = t5c0Var;
                        if (zEquals) {
                            r12 = arrayList;
                        }
                        r7 = r12 != 0 ? r12 : (i5c0) r7;
                    }
                }
                t9f.b();
                return arrayList;
            }
            arrayList = arrayList2;
            arrayList3.add(r7);
            arrayList2 = arrayList;
            i = 10;
        }
        return arrayList3;
    }

    public static final f240 y(f240 f240Var, boolean z) {
        if (f240Var instanceof h140) {
            h140 h140Var = (h140) f240Var;
            iz30 iz30Var = h140Var.b;
            r040 r040Var = h140Var.c;
            String str = h140Var.d;
            int i = h140Var.e;
            String str2 = h140Var.f;
            String str3 = h140Var.g;
            r040Var.getClass();
            str2.getClass();
            str3.getClass();
            return new h140(i, iz30Var, r040Var, str, str2, str3, z);
        }
        if (f240Var instanceof i140) {
            i140 i140Var = (i140) f240Var;
            return new i140(z, i140Var.b, i140Var.c, i140Var.d);
        }
        if (f240Var instanceof k140) {
            k140 k140Var = (k140) f240Var;
            iz30 iz30Var2 = k140Var.f17501a;
            r040 r040Var2 = k140Var.c;
            int i2 = k140Var.d;
            int i3 = k140Var.e;
            int i4 = k140Var.f;
            int i5 = k140Var.g;
            int i6 = k140Var.h;
            String str4 = k140Var.i;
            String str5 = k140Var.j;
            int i7 = k140Var.k;
            int i8 = k140Var.l;
            List list = k140Var.m;
            ColorFilter colorFilter = k140Var.n;
            iz30Var2.getClass();
            r040Var2.getClass();
            str4.getClass();
            str5.getClass();
            list.getClass();
            return new k140(iz30Var2, z, r040Var2, i2, i3, i4, i5, i6, str4, str5, i7, i8, list, colorFilter);
        }
        if (f240Var instanceof l140) {
            l140 l140Var = (l140) f240Var;
            iz30 iz30Var3 = l140Var.f19231a;
            r040 r040Var3 = l140Var.c;
            int i9 = l140Var.d;
            String str6 = l140Var.e;
            String str7 = l140Var.f;
            int i10 = l140Var.g;
            long j = l140Var.h;
            r040Var3.getClass();
            str6.getClass();
            str7.getClass();
            return new l140(iz30Var3, z, r040Var3, i9, str6, str7, i10, j);
        }
        if (f240Var instanceof n140) {
            n140 n140Var = (n140) f240Var;
            iz30 iz30Var4 = n140Var.f22730a;
            r040 r040Var4 = n140Var.c;
            int i11 = n140Var.d;
            String str8 = n140Var.e;
            String str9 = n140Var.f;
            int i12 = n140Var.g;
            r040Var4.getClass();
            str8.getClass();
            str9.getClass();
            return new n140(iz30Var4, z, r040Var4, i11, str8, str9, i12);
        }
        if (f240Var instanceof s140) {
            s140 s140Var = (s140) f240Var;
            iz30 iz30Var5 = s140Var.f31437a;
            r040 r040Var5 = s140Var.c;
            int i13 = s140Var.d;
            String str10 = s140Var.e;
            String str11 = s140Var.f;
            iz30Var5.getClass();
            r040Var5.getClass();
            str10.getClass();
            str11.getClass();
            return new s140(iz30Var5, z, r040Var5, i13, str10, str11);
        }
        if (f240Var instanceof w140) {
            w140 w140Var = (w140) f240Var;
            iz30 iz30Var6 = w140Var.f38381a;
            r040 r040Var6 = w140Var.c;
            int i14 = w140Var.d;
            String str12 = w140Var.e;
            String str13 = w140Var.f;
            iz30Var6.getClass();
            r040Var6.getClass();
            str12.getClass();
            str13.getClass();
            return new w140(iz30Var6, z, r040Var6, i14, str12, str13);
        }
        if (f240Var instanceof x140) {
            x140 x140Var = (x140) f240Var;
            r040 r040Var7 = x140Var.b;
            int i15 = x140Var.c;
            iz30 iz30Var7 = x140Var.d;
            String str14 = x140Var.e;
            String str15 = x140Var.f;
            String str16 = x140Var.g;
            String str17 = x140Var.h;
            String str18 = x140Var.i;
            r040Var7.getClass();
            str16.getClass();
            return new x140(z, r040Var7, i15, iz30Var7, str14, str15, str16, str17, str18);
        }
        if (f240Var instanceof d240) {
            d240 d240Var = (d240) f240Var;
            iz30 iz30Var8 = d240Var.b;
            r040 r040Var8 = d240Var.c;
            long j2 = d240Var.d;
            long j3 = d240Var.e;
            String str19 = d240Var.f;
            String str20 = d240Var.g;
            long j4 = d240Var.h;
            r040Var8.getClass();
            str20.getClass();
            return new d240(z, iz30Var8, r040Var8, j2, j3, str19, str20, j4);
        }
        if (f240Var instanceof e240) {
            e240 e240Var = (e240) f240Var;
            iz30 iz30Var9 = e240Var.b;
            r040 r040Var9 = e240Var.c;
            int i16 = e240Var.d;
            String str21 = e240Var.e;
            String str22 = e240Var.f;
            List list2 = e240Var.g;
            r040Var9.getClass();
            str21.getClass();
            str22.getClass();
            return new e240(z, iz30Var9, r040Var9, i16, str21, str22, list2);
        }
        if (f240Var instanceof p140) {
            p140 p140Var = (p140) f240Var;
            iz30 iz30Var10 = p140Var.f26182a;
            r040 r040Var10 = p140Var.c;
            int i17 = p140Var.d;
            int i18 = p140Var.e;
            int i19 = p140Var.f;
            int i20 = p140Var.g;
            int i21 = p140Var.h;
            String str23 = p140Var.i;
            String str24 = p140Var.j;
            int i22 = p140Var.k;
            int i23 = p140Var.l;
            ColorFilter colorFilter2 = p140Var.m;
            iz30Var10.getClass();
            r040Var10.getClass();
            str23.getClass();
            str24.getClass();
            return new p140(iz30Var10, z, r040Var10, i17, i18, i19, i20, i21, str23, str24, i22, i23, colorFilter2);
        }
        if (f240Var instanceof r140) {
            r140 r140Var = (r140) f240Var;
            iz30 iz30Var11 = r140Var.f29659a;
            r040 r040Var11 = r140Var.c;
            int i24 = r140Var.d;
            String str25 = r140Var.e;
            String str26 = r140Var.f;
            int i25 = r140Var.g;
            r040Var11.getClass();
            str25.getClass();
            str26.getClass();
            return new r140(iz30Var11, z, r040Var11, i24, str25, str26, i25);
        }
        if (f240Var instanceof y140) {
            y140 y140Var = (y140) f240Var;
            r040 r040Var12 = y140Var.b;
            int i26 = y140Var.c;
            iz30 iz30Var12 = y140Var.d;
            int i27 = y140Var.e;
            String str27 = y140Var.f;
            String str28 = y140Var.g;
            int i28 = y140Var.h;
            int i29 = y140Var.i;
            String str29 = y140Var.j;
            String str30 = y140Var.k;
            String str31 = y140Var.l;
            r040Var12.getClass();
            str29.getClass();
            return new y140(z, r040Var12, i26, iz30Var12, i27, str27, str28, i28, i29, str29, str30, str31);
        }
        if (f240Var instanceof u140) {
            u140 u140Var = (u140) f240Var;
            iz30 iz30Var13 = u140Var.b;
            r040 r040Var13 = u140Var.c;
            int i30 = u140Var.d;
            String str32 = u140Var.e;
            String str33 = u140Var.f;
            List list3 = u140Var.g;
            r040Var13.getClass();
            str32.getClass();
            str33.getClass();
            return new u140(z, iz30Var13, r040Var13, i30, str32, str33, list3);
        }
        if (f240Var instanceof o140) {
            o140 o140Var = (o140) f240Var;
            iz30 iz30Var14 = o140Var.b;
            r040 r040Var14 = o140Var.c;
            String str34 = o140Var.d;
            int i31 = o140Var.e;
            String str35 = o140Var.f;
            String str36 = o140Var.g;
            r040Var14.getClass();
            str35.getClass();
            str36.getClass();
            return new o140(i31, iz30Var14, r040Var14, str34, str35, str36, z);
        }
        if (f240Var instanceof q140) {
            q140 q140Var = (q140) f240Var;
            iz30 iz30Var15 = q140Var.f27933a;
            r040 r040Var15 = q140Var.c;
            int i32 = q140Var.d;
            int i33 = q140Var.e;
            int i34 = q140Var.f;
            String str37 = q140Var.g;
            String str38 = q140Var.h;
            int i35 = q140Var.i;
            int i36 = q140Var.j;
            r040Var15.getClass();
            str37.getClass();
            str38.getClass();
            return new q140(iz30Var15, z, r040Var15, i32, i33, i34, str37, str38, i35, i36);
        }
        if (f240Var instanceof t140) {
            t140 t140Var = (t140) f240Var;
            iz30 iz30Var16 = t140Var.b;
            r040 r040Var16 = t140Var.c;
            long j5 = t140Var.d;
            long j6 = t140Var.e;
            String str39 = t140Var.f;
            String str40 = t140Var.g;
            long j7 = t140Var.h;
            r040Var16.getClass();
            str40.getClass();
            return new t140(z, iz30Var16, r040Var16, j5, j6, str39, str40, j7);
        }
        if (f240Var instanceof c240) {
            c240 c240Var = (c240) f240Var;
            iz30 iz30Var17 = c240Var.b;
            r040 r040Var17 = c240Var.c;
            long j8 = c240Var.d;
            long j9 = c240Var.e;
            String str41 = c240Var.f;
            String str42 = c240Var.g;
            String str43 = c240Var.h;
            long j10 = c240Var.i;
            r040Var17.getClass();
            str42.getClass();
            return new c240(z, iz30Var17, r040Var17, j8, j9, str41, str42, str43, j10);
        }
        if (f240Var instanceof g140) {
            g140 g140Var = (g140) f240Var;
            iz30 iz30Var18 = g140Var.f10492a;
            r040 r040Var18 = g140Var.c;
            int i37 = g140Var.d;
            String str44 = g140Var.e;
            String str45 = g140Var.f;
            int i38 = g140Var.g;
            boolean z2 = g140Var.h;
            r040Var18.getClass();
            str44.getClass();
            str45.getClass();
            return new g140(iz30Var18, z, r040Var18, i37, str44, str45, i38, z2);
        }
        if (f240Var instanceof m140) {
            m140 m140Var = (m140) f240Var;
            iz30 iz30Var19 = m140Var.f20987a;
            r040 r040Var19 = m140Var.c;
            int i39 = m140Var.d;
            int i40 = m140Var.e;
            int i41 = m140Var.f;
            String str46 = m140Var.g;
            String str47 = m140Var.h;
            int i42 = m140Var.i;
            int i43 = m140Var.j;
            r040Var19.getClass();
            str46.getClass();
            str47.getClass();
            return new m140(iz30Var19, z, r040Var19, i39, i40, i41, str46, str47, i42, i43);
        }
        if (f240Var instanceof j140) {
            j140 j140Var = (j140) f240Var;
            iz30 iz30Var20 = j140Var.f15715a;
            r040 r040Var20 = j140Var.c;
            int i44 = j140Var.d;
            String str48 = j140Var.e;
            String str49 = j140Var.f;
            String str50 = j140Var.g;
            r040Var20.getClass();
            str48.getClass();
            str49.getClass();
            str50.getClass();
            return new j140(i44, iz30Var20, r040Var20, str48, str49, str50, z);
        }
        if (f240Var instanceof b240) {
            b240 b240Var = (b240) f240Var;
            iz30 iz30Var21 = b240Var.f1838a;
            r040 r040Var21 = b240Var.c;
            int i45 = b240Var.d;
            String str51 = b240Var.e;
            String str52 = b240Var.f;
            String str53 = b240Var.g;
            r040Var21.getClass();
            str51.getClass();
            str52.getClass();
            str53.getClass();
            return new b240(i45, iz30Var21, r040Var21, str51, str52, str53, z);
        }
        if (f240Var instanceof v140) {
            v140 v140Var = (v140) f240Var;
            iz30 iz30Var22 = v140Var.f36611a;
            r040 r040Var22 = v140Var.c;
            int i46 = v140Var.d;
            String str54 = v140Var.e;
            String str55 = v140Var.f;
            String str56 = v140Var.g;
            r040Var22.getClass();
            str54.getClass();
            str55.getClass();
            str56.getClass();
            return new v140(i46, iz30Var22, r040Var22, str54, str55, str56, z);
        }
        if (!(f240Var instanceof a240)) {
            t9f.b();
            return null;
        }
        a240 a240Var = (a240) f240Var;
        int i47 = a240Var.g;
        iz30 iz30Var23 = a240Var.f106a;
        r040 r040Var23 = a240Var.c;
        int i48 = a240Var.d;
        String str57 = a240Var.e;
        String str58 = a240Var.f;
        r040Var23.getClass();
        str57.getClass();
        str58.getClass();
        return new a240(iz30Var23, z, r040Var23, i48, str57, str58, i47);
    }

    public static final mm40 z(mm40 mm40Var, boolean z, vj50 vj50Var) {
        mm40Var.getClass();
        vj50Var.getClass();
        mm40 mm40VarV = jm40.b;
        if (z) {
            mm40VarV = cjx.V(mm40VarV, vj50Var, null);
        }
        return mm40Var.e(mm40VarV);
    }
}
