package a;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes.dex */
public class hhe0 extends ViewGroup.MarginLayoutParams {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public xhe0 f13060a;
    public final Rect b;
    public boolean c;
    public boolean d;

    public hhe0(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.b = new Rect();
        this.c = true;
        this.d = false;
    }

    public hhe0(int i, int i2) {
        super(i, i2);
        this.b = new Rect();
        this.c = true;
        this.d = false;
    }

    public hhe0(ViewGroup.MarginLayoutParams marginLayoutParams) {
        super(marginLayoutParams);
        this.b = new Rect();
        this.c = true;
        this.d = false;
    }

    public hhe0(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        this.b = new Rect();
        this.c = true;
        this.d = false;
    }

    public hhe0(hhe0 hhe0Var) {
        super((ViewGroup.LayoutParams) hhe0Var);
        this.b = new Rect();
        this.c = true;
        this.d = false;
    }
}
