package a;

import java.util.Map;
import kotlin.Pair;
import kotlin.text.Regex;

/* JADX INFO: loaded from: classes2.dex */
public abstract class tzn {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Map f34812a = xp20.f(new Pair('\"', "&quot;"), new Pair('&', "&amp;"), new Pair('<', "&lt;"), new Pair('>', "&gt;"));
    public static final Regex b;
    public static final Regex c;

    static {
        Regex regex = new Regex("&(?:([a-zA-Z0-9]+)|#([0-9]{1,8})|#[xX]([a-fA-F0-9]{1,8}));|([\"&<>])");
        b = regex;
        String strPattern = regex.f46072a.pattern();
        strPattern.getClass();
        c = new Regex(strPattern.concat("|\\\\([!\"#\\$%&'\\(\\)\\*\\+,\\-.\\/:;<=>\\?@\\[\\\\\\]\\^_`{\\|}~])"));
    }

    public static String a(CharSequence charSequence, boolean z, boolean z2) {
        charSequence.getClass();
        return (z2 ? c : b).h(charSequence, new szn(z));
    }
}
