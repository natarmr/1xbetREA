package a;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import kotlin.collections.CollectionsKt;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes3.dex */
public final class jr0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xzp f16979a;
    public final ap0 b;
    public final knf0 c;
    public final mne d;

    public jr0(xzp xzpVar, ap0 ap0Var, knf0 knf0Var, mne mneVar) {
        ap0Var.getClass();
        knf0Var.getClass();
        this.f16979a = xzpVar;
        this.b = ap0Var;
        this.c = knf0Var;
        this.d = mneVar;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:12|71|89|21|22|93|23|24|87|25|(2:27|69)(1:28)) */
    /* JADX WARN: Code duplicated, block: B:27:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:28:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:39:0x014c  */
    /* JADX WARN: Code duplicated, block: B:44:0x015a  */
    /* JADX WARN: Code duplicated, block: B:47:0x0160  */
    /* JADX WARN: Code duplicated, block: B:57:0x0178 A[PHI: r17
  0x0178: PHI (r17v3 a.wne) = (r17v0 a.wne), (r17v4 a.wne) binds: [B:61:0x0184, B:55:0x0175] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:59:0x017c A[PHI: r17
  0x017c: PHI (r17v1 a.wne) = (r17v0 a.wne), (r17v4 a.wne), (r17v4 a.wne) binds: [B:61:0x0184, B:53:0x0171, B:55:0x0175] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:76:0x0200  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code duplicated, block: B:95:0x022b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:98:0x01fa A[SYNTHETIC] */
    /* JADX WARN: Code restructure failed: missing block: B:100:?, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0123, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0124, code lost:
    
        r9 = r31;
        r7 = r10;
        r6 = r24;
        r13 = r27;
        r1 = r28;
        r10 = r4;
        r5 = r12;
        r4 = r15;
        r15 = r22;
        r12 = r2;
        r2 = r14;
        r14 = r8;
        r8 = r20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0138, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0139, code lost:
    
        r20 = r6;
        r22 = r7;
        r27 = r9;
        r24 = r11;
        r28 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0144, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0145, code lost:
    
        r31 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0157, code lost:
    
        r32 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0168, code lost:
    
        if ((r0 instanceof a.zhi0) != false) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x016a, code lost:
    
        r2 = r0;
        r17 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0171, code lost:
    
        if (r2.f != false) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0178, code lost:
    
        r2 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x017c, code lost:
    
        r2 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x017e, code lost:
    
        r17 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0184, code lost:
    
        if (a.hic.C(r0) == false) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0187, code lost:
    
        r3 = r31 + 1;
        r31 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x018c, code lost:
    
        if (r3 > 3) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0191, code lost:
    
        r31 = r4;
        java.lang.System.out.println((java.lang.Object) a.b1j.g(r3, "error (", "): ", r0));
        r1.q = r15;
        r1.r = r14;
        r1.s = r13;
        r1.t = r12;
        r1.i = r10;
        r1.j = r9;
        r1.n = r8;
        r1.k = r7;
        r1.l = r6;
        r1.m = r5;
        r1.o = r31;
        r1.p = r3;
        r1.w = 2;
        r2 = r17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x01c7, code lost:
    
        if (a.qcc.O(3000, r1) == r2) goto L100;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x01ca, code lost:
    
        r0 = r13;
        r13 = r1;
        r1 = r9;
        r9 = r0;
        r0 = r3;
        r29 = r15;
        r15 = r31;
        r30 = r12;
        r12 = r5;
        r4 = r10;
        r11 = r6;
        r10 = r7;
        r6 = r30;
        r7 = r29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x01e4, code lost:
    
        r1 = a.j0g0.b;
        r0 = new a.g0g0(r0);
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:70:0x01ca -> B:71:0x01dd). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.io.Serializable a(long r32, boolean r34, int r35, java.lang.String r36, java.lang.String r37, java.lang.String r38, boolean r39, boolean r40, boolean r41, a.zje r42) throws a.zhi0 {
        /*
            Method dump skipped, instruction units count: 561
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.jr0.a(long, boolean, int, java.lang.String, java.lang.String, java.lang.String, boolean, boolean, boolean, a.zje):java.io.Serializable");
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    public final Serializable b(long j, boolean z, int i, int i2, String str, String str2, String str3, boolean z2, boolean z3, boolean z4, zje zjeVar) {
        uq0 uq0Var;
        boolean z5;
        boolean z6;
        if (zjeVar instanceof uq0) {
            uq0Var = (uq0) zjeVar;
            int i3 = uq0Var.m;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                uq0Var.m = i3 - Integer.MIN_VALUE;
            } else {
                uq0Var = new uq0(this, zjeVar);
            }
        } else {
            uq0Var = new uq0(this, zjeVar);
        }
        uq0 uq0Var2 = uq0Var;
        Object objQ = uq0Var2.k;
        wne wneVar = wne.f39444a;
        int i4 = uq0Var2.m;
        if (i4 == 0) {
            z1x.P(objQ);
            knf0 knf0Var = this.c;
            int iB = knf0Var.b();
            String strC = knf0Var.c();
            Boolean boolValueOf = Boolean.valueOf(z4);
            z5 = z;
            uq0Var2.i = z5;
            uq0Var2.j = z2;
            uq0Var2.m = 1;
            objQ = this.f16979a.q((int) j, iB, i, i2, str, str2, z3, strC, boolValueOf, str3, uq0Var2);
            if (objQ == wneVar) {
                return wneVar;
            }
            z6 = z2;
        } else {
            if (i4 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z6 = uq0Var2.j;
            boolean z7 = uq0Var2.i;
            z1x.P(objQ);
            z5 = z7;
        }
        return (Serializable) q8a.t0(((zc0) ((dx5) objQ).a()).f44144a, z6, z5);
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0016  */
    public final Object c(long j, boolean z, int i, uzb0 uzb0Var, String str, boolean z2, zje zjeVar) {
        wq0 wq0Var;
        boolean z3;
        if (zjeVar instanceof wq0) {
            wq0Var = (wq0) zjeVar;
            int i2 = wq0Var.n;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                wq0Var.n = i2 - Integer.MIN_VALUE;
            } else {
                wq0Var = new wq0(this, zjeVar);
            }
        } else {
            wq0Var = new wq0(this, zjeVar);
        }
        wq0 wq0Var2 = wq0Var;
        Object obj = wq0Var2.l;
        wne wneVar = wne.f39444a;
        int i3 = wq0Var2.n;
        if (i3 == 0) {
            z1x.P(obj);
            String strB = r7x.B(uzb0Var);
            knf0 knf0Var = this.c;
            int iB = knf0Var.b();
            String strC = knf0Var.c();
            wq0Var2.k = null;
            wq0Var2.i = j;
            wq0Var2.j = z;
            wq0Var2.n = 2;
            Object objY = this.f16979a.y(j, i, strB, str, z2, iB, strC, wq0Var2);
            if (objY == wneVar) {
                return wneVar;
            }
            obj = objY;
            z3 = z;
        } else {
            if (i3 == 1) {
                boolean z4 = wq0Var2.j;
                long j2 = wq0Var2.i;
                String str2 = wq0Var2.k;
                z1x.P(obj);
                mi1 mi1VarY = oja0.Y(j2, ((dp0) ((dx5) obj).a()).f6437a, z4);
                str2.getClass();
                if (StringsKt.W(str2)) {
                    return mi1VarY;
                }
                String lowerCase = str2.toLowerCase(Locale.ROOT);
                lowerCase.getClass();
                List<x2q> list = mi1VarY.b;
                ArrayList arrayList = new ArrayList(r3d.q(list, 10));
                for (x2q x2qVar : list) {
                    List list2 = x2qVar.d;
                    ArrayList arrayList2 = new ArrayList();
                    for (Object obj2 : list2) {
                        if (StringsKt.O(((l3q) obj2).getName(), lowerCase, true) || StringsKt.O(x2qVar.b, lowerCase, true)) {
                            arrayList2.add(obj2);
                        }
                    }
                    arrayList.add(x2q.a(x2qVar, CollectionsKt.A0(arrayList2, new sr0(lowerCase, x2qVar, (byte) 0))));
                }
                ArrayList arrayList3 = new ArrayList();
                for (Object obj3 : arrayList) {
                    if (!((x2q) obj3).d.isEmpty()) {
                        arrayList3.add(obj3);
                    }
                }
                return mi1.a(mi1VarY, arrayList3);
            }
            if (i3 != 2) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z3 = wq0Var2.j;
            j = wq0Var2.i;
            z1x.P(obj);
        }
        return oja0.Y(j, ((dp0) ((dx5) obj).a()).f6437a, z3);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:12|13|75|22|(1:24)(1:25)|26|27|77|28|(1:31)|68) */
    /* JADX WARN: Code duplicated, block: B:24:0x0095 A[Catch: all -> 0x00d6, TryCatch #1 {all -> 0x00d6, blocks: (B:22:0x005d, B:24:0x0095, B:26:0x009e), top: B:75:0x005d }] */
    /* JADX WARN: Code duplicated, block: B:25:0x009d  */
    /* JADX WARN: Code duplicated, block: B:31:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:44:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:57:0x0105  */
    /* JADX WARN: Code duplicated, block: B:58:0x0107  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00cf, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00d0, code lost:
    
        r9 = r2;
        r2 = r4;
        r4 = r1;
        r1 = r17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00d6, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00d7, code lost:
    
        r17 = r1;
        r1 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0134, code lost:
    
        if (a.qcc.O(3000, r1) == r3) goto L68;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:67:0x0134 -> B:13:0x0039). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.io.Serializable d(java.lang.Long r20, a.zje r21) throws a.zhi0 {
        /*
            Method dump skipped, instruction units count: 326
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.jr0.d(java.lang.Long, a.zje):java.io.Serializable");
    }
}
