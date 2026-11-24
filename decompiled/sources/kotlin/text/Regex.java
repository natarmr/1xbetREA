package kotlin.text;

import a.bh30;
import a.gvb0;
import a.lse0;
import a.mse0;
import a.nse0;
import a.tjt;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\r\n\u0002\b\u0007\u0018\u0000 \f2\u00060\u0001j\u0002`\u0002:\u0001\rB\u0011\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001d\u0010\n\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0003¢\u0006\u0004\b\n\u0010\u000b¨\u0006\u000e"}, d2 = {"Lkotlin/text/Regex;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "", "pattern", "<init>", "(Ljava/lang/String;)V", "", "input", "replacement", "replace", "(Ljava/lang/CharSequence;Ljava/lang/String;)Ljava/lang/String;", "b", "a/lse0", "kotlin-stdlib"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class Regex implements Serializable {
    public static final lse0 b = new lse0(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Pattern f46072a;

    public Regex(String str, nse0 nse0Var) {
        nse0Var.getClass();
        lse0 lse0Var = b;
        int i = nse0Var.f24048a;
        lse0Var.getClass();
        Pattern patternCompile = Pattern.compile(str, (i & 2) != 0 ? i | 64 : i);
        patternCompile.getClass();
        this.f46072a = patternCompile;
    }

    public static tjt d(Regex regex, CharSequence charSequence) {
        regex.getClass();
        charSequence.getClass();
        if (charSequence.length() >= 0) {
            return new tjt(new gvb0(regex, charSequence, (byte) 18), mse0.f22316a);
        }
        throw new IndexOutOfBoundsException("Start index out of bounds: 0, input length: " + charSequence.length());
    }

    public final boolean a(CharSequence charSequence) {
        charSequence.getClass();
        return this.f46072a.matcher(charSequence).find();
    }

    public final bh30 b(CharSequence charSequence) {
        charSequence.getClass();
        Matcher matcher = this.f46072a.matcher(charSequence);
        matcher.getClass();
        if (matcher.find(0)) {
            return new bh30(matcher, charSequence);
        }
        return null;
    }

    public final bh30 e(int i, String str) {
        str.getClass();
        Matcher matcherRegion = this.f46072a.matcher(str).useAnchoringBounds(false).useTransparentBounds(true).region(i, str.length());
        if (matcherRegion.lookingAt()) {
            return new bh30(matcherRegion, str);
        }
        return null;
    }

    public final bh30 f(CharSequence charSequence) {
        charSequence.getClass();
        Matcher matcher = this.f46072a.matcher(charSequence);
        matcher.getClass();
        if (matcher.matches()) {
            return new bh30(matcher, charSequence);
        }
        return null;
    }

    public final boolean g(CharSequence charSequence) {
        charSequence.getClass();
        return this.f46072a.matcher(charSequence).matches();
    }

    public final String h(CharSequence charSequence, Function1 function1) {
        charSequence.getClass();
        bh30 bh30VarB = b(charSequence);
        if (bh30VarB == null) {
            return charSequence.toString();
        }
        int length = charSequence.length();
        StringBuilder sb = new StringBuilder(length);
        int i = 0;
        do {
            sb.append(charSequence, i, bh30VarB.b().f46068a);
            sb.append((CharSequence) function1.invoke(bh30VarB));
            i = bh30VarB.b().b + 1;
            bh30VarB = bh30VarB.next();
            if (i >= length) {
                break;
            }
        } while (bh30VarB != null);
        if (i < length) {
            sb.append(charSequence, i, length);
        }
        return sb.toString();
    }

    public final List i(String str) {
        str.getClass();
        int iEnd = 0;
        StringsKt__StringsKt.E(0);
        Matcher matcher = this.f46072a.matcher(str);
        if (!matcher.find()) {
            return kotlin.collections.a.c(str.toString());
        }
        ArrayList arrayList = new ArrayList(10);
        do {
            arrayList.add(str.subSequence(iEnd, matcher.start()).toString());
            iEnd = matcher.end();
        } while (matcher.find());
        arrayList.add(str.subSequence(iEnd, str.length()).toString());
        return arrayList;
    }

    public final String replace(CharSequence input, String replacement) {
        input.getClass();
        replacement.getClass();
        String strReplaceAll = this.f46072a.matcher(input).replaceAll(replacement);
        strReplaceAll.getClass();
        return strReplaceAll;
    }

    public final String toString() {
        String string = this.f46072a.toString();
        string.getClass();
        return string;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public Regex(String str) {
        str.getClass();
        Pattern patternCompile = Pattern.compile(str);
        patternCompile.getClass();
        this(patternCompile);
    }

    public Regex(Pattern pattern) {
        pattern.getClass();
        this.f46072a = pattern;
    }
}
