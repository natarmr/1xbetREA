package a;

import android.os.Bundle;
import android.view.View;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"La/njd0;", "La/yx5;", "<init>", "()V", "a/nh70", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class njd0 extends yx5 {
    public sqi K1;
    public ii L1;
    public wdk0 M1;
    public final kiu0 N1;
    public final s0r O1;
    public final a8z P1;
    public final yzn0 Q1;
    public final es R1;
    public static final /* synthetic */ iiy[] U1 = {new j0d0(njd0.class, "binding", "getBinding()Lorg/xplatform/authqr/impl/databinding/FragmentQrSendConfirmationSmsBinding;", 0), new ez40(njd0.class, "temporaryToken", "getTemporaryToken()Lorg/xplatform/onexuser/domain/models/TemporaryToken;", 0), new ez40(njd0.class, "availableActivationTypeList", "getAvailableActivationTypeList()Ljava/util/List;", 0)};
    public static final nh70 S1 = new nh70();

    public njd0() {
        super(R.layout.fragment_qr_send_confirmation_sms);
        jjd0 jjd0Var = new jjd0(this, (byte) 5);
        f1d0 f1d0Var = new f1d0(this, (byte) 17);
        wez wezVar = wez.b;
        a8z a8zVarA = maz.a(wezVar, new f1d0(f1d0Var, (byte) 18));
        this.N1 = agc.G(this, sre0.f32672a.b(fkd0.class), new ync0(a8zVarA, (byte) 20), new ync0(a8zVarA, (byte) 21), jjd0Var);
        this.O1 = ltt0.o(this, ljd0.f20145a);
        this.P1 = maz.a(wezVar, new jjd0(this, (byte) 6));
        this.Q1 = new yzn0("TEMPORARY_TOKEN_KEY");
        this.R1 = new es("ACTIVATION_TYPE_LIST");
    }

    @Override // a.yx5
    public final void B0(Bundle bundle) {
        H0().f.b(new jjd0(this, (byte) 4));
        final byte b = 0;
        dyb.O(H0().c, new Function1(this) { // from class: a.kjd0
            public final /* synthetic */ njd0 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                byte b2 = b;
                njd0 njd0Var = this.b;
                View view = (View) obj;
                switch (b2) {
                    case 0:
                        nh70 nh70Var = njd0.S1;
                        view.getClass();
                        fkd0 fkd0VarI0 = njd0Var.I0();
                        fkd0VarI0.j.f(hfi0.SMS);
                        sac.V(jiu0.a(fkd0VarI0), new prc0(1, fkd0VarI0, fkd0.class, "handleError", "handleError(Ljava/lang/Throwable;)V", 0, (byte) 14), null, fkd0VarI0.f.b, new zjd0(fkd0VarI0, null, (byte) 1), 10);
                        break;
                    case 1:
                        nh70 nh70Var2 = njd0.S1;
                        view.getClass();
                        fkd0 fkd0VarI1 = njd0Var.I0();
                        fkd0VarI1.j.f(hfi0.VOICE_SMS);
                        fkd0VarI1.y(wjd0.f39258a);
                        break;
                    case 2:
                        nh70 nh70Var3 = njd0.S1;
                        view.getClass();
                        fkd0 fkd0VarI2 = njd0Var.I0();
                        fkd0VarI2.j.f(hfi0.TELEGRAM);
                        fkd0VarI2.y(vjd0.f37522a);
                        break;
                    default:
                        nh70 nh70Var4 = njd0.S1;
                        view.getClass();
                        njd0Var.I0().y(sjd0.f32299a);
                        break;
                }
                return Unit.f46060a;
            }
        });
        final byte b2 = 1;
        dyb.O(H0().e, new Function1(this) { // from class: a.kjd0
            public final /* synthetic */ njd0 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                byte b3 = b2;
                njd0 njd0Var = this.b;
                View view = (View) obj;
                switch (b3) {
                    case 0:
                        nh70 nh70Var = njd0.S1;
                        view.getClass();
                        fkd0 fkd0VarI0 = njd0Var.I0();
                        fkd0VarI0.j.f(hfi0.SMS);
                        sac.V(jiu0.a(fkd0VarI0), new prc0(1, fkd0VarI0, fkd0.class, "handleError", "handleError(Ljava/lang/Throwable;)V", 0, (byte) 14), null, fkd0VarI0.f.b, new zjd0(fkd0VarI0, null, (byte) 1), 10);
                        break;
                    case 1:
                        nh70 nh70Var2 = njd0.S1;
                        view.getClass();
                        fkd0 fkd0VarI1 = njd0Var.I0();
                        fkd0VarI1.j.f(hfi0.VOICE_SMS);
                        fkd0VarI1.y(wjd0.f39258a);
                        break;
                    case 2:
                        nh70 nh70Var3 = njd0.S1;
                        view.getClass();
                        fkd0 fkd0VarI2 = njd0Var.I0();
                        fkd0VarI2.j.f(hfi0.TELEGRAM);
                        fkd0VarI2.y(vjd0.f37522a);
                        break;
                    default:
                        nh70 nh70Var4 = njd0.S1;
                        view.getClass();
                        njd0Var.I0().y(sjd0.f32299a);
                        break;
                }
                return Unit.f46060a;
            }
        });
        final byte b3 = 2;
        dyb.O(H0().d, new Function1(this) { // from class: a.kjd0
            public final /* synthetic */ njd0 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                byte b4 = b3;
                njd0 njd0Var = this.b;
                View view = (View) obj;
                switch (b4) {
                    case 0:
                        nh70 nh70Var = njd0.S1;
                        view.getClass();
                        fkd0 fkd0VarI0 = njd0Var.I0();
                        fkd0VarI0.j.f(hfi0.SMS);
                        sac.V(jiu0.a(fkd0VarI0), new prc0(1, fkd0VarI0, fkd0.class, "handleError", "handleError(Ljava/lang/Throwable;)V", 0, (byte) 14), null, fkd0VarI0.f.b, new zjd0(fkd0VarI0, null, (byte) 1), 10);
                        break;
                    case 1:
                        nh70 nh70Var2 = njd0.S1;
                        view.getClass();
                        fkd0 fkd0VarI1 = njd0Var.I0();
                        fkd0VarI1.j.f(hfi0.VOICE_SMS);
                        fkd0VarI1.y(wjd0.f39258a);
                        break;
                    case 2:
                        nh70 nh70Var3 = njd0.S1;
                        view.getClass();
                        fkd0 fkd0VarI2 = njd0Var.I0();
                        fkd0VarI2.j.f(hfi0.TELEGRAM);
                        fkd0VarI2.y(vjd0.f37522a);
                        break;
                    default:
                        nh70 nh70Var4 = njd0.S1;
                        view.getClass();
                        njd0Var.I0().y(sjd0.f32299a);
                        break;
                }
                return Unit.f46060a;
            }
        });
        final byte b4 = 3;
        dyb.O(H0().b, new Function1(this) { // from class: a.kjd0
            public final /* synthetic */ njd0 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                byte b5 = b4;
                njd0 njd0Var = this.b;
                View view = (View) obj;
                switch (b5) {
                    case 0:
                        nh70 nh70Var = njd0.S1;
                        view.getClass();
                        fkd0 fkd0VarI0 = njd0Var.I0();
                        fkd0VarI0.j.f(hfi0.SMS);
                        sac.V(jiu0.a(fkd0VarI0), new prc0(1, fkd0VarI0, fkd0.class, "handleError", "handleError(Ljava/lang/Throwable;)V", 0, (byte) 14), null, fkd0VarI0.f.b, new zjd0(fkd0VarI0, null, (byte) 1), 10);
                        break;
                    case 1:
                        nh70 nh70Var2 = njd0.S1;
                        view.getClass();
                        fkd0 fkd0VarI1 = njd0Var.I0();
                        fkd0VarI1.j.f(hfi0.VOICE_SMS);
                        fkd0VarI1.y(wjd0.f39258a);
                        break;
                    case 2:
                        nh70 nh70Var3 = njd0.S1;
                        view.getClass();
                        fkd0 fkd0VarI2 = njd0Var.I0();
                        fkd0VarI2.j.f(hfi0.TELEGRAM);
                        fkd0VarI2.y(vjd0.f37522a);
                        break;
                    default:
                        nh70 nh70Var4 = njd0.S1;
                        view.getClass();
                        njd0Var.I0().y(sjd0.f32299a);
                        break;
                }
                return Unit.f46060a;
            }
        });
    }

    @Override // a.yx5
    public final void C0() {
        tqi tqiVar = (tqi) this.P1.getValue();
        this.K1 = (sqi) tqiVar.j.get();
        this.L1 = tqiVar.h;
        this.M1 = tqiVar.i;
    }

    @Override // a.yx5
    public final void D0() throws Exception {
        fkd0 fkd0VarI0 = I0();
        dnq dnqVar = new dnq(new fnq(fkd0VarI0.k, new d7a0(fkd0VarI0, null, (byte) 15)), new gbv(fkd0VarI0, null, (byte) 29), (byte) 0);
        mjd0 mjd0Var = new mjd0(this, null, (byte) 0);
        lkz lkzVar = lkz.f20223a;
        clz clzVarW = aac.W(this);
        qjj.W(x0x.Q(clzVarW.x()), null, null, new fxc0(dnqVar, clzVarW, mjd0Var, (yje) null), 3);
        ol60 ol60Var = I0().l;
        mjd0 mjd0Var2 = new mjd0(this, null, (byte) 1);
        clz clzVarW2 = aac.W(this);
        qjj.W(x0x.Q(clzVarW2.x()), null, null, new fxc0(ol60Var, clzVarW2, mjd0Var2, (yje) null), 3);
    }

    public final ii G0() {
        ii iiVar = this.L1;
        if (iiVar != null) {
            return iiVar;
        }
        Intrinsics.h("actionDialogManager");
        throw null;
    }

    public final p3r H0() {
        Object objN = this.O1.n(U1[0], this);
        objN.getClass();
        return (p3r) objN;
    }

    public final fkd0 I0() {
        return (fkd0) this.N1.getValue();
    }

    @Override // a.yx5, androidx.fragment.app.Fragment
    public final void W(Bundle bundle) {
        super.W(bundle);
        ccq0.V(this, "REQUEST_VOICE_SMS_CONFIRMATION_KEY", new jjd0(this, (byte) 3));
        ccq0.V(this, "REQUEST_TELEGRAM_CONFIRMATION_KEY", new jjd0(this, (byte) 7));
        ccq0.V(this, "REQUEST_FLASH_CALL_CONFIRMATION_KEY", new jjd0(this, (byte) 1));
        ccq0.V(this, "REQUEST_EXPIRED_TOKEN_ERROR_DIALOG_KEY", new jjd0(this, (byte) 8));
        ccq0.V(this, "REQUEST_PROCESS_INTERRUPTION_KEY", new jjd0(this, (byte) 2));
        ccq0.V(this, "REQUEST_REQUEST_ERROR_KEY", new jjd0(this, (byte) 0));
    }
}
