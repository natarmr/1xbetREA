package a;

import android.gov.nist.core.Separators;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class al50 {
    public static final al50 b = new al50(xp20.n(new LinkedHashMap()));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map f1052a;

    public al50(Map map) {
        this.f1052a = map;
    }

    public final String a() {
        String lowerCase = "Content-Type".toLowerCase(Locale.ROOT);
        lowerCase.getClass();
        List list = (List) this.f1052a.get(lowerCase);
        if (list != null) {
            return (String) CollectionsKt.f0(list);
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof al50) && Intrinsics.d(this.f1052a, ((al50) obj).f1052a);
    }

    public final int hashCode() {
        return this.f1052a.hashCode();
    }

    public final String toString() {
        return "NetworkHeaders(data=" + this.f1052a + Separators.RPAREN;
    }
}
