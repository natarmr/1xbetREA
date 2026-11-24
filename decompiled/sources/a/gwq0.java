package a;

import android.view.ViewGroup;

/* JADX INFO: loaded from: classes.dex */
public final class gwq0 extends ViewGroup.MarginLayoutParams {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f12039a;
    public byte b;

    public gwq0() {
        super(-2, -2);
        this.b = (byte) 0;
        this.f12039a = 8388627;
    }

    public gwq0(gwq0 gwq0Var) {
        super((ViewGroup.MarginLayoutParams) gwq0Var);
        this.f12039a = 0;
        this.f12039a = gwq0Var.f12039a;
    }

    public gwq0(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        this.f12039a = 0;
    }
}
