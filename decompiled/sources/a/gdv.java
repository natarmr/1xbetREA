package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class gdv {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f11121a;
    public final ArrayList b;
    public final List c;
    public final w8b d;

    public gdv(List list, ArrayList arrayList, iun iunVar, w8b w8bVar) {
        list.getClass();
        iunVar.getClass();
        this.f11121a = list;
        this.b = arrayList;
        this.c = iunVar;
        this.d = w8bVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof gdv) {
            gdv gdvVar = (gdv) obj;
            return Intrinsics.d(this.f11121a, gdvVar.f11121a) && this.b.equals(gdvVar.b) && Intrinsics.d(this.c, gdvVar.c) && this.d == gdvVar.d;
        }
        return false;
    }

    public final int hashCode() {
        return this.d.hashCode() + dw9.a(twn.g(this.b, this.f11121a.hashCode() * 31, 31), 31, this.c);
    }

    public final String toString() {
        return "GrandPrixTableUiModel(columnHeaderUiModelList=" + this.f11121a + ", cellList=" + this.b + ", rowHeaderList=" + this.c + ", cornerCell=" + this.d + Separators.RPAREN;
    }
}
