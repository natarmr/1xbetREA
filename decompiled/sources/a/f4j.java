package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class f4j implements g4j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mdm f8915a;

    public f4j(mdm mdmVar) {
        mdmVar.getClass();
        this.f8915a = mdmVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f4j) && Intrinsics.d(this.f8915a, ((f4j) obj).f8915a);
    }

    public final int hashCode() {
        return this.f8915a.hashCode();
    }

    public final String toString() {
        return b1j.j("Error(emptyConfig=", this.f8915a, Separators.RPAREN);
    }
}
