package a;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import java.util.Collections;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;
import org.xplatform.alerts_pipe_api.presentation.AlertsPipeType;
import org.xplatform.uikit.components.bottom_bar.DsBottomBar;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"La/jty;", "La/qw5;", "La/kty;", "<init>", "()V", "a/gst", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class jty extends qw5<kty> {
    public final nae0 b2 = ltt0.p(this, ity.f15372a);
    public r12 c2;
    public fiu0 d2;
    public final kiu0 e2;
    public static final /* synthetic */ iiy[] g2 = {new j0d0(jty.class, "binding", "getBinding()Lorg/xplatform/alerts_pipe_impl/databinding/KzFirstDepositBottomSheetBinding;", 0)};
    public static final gst f2 = new gst();

    public jty() {
        hty htyVar = new hty(this, (byte) 0);
        a8z a8zVarA = maz.a(wez.b, new aaw(new aaw(this, (byte) 24), (byte) 25));
        this.e2 = agc.G(this, sre0.f32672a.b(oty.class), new qwv(a8zVarA, (byte) 20), new qwv(a8zVarA, (byte) 21), htyVar);
    }

    @Override // a.qw5
    public final int I0() {
        return R.attr.uikitStaticTransparent;
    }

    @Override // a.qw5
    public final int O0() {
        return R.id.root;
    }

    @Override // a.qw5
    /* JADX INFO: renamed from: Q0, reason: merged with bridge method [inline-methods] */
    public final kty J0() {
        Object objN = this.b2.n(g2[0], this);
        objN.getClass();
        return (kty) objN;
    }

    @Override // a.sik, androidx.fragment.app.Fragment
    public final void V(Context context) {
        super.V(context);
        ComponentCallbacks2 application = n0().getApplication();
        application.getClass();
        af3 af3Var = application instanceof af3 ? (af3) application : null;
        if (af3Var != null) {
            o5d0 o5d0Var = (o5d0) af3Var.d().get(lty.class);
            ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
            lty ltyVar = (lty) (ze3Var instanceof lty ? ze3Var : null);
            if (ltyVar != null) {
                uyu uyuVar = ltyVar.f20647a;
                p12 p12Var = ltyVar.b;
                c5k c5kVar = new c5k();
                c5kVar.f3775a = uyuVar;
                c5kVar.b = new tii(c5kVar, (byte) 15);
                r12 r12Var = (r12) ((p12) p12Var.b).b;
                x1x.x(r12Var);
                this.c2 = r12Var;
                this.d2 = new fiu0(Collections.singletonMap(oty.class, (tii) c5kVar.b));
                return;
            }
        }
        jf4.n(b1j.i(lty.class, "Cannot create dependency "));
    }

    @Override // a.qw5, a.sik, androidx.fragment.app.Fragment
    public final void Z() {
        List list = u0d.f34849a;
        u0d.a(J0().c);
        super.Z();
    }

    @Override // a.qw5, androidx.fragment.app.Fragment
    public final void i0(View view, Bundle bundle) throws Exception {
        view.getClass();
        super.i0(view, bundle);
        DsBottomBar.u(J0().b, new hty(this, (byte) 1));
        DsBottomBar.v(J0().b, new hty(this, (byte) 2));
        a1t a1tVar = new a1t(((oty) this.e2.getValue()).b.f36509a.h(), (byte) 23);
        kaw kawVar = new kaw(this, null, (byte) 15);
        lkz lkzVar = lkz.f20223a;
        clz clzVarW = aac.W(this);
        qjj.W(x0x.Q(clzVarW.x()), null, null, new c6y(a1tVar, clzVarW, kawVar, (yje) null), 3);
        r12 r12Var = this.c2;
        if (r12Var == null) {
            Intrinsics.h("alertsPipeReceiver");
            throw null;
        }
        s12 s12Var = (s12) r12Var;
        s12Var.g = F();
        s12Var.f = AlertsPipeType.KzFirstDepositBottom.f46313a;
    }

    @Override // a.sik, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        dialogInterface.getClass();
        r12 r12Var = this.c2;
        if (r12Var == null) {
            Intrinsics.h("alertsPipeReceiver");
            throw null;
        }
        ((s12) r12Var).b();
        super.onDismiss(dialogInterface);
    }
}
