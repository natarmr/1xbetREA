package a;

import android.content.Context;
import androidx.compose.ui.platform.AndroidComposeView;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class td9 {
    public static final mtc f = new mtc();
    public static final udq g = new udq();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f33756a;
    public Object b;
    public Object c;
    public Object d;
    public Object e;

    /* JADX WARN: Code duplicated, block: B:109:0x0276  */
    /* JADX WARN: Code duplicated, block: B:110:0x0279  */
    /* JADX WARN: Code duplicated, block: B:113:0x027f  */
    /* JADX WARN: Code duplicated, block: B:115:0x0298  */
    /* JADX WARN: Code duplicated, block: B:117:0x029d  */
    /* JADX WARN: Code duplicated, block: B:118:0x02b0  */
    /* JADX WARN: Code duplicated, block: B:120:0x02b4  */
    /* JADX WARN: Code duplicated, block: B:121:0x02ca  */
    /* JADX WARN: Code duplicated, block: B:123:0x02ce  */
    /* JADX WARN: Code duplicated, block: B:124:0x02e4  */
    /* JADX WARN: Code duplicated, block: B:126:0x02e8  */
    /* JADX WARN: Code duplicated, block: B:160:0x0302 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:39:0x00f4  */
    /* JADX WARN: Multi-variable type inference failed */
    public td9(q3x0 q3x0Var, un00 un00Var) throws Throwable {
        wcf0 wcf0VarE;
        Throwable th;
        char c;
        long j;
        long j2;
        String str;
        int i = 1;
        this.f33756a = true;
        e3x0 e3x0Var = q3x0Var.f28073a;
        a3x0 a3x0Var = q3x0Var.b;
        if (e3x0Var.f7158a.isEmpty()) {
            a3x0.y().equals(a3x0Var);
        }
        this.b = a3x0Var.r();
        this.c = a3x0Var.s();
        a3x0Var.getClass();
        a3x0Var.getClass();
        Throwable th2 = null;
        Map mapW = a3x0Var.v() == 0 ? null : a3x0Var.w();
        if (mapW != null) {
            f4x.m(mapW.keySet());
        } else {
            int i2 = f4x.c;
            Object[] objArr = ycf0.i;
        }
        int iV = a3x0Var.v();
        e3x0 e3x0Var2 = q3x0Var.f28073a;
        char c2 = 3;
        if (iV > 0) {
            Collection<q2x0> collectionValues = a3x0Var.w().values();
            if (collectionValues == null) {
                wcf0VarE = wcf0.g;
            } else {
                zz2 zz2VarA = wcf0.a();
                for (q2x0 q2x0Var : collectionValues) {
                    int iF = q2x0Var.F();
                    int i3 = iF - 1;
                    if (iF == 0) {
                        throw null;
                    }
                    if (i3 == 0) {
                        zz2VarA.A(q2x0Var.r(), Long.valueOf(q2x0Var.s()));
                    } else if (i3 == 1) {
                        zz2VarA.A(q2x0Var.r(), Boolean.valueOf(q2x0Var.t()));
                    } else if (i3 == 2) {
                        zz2VarA.A(q2x0Var.r(), Double.valueOf(q2x0Var.u()));
                    } else if (i3 == 3) {
                        zz2VarA.A(q2x0Var.r(), q2x0Var.v());
                    } else {
                        if (i3 != 4) {
                            jf4.n("Could not serialize Flag for override: ".concat(String.valueOf(q2x0Var.r())));
                            throw null;
                        }
                        zz2VarA.A(q2x0Var.r(), q2x0Var.w().m());
                    }
                }
                wcf0VarE = zz2VarA.e(false);
            }
            if (!wcf0VarE.isEmpty()) {
                HashMap map = new HashMap(wcf0VarE);
                j4x j4xVar = e3x0Var2.f7158a;
                i4x i4xVar = new i4x(4);
                eet0 it = j4xVar.iterator();
                while (true) {
                    v3x v3xVar = (v3x) it;
                    if (!v3xVar.hasNext()) {
                        for (String str2 : map.keySet()) {
                            Object obj = map.get(str2);
                            int length = str2.length();
                            if (length <= 19) {
                                if (length == 0) {
                                    th = th2;
                                    c = c2;
                                } else {
                                    th = th2;
                                    c = c2;
                                    long jCharAt = str2.charAt(0) - '0';
                                    if (jCharAt >= 1) {
                                        if (jCharAt <= 9) {
                                            int i4 = i;
                                            while (true) {
                                                if (i4 >= length) {
                                                    j = 0;
                                                    if (jCharAt >= 0 && jCharAt <= 2305843009213693951L) {
                                                        j2 = jCharAt;
                                                        break;
                                                    }
                                                    break;
                                                }
                                                int iCharAt = str2.charAt(i4) - '0';
                                                j = 0;
                                                if (!((iCharAt < 0) | (iCharAt > 9))) {
                                                    jCharAt = (jCharAt * 10) + ((long) iCharAt);
                                                    i4++;
                                                }
                                            }
                                        }
                                        if (j2 == j) {
                                            str = str2;
                                        } else {
                                            str = th;
                                        }
                                        if (obj instanceof String) {
                                            i4xVar.b(new d3x0(j2, str, 4, 0L, obj));
                                        } else if (obj instanceof byte[]) {
                                            i4xVar.b(new d3x0(j2, str, 5, 0L, obj));
                                        } else if (obj instanceof Boolean) {
                                            i4xVar.b(new d3x0(j2, str, ((Boolean) obj).booleanValue() ? 1 : 0, 0L, null));
                                        } else if (obj instanceof Long) {
                                            i4xVar.b(new d3x0(j2, str, 2, ((Long) obj).longValue(), null));
                                        } else {
                                            if (obj instanceof Double) {
                                                String strValueOf = String.valueOf(obj);
                                                jf4.n(ua80.m(new StringBuilder(str2.length() + 28 + strValueOf.length()), "Cannot serialize override ", str2, ": ", strValueOf));
                                                throw th;
                                            }
                                            i4xVar.b(new d3x0(j2, str, 3, Double.doubleToRawLongBits(((Double) obj).doubleValue()), null));
                                        }
                                        c2 = c;
                                        th2 = th;
                                        i = 1;
                                    }
                                    j2 = j;
                                    if (j2 == j) {
                                        str = str2;
                                    } else {
                                        str = th;
                                    }
                                    if (obj instanceof String) {
                                        i4xVar.b(new d3x0(j2, str, 4, 0L, obj));
                                    } else if (obj instanceof byte[]) {
                                        i4xVar.b(new d3x0(j2, str, 5, 0L, obj));
                                    } else if (obj instanceof Boolean) {
                                        i4xVar.b(new d3x0(j2, str, ((Boolean) obj).booleanValue() ? 1 : 0, 0L, null));
                                    } else if (obj instanceof Long) {
                                        i4xVar.b(new d3x0(j2, str, 2, ((Long) obj).longValue(), null));
                                    } else {
                                        if (obj instanceof Double) {
                                            String strValueOf2 = String.valueOf(obj);
                                            jf4.n(ua80.m(new StringBuilder(str2.length() + 28 + strValueOf2.length()), "Cannot serialize override ", str2, ": ", strValueOf2));
                                            throw th;
                                        }
                                        i4xVar.b(new d3x0(j2, str, 3, Double.doubleToRawLongBits(((Double) obj).doubleValue()), null));
                                    }
                                    c2 = c;
                                    th2 = th;
                                    i = 1;
                                }
                                j = 0;
                                j2 = 0;
                                if (j2 == j) {
                                    str = str2;
                                } else {
                                    str = th;
                                }
                                if (obj instanceof String) {
                                    i4xVar.b(new d3x0(j2, str, 4, 0L, obj));
                                } else if (obj instanceof byte[]) {
                                    i4xVar.b(new d3x0(j2, str, 5, 0L, obj));
                                } else if (obj instanceof Boolean) {
                                    i4xVar.b(new d3x0(j2, str, ((Boolean) obj).booleanValue() ? 1 : 0, 0L, null));
                                } else if (obj instanceof Long) {
                                    i4xVar.b(new d3x0(j2, str, 2, ((Long) obj).longValue(), null));
                                } else {
                                    if (obj instanceof Double) {
                                        String strValueOf3 = String.valueOf(obj);
                                        jf4.n(ua80.m(new StringBuilder(str2.length() + 28 + strValueOf3.length()), "Cannot serialize override ", str2, ": ", strValueOf3));
                                        throw th;
                                    }
                                    i4xVar.b(new d3x0(j2, str, 3, Double.doubleToRawLongBits(((Double) obj).doubleValue()), null));
                                }
                                c2 = c;
                                th2 = th;
                                i = 1;
                            } else {
                                th = th2;
                                c = c2;
                            }
                            j = 0;
                            j2 = j;
                            if (j2 == j) {
                                str = str2;
                            } else {
                                str = th;
                            }
                            if (obj instanceof String) {
                                i4xVar.b(new d3x0(j2, str, 4, 0L, obj));
                            } else if (obj instanceof byte[]) {
                                i4xVar.b(new d3x0(j2, str, 5, 0L, obj));
                            } else if (obj instanceof Boolean) {
                                i4xVar.b(new d3x0(j2, str, ((Boolean) obj).booleanValue() ? 1 : 0, 0L, null));
                            } else if (obj instanceof Long) {
                                i4xVar.b(new d3x0(j2, str, 2, ((Long) obj).longValue(), null));
                            } else {
                                if (obj instanceof Double) {
                                    String strValueOf4 = String.valueOf(obj);
                                    jf4.n(ua80.m(new StringBuilder(str2.length() + 28 + strValueOf4.length()), "Cannot serialize override ", str2, ": ", strValueOf4));
                                    throw th;
                                }
                                i4xVar.b(new d3x0(j2, str, 3, Double.doubleToRawLongBits(((Double) obj).doubleValue()), null));
                            }
                            c2 = c;
                            th2 = th;
                            i = 1;
                        }
                        e3x0Var2 = new e3x0(i4xVar.h());
                        break;
                    }
                    d3x0 d3x0Var = (d3x0) v3xVar.next();
                    Object obj2 = d3x0Var.b;
                    long j3 = d3x0Var.f5427a;
                    Object objRemove = map.remove(obj2 == null ? Long.toString(j3) : obj2);
                    if (objRemove == null) {
                        i4xVar.b(d3x0Var);
                    } else if (objRemove instanceof String) {
                        i4xVar.b(new d3x0(d3x0Var.f5427a, d3x0Var.b, 4, 0L, objRemove));
                    } else if (objRemove instanceof byte[]) {
                        i4xVar.b(new d3x0(d3x0Var.f5427a, d3x0Var.b, 5, 0L, objRemove));
                    } else if (objRemove instanceof Boolean) {
                        i4xVar.b(new d3x0(d3x0Var.f5427a, d3x0Var.b, ((Boolean) objRemove).booleanValue() ? 1 : 0, 0L, null));
                    } else if (objRemove instanceof Long) {
                        i4xVar.b(new d3x0(d3x0Var.f5427a, d3x0Var.b, 2, ((Long) objRemove).longValue(), null));
                    } else {
                        if (!(objRemove instanceof Double)) {
                            String string = d3x0Var.b;
                            string = string == null ? Long.toString(j3) : string;
                            String string2 = objRemove.toString();
                            throw new IllegalStateException(ua80.m(new StringBuilder(String.valueOf(string).length() + 46 + string2.length()), "Cannot serialize override for existing flag ", string, ": ", string2));
                        }
                        i4xVar.b(new d3x0(d3x0Var.f5427a, d3x0Var.b, 3, Double.doubleToRawLongBits(((Double) objRemove).doubleValue()), null));
                    }
                }
            }
        }
        int size = ((zcf0) e3x0Var2.f7158a).g.size() + 3;
        e3c.s(size, "expectedSize");
        zz2 zz2Var = new zz2(size);
        eet0 it2 = e3x0Var2.f7158a.iterator();
        while (true) {
            v3x v3xVar2 = (v3x) it2;
            if (!v3xVar2.hasNext()) {
                zz2Var.A("__phenotype_server_token", a3x0Var.t());
                zz2Var.A("__phenotype_snapshot_token", a3x0Var.r());
                zz2Var.A("__phenotype_configuration_version", Long.valueOf(a3x0Var.u()));
                this.d = zz2Var.e(false);
                this.e = un00Var;
                return;
            }
            d3x0 d3x0Var2 = (d3x0) v3xVar2.next();
            String string3 = d3x0Var2.b;
            if (string3 == null) {
                string3 = Long.toString(d3x0Var2.f5427a);
            }
            zz2Var.A(string3, d3x0Var2.a());
        }
    }

    public static float a(int[] iArr, int i) {
        return ((i - iArr[4]) - iArr[3]) - (iArr[2] / 2.0f);
    }

    public static boolean b(int[] iArr) {
        int i = 0;
        for (int i2 = 0; i2 < 5; i2++) {
            int i3 = iArr[i2];
            if (i3 == 0) {
                return false;
            }
            i += i3;
        }
        if (i >= 7) {
            float f2 = i / 7.0f;
            float f3 = f2 / 2.0f;
            if (Math.abs(f2 - iArr[0]) < f3 && Math.abs(f2 - iArr[1]) < f3 && Math.abs((f2 * 3.0f) - iArr[2]) < 3.0f * f3 && Math.abs(f2 - iArr[3]) < f3 && Math.abs(f2 - iArr[4]) < f3) {
                return true;
            }
        }
        return false;
    }

    public static double j(sdq sdqVar, sdq sdqVar2) {
        double d = sdqVar.f5402a - sdqVar2.f5402a;
        double d2 = sdqVar.b - sdqVar2.b;
        return (d2 * d2) + (d * d);
    }

    public n3w c(String str) {
        Object next;
        n3w n3wVar;
        n3w n3wVar2;
        str.getClass();
        s5w s5wVar = (s5w) this.c;
        s5wVar.getClass();
        synchronized (s5wVar.d) {
            try {
                Collection collectionValues = s5wVar.f31675a.values();
                collectionValues.getClass();
                Iterator it = collectionValues.iterator();
                do {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                    n3wVar2 = (n3w) next;
                    if (Intrinsics.d(n3wVar2.f22868a, str)) {
                        break;
                    }
                } while (!Intrinsics.d(n3wVar2.b, str));
                n3wVar = (n3w) next;
            } catch (Throwable th) {
                throw th;
            }
        }
        return n3wVar;
    }

    /* JADX WARN: Code duplicated, block: B:65:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:71:0x0110  */
    /* JADX WARN: Code duplicated, block: B:73:0x0116 A[LOOP:10: B:73:0x0116->B:78:0x0124, LOOP_START, PHI: r7 r14
  0x0116: PHI (r7v2 char) = (r7v1 char), (r7v21 char) binds: [B:70:0x010e, B:78:0x0124] A[DONT_GENERATE, DONT_INLINE]
  0x0116: PHI (r14v21 int) = (r14v20 int), (r14v24 int) binds: [B:70:0x010e, B:78:0x0124] A[DONT_GENERATE, DONT_INLINE]] */
    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Not found exit edge by exit block: B:73:0x0116
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.checkLoopExits(LoopRegionMaker.java:272)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeLoopRegion(LoopRegionMaker.java:237)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:80)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeMthRegion(RegionMaker.java:49)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:25)
        */
    public boolean d(int r21, int r22, int[] r23) {
        /*
            Method dump skipped, instruction units count: 824
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.td9.d(int, int, int[]):boolean");
    }

    public boolean e() {
        ArrayList<sdq> arrayList = (ArrayList) this.c;
        int size = arrayList.size();
        float fAbs = 0.0f;
        int i = 0;
        float f2 = 0.0f;
        for (sdq sdqVar : arrayList) {
            if (sdqVar.d >= 2) {
                i++;
                f2 += sdqVar.c;
            }
        }
        if (i >= 3) {
            float f3 = f2 / size;
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                fAbs += Math.abs(((sdq) it.next()).c - f3);
            }
            if (fAbs <= f2 * 0.05f) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int f(zn00 zn00Var, AndroidComposeView androidComposeView, boolean z) {
        int i;
        Object[] objArr;
        int i2;
        int i3;
        oaw oawVar = (oaw) this.c;
        raw rawVar = (raw) this.e;
        if (this.f33756a) {
            return 0;
        }
        try {
            this.f33756a = true;
            cgx0 cgx0VarO = ((pv00) this.d).o(zn00Var, androidComposeView);
            u710 u710Var = (u710) cgx0VarO.c;
            int iH = u710Var.h();
            while (true) {
                if (i >= iH) {
                    objArr = true;
                    break;
                }
                dpa0 dpa0Var = (dpa0) u710Var.i(i);
                i = (dpa0Var.d || dpa0Var.h) ? 0 : i + 1;
                objArr = false;
                break;
            }
            int iH2 = u710Var.h();
            for (int i4 = 0; i4 < iH2; i4++) {
                dpa0 dpa0Var2 = (dpa0) u710Var.i(i4);
                if (objArr != false || x2x.J(dpa0Var2)) {
                    ((e7z) this.b).B(dpa0Var2.c, rawVar, dpa0Var2.i, true);
                    if (!rawVar.f30156a.i()) {
                        oawVar.a(dpa0Var2.f6456a, rawVar, x2x.J(dpa0Var2));
                        rawVar.clear();
                    }
                }
            }
            boolean zB = oawVar.b(cgx0VarO, z);
            if (cgx0VarO.b) {
                i2 = 0;
                break;
            }
            int iH3 = u710Var.h();
            int i5 = 0;
            while (true) {
                if (i5 >= iH3) {
                    i2 = 0;
                    break;
                }
                dpa0 dpa0Var3 = (dpa0) u710Var.i(i5);
                if (!ne60.c(x2x.j0(dpa0Var3, true), 0L) && dpa0Var3.c()) {
                    i2 = 1;
                    break;
                }
                i5++;
            }
            int iH4 = u710Var.h();
            for (int i6 = 0; i6 < iH4; i6++) {
                if (((dpa0) u710Var.i(i6)).c()) {
                    i3 = 1;
                    return (zB ? 1 : 0) | (i2 << 1) | (i3 << 2);
                }
            }
            i3 = 0;
            return (zB ? 1 : 0) | (i2 << 1) | (i3 << 2);
        } finally {
            this.f33756a = false;
        }
    }

    public void g(n3w n3wVar) {
        n3wVar.getClass();
        h(new y5w(n3wVar, (byte) 0));
        this.f33756a = false;
        this.e = new bp00(false);
        h(new umu((byte) 27));
    }

    public void h(Function1 function1) {
        synchronized (((CopyOnWriteArrayList) this.d)) {
            try {
                Iterator it = ((CopyOnWriteArrayList) this.d).iterator();
                it.getClass();
                while (it.hasNext()) {
                    x5w x5wVar = (x5w) it.next();
                    if (!x5wVar.f20939a.f24513a) {
                        function1.invoke(x5wVar);
                    }
                }
                if (!((CopyOnWriteArrayList) this.d).isEmpty()) {
                    w3d.y((CopyOnWriteArrayList) this.d, new umu((byte) 28));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public synchronized void i() {
        try {
            if (this.f33756a) {
                return;
            }
            this.f33756a = true;
            Context context = (Context) this.e;
            if (context != null) {
                ((b23) this.c).b(context);
                context.unregisterComponentCallbacks((qz2) this.d);
            }
            ((WeakReference) this.b).clear();
        } catch (Throwable th) {
            throw th;
        }
    }

    public td9(y7x0 y7x0Var, un00 un00Var) {
        this.f33756a = false;
        y7x0.y().equals(y7x0Var);
        this.b = y7x0Var.r();
        this.c = y7x0Var.s();
        int i = f4x.c;
        Object[] objArr = ycf0.i;
        int iW = y7x0Var.w() + 3;
        e3c.s(iW, "expectedSize");
        zz2 zz2Var = new zz2(iW);
        for (a8x0 a8x0Var : y7x0Var.v()) {
            int iE = a8x0Var.E();
            int i2 = iE - 1;
            if (iE == 0) {
                throw null;
            }
            if (i2 == 0) {
                zz2Var.A(a8x0Var.r(), Long.valueOf(a8x0Var.s()));
            } else if (i2 == 1) {
                zz2Var.A(a8x0Var.r(), Boolean.valueOf(a8x0Var.t()));
            } else if (i2 == 2) {
                zz2Var.A(a8x0Var.r(), Double.valueOf(a8x0Var.u()));
            } else if (i2 == 3) {
                zz2Var.A(a8x0Var.r(), a8x0Var.v());
            } else if (i2 == 4) {
                zz2Var.A(a8x0Var.r(), a8x0Var.w().m());
            }
        }
        zz2Var.A("__phenotype_server_token", y7x0Var.t());
        zz2Var.A("__phenotype_snapshot_token", y7x0Var.r());
        zz2Var.A("__phenotype_configuration_version", Long.valueOf(y7x0Var.u()));
        this.d = zz2Var.e(false);
        this.e = un00Var;
    }

    public td9(fuo fuoVar, androidx.media3.common.b bVar, coq0 coq0Var, jfn0 jfn0Var, boolean z) {
        this.b = fuoVar;
        this.c = bVar;
        this.d = coq0Var;
        this.e = jfn0Var;
        this.f33756a = z;
    }
}
