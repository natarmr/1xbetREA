package a;

import android.os.Bundle;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"La/vp4;", "La/iw5;", "<init>", "()V", "a/jdk0", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class vp4 extends iw5 {
    public final n0o0 k2 = maz.b(new up4(this, (byte) 0));
    public final kiu0 l2;
    public final khf0 m2;
    public static final /* synthetic */ iiy[] o2 = {new ez40(vp4.class, "settings", "getSettings()Lorg/xplatform/authenticator/impl/ui/dialogs/authenticator_filter/models/AuthenticatorFilterDialogSettings;", 0)};
    public static final jdk0 n2 = new jdk0();

    public vp4() {
        pp4 pp4Var = new pp4(new up4(this, (byte) 1), (byte) 3);
        a8z a8zVarA = maz.a(wez.b, new pp4(new pp4(this, (byte) 4), (byte) 5));
        this.l2 = agc.G(this, sre0.f32672a.b(cq4.class), new t51(a8zVarA, (byte) 24), new t51(a8zVarA, (byte) 25), pp4Var);
        this.m2 = new khf0("SETTINGS_EXTRA");
    }

    @Override // a.iw5
    public final bw5 J0(fet fetVar) {
        fetVar.e0(-374539903);
        L0().K = true;
        L0().N(3);
        bw5 bw5Var = new bw5(iw5.O0(1, fetVar), (xdr) null, (ugd) null, u1c.M(2093753650, new un6(this, (byte) 23), fetVar), 14);
        fetVar.r(false);
        return bw5Var;
    }

    @Override // a.iw5
    public final void N0() throws Exception {
        ol60 ol60Var = P0().d;
        cm3 cm3Var = new cm3(this, null, (byte) 13);
        lkz lkzVar = lkz.f20223a;
        clz clzVarW = aac.W(this);
        qjj.W(x0x.Q(clzVarW.x()), null, null, new ac4((gmq) ol60Var, clzVarW, cm3Var, (yje) null, (byte) 0), 3);
    }

    public final cq4 P0() {
        return (cq4) this.l2.getValue();
    }

    @Override // a.sik, androidx.fragment.app.Fragment
    public final void W(Bundle bundle) {
        super.W(bundle);
        sj3.r0(this, "REQUEST_DATA_HISTORY_DIALOG_KEY", new j94(1, P0(), cq4.class, "onDatePickerDialogResult", "onDatePickerDialogResult(Landroid/os/Bundle;)V", 0, (byte) 13));
    }
}
