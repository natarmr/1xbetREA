package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class srk0 implements trk0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f32681a;

    public srk0(List list) {
        list.getClass();
        this.f32681a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof srk0) && Intrinsics.d(this.f32681a, ((srk0) obj).f32681a);
    }

    public final int hashCode() {
        return this.f32681a.hashCode();
    }

    public final String toString() {
        return twn.r(this.f32681a, "Live(timeStartList=", Separators.RPAREN);
    }
}
