package a;

import android.javax.sip.message.Response;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.List;
import kotlin.Unit;
import org.xbet.client1.R;
import org.xplatform.cyber.calendar.api.CyberCalendarParams;

/* JADX INFO: loaded from: classes3.dex */
public final class hbg extends w3k {
    public final tag c;
    public final m1e d;
    public final mne e;
    public final g2v f;
    public final nmo g;
    public final g2v h;
    public final fhj i;
    public final z1u j;
    public final CyberCalendarParams k;
    public final duj l;
    public final uoc m;
    public final poq0 n;
    public final ctf0 o;
    public final pru p;
    public final List q;
    public final ArrayList r;
    public final p7m0 s;
    public final p7m0 t;
    public final p7m0 u;
    public final ol60 v;
    public c4m0 w;
    public bby x;
    public bby y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hbg(vzg0 vzg0Var, tag tagVar, m1e m1eVar, mne mneVar, g2v g2vVar, nmo nmoVar, g2v g2vVar2, fhj fhjVar, z1u z1uVar, CyberCalendarParams cyberCalendarParams, duj dujVar, uoc uocVar, poq0 poq0Var, ctf0 ctf0Var, pru pruVar) {
        super(vzg0Var, kotlin.collections.a.c(tagVar));
        m1eVar.getClass();
        ctf0Var.getClass();
        this.c = tagVar;
        this.d = m1eVar;
        this.e = mneVar;
        this.f = g2vVar;
        this.g = nmoVar;
        this.h = g2vVar2;
        this.i = fhjVar;
        this.j = z1uVar;
        this.k = cyberCalendarParams;
        this.l = dujVar;
        this.m = uocVar;
        this.n = poq0Var;
        this.o = ctf0Var;
        this.p = pruVar;
        List<lwh0> listJ = q3d.j(new lwh0(yag.f42295a, R.string.day), new lwh0(yag.b, R.string.three_day), new lwh0(yag.c, R.string.week), new lwh0(yag.d, R.string.one_month));
        this.q = listJ;
        ArrayList arrayList = new ArrayList(r3d.q(listJ, 10));
        for (lwh0 lwh0Var : listJ) {
            ctf0 ctf0Var2 = this.o;
            arrayList.add(new vl9(ctf0Var2.b.a(lwh0Var.b, Arrays.copyOf(new Object[0], 0)), (yag) lwh0Var.f20764a));
        }
        this.r = arrayList;
        this.s = q7m0.a(new wl9(iun.f15405a, ucx.X(this.p.a()), 0, false));
        this.t = q7m0.a(Unit.f46060a);
        this.u = q7m0.a(w9g.f38778a);
        this.v = new ol60(1, i99.b);
    }

    public final void A() {
        v9g v9gVar = new v9g(g2v.b(this.f, this.k.d ? pb10.r : ozb.J(-1L, pb10.v), null, null, 0, 0, R.string.data_retrieval_error, 0, R.string.try_again_text, 10000L, 0L, Response.SESSION_NOT_ACCEPTABLE));
        p7m0 p7m0Var = this.u;
        p7m0Var.getClass();
        p7m0Var.o(null, v9gVar);
    }

    public final void B() {
        v3c.N(this.w);
        yje yjeVar = null;
        this.w = slb.U(new dnq(new fnq(this.d.b(), new fbg(this, yjeVar, (byte) 0), (byte) 4), new rj((Object) this, yjeVar, (byte) 15), (byte) 1), d5c.S(jiu0.a(this), this.e.f22085a));
    }

    public final void C(int i) {
        p7m0 p7m0Var;
        Object value;
        do {
            p7m0Var = this.s;
            value = p7m0Var.getValue();
        } while (!p7m0Var.m(value, wl9.a((wl9) value, null, i, 11)));
    }

