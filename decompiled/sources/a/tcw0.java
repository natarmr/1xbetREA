package a;

import android.gov.nist.core.Separators;
import java.util.Calendar;
import java.util.Date;

/* JADX INFO: loaded from: classes2.dex */
public final class tcw0 extends oyc {
    public final scw0 c;

    public tcw0(uhx0 uhx0Var, int i, scw0 scw0Var) {
        super(uhx0Var, i);
        this.c = scw0Var;
        StringBuilder sb = new StringBuilder(Separators.PERCENT);
        uhx0Var.d(sb);
        sb.append(true != uhx0Var.c() ? 't' : 'T');
        sb.append(scw0Var.f32007a);
    }

    @Override // a.oyc
    public final void H(zdx0 zdx0Var, Object obj) {
        char c = this.c.f32007a;
        uhx0 uhx0Var = (uhx0) this.b;
        StringBuilder sb = (StringBuilder) zdx0Var.g;
        if (!(obj instanceof Date) && !(obj instanceof Calendar) && !(obj instanceof Long)) {
            StringBuilder sb2 = new StringBuilder(String.valueOf(c).length() + 2);
            sb2.append("%t");
            sb2.append(c);
            zdx0.f(sb, obj, sb2.toString());
            return;
        }
        StringBuilder sb3 = new StringBuilder(Separators.PERCENT);
        uhx0Var.d(sb3);
        sb3.append(true != uhx0Var.c() ? 't' : 'T');
        sb3.append(c);
        sb.append(String.format(yhx0.f42659a, sb3.toString(), obj));
    }
}
