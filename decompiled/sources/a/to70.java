package a;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes3.dex */
public final class to70 extends w46 {
    public final wsf0 A;
    public final xcc B;
    public final hni0 C;
    public final qqc D;
    public final hsj0 E;
    public final t0u F;
    public final dmt G;
    public final abu H;
    public final j1q0 I;
    public final ddu J;
    public final duj K;
    public final jqc L;
    public final tbu M;
    public final bzt N;
    public final ctf0 O;
    public final khf0 P;
    public csr Q;
    public c4m0 R;
    public bby S;
    public ly5 T;
    public boolean U;
    public final p7m0 V;
    public final p7m0 W;
    public final q99 X;
    public final p7m0 Y;
    public final p7m0 Z;
    public final ol60 a0;
    public final i1w0 b;
    public final p7m0 b0;
    public final ih5 c;
    public final l7k d;
    public final cmt e;
    public final m1e f;
    public final mne g;
    public final v88 h;
    public final oqt i;
    public final hkt0 j;
    public final ipi0 k;
    public final vcu l;
    public final fq m;
    public final ztt n;
    public final gmt o;
    public final xsi0 p;
    public final eni0 q;
    public final gpi0 r;
    public final spx s;
    public final d3c t;
    public final fqx u;
    public final hj50 v;
    public final qhf0 w;
    public final d2e x;
    public final vrs0 y;
    public final y5s z;

    public to70(i1w0 i1w0Var, hs60 hs60Var, ih5 ih5Var, l7k l7kVar, cmt cmtVar, m1e m1eVar, mne mneVar, v88 v88Var, lbx lbxVar, oqt oqtVar, hkt0 hkt0Var, qa60 qa60Var, ipi0 ipi0Var, vcu vcuVar, fq fqVar, ztt zttVar, gmt gmtVar, xsi0 xsi0Var, gpx gpxVar, vni0 vni0Var, hs hsVar, eni0 eni0Var, gpi0 gpi0Var, spx spxVar, d3c d3cVar, fqx fqxVar, hj50 hj50Var, qhf0 qhf0Var, d2e d2eVar, vrs0 vrs0Var, y5s y5sVar, wsf0 wsf0Var, xcc xccVar, hni0 hni0Var, qqc qqcVar, hsj0 hsj0Var, t0u t0uVar, dmt dmtVar, abu abuVar, j1q0 j1q0Var, ddu dduVar, duj dujVar, r9u r9uVar, jqc jqcVar, tbu tbuVar, bzt bztVar, ctf0 ctf0Var, khf0 khf0Var) {
        Object value;
        boolean z;
        String strA;
        i1w0Var.getClass();
        lbxVar.getClass();
        oqtVar.getClass();
        qa60Var.getClass();
        ipi0Var.getClass();
        vcuVar.getClass();
        fqVar.getClass();
        zttVar.getClass();
        gmtVar.getClass();
        xsi0Var.getClass();
        gpxVar.getClass();
        vni0Var.getClass();
        hsVar.getClass();
        eni0Var.getClass();
        gpi0Var.getClass();
        spxVar.getClass();
        d3cVar.getClass();
        fqxVar.getClass();
        hj50Var.getClass();
        qhf0Var.getClass();
        d2eVar.getClass();
        vrs0Var.getClass();
        y5sVar.getClass();
        xccVar.getClass();
        hni0Var.getClass();
        qqcVar.getClass();
        hsj0Var.getClass();
        t0uVar.getClass();
        tbuVar.getClass();
        this.b = i1w0Var;
        this.c = ih5Var;
        this.d = l7kVar;
        this.e = cmtVar;
        this.f = m1eVar;
        this.g = mneVar;
        this.h = v88Var;
        this.i = oqtVar;
        this.j = hkt0Var;
        this.k = ipi0Var;
        this.l = vcuVar;
        this.m = fqVar;
        this.n = zttVar;
        this.o = gmtVar;
        this.p = xsi0Var;
        this.q = eni0Var;
        this.r = gpi0Var;
        this.s = spxVar;
        this.t = d3cVar;
        this.u = fqxVar;
        this.v = hj50Var;
        this.w = qhf0Var;
        this.x = d2eVar;
        this.y = vrs0Var;
        this.z = y5sVar;
        this.A = wsf0Var;
        this.B = xccVar;
        this.C = hni0Var;
        this.D = qqcVar;
        this.E = hsj0Var;
        this.F = t0uVar;
        this.G = dmtVar;
        this.H = abuVar;
        this.I = j1q0Var;
        this.J = dduVar;
        this.K = dujVar;
        this.L = jqcVar;
        this.M = tbuVar;
        this.N = bztVar;
        this.O = ctf0Var;
        this.P = khf0Var;
        this.Q = csr.e;
        this.U = true;
        this.V = q7m0.a(Boolean.FALSE);
        this.W = q7m0.a(new mn70(false));
        yje yjeVar = null;
        this.X = vtb.d(0, null, null, 7);
        this.Y = q7m0.a(new kn70(false));
        this.Z = q7m0.a(en70.f8079a);
        this.a0 = new ol60(1, i99.b);
        p7m0 p7m0VarA = q7m0.a(new jn70("", false));
        this.b0 = p7m0VarA;
        sac.V(jiu0.a(this), dn70.f6355a, null, mneVar.f22085a, new wk70(lbxVar, this, yjeVar, (byte) 10), 10);
        gpxVar.f11704a.f26724a.getClass();
        eni0Var.f8096a.f26724a.s = y5sVar.b;
        I();
        hsVar.f13555a.f26724a.m.add(Long.valueOf(y5sVar.f42064a.a()));
        w(ry5.f31296a);
        H();
        slb.U(new dnq(new fnq(new m430(qa60Var.a(), this, (byte) 8), new hi70(2, this, to70.class, "handleCommand", "handleCommand(Lorg/xplatform/core/domain/GameCommand;)V", 4, (byte) 8), (byte) 4), new pr60(3, yjeVar, (byte) 13), (byte) 1), d5c.S(jiu0.a(this), mneVar.f22085a));
        do {
            value = p7m0VarA.getValue();
            z = this.N.f3488a.a().X;
            strA = this.O.b.a(R.string.federal_tax_legislation_info, Arrays.copyOf(new Object[0], 0));
            ((jn70) value).getClass();
        } while (!p7m0VarA.m(value, new jn70(strA, z)));
    }

