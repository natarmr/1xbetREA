package kotlinx.coroutines.android;

import a.hmv;
import a.imv;
import a.jf4;
import a.vs10;
import a.xs10;
import android.os.Looper;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lkotlinx/coroutines/android/AndroidDispatcherFactory;", "La/xs10;", "kotlinx-coroutines-android"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class AndroidDispatcherFactory implements xs10 {
    @Override // a.xs10
    public final vs10 a(List list) {
        Looper mainLooper = Looper.getMainLooper();
        if (mainLooper != null) {
            return new hmv(imv.a(mainLooper));
        }
        jf4.n("The main looper is not available");
        return null;
    }

    @Override // a.xs10
    public final int b() {
        return 1073741823;
    }
}
