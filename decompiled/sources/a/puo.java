package a;

import android.gov.nist.core.Separators;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@ahi0
public final class puo implements Serializable {
    public static final ouo Companion = new ouo();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f27626a;
    public final String b;

    public /* synthetic */ puo(int i, Integer num, String str) {
        if ((i & 1) == 0) {
            this.f27626a = null;
        } else {
            this.f27626a = num;
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
        if (!(obj instanceof puo)) {
            return false;
        }
        puo puoVar = (puo) obj;
        return Intrinsics.d(this.f27626a, puoVar.f27626a) && Intrinsics.d(this.b, puoVar.b);
    }

    public final int hashCode() {
        Integer num = this.f27626a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.b;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        return ua80.f(this.f27626a, "FGAction(id=", ", name=", this.b, Separators.RPAREN);
    }

    public puo(Integer num, String str) {
        this.f27626a = num;
        this.b = str;
    }
}
