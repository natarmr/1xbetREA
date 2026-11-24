package a;

import android.gov.nist.core.Separators;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public abstract class xjf0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final wjf0 f40982a;
    public static final vjf0 b;
    public static final /* synthetic */ xjf0[] c;

    static {
        wjf0 wjf0Var = new wjf0();
        f40982a = wjf0Var;
        vjf0 vjf0Var = new vjf0();
        b = vjf0Var;
        c = new xjf0[]{wjf0Var, vjf0Var};
    }

    public static xjf0 valueOf(String str) {
        return (xjf0) Enum.valueOf(xjf0.class, str);
    }

    public static xjf0[] values() {
        return (xjf0[]) c.clone();
    }

    public String a(String str) {
        return kotlin.text.c.r(kotlin.text.c.r(str, Separators.LESS_THAN, "&lt;", false), Separators.GREATER_THAN, "&gt;", false);
    }
}
