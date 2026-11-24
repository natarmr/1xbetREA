package kotlin.collections;

import android.gov.nist.javax.sip.parser.TokenNames;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lkotlin/collections/IndexedValue;", TokenNames.T, "", "kotlin-stdlib"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class IndexedValue<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f46061a;
    public final Object b;

    public IndexedValue(int i, Object obj) {
        this.f46061a = i;
        this.b = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof IndexedValue)) {
            return false;
        }
        IndexedValue indexedValue = (IndexedValue) obj;
        return this.f46061a == indexedValue.f46061a && Intrinsics.d(this.b, indexedValue.b);
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.f46061a) * 31;
        Object obj = this.b;
        return iHashCode + (obj == null ? 0 : obj.hashCode());
    }

    public final String toString() {
        return "IndexedValue(index=" + this.f46061a + ", value=" + this.b + ')';
    }
}
