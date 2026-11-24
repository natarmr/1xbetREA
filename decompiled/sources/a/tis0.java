package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class tis0 extends uis0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mdm f34022a;

    public tis0(mdm mdmVar) {
        mdmVar.getClass();
        this.f34022a = mdmVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof tis0) && Intrinsics.d(this.f34022a, ((tis0) obj).f34022a);
    }

    public final int hashCode() {
        return this.f34022a.hashCode();
    }

    public final String toString() {
        return b1j.j("Error(errorConfig=", this.f34022a, Separators.RPAREN);
    }
}
