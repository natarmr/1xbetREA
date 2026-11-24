package a;

import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;
import org.xplatform.onexdatabase.OnexDatabase;
import org.xplatform.uikit.components.category_card_collection.DsCategoryCardCollection;
import org.xplatform.uikit.components.counter.DsCounter;
import org.xplatform.uikit.components.lottie_empty.DsLottieEmpty;
import org.xplatform.uikit.components.navigation_bar.DsNavigationBar;
import org.xplatform.uikit.components.tag.DsTag;
import org.xplatform.uikit_sport.sport_coupon_card.common.DsSportCouponCard;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class ntl implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f24106a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ntl(Object obj, byte b) {
        this.f24106a = b;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Object value;
        byte b = this.f24106a;
        Object obj = this.b;
        switch (b) {
            case 0:
                iiy[] iiyVarArr = stl.f2;
                return Integer.valueOf(((stl) obj).G().getDimensionPixelSize(R.dimen.size_20));
            case 1:
                return ((DsCategoryCardCollection) obj).o2;
            case 2:
                int i = DsCounter.i;
                return new k14((DsCounter) obj);
            case 3:
                h5m h5mVar = (h5m) obj;
                cgk0 cgk0Var = h5mVar.f12487a;
                return Float.valueOf(cgk0Var.l() > 0 ? l1e0.c(h5mVar.b.l() / cgk0Var.l(), 0.0f, 1.0f) : 0.0f);
            case 4:
                return Integer.valueOf(((d7m) ((e7m) obj)).b);
            case 5:
                DsLottieEmpty dsLottieEmpty = (DsLottieEmpty) obj;
                int i2 = DsLottieEmpty.t;
                return Integer.valueOf(Math.min(dsLottieEmpty.c, (int) (((double) dsLottieEmpty.getResources().getDisplayMetrics().widthPixels) / 2.1d)));
            case 6:
                ((DsNavigationBar) obj).d.b();
                return Unit.f46060a;
            case 7:
                return Integer.valueOf(g8x.Q(((knm) obj).c));
            case 8:
                return Float.valueOf(((wom) obj).c());
            case 9:
                ((rrm) obj).a(3);
                return Unit.f46060a;
            case 10:
                int i3 = DsSportCouponCard.k;
                return new od5((DsSportCouponCard) obj);
            case 11:
                int i4 = DsTag.l;
                return new k14((DsTag) obj);
            case 12:
                iiy[] iiyVarArr2 = whn.O1;
                fiu0 fiu0Var = ((whn) obj).L1;
                if (fiu0Var != null) {
                    return fiu0Var;
                }
                Intrinsics.h("easternNightsViewModelFactory");
                throw null;
            case 13:
                return (phn) ((gii0) ((wti) obj).b).b(sre0.f32672a.b(phn.class));
            case 14:
                return new iyn(((cyn) obj).f5186a, false);
            case 15:
                return Integer.valueOf(((l2o) obj).f19320a);
            case 16:
                bgi bgiVar = ((i5o) obj).L1;
                if (bgiVar != null) {
                    return new q0h0(bgiVar);
                }
                Intrinsics.h("viewModelFactory");
                throw null;
            case 17:
                return ((wco) obj).f38934a.n();
            case 18:
                return ((OnexDatabase) obj).m();
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                return Integer.valueOf(((qqo) obj).b.c ? 1 : 0);
            case 20:
                xak xakVar = ivo.P1;
                fiu0 fiu0Var2 = ((ivo) obj).M1;
                if (fiu0Var2 != null) {
                    return fiu0Var2;
                }
                Intrinsics.h("viewModelFactory");
                throw null;
            case 21:
                return (nvo) ((gii0) ((hsj) obj).f13586a).b(sre0.f32672a.b(nvo.class));
            case 22:
                return (xxo) ((gii0) ((fhj) obj).f9543a).b(sre0.f32672a.b(xxo.class));
            case 23:
                gzo gzoVar = (gzo) obj;
                p7m0 p7m0Var = gzoVar.i.f25029a;
                do {
                    value = p7m0Var.getValue();
                    value.getClass();
                    gzoVar.f.getClass();
                } while (!p7m0Var.m(value, syo.a((syo) value, false, false, null, null, null, null, null, null, null, null, 2045)));
                return Unit.f46060a;
            case 24:
                return (izo) ((gii0) ((zri) obj).b).b(sre0.f32672a.b(izo.class));
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                return ((org.xplatform.favorites.impl.presentation.category.a) obj).y.a();
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                ((k6p) obj).x();
                return Unit.f46060a;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                return (ucp) ((gii0) ((wti) obj).b).b(sre0.f32672a.b(ucp.class));
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                ddk ddkVar = pgp.P1;
                fiu0 fiu0Var3 = ((pgp) obj).K1;
                if (fiu0Var3 != null) {
                    return fiu0Var3;
                }
                Intrinsics.h("viewModelFactory");
                throw null;
            default:
                fiu0 fiu0Var4 = ((ehp) obj).K1;
                if (fiu0Var4 != null) {
                    return fiu0Var4;
                }
                Intrinsics.h("viewModelFactory");
                throw null;
        }
    }
}
