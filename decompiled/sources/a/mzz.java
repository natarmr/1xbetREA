package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;
import org.xplatform.limits_ne.api.domain.LimitNeGroupEnum;

/* JADX INFO: loaded from: classes5.dex */
public final class mzz implements g100 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LimitNeGroupEnum f22674a;
    public final boolean b;
    public final String c;

    public mzz(LimitNeGroupEnum limitNeGroupEnum, boolean z, String str) {
        str.getClass();
        this.f22674a = limitNeGroupEnum;
        this.b = z;
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mzz)) {
            return false;
        }
        mzz mzzVar = (mzz) obj;
        return this.f22674a == mzzVar.f22674a && this.b == mzzVar.b && Intrinsics.d(this.c, mzzVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + brm0.e(this.f22674a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LimitsNeAcceptButtonUiModel(limitsGroup=");
        sb.append(this.f22674a);
        sb.append(", enabled=");
        sb.append(this.b);
        sb.append(", buttonText=");
        return axq.n(sb, this.c, Separators.RPAREN);
    }
}
