package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@ahi0
public final class wlk0 implements iqg {
    public static final vlk0 Companion = new vlk0();
    public static final a8z[] b = {maz.a(wez.f39042a, new pdk0(8))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f39358a;

    public /* synthetic */ wlk0(int i, List list) {
        if ((i & 1) == 0) {
            this.f39358a = null;
        } else {
            this.f39358a = list;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wlk0) && Intrinsics.d(this.f39358a, ((wlk0) obj).f39358a);
    }

    public final int hashCode() {
        List list = this.f39358a;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    public final String toString() {
        return twn.r(this.f39358a, "SoulcaliburResponse(roundList=", Separators.RPAREN);
    }

    public wlk0() {
        this.f39358a = null;
    }
}
