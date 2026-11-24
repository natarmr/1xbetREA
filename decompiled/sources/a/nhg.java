package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class nhg implements rhg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final cnb f23531a;

    public nhg(cnb cnbVar) {
        cnbVar.getClass();
        this.f23531a = cnbVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof nhg) && Intrinsics.d(this.f23531a, ((nhg) obj).f23531a);
    }

    public final int hashCode() {
        return this.f23531a.hashCode();
    }

    public final String toString() {
        return "OnSegmentSelect(tabKey=" + this.f23531a + Separators.RPAREN;
    }
}
