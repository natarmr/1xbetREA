package a;

import android.view.View;
import android.view.ViewTreeObserver;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.transformation.ExpandableBehavior;

/* JADX INFO: loaded from: classes2.dex */
public final class smo implements ViewTreeObserver.OnPreDrawListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ View f32457a;
    public final /* synthetic */ int b;
    public final /* synthetic */ ano c;
    public final /* synthetic */ ExpandableBehavior d;

    public smo(ExpandableBehavior expandableBehavior, View view, int i, ano anoVar) {
        this.d = expandableBehavior;
        this.f32457a = view;
        this.b = i;
        this.c = anoVar;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        View view = this.f32457a;
        view.getViewTreeObserver().removeOnPreDrawListener(this);
        ExpandableBehavior expandableBehavior = this.d;
        if (expandableBehavior.f45584a == this.b) {
            Object obj = this.c;
            expandableBehavior.x((View) obj, view, ((FloatingActionButton) obj).o.b, false);
        }
        return false;
    }
}
