package a;

import android.gov.nist.core.Separators;
import androidx.constraintlayout.widget.Group;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.collections.CollectionsKt;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import org.xplatform.ui_core.viewcomponents.imageview.RoundCornerImageView;

/* JADX INFO: loaded from: classes3.dex */
public abstract class oa7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final List f24915a = q3d.j(266L, 245L);

    public static final boolean a(cp cpVar) {
        return ((uv6) cpVar.u()).f36333a == 1;
    }

    public static final String b(uv6 uv6Var) {
        Matcher matcher;
        String strGroup;
        uv6Var.getClass();
        String strP = uv6Var.s;
        long j = uv6Var.t;
        if (strP.length() != 0) {
            if (new Regex("[:-]").a(strP)) {
                if (j == 32) {
                    matcher = Pattern.compile("(([0-9.9/]+)[-:\\s]+([0-9.9/]+))").matcher(strP);
                } else {
                    Pattern patternCompile = Pattern.compile("(([0-9/]+)[-:\\s]+([0-9/]+))");
                    if (!f24915a.contains(Long.valueOf(j))) {
                        strP = twn.p("\\(.*?\\)", strP, "");
                    }
                    matcher = patternCompile.matcher(strP);
                }
                if (matcher.find() && (strGroup = matcher.group(0)) != null) {
                    return kotlin.text.c.r(kotlin.text.c.r(kotlin.text.c.r(strGroup, Separators.SP, "", false), Separators.COLON, " : ", false), "-", " - ", false);
                }
            } else if (StringsKt.O(strP, ".00", false)) {
                return kotlin.text.c.r(strP, ".00", " : ", false);
            }
        }
        return "";
    }

    public static final void c(List list, RoundCornerImageView roundCornerImageView, Group group, RoundCornerImageView roundCornerImageView2, RoundCornerImageView roundCornerImageView3) {
        if (list.size() != 2) {
            roundCornerImageView.setVisibility(0);
            group.setVisibility(8);
            List list2 = u0d.f34849a;
            String str = (String) CollectionsKt.firstOrNull(list);
            u0d.n(roundCornerImageView, str != null ? str : "", 0, 11);
            return;
        }
        roundCornerImageView.setVisibility(8);
        group.setVisibility(0);
        String str2 = (String) CollectionsKt.W(0, list);
        if (str2 == null) {
            str2 = "";
        }
        String str3 = (String) CollectionsKt.W(1, list);
        String str4 = str3 != null ? str3 : "";
        List list3 = u0d.f34849a;
        u0d.n(roundCornerImageView2, str2, 0, 11);
        u0d.n(roundCornerImageView3, str4, 0, 11);
    }
}
