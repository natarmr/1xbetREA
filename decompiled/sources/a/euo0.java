package a;

import com.google.android.gms.common.Feature;

/* JADX INFO: loaded from: classes2.dex */
public final class euo0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public mff0 f8431a;
    public boolean b;
    public boolean c;
    public Feature[] d;
    public char e;

    public final s9w0 a() {
        boolean z = true;
        s0x.B("execute parameter required", this.f8431a != null);
        if (!this.c) {
            Feature[] featureArr = this.d;
            if (featureArr == null || (featureArr.length) == 0) {
                z = false;
                break;
            }
            for (Feature feature : featureArr) {
                if (!feature.d) {
                    z = false;
                    break;
                }
            }
            this.b = z;
        }
        return new s9w0(this, this.d, this.b, this.e);
    }
}
