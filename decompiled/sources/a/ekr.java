package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class ekr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f7966a;
    public final boolean b;

    public ekr(List list, boolean z) {
        list.getClass();
        this.f7966a = list;
        this.b = z;
    }

    public static ekr a(ekr ekrVar, List list, boolean z, int i) {
        if ((i & 1) != 0) {
            list = ekrVar.f7966a;
        }
        if ((i & 2) != 0) {
            z = ekrVar.b;
        }
        ekrVar.getClass();
        list.getClass();
        return new ekr(list, z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ekr)) {
            return false;
        }
        ekr ekrVar = (ekr) obj;
        return Intrinsics.d(this.f7966a, ekrVar.f7966a) && this.b == ekrVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.f7966a.hashCode() * 31);
    }

    public final String toString() {
        return "GamblingExamIeState(questionsList=" + this.f7966a + ", isLoading=" + this.b + Separators.RPAREN;
    }
}
