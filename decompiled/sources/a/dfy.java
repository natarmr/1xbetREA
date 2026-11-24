package a;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class dfy extends s0x {
    public final String b;
    public final String c;

    public dfy(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dfy)) {
            return false;
        }
        dfy dfyVar = (dfy) obj;
        return Intrinsics.d(this.b, dfyVar.b) && Intrinsics.d(this.c, dfyVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + (this.b.hashCode() * 31);
    }

    @Override // a.s0x
    public final String y() {
        return this.b + this.c;
    }
}
