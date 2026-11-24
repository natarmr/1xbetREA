package a;

import android.content.ComponentCallbacks2;
import android.os.Bundle;
import androidx.viewpager2.widget.ViewPager2;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import java.util.Collections;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0007²\u0006\f\u0010\u0006\u001a\u00020\u00058\nX\u008a\u0084\u0002"}, d2 = {"La/yr10;", "La/yx5;", "<init>", "()V", "a/wsz", "La/ru9;", CommonConstant.ReqAccessTokenParam.STATE_LABEL, "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class yr10 extends yx5 {
    public fiu0 K1;
    public yq9 L1;
    public final kiu0 M1;
    public final s0r N1;
    public final cgx0 O1;
    public final r34 P1;
    public final zz2 Q1;
    public static final /* synthetic */ iiy[] S1 = {new j0d0(yr10.class, "binding", "getBinding()Lorg/xplatform/callback/impl/databinding/FragmentCallbackBinding;", 0), new ez40(yr10.class, "showNavBarArg", "getShowNavBarArg()Z", 0), new ez40(yr10.class, "animatedItemId", "getAnimatedItemId()J", 0), new ez40(yr10.class, "initialPage", "getInitialPage()I", 0)};
    public static final wsz R1 = new wsz();

    public yr10() {
        super(R.layout.fragment_callback);
        vr10 vr10Var = new vr10(this, (byte) 1);
        a8z a8zVarA = maz.a(wez.b, new be00(new be00(this, (byte) 24), (byte) 25));
        this.M1 = agc.G(this, sre0.f32672a.b(ds10.class), new j210(a8zVarA, (byte) 16), new j210(a8zVarA, (byte) 17), vr10Var);
        this.N1 = ltt0.o(this, wr10.f39618a);
        this.O1 = new cgx0("SHOW_NAV_BAR");
        this.P1 = new r34("CALLBACK_ANIMATED_ITEM_ID_KEY");
        this.Q1 = new zz2("INITIAL_PAGE");
    }

    @Override // a.yx5
    public final void B0(Bundle bundle) {
        mc50.a(G0().c, new vr10(this, (byte) 0));
        ViewPager2 viewPager2 = G0().e;
        iiy[] iiyVarArr = S1;
        boolean zBooleanValue = this.O1.n(this, iiyVarArr[1]).booleanValue();
        long jLongValue = this.P1.n(this, iiyVarArr[2]).longValue();
        yq9 yq9Var = this.L1;
        if (yq9Var == null) {
            Intrinsics.h("callbackHistoryNewUiEnabled");
            throw null;
        }
        viewPager2.setAdapter(new pu9(this, zBooleanValue, jLongValue, yq9Var.f43065a));
        G0().e.setOffscreenPageLimit(1);
        byte b = 8;
        G0().e.c(new xp6(this, b));
        pkd.i(G0().d, null, new ugd(-118059078, true, new k110(this, G0().e, b)));
        G0().e.e(this.Q1.n(this, iiyVarArr[3]).intValue(), false);
    }

    @Override // a.yx5
    public final void C0() {
        ComponentCallbacks2 application = n0().getApplication();
        application.getClass();
        af3 af3Var = application instanceof af3 ? (af3) application : null;
        if (af3Var != null) {
            o5d0 o5d0Var = (o5d0) af3Var.d().get(rp9.class);
            ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
            rp9 rp9Var = (rp9) (ze3Var instanceof rp9 ? ze3Var : null);
            if (rp9Var != null) {
                zai zaiVarA = rp9Var.a(a4n0.f(this));
                this.K1 = new fiu0(Collections.singletonMap(ds10.class, zaiVarA.h));
                j1q0 j1q0Var = zaiVarA.g;
                j1q0Var.getClass();
                m1q0 m1q0Var = j1q0Var.f15748a;
                m1q0Var.getClass();
                this.L1 = new yq9(m1q0Var.d(ygp.n));
                return;
            }
        }
        jf4.n(b1j.i(rp9.class, "Cannot create dependency "));
    }

    public final vyq G0() {
        Object objN = this.N1.n(S1[0], this);
        objN.getClass();
        return (vyq) objN;
    }

    public final void H0(boolean z) {
        G0().b.setLoading(z);
    }

    @Override // androidx.fragment.app.Fragment
    public final void d0() {
        hxm0.m(q0());
        this.j1 = true;
    }

    @Override // a.yx5, androidx.fragment.app.Fragment
    public final void e0() {
        super.e0();
        hxm0.n(q0());
    }

    @Override // a.yx5
    /* JADX INFO: renamed from: x0 */
    public final boolean getK1() {
        return this.O1.n(this, S1[1]).booleanValue();
    }
}
