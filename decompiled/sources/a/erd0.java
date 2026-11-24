package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.xbet.client1.R;
import org.xplatform.statistic.grand_prix.presentation.screens.GrandPrixStatisticScreen;
import org.xplatform.statistic.stadium.impl.stadium.screen.StadiumScreen;
import org.xplatform.statistic.stat_results.impl.results.races.presentation.RaceResultScreen;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class erd0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f8275a;
    public final /* synthetic */ lrd0 b;

    public /* synthetic */ erd0(lrd0 lrd0Var, byte b) {
        this.f8275a = b;
        this.b = lrd0Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Object value;
        byte b = this.f8275a;
        lrd0 lrd0Var = this.b;
        switch (b) {
            case 0:
                k0w0 k0w0Var = (k0w0) obj;
                k0w0Var.getClass();
                cge0 cge0Var = lrd0Var.w;
                String str = ((yqd0) lrd0Var.D()).d;
                long j = lrd0Var.p;
                cge0Var.getClass();
                k0w0Var.h(new StadiumScreen(str, j, R.string.statictic_track));
                break;
            case 1:
                k0w0 k0w0Var2 = (k0w0) obj;
                k0w0Var2.getClass();
                s9m0 s9m0Var = lrd0Var.x;
                String str2 = lrd0Var.o;
                s9m0Var.getClass();
                str2.getClass();
                k0w0Var2.h(new RaceResultScreen(str2));
                break;
            case 2:
                k0w0 k0w0Var3 = (k0w0) obj;
                k0w0Var3.getClass();
                tqt tqtVar = lrd0Var.y;
                String str3 = lrd0Var.o;
                long j2 = lrd0Var.p;
                tqtVar.getClass();
                str3.getClass();
                k0w0Var3.h(new GrandPrixStatisticScreen(str3, j2));
                break;
            default:
                ((Throwable) obj).getClass();
                p7m0 p7m0Var = lrd0Var.i.f25029a;
                do {
                    value = p7m0Var.getValue();
                    value.getClass();
                    lrd0Var.f.getClass();
                } while (!p7m0Var.m(value, yqd0.a((yqd0) value, false, true, false, null, null, null, null, null, null, null, false, 2044)));
                break;
        }
        return Unit.f46060a;
    }
}
