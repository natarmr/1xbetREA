package a;

import android.gov.nist.core.Separators;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.text.StringsKt;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes4.dex */
public abstract class kxs0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Set f19073a = tx3.l0(new Long[]{1L, 2L, 36L});

    public static final v5m a(m9s m9sVar, boolean z, List list, boolean z2, ctf0 ctf0Var) {
        String string;
        int i;
        Long l = (Long) CollectionsKt.firstOrNull(z ? m9sVar.c : m9sVar.d);
        long jLongValue = l != null ? l.longValue() : 0L;
        String str = (String) CollectionsKt.firstOrNull(z ? m9sVar.m : m9sVar.n);
        if (str == null) {
            str = "";
        }
        m9sVar.getClass();
        long j = m9sVar.o;
        if (m9sVar.I instanceof qz7) {
            String str2 = !z ? "static/img/ImgDefault/Esports/Virtual/Dice/BigPig/bluePigAvatar.png" : "static/img/ImgDefault/Esports/Virtual/Dice/BigPig/redPigAvatar.png";
            StringBuilder sb = new StringBuilder(ujn.h);
            if (str2.length() == 0) {
                sb.setLength(0);
            } else if (StringsKt.O(str2, ujn.h, false) || kotlin.text.c.x(str2, "https://", false)) {
                sb.setLength(0);
                sb.append(str2);
            } else {
                if (sb.length() > 0 && !StringsKt.S(sb, Separators.SLASH)) {
                    sb.append('/');
                }
                sb.append(StringsKt.y0(str2, '/'));
            }
            string = sb.toString();
        } else {
            string = null;
        }
        String strI = z ? m9sVar.i : m9sVar.j;
        if (strI.length() != 0 && m9sVar.A == 2095742) {
            strI = ua80.i(strI, " (", ctf0Var.b.a(z ? R.string.player : R.string.dealer, Arrays.copyOf(new Object[0], 0)), Separators.RPAREN);
        }
        String str3 = strI;
        n0x n0xVar = new n0x(string == null ? vsm0.s(jLongValue, str) : string);
        if (j != jrg.d.b || z) {
            int i2 = gql0.f11739a;
            if (q3d.j(284L, 236L, 146L, 235L, 167L, 234L, 153L, 243L, 258L, 268L, 287L, 274L).contains(Long.valueOf(j))) {
                i = R.drawable.ic_player_placeholder;
            } else {
                i = m9sVar.p == 1 ? R.drawable.icon_globe_new : R.drawable.icon_globe_80_new;
            }
        } else {
            i = R.drawable.ic_glyph_circle_bank;
        }
        return new v5m(jLongValue, str3, n0xVar, i, z2 ? Boolean.valueOf(jpm0.i(list, jLongValue, m9sVar.o, m9sVar.p)) : null, string != null);
    }

    public static final l6m b(m9s m9sVar, la30 la30Var) {
        long j;
        byte b = la30Var != null ? la30Var.f19688a : (byte) 0;
        if (1 > b || b >= 8) {
            return null;
        }
        int iD = l1e0.d(m9sVar.h.d, 0, b);
        int iD2 = l1e0.d(m9sVar.h.e, 0, b);
        long j2 = m9sVar.p;
        if (j2 == zwg.d.b) {
            j = ijg.y0;
        } else if (j2 == 1) {
            j = ijg.l0;
        } else if (j2 == 40 || j2 == 2) {
            j = ijg.l1;
        } else if (j2 == 46) {
            j = ijg.M;
        } else if (j2 == 27) {
            j = ijg.U;
        } else {
            j = j2 == 15 ? ijg.l1 : ijg.H0;
        }
        return new l6m(b, iD, iD2, j);
    }
}
