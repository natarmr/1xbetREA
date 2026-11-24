package a;

import android.gov.nist.core.Separators;
import java.util.Collections;
import java.util.EnumMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class ucw0 extends oyc {
    public static final Map d;
    public final rhx0 c;

    static {
        EnumMap enumMap = new EnumMap(rhx0.class);
        for (rhx0 rhx0Var : rhx0.values()) {
            ucw0[] ucw0VarArr = new ucw0[10];
            for (int i = 0; i < 10; i++) {
                ucw0VarArr[i] = new ucw0(i, rhx0Var, uhx0.e);
            }
            enumMap.put(rhx0Var, ucw0VarArr);
        }
        d = Collections.unmodifiableMap(enumMap);
    }

    public ucw0(int i, rhx0 rhx0Var, uhx0 uhx0Var) {
        super(uhx0Var, i);
        fem0.p(rhx0Var, "format char");
        this.c = rhx0Var;
        if (uhx0Var.a()) {
            return;
        }
        int i2 = rhx0Var.f30511a;
        i2 = uhx0Var.c() ? i2 & 65503 : i2;
        StringBuilder sb = new StringBuilder(Separators.PERCENT);
        uhx0Var.d(sb);
        sb.append((char) i2);
    }

    @Override // a.oyc
    public final void H(zdx0 zdx0Var, Object obj) {
        zdx0Var.c(obj, this.c, (uhx0) this.b);
    }
}
