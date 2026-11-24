package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class pc7 extends qc7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f26744a;

    public pc7(List list) {
        list.getClass();
        this.f26744a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof pc7) && Intrinsics.d(this.f26744a, ((pc7) obj).f26744a);
    }

    public final int hashCode() {
        return this.f26744a.hashCode();
    }

    public final String toString() {
        return twn.r(this.f26744a, "UpdateBetInfo(betsList=", Separators.RPAREN);
    }
}
