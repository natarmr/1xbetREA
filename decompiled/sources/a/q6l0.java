package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.xplatform.uikit_sport.express_card.SportExpressCard;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class q6l0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f28204a;
    public final /* synthetic */ SportExpressCard b;

    public /* synthetic */ q6l0(SportExpressCard sportExpressCard, byte b) {
        this.f28204a = b;
        this.b = sportExpressCard;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f28204a;
        SportExpressCard sportExpressCard = this.b;
        wgl0 wgl0Var = (wgl0) obj;
        switch (b) {
            case 0:
                int i = SportExpressCard.r;
                wgl0Var.getClass();
                sportExpressCard.q.invoke();
                break;
            default:
                int i2 = SportExpressCard.r;
                wgl0Var.getClass();
                sportExpressCard.q.invoke();
                break;
        }
        return Unit.f46060a;
    }
}
