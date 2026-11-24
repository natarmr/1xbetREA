package a;

import android.javax.sip.message.Response;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes5.dex */
public final class ho1 implements v6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f13370a;
    public final n0o0 b;
    public final n0o0 c;

    public ho1(int i, hz0 hz0Var) {
        this.f13370a = i;
        this.b = bkb.H(hz0Var.b);
        this.c = bkb.H(Boolean.valueOf(hz0Var.d));
    }

    public static mdm a(int i, boolean z) {
        int iA;
        if (z) {
            xuz xuzVar = pb10.c;
            pb10 pb10Var = pb10.j;
            xuzVar.getClass();
            iA = xuz.a(pb10Var, i);
        } else {
            xuz xuzVar2 = pb10.c;
            pb10 pb10Var2 = pb10.i;
            xuzVar2.getClass();
            iA = xuz.a(pb10Var2, i);
        }
        return new mdm(iA, null, null, 0, 0, R.string.games_for_any_taste, 0, 0, 0L, 0L, 990);
    }

    @Override // a.v6t0
    public final Object invoke(Object obj) {
        hz0 hz0Var = (hz0) obj;
        hz0Var.getClass();
        n0o0 n0o0Var = this.b;
        ((fee) n0o0Var.getValue()).d(hz0Var.b);
        n0o0 n0o0Var2 = this.c;
        ((fee) n0o0Var2.getValue()).d(Boolean.valueOf(hz0Var.d));
        g9h0 g9h0Var = (g9h0) ((fee) n0o0Var.getValue()).c();
        if (g9h0Var != null) {
            boolean z = g9h0Var instanceof q8h0;
            int i = this.f13370a;
            if (z) {
                lc00 lc00VarB = kotlin.collections.a.b();
                lc00VarB.add(new my0(a(i, ((Boolean) ((fee) n0o0Var2.getValue()).c()).booleanValue())));
                pt0 pt0VarG0 = x4d0.g0(hz0Var.i);
                lc00 lc00VarB2 = kotlin.collections.a.b();
                int i2 = 0;
                while (true) {
                    if (i2 >= 4) {
                        lc00VarB.addAll(dyb.o0(kotlin.collections.a.a(lc00VarB2)));
                        return new kz0(dyb.o0(kotlin.collections.a.a(lc00VarB)));
                    }
                    wll wllVar = new wll(o0s.f24443a);
                    int iOrdinal = pt0VarG0.ordinal();
                    int i3 = iOrdinal != 2 ? iOrdinal != 4 ? 6 : 9 : 4;
                    lc00 lc00VarB3 = kotlin.collections.a.b();
                    for (int i4 = 0; i4 < i3; i4++) {
                        lc00VarB3.add(new fp1());
                    }
                    lc00VarB2.add(new ly0(new zll(pt0VarG0, wllVar, dyb.o0(kotlin.collections.a.a(lc00VarB3))), false, false, new j8b(0L, "", iun.f15405a, 0L, 0L, 0L)));
                    i2++;
                }
            } else {
                if (g9h0Var instanceof k8h0) {
                    int i5 = ((k8h0) g9h0Var).f17871a ? R.string.country_blocking : R.string.data_retrieval_error;
                    xuz xuzVar = pb10.c;
                    pb10 pb10Var = pb10.g;
                    xuzVar.getClass();
                    return new jz0(new mdm(xuz.a(pb10Var, i), null, null, 0, 0, i5, 0, R.string.try_again_text, 10000L, 0L, Response.SESSION_NOT_ACCEPTABLE));
                }
                if (g9h0Var instanceof e8h0) {
                    lc00 lc00VarB4 = kotlin.collections.a.b();
                    lc00VarB4.add(new my0(a(i, ((Boolean) ((fee) n0o0Var2.getValue()).c()).booleanValue())));
                    lc00VarB4.addAll(((e8h0) g9h0Var).f7372a);
                    return new iz0(dyb.o0(kotlin.collections.a.a(lc00VarB4)));
                }
                if (g9h0Var instanceof i8h0) {
                    lc00 lc00VarB5 = kotlin.collections.a.b();
                    xuz xuzVar2 = pb10.c;
                    pb10 pb10Var2 = pb10.e;
                    xuzVar2.getClass();
                    lc00VarB5.add(new my0(new mdm(xuz.a(pb10Var2, i), null, null, 0, 0, R.string.nothing_found, 0, 0, 0L, 0L, 990)));
                    lc00VarB5.addAll(((i8h0) g9h0Var).f14338a);
                    return new iz0(dyb.o0(kotlin.collections.a.a(lc00VarB5)));
                }
                if (g9h0Var instanceof g8h0) {
                    xuz xuzVar3 = pb10.c;
                    pb10 pb10Var3 = pb10.g;
                    xuzVar3.getClass();
                    return new jz0(new mdm(xuz.a(pb10Var3, i), null, null, 0, 0, R.string.statistic_empty_data, 0, 0, 0L, 0L, 990));
                }
                if (g9h0Var instanceof b9h0) {
                    return new iz0(((b9h0) g9h0Var).f2209a);
                }
            }
        }
        t9f.b();
        return null;
    }
}
