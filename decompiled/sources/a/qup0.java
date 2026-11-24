package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class qup0 implements sup0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f29356a;

    public qup0(String str) {
        str.getClass();
        this.f29356a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qup0) && Intrinsics.d(this.f29356a, ((qup0) obj).f29356a);
    }

    public final int hashCode() {
        return this.f29356a.hashCode();
    }

    public final String toString() {
        return kng0.l("OnCopyCodeToClipboard(code=", this.f29356a, Separators.RPAREN);
    }
}
