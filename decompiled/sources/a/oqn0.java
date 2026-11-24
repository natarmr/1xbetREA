package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class oqn0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f25697a;

    public oqn0(List list) {
        list.getClass();
        this.f25697a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof oqn0) && Intrinsics.d(this.f25697a, ((oqn0) obj).f25697a);
    }

    public final int hashCode() {
        return this.f25697a.hashCode();
    }

    public final String toString() {
        return twn.r(this.f25697a, "UiCardState(cards=", Separators.RPAREN);
    }
}
