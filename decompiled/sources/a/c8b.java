package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@ahi0
public final class c8b {
    public static final b8b Companion = new b8b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f3905a;
    public final String b;

    public /* synthetic */ c8b(int i, Integer num, String str) {
        if ((i & 1) == 0) {
            this.f3905a = null;
        } else {
            this.f3905a = num;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c8b)) {
            return false;
        }
        c8b c8bVar = (c8b) obj;
        return Intrinsics.d(this.f3905a, c8bVar.f3905a) && Intrinsics.d(this.b, c8bVar.b);
    }

    public final int hashCode() {
        Integer num = this.f3905a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.b;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        return ua80.f(this.f3905a, "CategoryResponse(categoryId=", ", name=", this.b, Separators.RPAREN);
    }
}
