package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class ds80 implements es80 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mdm f6601a;

    public ds80(mdm mdmVar) {
        mdmVar.getClass();
        this.f6601a = mdmVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ds80) && Intrinsics.d(this.f6601a, ((ds80) obj).f6601a);
    }

    public final int hashCode() {
        return this.f6601a.hashCode();
    }

    public final String toString() {
        return b1j.j("Error(emptyConfig=", this.f6601a, Separators.RPAREN);
    }
}
