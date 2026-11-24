package a;

import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class lsm0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l4x f20588a;
    public final us00 b;

    public lsm0(l4x l4xVar, us00 us00Var) {
        this.f20588a = l4xVar;
        this.b = us00Var;
    }

    public final String a(int i, Object... objArr) {
        int length = objArr.length;
        us00 us00Var = this.b;
        l4x l4xVar = this.f20588a;
        if (length == 0) {
            String strA = l4xVar.a(i);
            if (strA != null) {
                return strA;
            }
            String strB = l4xVar.b(i);
            if (strB != null) {
                return strB;
            }
            String string = us00Var.getString(i);
            string.getClass();
            return string;
        }
        String strA2 = l4xVar.a(i);
        try {
            if (strA2 != null) {
                Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
                return String.format(strA2, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length));
            }
            String strB2 = l4xVar.b(i);
            if (strB2 != null) {
                Object[] objArrCopyOf2 = Arrays.copyOf(objArr, objArr.length);
                return String.format(strB2, Arrays.copyOf(objArrCopyOf2, objArrCopyOf2.length));
            }
            String string2 = us00Var.getString(i, Arrays.copyOf(objArr, objArr.length));
            string2.getClass();
            return string2;
        } catch (Exception e) {
            throw new RuntimeException("string = " + strA2 + " formatArgs = " + objArr, e);
        }
    }
}
