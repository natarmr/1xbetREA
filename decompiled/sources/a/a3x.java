package a;

import android.app.Dialog;
import android.content.ComponentCallbacks2;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"La/a3x;", "La/sik;", "<init>", "()V", "a/bst", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class a3x extends sik {
    public final phf0 Y1 = new phf0("BUNDLE_IMAGE_URL");
    public final nae0 Z1 = ltt0.p(this, z2x.f43692a);
    public static final /* synthetic */ iiy[] b2 = {new ez40(a3x.class, "imageUrl", "getImageUrl()Ljava/lang/String;", 0), new j0d0(a3x.class, "binding", "getBinding()Lorg/xplatform/consultantchat/impl/databinding/DialogImageViewerBinding;", 0)};
    public static final bst a2 = new bst();

    @Override // a.sik, androidx.fragment.app.Fragment
    public final void W(Bundle bundle) {
        super.W(bundle);
        ComponentCallbacks2 application = n0().getApplication();
        application.getClass();
        af3 af3Var = application instanceof af3 ? (af3) application : null;
        if (af3Var != null) {
            o5d0 o5d0Var = (o5d0) af3Var.d().get(f7e.class);
            ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
            f7e f7eVar = (f7e) (ze3Var instanceof f7e ? ze3Var : null);
            if (f7eVar != null) {
                f7eVar.a(a4n0.f(this));
                return;
            }
        }
        jf4.n(b1j.i(f7e.class, "Cannot create dependency "));
    }

    @Override // androidx.fragment.app.Fragment
    public final View X(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        Object objN = this.Z1.n(b2[1], this);
        objN.getClass();
        ConstraintLayout constraintLayout = ((wik) objN).f39217a;
        constraintLayout.getClass();
        return constraintLayout;
    }

    @Override // a.sik, androidx.fragment.app.Fragment
    public final void g0() {
        Window window;
        super.g0();
        Dialog dialog = this.S1;
        if (dialog == null || (window = dialog.getWindow()) == null) {
            return;
        }
        window.setLayout(-1, -1);
        window.setBackgroundDrawable(new ColorDrawable(0));
    }

    @Override // androidx.fragment.app.Fragment
    public final void i0(View view, Bundle bundle) {
        view.getClass();
        iiy[] iiyVarArr = b2;
        Object objN = this.Z1.n(iiyVarArr[1], this);
        objN.getClass();
        wik wikVar = (wik) objN;
        wikVar.b.setOnClickListener(new q10(this, (byte) 28));
        wikVar.d.setDoOnFinish(new y2x(this, (byte) 0));
        wikVar.f39217a.setOnTouchListener(new jw5(wikVar, (byte) 9));
        List list = u0d.f34849a;
        u0d.g(wikVar.c, this.Y1.n(this, iiyVarArr[0]), null, null, 6);
    }
}
