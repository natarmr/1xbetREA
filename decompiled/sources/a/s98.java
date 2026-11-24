package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class s98 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f31841a;
    public final String b;

    public s98(List list, String str) {
        list.getClass();
        this.f31841a = list;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s98)) {
            return false;
        }
        s98 s98Var = (s98) obj;
        return Intrinsics.d(this.f31841a, s98Var.f31841a) && this.b.equals(s98Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f31841a.hashCode() * 31);
    }

    public final String toString() {
        return "BlockRulesModel(items=" + this.f31841a + ", title=" + this.b + Separators.RPAREN;
    }
}
