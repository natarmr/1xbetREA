package a;

import android.gov.nist.core.Separators;
import java.io.File;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class l2f0 implements q3f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final u0f0 f19305a;
    public final File b;

    public l2f0(u0f0 u0f0Var, File file) {
        file.getClass();
        this.f19305a = u0f0Var;
        this.b = file;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l2f0)) {
            return false;
        }
        l2f0 l2f0Var = (l2f0) obj;
        return this.f19305a == l2f0Var.f19305a && Intrinsics.d(this.b, l2f0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f19305a.hashCode() * 31);
    }

    public final String toString() {
        return "OnAgreementFieldClick(registrationFieldType=" + this.f19305a + ", fileDir=" + this.b + Separators.RPAREN;
    }
}
