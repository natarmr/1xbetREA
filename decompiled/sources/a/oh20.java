package a;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import org.xplatform.special_event.impl.main.presentation.model.SpecialEventTabs;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class oh20 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f25245a;
    public final /* synthetic */ Serializable b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ boolean e;

    public /* synthetic */ oh20(Serializable serializable, boolean z, boolean z2, boolean z3, byte b) {
        this.f25245a = b;
        this.b = serializable;
        this.c = z;
        this.d = z2;
        this.e = z3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        gx4 gx4VarA;
        byte b = this.f25245a;
        boolean z = this.e;
        boolean z2 = this.d;
        Serializable serializable = this.b;
        switch (b) {
            case 0:
                BigDecimal bigDecimal = (BigDecimal) serializable;
                a820 a820Var = (a820) obj2;
                ((oyg0) obj).getClass();
                a820Var.getClass();
                hx4 hx4Var = a820Var.g;
                return a820.a(a820Var, null, null, null, null, null, hx4.a(hx4Var, null, yyc.a(hx4Var.b, bigDecimal, null, this.c, z2 && z, 30), null, null, null, false, 61), null, false, null, 0.0f, false, null, 0, false, false, false, 262079);
            case 1:
                BigDecimal bigDecimal2 = (BigDecimal) serializable;
                b820 b820Var = (b820) obj2;
                ((oyg0) obj).getClass();
                b820Var.getClass();
                gx4 gx4Var = b820Var.f;
                if (gx4Var != null) {
                    gx4VarA = gx4.a(gx4Var, null, xyc.a(gx4Var.b, bigDecimal2, null, this.c, z2 && z, 30), null, null, null, 29);
                } else {
                    gx4VarA = null;
                }
                return b820.a(b820Var, null, null, null, null, null, gx4VarA, null, false, false, false, false, false, 8159);
            default:
                lok0 lok0Var = (lok0) serializable;
                d92 d92Var = (d92) obj2;
                ((oyg0) obj).getClass();
                d92Var.getClass();
                lwk0 lwk0Var = d92Var.c;
                List list = lwk0Var.b;
                lc00 lc00VarB = kotlin.collections.a.b();
                if (this.c) {
                    lc00VarB.add(SpecialEventTabs.MY_GAMES);
                }
                if (z2) {
                    lc00VarB.add(SpecialEventTabs.STATISTIC);
                }
                if (z) {
                    lc00VarB.add(SpecialEventTabs.TOURNAMENT);
                }
                return d92.a(d92Var, null, lwk0.a(lwk0Var, null, CollectionsKt.q0(list, kotlin.collections.a.a(lc00VarB)), lok0Var.j, lok0Var.k, lok0Var.l, lok0Var.m, 5), null, null, null, 0L, null, 2043);
        }
    }
}
