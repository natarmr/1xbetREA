package a;

import android.view.View;
import android.view.ViewParent;

/* JADX INFO: loaded from: classes4.dex */
public final class jwr0 implements View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ View f17268a;
    public final /* synthetic */ ViewParent b;
    public final /* synthetic */ View c;
    public final /* synthetic */ int d;

    public jwr0(View view, ViewParent viewParent, View view2, int i) {
        this.f17268a = view;
        this.b = viewParent;
        this.c = view2;
        this.d = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        view.getClass();
        this.f17268a.removeOnAttachStateChangeListener(this);
        ViewParent viewParent = this.b;
        viewParent.getClass();
        ((View) viewParent).post(new le3(this.d, this.c, viewParent));
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        view.getClass();
    }
}
