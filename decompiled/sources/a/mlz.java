package a;

import android.app.Service;
import android.content.Intent;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;

/* JADX INFO: loaded from: classes.dex */
public abstract class mlz extends Service implements clz {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final cyu f22014a;

    public mlz() {
        cyu cyuVar = new cyu();
        cyuVar.f5196a = new glz(this, true);
        cyuVar.b = new Handler(Looper.getMainLooper());
        this.f22014a = cyuVar;
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        intent.getClass();
        cyu cyuVar = this.f22014a;
        cyuVar.getClass();
        cyuVar.K(kkz.ON_START);
        return null;
    }

    @Override // android.app.Service
    public void onCreate() {
        cyu cyuVar = this.f22014a;
        cyuVar.getClass();
        cyuVar.K(kkz.ON_CREATE);
        super.onCreate();
    }

    @Override // android.app.Service
    public void onDestroy() {
        cyu cyuVar = this.f22014a;
        cyuVar.getClass();
        cyuVar.K(kkz.ON_STOP);
        cyuVar.K(kkz.ON_DESTROY);
        super.onDestroy();
    }

    @Override // android.app.Service
    public final void onStart(Intent intent, int i) {
        cyu cyuVar = this.f22014a;
        cyuVar.getClass();
        cyuVar.K(kkz.ON_START);
        super.onStart(intent, i);
    }

    @Override // a.clz
    public final glz x() {
        return (glz) this.f22014a.f5196a;
    }
}
