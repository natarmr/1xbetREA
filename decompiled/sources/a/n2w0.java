package a;

import android.app.Dialog;
import android.content.ComponentCallbacks2;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import kotlin.Metadata;
import kotlin.Unit;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"La/n2w0;", "La/by5;", "La/eun;", "<init>", "()V", "a/bzs0", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class n2w0 extends by5<eun> {
    public sje c2;
    public boolean d2;
    public afm0 f2;
    public mne g2;
    public static final /* synthetic */ iiy[] i2 = {new j0d0(n2w0.class, "binding", "getBinding()Lorg/xplatform/ui_core/databinding/EmptyFrameLayoutBinding;", 0)};
    public static final bzs0 h2 = new bzs0((byte) 18);
    public final nae0 b2 = ltt0.p(this, l2w0.f19333a);
    public final ywq e2 = m0(new yl3(this, 14), new gvt0());

    @Override // a.by5
    public final yfu0 I0() {
        Object objN = this.b2.n(i2[0], this);
        objN.getClass();
        return (eun) objN;
    }

    @Override // a.by5
    public final void K0() {
        Window window;
        View decorView;
        Dialog dialog = this.S1;
        if (dialog == null || (window = dialog.getWindow()) == null || (decorView = window.getDecorView()) == null) {
            return;
        }
        decorView.setVisibility(4);
    }

    @Override // a.by5
    public final void L0() {
        ComponentCallbacks2 application = n0().getApplication();
        application.getClass();
        af3 af3Var = application instanceof af3 ? (af3) application : null;
        if (af3Var != null) {
            o5d0 o5d0Var = (o5d0) af3Var.d().get(hhk0.class);
            ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
            hhk0 hhk0Var = (hhk0) (ze3Var instanceof hhk0 ? ze3Var : null);
            if (hhk0Var != null) {
                khf0 khf0VarA = hhk0Var.a();
                this.f2 = new afm0((azj0) khf0VarA.b);
                this.g2 = (mne) khf0VarA.c;
                return;
            }
        }
        jf4.n(b1j.i(hhk0.class, "Cannot create dependency "));
    }

    @Override // a.by5, a.sik, androidx.fragment.app.Fragment
    public final void W(Bundle bundle) {
        super.W(bundle);
        if (bundle == null || !bundle.getBoolean("HAS_BEEN_CREATED")) {
            this.e2.a(Unit.f46060a);
            this.d2 = true;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void Y() {
        sje sjeVar = this.c2;
        if (sjeVar != null) {
            d5c.G(sjeVar, null);
        }
        this.c2 = null;
        this.j1 = true;
    }

    @Override // a.sik, androidx.fragment.app.Fragment
    public final void f0(Bundle bundle) {
        bundle.putBoolean("HAS_BEEN_CREATED", this.d2);
        super.f0(bundle);
    }
}
