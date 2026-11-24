package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class pef0 implements ref0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f26849a;

    public pef0(String str) {
        str.getClass();
        this.f26849a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof pef0) && Intrinsics.d(this.f26849a, ((pef0) obj).f26849a);
    }

    public final int hashCode() {
        return this.f26849a.hashCode();
    }

    public final String toString() {
        return kng0.l("SimpleMessage(message=", this.f26849a, Separators.RPAREN);
    }
}
