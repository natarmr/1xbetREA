package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class ld00 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f19825a;

    public ld00(List list) {
        list.getClass();
        this.f19825a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ld00) && Intrinsics.d(this.f19825a, ((ld00) obj).f19825a);
    }

    public final int hashCode() {
        return this.f19825a.hashCode();
    }

    public final String toString() {
        return twn.r(this.f19825a, "ListItemContent(content=", Separators.RPAREN);
    }
}
