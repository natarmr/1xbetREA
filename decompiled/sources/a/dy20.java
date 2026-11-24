package a;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import org.xplatform.market_statistic.api.presentation.MarketStatisticParams;

/* JADX INFO: loaded from: classes5.dex */
public final class dy20 extends w46 {
    public final MarketStatisticParams b;
    public final k7u c;
    public final pru d;
    public final mne e;
    public final i1w0 f;
    public final g2v g;
    public final m1e h;
    public final ctf0 i;
    public final sqt j;
    public final rrd k;
    public final rrd l;
    public final ou9 m;
    public final yiu n;
    public final wti o;
    public final n0o0 p;
    public final a8z q;
    public final a8z r;
    public final p7m0 s;
    public final p7m0 t;
    public List u;
    public List v;
    public c4m0 w;
    public c4m0 x;
    public boolean y;

    public dy20(MarketStatisticParams marketStatisticParams, k7u k7uVar, pru pruVar, mne mneVar, i1w0 i1w0Var, g2v g2vVar, m1e m1eVar, ctf0 ctf0Var, sqt sqtVar, rrd rrdVar, rrd rrdVar2, ou9 ou9Var, yiu yiuVar, wti wtiVar) {
        m1eVar.getClass();
        ctf0Var.getClass();
        this.b = marketStatisticParams;
        this.c = k7uVar;
        this.d = pruVar;
        this.e = mneVar;
        this.f = i1w0Var;
        this.g = g2vVar;
        this.h = m1eVar;
        this.i = ctf0Var;
        this.j = sqtVar;
        this.k = rrdVar;
        this.l = rrdVar2;
        this.m = ou9Var;
        this.n = yiuVar;
        this.o = wtiVar;
        this.p = maz.b(new wx20(this, (byte) 0));
        wx20 wx20Var = new wx20(this, (byte) 1);
        wez wezVar = wez.b;
        this.q = maz.a(wezVar, wx20Var);
        this.r = maz.a(wezVar, new wx20(this, (byte) 2));
        this.s = q7m0.a(tx20.f34678a);
        this.t = q7m0.a(gx20.f12057a);
        iun iunVar = iun.f15405a;
        this.u = iunVar;
        this.v = iunVar;
        this.y = true;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x006d  */
    /* JADX WARN: Code duplicated, block: B:19:0x0075  */
    /* JADX WARN: Code duplicated, block: B:21:0x0097 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:22:0x0098  */
    /* JADX WARN: Code duplicated, block: B:25:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:28:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:30:0x00de  */
    /* JADX WARN: Code duplicated, block: B:33:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:35:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:37:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:39:0x0106  */
    /* JADX WARN: Code duplicated, block: B:42:0x0122  */
    /* JADX WARN: Code duplicated, block: B:43:0x0127  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r24v0, types: [a.dy20] */
    /* JADX WARN: Type inference failed for: r27v2, types: [java.lang.Throwable] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0098 -> B:23:0x009e). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object A(java.util.List r25, java.util.Map r26, a.zje r27) {
        /*
            Method dump skipped, instruction units count: 352
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.dy20.A(java.util.List, java.util.Map, a.zje):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object B(List list, Map map, zje zjeVar) {
        by20 by20Var;
        p7m0 p7m0Var;
        if (zjeVar instanceof by20) {
            by20Var = (by20) zjeVar;
            int i = by20Var.l;
            if ((i & Integer.MIN_VALUE) != 0) {
                by20Var.l = i - Integer.MIN_VALUE;
            } else {
                by20Var = new by20(this, zjeVar);
            }
        } else {
            by20Var = new by20(this, zjeVar);
        }
        Object objX = by20Var.j;
        Object obj = wne.f39444a;
        int i2 = by20Var.l;
        if (i2 == 0) {
            z1x.P(objX);
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : list) {
                Object obj3 = map.get(new Long(((kx20) obj2).f19032a));
                if (obj3 == null) {
                    obj3 = Boolean.TRUE;
                }
                if (((Boolean) obj3).booleanValue()) {
                    arrayList.add(obj2);
                }
            }
            p7m0 p7m0Var2 = this.s;
            by20Var.i = p7m0Var2;
            by20Var.l = 1;
            objX = x(arrayList, by20Var);
            if (objX == obj) {
                return obj;
            }
            p7m0Var = p7m0Var2;
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            p7m0Var = by20Var.i;
            z1x.P(objX);
        }
        p7m0Var.n(objX);
        return Unit.f46060a;
    }

    /* JADX WARN: Code duplicated, block: B:37:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:40:0x010f  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:40:0x010f -> B:41:0x0113). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object C(java.util.List r21, a.zje r22) {
        /*
            Method dump skipped, instruction units count: 355
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.dy20.C(java.util.List, a.zje):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    public final Object w(kx20 kx20Var, zje zjeVar) {
        xx20 xx20Var;
        Object g0g0Var;
        kx20 kx20Var2 = kx20Var;
        if (zjeVar instanceof xx20) {
            xx20Var = (xx20) zjeVar;
            int i = xx20Var.l;
            if ((i & Integer.MIN_VALUE) != 0) {
                xx20Var.l = i - Integer.MIN_VALUE;
            } else {
                xx20Var = new xx20(this, zjeVar);
            }
        } else {
            xx20Var = new xx20(this, zjeVar);
        }
        Object objD0 = xx20Var.j;
        wne wneVar = wne.f39444a;
        int i2 = xx20Var.l;
        boolean z = true;
        boolean z2 = false;
        try {
            if (i2 == 0) {
                z1x.P(objD0);
                e0g0 e0g0Var = j0g0.b;
                wti wtiVar = this.o;
                long j = kx20Var2.f19032a;
                xx20Var.i = kx20Var2;
                xx20Var.l = 1;
                objD0 = qjj.d0(((mne) wtiVar.c).b, new ey((Object) wtiVar, j, (yje) (z2 ? 1 : 0), (byte) 23), xx20Var);
                if (objD0 == wneVar) {
                    return wneVar;
                }
            } else {
                if (i2 != 1) {
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kx20Var2 = xx20Var.i;
                z1x.P(objD0);
            }
            e0g0 e0g0Var2 = j0g0.b;
            g0g0Var = (ueo) objD0;
        } catch (Throwable th) {
            e0g0 e0g0Var3 = j0g0.b;
            g0g0Var = new g0g0(th);
        }
        boolean z3 = g0g0Var instanceof g0g0;
        Object obj = g0g0Var;
        if (z3) {
            obj = null;
        }
        ueo ueoVar = (ueo) obj;
        String str = ueoVar != null ? ueoVar.b : null;
        if (str == null) {
            str = "";
        }
        String str2 = str;
        List list = kx20Var2.d;
        List list2 = kx20Var2.e;
        Integer num = ueoVar != null ? new Integer(ueoVar.c) : null;
        boolean zJ = this.m.f25866a.f15748a.j();
        long j2 = ueoVar != null ? ueoVar.f35538a : 0L;
        nt20 nt20Var = nt20.n;
        n0o0 n0o0Var = this.p;
        boolean z4 = ((sff0) n0o0Var.getValue()).J1;
        if (!this.n.a() && !((sff0) n0o0Var.getValue()).O1) {
            z = false;
        }
        return dii0.a(str2, list, list2, num, zJ, null, null, null, j2, nt20Var, z4, z);
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0060  */
    /* JADX WARN: Code duplicated, block: B:19:0x007c A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:20:0x007d  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x007d -> B:21:0x007e). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object x(java.util.ArrayList r14, a.zje r15) {
        /*
            r13 = this;
            boolean r0 = r15 instanceof a.yx20
            if (r0 == 0) goto L13
            r0 = r15
            a.yx20 r0 = (a.yx20) r0
            int r1 = r0.p
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.p = r1
            goto L18
        L13:
            a.yx20 r0 = new a.yx20
            r0.<init>(r13, r15)
        L18:
            java.lang.Object r15 = r0.n
            a.wne r1 = a.wne.f39444a
            int r2 = r0.p
            r3 = 1
            if (r2 == 0) goto L3c
            if (r2 != r3) goto L35
            java.util.Collection r14 = r0.m
            java.util.Collection r14 = (java.util.Collection) r14
            a.mx20 r2 = r0.l
            a.kx20 r4 = r0.k
            java.util.Iterator r5 = r0.j
            java.util.Collection r6 = r0.i
            java.util.Collection r6 = (java.util.Collection) r6
            a.z1x.P(r15)
            goto L7e
        L35:
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            a.jf4.n(r13)
            r13 = 0
            return r13
        L3c:
            a.z1x.P(r15)
            a.sqt r15 = r13.j
            r15.getClass()
            a.mx20 r15 = a.sqt.e(r14)
            java.util.ArrayList r2 = new java.util.ArrayList
            r4 = 10
            int r4 = a.r3d.q(r14, r4)
            r2.<init>(r4)
            java.util.Iterator r14 = r14.iterator()
            r5 = r14
            r14 = r2
            r2 = r15
        L5a:
            boolean r15 = r5.hasNext()
            if (r15 == 0) goto L98
            java.lang.Object r15 = r5.next()
            r4 = r15
            a.kx20 r4 = (a.kx20) r4
            r15 = r14
            java.util.Collection r15 = (java.util.Collection) r15
            r0.i = r15
            r0.j = r5
            r0.k = r4
            r0.l = r2
            r0.m = r15
            r0.p = r3
            java.lang.Object r15 = r13.w(r4, r0)
            if (r15 != r1) goto L7d
            return r1
        L7d:
            r6 = r14
        L7e:
            r10 = r15
            java.lang.String r10 = (java.lang.String) r10
            r4.getClass()
            r10.getClass()
            int r15 = r4.f19032a
            long r8 = (long) r15
            int r11 = r4.b
            java.util.ArrayList r12 = r4.c
            a.lx20 r7 = new a.lx20
            r7.<init>(r8, r10, r11, r12)
            r14.add(r7)
            r14 = r6
            goto L5a
        L98:
            java.util.List r14 = (java.util.List) r14
            a.k7u r15 = r13.c
            a.uzc r15 = r15.f17841a
            a.jvn r15 = r15.b()
            int r15 = r15.getId()
            org.xplatform.market_statistic.api.presentation.MarketStatisticParams r13 = r13.b
            boolean r13 = r13.b
            a.qx20 r0 = new a.qx20
            r0.<init>(r2, r14, r15, r13)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: a.dy20.x(java.util.ArrayList, a.zje):java.lang.Object");
    }

    public final void y(boolean z) {
        yje yjeVar;
        ltb ltbVarB;
        v3c.N(this.x);
        MarketStatisticParams marketStatisticParams = this.b;
        boolean z2 = marketStatisticParams.b;
        long j = marketStatisticParams.f46776a;
        byte b = 2;
        byte b2 = 0;
        byte b3 = 1;
        TimeUnit timeUnit = TimeUnit.SECONDS;
        yje yjeVar2 = null;
        if (z2) {
            rrd rrdVar = this.k;
            rrdVar.getClass();
            hie0 hie0Var = new hie0();
            hie0Var.f13108a = z;
            yjeVar = null;
            ltbVarB = aoq.b(new fnq(uvw.P(bkb.h0(8L, timeUnit, new ed60(rrdVar, j, yjeVar2, (byte) 1)), new lqu(hie0Var, (byte) 19), 8L, new fd60(rrdVar, j, yjeVar, (byte) 1), null, new cd60(rrdVar, b3), 24), new uwu(hie0Var, yjeVar, (byte) 3), (byte) 4), new eu4(new eu4(new ia60(new i89(((nx20) ((qvt) rrdVar.d).f29403a.b).f24263a.c(), (byte) 22), j, (byte) 1), (byte) 20), (byte) 23));
        } else {
            rrd rrdVar2 = this.l;
            rrdVar2.getClass();
            hie0 hie0Var2 = new hie0();
            hie0Var2.f13108a = z;
            yjeVar = null;
            ltbVarB = aoq.b(new fnq(uvw.P(bkb.h0(30L, timeUnit, new ed60(rrdVar2, j, yjeVar2, (byte) 0)), new lqu(hie0Var2, (byte) 18), 30L, new fd60(rrdVar2, j, yjeVar, (byte) 0), null, new cd60(rrdVar2, b2), 24), new uwu(hie0Var2, yjeVar, b), (byte) 4), new eu4(new eu4(new ia60(new i89(((nx20) ((pvt) rrdVar2.d).f27678a.b).b.c(), (byte) 22), j, (byte) 0), (byte) 19), (byte) 22));
        }
        this.x = sac.T(new fnq(ltbVarB, new mq10((diu0) this, yjeVar, (byte) 13), (byte) 4), d5c.S(jiu0.a(this), this.e.f22085a), new zx20(this, yjeVar, b3));
    }

    public final void z() {
        p7m0 p7m0Var;
        Object value;
        v3c.N(this.x);
        do {
            p7m0Var = this.s;
            value = p7m0Var.getValue();
        } while (!p7m0Var.m(value, new sx20((jkm) this.r.getValue())));
    }
}
