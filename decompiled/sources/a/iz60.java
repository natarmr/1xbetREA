package a;

import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes5.dex */
public final class iz60 {
    public static lz60 a(String str) {
        Integer intOrNull;
        return (str == null || (intOrNull = StringsKt.toIntOrNull(str)) == null) ? jz60.f17395a : new kz60(intOrNull.intValue());
    }

    public static int b(lz60 lz60Var) {
        lz60Var.getClass();
        if (lz60Var instanceof jz60) {
            return 1;
        }
        if (lz60Var instanceof kz60) {
            return ((kz60) lz60Var).f19140a;
        }
        t9f.b();
        return 0;
    }

    public final jiy serializer() {
        return o2x.f24552a;
    }
}
