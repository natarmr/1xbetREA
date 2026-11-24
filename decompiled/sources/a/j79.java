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
import org.xplatform.game_broadcasting.api.presentation.models.BroadcastingZoneLandscapeParams;
import org.xplatform.game_broadcasting.api.presentation.models.events.BroadcastingLandscapeZoneEvent;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\b²\u0006\f\u0010\u0007\u001a\u00020\u00068\nX\u008a\u0084\u0002"}, d2 = {"La/j79;", "La/yx5;", "La/vbr;", "<init>", "()V", "a/kl5", "La/p79;", "uiState", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class j79 extends yx5 implements vbr {
    public fiu0 K1;
    public final kiu0 L1;
    public final khf0 M1;
    public final s0r N1;
    public static final /* synthetic */ iiy[] P1 = {new ez40(j79.class, "params", "getParams()Lorg/xplatform/game_broadcasting/api/presentation/models/BroadcastingZoneLandscapeParams;", 0), new j0d0(j79.class, "viewBinding", "getViewBinding()Lorg/xplatform/game_broadcasting/impl/databinding/FragmentBroadcastingZoneFullScreenBinding;", 0)};
    public static final kl5 O1 = new kl5();

    public j79() {
        super(R.layout.fragment_broadcasting_zone_full_screen);
        f79 f79Var = new f79(this, (byte) 9);
        a8z a8zVarA = maz.a(wez.b, new h79(new h79(this, (byte) 0), (byte) 1));
        this.L1 = agc.G(this, sre0.f32672a.b(s79.class), new rt6(a8zVarA, (byte) 16), new rt6(a8zVarA, (byte) 17), f79Var);
        this.M1 = new khf0("KEY_PARAMS");
        this.N1 = ltt0.o(this, i79.f14282a);
    }

    @Override // a.yx5
    public final void B0(Bundle bundle) {
        iiy[] iiyVarArr = P1;
        iiy iiyVar = iiyVarArr[1];
        s0r s0rVar = this.N1;
        Object objN = s0rVar.n(iiyVar, this);
        objN.getClass();
        ((uyq) objN).f36504a.setKeepScreenOn(true);
        qcc.X(this, new f79(this, (byte) 0));
        Object objN2 = s0rVar.n(iiyVarArr[1], this);
        objN2.getClass();
        pkd.h(((uyq) objN2).f36504a, qek0.h, null, new ugd(1944672211, true, new tx(this, (byte) 13)));
    }

    @Override // a.yx5
    public final void C0() {
        ComponentCallbacks2 application = n0().getApplication();
        application.getClass();
        af3 af3Var = application instanceof af3 ? (af3) application : null;
        if (af3Var != null) {
            o5d0 o5d0Var = (o5d0) af3Var.d().get(a89.class);
            ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
            a89 a89Var = (a89) (ze3Var instanceof a89 ? ze3Var : null);
            if (a89Var != null) {
                v9i v9iVarA = a89Var.a((BroadcastingZoneLandscapeParams) this.M1.n(this, P1[0]));
                this.K1 = new fiu0(wcf0.g(p89.class, (r5i) v9iVarA.x, s79.class, (r5i) v9iVarA.y));
                return;
            }
        }
        jf4.n(b1j.i(a89.class, "Cannot create dependency "));
    }

    @Override // a.yx5
    public final void D0() {
        gmq gmqVarC = G0().C();
        yp6 yp6Var = new yp6(this, null, (byte) 20);
        lkz lkzVar = lkz.f20223a;
        qjj.W(x0x.Q(this.u1), null, null, new l19((i89) gmqVarC, this, yp6Var, (yje) null), 3);
    }

    public final s79 G0() {
        return (s79) this.L1.getValue();
    }

    public final void H0(BroadcastingLandscapeZoneEvent broadcastingLandscapeZoneEvent) {
        vcc.f0(i120.V(new Pair("KEY_LANDSCAPE_ZONE_REQUEST", broadcastingLandscapeZoneEvent)), this, "KEY_LANDSCAPE_ZONE_REQUEST");
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
        byte b = 1;
        jar0.V(n0(), true);
        if (Build.VERSION.SDK_INT >= 30) {
            return;
        }
        n0().getWindow().getDecorView().setOnSystemUiVisibilityChangeListener(new p59(this, b));
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
