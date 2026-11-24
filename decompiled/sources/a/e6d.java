package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@ahi0
public final class e6d {
    public static final c6d Companion = new c6d();
    public static final a8z[] b = {maz.a(wez.f39042a, new zxb(29))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f7277a;

    public /* synthetic */ e6d(int i, List list) {
        if ((i & 1) == 0) {
            this.f7277a = null;
        } else {
            this.f7277a = list;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e6d) && Intrinsics.d(this.f7277a, ((e6d) obj).f7277a);
    }

    public final int hashCode() {
        List list = this.f7277a;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    public final String toString() {
        return twn.r(this.f7277a, "ColumnTitleResponse(value=", Separators.RPAREN);
    }
}
