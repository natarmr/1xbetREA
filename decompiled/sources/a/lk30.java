package a;

import android.util.Size;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.util.Comparator;
import java.util.Locale;
import java.util.Map;
import kotlin.Pair;
import org.xplatform.cyber.statistics_blocks.api.StatisticBlockModel;

/* JADX INFO: loaded from: classes5.dex */
public final class lk30 implements Comparator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f20179a;

    public /* synthetic */ lk30(byte b) {
        this.f20179a = b;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f20179a) {
            case 0:
                return Integer.valueOf(((kk30) obj).f18418a).compareTo(Integer.valueOf(((kk30) obj2).f18418a));
            case 1:
                return Integer.valueOf(((z540) obj2).g).compareTo(Integer.valueOf(((z540) obj).g));
            case 2:
                return Integer.valueOf(((z540) obj2).g).compareTo(Integer.valueOf(((z540) obj).g));
            case 3:
                return Integer.valueOf(((xb40) obj).ordinal()).compareTo(Integer.valueOf(((xb40) obj2).ordinal()));
            case 4:
                qb40 qb40Var = (qb40) obj2;
                int i = qb40Var.e;
                Double dValueOf = Double.valueOf(i <= 0 ? 0.0d : ((double) qb40Var.f) / ((double) i));
                qb40 qb40Var2 = (qb40) obj;
                int i2 = qb40Var2.e;
                return dValueOf.compareTo(Double.valueOf(i2 > 0 ? ((double) qb40Var2.f) / ((double) i2) : 0.0d));
            case 5:
                Size size = (Size) obj;
                Size size2 = (Size) obj2;
                return Long.valueOf(((long) size.getWidth()) * ((long) size.getHeight())).compareTo(Long.valueOf(((long) size2.getWidth()) * ((long) size2.getHeight())));
            case 6:
                return Integer.valueOf(((StatisticBlockModel) obj).b).compareTo(Integer.valueOf(((StatisticBlockModel) obj2).b));
            case 7:
                return Boolean.valueOf(((gc50) obj2).e).compareTo(Boolean.valueOf(((gc50) obj).e));
            case 8:
                return Integer.valueOf(((kr5) obj).c).compareTo(Integer.valueOf(((kr5) obj2).c));
            case 9:
                return Integer.valueOf(((kr5) obj).c).compareTo(Integer.valueOf(((kr5) obj2).c));
            case 10:
                return Integer.valueOf(((kr5) obj).c).compareTo(Integer.valueOf(((kr5) obj2).c));
            case 11:
                return Integer.valueOf(((kr5) obj).c).compareTo(Integer.valueOf(((kr5) obj2).c));
            case 12:
                return Long.valueOf(((d0t) obj).s).compareTo(Long.valueOf(((d0t) obj2).s));
            case 13:
                return Long.valueOf(((mlr) obj).f22006a).compareTo(Long.valueOf(((mlr) obj2).f22006a));
            case 14:
                return hdd.b(((nas) obj).u, ((nas) obj2).u);
            case 15:
                return Boolean.valueOf(((wzf0) obj) instanceof uzf0).compareTo(Boolean.valueOf(((wzf0) obj2) instanceof uzf0));
            case 16:
                ((pi90) obj2).getClass();
                throw new ClassCastException();
            case 17:
                return Integer.valueOf(((Number) ((Pair) obj).f46059a).intValue()).compareTo(Integer.valueOf(((Number) ((Pair) obj2).f46059a).intValue()));
            case 18:
                return ((fea0) obj2).f9397a.compareTo(((fea0) obj).f9397a);
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                return ((ukk0) obj).b - ((ukk0) obj2).b;
            case 20:
                return Integer.valueOf(((StatisticBlockModel) obj).b).compareTo(Integer.valueOf(((StatisticBlockModel) obj2).b));
            case 21:
                return Integer.valueOf(((StatisticBlockModel) obj).b).compareTo(Integer.valueOf(((StatisticBlockModel) obj2).b));
            case 22:
                return hdd.b(((t6e0) obj).f33415a, ((t6e0) obj2).f33415a);
            case 23:
                return Integer.valueOf(((j8e0) obj).f16079a).compareTo(Integer.valueOf(((j8e0) obj2).f16079a));
            case 24:
                ((lf60) obj2).getClass();
                Integer num = 2;
                ((lf60) obj).getClass();
                return num.compareTo(num);
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                ((nnn0) obj2).getClass();
                Integer num2 = 0;
                ((nnn0) obj).getClass();
                return num2.compareTo(num2);
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                String str = (String) ((Map.Entry) obj).getKey();
                Locale locale = Locale.ROOT;
                String lowerCase = str.toLowerCase(locale);
                lowerCase.getClass();
                String lowerCase2 = ((String) ((Map.Entry) obj2).getKey()).toLowerCase(locale);
                lowerCase2.getClass();
                return hdd.b(lowerCase, lowerCase2);
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                String str2 = (String) ((Map.Entry) obj).getKey();
                Locale locale2 = Locale.ROOT;
                String lowerCase3 = str2.toLowerCase(locale2);
                lowerCase3.getClass();
                String lowerCase4 = ((String) ((Map.Entry) obj2).getKey()).toLowerCase(locale2);
                lowerCase4.getClass();
                return hdd.b(lowerCase3, lowerCase4);
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                String str3 = (String) ((Map.Entry) obj2).getKey();
                Locale locale3 = Locale.ROOT;
                String lowerCase5 = str3.toLowerCase(locale3);
                lowerCase5.getClass();
                String lowerCase6 = ((String) ((Map.Entry) obj).getKey()).toLowerCase(locale3);
                lowerCase6.getClass();
                return hdd.b(lowerCase5, lowerCase6);
            default:
                Map.Entry entry = (Map.Entry) obj2;
                Map.Entry entry2 = (Map.Entry) obj;
                return Boolean.valueOf(!String.valueOf(((ssd) entry.getValue()).f32720a).equals(String.valueOf(((ssd) entry.getValue()).b))).compareTo(Boolean.valueOf(!String.valueOf(((ssd) entry2.getValue()).f32720a).equals(String.valueOf(((ssd) entry2.getValue()).b))));
        }
    }
}
