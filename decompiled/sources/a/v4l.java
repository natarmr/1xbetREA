package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class v4l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f36786a;

    public v4l(List list) {
        list.getClass();
        this.f36786a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof v4l) && Intrinsics.d(this.f36786a, ((v4l) obj).f36786a);
    }

    public final int hashCode() {
        return this.f36786a.hashCode();
    }

    public final String toString() {
        return twn.r(this.f36786a, "DotaHeroUiModel(singleImageItem=", Separators.RPAREN);
    }
}
