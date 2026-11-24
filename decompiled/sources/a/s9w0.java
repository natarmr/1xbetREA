package a;

import com.google.android.gms.common.Feature;

/* JADX INFO: loaded from: classes2.dex */
public final class s9w0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Feature[] f31868a;
    public final boolean b;
    public final char c;
    public final /* synthetic */ euo0 d;

    /* JADX WARN: Multi-variable type inference failed */
    public s9w0(euo0 euo0Var, Feature[] featureArr, boolean z, int i) {
        this.d = euo0Var;
        this.f31868a = featureArr;
        boolean z2 = false;
        if (featureArr != null && z) {
            z2 = true;
        }
        this.b = z2;
        this.c = i;
    }

    public static euo0 a() {
        euo0 euo0Var = new euo0();
        euo0Var.b = false;
        euo0Var.c = false;
        euo0Var.e = (char) 0;
        return euo0Var;
    }
}
