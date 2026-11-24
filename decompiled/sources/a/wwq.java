package a;

import android.os.Bundle;
import androidx.fragment.app.Fragment;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class wwq implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f39897a;
    public final /* synthetic */ Fragment b;
    public final /* synthetic */ Bundle c;

    public /* synthetic */ wwq(Fragment fragment, Bundle bundle, byte b) {
        this.f39897a = b;
        this.b = fragment;
        this.c = bundle;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.f39897a;
        Bundle bundle = this.c;
        Fragment fragment = this.b;
        switch (b) {
            case 0:
                fragment.f0(bundle);
                break;
            case 1:
                fragment.W(bundle);
                break;
            case 2:
                fragment.j0(bundle);
                break;
            default:
                fragment.i0(fragment.l1, bundle);
                break;
        }
    }
}
