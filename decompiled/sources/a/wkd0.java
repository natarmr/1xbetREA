package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@ahi0
public final class wkd0 {
    public static final ukd0 Companion = new ukd0();
    public static final a8z[] c = {null, maz.a(wez.f39042a, new cbc0(22))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f39303a;
    public final List b;

    public /* synthetic */ wkd0(String str, List list, int i) {
        if ((i & 1) == 0) {
            this.f39303a = null;
        } else {
            this.f39303a = str;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = list;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wkd0)) {
            return false;
        }
        wkd0 wkd0Var = (wkd0) obj;
        return Intrinsics.d(this.f39303a, wkd0Var.f39303a) && Intrinsics.d(this.b, wkd0Var.b);
    }

    public final int hashCode() {
        String str = this.f39303a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        List list = this.b;
        return iHashCode + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        return ohs0.o("QuestionDataResponse(tokenGuid=", this.f39303a, ", questions=", this.b, Separators.RPAREN);
    }
}
