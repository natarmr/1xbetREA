package org.xplatform.services.mobile_services.impl.workers;

import a.af3;
import a.b1j;
import a.bzf;
import a.fsd;
import a.g760;
import a.h760;
import a.i7w0;
import a.jf4;
import a.lp4;
import a.lvq;
import a.mne;
import a.o5d0;
import a.ze3;
import a.zx10;
import android.app.Application;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.ComponentCallbacks2;
import android.content.Context;
import android.os.Build;
import androidx.work.CoroutineWorker;
import androidx.work.WorkerParameters;
import kotlin.Metadata;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lorg/xplatform/services/mobile_services/impl/workers/CustomerIOPushWorker;", "Landroidx/work/CoroutineWorker;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "params", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class CustomerIOPushWorker extends CoroutineWorker {
    public final Context g;
    public final zx10 h;
    public final h760 i;
    public final mne j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CustomerIOPushWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        context.getClass();
        workerParameters.getClass();
        this.g = context;
        Context applicationContext = context.getApplicationContext();
        applicationContext.getClass();
        ComponentCallbacks2 componentCallbacks2 = (Application) applicationContext;
        af3 af3Var = componentCallbacks2 instanceof af3 ? (af3) componentCallbacks2 : null;
        if (af3Var != null) {
            o5d0 o5d0Var = (o5d0) af3Var.d().get(bzf.class);
            ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
            bzf bzfVar = (bzf) (ze3Var instanceof bzf ? ze3Var : null);
            if (bzfVar != null) {
                mne mneVar = bzfVar.f3465a;
                lp4 lp4Var = bzfVar.b;
                h760 h760Var = bzfVar.c;
                fsd fsdVar = bzfVar.e;
                zx10 zx10Var = bzfVar.d;
                lp4Var.getClass();
                h760Var.getClass();
                fsdVar.getClass();
                this.h = zx10Var;
                this.i = h760Var;
                this.j = mneVar;
                return;
            }
        }
        jf4.n(b1j.i(bzf.class, "Cannot create dependency "));
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:43:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:48:0x010e  */
    /* JADX WARN: Code duplicated, block: B:8:0x0016  */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0106, code lost:
    
        if (a.qjj.d0(r12, r0, r8) == r9) goto L45;
     */
    @Override // androidx.work.CoroutineWorker
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(a.yje r16) {
        /*
            Method dump skipped, instruction units count: 284
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: org.xplatform.services.mobile_services.impl.workers.CustomerIOPushWorker.c(a.yje):java.lang.Object");
    }

    @Override // androidx.work.CoroutineWorker
    public final Object d() {
        int i = Build.VERSION.SDK_INT;
        if (26 <= i && i < 32) {
            i7w0.b();
            ((NotificationManager) this.g.getSystemService(NotificationManager.class)).createNotificationChannel(new NotificationChannel("push_worker_foreground", "push_worker_foreground", 3));
        }
        g760 g760Var = new g760(this.f25193a, "push_worker_foreground");
        g760Var.s.icon = R.drawable.ic_save;
        g760Var.j = -2;
        Notification notificationA = g760Var.a();
        notificationA.getClass();
        return new lvq(1337, notificationA, 0);
    }
}
