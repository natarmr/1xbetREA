package com.google.firebase.perf.session;

import a.b1;
import a.mj3;
import a.nj3;
import a.rii0;
import a.ts3;
import android.content.Context;
import com.google.firebase.perf.session.gauges.GaugeManager;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/* JADX INFO: loaded from: classes2.dex */
public class SessionManager extends nj3 {
    private static final SessionManager instance = new SessionManager();
    private final mj3 appStateMonitor;
    private final Set<WeakReference<rii0>> clients;
    private final GaugeManager gaugeManager;
    private PerfSession perfSession;
    private Future syncInitFuture;

    public SessionManager(GaugeManager gaugeManager, PerfSession perfSession, mj3 mj3Var) {
        super(mj3.a());
        this.clients = new HashSet();
        this.gaugeManager = gaugeManager;
        this.perfSession = perfSession;
        this.appStateMonitor = mj3Var;
        registerForAppState();
    }

    public static SessionManager getInstance() {
        return instance;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lambda$setApplicationContext$0(Context context, PerfSession perfSession) {
        this.gaugeManager.initializeGaugeMetadataManager(context);
        if (perfSession.c) {
            this.gaugeManager.logGaugeMetadata(perfSession.f45670a, ts3.FOREGROUND);
        }
    }

    private void logGaugeMetadataIfCollectionEnabled(ts3 ts3Var) {
        PerfSession perfSession = this.perfSession;
        if (perfSession.c) {
            this.gaugeManager.logGaugeMetadata(perfSession.f45670a, ts3Var);
        }
    }

    private void startOrStopCollectingGauges(ts3 ts3Var) {
        PerfSession perfSession = this.perfSession;
        boolean z = perfSession.c;
        GaugeManager gaugeManager = this.gaugeManager;
        if (z) {
            gaugeManager.startCollectingGauges(perfSession, ts3Var);
        } else {
            gaugeManager.stopCollectingGauges();
        }
    }

    public Future getSyncInitFuture() {
        return this.syncInitFuture;
    }

    public void initializeGaugeCollection() {
        ts3 ts3Var = ts3.FOREGROUND;
        logGaugeMetadataIfCollectionEnabled(ts3Var);
        startOrStopCollectingGauges(ts3Var);
    }

    @Override // a.nj3, a.lj3
    public void onUpdateAppState(ts3 ts3Var) {
        super.onUpdateAppState(ts3Var);
        if (this.appStateMonitor.p) {
            return;
        }
        if (ts3Var == ts3.FOREGROUND) {
            updatePerfSession(PerfSession.d(UUID.randomUUID().toString()));
        } else if (this.perfSession.g()) {
            updatePerfSession(PerfSession.d(UUID.randomUUID().toString()));
        } else {
            startOrStopCollectingGauges(ts3Var);
        }
    }

    public final PerfSession perfSession() {
        return this.perfSession;
    }

    public void registerForSessionUpdates(WeakReference<rii0> weakReference) {
        synchronized (this.clients) {
            this.clients.add(weakReference);
        }
    }

    public void setApplicationContext(Context context) {
        this.syncInitFuture = Executors.newSingleThreadExecutor().submit(new b1(this, context, this.perfSession, (byte) 24));
    }

    public void setPerfSession(PerfSession perfSession) {
        this.perfSession = perfSession;
    }

    public void stopGaugeCollectionIfSessionRunningTooLong() {
        if (this.perfSession.g()) {
            this.gaugeManager.stopCollectingGauges();
        }
    }

    public void unregisterForSessionUpdates(WeakReference<rii0> weakReference) {
        synchronized (this.clients) {
            this.clients.remove(weakReference);
        }
    }

    public void updatePerfSession(PerfSession perfSession) {
        if (perfSession.f45670a == this.perfSession.f45670a) {
            return;
        }
        this.perfSession = perfSession;
        synchronized (this.clients) {
            try {
                Iterator<WeakReference<rii0>> it = this.clients.iterator();
                while (it.hasNext()) {
                    rii0 rii0Var = it.next().get();
                    if (rii0Var != null) {
                        rii0Var.a(perfSession);
                    } else {
                        it.remove();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        logGaugeMetadataIfCollectionEnabled(this.appStateMonitor.n);
        startOrStopCollectingGauges(this.appStateMonitor.n);
    }

    private SessionManager() {
        this(GaugeManager.getInstance(), PerfSession.d(UUID.randomUUID().toString()), mj3.a());
    }
}
