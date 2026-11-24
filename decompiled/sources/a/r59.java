package a;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;
import org.xplatform.game_broadcasting.api.presentation.models.BroadcastingVideoLandscapeParams;
import org.xplatform.game_broadcasting.api.presentation.models.events.BroadcastingLandscapeVideoEvent;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\b²\u0006\f\u0010\u0007\u001a\u00020\u00068\nX\u008a\u0084\u0002"}, d2 = {"La/r59;", "La/yx5;", "La/vbr;", "<init>", "()V", "a/cl5", "La/a69;", "uiState", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class r59 extends yx5 implements vbr {
    public fiu0 K1;
    public ii L1;
    public final kiu0 M1;
    public final khf0 N1;
    public final s0r O1;
    public static final /* synthetic */ iiy[] Q1 = {new ez40(r59.class, "params", "getParams()Lorg/xplatform/game_broadcasting/api/presentation/models/BroadcastingVideoLandscapeParams;", 0), new j0d0(r59.class, "viewBinding", "getViewBinding()Lorg/xplatform/game_broadcasting/impl/databinding/FragmentBroadcastingVideoFullScreenBinding;", 0)};
    public static final cl5 P1 = new cl5((byte) 12);

    public r59() {
        super(R.layout.fragment_broadcasting_video_full_screen);
        o59 o59Var = new o59(this, (byte) 14);
        a8z a8zVarA = maz.a(wez.b, new p46(new p46(this, (byte) 28), (byte) 29));
        this.M1 = agc.G(this, sre0.f32672a.b(k69.class), new rt6(a8zVarA, (byte) 14), new rt6(a8zVarA, (byte) 15), o59Var);
        this.N1 = new khf0("KEY_PARAMS");
        this.O1 = ltt0.o(this, q59.f28140a);
    }

    @Override // a.yx5
    public final void B0(Bundle bundle) {
        iiy[] iiyVarArr = Q1;
        iiy iiyVar = iiyVarArr[1];
        s0r s0rVar = this.O1;
        Object objN = s0rVar.n(iiyVar, this);
        objN.getClass();
        ((tyq) objN).f34768a.setKeepScreenOn(true);
        qcc.X(this, new o59(this, (byte) 0));
        ccq0.V(this, "REQUEST_BIND_PHONE_DIALOG_KEY", new o59(this, (byte) 8));
        ccq0.T(this, "REQUEST_BIND_PHONE_DIALOG_KEY", new o59(this, (byte) 11));
        ccq0.V(this, "REQUEST_ACTIVATE_PHONE_DIALOG_KEY", new o59(this, (byte) 12));
        ccq0.T(this, "REQUEST_ACTIVATE_PHONE_DIALOG_KEY", new o59(this, (byte) 13));
        Object objN2 = s0rVar.n(iiyVarArr[1], this);
        objN2.getClass();
        pkd.h(((tyq) objN2).f34768a, qek0.h, null, new ugd(-950379612, true, new tx(this, (byte) 12)));
    }

    @Override // a.yx5
    public final void C0() {
        ComponentCallbacks2 application = n0().getApplication();
        application.getClass();
        af3 af3Var = application instanceof af3 ? (af3) application : null;
        if (af3Var != null) {
            o5d0 o5d0Var = (o5d0) af3Var.d().get(n59.class);
            ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
            n59 n59Var = (n59) (ze3Var instanceof n59 ? ze3Var : null);
            if (n59Var != null) {
                BroadcastingVideoLandscapeParams broadcastingVideoLandscapeParams = (BroadcastingVideoLandscapeParams) this.N1.n(this, Q1[0]);
                us00 us00Var = n59Var.f22932a;
                oeg0 oeg0Var = n59Var.b;
                m1e m1eVar = n59Var.c;
                cad cadVar = n59Var.d;
                btt0 btt0Var = n59Var.e;
                gii0 gii0Var = n59Var.f;
                gst0 gst0Var = n59Var.g;
                azj0 azj0Var = n59Var.h;
                nhv0 nhv0Var = n59Var.i;
                ysr ysrVar = n59Var.j;
                m49 m49Var = n59Var.m;
                n49 n49Var = n59Var.n;
                atr atrVar = n59Var.k;
                rsr rsrVar = n59Var.l;
                meu0 meu0Var = n59Var.o;
                mi70 mi70Var = n59Var.p;
                b3c0 b3c0Var = n59Var.q;
                ii iiVar = n59Var.r;
                ik4 ik4Var = n59Var.s;
                vd1 vd1Var = n59Var.t;
                pru pruVar = n59Var.u;
                g2v g2vVar = n59Var.v;
                tgk tgkVar = n59Var.w;
                us3 us3Var = n59Var.x;
                knf0 knf0Var = n59Var.y;
                ctf0 ctf0Var = n59Var.z;
                r9u r9uVar = n59Var.A;
                c49 c49Var = n59Var.B;
                viu viuVar = n59Var.C;
                oeg0Var.getClass();
                btt0Var.getClass();
                gii0Var.getClass();
                gst0Var.getClass();
                azj0Var.getClass();
                nhv0Var.getClass();
                ysrVar.getClass();
                atrVar.getClass();
                rsrVar.getClass();
                m49Var.getClass();
                n49Var.getClass();
                meu0Var.getClass();
                b3c0Var.getClass();
                iiVar.getClass();
                tgkVar.getClass();
                knf0Var.getClass();
                us3Var.getClass();
                ctf0Var.getClass();
                r9uVar.getClass();
                m1eVar.getClass();
                c49Var.getClass();
                this.K1 = new fiu0(wcf0.h(k69.class, (r5i) new tai(cadVar, us00Var, oeg0Var, broadcastingVideoLandscapeParams, btt0Var, gii0Var, gst0Var, azj0Var, nhv0Var, ysrVar, atrVar, rsrVar, m49Var, n49Var, meu0Var, mi70Var, b3c0Var, iiVar, ik4Var, vd1Var, pruVar, g2vVar, tgkVar, knf0Var, us3Var, r9uVar, m1eVar, c49Var, viuVar).G));
                this.L1 = iiVar;
                return;
            }
        }
        jf4.n(b1j.i(n59.class, "Cannot create dependency "));
    }

    @Override // a.yx5
    public final void D0() {
        gmq gmqVarC = G0().C();
        yp6 yp6Var = new yp6(this, null, (byte) 19);
        lkz lkzVar = lkz.f20223a;
        qjj.W(x0x.Q(this.u1), null, null, new l19((i89) gmqVarC, this, yp6Var, (yje) null), 3);
    }

    public final k69 G0() {
        return (k69) this.M1.getValue();
    }

    public final void H0(BroadcastingLandscapeVideoEvent broadcastingLandscapeVideoEvent) {
        vcc.f0(i120.V(new Pair("KEY_LANDSCAPE_VIDEO_REQUEST", broadcastingLandscapeVideoEvent)), this, "KEY_LANDSCAPE_VIDEO_REQUEST");
    }

    @Override // a.yx5, androidx.fragment.app.Fragment
    public final void V(Context context) {
        super.V(context);
        kxq kxqVarN0 = n0();
        if (kxqVarN0.getRequestedOrientation() != 10) {
            kxqVarN0.setRequestedOrientation(10);
        }
    }

    @Override // a.yx5, androidx.fragment.app.Fragment
    public final void Z() {
        Object next;
        List listP = F().c.p();
        listP.getClass();
        Iterator it = listP.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!Intrinsics.d((Fragment) next, this));
        if (((Fragment) next) == null) {
            n0().setRequestedOrientation(1);
        }
        super.Z();
    }

    @Override // a.yx5, androidx.fragment.app.Fragment
    public final void g0() {
        super.g0();
        jar0.V(n0(), true);
        if (Build.VERSION.SDK_INT >= 30) {
            return;
        }
        n0().getWindow().getDecorView().setOnSystemUiVisibilityChangeListener(new p59(this, (byte) 0));
    }

    @Override // androidx.fragment.app.Fragment
    public final void h0() {
        this.j1 = true;
        jar0.V(n0(), false);
        if (Build.VERSION.SDK_INT >= 30) {
            return;
        }
        n0().getWindow().getDecorView().setOnSystemUiVisibilityChangeListener(null);
    }
}
