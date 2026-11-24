package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class bb50 extends cb50 {
    public final boolean b;

    public bb50(boolean z) {
        super("POPULAR");
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bb50) && this.b == ((bb50) obj).b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b);
    }

    public final String toString() {
        return defpackage.c.d("Popular(fromLiveTab=", Separators.RPAREN, this.b);
    }
}
