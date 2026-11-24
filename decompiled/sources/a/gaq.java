package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class gaq implements naq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f10981a;

    public gaq(String str) {
        str.getClass();
        this.f10981a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gaq) && Intrinsics.d(this.f10981a, ((gaq) obj).f10981a);
    }

    public final int hashCode() {
        return this.f10981a.hashCode();
    }

    public final String toString() {
        return kng0.l("ShowBetExistsErrorDialog(exceptionMessage=", this.f10981a, Separators.RPAREN);
    }
}
