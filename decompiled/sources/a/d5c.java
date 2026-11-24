package a;

import android.content.Context;
import android.content.res.Configuration;
import android.gov.nist.core.Separators;
import android.graphics.drawable.Drawable;
import android.javax.sip.message.Response;
import android.widget.ImageView;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Locale;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.xbet.client1.R;
import org.xplatform.bet_history.history.domain.model.HistoryMenuItem;
import org.xplatform.uikit.compose.color.StaticColors;
import org.xplatform.uikit.compose.color.ThemeColors;

/* JADX INFO: loaded from: classes6.dex */
public abstract class d5c {
    public static final void A(int i, fet fetVar, a4x a4xVar, mm40 mm40Var, Function1 function1) {
        mm40 mm40Var2;
        fetVar.g0(-1489117740);
        int i2 = i | 6;
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? fetVar.g(a4xVar) : fetVar.i(a4xVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.i(function1) ? 256 : 128;
        }
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            xcz xczVarA = ddz.a(0, 0, fetVar, 0, 3);
            jm40 jm40Var = jm40.b;
            mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarE0 = o2e.e0(i120.Q(o7k0.e(mm40VarD, 48.0f), ((ThemeColors) fetVar.k(zaq0.b)).getBackgroundContent(), jd8.n), "LAZY_ROW");
            yx7 yx7Var = gqw0.k;
            qw3 qw3Var = new qw3(8.0f, true, new jf4((byte) 14));
            lh80 lh80VarU = s5x0.u(xfn.a(fetVar).e, 0.0f, xfn.a(fetVar).e, 0.0f, 10);
            boolean zG = ((i2 & 112) == 32 || ((i2 & 64) != 0 && fetVar.i(a4xVar))) | fetVar.g(xczVarA) | ((i2 & 896) == 256);
            Object objP = fetVar.P();
            if (zG || objP == ukd.f35823a) {
                objP = new f8m((Object) a4xVar, (Object) xczVarA, (Object) function1, (byte) 29);
                fetVar.o0(objP);
            }
            b8k0.f(mm40VarE0, xczVarA, lh80VarU, false, qw3Var, yx7Var, null, false, null, (Function1) objP, fetVar, 196608, 456);
            mm40Var2 = jm40Var;
        } else {
            fetVar.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new u22(mm40Var2, a4xVar, function1, i, (byte) 9);
        }
    }

    /* JADX WARN: Code duplicated, block: B:40:0x00b7  */
    public static final void B(lc00 lc00Var, int i, long j, List list, ljg ljgVar, ctf0 ctf0Var) {
        Collection collectionJ;
        Collection collectionJ2;
        Object next;
        List listM = zsm0.m(ljgVar);
        list.getClass();
        listM.getClass();
        ctf0Var.getClass();
        kmg kmgVar = (kmg) CollectionsKt.W(i, list);
        if (kmgVar == null) {
            collectionJ = iun.f15405a;
        } else {
            e8h e8hVar = kmgVar.d;
            List list2 = e8hVar.e;
            e8h e8hVar2 = kmgVar.c;
            List list3 = e8hVar2.e;
            collectionJ = (list3.size() != 5 || list2.size() != 5 || e8hVar2.b.length() == 0 || e8hVar.b.length() == 0 || iom0.l(list3) || iom0.l(list2)) ? iun.f15405a : q3d.j(c9x.s(e8hVar2, true, listM, ctf0Var), c9x.s(e8hVar, false, listM, ctf0Var));
        }
        List list4 = upp0.f36078a;
        kmg kmgVar2 = (kmg) CollectionsKt.W(i, list);
        if (kmgVar2 != null) {
            e8h e8hVar3 = kmgVar2.d;
            e8h e8hVar4 = kmgVar2.c;
            String str = e8hVar4.b;
            List list5 = e8hVar4.e;
            if (str.length() == 0) {
                collectionJ2 = iun.f15405a;
            } else {
                String str2 = e8hVar3.b;
                List list6 = e8hVar3.e;
                if (str2.length() == 0 || list5.size() != 5 || list6.size() != 5 || upp0.a(list5) || upp0.a(list6)) {
                    collectionJ2 = iun.f15405a;
                } else {
                    collectionJ2 = q3d.j(etm0.i(e8hVar4, true, listM), etm0.i(e8hVar3, false, listM));
                }
            }
        } else {
            collectionJ2 = iun.f15405a;
        }
        lc00 lc00VarB = kotlin.collections.a.b();
        for (jma0 jma0Var : upp0.f36078a) {
            if (jma0Var != null) {
                if (jma0Var instanceof ima0) {
                    if (!collectionJ.isEmpty()) {
                        lc00VarB.add(jma0Var);
                    }
                } else if (jma0Var instanceof hma0) {
                    if (!collectionJ2.isEmpty()) {
                        lc00VarB.add(jma0Var);
                    }
                }
            }
            t9f.b();
            return;
        }
        lc00 lc00VarA = kotlin.collections.a.a(lc00VarB);
        if (lc00VarA.isEmpty()) {
            return;
        }
        ListIterator listIterator = lc00VarA.listIterator(0);
        do {
            paw pawVar = (paw) listIterator;
            if (!pawVar.hasNext()) {
                next = null;
                break;
            }
            next = pawVar.next();
        } while (((jma0) next).f16755a != j);
        jma0 jma0Var2 = (jma0) next;
        if (jma0Var2 == null) {
            jma0Var2 = (jma0) CollectionsKt.firstOrNull(lc00VarA);
        }
        if (jma0Var2 == null) {
            return;
        }
        long j2 = jma0Var2.f16755a;
        lc00Var.add(wzb.N(110L, R.string.cyber_statistic_title, ctf0Var, 24));
        ArrayList arrayList = new ArrayList(r3d.q(lc00VarA, 10));
        ListIterator listIterator2 = lc00VarA.listIterator(0);
        while (true) {
            paw pawVar2 = (paw) listIterator2;
            if (!pawVar2.hasNext()) {
                break;
            }
            jma0 jma0Var3 = (jma0) pawVar2.next();
            ListIterator listIterator3 = listIterator2;
            arrayList.add(new lxl(jma0Var3.f16755a, (dyl) new xxl(ctf0Var.b.a(jma0Var3.b, Arrays.copyOf(new Object[0], 0))), false, ((long) jma0Var3.f16755a) == j2 ? uxl.b : uxl.f36445a, (cwl) null, 108));
            listIterator2 = listIterator3;
        }
        y3d y3dVar = null;
        lc00Var.add(new boo0("STATISTICS_KILLS_TABS_KEY", new fyl(dyb.o0(arrayList), null, null, s5x0.t(xfn.b(ctf0Var.j()).e, 0.0f, 2), new jyl(new y3d(kkg.m), y3dVar, y3dVar, 126), 6), pno0.f27299a));
        if (j2 == 24) {
            lc00Var.addAll(collectionJ);
        } else if (j2 == 25) {
            lc00Var.addAll(collectionJ2);
        }
    }

    public static final m9s C(jlr jlrVar) {
        xkr xkrVar = jlrVar instanceof xkr ? (xkr) jlrVar : null;
        if (xkrVar != null) {
            return xkrVar.d;
        }
        return null;
    }

    public static IOException D(File file, IOException iOException) {
        StringBuilder sb = new StringBuilder("Inoperable file:");
        try {
            sb.append(" canonical[" + file.getCanonicalPath() + "] freeSpace[" + file.getFreeSpace() + ']');
        } catch (IOException unused) {
            sb.append(" failed to attach additional metadata");
        }
        return new IOException(sb.toString(), iOException);
    }

    public static IOException E(File file, IOException iOException) {
        File parentFile = file.getParentFile();
        if (parentFile == null) {
            return D(file, iOException);
        }
        if (!parentFile.exists()) {
            return D(file, iOException);
        }
        if (parentFile.isFile()) {
            if (parentFile.canRead()) {
                return parentFile.canWrite() ? D(file, iOException) : D(file, iOException);
            }
            return parentFile.canWrite() ? D(file, iOException) : D(file, iOException);
        }
        if (parentFile.canRead()) {
            return parentFile.canWrite() ? D(file, iOException) : D(file, iOException);
        }
        return parentFile.canWrite() ? D(file, iOException) : D(file, iOException);
    }

    /* JADX WARN: Code duplicated, block: B:130:0x02e6  */
    /* JADX WARN: Code duplicated, block: B:135:0x02fa  */
    /* JADX WARN: Code duplicated, block: B:169:0x0378  */
    /* JADX WARN: Code duplicated, block: B:174:0x038c  */
    /* JADX WARN: Code duplicated, block: B:241:0x04ec  */
    /* JADX WARN: Code duplicated, block: B:244:0x04f7  */
    /* JADX WARN: Code duplicated, block: B:247:0x0520  */
    /* JADX WARN: Code duplicated, block: B:249:0x0534  */
    /* JADX WARN: Code duplicated, block: B:250:0x0536  */
    /* JADX WARN: Code duplicated, block: B:252:0x053a  */
    /* JADX WARN: Code duplicated, block: B:255:0x054b  */
    /* JADX WARN: Code duplicated, block: B:257:0x0550  */
    /* JADX WARN: Code duplicated, block: B:263:0x05b1  */
    /* JADX WARN: Code duplicated, block: B:264:0x05b5  */
    /* JADX WARN: Code duplicated, block: B:266:0x05bb  */
    /* JADX WARN: Code duplicated, block: B:318:0x0715  */
    /* JADX WARN: Code duplicated, block: B:319:0x0718  */
    /* JADX WARN: Code duplicated, block: B:323:0x071f  */
    /* JADX WARN: Code duplicated, block: B:353:0x086c  */
    /* JADX WARN: Code duplicated, block: B:468:0x0b98  */
    /* JADX WARN: Code duplicated, block: B:472:0x0bc1  */
    /* JADX WARN: Code duplicated, block: B:478:0x0bd7  */
    /* JADX WARN: Code duplicated, block: B:482:0x0c39 A[LOOP:28: B:480:0x0c33->B:482:0x0c39, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:53:0x0148  */
    /* JADX WARN: Code duplicated, block: B:592:0x0fbd  */
    /* JADX WARN: Code duplicated, block: B:613:0x0566 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:628:0x03b8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:635:0x03b8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:693:0x0bd2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:694:0x0bd0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:695:? A[LOOP:27: B:470:0x0bbb->B:695:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v13 */
    /* JADX WARN: Type inference failed for: r14v19, types: [a.y3d] */
    /* JADX WARN: Type inference failed for: r19v10, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r19v7 */
    /* JADX WARN: Type inference failed for: r19v8 */
    /* JADX WARN: Type inference failed for: r21v3 */
    /* JADX WARN: Type inference failed for: r21v4 */
    /* JADX WARN: Type inference failed for: r21v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v115, types: [a.iun] */
    /* JADX WARN: Type inference failed for: r2v116, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v117, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v81 */
    /* JADX WARN: Type inference failed for: r2v82 */
    /* JADX WARN: Type inference failed for: r2v87, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r34v5, types: [a.a4x] */
    /* JADX WARN: Type inference failed for: r4v101 */
    /* JADX WARN: Type inference failed for: r63v1 */
    /* JADX WARN: Type inference failed for: r63v2, types: [a.lc00, java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r63v7 */
    /* JADX WARN: Type inference failed for: r6v104 */
    /* JADX WARN: Type inference failed for: r7v57 */
    /* JADX WARN: Type inference failed for: r7v58 */
    /* JADX WARN: Type inference failed for: r7v62 */
    /* JADX WARN: Type inference failed for: r7v63 */
    /* JADX WARN: Type inference failed for: r7v66, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v69, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v77 */
    /* JADX WARN: Type inference failed for: r7v78, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r7v93 */
    /* JADX WARN: Type inference failed for: r9v48 */
    /* JADX WARN: Type inference failed for: r9v49 */
    /* JADX WARN: Type inference failed for: r9v50, types: [a.ieh] */
    /* JADX WARN: Type inference failed for: r9v51 */
    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r2v54 java.lang.Object, still in use, count: 2, list:
          (r2v54 java.lang.Object) from 0x0b94: PHI (r2 I:??) = (r2v48 java.lang.Object), (r2v54 java.lang.Object) binds: [B:465:0x0b93, B:691:0x0b94] A[DONT_GENERATE, DONT_INLINE]
          (r2v54 java.lang.Object) from 0x0b88: CHECK_CAST (a.wmg) (r2v54 java.lang.Object)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
        	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:132)
        	at jadx.core.dex.visitors.regions.TernaryMod.processRegion(TernaryMod.java:67)
        	at jadx.core.dex.visitors.regions.TernaryMod.enterRegion(TernaryMod.java:50)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:96)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:27)
        	at jadx.core.dex.visitors.regions.TernaryMod.process(TernaryMod.java:36)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.process(IfRegionVisitor.java:44)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.visit(IfRegionVisitor.java:30)
        */
    public static final a.lc00 F(a.dqg r51, a.ctf0 r52, long r53, long r55, boolean r57, long r58, boolean r60, long r61, a.ypl0 r63, int r64, long r65, long r67, long r69, a.o4i0 r71, a.hyx r72, long r73, java.util.List r75, java.util.ArrayList r76, boolean r77, java.util.List r78, boolean r79) {
        /*
            Method dump skipped, instruction units count: 4156
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.d5c.F(a.dqg, a.ctf0, long, long, boolean, long, boolean, long, a.ypl0, int, long, long, long, a.o4i0, a.hyx, long, java.util.List, java.util.ArrayList, boolean, java.util.List, boolean):a.lc00");
    }

    public static final void G(vne vneVar, CancellationException cancellationException) {
        bby bbyVar = (bby) vneVar.getCoroutineContext().get(gqw0.o1);
        if (bbyVar != null) {
            bbyVar.cancel(cancellationException);
        } else {
            udk.e(vneVar, "Scope cannot be cancelled because it does not have a job: ");
        }
    }

    public static final void H(long j, ma80 ma80Var) {
        if (ma80Var == ma80.f21447a) {
            if (p4e.h(j) != Integer.MAX_VALUE) {
                return;
            }
            adx.c("Vertically scrollable component was measured with an infinity maximum height constraints, which is disallowed. One of the common reasons is nesting layouts like LazyColumn and Column(Modifier.verticalScroll()). If you want to add a header before the list of items please add a header as a separate item() before the main items() inside the LazyColumn scope. There could be other reasons for this to happen: your ComposeView was added into a LinearLayout with some weight, you applied Modifier.wrapContentSize(unbounded = true) or wrote a custom layout. Please try to remove the source of infinite constraints in the hierarchy above the scrolling container.");
        } else {
            if (p4e.i(j) != Integer.MAX_VALUE) {
                return;
            }
            adx.c("Horizontally scrollable component was measured with an infinity maximum width constraints, which is disallowed. One of the common reasons is nesting layouts like LazyRow and Row(Modifier.horizontalScroll()). If you want to add a header before the list of items please add a header as a separate item() before the main items() inside the LazyRow scope. There could be other reasons for this to happen: your ComposeView was added into a LinearLayout with some weight, you applied Modifier.wrapContentSize(unbounded = true) or wrote a custom layout. Please try to remove the source of infinite constraints in the hierarchy above the scrolling container.");
        }
    }

    public static final List I(ArrayList arrayList) {
        int size = arrayList.size();
        if (size == 0) {
            return iun.f15405a;
        }
        if (size == 1) {
            return kotlin.collections.a.c(CollectionsKt.U(arrayList));
        }
        arrayList.trimToSize();
        return arrayList;
    }

    public static final Object J(yje yjeVar, Function2 function2) {
        a3h0 a3h0Var = new a3h0(yjeVar, yjeVar.getContext());
        Object objZ = ycm0.z(a3h0Var, true, a3h0Var, function2);
        wne wneVar = wne.f39444a;
        return objZ;
    }

    public static final ank0 K(float f, ctf0 ctf0Var, boolean z) {
        ArrayList arrayList = new ArrayList();
        k3m k3mVar = new k3m(f, ctf0Var, z);
        bnk0 bnk0Var = new bnk0();
        k3mVar.invoke(bnk0Var);
        return w6x.l(arrayList, bnk0Var.f2888a, arrayList);
    }

    public static final void L(vne vneVar) {
        zvw.O(vneVar.getCoroutineContext());
    }

    public static final List M(Object obj) {
        Field[] declaredFields = obj.getClass().getDeclaredFields();
        declaredFields.getClass();
        ArrayList arrayList = new ArrayList();
        for (Field field : declaredFields) {
            i5d i5dVar = null;
            try {
                if (!field.isSynthetic()) {
                    field.setAccessible(true);
                    if (Intrinsics.d(field.getType(), Long.TYPE) || Intrinsics.d(field.getType(), Long.class)) {
                        long j = field.getLong(obj);
                        g2t0 g2t0Var = h2t0.b;
                        int i = y3d.h;
                        String name = field.getName();
                        name.getClass();
                        if (name.length() > 0) {
                            StringBuilder sb = new StringBuilder();
                            String strValueOf = String.valueOf(name.charAt(0));
                            strValueOf.getClass();
                            String upperCase = strValueOf.toUpperCase(Locale.ROOT);
                            upperCase.getClass();
                            sb.append((Object) upperCase);
                            sb.append(name.substring(1));
                            name = sb.toString();
                        }
                        i5dVar = new i5d(j, name);
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
            if (i5dVar != null) {
                arrayList.add(i5dVar);
            }
        }
        return arrayList;
    }

    public static final long N(boolean z, ipm ipmVar) {
        if (z) {
            pz40 pz40Var = s6t0.f31722a;
            return StaticColors.INSTANCE.m98getGreen0d7_KjU();
        }
        if (ipmVar != null) {
            if (ipmVar instanceof gpm) {
                pz40 pz40Var2 = s6t0.f31722a;
                return StaticColors.INSTANCE.m123getWhite0d7_KjU();
            }
            if (ipmVar instanceof hpm) {
                pz40 pz40Var3 = s6t0.f31722a;
                return s6t0.b().f33626a.getTextPrimary();
            }
        }
        t9f.b();
        return 0L;
    }

    public static final j83 O(String str, String str2, boolean z, boolean z2, ipm ipmVar) {
        str.getClass();
        str2.getClass();
        ipmVar.getClass();
        h83 h83Var = new h83();
        int iG = h83Var.g(new smk0(N(z, ipmVar), 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, 65534));
        try {
            h83Var.c(ttm0.L(5, str));
            h83Var.d(iG);
            int iG2 = h83Var.g(new smk0(N(false, ipmVar), 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, 65534));
            try {
                h83Var.c(" : ");
                h83Var.d(iG2);
                int iG3 = h83Var.g(new smk0(N(z2, ipmVar), 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, 65534));
                try {
                    h83Var.c(ttm0.L(5, str2));
                    return h83Var.h();
                } finally {
                    h83Var.d(iG3);
                }
            } catch (Throwable th) {
                h83Var.d(iG2);
                throw th;
            }
        } catch (Throwable th2) {
            h83Var.d(iG);
            throw th2;
        }
    }

    public static final List P(h2g h2gVar) {
        List list;
        ArrayList arrayList = null;
        if (h2gVar != null && (list = h2gVar.c) != null) {
            ArrayList arrayList2 = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                String str = ((z9h) it.next()).c;
                String strP0 = str != null ? StringsKt.p0(str, Separators.SLASH, str) : null;
                if (strP0 != null) {
                    arrayList2.add(strP0);
                }
            }
            arrayList = arrayList2;
        }
        return arrayList == null ? iun.f15405a : arrayList;
    }

    public static final String Q(q7f0 q7f0Var, ctf0 ctf0Var, Integer num) {
        int i;
        ctf0Var.getClass();
        int iOrdinal = q7f0Var.ordinal();
        if (iOrdinal == 0) {
            return ctf0Var.b.a(R.string.visual_registration_by_email, Arrays.copyOf(new Object[0], 0));
        }
        if (iOrdinal == 1) {
            return ctf0Var.b.a(R.string.registration_by_phone, Arrays.copyOf(new Object[0], 0));
        }
        if (iOrdinal == 2) {
            return ctf0Var.b.a(R.string.visual_registration_by_one_click, Arrays.copyOf(new Object[0], 0));
        }
        if (iOrdinal != 3) {
            if (iOrdinal == 4) {
                return ctf0Var.b.a(R.string.reg_import_PD, Arrays.copyOf(new Object[0], 0));
            }
            t9f.b();
            return null;
        }
        if (num == null) {
            return ctf0Var.b.a(R.string.visual_registration_by_social_networks, Arrays.copyOf(new Object[0], 0));
        }
        int iIntValue = num.intValue();
        if (iIntValue == 1) {
            i = R.string.social_vk;
        } else if (iIntValue == 5) {
            i = R.string.social_ok;
        } else if (iIntValue == 7) {
            i = R.string.social_yandex;
        } else if (iIntValue == 9) {
            i = R.string.social_mailru_label_new;
        } else if (iIntValue == 11) {
            i = R.string.social_google;
        } else if (iIntValue == 13) {
            i = R.string.social_x_com;
        } else if (iIntValue == 17) {
            i = R.string.social_telegram;
        } else if (iIntValue == 19) {
            i = R.string.social_apple_id;
        } else if (iIntValue != 26) {
            i = iIntValue != 31 ? -1 : R.string.social_discord;
        } else {
            i = R.string.social_its_me;
        }
        lsm0 lsm0Var = ctf0Var.b;
        return lsm0Var.a(R.string.registration_networks_one_v2, Arrays.copyOf(new Object[]{lsm0Var.a(i, Arrays.copyOf(new Object[0], 0))}, 1));
    }

    public static final boolean R(vne vneVar) {
        bby bbyVar = (bby) vneVar.getCoroutineContext().get(gqw0.o1);
        if (bbyVar != null) {
            return bbyVar.isActive();
        }
        return true;
    }

    public static final sje S(vne vneVar, CoroutineContext coroutineContext) {
        return new sje(vneVar.getCoroutineContext().plus(coroutineContext));
    }

    public static final void T(ImageView imageView, String str) {
        imageView.setScaleX(cy7.c() ? -1.0f : 1.0f);
        if (str.length() <= 0) {
            imageView.setVisibility(8);
            return;
        }
        imageView.setVisibility(0);
        List list = u0d.f34849a;
        u0d.j(imageView, str, R.drawable.cs2_weapon_log_placeholder, 0, null, null, null, 508);
    }

    public static boolean U(guo guoVar, boolean z) {
        int i;
        fq80 fq80Var = new fq80(16);
        boolean z2 = true;
        while (true) {
            fq80Var.J(8);
            if (!guoVar.b(fq80Var.f9961a, 0, 8, true)) {
                break;
            }
            long jB = fq80Var.B();
            int iM = fq80Var.m();
            if (jB != 1) {
                i = 8;
            } else {
                if (!guoVar.b(fq80Var.f9961a, 8, 8, true)) {
                    break;
                }
                fq80Var.L(16);
                jB = fq80Var.F();
                i = 16;
            }
            long j = i;
            if (jB < j) {
                break;
            }
            int i2 = (int) (jB - j);
            if (z2) {
                if (iM != 1718909296 || i2 < 8) {
                    break;
                }
                fq80Var.J(4);
                guoVar.n(fq80Var.f9961a, 0, 4);
                if (fq80Var.m() != 1751476579) {
                    break;
                }
                if (!z) {
                    return true;
                }
                guoVar.j(i2 - 4);
                z2 = false;
            } else {
                if (iM == 1836086884) {
                    return true;
                }
                if (i2 != 0) {
                    guoVar.j(i2);
                }
            }
        }
        return false;
    }

    public static final vpl V(myr0 myr0Var, ypl yplVar, ctf0 ctf0Var, Locale locale) {
        xpl xplVar;
        String strA;
        String strA2;
        Locale locale2;
        String strD;
        int i;
        String strA3;
        jdk0 jdk0Var = jdk0.e;
        rdj rdjVar = rdj.f30294a;
        myr0Var.getClass();
        yplVar.getClass();
        ctf0Var.getClass();
        locale.getClass();
        long j = myr0Var.f22617a;
        hyr0 hyr0Var = myr0Var.f;
        String str = hyr0Var.f13873a;
        lsm0 lsm0Var = ctf0Var.b;
        boolean zH = ctf0Var.h();
        Date date = hyr0Var.d;
        Date date2 = hyr0Var.e;
        efj efjVar = efj.UNIVERSAL;
        String strL = kng0.l(rdj.d(rdjVar, date, Boolean.valueOf(zH), locale, 24), " — ", rdj.d(rdjVar, date2, Boolean.valueOf(zH), locale, 24));
        String str2 = hyr0Var.h;
        List list = u0d.f34849a;
        n0x n0xVar = new n0x(u0d.q(myr0Var.e.c));
        kyr0 kyr0Var = myr0Var.d;
        pek0 pek0Var = pek0.e;
        boolean zEquals = kyr0Var.equals(pek0Var);
        jyr0 jyr0Var = jyr0.f17375a;
        if (zEquals) {
            xplVar = xpl.f41275a;
        } else if (kyr0Var.equals(jdk0Var)) {
            xplVar = xpl.b;
        } else {
            if (!kyr0Var.equals(jyr0Var)) {
                t9f.b();
                return null;
            }
            xplVar = xpl.c;
        }
        if (kyr0Var.equals(pek0Var)) {
            strA = lsm0Var.a(R.string.tournament_status_waiting, Arrays.copyOf(new Object[0], 0));
        } else if (kyr0Var.equals(jdk0Var)) {
            strA = lsm0Var.a(R.string.tournament_status_active, Arrays.copyOf(new Object[0], 0));
        } else {
            if (!kyr0Var.equals(jyr0Var)) {
                t9f.b();
                return null;
            }
            strA = lsm0Var.a(R.string.tournament_status_finished, Arrays.copyOf(new Object[0], 0));
        }
        lyr0 lyr0Var = myr0Var.c;
        if (lyr0Var.equals(rek0.f)) {
            strA2 = null;
        } else {
            if (!lyr0Var.equals(qek0.f)) {
                t9f.b();
                return null;
            }
            strA2 = lsm0Var.a(R.string.tournament_with_steps, Arrays.copyOf(new Object[0], 0));
        }
        boolean z = yplVar == ypl.e || yplVar == ypl.d;
        if (z) {
            locale2 = null;
            strD = rdj.c(rdjVar, sdj.UNIVERSAL, date, null, 60);
        } else {
            locale2 = null;
            strD = rdj.d(rdjVar, date, Boolean.valueOf(ctf0Var.h()), null, 56);
        }
        String strC = z ? rdj.c(rdjVar, sdj.UNIVERSAL, date2, locale2, 60) : rdj.d(rdjVar, date2, Boolean.valueOf(ctf0Var.h()), locale2, 56);
        if (strD.length() > 0) {
            i = 0;
            strA3 = lsm0Var.a(R.string.tournament_title_date_start, Arrays.copyOf(new Object[0], 0));
        } else {
            i = 0;
            strA3 = "";
        }
        return new vpl(j, str2, str, xplVar, strA, n0xVar, strL, strA2, new wpl(strA3, strD, strC.length() > 0 ? lsm0Var.a(R.string.tournament_title_date_end, Arrays.copyOf(new Object[i], i)) : "", strC));
    }

    public static final k4g W(r4g r4gVar) {
        List arrayList;
        r4gVar.getClass();
        Long l = r4gVar.f29832a;
        long jLongValue = l != null ? l.longValue() : 0L;
        Long l2 = r4gVar.b;
        long jLongValue2 = l2 != null ? l2.longValue() : 0L;
        List<n4g> list = r4gVar.c;
        if (list != null) {
            arrayList = new ArrayList(r3d.q(list, 10));
            for (n4g n4gVar : list) {
                Integer num = n4gVar.f22896a;
                int iIntValue = num != null ? num.intValue() : 0;
                List list2 = n4gVar.b;
                if (list2 == null) {
                    list2 = iun.f15405a;
                }
                arrayList.add(new d5g(iIntValue, list2));
            }
        } else {
            arrayList = null;
        }
        if (arrayList == null) {
            arrayList = iun.f15405a;
        }
        return new k4g(jLongValue, jLongValue2, arrayList);
    }

    public static final y2m X(xah xahVar, ctf0 ctf0Var) {
        long j = xahVar.g;
        int i = xahVar.e;
        int i2 = xahVar.d;
        String strM0 = xahVar.f;
        if (xahVar.i == 243) {
            strM0 = StringsKt.m0(strM0, ". ", strM0);
        }
        n0x n0xVar = new n0x(xahVar.l);
        String strValueOf = String.valueOf(i2);
        String strValueOf2 = String.valueOf(i);
        return new y2m(j, strM0, ctf0Var.j() ? new n0x(xahVar.b) : new n0x(xahVar.f40554a), ctf0Var.j() ? new m0x(R.drawable.cybergames_tablet_champ_placeholder, null, 6) : new m0x(R.drawable.cybergames_champ_placeholder, null, 6), xahVar.m, i2 > 0, i > 0, strValueOf, strValueOf2, xahVar.h, xahVar.k, n0xVar, 4096);
    }

    public static final wdo Y(z0w z0wVar, String str, String str2) {
        str.getClass();
        return new wdo(h97.h(z0wVar.i, "EventInfoBlockUiModel"), str, str2);
    }

    public static final yto Z(HistoryMenuItem historyMenuItem, boolean z) {
        historyMenuItem.getClass();
        int iN = z ? R.drawable.ic_bell_on_new : R.drawable.ic_bell_off_new;
        if (historyMenuItem != HistoryMenuItem.f46392a) {
            iN = kkb.N(historyMenuItem);
        }
        return new yto(historyMenuItem, new wul(qul.e, oe9.c, new te9(iN), true, false, false));
    }

    public static final sje a(CoroutineContext coroutineContext) {
        if (coroutineContext.get(gqw0.o1) == null) {
            coroutineContext = coroutineContext.plus(zvw.g());
        }
        return new sje(coroutineContext);
    }

    public static final csr a0(rk10 rk10Var) {
        esr esrVar;
        dsr dsrVar;
        rk10Var.getClass();
        uk10 uk10Var = rk10Var.f30625a;
        if (uk10Var != null) {
            switch (uk10Var.ordinal()) {
                case 1:
                    esrVar = esr.DOUBLE_BONUS;
                    break;
                case 2:
                    esrVar = esr.RETURN_HALF;
                    break;
                case 3:
                    esrVar = esr.FREE_BET;
                    break;
                case 4:
                    esrVar = esr.FREE_SPIN;
                    break;
                case 5:
                    esrVar = esr.WILD_FREE_BET;
                    break;
                case 6:
                    esrVar = esr.SPECIAL_BONUS;
                    break;
                default:
                    esrVar = esr.NOTHING;
                    break;
            }
        } else {
            esrVar = esr.NOTHING;
        }
        long j = rk10Var.f30625a == uk10.WILD_FREE_BET ? 0L : rk10Var.c;
        Double d = rk10Var.g;
        bsr bsrVar = new bsr(esrVar, j, d != null ? d.doubleValue() : 0.0d);
        String str = rk10Var.b;
        if (str == null) {
            str = "";
        }
        String str2 = str;
        de8 de8Var = rk10Var.d;
        if (de8Var != null) {
            int iOrdinal = de8Var.ordinal();
            if (iOrdinal != 1) {
                dsrVar = iOrdinal != 2 ? dsr.b : dsr.d;
            } else {
                dsrVar = dsr.c;
            }
        } else {
            dsrVar = dsr.b;
        }
        return new csr(bsrVar, str2, dsrVar, rk10Var.e);
    }

    public static final void b(mm40 mm40Var, eph ephVar, fet fetVar, int i) {
        ephVar.getClass();
        fetVar.g0(581594888);
        int i2 = i | 6 | (fetVar.g(ephVar) ? 32 : 16);
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            boolean z = ephVar instanceof dph;
            jm40 jm40Var = jm40.b;
            if (z) {
                fetVar.e0(566945601);
                aac.f(jm40Var, (dph) ephVar, fetVar, i2 & 126);
                fetVar.r(false);
            } else {
                if (!(ephVar instanceof cph)) {
                    throw b1j.f(566943252, fetVar, false);
                }
                fetVar.e0(566951282);
                n4c.c(jm40Var, (cph) ephVar, fetVar, i2 & 126);
                fetVar.r(false);
            }
            mm40Var = jm40Var;
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new chh(mm40Var, ephVar, i, (byte) 8);
        }
    }

    public static final oas b0(h2g h2gVar) {
        List listL0;
        List list;
        List list2;
        z9h z9hVar;
        Long l = (h2gVar == null || (list2 = h2gVar.c) == null || (z9hVar = (z9h) CollectionsKt.firstOrNull(list2)) == null) ? null : z9hVar.f44018a;
        String str = h2gVar != null ? h2gVar.f12331a : null;
        if (h2gVar == null || (list = h2gVar.c) == null) {
            listL0 = null;
        } else {
            ArrayList arrayList = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                Long l2 = ((z9h) it.next()).f44018a;
                if (l2 != null) {
                    arrayList.add(l2);
                }
            }
            listL0 = CollectionsKt.L0(arrayList);
        }
        return new oas(l, str, listL0, h2gVar != null ? P(h2gVar) : null, h2gVar != null ? h2gVar.b : null);
    }

    public static final void c(mm40 mm40Var, c4i c4iVar, u3i u3iVar, u3i u3iVar2, u3i u3iVar3, Function1 function1, fet fetVar, int i) {
        u3i u3iVar4;
        u3i u3iVar5;
        u3i u3iVar6;
        fet fetVar2;
        c4i c4iVar2;
        boolean z;
        Function1 function2;
        jm40 jm40Var;
        o0x o0xVar = c4iVar.c;
        function1.getClass();
        fetVar.g0(-124873247);
        int i2 = i | (fetVar.g(mm40Var) ? 4 : 2) | (fetVar.g(c4iVar) ? 32 : 16) | (fetVar.g(u3iVar) ? 256 : 128) | (fetVar.g(u3iVar2) ? 2048 : 1024) | (fetVar.g(u3iVar3) ? 16384 : 8192);
        if ((i & 196608) == 0) {
            i2 |= fetVar.i(function1) ? 131072 : 65536;
        }
        int i3 = i2;
        if (fetVar.U(i3 & 1, (74899 & i3) != 74898)) {
            zcl zclVar = qmk.f28987a;
            int iB = si30.b(pkd.b(8.0f, fetVar));
            int iB2 = si30.b(pkd.b(38.0f, fetVar));
            int i4 = iB2 / 2;
            mm40 mm40VarE0 = o2e.e0(o7k0.e(mm40Var, 38.0f), "EVENT_CARD_TOP_LAYOUT");
            int i5 = i3 & 896;
            boolean zE = ((i3 & 7168) == 2048) | ((i3 & 112) == 32) | (i5 == 256) | ((57344 & i3) == 16384) | fetVar.e(iB) | fetVar.e(iB2) | fetVar.e(i4);
            Object objP = fetVar.P();
            if (zE || objP == ukd.f35823a) {
                n2i n2iVar = new n2i(c4iVar, u3iVar, u3iVar2, u3iVar3, iB, iB2, i4);
                c4iVar2 = c4iVar;
                u3iVar4 = u3iVar;
                u3iVar5 = u3iVar2;
                u3iVar6 = u3iVar3;
                fetVar.o0(n2iVar);
                objP = n2iVar;
            } else {
                u3iVar4 = u3iVar;
                u3iVar5 = u3iVar2;
                u3iVar6 = u3iVar3;
                c4iVar2 = c4iVar;
            }
            tj30 tj30Var = (tj30) objP;
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarE0);
            mkd.c0.getClass();
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(e7z.u1);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, tj30Var, gqw0.x);
            jpm0.o(fetVar, bh90VarM, gqw0.w);
            jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar);
            jpm0.o(fetVar, mm40VarC0, gqw0.v);
            if (o0xVar == null || !c4iVar2.b) {
                z = false;
                fetVar.e0(1832870680);
                fetVar.r(false);
            } else {
                fetVar.e0(1832797644);
                z = false;
                i(0, fetVar);
                fetVar.r(false);
            }
            if (o0xVar != null) {
                fetVar.e0(1832929673);
                fetVar2 = fetVar;
                j(c4iVar2.c, c4iVar2.d, c4iVar2.e, c4iVar2.f, fetVar2, 0);
                fetVar2.r(z);
            } else {
                fetVar2 = fetVar;
                fetVar2.e0(1833282360);
                fetVar2.r(z);
            }
            jm40 jm40Var2 = jm40.b;
            f(6, fetVar2, o2e.e0(jm40Var2, "EVENT_CARD_CHAMP_LABEL"), c4iVar2.f3727a);
            if (u3iVar4 instanceof v3i) {
                fetVar2.e0(1833569699);
                v3i v3iVar = (v3i) u3iVar4;
                jm40Var = jm40Var2;
                d(s5x0.N(jm40Var, 0.0f, 2.0f, 0.0f, 0.0f, 13), v3iVar.f36733a instanceof d2i, v3iVar, function1, fetVar2, i5 | ((i3 >> 6) & 7168));
                function2 = function1;
                fetVar2.r(false);
            } else {
                function2 = function1;
                jm40Var = jm40Var2;
                fetVar2.e0(1833989656);
                fetVar2.r(false);
            }
            if (u3iVar5 instanceof z3i) {
                fetVar2.e0(1834092762);
                h(s5x0.N(jm40Var, 0.0f, 2.0f, 0.0f, 0.0f, 13), (z3i) u3iVar5, function2, fetVar2, ((i3 >> 6) & 112) | ((i3 >> 9) & 896));
                fetVar2.r(false);
            } else {
                fetVar2.e0(1834367608);
                fetVar2.r(false);
            }
            if (u3iVar6 instanceof x3i) {
                fetVar2.e0(1834462406);
                g(s5x0.N(jm40Var, 0.0f, 2.0f, 0.0f, 0.0f, 13), (x3i) u3iVar6, function2, fetVar2, (i3 >> 9) & 1008);
                fetVar2.r(false);
            } else {
                fetVar2.e0(1834725720);
                fetVar2.r(false);
            }
            fetVar2.r(true);
        } else {
            u3iVar4 = u3iVar;
            u3iVar5 = u3iVar2;
            u3iVar6 = u3iVar3;
            fetVar2 = fetVar;
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new cg0((Object) mm40Var, (Object) c4iVar, (Object) u3iVar4, (Object) u3iVar5, (Object) u3iVar6, (Object) function1, i, (byte) 9);
        }
    }

    /* JADX WARN: Code duplicated, block: B:116:0x02b0  */
    /* JADX WARN: Code duplicated, block: B:175:0x0431  */
    public static final List c0(g4t g4tVar) {
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        ArrayList arrayList4;
        long jLongValue;
        Long l;
        Long l2;
        ArrayList arrayList5;
        ArrayList arrayList6;
        long jLongValue2;
        Long l3;
        ArrayList arrayList7;
        ArrayList arrayList8;
        Long l4;
        g4tVar.getClass();
        hmz hmzVar = g4tVar.f10685a;
        long jLongValue3 = (hmzVar == null || (l4 = hmzVar.f13327a) == null) ? 0L : l4.longValue();
        String str = hmzVar != null ? hmzVar.b : null;
        if (str == null) {
            str = "";
        }
        String str2 = str;
        Integer num = hmzVar != null ? hmzVar.d : null;
        List list = g4tVar.c;
        if (list != null) {
            ArrayList arrayList9 = new ArrayList(r3d.q(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ybb ybbVar = (ybb) it.next();
                List list2 = ybbVar.D;
                Long l5 = ybbVar.f42335a;
                Long l6 = ybbVar.q;
                Boolean bool = ybbVar.v;
                Boolean bool2 = ybbVar.x;
                ua30 ua30Var = ybbVar.G;
                okl0 okl0Var = ybbVar.z;
                h2g h2gVar = ybbVar.C;
                h2g h2gVar2 = ybbVar.B;
                Long l7 = ybbVar.b;
                Iterator it2 = it;
                Long l8 = ybbVar.c;
                Integer num2 = ybbVar.t;
                gxs gxsVar = ybbVar.E;
                okl0 okl0Var2 = ybbVar.A;
                long j = jLongValue3;
                if (list2 != null) {
                    arrayList2 = new ArrayList(r3d.q(list2, 10));
                    Iterator it3 = list2.iterator();
                    while (it3.hasNext()) {
                        cas casVar = (cas) it3.next();
                        Long l9 = casVar.f4027a;
                        long jLongValue4 = l9 != null ? l9.longValue() : 0L;
                        List list3 = casVar.c;
                        Iterator it4 = it3;
                        if (list3 != null) {
                            int i = 10;
                            arrayList8 = new ArrayList(r3d.q(list3, 10));
                            Iterator it5 = list3.iterator();
                            while (it5.hasNext()) {
                                List list4 = (List) it5.next();
                                Iterator it6 = it5;
                                Long l10 = l6;
                                ArrayList arrayList10 = new ArrayList(r3d.q(list4, i));
                                Iterator it7 = list4.iterator();
                                while (it7.hasNext()) {
                                    gas gasVar = (gas) it7.next();
                                    Long l11 = casVar.f4027a;
                                    Iterator it8 = it7;
                                    arrayList10.add(u1c.U(gasVar, l11 != null ? l11.longValue() : 0L, ybbVar.t, ybbVar.f42335a, ybbVar.w, okl0Var2 != null ? okl0Var2.f25410a : null));
                                    it7 = it8;
                                }
                                arrayList8.add(arrayList10);
                                it5 = it6;
                                l6 = l10;
                                i = 10;
                            }
                        } else {
                            arrayList8 = null;
                        }
                        Long l12 = l6;
                        arrayList2.add(new u9s(arrayList8, Long.valueOf(jLongValue4), casVar.d));
                        it3 = it4;
                        l7 = l7;
                        l5 = l5;
                        l6 = l12;
                    }
                } else {
                    arrayList2 = null;
                }
                Long l13 = l7;
                Long l14 = l5;
                Long l15 = l6;
                List list5 = ybbVar.I;
                if (list5 != null) {
                    ArrayList arrayList11 = new ArrayList(r3d.q(list5, 10));
                    Iterator it9 = list5.iterator();
                    ArrayList arrayList12 = arrayList11;
                    while (it9.hasNext()) {
                        zxm0 zxm0Var = (zxm0) it9.next();
                        sip.f32274a.getClass();
                        sip sipVarM = bek.m(num2);
                        zxm0Var.getClass();
                        List list6 = zxm0Var.d;
                        Long l16 = zxm0Var.f45167a;
                        if (list6 != null) {
                            ArrayList arrayList13 = new ArrayList(r3d.q(list6, 10));
                            Iterator it10 = list6.iterator();
                            ArrayList arrayList14 = arrayList12;
                            while (it10.hasNext()) {
                                cas casVar2 = (cas) it10.next();
                                Long l17 = casVar2.f4027a;
                                long jLongValue5 = l17 != null ? l17.longValue() : 0L;
                                List list7 = casVar2.c;
                                Iterator it11 = it10;
                                if (list7 != null) {
                                    int i2 = 10;
                                    arrayList7 = new ArrayList(r3d.q(list7, 10));
                                    Iterator it12 = list7.iterator();
                                    while (it12.hasNext()) {
                                        List<gas> list8 = (List) it12.next();
                                        Iterator it13 = it12;
                                        Boolean bool3 = bool2;
                                        ArrayList arrayList15 = new ArrayList(r3d.q(list8, i2));
                                        for (gas gasVar2 : list8) {
                                            Long l18 = casVar2.f4027a;
                                            arrayList15.add(u1c.U(gasVar2, l18 != null ? l18.longValue() : 0L, ybbVar.t, zxm0Var.f45167a, ybbVar.w, okl0Var2 != null ? okl0Var2.f25410a : null));
                                        }
                                        arrayList7.add(arrayList15);
                                        it12 = it13;
                                        bool2 = bool3;
                                        i2 = 10;
                                    }
                                } else {
                                    arrayList7 = null;
                                }
                                Boolean bool4 = bool2;
                                arrayList13.add(new u9s(arrayList7, Long.valueOf(jLongValue5), casVar2.d));
                                it10 = it11;
                                arrayList14 = arrayList14;
                                l16 = l16;
                                bool2 = bool4;
                            }
                            arrayList5 = arrayList13;
                            arrayList6 = arrayList14;
                        } else {
                            arrayList5 = null;
                            arrayList6 = arrayList12;
                        }
                        ArrayList arrayList16 = arrayList6;
                        Long l19 = l16;
                        Boolean bool5 = bool2;
                        long jLongValue6 = l19 != null ? l19.longValue() : 0L;
                        long jLongValue7 = l8 != null ? l8.longValue() : l19 != null ? l19.longValue() : 0L;
                        Long l20 = ybbVar.s;
                        String str3 = ybbVar.j;
                        ua30 ua30Var2 = ua30Var;
                        String str4 = ybbVar.m;
                        long j2 = jLongValue6;
                        String str5 = ybbVar.h;
                        String str6 = gxsVar != null ? gxsVar.b : null;
                        Integer num3 = ybbVar.y;
                        String str7 = ybbVar.l;
                        String str8 = str6;
                        Integer numValueOf = l13 != null ? Integer.valueOf((int) l13.longValue()) : null;
                        Boolean bool6 = ybbVar.w;
                        String str9 = zxm0Var.b;
                        oas oasVarB0 = b0(h2gVar2);
                        oas oasVarB1 = b0(h2gVar);
                        Integer num4 = numValueOf;
                        Long l21 = ybbVar.f;
                        if (l21 != null) {
                            jLongValue2 = l21.longValue() - (System.currentTimeMillis() / 1000);
                            if (jLongValue2 <= 0) {
                                jLongValue2 = 0;
                            }
                        } else {
                            jLongValue2 = 0;
                        }
                        Long l22 = okl0Var2 != null ? okl0Var2.f25410a : null;
                        long jLongValue8 = (okl0Var == null || (l3 = okl0Var.f25410a) == null) ? 0L : l3.longValue();
                        ufs ufsVarR = ua30Var2 != null ? qxw.R(ua30Var2) : null;
                        boolean zBooleanValue = bool5 != null ? bool5.booleanValue() : false;
                        Boolean bool7 = Boolean.TRUE;
                        long j3 = jLongValue2;
                        boolean z = zBooleanValue;
                        long j4 = jLongValue8;
                        boolean zD = Intrinsics.d(bool, bool7);
                        Boolean bool8 = ybbVar.p;
                        Integer numValueOf2 = l15 != null ? Integer.valueOf((int) l15.longValue()) : null;
                        Boolean bool9 = gxsVar != null ? gxsVar.f12093a : null;
                        boh.b.getClass();
                        arrayList16.add(new nas(j2, jLongValue7, l20, str3, str4, str5, str8, bool9, num3, str7, num4, bool6, str9, null, null, arrayList5, Long.valueOf(j), sipVarM, str2, null, l21, Long.valueOf(j3), l22, j4, oasVarB0, oasVarB1, zD, null, ufsVarR, Boolean.valueOf(z), null, null, bool8, numValueOf2, "", null, qud.d(num, bool7), ybbVar.g));
                        arrayList12 = arrayList16;
                        ybbVar = ybbVar;
                        bool = bool;
                        arrayList2 = arrayList2;
                        it9 = it9;
                        bool2 = bool5;
                        ua30Var = ua30Var2;
                        l15 = l15;
                        l14 = l14;
                        l13 = l13;
                    }
                    arrayList3 = arrayList2;
                    arrayList4 = arrayList12;
                } else {
                    arrayList3 = arrayList2;
                    arrayList4 = null;
                }
                ybb ybbVar2 = ybbVar;
                Boolean bool10 = bool;
                Boolean bool11 = bool2;
                ua30 ua30Var3 = ua30Var;
                Long l23 = l13;
                Long l24 = l14;
                Long l25 = l15;
                List list9 = arrayList4;
                if (arrayList4 == null) {
                    list9 = iun.f15405a;
                }
                List list10 = list9;
                jch jchVar = ybbVar2.F;
                tas tasVarY = jchVar != null ? qbc.Y(jchVar) : null;
                long jLongValue9 = l24 != null ? l24.longValue() : 0L;
                long jLongValue10 = l8 != null ? l8.longValue() : l24 != null ? l24.longValue() : 0L;
                Long l26 = ybbVar2.s;
                String str10 = ybbVar2.j;
                String str11 = ybbVar2.m;
                String str12 = ybbVar2.h;
                String str13 = gxsVar != null ? gxsVar.b : null;
                Integer num5 = ybbVar2.y;
                String str14 = ybbVar2.l;
                long j5 = jLongValue9;
                Integer numValueOf3 = l23 != null ? Integer.valueOf((int) l23.longValue()) : null;
                Boolean bool12 = ybbVar2.w;
                String str15 = ybbVar2.e;
                bek bekVar = sip.f32274a;
                Integer numValueOf4 = Integer.valueOf(num2 != null ? num2.intValue() : 0);
                bekVar.getClass();
                sip sipVarM2 = bek.m(numValueOf4);
                oas oasVarB2 = b0(h2gVar2);
                oas oasVarB3 = b0(h2gVar);
                Long l27 = ybbVar2.f;
                if (l27 != null) {
                    jLongValue = l27.longValue() - (System.currentTimeMillis() / 1000);
                    if (jLongValue <= 0) {
                        jLongValue = 0;
                    }
                } else {
                    jLongValue = 0;
                }
                long jLongValue11 = (okl0Var2 == null || (l2 = okl0Var2.f25410a) == null) ? 0L : l2.longValue();
                long jLongValue12 = (okl0Var == null || (l = okl0Var.f25410a) == null) ? 0L : l.longValue();
                ufs ufsVarR2 = ua30Var3 != null ? qxw.R(ua30Var3) : null;
                boolean zBooleanValue2 = bool11 != null ? bool11.booleanValue() : false;
                Boolean bool13 = ybbVar2.p;
                boolean z2 = zBooleanValue2;
                Boolean bool14 = Boolean.TRUE;
                boolean zD2 = Intrinsics.d(bool10, bool14);
                Integer numValueOf5 = l25 != null ? Integer.valueOf((int) l25.longValue()) : null;
                Boolean bool15 = gxsVar != null ? gxsVar.f12093a : null;
                boh.b.getClass();
                arrayList9.add(new nas(j5, jLongValue10, l26, str10, str11, str12, str13, bool15, num5, str14, numValueOf3, bool12, str15, null, list10, arrayList3, Long.valueOf(j), sipVarM2, str2, tasVarY, l27, Long.valueOf(jLongValue), Long.valueOf(jLongValue11), jLongValue12, oasVarB2, oasVarB3, zD2, null, ufsVarR2, Boolean.valueOf(z2), null, null, bool13, numValueOf5, "", null, qud.d(num, bool14), ybbVar2.g));
                it = it2;
                jLongValue3 = j;
            }
            arrayList = arrayList9;
        } else {
            arrayList = null;
        }
        return arrayList == null ? iun.f15405a : arrayList;
    }

    public static final void d(mm40 mm40Var, boolean z, v3i v3iVar, Function1 function1, fet fetVar, int i) {
        int i2;
        fetVar.g0(1925270552);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.h(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.g(v3iVar) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= fetVar.i(function1) ? 2048 : 1024;
        }
        if (fetVar.U(i2 & 1, (i2 & 1171) != 1170)) {
            f2i f2iVar = v3iVar.f36733a;
            c2i c2iVar = c2i.f3624a;
            boolean zEquals = f2iVar.equals(c2iVar);
            e2i e2iVar = e2i.f7087a;
            String str = "EVENT_CARD_STREAM_BUTTON";
            if (!zEquals) {
                if (f2iVar.equals(e2iVar)) {
                    str = "EVENT_CARD_TOP_ICON_ZONE";
                } else if (!(f2iVar instanceof d2i)) {
                    t9f.b();
                    return;
                }
            }
            tj30 tj30VarC = zq8.c(gqw0.b, false);
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
            mm40 mm40VarE0 = o2e.e0(jm40.b, str);
            boolean zEquals2 = f2iVar.equals(c2iVar);
            int i3 = R.drawable.ic_glyph_broadcast;
            if (!zEquals2) {
                if (f2iVar.equals(e2iVar)) {
                    i3 = R.drawable.ic_glyph_video_zone;
                } else if (!(f2iVar instanceof d2i)) {
                    t9f.b();
                    return;
                }
            }
            boolean z2 = !(f2iVar instanceof d2i);
            boolean z3 = ((i2 & 896) == 256) | ((i2 & 7168) == 2048);
            Object objP = fetVar.P();
            if (z3 || objP == ukd.f35823a) {
                objP = new drh(function1, v3iVar, (byte) 1);
                fetVar.o0(objP);
            }
            e(i3, 0, fetVar, mm40VarE0, (Function0) objP, z2);
            if (z) {
                fetVar.e0(-423146629);
                acb.p(0, fetVar, null);
                fetVar.r(false);
            } else {
                fetVar.e0(-423107228);
                fetVar.r(false);
            }
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new i2i(mm40Var, z, v3iVar, function1, i, (byte) 0);
        }
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0024  */
    /* JADX WARN: Code duplicated, block: B:9:0x0012  */
    public static final irk d0(kuk kukVar) {
        List list;
        List list2;
        j0g0 j0g0Var = kukVar.f18914a;
        if (j0g0Var != null) {
            Object obj = j0g0Var.f15681a;
            if (obj instanceof g0g0) {
                obj = null;
            }
            list = (List) obj;
            if (list == null) {
                list = iun.f15405a;
            }
        } else {
            list = iun.f15405a;
        }
        j0g0 j0g0Var2 = kukVar.b;
        if (j0g0Var2 != null) {
            Object obj2 = j0g0Var2.f15681a;
            list2 = (List) (obj2 instanceof g0g0 ? null : obj2);
            if (list2 == null) {
                list2 = iun.f15405a;
            }
        } else {
            list2 = iun.f15405a;
        }
        return new irk(list, list2);
    }

    public static final void e(int i, int i2, fet fetVar, mm40 mm40Var, Function0 function0, boolean z) {
        mm40 mm40Var2;
        long secondary20;
        fetVar.g0(-1913841394);
        int i3 = (fetVar.g(mm40Var) ? 4 : 2) | i2 | (fetVar.e(i) ? 32 : 16);
        if ((i2 & 384) == 0) {
            i3 |= fetVar.h(z) ? 256 : 128;
        }
        int i4 = i3 | (fetVar.i(function0) ? 2048 : 1024);
        if (fetVar.U(i4 & 1, (i4 & 1171) != 1170)) {
            zcl zclVar = qmk.f28987a;
            mm40Var2 = mm40Var;
            mm40 mm40VarK = s5x0.K(o7k0.s(o7k0.e(mm40Var2, 36.0f), 40.0f), 6.0f, 4.0f);
            zfn zfnVar = zaq0.b;
            mm40 mm40VarW = y860.W(i120.Q(mm40VarK, ((ThemeColors) fetVar.k(zfnVar)).getBackground(), vgg0.f37379a), null, null, z, null, function0, 24);
            tj30 tj30VarC = zq8.c(gqw0.e, false);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarW);
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
            mm40 mm40VarE0 = o2e.e0(s5x0.J(jm40.b, 4.0f), "EVENT_CARD_TOP_ICON");
            pm80 pm80VarF = a8k0.F(i, (i4 >> 3) & 14, fetVar);
            if (z) {
                fetVar.e0(917000431);
                secondary20 = ((ThemeColors) fetVar.k(zfnVar)).getPrimary();
            } else {
                fetVar.e0(917001427);
                secondary20 = ((ThemeColors) fetVar.k(zfnVar)).getSecondary20();
            }
            fetVar.r(false);
            dww.c(pm80VarF, null, mm40VarE0, secondary20, fetVar, 56, 0);
            fetVar.r(true);
        } else {
            mm40Var2 = mm40Var;
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new h2i(mm40Var2, i, z, function0, i2, (byte) 0);
        }
    }

    public static final void f(int i, fet fetVar, mm40 mm40Var, String str) {
        String str2;
        fetVar.g0(1034999747);
        int i2 = (fetVar.g(str) ? 32 : 16) | i;
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            ((g1t0) fetVar.k(j1t0.e)).getClass();
            str2 = str;
            v8q0.a(str2, mm40Var, 0L, null, 0L, null, null, null, 0L, null, 0L, 2, false, 2, 0, null, ibm0.n(g1t0.g(), fetVar), fetVar, ((i2 >> 3) & 14) | 48, 24960, 110588);
        } else {
            str2 = str;
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new hx1(mm40Var, str2, i, (byte) 22);
        }
    }

    public static final void g(mm40 mm40Var, x3i x3iVar, Function1 function1, fet fetVar, int i) {
        int i2;
        int i3;
        fetVar.g0(-1282715439);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.g(x3iVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.i(function1) ? 256 : 128;
        }
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            mm40 mm40VarE0 = o2e.e0(mm40Var, "EVENT_CARD_TOP_FAVORITE_BUTTON");
            int i4 = i2 & 112;
            boolean z = i4 == 32;
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (z || objP == cl5Var) {
                objP = new hfg(x3iVar, (byte) 28);
                fetVar.o0(objP);
            }
            mm40 mm40VarA = pai0.a(mm40VarE0, false, (Function1) objP);
            int iOrdinal = x3iVar.f40219a.ordinal();
            if (iOrdinal == 0) {
                i3 = R.drawable.ic_glyph_favourite_active;
            } else {
                if (iOrdinal != 1) {
                    t9f.b();
                    return;
                }
                i3 = R.drawable.ic_glyph_favourite_inactive;
            }
            boolean z2 = ((i2 & 896) == 256) | (i4 == 32);
            Object objP2 = fetVar.P();
            if (z2 || objP2 == cl5Var) {
                objP2 = new l2i(function1, x3iVar, (byte) 0);
                fetVar.o0(objP2);
            }
            e(i3, 384, fetVar, mm40VarA, (Function0) objP2, true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new g2i(mm40Var, x3iVar, function1, i, (byte) 0);
        }
    }

    public static final void h(mm40 mm40Var, z3i z3iVar, Function1 function1, fet fetVar, int i) {
        int i2;
        int i3;
        fetVar.g0(-1442627230);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.g(z3iVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.i(function1) ? 256 : 128;
        }
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            mm40 mm40VarE0 = o2e.e0(mm40Var, "EVENT_CARD_TOP_NOTIFICATION_BUTTON");
            int i4 = i2 & 112;
            boolean z = i4 == 32;
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (z || objP == cl5Var) {
                objP = new hfg(z3iVar, (byte) 27);
                fetVar.o0(objP);
            }
            mm40 mm40VarA = pai0.a(mm40VarE0, false, (Function1) objP);
            int iOrdinal = z3iVar.f43719a.ordinal();
            if (iOrdinal == 0) {
                i3 = R.drawable.ic_glyph_notification_active;
            } else {
                if (iOrdinal != 1) {
                    t9f.b();
                    return;
                }
                i3 = R.drawable.ic_glyph_notification_inactive;
            }
            boolean z2 = ((i2 & 896) == 256) | (i4 == 32);
            Object objP2 = fetVar.P();
            if (z2 || objP2 == cl5Var) {
                objP2 = new j2i(function1, z3iVar, (byte) 0);
                fetVar.o0(objP2);
            }
            e(i3, 384, fetVar, mm40VarA, (Function0) objP2, true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new k2i(mm40Var, z3iVar, function1, i, (byte) 0);
        }
    }

    public static final void i(int i, fet fetVar) {
        fet fetVar2;
        fetVar.g0(-377272132);
        if (fetVar.U(i & 1, i != 0)) {
            zcl zclVar = qmk.f28987a;
            fetVar2 = fetVar;
            dww.c(a8k0.F(R.drawable.ic_glyph_popular, 0, fetVar), null, o7k0.n(jm40.b, 24.0f), ((StaticColors) fetVar.k(m8m0.f21378a)).m113getRed0d7_KjU(), fetVar2, 56, 0);
        } else {
            fetVar2 = fetVar;
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new zuh(i, (byte) 4);
        }
    }

    public static final void j(o0x o0xVar, m0x m0xVar, y3d y3dVar, y3d y3dVar2, fet fetVar, int i) {
        long secondary;
        long secondary2;
        fetVar.g0(-1395252334);
        int i2 = i | (fetVar.g(o0xVar) ? 4 : 2) | (fetVar.g(m0xVar) ? 32 : 16) | (fetVar.g(y3dVar) ? 256 : 128) | (fetVar.g(y3dVar2) ? 2048 : 1024);
        if (fetVar.U(i2 & 1, (i2 & 1171) != 1170)) {
            if (o0xVar != null) {
                boolean z = o0xVar instanceof m0x;
                jm40 jm40Var = jm40.b;
                if (z) {
                    fetVar.e0(731447661);
                    zcl zclVar = qmk.f28987a;
                    mm40 mm40VarN = o7k0.n(jm40Var, 24.0f);
                    pm80 pm80VarF = a8k0.F(((m0x) o0xVar).f20977a, 0, fetVar);
                    if (y3dVar == null) {
                        fetVar.e0(-807683717);
                        secondary2 = ((ThemeColors) fetVar.k(zaq0.b)).getSecondary();
                        fetVar.r(false);
                    } else {
                        fetVar.e0(-807684802);
                        fetVar.r(false);
                        secondary2 = y3dVar.f41946a;
                    }
                    dww.c(pm80VarF, null, mm40VarN, secondary2, fetVar, 56, 0);
                    fetVar.r(false);
                } else if (o0xVar instanceof l0x) {
                    fetVar.e0(731731869);
                    Drawable drawable = ((l0x) o0xVar).f19222a;
                    if (drawable == null) {
                        fetVar.e0(731731868);
                        fetVar.r(false);
                    } else {
                        fetVar.e0(731731869);
                        zcl zclVar2 = qmk.f28987a;
                        mm40 mm40VarN2 = o7k0.n(jm40Var, 24.0f);
                        c78 c78VarJ = mym0.j(drawable);
                        if (y3dVar == null) {
                            fetVar.e0(-114428917);
                            secondary = ((ThemeColors) fetVar.k(zaq0.b)).getSecondary();
                            fetVar.r(false);
                        } else {
                            fetVar.e0(-114430002);
                            fetVar.r(false);
                            secondary = y3dVar.f41946a;
                        }
                        dww.c(c78VarJ, null, mm40VarN2, secondary, fetVar, 56, 0);
                        fetVar.r(false);
                    }
                    fetVar.r(false);
                } else if (o0xVar instanceof n0x) {
                    fetVar.e0(732049743);
                    zcl zclVar3 = qmk.f28987a;
                    mm40 mm40VarE0 = o2e.e0(jm40Var, "EVENT_CARD_TOP_URL_ICON");
                    int i3 = i2 << 3;
                    u7x.q(mm40VarE0, (n0x) o0xVar, 24.0f, y3dVar, y3dVar2, m0xVar, fetVar, (i3 & 57344) | (i3 & 112) | 6 | (i3 & 7168) | ((i2 << 12) & 458752), 0);
                    fetVar.r(false);
                }
            }
            throw b1j.f(-807689619, fetVar, false);
        }
        fetVar.X();
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new gf9((byte) 27, i, (Object) o0xVar, (Object) m0xVar, (Object) y3dVar, (Object) y3dVar2);
        }
    }

    public static final void k(mm40 mm40Var, j9m j9mVar, xcz xczVar, long j, Function1 function1, fet fetVar, int i, int i2) {
        boolean z;
        boolean z2;
        qw3 qw3Var;
        function1.getClass();
        xcz xczVarA = (i2 & 4) != 0 ? ddz.a(0, 0, fetVar, 0, 3) : xczVar;
        float f = (i2 & 8) != 0 ? xfn.a(fetVar).c : 8.0f;
        long backgroundContent = (i2 & 16) != 0 ? ((ThemeColors) fetVar.k(zaq0.b)).getBackgroundContent() : j;
        byte b = 2;
        if (!(j9mVar instanceof f9m)) {
            xcz xczVar2 = xczVarA;
            if (!(j9mVar instanceof i9m)) {
                throw b1j.f(-248091861, fetVar, false);
            }
            fetVar.e0(899532311);
            i9m i9mVar = (i9m) j9mVar;
            int i3 = i >> 3;
            int i4 = (i & 14) | (i3 & 112) | (i3 & 896) | (i3 & 7168) | ((i << 9) & 57344) | (i & 458752);
            xczVar2.getClass();
            if (i9mVar instanceof g9m) {
                fetVar.e0(1256605354);
                ebc.H(o2e.e0(mm40Var, "DS_CYBER_LOGO_COLLECTION_SQUARE_LAZY_ROW"), xczVar2, f, androidx.compose.runtime.e.f(((g9m) i9mVar).f10921a, fetVar), u1c.M(1400536035, new j6b(b, backgroundContent, function1), fetVar), fetVar, (i4 & 896) | (i4 & 112) | 24576);
                z = false;
                fetVar.r(false);
            } else {
                if (!(i9mVar instanceof h9m)) {
                    throw b1j.f(-513655723, fetVar, false);
                }
                fetVar.e0(1257212365);
                ebc.V(mm40Var, f, fetVar, (i4 & 14) | ((i4 >> 3) & 112));
                z = false;
                fetVar.r(false);
            }
            fetVar.r(z);
            return;
        }
        fetVar.e0(899140316);
        f9m f9mVar = (f9m) j9mVar;
        int i5 = i >> 3;
        int i6 = (i & 458752) | (i & 14) | (i5 & 112) | (i5 & 896) | (i5 & 7168) | ((i << 9) & 57344);
        xczVarA.getClass();
        boolean z3 = f9mVar instanceof d9m;
        byte b2 = 14;
        boolean z4 = true;
        cl5 cl5Var = ukd.f35823a;
        if (z3) {
            fetVar.e0(688169942);
            mm40 mm40VarE0 = o2e.e0(o7k0.d(mm40Var, 1.0f), "DS_CYBER_LOGO_COLLECTION_RECTANGLE_LAZY_ROW");
            lh80 lh80VarT = s5x0.t(f, 0.0f, 2);
            zcl zclVar = qmk.f28987a;
            qw3 qw3Var2 = new qw3(8.0f, true, new jf4(b2));
            boolean z5 = ((((i6 & 57344) ^ 24576) > 16384 && fetVar.g(f9mVar)) || (i6 & 24576) == 16384) | ((((i6 & 7168) ^ 3072) > 2048 && fetVar.f(backgroundContent)) || (i6 & 3072) == 2048);
            if ((((i6 & 458752) ^ 196608) <= 131072 || !fetVar.g(function1)) && (i6 & 196608) != 131072) {
                z4 = false;
            }
            boolean z6 = z5 | z4;
            Object objP = fetVar.P();
            if (z6 || objP == cl5Var) {
                long j2 = backgroundContent;
                qw3Var = qw3Var2;
                mz0 mz0Var = new mz0((Object) f9mVar, j2, (Object) function1, (byte) 15);
                fetVar.o0(mz0Var);
                objP = mz0Var;
            } else {
                qw3Var = qw3Var2;
            }
            b8k0.f(mm40VarE0, xczVarA, lh80VarT, false, qw3Var, null, null, false, null, (Function1) objP, fetVar, i6 & 112, Response.NOT_ACCEPTABLE_HERE);
            z2 = false;
            fetVar.r(false);
        } else {
            if (!f9mVar.equals(e9m.f7429a)) {
                throw b1j.f(1823312695, fetVar, false);
            }
            fetVar.e0(688961310);
            Configuration configuration = (Configuration) fetVar.k(dy2.f6873a);
            zcl zclVar2 = qmk.f28987a;
            float f2 = configuration.screenWidthDp / 64.0f;
            mm40 mm40VarD = o7k0.d(mm40Var, 1.0f);
            lh80 lh80VarT2 = s5x0.t(f, 0.0f, 2);
            qw3 qw3Var3 = new qw3(8.0f, true, new jf4(b2));
            boolean zD = fetVar.d(f2);
            Object objP2 = fetVar.P();
            if (zD || objP2 == cl5Var) {
                objP2 = new f54(f2, (byte) 12);
                fetVar.o0(objP2);
            }
            b8k0.f(mm40VarD, null, lh80VarT2, false, qw3Var3, null, null, false, null, (Function1) objP2, fetVar, 12582912, 362);
            z2 = false;
            fetVar.r(false);
        }
        fetVar.r(z2);
    }

    public static final void l(mm40 mm40Var, rwm rwmVar, fet fetVar, int i) {
        if (rwmVar instanceof mwm) {
            fetVar.e0(-1209979890);
            n4c.m(mm40Var, (mwm) rwmVar, fetVar, i & 126);
            fetVar.r(false);
            return;
        }
        if (rwmVar instanceof nwm) {
            fetVar.e0(-1209790573);
            twm.a(mm40Var, (nwm) rwmVar, fetVar, i & 126);
            fetVar.r(false);
            return;
        }
        if (rwmVar instanceof owm) {
            fetVar.e0(-1209606061);
            aac.p(mm40Var, (owm) rwmVar, fetVar, i & 126);
            fetVar.r(false);
        } else if (rwmVar instanceof pwm) {
            fetVar.e0(-1209421549);
            sac.q(mm40Var, (pwm) rwmVar, fetVar, i & 126);
            fetVar.r(false);
        } else {
            if (!(rwmVar instanceof qwm)) {
                throw b1j.f(1484987593, fetVar, false);
            }
            fetVar.e0(-1209237037);
            ebc.t(mm40Var, (qwm) rwmVar, fetVar, i & 126);
            fetVar.r(false);
        }
    }

    public static final void m(mm40 mm40Var, i1n i1nVar, i1n i1nVar2, String str, String str2, String str3, String str4, fet fetVar, int i) {
        int i2;
        i1n i1nVar3;
        String str5;
        String str6;
        String str7;
        String str8;
        fet fetVar2 = fetVar;
        x0m x0mVar = x0m.f40076a;
        cs0.x(str, str2, str3, str4);
        fetVar2.g0(-226635252);
        if ((i & 6) == 0) {
            i2 = (fetVar2.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar2.g(i1nVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i1nVar3 = i1nVar2;
            i2 |= fetVar2.g(i1nVar3) ? 256 : 128;
        } else {
            i1nVar3 = i1nVar2;
        }
        if ((i & 3072) == 0) {
            i2 |= fetVar2.g("") ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= fetVar2.g("") ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            str5 = str;
            i2 |= fetVar2.g(str5) ? 131072 : 65536;
        } else {
            str5 = str;
        }
        if ((1572864 & i) == 0) {
            str6 = str2;
            i2 |= fetVar2.g(str6) ? 1048576 : 524288;
        } else {
            str6 = str2;
        }
        if ((12582912 & i) == 0) {
            str7 = str3;
            i2 |= fetVar2.g(str7) ? 8388608 : 4194304;
        } else {
            str7 = str3;
        }
        if ((100663296 & i) == 0) {
            str8 = str4;
            i2 |= fetVar2.g(str8) ? 67108864 : 33554432;
        } else {
            str8 = str4;
        }
        if ((805306368 & i) == 0) {
            i2 |= fetVar2.g(uem.f35536a) ? 536870912 : 268435456;
        }
        int i3 = i2;
        int i4 = fetVar2.e(0) ? 4 : 2;
        if (fetVar2.U(i3 & 1, ((306783379 & i3) == 306783378 && (i4 & 3) == 2) ? false : true)) {
            mm40 mm40VarD = o7k0.d(mm40Var, 1.0f);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarL = s5x0.L(mm40VarD, 12.0f, 0.0f, 2);
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar2, 0);
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
            jpm0.o(fetVar2, x5dVarA, gqw0.x);
            jpm0.o(fetVar2, bh90VarM, gqw0.w);
            jpm0.o(fetVar2, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar2);
            jpm0.o(fetVar2, mm40VarC0, gqw0.v);
            w((524272 & i3) | ((i3 >> 9) & 3670016) | ((i4 << 21) & 29360128), i1nVar, i1nVar3, fetVar2, null, str5);
            fetVar2 = fetVar2;
            if (str6.length() <= 0 && str7.length() <= 0 && str8.length() <= 0) {
                fetVar2.e0(2096646636);
                fetVar2.r(false);
            } else {
                fetVar2.e0(2096471734);
                sj3.p((i3 >> 15) & 8176, 1, fetVar2, null, str6, str7, str8);
                fetVar2.r(false);
            }
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new t49(mm40Var, i1nVar, i1nVar2, str, str2, str3, str4, i);
        }
    }

    public static final void n(final mm40 mm40Var, final i4 i4Var, final String str, final boolean z, final o0x o0xVar, final t89 t89Var, final long j, gy40 gy40Var, ezj ezjVar, final Function2 function2, final Function0 function0, fet fetVar, final int i) {
        final gy40 gy40Var2;
        final ezj ezjVar2;
        gy40 gy40Var3;
        int i2;
        ezj ezjVarX;
        gy40 gy40Var4;
        fet fetVar2 = fetVar;
        i4Var.getClass();
        fetVar2.g0(726085022);
        int i3 = i | (fetVar2.g(mm40Var) ? 4 : 2) | (fetVar2.g(i4Var) ? 32 : 16) | (fetVar2.g(str) ? 256 : 128) | (fetVar2.h(z) ? 2048 : 1024) | (fetVar2.g(o0xVar) ? 16384 : 8192) | (fetVar2.g(t89Var) ? 131072 : 65536) | (fetVar2.f(j) ? 1048576 : 524288) | 46137344 | (fetVar2.i(function2) ? 536870912 : 268435456);
        int i4 = fetVar2.i(function0) ? 4 : 2;
        if (fetVar2.U(i3 & 1, ((306783379 & i3) == 306783378 && (i4 & 3) == 2) ? false : true)) {
            fetVar2.Z();
            if ((i & 1) == 0 || fetVar2.B()) {
                Object objP = fetVar2.P();
                if (objP == ukd.f35823a) {
                    objP = dw9.j(fetVar2);
                }
                gy40Var3 = (gy40) objP;
                i2 = i3 & (-234881025);
                ezjVarX = v3c.X(fetVar2);
            } else {
                fetVar2.X();
                i2 = i3 & (-234881025);
                gy40Var3 = gy40Var;
                ezjVarX = ezjVar;
            }
            fetVar2.s();
            if (z) {
                fetVar2.e0(1344336243);
                z(0, fetVar2, o7k0.d(mm40Var, 1.0f));
                fetVar2.r(false);
                gy40Var4 = gy40Var3;
            } else {
                fetVar2.e0(1344445425);
                int i5 = i2 >> 3;
                int i6 = i2 >> 9;
                int i7 = i2 << 9;
                gy40Var4 = gy40Var3;
                o(o7k0.d(mm40Var, 1.0f), str, t89Var, j, i4Var, gy40Var4, ezjVarX, o0xVar, function2, function0, fetVar, (i6 & 7168) | (i5 & 112) | (i6 & 896) | (57344 & i7) | 196608 | (i7 & 29360128) | (234881024 & i5) | ((i4 << 27) & 1879048192));
                fetVar2 = fetVar;
                fetVar2.r(false);
            }
            gy40Var2 = gy40Var4;
            ezjVar2 = ezjVarX;
        } else {
            fetVar2.X();
            gy40Var2 = gy40Var;
            ezjVar2 = ezjVar;
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new Function2(i4Var, str, z, o0xVar, t89Var, j, gy40Var2, ezjVar2, function2, function0, i) { // from class: a.ebn
                public final /* synthetic */ i4 b;
                public final /* synthetic */ String c;
                public final /* synthetic */ boolean d;
                public final /* synthetic */ o0x e;
                public final /* synthetic */ t89 f;
                public final /* synthetic */ long g;
                public final /* synthetic */ gy40 h;
                public final /* synthetic */ ezj i;
                public final /* synthetic */ Function2 j;
                public final /* synthetic */ Function0 k;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iL = x8x.L(1);
                    d5c.n(this.f7526a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, (fet) obj, iL);
                    return Unit.f46060a;
                }
            };
        }
    }

    public static final void o(mm40 mm40Var, String str, t89 t89Var, long j, i4 i4Var, gy40 gy40Var, ezj ezjVar, o0x o0xVar, Function2 function2, Function0 function0, fet fetVar, int i) {
        int i2;
        i4 i4Var2;
        jm40 jm40Var;
        pcy pcyVar;
        shd shdVar;
        cl5 cl5Var;
        byte b;
        fet fetVar2 = fetVar;
        fetVar2.g0(290415460);
        if ((i & 6) == 0) {
            i2 = (fetVar2.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar2.g(str) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar2.g(t89Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= fetVar2.f(j) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= fetVar2.g(i4Var) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= fetVar2.g(gy40Var) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= (2097152 & i) == 0 ? fetVar2.g(ezjVar) : fetVar2.i(ezjVar) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i2 |= fetVar2.g(o0xVar) ? 8388608 : 4194304;
        }
        if ((100663296 & i) == 0) {
            i2 |= fetVar2.i(function2) ? 67108864 : 33554432;
        }
        if ((805306368 & i) == 0) {
            i2 |= fetVar2.i(function0) ? 536870912 : 268435456;
        }
        int i3 = i2;
        if (fetVar2.U(i3 & 1, (i3 & 306783379) != 306783378)) {
            mm40 mm40VarE0 = o2e.e0(i120.P(lgb.J(mm40Var, cbn.f4069a), t89Var, null, 6), "WEB_GAMES_GAME_COLLECTION_BOX_TAG" + str);
            Object objP = fetVar2.P();
            cl5 cl5Var2 = ukd.f35823a;
            if (objP == cl5Var2) {
                objP = new aim((byte) 25);
                fetVar2.o0(objP);
            }
            mm40 mm40VarA = pai0.a(mm40VarE0, true, (Function1) objP);
            tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarA);
            mkd.c0.getClass();
            fetVar2.i0();
            boolean z = fetVar2.S;
            pcy pcyVar2 = e7z.u1;
            if (z) {
                fetVar2.l(pcyVar2);
            } else {
                fetVar2.r0();
            }
            shd shdVar2 = gqw0.x;
            jpm0.o(fetVar2, tj30VarC, shdVar2);
            shd shdVar3 = gqw0.w;
            jpm0.o(fetVar2, bh90VarM, shdVar3);
            Integer numValueOf = Integer.valueOf(iHashCode);
            shd shdVar4 = gqw0.y;
            jpm0.o(fetVar2, numValueOf, shdVar4);
            jpm0.n(fetVar2);
            shd shdVar5 = gqw0.v;
            jpm0.o(fetVar2, mm40VarC0, shdVar5);
            jm40 jm40Var2 = jm40.b;
            if (o0xVar != null) {
                fetVar2.e0(276115049);
                k6z k6zVar = (k6z) fetVar2.k(bmd.n);
                boolean zE = fetVar2.e(k6zVar.ordinal());
                Object objP2 = fetVar2.P();
                if (zE || objP2 == cl5Var2) {
                    objP2 = Float.valueOf(k6zVar == k6z.f17794a ? 1.0f : -1.0f);
                    fetVar2.o0(objP2);
                }
                float fFloatValue = ((Number) objP2).floatValue();
                Object objA = o0xVar.a();
                pge pgeVar = gqw0.A;
                mm40 mm40VarX = r8x.X(jr8.f16991a.b(o7k0.o(cbn.b, jm40Var2), gqw0.c), fFloatValue, 1.0f);
                pcyVar = pcyVar2;
                shdVar = shdVar5;
                cl5Var = cl5Var2;
                jm40Var = jm40Var2;
                b = 0;
                k7x.a(objA, null, mm40VarX, pgeVar, null, fetVar, 1572912, 1976);
                fetVar2 = fetVar;
                fetVar2.r(false);
            } else {
                jm40Var = jm40Var2;
                pcyVar = pcyVar2;
                shdVar = shdVar5;
                cl5Var = cl5Var2;
                b = 0;
                fetVar2.e0(276898264);
                fetVar2.r(false);
            }
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar2, b);
            int iHashCode2 = Long.hashCode(fetVar2.T);
            bh90 bh90VarM2 = fetVar2.m();
            mm40 mm40VarC1 = kbc.c0(fetVar2, jm40Var);
            fetVar2.i0();
            if (fetVar2.S) {
                fetVar2.l(pcyVar);
            } else {
                fetVar2.r0();
            }
            jpm0.o(fetVar2, x5dVarA, shdVar2);
            jpm0.o(fetVar2, bh90VarM2, shdVar3);
            vqd.u(iHashCode2, fetVar2, shdVar4, fetVar2);
            jpm0.o(fetVar2, mm40VarC1, shdVar);
            mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarE = o7k0.e(mm40VarD, 40.0f);
            byte b2 = (i3 & 1879048192) == 536870912 ? (byte) 1 : b;
            Object objP3 = fetVar2.P();
            if (b2 != 0 || objP3 == cl5Var) {
                objP3 = new dbn(function0, b);
                fetVar2.o0(objP3);
            }
            mm40 mm40VarN = s5x0.N(y860.W(mm40VarE, null, null, false, null, (Function0) objP3, 28), 16.0f, 0.0f, 96.0f, 0.0f, 10);
            zx7 zx7Var = gqw0.d;
            ((g1t0) fetVar2.k(j1t0.e)).getClass();
            kc5.N(str, mm40VarN, j, null, null, 0L, qmk.p, qmk.u, null, null, 0L, zx7Var, 2, false, 1, 0, false, null, g1t0.q(), 0.0f, fetVar, (i3 >> 3) & 910, 1600512, 0, 3055416);
            i4Var2 = i4Var;
            fetVar2 = fetVar;
            v3c.r(s5x0.N(o7k0.d(jm40Var, 1.0f), 0.0f, 0.0f, 0.0f, 8.0f, 7), new cjm(i4Var2, xim.d), qmk.a(fetVar).c, gy40Var, ezjVar, function2, fetVar2, ((i3 >> 6) & 64512) | ((i3 >> 9) & 458752), 0);
            fetVar2.r(true);
            fetVar2.r(true);
        } else {
            i4Var2 = i4Var;
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new jdm(mm40Var, str, t89Var, j, i4Var2, gy40Var, ezjVar, o0xVar, function2, function0, i);
        }
    }

    public static final void p(w5o0 w5o0Var, fet fetVar, int i) {
        int i2;
        fetVar.g0(1536406213);
        byte b = 4;
        if ((i & 6) == 0) {
            i2 = (fetVar.g(w5o0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (fetVar.U(i2 & 1, (i2 & 3) != 2)) {
            Context context = (Context) fetVar.k(dy2.b);
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (objP == cl5Var) {
                objP = twn.s(fetVar);
            }
            List list = (List) objP;
            Object objP2 = fetVar.P();
            if (objP2 == cl5Var) {
                objP2 = e5o.f7242a;
                fetVar.o0(objP2);
            }
            xdr xdrVar = (xdr) ((jhy) objP2);
            boolean zI = fetVar.i(context) | ((i2 & 14) == 4) | fetVar.i(list);
            Object objP3 = fetVar.P();
            if (zI || objP3 == cl5Var) {
                objP3 = new f8m((Object) context, (Object) w5o0Var, (Object) list, (byte) 8);
                fetVar.o0(objP3);
            }
            y860.f(xdrVar, null, (Function1) objP3, fetVar, 6, 2);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new z4o(w5o0Var, i, b);
        }
    }

    public static final void q(mm40 mm40Var, s8v s8vVar, Function1 function1, fet fetVar, int i) {
        fet fetVar2;
        mm40 mm40Var2;
        s8vVar.getClass();
        function1.getClass();
        fetVar.g0(-1661538958);
        int i2 = i | 6 | (fetVar.g(s8vVar) ? 32 : 16) | (fetVar.i(function1) ? 256 : 128);
        byte b = 0;
        byte b2 = 1;
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            jm40 jm40Var = jm40.b;
            mm40 mm40VarE0 = o2e.e0(o7k0.d(jm40Var, 1.0f), "GLOBAL_SEARCH_CONTAINER_COLUMN");
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar, 0);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarE0);
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
            mm40 mm40VarW = o050.W(jm40Var);
            imm immVar = s8vVar.f31821a;
            int i3 = i2 & 896;
            boolean z = i3 == 256;
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (z || objP == cl5Var) {
                objP = new i8v(function1, b);
                fetVar.o0(objP);
            }
            Function0 function0 = (Function0) objP;
            boolean z2 = i3 == 256;
            Object objP2 = fetVar.P();
            if (z2 || objP2 == cl5Var) {
                objP2 = new dht(function1, (byte) 7);
                fetVar.o0(objP2);
            }
            Function1 function2 = (Function1) objP2;
            boolean z3 = i3 == 256;
            Object objP3 = fetVar.P();
            if (z3 || objP3 == cl5Var) {
                objP3 = new i8v(function1, b2);
                fetVar.o0(objP3);
            }
            hlm.c(mm40VarW, immVar, null, function0, null, null, function2, null, (Function0) objP3, null, null, null, fetVar, 0, 0, 3764);
            fetVar2 = fetVar;
            if (s8vVar.d) {
                fetVar2.e0(-643769718);
                A(i3, fetVar2, s8vVar.b, null, function1);
                fetVar2.r(false);
            } else {
                fetVar2.e0(-643650554);
                fetVar2.r(false);
            }
            fetVar2.r(true);
            mm40Var2 = jm40Var;
        } else {
            fetVar2 = fetVar;
            fetVar2.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new hpr(mm40Var2, s8vVar, function1, i, (byte) 9);
        }
    }

    public static final void r(mm40 mm40Var, wjw wjwVar, Function2 function2, fet fetVar, int i) {
        function2.getClass();
        fetVar.g0(-1474427639);
        int i2 = i | 6;
        if ((i & 48) == 0) {
            i2 |= fetVar.g(wjwVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.i(function2) ? 256 : 128;
        }
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            if (wjwVar.f39283a.size() <= 3) {
                fetVar.e0(-43031110);
                u(wjwVar, function2, fetVar, i2 & 1022);
                fetVar.r(false);
            } else {
                fetVar.e0(-42867368);
                t(wjwVar, function2, fetVar, i2 & 1022);
                fetVar.r(false);
            }
            mm40Var = jm40.b;
        } else {
            fetVar.X();
        }
        mm40 mm40Var2 = mm40Var;
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new r3o((Object) mm40Var2, (Object) wjwVar, (Object) function2, i, (byte) 15);
        }
    }

    public static final sje s() {
        kin0 kin0VarE = qem0.e();
        rwj rwjVar = tvk.f34603a;
        return new sje(kotlin.coroutines.e.c(kin0VarE, ys10.f43147a));
    }

    public static final void t(wjw wjwVar, Function2 function2, fet fetVar, int i) {
        int i2;
        fet fetVar2;
        fetVar.g0(1641508507);
        int i3 = i & 6;
        jm40 jm40Var = jm40.b;
        if (i3 == 0) {
            i2 = (fetVar.g(jm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.g(wjwVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.i(function2) ? 256 : 128;
        }
        byte b = 0;
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            fetVar2 = fetVar;
            nnw0.g(o7k0.w(o7k0.d(jm40Var, 1.0f), null, false, 3), null, false, u1c.M(-1742312955, new rgh(wjwVar, function2, (byte) 26), fetVar), fetVar2, 3072, 6);
        } else {
            fetVar2 = fetVar;
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new vjw(wjwVar, function2, i, b);
        }
    }

    public static final void u(wjw wjwVar, Function2 function2, fet fetVar, int i) {
        fetVar.g0(-715825010);
        int i2 = i & 6;
        jm40 jm40Var = jm40.b;
        int i3 = i2 == 0 ? (fetVar.g(jm40Var) ? 4 : 2) | i : i;
        if ((i & 48) == 0) {
            i3 |= fetVar.g(wjwVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= fetVar.i(function2) ? 256 : 128;
        }
        int i4 = i3;
        byte b = 1;
        if (fetVar.U(i4 & 1, (i4 & 147) != 146)) {
            mm40 mm40VarD = o7k0.d(s5x0.L(jm40Var, xfn.a(fetVar).c, 0.0f, 2), 1.0f);
            zcl zclVar = qmk.f28987a;
            x5d x5dVarA = w5d.a(new qw3(8.0f, true, new jf4((byte) 14)), gqw0.m, fetVar, 0);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarD);
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
            fetVar.e0(572817180);
            int i5 = 0;
            for (Object obj : wjwVar.f39283a) {
                int i6 = i5 + 1;
                if (i5 < 0) {
                    q3d.p();
                    throw null;
                }
                xjw xjwVar = (xjw) obj;
                int i7 = xjwVar.f41006a;
                StringBuilder sb = new StringBuilder();
                sb.append(i7);
                sb.append(i5);
                fetVar.b0(76827073, sb.toString());
                gy30 gy30Var = xjwVar.c;
                boolean zI = ((i4 & 896) == 256) | fetVar.i(xjwVar);
                Object objP = fetVar.P();
                if (zI || objP == ukd.f35823a) {
                    objP = new wqv(function2, xjwVar, (byte) 9);
                    fetVar.o0(objP);
                }
                jiq0.y(null, gy30Var, (Function0) objP, null, null, fetVar, 0, 25);
                fetVar.r(false);
                i5 = i6;
            }
            fetVar.r(false);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new vjw(wjwVar, function2, i, b);
        }
    }

    public static final void v(int i, fet fetVar, mm40 mm40Var, String str, boolean z) {
        mm40 mm40Var2;
        boolean z2;
        fet fetVar2 = fetVar;
        fetVar2.g0(1039742397);
        int i2 = i | 6 | (fetVar2.g(str) ? 32 : 16) | (fetVar2.h(z) ? 256 : 128);
        if (fetVar2.U(i2 & 1, (i2 & 147) != 146)) {
            zcl zclVar = qmk.f28987a;
            thg0 thg0VarA = shg0.a(new qw3(4.0f, true, new jf4((byte) 14)), gqw0.k, fetVar2, 48);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            jm40 jm40Var = jm40.b;
            mm40 mm40VarC0 = kbc.c0(fetVar2, jm40Var);
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
            v8q0.a(str, new x7z(1.0f, false), ((ThemeColors) fetVar2.k(zaq0.b)).getTextPrimary(), null, 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, new y9q0(0L, qmk.q, null, j1t0.b, 0L, null, 0, 0, qmk.D, 16646045), fetVar2, (i2 >> 3) & 14, 24960, 110584);
            fetVar2 = fetVar2;
            if (z) {
                fetVar2.e0(-1186385526);
                z2 = true;
                vic.e(null, y0m.b, fetVar2, 48, 1);
                fetVar2.r(false);
            } else {
                z2 = true;
                fetVar2.e0(-1186294231);
                fetVar2.r(false);
            }
            fetVar2.r(z2);
            mm40Var2 = jm40Var;
        } else {
            fetVar2.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new z05(mm40Var2, str, z, i, (byte) 2);
        }
    }

    public static final void w(int i, i1n i1nVar, i1n i1nVar2, fet fetVar, mm40 mm40Var, String str) {
        mm40 mm40Var2;
        x0m x0mVar = x0m.f40076a;
        fetVar.g0(-601933607);
        int i2 = i | 6;
        if ((i & 48) == 0) {
            i2 |= fetVar.g(i1nVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.g(i1nVar2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= fetVar.g("") ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= fetVar.g("") ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= fetVar.g(str) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= fetVar.g(uem.f35536a) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i2 |= fetVar.e(0) ? 8388608 : 4194304;
        }
        if (fetVar.U(i2 & 1, (4793491 & i2) != 4793490)) {
            mm40Var2 = jm40.b;
            mm40 mm40VarD = o7k0.d(mm40Var2, 1.0f);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarG = o7k0.g(mm40VarD, 0.0f, 50.0f, 1);
            thg0 thg0VarA = shg0.a(new qw3(6.0f, true, new jf4((byte) 14)), gqw0.j, fetVar, 0);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarG);
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
            jpm0.o(fetVar, thg0VarA, shdVar);
            shd shdVar2 = gqw0.w;
            jpm0.o(fetVar, bh90VarM, shdVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            shd shdVar3 = gqw0.y;
            jpm0.o(fetVar, numValueOf, shdVar3);
            jpm0.n(fetVar);
            shd shdVar4 = gqw0.v;
            jpm0.o(fetVar, mm40VarC0, shdVar4);
            yx7 yx7Var = gqw0.l;
            ecu0 ecu0Var = new ecu0(yx7Var);
            if (1.0f <= 0.0d) {
                vcx.a("invalid weight; must be greater than zero");
            }
            mm40 mm40VarE = ecu0Var.e(new x7z(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true));
            x5d x5dVarA = w5d.a(new qw3(4.0f, false, new gne(yx7Var, (byte) 11)), gqw0.m, fetVar, 0);
            int iHashCode2 = Long.hashCode(fetVar.T);
            bh90 bh90VarM2 = fetVar.m();
            mm40 mm40VarC1 = kbc.c0(fetVar, mm40VarE);
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
            String str2 = i1nVar.f14007a;
            x0m x0mVar2 = x0m.f40076a;
            v(0, fetVar, null, str2, false);
            String str3 = i1nVar2.f14007a;
            x0m x0mVar3 = x0m.f40076a;
            v(0, fetVar, null, str3, false);
            fetVar.r(true);
            fetVar.e0(-1871149531);
            fetVar.r(false);
            int i3 = (i2 >> 6) & 8176;
            int i4 = i2 << 9;
            y(i3 | (57344 & i4) | (i4 & 458752), i1nVar, i1nVar2, fetVar, null, str);
            fetVar.r(true);
        } else {
            fetVar.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new m1n(mm40Var2, i1nVar, i1nVar2, str, i);
        }
    }

    public static final void x(int i, fet fetVar, mm40 mm40Var, String str, String str2, String str3) {
        int i2;
        String str4;
        fet fetVar2;
        fet fetVar3;
        boolean z;
        shd shdVar;
        shd shdVar2;
        shd shdVar3;
        shd shdVar4;
        pcy pcyVar;
        fetVar.g0(-840140291);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            str4 = str;
            i2 |= fetVar.g(str4) ? 32 : 16;
        } else {
            str4 = str;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.g(str2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= fetVar.g(str3) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= fetVar.h(false) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= fetVar.h(false) ? 131072 : 65536;
        }
        if (fetVar.U(i2 & 1, (74899 & i2) != 74898)) {
            fetVar.e0(79042980);
            long primary = afn0.m(fetVar).getPrimary();
            fetVar.r(false);
            fetVar.e0(79047076);
            long primary2 = afn0.m(fetVar).getPrimary();
            fetVar.r(false);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarT = o7k0.t(mm40Var, 12.0f, 108.0f);
            x5d x5dVarA = w5d.a(new qw3(4.0f, false, new gne(gqw0.l, (byte) 11)), gqw0.n, fetVar, 48);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarT);
            mkd.c0.getClass();
            fetVar.i0();
            boolean z2 = fetVar.S;
            pcy pcyVar2 = e7z.u1;
            if (z2) {
                fetVar.l(pcyVar2);
            } else {
                fetVar.r0();
            }
            shd shdVar5 = gqw0.x;
            jpm0.o(fetVar, x5dVarA, shdVar5);
            shd shdVar6 = gqw0.w;
            jpm0.o(fetVar, bh90VarM, shdVar6);
            Integer numValueOf = Integer.valueOf(iHashCode);
            shd shdVar7 = gqw0.y;
            jpm0.o(fetVar, numValueOf, shdVar7);
            jpm0.n(fetVar);
            shd shdVar8 = gqw0.v;
            jpm0.o(fetVar, mm40VarC0, shdVar8);
            if (str4.length() > 0) {
                fetVar.e0(255562161);
                int i3 = (i2 >> 3) & 14;
                z = false;
                shdVar2 = shdVar8;
                pcyVar = pcyVar2;
                String str5 = str4;
                shdVar = shdVar6;
                shdVar3 = shdVar7;
                shdVar4 = shdVar5;
                v8q0.a(str5, null, afn0.m(fetVar).getSecondary80(), null, 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, new y9q0(0L, qmk.p, null, j1t0.b, 0L, null, 0, 0, qmk.C, 16646109), fetVar, i3, 24960, 110586);
                fetVar3 = fetVar;
                fetVar3.r(false);
            } else {
                fetVar3 = fetVar;
                z = false;
                shdVar = shdVar6;
                shdVar2 = shdVar8;
                shdVar3 = shdVar7;
                shdVar4 = shdVar5;
                pcyVar = pcyVar2;
                fetVar3.e0(255796955);
                fetVar3.r(false);
            }
            jm40 jm40Var = jm40.b;
            mm40 mm40VarE = o7k0.e(jm40Var, 14.0f);
            zx7 zx7Var = gqw0.e;
            tj30 tj30VarC = zq8.c(zx7Var, z);
            int iHashCode2 = Long.hashCode(fetVar3.T);
            bh90 bh90VarM2 = fetVar3.m();
            mm40 mm40VarC1 = kbc.c0(fetVar3, mm40VarE);
            fetVar3.i0();
            if (fetVar3.S) {
                fetVar3.l(pcyVar);
            } else {
                fetVar3.r0();
            }
            jpm0.o(fetVar3, tj30VarC, shdVar4);
            jpm0.o(fetVar3, bh90VarM2, shdVar);
            vqd.u(iHashCode2, fetVar3, shdVar3, fetVar3);
            jpm0.o(fetVar3, mm40VarC1, shdVar2);
            y9q0 y9q0VarA = g1t0.a();
            long j = qmk.o;
            long j2 = g1t0.a().f42262a.b;
            long j3 = qmk.n;
            shd shdVar9 = shdVar2;
            fet fetVar4 = fetVar3;
            shd shdVar10 = shdVar3;
            v8q0.a(str2, null, primary, new n05(j, j2, j3), 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, y9q0VarA, fetVar4, (i2 >> 6) & 14, 24960, 110578);
            fetVar4.r(true);
            mm40 mm40VarE2 = o7k0.e(jm40Var, 14.0f);
            tj30 tj30VarC2 = zq8.c(zx7Var, false);
            int iHashCode3 = Long.hashCode(fetVar4.T);
            bh90 bh90VarM3 = fetVar4.m();
            mm40 mm40VarC2 = kbc.c0(fetVar4, mm40VarE2);
            fetVar4.i0();
            if (fetVar4.S) {
                fetVar4.l(pcyVar);
            } else {
                fetVar4.r0();
            }
            jpm0.o(fetVar4, tj30VarC2, shdVar4);
            jpm0.o(fetVar4, bh90VarM3, shdVar);
            vqd.u(iHashCode3, fetVar4, shdVar10, fetVar4);
            jpm0.o(fetVar4, mm40VarC2, shdVar9);
            v8q0.a(str3, null, primary2, new n05(j, g1t0.a().f42262a.b, j3), 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, g1t0.a(), fetVar4, (i2 >> 9) & 14, 24960, 110578);
            fetVar2 = fetVar4;
            fetVar2.r(true);
            fetVar2.r(true);
        } else {
            fetVar2 = fetVar;
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new a0n(mm40Var, str, str2, str3, i, (byte) 1);
        }
    }

    public static final void y(int i, i1n i1nVar, i1n i1nVar2, fet fetVar, mm40 mm40Var, String str) {
        String str2;
        mm40 mm40Var2;
        yx7 yx7Var = gqw0.l;
        fetVar.g0(-1475512867);
        int i2 = i | 6;
        if ((i & 48) == 0) {
            i2 |= fetVar.g("") ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.g("") ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            str2 = str;
            i2 |= fetVar.g(str2) ? 2048 : 1024;
        } else {
            str2 = str;
        }
        if ((i & 24576) == 0) {
            i2 |= fetVar.g(i1nVar) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= fetVar.g(i1nVar2) ? 131072 : 65536;
        }
        if (fetVar.U(i2 & 1, (74899 & i2) != 74898)) {
            zcl zclVar = qmk.f28987a;
            thg0 thg0VarA = shg0.a(new qw3(6.0f, true, new jf4((byte) 14)), gqw0.j, fetVar, 0);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            jm40 jm40Var = jm40.b;
            mm40 mm40VarC0 = kbc.c0(fetVar, jm40Var);
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
            brm0.x(fetVar, mm40VarC0, gqw0.v, 1511708521, false);
            fetVar.e0(1512248169);
            fetVar.r(false);
            if (i1nVar.b.length() <= 0 || i1nVar2.b.length() <= 0) {
                fetVar.e0(1512813609);
                fetVar.r(false);
            } else {
                fetVar.e0(1512367705);
                x((i2 >> 6) & 112, fetVar, new ecu0(yx7Var), str2, i1nVar.b, i1nVar2.b);
                fetVar.r(false);
            }
            fetVar.r(true);
            mm40Var2 = jm40Var;
        } else {
            fetVar.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new m1n(mm40Var2, str, i1nVar, i1nVar2, i);
        }
    }

    public static final void z(int i, fet fetVar, mm40 mm40Var) {
        float f;
        fetVar.g0(-410037730);
        int i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        boolean z = false;
        if (fetVar.U(i2 & 1, (i2 & 3) != 2)) {
            ugg0 ugg0Var = cbn.f4069a;
            int i3 = ((Configuration) fetVar.k(dy2.f6873a)).screenWidthDp;
            Object objP = fetVar.P();
            if (objP == ukd.f35823a) {
                if (i3 >= 360) {
                    zcl zclVar = qmk.f28987a;
                    f = 144.0f;
                } else {
                    zcl zclVar2 = qmk.f28987a;
                    f = 132.0f;
                }
                objP = twn.j(f, fetVar);
            }
            zq8.a(0, fetVar, xbc.c0(lgb.J(o7k0.e(mm40Var, ((ycl) objP).f42389a), cbn.f4069a), vbc.d0(vqm.f37862a, fetVar, 6, 0)));
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new xml(mm40Var, z, i, (byte) 23);
        }
    }
}
