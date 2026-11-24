package a;

import android.content.ComponentCallbacks2;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import androidx.activity.result.ActivityResult;
import kotlin.Metadata;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"La/bed0;", "La/yx5;", "<init>", "()V", "a/fl70", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class bed0 extends yx5 {
    public final hnm0 K1;
    public kqi L1;
    public ii M1;
    public wdk0 N1;
    public final kiu0 O1;
    public final s0r P1;
    public final ywq Q1;
    public final ywq R1;
    public final ywq S1;
    public static final /* synthetic */ iiy[] V1 = {new j0d0(bed0.class, "viewBinding", "getViewBinding()Lorg/xplatform/features/notification_settings/impl/databinding/FragmentNotificationSettingsBinding;", 0)};
    public static final fl70 U1 = new fl70();

    public bed0() {
        super(R.layout.fragment_notification_settings);
        this.K1 = hnm0.f13359a;
        final byte b = 2;
        xdd0 xdd0Var = new xdd0(this, (byte) 2);
        a8z a8zVarA = maz.a(wez.b, new f1d0(new f1d0(this, (byte) 5), (byte) 6));
        this.O1 = agc.G(this, sre0.f32672a.b(ned0.class), new ync0(a8zVarA, (byte) 8), new ync0(a8zVarA, (byte) 9), xdd0Var);
        this.P1 = ltt0.o(this, aed0.f722a);
        final byte b2 = 0;
        this.Q1 = m0(new wn(this) { // from class: a.zdd0
            public final /* synthetic */ bed0 b;

            {
                this.b = this;
            }

            @Override // a.wn
            public final void a(Object obj) {
                Intent intent;
                Uri uri;
                byte b3 = b2;
                bed0 bed0Var = this.b;
                switch (b3) {
                    case 0:
                        ActivityResult activityResult = (ActivityResult) obj;
                        fl70 fl70Var = bed0.U1;
                        if (activityResult.f45280a == -1 && (intent = activityResult.b) != null && (uri = (Uri) x2x.U(intent, "android.intent.extra.ringtone.PICKED_URI", Uri.class)) != null) {
                            String string = uri.toString();
                            string.getClass();
                            p4i0 p4i0Var = new p4i0(string, Integer.valueOf(intent.getFlags()));
                            ned0 ned0VarH0 = bed0Var.H0();
                            sac.V(jiu0.a(ned0VarH0), new ded0(ned0VarH0, (byte) 0), null, ned0VarH0.i.b, new s9c0(ned0VarH0, p4i0Var, null, (byte) 9), 10);
                        }
                        break;
                    case 1:
                        fl70 fl70Var2 = bed0.U1;
                        bed0Var.H0().z(true);
                        break;
                    default:
                        fl70 fl70Var3 = bed0.U1;
                        bed0Var.H0().y(true);
                        break;
                }
            }
        }, new xn((byte) 4));
        byte b3 = 7;
        final byte b4 = 1;
        this.R1 = m0(new wn(this) { // from class: a.zdd0
            public final /* synthetic */ bed0 b;

            {
                this.b = this;
            }

            @Override // a.wn
            public final void a(Object obj) {
                Intent intent;
                Uri uri;
                byte b5 = b4;
                bed0 bed0Var = this.b;
                switch (b5) {
                    case 0:
                        ActivityResult activityResult = (ActivityResult) obj;
                        fl70 fl70Var = bed0.U1;
                        if (activityResult.f45280a == -1 && (intent = activityResult.b) != null && (uri = (Uri) x2x.U(intent, "android.intent.extra.ringtone.PICKED_URI", Uri.class)) != null) {
                            String string = uri.toString();
                            string.getClass();
                            p4i0 p4i0Var = new p4i0(string, Integer.valueOf(intent.getFlags()));
                            ned0 ned0VarH0 = bed0Var.H0();
                            sac.V(jiu0.a(ned0VarH0), new ded0(ned0VarH0, (byte) 0), null, ned0VarH0.i.b, new s9c0(ned0VarH0, p4i0Var, null, (byte) 9), 10);
                        }
                        break;
                    case 1:
                        fl70 fl70Var2 = bed0.U1;
                        bed0Var.H0().z(true);
                        break;
                    default:
                        fl70 fl70Var3 = bed0.U1;
                        bed0Var.H0().y(true);
                        break;
                }
            }
        }, new xn(b3));
        this.S1 = m0(new wn(this) { // from class: a.zdd0
            public final /* synthetic */ bed0 b;

            {
                this.b = this;
            }

            @Override // a.wn
            public final void a(Object obj) {
                Intent intent;
                Uri uri;
                byte b5 = b;
                bed0 bed0Var = this.b;
                switch (b5) {
                    case 0:
                        ActivityResult activityResult = (ActivityResult) obj;
                        fl70 fl70Var = bed0.U1;
                        if (activityResult.f45280a == -1 && (intent = activityResult.b) != null && (uri = (Uri) x2x.U(intent, "android.intent.extra.ringtone.PICKED_URI", Uri.class)) != null) {
                            String string = uri.toString();
                            string.getClass();
                            p4i0 p4i0Var = new p4i0(string, Integer.valueOf(intent.getFlags()));
                            ned0 ned0VarH0 = bed0Var.H0();
                            sac.V(jiu0.a(ned0VarH0), new ded0(ned0VarH0, (byte) 0), null, ned0VarH0.i.b, new s9c0(ned0VarH0, p4i0Var, null, (byte) 9), 10);
                        }
                        break;
                    case 1:
                        fl70 fl70Var2 = bed0.U1;
                        bed0Var.H0().z(true);
                        break;
                    default:
                        fl70 fl70Var3 = bed0.U1;
                        bed0Var.H0().y(true);
                        break;
                }
            }
        }, new xn(b3));
    }

    @Override // a.yx5
    public final void B0(Bundle bundle) {
        mc50.a(G0().e, new xdd0(this, (byte) 0));
        qcc.X(this, new xdd0(this, (byte) 1));
        ccq0.V(this, "REQUEST_SETTINGS_PUSH_DIALOG_KEY", new xdd0(this, (byte) 3));
        ccq0.T(this, "REQUEST_SETTINGS_PUSH_DIALOG_KEY", new xdd0(this, (byte) 4));
        ccq0.V(this, "REQUEST_SETTINGS_PUSH_FAVORITE_DIALOG_KEY", new xdd0(this, (byte) 5));
        ccq0.T(this, "REQUEST_SETTINGS_PUSH_FAVORITE_DIALOG_KEY", new xdd0(this, (byte) 6));
    }

    @Override // a.yx5
    public final void C0() {
        ComponentCallbacks2 application = n0().getApplication();
        application.getClass();
        af3 af3Var = application instanceof af3 ? (af3) application : null;
        if (af3Var != null) {
            o5d0 o5d0Var = (o5d0) af3Var.d().get(ced0.class);
            ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
            ced0 ced0Var = (ced0) (ze3Var instanceof ced0 ? ze3Var : null);
            if (ced0Var != null) {
                cad cadVar = ced0Var.f4206a;
                duj dujVar = ced0Var.b;
                yox yoxVar = ced0Var.c;
                iw20 iw20Var = ced0Var.d;
                gst0 gst0Var = ced0Var.e;
                v6j0 v6j0Var = ced0Var.f;
                btt0 btt0Var = ced0Var.g;
                ii iiVar = ced0Var.h;
                b3c0 b3c0Var = ced0Var.i;
                kt2 kt2Var = ced0Var.j;
                wdd0 wdd0Var = ced0Var.k;
                hru hruVar = ced0Var.l;
                us3 us3Var = ced0Var.m;
                q7d0 q7d0Var = ced0Var.n;
                vwb0 vwb0Var = ced0Var.o;
                wdk0 wdk0Var = ced0Var.p;
                ix0 ix0Var = ced0Var.q;
                us00 us00Var = ced0Var.r;
                wdd0Var.getClass();
                iiVar.getClass();
                gst0Var.getClass();
                v6j0Var.getClass();
                btt0Var.getClass();
                b3c0Var.getClass();
                kt2Var.getClass();
                us3Var.getClass();
                q7d0Var.getClass();
                vwb0Var.getClass();
                wdk0Var.getClass();
                this.L1 = (kqi) ((n5d0) new v7i(cadVar, yoxVar, iw20Var, wdd0Var, dujVar, iiVar, gst0Var, b3c0Var, kt2Var, hruVar, us3Var, q7d0Var, vwb0Var, wdk0Var, ix0Var, us00Var).o).get();
                this.M1 = iiVar;
                this.N1 = wdk0Var;
                return;
            }
        }
        jf4.n(b1j.i(ced0.class, "Cannot create dependency "));
    }

    @Override // a.yx5
    public final void D0() {
        ol60 ol60Var = H0().z;
        jjc0 jjc0Var = new jjc0(2, this, bed0.class, "handleUiEvents", "handleUiEvents(Lorg/xplatform/features/notification_settings/impl/presentation/PushNotificationSettingsViewModel$UiEvent;)V", 4, (byte) 7);
        lkz lkzVar = lkz.f20223a;
        qjj.W(x0x.Q(this.u1), null, null, new fxc0((gmq) ol60Var, this, jjc0Var, (yje) null), 3);
    }

    public final f2r G0() {
        Object objN = this.P1.n(V1[0], this);
        objN.getClass();
        return (f2r) objN;
    }

    public final ned0 H0() {
        return (ned0) this.O1.getValue();
    }

    @Override // androidx.fragment.app.Fragment
    public final void Y() {
        this.Q1.b();
        this.R1.b();
        this.j1 = true;
    }

    @Override // a.yx5, androidx.fragment.app.Fragment
    public final void e0() {
        super.e0();
        ned0 ned0VarH0 = H0();
        sac.V(jiu0.a(ned0VarH0), new ded0(ned0VarH0, (byte) 1), null, ned0VarH0.i.b, new led0(ned0VarH0, null, (byte) 0), 10);
    }

    @Override // a.yx5
    public final jnm0 y0() {
        return this.K1;
    }
}
