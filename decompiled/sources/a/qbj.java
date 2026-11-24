package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class qbj implements tbj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f28448a;
    public final boolean b;

    public qbj(Object obj, boolean z) {
        this.f28448a = obj;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qbj)) {
            return false;
        }
        qbj qbjVar = (qbj) obj;
        return Intrinsics.d(this.f28448a, qbjVar.f28448a) && this.b == qbjVar.b;
    }

    public final int hashCode() {
        Object obj = this.f28448a;
        return Boolean.hashCode(this.b) + ((obj == null ? 0 : obj.hashCode()) * 31);
    }

    public final String toString() {
        return "WithContent(content=" + this.f28448a + ", refreshable=" + this.b + Separators.RPAREN;
    }
}