    public final void A() {
        i1w0 i1w0Var = this.b;
        CopyOnWriteArrayList copyOnWriteArrayListQ = b1j.q(i1w0Var);
        ListIterator listIteratorP = b1j.p(copyOnWriteArrayListQ, new c8d(y7d.f42146a, p0w0.f26173a), i1w0Var, copyOnWriteArrayListQ, 0);
        while (true) {
            paw pawVar = (paw) listIteratorP;
            if (!pawVar.hasNext()) {
                return;
            } else {
                i1w0Var.a((oe50) pawVar.next());
            }
        }
    }

    public final void B(Context context) {
        int i;
        String strM;
        Object fn70Var;
        String str = js60.f17036a;
        y5s y5sVar = this.z;
        s470 s470Var = y5sVar.f42064a;
        s470 s470Var2 = y5sVar.f42064a;
        s470Var.getClass();
        int iOrdinal = s470Var.ordinal();
        if (iOrdinal == 5) {
            i = R.drawable.game_resident_placeholder;
        } else if (iOrdinal == 11) {
            i = R.drawable.game_scratch_card_placeholder;
        } else if (iOrdinal == 7) {
            i = R.drawable.game_domino_placeholder;
        } else if (iOrdinal == 8) {
            i = R.drawable.game_apple_fortune_placeholder;
        } else if (iOrdinal != 9) {
            switch (iOrdinal) {
                case 15:
                    i = R.drawable.game_odyssey_placeholder;
                    break;
                case 16:
                    i = R.drawable.game_fruit_blast_placeholder;
                    break;
                case 17:
                    i = R.drawable.game_eastern_nights_placeholder;
                    break;
                default:
                    i = 0;
                    break;
            }
        } else {
            i = R.drawable.game_dragons_gold_placeholder;
        }
        String str2 = js60.f17036a;
        s470Var2.getClass();
        int iOrdinal2 = s470Var2.ordinal();
        if (iOrdinal2 == 5) {
            strM = js60.d;
        } else if (iOrdinal2 == 11) {
            strM = js60.f;
        } else if (iOrdinal2 != 7) {
            if (iOrdinal2 == 8) {
                strM = kng0.m(str2, "/appleoffortune", context.getResources().getDisplayMetrics().widthPixels >= 1080 ? "/large/" : "/small/", "background.webp");
            } else if (iOrdinal2 != 9) {
                switch (iOrdinal2) {
                    case 15:
                        strM = js60.b;
                        break;
                    case 16:
                        strM = js60.c;
                        break;
                    case 17:
                        strM = kng0.m(str2, "/easternnights", context.getResources().getDisplayMetrics().widthPixels >= 1080 ? "/large/" : "/small/", "background.webp");
                        break;
                    default:
                        strM = null;
                        break;
                }
            } else {
                strM = kng0.m(str2, "/dragonsgold", context.getResources().getDisplayMetrics().widthPixels >= 1080 ? "/large/" : "/small/", "background.webp");
            }
        } else {
            strM = js60.e;
        }
        if (strM != null) {
            fn70Var = new gn70(strM, i);
        } else {
            fn70Var = new fn70(jo70.f16843a[s470Var2.ordinal()] == 1 ? new km60(this.G.f6335a.a().y0) : null);
        }
        p7m0 p7m0Var = this.Z;
        p7m0Var.getClass();
        p7m0Var.o(null, fn70Var);
    }

