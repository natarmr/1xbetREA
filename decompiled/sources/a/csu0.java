package a;

import android.content.ComponentCallbacks2;
import java.util.Collections;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;
import org.xplatform.cyber.section.api.virtualrecommended.VirtualRecommendedEventsParams;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"La/csu0;", "La/yx5;", "<init>", "()V", "a/bzs0", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class csu0 extends yx5 {
    public g2v K1;
    public fiu0 L1;
    public final boolean M1;
    public final a8z N1;
    public final kiu0 O1;
    public final khf0 P1;
    public final s0r Q1;
    public static final /* synthetic */ iiy[] S1 = {new ez40(csu0.class, "params", "getParams()Lorg/xplatform/cyber/section/api/virtualrecommended/VirtualRecommendedEventsParams;", 0), new j0d0(csu0.class, "binding", "getBinding()Lorg/xplatform/uikit/databinding/ComposeFragmentBinding;", 0)};
    public static final bzs0 R1 = new bzs0((byte) 9);

    public csu0() {
        super(R.layout.compose_fragment);
        final byte b = 1;
        this.M1 = true;
        final byte b2 = 0;
        Function0 function0 = new Function0(this) { // from class: a.asu0
            public final /* synthetic */ csu0 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                byte b3 = b2;
                csu0 csu0Var = this.b;
                switch (b3) {
                    case 0:
                        bzs0 bzs0Var = csu0.R1;
                        ComponentCallbacks2 application = csu0Var.n0().getApplication();
                        application.getClass();
                        af3 af3Var = application instanceof af3 ? (af3) application : null;
                        if (af3Var != null) {
                            o5d0 o5d0Var = (o5d0) af3Var.d().get(dsu0.class);
                            ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
                            if (!(ze3Var instanceof dsu0)) {
                                ze3Var = null;
                            }
                            dsu0 dsu0Var = (dsu0) ze3Var;
                            if (dsu0Var != null) {
                                VirtualRecommendedEventsParams virtualRecommendedEventsParams = (VirtualRecommendedEventsParams) csu0Var.P1.n(csu0Var, csu0.S1[0]);
                                duj dujVar = dsu0Var.f6631a;
                                g2v g2vVar = dsu0Var.b;
                                cad cadVar = dsu0Var.c;
                                m1e m1eVar = dsu0Var.d;
                                gii0 gii0Var = dsu0Var.e;
                                oeg0 oeg0Var = dsu0Var.f;
                                pyg pygVar = dsu0Var.g;
                                ctf0 ctf0Var = dsu0Var.h;
                                knf0 knf0Var = dsu0Var.i;
                                iip iipVar = dsu0Var.j;
                                sjl0 sjl0Var = dsu0Var.l;
                                xri xriVar = dsu0Var.k;
                                zr1 zr1Var = dsu0Var.n;
                                ih5 ih5Var = dsu0Var.m;
                                pygVar.getClass();
                                iipVar.getClass();
                                xriVar.getClass();
                                m1eVar.getClass();
                                gii0Var.getClass();
                                oeg0Var.getClass();
                                ctf0Var.getClass();
                                knf0Var.getClass();
                                sjl0Var.getClass();
                                return new fzi(cadVar, pygVar, xriVar, dujVar, g2vVar, virtualRecommendedEventsParams, sjl0Var, ih5Var, zr1Var);
                            }
                        }
                        jf4.n(b1j.i(dsu0.class, "Cannot create dependency "));
                        return null;
                    default:
                        bzs0 bzs0Var2 = csu0.R1;
                        fiu0 fiu0Var = csu0Var.L1;
                        if (fiu0Var != null) {
                            return fiu0Var;
                        }
                        Intrinsics.h("viewModelFactory");
                        throw null;
                }
            }
        };
        wez wezVar = wez.b;
        this.N1 = maz.a(wezVar, function0);
        Function0 function1 = new Function0(this) { // from class: a.asu0
            public final /* synthetic */ csu0 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                byte b3 = b;
                csu0 csu0Var = this.b;
                switch (b3) {
                    case 0:
                        bzs0 bzs0Var = csu0.R1;
                        ComponentCallbacks2 application = csu0Var.n0().getApplication();
                        application.getClass();
                        af3 af3Var = application instanceof af3 ? (af3) application : null;
                        if (af3Var != null) {
                            o5d0 o5d0Var = (o5d0) af3Var.d().get(dsu0.class);
                            ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
                            if (!(ze3Var instanceof dsu0)) {
                                ze3Var = null;
                            }
                            dsu0 dsu0Var = (dsu0) ze3Var;
                            if (dsu0Var != null) {
                                VirtualRecommendedEventsParams virtualRecommendedEventsParams = (VirtualRecommendedEventsParams) csu0Var.P1.n(csu0Var, csu0.S1[0]);
                                duj dujVar = dsu0Var.f6631a;
                                g2v g2vVar = dsu0Var.b;
                                cad cadVar = dsu0Var.c;
                                m1e m1eVar = dsu0Var.d;
                                gii0 gii0Var = dsu0Var.e;
                                oeg0 oeg0Var = dsu0Var.f;
                                pyg pygVar = dsu0Var.g;
                                ctf0 ctf0Var = dsu0Var.h;
                                knf0 knf0Var = dsu0Var.i;
                                iip iipVar = dsu0Var.j;
                                sjl0 sjl0Var = dsu0Var.l;
                                xri xriVar = dsu0Var.k;
                                zr1 zr1Var = dsu0Var.n;
                                ih5 ih5Var = dsu0Var.m;
                                pygVar.getClass();
                                iipVar.getClass();
                                xriVar.getClass();
                                m1eVar.getClass();
                                gii0Var.getClass();
                                oeg0Var.getClass();
                                ctf0Var.getClass();
                                knf0Var.getClass();
                                sjl0Var.getClass();
                                return new fzi(cadVar, pygVar, xriVar, dujVar, g2vVar, virtualRecommendedEventsParams, sjl0Var, ih5Var, zr1Var);
                            }
                        }
                        jf4.n(b1j.i(dsu0.class, "Cannot create dependency "));
                        return null;
                    default:
                        bzs0 bzs0Var2 = csu0.R1;
                        fiu0 fiu0Var = csu0Var.L1;
                        if (fiu0Var != null) {
                            return fiu0Var;
                        }
                        Intrinsics.h("viewModelFactory");
                        throw null;
                }
            }
        };
        a8z a8zVarA = maz.a(wezVar, new cvs0(new cvs0(this, (byte) 18), (byte) 19));
        this.O1 = agc.G(this, sre0.f32672a.b(esu0.class), new w6u0(a8zVarA, (byte) 10), new w6u0(a8zVarA, (byte) 11), function1);
        this.P1 = new khf0("VIRTUAL_RECOMMENDED_EVENTS_PARAMS");
        this.Q1 = ltt0.o(this, bsu0.f3150a);
    }

    @Override // a.yx5
    public final void C0() {
        fzi fziVar = (fzi) this.N1.getValue();
        this.K1 = fziVar.f10408a;
        this.L1 = new fiu0(Collections.singletonMap(esu0.class, fziVar.j));
    }

    @Override // a.yx5
    public final void D0() {
        Object objN = this.Q1.n(S1[1], this);
        objN.getClass();
        b1j.t(((aid) objN).b, new ugd(-489849191, true, new ggt0(this, (byte) 11)));
    }

    @Override // a.yx5
    /* JADX INFO: renamed from: x0, reason: from getter */
    public final boolean getM1() {
        return this.M1;
    }
}
