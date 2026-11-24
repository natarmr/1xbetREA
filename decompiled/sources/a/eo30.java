package a;

import android.util.Pair;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class eo30 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f8122a;
    public final /* synthetic */ go30 b;
    public final /* synthetic */ Pair c;
    public final /* synthetic */ in30 d;

    public /* synthetic */ eo30(go30 go30Var, Pair pair, in30 in30Var, byte b) {
        this.f8122a = b;
        this.b = go30Var;
        this.c = pair;
        this.d = in30Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.f8122a;
        in30 in30Var = this.d;
        Pair pair = this.c;
        go30 go30Var = this.b;
        switch (b) {
            case 0:
                fsj fsjVar = go30Var.b.i;
                int iIntValue = ((Integer) pair.first).intValue();
                vn30 vn30Var = (vn30) pair.second;
                vn30Var.getClass();
                fsjVar.z(iIntValue, vn30Var, in30Var);
                break;
            default:
                go30Var.b.i.p(((Integer) pair.first).intValue(), (vn30) pair.second, in30Var);
                break;
        }
    }
}
