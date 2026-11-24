package a;

import android.content.ComponentCallbacks2;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"La/wft;", "La/iw5;", "<init>", "()V", "a/bek", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class wft extends iw5 {
    public final n0o0 k2;
    public final a8z l2;
    public final yzn0 m2 = new yzn0("GENDER_CHOICE_SCREEN_PARAMS");
    public static final /* synthetic */ iiy[] o2 = {new ez40(wft.class, "params", "getParams()Lorg/xplatform/personal/api/presentation/model/gender_params/GenderChoiceScreenParams;", 0)};
    public static final bek n2 = new bek();
    public static final String p2 = wft.class.getName();

    public wft() {
        final byte b = 0;
        this.k2 = maz.b(new Function0(this) { // from class: a.uft
            public final /* synthetic */ wft b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                byte b2 = b;
                wft wftVar = this.b;
                switch (b2) {
                    case 0:
                        bek bekVar = wft.n2;
                        ComponentCallbacks2 application = wftVar.n0().getApplication();
                        application.getClass();
                        af3 af3Var = application instanceof af3 ? (af3) application : null;
                        if (af3Var != null) {
                            o5d0 o5d0Var = (o5d0) af3Var.d().get(xft.class);
                            ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
                            if (!(ze3Var instanceof xft)) {
                                ze3Var = null;
                            }
                            xft xftVar = (xft) ze3Var;
                            if (xftVar != null) {
                                yft yftVar = (yft) wftVar.m2.n(wftVar, wft.o2[0]);
                                mne mneVar = xftVar.f40808a;
                                ctf0 ctf0Var = xftVar.b;
                                wdk0 wdk0Var = xftVar.c;
                                ctf0Var.getClass();
                                wdk0Var.getClass();
                                return new fii(yftVar, mneVar, ctf0Var);
                            }
                        }
                        jf4.n(b1j.i(xft.class, "Cannot create dependency "));
                        return null;
                    default:
                        return new q0h0((eii) ((fii) wftVar.k2.getValue()).d.get());
                }
            }
        });
        final byte b2 = 1;
        this.l2 = xbc.a0(this, sre0.f32672a.b(cgt.class), null, new Function0(this) { // from class: a.uft
            public final /* synthetic */ wft b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                byte b3 = b2;
                wft wftVar = this.b;
                switch (b3) {
                    case 0:
                        bek bekVar = wft.n2;
                        ComponentCallbacks2 application = wftVar.n0().getApplication();
                        application.getClass();
                        af3 af3Var = application instanceof af3 ? (af3) application : null;
                        if (af3Var != null) {
                            o5d0 o5d0Var = (o5d0) af3Var.d().get(xft.class);
                            ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
                            if (!(ze3Var instanceof xft)) {
                                ze3Var = null;
                            }
                            xft xftVar = (xft) ze3Var;
                            if (xftVar != null) {
                                yft yftVar = (yft) wftVar.m2.n(wftVar, wft.o2[0]);
                                mne mneVar = xftVar.f40808a;
                                ctf0 ctf0Var = xftVar.b;
                                wdk0 wdk0Var = xftVar.c;
                                ctf0Var.getClass();
                                wdk0Var.getClass();
                                return new fii(yftVar, mneVar, ctf0Var);
                            }
                        }
                        jf4.n(b1j.i(xft.class, "Cannot create dependency "));
                        return null;
                    default:
                        return new q0h0((eii) ((fii) wftVar.k2.getValue()).d.get());
                }
            }
        }, 14);
    }

    @Override // a.iw5
    public final bw5 J0(fet fetVar) {
        clz clzVar;
        fetVar.e0(-567504946);
        a8z a8zVar = this.l2;
        k3t0 k3t0Var = (k3t0) a8zVar.getValue();
        boolean zI = fetVar.i(this);
        Object objP = fetVar.P();
        Object obj = ukd.f35823a;
        if (zI || objP == obj) {
            Object h2sVar = new h2s(1, this, wft.class, "handleSideEffect", "handleSideEffect(Lorg/xplatform/personal/impl/presentation/gender/models/GenderChoiceSideEffect;)V", 0, (byte) 29);
            fetVar.o0(h2sVar);
            objP = h2sVar;
        }
        clz clzVar2 = (clz) fetVar.k(or00.f25714a);
        lkz lkzVar = lkz.f20223a;
        pz40 pz40VarF = androidx.compose.runtime.e.f((Function1) ((jhy) objP), fetVar);
        boolean zI2 = fetVar.i(k3t0Var) | fetVar.i(clzVar2) | fetVar.e(3) | fetVar.g(pz40VarF);
        Object objP2 = fetVar.P();
        if (zI2 || objP2 == obj) {
            clzVar = clzVar2;
            Object pcVar = new pc(k3t0Var, clzVar, pz40VarF, null, (byte) 20);
            fetVar.o0(pcVar);
            objP2 = pcVar;
        } else {
            clzVar = clzVar2;
        }
        m0x0.t(fetVar, clzVar, (Function2) objP2);
        pz40 pz40VarY = ((i3t0) ((k3t0) a8zVar.getValue())).y(fetVar);
        bw5 bw5Var = new bw5(iw5.O0(1, fetVar), u1c.M(724310207, new tft(pz40VarY, (byte) 0), fetVar), (ugd) null, u1c.M(650725629, new rgh(pz40VarY, this, (byte) 22), fetVar), 10);
        fetVar.r(false);
        return bw5Var;
    }
}
