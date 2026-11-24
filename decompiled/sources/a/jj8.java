package a;

import android.content.ComponentCallbacks2;
import android.os.Bundle;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import kotlin.Metadata;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"La/jj8;", "La/nw5;", "La/ajk;", "<init>", "()V", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class jj8 extends nw5<ajk> {
    public static final /* synthetic */ iiy[] i2 = {new j0d0(jj8.class, "binding", "getBinding()Lorg/xplatform/games_section/feature/bonuses_info/impl/databinding/DialogOneXGamesBonusesInfoBinding;", 0)};
    public fiu0 e2;
    public final nae0 f2 = ltt0.p(this, ij8.f14861a);
    public final kiu0 g2;
    public final n0o0 h2;

    public jj8() {
        vb8 vb8Var = new vb8(this, (byte) 3);
        a8z a8zVarA = maz.a(wez.b, new p46(new p46(this, (byte) 26), (byte) 27));
        this.g2 = agc.G(this, sre0.f32672a.b(yj8.class), new rt6(a8zVarA, (byte) 12), new rt6(a8zVarA, (byte) 13), vb8Var);
        this.h2 = maz.b(new ej8((byte) 1));
    }

    @Override // a.sik
    public final int B0() {
        return R.style.ThemeOverlay_AppTheme_BottomSheetDialog;
    }

    @Override // a.nw5
    public final int I0() {
        return R.attr.uikitBackgroundContent;
    }

    @Override // a.nw5
    public final void O0() {
        L0().e.m(new wn8(epv0.U(R.drawable.divider_drawable_opacity_with_spaces, L0().f980a.getContext()), (byte) 1));
        L0().e.setLayoutManager(new LinearLayoutManager(D()));
        L0().e.setAdapter((ls60) this.h2.getValue());
    }

    @Override // a.nw5
    public final void P0() {
        ComponentCallbacks2 application = n0().getApplication();
        application.getClass();
        af3 af3Var = application instanceof af3 ? (af3) application : null;
        if (af3Var != null) {
            o5d0 o5d0Var = (o5d0) af3Var.d().get(hj8.class);
            ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
            hj8 hj8Var = (hj8) (ze3Var instanceof hj8 ? ze3Var : null);
            if (hj8Var != null) {
                this.e2 = hj8Var.a(a4n0.f(this)).e0();
                return;
            }
        }
        jf4.n(b1j.i(hj8.class, "Cannot create dependency "));
    }

    @Override // a.nw5
    public final int Q0() {
        return R.id.dialog_one_x_games_bonuses_info;
    }

    @Override // a.nw5
    /* JADX INFO: renamed from: T0, reason: merged with bridge method [inline-methods] */
    public final ajk L0() {
        Object objN = this.f2.n(i2[0], this);
        objN.getClass();
        return (ajk) objN;
    }

    @Override // a.sik, androidx.fragment.app.Fragment
    public final void g0() {
        super.g0();
        BottomSheetBehavior bottomSheetBehaviorM0 = M0();
        if (bottomSheetBehaviorM0 != null) {
            bottomSheetBehaviorM0.K = true;
        }
        J0();
    }

    @Override // a.nw5, androidx.fragment.app.Fragment
    public final void i0(View view, Bundle bundle) throws Exception {
        view.getClass();
        super.i0(view, bundle);
        p7m0 p7m0Var = ((yj8) this.g2.getValue()).i;
        yp6 yp6Var = new yp6(this, null, (byte) 15);
        lkz lkzVar = lkz.f20223a;
        clz clzVarW = aac.W(this);
        qjj.W(x0x.Q(clzVarW.x()), null, null, new u47(p7m0Var, clzVarW, yp6Var, (yje) null, (byte) 0), 3);
    }
}
