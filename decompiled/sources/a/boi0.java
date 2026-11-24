package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@ahi0
public final class boi0 {
    public static final aoi0 Companion = new aoi0();
    public static final a8z[] b = {maz.a(wez.f39042a, new gei0((byte) 15))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f2935a;

    public /* synthetic */ boi0(int i, List list) {
        if (1 == (i & 1)) {
            this.f2935a = list;
        } else {
            m2x.I(i, 1, zni0.f44676a.getDescriptor());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof boi0) && Intrinsics.d(this.f2935a, ((boi0) obj).f2935a);
    }

    public final int hashCode() {
        return this.f2935a.hashCode();
    }

    public final String toString() {
        return twn.r(this.f2935a, "SetCategoryRequest(gameIds=", Separators.RPAREN);
    }

    public boi0(List list) {
        list.getClass();
        this.f2935a = list;
    }
}
