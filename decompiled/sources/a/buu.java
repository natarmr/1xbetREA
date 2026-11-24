package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@ahi0
public final class buu {
    public static final auu Companion = new auu();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f3252a;
    public final String b;

    public /* synthetic */ buu(int i, Integer num, String str) {
        if ((i & 1) == 0) {
            this.f3252a = null;
        } else {
            this.f3252a = num;
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
        if (!(obj instanceof buu)) {
            return false;
        }
        buu buuVar = (buu) obj;
        return Intrinsics.d(this.f3252a, buuVar.f3252a) && Intrinsics.d(this.b, buuVar.b);
    }

    public final int hashCode() {
        Integer num = this.f3252a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.b;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        return ua80.f(this.f3252a, "GetSocialsResponse(socialId=", ", login=", this.b, Separators.RPAREN);
    }
}
