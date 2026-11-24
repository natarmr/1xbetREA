package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes2.dex */
public final class mk extends nk {
    public final String b;

    public mk(String str) {
        str.getClass();
        this.b = str;
    }

    @Override // a.nk
    public final String a() {
        return this.b;
    }

    @Override // a.nk
    public final int b() {
        return R.drawable.ic_advanced_statistics;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof mk) && Intrinsics.d(this.b, ((mk) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(R.drawable.ic_advanced_statistics) * 31);
    }

    public final String toString() {
        return defpackage.c.b(R.drawable.ic_advanced_statistics, "StatisticUiModel(imageId=", ", actionName=", this.b, Separators.RPAREN);
    }
}
