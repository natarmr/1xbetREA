package a;

import java.util.concurrent.ThreadPoolExecutor;

/* JADX INFO: loaded from: classes.dex */
public final class ssn extends rcb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ rcb f32733a;
    public final /* synthetic */ ThreadPoolExecutor b;

    public ssn(rcb rcbVar, ThreadPoolExecutor threadPoolExecutor) {
        this.f32733a = rcbVar;
        this.b = threadPoolExecutor;
    }

    @Override // a.rcb
    public final void a1(Throwable th) {
        ThreadPoolExecutor threadPoolExecutor = this.b;
        try {
            this.f32733a.a1(th);
        } finally {
            threadPoolExecutor.shutdown();
        }
    }

    @Override // a.rcb
    public final void b1(dgu dguVar) {
        ThreadPoolExecutor threadPoolExecutor = this.b;
        try {
            this.f32733a.b1(dguVar);
        } finally {
            threadPoolExecutor.shutdown();
        }
    }
}
