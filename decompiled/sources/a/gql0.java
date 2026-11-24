package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;
import java.util.List;
import kotlin.text.Regex;
import kotlin.text.StringsKt__StringsKt;

/* JADX INFO: loaded from: classes4.dex */
public abstract class gql0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f11739a = 0;

    static {
        q3d.e(42L, 68L, 85L, 86L, 89L, 90L, 91L, 94L, 96L, 97L, 98L, 99L, 100L, 101L, 103L, 106L, 107L, 109L, 110L, 114L, 115L, 116L, 117L, 120L, 121L, 123L, 124L, 125L, 128L, 129L, 130L, 131L, 135L, 136L, 137L, 141L, 143L);
    }

    public static ArrayList a() {
        return q3d.e(86L, 85L, 144L, 97L, 103L, 195L, 265L, 211L, 200L, 150L, 146L, 236L, 167L, 284L, 235L, 90L, 213L, 145L, 183L, 143L, 273L, 276L, 292L, 255L, 261L, 94L, 136L, 208L, 196L, 199L, 193L, 128L, 280L);
    }

    public static List b() {
        return q3d.j(1L, 2L, 46L, 15L, 27L, 36L);
    }

    public static String c(int i, String str) {
        if (str.length() == 0) {
            return "";
        }
        List listSplit$default = StringsKt__StringsKt.split$default(str, new String[]{Separators.COMMA}, false, 0, 6, null);
        if (listSplit$default.isEmpty()) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        boolean z = i == 1;
        int size = listSplit$default.size();
        int i2 = 0;
        while (i2 < size) {
            int i3 = i2 + 1;
            boolean z2 = i3 == listSplit$default.size();
            String str2 = (String) listSplit$default.get(i2);
            if (z2) {
                Regex regex = new Regex("(\\d+)-(\\d+)");
                String str3 = z ? "$1*-$2" : "$1-*$2";
                str2.getClass();
                String strReplaceFirst = regex.f46072a.matcher(str2).replaceFirst(str3);
                strReplaceFirst.getClass();
                sb.append(strReplaceFirst);
            } else {
                sb.append(str2);
            }
            if (!z2) {
                sb.append(Separators.COMMA);
            }
            i2 = i3;
        }
        return sb.toString();
    }

    public static ArrayList d() {
        return q3d.e(4L, 10L, 21L, 234L, 6L, 5L, 16L, 29L, 239L, 32L, 30L, 39L, 282L);
    }

    public static List e() {
        return q3d.j(1L, 2L, 4L, 46L, 15L, 6L, 36L);
    }
}
