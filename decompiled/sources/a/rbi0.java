package a;

import android.os.Bundle;
import com.appsflyer.sdk_base.referrer.Payload;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"La/rbi0;", "La/yx5;", "<init>", "()V", "a/gle0", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class rbi0 extends yx5 {
    public final hnm0 K1;
    public gl5 L1;
    public ii M1;
    public ux00 N1;
    public wdk0 O1;
    public final s0r P1;
    public final yzn0 Q1;
    public final a8z R1;
    public final kiu0 S1;
    public static final /* synthetic */ iiy[] V1 = {new j0d0(rbi0.class, "binding", "getBinding()Lorg/xplatform/security/impl/databinding/FragmentSendConfirmSmsBinding;", 0), new ez40(rbi0.class, Payload.TYPE, "getType()Lorg/xplatform/security/api/presentation/models/SendConfirmationSMSType;", 0)};
    public static final gle0 U1 = new gle0();

    public rbi0() {
        super(R.layout.fragment_send_confirm_sms);
        this.K1 = hnm0.f13359a;
        this.P1 = ltt0.o(this, pbi0.f26709a);
        this.Q1 = new yzn0("SEND_CONFIRMATION_FRAGMENT_TYPE");
        obi0 obi0Var = new obi0(this, (byte) 1);
        wez wezVar = wez.b;
        this.R1 = maz.a(wezVar, obi0Var);
        l9i0 l9i0Var = new l9i0(new obi0(this, (byte) 2), (byte) 3);
        a8z a8zVarA = maz.a(wezVar, new l9i0(new l9i0(this, (byte) 4), (byte) 5));
        this.S1 = agc.G(this, sre0.f32672a.b(ldi0.class), new s9i0(a8zVarA, (byte) 2), new s9i0(a8zVarA, (byte) 3), l9i0Var);
    }

    @Override // a.yx5
    public final void B0(Bundle bundle) {
        mc50.a(H0().g, new obi0(this, (byte) 9));
        qcc.X(this, new obi0(this, (byte) 13));
        dyb.O(H0().b, new nbi0(this, (byte) 1));
        dyb.O(H0().d, new nbi0(this, (byte) 2));
        dyb.O(H0().f, new nbi0(this, (byte) 3));
        dyb.O(H0().e, new nbi0(this, (byte) 4));
        dyb.O(H0().c, new nbi0(this, (byte) 5));
    }

    @Override // a.yx5
    public final void C0() {
        mti mtiVar = (mti) this.R1.getValue();
        mtiVar.getClass();
        this.L1 = new gl5((byte) 17);
        this.M1 = mtiVar.w;
        this.N1 = new ux00();
        this.O1 = mtiVar.x;
    }

    @Override // a.yx5
    public final void D0() throws Exception {
        ldi0 ldi0VarI0 = I0();
        yje yjeVar = null;
        byte b = 1;
        dnq dnqVar = new dnq(new fnq(ldi0VarI0.H, new zci0(ldi0VarI0, yjeVar, b)), new sye0(ldi0VarI0, yjeVar, (byte) 6), (byte) 0);
        qbi0 qbi0Var = new qbi0(this, yjeVar, (byte) 0);
        lkz lkzVar = lkz.f20223a;
        clz clzVarW = aac.W(this);
        qjj.W(x0x.Q(clzVarW.x()), null, null, new r7i0(dnqVar, clzVarW, qbi0Var, (yje) null), 3);
        ol60 ol60Var = I0().I;
        qbi0 qbi0Var2 = new qbi0(this, yjeVar, b);
        clz clzVarW2 = aac.W(this);
        qjj.W(x0x.Q(clzVarW2.x()), null, null, new r7i0(ol60Var, clzVarW2, qbi0Var2, (yje) null), 3);
    }

    public final ii G0() {
        ii iiVar = this.M1;
        if (iiVar != null) {
            return iiVar;
        }
        Intrinsics.h("actionDialogManager");
        throw null;
    }

    public final p4r H0() {
        Object objN = this.P1.n(V1[0], this);
        objN.getClass();
        return (p4r) objN;
    }

    public final ldi0 I0() {
        return (ldi0) this.S1.getValue();
    }

    @Override // a.yx5, androidx.fragment.app.Fragment
    public final void W(Bundle bundle) {
        super.W(bundle);
        ccq0.V(this, "REQUEST_EXPIRED_TOKEN_ERROR_DIALOG_KEY", new obi0(this, (byte) 6));
        ccq0.V(this, "REQUEST_VOICE_SMS_CONFIRMATION_KEY", new obi0(this, (byte) 11));
        ccq0.T(this, "REQUEST_VOICE_SMS_CONFIRMATION_KEY", new obi0(this, (byte) 12));
        ccq0.V(this, "REQUEST_TELEGRAM_CONFIRMATION_KEY", new obi0(this, (byte) 4));
        ccq0.T(this, "REQUEST_TELEGRAM_CONFIRMATION_KEY", new obi0(this, (byte) 5));
        ccq0.V(this, "REQUEST_FLASH_CALL_CONFIRMATION_KEY", new obi0(this, (byte) 7));
        ccq0.T(this, "REQUEST_FLASH_CALL_CONFIRMATION_KEY", new obi0(this, (byte) 8));
        ccq0.V(this, "REQUEST_BACK_DIALOG_KEY", new obi0(this, (byte) 3));
        ccq0.V(this, "REQUEST_PROCESS_INTERRUPT_KEY", new obi0(this, (byte) 10));
        C().u0("MULTI_CHOICE_CALLBACK_KEY", this, new ex60(this, (byte) 28));
        if (this.L1 == null) {
            Intrinsics.h("captchaDialogDelegate");
            throw null;
        }
        gl5.k(this, "REQUEST_CAPTCHA_CODE_DIALOG_KEY", new obi0(this, (byte) 14), new nbi0(this, (byte) 0));
        ccq0.V(this, "REQUEST_REQUEST_ERROR_KEY", new obi0(this, (byte) 0));
    }

    @Override // a.yx5
    public final jnm0 y0() {
        return this.K1;
    }
}
