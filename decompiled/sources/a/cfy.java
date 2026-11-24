package a;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class cfy extends s0x {
    public final String b;
    public final String c;

    public cfy(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cfy)) {
            return false;
        }
        cfy cfyVar = (cfy) obj;
        return Intrinsics.d(this.b, cfyVar.b) && Intrinsics.d(this.c, cfyVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + (this.b.hashCode() * 31);
    }

    @Override // a.s0x
    public final String y() {
        return this.b + ':' + this.c;
    }
}
