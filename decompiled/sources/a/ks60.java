package a;

import kotlin.collections.CollectionsKt;
import kotlin.text.Regex;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes5.dex */
public abstract class ks60 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Regex f18798a = new Regex("_v(\\d+)(?=\\.)");

    public static final Integer a(oo5 oo5Var, String str) {
        bh30 bh30VarB;
        String str2;
        Integer intOrNull;
        oo5Var.getClass();
        if (oo5Var != oo5.ACTION_DYNAMIC) {
            return null;
        }
        int iIntValue = 1;
        if (str != null && (bh30VarB = f18798a.b(str)) != null && (str2 = (String) CollectionsKt.W(1, bh30VarB.a())) != null && (intOrNull = StringsKt.toIntOrNull(str2)) != null) {
            iIntValue = intOrNull.intValue();
        }
        return Integer.valueOf(iIntValue);
    }
}
