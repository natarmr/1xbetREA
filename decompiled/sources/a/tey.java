package a;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class tey extends x0x {
    public final String b;
    public final String c;

    public tey(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tey)) {
            return false;
        }
        tey teyVar = (tey) obj;
        return Intrinsics.d(this.b, teyVar.b) && Intrinsics.d(this.c, teyVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + (this.b.hashCode() * 31);
    }

    public final String toString() {
        return this.b + ':' + this.c;
    }
}
