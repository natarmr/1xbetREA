package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.xplatform.cyber.cyberstatistic.api.navigation.CyberGameStatisticScreenParams;
import org.xplatform.cyber.cyberstatistic.impl.navigation.CyberGameStatisticScreenFactoryImpl$getCyberGameStatisticScreen$1;
import org.xplatform.cyber.game.core.presentation.action.CyberActionDialogParams;
import org.xplatform.cyber.statistics_blocks.api.StatisticBlocksParams;
import org.xplatform.cyber.statistics_blocks.impl.navigation.CyberStatisticsBlocksScreensFactoryImpl$getStatisticBlocksScreen$1;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class r0g implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f29627a;
    public final /* synthetic */ g1g b;

    public /* synthetic */ r0g(g1g g1gVar, byte b) {
        this.f29627a = b;
        this.b = g1gVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        m7h0 cyberGameStatisticScreenFactoryImpl$getCyberGameStatisticScreen$1;
        byte b = this.f29627a;
        g1g g1gVar = this.b;
        switch (b) {
            case 0:
                k0w0 k0w0Var = (k0w0) obj;
                k0w0Var.getClass();
                CyberActionDialogParams cyberActionDialogParams = g1gVar.b;
                long j = cyberActionDialogParams.g;
                if (j == 189) {
                    cyberGameStatisticScreenFactoryImpl$getCyberGameStatisticScreen$1 = g1gVar.y.e(cyberActionDialogParams.f46507a, j, cyberActionDialogParams.m);
                } else {
                    gr00 gr00Var = g1gVar.t;
                    CyberGameStatisticScreenParams cyberGameStatisticScreenParams = new CyberGameStatisticScreenParams(cyberActionDialogParams.m, 0, cyberActionDialogParams.n, cyberActionDialogParams.h);
                    gr00Var.getClass();
                    cyberGameStatisticScreenFactoryImpl$getCyberGameStatisticScreen$1 = new CyberGameStatisticScreenFactoryImpl$getCyberGameStatisticScreen$1(cyberGameStatisticScreenParams, gr00Var);
                }
                k0w0Var.h(cyberGameStatisticScreenFactoryImpl$getCyberGameStatisticScreen$1);
                break;
            case 1:
                k0w0 k0w0Var2 = (k0w0) obj;
                k0w0Var2.getClass();
                c8d c8dVar = (c8d) k0w0Var2.b(new a1w0(new jwd(g1gVar, (byte) 25))).f14945a;
                bjk bjkVar = cfx0.o;
                c8dVar.f3908a = new v7d(true, bjkVar, bjkVar);
                break;
            case 2:
                Throwable th = (Throwable) obj;
                th.getClass();
                g1gVar.e.b(th, new jyf((byte) 1));
                break;
            case 3:
                k0w0 k0w0Var3 = (k0w0) obj;
                k0w0Var3.getClass();
                qgh qghVar = g1gVar.u;
                bek bekVar = sip.f32274a;
                CyberActionDialogParams cyberActionDialogParams2 = g1gVar.b;
                boolean z = cyberActionDialogParams2.c;
                bekVar.getClass();
                StatisticBlocksParams statisticBlocksParams = new StatisticBlocksParams(bek.f(z), dam0.f5756a, 40L, cyberActionDialogParams2.h, cyberActionDialogParams2.i, cyberActionDialogParams2.j, cyberActionDialogParams2.k);
                qghVar.getClass();
                k0w0Var3.h(new CyberStatisticsBlocksScreensFactoryImpl$getStatisticBlocksScreen$1(statisticBlocksParams));
                break;
            case 4:
                Throwable th2 = (Throwable) obj;
                th2.getClass();
                g1gVar.r.f(th2, new r0g(g1gVar, (byte) 5));
                break;
            default:
                g1gVar.z.f(new u9o(((Integer) obj).intValue()));
                break;
        }
        return Unit.f46060a;
    }
}
