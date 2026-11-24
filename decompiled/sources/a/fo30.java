package a;

import android.util.Pair;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class fo30 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f9862a;
    public final /* synthetic */ go30 b;
    public final /* synthetic */ Pair c;
    public final /* synthetic */ wn00 d;
    public final /* synthetic */ in30 e;

    public /* synthetic */ fo30(go30 go30Var, Pair pair, wn00 wn00Var, in30 in30Var, byte b) {
        this.f9862a = b;
        this.b = go30Var;
        this.c = pair;
        this.d = wn00Var;
        this.e = in30Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.f9862a;
        in30 in30Var = this.e;
        wn00 wn00Var = this.d;
        Pair pair = this.c;
        go30 go30Var = this.b;
        switch (b) {
            case 0:
                go30Var.b.i.j(((Integer) pair.first).intValue(), (vn30) pair.second, wn00Var, in30Var);
                break;
            default:
                go30Var.b.i.r(((Integer) pair.first).intValue(), (vn30) pair.second, wn00Var, in30Var);
                break;
        }
    }
}
