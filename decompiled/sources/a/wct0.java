package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@ahi0
public final class wct0 {
    public static final vct0 Companion = new vct0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final nct0 f38941a;

    public /* synthetic */ wct0(int i, nct0 nct0Var) {
        if ((i & 1) == 0) {
            this.f38941a = null;
        } else {
            this.f38941a = nct0Var;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wct0) && Intrinsics.d(this.f38941a, ((wct0) obj).f38941a);
    }

    public final int hashCode() {
        nct0 nct0Var = this.f38941a;
        if (nct0Var == null) {
            return 0;
        }
        return nct0Var.hashCode();
    }

    public final String toString() {
        return "ValueContent(main=" + this.f38941a + Separators.RPAREN;
    }
}
