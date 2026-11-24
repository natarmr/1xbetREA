package a;

import android.os.Build;
import android.os.StrictMode;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import com.google.firebase.perf.session.gauges.GaugeManager;
import java.util.Collections;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ogd implements p5d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f25213a;

    public /* synthetic */ ogd(byte b) {
        this.f25213a = b;
    }

    @Override // a.p5d0
    public final Object get() {
        switch (this.f25213a) {
            case 0:
                return Collections.EMPTY_SET;
            case 1:
                b8z b8zVar = ExecutorsRegistrar.f45662a;
                StrictMode.ThreadPolicy.Builder builderDetectNetwork = new StrictMode.ThreadPolicy.Builder().detectNetwork();
                builderDetectNetwork.detectResourceMismatches();
                if (Build.VERSION.SDK_INT >= 26) {
                    builderDetectNetwork.detectUnbufferedIo();
                }
                return new m3k(Executors.newFixedThreadPool(4, new eyf("Firebase Background", 10, builderDetectNetwork.penaltyLog().build())), (ScheduledExecutorService) ExecutorsRegistrar.d.get());
            case 2:
                b8z b8zVar2 = ExecutorsRegistrar.f45662a;
                return new m3k(Executors.newFixedThreadPool(Math.max(2, Runtime.getRuntime().availableProcessors()), new eyf("Firebase Lite", 0, new StrictMode.ThreadPolicy.Builder().detectAll().penaltyLog().build())), (ScheduledExecutorService) ExecutorsRegistrar.d.get());
            case 3:
                b8z b8zVar3 = ExecutorsRegistrar.f45662a;
                return new m3k(Executors.newCachedThreadPool(new eyf("Firebase Blocking", 11, null)), (ScheduledExecutorService) ExecutorsRegistrar.d.get());
            case 4:
                b8z b8zVar4 = ExecutorsRegistrar.f45662a;
                return Executors.newSingleThreadScheduledExecutor(new eyf("Firebase Scheduler", 0, null));
            case 5:
                return null;
            case 6:
                return Executors.newSingleThreadScheduledExecutor();
            case 7:
                return GaugeManager.lambda$new$0();
            case 8:
                return GaugeManager.lambda$new$1();
            case 9:
            default:
                return null;
        }
    }
}
