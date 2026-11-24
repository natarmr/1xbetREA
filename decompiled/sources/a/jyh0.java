package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class jyh0 implements cqg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f17360a;

    public jyh0(List list) {
        list.getClass();
        this.f17360a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jyh0) && Intrinsics.d(this.f17360a, ((jyh0) obj).f17360a);
    }

    public final int hashCode() {
        return this.f17360a.hashCode();
    }

    public final String toString() {
        return twn.r(this.f17360a, "SekiroModel(rounds=", Separators.RPAREN);
    }
}
