package a;

import android.util.Log;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class lot0 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i = 0;
    public final /* synthetic */ mot0 j;
    public boolean k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lot0(yje yjeVar, mot0 mot0Var, boolean z) {
        super(2, yjeVar);
        this.j = mot0Var;
        this.k = z;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        mot0 mot0Var = this.j;
        switch (b) {
            case 0:
                return new lot0(yjeVar, mot0Var);
            default:
                return new lot0(yjeVar, mot0Var, this.k);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        vne vneVar = (vne) obj;
        yje yjeVar = (yje) obj2;
        switch (this.i) {
            case 0:
                break;
        }
        return ((lot0) create(vneVar, yjeVar)).invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        odd oddVar;
        boolean zIsTerminated;
        switch (this.i) {
            case 0:
                wne wneVar = wne.f39444a;
                boolean z = this.k;
                if (z) {
                    if (z) {
                        z1x.P(obj);
                        return Unit.f46060a;
                    }
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                z1x.P(obj);
                if (l8x.f0("CXCP")) {
                    Log.d("CXCP", "Closing " + this.j);
                }
                kpt0 kpt0Var = this.j.f22148a;
                if (kpt0Var.e.a()) {
                    AutoCloseable autoCloseableA = kpt0Var.a();
                    if (autoCloseableA instanceof AutoCloseable) {
                        autoCloseableA.close();
                    } else {
                        if (!(autoCloseableA instanceof ExecutorService)) {
                            e9d0.o();
                            return null;
                        }
                        ExecutorService executorService = (ExecutorService) autoCloseableA;
                        if (executorService != ForkJoinPool.commonPool() && !(zIsTerminated = executorService.isTerminated())) {
                            executorService.shutdown();
                            boolean z2 = false;
                            while (!zIsTerminated) {
                                try {
                                    zIsTerminated = executorService.awaitTermination(1L, TimeUnit.DAYS);
                                } catch (InterruptedException unused) {
                                    if (!z2) {
                                        executorService.shutdownNow();
                                        z2 = true;
                                    }
                                }
                            }
                            if (z2) {
                                Thread.currentThread().interrupt();
                            }
                        }
                    }
                }
                spt0 spt0Var = (spt0) this.j.i.getValue();
                synchronized (spt0Var.e) {
                    try {
                        oddVar = spt0Var.i;
                        if (oddVar == null) {
                            kzj kzjVar = spt0Var.f;
                            if (kzjVar != null) {
                                kzjVar.cancel(null);
                            }
                            spt0Var.c.h();
                            spt0Var.h = null;
                            oddVar = new odd();
                            spt0Var.i = oddVar;
                            spt0Var.e();
                        } else if (l8x.j0()) {
                            Log.w("CXCP", "UseCaseSurfaceManager is already stopping!");
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                this.k = true;
                Object objQ = oddVar.q(this);
                wne wneVar2 = wne.f39444a;
                if (objQ == wneVar) {
                    return wneVar;
                }
                return Unit.f46060a;
            default:
                wne wneVar3 = wne.f39444a;
                z1x.P(obj);
                if (!this.j.h.b()) {
                    b0a b0aVarA = this.j.f22148a.a();
                    boolean z3 = this.k;
                    iw9 iw9Var = b0aVarA.e;
                    synchronized (iw9Var.q) {
                        iw9Var.r = z3;
                    }
                } else if (l8x.f0("CXCP")) {
                    Log.d("CXCP", "UseCaseCamera is closed before setActiveResumeMode, skipping setup.");
                }
                return Unit.f46060a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lot0(yje yjeVar, mot0 mot0Var) {
        super(2, yjeVar);
        this.j = mot0Var;
    }
}
