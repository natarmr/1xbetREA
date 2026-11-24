package a;

import android.gov.nist.core.Separators;
import java.io.File;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class ave0 implements hwe0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final u0f0 f1522a;
    public final File b;

    public ave0(u0f0 u0f0Var, File file) {
        file.getClass();
        this.f1522a = u0f0Var;
        this.b = file;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ave0)) {
            return false;
        }
        ave0 ave0Var = (ave0) obj;
        return this.f1522a == ave0Var.f1522a && Intrinsics.d(this.b, ave0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f1522a.hashCode() * 31);
    }

    public final String toString() {
        return "OnAgreementFieldClick(registrationFieldType=" + this.f1522a + ", fileDir=" + this.b + Separators.RPAREN;
    }
}
