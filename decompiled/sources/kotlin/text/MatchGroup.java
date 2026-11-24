package kotlin.text;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lkotlin/text/MatchGroup;", "", "kotlin-stdlib"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class MatchGroup {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f46071a;
    public final IntRange b;

    public MatchGroup(String str, IntRange intRange) {
        str.getClass();
        this.f46071a = str;
        this.b = intRange;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MatchGroup)) {
            return false;
        }
        MatchGroup matchGroup = (MatchGroup) obj;
        return Intrinsics.d(this.f46071a, matchGroup.f46071a) && this.b.equals(matchGroup.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f46071a.hashCode() * 31);
    }

    public final String toString() {
        return "MatchGroup(value=" + this.f46071a + ", range=" + this.b + ')';
    }
}
