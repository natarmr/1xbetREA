package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.xplatform.promotions.loyalty.impl.navigation.PromotionsLoyaltyScreens$ChampionsClubFragmentScreen;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class wrj implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f39646a;
    public final /* synthetic */ zrj b;
    public final /* synthetic */ zuc0 c;

    public /* synthetic */ wrj(zrj zrjVar, zuc0 zuc0Var, byte b) {
        this.f39646a = b;
        this.b = zrjVar;
        this.c = zuc0Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f39646a;
        byte b2 = 1;
        zuc0 zuc0Var = this.c;
        zrj zrjVar = this.b;
        switch (b) {
            case 0:
                i1w0 i1w0Var = (i1w0) obj;
                i1w0Var.getClass();
                i1w0Var.d(new wrj(zrjVar, zuc0Var, b2));
                break;
            default:
                k0w0 k0w0Var = (k0w0) obj;
                k0w0Var.getClass();
                k0w0Var.i(jh70.i(zrjVar.n, zuc0Var), new PromotionsLoyaltyScreens$ChampionsClubFragmentScreen());
                break;
        }
        return Unit.f46060a;
    }
}
