package a;

import androidx.recyclerview.widget.RecyclerView;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.util.Comparator;
import org.xplatform.cyber.statistics_blocks.api.StatisticBlockModel;
import org.xplatform.feed.notifictation.presentation.models.PeriodSubscriptionSettingsScreenUiModel;

/* JADX INFO: loaded from: classes4.dex */
public final class e3l implements Comparator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f7142a;

    public /* synthetic */ e3l(byte b) {
        this.f7142a = b;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f7142a) {
            case 0:
                return Integer.valueOf(((l0h) obj).i).compareTo(Integer.valueOf(((l0h) obj2).i));
            case 1:
                return Integer.valueOf(((ual) obj2).b.j.f).compareTo(Integer.valueOf(((ual) obj).b.j.f));
            case 2:
                return Integer.valueOf(((ual) obj2).b.j.d).compareTo(Integer.valueOf(((ual) obj).b.j.d));
            case 3:
                return Integer.valueOf(((ual) obj2).b.j.f).compareTo(Integer.valueOf(((ual) obj).b.j.f));
            case 4:
                return Integer.valueOf(((ual) obj2).b.j.g).compareTo(Integer.valueOf(((ual) obj).b.j.g));
            case 5:
                return Integer.valueOf(((ual) obj2).b.j.h).compareTo(Integer.valueOf(((ual) obj).b.j.h));
            case 6:
                return Integer.valueOf(((ual) obj2).b.j.f).compareTo(Integer.valueOf(((ual) obj).b.j.f));
            case 7:
                return Boolean.valueOf(((Number) obj).intValue() < 0).compareTo(Boolean.valueOf(((Number) obj2).intValue() < 0));
            case 8:
                return Integer.valueOf(((a6l) obj2).c).compareTo(Integer.valueOf(((a6l) obj).c));
            case 9:
                return Integer.valueOf(((StatisticBlockModel) obj).b).compareTo(Integer.valueOf(((StatisticBlockModel) obj2).b));
            case 10:
                return Integer.valueOf(((StatisticBlockModel) obj).b).compareTo(Integer.valueOf(((StatisticBlockModel) obj2).b));
            case 11:
                return Integer.valueOf(((btp) obj).f3192a).compareTo(Integer.valueOf(((btp) obj2).f3192a));
            case 12:
                return Double.valueOf(((sbq) obj2).c).compareTo(Double.valueOf(((sbq) obj).c));
            case 13:
                return Double.valueOf(((sbq) obj2).c).compareTo(Double.valueOf(((sbq) obj).c));
            case 14:
                return Double.valueOf(((sbq) obj2).c).compareTo(Double.valueOf(((sbq) obj).c));
            case 15:
                return Double.valueOf(((sbq) obj2).c).compareTo(Double.valueOf(((sbq) obj).c));
            case 16:
                return Boolean.valueOf(((PeriodSubscriptionSettingsScreenUiModel) obj2).f46679a.f46682a == 3).compareTo(Boolean.valueOf(((PeriodSubscriptionSettingsScreenUiModel) obj).f46679a.f46682a == 3));
            case 17:
                return Boolean.valueOf(((PeriodSubscriptionSettingsScreenUiModel) obj2).f46679a.f46682a == 3).compareTo(Boolean.valueOf(((PeriodSubscriptionSettingsScreenUiModel) obj).f46679a.f46682a == 3));
            case 18:
                return Integer.valueOf(((StatisticBlockModel) obj).b).compareTo(Integer.valueOf(((StatisticBlockModel) obj2).b));
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                ket ketVar = (ket) obj;
                ket ketVar2 = (ket) obj2;
                RecyclerView recyclerView = ketVar.d;
                if ((recyclerView == null) == (ketVar2.d == null)) {
                    boolean z = ketVar.f18168a;
                    if (z == ketVar2.f18168a) {
                        int i = ketVar2.b - ketVar.b;
                        if (i != 0) {
                            return i;
                        }
                        int i2 = ketVar.c - ketVar2.c;
                        if (i2 != 0) {
                            return i2;
                        }
                        return 0;
                    }
                    if (!z) {
                        return 1;
                    }
                } else if (recyclerView == null) {
                    return 1;
                }
                return -1;
            case 20:
                return Long.valueOf(((kxy) obj2).f19082a).compareTo(Long.valueOf(((kxy) obj).f19082a));
            case 21:
                return Long.valueOf(((oxy) obj2).getDate()).compareTo(Long.valueOf(((oxy) obj).getDate()));
            case 22:
                return Long.valueOf(((lxy) obj2).f20838a).compareTo(Long.valueOf(((lxy) obj).f20838a));
            case 23:
                return Long.valueOf(((oxy) obj2).getDate()).compareTo(Long.valueOf(((oxy) obj).getDate()));
            case 24:
                return hdd.b(((qkt) obj).b, ((qkt) obj2).b);
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                return Integer.valueOf(((rkv) obj).f30668a).compareTo(Integer.valueOf(((rkv) obj2).f30668a));
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                return Integer.valueOf(((kr5) obj).c).compareTo(Integer.valueOf(((kr5) obj2).c));
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                return Integer.valueOf(((kr5) obj).c).compareTo(Integer.valueOf(((kr5) obj2).c));
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                return Double.valueOf(((g0f) obj).e).compareTo(Double.valueOf(((g0f) obj2).e));
            default:
                return Integer.valueOf(((en7) obj).c).compareTo(Integer.valueOf(((en7) obj2).c));
        }
    }
}
