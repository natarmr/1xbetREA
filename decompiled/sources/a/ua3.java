package a;

import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class ua3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f35312a;
    public final yzn0 b;
    public final ea3 c;
    public final String d;

    public ua3(yzn0 yzn0Var, ea3 ea3Var, String str) {
        this.b = yzn0Var;
        this.c = ea3Var;
        this.d = str;
        this.f35312a = Arrays.hashCode(new Object[]{yzn0Var, ea3Var, str, null});
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ua3)) {
            return false;
        }
        ua3 ua3Var = (ua3) obj;
        return l8x.Z(this.b, ua3Var.b) && l8x.Z(this.c, ua3Var.c) && l8x.Z(this.d, ua3Var.d) && l8x.Z(null, null);
    }

    public final int hashCode() {
        return this.f35312a;
    }
}
