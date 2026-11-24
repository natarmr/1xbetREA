package a;

import java.util.Objects;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public final class y1x0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f41882a = 0;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public y1x0(c2x0 c2x0Var, r1x0 r1x0Var, long j) {
        this.c = r1x0Var;
        this.b = j;
        Objects.requireNonNull(c2x0Var);
        this.d = c2x0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.f41882a;
        Object obj = this.d;
        long j = this.b;
        Object obj2 = this.c;
        switch (b) {
            case 0:
                c2x0 c2x0Var = (c2x0) obj;
                c2x0Var.u1((r1x0) obj2, false, j);
                c2x0Var.f = null;
                a4x0 a4x0VarI = ((kxw0) c2x0Var.b).i();
                a4x0VarI.m1();
                a4x0VarI.n1();
                a4x0VarI.z1(new lfr(a4x0VarI, (r1x0) null));
                break;
            default:
                ((tsn) obj2).run();
                fr40 fr40Var = (fr40) obj;
                fr40Var.getClass();
                trs0 trs0Var = new trs0(Executors.callable(this, null));
                dr40 dr40Var = new dr40(trs0Var, fr40Var.b.schedule(trs0Var, j, TimeUnit.MINUTES));
                dr40Var.a(new kfr(dr40Var, (byte) 1), ank.f1158a);
                break;
        }
    }

    public y1x0(o7x0 o7x0Var, tsn tsnVar, fr40 fr40Var, long j) {
        this.c = tsnVar;
        this.d = fr40Var;
        this.b = j;
    }
}
