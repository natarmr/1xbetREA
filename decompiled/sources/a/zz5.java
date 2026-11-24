package a;

import android.content.Context;
import android.view.View;
import androidx.fragment.app.Fragment;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public abstract class zz5 extends yx5 {
    public c720 K1;
    public boolean L1;

    public static c720 G0(Fragment fragment) {
        Fragment fragment2 = fragment.y;
        if (fragment2 != null) {
            return fragment2 instanceof c720 ? (c720) fragment2 : G0(fragment2);
        }
        jf4.n("MakeBetLoaderFragment not found");
        return null;
    }

    public final i6q H0(Fragment fragment) {
        fragment.getClass();
        Fragment fragment2 = fragment.y;
        if (fragment2 != null) {
            return fragment2 instanceof i6q ? (i6q) fragment2 : H0(fragment2);
        }
        jf4.n("MakeBetLoaderFragment not found");
        return null;
    }

    public abstract View I0();

    public void J0(r0o r0oVar) {
        r0oVar.getClass();
        if (r0oVar instanceof p0o) {
            c720 c720VarG0 = G0(this);
            xdk0 xdk0Var = ((p0o) r0oVar).f26161a;
            c720VarG0.getClass();
            wdk0 wdk0Var = c720VarG0.g2;
            if (wdk0Var != null) {
                wdk0.k(wdk0Var, xdk0Var, c720VarG0, null, c720VarG0.Q0().c, false, null, 1012);
            } else {
                Intrinsics.h("snackbarManager");
                throw null;
            }
        }
    }

    public final void K0(k520 k520Var) {
        k520Var.getClass();
        if (k520Var.equals(j320.f15811a)) {
            c720 c720Var = this.K1;
            if (c720Var != null) {
                c720Var.x0();
                return;
            }
            return;
        }
        if (!(k520Var instanceof h520)) {
            if (k520Var.equals(l320.f19339a)) {
                gnm0.i(C());
                return;
            } else if (k520Var.equals(i520.f14173a)) {
                gnm0.s(C());
                return;
            } else {
                t9f.b();
                return;
            }
        }
        h520 h520Var = (h520) k520Var;
        String str = h520Var.f;
        if (h520Var.f12460a) {
            H0(this).L0(h520Var.c, h520Var.b, str);
        } else {
            i6q i6qVarH0 = H0(this);
            String str2 = h520Var.b;
            i6qVarH0.K0(h520Var.e, h520Var.c, str2, h520Var.d, str, h520Var.g, h520Var.h, h520Var.i);
        }
        c720 c720Var2 = this.K1;
        if (c720Var2 != null) {
            c720Var2.x0();
        }
    }

    @Override // a.yx5, androidx.fragment.app.Fragment
    public final void V(Context context) {
        super.V(context);
        Fragment fragment = this.y;
        this.K1 = fragment instanceof c720 ? (c720) fragment : null;
    }

    @Override // androidx.fragment.app.Fragment
    public final void d0() {
        this.j1 = true;
        this.L1 = I0().hasFocus();
    }

    @Override // a.yx5, androidx.fragment.app.Fragment
    public final void e0() {
        super.e0();
        if (this.L1) {
            View viewI0 = I0();
            viewI0.requestFocus();
            viewI0.post(new hp2((Object) viewI0, true, (byte) 5));
        }
    }
}
