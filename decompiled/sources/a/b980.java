package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class b980 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f2196a;
    public final bt9 b;

    public b980(List list, bt9 bt9Var) {
        list.getClass();
        this.f2196a = list;
        this.b = bt9Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b980)) {
            return false;
        }
        b980 b980Var = (b980) obj;
        return Intrinsics.d(this.f2196a, b980Var.f2196a) && Intrinsics.d(this.b, b980Var.b);
    }

    public final int hashCode() {
        int iHashCode = this.f2196a.hashCode() * 31;
        bt9 bt9Var = this.b;
        return iHashCode + (bt9Var == null ? 0 : bt9Var.hashCode());
    }

    public final String toString() {
        return "LanguageFieldStateModel(languages=" + this.f2196a + ", selectedLanguage=" + this.b + Separators.RPAREN;
    }
}
