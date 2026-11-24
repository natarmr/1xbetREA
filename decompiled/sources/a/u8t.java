package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class u8t implements v8t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k7t f35248a;
    public final List b;
    public final boolean c;

    public u8t(k7t k7tVar, List list, boolean z) {
        k7tVar.getClass();
        list.getClass();
        this.f35248a = k7tVar;
        this.b = list;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u8t)) {
            return false;
        }
        u8t u8tVar = (u8t) obj;
        return Intrinsics.d(this.f35248a, u8tVar.f35248a) && Intrinsics.d(this.b, u8tVar.b) && this.c == u8tVar.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + dw9.a(this.f35248a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Field(fieldModel=");
        sb.append(this.f35248a);
        sb.append(", previousSelectedCellsList=");
        sb.append(this.b);
        sb.append(", showBonus=");
        return rw2.p(sb, this.c, Separators.RPAREN);
    }
}
