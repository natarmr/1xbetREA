package a;

import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes.dex */
public final class wge0 extends lhe0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f39113a;
    public boolean b;
    public final Object c;

    public wge0(efk0 efk0Var) {
        this.f39113a = (byte) 1;
        this.c = efk0Var;
        this.b = false;
    }

    @Override // a.lhe0
    public final void b(RecyclerView recyclerView, int i) {
        byte b = this.f39113a;
        Object obj = this.c;
        switch (b) {
            case 0:
                if (i != 0) {
                    if (i == 1 && !this.b) {
                        this.b = true;
                        ((bod0) obj).invoke(recyclerView);
                        break;
                    }
                } else {
                    this.b = false;
                    break;
                }
                break;
            default:
                if (i == 0 && this.b) {
                    this.b = false;
                    ((efk0) obj).g();
                    break;
                }
                break;
        }
    }

    @Override // a.lhe0
    public void d(RecyclerView recyclerView, int i, int i2) {
        switch (this.f39113a) {
            case 1:
                if (i != 0 || i2 != 0) {
                    this.b = true;
                }
                break;
        }
    }

    public wge0(bod0 bod0Var) {
        this.f39113a = (byte) 0;
        this.c = bod0Var;
    }
}
