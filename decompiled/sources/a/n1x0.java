package a;

import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class n1x0 implements lin0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f22774a;
    public final /* synthetic */ lin0 b;

    public /* synthetic */ n1x0(lin0 lin0Var, byte b) {
        this.f22774a = b;
        this.b = lin0Var;
    }

    @Override // a.lin0
    public final Object get() {
        byte b = this.f22774a;
        lin0 lin0Var = this.b;
        switch (b) {
            case 0:
                Object obj = c1x0.j;
                return (r7x0) ((w680) lin0Var.get()).d();
            default:
                fr40 fr40Var = (fr40) lin0Var.get();
                fr40Var.getClass();
                trs0 trs0Var = new trs0(drw0.c);
                return new dr40(trs0Var, fr40Var.b.schedule(trs0Var, 10000L, TimeUnit.MILLISECONDS));
        }
    }
}
