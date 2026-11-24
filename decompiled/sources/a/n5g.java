package a;

import android.content.ComponentCallbacks2;
import android.os.Bundle;
import androidx.recyclerview.widget.LinearLayoutManager;
import kotlin.Metadata;
import org.xbet.client1.R;
import org.xplatform.cyber.calendar.api.CyberCalendarParams;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"La/n5g;", "La/yx5;", "<init>", "()V", "a/qud", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class n5g extends yx5 {
    public wdi K1;
    public g2v L1;
    public final kiu0 M1;
    public final s0r N1;
    public final a8z O1;
    public final l5g P1;
    public final ejd Q1;
    public final khf0 R1;
    public static final /* synthetic */ iiy[] U1 = {new j0d0(n5g.class, "binding", "getBinding()Lorg/xplatform/cyber/calendar/impl/databinding/CyberCalendarDayFragmentBinding;", 0), new ez40(n5g.class, "screenParams", "getScreenParams()Lorg/xplatform/cyber/calendar/api/CyberCalendarParams;", 0)};
    public static final qud S1 = new qud();

    public n5g() {
        super(R.layout.cyber_calendar_day_fragment);
        i5g i5gVar = new i5g(this, (byte) 2);
        aqe aqeVar = new aqe(this, (byte) 24);
        wez wezVar = wez.b;
        a8z a8zVarA = maz.a(wezVar, new aqe(aqeVar, (byte) 25));
        this.M1 = agc.G(this, sre0.f32672a.b(h6g.class), new cce(a8zVarA, (byte) 24), new cce(a8zVarA, (byte) 25), i5gVar);
        this.N1 = ltt0.o(this, j5g.f15931a);
        this.O1 = maz.a(wezVar, new dpf((byte) 26));
        this.P1 = new l5g(this, (byte) 0);
        this.Q1 = new ejd(this, (byte) 26);
        this.R1 = new khf0("PARAMS_KEY");
    }

    @Override // a.yx5
    public final void B0(Bundle bundle) {
        G0().b.v(new i5g(this, (byte) 0), new i5g(this, (byte) 1));
        G0().c.setOnTouchListener(new k5g(this, o0()));
        G0().e.setOnDayEventListener(new a1d((Object) this, (byte) 5));
        G0().e.setItemAnimator(null);
        G0().e.setLayoutManager(new LinearLayoutManager(o0()));
        G0().e.setAdapter(H0());
        G0().e.m(new qpm0(this.Q1));
        vvw.o(G0().e, false, 3);
    }

    @Override // a.yx5
    public final void C0() {
        ComponentCallbacks2 application = n0().getApplication();
        application.getClass();
        af3 af3Var = application instanceof af3 ? (af3) application : null;
        if (af3Var != null) {
            o5d0 o5d0Var = (o5d0) af3Var.d().get(f5g.class);
            ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
            f5g f5gVar = (f5g) (ze3Var instanceof f5g ? ze3Var : null);
            if (f5gVar != null) {
                CyberCalendarParams cyberCalendarParams = (CyberCalendarParams) this.R1.n(this, U1[1]);
                cad cadVar = f5gVar.f8959a;
                iip iipVar = f5gVar.b;
                m1e m1eVar = f5gVar.c;
                g2v g2vVar = f5gVar.d;
                ctf0 ctf0Var = f5gVar.e;
                oeg0 oeg0Var = f5gVar.f;
                sjl0 sjl0Var = f5gVar.g;
                duj dujVar = f5gVar.h;
                ul9 ul9Var = cyberCalendarParams.d ? f5gVar.j : f5gVar.i;
                iipVar.getClass();
                m1eVar.getClass();
                ctf0Var.getClass();
                oeg0Var.getClass();
                sjl0Var.getClass();
                ul9Var.getClass();
                g45 g45Var = new g45();
                g45Var.f10647a = cyberCalendarParams;
                g45Var.b = ul9Var;
                g45Var.c = sjl0Var;
                g45Var.d = iipVar;
                g45Var.e = g2vVar;
                g45Var.f = cadVar;
                g45Var.g = dujVar;
                g45Var.h = ctf0Var;
                g45Var.i = n0k0.a(new uci(g45Var, (byte) 13));
                this.K1 = (wdi) ((n5d0) g45Var.i).get();
                this.L1 = g2vVar;
                return;
            }
        }
        jf4.n(b1j.i(f5g.class, "Cannot create dependency "));
    }

    @Override // a.yx5
    public final void D0() throws Exception {
        h6g h6gVarI0 = I0();
        yje yjeVar = null;
        p5a p5aVarH = ulb.H(new dnq(new s6n0(h6gVarI0.m, new wib(h6gVarI0, yjeVar, (byte) 14)), new e00(h6gVarI0, yjeVar, (byte) 16), (byte) 0));
        lkz lkzVar = lkz.f20223a;
        clz clzVarW = aac.W(this);
        qjj.W(x0x.Q(clzVarW.x()), null, null, new b5g(p5aVarH, clzVarW, null, (byte) 1), 3);
        p7m0 p7m0Var = I0().n;
        m5g m5gVar = new m5g(this, yjeVar, (byte) 0);
        clz clzVarW2 = aac.W(this);
        qjj.W(x0x.Q(clzVarW2.x()), null, null, new fze(p7m0Var, clzVarW2, m5gVar, (yje) null), 3);
        p7m0 p7m0Var2 = I0().o;
        m5g m5gVar2 = new m5g(this, yjeVar, (byte) 1);
        clz clzVarW3 = aac.W(this);
        qjj.W(x0x.Q(clzVarW3.x()), null, null, new fze(p7m0Var2, clzVarW3, m5gVar2, (yje) null, (byte) 0), 3);
    }

    public final o5g G0() {
        Object objN = this.N1.n(U1[0], this);
        objN.getClass();
        return (o5g) objN;
    }

    public final e5g H0() {
        return (e5g) this.O1.getValue();
    }

    public final h6g I0() {
        return (h6g) this.M1.getValue();
    }

    @Override // a.yx5, androidx.fragment.app.Fragment
    public final void Z() {
        super.Z();
        G0().e.setAdapter(null);
    }

    @Override // androidx.fragment.app.Fragment
    public final void d0() {
        this.j1 = true;
        H0().y(this.P1);
    }

    @Override // a.yx5, androidx.fragment.app.Fragment
    public final void e0() {
        super.e0();
        H0().v(this.P1);
    }
}
