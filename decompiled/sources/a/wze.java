package a;

import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes.dex */
public final class wze extends w46 {
    public final p7m0 A;
    public final p7m0 B;
    public final p7m0 C;
    public final ol60 D;
    public final p7m0 E;
    public final p7m0 F;
    public final ol60 G;
    public final ol60 H;
    public final p7m0 I;
    public c4m0 J;
    public bby K;
    public final tqc b;
    public final jtj c;
    public final iqi d;
    public final hsj e;
    public final vyt f;
    public final ert g;
    public final hst h;
    public final ctf0 i;
    public final aot j;
    public final iqt k;
    public final lbu l;
    public final pru m;
    public final j9c n;
    public final mne o;
    public final lhf0 p;
    public final bhu q;
    public final ag3 r;
    public final y3j0 s;
    public final i1w0 t;
    public final duj u;
    public final ni9 v;
    public final ppt w;
    public final x20 x;
    public final z7u y;
    public final znt z;

    public wze(lsn lsnVar, k52 k52Var, tqc tqcVar, jtj jtjVar, iqi iqiVar, hsj hsjVar, vyt vytVar, ert ertVar, hst hstVar, ctf0 ctf0Var, aot aotVar, iqt iqtVar, wsc wscVar, lbu lbuVar, pru pruVar, j9c j9cVar, mne mneVar, lhf0 lhf0Var, bhu bhuVar, ag3 ag3Var, y3j0 y3j0Var, i1w0 i1w0Var, duj dujVar, gs gsVar, ni9 ni9Var, ppt pptVar, x20 x20Var, z7u z7uVar, znt zntVar, xre xreVar, reu reuVar) {
        ctf0Var.getClass();
        i1w0Var.getClass();
        this.b = tqcVar;
        this.c = jtjVar;
        this.d = iqiVar;
        this.e = hsjVar;
        this.f = vytVar;
        this.g = ertVar;
        this.h = hstVar;
        this.i = ctf0Var;
        this.j = aotVar;
        this.k = iqtVar;
        this.l = lbuVar;
        this.m = pruVar;
        this.n = j9cVar;
        this.o = mneVar;
        this.p = lhf0Var;
        this.q = bhuVar;
        this.r = ag3Var;
        this.s = y3j0Var;
        this.t = i1w0Var;
        this.u = dujVar;
        this.v = ni9Var;
        this.w = pptVar;
        this.x = x20Var;
        this.y = z7uVar;
        this.z = zntVar;
        byte b = 0;
        this.A = q7m0.a(new sc7(0L, 0.0d, "", null, jtjVar.g(0.0d, false), false, false, pptVar.f27385a.t(), false, false, null, null, null, l0d.f19195a));
        yje yjeVar = null;
        this.B = q7m0.a(new im7("", false, false, null));
        this.C = q7m0.a(lze.f20901a);
        byte b2 = 3;
        this.D = new ol60(3);
        this.E = q7m0.a(Boolean.TRUE);
        this.F = q7m0.a(iun.f15405a);
        this.G = new ol60(3);
        this.H = new ol60(3);
        this.I = q7m0.a(Boolean.FALSE);
        fnq fnqVar = new fnq(vtb.N(xreVar.f41366a.r), new uze(this, yjeVar, (byte) 2), (byte) 4);
        bvc bvcVarA = jiu0.a(this);
        dvj dvjVar = mneVar.b;
        Class<wze> cls = wze.class;
        sac.T(fnqVar, d5c.S(bvcVarA, dvjVar), new d7e(2, this, cls, "handleError", "handleError(Ljava/lang/Throwable;)V", 4, (byte) 13));
        byte b3 = 1;
        sac.T(new fnq(wscVar.f39683a.f11847a.c, new uze(this, yjeVar, b3), (byte) 4), d5c.S(jiu0.a(this), dvjVar), new d7e(2, this, cls, "handleError", "handleError(Ljava/lang/Throwable;)V", 4, (byte) 12));
        int i = 4;
        int i2 = 2;
        sac.T(new fnq(new p6d(((lye) ((khf0) lsnVar.f20589a).b).o, ((lye) ((khf0) reuVar.b).b).q, new tze(b2, yjeVar, b), b3), new uze(this, yjeVar, b), (byte) 4), d5c.S(jiu0.a(this), dvjVar), new d7e(i2, this, cls, "handleError", "handleError(Ljava/lang/Throwable;)V", i, (byte) 11));
        sac.T(new fnq(k52Var.a(), new qo6(this, new hie0(), yjeVar, b3), (byte) 4), d5c.S(jiu0.a(this), dvjVar), new d7e(i2, this, cls, "handleError", "handleError(Ljava/lang/Throwable;)V", i, (byte) 16));
        sac.T(new fnq(new fnq(((ave) gsVar.f11805a.c).o, new oze(this, yjeVar, b3)), new uze(this, yjeVar, b2), (byte) 4), d5c.S(jiu0.a(this), dvjVar), new d7e(2, this, cls, "handleError", "handleError(Ljava/lang/Throwable;)V", 4, (byte) 14));
    }

    public final void A(Throwable th) {
        this.u.b(th, new cnc(this, (byte) 20));
    }

    public final boolean B(double d) {
        return d != 0.0d && q3d.j(q4f.c, q4f.d).contains(this.n.a());
    }

    public final void C(en7 en7Var, boolean z) {
        Object value;
        p7m0 p7m0Var = this.B;
        if (Intrinsics.d(en7Var, ((im7) p7m0Var.getValue()).d)) {
            return;
        }
        en7 en7VarA = en7.a(en7Var, z, 15);
        do {
            value = p7m0Var.getValue();
        } while (!p7m0Var.m(value, im7.a((im7) value, null, false, false, en7VarA, 3)));
        if (z) {
            this.v.b();
        }
        bhu bhuVar = this.q;
        bhuVar.getClass();
        bhuVar.f2626a.X(en7VarA);
    }

