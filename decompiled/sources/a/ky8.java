package a;

import android.javax.sip.message.Response;
import com.github.terrakok.cicerone.androidx.FragmentScreen;
import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.xplatform.aggregator.impl.core.navigation.AggregatorScreenModel;
import org.xplatform.aggregator.impl.core.navigation.AggregatorScreens$BrandGamesFiltersScreen;
import org.xplatform.core.navigation.dialog.DialogScreen;

/* JADX INFO: loaded from: classes3.dex */
public final class ky8 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public final /* synthetic */ ty8 j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ky8(ty8 ty8Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.j = ty8Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        ty8 ty8Var = this.j;
        switch (b) {
            case 0:
                return new ky8(ty8Var, yjeVar, (byte) 0);
            case 1:
                return new ky8(ty8Var, yjeVar, (byte) 1);
            default:
                return new ky8(ty8Var, yjeVar, (byte) 2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        vne vneVar = (vne) obj;
        yje yjeVar = (yje) obj2;
        switch (this.i) {
            case 0:
                break;
            case 1:
                break;
        }
        return ((ky8) create(vneVar, yjeVar)).invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        Object value;
        byte b = this.i;
        ty8 ty8Var = this.j;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                if (((yx8) ty8Var.D()).c.b) {
                    p7m0 p7m0Var = ty8Var.i.f25029a;
                    do {
                        value = p7m0Var.getValue();
                        value.getClass();
                    } while (!p7m0Var.m(value, yx8.c((yx8) value, false)));
                    sac.V(jiu0.a(ty8Var), oy8.f26049a, null, ty8Var.v.f22085a, new xw5(ty8Var, "", null, (byte) 29), 10);
                } else {
                    ty8Var.w.f35083a.c("provbrand_prov_back");
                    ty8Var.z.f1455a.a(xun.f41520a, 10958L);
                    ty8Var.G(kx8.f19040a);
                }
                break;
            case 1:
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                i1w0 i1w0VarC = ty8Var.r.c();
                CopyOnWriteArrayList copyOnWriteArrayListQ = b1j.q(i1w0VarC);
                FragmentScreen aggregatorScreens$BrandGamesFiltersScreen = new AggregatorScreens$BrandGamesFiltersScreen();
                if (aggregatorScreens$BrandGamesFiltersScreen instanceof DialogScreen) {
                    copyOnWriteArrayListQ.add(new c8d(y7d.f42146a, new e1w0((DialogScreen) aggregatorScreens$BrandGamesFiltersScreen)));
                } else {
                    copyOnWriteArrayListQ.add(new c8d(y7d.f42146a, new w0w0(aggregatorScreens$BrandGamesFiltersScreen)));
                }
                ListIterator listIteratorO = b1j.o(i1w0VarC, copyOnWriteArrayListQ, 0);
                while (true) {
                    paw pawVar = (paw) listIteratorO;
                    if (pawVar.hasNext()) {
                        i1w0VarC.a((oe50) pawVar.next());
                    }
                    break;
                }
                break;
            default:
                wne wneVar3 = wne.f39444a;
                z1x.P(obj);
                uc0 uc0Var = ty8Var.p;
                u58 u58Var = ty8Var.w;
                long j = ((yx8) ty8Var.D()).l;
                au0 au0Var = ty8Var.z;
                if (j == 126) {
                    au0Var.f1455a.a(xun.f41520a, 11319L);
                    u58Var.f35083a.c("brand_live_info");
                } else {
                    au0Var.f1455a.a(xun.f41520a, 10959L);
                    u58Var.f35083a.c("provbrand_prov_info");
                }
                if (uc0Var.i) {
                    ty8Var.r.c().d(new gy8(ty8Var, (byte) 2));
                } else {
                    ty8Var.u.c(new AggregatorScreenModel(null, null, 0L, new yl1(((yx8) ty8Var.D()).c.f41644a, uc0Var.h), null, 0L, 0L, null, false, Response.SERVICE_UNAVAILABLE));
                }
                break;
        }
        return Unit.f46060a;
    }
}
