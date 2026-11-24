package a;

import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class wz3 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f40002a = 1;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ wz3(cvw0 cvw0Var, int i, Exception exc, byte[] bArr, Map map) {
        this.c = cvw0Var;
        this.b = i;
        this.d = exc;
        this.e = bArr;
        this.f = map;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f40002a) {
            case 0:
                ((yz3) this.f).c.execute(new lfr(this, cy2.w(new vz3(this), true), false, (byte) 3));
                break;
            default:
                cvw0 cvw0Var = (cvw0) this.c;
                ((g1x0) cvw0Var.f).a(this.b, (Exception) this.d, (byte[]) this.e);
                break;
        }
    }

    public wz3(yz3 yz3Var, List list, List list2, int i, Runnable runnable) {
        this.f = yz3Var;
        this.c = list;
        this.d = list2;
        this.b = i;
        this.e = runnable;
    }
}
