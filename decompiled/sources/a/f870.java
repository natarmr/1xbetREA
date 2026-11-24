package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class f870 implements p870 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final bhr f9093a;

    static {
        ahr ahrVar = bhr.Companion;
    }

    public f870(bhr bhrVar) {
        bhrVar.getClass();
        this.f9093a = bhrVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f870) && Intrinsics.d(this.f9093a, ((f870) obj).f9093a);
    }

    public final int hashCode() {
        return this.f9093a.hashCode();
    }

    public final String toString() {
        return "OnSetGameUnderMaintenance(event=" + this.f9093a + Separators.RPAREN;
    }
}
