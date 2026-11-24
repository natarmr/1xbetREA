package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class tyl0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f34761a;
    public final boolean b;

    public tyl0(String str, boolean z) {
        str.getClass();
        this.f34761a = str;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tyl0)) {
            return false;
        }
        tyl0 tyl0Var = (tyl0) obj;
        return Intrinsics.d(this.f34761a, tyl0Var.f34761a) && this.b == tyl0Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.f34761a.hashCode() * 31);
    }

    public final String toString() {
        return ua80.j("StageGroupModel(groupName=", this.f34761a, ", isSelected=", this.b, Separators.RPAREN);
    }
}
