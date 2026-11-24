package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes3.dex */
public abstract class wog {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final List f39495a = kotlin.collections.a.c(Long.valueOf(bxg.d.b));

    public static final n0x a(String str) {
        StringBuilder sb = new StringBuilder(ujn.h);
        str.getClass();
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
        return new n0x(sb.toString());
    }

    public static final m0x b(m9s m9sVar) {
        if (aem0.q(m9sVar.o, m9sVar.I instanceof qz7, m9sVar.A) instanceof qnu0) {
            return new m0x(R.drawable.ic_glyph_info_circle, null, 6);
        }
        return null;
    }

    public static final f6m c(m9s m9sVar, String str) {
        int iY;
        m0x m0xVar = new m0x(R.drawable.ic_glyph_tournaments, null, 6);
        if (str.length() == 0) {
            str = m9sVar.f;
        }
        long j = m9sVar.o;
        if (!f39495a.contains(Long.valueOf(j))) {
            if (j == 40) {
                str = StringsKt.m0(str, ". ", str);
            } else if (new Regex("\\d").a(str) && (iY = StringsKt.Y(0, str, 6, Separators.DOT)) != -1) {
                str = str.substring(0, iY);
            }
        }
        return new f6m(m0xVar, str);
    }
}
