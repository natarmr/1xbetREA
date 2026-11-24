package a;

import android.view.View;
import android.widget.ImageView;

/* JADX INFO: loaded from: classes.dex */
public final class n7l implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ View f23047a;
    public final /* synthetic */ float b;
    public final /* synthetic */ float c;
    public final /* synthetic */ x23 d;
    public final /* synthetic */ ImageView e;

    public n7l(View view, float f, float f2, x23 x23Var, ImageView imageView) {
        this.f23047a = view;
        this.b = f;
        this.c = f2;
        this.d = x23Var;
        this.e = imageView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        float f = this.b / 100.0f;
        float f2 = this.c / 100.0f;
        x23 x23Var = this.d;
        ImageView imageView = (ImageView) x23Var.c;
        float measuredWidth = imageView.getMeasuredWidth() * f;
        float measuredHeight = imageView.getMeasuredHeight() * f2;
        this.e.layout((int) (imageView.getLeft() + measuredWidth), (int) (imageView.getTop() + measuredHeight), (int) (imageView.getLeft() + measuredWidth + x23Var.f40148a), (int) (imageView.getTop() + measuredHeight + x23Var.f40148a));
    }
}
