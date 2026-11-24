package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class fan {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f9217a;
    public final sso0 b;

    public fan(String str, sso0 sso0Var) {
        str.getClass();
        this.f9217a = str;
        this.b = sso0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fan)) {
            return false;
        }
        fan fanVar = (fan) obj;
        return Intrinsics.d(this.f9217a, fanVar.f9217a) && this.b.equals(fanVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f9217a.hashCode() * 31);
    }

    public final String toString() {
        return "CellTagUiModel(tagText=" + this.f9217a + ", tagStyle=" + this.b + Separators.RPAREN;
    }
}
