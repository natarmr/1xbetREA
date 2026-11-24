package a;

import android.gov.nist.core.Separators;
import java.io.File;

/* JADX INFO: loaded from: classes3.dex */
public final class xos0 extends yos0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final pos0 f41236a;
    public final File b;

    public xos0(pos0 pos0Var, File file) {
        this.f41236a = pos0Var;
        this.b = file;
    }

    @Override // a.yos0
    public final qos0 a() {
        return this.f41236a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xos0)) {
            return false;
        }
        xos0 xos0Var = (xos0) obj;
        return this.f41236a.equals(xos0Var.f41236a) && this.b.equals(xos0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f41236a.hashCode() * 31);
    }

    public final String toString() {
        return "Uploading(fileKey=" + this.f41236a + ", file=" + this.b + Separators.RPAREN;
    }
}
