package kotlin.text;

import a.jf4;
import a.oub;
import a.pub;
import a.ua80;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"kotlin/text/CharsKt__CharJVMKt", "kotlin/text/a"}, d2 = {}, k = 4, mv = {2, 4, 0}, xi = 49)
public final class CharsKt extends a {
    public static pub c(char c) {
        oub oubVar = pub.f27607a;
        int type = Character.getType(c);
        oubVar.getClass();
        if (type >= 0 && type < 17) {
            return (pub) pub.c.get(type);
        }
        if (18 <= type && type < 31) {
            return (pub) pub.c.get(type - 1);
        }
        jf4.o(ua80.e(type, "Category #", " is not defined."));
        return null;
    }

    public static boolean d(char c) {
        return Character.isWhitespace(c) || Character.isSpaceChar(c);
    }
}
