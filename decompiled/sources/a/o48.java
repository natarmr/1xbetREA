package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class o48 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f24620a;
    public final List b;

    public o48(String str, List list) {
        list.getClass();
        this.f24620a = str;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o48)) {
            return false;
        }
        o48 o48Var = (o48) obj;
        return this.f24620a.equals(o48Var.f24620a) && Intrinsics.d(this.b, o48Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f24620a.hashCode() * 31);
    }

    public final String toString() {
        return ohs0.o("BiographyModel(title=", this.f24620a, ", paragraphs=", this.b, Separators.RPAREN);
    }
}
