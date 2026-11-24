package a;

import android.gov.nist.core.Separators;
import java.io.File;

/* JADX INFO: loaded from: classes3.dex */
public final class tos0 extends yos0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final pos0 f34300a;
    public final File b;
    public final Exception c;

    public tos0(pos0 pos0Var, File file, Exception exc) {
        this.f34300a = pos0Var;
        this.b = file;
        this.c = exc;
    }

    @Override // a.yos0
    public final qos0 a() {
        return this.f34300a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tos0)) {
            return false;
        }
        tos0 tos0Var = (tos0) obj;
        return this.f34300a.equals(tos0Var.f34300a) && this.b.equals(tos0Var.b) && this.c.equals(tos0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.f34300a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "ErrorUpload(fileKey=" + this.f34300a + ", file=" + this.b + ", error=" + this.c + Separators.RPAREN;
    }
}
