package a;

import android.os.Bundle;
import android.os.Looper;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class vnw0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map f37738a = Collections.synchronizedMap(new gx3(0));
    public byte b = 0;
    public Bundle c;

    public final void a(String str, nkz nkzVar) {
        Map map = this.f37738a;
        if (map.containsKey(str)) {
            jf4.o(rw2.o(new StringBuilder(str.length() + 59), "LifecycleCallback with tag ", str, " already added to this fragment."));
            return;
        }
        map.put(str, nkzVar);
        if (this.b > 0) {
            new jaw0(Looper.getMainLooper(), (byte) 3).post(new hf5((Object) this, (Object) nkzVar, (Object) str, false, (byte) 12));
        }
    }

    public final void b(Bundle bundle) {
        this.b = (byte) 1;
        this.c = bundle;
        for (Map.Entry entry : this.f37738a.entrySet()) {
            ((nkz) entry.getValue()).onCreate(bundle != null ? bundle.getBundle((String) entry.getKey()) : null);
        }
    }

    public final void c(Bundle bundle) {
        if (bundle == null) {
            return;
        }
        for (Map.Entry entry : this.f37738a.entrySet()) {
            Bundle bundle2 = new Bundle();
            ((nkz) entry.getValue()).onSaveInstanceState(bundle2);
            bundle.putBundle((String) entry.getKey(), bundle2);
        }
    }
}
