package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class jog0 implements kog0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f16857a;

    public jog0(List list) {
        list.getClass();
        this.f16857a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jog0) && Intrinsics.d(this.f16857a, ((jog0) obj).f16857a);
    }

    public final int hashCode() {
        return this.f16857a.hashCode();
    }

    public final String toString() {
        return twn.r(this.f16857a, "ShowRules(ruleList=", Separators.RPAREN);
    }
}
