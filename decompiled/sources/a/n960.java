package a;

import android.gov.nist.core.Separators;
import kotlin.ranges.IntRange;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes4.dex */
public abstract class n960 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final IntRange f23124a = new IntRange(1, 75, 1);

    public static final String a(String str) {
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
        return sb.toString();
    }

    public static final e960 b(String str) {
        if (str.length() == 0) {
            return c960.f3948a;
        }
        Integer intOrNull = StringsKt.toIntOrNull(str);
        if (intOrNull == null) {
            return null;
        }
        int iIntValue = intOrNull.intValue();
        IntRange intRange = f23124a;
        int i = intRange.f46068a;
        if (iIntValue > intRange.b || i > iIntValue) {
            intOrNull = null;
        }
        if (intOrNull != null) {
            return new d960(String.valueOf(intOrNull.intValue()));
        }
        return null;
    }
}
