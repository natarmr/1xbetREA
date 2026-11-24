package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class la50 implements oa50 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final skm f19691a;

    public la50(skm skmVar) {
        skmVar.getClass();
        this.f19691a = skmVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof la50) && Intrinsics.d(this.f19691a, ((la50) obj).f19691a);
    }

    public final int hashCode() {
        return this.f19691a.hashCode();
    }

    public final String toString() {
        return "SingleIcon(iconModel=" + this.f19691a + Separators.RPAREN;
    }
}
