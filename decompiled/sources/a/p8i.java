package a;

import com.google.firebase.perf.config.RemoteConfigManager;
import com.google.firebase.perf.session.SessionManager;

/* JADX INFO: loaded from: classes3.dex */
public final class p8i implements n5d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f26555a;

    public /* synthetic */ p8i(byte b) {
        this.f26555a = b;
    }

    @Override // a.o5d0
    public final Object get() {
        switch (this.f26555a) {
            case 0:
                fmg0 fmg0Var = new fmg0();
                fmg0Var.f9780a = iun.f15405a;
                return fmg0Var;
            case 1:
                return new rn4();
            case 2:
                return new s9i();
            case 3:
                return new mne();
            case 4:
                return new r2t();
            case 5:
                return new n8v();
            case 6:
                return new izy();
            case 7:
                return new es00();
            case 8:
                return new bu90();
            case 9:
                return new hdf0();
            case 10:
                hsd hsdVarE = hsd.e();
                x1x.y(hsdVarE);
                return hsdVarE;
            case 11:
                RemoteConfigManager remoteConfigManager = RemoteConfigManager.getInstance();
                x1x.y(remoteConfigManager);
                return remoteConfigManager;
            case 12:
                SessionManager sessionManager = SessionManager.getInstance();
                x1x.y(sessionManager);
                return sessionManager;
            case 13:
                return new wo10();
            case 14:
                return new s5w0();
            case 15:
                return new f5w0();
            default:
                return new j6w0();
        }
    }

    public /* synthetic */ p8i(Object obj, byte b) {
        this.f26555a = b;
    }
}
