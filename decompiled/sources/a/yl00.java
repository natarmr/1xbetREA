package a;

import android.content.ComponentCallbacks2;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.method.DigitsKeyListener;
import androidx.fragment.app.Fragment;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import java.util.Collections;
import kotlin.Metadata;
import org.xbet.client1.R;
import org.xplatform.uikit.components.buttons.DsButton;
import org.xplatform.uikit.components.text_field.DsTextField;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"La/yl00;", "La/stl;", "La/zl00;", "<init>", "()V", "a/htz", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class yl00 extends stl<zl00> {
    public fiu0 g2;
    public ii h2;
    public final kiu0 i2;
    public final phf0 j2;
    public final phf0 k2;
    public final nae0 l2;
    public mvu0 m2;
    public static final /* synthetic */ iiy[] o2 = {new ez40(yl00.class, "requestKey", "getRequestKey()Ljava/lang/String;", 0), new ez40(yl00.class, "couponId", "getCouponId()Ljava/lang/String;", 0), new j0d0(yl00.class, "binding", "getBinding()Lorg/xplatform/coupon/impl/databinding/LoadCouponBottomSheetBinding;", 0)};
    public static final htz n2 = new htz();

    public yl00() {
        rcz rczVar = new rcz(this, (byte) 24);
        a8z a8zVarA = maz.a(wez.b, new be00(new be00(this, (byte) 3), (byte) 4));
        this.i2 = agc.G(this, sre0.f32672a.b(xm00.class), new qwv(a8zVarA, (byte) 26), new qwv(a8zVarA, (byte) 27), rczVar);
        this.j2 = new phf0("REQUEST_KEY");
        this.k2 = new phf0("COUPON_ID_KEY");
        this.l2 = ltt0.p(this, xl00.f41051a);
    }

    @Override // a.stl
    public final void S0() {
        String strH = H(R.string.coupon_load);
        strH.getClass();
        I0(new kp8(strH, 0));
        zl00 zl00VarQ0 = Q0();
        DigitsKeyListener digitsKeyListener = DigitsKeyListener.getInstance(H(R.string.promo_available_symbols));
        digitsKeyListener.getClass();
        DsTextField dsTextField = zl00VarQ0.c;
        dsTextField.setKeyListener(digitsKeyListener);
        dsTextField.setRawInputType(96);
        dsTextField.a(new da0(new ebz(this, (byte) 29)));
        dsTextField.setErrorIconDrawableRes(R.drawable.ic_glyph_circle_warning);
        DsButton dsButton = zl00VarQ0.b;
        dsButton.setEnabled(false);
        dyb.N(dsButton, ymx.INTERVAL_400, new u400(this, zl00VarQ0, (byte) 12));
    }

    @Override // a.stl
    public final void U0() throws Exception {
        kiu0 kiu0Var = this.i2;
        p7m0 p7m0Var = ((xm00) kiu0Var.getValue()).g;
        kaw kawVar = new kaw(this, null, (byte) 21);
        lkz lkzVar = lkz.f20223a;
        clz clzVarW = aac.W(this);
        qjj.W(x0x.Q(clzVarW.x()), null, null, new zd00(p7m0Var, clzVarW, kawVar, (yje) null), 3);
        ol60 ol60Var = ((xm00) kiu0Var.getValue()).h;
        pfl pflVar = new pfl(2, this, yl00.class, "onAction", "onAction(Lorg/xplatform/coupon/impl/load_coupon/presentation/LoadCouponViewModel$Action;)V", 4, (byte) 29);
        clz clzVarW2 = aac.W(this);
        qjj.W(x0x.Q(clzVarW2.x()), null, null, new zd00(ol60Var, clzVarW2, pflVar, (yje) null), 3);
    }

    @Override // a.stl
    /* JADX INFO: renamed from: V0, reason: merged with bridge method [inline-methods] */
    public final zl00 Q0() {
        Object objN = this.l2.n(o2[2], this);
        objN.getClass();
        return (zl00) objN;
    }

    @Override // a.stl, a.sik, androidx.fragment.app.Fragment
    public final void W(Bundle bundle) {
        super.W(bundle);
        ComponentCallbacks2 application = n0().getApplication();
        application.getClass();
        af3 af3Var = application instanceof af3 ? (af3) application : null;
        if (af3Var != null) {
            o5d0 o5d0Var = (o5d0) af3Var.d().get(bm00.class);
            ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
            bm00 bm00Var = (bm00) (ze3Var instanceof bm00 ? ze3Var : null);
            if (bm00Var != null) {
                cad cadVar = bm00Var.f2817a;
                gii0 gii0Var = bm00Var.b;
                ctf0 ctf0Var = bm00Var.c;
                duj dujVar = bm00Var.d;
                gst0 gst0Var = bm00Var.e;
                knf0 knf0Var = bm00Var.f;
                zfo zfoVar = bm00Var.g;
                ii iiVar = bm00Var.r;
                ulk ulkVar = bm00Var.h;
                pru pruVar = bm00Var.i;
                r9u r9uVar = bm00Var.j;
                vqc vqcVar = bm00Var.k;
                vwb0 vwb0Var = bm00Var.l;
                edo edoVar = bm00Var.q;
                lye lyeVar = bm00Var.m;
                m0f m0fVar = bm00Var.n;
                ave aveVar = bm00Var.o;
                us3 us3Var = bm00Var.p;
                q7d0 q7d0Var = bm00Var.s;
                rrc rrcVar = bm00Var.t;
                vby vbyVar = bm00Var.u;
                m1e m1eVar = bm00Var.v;
                etj etjVar = bm00Var.w;
                j1q0 j1q0Var = bm00Var.x;
                iiVar.getClass();
                gii0Var.getClass();
                ctf0Var.getClass();
                gst0Var.getClass();
                knf0Var.getClass();
                zfoVar.getClass();
                r9uVar.getClass();
                edoVar.getClass();
                lyeVar.getClass();
                m0fVar.getClass();
                aveVar.getClass();
                us3Var.getClass();
                vwb0Var.getClass();
                q7d0Var.getClass();
                vbyVar.getClass();
                m1eVar.getClass();
                etjVar.getClass();
                j1q0Var.getClass();
                this.g2 = new fiu0(Collections.singletonMap(xm00.class, (tii) new gud(cadVar, vqcVar, iiVar, gii0Var, ctf0Var, dujVar, gst0Var, knf0Var, zfoVar, pruVar, r9uVar, ulkVar, edoVar, lyeVar, m0fVar, aveVar, us3Var, vwb0Var, q7d0Var, rrcVar, vbyVar, etjVar, j1q0Var).v));
                this.h2 = iiVar;
                return;
            }
        }
        jf4.n(b1j.i(bm00.class, "Cannot create dependency "));
    }

    public final void W0(boolean z) {
        if (!z) {
            mvu0 mvu0Var = this.m2;
            if (mvu0Var != null) {
                mvu0Var.y0();
            }
            this.m2 = null;
            return;
        }
        mvu0 mvu0Var2 = new mvu0();
        this.m2 = mvu0Var2;
        androidx.fragment.app.e eVarC = C();
        if (eVarC == null) {
            return;
        }
        Fragment fragmentJ = eVarC.J("mvu0");
        mvu0 mvu0Var3 = fragmentJ instanceof mvu0 ? (mvu0) fragmentJ : null;
        if (mvu0Var3 != null) {
            mvu0Var3.y0();
        }
        mvu0Var2.v0();
        sj3.E0(mvu0Var2, eVarC, "mvu0");
    }

    @Override // androidx.fragment.app.Fragment
    public final void Y() {
        this.j1 = true;
        W0(false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void d0() {
        this.j1 = true;
        j120.Y(this);
    }

    @Override // a.stl, androidx.fragment.app.Fragment
    public final void e0() {
        super.e0();
        Q0().c.requestFocus();
        new Handler(Looper.getMainLooper()).postDelayed(new fy2(o0(), Q0().c, (byte) 2), 500L);
    }

    @Override // a.sik, androidx.fragment.app.Fragment
    public final void g0() {
        super.g0();
        BottomSheetBehavior bottomSheetBehavior = this.c2;
        if (bottomSheetBehavior != null) {
            bottomSheetBehavior.K = true;
        }
        if (bottomSheetBehavior != null) {
            bottomSheetBehavior.N(3);
        }
    }
}
