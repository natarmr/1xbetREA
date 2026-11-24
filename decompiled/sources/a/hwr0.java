package a;

import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes4.dex */
public final class hwr0 implements View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f13779a;
    public final /* synthetic */ View b;
    public final /* synthetic */ ViewGroup c;
    public final /* synthetic */ View d;
    public final /* synthetic */ int e;
    public final /* synthetic */ int f;

    public /* synthetic */ hwr0(View view, ViewGroup viewGroup, View view2, int i, int i2, byte b) {
        this.f13779a = b;
        this.b = view;
        this.c = viewGroup;
        this.d = view2;
        this.e = i;
        this.f = i2;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        byte b = this.f13779a;
        View view2 = this.b;
        view.getClass();
        switch (b) {
            case 0:
                view2.removeOnAttachStateChangeListener(this);
                int i = this.f;
                View view3 = this.d;
                ViewGroup viewGroup = this.c;
                viewGroup.post(new iwr0(view3, viewGroup, this.e, i, (byte) 0));
                break;
            default:
                view2.removeOnAttachStateChangeListener(this);
                int i2 = this.f;
                View view4 = this.d;
                ViewGroup viewGroup2 = this.c;
                viewGroup2.post(new iwr0(view4, viewGroup2, this.e, i2, (byte) 1));
                break;
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        byte b = this.f13779a;
        view.getClass();
    }
}
