package a;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import org.xbet.client1.R;
import org.xplatform.feed.topgamesbystat.presentation.params.TopGamesByStatBottomSheetScreenParams;

/* JADX INFO: loaded from: classes4.dex */
public final class m5r0 extends i3t0 {
    public static final /* synthetic */ int E = 0;
    public final ag3 A;
    public final ctf0 B;
    public c4m0 C;
    public c4m0 D;
    public final TopGamesByStatBottomSheetScreenParams o;
    public final daf p;
    public final hjd q;
    public final pru r;
    public final lbu s;
    public final r9u t;
    public final j3c u;
    public final luu v;
    public final y78 w;
    public final m1e x;
    public final mne y;
    public final au0 z;

    public m5r0(vzg0 vzg0Var, TopGamesByStatBottomSheetScreenParams topGamesByStatBottomSheetScreenParams, daf dafVar, ani0 ani0Var, hjd hjdVar, pru pruVar, lbu lbuVar, r9u r9uVar, j3c j3cVar, luu luuVar, y78 y78Var, m1e m1eVar, mne mneVar, au0 au0Var, ag3 ag3Var, g2v g2vVar, ctf0 ctf0Var) {
        Object next;
        Object obj;
        r9uVar.getClass();
        m1eVar.getClass();
        ctf0Var.getClass();
        rib ribVar = new rib(g2vVar, (byte) 7);
        h0j0 h0j0Var = new h0j0(ctf0Var, (byte) 19);
        rwj rwjVar = mneVar.f22085a;
        super(vzg0Var, ribVar, h0j0Var, cvm0.p(rwjVar, rwjVar));
        this.o = topGamesByStatBottomSheetScreenParams;
        this.p = dafVar;
        this.q = hjdVar;
        this.r = pruVar;
        this.s = lbuVar;
        this.t = r9uVar;
        this.u = j3cVar;
        this.v = luuVar;
        this.w = y78Var;
        this.x = m1eVar;
        this.y = mneVar;
        this.z = au0Var;
        this.A = ag3Var;
        this.B = ctf0Var;
        i3t0.K(this, null, null, new hhb0(this, null, (byte) 26), 3);
        ((s5r0) ((h0q0) ani0Var.f1155a).b).c.o(null, Boolean.TRUE);
        i3t0.K(this, null, null, new j5r0(this, null), 3);
        i3t0.F(this, hjdVar, mneVar.f22085a, null, new shq0((byte) 14), 118);
        long j = topGamesByStatBottomSheetScreenParams.c;
        long j2 = topGamesByStatBottomSheetScreenParams.d;
        long j3 = topGamesByStatBottomSheetScreenParams.e;
        g9m0 g9m0Var = p5r0.b;
        String str = topGamesByStatBottomSheetScreenParams.f;
        g9m0Var.getClass();
        str.getClass();
        Iterator it = p5r0.e.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!((p5r0) next).f26419a.equals(str));
        p5r0 p5r0Var = (p5r0) next;
        p5r0Var = p5r0Var == null ? p5r0.POPULAR_SPORT : p5r0Var;
        long j4 = (j2 != 40 || j3 == 0) ? 0L : j3;
        s1p s1pVar = au0Var.f1455a;
        yni0 yni0Var = new yni0();
        yni0Var.add(new i1p((byte) 2, j));
        yni0Var.add(new i1p((byte) 0, j2));
        if (j4 > 0) {
            yni0Var.add(new i1p((byte) 1, j4));
        }
        yni0Var.add(new j1p(p5r0Var.f26419a, (byte) 0));
        s1pVar.a(cui0.a(yni0Var), 12737L);
        ag3 ag3Var2 = this.A;
        v5r0.b.getClass();
        Iterator it2 = v5r0.m.iterator();
        while (true) {
            if (!it2.hasNext()) {
                obj = null;
                break;
            }
            Object next2 = it2.next();
            if (((v5r0) next2).f36839a.equals(str)) {
                obj = next2;
                break;
            }
        }
        v5r0 v5r0Var = (v5r0) obj;
        v5r0Var = v5r0Var == null ? v5r0.POPULAR_SPORT : v5r0Var;
        ag3Var2.getClass();
        kt2 kt2Var = ag3Var2.f809a;
        j3 = (j2 != 40 || j3 == 0) ? 0L : j3;
        jo20 jo20Var = new jo20();
        jo20Var.put("game_id", Long.valueOf(j));
        jo20Var.put("sport_id", Long.valueOf(j2));
        if (j3 > 0) {
            jo20Var.put("sub_sport_id", Long.valueOf(j3));
        }
        jo20Var.put("screen", v5r0Var.f36839a);
        kt2Var.a("top_event_bottom_sheet_show", jo20Var.b());
    }

    public final void M(boolean z, boolean z2) {
        c4m0 c4m0Var = this.C;
        if (c4m0Var == null || !c4m0Var.isActive()) {
            TopGamesByStatBottomSheetScreenParams topGamesByStatBottomSheetScreenParams = this.o;
            boolean z3 = topGamesByStatBottomSheetScreenParams.f46683a;
            List list = topGamesByStatBottomSheetScreenParams.b;
            daf dafVar = this.p;
            dafVar.getClass();
            list.getClass();
            yje yjeVar = null;
            this.C = sac.T(new dnq(new fnq(new vsg0(new odu(z, dafVar, z3, list, z2, null)), new meq0((Object) this, yjeVar, (byte) 9), (byte) 4), new jgb0((Object) this, yjeVar, (byte) 26), (byte) 1), d5c.S(jiu0.a(this), this.y.f22085a), new k5r0(2, this, m5r0.class, "onError", "onError(Ljava/lang/Throwable;)V", 4, (byte) 0));
        }
    }

    public final void N(uid uidVar) {
        boolean zEquals;
        if ((uidVar instanceof pid) || (uidVar instanceof sid) || (uidVar instanceof tid) || (uidVar instanceof kid) || (uidVar instanceof fid)) {
            zEquals = true;
        } else {
            zEquals = uidVar instanceof lid ? ((lid) uidVar).d.equals(ugl0.f35631a) : false;
        }
        if (zEquals) {
            G(c5r0.f3786a);
        }
        i3t0.A(this, this.q, uidVar, null, null, 6);
    }

    public final void O(Throwable th) {
        Object value;
        if (hic.C(th)) {
            Q();
        }
        p7m0 p7m0Var = this.i.f25029a;
        do {
            value = p7m0Var.getValue();
            value.getClass();
            this.f.getClass();
        } while (!p7m0Var.m(value, h5r0.a((h5r0) value, null, null, true, 11)));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object P(d0t d0tVar, zje zjeVar) {
        l5r0 l5r0Var;
        Object value;
        if (zjeVar instanceof l5r0) {
            l5r0Var = (l5r0) zjeVar;
            int i = l5r0Var.l;
            if ((i & Integer.MIN_VALUE) != 0) {
                l5r0Var.l = i - Integer.MIN_VALUE;
            } else {
                l5r0Var = new l5r0(this, zjeVar);
            }
        } else {
            l5r0Var = new l5r0(this, zjeVar);
        }
        Object obj = l5r0Var.j;
        wne wneVar = wne.f39444a;
        int i2 = l5r0Var.l;
        if (i2 == 0) {
            z1x.P(obj);
            did didVar = new did(kotlin.collections.a.c(d0tVar));
            l5r0Var.i = d0tVar;
            l5r0Var.l = 1;
            hjd hjdVar = this.q;
            hjdVar.getClass();
            if (hjdVar.a(didVar, l5r0Var) == wneVar) {
                return wneVar;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            d0tVar = l5r0Var.i;
            z1x.P(obj);
        }
        p7m0 p7m0Var = this.i.f25029a;
        do {
            value = p7m0Var.getValue();
            value.getClass();
            this.f.getClass();
        } while (!p7m0Var.m(value, h5r0.a((h5r0) value, null, d0tVar, false, 9)));
        return Unit.f46060a;
    }

    public final void Q() {
        pek0 pek0Var = pek0.f26859a;
        ctf0 ctf0Var = this.B;
        G(new f5r0(new xdk0(pek0Var, ctf0Var.b.a(R.string.no_connection_title_with_hyphen, Arrays.copyOf(new Object[0], 0)), ctf0Var.b.a(R.string.no_connection_description, Arrays.copyOf(new Object[0], 0)), null, rv00.B, null, 104)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // a.i3t0, a.k3t0
    public final void x(Object obj) {
        t4r0 t4r0Var = (t4r0) obj;
        t4r0Var.getClass();
        super.x(t4r0Var);
        Object obj2 = null;
        Object[] objArr = 0;
        if (t4r0Var instanceof m4r0) {
            m4r0 m4r0Var = (m4r0) t4r0Var;
            if (m4r0Var.equals(k4r0.f17682a)) {
                E();
                return;
            }
            boolean zEquals = m4r0Var.equals(l4r0.f19423a);
            m1e m1eVar = this.x;
            if (zEquals) {
                c4m0 c4m0Var = this.D;
                if (c4m0Var == null || !c4m0Var.isActive()) {
                    this.D = sac.T(new fnq(m1eVar.b(), new z2n0(this, objArr == true ? 1 : 0, (byte) 23), (byte) 4), d5c.S(jiu0.a(this), this.y.f22085a), new bdl0(2, this, m5r0.class, "onError", "onError(Ljava/lang/Throwable;)V", 4, (byte) 29));
                    return;
                }
                return;
            }
            if (m4r0Var.equals(i4r0.f14160a)) {
                v3c.N(this.C);
                v3c.N(this.D);
                return;
            } else if (!m4r0Var.equals(j4r0.f15899a)) {
                t9f.b();
                return;
            } else {
                if (m1eVar.c()) {
                    return;
                }
                Q();
                return;
            }
        }
        if (!(t4r0Var instanceof s4r0)) {
            t9f.b();
            return;
        }
        s4r0 s4r0Var = (s4r0) t4r0Var;
        if (s4r0Var instanceof o4r0) {
            bem bemVar = ((o4r0) s4r0Var).f24655a;
            if (bemVar instanceof wdm) {
                i3t0.K(this, null, null, new sr((i3t0) this, (Object) "top_event_bottom_sheet_card", ((wdm) bemVar).f38979a, (yje) null, (byte) 15), 3);
                return;
            } else {
                N(ebc.n0(bemVar));
                return;
            }
        }
        if (s4r0Var instanceof n4r0) {
            N(((n4r0) s4r0Var).f22912a);
            return;
        }
        if (s4r0Var.equals(q4r0.f28114a)) {
            d0t d0tVar = ((h5r0) D()).b;
            if (d0tVar == null) {
                return;
            }
            i3t0.K(this, null, null, new sr((i3t0) this, (Object) "top_event_bottom_sheet_button", d0tVar.f5282a, (yje) null, (byte) 15), 3);
            return;
        }
        if (s4r0Var.equals(r4r0.f29851a)) {
            v3c.N(this.C);
            M(true, false);
            return;
        }
        if (!(s4r0Var instanceof p4r0)) {
            t9f.b();
            return;
        }
        String str = ((p4r0) s4r0Var).f26369a.f35066a;
        TopGamesByStatBottomSheetScreenParams topGamesByStatBottomSheetScreenParams = this.o;
        long j = topGamesByStatBottomSheetScreenParams.c;
        long j2 = topGamesByStatBottomSheetScreenParams.e;
        long j3 = topGamesByStatBottomSheetScreenParams.d;
        o5r0.b.getClass();
        for (Object obj3 : o5r0.e) {
            if (((o5r0) obj3).f24702a.equals(str)) {
                obj2 = obj3;
                break;
            }
        }
        o5r0 o5r0Var = (o5r0) obj2;
        if (o5r0Var == null) {
            o5r0Var = o5r0.IGNORE;
        }
        au0 au0Var = this.z;
        au0Var.getClass();
        long j4 = 0;
        if (j3 == 40 && j2 != 0) {
            j4 = j2;
        }
        s1p s1pVar = au0Var.f1455a;
        yni0 yni0Var = new yni0();
        yni0Var.add(new i1p((byte) 2, j));
        yni0Var.add(new i1p((byte) 0, j3));
        if (j4 > j4) {
            yni0Var.add(new i1p((byte) 1, j4));
        }
        yni0Var.add(new j1p(o5r0Var.f24702a, (byte) 0));
        s1pVar.a(cui0.a(yni0Var), 12739L);
        long j5 = topGamesByStatBottomSheetScreenParams.c;
        ag3 ag3Var = this.A;
        ag3Var.getClass();
        kt2 kt2Var = ag3Var.f809a;
        long j6 = (j3 != 40 || j2 == 0) ? j4 : j2;
        jo20 jo20Var = new jo20();
        jo20Var.put("game_id", Long.valueOf(j5));
        jo20Var.put("sport_id", Long.valueOf(j3));
        if (j6 > j4) {
            jo20Var.put("sub_sport_id", Long.valueOf(j6));
        }
        jo20Var.put("action", str);
        kt2Var.a("top_event_bottom_sheet_close", jo20Var.b());
    }
}