    public final void D() {
        if (this.k.f15225a.a()) {
            this.G.f(ize.f15631a);
            return;
        }
        i1w0 i1w0Var = this.t;
        CopyOnWriteArrayList copyOnWriteArrayListQ = b1j.q(i1w0Var);
        c8d c8dVar = new c8d(y7d.f42146a, n0w0.f22721a);
        ListIterator listIterator = cs0.h(copyOnWriteArrayListQ, c8dVar, c8dVar, i1w0Var, copyOnWriteArrayListQ).listIterator(0);
        while (true) {
            paw pawVar = (paw) listIterator;
            if (!pawVar.hasNext()) {
                return;
            } else {
                i1w0Var.a((oe50) pawVar.next());
            }
        }
    }

    public final boolean w() {
        return !q3d.j(q4f.g, q4f.f, q4f.h, q4f.j, q4f.k, q4f.m).contains(this.n.a());
    }

    /* JADX WARN: Code duplicated, block: B:27:0x005e  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0045, code lost:
    
        if (r9 == r1) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0070, code lost:
    
        if (r9 == r1) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0072, code lost:
    
        return r1;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x0070 -> B:30:0x0073). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object x(a.zje r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof a.pze
            if (r0 == 0) goto L13
            r0 = r9
            a.pze r0 = (a.pze) r0
            int r1 = r0.l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.l = r1
            goto L18
        L13:
            a.pze r0 = new a.pze
            r0.<init>(r8, r9)
        L18:
            java.lang.Object r9 = r0.j
            a.wne r1 = a.wne.f39444a
            int r2 = r0.l
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L38
            if (r2 == r5) goto L34
            if (r2 != r4) goto L2d
            java.util.Iterator r2 = r0.i
            a.z1x.P(r9)
            goto L73
        L2d:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            a.jf4.n(r8)
            r8 = 0
            return r8
        L34:
            a.z1x.P(r9)
            goto L48
        L38:
            a.z1x.P(r9)
            r0.l = r5
            a.znt r9 = r8.z
            a.chf0 r9 = r9.f44690a
            java.io.Serializable r9 = r9.p(r0)
            if (r9 != r1) goto L48
            goto L72
        L48:
            java.util.List r9 = (java.util.List) r9
            if (r9 == 0) goto L53
            boolean r2 = r9.isEmpty()
            if (r2 == 0) goto L53
            goto L7c
        L53:
            java.util.Iterator r9 = r9.iterator()
            r2 = r9
        L58:
            boolean r9 = r2.hasNext()
            if (r9 == 0) goto L7c
            java.lang.Object r9 = r2.next()
            a.qu6 r9 = (a.qu6) r9
            long r6 = r9.B
            r0.i = r2
            r0.l = r4
            a.z7u r9 = r8.y
            java.lang.Object r9 = r9.c(r6, r0)
            if (r9 != r1) goto L73
        L72:
            return r1
        L73:
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            if (r9 == 0) goto L58
            r3 = r5
        L7c:
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r3)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: a.wze.x(a.zje):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:32:0x008f  */
    /* JADX WARN: Code duplicated, block: B:33:0x0091  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object y(q4f q4fVar, zje zjeVar) {
        qze qzeVar;
        boolean z;
        if (zjeVar instanceof qze) {
            qzeVar = (qze) zjeVar;
            int i = qzeVar.l;
            if ((i & Integer.MIN_VALUE) != 0) {
                qzeVar.l = i - Integer.MIN_VALUE;
            } else {
                qzeVar = new qze(this, zjeVar);
            }
        } else {
            qzeVar = new qze(this, zjeVar);
        }
        Object objW = qzeVar.j;
        Object obj = wne.f39444a;
        int i2 = qzeVar.l;
        if (i2 == 0) {
            z1x.P(objW);
            qzeVar.i = q4fVar;
            qzeVar.l = 1;
            objW = this.j.f1218a.w(qzeVar);
            if (objW == obj) {
                return obj;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            q4fVar = qzeVar.i;
            z1x.P(objW);
        }
        List list = (List) objW;
        boolean zJ = this.l.j();
        pru pruVar = this.m;
        if (!pruVar.a().f32117a.f12063a.i || zJ) {
            z = false;
        } else if (list == null || !list.isEmpty()) {
            Iterator it = list.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (((ru6) it.next()).h == 707) {
                    }
                } else if (q3d.j(q4f.c, q4f.d).contains(q4fVar)) {
                    z = true;
                }
                z = false;
            }
        } else if (q3d.j(q4f.c, q4f.d).contains(q4fVar)) {
            z = true;
        } else {
            z = false;
        }
        List listZ = tx3.z(new ko7[]{jo7.b, pruVar.a().l.g && !zJ && !q3d.j(q4f.h, q4f.m).contains(q4fVar) ? io7.b : null, z ? ho7.b : null});
        p7m0 p7m0Var = this.F;
        p7m0Var.getClass();
        p7m0Var.o(null, listZ);
        Unit unit = Unit.f46060a;
        this.H.f(unit);
        return unit;
    }

    public final String z() {
        int i;
        int iOrdinal = this.f.a().ordinal();
        if (iOrdinal == 0) {
            i = R.string.to_confirm;
        } else if (iOrdinal == 1) {
            i = R.string.to_any_accept;
        } else {
            if (iOrdinal != 2) {
                t9f.b();
                return null;
            }
            i = R.string.to_up_accept;
        }
        return this.i.f(i, new Object[0]);
    }
}
