package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class mm00 implements om00 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f22016a;

    public mm00(String str) {
        str.getClass();
        this.f22016a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof mm00) && Intrinsics.d(this.f22016a, ((mm00) obj).f22016a);
    }

    public final int hashCode() {
        return this.f22016a.hashCode();
    }

    public final String toString() {
        return kng0.l("ShowErrorDialog(errorMessage=", this.f22016a, Separators.RPAREN);
    }
}
