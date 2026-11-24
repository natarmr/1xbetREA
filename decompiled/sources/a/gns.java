package a;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"La/gns;", "La/yx5;", "<init>", "()V", "a/pek", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class gns extends yx5 {
    public ii K1;
    public wdk0 L1;
    public final a8z M1;
    public final a8z N1;
    public final ywq O1;
    public final s0r P1;
    public final khf0 Q1;
    public static final /* synthetic */ iiy[] S1 = {new j0d0(gns.class, "binding", "getBinding()Lorg/xplatform/uikit/databinding/ComposeFragmentBinding;", 0), new ez40(gns.class, "screenParams", "getScreenParams()Lorg/xplatform/feed/notifictation/presentation/models/GameNotificationScreenParams;", 0)};
    public static final pek R1 = new pek();

    public gns() {
        super(R.layout.compose_fragment);
        this.M1 = maz.a(wez.b, new cns(this, (byte) 2));
        this.N1 = xbc.a0(this, sre0.f32672a.b(zns.class), null, new cns(this, (byte) 3), 14);
        this.O1 = m0(new yl3(this, (byte) 8), new xn((byte) 7));
        this.P1 = ltt0.o(this, dns.f6385a);
        this.Q1 = new khf0("screen_params");
    }

    public static boolean H0(androidx.fragment.app.e eVar) {
        List listP = eVar.c.p();
        listP.getClass();
        if (listP.isEmpty()) {
            return false;
        }
        Iterator it = listP.iterator();
        while (it.hasNext()) {
            if (((Fragment) it.next()).getClass().getSimpleName().equals(u0i.class.getSimpleName())) {
                return true;
            }
        }
        return false;
    }

    @Override // a.yx5
    public final void B0(Bundle bundle) {
        qcc.X(this, new cns(this, (byte) 0));
        Object objN = this.P1.n(S1[0], this);
        objN.getClass();
        b1j.t(((aid) objN).f919a, new ugd(-1498224241, true, new jar(this, (byte) 17)));
    }

    @Override // a.yx5
    public final void C0() {
        whi whiVar = (whi) this.M1.getValue();
        this.K1 = whiVar.r;
        this.L1 = whiVar.s;
    }

    public final k3t0 G0() {
        return (k3t0) this.N1.getValue();
    }

    @Override // a.yx5, androidx.fragment.app.Fragment
    public final void W(Bundle bundle) {
        super.W(bundle);
        ccq0.V(this, "REQUEST_SYSTEM_NOTIFICATION_SETTINGS_DIALOG_KEY", new cns(this, (byte) 4));
        ccq0.T(this, "REQUEST_SYSTEM_NOTIFICATION_SETTINGS_DIALOG_KEY", new cns(this, (byte) 5));
        ccq0.V(this, "REQUEST_SETTINGS_PUSH_DIALOG_KEY", new cns(this, (byte) 6));
        ccq0.T(this, "REQUEST_SETTINGS_PUSH_DIALOG_KEY", new cns(this, (byte) 7));
        ccq0.V(this, "REQUEST_SELF_EXCLUSION_ERROR_DIALOG_KEY", new cns(this, (byte) 8));
    }

    @Override // androidx.fragment.app.Fragment
    public final void Y() {
        this.O1.b();
        this.j1 = true;
    }
}
