package a;

import android.gov.nist.core.Separators;
import java.io.File;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class wos0 extends yos0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final qos0 f39513a;
    public final File b;

    public wos0(qos0 qos0Var, File file) {
        qos0Var.getClass();
        file.getClass();
        this.f39513a = qos0Var;
        this.b = file;
    }

    @Override // a.yos0
    public final qos0 a() {
        return this.f39513a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wos0)) {
            return false;
        }
        wos0 wos0Var = (wos0) obj;
        return Intrinsics.d(this.f39513a, wos0Var.f39513a) && Intrinsics.d(this.b, wos0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f39513a.hashCode() * 31);
    }

    public final String toString() {
        return "Success(fileKey=" + this.f39513a + ", file=" + this.b + Separators.RPAREN;
    }
}
