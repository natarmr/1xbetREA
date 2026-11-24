package a;

import android.view.View;

/* JADX INFO: loaded from: classes4.dex */
public final class wsj implements View.OnLayoutChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f39695a;
    public final /* synthetic */ mhn0 b;

    public /* synthetic */ wsj(mhn0 mhn0Var, byte b) {
        this.f39695a = b;
        this.b = mhn0Var;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        byte b = this.f39695a;
        mhn0 mhn0Var = this.b;
        switch (b) {
            case 0:
                view.removeOnLayoutChangeListener(this);
                mhn0Var.c.a();
                break;
            default:
                view.removeOnLayoutChangeListener(this);
                mhn0Var.c.a();
                break;
        }
    }
}
