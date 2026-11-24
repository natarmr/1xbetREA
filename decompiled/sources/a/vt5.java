package a;

import android.view.View;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.util.Calendar;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import org.xplatform.betting.core.zip.model.zip.BetZip;
import org.xplatform.cyber.calendar.impl.presentation.common.model.CyberCalendarPeriodUiModel;
import org.xplatform.cyber.statistics_blocks.api.StatisticBlockModel;

/* JADX INFO: loaded from: classes4.dex */
public final class vt5 implements Comparator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f37986a;

    public /* synthetic */ vt5(byte b) {
        this.f37986a = b;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f37986a) {
            case 0:
                return Integer.valueOf(((kr5) obj).c).compareTo(Integer.valueOf(((kr5) obj2).c));
            case 1:
                return Integer.valueOf(((kr5) obj).c).compareTo(Integer.valueOf(((kr5) obj2).c));
            case 2:
                return Integer.valueOf(((kr5) obj).c).compareTo(Integer.valueOf(((kr5) obj2).c));
            case 3:
                return Integer.valueOf(((kr5) obj).c).compareTo(Integer.valueOf(((kr5) obj2).c));
            case 4:
                return Integer.valueOf(((lk50) obj2).n).compareTo(Integer.valueOf(((lk50) obj).n));
            case 5:
                return Boolean.valueOf(((BetZip) obj2).g1).compareTo(Boolean.valueOf(((BetZip) obj).g1));
            case 6:
                return hdd.b((Integer) ((Map.Entry) obj).getKey(), (Integer) ((Map.Entry) obj2).getKey());
            case 7:
                return Integer.valueOf(((Number) obj2).intValue()).compareTo(Integer.valueOf(((Number) obj).intValue()));
            case 8:
                return Integer.valueOf(((lu90) obj).e).compareTo(Integer.valueOf(((lu90) obj2).e));
            case 9:
                return Boolean.valueOf(((or70) obj2).c).compareTo(Boolean.valueOf(((or70) obj).c));
            case 10:
                return hdd.b(rek.g((wm40) obj).f32934a.f34663a, rek.g((wm40) obj2).f32934a.f34663a);
            case 11:
                WeakHashMap weakHashMap = rgu0.f30456a;
                float z = ((View) obj).getZ();
                float z2 = ((View) obj2).getZ();
                if (z > z2) {
                    return -1;
                }
                return z < z2 ? 1 : 0;
            case 12:
                return Integer.valueOf(((cgf) obj).b).compareTo(Integer.valueOf(((cgf) obj2).b));
            case 13:
                return Integer.valueOf(((cgf) obj).b).compareTo(Integer.valueOf(((cgf) obj2).b));
            case 14:
                return Integer.valueOf(((StatisticBlockModel) obj).b).compareTo(Integer.valueOf(((StatisticBlockModel) obj2).b));
            case 15:
                return Integer.valueOf(((List) ((Map.Entry) obj2).getValue()).size()).compareTo(Integer.valueOf(((List) ((Map.Entry) obj).getValue()).size()));
            case 16:
                return Long.valueOf(((uag) obj).k - Calendar.getInstance().getTimeInMillis()).compareTo(Long.valueOf(((uag) obj2).k - Calendar.getInstance().getTimeInMillis()));
            case 17:
                CyberCalendarPeriodUiModel cyberCalendarPeriodUiModel = ((i9g) obj2).e;
                Long lValueOf = Long.valueOf(cyberCalendarPeriodUiModel.b - cyberCalendarPeriodUiModel.f46479a);
                CyberCalendarPeriodUiModel cyberCalendarPeriodUiModel2 = ((i9g) obj).e;
                return lValueOf.compareTo(Long.valueOf(cyberCalendarPeriodUiModel2.b - cyberCalendarPeriodUiModel2.f46479a));
            case 18:
                return Integer.valueOf(((d5g) obj).f5503a).compareTo(Integer.valueOf(((d5g) obj2).f5503a));
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                return Integer.valueOf(((tna0) obj).f34224a.ordinal()).compareTo(Integer.valueOf(((tna0) obj2).f34224a.ordinal()));
            case 20:
                return Integer.valueOf(((StatisticBlockModel) obj).b).compareTo(Integer.valueOf(((StatisticBlockModel) obj2).b));
            case 21:
                return Integer.valueOf(((vzg) obj).b).compareTo(Integer.valueOf(((vzg) obj2).b));
            case 22:
                return ((jng0) obj).d.compareTo(((jng0) obj2).d);
            case 23:
                return Long.valueOf(((qhj) obj).c == 707 ? Long.MAX_VALUE : 0L).compareTo(Long.valueOf(((qhj) obj2).c == 707 ? Long.MAX_VALUE : 0L));
            case 24:
                return hdd.b((String) ((Pair) obj).f46059a, (String) ((Pair) obj2).f46059a);
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                e7z e7zVar = (e7z) obj;
                e7z e7zVar2 = (e7z) obj2;
                int iE = Intrinsics.e(e7zVar.q, e7zVar2.q);
                return iE != 0 ? iE : Intrinsics.e(e7zVar.hashCode(), e7zVar2.hashCode());
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                return hdd.b(((hre0) obj).getName(), ((hre0) obj2).getName());
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                return hdd.b((zjk) ((Pair) obj).f46059a, (zjk) ((Pair) obj2).f46059a);
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                return ((zlk) obj).f44584a - ((zlk) obj2).f44584a;
            default:
                return ((ijs0) obj2).f14891a.compareTo(((ijs0) obj).f14891a);
        }
    }
}
