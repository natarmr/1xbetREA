package a;

import android.app.Dialog;
import android.content.ComponentCallbacks2;
import android.content.Context;
import android.view.Window;
import kotlin.Metadata;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"La/sdd0;", "La/by5;", "La/hjk;", "<init>", "()V", "a/xi70", "captcha"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class sdd0 extends by5<hjk> {
    public hqi b2;
    public final kiu0 c2;
    public final nae0 d2;
    public final phf0 e2;
    public final phf0 f2;
    public final yzn0 g2;
    public final int h2;
    public static final /* synthetic */ iiy[] j2 = {new j0d0(sdd0.class, "binding", "getBinding()Lorg/xplatform/captcha/databinding/DialogPushCaptchaBinding;", 0), new ez40(sdd0.class, "requestKey", "getRequestKey()Ljava/lang/String;", 0), new ez40(sdd0.class, "pendingPushId", "getPendingPushId()Ljava/lang/String;", 0), new ez40(sdd0.class, "captchaTask", "getCaptchaTask()Lorg/xplatform/captcha/api/domain/model/CaptchaTask;", 0)};
    public static final xi70 i2 = new xi70();

    public sdd0() {
        p7d0 p7d0Var = new p7d0(this, (byte) 2);
        a8z a8zVarA = maz.a(wez.b, new f1d0(new f1d0(this, (byte) 3), (byte) 4));
        this.c2 = agc.G(this, sre0.f32672a.b(udd0.class), new ync0(a8zVarA, (byte) 6), new ync0(a8zVarA, (byte) 7), p7d0Var);
        this.d2 = ltt0.p(this, rdd0.f30286a);
        this.e2 = new phf0("BUNDLE_REQUEST_KEY");
        this.f2 = new phf0("BUNDLE_PENDING_PUSH_ID");
        this.g2 = new yzn0("KEY_BUNDLE_CAPTCHA_REQUIRED");
        this.h2 = R.attr.uikitBackgroundContent;
    }

    @Override // a.sik
    public final Dialog A0() {
        Dialog dialog = this.S1;
        if (dialog == null) {
            return null;
        }
        dialog.setCancelable(false);
        return dialog;
    }

    @Override // a.by5
    public final yfu0 I0() {
        Object objN = this.d2.n(j2[0], this);
        objN.getClass();
        return (hjk) objN;
    }

    @Override // a.by5
    /* JADX INFO: renamed from: J0, reason: from getter */
    public final int getE2() {
        return this.h2;
    }

    @Override // a.by5
    public final void K0() throws Exception {
        qoj0 qoj0Var = ((udd0) this.c2.getValue()).c;
        lkz lkzVar = lkz.f20223a;
        jjc0 jjc0Var = new jjc0(2, this, sdd0.class, "onPushToken", "onPushToken(Ljava/lang/String;)V", 4, (byte) 6);
        clz clzVarW = aac.W(this);
        qjj.W(x0x.Q(clzVarW.x()), null, null, new fxc0(qoj0Var, clzVarW, jjc0Var, (yje) null), 3);
    }

    @Override // a.by5
    public final void L0() {
        ComponentCallbacks2 application = n0().getApplication();
        application.getClass();
        af3 af3Var = application instanceof af3 ? (af3) application : null;
        if (af3Var != null) {
            o5d0 o5d0Var = (o5d0) af3Var.d().get(tdd0.class);
            ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
            tdd0 tdd0Var = (tdd0) (ze3Var instanceof tdd0 ? ze3Var : null);
            if (tdd0Var != null) {
                l6a l6aVar = tdd0Var.f33764a;
                n4u n4uVar = tdd0Var.b;
                l6aVar.getClass();
                this.b2 = (hqi) ((n5d0) new iqi(n4uVar).b).get();
                return;
            }
        }
        jf4.n(b1j.i(tdd0.class, "Cannot create dependency "));
    }

    @Override // a.sik, androidx.fragment.app.Fragment
    public final void g0() {
        Window window;
        super.g0();
        Context contextO0 = o0();
        int iMin = Math.min(sj3.X(350), Math.min(contextO0.getResources().getDisplayMetrics().heightPixels, contextO0.getResources().getDisplayMetrics().widthPixels)) - (contextO0.getResources().getDimensionPixelSize(R.dimen.space_32) * 2);
        Dialog dialogA0 = A0();
        if (dialogA0 == null || (window = dialogA0.getWindow()) == null) {
            return;
        }
        window.addFlags(2);
        window.setDimAmount(0.5f);
        window.setLayout(iMin, -2);
        window.setBackgroundDrawable(o0().getDrawable(R.drawable.background_round_content_background_new));
    }
}
