package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class uab {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mz60 f35321a;
    public final String b;
    public final String c;

    public uab(mz60 mz60Var, String str, String str2) {
        mz60Var.getClass();
        this.f35321a = mz60Var;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uab)) {
            return false;
        }
        uab uabVar = (uab) obj;
        return Intrinsics.d(this.f35321a, uabVar.f35321a) && this.b.equals(uabVar.b) && this.c.equals(uabVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ua80.b(this.f35321a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CenterOfAttentionGameItem(game=");
        sb.append(this.f35321a);
        sb.append(", categoryId=");
        sb.append(this.b);
        sb.append(", categoryName=");
        return axq.n(sb, this.c, Separators.RPAREN);
    }
}
