package a;

import android.gov.nist.core.Separators;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes2.dex */
public final class ftw extends a1 {
    public static final Pattern[][] e = {new Pattern[]{null, null}, new Pattern[]{Pattern.compile("^<(?:script|pre|style)(?:\\s|>|$)", 2), Pattern.compile("</(?:script|pre|style)>", 2)}, new Pattern[]{Pattern.compile("^<!--"), Pattern.compile("-->")}, new Pattern[]{Pattern.compile("^<[?]"), Pattern.compile("\\?>")}, new Pattern[]{Pattern.compile("^<![A-Z]"), Pattern.compile(Separators.GREATER_THAN)}, new Pattern[]{Pattern.compile("^<!\\[CDATA\\["), Pattern.compile("\\]\\]>")}, new Pattern[]{Pattern.compile("^</?(?:address|article|aside|base|basefont|blockquote|body|caption|center|col|colgroup|dd|details|dialog|dir|div|dl|dt|fieldset|figcaption|figure|footer|form|frame|frameset|h1|h2|h3|h4|h5|h6|head|header|hr|html|iframe|legend|li|link|main|menu|menuitem|nav|noframes|ol|optgroup|option|p|param|section|source|summary|table|tbody|td|tfoot|th|thead|title|tr|track|ul)(?:\\s|[/]?[>]|$)", 2), null}, new Pattern[]{Pattern.compile("^(?:<[A-Za-z][A-Za-z0-9-]*(?:\\s+[a-zA-Z_:][a-zA-Z0-9:._-]*(?:\\s*=\\s*(?:[^\"'=<>`\\x00-\\x20]+|'[^']*'|\"[^\"]*\"))?)*\\s*/?>|</[A-Za-z][A-Za-z0-9-]*\\s*[>])\\s*$", 2), null}};
    public final Pattern b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dtw f10135a = new dtw(0);
    public boolean c = false;
    public y78 d = new y78((byte) 0);

    public ftw(Pattern pattern) {
        this.b = pattern;
    }

    @Override // a.a1
    public final void a(CharSequence charSequence) {
        y78 y78Var = this.d;
        StringBuilder sb = (StringBuilder) y78Var.c;
        if (y78Var.b != 0) {
            sb.append('\n');
        }
        sb.append(charSequence);
        y78Var.b++;
        Pattern pattern = this.b;
        if (pattern == null || !pattern.matcher(charSequence).find()) {
            return;
        }
        this.c = true;
    }

    @Override // a.a1
    public final void c() {
        Object obj = this.d.c;
        this.d = null;
    }

    @Override // a.a1
    public final p78 d() {
        return this.f10135a;
    }

    @Override // a.a1
    public final iyc g(yxk yxkVar) {
        if (this.c) {
            return null;
        }
        if (yxkVar.h && this.b == null) {
            return null;
        }
        return iyc.a(yxkVar.b);
    }
}