    /* JADX WARN: Code duplicated, block: B:100:0x01ac A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:39:0x0115  */
    /* JADX WARN: Code duplicated, block: B:41:0x0118  */
    /* JADX WARN: Code duplicated, block: B:44:0x011f  */
    /* JADX WARN: Code duplicated, block: B:47:0x0129  */
    /* JADX WARN: Code duplicated, block: B:50:0x014e  */
    /* JADX WARN: Code duplicated, block: B:52:0x0154 A[PHI: r7
  0x0154: PHI (r7v3 java.util.ArrayList) = (r7v0 java.util.ArrayList), (r7v1 java.util.ArrayList) binds: [B:51:0x0152, B:99:0x0154] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:53:0x0157  */
    /* JADX WARN: Code duplicated, block: B:56:0x0161  */
    /* JADX WARN: Code duplicated, block: B:59:0x01af A[LOOP:4: B:54:0x015b->B:59:0x01af, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:63:0x01bc  */
    /* JADX WARN: Code duplicated, block: B:66:0x01c6  */
    /* JADX WARN: Code duplicated, block: B:72:0x0201 A[PHI: r1 r4 r17 r23
  0x0201: PHI (r1v21 ??) = (r1v17 ??), (r1v27 ??) binds: [B:70:0x01fe, B:17:0x0046] A[DONT_GENERATE, DONT_INLINE]
  0x0201: PHI (r4v13 java.lang.Object) = (r4v12 java.lang.Object), (r4v23 java.lang.Object) binds: [B:70:0x01fe, B:17:0x0046] A[DONT_GENERATE, DONT_INLINE]
  0x0201: PHI (r17v5 java.util.ArrayList) = (r17v3 java.util.ArrayList), (r17v10 java.util.ArrayList) binds: [B:70:0x01fe, B:17:0x0046] A[DONT_GENERATE, DONT_INLINE]
  0x0201: PHI (r23v3 a.p7m0) = (r23v2 a.p7m0), (r23v10 a.p7m0) binds: [B:70:0x01fe, B:17:0x0046] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:78:0x0222  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code duplicated, block: B:80:0x0228  */
    /* JADX WARN: Code duplicated, block: B:83:0x023f A[LOOP:1: B:81:0x0239->B:83:0x023f, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:89:0x0261 A[LOOP:0: B:76:0x0217->B:89:0x0261, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:90:0x025e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:93:0x0148 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:94:0x014e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:95:? A[LOOP:2: B:45:0x0123->B:95:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:96:0x01ed A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:97:0x01ea A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:98:? A[LOOP:3: B:64:0x01c0->B:98:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:99:0x0154 A[SYNTHETIC] */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0212, code lost:
    
