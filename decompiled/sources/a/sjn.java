package a;

import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class sjn extends rjn {
    @Override // a.qjn, a.ojn, a.tjn
    public void b(c9o0 c9o0Var, c9o0 c9o0Var2, Window window, View view, boolean z, boolean z2) {
        ycm0 ziv0Var;
        c9o0Var.getClass();
        c9o0Var2.getClass();
        window.getClass();
        view.getClass();
        bcm0.x(window, false);
        window.setStatusBarColor(0);
        window.setNavigationBarColor(0);
        ViewGroup viewGroup = view instanceof ViewGroup ? (ViewGroup) view : null;
        if (viewGroup != null) {
            Iterator it = new ihu0(viewGroup).iterator();
            while (true) {
                jhu0 jhu0Var = (jhu0) it;
                if (!jhu0Var.hasNext()) {
                    break;
                }
                Object tag = ((View) jhu0Var.next()).getTag();
                if (tag instanceof List) {
                    List list = (List) tag;
                    if (list.size() == 4 && (list.get(0) instanceof p4d)) {
                        Iterator it2 = ((Iterable) tag).iterator();
                        while (it2.hasNext()) {
                            it2.next();
                        }
                        break;
                    }
                }
            }
        }
        window.setNavigationBarContrastEnforced(true);
        ani0 ani0Var = new ani0(view);
        int i = Build.VERSION.SDK_INT;
        if (i >= 35) {
            ziv0Var = new bjv0(window, ani0Var);
        } else if (i >= 30) {
            ziv0Var = new ajv0(window, ani0Var);
        } else {
            ziv0Var = i >= 26 ? new ziv0(window, ani0Var) : new yiv0(window, ani0Var);
        }
        ziv0Var.w(!z);
        ziv0Var.v(!z2);
    }
}
