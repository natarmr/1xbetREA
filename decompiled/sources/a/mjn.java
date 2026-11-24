package a;

import android.graphics.Color;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public abstract class mjn {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f21903a = Color.argb(230, 255, 255, 255);
    public static final int b = Color.argb(128, 27, 27, 27);
    public static tjn c;

    public static final void a(agd agdVar, c9o0 c9o0Var, c9o0 c9o0Var2) {
        jhu0 jhu0Var;
        View decorView = agdVar.getWindow().getDecorView();
        decorView.getClass();
        tjn ojnVar = c;
        if (ojnVar == null) {
            int i = Build.VERSION.SDK_INT;
            if (i >= 35) {
                ojnVar = new sjn();
            } else if (i >= 30) {
                ojnVar = new rjn();
            } else if (i >= 29) {
                ojnVar = new qjn();
            } else if (i >= 28) {
                ojnVar = new pjn();
            } else {
                ojnVar = i >= 26 ? new ojn() : new njn();
            }
            c = ojnVar;
        }
        tjn tjnVar = ojnVar;
        kjn kjnVar = new kjn(tjnVar, c9o0Var, c9o0Var2, agdVar, decorView, (byte) 0);
        ViewGroup viewGroup = (ViewGroup) decorView;
        Iterator it = new ihu0(viewGroup).iterator();
        do {
            jhu0Var = (jhu0) it;
            if (!jhu0Var.hasNext()) {
                ljn ljnVar = new ljn(kjnVar, viewGroup.getContext());
                ljnVar.setTag(tjnVar);
                ljnVar.setVisibility(8);
                ljnVar.setWillNotDraw(true);
                viewGroup.addView(ljnVar);
                break;
            }
        } while (!(((View) jhu0Var.next()).getTag() instanceof tjn));
        kjnVar.run();
        Window window = agdVar.getWindow();
        window.getClass();
        tjnVar.a(window);
    }
}
