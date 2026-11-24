package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class dk extends nk {
    public final int b;
    public final String c;

    public dk(int i, String str) {
        str.getClass();
        this.b = i;
        this.c = str;
    }

    @Override // a.nk
    public final String a() {
        return this.c;
    }

    @Override // a.nk
    public final int b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dk)) {
            return false;
        }
        dk dkVar = (dk) obj;
        return this.b == dkVar.b && Intrinsics.d(this.c, dkVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + (Integer.hashCode(this.b) * 31);
    }

    public final String toString() {
        return defpackage.c.b(this.b, "FavoriteUiModel(imageId=", ", actionName=", this.c, Separators.RPAREN);
    }
}
