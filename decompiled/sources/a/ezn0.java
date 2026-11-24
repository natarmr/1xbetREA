package a;

import androidx.appcompat.widget.SwitchCompat;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
public final class ezn0 extends nsn {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WeakReference f8680a;

    public ezn0(SwitchCompat switchCompat) {
        this.f8680a = new WeakReference(switchCompat);
    }

    @Override // a.nsn
    public final void a() {
        SwitchCompat switchCompat = (SwitchCompat) this.f8680a.get();
        if (switchCompat != null) {
            switchCompat.c();
        }
    }

    @Override // a.nsn
    public final void b() {
        SwitchCompat switchCompat = (SwitchCompat) this.f8680a.get();
        if (switchCompat != null) {
            switchCompat.c();
        }
    }
}
