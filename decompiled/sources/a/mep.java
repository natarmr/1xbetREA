package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class mep implements pep {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f21658a;
    public final boolean b;

    public mep(List list, boolean z) {
        list.getClass();
        this.f21658a = list;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mep)) {
            return false;
        }
        mep mepVar = (mep) obj;
        return Intrinsics.d(this.f21658a, mepVar.f21658a) && this.b == mepVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.f21658a.hashCode() * 31);
    }

    public final String toString() {
        return "ShowContent(games=" + this.f21658a + ", visibleSearch=" + this.b + Separators.RPAREN;
    }
}
