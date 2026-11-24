package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class d9e implements f9e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f5696a;

    public d9e(List list) {
        list.getClass();
        this.f5696a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d9e) && Intrinsics.d(this.f5696a, ((d9e) obj).f5696a);
    }

    public final int hashCode() {
        return this.f5696a.hashCode();
    }

    public final String toString() {
        return twn.r(this.f5696a, "Images(files=", Separators.RPAREN);
    }
}
