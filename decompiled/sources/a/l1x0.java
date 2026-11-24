package a;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class l1x0 implements lin0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ l1x0 f19281a = new l1x0();

    @Override // a.lin0
    public final Object get() {
        Object obj = c1x0.j;
        ScheduledExecutorService scheduledExecutorServiceNewSingleThreadScheduledExecutor = Executors.newSingleThreadScheduledExecutor(ixv.b);
        return scheduledExecutorServiceNewSingleThreadScheduledExecutor instanceof fr40 ? (fr40) scheduledExecutorServiceNewSingleThreadScheduledExecutor : new fr40(scheduledExecutorServiceNewSingleThreadScheduledExecutor);
    }
}
