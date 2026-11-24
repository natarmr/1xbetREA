package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class gyl0 implements iyl0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f12136a;

    public gyl0(List list) {
        list.getClass();
        this.f12136a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gyl0) && Intrinsics.d(this.f12136a, ((gyl0) obj).f12136a);
    }

    public final int hashCode() {
        return this.f12136a.hashCode();
    }

    public final String toString() {
        return twn.r(this.f12136a, "Form(events=", Separators.RPAREN);
    }
}
