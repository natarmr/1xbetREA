package a;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.huawei.hms.api.ConnectionResult;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class vwq implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f38164a;
    public final /* synthetic */ Fragment b;

    public /* synthetic */ vwq(Fragment fragment, Bundle bundle) {
        this.f38164a = (byte) 16;
        this.b = fragment;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.f38164a;
        Fragment fragment = this.b;
        switch (b) {
            case 0:
                fragment.w1.a(kkz.ON_STOP);
                break;
            case 1:
                fragment.u1.d(kkz.ON_PAUSE);
                break;
            case 2:
                fragment.d0();
                break;
            case 3:
                fragment.u1.d(kkz.ON_DESTROY);
                break;
            case 4:
                fragment.Y();
                break;
            case 5:
                fragment.a0();
                break;
            case 6:
                fragment.e0();
                break;
            case 7:
                fragment.u1.d(kkz.ON_RESUME);
                break;
            case 8:
                fragment.w1.a(kkz.ON_RESUME);
                break;
            case 9:
                fragment.w1.a(kkz.ON_DESTROY);
                break;
            case 10:
                fragment.u1.d(kkz.ON_STOP);
                break;
            case 11:
                fragment.Z();
                break;
            case 12:
                fragment.u1.d(kkz.ON_CREATE);
                break;
            case 13:
                n6r n6rVar = fragment.w1;
                ((nw20) n6rVar.g).p(fragment.d);
                fragment.d = null;
                break;
            case 14:
                fragment.w1.a(kkz.ON_CREATE);
                break;
            case 15:
                fragment.h0();
                break;
            case 16:
                fragment.T();
                break;
            case 17:
                fragment.g0();
                break;
            case 18:
                fragment.u1.d(kkz.ON_START);
                break;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                fragment.w1.a(kkz.ON_START);
                break;
            case 20:
                fragment.V(fragment.w.b);
                break;
            default:
                fragment.w1.a(kkz.ON_PAUSE);
                break;
        }
    }

    public /* synthetic */ vwq(Fragment fragment, byte b) {
        this.f38164a = b;
        this.b = fragment;
    }
}
