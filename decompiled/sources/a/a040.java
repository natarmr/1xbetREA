package a;

import android.content.Context;
import android.os.Build;
import android.util.Log;
import android.view.MenuItem;
import android.widget.PopupWindow;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
public final class a040 extends of00 implements gz30 {
    public static final Method Z;
    public r7v Y;

    static {
        try {
            if (Build.VERSION.SDK_INT <= 28) {
                Z = PopupWindow.class.getDeclaredMethod("setTouchModal", Boolean.TYPE);
            }
        } catch (NoSuchMethodException unused) {
            Log.i("MenuPopupWindow", "Could not find method setTouchModal() on PopupWindow. Oh well.");
        }
    }

    @Override // a.of00
    public final hil a(Context context, boolean z) {
        zz30 zz30Var = new zz30(context, z);
        zz30Var.setHoverListener(this);
        return zz30Var;
    }

    @Override // a.gz30
    public final void d(ox30 ox30Var, MenuItem menuItem) {
        r7v r7vVar = this.Y;
        if (r7vVar != null) {
            r7vVar.d(ox30Var, menuItem);
        }
    }

    @Override // a.gz30
    public final void p(ox30 ox30Var, hz30 hz30Var) {
        r7v r7vVar = this.Y;
        if (r7vVar != null) {
            r7vVar.p(ox30Var, hz30Var);
        }
    }
}
