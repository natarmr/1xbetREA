package a;

import android.content.Context;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: loaded from: classes.dex */
public final class zwq extends dxq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f45119a;
    public final /* synthetic */ Fragment b;

    public /* synthetic */ zwq(Fragment fragment, byte b) {
        this.f45119a = b;
        this.b = fragment;
    }

    @Override // a.dxq
    public final void a() {
        switch (this.f45119a) {
            case 0:
                Fragment fragment = this.b;
                ((h0h0) fragment.z1.f24215a).a();
                zzg0.b(fragment);
                Bundle bundle = fragment.b;
                fragment.z1.p(bundle != null ? bundle.getBundle("registryState") : null);
                break;
            default:
                Fragment fragment2 = this.b;
                fbv fbvVar = fragment2.v1;
                Context context = fragment2.w.b;
                fbvVar.b = context;
                Iterator it = ((CopyOnWriteArraySet) fbvVar.f9280a).iterator();
                while (it.hasNext()) {
                    ((bh60) it.next()).a(context);
                }
                break;
        }
    }
}
