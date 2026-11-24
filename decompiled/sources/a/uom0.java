package a;

import android.net.Uri;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class uom0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f36024a;
    public final long b;
    public final Uri c;
    public final b4x d;
    public final b4x e;

    public uom0(int i, long j, Uri uri, rcf0 rcf0Var, rcf0 rcf0Var2) {
        this.f36024a = i;
        this.b = j;
        this.c = uri;
        this.d = b4x.o(rcf0Var);
        this.e = b4x.o(rcf0Var2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uom0)) {
            return false;
        }
        uom0 uom0Var = (uom0) obj;
        return this.f36024a == uom0Var.f36024a && this.b == uom0Var.b && Objects.equals(this.c, uom0Var.c) && Objects.equals(this.d, uom0Var.d) && Objects.equals(this.e, uom0Var.e);
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.f36024a), Long.valueOf(this.b), this.c, this.d, this.e);
    }
}
