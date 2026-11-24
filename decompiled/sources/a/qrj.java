package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.xplatform.cyber.section.api.domain.entity.CyberGamesPage;
import org.xplatform.cyber.section.api.domain.entity.CyberGamesParentSectionModel;
import org.xplatform.cyber.section.api.home.CyberHomeParams;
import org.xplatform.cyber.section.impl.navigation.CyberGamesScreenFactoryImpl$hltvAwardsScreen$1;
import org.xplatform.cyber.section.impl.navigation.CyberGamesScreenFactoryImpl$homeScreen$1;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class qrj implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f29212a;
    public final /* synthetic */ zrj b;

    public /* synthetic */ qrj(zrj zrjVar, byte b) {
        this.f29212a = b;
        this.b = zrjVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f29212a;
        byte b2 = 2;
        zrj zrjVar = this.b;
        switch (b) {
            case 0:
                i1w0 i1w0Var = (i1w0) obj;
                i1w0Var.getClass();
                i1w0Var.d(new qrj(zrjVar, b2));
                break;
            case 1:
                i1w0 i1w0Var2 = (i1w0) obj;
                i1w0Var2.getClass();
                i1w0Var2.d(new x2i(zrjVar, (byte) 20));
                break;
            case 2:
                k0w0 k0w0Var = (k0w0) obj;
                k0w0Var.getClass();
                c8d c8dVar = (c8d) k0w0Var.h(zx10.k(zrjVar.g, r040.OTHER, true, 2)).f14945a;
                bjk bjkVar = cfx0.o;
                c8dVar.f3908a = new v7d(true, bjkVar, bjkVar);
                break;
            case 3:
                i1w0 i1w0Var3 = (i1w0) obj;
                i1w0Var3.getClass();
                i1w0Var3.d(new qrj(zrjVar, (byte) 4));
                break;
            case 4:
                k0w0 k0w0Var2 = (k0w0) obj;
                k0w0Var2.getClass();
                k0w0Var2.i(new CyberGamesScreenFactoryImpl$homeScreen$1(zrjVar.k, new CyberHomeParams(CyberGamesPage.Real.INSTANCE, CyberGamesParentSectionModel.FromSection.INSTANCE)), new CyberGamesScreenFactoryImpl$hltvAwardsScreen$1(zrjVar.k));
                break;
            case 5:
                i1w0 i1w0Var4 = (i1w0) obj;
                i1w0Var4.getClass();
                i1w0Var4.d(new x2i(zrjVar, (byte) 21));
                break;
            default:
                i1w0 i1w0Var5 = (i1w0) obj;
                i1w0Var5.getClass();
                i1w0Var5.d(new x2i(zrjVar, (byte) 19));
                break;
        }
        return Unit.f46060a;
    }
}
