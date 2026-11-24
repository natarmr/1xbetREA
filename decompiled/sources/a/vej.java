package a;

import java.util.Calendar;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.xplatform.uikit.compose.components.calendar.model.SimpleDateTime;

/* JADX INFO: loaded from: classes6.dex */
public final class vej extends bnn0 implements Function2 {
    public final /* synthetic */ SimpleDateTime i;
    public final /* synthetic */ Calendar j;
    public final /* synthetic */ SimpleDateTime k;
    public final /* synthetic */ SimpleDateTime l;
    public final /* synthetic */ SimpleDateTime m;
    public final /* synthetic */ yg40 n;
    public final /* synthetic */ ulq0 o;
    public final /* synthetic */ pz40 p;
    public final /* synthetic */ pz40 q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vej(SimpleDateTime simpleDateTime, Calendar calendar, SimpleDateTime simpleDateTime2, SimpleDateTime simpleDateTime3, SimpleDateTime simpleDateTime4, yg40 yg40Var, ulq0 ulq0Var, pz40 pz40Var, pz40 pz40Var2, yje yjeVar) {
        super(2, yjeVar);
        this.i = simpleDateTime;
        this.j = calendar;
        this.k = simpleDateTime2;
        this.l = simpleDateTime3;
        this.m = simpleDateTime4;
        this.n = yg40Var;
        this.o = ulq0Var;
        this.p = pz40Var;
        this.q = pz40Var2;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        return new vej(this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.p, this.q, yjeVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((vej) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        wne wneVar = wne.f39444a;
        z1x.P(obj);
        SimpleDateTime simpleDateTime = this.i;
        Calendar calendar = this.j;
        long jE0 = wdx.e0(simpleDateTime, calendar);
        SimpleDateTime simpleDateTime2 = this.k;
        if (jE0 > wdx.e0(simpleDateTime2, calendar)) {
            return Unit.f46060a;
        }
        ulq0 ulq0Var = ulq0.f35886a;
        ulq0 ulq0Var2 = this.o;
        Pair pairA0 = rsr0.a0(this.l, this.m, simpleDateTime, simpleDateTime2, this.j, ulq0Var2 == ulq0Var ? this.n : null);
        SimpleDateTime simpleDateTimeJ0 = (SimpleDateTime) pairA0.f46059a;
        SimpleDateTime simpleDateTimeJ1 = (SimpleDateTime) pairA0.b;
        int iOrdinal = ulq0Var2.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal != 1) {
                t9f.b();
                return null;
            }
            simpleDateTimeJ0 = rsr0.j0(simpleDateTimeJ0, 0, 0);
        }
        int iOrdinal2 = ulq0Var2.ordinal();
        if (iOrdinal2 != 0) {
            if (iOrdinal2 != 1) {
                t9f.b();
                return null;
            }
            simpleDateTimeJ1 = rsr0.j0(simpleDateTimeJ1, 0, 0);
        }
        if (!Intrinsics.d(simpleDateTimeJ0, this.l)) {
            ((Function1) this.p.getValue()).invoke(simpleDateTimeJ0);
        }
        if (!Intrinsics.d(simpleDateTimeJ1, this.m)) {
            ((Function1) this.q.getValue()).invoke(simpleDateTimeJ1);
        }
        return Unit.f46060a;
    }
}
