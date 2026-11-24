package okhttp3;

import a.ua80;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lokhttp3/Challenge;", "", "okhttp"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class Challenge {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f46081a;
    public final Map b;

    public Challenge(String str, Map map) {
        String lowerCase;
        map.getClass();
        this.f46081a = str;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : map.entrySet()) {
            String str2 = (String) entry.getKey();
            String str3 = (String) entry.getValue();
            if (str2 != null) {
                Locale locale = Locale.US;
                locale.getClass();
                lowerCase = str2.toLowerCase(locale);
                lowerCase.getClass();
            } else {
                lowerCase = null;
            }
            linkedHashMap.put(lowerCase, str3);
        }
        Map mapUnmodifiableMap = Collections.unmodifiableMap(linkedHashMap);
        mapUnmodifiableMap.getClass();
        this.b = mapUnmodifiableMap;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Challenge)) {
            return false;
        }
        Challenge challenge = (Challenge) obj;
        return challenge.f46081a.equals(this.f46081a) && Intrinsics.d(challenge.b, this.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + ua80.b(899, 31, this.f46081a);
    }

    public final String toString() {
        return this.f46081a + " authParams=" + this.b;
    }
}
