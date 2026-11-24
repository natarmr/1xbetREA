package a;

import android.gov.nist.core.Separators;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class qyq0 implements uyq0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f29548a;

    public qyq0(List list) {
        y1p y1pVar = y1p.MAIN;
        this.f29548a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qyq0)) {
            return false;
        }
        y1p y1pVar = y1p.MAIN;
        return this.f29548a.equals(((qyq0) obj).f29548a);
    }

    public final int hashCode() {
        return this.f29548a.hashCode() + (((y1p.POPULAR_NEW_TOP.hashCode() * 31) + 2114288336) * 31);
    }

    public final String toString() {
        return "Initialize(fatmanScreenType=" + y1p.POPULAR_NEW_TOP + ", screenType=popular_new_top, topEventList=" + this.f29548a + Separators.RPAREN;
    }
}
