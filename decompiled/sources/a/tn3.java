package a;

import android.app.Application;
import android.content.ComponentCallbacks2;
import android.os.Build;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.Collections;
import java.util.WeakHashMap;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"La/tn3;", "La/yo8;", "<init>", "()V", "a/hfk0", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class tn3 extends yo8 {
    public fiu0 Y1;
    public wdk0 Z1;
    public final nae0 a2 = ltt0.p(this, sn3.f32473a);
    public final kiu0 b2;
    public static final /* synthetic */ iiy[] d2 = {new j0d0(tn3.class, "binding", "getBinding()Lorg/xplatform/app_update/impl/databinding/AppUpdateWhatsNewDialogBinding;", 0)};
    public static final hfk0 c2 = new hfk0((byte) 23);
    public static final String e2 = tn3.class.getSimpleName();

    public tn3() {
        a13 a13Var = new a13(this, (byte) 12);
        a8z a8zVarA = maz.a(wez.b, new f80(new f80(this, (byte) 18), (byte) 19));
        this.b2 = agc.G(this, sre0.f32672a.b(fo3.class), new t51(a8zVarA, (byte) 10), new t51(a8zVarA, (byte) 11), a13Var);
    }

    public final un3 I0() {
        Object objN = this.a2.n(d2[0], this);
        objN.getClass();
        return (un3) objN;
    }

    @Override // a.sik, androidx.fragment.app.Fragment
    public final void W(Bundle bundle) {
        ComponentCallbacks2 application = n0().getApplication();
        application.getClass();
        af3 af3Var = application instanceof af3 ? (af3) application : null;
        if (af3Var != null) {
            o5d0 o5d0Var = (o5d0) af3Var.d().get(p9v0.class);
            ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
            p9v0 p9v0Var = (p9v0) (ze3Var instanceof p9v0 ? ze3Var : null);
            if (p9v0Var != null) {
                Application application2 = n0().getApplication();
                application2.getClass();
                esg0 esg0VarJ = y0x0.J(application2);
                cad cadVar = p9v0Var.f26627a;
                wdk0 wdk0Var = p9v0Var.b;
                ctf0 ctf0Var = p9v0Var.c;
                fsd fsdVar = p9v0Var.d;
                yox yoxVar = p9v0Var.e;
                a6u a6uVar = p9v0Var.f;
                wdk0Var.getClass();
                ctf0Var.getClass();
                fsdVar.getClass();
                this.Y1 = new fiu0(Collections.singletonMap(fo3.class, (kzi) new uii(cadVar, esg0VarJ, wdk0Var, ctf0Var, yoxVar, a6uVar).f));
                this.Z1 = wdk0Var;
                super.W(bundle);
                return;
            }
        }
        jf4.n(b1j.i(p9v0.class, "Cannot create dependency "));
    }

    @Override // androidx.fragment.app.Fragment
    public final View X(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        ConstraintLayout constraintLayout = I0().e;
        constraintLayout.getClass();
        return constraintLayout;
    }

    @Override // androidx.fragment.app.Fragment
    public final void i0(View view, Bundle bundle) throws Exception {
        view.getClass();
        I0().c.setMovementMethod(new ScrollingMovementMethod());
        dyb.c0(I0().b, new rn3(this, (byte) 0));
        if (Build.VERSION.SDK_INT >= 35) {
            Object parent = q0().getParent();
            View view2 = parent instanceof View ? (View) parent : null;
            if (view2 != null) {
                bbw0 bbw0Var = new bbw0(this, (byte) 6);
                WeakHashMap weakHashMap = rgu0.f30456a;
                igu0.c(view2, bbw0Var);
            }
        }
        kiu0 kiu0Var = this.b2;
        fo3 fo3Var = (fo3) kiu0Var.getValue();
        c00 c00Var = new c00(fo3Var.g, fo3Var, (byte) 11);
        i8 i8Var = new i8(2, this, tn3.class, "handleUiState", "handleUiState(Lorg/xplatform/app_update/impl/presentation/whats_new/AppUpdateWhatsNewUiModel;)V", 4, (byte) 28);
        lkz lkzVar = lkz.f20223a;
        clz clzVarW = aac.W(this);
        qjj.W(x0x.Q(clzVarW.x()), null, null, new tg3(c00Var, clzVarW, i8Var, (yje) null, (byte) 0), 3);
        lr lrVar = new lr(((fo3) kiu0Var.getValue()).h, (byte) 18);
        i8 i8Var2 = new i8(2, this, tn3.class, "handleEvent", "handleEvent(Lorg/xplatform/app_update/impl/presentation/whats_new/AppUpdateWhatsNewEvent;)V", 4, (byte) 29);
        clz clzVarW2 = aac.W(this);
        qjj.W(x0x.Q(clzVarW2.x()), null, null, new tg3(lrVar, clzVarW2, i8Var2, (yje) null, (char) 0), 3);
    }
}
