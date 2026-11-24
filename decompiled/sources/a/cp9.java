package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import org.xplatform.uikit_sport.sport_coupon_card.common.DsSportCouponCard;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class cp9 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f4734a = 1;
    public final /* synthetic */ cp b;
    public final /* synthetic */ Function1 c;

    public /* synthetic */ cp9(cp cpVar, Function1 function1) {
        this.b = cpVar;
        this.c = function1;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f4734a;
        Function1 function1 = this.c;
        cp cpVar = this.b;
        switch (b) {
            case 0:
                function1.invoke(cpVar.u());
                break;
            default:
                xb xbVar = new xb(function1, cpVar, (byte) 20);
                DsSportCouponCard dsSportCouponCard = ((scu0) cpVar.u).b;
                if (!((vte) cpVar.u()).t) {
                    xbVar = null;
                }
                dsSportCouponCard.setMoveButtonClickListener(xbVar);
                break;
        }
        return Unit.f46060a;
    }

    public /* synthetic */ cp9(Function1 function1, cp cpVar) {
        this.c = function1;
        this.b = cpVar;
    }
}
