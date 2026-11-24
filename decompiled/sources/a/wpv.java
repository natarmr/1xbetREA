package a;

import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.lang.reflect.Method;
import java.util.Comparator;
import kotlin.text.Regex;
import org.xplatform.betting.core.zip.model.zip.BetZip;
import org.xplatform.cyber.statistics_blocks.api.StatisticBlockModel;
import org.xplatform.limits_africa.api.domain.LimitGroupEnum;
import org.xplatform.limits_kenya.api.domain.LimitKenyaGroupEnum;
import org.xplatform.limits_ne.api.domain.LimitNeGroupEnum;

/* JADX INFO: loaded from: classes2.dex */
public final class wpv implements Comparator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f39561a;

    public /* synthetic */ wpv(byte b) {
        this.f39561a = b;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f39561a) {
            case 0:
                return Long.valueOf(((n4t0) obj2).b).compareTo(Long.valueOf(((n4t0) obj).b));
            case 1:
                return Integer.valueOf(((hdw) obj).e).compareTo(Integer.valueOf(((hdw) obj2).e));
            case 2:
                return Long.valueOf(((d0t) obj).s).compareTo(Long.valueOf(((d0t) obj2).s));
            case 3:
                return hdd.b(((Method) obj).getName(), ((Method) obj2).getName());
            case 4:
                return hdd.b(((Method) obj).getName(), ((Method) obj2).getName());
            case 5:
                Regex regex = ihy.f14802a;
                Integer numB = uek.b((tek) obj, (tek) obj2);
                if (numB != null) {
                    return numB.intValue();
                }
                return 0;
            case 6:
                return Integer.compare(((bky) obj).f2770a, ((bky) obj2).f2770a);
            case 7:
                return Long.valueOf(znq0.f(((aq30) obj2).b)).compareTo(Long.valueOf(znq0.f(((aq30) obj).b)));
            case 8:
                return Long.valueOf(znq0.f(((aq30) obj2).b)).compareTo(Long.valueOf(znq0.f(((aq30) obj).b)));
            case 9:
                return Long.valueOf(znq0.f(((aq30) obj2).b)).compareTo(Long.valueOf(znq0.f(((aq30) obj).b)));
            case 10:
                return Long.valueOf(znq0.f(((aq30) obj2).b)).compareTo(Long.valueOf(znq0.f(((aq30) obj).b)));
            case 11:
                return Integer.valueOf(((d7i0) obj).f5595a).compareTo(Integer.valueOf(((d7i0) obj2).f5595a));
            case 12:
                return Integer.valueOf(((LimitGroupEnum) obj).ordinal()).compareTo(Integer.valueOf(((LimitGroupEnum) obj2).ordinal()));
            case 13:
                return Integer.valueOf(((org.xplatform.limits_ee.api.domain.LimitGroupEnum) obj).ordinal()).compareTo(Integer.valueOf(((org.xplatform.limits_ee.api.domain.LimitGroupEnum) obj2).ordinal()));
            case 14:
                return Integer.valueOf(((bnz) obj).ordinal()).compareTo(Integer.valueOf(((bnz) obj2).ordinal()));
            case 15:
                return Integer.valueOf(((bnz) obj).ordinal()).compareTo(Integer.valueOf(((bnz) obj2).ordinal()));
            case 16:
                return Integer.valueOf(((LimitKenyaGroupEnum) obj).ordinal()).compareTo(Integer.valueOf(((LimitKenyaGroupEnum) obj2).ordinal()));
            case 17:
                return Integer.valueOf(((LimitNeGroupEnum) obj).ordinal()).compareTo(Integer.valueOf(((LimitNeGroupEnum) obj2).ordinal()));
            case 18:
                return Long.valueOf(znq0.f(((aq30) obj2).b)).compareTo(Long.valueOf(znq0.f(((aq30) obj).b)));
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                return Long.valueOf(znq0.f(((aq30) obj2).b)).compareTo(Long.valueOf(znq0.f(((aq30) obj).b)));
            case 20:
                return Long.valueOf(znq0.f(((aq30) obj2).b)).compareTo(Long.valueOf(znq0.f(((aq30) obj).b)));
            case 21:
                return Boolean.valueOf(!(((f240) obj) instanceof i140)).compareTo(Boolean.valueOf(!(((f240) obj2) instanceof i140)));
            case 22:
                return Boolean.valueOf(!(((f240) obj) instanceof z140)).compareTo(Boolean.valueOf(!(((f240) obj2) instanceof z140)));
            case 23:
                return Boolean.valueOf(!(((f240) obj) instanceof z140)).compareTo(Boolean.valueOf(!(((f240) obj2) instanceof z140)));
            case 24:
                return Boolean.valueOf(((BetZip) obj2).g1).compareTo(Boolean.valueOf(((BetZip) obj).g1));
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                return Boolean.valueOf(((hpn0) obj).g).compareTo(Boolean.valueOf(((hpn0) obj2).g));
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                return Integer.valueOf(((h110) obj2).f).compareTo(Integer.valueOf(((h110) obj).f));
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                return Integer.valueOf(((StatisticBlockModel) obj).b).compareTo(Integer.valueOf(((StatisticBlockModel) obj2).b));
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                return hdd.b(((gls) obj).f11509a, ((gls) obj2).f11509a);
            default:
                return Integer.valueOf(((StatisticBlockModel) obj).b).compareTo(Integer.valueOf(((StatisticBlockModel) obj2).b));
        }
    }
}
