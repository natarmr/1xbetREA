package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class guv0 implements y1h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f11950a;
    public final iun b;
    public final iun c;

    public guv0(Object obj) {
        obj.getClass();
        this.f11950a = obj;
        iun iunVar = iun.f15405a;
        this.b = iunVar;
        this.c = iunVar;
    }

    @Override // a.y1h0
    public final List a() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof guv0) && Intrinsics.d(this.f11950a, ((guv0) obj).f11950a);
    }

    @Override // a.y1h0
    public final ugd getContent() {
        return aad.j;
    }

    @Override // a.y1h0
    public final List getEntries() {
        return this.b;
    }

    @Override // a.y1h0
    public final Object getKey() {
        return this.f11950a;
    }

    public final int hashCode() {
        return this.f11950a.hashCode();
    }

    public final String toString() {
        return f140.k(this.f11950a, "XBottomSheetHiddenScene(key=", Separators.RPAREN);
    }
}
