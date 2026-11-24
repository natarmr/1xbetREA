package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class e8m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f7380a;
    public final o0x b;
    public final String c;

    public e8m(long j, o0x o0xVar, String str) {
        str.getClass();
        this.f7380a = j;
        this.b = o0xVar;
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e8m)) {
            return false;
        }
        e8m e8mVar = (e8m) obj;
        return this.f7380a == e8mVar.f7380a && this.b.equals(e8mVar.b) && Intrinsics.d(this.c, e8mVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + w6x.d(this.b, Long.hashCode(this.f7380a) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DsCyberIconCollectionItemUiModel(id=");
        sb.append(this.f7380a);
        sb.append(", imageLink=");
        sb.append(this.b);
        return rw2.o(sb, ", label=", this.c, Separators.RPAREN);
    }
}
