package a;

import android.gov.nist.core.Separators;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.collections.CollectionsKt;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsKt;

/* JADX INFO: loaded from: classes3.dex */
public abstract class r4n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final List f29843a = q3d.j(266L, 245L);

    public static final mpm a(long j, String str) {
        String string;
        String string2;
        Matcher matcher;
        String strGroup;
        String strP;
        String strR = "";
        if (str.length() != 0) {
            if (new Regex("[:-]").a(str)) {
                if (j == 32) {
                    matcher = Pattern.compile("(([0-9.9/]+)[-:\\s]+([0-9.9/]+))").matcher(str);
                } else {
                    Pattern patternCompile = Pattern.compile("(([0-9/]+)[-:\\s]+([0-9/]+))");
                    if (!f29843a.contains(Long.valueOf(j))) {
                        str = twn.p("\\(.*?\\)", str, "");
                    }
                    matcher = patternCompile.matcher(str);
                }
                if (matcher.find() && (strGroup = matcher.group(0)) != null && (strP = twn.p(":+", kotlin.text.c.r(kotlin.text.c.r(strGroup, Separators.SP, Separators.COLON, false), "-", Separators.COLON, false), Separators.COLON)) != null) {
                    strR = strP;
                }
            } else if (StringsKt.O(str, ".00", false)) {
                strR = kotlin.text.c.r(str, ".00", Separators.COLON, false);
            }
        }
        int length = strR.length();
        opm opmVar = opm.f25648a;
        if (length == 0) {
            return new lpm(opmVar, new hpm(0L, 3));
        }
        List listSplit$default = StringsKt__StringsKt.split$default(strR, new String[]{Separators.COLON}, false, 0, 6, null);
        String str2 = (String) CollectionsKt.W(0, listSplit$default);
        String str3 = "0";
        if (str2 == null || (string = StringsKt.u0(str2).toString()) == null) {
            string = "0";
        }
        String str4 = (String) CollectionsKt.W(1, listSplit$default);
        if (str4 != null && (string2 = StringsKt.u0(str4).toString()) != null) {
            str3 = string2;
        }
        return new kpm(opmVar, new hpm(0L, 3), d5c.O(string, StringsKt.r0(str3, Separators.SP), false, false, new hpm(0L, 3)));
    }
}
