package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class jq8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f16938a;
    public final List b;

    public jq8(String str, List list) {
        str.getClass();
        list.getClass();
        this.f16938a = str;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jq8)) {
            return false;
        }
        jq8 jq8Var = (jq8) obj;
        return Intrinsics.d(this.f16938a, jq8Var.f16938a) && Intrinsics.d(this.b, jq8Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f16938a.hashCode() * 31);
    }

    public final String toString() {
        return ohs0.o("BottomSheetUiModel(title=", this.f16938a, ", totoBetTypeUiModelList=", this.b, Separators.RPAREN);
    }
}
