package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class lp5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o0x f20424a;

    public lp5(o0x o0xVar) {
        this.f20424a = o0xVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof lp5) && Intrinsics.d(this.f20424a, ((lp5) obj).f20424a);
    }

    public final int hashCode() {
        o0x o0xVar = this.f20424a;
        if (o0xVar == null) {
            return 0;
        }
        return o0xVar.hashCode();
    }

    public final String toString() {
        return "DecorationImage(image=" + this.f20424a + Separators.RPAREN;
    }
}
