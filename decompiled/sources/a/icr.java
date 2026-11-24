package a;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public final class icr extends LinkedHashMap {
    public static final /* synthetic */ int b = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f14547a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ icr(int i, float f, boolean z, byte b2) {
        super(i, f, z);
        this.f14547a = b2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Matcher a(Pattern pattern, String str) {
        Matcher matcher = (Matcher) get(pattern);
        if (matcher != null) {
            matcher.reset(str);
            return matcher;
        }
        Matcher matcher2 = pattern.matcher(str);
        put(pattern, matcher2);
        return matcher2;
    }

    @Override // java.util.LinkedHashMap
    public final boolean removeEldestEntry(Map.Entry entry) {
        switch (this.f14547a) {
            case 0:
                return size() > 4;
            default:
                return size() > 32;
        }
    }
}
