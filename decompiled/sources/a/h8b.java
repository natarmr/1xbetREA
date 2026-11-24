package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class h8b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f12618a;
    public final i8b b;
    public final ArrayList c;
    public final d4b d;

    public h8b(String str, i8b i8bVar, ArrayList arrayList, d4b d4bVar) {
        str.getClass();
        this.f12618a = str;
        this.b = i8bVar;
        this.c = arrayList;
        this.d = d4bVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h8b)) {
            return false;
        }
        h8b h8bVar = (h8b) obj;
        return Intrinsics.d(this.f12618a, h8bVar.f12618a) && this.b.equals(h8bVar.b) && this.c.equals(h8bVar.c) && this.d.equals(h8bVar.d);
    }

    public final int hashCode() {
        return Long.hashCode(this.d.f5446a) + twn.g(this.c, (this.b.hashCode() + (this.f12618a.hashCode() * 31)) * 31, 31);
    }

    public final String toString() {
        return "CategorySectionUiModel(subGameName=" + this.f12618a + ", header=" + this.b + ", groups=" + this.c + ", divider=" + this.d + Separators.RPAREN;
    }
}
