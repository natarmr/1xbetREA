package a;

import android.gov.nist.core.Separators;
import java.io.File;

/* JADX INFO: loaded from: classes3.dex */
public final class vos0 extends yos0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final pos0 f37782a;
    public final File b;

    public vos0(pos0 pos0Var, File file) {
        this.f37782a = pos0Var;
        this.b = file;
    }

    @Override // a.yos0
    public final qos0 a() {
        return this.f37782a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vos0)) {
            return false;
        }
        vos0 vos0Var = (vos0) obj;
        return this.f37782a.equals(vos0Var.f37782a) && this.b.equals(vos0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f37782a.hashCode() * 31);
    }

    public final String toString() {
        return "NeedUpload(fileKey=" + this.f37782a + ", file=" + this.b + Separators.RPAREN;
    }
}
