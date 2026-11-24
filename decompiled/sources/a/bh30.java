package a;

import java.util.List;
import java.util.regex.Matcher;
import kotlin.ranges.IntRange;
import kotlin.text.MatchResult;

/* JADX INFO: loaded from: classes2.dex */
public final class bh30 implements MatchResult {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Matcher f2586a;
    public final CharSequence b;
    public final g3 c;
    public ah30 d;

    public bh30(Matcher matcher, CharSequence charSequence) {
        matcher.getClass();
        charSequence.getClass();
        this.f2586a = matcher;
        this.b = charSequence;
        this.c = new g3(this, (byte) 1);
    }

    @Override // kotlin.text.MatchResult
    public final List a() {
        ah30 ah30Var = this.d;
        if (ah30Var != null) {
            return ah30Var;
        }
        ah30 ah30Var2 = new ah30(this);
        this.d = ah30Var2;
        return ah30Var2;
    }

    @Override // kotlin.text.MatchResult
    public final IntRange b() {
        Matcher matcher = this.f2586a;
        return l1e0.o(matcher.start(), matcher.end());
    }

    @Override // kotlin.text.MatchResult
    public final g3 c() {
        return this.c;
    }

    @Override // kotlin.text.MatchResult
    public final String getValue() {
        String strGroup = this.f2586a.group();
        strGroup.getClass();
        return strGroup;
    }

    @Override // kotlin.text.MatchResult
    public final bh30 next() {
        Matcher matcher = this.f2586a;
        int iEnd = matcher.end() + (matcher.end() == matcher.start() ? 1 : 0);
        CharSequence charSequence = this.b;
        if (iEnd > charSequence.length()) {
            return null;
        }
        Matcher matcher2 = matcher.pattern().matcher(charSequence);
        matcher2.getClass();
        if (matcher2.find(iEnd)) {
            return new bh30(matcher2, charSequence);
        }
        return null;
    }
}
