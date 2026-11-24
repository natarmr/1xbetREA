package a;

import android.view.View;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.util.Comparator;
import kotlin.Pair;
import org.xbet.client1.R;
import org.xplatform.cyber.statistics_blocks.api.StatisticBlockModel;

/* JADX INFO: loaded from: classes4.dex */
public final class tgo0 implements Comparator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f33923a;

    public /* synthetic */ tgo0(byte b) {
        this.f33923a = b;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f33923a) {
            case 0:
                return Boolean.valueOf(!(((f240) obj) instanceof z140)).compareTo(Boolean.valueOf(!(((f240) obj2) instanceof z140)));
            case 1:
                return Boolean.valueOf(!(((f240) obj) instanceof z140)).compareTo(Boolean.valueOf(!(((f240) obj2) instanceof z140)));
            case 2:
                return hdd.b(((tjo0) obj).f34058a, ((tjo0) obj2).f34058a);
            case 3:
                return hdd.b(((ujo0) obj).f35794a, ((ujo0) obj2).f35794a);
            case 4:
                return hdd.b(((xjo0) obj).f40996a, ((xjo0) obj2).f40996a);
            case 5:
                return hdd.b(((yjo0) obj).f42751a, ((yjo0) obj2).f42751a);
            case 6:
                return Long.valueOf(((d0t) obj).s).compareTo(Long.valueOf(((d0t) obj2).s));
            case 7:
                return Long.valueOf(((d0t) obj).s).compareTo(Long.valueOf(((d0t) obj2).s));
            case 8:
                return Long.valueOf(((w0p0) obj2).f).compareTo(Long.valueOf(((w0p0) obj).f));
            case 9:
                return Long.valueOf(((xcp) obj).e).compareTo(Long.valueOf(((xcp) obj2).e));
            case 10:
                return ((xcp) obj).c.compareTo(((xcp) obj2).c);
            case 11:
                return Long.valueOf(((k9p0) obj).k).compareTo(Long.valueOf(((k9p0) obj2).k));
            case 12:
                return Long.valueOf(((nhs0) obj2).f23550a.getTime()).compareTo(Long.valueOf(((nhs0) obj).f23550a.getTime()));
            case 13:
                return Boolean.valueOf(((Number) obj).intValue() == R.drawable.ic_cyber_lol_dragon_placeholder).compareTo(Boolean.valueOf(((Number) obj2).intValue() == R.drawable.ic_cyber_lol_dragon_placeholder));
            case 14:
                return Boolean.valueOf(((Number) obj).intValue() == R.drawable.ic_cyber_lol_dragon_placeholder).compareTo(Boolean.valueOf(((Number) obj2).intValue() == R.drawable.ic_cyber_lol_dragon_placeholder));
            case 15:
                return Integer.valueOf(((zdq0) obj).getRow$tile_matching()).compareTo(Integer.valueOf(((zdq0) obj2).getRow$tile_matching()));
            case 16:
                return Boolean.valueOf(!(((p6t0) obj) instanceof i140)).compareTo(Boolean.valueOf(!(((p6t0) obj2) instanceof i140)));
            case 17:
                return Boolean.valueOf(!(((p6t0) obj) instanceof z140)).compareTo(Boolean.valueOf(!(((p6t0) obj2) instanceof z140)));
            case 18:
                return Boolean.valueOf(!(((p6t0) obj) instanceof z140)).compareTo(Boolean.valueOf(!(((p6t0) obj2) instanceof z140)));
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                return ((View) obj).getTop() - ((View) obj2).getTop();
            case 20:
                return Integer.valueOf(((twr0) obj).f34666a).compareTo(Integer.valueOf(((twr0) obj2).f34666a));
            case 21:
                ycl yclVar = (ycl) ((Pair) obj).b;
                float f = yclVar.f42389a;
                ycl yclVar2 = (ycl) ((Pair) obj2).b;
                float f2 = yclVar2.f42389a;
                if (yclVar == null) {
                    return yclVar2 == null ? 0 : -1;
                }
                if (yclVar2 == null) {
                    return 1;
                }
                return yclVar.compareTo(yclVar2);
            case 22:
                return ((jng0) obj).d.compareTo(((jng0) obj2).d);
            case 23:
                return ((ijs0) obj2).f14891a.compareTo(((ijs0) obj).f14891a);
            case 24:
                return Integer.valueOf(((d5g) obj).f5503a).compareTo(Integer.valueOf(((d5g) obj2).f5503a));
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                return Integer.valueOf(((StatisticBlockModel) obj).b).compareTo(Integer.valueOf(((StatisticBlockModel) obj2).b));
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                return Float.valueOf(((j0s0) obj2).d.f22716a).compareTo(Float.valueOf(((j0s0) obj).d.f22716a));
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                return Integer.valueOf(((k9t0) obj2).c).compareTo(Integer.valueOf(((k9t0) obj).c));
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                return Integer.valueOf(((en7) obj).c).compareTo(Integer.valueOf(((en7) obj2).c));
            default:
                return Integer.valueOf(((en7) obj).c).compareTo(Integer.valueOf(((en7) obj2).c));
        }
    }
}
