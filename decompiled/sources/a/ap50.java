package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class ap50 implements cp50 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mdm f1234a;

    public ap50(mdm mdmVar) {
        mdmVar.getClass();
        this.f1234a = mdmVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ap50) && Intrinsics.d(this.f1234a, ((ap50) obj).f1234a);
    }

    public final int hashCode() {
        return this.f1234a.hashCode();
    }

    public final String toString() {
        return b1j.j("Error(config=", this.f1234a, Separators.RPAREN);
    }
}
