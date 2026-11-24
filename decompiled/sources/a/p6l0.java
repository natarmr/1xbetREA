package a;

import kotlin.jvm.functions.Function2;
import org.xplatform.uikit_sport.express_card.SportExpressCard;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class p6l0 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f26461a;
    public final /* synthetic */ SportExpressCard b;

    public /* synthetic */ p6l0(SportExpressCard sportExpressCard, byte b) {
        this.f26461a = b;
        this.b = sportExpressCard;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f26461a;
        SportExpressCard sportExpressCard = this.b;
        fet fetVar = (fet) obj;
        int iIntValue = ((Integer) obj2).intValue();
        switch (b) {
            case 0:
                return SportExpressCard.a(sportExpressCard, fetVar, iIntValue);
            default:
                return SportExpressCard.b(sportExpressCard, fetVar, iIntValue);
        }
    }
}
