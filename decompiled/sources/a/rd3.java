package a;

import android.content.Context;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes.dex */
public class rd3 extends hgd implements bd3 {
    public pd3 e;
    public final qd3 f;

    /* JADX WARN: Type inference failed for: r2v2, types: [a.qd3] */
    public rd3(Context context, int i) {
        int i2;
        if (i == 0) {
            TypedValue typedValue = new TypedValue();
            context.getTheme().resolveAttribute(R.attr.dialogTheme, typedValue, true);
            i2 = typedValue.resourceId;
        } else {
            i2 = i;
        }
        super(context, i2);
        this.f = new hky() { // from class: a.qd3
            @Override // a.hky
            public final boolean f(KeyEvent keyEvent) {
                return this.f28515a.f(keyEvent);
            }
        };
        hd3 hd3VarE = e();
        if (i == 0) {
            TypedValue typedValue2 = new TypedValue();
            context.getTheme().resolveAttribute(R.attr.dialogTheme, typedValue2, true);
            i = typedValue2.resourceId;
        }
        ((pd3) hd3VarE).s1 = i;
        hd3VarE.q(null);
    }

    @Override // a.hgd, android.app.Dialog
    public final void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        c();
        e().c(view, layoutParams);
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void dismiss() {
        super.dismiss();
        e().r();
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return m7x.C(this.f, getWindow().getDecorView(), this, keyEvent);
    }

    public final hd3 e() {
        pd3 pd3Var = this.e;
        if (pd3Var != null) {
            return pd3Var;
        }
        gd3 gd3Var = hd3.f12850a;
        pd3 pd3Var2 = new pd3(getContext(), getWindow(), this, this);
        this.e = pd3Var2;
        return pd3Var2;
    }

    public final boolean f(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.app.Dialog
    public final View findViewById(int i) {
        return e().h(i);
    }

    @Override // android.app.Dialog
    public final void invalidateOptionsMenu() {
        e().n();
    }

    @Override // a.hgd, android.app.Dialog
    public void onCreate(Bundle bundle) {
        e().m();
        super.onCreate(bundle);
        e().q(bundle);
    }

    @Override // a.hgd, android.app.Dialog
    public final void onStop() {
        super.onStop();
        e().w();
    }

    @Override // a.hgd, android.app.Dialog
    public void setContentView(int i) {
        c();
        e().z(i);
    }

    @Override // android.app.Dialog
    public final void setTitle(int i) {
        super.setTitle(i);
        e().D(getContext().getString(i));
    }

    @Override // a.hgd, android.app.Dialog
    public void setContentView(View view) {
        c();
        e().A(view);
    }

    @Override // a.hgd, android.app.Dialog
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        c();
        e().B(view, layoutParams);
    }

    @Override // android.app.Dialog
    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        e().D(charSequence);
    }
}
