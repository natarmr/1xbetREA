package a;

import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes2.dex */
public abstract class nj3 implements lj3 {
    private final mj3 appStateMonitor;
    private boolean isRegisteredForAppState = false;
    private ts3 currentAppState = ts3.APPLICATION_PROCESS_STATE_UNKNOWN;
    private final WeakReference<lj3> appStateCallback = new WeakReference<>(this);

    public nj3(mj3 mj3Var) {
        this.appStateMonitor = mj3Var;
    }

    public ts3 getAppState() {
        return this.currentAppState;
    }

    public WeakReference<lj3> getAppStateCallback() {
        return this.appStateCallback;
    }

    public void incrementTsnsCount(int i) {
        this.appStateMonitor.h.addAndGet(i);
    }

    @Override // a.lj3
    public void onUpdateAppState(ts3 ts3Var) {
        ts3 ts3Var2 = this.currentAppState;
        ts3 ts3Var3 = ts3.APPLICATION_PROCESS_STATE_UNKNOWN;
        if (ts3Var2 == ts3Var3) {
            this.currentAppState = ts3Var;
        } else {
            if (ts3Var2 == ts3Var || ts3Var == ts3Var3) {
                return;
            }
            this.currentAppState = ts3.FOREGROUND_BACKGROUND;
        }
    }

    public void registerForAppState() {
        if (this.isRegisteredForAppState) {
            return;
        }
        mj3 mj3Var = this.appStateMonitor;
        this.currentAppState = mj3Var.n;
        WeakReference<lj3> weakReference = this.appStateCallback;
        synchronized (mj3Var.f) {
            mj3Var.f.add(weakReference);
        }
        this.isRegisteredForAppState = true;
    }

    public void unregisterForAppState() {
        if (this.isRegisteredForAppState) {
            mj3 mj3Var = this.appStateMonitor;
            WeakReference<lj3> weakReference = this.appStateCallback;
            synchronized (mj3Var.f) {
                mj3Var.f.remove(weakReference);
            }
            this.isRegisteredForAppState = false;
        }
    }
}
