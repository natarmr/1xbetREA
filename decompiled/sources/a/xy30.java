package a;

import android.content.DialogInterface;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;

/* JADX INFO: loaded from: classes.dex */
public final class xy30 implements DialogInterface.OnKeyListener, DialogInterface.OnClickListener, DialogInterface.OnDismissListener, b040 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ox30 f41688a;
    public k12 b;
    public hf00 c;

    @Override // a.b040
    public final void c(ox30 ox30Var, boolean z) {
        k12 k12Var;
        if ((z || ox30Var == this.f41688a) && (k12Var = this.b) != null) {
            k12Var.dismiss();
        }
    }

    @Override // a.b040
    public final boolean f(ox30 ox30Var) {
        return false;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        ox30 ox30Var = this.f41688a;
        hf00 hf00Var = this.c;
        gf00 gf00Var = hf00Var.f;
        if (gf00Var == null) {
            gf00Var = new gf00(hf00Var);
            hf00Var.f = gf00Var;
        }
        ox30Var.q(gf00Var.getItem(i), null, 0);
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        this.c.c(this.f41688a, true);
    }

    @Override // android.content.DialogInterface.OnKeyListener
    public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        Window window;
        View decorView;
        KeyEvent.DispatcherState keyDispatcherState;
        View decorView2;
        KeyEvent.DispatcherState keyDispatcherState2;
        ox30 ox30Var = this.f41688a;
        if (i == 82 || i == 4) {
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                Window window2 = this.b.getWindow();
                if (window2 != null && (decorView2 = window2.getDecorView()) != null && (keyDispatcherState2 = decorView2.getKeyDispatcherState()) != null) {
                    keyDispatcherState2.startTracking(keyEvent, this);
                    return true;
                }
            } else if (keyEvent.getAction() == 1 && !keyEvent.isCanceled() && (window = this.b.getWindow()) != null && (decorView = window.getDecorView()) != null && (keyDispatcherState = decorView.getKeyDispatcherState()) != null && keyDispatcherState.isTracking(keyEvent)) {
                ox30Var.c(true);
                dialogInterface.dismiss();
                return true;
            }
        }
        return ox30Var.performShortcut(i, keyEvent, 0);
    }
}
