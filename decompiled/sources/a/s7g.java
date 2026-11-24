package a;

import android.content.ComponentCallbacks2;
import android.os.Bundle;
import androidx.compose.ui.platform.ComposeView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;
import org.xplatform.cyber.calendar.api.CyberCalendarParams;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"La/s7g;", "La/yx5;", "<init>", "()V", "a/usd", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class s7g extends yx5 {
    public final hnm0 K1;
    public ydi L1;
    public g2v M1;
    public poq0 N1;
    public final kwd O1;
    public final ujn P1;
    public final kiu0 Q1;
    public final s0r R1;
    public final khf0 S1;
    public static final /* synthetic */ iiy[] V1 = {new j0d0(s7g.class, "binding", "getBinding()Lorg/xplatform/cyber/calendar/impl/databinding/CyberCalendarFragmentBinding;", 0), new ez40(s7g.class, "screenParams", "getScreenParams()Lorg/xplatform/cyber/calendar/api/CyberCalendarParams;", 0)};
    public static final usd U1 = new usd();

    public s7g() {
        super(R.layout.cyber_calendar_fragment);
        this.K1 = hnm0.f13359a;
        this.O1 = new kwd();
        this.P1 = new ujn((byte) 8);
        jwd jwdVar = new jwd(this, (byte) 28);
        a8z a8zVarA = maz.a(wez.b, new q7g(new q7g(this, (byte) 0), (byte) 1));
        this.Q1 = agc.G(this, sre0.f32672a.b(hbg.class), new r7g(a8zVarA, (byte) 0), new r7g(a8zVarA, (byte) 1), jwdVar);
        this.R1 = ltt0.o(this, o7g.f24785a);
        this.S1 = new khf0("params_key");
    }

    @Override // a.yx5
    public final void B0(Bundle bundle) throws Exception {
        iiy[] iiyVarArr = V1;
        byte b = 0;
        iiy iiyVar = iiyVarArr[0];
        s0r s0rVar = this.R1;
        Object objN = s0rVar.n(iiyVar, this);
        objN.getClass();
        ComposeView composeView = ((t7g) objN).b;
        hbg hbgVarH0 = H0();
        boolean z = G0().d;
        kwd kwdVar = this.O1;
        kwdVar.getClass();
        owp0 owp0Var = new owp0(this);
        ugd ugdVar = new ugd(-1719132637, true, new z9g(kwdVar, this, hbgVarH0, z));
        yje yjeVar = null;
        pkd.h(composeView, owp0Var, null, ugdVar);
        Object objN2 = s0rVar.n(iiyVarArr[0], this);
        objN2.getClass();
        t7g t7gVar = (t7g) objN2;
        hbg hbgVarH1 = H0();
        g2v g2vVar = this.M1;
        if (g2vVar == null) {
            Intrinsics.h("lottieEmptyConfigurator");
            throw null;
        }
        CyberCalendarParams cyberCalendarParamsG0 = G0();
        ujn ujnVar = this.P1;
        ujnVar.getClass();
        pkd.h(t7gVar.c, new owp0(this), null, new ugd(867924047, true, new gf9((Object) hbgVarH1, (Object) cyberCalendarParamsG0, (Object) ujnVar, (Object) g2vVar, (byte) 16)));
        p7m0 p7m0Var = hbgVarH1.u;
        lkz lkzVar = lkz.f20223a;
        fob fobVar = new fob(t7gVar, yjeVar, (byte) 26);
        clz clzVarW = aac.W(this);
        qjj.W(x0x.Q(clzVarW.x()), null, null, new fze(p7m0Var, clzVarW, fobVar, (yje) null), 3);
        tag tagVar = hbgVarH1.c;
        p5a p5aVarH = ulb.H(new dnq(new s6n0(tagVar.g, new oag(tagVar, yjeVar, b)), new e00(tagVar, yjeVar, (byte) 22), (byte) 0));
        clz clzVarW2 = aac.W(this);
        qjj.W(x0x.Q(clzVarW2.x()), null, null, new b5g(p5aVarH, clzVarW2, null, (byte) 0), 3);
        ol60 ol60Var = tagVar.j;
        ee0 ee0Var = new ee0((Object) this, (Object) cyberCalendarParamsG0, yjeVar, (byte) 29);
        lkz lkzVar2 = lkz.f20223a;
        clz clzVarW3 = aac.W(this);
        qjj.W(x0x.Q(clzVarW3.x()), null, null, new fze(ol60Var, clzVarW3, ee0Var, (yje) null), 3);
    }

    @Override // a.yx5
    public final void C0() {
        ComponentCallbacks2 application = n0().getApplication();
        application.getClass();
        af3 af3Var = application instanceof af3 ? (af3) application : null;
        if (af3Var != null) {
            o5d0 o5d0Var = (o5d0) af3Var.d().get(z4g.class);
            ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
            z4g z4gVar = (z4g) (ze3Var instanceof z4g ? ze3Var : null);
            if (z4gVar != null) {
                CyberCalendarParams cyberCalendarParamsG0 = G0();
                cad cadVar = z4gVar.f43770a;
                m1e m1eVar = z4gVar.b;
                g2v g2vVar = z4gVar.c;
                ctf0 ctf0Var = z4gVar.d;
                oeg0 oeg0Var = z4gVar.e;
                gii0 gii0Var = z4gVar.f;
                duj dujVar = z4gVar.g;
                poq0 poq0Var = z4gVar.h;
                pru pruVar = z4gVar.i;
                ul9 ul9Var = cyberCalendarParamsG0.d ? z4gVar.k : z4gVar.j;
                m1eVar.getClass();
                ctf0Var.getClass();
                oeg0Var.getClass();
                gii0Var.getClass();
                ul9Var.getClass();
                this.L1 = (ydi) ((n5d0) new o3c(cadVar, m1eVar, g2vVar, ctf0Var, oeg0Var, cyberCalendarParamsG0, dujVar, poq0Var, pruVar, ul9Var).k).get();
                this.M1 = g2vVar;
                this.N1 = poq0Var;
                return;
            }
        }
        jf4.n(b1j.i(z4g.class, "Cannot create dependency "));
    }

    @Override // a.yx5
    public final void D0() throws Exception {
        hbg hbgVarH0 = H0();
        yje yjeVar = null;
        p5a p5aVarH = ulb.H(new dnq(new s6n0(hbgVarH0.t, new wib(hbgVarH0, yjeVar, (byte) 17)), new e00(hbgVarH0, yjeVar, (byte) 23), (byte) 0));
        lkz lkzVar = lkz.f20223a;
        clz clzVarW = aac.W(this);
        qjj.W(x0x.Q(clzVarW.x()), null, null, new b5g(p5aVarH, clzVarW, null, (byte) 4), 3);
        ol60 ol60Var = H0().v;
        p7g p7gVar = new p7g(this, yjeVar, (byte) 0);
        lkz lkzVar2 = lkz.f20223a;
        clz clzVarW2 = aac.W(this);
        qjj.W(x0x.Q(clzVarW2.x()), null, null, new fze(ol60Var, clzVarW2, p7gVar, (yje) null), 3);
        p7m0 p7m0Var = H0().s;
        p7g p7gVar2 = new p7g(this, yjeVar, (byte) 1);
        clz clzVarW3 = aac.W(this);
        qjj.W(x0x.Q(clzVarW3.x()), null, null, new fze(p7m0Var, clzVarW3, p7gVar2, (yje) null, (byte) 0), 3);
    }

    public final CyberCalendarParams G0() {
        return (CyberCalendarParams) this.S1.n(this, V1[1]);
    }

    public final hbg H0() {
        return (hbg) this.Q1.getValue();
    }

    @Override // a.yx5, androidx.fragment.app.Fragment
    public final void e0() {
        super.e0();
        hbg hbgVarH0 = H0();
        if (hbgVarH0.n.f27342a.d().r(fk60.CYBER_CALENDAR)) {
            hbgVarH0.v.f(abg.f577a);
        }
    }

    @Override // a.yx5
    public final jnm0 y0() {
        return this.K1;
    }
}
