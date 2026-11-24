package a;

import java.util.Calendar;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class krv extends rer implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final krv f18786a = new krv(2, mrv.class, "selectDatePattern", "selectDatePattern(Ljava/util/Calendar;Ljava/util/Calendar;)Lorg/xplatform/ui_core/format/DatePattern;", 1);

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Calendar calendar = (Calendar) obj;
        Calendar calendar2 = (Calendar) obj2;
        calendar.getClass();
        calendar2.getClass();
        return calendar.get(1) == calendar2.get(1) ? sdj.UNIQUE_2 : sdj.UNIVERSAL;
    }
}
