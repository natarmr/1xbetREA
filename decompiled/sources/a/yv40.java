package a;

import android.app.Service;
import android.os.IInterface;
import android.os.RemoteCallbackList;
import androidx.room3.MultiInstanceInvalidationService;

/* JADX INFO: loaded from: classes.dex */
public final class yv40 extends RemoteCallbackList {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f43302a;
    public final /* synthetic */ Service b;

    public /* synthetic */ yv40(Service service, byte b) {
        this.f43302a = b;
        this.b = service;
    }

    @Override // android.os.RemoteCallbackList
    public final void onCallbackDied(IInterface iInterface, Object obj) {
        byte b = this.f43302a;
        Service service = this.b;
        switch (b) {
            case 0:
                ((zuw) iInterface).getClass();
                obj.getClass();
                ((MultiInstanceInvalidationService) service).b.remove((Integer) obj);
                break;
            default:
                ((avw) iInterface).getClass();
                obj.getClass();
                ((androidx.room.MultiInstanceInvalidationService) service).b.remove((Integer) obj);
                break;
        }
    }
}
