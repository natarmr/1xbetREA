package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@ahi0
public final class l7a {
    public static final k7a Companion = new k7a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f19549a;
    public final String b;
    public final Integer c;
    public final Integer d;

    public l7a(int i, Integer num, Integer num2, Integer num3, String str) {
        if ((i & 1) == 0) {
            this.f19549a = null;
        } else {
            this.f19549a = num;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = num2;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = num3;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l7a)) {
            return false;
        }
        l7a l7aVar = (l7a) obj;
        return Intrinsics.d(this.f19549a, l7aVar.f19549a) && Intrinsics.d(this.b, l7aVar.b) && Intrinsics.d(this.c, l7aVar.c) && Intrinsics.d(this.d, l7aVar.d);
    }

    public final int hashCode() {
        Integer num = this.f19549a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Integer num2 = this.c;
        int iHashCode3 = (iHashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.d;
        return iHashCode3 + (num3 != null ? num3.hashCode() : 0);
    }

    public final String toString() {
        return ua80.l(h97.n(this.f19549a, "CaptchaTaskResponse(count=", ", image=", this.b, ", letCount="), this.c, ", type=", this.d, Separators.RPAREN);
    }
}
