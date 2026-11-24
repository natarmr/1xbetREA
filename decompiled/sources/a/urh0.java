package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@ahi0
public final class urh0 {
    public static final trh0 Companion = new trh0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f36163a;
    public final Boolean b;

    public /* synthetic */ urh0(int i, Boolean bool, String str) {
        if ((i & 1) == 0) {
            this.f36163a = null;
        } else {
            this.f36163a = str;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = bool;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof urh0)) {
            return false;
        }
        urh0 urh0Var = (urh0) obj;
        return Intrinsics.d(this.f36163a, urh0Var.f36163a) && Intrinsics.d(this.b, urh0Var.b);
    }

    public final int hashCode() {
        String str = this.f36163a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Boolean bool = this.b;
        return iHashCode + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        return "TypeSecurityItemResponseValue(descriptions=" + this.f36163a + ", state=" + this.b + Separators.RPAREN;
    }
}
