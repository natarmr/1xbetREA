package a;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes4.dex */
public final class rpt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f30901a;

    public rpt(irh irhVar) {
        irhVar.getClass();
        this.f30901a = irhVar;
    }

    public int a() {
        return ((uzc) this.f30901a).b().getId();
    }

    public p6d b() {
        m49 m49Var = ((btr) this.f30901a).f3196a;
        byte b = 1;
        return new p6d(m49Var.f21156a, m49Var.b, new t82(3, null, b), b);
    }

    public cjn c() {
        cjn cjnVar = ((nin) ((ali) this.f30901a).b).f23598a;
        if (cjnVar != null) {
            return cjnVar;
        }
        throw new ss3();
    }

    public gmq d() {
        return i120.W(sj3.S(((hkp) this.f30901a).f13218a.f11455a, 500L));
    }

    public gmq e(xvs xvsVar) {
        return i120.W(new f0o0(abp.d(((m0o0) this.f30901a).b.b), xvsVar, (byte) 1));
    }

    public p7m0 f() {
        return ((o0j) ((kki) this.f30901a).c).b;
    }

    public cit0 g() {
        return (cit0) ((h0f) ((lrc) this.f30901a).b).f12232a.getValue();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Serializable h(int i, yje yjeVar) throws g2 {
        feu feuVar;
        if (yjeVar instanceof feu) {
            feuVar = (feu) yjeVar;
            int i2 = feuVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                feuVar.l = i2 - Integer.MIN_VALUE;
            } else {
                feuVar = new feu(this, yjeVar);
            }
        } else {
            feuVar = new feu(this, yjeVar);
        }
        Object objD = feuVar.j;
        wne wneVar = wne.f39444a;
        int i3 = feuVar.l;
        Object obj = null;
        if (i3 == 0) {
            z1x.P(objD);
            uqe uqeVar = (uqe) this.f30901a;
            feuVar.i = i;
            feuVar.l = 1;
            objD = uqeVar.d(feuVar);
            if (objD == wneVar) {
                return wneVar;
            }
        } else {
            if (i3 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            i = feuVar.i;
            z1x.P(objD);
        }
        for (Object obj2 : (Iterable) objD) {
            if (((qkt) obj2).f28902a == i) {
                obj = obj2;
                break;
            }
        }
        qkt qktVar = (qkt) obj;
        if (qktVar != null) {
            return qktVar;
        }
        throw new g2((byte) 10);
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0016  */
    public Serializable i(String str, String str2, int i, boolean z, zje zjeVar) {
        fdu fduVar;
        if (zjeVar instanceof fdu) {
            fduVar = (fdu) zjeVar;
            int i2 = fduVar.k;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                fduVar.k = i2 - Integer.MIN_VALUE;
            } else {
                fduVar = new fdu(this, zjeVar);
            }
        } else {
            fduVar = new fdu(this, zjeVar);
        }
        fdu fduVar2 = fduVar;
        Object objO = fduVar2.i;
        wne wneVar = wne.f39444a;
        int i3 = fduVar2.k;
        if (i3 == 0) {
            z1x.P(objO);
            nhf0 nhf0Var = (nhf0) this.f30901a;
            fduVar2.k = 1;
            objO = nhf0Var.o(str, str2, i, z, fduVar2);
            if (objO == wneVar) {
                return wneVar;
            }
        } else {
            if (i3 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(objO);
        }
        Pair pair = (Pair) objO;
        Iterable<t0s> iterable = (Iterable) pair.b;
        ArrayList arrayList = new ArrayList(r3d.q(iterable, 10));
        for (t0s t0sVar : iterable) {
            long j = t0sVar.f33135a;
            String str3 = t0sVar.b;
            Iterable iterable2 = (Iterable) pair.f46059a;
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : iterable2) {
                if (axq.y(t0sVar.f33135a, ((mlr) obj).p)) {
                    arrayList2.add(obj);
                }
            }
            long j2 = t0sVar.f33135a;
            arrayList.add(new j8b(j, str3, arrayList2, j2, t0sVar.c, j2));
        }
        return arrayList;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(4:67|24|(1:27)|57) */
    /* JADX WARN: Code duplicated, block: B:27:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:33:0x00e3 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:34:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:35:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:37:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:38:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:41:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:45:0x0117  */
    /* JADX WARN: Code duplicated, block: B:46:0x011e  */
    /* JADX WARN: Code duplicated, block: B:47:0x0120  */
    /* JADX WARN: Code duplicated, block: B:49:0x0126  */
    /* JADX WARN: Code duplicated, block: B:51:0x012d  */
    /* JADX WARN: Code duplicated, block: B:52:0x012f  */
    /* JADX WARN: Code duplicated, block: B:55:0x0134  */
    /* JADX WARN: Code duplicated, block: B:59:0x0151  */
    /* JADX WARN: Code duplicated, block: B:60:0x015a  */
    /* JADX WARN: Code duplicated, block: B:61:0x0164 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:62:0x0166  */
    /* JADX WARN: Code duplicated, block: B:64:0x016c  */
    /* JADX WARN: Code duplicated, block: B:67:0x00b1 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00dc, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x014b, code lost:
    
        if (a.qcc.P(r10, r5) == r3) goto L57;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x00e5 -> B:23:0x00af). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:56:0x014b -> B:58:0x014e). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:59:0x0151 -> B:58:0x014e). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:60:0x015a -> B:44:0x0115). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object j(int r20, int r21, a.zje r22) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 365
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.rpt.j(int, int, a.zje):java.lang.Object");
    }

    public String k() {
        String string = ((us3) ((peg0) this.f30901a).b).f36191a.getString(R.string.app_name);
        string.getClass();
        return string;
    }

    public List l(boolean z) {
        ir30 ir30Var = (ir30) ((f8p) ((wdu) this.f30901a).j).f9118a.get(z ? j8p.b : j8p.f16096a);
        if (ir30Var != null) {
            return (List) ir30Var.b();
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x006d, code lost:
    
        if (r9 == r1) goto L27;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object m(int r7, a.epe r8, a.zje r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof a.o2u
            if (r0 == 0) goto L13
            r0 = r9
            a.o2u r0 = (a.o2u) r0
            int r1 = r0.n
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.n = r1
            goto L18
        L13:
            a.o2u r0 = new a.o2u
            r0.<init>(r6, r9)
        L18:
            java.lang.Object r9 = r0.l
            a.wne r1 = a.wne.f39444a
            int r2 = r0.n
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L3b
            if (r2 == r5) goto L31
            if (r2 != r4) goto L2b
            a.z1x.P(r9)     // Catch: java.lang.Throwable -> L81
            goto L70
        L2b:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            a.jf4.n(r6)
            return r3
        L31:
            int r7 = r0.i
            a.rpt r6 = r0.k
            a.epe r8 = r0.j
            a.z1x.P(r9)     // Catch: java.lang.Throwable -> L81
            goto L53
        L3b:
            a.z1x.P(r9)
            a.e0g0 r9 = a.j0g0.b     // Catch: java.lang.Throwable -> L81
            java.lang.Object r9 = r6.f30901a     // Catch: java.lang.Throwable -> L81
            a.dzg r9 = (a.dzg) r9     // Catch: java.lang.Throwable -> L81
            r0.j = r8     // Catch: java.lang.Throwable -> L81
            r0.k = r6     // Catch: java.lang.Throwable -> L81
            r0.i = r7     // Catch: java.lang.Throwable -> L81
            r0.n = r5     // Catch: java.lang.Throwable -> L81
            java.lang.Object r9 = r9.d(r7, r8, r0)     // Catch: java.lang.Throwable -> L81
            if (r9 != r1) goto L53
            goto L6f
        L53:
            java.util.Collection r9 = (java.util.Collection) r9     // Catch: java.lang.Throwable -> L81
            boolean r2 = r9.isEmpty()     // Catch: java.lang.Throwable -> L81
            if (r2 == 0) goto L7c
            java.lang.Object r6 = r6.f30901a     // Catch: java.lang.Throwable -> L81
            a.dzg r6 = (a.dzg) r6     // Catch: java.lang.Throwable -> L81
            int r9 = r7 + (-1)
            r0.j = r3     // Catch: java.lang.Throwable -> L81
            r0.k = r3     // Catch: java.lang.Throwable -> L81
            r0.i = r7     // Catch: java.lang.Throwable -> L81
            r0.n = r4     // Catch: java.lang.Throwable -> L81
            java.lang.Object r9 = r6.d(r9, r8, r0)     // Catch: java.lang.Throwable -> L81
            if (r9 != r1) goto L70
        L6f:
            return r1
        L70:
            java.lang.Iterable r9 = (java.lang.Iterable) r9     // Catch: java.lang.Throwable -> L81
            a.vvt r6 = new a.vvt     // Catch: java.lang.Throwable -> L81
            r7 = 7
            r6.<init>(r7)     // Catch: java.lang.Throwable -> L81
            java.util.List r9 = kotlin.collections.CollectionsKt.A0(r9, r6)     // Catch: java.lang.Throwable -> L81
        L7c:
            java.util.List r9 = (java.util.List) r9     // Catch: java.lang.Throwable -> L81
            a.e0g0 r6 = a.j0g0.b     // Catch: java.lang.Throwable -> L81
            return r9
        L81:
            r6 = move-exception
            a.e0g0 r7 = a.j0g0.b
            a.g0g0 r7 = new a.g0g0
            r7.<init>(r6)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: a.rpt.m(int, a.epe, a.zje):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object n(long j, zje zjeVar, String str) {
        xvt xvtVar;
        if (zjeVar instanceof xvt) {
            xvtVar = (xvt) zjeVar;
            int i = xvtVar.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                xvtVar.k = i - Integer.MIN_VALUE;
            } else {
                xvtVar = new xvt(this, zjeVar);
            }
        } else {
            xvtVar = new xvt(this, zjeVar);
        }
        Object obj = xvtVar.i;
        wne wneVar = wne.f39444a;
        int i2 = xvtVar.k;
        if (i2 != 0) {
            if (i2 == 1) {
                z1x.P(obj);
                return ((j0g0) obj).f15681a;
            }
            jf4.n("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        z1x.P(obj);
        if (str == null || str.length() == 0) {
            e0g0 e0g0Var = j0g0.b;
            return new g0g0(new ff5(null));
        }
        khf0 khf0Var = (khf0) this.f30901a;
        xvtVar.k = 1;
        Object objV = khf0Var.v(j, xvtVar, str);
        return objV == wneVar ? wneVar : objV;
    }

    public /* synthetic */ rpt(Object obj) {
        this.f30901a = obj;
    }

    public rpt(zfo zfoVar) {
        zfoVar.getClass();
        this.f30901a = zfoVar;
    }

    public rpt(hkp hkpVar) {
        hkpVar.getClass();
        this.f30901a = hkpVar;
    }

    public rpt(btr btrVar) {
        btrVar.getClass();
        this.f30901a = btrVar;
    }

    public rpt(tdl0 tdl0Var) {
        tdl0Var.getClass();
        this.f30901a = tdl0Var;
    }
}
