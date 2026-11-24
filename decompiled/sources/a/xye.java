package a;

import android.content.ComponentCallbacks2;
import android.os.Bundle;
import android.text.TextWatcher;
import android.view.View;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.xbet.client1.R;
import org.xplatform.makebet_promocodes.api.presentation.models.PromoCodeInfoUiModel;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"La/xye;", "La/yx5;", "<init>", "()V", "a/nwd", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class xye extends yx5 {
    public fiu0 K1;
    public ii L1;
    public wdk0 M1;
    public lgn0 N1;
    public iw20 O1;
    public final s0r P1;
    public final kiu0 Q1;
    public final boolean R1;
    public final n0o0 S1;
    public static final /* synthetic */ iiy[] V1 = {new j0d0(xye.class, "binding", "getBinding()Lorg/xplatform/coupon/impl/databinding/CouponPromoBetDsBinding;", 0)};
    public static final nwd U1 = new nwd();

    public xye() {
        super(R.layout.coupon_promo_bet_ds);
        this.P1 = ltt0.o(this, vye.f38244a);
        tye tyeVar = new tye(this, (byte) 0);
        a8z a8zVarA = maz.a(wez.b, new aqe(new aqe(this, (byte) 8), (byte) 9));
        this.Q1 = agc.G(this, sre0.f32672a.b(x920.class), new cce(a8zVarA, (byte) 10), new cce(a8zVarA, (byte) 11), tyeVar);
        this.R1 = true;
        this.S1 = maz.b(new tye(this, (byte) 1));
    }

    @Override // a.yx5
    public final void B0(Bundle bundle) {
        final byte b = 1;
        dyb.O(G0().b, new Function1(this) { // from class: a.uye
            public final /* synthetic */ xye b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                byte b2 = b;
                xye xyeVar = this.b;
                switch (b2) {
                    case 0:
                        PromoCodeInfoUiModel promoCodeInfoUiModel = (PromoCodeInfoUiModel) obj;
                        nwd nwdVar = xye.U1;
                        promoCodeInfoUiModel.getClass();
                        xyeVar.G0().c.setText(promoCodeInfoUiModel.f46775a);
                        break;
                    default:
                        nwd nwdVar2 = xye.U1;
                        ((View) obj).getClass();
                        xyeVar.H0().y(String.valueOf(xyeVar.G0().c.getText()), false);
                        j120.Y(xyeVar);
                        xyeVar.G0().c.clearFocus();
                        break;
                }
                return Unit.f46060a;
            }
        });
        G0().c.setEndIconClickListener(new tye(this, (byte) 3));
        ccq0.V(this, "REQUEST_BET_EXISTS_DIALOG_KEY", new tye(this, (byte) 2));
        final byte b2 = 0;
        sj3.t0(this, "REQUEST_SELECT_PROMO_CODE", new Function1(this) { // from class: a.uye
            public final /* synthetic */ xye b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                byte b3 = b2;
                xye xyeVar = this.b;
                switch (b3) {
                    case 0:
                        PromoCodeInfoUiModel promoCodeInfoUiModel = (PromoCodeInfoUiModel) obj;
                        nwd nwdVar = xye.U1;
                        promoCodeInfoUiModel.getClass();
                        xyeVar.G0().c.setText(promoCodeInfoUiModel.f46775a);
                        break;
                    default:
                        nwd nwdVar2 = xye.U1;
                        ((View) obj).getClass();
                        xyeVar.H0().y(String.valueOf(xyeVar.G0().c.getText()), false);
                        j120.Y(xyeVar);
                        xyeVar.G0().c.clearFocus();
                        break;
                }
                return Unit.f46060a;
            }
        });
        G0().c.a((TextWatcher) this.S1.getValue());
        G0().b.setEnabled(false);
    }

    @Override // a.yx5
    public final void C0() {
        ComponentCallbacks2 application = n0().getApplication();
        application.getClass();
        af3 af3Var = application instanceof af3 ? (af3) application : null;
        if (af3Var != null) {
            o5d0 o5d0Var = (o5d0) af3Var.d().get(sye.class);
            ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
            sye syeVar = (sye) (ze3Var instanceof sye ? ze3Var : null);
            if (syeVar != null) {
                mdi mdiVarA = syeVar.a(a4n0.f(this), true);
                this.K1 = mdiVarA.t();
                this.L1 = (ii) mdiVarA.Y;
                this.M1 = (wdk0) mdiVarA.b0;
                this.N1 = (lgn0) mdiVarA.Z;
                this.O1 = ((clc) ((nr00) mdiVarA.c0).f23980a).f();
                return;
            }
        }
        jf4.n(b1j.i(sye.class, "Cannot create dependency "));
    }

    @Override // a.yx5
    public final void D0() throws Exception {
        ol60 ol60Var = H0().y;
        yje yjeVar = null;
        wye wyeVar = new wye(this, yjeVar, (byte) 2);
        lkz lkzVar = lkz.f20223a;
        clz clzVarW = aac.W(this);
        qjj.W(x0x.Q(clzVarW.x()), null, null, new zpe(ol60Var, clzVarW, wyeVar, (yje) null), 3);
        xae0 xae0VarN = vtb.N(H0().A);
        igb igbVar = new igb((Object) this, yjeVar, (byte) 14);
        clz clzVarW2 = aac.W(this);
        qjj.W(x0x.Q(clzVarW2.x()), null, null, new zpe(xae0VarN, clzVarW2, igbVar, (yje) null), 3);
        xae0 xae0VarN2 = vtb.N(H0().C);
        wye wyeVar2 = new wye(this, yjeVar, (byte) 1);
        clz clzVarW3 = aac.W(this);
        qjj.W(x0x.Q(clzVarW3.x()), null, null, new zpe(xae0VarN2, clzVarW3, wyeVar2, (yje) null, (byte) 0), 3);
        xae0 xae0VarN3 = vtb.N(H0().z);
        wye wyeVar3 = new wye(this, yjeVar, (byte) 0);
        clz clzVarW4 = aac.W(this);
        qjj.W(x0x.Q(clzVarW4.x()), null, null, new zpe(xae0VarN3, clzVarW4, wyeVar3, (yje) null), 3);
    }

    public final w0f G0() {
        Object objN = this.P1.n(V1[0], this);
        objN.getClass();
        return (w0f) objN;
    }

    public final x920 H0() {
        return (x920) this.Q1.getValue();
    }

    @Override // a.yx5
    /* JADX INFO: renamed from: x0, reason: from getter */
    public final boolean getR1() {
        return this.R1;
    }
}
