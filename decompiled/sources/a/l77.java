package a;

import android.text.format.DateUtils;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes3.dex */
public final class l77 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m0w f19543a;
    public final odj b;
    public final qoj0 c;
    public long d;

    public l77(y2m0 y2m0Var, m0w m0wVar, odj odjVar, b6u b6uVar) {
        m0wVar.getClass();
        odjVar.getClass();
        this.f19543a = m0wVar;
        this.b = odjVar;
        this.c = roj0.b(0, 0, null, 7);
        long jIntValue = ((long) (((Number) b6uVar.invoke()).intValue() - 1)) * 86400000;
        long jC = y2m0.c() - jIntValue;
        m0wVar.d = jIntValue;
        m0wVar.e = jC;
    }

    public final long a(s77 s77Var) {
        s77Var.getClass();
        TimeUnit.MILLISECONDS.getClass();
        int iOrdinal = s77Var.ordinal();
        if (iOrdinal != 3) {
            return iOrdinal != 4 ? rv00.n(rv00.k, this.f19543a.e, 14) : y2m0.c() - 2592000000L;
        }
        return 1325376000L;
    }

    public final long b(s77 s77Var, boolean z) {
        s77Var.getClass();
        TimeUnit.MILLISECONDS.getClass();
        if (DateUtils.isToday(this.d)) {
            if (z) {
                return 0L;
            }
            return y2m0.c();
        }
        if (this.b.f25078a == pdj.b && !q3d.j(s77.SALE, s77.UNSETTLED).contains(s77Var)) {
            return this.d;
        }
        if (z) {
            return 0L;
        }
        return y2m0.c();
    }
}
