package a;

import android.gov.nist.core.Separators;
import java.util.Collection;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ekj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Pattern f7954a = Pattern.compile(Separators.COMMA);
    public static final HashMap b;

    static {
        EnumSet enumSetOf = EnumSet.of(ju5.l);
        EnumSet enumSetOf2 = EnumSet.of(ju5.f);
        EnumSet enumSetOf3 = EnumSet.of(ju5.f17135a);
        EnumSet enumSetOf4 = EnumSet.of(ju5.k);
        EnumSet enumSetOf5 = EnumSet.of(ju5.o, ju5.p, ju5.h, ju5.g, ju5.m, ju5.n);
        EnumSet enumSetOf6 = EnumSet.of(ju5.c, ju5.d, ju5.e, ju5.i, ju5.b);
        EnumSet enumSetCopyOf = EnumSet.copyOf((Collection) enumSetOf5);
        enumSetCopyOf.addAll(enumSetOf6);
        HashMap map = new HashMap();
        b = map;
        map.put("ONE_D_MODE", enumSetCopyOf);
        map.put("PRODUCT_MODE", enumSetOf5);
        map.put("QR_CODE_MODE", enumSetOf);
        map.put("DATA_MATRIX_MODE", enumSetOf2);
        map.put("AZTEC_MODE", enumSetOf3);
        map.put("PDF417_MODE", enumSetOf4);
    }
}
