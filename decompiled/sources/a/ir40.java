package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class ir40 implements cqg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f15239a;

    public ir40(List list) {
        list.getClass();
        this.f15239a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ir40) && Intrinsics.d(this.f15239a, ((ir40) obj).f15239a);
    }

    public final int hashCode() {
        return this.f15239a.hashCode();
    }

    public final String toString() {
        return twn.r(this.f15239a, "MortalKombatModel(rounds=", Separators.RPAREN);
    }
}
