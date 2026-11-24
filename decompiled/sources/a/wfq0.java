package a;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.ranges.IntRange;

/* JADX INFO: loaded from: classes6.dex */
public final class wfq0 extends w46 {
    public final xcc b;
    public final s7t0 c;
    public final uii d;
    public final fpi0 e;
    public final i5m0 f;
    public final pzu g;
    public final fq h;
    public final svu i;
    public final ouu j;
    public final jru k;
    public final jtj l;
    public final spx m;
    public final vcu n;
    public final jw20 o;
    public final hru p;
    public final mne q;
    public final y5s r;
    public final ax5 s;
    public bby t;
    public bby u;
    public bby v;
    public final p7m0 w;
    public final p7m0 x;
    public final p7m0 y;
    public final p7m0 z;

    public wfq0(i1w0 i1w0Var, qa60 qa60Var, xcc xccVar, s7t0 s7t0Var, uii uiiVar, fpi0 fpi0Var, i5m0 i5m0Var, pzu pzuVar, fq fqVar, svu svuVar, ouu ouuVar, jru jruVar, jtj jtjVar, spx spxVar, vcu vcuVar, jw20 jw20Var, hru hruVar, mne mneVar, y5s y5sVar) {
        i1w0Var.getClass();
        qa60Var.getClass();
        xccVar.getClass();
        s7t0Var.getClass();
        fpi0Var.getClass();
        i5m0Var.getClass();
        fqVar.getClass();
        spxVar.getClass();
        vcuVar.getClass();
        y5sVar.getClass();
        this.b = xccVar;
        this.c = s7t0Var;
        this.d = uiiVar;
        this.e = fpi0Var;
        this.f = i5m0Var;
        this.g = pzuVar;
        this.h = fqVar;
        this.i = svuVar;
        this.j = ouuVar;
        this.k = jruVar;
        this.l = jtjVar;
        this.m = spxVar;
        this.n = vcuVar;
        this.o = jw20Var;
        this.p = hruVar;
        this.q = mneVar;
        this.r = y5sVar;
        this.s = new ax5(this);
        this.w = q7m0.a(pfq0.f26917a);
        this.x = q7m0.a(cfq0.f4276a);
        this.y = q7m0.a(jfq0.f16441a);
        this.z = q7m0.a(ffq0.f9459a);
        slb.U(new dnq(new fnq(qa60Var.a(), new bdl0(2, this, wfq0.class, "handleCommand", "handleCommand(Lorg/xplatform/core/domain/GameCommand;)V", 4, (byte) 16), (byte) 4), new ib60(this, null, (byte) 15), (byte) 1), jiu0.a(this));
    }

    public final void A() {
        sac.V(jiu0.a(this), new w6q0(1, this, wfq0.class, "handleGameError", "handleGameError(Ljava/lang/Throwable;)V", 0, (byte) 8), new h3q0((Object) this, (byte) 13), this.q.b, new meq0((Object) this, (yje) null, (byte) 3), 8);
    }

