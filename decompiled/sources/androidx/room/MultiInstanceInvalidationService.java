package androidx.room;

import a.xv40;
import a.yv40;
import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class MultiInstanceInvalidationService extends Service {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f45404a;
    public final LinkedHashMap b = new LinkedHashMap();
    public final yv40 c = new yv40(this, (byte) 1);
    public final xv40 d = new xv40(this);

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        intent.getClass();
        return this.d;
    }
}
