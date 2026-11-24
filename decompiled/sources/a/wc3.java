package a;

import android.os.Bundle;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;

/* JADX INFO: loaded from: classes.dex */
public final class wc3 implements g0h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f38907a;
    public final Object b;

    public wc3(kd30 kd30Var) {
        this.f38907a = (byte) 1;
        this.b = new LinkedHashSet();
        kd30Var.S("androidx.savedstate.Restarter", this);
    }

    @Override // a.g0h0
    public final Bundle a() {
        byte b = this.f38907a;
        Object obj = this.b;
        switch (b) {
            case 0:
                Bundle bundle = new Bundle();
                ((yc3) obj).t().u(bundle);
                return bundle;
            default:
                lun.f20680a.getClass();
                Bundle bundleV = i120.V((Pair[]) Arrays.copyOf(new Pair[0], 0));
                List listL0 = CollectionsKt.L0((LinkedHashSet) obj);
                listL0.getClass();
                bundleV.putStringArrayList("classes_to_restore", l8x.q0(listL0));
                return bundleV;
        }
    }

    public wc3(yc3 yc3Var) {
        this.f38907a = (byte) 0;
        this.b = yc3Var;
    }
}