    public final void B() {
        x();
        kgq0 kgq0Var = (kgq0) this.o.b;
        beq0 beq0Var = kgq0Var.c;
        xeq0 xeq0Var = beq0Var.f2464a.b;
        List list = xeq0Var.e;
        List list2 = xeq0Var.d;
        List list3 = xeq0Var.c;
        if (!list3.isEmpty() || !list2.isEmpty() || !list.isEmpty()) {
            iun iunVar = iun.f15405a;
            kgq0Var.f(new xfq0(0, new xeq0(iunVar, iunVar, iunVar, iunVar, iunVar), yeq0.e, csr.e, 0L, 0.0d, 0.0d, 0.0d));
            List list4 = xeq0Var.f40755a;
            list4.getClass();
            beq0Var.getClass();
            beq0Var.f2464a.b.f40755a = list4;
            kgq0Var.e(xeq0Var.b);
        }
        if (list3.isEmpty() && list2.isEmpty() && list.isEmpty() && xeq0Var.f40755a.isEmpty()) {
            ArrayList arrayList = new ArrayList();
            lgq0[] lgq0VarArrValues = lgq0.values();
            Iterator it = l1e0.o(0, 5).iterator();
            while (((kkx) it).c) {
                int iNextInt = ((bkx) it).nextInt();
                Iterator it2 = l1e0.o(0, 5).iterator();
                while (((kkx) it2).c) {
                    int iNextInt2 = ((bkx) it2).nextInt();
                    lgq0VarArrValues.getClass();
                    arrayList.add(new xdq0(lgq0VarArrValues[l1e0.j(new IntRange(0, lgq0VarArrValues.length - 1, 1), f1e0.f8761a)], iNextInt, iNextInt2));
                }
            }
            beq0Var.getClass();
            beq0Var.f2464a.b.f40755a = arrayList;
        }
        xeq0 xeq0Var2 = ((kgq0) this.i.f32888a).c.f2464a.b;
        nfq0 nfq0Var = new nfq0(xeq0Var2.f40755a);
        p7m0 p7m0Var = this.y;
        p7m0Var.getClass();
        p7m0Var.o(null, nfq0Var);
        w(xeq0Var2.b);
        qfq0 qfq0Var = new qfq0(true);
        p7m0 p7m0Var2 = this.w;
        p7m0Var2.getClass();
        p7m0Var2.o(null, qfq0Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [a.iun] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v1, types: [a.iun] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v1, types: [a.iun] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.util.ArrayList] */
    public final void w(List list) {
        ?? arrayList;
        ?? arrayList2;
        ?? arrayList3;
        if (list.isEmpty()) {
            arrayList = iun.f15405a;
        } else {
            arrayList = new ArrayList(r3d.q(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(Integer.valueOf(((aeq0) it.next()).c));
            }
        }
        if (list.isEmpty()) {
            arrayList2 = iun.f15405a;
        } else {
            arrayList2 = new ArrayList(r3d.q(list, 10));
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                arrayList2.add(Double.valueOf(((aeq0) it2.next()).b));
            }
        }
        if (list.isEmpty()) {
            arrayList3 = iun.f15405a;
        } else {
            arrayList3 = new ArrayList(r3d.q(list, 10));
            Iterator it3 = list.iterator();
            while (it3.hasNext()) {
                arrayList3.add(Integer.valueOf(((aeq0) it3.next()).d));
            }
        }
        afq0 afq0Var = new afq0(arrayList2, arrayList, arrayList3);
        p7m0 p7m0Var = this.x;
        p7m0Var.getClass();
        p7m0Var.o(null, afq0Var);
    }

    public final void x() {
        p7m0 p7m0Var = this.x;
        p7m0Var.getClass();
        p7m0Var.o(null, cfq0.f4276a);
        p7m0 p7m0Var2 = this.w;
        p7m0Var2.getClass();
        p7m0Var2.o(null, pfq0.f26917a);
        p7m0 p7m0Var3 = this.y;
        p7m0Var3.getClass();
        p7m0Var3.o(null, jfq0.f16441a);
        p7m0 p7m0Var4 = this.z;
        p7m0Var4.getClass();
        p7m0Var4.o(null, ffq0.f9459a);
    }

    public final void y() {
        x();
        xeq0 xeq0Var = ((kgq0) this.i.f32888a).c.f2464a.b;
        w(xeq0Var.b);
        sac.V(jiu0.a(this), sfq0.f32129a, null, this.q.f22085a, new meq0((Object) this, (Object) cy5.f5155a, (yje) null, (byte) 1), 10);
        mfq0 mfq0Var = new mfq0(xeq0Var.f40755a, xeq0Var.c);
        p7m0 p7m0Var = this.y;
        p7m0Var.getClass();
        p7m0Var.o(null, mfq0Var);
        qfq0 qfq0Var = new qfq0(false);
        p7m0 p7m0Var2 = this.w;
        p7m0Var2.getClass();
        p7m0Var2.o(null, qfq0Var);
        gfq0 gfq0Var = new gfq0(true);
        p7m0 p7m0Var3 = this.z;
        p7m0Var3.getClass();
        p7m0Var3.o(null, gfq0Var);
    }

    public final void z(Throwable th) {
        sac.V(jiu0.a(this), ufq0.f35587a, null, this.q.f22085a, new meq0((Object) this, (Object) th, (yje) null, (byte) 2), 10);
    }
}
