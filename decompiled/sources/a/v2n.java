package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class v2n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f36693a;
    public final o0x b;
    public final String c;
    public final Integer d;

    public v2n(String str, o0x o0xVar, String str2, Integer num, int i) {
        num = (i & 16) != 0 ? null : num;
        str.getClass();
        str2.getClass();
        this.f36693a = str;
        this.b = o0xVar;
        this.c = str2;
        this.d = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v2n)) {
            return false;
        }
        v2n v2nVar = (v2n) obj;
        return Intrinsics.d(this.f36693a, v2nVar.f36693a) && this.b.equals(v2nVar.b) && Intrinsics.d(this.c, v2nVar.c) && Intrinsics.d(this.d, v2nVar.d);
    }

    public final int hashCode() {
        int iB = ua80.b(w6x.d(this.b, this.f36693a.hashCode() * 31, 31), 961, this.c);
        Integer num = this.d;
        return iB + (num == null ? 0 : num.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DsSportFeedCollectionItem(id=");
        sb.append(this.f36693a);
        sb.append(", image=");
        sb.append(this.b);
        sb.append(", label=");
        return vqd.l(this.d, this.c, ", imageTint=null, placeholderRes=", Separators.RPAREN, sb);
    }
}
