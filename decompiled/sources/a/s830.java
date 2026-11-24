package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@ahi0
public final class s830 implements z830 {
    public static final r830 Companion = new r830();
    public static final a8z[] b = {maz.a(wez.f39042a, new n230(2))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f31784a;

    public /* synthetic */ s830(int i, List list) {
        if ((i & 1) == 0) {
            this.f31784a = null;
        } else {
            this.f31784a = list;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof s830) && Intrinsics.d(this.f31784a, ((s830) obj).f31784a);
    }

    public final int hashCode() {
        List list = this.f31784a;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    public final String toString() {
        return twn.r(this.f31784a, "BulletListContent(content=", Separators.RPAREN);
    }
}
