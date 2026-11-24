package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class bk extends nk {
    public final int b;
    public final String c;

    public bk(int i, String str) {
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
        if (!(obj instanceof bk)) {
            return false;
        }
        bk bkVar = (bk) obj;
        return this.b == bkVar.b && Intrinsics.d(this.c, bkVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + (Integer.hashCode(this.b) * 31);
    }

    public final String toString() {
        return defpackage.c.b(this.b, "CardsInfoSettingsUiModel(imageId=", ", actionName=", this.c, Separators.RPAREN);
    }
}
