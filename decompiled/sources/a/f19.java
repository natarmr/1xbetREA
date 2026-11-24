package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class f19 implements g19 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mdm f8756a;

    public f19(mdm mdmVar) {
        mdmVar.getClass();
        this.f8756a = mdmVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f19) && Intrinsics.d(this.f8756a, ((f19) obj).f8756a);
    }

    public final int hashCode() {
        return this.f8756a.hashCode();
    }

    public final String toString() {
        return b1j.j("Error(emptyConfig=", this.f8756a, Separators.RPAREN);
    }
}
