package a;

import java.util.Calendar;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class mhq0 extends rer implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final mhq0 f21808a = new mhq0(2, ohq0.class, "selectDatePattern", "selectDatePattern(Ljava/util/Calendar;Ljava/util/Calendar;)Lorg/xplatform/ui_core/format/DateTimePattern;", 1);

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Calendar calendar = (Calendar) obj;
        Calendar calendar2 = (Calendar) obj2;
        calendar.getClass();
        calendar2.getClass();
        return calendar.get(1) != calendar2.get(1) ? efj.UNIVERSAL : efj.UNIQUE_1;
    }
}
