package a;

import android.gov.nist.core.Separators;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes5.dex */
public final class mgv extends w46 {
    public final p7m0 b;

    public mgv(wyu wyuVar) {
        wyuVar.getClass();
        uaq0 uaq0VarA = wyuVar.a();
        uaq0.f35345a.getClass();
        String str = "static/img/android/actions/register_bonus/200LT.png";
        if (!s9m0.j(uaq0VarA)) {
            if (s9m0.i(uaq0VarA)) {
                str = "static/img/android/actions/register_bonus/200DT.png";
            } else if (s9m0.k(uaq0VarA)) {
                str = "static/img/android/actions/register_bonus/200NT.png";
            }
        }
        StringBuilder sb = new StringBuilder(ujn.h);
        if (str.length() == 0) {
            sb.setLength(0);
        } else if (StringsKt.O(str, ujn.h, false) || kotlin.text.c.x(str, "https://", false)) {
            sb.setLength(0);
            sb.append(str);
        } else {
            if (sb.length() > 0 && !StringsKt.S(sb, Separators.SLASH)) {
                sb.append('/');
            }
            sb.append(StringsKt.y0(str, '/'));
        }
        this.b = q7m0.a(sb.toString());
    }
}
