package a;

import android.widget.FrameLayout;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.xplatform.promo.impl.promocodes.presentation.shop.components.HorizontalPromoStoreCollectionItem;
import org.xplatform.promo.impl.promocodes.presentation.shop.components.VerticalPromoStoreCollectionItem;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class ulw implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f35893a;
    public final /* synthetic */ Function1 b;
    public final /* synthetic */ Function2 c;

    public /* synthetic */ ulw(Function1 function1, FrameLayout frameLayout, o0x o0xVar, Function2 function2, byte b) {
        this.f35893a = b;
        this.b = function1;
        this.c = function2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f35893a;
        Function2 function2 = this.c;
        Function1 function1 = this.b;
        switch (b) {
            case 0:
                int i = HorizontalPromoStoreCollectionItem.h;
                return Boolean.valueOf(((Boolean) function1.invoke((Throwable) obj)).booleanValue());
            case 1:
                cp cpVar = (cp) obj;
                cpVar.getClass();
                bzx bzxVar = (bzx) cpVar.u;
                dyb.O(bzxVar.b, new xb(function1, cpVar, (byte) 29));
                dyb.O(bzxVar.e, new o7x(function1, cpVar, (byte) 0));
                bzxVar.c.setOnItemClickListener(new tcc(function2, (byte) 1));
                cpVar.t(new b1w(cpVar, (byte) 9));
                return Unit.f46060a;
            case 2:
                int i2 = VerticalPromoStoreCollectionItem.h;
                return Boolean.valueOf(((Boolean) function1.invoke((Throwable) obj)).booleanValue());
            default:
                cp cpVar2 = (cp) obj;
                cpVar2.getClass();
                bzx bzxVar2 = (bzx) cpVar2.u;
                dyb.O(bzxVar2.b, new o7x(function1, cpVar2, (byte) 21));
                dyb.O(bzxVar2.e, new o7x(function1, cpVar2, (byte) 22));
                bzxVar2.c.setOnItemClickListener(new tcc(function2, (byte) 3));
                cpVar2.t(new a8u0(cpVar2, (byte) 10));
                return Unit.f46060a;
        }
    }

    public /* synthetic */ ulw(Function1 function1, Function2 function2, byte b) {
        this.f35893a = b;
        this.b = function1;
        this.c = function2;
    }
}
