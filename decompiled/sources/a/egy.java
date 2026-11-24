package a;

import android.gov.nist.core.Separators;
import java.io.ByteArrayInputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;

/* JADX INFO: loaded from: classes2.dex */
public final class egy {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final sso f7784a = tlb.q(j9x.j);

    public static dfy a(v2d0 v2d0Var, h950 h950Var, roi0 roi0Var) {
        String strB0;
        h950Var.getClass();
        roi0Var.getClass();
        ijt ijtVar = dgy.f6066a;
        ijtVar.getClass();
        vfy vfyVar = (vfy) h8x.L(v2d0Var, ijtVar);
        String string = (vfyVar == null || (vfyVar.b & 1) != 1) ? "<init>" : h950Var.getString(vfyVar.c);
        if (vfyVar == null || (vfyVar.b & 2) != 2) {
            List<i4d0> list = v2d0Var.e;
            list.getClass();
            ArrayList arrayList = new ArrayList(r3d.q(list, 10));
            for (i4d0 i4d0Var : list) {
                i4d0Var.getClass();
                String strE = e(m8x.z0(i4d0Var, roi0Var), h950Var);
                if (strE == null) {
                    return null;
                }
                arrayList.add(strE);
            }
            strB0 = CollectionsKt.b0(arrayList, "", Separators.LPAREN, ")V", null, 56);
        } else {
            strB0 = h950Var.getString(vfyVar.d);
        }
        return new dfy(string, strB0);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r4v2 java.lang.String, still in use, count: 2, list:
          (r4v2 java.lang.String) from 0x004a: IF  (r4v2 java.lang.String) == (null java.lang.String)  -> B:23:0x004c A[HIDDEN] (LINE:75)
          (r4v2 java.lang.String) from 0x004d: PHI (r4 I:??) = (r4v2 java.lang.String), (r4v5 java.lang.String) binds: [B:22:0x004a, B:20:0x003b] A[DONT_GENERATE, DONT_INLINE]
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
    public static a.cfy b(a.p3d0 r4, a.h950 r5, a.roi0 r6, boolean r7) {
        /*
            r4.getClass()
            r5.getClass()
            r6.getClass()
            a.ijt r0 = a.dgy.d
            r0.getClass()
            java.lang.Object r0 = a.h8x.L(r4, r0)
            a.xfy r0 = (a.xfy) r0
            r1 = 0
            if (r0 != 0) goto L18
            goto L4c
        L18:
            int r2 = r0.b
            r3 = 1
            r2 = r2 & r3
            if (r2 != r3) goto L21
            a.ufy r0 = r0.c
            goto L22
        L21:
            r0 = r1
        L22:
            if (r0 != 0) goto L27
            if (r7 == 0) goto L27
            goto L4c
        L27:
            if (r0 == 0) goto L31
            int r7 = r0.b
            r7 = r7 & r3
            if (r7 != r3) goto L31
            int r7 = r0.c
            goto L33
        L31:
            int r7 = r4.f
        L33:
            if (r0 == 0) goto L42
            int r2 = r0.b
            r3 = 2
            r2 = r2 & r3
            if (r2 != r3) goto L42
            int r4 = r0.d
            java.lang.String r4 = r5.getString(r4)
            goto L4d
        L42:
            a.a4d0 r4 = a.m8x.j0(r4, r6)
            java.lang.String r4 = e(r4, r5)
            if (r4 != 0) goto L4d
        L4c:
            return r1
        L4d:
            a.cfy r6 = new a.cfy
            java.lang.String r5 = r5.getString(r7)
            r6.<init>(r5, r4)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: a.egy.b(a.p3d0, a.h950, a.roi0, boolean):a.cfy");
    }

    public static dfy c(i3d0 i3d0Var, h950 h950Var, roi0 roi0Var) {
        String strConcat;
        i3d0Var.getClass();
        h950Var.getClass();
        roi0Var.getClass();
        ijt ijtVar = dgy.b;
        ijtVar.getClass();
        vfy vfyVar = (vfy) h8x.L(i3d0Var, ijtVar);
        int i = (vfyVar == null || (vfyVar.b & 1) != 1) ? i3d0Var.f : vfyVar.c;
        if (vfyVar == null || (vfyVar.b & 2) != 2) {
            List listK = q3d.k(m8x.f0(i3d0Var, roi0Var));
            List<i4d0> list = i3d0Var.p;
            list.getClass();
            ArrayList arrayList = new ArrayList(r3d.q(list, 10));
            for (i4d0 i4d0Var : list) {
                i4d0Var.getClass();
                arrayList.add(m8x.z0(i4d0Var, roi0Var));
            }
            ArrayList arrayListQ0 = CollectionsKt.q0(listK, arrayList);
            ArrayList arrayList2 = new ArrayList(r3d.q(arrayListQ0, 10));
            Iterator it = arrayListQ0.iterator();
            while (it.hasNext()) {
                String strE = e((a4d0) it.next(), h950Var);
                if (strE == null) {
                    return null;
                }
                arrayList2.add(strE);
            }
            String strE2 = e(m8x.i0(i3d0Var, roi0Var), h950Var);
            if (strE2 == null) {
                return null;
            }
            strConcat = CollectionsKt.b0(arrayList2, "", Separators.LPAREN, Separators.RPAREN, null, 56).concat(strE2);
        } else {
            strConcat = h950Var.getString(vfyVar.d);
        }
        return new dfy(h950Var.getString(i), strConcat);
    }

    public static final boolean d(p3d0 p3d0Var) {
        p3d0Var.getClass();
        kjq kjqVar = vey.f37307a;
        kjq kjqVar2 = vey.f37307a;
        Object objL = p3d0Var.l(dgy.e);
        objL.getClass();
        return kjqVar2.e(((Number) objL).intValue()).booleanValue();
    }

    public static String e(a4d0 a4d0Var, h950 h950Var) {
        if (a4d0Var.r()) {
            return ulc.b(h950Var.b(a4d0Var.i));
        }
        return null;
    }

    public static final Pair f(String[] strArr, String[] strArr2) throws aox {
        strArr2.getClass();
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(q68.a(strArr));
        ify ifyVarH = h(byteArrayInputStream, strArr2);
        sfy sfyVar = s2d0.i1;
        sfyVar.getClass();
        pyc pycVar = new pyc(byteArrayInputStream);
        z3 z3Var = (z3) sfyVar.b(pycVar, f7784a);
        try {
            pycVar.a(0);
            if (z3Var.b()) {
                return new Pair(ifyVarH, (s2d0) z3Var);
            }
            aox aoxVar = new aox(new ss3((byte) 28).getMessage());
            aoxVar.f1223a = z3Var;
            throw aoxVar;
        } catch (aox e) {
            e.f1223a = z3Var;
            throw e;
        }
    }

    public static final Pair g(String[] strArr, String[] strArr2) {
        strArr2.getClass();
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(q68.a(strArr));
        ify ifyVarH = h(byteArrayInputStream, strArr2);
        sfy sfyVar = i3d0.z;
        sfyVar.getClass();
        pyc pycVar = new pyc(byteArrayInputStream);
        z3 z3Var = (z3) sfyVar.b(pycVar, f7784a);
        try {
            pycVar.a(0);
            if (z3Var.b()) {
                return new Pair(ifyVarH, (i3d0) z3Var);
            }
            aox aoxVar = new aox(new ss3((byte) 28).getMessage());
            aoxVar.f1223a = z3Var;
            throw aoxVar;
        } catch (aox e) {
            e.f1223a = z3Var;
            throw e;
        }
    }

    public static ify h(ByteArrayInputStream byteArrayInputStream, String[] strArr) {
        cgy cgyVar = (cgy) cgy.h.a(byteArrayInputStream, f7784a);
        cgyVar.getClass();
        return new ify(cgyVar, strArr);
    }

    public static final Pair i(String[] strArr, String[] strArr2) throws aox {
        strArr2.getClass();
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(q68.a(strArr));
        ify ifyVarH = h(byteArrayInputStream, strArr2);
        sfy sfyVar = m3d0.l;
        sfyVar.getClass();
        pyc pycVar = new pyc(byteArrayInputStream);
        z3 z3Var = (z3) sfyVar.b(pycVar, f7784a);
        try {
            pycVar.a(0);
            if (z3Var.b()) {
                return new Pair(ifyVarH, (m3d0) z3Var);
            }
            aox aoxVar = new aox(new ss3((byte) 28).getMessage());
            aoxVar.f1223a = z3Var;
            throw aoxVar;
        } catch (aox e) {
            e.f1223a = z3Var;
            throw e;
        }
    }
}
