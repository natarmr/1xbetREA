package a;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.gov.nist.core.Separators;
import android.javax.sip.message.Response;
import android.net.NetworkRequest;
import android.os.Build;
import android.text.format.DateFormat;
import android.view.View;
import android.view.ViewGroup;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.xbet.client1.R;
import org.xplatform.uikit.compose.color.StaticColors;
import org.xplatform.uikit.compose.color.ThemeColors;
import org.xplatform.uikit.compose.components.calendar.model.DateRangeModel;
import org.xplatform.uikit.compose.components.picker.model.SimpleDate;

/* JADX INFO: loaded from: classes6.dex */
public final class f7k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f9061a;

    public /* synthetic */ f7k(byte b) {
        this.f9061a = b;
    }

    public static final void A(LinkedHashMap linkedHashMap, rbb rbbVar, String str) {
        String string;
        Long lValueOf = Long.valueOf(rbbVar.n);
        String str2 = rbbVar.e;
        long j = rbbVar.n;
        int i = rbbVar.j;
        boolean z = rbbVar.m;
        if (j != 0) {
            bzu bzuVarE = rz4.e("static", "svg", "sports_v3", str);
            rz4.s(j, ".svg", bzuVarE);
            string = ((StringBuilder) bzuVarE.b).toString();
        } else {
            string = "";
        }
        linkedHashMap.put(lValueOf, new plp(z, str2, j, i, string, str.equals("monochrome"), ""));
    }

    public static final hoo0 B(int i, int i2, int i3, ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        int iC = i3;
        int iIntValue = 0;
        while (i3 < size) {
            iIntValue = iIntValue + (arrayList2.isEmpty() ? 0 : i2) + ((Number) arrayList.get(i3)).intValue();
            if (iIntValue > i) {
                break;
            }
            iC = w6x.c(i3, i3, 1, arrayList2);
            i3 = iC;
        }
        return new hoo0(arrayList2, iC);
    }

    public static final void C(String str, StringBuilder sb) {
        if (sb.length() <= 0 || str == null || str.length() == 0) {
            return;
        }
        sb.append(". ".concat(str));
    }

    public static final void D(String str, StringBuilder sb) {
        if (sb.length() <= 0 || str == null || str.length() == 0) {
            return;
        }
        sb.append(". ".concat(str));
    }

    /* JADX WARN: Code duplicated, block: B:14:0x002a  */
    /* JADX WARN: Code duplicated, block: B:17:0x0030  */
    /* JADX WARN: Code duplicated, block: B:18:0x0034  */
    /* JADX WARN: Code duplicated, block: B:21:0x0051  */
    /* JADX WARN: Code duplicated, block: B:22:0x0054  */
    /* JADX WARN: Code duplicated, block: B:25:0x005a  */
    /* JADX WARN: Code duplicated, block: B:27:0x005e  */
    /* JADX WARN: Code duplicated, block: B:30:0x007c  */
    /* JADX WARN: Code duplicated, block: B:33:0x0092  */
    /* JADX WARN: Code duplicated, block: B:35:0x00a5  */
    public static final List F(rbb rbbVar, boolean z, boolean z2, ctf0 ctf0Var, Set set, Set set2, boolean z3) {
        Set set3;
        boolean z4;
        boolean z5;
        int i;
        pgb pgbVar;
        boolean z6;
        boolean z7;
        boolean z8 = rbbVar.l;
        long j = rbbVar.f30176a;
        if (z2) {
            set3 = set2;
            z4 = set3.contains(Long.valueOf(j));
            if (!z4 || set3.size() < 10) {
                z5 = true;
            } else {
                z5 = false;
            }
            long j2 = rbbVar.f;
            if (z8) {
                i = R.drawable.ic_glyph_favourite_active;
            } else {
                i = R.drawable.ic_glyph_favourite_inactive;
            }
            long j3 = rbbVar.f30176a;
            String str = rbbVar.c;
            long j4 = rbbVar.n;
            int i2 = rbbVar.j;
            String strP = P(rbbVar);
            int i3 = (int) j2;
            pgbVar = rbbVar.o;
            if (pgbVar == pgb.b) {
                z6 = true;
            } else {
                z6 = false;
            }
            if (pgbVar == pgb.c) {
                z7 = true;
            } else {
                z7 = false;
            }
            dlp dlpVar = new dlp(z8, i);
            List list = rbbVar.p;
            boolean z9 = rbbVar.m;
            boolean zContains = set.contains(Long.valueOf(j));
            ilp ilpVar = new ilp(j3, str, j4, z9, i2, strP, i3, z6, z7, zContains, j2 > 0, list, dlpVar, z, z2, z4, z5);
            return zContains ? CollectionsKt.q0(kotlin.collections.a.c(ilpVar), N(ilpVar, rbbVar.b, ctf0Var, z3)) : kotlin.collections.a.c(ilpVar);
        }
        set3 = set2;
        if (z4) {
            z5 = true;
        } else {
            z5 = true;
        }
        long j5 = rbbVar.f;
        if (z8) {
            i = R.drawable.ic_glyph_favourite_active;
        } else {
            i = R.drawable.ic_glyph_favourite_inactive;
        }
        long j6 = rbbVar.f30176a;
        String str2 = rbbVar.c;
        long j7 = rbbVar.n;
        int i4 = rbbVar.j;
        String strP2 = P(rbbVar);
        int i5 = (int) j5;
        pgbVar = rbbVar.o;
        if (pgbVar == pgb.b) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (pgbVar == pgb.c) {
            z7 = true;
        } else {
            z7 = false;
        }
        dlp dlpVar2 = new dlp(z8, i);
        List list2 = rbbVar.p;
        boolean z10 = rbbVar.m;
        boolean zContains2 = set.contains(Long.valueOf(j));
        ilp ilpVar2 = new ilp(j6, str2, j7, z10, i4, strP2, i5, z6, z7, zContains2, j5 > 0, list2, dlpVar2, z, z2, z4, z5);
        if (zContains2) {
        }
    }

    public static f7u G(f7u f7uVar, vlc vlcVar, mqe0 mqe0Var, int i) {
        if ((i & 2) != 0) {
            mqe0Var = null;
        }
        f7uVar.getClass();
        return new f7u((v7i) f7uVar.b, mqe0Var != null ? new ucs0(f7uVar, vlcVar, mqe0Var, 0) : (mzs0) f7uVar.c, maz.a(wez.b, new h5((Object) f7uVar, (Object) vlcVar, (byte) 23)));
    }

    public static final boolean H(jge0 jge0Var, float f, float f2) {
        float f3 = jge0Var.f16474a;
        if (f > jge0Var.c || f3 > f) {
            return false;
        }
        return f2 <= jge0Var.d && jge0Var.b <= f2;
    }

    public static final f7u I(f7u f7uVar, g93 g93Var) {
        f7uVar.getClass();
        g93Var.getClass();
        return g93Var.isEmpty() ? f7uVar : new f7u((v7i) f7uVar.b, (mzs0) f7uVar.c, maz.a(wez.b, new h5((Object) f7uVar, (Object) g93Var, (byte) 24)));
    }

    public static final void J(kmq kmqVar) {
        if (kmqVar instanceof edq0) {
            throw ((edq0) kmqVar).f7631a;
        }
    }

    public static final String K(zmb zmbVar, long j, long j2) {
        zmbVar.getClass();
        if (j == -2) {
            return "-2";
        }
        return zmbVar + Separators.SP + j + Separators.SP + j2;
    }

    public static final CoroutineContext L(zdg0 zdg0Var, zje zjeVar) {
        ces0 ces0Var = (ces0) zjeVar.getContext().get(ces0.b);
        CoroutineContext coroutineContext = ces0Var != null ? ces0Var.f4228a : null;
        sje sjeVar = zdg0Var.f44213a;
        if (sjeVar == null) {
            Intrinsics.h("coroutineScope");
            throw null;
        }
        CoroutineContext coroutineContextMinusKey = sjeVar.f32300a.minusKey(gqw0.o1);
        if (coroutineContext == null) {
            coroutineContext = kotlin.coroutines.g.f46065a;
        }
        return coroutineContextMinusKey.plus(coroutineContext);
    }

    public static final int M(int i) {
        return (int) (i * Resources.getSystem().getDisplayMetrics().density);
    }

    public static final List N(ilp ilpVar, long j, ctf0 ctf0Var, boolean z) {
        int i = ilpVar.g;
        List list = ilpVar.l;
        if (i > list.size()) {
            uhp uhpVar = uhp.f35692a;
            return q3d.j(uhpVar, uhpVar, uhpVar);
        }
        ArrayList arrayList = new ArrayList(r3d.q(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            long j2 = j;
            arrayList.add(tlb.i0((ygs) it.next(), ilpVar.b, ilpVar.f14991a, j2, ctf0Var, z));
            j = j2;
        }
        return arrayList;
    }

    public static final List O(olp olpVar, rbb rbbVar, ctf0 ctf0Var, boolean z) {
        int i = olpVar.f;
        List list = olpVar.i;
        if (i > list.size()) {
            uhp uhpVar = uhp.f35692a;
            return q3d.j(uhpVar, uhpVar, uhpVar);
        }
        ArrayList arrayList = new ArrayList(r3d.q(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ctf0 ctf0Var2 = ctf0Var;
            arrayList.add(tlb.i0((ygs) it.next(), rbbVar.c, rbbVar.f30176a, rbbVar.b, ctf0Var2, z));
            ctf0Var = ctf0Var2;
        }
        return arrayList;
    }

    public static final String P(rbb rbbVar) {
        String str = rbbVar.g;
        str.getClass();
        pcb pcbVar = new pcb(str);
        String str2 = rbbVar.h;
        str2.getClass();
        return rcb.d0(pcbVar, new pcb(str2), rbbVar.k);
    }

    public static final String Q(sum0 sum0Var, zmb zmbVar) {
        int iOrdinal = zmbVar.ordinal();
        if (iOrdinal == 0) {
            String str = sum0Var.g;
            str.getClass();
            pcb pcbVar = new pcb(str);
            String str2 = sum0Var.f;
            str2.getClass();
            return rcb.d0(pcbVar, new pcb(str2), sum0Var.j);
        }
        if (iOrdinal != 1) {
            t9f.b();
            return null;
        }
        String str3 = sum0Var.f;
        str3.getClass();
        pcb pcbVar2 = new pcb(str3);
        String str4 = sum0Var.g;
        str4.getClass();
        return rcb.d0(pcbVar2, new pcb(str4), sum0Var.j);
    }

    public static final String R(kzv kzvVar, boolean z, boolean z2, ueo ueoVar, String str, boolean z3, boolean z4) {
        kzvVar.getClass();
        int i = ueoVar != null ? ueoVar.c : 0;
        List list = kzvVar.Y;
        int i2 = list.size() == 1 ? i : -1;
        return kotlin.text.c.r(list.size() == 1 ? ckb.S((z0w) CollectionsKt.U(list), ueoVar, str, z2, z3, z4) : "", " \n", (!z || i2 == -1) ? ". " : ua80.e(i2, ". [Р :", "]: "), false);
    }

    public static final dfa0 S(wmg wmgVar, wmg wmgVar2) {
        return new dfa0(dyb.g0(uvw.F(wmgVar.d, wmgVar2.d), uvw.E(wmgVar.h, wmgVar2.h, ""), uvw.F(wmgVar.f, wmgVar2.f), uvw.F(wmgVar.g, wmgVar2.g)), wmgVar.c);
    }

    public static final int T(int i) {
        return (int) (i / Resources.getSystem().getDisplayMetrics().density);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object V(edq0 edq0Var, xdr xdrVar, Throwable th, zje zjeVar) {
        bnq bnqVar;
        if (zjeVar instanceof bnq) {
            bnqVar = (bnq) zjeVar;
            int i = bnqVar.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                bnqVar.k = i - Integer.MIN_VALUE;
            } else {
                bnqVar = new bnq(zjeVar);
            }
        } else {
            bnqVar = new bnq(zjeVar);
        }
        Object obj = bnqVar.j;
        Object obj2 = wne.f39444a;
        int i2 = bnqVar.k;
        try {
            if (i2 == 0) {
                z1x.P(obj);
                bnqVar.i = th;
                bnqVar.k = 1;
                if (xdrVar.F(edq0Var, th, bnqVar) == obj2) {
                    return obj2;
                }
            } else {
                if (i2 != 1) {
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                th = bnqVar.i;
                z1x.P(obj);
            }
            return Unit.f46060a;
        } catch (Throwable th2) {
            if (th != null && th != th2) {
                tjo.a(th2, th);
            }
            throw th2;
        }
    }

    public static final boolean W(String str, String str2) {
        Integer intOrNull = StringsKt.toIntOrNull(str);
        Integer intOrNull2 = StringsKt.toIntOrNull(str2);
        if (!str.equals("A") || str2.equals("A")) {
            return (str2.equals("A") || intOrNull == null || intOrNull2 == null || intOrNull.intValue() <= intOrNull2.intValue()) ? false : true;
        }
        return true;
    }

    public static final boolean X(Context context) {
        mjv0.f21914a.getClass();
        njv0 njv0Var = ljv0.b;
        njv0Var.getClass();
        kjv0 kjv0VarB = njv0Var.b(context);
        return si30.b(((float) kjv0VarB.f18406a.c().width()) / kjv0VarB.b) >= 600;
    }

    public static final String Y(String str, String str2) {
        if (str2 == null || str2.length() == 0) {
            return "";
        }
        return (str == null || str.length() == 0) ? str2 : kotlin.text.c.u(str2, str.concat(". "), "", true);
    }

    public static final String Z(String str, fet fetVar) {
        str.getClass();
        boolean zG = fetVar.g(str);
        Object objP = fetVar.P();
        if (zG || objP == ukd.f35823a) {
            String strL = ttm0.L(3, str);
            if (strL.length() == 0) {
                strL = "0";
            }
            objP = strL;
            fetVar.o0(objP);
        }
        return (String) objP;
    }

    public static final void a(int i, int i2, int i3, long j, long j2, long j3, fet fetVar, mm40 mm40Var, boolean z) {
        long j4;
        mm40 mm40VarP;
        int i4 = i;
        fetVar.g0(394180058);
        int i5 = i3 | (fetVar.g(mm40Var) ? 4 : 2) | (fetVar.f(j) ? 32 : 16) | (fetVar.f(j2) ? 256 : 128) | (fetVar.f(j3) ? 2048 : 1024) | (fetVar.e(i4) ? 131072 : 65536) | (fetVar.e(i2) ? 1048576 : 524288);
        if (fetVar.U(i5 & 1, (599187 & i5) != 599186)) {
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarA = o7k0.A(o7k0.g(o7k0.s(i120.Q(mm40Var, j3, vgg0.a(16.0f)), 124.0f), 58.0f, 0.0f, 2), null, 3);
            tj30 tj30VarC = zq8.c(gqw0.e, false);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarA);
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
            jpm0.o(fetVar, tj30VarC, shdVar);
            shd shdVar2 = gqw0.w;
            jpm0.o(fetVar, bh90VarM, shdVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            shd shdVar3 = gqw0.y;
            jpm0.o(fetVar, numValueOf, shdVar3);
            jpm0.n(fetVar);
            shd shdVar4 = gqw0.v;
            jpm0.o(fetVar, mm40VarC0, shdVar4);
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar, 0);
            int iHashCode2 = Long.hashCode(fetVar.T);
            bh90 bh90VarM2 = fetVar.m();
            jm40 jm40Var = jm40.b;
            mm40 mm40VarC1 = kbc.c0(fetVar, jm40Var);
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(pcyVar);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, x5dVarA, shdVar);
            jpm0.o(fetVar, bh90VarM2, shdVar2);
            vqd.u(iHashCode2, fetVar, shdVar3, fetVar);
            jpm0.o(fetVar, mm40VarC1, shdVar4);
            mm40 mm40VarE = o7k0.e(s5x0.N(jm40Var, 0.0f, 8.0f, 0.0f, 0.0f, 13).e(new wkw(gqw0.n)), 20.0f);
            thg0 thg0VarA = shg0.a(uc9.f35418a, gqw0.k, fetVar, 48);
            int iHashCode3 = Long.hashCode(fetVar.T);
            bh90 bh90VarM3 = fetVar.m();
            mm40 mm40VarC2 = kbc.c0(fetVar, mm40VarE);
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(pcyVar);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, thg0VarA, shdVar);
            jpm0.o(fetVar, bh90VarM3, shdVar2);
            vqd.u(iHashCode3, fetVar, shdVar3, fetVar);
            jpm0.o(fetVar, mm40VarC2, shdVar4);
            if (z) {
                j4 = j;
                mm40VarP = o7k0.p(i120.Q(jm40Var, j4, vgg0.f37379a), 20.0f, 20.0f);
            } else {
                j4 = j;
                mm40VarP = jm40Var;
            }
            j0x.b(a8k0.F(i2, (i5 >> 18) & 14, fetVar), null, o2e.e0(mm40VarP, String.valueOf(i2)), null, null, 0.0f, new m78(j2, 5), fetVar, 56, 56);
            fetVar.r(true);
            i4 = i;
            v8q0.a(rsm0.w(i4, (i5 >> 15) & 14, fetVar), s5x0.M(jm40Var, 12.0f, 4.0f, 12.0f, 8.0f), j4, null, 0L, null, null, null, 0L, null, 0L, 2, false, 2, 0, null, new y9q0(0L, qmk.r, null, j1t0.b, 0L, null, 0, 0, qmk.F, 16646109), fetVar, (i5 << 3) & 896, 24960, 110584);
            fetVar.r(true);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new qcd(mm40Var, j, j2, j3, z, i4, i2, i3);
        }
    }

    public static final void a0(ViewGroup viewGroup) {
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            if (childAt != null) {
                if (childAt.getClass().isAnnotationPresent(wfk.class) && childAt.getHeight() >= M(1)) {
                    if (childAt instanceof ViewGroup) {
                        childAt.setBackgroundColor(-65281);
                    } else {
                        jmu0.j(childAt, ColorStateList.valueOf(-16711681));
                    }
                    childAt.setAlpha(0.5f);
                }
                ViewGroup viewGroup2 = childAt instanceof ViewGroup ? (ViewGroup) childAt : null;
                if (viewGroup2 != null) {
                    a0(viewGroup2);
                }
            }
        }
    }

    public static final void b(hdp0 hdp0Var, boolean z, String str, boolean z2, Function2 function2, fet fetVar) {
        y9q0 y9q0Var;
        str.getClass();
        pz40 pz40VarF = androidx.compose.runtime.e.f(Boolean.valueOf(z), fetVar);
        pz40 pz40VarF2 = androidx.compose.runtime.e.f(Boolean.valueOf(z2), fetVar);
        pz40 pz40VarF3 = androidx.compose.runtime.e.f(str, fetVar);
        l5d0 l5d0VarA = eap.b.a(w6n.g);
        zfn zfnVar = icp0.f14546a;
        zcl zclVar = qmk.f28987a;
        l5d0 l5d0VarA2 = zfnVar.a(new ycl(36.0f));
        zfn zfnVar2 = fgp0.c;
        if (((Boolean) pz40VarF.getValue()).booleanValue()) {
            y9q0Var = new y9q0(0L, qmk.q, null, j1t0.f15753a, 0L, null, 0, 0, qmk.D, 16646109);
        } else {
            y9q0Var = new y9q0(0L, qmk.q, null, j1t0.b, 0L, null, 0, 0, qmk.D, 16646045);
        }
        obc.e(new l5d0[]{l5d0VarA, l5d0VarA2, zfnVar2.a(y9q0Var), xfp.f40801a.a(new ycl(28.0f)), eap.f7478a.a(fetVar.k(bmd.n)), fgp0.f9504a.a(gqw0.d), dw9.k(5, fgp0.b)}, u1c.M(21545591, new ba00(pz40VarF, pz40VarF2, hdp0Var, pz40VarF3, function2), fetVar), fetVar, 48);
    }

    public static final float b0(fet fetVar) {
        float fR0 = ((w6k) fetVar.k(bmd.h)).r0((int) (((yez) ((rhv0) fetVar.k(bmd.u))).b() >> 32)) * 0.9f;
        boolean zD = fetVar.d(fR0);
        Object objP = fetVar.P();
        if (zD || objP == ukd.f35823a) {
            ycl yclVar = new ycl(fR0);
            zcl zclVar = qmk.f28987a;
            objP = (ycl) idd.e(yclVar, new ycl(400.0f));
            fetVar.o0(objP);
        }
        return ((ycl) objP).f42389a;
    }

    public static final void c(int i, fet fetVar) {
        fetVar.g0(1446218278);
        if (fetVar.U(i & 1, i != 0)) {
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarN = o7k0.n(jm40.b, 176.0f);
            zcl zclVar2 = qmk.g;
            ugg0 ugg0Var = vgg0.f37379a;
            zq8.a(0, fetVar, xbc.c0(h97.e(zclVar2, zclVar2, zclVar2, zclVar2, mm40VarN), vbc.d0(null, fetVar, 0, 1)));
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new p1h(i, (byte) 20);
        }
    }

    public static final void c0(LinkedHashMap linkedHashMap, HashMap map) {
        for (Map.Entry entry : map.entrySet()) {
            if (((List) entry.getValue()).isEmpty()) {
                linkedHashMap.remove(entry.getKey());
            }
        }
    }

    public static final void d(mm40 mm40Var, DateRangeModel dateRangeModel, Locale locale, Calendar calendar, String str, String str2, fet fetVar, int i) {
        int i2;
        boolean z;
        fet fetVar2 = fetVar;
        calendar.getClass();
        str.getClass();
        str2.getClass();
        fetVar2.g0(-775159264);
        if ((i & 6) == 0) {
            i2 = (fetVar2.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? fetVar2.g(dateRangeModel) : fetVar2.i(dateRangeModel) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar2.g(locale) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= fetVar2.i(calendar) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= fetVar2.g(str) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= fetVar2.g(str2) ? 131072 : 65536;
        }
        int i3 = i2;
        if (fetVar2.U(i3 & 1, (74899 & i3) != 74898)) {
            yx7 yx7Var = gqw0.k;
            mm40 mm40VarE = o7k0.e(mm40Var, kej.f18156a);
            zfn zfnVar = zaq0.b;
            mm40 mm40VarQ = i120.Q(mm40VarE, ((ThemeColors) fetVar2.k(zfnVar)).getBackground(), kej.b);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarL = s5x0.L(mm40VarQ, 16.0f, 0.0f, 2);
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
            SimpleDate simpleDate = dateRangeModel.f47284a;
            SimpleDate simpleDate2 = dateRangeModel.b;
            jm40 jm40Var = jm40.b;
            if (simpleDate != null && simpleDate2 != null) {
                fetVar2.e0(1435614660);
                int i4 = i3 << 6;
                int i5 = 518 | (57344 & i4) | (i4 & 458752);
                e(null, dateRangeModel.f47284a, 6, locale, calendar, fetVar2, i5);
                qxw.o(fetVar2, o7k0.s(jm40Var, 4.0f));
                s(0, fetVar2, null);
                qxw.o(fetVar2, o7k0.s(jm40Var, 4.0f));
                e(null, dateRangeModel.b, 5, locale, calendar, fetVar2, i5);
                fetVar2.r(false);
                z = true;
            } else if (simpleDate == null || simpleDate2 != null) {
                float f = 1.0f;
                z = true;
                fetVar2.e0(1437099436);
                ((g1t0) fetVar2.k(j1t0.e)).getClass();
                y9q0 y9q0VarD = g1t0.d();
                long secondary = ((ThemeColors) fetVar2.k(zfnVar)).getSecondary();
                if (1.0f <= 0.0d) {
                    vcx.a("invalid weight; must be greater than zero");
                }
                if (1.0f > Float.MAX_VALUE) {
                    f = Float.MAX_VALUE;
                }
                v8q0.a(str, mm40Var.e(new x7z(f, true)), secondary, null, 0L, null, null, null, 0L, new f2q0(3), 0L, 2, false, 1, 0, null, y9q0VarD, fetVar, (i3 >> 12) & 14, 24960, 109560);
                fetVar2 = fetVar;
                fetVar2.r(false);
            } else {
                fetVar2.e0(1436291762);
                int i6 = i3 << 6;
                e(null, dateRangeModel.f47284a, 6, locale, calendar, fetVar2, 518 | (i6 & 57344) | (i6 & 458752));
                qxw.o(fetVar2, o7k0.s(jm40Var, 4.0f));
                s(0, fetVar2, null);
                qxw.o(fetVar2, o7k0.s(jm40Var, 4.0f));
                ((g1t0) fetVar2.k(j1t0.e)).getClass();
                y9q0 y9q0VarD2 = g1t0.d();
                long secondary2 = ((ThemeColors) fetVar2.k(zfnVar)).getSecondary();
                if (1.0f <= 0.0d) {
                    vcx.a("invalid weight; must be greater than zero");
                }
                z = true;
                v8q0.a(str2, new x7z(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), secondary2, null, 0L, null, null, null, 0L, new f2q0(5), 0L, 2, false, 1, 0, null, y9q0VarD2, fetVar, (i3 >> 15) & 14, 24960, 109560);
                fetVar2 = fetVar;
                fetVar2.r(false);
            }
            fetVar2.r(z);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new cg0((Object) mm40Var, (Object) dateRangeModel, (Object) locale, (Object) calendar, (Object) str, (Object) str2, i, (byte) 12);
        }
    }

    public static final xkp d0(rbb rbbVar, ArrayList arrayList, long j, boolean z) {
        long j2 = rbbVar.f30176a;
        String str = rbbVar.c;
        long j3 = rbbVar.n;
        String strP = P(rbbVar);
        int i = (int) j;
        pgb pgbVar = rbbVar.o;
        boolean z2 = true;
        if (pgbVar != pgb.b) {
            z2 = false;
        }
        return new xkp(j2, str, j3, rbbVar.m, strP, i, arrayList, z2, pgbVar == pgb.c, z);
    }

    public static final void e(mm40 mm40Var, SimpleDate simpleDate, int i, Locale locale, Calendar calendar, fet fetVar, int i2) {
        int i3;
        mm40 mm40Var2;
        fetVar.g0(1122675781);
        int i4 = i2 & 6;
        zhg0 zhg0Var = zhg0.f44392a;
        if (i4 == 0) {
            i3 = (fetVar.g(zhg0Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        int i5 = i3 | 48;
        if ((i2 & 384) == 0) {
            i5 |= (i2 & 512) == 0 ? fetVar.g(simpleDate) : fetVar.i(simpleDate) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i5 |= fetVar.e(i) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i5 |= fetVar.g(locale) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i5 |= fetVar.i(calendar) ? 131072 : 65536;
        }
        if (fetVar.U(i5 & 1, (74899 & i5) != 74898)) {
            simpleDate.getClass();
            calendar.getClass();
            wdx.J(simpleDate, calendar);
            String str = new SimpleDateFormat(DateFormat.getBestDateTimePattern(locale, "yyyyMMdd"), locale).format(calendar.getTime());
            str.getClass();
            ((g1t0) fetVar.k(j1t0.e)).getClass();
            y9q0 y9q0VarD = g1t0.d();
            long textPrimary = ((ThemeColors) fetVar.k(zaq0.b)).getTextPrimary();
            jm40 jm40Var = jm40.b;
            mm40Var2 = jm40Var;
            v8q0.a(str, zhg0Var.a(1.0f, jm40Var, true), textPrimary, null, 0L, null, null, null, 0L, new f2q0(i), 0L, 2, false, 1, 0, null, y9q0VarD, fetVar, 0, ((i5 >> 9) & 14) | 24960, 109560);
        } else {
            fetVar.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new g13(mm40Var2, simpleDate, i, locale, calendar, i2);
        }
    }

    public static final ArrayList e0(LinkedHashMap linkedHashMap, HashMap map) {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            Object arrayList2 = map.get(entry.getKey());
            if (arrayList2 == null) {
                arrayList2 = new ArrayList();
            }
            ((List) arrayList2).add(0, entry.getValue());
            w3d.u(arrayList, (Iterable) arrayList2);
        }
        return arrayList;
    }

    public static final void f(mm40 mm40Var, pnl pnlVar, Function0 function0, fet fetVar, int i) {
        int i2;
        fetVar.g0(570671129);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.g(pnlVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.i(function0) ? 256 : 128;
        }
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            fetVar.e0(-1340851407);
            g(mm40Var, pnlVar, function0, fetVar, i2 & 1022);
            fetVar.r(false);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new nnl(mm40Var, pnlVar, function0, i, (byte) 4);
        }
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0028  */
    /* JADX WARN: Code duplicated, block: B:17:0x0030  */
    /* JADX WARN: Code duplicated, block: B:18:0x0034  */
    /* JADX WARN: Code duplicated, block: B:21:0x0050  */
    /* JADX WARN: Code duplicated, block: B:22:0x0058  */
    /* JADX WARN: Code duplicated, block: B:25:0x0065  */
    /* JADX WARN: Code duplicated, block: B:26:0x0067  */
    /* JADX WARN: Code duplicated, block: B:29:0x008a  */
    /* JADX WARN: Code duplicated, block: B:31:0x008e  */
    public static final olp f0(sum0 sum0Var, boolean z, Set set, boolean z2, zmb zmbVar, Set set2) {
        Set set3;
        boolean z3;
        boolean z4;
        boolean z5;
        long j;
        int i;
        long j2;
        pgb pgbVar;
        boolean z6;
        long j3;
        long j4;
        long j5;
        boolean z7;
        boolean z8;
        if (z2) {
            set3 = set2;
            if (set3.contains(Long.valueOf(sum0Var.f32829a))) {
                z3 = true;
            }
            if (!z3 || set3.size() < 10) {
                z4 = true;
            } else {
                z4 = false;
            }
            z5 = sum0Var.k;
            j = sum0Var.e;
            if (z5) {
                i = R.drawable.ic_glyph_favourite_active;
            } else {
                i = R.drawable.ic_glyph_favourite_inactive;
            }
            j2 = sum0Var.f32829a;
            String str = sum0Var.c;
            long j6 = sum0Var.l;
            int i2 = sum0Var.i;
            String strQ = Q(sum0Var, zmbVar);
            int i3 = (int) j;
            pgbVar = sum0Var.n;
            if (pgbVar == pgb.b) {
                j4 = j2;
                j3 = j;
                z6 = true;
            } else {
                z6 = false;
                j3 = j;
                j4 = j2;
            }
            j5 = j3;
            if (pgbVar == pgb.c) {
                z7 = true;
            } else {
                z7 = false;
            }
            jlp jlpVar = new jlp(sum0Var.k, i);
            List list = sum0Var.m;
            yi00 yi00Var = new yi00(0);
            boolean zContains = set.contains(Long.valueOf(sum0Var.f32829a));
            if (j5 > 0) {
                z8 = true;
            } else {
                z8 = false;
            }
            return new olp(j4, str, j6, i2, strQ, i3, z6, z7, list, jlpVar, z, yi00Var, z2, z3, zContains, z8, z4);
        }
        set3 = set2;
        z3 = false;
        if (z3) {
            z4 = true;
        } else {
            z4 = true;
        }
        z5 = sum0Var.k;
        j = sum0Var.e;
        if (z5) {
            i = R.drawable.ic_glyph_favourite_active;
        } else {
            i = R.drawable.ic_glyph_favourite_inactive;
        }
        j2 = sum0Var.f32829a;
        String str2 = sum0Var.c;
        long j7 = sum0Var.l;
        int i4 = sum0Var.i;
        String strQ2 = Q(sum0Var, zmbVar);
        int i5 = (int) j;
        pgbVar = sum0Var.n;
        if (pgbVar == pgb.b) {
            j4 = j2;
            j3 = j;
            z6 = true;
        } else {
            z6 = false;
            j3 = j;
            j4 = j2;
        }
        j5 = j3;
        if (pgbVar == pgb.c) {
            z7 = true;
        } else {
            z7 = false;
        }
        jlp jlpVar2 = new jlp(sum0Var.k, i);
        List list2 = sum0Var.m;
        yi00 yi00Var2 = new yi00(0);
        boolean zContains2 = set.contains(Long.valueOf(sum0Var.f32829a));
        if (j5 > 0) {
            z8 = true;
        } else {
            z8 = false;
        }
        return new olp(j4, str2, j7, i4, strQ2, i5, z6, z7, list2, jlpVar2, z, yi00Var2, z2, z3, zContains2, z8, z4);
    }

    public static final void g(mm40 mm40Var, pnl pnlVar, Function0 function0, fet fetVar, int i) {
        int i2;
        fet fetVar2 = fetVar;
        fetVar2.g0(-1752979164);
        if ((i & 6) == 0) {
            i2 = (fetVar2.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar2.g(pnlVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar2.i(function0) ? 256 : 128;
        }
        if (fetVar2.U(i2 & 1, (i2 & 147) != 146)) {
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarJ = lgb.J(mm40Var, vgg0.a(16.0f));
            zfn zfnVar = m8m0.f21378a;
            mm40 mm40VarQ = i120.Q(mm40VarJ, ((StaticColors) fetVar2.k(zfnVar)).m95getGray0d7_KjU(), jd8.n);
            boolean z = (i2 & 896) == 256;
            Object objP = fetVar2.P();
            if (z || objP == ukd.f35823a) {
                objP = new b1i(function0, (byte) 23);
                fetVar2.o0(objP);
            }
            mm40 mm40VarF = phu0.F(mm40VarQ, null, null, false, null, (Function0) objP, fetVar, 0, 15);
            tj30 tj30VarC = zq8.c(gqw0.d, false);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarF);
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
            jpm0.o(fetVar, tj30VarC, shdVar);
            shd shdVar2 = gqw0.w;
            jpm0.o(fetVar, bh90VarM, shdVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            shd shdVar3 = gqw0.y;
            jpm0.o(fetVar, numValueOf, shdVar3);
            jpm0.n(fetVar);
            shd shdVar4 = gqw0.v;
            jpm0.o(fetVar, mm40VarC0, shdVar4);
            boolean z3 = fetVar.k(bmd.n) == k6z.b;
            jm40 jm40Var = jm40.b;
            k7x.a(pnlVar.d.a(), null, o7k0.d(o7k0.e(yyw.V(jm40Var, z3), 72.0f), 1.0f), gqw0.A, null, fetVar, 1572912, 1976);
            mm40 mm40VarN = s5x0.N(jm40Var, 16.0f, 0.0f, 72.0f, 0.0f, 10);
            x5d x5dVarA = w5d.a(new qw3(4.0f, true, new jf4((byte) 14)), gqw0.m, fetVar, 0);
            int iHashCode2 = Long.hashCode(fetVar.T);
            bh90 bh90VarM2 = fetVar.m();
            mm40 mm40VarC1 = kbc.c0(fetVar, mm40VarN);
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(pcyVar);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, x5dVarA, shdVar);
            jpm0.o(fetVar, bh90VarM2, shdVar2);
            vqd.u(iHashCode2, fetVar, shdVar3, fetVar);
            jpm0.o(fetVar, mm40VarC1, shdVar4);
            String str = pnlVar.f27294a;
            zfn zfnVar2 = j1t0.e;
            ((g1t0) fetVar.k(zfnVar2)).getClass();
            v8q0.a(str, null, ((StaticColors) fetVar.k(zfnVar)).m123getWhite0d7_KjU(), new n05(qmk.q, qmk.s, qmk.n), 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, g1t0.j(), fetVar, 0, 24960, 110578);
            String str2 = pnlVar.b;
            ((g1t0) fetVar.k(zfnVar2)).getClass();
            v8q0.a(str2, null, ((StaticColors) fetVar.k(zfnVar)).m123getWhite0d7_KjU(), null, 0L, null, null, null, 0L, null, 0L, 2, false, 2, 0, null, g1t0.g(), fetVar, 0, 24960, 110586);
            fetVar2 = fetVar;
            fetVar2.r(true);
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new nnl(mm40Var, pnlVar, function0, i, (byte) 5);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final b2o0 g0(d0t d0tVar, ctf0 ctf0Var, m5l0 m5l0Var, v5l0 v5l0Var, String str, String str2, List list, boolean z, boolean z2, boolean z3, boolean z4) {
        b2o0 w1o0Var;
        boolean z5;
        d0tVar.getClass();
        Date date = d0tVar.P;
        String str3 = d0tVar.c;
        long j = d0tVar.v;
        ctf0Var.getClass();
        list.getClass();
        str.getClass();
        v5l0Var.getClass();
        str2.getClass();
        int iOrdinal = v5l0Var.ordinal();
        Object d2iVar = null;
        if (iOrdinal == 0) {
            w1o0Var = new w1o0(d0tVar.f5282a, ibm0.u(d0tVar, str, str2, list, z2, z3, z4, kpb.b0(d0tVar, z), kpb.d0(d0tVar, z)), new a4o0(new pws0(qzb.c0(d0tVar), kbc.U(d0tVar)), new pws0(qzb.r0(d0tVar), kbc.V(d0tVar)), new lpm(opm.f25648a, new hpm(0L, 3)), qzb.B0(d0tVar) ? new p0n(kpb.q0(d0tVar), fgm.b, date.getTime(), false, 24) : null, j == 40 ? str3 : kpb.X(d0tVar)), jn8.a(d0tVar, v5l0Var, ctf0Var, m5l0Var));
        } else if (iOrdinal == 1) {
            w1o0Var = new a2o0(d0tVar.f5282a, ibm0.y(d0tVar, str, list, z2, z3, str2, kpb.b0(d0tVar, z), kpb.d0(d0tVar, z)), new g5o0(new qws0(qzb.c0(d0tVar)), new qws0(qzb.r0(d0tVar)), qzb.B0(d0tVar) ? new p0n(kpb.q0(d0tVar), fgm.b, date.getTime(), false, 24) : null, j == 40 ? str3 : kpb.X(d0tVar), pem.f26861a), jn8.a(d0tVar, v5l0Var, ctf0Var, m5l0Var));
        } else if (iOrdinal != 2) {
            c2m c2mVar = c2m.f3631a;
            if (iOrdinal == 3) {
                String strX = str3;
                z5 = j == 40;
                long j2 = d0tVar.f5282a;
                n0x n0xVar = new n0x(dtb.F(str));
                if (!z5) {
                    strX = kpb.X(d0tVar);
                }
                w1o0Var = new y1o0(j2, ibm0.w(d0tVar, str, strX, list, z2, z3, qzb.B0(d0tVar), str2, kpb.b0(d0tVar, z), kpb.d0(d0tVar, z)), new q4o0(new sws0(qzb.c0(d0tVar), kbc.U(d0tVar)), new sws0(qzb.r0(d0tVar), kbc.V(d0tVar)), new z1m(c2mVar)), jn8.a(d0tVar, v5l0Var, ctf0Var, m5l0Var), n0xVar);
            } else {
                if (iOrdinal != 4) {
                    t9f.b();
                    return null;
                }
                w1o0Var = new x1o0(d0tVar.f5282a, ibm0.v(d0tVar, str, str2, list, z2, z3, z4, kpb.b0(d0tVar, z), kpb.d0(d0tVar, z)), new i4o0(new z1m(c2mVar), qzb.B0(d0tVar) ? new p0n(kpb.q0(d0tVar), fgm.b, date.getTime(), false, 24) : null, new tws0(qzb.c0(d0tVar), kbc.U(d0tVar)), new tws0(qzb.r0(d0tVar), kbc.V(d0tVar)), j == 40 ? str3 : kpb.X(d0tVar)), jn8.a(d0tVar, v5l0Var, ctf0Var, m5l0Var));
            }
        } else {
            long j3 = d0tVar.f5282a;
            k4i k4iVarX = ibm0.x(d0tVar, str, list, z2, z3, str2, kpb.b0(d0tVar, z), kpb.d0(d0tVar, z));
            z5 = j == 40;
            rws0 rws0Var = new rws0(qzb.c0(d0tVar), kbc.U(d0tVar));
            rws0 rws0Var2 = new rws0(qzb.r0(d0tVar), kbc.V(d0tVar));
            p0n p0nVar = qzb.B0(d0tVar) ? new p0n(kpb.q0(d0tVar), fgm.b, date.getTime(), false, 24) : null;
            String strX2 = z5 ? str3 : kpb.X(d0tVar);
            if (d0tVar.S && z4) {
                d2iVar = new d2i();
            }
            w1o0Var = new z1o0(j3, k4iVarX, new y4o0(d2iVar, p0nVar, rws0Var, rws0Var2, strX2), jn8.a(d0tVar, v5l0Var, ctf0Var, m5l0Var));
        }
        return w1o0Var;
    }

    public static final void h(mm40 mm40Var, ao60 ao60Var, Function1 function1, Function0 function0, fet fetVar, int i) {
        Function1 function2;
        function1.getClass();
        function0.getClass();
        fetVar.g0(1296492992);
        int i2 = i | (fetVar.g(ao60Var) ? 32 : 16) | (fetVar.i(function0) ? 2048 : 1024);
        if (fetVar.U(i2 & 1, (i2 & 1171) != 1170)) {
            mm40 mm40VarD = o7k0.d(mm40Var, 1.0f);
            zcl zclVar = qmk.f28987a;
            byte b = 2;
            mm40 mm40VarL = s5x0.L(mm40VarD, 16.0f, 0.0f, 2);
            x5d x5dVarA = w5d.a(uc9.c, gqw0.n, fetVar, 48);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarL);
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
            o0x o0xVar = ao60Var.f1187a;
            o0x o0xVar2 = ao60Var.b;
            Object objP = fetVar.P();
            if (objP == ukd.f35823a) {
                function2 = function1;
                objP = new ynk(function2, (byte) 18);
                fetVar.o0(objP);
            } else {
                function2 = function1;
            }
            ibm0.e(o0xVar, o0xVar2, (Function1) objP, u1c.M(191590417, new ftc(function0, b), fetVar), u1c.M(520957480, new cxj(function0, ao60Var, (byte) 21), fetVar), fetVar, 27648);
            qxw.o(fetVar, o7k0.e(jm40.b, 12.0f));
            j6n.h("Recommended", dqo0.f6527a, null, 0, 0, fetVar, 54, 28);
            fetVar.r(true);
        } else {
            function2 = function1;
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new eqk((Object) mm40Var, (Object) ao60Var, function2, (wdr) function0, i, (byte) 9);
        }
    }

    public static final y9q0 h0(i0d i0dVar) {
        i0dVar.getClass();
        int iOrdinal = i0dVar.ordinal();
        if (iOrdinal == 0) {
            return new y9q0(0L, qmk.q, null, j1t0.f15753a, 0L, null, 0, 0, qmk.D, 16646109);
        }
        if (iOrdinal == 1) {
            return new y9q0(0L, qmk.r, null, j1t0.f15753a, 0L, null, 0, 0, qmk.F, 16646109);
        }
        if (iOrdinal == 2) {
            return new y9q0(0L, qmk.s, null, j1t0.f15753a, 0L, null, 0, 0, qmk.G, 16646109);
        }
        if (iOrdinal == 3) {
            return new y9q0(0L, qmk.t, null, j1t0.f15753a, 0L, null, 0, 0, idm0.t(22), 16646109);
        }
        if (iOrdinal == 4) {
            return new y9q0(0L, qmk.u, null, j1t0.f15753a, 0L, null, 0, 0, qmk.H, 16646109);
        }
        t9f.b();
        return null;
    }

    public static final void i(int i, fet fetVar, mm40 mm40Var, String str) {
        int i2;
        fet fetVar2 = fetVar;
        str.getClass();
        fetVar2.g0(317384210);
        if ((i & 6) == 0) {
            i2 = i | (fetVar.g(mm40Var) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar2.g(str) ? 32 : 16;
        }
        if (fetVar2.U(i2 & 1, (i2 & 19) != 18)) {
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarE = o7k0.e(o7k0.s(mm40Var, 20.0f), 16.0f);
            zcl zclVar2 = qmk.d;
            ugg0 ugg0Var = vgg0.f37379a;
            mm40 mm40VarE2 = h97.e(zclVar2, zclVar2, zclVar2, zclVar2, mm40VarE);
            zfn zfnVar = m8m0.f21378a;
            mm40 mm40VarQ = i120.Q(mm40VarE2, ((StaticColors) fetVar2.k(zfnVar)).m125getWhite100d7_KjU(), jd8.n);
            tj30 tj30VarC = zq8.c(gqw0.e, false);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarQ);
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
            String strL = ttm0.L(2, str);
            ((g1t0) fetVar2.k(j1t0.e)).getClass();
            v8q0.a(strL, null, ((StaticColors) fetVar2.k(zfnVar)).m123getWhite0d7_KjU(), null, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, g1t0.c(), fetVar, 0, 0, 131066);
            fetVar2 = fetVar;
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new cx(mm40Var, str, i, (byte) 10);
        }
    }

    public static final void j(mm40 mm40Var, boolean z, oim oimVar, Function2 function2, Function1 function1, fet fetVar, int i) {
        int i2;
        Function1 function3;
        Object qipVar;
        Object obj;
        oimVar.getClass();
        boolean z2 = oimVar.e;
        String str = oimVar.d;
        String str2 = oimVar.c;
        String str3 = oimVar.j;
        function1.getClass();
        fetVar.g0(49468778);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.h(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.g(oimVar) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= fetVar.i(function2) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= fetVar.i(function1) ? 16384 : 8192;
        }
        if (fetVar.U(i2 & 1, (i2 & 9363) != 9362)) {
            zcl zclVar = qmk.f28987a;
            androidx.compose.runtime.d dVar = zaq0.b;
            long backgroundContent = ((ThemeColors) fetVar.k(dVar)).getBackgroundContent();
            long separator60 = ((ThemeColors) fetVar.k(dVar)).getSeparator60();
            int i3 = i2;
            boolean zF = ((i2 & 112) == 32) | fetVar.f(backgroundContent) | fetVar.d(1.0f) | fetVar.f(separator60);
            Object objP = fetVar.P();
            Object obj2 = ukd.f35823a;
            if (zF || objP == obj2) {
                obj = obj2;
                qipVar = new qip(backgroundContent, z, separator60);
                fetVar.o0(qipVar);
            } else {
                qipVar = objP;
                obj = obj2;
            }
            mm40 mm40VarK = rq8.K(mm40Var, (Function1) qipVar);
            boolean z3 = false;
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar, 0);
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
            long secondary = ((ThemeColors) fetVar.k(dVar)).getSecondary();
            long secondary2 = ((ThemeColors) fetVar.k(dVar)).getSecondary();
            boolean zG = fetVar.g(oimVar.f25319a) | fetVar.g(str3);
            Object objP2 = fetVar.P();
            if (zG || objP2 == obj) {
                String str4 = oimVar.f25319a;
                fa50 fa50Var = fa50.f9191a;
                objP2 = str3 != null ? new rlm(str4, str3, secondary, secondary2, fa50Var) : new plm(str4, ha50.TWO_LINES, secondary, fa50Var);
                fetVar.o0(objP2);
            }
            tlm tlmVar = (tlm) objP2;
            boolean zG2 = fetVar.g(str2) | fetVar.g(str) | fetVar.h(z2);
            Object objP3 = fetVar.P();
            if (zG2 || objP3 == obj) {
                objP3 = new nlm(new hmm(2, str, str2, z2));
                fetVar.o0(objP3);
            }
            nlm nlmVar = (nlm) objP3;
            if (oimVar.b) {
                tlmVar = nlmVar;
            }
            gmm gmmVar = oimVar.f;
            int i4 = i3 & 57344;
            boolean z4 = i4 == 16384 ? true : z3;
            Object objP4 = fetVar.P();
            if (z4 || objP4 == obj) {
                objP4 = new qyo(function1, (byte) 21);
                fetVar.o0(objP4);
            }
            Object obj3 = obj;
            t(tlmVar, gmmVar, (Function1) objP4, function1, fetVar, (i3 >> 3) & 7168);
            function3 = function1;
            if (oimVar.h.isEmpty()) {
                fetVar.e0(-960182258);
                fetVar.r(z3);
            } else {
                fetVar.e0(-960708886);
                pz40 pz40VarF = androidx.compose.runtime.e.f(oimVar, fetVar);
                a4x a4xVar = oimVar.h;
                dxh0 dxh0Var = ((oim) pz40VarF.getValue()).i;
                boolean zG3 = fetVar.g(pz40VarF);
                Object objP5 = fetVar.P();
                if (zG3 || objP5 == obj3) {
                    objP5 = new rip(pz40VarF, z3);
                    fetVar.o0(objP5);
                }
                Function0 function0 = (Function0) objP5;
                boolean zG4 = (i4 == 16384 ? true : z3) | fetVar.g(pz40VarF);
                Object objP6 = fetVar.P();
                if (zG4 || objP6 == obj3) {
                    objP6 = new jg2(function3, pz40VarF, (byte) 17);
                    fetVar.o0(objP6);
                }
                z(a4xVar, dxh0Var, function0, (Function1) objP6, fetVar, 0);
                fetVar.r(z3);
            }
            if (function2 == null) {
                fetVar.e0(-960154235);
                fetVar.r(z3);
            } else {
                fetVar.e0(1354500604);
                h97.q((i3 >> 9) & 14, fetVar, function2, z3);
            }
            fetVar.r(true);
        } else {
            function3 = function1;
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new mg((byte) 22, i, (wdr) function3, (Object) mm40Var, (Object) oimVar, (Object) function2, z);
        }
    }

    /* JADX WARN: Code duplicated, block: B:102:0x01be  */
    /* JADX WARN: Code duplicated, block: B:104:0x01c2  */
    /* JADX WARN: Code duplicated, block: B:106:0x01c6  */
    /* JADX WARN: Code duplicated, block: B:107:0x01c8  */
    /* JADX WARN: Code duplicated, block: B:113:0x01dc  */
    /* JADX WARN: Code duplicated, block: B:116:0x0204  */
    /* JADX WARN: Code duplicated, block: B:117:0x0206  */
    /* JADX WARN: Code duplicated, block: B:121:0x020f  */
    /* JADX WARN: Code duplicated, block: B:124:0x0240  */
    /* JADX WARN: Code duplicated, block: B:125:0x0246  */
    /* JADX WARN: Code duplicated, block: B:128:0x0268  */
    /* JADX WARN: Code duplicated, block: B:131:0x0296  */
    /* JADX WARN: Code duplicated, block: B:134:0x02b4  */
    /* JADX WARN: Code duplicated, block: B:136:0x02b9  */
    /* JADX WARN: Code duplicated, block: B:139:0x02cb  */
    /* JADX WARN: Code duplicated, block: B:142:0x0308  */
    /* JADX WARN: Code duplicated, block: B:144:0x0311  */
    /* JADX WARN: Code duplicated, block: B:147:0x031c  */
    /* JADX WARN: Code duplicated, block: B:149:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:40:0x006e  */
    /* JADX WARN: Code duplicated, block: B:42:0x0076  */
    /* JADX WARN: Code duplicated, block: B:43:0x0079  */
    /* JADX WARN: Code duplicated, block: B:45:0x007d  */
    /* JADX WARN: Code duplicated, block: B:48:0x0086  */
    /* JADX WARN: Code duplicated, block: B:49:0x0088  */
    /* JADX WARN: Code duplicated, block: B:52:0x0091  */
    /* JADX WARN: Code duplicated, block: B:54:0x0095  */
    /* JADX WARN: Code duplicated, block: B:55:0x0097  */
    /* JADX WARN: Code duplicated, block: B:57:0x009a  */
    /* JADX WARN: Code duplicated, block: B:58:0x009d  */
    /* JADX WARN: Code duplicated, block: B:61:0x00af  */
    /* JADX WARN: Code duplicated, block: B:64:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:67:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:68:0x00da  */
    /* JADX WARN: Code duplicated, block: B:71:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:74:0x0116  */
    /* JADX WARN: Code duplicated, block: B:77:0x0123  */
    /* JADX WARN: Code duplicated, block: B:78:0x0126  */
    /* JADX WARN: Code duplicated, block: B:81:0x0148  */
    /* JADX WARN: Code duplicated, block: B:82:0x014a  */
    /* JADX WARN: Code duplicated, block: B:86:0x0153 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:88:0x0156  */
    /* JADX WARN: Code duplicated, block: B:92:0x016f  */
    /* JADX WARN: Code duplicated, block: B:93:0x0171  */
    /* JADX WARN: Code duplicated, block: B:97:0x0182  */
    public static final void k(mm40 mm40Var, uc00 uc00Var, boolean z, boolean z2, Function1 function1, fet fetVar, int i, int i2) {
        mm40 mm40Var2;
        int i3;
        boolean z3;
        boolean z4;
        mm40 mm40Var3;
        boolean z5;
        yfe0 yfe0VarU;
        jm40 jm40Var;
        boolean z6;
        omv omvVar;
        Object objP;
        cl5 cl5Var;
        pz40 pz40Var;
        Object objP2;
        float f;
        Object objP3;
        int i4;
        l7m0 l7m0VarB;
        Object objP4;
        t33 t33Var;
        float f2;
        yje yjeVar;
        l7m0 l7m0VarA;
        boolean z7;
        Object objP5;
        float fFloatValue;
        int i5;
        boolean z8;
        boolean zI;
        omv omvVar2;
        Object xj1Var;
        pz40 pz40Var2;
        t33 t33Var2;
        boolean z9;
        boolean z10;
        boolean zI2;
        Object zb1Var;
        boolean z11;
        boolean z12;
        Object objP6;
        boolean zD;
        Object objP7;
        boolean zD2;
        Object objP8;
        int i6;
        fet fetVar2 = fetVar;
        function1.getClass();
        fetVar2.g0(773023543);
        int i7 = i2 & 1;
        if (i7 != 0) {
            i3 = i | 6;
            mm40Var2 = mm40Var;
        } else if ((i & 6) == 0) {
            mm40Var2 = mm40Var;
            i3 = (fetVar2.g(mm40Var2) ? 4 : 2) | i;
        } else {
            mm40Var2 = mm40Var;
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= fetVar2.g(uc00Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= fetVar2.h(z) ? 256 : 128;
        }
        int i8 = i2 & 8;
        if (i8 == 0) {
            if ((i & 3072) == 0) {
                z3 = z2;
                i3 |= fetVar2.h(z3) ? 2048 : 1024;
            }
            if ((i & 24576) != 0) {
                if (fetVar2.i(function1)) {
                    i6 = 16384;
                } else {
                    i6 = 8192;
                }
                i3 |= i6;
            }
            if ((i3 & 9363) != 9362) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (fetVar2.U(i3 & 1, z4)) {
                jm40Var = jm40.b;
                if (i7 != 0) {
                    mm40Var3 = jm40Var;
                } else {
                    mm40Var3 = mm40Var2;
                }
                if (i8 != 0) {
                    z6 = true;
                } else {
                    z6 = z3;
                }
                omvVar = (omv) fetVar2.k(bmd.l);
                objP = fetVar2.P();
                cl5Var = ukd.f35823a;
                if (objP == cl5Var) {
                    objP = androidx.compose.runtime.e.e(Boolean.FALSE);
                    fetVar2.o0(objP);
                }
                pz40Var = (pz40) objP;
                objP2 = fetVar2.P();
                if (objP2 == cl5Var) {
                    objP2 = dw9.j(fetVar2);
                }
                gy40 gy40Var = (gy40) objP2;
                if (((Boolean) pz40Var.getValue()).booleanValue()) {
                    f = 0.9f;
                } else {
                    f = 1.0f;
                }
                uts0 uts0VarM0 = ro4.m0(100, 0, null, 6);
                objP3 = fetVar2.P();
                if (objP3 == cl5Var) {
                    objP3 = new wil(pz40Var, (byte) 11);
                    fetVar2.o0(objP3);
                }
                i4 = i3;
                l7m0VarB = d43.b(f, uts0VarM0, null, (Function1) objP3, fetVar2, 24624, 12);
                objP4 = fetVar2.P();
                if (objP4 == cl5Var) {
                    objP4 = xf0.c(1.0f);
                    fetVar2.o0(objP4);
                }
                t33Var = (t33) objP4;
                zcl zclVar = qmk.f28987a;
                if (z) {
                    f2 = 20.0f;
                } else {
                    f2 = 2.0f;
                }
                yjeVar = null;
                l7m0VarA = d43.a(f2, ro4.m0(0, 0, null, 7), null, fetVar2, 48, 12);
                if ((i4 & 7168) == 2048) {
                    z7 = true;
                } else {
                    z7 = false;
                }
                objP5 = fetVar2.P();
                if (z7 || objP5 == cl5Var) {
                    objP5 = Float.valueOf(z6 ? 1.0f : 0.5f);
                    fetVar2.o0(objP5);
                }
                fFloatValue = ((Number) objP5).floatValue();
                Boolean boolValueOf = Boolean.valueOf(z);
                i5 = i4 & 896;
                if (i5 == 256) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                zI = z8 | fetVar2.i(t33Var);
                Object objP9 = fetVar2.P();
                if (!zI || objP9 == cl5Var) {
                    omvVar2 = omvVar;
                    pz40Var2 = pz40Var;
                    xj1Var = new xj1(z, (Object) t33Var, (Object) pz40Var2, yjeVar, (byte) 6);
                    t33Var2 = t33Var;
                    fetVar2.o0(xj1Var);
                } else {
                    xj1Var = objP9;
                    omvVar2 = omvVar;
                    t33Var2 = t33Var;
                    pz40Var2 = pz40Var;
                }
                m0x0.t(fetVar2, boolValueOf, (Function2) xj1Var);
                mm40 mm40VarN = o7k0.n(mm40Var3, 40.0f);
                if ((57344 & i4) == 16384) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                if (i5 == 256) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                zI2 = z9 | z10 | fetVar2.i(omvVar2);
                Object objP10 = fetVar2.P();
                if (!zI2 || objP10 == cl5Var) {
                    zb1Var = new zb1((Object) function1, z, (Object) omvVar2, (Object) pz40Var2, (byte) 2);
                    z11 = z;
                    fetVar2.o0(zb1Var);
                } else {
                    zb1Var = objP10;
                    z11 = z;
                }
                mm40 mm40VarE0 = o2e.e0(y860.W(mm40VarN, gy40Var, null, z6, null, (Function0) zb1Var, 24), "PRIMARY_CHECKBOX");
                if (i5 == 256) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                objP6 = fetVar2.P();
                if (z12 || objP6 == cl5Var) {
                    objP6 = new z((byte) 23, z11);
                    fetVar2.o0(objP6);
                }
                mm40 mm40VarA = pai0.a(mm40VarE0, false, (Function1) objP6);
                tj30 tj30VarC = zq8.c(gqw0.e, false);
                int iHashCode = Long.hashCode(fetVar2.T);
                bh90 bh90VarM = fetVar2.m();
                mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarA);
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
                if (uc00Var instanceof tc00) {
                    fetVar2.e0(-1318792732);
                    float fFloatValue2 = ((Number) l7m0VarB.getValue()).floatValue();
                    float fFloatValue3 = ((Number) t33Var2.d()).floatValue();
                    float f3 = ((ycl) l7m0VarA.getValue()).f42389a;
                    zD2 = fetVar2.d(fFloatValue);
                    objP8 = fetVar2.P();
                    if (zD2 || objP8 == cl5Var) {
                        objP8 = new f54(fFloatValue, (byte) 15);
                        fetVar2.o0(objP8);
                    }
                    fetVar2 = fetVar2;
                    y(i4w0.T(jm40Var, (Function1) objP8), z11, fFloatValue2, fFloatValue3, f3, fetVar2, (i4 >> 3) & 112);
                    fetVar2.r(false);
                } else {
                    fetVar2 = fetVar2;
                    if (uc00Var instanceof sc00) {
                        throw b1j.f(-1012375219, fetVar2, false);
                    }
                    fetVar2.e0(-1318381920);
                    zD = fetVar2.d(fFloatValue);
                    objP7 = fetVar2.P();
                    if (zD || objP7 == cl5Var) {
                        objP7 = new f54(fFloatValue, (byte) 16);
                        fetVar2.o0(objP7);
                    }
                    x(i4w0.T(jm40Var, (Function1) objP7), z, ((Number) l7m0VarB.getValue()).floatValue(), ((Number) t33Var2.d()).floatValue(), ((sc00) uc00Var).f31963a, fetVar2, (i4 >> 3) & 112);
                    fetVar2.r(false);
                }
                fetVar2.r(true);
                z5 = z6;
            } else {
                fetVar2.X();
                mm40Var3 = mm40Var2;
                z5 = z3;
            }
            yfe0VarU = fetVar2.u();
            if (yfe0VarU != null) {
                yfe0VarU.d = new xjm(mm40Var3, uc00Var, z, z5, function1, i, i2);
            }
        }
        i3 |= 3072;
        z3 = z2;
        if ((i & 24576) != 0) {
            if (fetVar2.i(function1)) {
                i6 = 16384;
            } else {
                i6 = 8192;
            }
            i3 |= i6;
        }
        if ((i3 & 9363) != 9362) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (fetVar2.U(i3 & 1, z4)) {
            jm40Var = jm40.b;
            if (i7 != 0) {
                mm40Var3 = jm40Var;
            } else {
                mm40Var3 = mm40Var2;
            }
            if (i8 != 0) {
                z6 = true;
            } else {
                z6 = z3;
            }
            omvVar = (omv) fetVar2.k(bmd.l);
            objP = fetVar2.P();
            cl5Var = ukd.f35823a;
            if (objP == cl5Var) {
                objP = androidx.compose.runtime.e.e(Boolean.FALSE);
                fetVar2.o0(objP);
            }
            pz40Var = (pz40) objP;
            objP2 = fetVar2.P();
            if (objP2 == cl5Var) {
                objP2 = dw9.j(fetVar2);
            }
            gy40 gy40Var2 = (gy40) objP2;
            if (((Boolean) pz40Var.getValue()).booleanValue()) {
                f = 0.9f;
            } else {
                f = 1.0f;
            }
            uts0 uts0VarM1 = ro4.m0(100, 0, null, 6);
            objP3 = fetVar2.P();
            if (objP3 == cl5Var) {
                objP3 = new wil(pz40Var, (byte) 11);
                fetVar2.o0(objP3);
            }
            i4 = i3;
            l7m0VarB = d43.b(f, uts0VarM1, null, (Function1) objP3, fetVar2, 24624, 12);
            objP4 = fetVar2.P();
            if (objP4 == cl5Var) {
                objP4 = xf0.c(1.0f);
                fetVar2.o0(objP4);
            }
            t33Var = (t33) objP4;
            zcl zclVar2 = qmk.f28987a;
            if (z) {
                f2 = 20.0f;
            } else {
                f2 = 2.0f;
            }
            yjeVar = null;
            l7m0VarA = d43.a(f2, ro4.m0(0, 0, null, 7), null, fetVar2, 48, 12);
            if ((i4 & 7168) == 2048) {
                z7 = true;
            } else {
                z7 = false;
            }
            objP5 = fetVar2.P();
            if (z7) {
                objP5 = Float.valueOf(z6 ? 1.0f : 0.5f);
                fetVar2.o0(objP5);
            } else {
                objP5 = Float.valueOf(z6 ? 1.0f : 0.5f);
                fetVar2.o0(objP5);
            }
            fFloatValue = ((Number) objP5).floatValue();
            Boolean boolValueOf2 = Boolean.valueOf(z);
            i5 = i4 & 896;
            if (i5 == 256) {
                z8 = true;
            } else {
                z8 = false;
            }
            zI = z8 | fetVar2.i(t33Var);
            Object objP11 = fetVar2.P();
            if (zI) {
                omvVar2 = omvVar;
                pz40Var2 = pz40Var;
                xj1Var = new xj1(z, (Object) t33Var, (Object) pz40Var2, yjeVar, (byte) 6);
                t33Var2 = t33Var;
                fetVar2.o0(xj1Var);
            } else {
                omvVar2 = omvVar;
                pz40Var2 = pz40Var;
                xj1Var = new xj1(z, (Object) t33Var, (Object) pz40Var2, yjeVar, (byte) 6);
                t33Var2 = t33Var;
                fetVar2.o0(xj1Var);
            }
            m0x0.t(fetVar2, boolValueOf2, (Function2) xj1Var);
            mm40 mm40VarN2 = o7k0.n(mm40Var3, 40.0f);
            if ((57344 & i4) == 16384) {
                z9 = true;
            } else {
                z9 = false;
            }
            if (i5 == 256) {
                z10 = true;
            } else {
                z10 = false;
            }
            zI2 = z9 | z10 | fetVar2.i(omvVar2);
            Object objP12 = fetVar2.P();
            if (zI2) {
                zb1Var = new zb1((Object) function1, z, (Object) omvVar2, (Object) pz40Var2, (byte) 2);
                z11 = z;
                fetVar2.o0(zb1Var);
            } else {
                zb1Var = new zb1((Object) function1, z, (Object) omvVar2, (Object) pz40Var2, (byte) 2);
                z11 = z;
                fetVar2.o0(zb1Var);
            }
            mm40 mm40VarE1 = o2e.e0(y860.W(mm40VarN2, gy40Var2, null, z6, null, (Function0) zb1Var, 24), "PRIMARY_CHECKBOX");
            if (i5 == 256) {
                z12 = true;
            } else {
                z12 = false;
            }
            objP6 = fetVar2.P();
            if (z12) {
                objP6 = new z((byte) 23, z11);
                fetVar2.o0(objP6);
            } else {
                objP6 = new z((byte) 23, z11);
                fetVar2.o0(objP6);
            }
            mm40 mm40VarA2 = pai0.a(mm40VarE1, false, (Function1) objP6);
            tj30 tj30VarC2 = zq8.c(gqw0.e, false);
            int iHashCode2 = Long.hashCode(fetVar2.T);
            bh90 bh90VarM2 = fetVar2.m();
            mm40 mm40VarC1 = kbc.c0(fetVar2, mm40VarA2);
            mkd.c0.getClass();
            fetVar2.i0();
            if (fetVar2.S) {
                fetVar2.l(e7z.u1);
            } else {
                fetVar2.r0();
            }
            jpm0.o(fetVar2, tj30VarC2, gqw0.x);
            jpm0.o(fetVar2, bh90VarM2, gqw0.w);
            jpm0.o(fetVar2, Integer.valueOf(iHashCode2), gqw0.y);
            jpm0.n(fetVar2);
            jpm0.o(fetVar2, mm40VarC1, gqw0.v);
            if (uc00Var instanceof tc00) {
                fetVar2.e0(-1318792732);
                float fFloatValue4 = ((Number) l7m0VarB.getValue()).floatValue();
                float fFloatValue5 = ((Number) t33Var2.d()).floatValue();
                float f4 = ((ycl) l7m0VarA.getValue()).f42389a;
                zD2 = fetVar2.d(fFloatValue);
                objP8 = fetVar2.P();
                if (zD2) {
                    objP8 = new f54(fFloatValue, (byte) 15);
                    fetVar2.o0(objP8);
                } else {
                    objP8 = new f54(fFloatValue, (byte) 15);
                    fetVar2.o0(objP8);
                }
                fetVar2 = fetVar2;
                y(i4w0.T(jm40Var, (Function1) objP8), z11, fFloatValue4, fFloatValue5, f4, fetVar2, (i4 >> 3) & 112);
                fetVar2.r(false);
            } else {
                fetVar2 = fetVar2;
                if (uc00Var instanceof sc00) {
                    throw b1j.f(-1012375219, fetVar2, false);
                }
                fetVar2.e0(-1318381920);
                zD = fetVar2.d(fFloatValue);
                objP7 = fetVar2.P();
                if (zD) {
                    objP7 = new f54(fFloatValue, (byte) 16);
                    fetVar2.o0(objP7);
                } else {
                    objP7 = new f54(fFloatValue, (byte) 16);
                    fetVar2.o0(objP7);
                }
                x(i4w0.T(jm40Var, (Function1) objP7), z, ((Number) l7m0VarB.getValue()).floatValue(), ((Number) t33Var2.d()).floatValue(), ((sc00) uc00Var).f31963a, fetVar2, (i4 >> 3) & 112);
                fetVar2.r(false);
            }
            fetVar2.r(true);
            z5 = z6;
        } else {
            fetVar2.X();
            mm40Var3 = mm40Var2;
            z5 = z3;
        }
        yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new xjm(mm40Var3, uc00Var, z, z5, function1, i, i2);
        }
    }

    public static final void l(mm40 mm40Var, sum sumVar, sum sumVar2, mpm mpmVar, String str, mum mumVar, boolean z, fet fetVar, int i, int i2) {
        int i3;
        mm40 mm40Var2;
        k6z k6zVar;
        str.getClass();
        fetVar.g0(876478802);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else {
            i3 = i | (fetVar.g(mm40Var) ? 4 : 2);
        }
        int i5 = i3 | (fetVar.g(sumVar) ? 32 : 16) | (fetVar.g(sumVar2) ? 256 : 128) | (fetVar.g(mpmVar) ? 2048 : 1024) | (fetVar.g(str) ? 16384 : 8192) | (fetVar.g(mumVar) ? 131072 : 65536) | (fetVar.h(z) ? 1048576 : 524288);
        if (fetVar.U(i5 & 1, (599187 & i5) != 599186)) {
            if (i4 != 0) {
                mm40Var = jm40.b;
            }
            mm40Var2 = mm40Var;
            zfn zfnVar = bmd.n;
            k6z k6zVar2 = (k6z) fetVar.k(zfnVar);
            if (z) {
                fetVar.e0(482553977);
                k6zVar = (k6z) fetVar.k(zfnVar);
                fetVar.r(false);
            } else {
                fetVar.e0(482554901);
                fetVar.r(false);
                k6zVar = k6z.f17794a;
            }
            obc.d(zfnVar.a(k6zVar), u1c.M(-734550510, new ntm(mm40Var2, (Object) sumVar, mpmVar, z, (Object) sumVar2, (Object) mumVar, str, k6zVar2, (byte) 1), fetVar), fetVar, 56);
        } else {
            fetVar.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new te(mm40Var2, sumVar, sumVar2, mpmVar, str, mumVar, z, i, i2);
        }
    }

    public static final void m(mm40 mm40Var, List list, sso0 sso0Var, Function0 function0, fet fetVar, int i) {
        int i2;
        Function0 function1;
        int i3;
        list.getClass();
        fetVar.g0(424312460);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? fetVar.g(list) : fetVar.i(list) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.g(sso0Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            function1 = function0;
            i2 |= fetVar.i(function1) ? 2048 : 1024;
        } else {
            function1 = function0;
        }
        boolean z = true;
        if (fetVar.U(i2 & 1, (i2 & 1171) != 1170)) {
            w6k w6kVar = (w6k) fetVar.k(bmd.h);
            boolean z2 = fetVar.k(bmd.n) == k6z.b;
            int i4 = i2 & 896;
            boolean zG = fetVar.g(w6kVar) | (i4 == 256) | fetVar.h(z2);
            Object objP = fetVar.P();
            Object obj = ukd.f35823a;
            if (zG || objP == obj) {
                objP = new HashMap(4);
                fetVar.o0(objP);
            }
            HashMap map = (HashMap) objP;
            zcl zclVar = qmk.f28987a;
            int iT = w6kVar.T(8.0f);
            int iT2 = w6kVar.T(8.0f);
            Object objP2 = fetVar.P();
            if (objP2 == obj) {
                objP2 = dw9.j(fetVar);
            }
            mm40 mm40VarE = mm40Var.e(y860.W(jm40.b, (gy40) objP2, null, false, null, function1, 28));
            boolean zI = (i4 == 256) | fetVar.i(map) | fetVar.h(z2);
            if ((i2 & 112) != 32 && ((i2 & 64) == 0 || !fetVar.i(list))) {
                z = false;
            }
            boolean zE = zI | z | fetVar.e(iT) | fetVar.g(w6kVar) | fetVar.e(iT2);
            Object objP3 = fetVar.P();
            if (zE || objP3 == obj) {
                i3 = 0;
                Object gb8Var = new gb8(iT, list, w6kVar, iT2, map, z2, sso0Var);
                fetVar.o0(gb8Var);
                objP3 = gb8Var;
            } else {
                i3 = 0;
            }
            x4n0.a(mm40VarE, (Function2) objP3, fetVar, i3, i3);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new e0i((byte) 25, i, (Object) mm40Var, (Object) list, (Object) sso0Var, (Object) function0);
        }
    }

    public static final void n(int i, fet fetVar, mm40 mm40Var, String str) {
        str.getClass();
        tj30 tj30VarC = zq8.c(gqw0.e, false);
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
        jpm0.o(fetVar, tj30VarC, gqw0.x);
        jpm0.o(fetVar, bh90VarM, gqw0.w);
        jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
        jpm0.n(fetVar);
        jpm0.o(fetVar, mm40VarC0, gqw0.v);
        long jM123getWhite0d7_KjU = ((StaticColors) fetVar.k(m8m0.f21378a)).m123getWhite0d7_KjU();
        ((g1t0) fetVar.k(j1t0.e)).getClass();
        v8q0.a(str, null, jM123getWhite0d7_KjU, null, 0L, null, null, null, 0L, new f2q0(3), 0L, 2, false, 1, 0, null, g1t0.e(), fetVar, (i >> 3) & 14, 24960, 109562);
        fetVar.r(true);
    }

    public static final void o(c8w c8wVar, Function1 function1, fet fetVar, int i) {
        c8wVar.getClass();
        function1.getClass();
        fetVar.g0(775674646);
        int i2 = (fetVar.g(c8wVar) ? 4 : 2) | i | (fetVar.i(function1) ? 32 : 16);
        if (!fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            fetVar.X();
        } else if (c8wVar.equals(a8w.f448a)) {
            fetVar.e0(-1900965766);
            fetVar.r(false);
        } else {
            if (!(c8wVar instanceof b8w)) {
                throw b1j.f(-1900968611, fetVar, false);
            }
            fetVar.e0(1199671662);
            p((b8w) c8wVar, function1, fetVar, i2 & 126);
            fetVar.r(false);
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new sjs(c8wVar, function1, i, (byte) 12);
        }
    }

    public static final void p(b8w b8wVar, Function1 function1, fet fetVar, int i) {
        function1.getClass();
        fetVar.g0(1344534163);
        int i2 = (fetVar.g(b8wVar) ? 4 : 2) | i | (fetVar.i(function1) ? 32 : 16);
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            xcz xczVarA = ddz.a(0, 0, fetVar, 0, 3);
            mm40 mm40VarE0 = o2e.e0(cjx.V(jm40.b, a8k0.G(xczVarA, fetVar), null), "HistoryTypeScreenBottomSheet");
            zcl zclVar = qmk.f28987a;
            lh80 lh80VarU = s5x0.u(0.0f, 8.0f, 0.0f, 16.0f, 5);
            boolean z = ((i2 & 14) == 4) | ((i2 & 112) == 32);
            Object objP = fetVar.P();
            if (z || objP == ukd.f35823a) {
                objP = new f3s(b8wVar, function1, (byte) 28);
                fetVar.o0(objP);
            }
            b8k0.e(mm40VarE0, xczVarA, lh80VarU, null, null, null, false, null, (Function1) objP, fetVar, 0, Response.SERVER_TIMEOUT);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new sjs(b8wVar, function1, i, (byte) 13);
        }
    }

    public static final void q(String str, int i, k6z k6zVar, fet fetVar, int i2) {
        fetVar.g0(978575260);
        int i3 = (fetVar.g(str) ? 4 : 2) | i2 | (fetVar.e(i) ? 32 : 16) | (fetVar.e(k6zVar.ordinal()) ? 256 : 128);
        if (fetVar.U(i3 & 1, (i3 & 147) != 146)) {
            obc.d(bmd.n.a(k6zVar), u1c.M(-1090600228, new v((byte) 6, i, str), fetVar), fetVar, 56);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new hum(str, i, k6zVar, i2, (byte) 0);
        }
    }

    public static final void r(mum mumVar, fet fetVar, int i) {
        fetVar.g0(305915235);
        int i2 = (fetVar.g(mumVar) ? 4 : 2) | i;
        if (!fetVar.U(i2 & 1, (i2 & 3) != 2)) {
            fetVar.X();
        } else if (mumVar instanceof jum) {
            fetVar.e0(1926769447);
            fetVar.r(false);
        } else {
            boolean z = mumVar instanceof kum;
            jm40 jm40Var = jm40.b;
            if (z) {
                fetVar.e0(-399604500);
                kum kumVar = (kum) mumVar;
                fgm fgmVar = fgm.b;
                boolean zE = fetVar.e(2) | fetVar.f(kumVar.f18917a);
                Object objP = fetVar.P();
                if (zE || objP == ukd.f35823a) {
                    objP = new c8n(nsm0.y(fgmVar), new w7n(new a8n(), kpb.m0(kumVar), true, 0, false, null, 56));
                    fetVar.o0(objP);
                }
                v7n.c(mrv.k0(jm40Var, j9k0.f16144a), (c8n) objP, null, fetVar, 4);
                fetVar.r(false);
            } else {
                if (!(mumVar instanceof lum)) {
                    throw b1j.f(1926768099, fetVar, false);
                }
                fetVar.e0(-398892616);
                j6n.h("VAR", oro0.f25744a, mrv.k0(jm40Var, m9k0.f21414a), 0, 0, fetVar, 438, 24);
                fetVar.r(false);
            }
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new i3l(mumVar, i, (byte) 21);
        }
    }

    public static final void s(int i, fet fetVar, mm40 mm40Var) {
        int i2;
        fetVar.g0(-773332777);
        int i3 = i | 6;
        if (fetVar.U(i3 & 1, (i3 & 3) != 2)) {
            zfn zfnVar = bmd.n;
            k6z k6zVar = (k6z) fetVar.k(zfnVar);
            Object objP = fetVar.P();
            if (objP == ukd.f35823a) {
                int iOrdinal = k6zVar.ordinal();
                if (iOrdinal == 0) {
                    i2 = R.drawable.ic_glyph_arrow_right;
                } else {
                    if (iOrdinal != 1) {
                        t9f.b();
                        return;
                    }
                    i2 = R.drawable.ic_glyph_arrow_left;
                }
                objP = Integer.valueOf(i2);
                fetVar.o0(objP);
            }
            obc.d(zfnVar.a(k6z.f17794a), u1c.M(521643031, new u49(((Number) objP).intValue(), (byte) 10), fetVar), fetVar, 56);
            mm40Var = jm40.b;
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new dka(mm40Var, i, (byte) 20);
        }
    }

    public static final void t(tlm tlmVar, gmm gmmVar, Function1 function1, Function1 function2, fet fetVar, int i) {
        int i2;
        Function1 function3;
        fetVar.g0(-1399520464);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(tlmVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.g(gmmVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            function3 = function1;
            i2 |= fetVar.i(function3) ? 256 : 128;
        } else {
            function3 = function1;
        }
        if ((i & 3072) == 0) {
            i2 |= fetVar.i(function2) ? 2048 : 1024;
        }
        if (fetVar.U(i2 & 1, (i2 & 1171) != 1170)) {
            imm immVar = new imm(new ilm(((ThemeColors) fetVar.k(zaq0.b)).getSecondary()), tlmVar, gmmVar, y3d.f, false, null);
            int i3 = i2 & 7168;
            boolean z = i3 == 2048;
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (z || objP == cl5Var) {
                objP = new mfp(function2, (byte) 13);
                fetVar.o0(objP);
            }
            Function0 function0 = (Function0) objP;
            boolean z2 = i3 == 2048;
            Object objP2 = fetVar.P();
            if (z2 || objP2 == cl5Var) {
                objP2 = new qyo(function2, (byte) 22);
                fetVar.o0(objP2);
            }
            Function1 function4 = (Function1) objP2;
            boolean z3 = i3 == 2048;
            Object objP3 = fetVar.P();
            if (z3 || objP3 == cl5Var) {
                objP3 = new qyo(function2, (byte) 23);
                fetVar.o0(objP3);
            }
            Function1 function5 = (Function1) objP3;
            boolean z4 = i3 == 2048;
            Object objP4 = fetVar.P();
            if (z4 || objP4 == cl5Var) {
                objP4 = new mfp(function2, (byte) 14);
                fetVar.o0(objP4);
            }
            hlm.c(null, immVar, null, function0, null, function3, function4, function5, (Function0) objP4, null, null, null, fetVar, ((i2 << 9) & 458752) | 805306368, 54, 21);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new pip(tlmVar, gmmVar, function1, function2, i, (byte) 3);
        }
    }

    public static final void u(mm40 mm40Var, d280 d280Var, fet fetVar, int i) {
        fetVar.g0(-855577912);
        int i2 = (fetVar.g(d280Var) ? 32 : 16) | i;
        byte b = 0;
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            boolean z = (i2 & 112) == 32;
            Object objP = fetVar.P();
            Object obj = ukd.f35823a;
            if (z || objP == obj) {
                objP = new u6n(d4d.SECONDARY60, w6n.h, d280Var);
                fetVar.o0(objP);
            }
            u6n u6nVar = (u6n) objP;
            boolean zG = fetVar.g(u6nVar);
            Object objP2 = fetVar.P();
            if (zG || objP2 == obj) {
                objP2 = new d1n(u6nVar, (byte) 1);
                fetVar.o0(objP2);
            }
            kkb.p(0, fetVar, mm40Var, (Function0) objP2);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new gum(mm40Var, d280Var, i, b);
        }
    }

    public static final void v(int i, int i2, fet fetVar, mm40 mm40Var, String str) {
        fetVar.g0(759884751);
        int i3 = i2 | (fetVar.g(str) ? 32 : 16) | (fetVar.e(i) ? 256 : 128);
        if (fetVar.U(i3 & 1, (i3 & 147) != 146)) {
            v8q0.a(str, o2e.e0(mm40Var, "OPPONENT_NAME_TEXT"), ((ThemeColors) fetVar.k(zaq0.b)).getTextPrimary(), new n05(qmk.q, g1t0.m().f42262a.b, qmk.n), 0L, null, null, null, 0L, new f2q0(i), 0L, 2, false, 3, 0, null, g1t0.m(), fetVar, (i3 >> 3) & 14, ((i3 >> 6) & 14) | 24960, 109552);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new poh(mm40Var, str, i, i2, (byte) 1);
        }
    }

    public static final void w(mm40 mm40Var, int i, int i2, boolean z, fet fetVar, int i3) {
        mm40 mm40Var2;
        int i4;
        int i5;
        boolean z2;
        fet fetVar2;
        fetVar.g0(-1372760856);
        int i6 = (fetVar.e(i) ? 32 : 16) | i3 | (fetVar.e(i2) ? 256 : 128) | (fetVar.h(z) ? 2048 : 1024);
        if (!fetVar.U(i6 & 1, (i6 & 1171) != 1170)) {
            mm40Var2 = mm40Var;
            i4 = i;
            i5 = i2;
            z2 = z;
            fetVar2 = fetVar;
            fetVar2.X();
        } else {
            if (i <= 0) {
                yfe0 yfe0VarU = fetVar.u();
                if (yfe0VarU != null) {
                    yfe0VarU.d = new ium(mm40Var, i, i2, z, i3, (byte) 0);
                    return;
                }
                return;
            }
            i4 = i;
            i5 = i2;
            z2 = z;
            long primary = ((ThemeColors) fetVar.k(zaq0.b)).getPrimary();
            boolean z3 = ((i6 & 112) == 32) | ((i6 & 896) == 256) | ((i6 & 7168) == 2048);
            Object objP = fetVar.P();
            if (z3 || objP == ukd.f35823a) {
                objP = new x8n(z2 ? new t8n(primary) : new u8n(primary), i4, i5);
                fetVar.o0(objP);
            }
            fetVar2 = fetVar;
            mm40Var2 = mm40Var;
            p8n.b(mm40Var2, (x8n) objP, false, fetVar2, 6, 4);
        }
        yfe0 yfe0VarU2 = fetVar2.u();
        if (yfe0VarU2 != null) {
            yfe0VarU2.d = new ium(mm40Var2, i4, i5, z2, i3, (byte) 1);
        }
    }

    public static final void x(final mm40 mm40Var, final boolean z, final float f, final float f2, final y3d y3dVar, fet fetVar, final int i) {
        mm40 mm40Var2;
        int i2;
        fetVar.g0(948523322);
        byte b = 2;
        if ((i & 6) == 0) {
            mm40Var2 = mm40Var;
            i2 = (fetVar.g(mm40Var2) ? 4 : 2) | i;
        } else {
            mm40Var2 = mm40Var;
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.h(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.d(f) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= fetVar.d(f2) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= fetVar.g(y3dVar) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= fetVar.g(null) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= fetVar.g(null) ? 1048576 : 524288;
        }
        int i3 = i2;
        if (fetVar.U(i3 & 1, (i3 & 599187) != 599186)) {
            zcl zclVar = qmk.f28987a;
            l7m0 l7m0VarA = d43.a(z ? 20.0f : 0.0f, ro4.m0(Response.OK, 0, null, 6), null, fetVar, 48, 12);
            mm40 mm40VarU = i4w0.U(mm40Var2, f, f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0L, null, false, 0L, 0L, 0, null, 1048572);
            Boolean boolValueOf = Boolean.valueOf(z);
            Object objP = fetVar.P();
            if (objP == ukd.f35823a) {
                objP = new aim(b);
                fetVar.o0(objP);
            }
            ay3.f(boolValueOf, mm40VarU, (Function1) objP, null, null, null, u1c.M(161477629, new yjm(y3dVar, f2, l7m0VarA), fetVar), fetVar, ((i3 >> 3) & 14) | 1573248, 56);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new Function2() { // from class: a.zjm
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    f7k.x(mm40Var, z, f, f2, y3dVar, (fet) obj, x8x.L(i | 1));
                    return Unit.f46060a;
                }
            };
        }
    }

    public static final void y(final mm40 mm40Var, final boolean z, final float f, final float f2, final float f3, fet fetVar, final int i) {
        mm40 mm40Var2;
        int i2;
        long jM121getTransparent0d7_KjU;
        fetVar.g0(1120137933);
        if ((i & 6) == 0) {
            mm40Var2 = mm40Var;
            i2 = (fetVar.g(mm40Var2) ? 4 : 2) | i;
        } else {
            mm40Var2 = mm40Var;
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.h(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.d(f) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= fetVar.d(f2) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= fetVar.d(f3) ? 16384 : 8192;
        }
        int i3 = i2;
        if (fetVar.U(i3 & 1, (i3 & 9363) != 9362)) {
            zcl zclVar = qmk.f28987a;
            final l7m0 l7m0VarA = d43.a(z ? 24.0f : 0.0f, ro4.m0(Response.OK, 0, null, 6), null, fetVar, 48, 12);
            if (z) {
                fetVar.e0(-1584224802);
                jM121getTransparent0d7_KjU = ((ThemeColors) fetVar.k(zaq0.b)).getPrimaryForeground();
            } else {
                fetVar.e0(-1584223304);
                jM121getTransparent0d7_KjU = ((StaticColors) fetVar.k(m8m0.f21378a)).m121getTransparent0d7_KjU();
            }
            fetVar.r(false);
            final long j = jM121getTransparent0d7_KjU;
            jwb.e(Boolean.valueOf(z), i4w0.U(mm40Var2, f, f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0L, null, false, 0L, 0L, 0, null, 1048572), ro4.m0(0, 0, null, 7), null, u1c.M(261895086, new xdr() { // from class: a.akm
                @Override // a.xdr
                public final Object F(Object obj, Object obj2, Object obj3) {
                    boolean zBooleanValue = ((Boolean) obj).booleanValue();
                    fet fetVar2 = (fet) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    if ((iIntValue & 6) == 0) {
                        iIntValue |= fetVar2.h(zBooleanValue) ? 4 : 2;
                    }
                    if (fetVar2.U(iIntValue & 1, (iIntValue & 19) != 18)) {
                        jm40 jm40Var = jm40.b;
                        if (zBooleanValue) {
                            fetVar2.e0(-1839006688);
                            zcl zclVar2 = qmk.f28987a;
                            mm40 mm40VarQ = i120.Q(lgb.J(o7k0.n(jm40Var, 24.0f), vgg0.f37379a), j, jd8.n);
                            zx7 zx7Var = gqw0.e;
                            tj30 tj30VarC = zq8.c(zx7Var, false);
                            int iHashCode = Long.hashCode(fetVar2.T);
                            bh90 bh90VarM = fetVar2.m();
                            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarQ);
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
                            pm80 pm80VarF = a8k0.F(R.drawable.ic_checkbox_active, 0, fetVar2);
                            long primary = ((ThemeColors) fetVar2.k(zaq0.b)).getPrimary();
                            mm40 mm40VarN = o7k0.n(jm40Var, ((ycl) l7m0VarA.getValue()).f42389a);
                            float f4 = f2;
                            dww.c(pm80VarF, null, o2e.e0(jr8.f16991a.b(i4w0.U(mm40VarN, f4, f4, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0L, null, false, 0L, 0L, 0, null, 1048572), zx7Var), "ICON_CHECKBOX_ACTIVE"), primary, fetVar2, 56, 0);
                            fetVar2.r(true);
                            fetVar2.r(false);
                        } else {
                            fetVar2.e0(-1838141013);
                            zcl zclVar3 = qmk.f28987a;
                            zq8.a(0, fetVar2, i120.S(o7k0.n(jm40Var, 24.0f), f3, ((ThemeColors) fetVar2.k(zaq0.b)).getSecondary60(), vgg0.f37379a));
                            fetVar2.r(false);
                        }
                    } else {
                        fetVar2.X();
                    }
                    return Unit.f46060a;
                }
            }, fetVar), fetVar, ((i3 >> 3) & 14) | 24960, 8);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new Function2() { // from class: a.wjm
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    f7k.y(mm40Var, z, f, f2, f3, (fet) obj, x8x.L(i | 1));
                    return Unit.f46060a;
                }
            };
        }
    }

    public static final void z(a4x a4xVar, dxh0 dxh0Var, Function0 function0, Function1 function1, fet fetVar, int i) {
        float f;
        fetVar.g0(-1722139426);
        int i2 = (fetVar.g(a4xVar) ? 4 : 2) | i | (fetVar.g(dxh0Var) ? 32 : 16) | (fetVar.i(function0) ? 256 : 128) | (fetVar.i(function1) ? 2048 : 1024);
        if (fetVar.U(i2 & 1, (i2 & 1171) != 1170)) {
            if (pkd.d(fetVar)) {
                zcl zclVar = qmk.f28987a;
                f = 96.0f;
            } else {
                zcl zclVar2 = qmk.f28987a;
                f = 16.0f;
            }
            ArrayList arrayList = new ArrayList(r3d.q(a4xVar, 10));
            Iterator<E> it = a4xVar.iterator();
            while (it.hasNext()) {
                arrayList.add(new yvh0((String) it.next(), bwh0.f3325a));
            }
            i4 i4VarR0 = dyb.r0(arrayList);
            zcl zclVar3 = qmk.f28987a;
            int i3 = ((i2 << 6) & 7168) | 384;
            int i4 = i2 << 9;
            ibc.n(s5x0.K(jm40.b, f, 8.0f), i4VarR0, gxh0.f12078a, dxh0Var, false, function0, function1, fetVar, i3 | (458752 & i4) | (i4 & 3670016), 16);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new eqk((byte) 25, i, (Object) a4xVar, (Object) dxh0Var, (Object) function0, (Object) function1);
        }
    }

    public final void E(xpg0 xpg0Var, Object obj) throws IOException {
        int i;
        int i2;
        int[] iArrK0;
        int[] iArrK1;
        byte[] byteArray;
        byte[] byteArray2;
        int i3 = 3;
        switch (this.f9061a) {
            case 0:
                b7k b7kVar = (b7k) obj;
                xpg0Var.getClass();
                b7kVar.getClass();
                xpg0Var.z(1, b7kVar.f2114a);
                xpg0Var.z(2, b7kVar.b);
                return;
            case 1:
                usb0 usb0Var = (usb0) obj;
                xpg0Var.getClass();
                usb0Var.getClass();
                xpg0Var.z(1, usb0Var.f36203a);
                xpg0Var.o(2, usb0Var.b.longValue());
                return;
            case 2:
                r9o0 r9o0Var = (r9o0) obj;
                xpg0Var.getClass();
                r9o0Var.getClass();
                xpg0Var.z(1, r9o0Var.f30094a);
                xpg0Var.o(2, r9o0Var.b);
                xpg0Var.o(3, r9o0Var.c);
                return;
            case 3:
                gpv0 gpv0Var = (gpv0) obj;
                xpg0Var.getClass();
                gpv0Var.getClass();
                xpg0Var.z(1, gpv0Var.f11702a);
                xpg0Var.z(2, gpv0Var.b);
                return;
            case 4:
                ppv0 ppv0Var = (ppv0) obj;
                xpg0Var.getClass();
                ppv0Var.getClass();
                xpg0Var.z(1, ppv0Var.f27390a);
                xpg0Var.o(2, dqm0.z(ppv0Var.b));
                xpg0Var.z(3, ppv0Var.c);
                xpg0Var.z(4, ppv0Var.d);
                maj majVar = maj.b;
                xpg0Var.i(nkb.I(ppv0Var.e), 5);
                xpg0Var.i(nkb.I(ppv0Var.f), 6);
                xpg0Var.o(7, ppv0Var.g);
                xpg0Var.o(8, ppv0Var.h);
                xpg0Var.o(9, ppv0Var.i);
                xpg0Var.o(10, ppv0Var.k);
                af5 af5Var = ppv0Var.l;
                af5Var.getClass();
                int iOrdinal = af5Var.ordinal();
                if (iOrdinal == 0) {
                    i = 0;
                } else {
                    if (iOrdinal != 1) {
                        t9f.b();
                        return;
                    }
                    i = 1;
                }
                xpg0Var.o(11, i);
                xpg0Var.o(12, ppv0Var.m);
                xpg0Var.o(13, ppv0Var.n);
                xpg0Var.o(14, ppv0Var.o);
                xpg0Var.o(15, ppv0Var.p);
                xpg0Var.o(16, ppv0Var.q ? 1L : 0L);
                od80 od80Var = ppv0Var.r;
                od80Var.getClass();
                int iOrdinal2 = od80Var.ordinal();
                if (iOrdinal2 == 0) {
                    i2 = 0;
                } else {
                    if (iOrdinal2 != 1) {
                        t9f.b();
                        return;
                    }
                    i2 = 1;
                }
                xpg0Var.o(17, i2);
                xpg0Var.o(18, ppv0Var.s);
                xpg0Var.o(19, ppv0Var.t);
                xpg0Var.o(20, ppv0Var.u);
                xpg0Var.o(21, ppv0Var.v);
                xpg0Var.o(22, ppv0Var.w);
                String str = ppv0Var.x;
                if (str == null) {
                    xpg0Var.s(23);
                } else {
                    xpg0Var.z(23, str);
                }
                Boolean bool = ppv0Var.y;
                Integer numValueOf = bool != null ? Integer.valueOf(bool.booleanValue() ? 1 : 0) : null;
                if (numValueOf == null) {
                    xpg0Var.s(24);
                } else {
                    xpg0Var.o(24, numValueOf.intValue());
                }
                o4e o4eVar = ppv0Var.j;
                sl50 sl50Var = o4eVar.f24629a;
                int iOrdinal3 = sl50Var.ordinal();
                if (iOrdinal3 == 0) {
                    i3 = 0;
                } else if (iOrdinal3 == 1) {
                    i3 = 1;
                } else if (iOrdinal3 == 2) {
                    i3 = 2;
                } else if (iOrdinal3 != 3) {
                    if (iOrdinal3 == 4) {
                        i3 = 4;
                    } else if (Build.VERSION.SDK_INT < 30 || sl50Var != sl50.f) {
                        ohq.q(sl50Var, " to int", "Could not convert ");
                        i3 = 0;
                    } else {
                        i3 = 5;
                    }
                }
                xpg0Var.o(25, i3);
                hl50 hl50Var = o4eVar.b;
                int i4 = Build.VERSION.SDK_INT;
                if (i4 < 28) {
                    byteArray = new byte[0];
                } else {
                    NetworkRequest networkRequest = (NetworkRequest) hl50Var.f13241a;
                    if (networkRequest == null) {
                        byteArray = new byte[0];
                    } else {
                        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                        try {
                            ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
                            try {
                                if (i4 >= 31) {
                                    iArrK0 = networkRequest.getTransportTypes();
                                    iArrK0.getClass();
                                } else {
                                    int[] iArr = {2, 0, 3, 6, 10, 9, 8, 4, 1, 5};
                                    ArrayList arrayList = new ArrayList();
                                    for (int i5 = 0; i5 < 10; i5++) {
                                        int i6 = iArr[i5];
                                        if (networkRequest.hasTransport(i6)) {
                                            arrayList.add(Integer.valueOf(i6));
                                        }
                                    }
                                    iArrK0 = CollectionsKt.K0(arrayList);
                                }
                                if (Build.VERSION.SDK_INT >= 31) {
                                    iArrK1 = networkRequest.getCapabilities();
                                    iArrK1.getClass();
                                } else {
                                    int[] iArr2 = {17, 5, 2, 10, 29, 19, 3, 32, 7, 4, 12, 36, 23, 0, 33, 20, 11, 13, 18, 21, 15, 35, 34, 8, 1, 25, 14, 16, 6, 9};
                                    ArrayList arrayList2 = new ArrayList();
                                    for (int i7 = 0; i7 < 30; i7++) {
                                        int i8 = iArr2[i7];
                                        if (networkRequest.hasCapability(i8)) {
                                            arrayList2.add(Integer.valueOf(i8));
                                        }
                                    }
                                    iArrK1 = CollectionsKt.K0(arrayList2);
                                }
                                objectOutputStream.writeInt(iArrK0.length);
                                for (int i9 : iArrK0) {
                                    objectOutputStream.writeInt(i9);
                                }
                                objectOutputStream.writeInt(iArrK1.length);
                                for (int i10 : iArrK1) {
                                    objectOutputStream.writeInt(i10);
                                }
                                objectOutputStream.close();
                                byteArrayOutputStream.close();
                                byteArray = byteArrayOutputStream.toByteArray();
                                byteArray.getClass();
                            } catch (Throwable th) {
                                try {
                                    throw th;
                                } catch (Throwable th2) {
                                    bkb.E(objectOutputStream, th);
                                    throw th2;
                                }
                            }
                        } catch (Throwable th3) {
                            try {
                                throw th3;
                            } catch (Throwable th4) {
                                bkb.E(byteArrayOutputStream, th3);
                                throw th4;
                            }
                        }
                    }
                }
                xpg0Var.i(byteArray, 26);
                xpg0Var.o(27, o4eVar.c ? 1L : 0L);
                xpg0Var.o(28, o4eVar.d ? 1L : 0L);
                xpg0Var.o(29, o4eVar.e ? 1L : 0L);
                xpg0Var.o(30, o4eVar.f ? 1L : 0L);
                xpg0Var.o(31, o4eVar.g);
                xpg0Var.o(32, o4eVar.h);
                Set<m4e> set = o4eVar.i;
                set.getClass();
                if (set.isEmpty()) {
                    byteArray2 = new byte[0];
                } else {
                    ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                    try {
                        ObjectOutputStream objectOutputStream2 = new ObjectOutputStream(byteArrayOutputStream2);
                        try {
                            objectOutputStream2.writeInt(set.size());
                            for (m4e m4eVar : set) {
                                objectOutputStream2.writeUTF(m4eVar.f21165a.toString());
                                objectOutputStream2.writeBoolean(m4eVar.b);
                            }
                            objectOutputStream2.close();
                            byteArrayOutputStream2.close();
                            byteArray2 = byteArrayOutputStream2.toByteArray();
                            byteArray2.getClass();
                        } catch (Throwable th5) {
                            try {
                                throw th5;
                            } catch (Throwable th6) {
                                bkb.E(objectOutputStream2, th5);
                                throw th6;
                            }
                        }
                    } catch (Throwable th7) {
                        try {
                            throw th7;
                        } catch (Throwable th8) {
                            bkb.E(byteArrayOutputStream2, th7);
                            throw th8;
                        }
                    }
                }
                xpg0Var.i(byteArray2, 33);
                return;
            default:
                ypv0 ypv0Var = (ypv0) obj;
                xpg0Var.getClass();
                ypv0Var.getClass();
                xpg0Var.z(1, ypv0Var.f43051a);
                xpg0Var.z(2, ypv0Var.b);
                return;
        }
    }

    public void U(qpg0 qpg0Var, Object obj) {
        String str;
        qpg0Var.getClass();
        if (obj == null) {
            return;
        }
        switch (this.f9061a) {
            case 0:
                str = "INSERT OR IGNORE INTO `Dependency` (`work_spec_id`,`prerequisite_id`) VALUES (?,?)";
                break;
            case 1:
                str = "INSERT OR REPLACE INTO `Preference` (`key`,`long_value`) VALUES (?,?)";
                break;
            case 2:
                str = "INSERT OR REPLACE INTO `SystemIdInfo` (`work_spec_id`,`generation`,`system_id`) VALUES (?,?,?)";
                break;
            case 3:
                str = "INSERT OR IGNORE INTO `WorkName` (`name`,`work_spec_id`) VALUES (?,?)";
                break;
            case 4:
                str = "INSERT OR IGNORE INTO `WorkSpec` (`id`,`state`,`worker_class_name`,`input_merger_class_name`,`input`,`output`,`initial_delay`,`interval_duration`,`flex_duration`,`run_attempt_count`,`backoff_policy`,`backoff_delay_duration`,`last_enqueue_time`,`minimum_retention_duration`,`schedule_requested_at`,`run_in_foreground`,`out_of_quota_policy`,`period_count`,`generation`,`next_schedule_time_override`,`next_schedule_time_override_generation`,`stop_reason`,`trace_tag`,`backoff_on_system_interruptions`,`required_network_type`,`required_network_request`,`requires_charging`,`requires_device_idle`,`requires_battery_not_low`,`requires_storage_not_low`,`trigger_content_update_delay`,`trigger_max_content_delay`,`content_uri_triggers`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
                break;
            default:
                str = "INSERT OR IGNORE INTO `WorkTag` (`tag`,`work_spec_id`) VALUES (?,?)";
                break;
        }
        xpg0 xpg0VarZ0 = qpg0Var.Z0(str);
        try {
            E(xpg0VarZ0, obj);
            xpg0VarZ0.W0();
            ay3.L(xpg0VarZ0, null);
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                ay3.L(xpg0VarZ0, th);
                throw th2;
            }
        }
    }
}
