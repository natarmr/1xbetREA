package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class kk extends nk {
    public final int b;
    public final String c;

    public kk(int i, String str) {
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
        if (!(obj instanceof kk)) {
            return false;
        }
        kk kkVar = (kk) obj;
        return this.b == kkVar.b && Intrinsics.d(this.c, kkVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + (Integer.hashCode(this.b) * 31);
    }

    public final String toString() {
        return defpackage.c.b(this.b, "PushUiModel(imageId=", ", actionName=", this.c, Separators.RPAREN);
    }
}
