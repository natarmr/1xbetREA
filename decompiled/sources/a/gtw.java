package a;

import android.gov.nist.core.Separators;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.text.Regex;

/* JADX INFO: loaded from: classes2.dex */
public final class gtw implements jr20 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final List f11901a;
    public static final Regex b;

    static {
        nse0 nse0Var = nse0.IGNORE_CASE;
        List listJ = q3d.j(new Pair(new Regex("<(?:script|pre|style)(?: |>|$)", nse0Var), new Regex("</(?:script|style|pre)>", nse0Var)), new Pair(new Regex("<!--"), new Regex("-->")), new Pair(new Regex("<\\?"), new Regex("\\?>")), new Pair(new Regex("<![A-Z]"), new Regex(Separators.GREATER_THAN)), new Pair(new Regex("<!\\[CDATA\\["), new Regex("\\]\\]>")), new Pair(new Regex(axq.n(new StringBuilder("</?(?:"), kotlin.text.c.r("address, article, aside, base, basefont, blockquote, body, caption, center, col, colgroup, dd, details, dialog, dir, div, dl, dt, fieldset, figcaption, figure, footer, form, frame, frameset, h1, head, header, hr, html, legend, li, link, main, menu, menuitem, meta, nav, noframes, ol, optgroup, option, p, param, pre, section, source, title, summary, table, tbody, td, tfoot, th, thead, title, tr, track, ul", ", ", HiAnalyticsConstant.REPORT_VAL_SEPARATOR, false), ")(?: |/?>|$)"), nse0Var), null), new Pair(new Regex("(?:<[a-zA-Z][a-zA-Z0-9-]*(?:\\s+[A-Za-z:_][A-Za-z0-9_.:-]*(?:\\s*=\\s*(?:[^ \"'=<>`]+|'[^']*'|\"[^\"]*\"))?)*\\s*/?>|</[a-zA-Z][a-zA-Z0-9-]*\\s*>)\\s*$"), null));
        f11901a = listJ;
        b = new Regex(axq.m(new StringBuilder("^("), CollectionsKt.b0(listJ, HiAnalyticsConstant.REPORT_VAL_SEPARATOR, null, null, btv.p, 30), ')'));
    }

    public static int c(v9d v9dVar, k810 k810Var) {
        v9dVar.getClass();
        int i = k810Var.b;
        CharSequence charSequence = k810Var.d;
        if (i != idx.x(v9dVar, charSequence)) {
            return -1;
        }
        CharSequence charSequenceSubSequence = charSequence.subSequence(i, charSequence.length());
        charSequenceSubSequence.getClass();
        int i2 = 0;
        for (int i3 = 0; i3 < 3; i3++) {
            if (i2 < charSequenceSubSequence.length() && charSequenceSubSequence.charAt(i2) == ' ') {
                i2++;
            }
        }
        if (i2 >= charSequenceSubSequence.length() || charSequenceSubSequence.charAt(i2) != '<') {
            return -1;
        }
        bh30 bh30VarB = b.b(charSequenceSubSequence.subSequence(i2, charSequenceSubSequence.length()).toString());
        if (bh30VarB == null) {
            return -1;
        }
        g3 g3Var = bh30VarB.c;
        int iB = g3Var.b();
        List list = f11901a;
        if (iB != list.size() + 2) {
            throw new byw("There are some excess capturing groups probably!");
        }
        int size = list.size();
        for (int i4 = 0; i4 < size; i4++) {
            if (g3Var.e(i4 + 2) != null) {
                return i4;
            }
        }
        throw new byw("Match found but all groups are empty!");
    }

    @Override // a.jr20
    public final List a(k810 k810Var, y78 y78Var, mr20 mr20Var) {
        mr20Var.getClass();
        v9d v9dVar = mr20Var.f22248a;
        int iC = c(v9dVar, k810Var);
        return iC != -1 ? kotlin.collections.a.c(new etw(v9dVar, y78Var, (Regex) ((Pair) f11901a.get(iC)).b, k810Var)) : iun.f15405a;
    }

    @Override // a.jr20
    public final boolean b(v9d v9dVar, k810 k810Var) {
        int iC = c(v9dVar, k810Var);
        return iC >= 0 && iC < 6;
    }
}
