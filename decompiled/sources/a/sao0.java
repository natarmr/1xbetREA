package a;

import android.content.ComponentCallbacks2;
import android.os.Bundle;
import com.appsflyer.sdk_base.referrer.Payload;
import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.platform.app.ApplicationLoader;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\u0006B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"La/sao0;", "La/yx5;", "La/cg60;", "La/jhg0;", "<init>", "()V", "a/m6m0", Payload.TYPE_APP}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class sao0 extends yx5 implements cg60, jhg0 {
    public hr00 K1;
    public kt2 L1;
    public oeg0 M1;
    public gle0 N1;
    public final phf0 O1;
    public final cgx0 P1;
    public final yzn0 Q1;
    public final a8z R1;
    public final boolean S1;
    public final n0o0 U1;
    public static final /* synthetic */ iiy[] W1 = {new ez40(sao0.class, "screenTag", "getScreenTag()Ljava/lang/String;", 0), new ez40(sao0.class, "restoredFragment", "getRestoredFragment()Z", 0), new ez40(sao0.class, "initialScreenType", "getInitialScreenType()Lorg/xplatform/core/navigation/nav_bar/NavBarScreenTypes;", 0)};
    public static final m6m0 V1 = new m6m0((byte) 10);

    public sao0() {
        super(R.layout.fragment_tab_container);
        this.O1 = new phf0("ARG_SCREEN_TAG");
        this.P1 = new cgx0("ARG_RESTORED_FRAGMENT");
        this.Q1 = new yzn0("ARG_INITIAL_SCREEN_TYPE");
        final byte b = 0;
        this.R1 = maz.a(wez.b, new Function0(this) { // from class: a.rao0
            public final /* synthetic */ sao0 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                byte b2 = b;
                sao0 sao0Var = this.b;
                switch (b2) {
                    case 0:
                        m6m0 m6m0Var = sao0.V1;
                        return (cb50) sao0Var.Q1.n(sao0Var, sao0.W1[2]);
                    default:
                        m6m0 m6m0Var2 = sao0.V1;
                        return new p270(sao0Var, sao0Var.n0(), sao0Var.C());
                }
            }
        });
        final byte b2 = 1;
        this.S1 = true;
        this.U1 = maz.b(new Function0(this) { // from class: a.rao0
            public final /* synthetic */ sao0 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                byte b3 = b2;
                sao0 sao0Var = this.b;
                switch (b3) {
                    case 0:
                        m6m0 m6m0Var = sao0.V1;
                        return (cb50) sao0Var.Q1.n(sao0Var, sao0.W1[2]);
                    default:
                        m6m0 m6m0Var2 = sao0.V1;
                        return new p270(sao0Var, sao0Var.n0(), sao0Var.C());
                }
            }
        });
    }

    @Override // a.yx5
    public final void C0() {
        ComponentCallbacks2 application = n0().getApplication();
        application.getClass();
        af3 af3Var = application instanceof af3 ? (af3) application : null;
        if (af3Var != null) {
            o5d0 o5d0Var = (o5d0) af3Var.d().get(kvq.class);
            ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
            if (((kvq) (ze3Var instanceof kvq ? ze3Var : null)) != null) {
                ApplicationLoader applicationLoader = ApplicationLoader.v1;
                g8i g8iVarC = xf0.N().c();
                nfi nfiVar = (nfi) xf0.N().p1.getValue();
                g8iVarC.getClass();
                nfiVar.getClass();
                hr00 hr00Var = (hr00) g8iVarC.U3.get();
                x1x.x(hr00Var);
                this.K1 = hr00Var;
                kt2 kt2VarQ = g8iVarC.Q();
                x1x.x(kt2VarQ);
                this.L1 = kt2VarQ;
                oeg0 oeg0Var = (oeg0) g8iVarC.w3.get();
                x1x.x(oeg0Var);
                this.M1 = oeg0Var;
                this.N1 = new gle0();
                return;
            }
        }
        jf4.n(b1j.i(kvq.class, "Cannot create dependency "));
    }

    public final ejc G0() {
        hr00 hr00Var = this.K1;
        if (hr00Var == null) {
            Intrinsics.h("ciceroneHolder");
            throw null;
        }
        return hr00Var.a(H0(), !this.P1.n(this, W1[1]).booleanValue());
    }

    public final cb50 H0() {
        return (cb50) this.R1.getValue();
    }

    @Override // a.yx5, androidx.fragment.app.Fragment
    public final void W(Bundle bundle) {
        this.P1.v(this, W1[1], bundle != null);
        super.W(bundle);
    }

    @Override // androidx.fragment.app.Fragment
    public final void d0() {
        G0().f7902a.f14021a.b = null;
        oeg0 oeg0Var = this.M1;
        if (oeg0Var == null) {
            Intrinsics.h("rootRouterHolder");
            throw null;
        }
        oeg0Var.f25121a.remove(hhg0.f13062a);
        this.j1 = true;
    }

    @Override // a.yx5, androidx.fragment.app.Fragment
    public final void e0() {
        super.e0();
        oeg0 oeg0Var = this.M1;
        if (oeg0Var == null) {
            Intrinsics.h("rootRouterHolder");
            throw null;
        }
        oeg0Var.a(hhg0.f13062a, G0().f7902a);
        G0().f7902a.f14021a.q((rs3) this.U1.getValue());
    }

    @Override // a.jhg0
    public final i1w0 getRouter() {
        return G0().f7902a;
    }

    @Override // a.cg60
    public final boolean j() {
        i0h0 i0h0VarI = C().I(R.id.container);
        cg60 cg60Var = i0h0VarI instanceof cg60 ? (cg60) i0h0VarI : null;
        if (cg60Var != null ? cg60Var.j() : true) {
            if (C().P() != 0) {
                i1w0 i1w0Var = G0().f7902a;
                CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
                ListIterator listIteratorP = b1j.p(copyOnWriteArrayList, new c8d(y7d.f42146a, p0w0.f26173a), i1w0Var, copyOnWriteArrayList, 0);
                while (true) {
                    paw pawVar = (paw) listIteratorP;
                    if (!pawVar.hasNext()) {
                        break;
                    }
                    i1w0Var.a((oe50) pawVar.next());
                }
            } else {
                return true;
            }
        }
        return false;
    }

    @Override // a.yx5
    /* JADX INFO: renamed from: x0, reason: from getter */
    public final boolean getS1() {
        return this.S1;
    }
}
