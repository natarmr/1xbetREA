package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class gdt implements rdt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mdm f11117a;

    public gdt(mdm mdmVar) {
        mdmVar.getClass();
        this.f11117a = mdmVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gdt) && Intrinsics.d(this.f11117a, ((gdt) obj).f11117a);
    }

    public final int hashCode() {
        return this.f11117a.hashCode();
    }

    public final String toString() {
        return b1j.j("Error(emptyConfig=", this.f11117a, Separators.RPAREN);
    }
}
