package a;

import android.content.Context;
import android.content.res.Resources;
import android.gov.nist.javax.sip.header.ParameterNames;
import android.graphics.Bitmap;
import android.graphics.Typeface;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.View;
import android.widget.RemoteViews;
import androidx.fragment.app.Fragment;
import com.appsflyer.sdk_base.referrer.Payload;
import java.io.File;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.ranges.IntRange;
import org.xbet.client1.R;
import org.xplatform.uikit.compose.color.StaticColors;

/* JADX INFO: loaded from: classes4.dex */
public abstract class a4n0 {
    public static final void a(mm40 mm40Var, k9q0 k9q0Var, Function1 function1, fet fetVar, int i) {
        k9q0Var.getClass();
        function1.getClass();
        fetVar.g0(1206166353);
        int i2 = i | (fetVar.g(mm40Var) ? 4 : 2) | (fetVar.g(k9q0Var) ? 32 : 16) | (fetVar.i(function1) ? 256 : 128);
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            s6q0 s6q0Var = k9q0Var.b;
            boolean z = ((i2 & 896) == 256) | ((i2 & 112) == 32);
            Object objP = fetVar.P();
            if (z || objP == ukd.f35823a) {
                objP = new b8q0((Object) function1, (Object) k9q0Var, (byte) 3);
                fetVar.o0(objP);
            }
            jwb.o(mm40Var, s6q0Var, 0, null, (Function1) objP, fetVar, i2 & 14, 12);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new cgm0(mm40Var, k9q0Var, function1, i, (byte) 14);
        }
    }

    public static final void b(mm40 mm40Var, imm immVar, Function0 function0, Function0 function1, Function0 function2, Function0 function3, fet fetVar, int i) {
        int i2;
        imm immVar2;
        immVar.getClass();
        function0.getClass();
        function1.getClass();
        function2.getClass();
        function3.getClass();
        fetVar.g0(-837445992);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            immVar2 = immVar;
            i2 |= fetVar.g(immVar2) ? 32 : 16;
        } else {
            immVar2 = immVar;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.i(function0) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= fetVar.i(function1) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= fetVar.i(function2) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= fetVar.i(function3) ? 131072 : 65536;
        }
        if (fetVar.U(i2 & 1, (74899 & i2) != 74898)) {
            boolean z = (i2 & 7168) == 2048;
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (z || objP == cl5Var) {
                objP = new xhl0(function1, (byte) 21);
                fetVar.o0(objP);
            }
            Function0 function4 = (Function0) objP;
            boolean z2 = (i2 & 896) == 256;
            Object objP2 = fetVar.P();
            if (z2 || objP2 == cl5Var) {
                objP2 = new xhl0(function0, (byte) 22);
                fetVar.o0(objP2);
            }
            Function0 function5 = (Function0) objP2;
            boolean z3 = ((57344 & i2) == 16384) | ((458752 & i2) == 131072);
            Object objP3 = fetVar.P();
            if (z3 || objP3 == cl5Var) {
                objP3 = new yhd(function2, function3, (byte) 6);
                fetVar.o0(objP3);
            }
            hlm.c(mm40Var, immVar2, null, function4, function5, (Function1) objP3, null, null, null, null, null, null, fetVar, i2 & 126, 0, 4036);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new fer0(mm40Var, (Object) immVar, (wdr) function0, (wdr) function1, (wdr) function2, (wdr) function3, i, (byte) 2);
        }
    }

    public static final void c(final int i, fet fetVar, final mm40 mm40Var, final String str, final String str2, final boolean z) {
        String str3;
        int i2;
        yfe0 yfe0VarU;
        Function2 function2;
        fet fetVar2 = fetVar;
        str.getClass();
        str2.getClass();
        fetVar2.g0(2133142994);
        if ((i & 6) == 0) {
            str3 = str;
            i2 = (fetVar2.g(str3) ? 4 : 2) | i;
        } else {
            str3 = str;
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar2.h(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar2.g(str2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= fetVar.g(mm40Var) ? 2048 : 1024;
        }
        int i3 = i2;
        if (fetVar2.U(i3 & 1, (i3 & 1171) != 1170)) {
            if (str3.length() == 0) {
                yfe0VarU = fetVar2.u();
                if (yfe0VarU == null) {
                    return;
                }
                final byte b = 0;
                function2 = new Function2() { // from class: a.bus0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        switch (b) {
                            case 0:
                                ((Integer) obj2).getClass();
                                a4n0.c(x8x.L(i | 1), (fet) obj, mm40Var, str, str2, z);
                                break;
                            default:
                                ((Integer) obj2).getClass();
                                a4n0.c(x8x.L(i | 1), (fet) obj, mm40Var, str, str2, z);
                                break;
                        }
                        return Unit.f46060a;
                    }
                };
            } else {
                Context context = (Context) fetVar2.k(dy2.b);
                Object objP = fetVar2.P();
                cl5 cl5Var = ukd.f35823a;
                if (objP == cl5Var) {
                    objP = j1t0.f15753a;
                    context.getClass();
                    objP.getClass();
                    if (str2.length() != 0) {
                        try {
                            Typeface typefaceCreateFromFile = Typeface.createFromFile(new File(context.getCacheDir(), str2));
                            typefaceCreateFromFile.getClass();
                            objP = lv00.E(typefaceCreateFromFile);
                        } catch (Exception unused) {
                        }
                    }
                    fetVar2.o0(objP);
                }
                nrq nrqVar = (nrq) objP;
                l7m0 l7m0VarB = d43.b(z ? 1.0f : 0.0f, ro4.m0(500, 1000, null, 4), null, null, fetVar2, 48, 28);
                zcl zclVar = qmk.f28987a;
                mm40 mm40VarT = o7k0.t(o7k0.e(mm40Var, 32.0f), 84.0f, 124.0f);
                StaticColors staticColors = StaticColors.INSTANCE;
                long jC = y3d.c(((Number) l7m0VarB.getValue()).floatValue(), staticColors.m123getWhite0d7_KjU());
                zcl zclVar2 = qmk.f;
                ugg0 ugg0Var = vgg0.f37379a;
                mm40 mm40VarE0 = o2e.e0(i120.Q(mm40VarT, jC, new ugg0(zclVar2, zclVar2, zclVar2, zclVar2)), "WINNER_CLOUD_TEXT");
                boolean z2 = (i3 & 112) == 32;
                Object objP2 = fetVar2.P();
                if (z2 || objP2 == cl5Var) {
                    objP2 = new jno((byte) 7, z);
                    fetVar2.o0(objP2);
                }
                mm40 mm40VarA = pai0.a(mm40VarE0, true, (Function1) objP2);
                tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
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
                jm40 jm40Var = jm40.b;
                v8q0.a(str, epv0.N(jr8.f16991a.b(s5x0.L(jm40Var, 8.0f, 0.0f, 2), gqw0.e), ((Number) l7m0VarB.getValue()).floatValue()), staticColors.m62getBlack0d7_KjU(), null, 0L, null, null, null, 0L, null, 0L, 2, false, 2, 0, null, y9q0.a(new y9q0(0L, qmk.p, null, j1t0.f15753a, 0L, null, 0, 0, qmk.C, 16646109), 0L, 0L, null, null, nrqVar, 0L, null, null, 0, 1, 0L, null, null, 16711647), fetVar, i3 & 14, 24960, 110584);
                fetVar2 = fetVar;
                mm40 mm40VarQ = ffb0.Q(o7k0.e(o7k0.s(jm40Var, 10.0f), 14.0f), 8.0f, 24.0f);
                boolean zG = fetVar2.g(l7m0VarB);
                Object objP3 = fetVar2.P();
                if (zG || objP3 == cl5Var) {
                    objP3 = new mqr0(l7m0VarB, (byte) 5);
                    fetVar2.o0(objP3);
                }
                p8a.k(mm40VarQ, (Function1) objP3, fetVar2, 0);
                fetVar2.r(true);
            }
            yfe0VarU.d = function2;
        }
        fetVar2.X();
        yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            final byte b2 = 1;
            function2 = new Function2() { // from class: a.bus0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    switch (b2) {
                        case 0:
                            ((Integer) obj2).getClass();
                            a4n0.c(x8x.L(i | 1), (fet) obj, mm40Var, str, str2, z);
                            break;
                        default:
                            ((Integer) obj2).getClass();
                            a4n0.c(x8x.L(i | 1), (fet) obj, mm40Var, str, str2, z);
                            break;
                    }
                    return Unit.f46060a;
                }
            };
            yfe0VarU.d = function2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [a.lc00, java.util.List] */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v3, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r6v4, types: [a.iun] */
    /* JADX WARN: Type inference failed for: r6v5, types: [java.util.ArrayList] */
    public static final a4x d(ieh iehVar, boolean z) {
        int i;
        String strConcat;
        ?? arrayList;
        List<eeh> list;
        String strConcat2;
        List list2;
        List list3;
        cfh cfhVar;
        List list4;
        yeh yehVar;
        List list5;
        cfh cfhVar2;
        List list6 = (iehVar == null || (list5 = iehVar.f14633a) == null || (cfhVar2 = (cfh) CollectionsKt.firstOrNull(list5)) == null) ? null : cfhVar2.b;
        if (list6 == null) {
            list6 = iun.f15405a;
        }
        if (z) {
            i = q3d.i(list6);
            if (i < 2) {
                i = 2;
            }
        } else {
            i = 6;
        }
        IntRange intRange = new IntRange(2, i, 1);
        ArrayList arrayList2 = new ArrayList(r3d.q(intRange, 10));
        Iterator it = intRange.iterator();
        while (((kkx) it).c) {
            int iNextInt = ((bkx) it).nextInt();
            ?? B = kotlin.collections.a.b();
            nzr0 nzr0Var = nzr0.f24387a;
            if (iehVar == null || (list3 = iehVar.f14633a) == null || (cfhVar = (cfh) CollectionsKt.firstOrNull(list3)) == null || (list4 = cfhVar.b) == null || (yehVar = (yeh) CollectionsKt.W(iNextInt, list4)) == null) {
                strConcat = null;
            } else {
                strConcat = yehVar.b;
                if (strConcat.length() > 4) {
                    strConcat = ttm0.L(4, strConcat).concat("…");
                }
            }
            if (strConcat == null) {
                strConcat = "";
            }
            B.add(new lzr0(nzr0Var, strConcat, nrq0.b));
            if (iehVar == null || (list = iehVar.b) == null) {
                arrayList = 0;
            } else {
                arrayList = new ArrayList(r3d.q(list, 10));
                for (eeh eehVar : list) {
                    nzr0 nzr0Var2 = nzr0.b;
                    aeh aehVar = (aeh) CollectionsKt.W(iNextInt, eehVar.b);
                    if (aehVar == null || (list2 = aehVar.c) == null || (strConcat2 = (String) CollectionsKt.firstOrNull(list2)) == null) {
                        strConcat2 = null;
                    } else if (strConcat2.length() > 4) {
                        strConcat2 = ttm0.L(4, strConcat2).concat("…");
                    }
                    if (strConcat2 == null) {
                        strConcat2 = "";
                    }
                    arrayList.add(new lzr0(nzr0Var2, strConcat2, nrq0.b));
                }
            }
            if (arrayList == 0) {
                arrayList = iun.f15405a;
            }
            B.addAll(arrayList);
            arrayList2.add(new x7s0(dyb.o0(kotlin.collections.a.a(B)), zzr0.f45269a));
        }
        return dyb.o0(arrayList2);
    }

    public static final i1w0 e(Fragment fragment) {
        i1w0 router;
        i1w0 router2;
        i0h0 i0h0Var = fragment.y;
        i1w0 i1w0Var = null;
        jhg0 jhg0Var = i0h0Var instanceof jhg0 ? (jhg0) i0h0Var : null;
        if (jhg0Var == null || (router = jhg0Var.getRouter()) == null || (router instanceof p1w0)) {
            router = null;
        }
        if (router == null) {
            i0h0 i0h0VarB = fragment.B();
            jhg0 jhg0Var2 = i0h0VarB instanceof jhg0 ? (jhg0) i0h0VarB : null;
            if (jhg0Var2 != null && (router2 = jhg0Var2.getRouter()) != null && !(router2 instanceof p1w0)) {
                i1w0Var = router2;
            }
        } else {
            i1w0Var = router;
        }
        return i1w0Var == null ? p1w0.h : i1w0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final i1w0 f(Fragment fragment) {
        i1w0 i1w0VarF;
        i1w0 router;
        Fragment fragment2;
        fragment.getClass();
        i1w0 i1w0Var = null;
        jhg0 jhg0Var = fragment instanceof jhg0 ? (jhg0) fragment : null;
        if (jhg0Var == null || (i1w0VarF = jhg0Var.getRouter()) == null || (i1w0VarF instanceof p1w0)) {
            i1w0VarF = null;
        }
        if (i1w0VarF == null && ((fragment2 = fragment.y) == null || (i1w0VarF = f(fragment2)) == null || (i1w0VarF instanceof p1w0))) {
            i1w0VarF = null;
        }
        if (i1w0VarF == null) {
            i0h0 i0h0VarB = fragment.B();
            jhg0 jhg0Var2 = i0h0VarB instanceof jhg0 ? (jhg0) i0h0VarB : null;
            if (jhg0Var2 != null && (router = jhg0Var2.getRouter()) != null && !(router instanceof p1w0)) {
                i1w0Var = router;
            }
        } else {
            i1w0Var = i1w0VarF;
        }
        return i1w0Var == null ? p1w0.h : i1w0Var;
    }

    public static final rqm g(int i, int i2, ctf0 ctf0Var) {
        String strA = ctf0Var.b.a(i, Arrays.copyOf(new Object[0], 0));
        pz40 pz40Var = s6t0.f31722a;
        return new rqm((vui0) new tui0(strA, new y3d(s6t0.b().f33626a.getTextPrimary())), (pui0) new oui0((Integer) null, (y3d) null, new m0x(i2, null, 6), (y3d) null, 27), (pvi0) null, (d4d) null, (tvi0) null, (wui0) null, false, (e900) null, 508);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void h(RemoteViews remoteViews, Context context, int i, String str, int i2, int i3, List list) {
        Drawable drawableQ;
        context.getClass();
        list.getClass();
        try {
            Context applicationContext = context.getApplicationContext();
            applicationContext.getClass();
            gbe0 gbe0VarA = o5k0.a(applicationContext);
            Context applicationContext2 = context.getApplicationContext();
            applicationContext2.getClass();
            k1x k1xVar = new k1x(applicationContext2);
            k1xVar.c = str;
            List list2 = u0d.f34849a;
            k1xVar.i = u0d.b(str);
            k1xVar.f = u0d.b(str);
            k1xVar.c(i3);
            q1x.b(k1xVar, dtb.P(context, list));
            t1x.c(k1xVar, i2);
            t1x.f(k1xVar, i2);
            Bitmap bitmapD = null;
            dyw dywVarB = ((u1x) eeq.U(kotlin.coroutines.g.f46065a, new ebe0(gbe0VarA, k1xVar.a(), 0 == true ? 1 : 0, (byte) 2))).b();
            if (dywVarB != null) {
                Resources resources = context.getResources();
                resources.getClass();
                drawableQ = c3x.q(dywVarB, resources);
            } else {
                drawableQ = null;
            }
            if (drawableQ instanceof BitmapDrawable) {
                bitmapD = ((BitmapDrawable) drawableQ).getBitmap();
            } else if (drawableQ != null) {
                bitmapD = hic.D(drawableQ, 0, 0, 7);
            }
            if (bitmapD != null) {
                remoteViews.setImageViewBitmap(i, bitmapD);
            } else {
                remoteViews.setImageViewResource(i, i2);
            }
        } catch (Exception e) {
            e.printStackTrace();
            remoteViews.setImageViewResource(i, i2);
        }
    }

    public static final int i(int i, Context context) {
        context.getClass();
        return (int) Math.ceil(TypedValue.applyDimension(1, i, context.getResources().getDisplayMetrics()));
    }

    public static ako0 j(qpg0 qpg0Var, String str) {
        Map mapB;
        yni0 yni0Var;
        qpg0Var.getClass();
        xpg0 xpg0VarZ0 = qpg0Var.Z0("PRAGMA table_info(`" + str + "`)");
        try {
            long j = 0;
            if (xpg0VarZ0.W0()) {
                int iA = z1x.A(xpg0VarZ0, "name");
                int iA2 = z1x.A(xpg0VarZ0, Payload.TYPE);
                int iA3 = z1x.A(xpg0VarZ0, "notnull");
                int iA4 = z1x.A(xpg0VarZ0, "pk");
                int iA5 = z1x.A(xpg0VarZ0, "dflt_value");
                jo20 jo20Var = new jo20();
                do {
                    String strJ0 = xpg0VarZ0.J0(iA);
                    jo20Var.put(strJ0, new ujo0((int) xpg0VarZ0.getLong(iA4), 2, strJ0, xpg0VarZ0.J0(iA2), xpg0VarZ0.isNull(iA5) ? null : xpg0VarZ0.J0(iA5), xpg0VarZ0.getLong(iA3) != 0));
                } while (xpg0VarZ0.W0());
                mapB = jo20Var.b();
                ay3.L(xpg0VarZ0, null);
            } else {
                mapB = lun.f20680a;
                mapB.getClass();
                ay3.L(xpg0VarZ0, null);
            }
            xpg0 xpg0VarZ1 = qpg0Var.Z0("PRAGMA foreign_key_list(`" + str + "`)");
            try {
                int iA6 = z1x.A(xpg0VarZ1, ParameterNames.ID);
                int iA7 = z1x.A(xpg0VarZ1, "seq");
                int iA8 = z1x.A(xpg0VarZ1, "table");
                int iA9 = z1x.A(xpg0VarZ1, "on_delete");
                int iA10 = z1x.A(xpg0VarZ1, "on_update");
                List listP = d9x.P(xpg0VarZ1);
                xpg0VarZ1.reset();
                yni0 yni0Var2 = new yni0();
                while (xpg0VarZ1.W0()) {
                    if (xpg0VarZ1.getLong(iA7) == j) {
                        int i = (int) xpg0VarZ1.getLong(iA6);
                        ArrayList arrayList = new ArrayList();
                        ArrayList arrayList2 = new ArrayList();
                        int i2 = iA6;
                        ArrayList<ovq> arrayList3 = new ArrayList();
                        for (Object obj : listP) {
                            int i3 = iA7;
                            List list = listP;
                            if (((ovq) obj).f25935a == i) {
                                arrayList3.add(obj);
                            }
                            iA7 = i3;
                            listP = list;
                        }
                        int i4 = iA7;
                        List list2 = listP;
                        for (ovq ovqVar : arrayList3) {
                            arrayList.add(ovqVar.c);
                            arrayList2.add(ovqVar.d);
                        }
                        yni0Var2.add(new wjo0(xpg0VarZ1.J0(iA8), xpg0VarZ1.J0(iA9), arrayList, xpg0VarZ1.J0(iA10), arrayList2));
                        iA6 = i2;
                        iA7 = i4;
                        listP = list2;
                        j = 0;
                    }
                }
                yni0 yni0VarA = cui0.a(yni0Var2);
                ay3.L(xpg0VarZ1, null);
                xpg0 xpg0VarZ2 = qpg0Var.Z0("PRAGMA index_list(`" + str + "`)");
                try {
                    int iA11 = z1x.A(xpg0VarZ2, "name");
                    int iA12 = z1x.A(xpg0VarZ2, "origin");
                    int iA13 = z1x.A(xpg0VarZ2, "unique");
                    if (iA11 == -1 || iA12 == -1 || iA13 == -1) {
                        ay3.L(xpg0VarZ2, null);
                        yni0Var = null;
                    } else {
                        yni0 yni0Var3 = new yni0();
                        while (xpg0VarZ2.W0()) {
                            if ("c".equals(xpg0VarZ2.J0(iA12))) {
                                yjo0 yjo0VarQ = d9x.Q(qpg0Var, xpg0VarZ2.J0(iA11), xpg0VarZ2.getLong(iA13) == 1);
                                if (yjo0VarQ == null) {
                                    ay3.L(xpg0VarZ2, null);
                                    yni0Var = null;
                                } else {
                                    yni0Var3.add(yjo0VarQ);
                                }
                            }
                        }
                        yni0 yni0VarA2 = cui0.a(yni0Var3);
                        ay3.L(xpg0VarZ2, null);
                        yni0Var = yni0VarA2;
                    }
                    return new ako0(str, mapB, yni0VarA, yni0Var);
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        ay3.L(xpg0VarZ2, th);
                        throw th2;
                    }
                }
            } catch (Throwable th3) {
                try {
                    throw th3;
                } catch (Throwable th4) {
                    ay3.L(xpg0VarZ1, th3);
                    throw th4;
                }
            }
        } catch (Throwable th5) {
            try {
                throw th5;
            } catch (Throwable th6) {
                ay3.L(xpg0VarZ0, th5);
                throw th6;
            }
        }
    }

    public static final qiu0 k(fet fetVar) {
        riu0 riu0VarA = ms00.a(fetVar);
        if (riu0VarA == null) {
            jf4.n("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
            return null;
        }
        xiu0 xiu0VarK = w9x.K(riu0VarA, fetVar, 14);
        boolean zG = fetVar.g(xiu0VarK);
        Object objP = fetVar.P();
        if (zG || objP == ukd.f35823a) {
            objP = new qiu0(new npt0(xiu0VarK, (byte) 11), new ugd(-1481256515, true, new gcn0(xiu0VarK, (byte) 17)));
            fetVar.o0(objP);
        }
        return (qiu0) objP;
    }

    public static void l(View view, CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 26) {
            ga3.G(view, charSequence);
            return;
        }
        uwq0 uwq0Var = uwq0.k;
        if (uwq0Var != null && uwq0Var.f36405a == view) {
            uwq0.b(null);
        }
        if (!TextUtils.isEmpty(charSequence)) {
            new uwq0(view, charSequence);
            return;
        }
        uwq0 uwq0Var2 = uwq0.l;
        if (uwq0Var2 != null && uwq0Var2.f36405a == view) {
            uwq0Var2.a();
        }
        view.setOnLongClickListener(null);
        view.setLongClickable(false);
        view.setOnHoverListener(null);
    }

    public static final y3n0 m(o4n0 o4n0Var) {
        o4n0Var.getClass();
        String str = o4n0Var.f24647a;
        if (str == null) {
            str = "";
        }
        String str2 = o4n0Var.b;
        return new y3n0(str, str2 != null ? str2 : "");
    }

    /* JADX WARN: Code duplicated, block: B:110:0x01c7 A[PHI: r13
  0x01c7: PHI (r13v3 ??) = (r13v2 ??), (r13v24 ??) binds: [B:103:0x01b1, B:108:0x01c2] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:119:0x01e1 A[PHI: r13
  0x01e1: PHI (r13v5 ??) = (r13v4 ??), (r13v19 ??) binds: [B:112:0x01cb, B:117:0x01dc] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v21 */
    /* JADX WARN: Type inference failed for: r0v22 */
    /* JADX WARN: Type inference failed for: r0v3, types: [a.f1p0] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7, types: [a.v0p0] */
    /* JADX WARN: Type inference failed for: r12v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r13v18 */
    /* JADX WARN: Type inference failed for: r13v19 */
    /* JADX WARN: Type inference failed for: r13v2, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r13v23 */
    /* JADX WARN: Type inference failed for: r13v24 */
    /* JADX WARN: Type inference failed for: r13v3 */
    /* JADX WARN: Type inference failed for: r13v33 */
    /* JADX WARN: Type inference failed for: r13v34 */
    /* JADX WARN: Type inference failed for: r13v4, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r13v5 */
    /* JADX WARN: Type inference failed for: r16v1 */
    /* JADX WARN: Type inference failed for: r16v2, types: [a.t1p0, java.lang.String] */
    /* JADX WARN: Type inference failed for: r16v3 */
    /* JADX WARN: Type inference failed for: r21v0 */
    /* JADX WARN: Type inference failed for: r21v1, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r21v2 */
    /* JADX WARN: Type inference failed for: r22v0 */
    /* JADX WARN: Type inference failed for: r22v1, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r22v2 */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v10, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4, types: [a.iun] */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v8, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v9, types: [a.iun] */
    public static final t1p0 n(a2p0 a2p0Var) {
        ?? r16;
        List list;
        ?? A0;
        List<z0p0> list2;
        ?? r21;
        ?? r22;
        k0p0 k0p0Var;
        s0p0 m0p0Var;
        Integer num;
        Integer num2;
        Integer num3;
        ?? arrayList;
        a2p0Var.getClass();
        Long l = a2p0Var.b;
        r1p0 r1p0Var = a2p0Var.d;
        if (l == null) {
            jf4.k(null);
            return null;
        }
        long jLongValue = l.longValue();
        Long l2 = a2p0Var.c;
        long jLongValue2 = l2 != null ? l2.longValue() : 0L;
        List<f2p0> list3 = a2p0Var.f134a;
        int i = 10;
        if (list3 != null) {
            ArrayList arrayList2 = new ArrayList(r3d.q(list3, 10));
            for (f2p0 f2p0Var : list3) {
                String str = f2p0Var.f8824a;
                if (str == null) {
                    jf4.k(null);
                    return null;
                }
                String str2 = f2p0Var.b;
                if (str2 == null) {
                    str2 = "";
                }
                String str3 = f2p0Var.d;
                if (str3 == null) {
                    str3 = "";
                }
                List<p4n0> list4 = f2p0Var.e;
                if (list4 != null) {
                    arrayList = new ArrayList(r3d.q(list4, i));
                    for (p4n0 p4n0Var : list4) {
                        String str4 = p4n0Var.f26362a;
                        if (str4 == null) {
                            str4 = "";
                        }
                        String str5 = p4n0Var.b;
                        if (str5 == null) {
                            str5 = "";
                        }
                        arrayList.add(new b2p0(str4, str5));
                    }
                } else {
                    arrayList = 0;
                }
                if (arrayList == 0) {
                    arrayList = iun.f15405a;
                }
                arrayList2.add(new c2p0(arrayList, str, str2, str3));
                i = 10;
            }
            r16 = 0;
            list = arrayList2;
        } else {
            r16 = 0;
            list = null;
        }
        if (list == null) {
            list = iun.f15405a;
        }
        ?? r0 = r1p0Var != null ? r1p0Var.f29693a : r16;
        long j = jLongValue2;
        c1p0 c1p0Var = new c1p0((r0 == 0 || (num3 = r0.f8776a) == null) ? 0 : num3.intValue(), (r0 == 0 || (num2 = r0.b) == null) ? 0 : num2.intValue(), (r0 == 0 || (num = r0.c) == null) ? 0 : num.intValue());
        ?? r1 = r1p0Var != null ? r1p0Var.b : r16;
        s0p0 n0p0Var = o0p0.f24439a;
        if (r1 != 0) {
            if (jLongValue == 1) {
                m0p0Var = new p0p0(r1.f36592a, r1.b, r1.c, r1.d, r1.e);
            } else if (jLongValue == 2) {
                m0p0Var = new q0p0(r1.f36592a, r1.f, r1.g, r1.h, r1.i);
            } else if (jLongValue == 4) {
                m0p0Var = new r0p0(r1.j, r1.k, r1.n, r1.l, r1.m);
            } else if (jLongValue == 66) {
                n0p0Var = new n0p0(r1.o, r1.p, r1.q, r1.r);
            } else if (jLongValue == 3) {
                m0p0Var = new m0p0(r1.s, r1.t, r1.u, r1.v, r1.w);
            }
            n0p0Var = m0p0Var;
        }
        if (r1p0Var == null || (list2 = r1p0Var.c) == null) {
            A0 = r16;
        } else {
            ArrayList arrayList3 = new ArrayList(r3d.q(list2, 10));
            for (z0p0 z0p0Var : list2) {
                String str6 = z0p0Var.f43580a;
                if (str6 == null) {
                    jf4.k(r16);
                    return r16;
                }
                String str7 = z0p0Var.b;
                String str8 = str7 == null ? "" : str7;
                String str9 = z0p0Var.c;
                String str10 = str9 == null ? "" : str9;
                ?? ValueOf = z0p0Var.e;
                if (ValueOf != 0) {
                    r21 = ValueOf;
                } else {
                    Integer num4 = z0p0Var.d;
                    ValueOf = num4 != null ? String.valueOf(num4.intValue()) : r16;
                    if (ValueOf == 0) {
                        r21 = "";
                    } else {
                        r21 = ValueOf;
                    }
                }
                ?? ValueOf2 = z0p0Var.g;
                if (ValueOf2 != 0) {
                    r22 = ValueOf2;
                } else {
                    Integer num5 = z0p0Var.f;
                    ValueOf2 = num5 != null ? String.valueOf(num5.intValue()) : r16;
                    if (ValueOf2 == 0) {
                        r22 = "";
                    } else {
                        r22 = ValueOf2;
                    }
                }
                Long l3 = z0p0Var.h;
                long jLongValue3 = l3 != null ? l3.longValue() : 0L;
                Integer num6 = z0p0Var.i;
                int iIntValue = num6 != null ? num6.intValue() : 0;
                Integer num7 = z0p0Var.j;
                if (num7 != null && num7.intValue() == 0) {
                    k0p0Var = k0p0.f17480a;
                } else if (num7 != null && num7.intValue() == 1) {
                    k0p0Var = k0p0.b;
                } else {
                    k0p0Var = (num7 != null && num7.intValue() == 2) ? k0p0.c : k0p0.d;
                }
                k0p0 k0p0Var2 = k0p0Var;
                Boolean bool = z0p0Var.k;
                arrayList3.add(new w0p0(str6, str8, str10, r21, r22, jLongValue3, iIntValue, k0p0Var2, bool != null ? bool.booleanValue() : false));
            }
            A0 = CollectionsKt.A0(arrayList3, new tgo0((byte) 8));
        }
        if (A0 == 0) {
            A0 = iun.f15405a;
        }
        return new t1p0(jLongValue, j, list, c1p0Var, n0p0Var, A0);
    }

    public static final frh o(y78 y78Var, d0t d0tVar, ctf0 ctf0Var, m5l0 m5l0Var, String str, String str2, String str3, ArrayList arrayList, List list, boolean z, boolean z2, boolean z3, boolean z4) {
        u3i x3iVar;
        u3i z3iVar;
        u3i v3iVar;
        Integer numValueOf;
        wqh uqhVar;
        d0tVar.getClass();
        str.getClass();
        ctf0Var.getClass();
        list.getClass();
        str3.getClass();
        long j = d0tVar.f5282a;
        boolean z5 = !d0tVar.z;
        boolean zB0 = kpb.b0(d0tVar, z);
        boolean zD0 = kpb.d0(d0tVar, z);
        boolean zA0 = kpb.a0(d0tVar, z, z4);
        boolean zF0 = kpb.f0(d0tVar, z);
        int i = d0tVar.O;
        boolean z6 = false;
        boolean z7 = arrayList.contains(Integer.valueOf(i)) && z2;
        String strA = jeb.K(d0tVar.O, d0tVar.v, arrayList, d0tVar.o, d0tVar.b, true, d0tVar.y.f26920a).a();
        if (z3 && arrayList.contains(Integer.valueOf(i))) {
            z6 = true;
        }
        c4i c4iVar = new c4i(strA, z6, new n0x(dtb.L(i, str, str2, arrayList, z2)), new m0x(R.drawable.ic_sport_boxing_champs_228, null, 6), z7 ? new y3d(y3d.g) : null, 32);
        if (zB0) {
            x3iVar = new x3i(d0tVar.E ? gtj.f11884a : gtj.b);
        } else {
            x3iVar = y3i.f41954a;
        }
        u3i u3iVar = x3iVar;
        if (zD0) {
            z3iVar = new z3i(d0tVar.D ? gtj.f11884a : gtj.b);
        } else {
            z3iVar = a4i.f224a;
        }
        u3i u3iVar2 = z3iVar;
        if (zA0 || zF0) {
            v3iVar = new v3i(zA0 ? c2i.f3624a : e2i.f7087a);
        } else {
            v3iVar = w3i.f38503a;
        }
        zqh zqhVar = new zqh(new i4i(z5, c4iVar, null, v3iVar, u3iVar2, u3iVar, null, 68), "");
        f0t f0tVar = d0tVar.r;
        int i2 = d0tVar.p.b;
        f0t f0tVar2 = d0tVar.q;
        if (f0tVar.b.length() == 0 && f0tVar.c.isEmpty()) {
            String str4 = f0tVar2.b;
            r0n r0nVarP = v2n0.p(d0tVar);
            numValueOf = i2 > 0 ? Integer.valueOf(i2) : null;
            uqhVar = new sqh(str4, r0nVarP, "", numValueOf != null ? ctf0Var.b.a(R.string.synthetic_round_v2, Arrays.copyOf(new Object[]{Integer.valueOf(numValueOf.intValue())}, 1)) : "");
        } else {
            yqh yqhVarQ = pvm0.q(f0tVar2, list);
            yqh yqhVarQ2 = pvm0.q(f0tVar, list);
            r0n r0nVarP2 = v2n0.p(d0tVar);
            numValueOf = i2 > 0 ? Integer.valueOf(i2) : null;
            uqhVar = new uqh(yqhVarQ, yqhVarQ2, str3, r0nVarP2, numValueOf != null ? ctf0Var.b.a(R.string.synthetic_round_v2, Arrays.copyOf(new Object[]{Integer.valueOf(numValueOf.intValue())}, 1)) : "");
        }
        return new frh(j, zqhVar, uqhVar, lvm0.k(d0tVar, ctf0Var, m5l0Var));
    }

    public static void p() {
        try {
            if (pyw0.a()) {
                throw new GeneralSecurityException("Cannot use non-FIPS-compliant AeadConfigurationV1 in FIPS mode");
            }
        } catch (GeneralSecurityException e) {
            itt0.o(e);
        }
    }
}
