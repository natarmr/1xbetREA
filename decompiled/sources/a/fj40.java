package a;

import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import kotlin.collections.CollectionsKt;
import kotlin.text.StringsKt;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes4.dex */
public abstract class fj40 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final List f9619a;

    static {
        ym90 ym90Var = ym90.f42878a;
        zm90 zm90Var = zm90.f44614a;
        f9619a = q3d.j(ym90Var, ym90Var, ym90Var, zm90Var, zm90Var, zm90Var, ym90Var, ym90Var, zm90Var, zm90Var);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x001b  */
    public static final c280 a(String str) {
        if (!kotlin.text.c.x(str, ujn.h, false)) {
            if (str.length() == 0) {
                str = "";
            } else {
                List list = u0d.f34849a;
                if (u0d.c(str)) {
                    str = "";
                } else {
                    str = String.format(Locale.ENGLISH, StringsKt.O(str, "playerlogo/", true) ? "%s/%s" : "%s/playerlogo/%s", Arrays.copyOf(new Object[]{ujn.h, str}, 2));
                }
            }
        }
        return new c280(str, R.drawable.ic_glyph_circle_globe);
    }

    public static final b7m b(b960 b960Var, int i, b960 b960Var2) {
        xh40 xh40Var = b960Var != null ? b960Var.f2193a : null;
        if (xh40Var != null) {
            if (xh40Var instanceof vh40) {
                String str = ((vh40) xh40Var).b;
                u6m u6mVar = u6m.f35142a;
                return new y6m(str, String.valueOf(b960Var.b));
            }
            if (!(xh40Var instanceof wh40)) {
                t9f.b();
                return null;
            }
            String str2 = ((wh40) xh40Var).b;
            u6m u6mVar2 = u6m.f35142a;
            return new z6m(str2, String.valueOf(b960Var.b));
        }
        xh40 xh40Var2 = b960Var2 != null ? b960Var2.f2193a : null;
        an90 an90Var = (an90) CollectionsKt.W(i, f9619a);
        if (an90Var == null) {
            if (xh40Var2 == null) {
                an90Var = zm90.f44614a;
            } else if (xh40Var2 instanceof vh40) {
                an90Var = ym90.f42878a;
            } else {
                if (!(xh40Var2 instanceof wh40)) {
                    t9f.b();
                    return null;
                }
                an90Var = zm90.f44614a;
            }
        }
        return new a7m(an90Var);
    }
}
