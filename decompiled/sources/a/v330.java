package a;

import android.os.Bundle;
import java.util.Collections;
import kotlin.Metadata;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"La/v330;", "La/yx5;", "<init>", "()V", "a/xuz", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class v330 extends yx5 {
    public final f9o0 K1;
    public final s0r L1;
    public final a8z M1;
    public ii N1;
    public fiu0 O1;
    public final a8z P1;
    public static final /* synthetic */ iiy[] R1 = {new j0d0(v330.class, "viewBinding", "getViewBinding()Lorg/xplatform/sportgame/markets/display_settings/impl/databinding/FragmentMarketsDisplaySettingsBinding;", 0)};
    public static final xuz Q1 = new xuz();

    public v330() {
        super(R.layout.fragment_markets_display_settings);
        this.K1 = new f9o0(R.attr.uikitBackgroundContent);
        this.L1 = ltt0.o(this, u330.f34977a);
        this.M1 = maz.a(wez.b, new q330(this, (byte) 0));
        this.P1 = xbc.b0(this, sre0.f32672a.b(d430.class), new q330(this, (byte) 2));
    }

    @Override // a.yx5
    public final void B0(Bundle bundle) {
        Object objN = this.L1.n(R1[0], this);
        objN.getClass();
        pkd.h(((y1r) objN).f41871a, new owp0(this), null, new ugd(2147295802, true, new tx(this, (byte) 25)));
        ccq0.V(this, "REQUEST_SAVE_SETTINGS_DIALOG_KEY", new q330(this, (byte) 3));
        ccq0.T(this, "REQUEST_SAVE_SETTINGS_DIALOG_KEY", new q330(this, (byte) 4));
        qcc.X(this, new q330(this, (byte) 5));
    }

    @Override // a.yx5
    public final void C0() {
        dli dliVar = (dli) this.M1.getValue();
        this.N1 = dliVar.f6282a;
        this.O1 = new fiu0(Collections.singletonMap(d430.class, dliVar.l));
    }

    public final k3t0 G0() {
        return (k3t0) this.P1.getValue();
    }

    @Override // a.yx5
    public final j9o0 z0() {
        return this.K1;
    }
}
