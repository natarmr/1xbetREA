package a;

import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public final class g1a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map f10502a;

    public g1a() {
        lun lunVar = lun.f20680a;
        lunVar.getClass();
        this.f10502a = lunVar;
    }

    public float a(float f, String str) {
        Object obj = this.f10502a.get(str);
        Float f2 = obj instanceof Float ? (Float) obj : null;
        return f2 != null ? f2.floatValue() : f;
    }

    public long b(long j, String str) {
        Object obj = this.f10502a.get(str);
        Long l = obj instanceof Long ? (Long) obj : null;
        return l != null ? l.longValue() : j;
    }

    public String c(String str, String str2) {
        Object obj = this.f10502a.get(str);
        String str3 = obj instanceof String ? (String) obj : null;
        return str3 == null ? str2 : str3;
    }

    public g1a(Map map) {
        this.f10502a = map;
    }
}
