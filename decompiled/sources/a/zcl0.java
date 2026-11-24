package a;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.xplatform.special_event.impl.filter.navigation.SportGameFilterSelectionScreenParams;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class zcl0 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f44173a;
    public final /* synthetic */ ddl0 b;

    public /* synthetic */ zcl0(ddl0 ddl0Var, byte b) {
        this.f44173a = b;
        this.b = ddl0Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Object value;
        odl0 odl0Var;
        iun iunVar;
        ArrayList arrayList;
        Object value2;
        byte b = this.f44173a;
        ddl0 ddl0Var = this.b;
        switch (b) {
            case 0:
                cge0 cge0Var = ddl0.V1;
                s96 s96Var = ddl0Var.G0().e.b;
                if (s96Var != null) {
                    s96Var.e();
                }
                p7m0 p7m0Var = ddl0Var.J0().n;
                do {
                    value = p7m0Var.getValue();
                    odl0Var = (odl0) value;
                    iunVar = iun.f15405a;
                    List list = odl0Var.i;
                    arrayList = new ArrayList(r3d.q(list, 10));
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        arrayList.add(Long.valueOf(((cok0) it.next()).f4705a));
                    }
                } while (!p7m0Var.m(value, odl0.a(odl0Var, false, false, true, true, false, false, "", null, iunVar, CollectionsKt.P0(arrayList), null, null, 14627)));
                return Unit.f46060a;
            case 1:
                cge0 cge0Var2 = ddl0.V1;
                ndl0 ndl0VarJ0 = ddl0Var.J0();
                rcl0 rcl0Var = new rcl0(ek5.h);
                rcl0Var.d.b(new gbn(new gcl0((byte) 2), new asj0(3, (byte) 7), new j1l0(ndl0VarJ0, (byte) 4), wjj0.n));
                return rcl0Var;
            case 2:
                cge0 cge0Var3 = ddl0.V1;
                ddl0Var.J0().w();
                return Unit.f46060a;
            case 3:
                cge0 cge0Var4 = ddl0.V1;
                ddl0Var.J0().z();
                return Unit.f46060a;
            case 4:
                cge0 cge0Var5 = ddl0.V1;
                ddl0Var.J0().B(false);
                return Unit.f46060a;
            case 5:
                cge0 cge0Var6 = ddl0.V1;
                ddl0Var.J0().B(true);
                return Unit.f46060a;
            case 6:
                cge0 cge0Var7 = ddl0.V1;
                ndl0 ndl0VarJ1 = ddl0Var.J0();
                z220 z220Var = ndl0VarJ1.j;
                iun iunVar2 = iun.f15405a;
                j1i0 j1i0Var = j1i0.RESET;
                SportGameFilterSelectionScreenParams sportGameFilterSelectionScreenParams = ndl0VarJ1.b;
                z220Var.F(iunVar2, j1i0Var, sportGameFilterSelectionScreenParams.c, Integer.valueOf(sportGameFilterSelectionScreenParams.f46965a));
                ndl0VarJ1.A(wcl0.f38930a);
                return Unit.f46060a;
            case 7:
                cge0 cge0Var8 = ddl0.V1;
                ndl0 ndl0VarJ2 = ddl0Var.J0();
                Set set = ((odl0) ndl0VarJ2.n.getValue()).k;
                ArrayList arrayList2 = new ArrayList(r3d.q(set, 10));
                Iterator it2 = set.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(Integer.valueOf((int) ((Number) it2.next()).longValue()));
                }
                z220 z220Var2 = ndl0VarJ2.j;
                j1i0 j1i0Var2 = j1i0.APPLY;
                SportGameFilterSelectionScreenParams sportGameFilterSelectionScreenParams2 = ndl0VarJ2.b;
                z220Var2.F(arrayList2, j1i0Var2, sportGameFilterSelectionScreenParams2.c, Integer.valueOf(sportGameFilterSelectionScreenParams2.f46965a));
                ddl0Var.J0().w();
                return Unit.f46060a;
            case 8:
                cge0 cge0Var9 = ddl0.V1;
                s96 s96Var2 = ddl0Var.G0().e.b;
                if (s96Var2 != null) {
                    s96Var2.e();
                }
                p7m0 p7m0Var2 = ddl0Var.J0().n;
                do {
                    value2 = p7m0Var2.getValue();
                } while (!p7m0Var2.m(value2, odl0.a((odl0) value2, false, true, false, false, false, false, "", null, iun.f15405a, xun.f41520a, null, null, 14627)));
                return Unit.f46060a;
            case 9:
                qui quiVar = ddl0Var.M1;
                if (quiVar != null) {
                    return new q0h0(quiVar);
                }
                Intrinsics.h("viewModelFactory");
                throw null;
            default:
                cge0 cge0Var10 = ddl0.V1;
                return new jt6(ddl0Var, (byte) 17);
        }
    }
}
