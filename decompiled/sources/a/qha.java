package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class qha implements sha {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f28727a;

    public qha(String str) {
        str.getClass();
        this.f28727a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qha) && Intrinsics.d(this.f28727a, ((qha) obj).f28727a);
    }

    public final int hashCode() {
        return this.f28727a.hashCode();
    }

    public final String toString() {
        return kng0.l("Text(text=", this.f28727a, Separators.RPAREN);
    }
}
