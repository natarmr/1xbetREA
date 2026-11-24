package a;

import android.gov.nist.core.Separators;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class zz8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f45239a;
    public final Set b;

    public zz8(List list, Set set) {
        list.getClass();
        set.getClass();
        this.f45239a = list;
        this.b = set;
    }

    public static zz8 a(zz8 zz8Var, List list, Set set, int i) {
        if ((i & 1) != 0) {
            list = zz8Var.f45239a;
        }
        if ((i & 2) != 0) {
            set = zz8Var.b;
        }
        zz8Var.getClass();
        list.getClass();
        set.getClass();
        return new zz8(list, set);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zz8)) {
            return false;
        }
        zz8 zz8Var = (zz8) obj;
        return Intrinsics.d(this.f45239a, zz8Var.f45239a) && Intrinsics.d(this.b, zz8Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f45239a.hashCode() * 31);
    }

    public final String toString() {
        return "BrandsLanguageSelectionState(languages=" + this.f45239a + ", selectedLanguageIds=" + this.b + Separators.RPAREN;
    }
}
