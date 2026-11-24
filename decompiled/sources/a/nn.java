package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class nn {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final imm f23796a;
    public final vm b;
    public final a4x c;
    public final String d;
    public final boolean e;

    public nn(imm immVar, vm vmVar, a4x a4xVar, String str, boolean z) {
        immVar.getClass();
        a4xVar.getClass();
        this.f23796a = immVar;
        this.b = vmVar;
        this.c = a4xVar;
        this.d = str;
        this.e = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nn)) {
            return false;
        }
        nn nnVar = (nn) obj;
        return Intrinsics.d(this.f23796a, nnVar.f23796a) && this.b.equals(nnVar.b) && Intrinsics.d(this.c, nnVar.c) && this.d.equals(nnVar.d) && this.e == nnVar.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + ua80.b(cs0.b(this.c, (this.b.hashCode() + (this.f23796a.hashCode() * 31)) * 31, 31), 31, this.d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ActiveTeamsUiState(toolbarModel=");
        sb.append(this.f23796a);
        sb.append(", contentUiModel=");
        sb.append(this.b);
        sb.append(", uiItemList=");
        sb.append(this.c);
        sb.append(", searchText=");
        sb.append(this.d);
        sb.append(", loading=");
        return rw2.p(sb, this.e, Separators.RPAREN);
    }
}
