package a;

import com.google.android.gms.common.api.Scope;
import java.util.Comparator;
import java.util.Map;
import java.util.Objects;
import org.xplatform.cyber.statistics_blocks.api.StatisticBlockModel;

/* JADX INFO: loaded from: classes2.dex */
public final class jzt0 implements Comparator {
    public static final /* synthetic */ jzt0 b = new jzt0(7);
    public static final /* synthetic */ jzt0 c = new jzt0(12);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f17431a;

    public /* synthetic */ jzt0(byte b2) {
        this.f17431a = b2;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f17431a) {
            case 0:
                return Integer.valueOf(((StatisticBlockModel) obj).b).compareTo(Integer.valueOf(((StatisticBlockModel) obj2).b));
            case 1:
                return Integer.valueOf(((StatisticBlockModel) obj).b).compareTo(Integer.valueOf(((StatisticBlockModel) obj2).b));
            case 2:
                return ((hju0) obj).b - ((hju0) obj2).b;
            case 3:
                return Integer.valueOf(((fsv0) obj).b).compareTo(Integer.valueOf(((fsv0) obj2).b));
            case 4:
                return Integer.valueOf(((fsv0) obj).b).compareTo(Integer.valueOf(((fsv0) obj2).b));
            case 5:
                return Float.valueOf(((dmy) obj).f6340a).compareTo(Float.valueOf(((dmy) obj2).f6340a));
            case 6:
                return hdd.b(((d3w0) obj).f5425a, ((d3w0) obj2).f5425a);
            case 7:
                return ((Scope) obj).b.compareTo(((Scope) obj2).b);
            case 8:
                return ((Scope) obj).b.compareTo(((Scope) obj2).b);
            case 9:
                int iA = ohs0.a(obj);
                int iA2 = ohs0.a(obj2);
                if (iA != iA2) {
                    return hne.a(iA, iA2);
                }
                int iE = hne.E(iA);
                if (iE == 0) {
                    return ((Boolean) obj).compareTo((Boolean) obj2);
                }
                if (iE == 1) {
                    return ((String) obj).compareTo((String) obj2);
                }
                if (iE == 2) {
                    return ((Long) obj).compareTo((Long) obj2);
                }
                if (iE == 3) {
                    return ((Double) obj).compareTo((Double) obj2);
                }
                throw null;
            case 10:
                return ((String) ((Map.Entry) obj).getKey()).compareTo((String) ((Map.Entry) obj2).getKey());
            case 11:
                Map.Entry entry = (Map.Entry) obj;
                Map.Entry entry2 = (Map.Entry) obj2;
                Objects.requireNonNull(entry);
                Objects.requireNonNull(entry2);
                Comparable comparable = (Comparable) entry.getKey();
                Comparable comparable2 = (Comparable) entry2.getKey();
                comparable.getClass();
                comparable2.getClass();
                return comparable.compareTo(comparable2);
            default:
                return Long.compare(((Long) obj).longValue(), ((Long) obj2).longValue());
        }
    }
}
