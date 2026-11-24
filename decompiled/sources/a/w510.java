package a;

import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import kotlin.collections.CollectionsKt;
import kotlin.text.StringsKt;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes4.dex */
public abstract class w510 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final List f38564a;

    static {
        x510 x510Var = x510.STATISTIC;
        aco0 aco0Var = new aco0(1L);
        x510 x510Var2 = x510.STATISTIC;
        f38564a = q3d.j(aco0Var, new aco0(2L));
    }

    public static final b610 a(m9s m9sVar, d310 d310Var, o310 o310Var) {
        m9sVar.getClass();
        o310Var.getClass();
        String str = "";
        if (o310Var.f.g == d310Var) {
            String str2 = m9sVar.i;
            String str3 = (String) CollectionsKt.firstOrNull(m9sVar.m);
            if (str3 == null) {
                str3 = "";
            }
            if (kotlin.text.c.x(str3, ujn.h, false)) {
                str = str3;
            } else if (str3.length() != 0) {
                List list = u0d.f34849a;
                if (!u0d.c(str3)) {
                    str = String.format(Locale.ENGLISH, StringsKt.O(str3, "playerlogo/", true) ? "%s/%s" : "%s/playerlogo/%s", Arrays.copyOf(new Object[]{ujn.h, str3}, 2));
                }
            }
            return new b610(str2, str);
        }
        String str4 = m9sVar.j;
        String str5 = (String) CollectionsKt.firstOrNull(m9sVar.n);
        if (str5 == null) {
            str5 = "";
        }
        if (kotlin.text.c.x(str5, ujn.h, false)) {
            str = str5;
        } else if (str5.length() != 0) {
            List list2 = u0d.f34849a;
            if (!u0d.c(str5)) {
                str = String.format(Locale.ENGLISH, StringsKt.O(str5, "playerlogo/", true) ? "%s/%s" : "%s/playerlogo/%s", Arrays.copyOf(new Object[]{ujn.h, str5}, 2));
            }
        }
        return new b610(str4, str);
    }

    public static final Integer b(zf90 zf90Var, int i) {
        zf90 zf90Var2;
        zf90 zf90Var3 = zf90.f44292a;
        if ((zf90Var == zf90Var3 && i == 1) || (zf90Var == (zf90Var2 = zf90.b) && i == 2)) {
            return Integer.valueOf(R.string.previous_maps_win);
        }
        if ((zf90Var == zf90Var3 && i == 2) || (zf90Var == zf90Var2 && i == 1)) {
            return Integer.valueOf(R.string.previous_maps_lose);
        }
        if (zf90Var == zf90.c) {
            return Integer.valueOf(R.string.draw);
        }
        return null;
    }
}
