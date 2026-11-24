package a;

import android.view.View;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class kw4 implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f18983a;
    public final /* synthetic */ rw4 b;

    public /* synthetic */ kw4(rw4 rw4Var, byte b) {
        this.f18983a = b;
        this.b = rw4Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        byte b = this.f18983a;
        rw4 rw4Var = this.b;
        switch (b) {
            case 0:
                gfk0 gfk0Var = rw4.W1;
                rw4Var.I0().F();
                break;
            case 1:
                gfk0 gfk0Var2 = rw4.W1;
                rw4Var.I0().F();
                break;
            default:
                gfk0 gfk0Var3 = rw4.W1;
                rw4Var.I0().E();
                break;
        }
    }
}
