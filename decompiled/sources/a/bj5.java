package a;

import android.os.Bundle;
import androidx.fragment.app.Fragment;

/* JADX INFO: loaded from: classes3.dex */
public final class bj5 implements b28, nae0, jg9 {
    public static s77 b(int i) {
        Object next;
        c0o c0oVar = s77.l;
        y2 y2VarH = ohs0.h(c0oVar, c0oVar);
        do {
            if (!y2VarH.hasNext()) {
                next = null;
                break;
            }
            next = y2VarH.next();
        } while (((s77) next).f31736a != i);
        s77 s77Var = (s77) next;
        return s77Var == null ? s77.EVENTS : s77Var;
    }

    public static oo5 c(Integer num) {
        for (oo5 oo5Var : oo5.c) {
            byte b = oo5Var.f25576a;
            if (num != null && b == num.intValue()) {
                return oo5Var;
            }
        }
        return null;
    }

    public static void d(androidx.fragment.app.e eVar, long j) {
        eVar.getClass();
        String str = ut9.u2;
        if (eVar.J(str) != null) {
            return;
        }
        ut9 ut9Var = new ut9();
        iiy[] iiyVarArr = ut9.t2;
        ut9Var.q2.x(ut9Var, iiyVarArr[0], "SHOW_OPERATOR_RATING_DIALOG_KEY");
        ut9Var.r2.j(ut9Var, iiyVarArr[1], j);
        ut9Var.H0(eVar, str);
    }

    @Override // a.jg9
    public byte[] e(byte[] bArr, int i, int i2) {
        byte[] bArr2 = new byte[i2];
        System.arraycopy(bArr, i, bArr2, 0, i2);
        return bArr2;
    }

    @Override // a.nae0
    public Object n(iiy iiyVar, Object obj) {
        String string;
        j700 j700VarValueOf;
        Fragment fragment = (Fragment) obj;
        fragment.getClass();
        iiyVar.getClass();
        Bundle bundle = fragment.g;
        if (bundle == null || (string = bundle.getString("SCREEN_TYPE_KEY")) == null || (j700VarValueOf = j700.valueOf(string)) == null) {
            throw new ss3();
        }
        return j700VarValueOf;
    }

    @Override // a.b28
    public long a(long j) {
        return j;
    }
}
