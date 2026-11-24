package a;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class mmk0 extends fhe0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f22042a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;

    public mmk0(int i, int i2, int i3, int i4, List list) {
        list.getClass();
        this.f22042a = list;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = i4;
    }

    @Override // a.fhe0
    public final void f(Rect rect, View view, RecyclerView recyclerView, the0 the0Var) {
        rect.getClass();
        view.getClass();
        the0Var.getClass();
        xhe0 xhe0VarW = recyclerView.W(view);
        cp cpVar = xhe0VarW instanceof cp ? (cp) xhe0VarW : null;
        if (cpVar != null) {
            Object objU = cpVar.u();
            List list = this.f22042a;
            if (list == null || !list.isEmpty()) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    if (objU.getClass().equals((Class) it.next())) {
                        rect.top = this.b;
                        rect.left = this.c;
                        rect.right = this.d;
                        rect.bottom = this.e;
                        return;
                    }
                }
            }
        }
    }
}
