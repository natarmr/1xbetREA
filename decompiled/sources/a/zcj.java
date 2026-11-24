package a;

import java.util.Calendar;
import java.util.List;
import kotlin.jvm.functions.Function1;
import org.xplatform.uikit.compose.components.calendar.model.DateRangeModel;
import org.xplatform.uikit.compose.components.picker.model.SimpleDate;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class zcj implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f44169a;
    public final /* synthetic */ Calendar b;

    public /* synthetic */ zcj(Calendar calendar, byte b) {
        this.f44169a = b;
        this.b = calendar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f44169a;
        Calendar calendar = this.b;
        switch (b) {
            case 0:
                return bsr0.g0(((Long) obj).longValue(), calendar);
            case 1:
                List list = (List) obj;
                list.getClass();
                if (list.size() < 2) {
                    return null;
                }
                Long l = (Long) list.get(0);
                SimpleDate simpleDateG0 = l != null ? bsr0.g0(l.longValue(), calendar) : null;
                Long l2 = (Long) list.get(1);
                SimpleDate simpleDateG1 = l2 != null ? bsr0.g0(l2.longValue(), calendar) : null;
                if (simpleDateG0 == null && simpleDateG1 == null) {
                    return null;
                }
                return new DateRangeModel(simpleDateG0, simpleDateG1);
            case 2:
                long[] jArr = (long[]) obj;
                jArr.getClass();
                return new wk9(bsr0.g0(jArr[0], calendar), bsr0.g0(jArr[1], calendar));
            default:
                long[] jArr2 = (long[]) obj;
                jArr2.getClass();
                return new xk9(bsr0.h0(jArr2[0], calendar), bsr0.h0(jArr2[1], calendar));
        }
    }
}
