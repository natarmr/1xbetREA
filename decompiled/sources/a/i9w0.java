package a;

import com.google.android.gms.common.Feature;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class i9w0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ua3 f14409a;
    public final Feature b;

    public /* synthetic */ i9w0(ua3 ua3Var, Feature feature) {
        this.f14409a = ua3Var;
        this.b = feature;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof i9w0)) {
            return false;
        }
        i9w0 i9w0Var = (i9w0) obj;
        return l8x.Z(this.f14409a, i9w0Var.f14409a) && l8x.Z(this.b, i9w0Var.b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f14409a, this.b});
    }

    public final String toString() {
        dq00 dq00Var = new dq00(this);
        dq00Var.a(this.f14409a, "key");
        dq00Var.a(this.b, "feature");
        return dq00Var.toString();
    }
}
