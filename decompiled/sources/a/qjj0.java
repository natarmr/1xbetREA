package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes6.dex */
public final class qjj0 extends sjj0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f28843a;

    public qjj0(String str) {
        str.getClass();
        this.f28843a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qjj0) && Intrinsics.d(this.f28843a, ((qjj0) obj).f28843a);
    }

    public final int hashCode() {
        return Integer.hashCode(R.dimen.size_42) + (this.f28843a.hashCode() * 31);
    }

    public final String toString() {
        return dw9.n(R.dimen.size_42, "Group(group=", this.f28843a, ", height=", Separators.RPAREN);
    }
}
