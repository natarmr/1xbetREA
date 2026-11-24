package a;

import com.huawei.hms.framework.common.BundleUtil;
import java.util.HashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class nbw0 {
    public static final f4x d = f4x.l(3, "_syn", "_err", "_el");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f23263a;
    public final long b;
    public final HashMap c;

    public nbw0(String str, long j, HashMap map) {
        this.f23263a = str;
        this.b = j;
        HashMap map2 = new HashMap();
        this.c = map2;
        if (map != null) {
            map2.putAll(map);
        }
    }

    public static Object b(Object obj, Object obj2, String str) {
        if (d.contains(str) && (obj2 instanceof Double)) {
            return Long.valueOf(Math.round(((Double) obj2).doubleValue()));
        }
        if (str.startsWith(BundleUtil.UNDERLINE_TAG)) {
            if (!(obj instanceof String) && obj != null) {
                return obj;
            }
        } else if (!(obj instanceof Double)) {
            if (obj instanceof Long) {
                return Long.valueOf(Math.round(((Double) obj2).doubleValue()));
            }
            if (obj instanceof String) {
                return obj2.toString();
            }
        }
        return obj2;
    }

    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final nbw0 clone() {
        return new nbw0(this.f23263a, this.b, new HashMap(this.c));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nbw0)) {
            return false;
        }
        nbw0 nbw0Var = (nbw0) obj;
        if (this.b == nbw0Var.b && this.f23263a.equals(nbw0Var.f23263a)) {
            return this.c.equals(nbw0Var.c);
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.f23263a.hashCode() * 31;
        long j = this.b;
        return this.c.hashCode() + ((iHashCode + ((int) (j ^ (j >>> 32)))) * 31);
    }

    public final String toString() {
        String str = this.f23263a;
        String string = this.c.toString();
        int length = String.valueOf(str).length();
        long j = this.b;
        StringBuilder sb = new StringBuilder(length + 25 + String.valueOf(j).length() + 9 + string.length() + 1);
        hne.B(sb, "Event{name='", str, "', timestamp=");
        kng0.z(sb, j, ", params=", string);
        sb.append("}");
        return sb.toString();
    }
}
