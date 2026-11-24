package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class cdt implements rdt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mdm f4178a;

    public cdt(mdm mdmVar) {
        mdmVar.getClass();
        this.f4178a = mdmVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof cdt) && Intrinsics.d(this.f4178a, ((cdt) obj).f4178a);
    }

    public final int hashCode() {
        return this.f4178a.hashCode();
    }

    public final String toString() {
        return b1j.j("Empty(emptyConfig=", this.f4178a, Separators.RPAREN);
    }
}
