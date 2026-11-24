package a;

import android.os.Bundle;
import java.util.Arrays;
import java.util.LinkedHashMap;
import kotlin.Pair;

/* JADX INFO: loaded from: classes6.dex */
public final class siu0 implements riu0, wmv {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ piu0 f32279a;
    public final /* synthetic */ miu0 b;
    public final /* synthetic */ wbf c;
    public final /* synthetic */ Bundle d;

    public siu0(piu0 piu0Var, miu0 miu0Var, wbf wbfVar, Bundle bundle) {
        this.f32279a = piu0Var;
        this.b = miu0Var;
        this.c = wbfVar;
        this.d = bundle;
    }

    @Override // a.riu0
    public final piu0 g() {
        return this.f32279a;
    }

    @Override // a.wmv
    public final miu0 n() {
        return this.b;
    }

    @Override // a.wmv
    public final by40 o() {
        by40 by40Var = new by40(this.c);
        lun.f20680a.getClass();
        Bundle bundleV = i120.V((Pair[]) Arrays.copyOf(new Pair[0], 0));
        LinkedHashMap linkedHashMap = by40Var.f38875a;
        cge0 cge0Var = zzg0.c;
        Bundle bundle = (Bundle) linkedHashMap.get(cge0Var);
        if (bundle != null) {
            bundleV.putAll(bundle);
        }
        Bundle bundle2 = this.d;
        bundle2.getClass();
        bundleV.putAll(bundle2);
        linkedHashMap.put(cge0Var, bundleV);
        linkedHashMap.put(zzg0.b, this);
        return by40Var;
    }
}
