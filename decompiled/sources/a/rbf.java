package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@ahi0
public final class rbf {
    public static final qbf Companion = new qbf();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f30182a;
    public final String b;

    public /* synthetic */ rbf(int i, Integer num, String str) {
        if ((i & 1) == 0) {
            this.f30182a = null;
        } else {
            this.f30182a = num;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rbf)) {
            return false;
        }
        rbf rbfVar = (rbf) obj;
        return Intrinsics.d(this.f30182a, rbfVar.f30182a) && Intrinsics.d(this.b, rbfVar.b);
    }

    public final int hashCode() {
        Integer num = this.f30182a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.b;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        return ua80.f(this.f30182a, "CreateNickResponse(errorId=", ", errorMessage=", this.b, Separators.RPAREN);
    }
}
