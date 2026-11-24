package a;

import android.os.Bundle;
import java.util.Arrays;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: loaded from: classes.dex */
public final class a0h0 implements g0h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final kd30 f25a;
    public boolean b;
    public Bundle c;
    public final n0o0 d;

    public a0h0(kd30 kd30Var, riu0 riu0Var) {
        kd30Var.getClass();
        this.f25a = kd30Var;
        this.d = maz.b(new a7g0(riu0Var, (byte) 11));
    }

    @Override // a.g0h0
    public final Bundle a() {
        lun.f20680a.getClass();
        Bundle bundleV = i120.V((Pair[]) Arrays.copyOf(new Pair[0], 0));
        Bundle bundle = this.c;
        if (bundle != null) {
            bundleV.putAll(bundle);
        }
        for (Map.Entry entry : ((b0h0) this.d.getValue()).b.entrySet()) {
            String str = (String) entry.getKey();
            Bundle bundleA = ((ufd) ((vzg0) entry.getValue()).b.e).a();
            if (!bundleA.isEmpty()) {
                str.getClass();
                bundleV.putBundle(str, bundleA);
            }
        }
        this.b = false;
        return bundleV;
    }

    public final void b() {
        if (this.b) {
            return;
        }
        Bundle bundleH = this.f25a.H("androidx.lifecycle.internal.SavedStateHandlesProvider");
        lun.f20680a.getClass();
        Bundle bundleV = i120.V((Pair[]) Arrays.copyOf(new Pair[0], 0));
        Bundle bundle = this.c;
        if (bundle != null) {
            bundleV.putAll(bundle);
        }
        if (bundleH != null) {
            bundleV.putAll(bundleH);
        }
        this.c = bundleV;
        this.b = true;
    }
}
