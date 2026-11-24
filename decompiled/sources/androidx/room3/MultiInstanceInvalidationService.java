package androidx.room3;

import a.wv40;
import a.yv40;
import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class MultiInstanceInvalidationService extends Service {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f45405a;
    public final LinkedHashMap b = new LinkedHashMap();
    public final yv40 c = new yv40(this, (byte) 0);
    public final wv40 d = new wv40(this);

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        return this.d;
    }
}
