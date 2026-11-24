package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@ahi0
public final class sqn {
    public static final rqn Companion = new rqn();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f32637a;
    public final Integer b;
    public final bqn c;

    static {
        aqn aqnVar = bqn.Companion;
    }

    public /* synthetic */ sqn(int i, String str, Integer num, bqn bqnVar) {
        if ((i & 1) == 0) {
            this.f32637a = null;
        } else {
            this.f32637a = str;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = num;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = bqnVar;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sqn)) {
            return false;
        }
        sqn sqnVar = (sqn) obj;
        return Intrinsics.d(this.f32637a, sqnVar.f32637a) && Intrinsics.d(this.b, sqnVar.b) && Intrinsics.d(this.c, sqnVar.c);
    }

    public final int hashCode() {
        String str = this.f32637a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.b;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        bqn bqnVar = this.c;
        return iHashCode2 + (bqnVar != null ? bqnVar.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbP = axq.p(this.b, "EditProfileResponse(message=", this.f32637a, ", messageId=", ", formResponse=");
        sbP.append(this.c);
        sbP.append(Separators.RPAREN);
        return sbP.toString();
    }
}
