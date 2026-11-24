package a;

/* JADX INFO: loaded from: classes.dex */
public final class bet0 {
    public static ydt0 a(Object obj) {
        mjt mjtVar = (mjt) obj;
        ydt0 ydt0Var = mjtVar.unknownFields;
        if (ydt0Var != ydt0.f) {
            return ydt0Var;
        }
        ydt0 ydt0Var2 = new ydt0(0, new int[8], new Object[8], true);
        mjtVar.unknownFields = ydt0Var2;
        return ydt0Var2;
    }

    public static boolean b(int i, hu5 hu5Var, Object obj) throws box, vnx {
        int i2 = hu5Var.b;
        oyc oycVar = (oyc) hu5Var.e;
        int i3 = i2 >>> 3;
        int i4 = i2 & 7;
        if (i4 == 0) {
            hu5Var.W(0);
            ((ydt0) obj).c(i3 << 3, Long.valueOf(oycVar.v()));
            return true;
        }
        if (i4 == 1) {
            hu5Var.W(1);
            ((ydt0) obj).c((i3 << 3) | 1, Long.valueOf(oycVar.s()));
            return true;
        }
        if (i4 == 2) {
            ((ydt0) obj).c((i3 << 3) | 2, hu5Var.n());
            return true;
        }
        if (i4 != 3) {
            if (i4 == 4) {
                return false;
            }
            if (i4 != 5) {
                throw box.b();
            }
            hu5Var.W(5);
            ((ydt0) obj).c(5 | (i3 << 3), Integer.valueOf(oycVar.r()));
            return true;
        }
        ydt0 ydt0Var = new ydt0(0, new int[8], new Object[8], true);
        int i5 = i3 << 3;
        int i6 = i5 | 4;
        int i7 = i + 1;
        if (i7 >= 100) {
            throw new box("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        while (hu5Var.e() != Integer.MAX_VALUE && b(i7, hu5Var, ydt0Var)) {
        }
        if (i6 != hu5Var.b) {
            throw new box("Protocol message end-group tag did not match expected tag.");
        }
        if (ydt0Var.e) {
            ydt0Var.e = false;
        }
        ((ydt0) obj).c(i5 | 3, ydt0Var);
        return true;
    }
}
