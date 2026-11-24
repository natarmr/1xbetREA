package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class rgc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f30426a;
    public final a4x b;

    public rgc(a4x a4xVar, String str) {
        a4xVar.getClass();
        this.f30426a = str;
        this.b = a4xVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rgc)) {
            return false;
        }
        rgc rgcVar = (rgc) obj;
        return this.f30426a.equals(rgcVar.f30426a) && Intrinsics.d(this.b, rgcVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f30426a.hashCode() * 31);
    }

    public final String toString() {
        return f140.m("UiState(searchQuery=", this.f30426a, ", languageList=", this.b, Separators.RPAREN);
    }
}
