package a;

import android.gov.nist.core.Separators;
import java.io.File;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class m8f0 implements s9f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final u0f0 f21367a;
    public final File b;

    public m8f0(u0f0 u0f0Var, File file) {
        file.getClass();
        this.f21367a = u0f0Var;
        this.b = file;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m8f0)) {
            return false;
        }
        m8f0 m8f0Var = (m8f0) obj;
        return this.f21367a == m8f0Var.f21367a && Intrinsics.d(this.b, m8f0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f21367a.hashCode() * 31);
    }

    public final String toString() {
        return "OnAgreementFieldClick(registrationFieldType=" + this.f21367a + ", fileDir=" + this.b + Separators.RPAREN;
    }
}