    public final void C(Throwable th) {
        sac.V(jiu0.a(this), oo70.f25581a, null, this.g.f22085a, new wk70(this, th, null, (byte) 12), 10);
    }

    public final void D(boolean z) {
        p7m0 p7m0Var;
        Object value;
        do {
            p7m0Var = this.Y;
            value = p7m0Var.getValue();
            ((kn70) value).getClass();
        } while (!p7m0Var.m(value, new kn70(z)));
    }

    public final void E(boolean z) {
        if (this.l.a() == vrs.f37917a) {
            w(new ile(true));
        }
        G(false);
        mn70 mn70Var = new mn70(z);
        p7m0 p7m0Var = this.W;
        p7m0Var.getClass();
        p7m0Var.o(null, mn70Var);
        D(!z);
    }

    public final void F(io70 io70Var) {
        sac.V(jiu0.a(this), new wk60((byte) 24), null, this.g.c, new wk70(this, io70Var, null, (byte) 13), 10);
    }

    public final void G(boolean z) {
        nn70 nn70Var = new nn70(z && !this.i.a());
        p7m0 p7m0Var = this.W;
        p7m0Var.getClass();
        p7m0Var.o(null, nn70Var);
    }

    public final void H() {
        c4m0 c4m0Var = this.R;
        if (c4m0Var == null || !c4m0Var.isActive()) {
            yje yjeVar = null;
            this.R = slb.U(new dnq(new fnq(this.f.b(), new a220(this, yjeVar, (byte) 4), (byte) 4), new ib60(this, yjeVar, (byte) 5), (byte) 1), d5c.S(jiu0.a(this), this.g.f22085a));
        }
    }

    public final void I() {
        s470 s470Var = this.z.f42064a;
        gpi0 gpi0Var = this.r;
        gpi0Var.getClass();
        s470Var.getClass();
        aws awsVar = gpi0Var.f11686a;
        awsVar.getClass();
        yvs yvsVar = awsVar.f1590a;
        yvsVar.getClass();
        yvsVar.f43335a = s470Var;
        Log.i("GamesProcess.Flag", "gameType = " + s470Var);
    }

    @Override // a.diu0
    public final void v() {
        ArrayList arrayList = this.w.f28736a.f26724a.m;
        int size = arrayList.size();
        if (size > 0) {
            arrayList.remove(size - 1);
        }
        s470 s470Var = this.z.f42064a;
        qqc qqcVar = this.D;
        qqcVar.getClass();
        s470Var.getClass();
        aws awsVar = qqcVar.f29160a;
        awsVar.getClass();
        yvs yvsVar = awsVar.f1590a;
        if (s470Var == yvsVar.f43335a) {
            yvsVar.f43335a = s470.GAME_UNAVAILABLE;
        }
    }

    public final void w(zy5 zy5Var) {
        sac.V(jiu0.a(this), ko70.f18618a, null, this.g.f22085a, new wk70(this, zy5Var, null, (byte) 11), 10);
    }

    public final boolean x() {
        if (!this.u.a() || !((SharedPreferences) this.v.f13144a.b.f20589a).getBoolean("SHOW_GAME_IS_NOT_FINISHED_DIALOG", true)) {
            return false;
        }
        vcu vcuVar = this.l;
        boolean zA = vcuVar.a().a();
        spx spxVar = this.s;
        if (zA || spxVar.a()) {
            return (this.z.g && spxVar.a() && vcuVar.a() == vrs.f37917a) ? false : true;
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object y(cn70 cn70Var, zje zjeVar) {
        mo70 mo70Var;
        if (zjeVar instanceof mo70) {
            mo70Var = (mo70) zjeVar;
            int i = mo70Var.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                mo70Var.k = i - Integer.MIN_VALUE;
            } else {
                mo70Var = new mo70(this, zjeVar);
            }
        } else {
            mo70Var = new mo70(this, zjeVar);
        }
        Object obj = mo70Var.i;
        wne wneVar = wne.f39444a;
        int i2 = mo70Var.k;
        yje yjeVar = null;
        if (i2 == 0) {
            z1x.P(obj);
            c670 c670Var = new c670(cn70Var, yjeVar, (byte) 4);
            mo70Var.k = 1;
            if (ntb.L(this.V, c670Var, mo70Var) == wneVar) {
                return wneVar;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(obj);
        }
        return Unit.f46060a;
    }

    public final void z(boolean z) {
        boolean z2 = this.z.e;
        vcu vcuVar = this.l;
        if (z2 && vcuVar.a().a()) {
            return;
        }
        if (z || vcuVar.a() != vrs.c) {
            w(ry5.f31296a);
        }
        sac.V(jiu0.a(this), no70.f23856a, null, this.g.f22085a, new lo70(this, null, (byte) 1), 10);
    }
}