        if (r24.j.a((a.c5g) r4, r2) == r3) goto L74;
     */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v21, types: [a.c5g, java.util.Calendar, java.util.List] */
    /* JADX WARN: Type inference failed for: r1v27 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object D(java.util.List r25, a.zje r26) {
        /*
            Method dump skipped, instruction units count: 614
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.hbg.D(java.util.List, a.zje):java.lang.Object");
    }

    @Override // a.w3k, a.diu0
    public final void v() {
        dvj dvjVar = this.e.b;
        kin0 kin0VarE = qem0.e();
        dvjVar.getClass();
        sac.V(d5c.a(kotlin.coroutines.e.c(dvjVar, kin0VarE)), new vlf((byte) 16), null, null, new fbg(this, null, (byte) 2), 14);
        super.v();
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0067 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object w(List list, c5g c5gVar, Calendar calendar, zje zjeVar) {
        bbg bbgVar;
        c5g c5gVar2;
        c5g c5gVar3;
        if (zjeVar instanceof bbg) {
            bbgVar = (bbg) zjeVar;
            int i = bbgVar.n;
            if ((i & Integer.MIN_VALUE) != 0) {
                bbgVar.n = i - Integer.MIN_VALUE;
            } else {
                bbgVar = new bbg(this, zjeVar);
            }
        } else {
            bbgVar = new bbg(this, zjeVar);
        }
        Object objX = bbgVar.l;
        Object obj = wne.f39444a;
        int i2 = bbgVar.n;
        if (i2 == 0) {
            z1x.P(objX);
            bbgVar.i = list;
            bbgVar.j = c5gVar;
            bbgVar.k = calendar;
            bbgVar.n = 1;
            objX = x(list, c5gVar, calendar, bbgVar);
            if (objX != obj) {
            }
            return obj;
        }
        if (i2 == 1) {
            calendar = bbgVar.k;
            c5gVar = bbgVar.j;
            list = bbgVar.i;
            z1x.P(objX);
        } else {
            if (i2 != 2) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            c5gVar3 = bbgVar.j;
            z1x.P(objX);
        }
        c5gVar2 = (c5g) objX;
        if (c5gVar2 == null) {
            return c5gVar3;
        }
        return c5gVar2;
        c5gVar2 = (c5g) objX;
        if (c5gVar2 == null) {
            bbgVar.i = null;
            bbgVar.j = c5gVar;
            bbgVar.k = null;
            bbgVar.n = 2;
            objX = y(list, c5gVar, calendar, bbgVar);
            if (objX != obj) {
                c5gVar3 = c5gVar;
                c5gVar2 = (c5g) objX;
                if (c5gVar2 == null) {
                    return c5gVar3;
                }
            }
            return obj;
        }
        return c5gVar2;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x005e  */
    /* JADX WARN: Code duplicated, block: B:26:0x007a  */
    /* JADX WARN: Code duplicated, block: B:28:0x008b  */
    /* JADX WARN: Code duplicated, block: B:35:0x00a8 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:36:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:42:0x009a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:45:? A[LOOP:0: B:21:0x0058->B:45:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:47:0x0090 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:36:0x00a9 -> B:37:0x00ac). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object x(java.util.List r12, a.c5g r13, java.util.Calendar r14, a.zje r15) {
        /*
            r11 = this;
            boolean r0 = r15 instanceof a.cbg
            if (r0 == 0) goto L13
            r0 = r15
            a.cbg r0 = (a.cbg) r0
            int r1 = r0.n
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.n = r1
            goto L18
        L13:
            a.cbg r0 = new a.cbg
            r0.<init>(r11, r15)
        L18:
            java.lang.Object r15 = r0.l
            a.wne r1 = a.wne.f39444a
            int r2 = r0.n
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2f
            java.util.Iterator r12 = r0.k
            java.util.Calendar r13 = r0.j
            a.c5g r14 = r0.i
            a.z1x.P(r15)
            goto Lac
        L2f:
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            a.jf4.n(r11)
            return r4
        L35:
            java.util.ArrayList r15 = a.twn.t(r15)
            java.util.Iterator r12 = r12.iterator()
        L3d:
            boolean r2 = r12.hasNext()
            if (r2 == 0) goto L54
            java.lang.Object r2 = r12.next()
            r5 = r2
            a.d5g r5 = (a.d5g) r5
            int r5 = r5.f5503a
            int r6 = r13.f3770a
            if (r5 < r6) goto L3d
            r15.add(r2)
            goto L3d
        L54:
            java.util.Iterator r12 = r15.iterator()
        L58:
            boolean r15 = r12.hasNext()
            if (r15 == 0) goto Lb5
            java.lang.Object r15 = r12.next()
            a.d5g r15 = (a.d5g) r15
            int r2 = r15.f5503a
            r14.set(r3, r2)
            java.util.List r2 = r15.b
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.Iterator r2 = r2.iterator()
        L74:
            boolean r6 = r2.hasNext()
            if (r6 == 0) goto L94
            java.lang.Object r6 = r2.next()
            r7 = r6
            java.lang.Number r7 = (java.lang.Number) r7
            int r7 = r7.intValue()
            int r8 = r15.f5503a
            int r9 = r13.f3770a
            if (r8 != r9) goto L90
            int r8 = r13.b
            int r8 = r8 + r3
            if (r7 < r8) goto L74
        L90:
            r5.add(r6)
            goto L74
        L94:
            boolean r15 = r5.isEmpty()
            if (r15 != 0) goto L58
            r0.i = r13
            r0.j = r14
            r0.k = r12
            r0.n = r3
            java.lang.Object r15 = r11.z(r5, r14, r0)
            if (r15 != r1) goto La9
            return r1
        La9:
            r10 = r14
            r14 = r13
            r13 = r10
        Lac:
            a.c5g r15 = (a.c5g) r15
            if (r15 == 0) goto Lb1
            return r15
        Lb1:
            r10 = r14
            r14 = r13
            r13 = r10
            goto L58
        Lb5:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: a.hbg.x(java.util.List, a.c5g, java.util.Calendar, a.zje):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0062  */
    /* JADX WARN: Code duplicated, block: B:26:0x007e  */
    /* JADX WARN: Code duplicated, block: B:28:0x008f  */
    /* JADX WARN: Code duplicated, block: B:35:0x00af A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:36:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:42:0x00a1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:45:? A[LOOP:0: B:21:0x005c->B:45:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:47:0x0093 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:36:0x00b0 -> B:37:0x00b3). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object y(java.util.List r12, a.c5g r13, java.util.Calendar r14, a.zje r15) {
        /*
            r11 = this;
            boolean r0 = r15 instanceof a.dbg
            if (r0 == 0) goto L13
            r0 = r15
            a.dbg r0 = (a.dbg) r0
            int r1 = r0.n
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.n = r1
            goto L18
        L13:
            a.dbg r0 = new a.dbg
            r0.<init>(r11, r15)
        L18:
            java.lang.Object r15 = r0.l
            a.wne r1 = a.wne.f39444a
            int r2 = r0.n
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2f
            java.util.Iterator r12 = r0.k
            java.util.Calendar r13 = r0.j
            a.c5g r14 = r0.i
            a.z1x.P(r15)
            goto Lb3
        L2f:
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            a.jf4.n(r11)
            return r4
        L35:
            java.util.ArrayList r15 = a.twn.t(r15)
            java.util.Iterator r12 = r12.iterator()
        L3d:
            boolean r2 = r12.hasNext()
            if (r2 == 0) goto L54
            java.lang.Object r2 = r12.next()
            r5 = r2
            a.d5g r5 = (a.d5g) r5
            int r5 = r5.f5503a
            int r6 = r13.f3770a
            if (r5 > r6) goto L3d
            r15.add(r2)
            goto L3d
        L54:
            java.util.List r12 = kotlin.collections.CollectionsKt.t0(r15)
            java.util.Iterator r12 = r12.iterator()
        L5c:
            boolean r15 = r12.hasNext()
            if (r15 == 0) goto Lbc
            java.lang.Object r15 = r12.next()
            a.d5g r15 = (a.d5g) r15
            int r2 = r15.f5503a
            r14.set(r3, r2)
            java.util.List r2 = r15.b
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.Iterator r2 = r2.iterator()
        L78:
            boolean r6 = r2.hasNext()
            if (r6 == 0) goto L97
            java.lang.Object r6 = r2.next()
            r7 = r6
            java.lang.Number r7 = (java.lang.Number) r7
            int r7 = r7.intValue()
            int r8 = r15.f5503a
            int r9 = r13.f3770a
            if (r8 != r9) goto L93
            int r8 = r13.b
            if (r7 > r8) goto L78
        L93:
            r5.add(r6)
            goto L78
        L97:
            java.util.List r15 = kotlin.collections.CollectionsKt.t0(r5)
            boolean r2 = r15.isEmpty()
            if (r2 != 0) goto L5c
            r0.i = r13
            r0.j = r14
            r0.k = r12
            r0.n = r3
            java.lang.Object r15 = r11.z(r15, r14, r0)
            if (r15 != r1) goto Lb0
            return r1
        Lb0:
            r10 = r14
            r14 = r13
            r13 = r10
        Lb3:
            a.c5g r15 = (a.c5g) r15
            if (r15 == 0) goto Lb8
            return r15
        Lb8:
            r10 = r14
            r14 = r13
            r13 = r10
            goto L5c
        Lbc:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: a.hbg.y(java.util.List, a.c5g, java.util.Calendar, a.zje):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0065  */
    /* JADX WARN: Code duplicated, block: B:23:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:27:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:30:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:33:0x00de A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:34:0x00df  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x00ce -> B:28:0x00d2). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object z(java.util.List r19, java.util.Calendar r20, a.zje r21) {
        /*
            Method dump skipped, instruction units count: 227
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.hbg.z(java.util.List, java.util.Calendar, a.zje):java.lang.Object");
    }
}
