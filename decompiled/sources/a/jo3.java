package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.xplatform.widget.impl.presentation.favorites.AppWidgetFavoritesDefaultProvider;
import org.xplatform.widget.impl.presentation.favorites.AppWidgetFavoritesLargeProvider;
import org.xplatform.widget.impl.presentation.favorites.AppWidgetFavoritesSmallProvider;

/* JADX INFO: loaded from: classes7.dex */
public final class jo3 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public final /* synthetic */ boolean j;
    public final /* synthetic */ long k;
    public final /* synthetic */ long l;
    public final /* synthetic */ long m;
    public final /* synthetic */ boolean n;
    public final /* synthetic */ dz5 o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ jo3(dz5 dz5Var, boolean z, long j, long j2, long j3, boolean z2, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.o = dz5Var;
        this.j = z;
        this.k = j;
        this.l = j2;
        this.m = j3;
        this.n = z2;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        dz5 dz5Var = this.o;
        switch (b) {
            case 0:
                return new jo3((AppWidgetFavoritesDefaultProvider) dz5Var, this.j, this.k, this.l, this.m, this.n, yjeVar, (byte) 0);
            case 1:
                return new jo3((AppWidgetFavoritesLargeProvider) dz5Var, this.j, this.k, this.l, this.m, this.n, yjeVar, (byte) 1);
            default:
                return new jo3((AppWidgetFavoritesSmallProvider) dz5Var, this.j, this.k, this.l, this.m, this.n, yjeVar, (byte) 2);
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
        return ((jo3) create(vneVar, yjeVar)).invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        byte b = this.i;
        dz5 dz5Var = this.o;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                afm0 afm0Var = ((AppWidgetFavoritesDefaultProvider) dz5Var).c;
                if (afm0Var == null) {
                    Intrinsics.h("widgetFavoritesAnalyticsUseCase");
                    throw null;
                }
                afm0Var.o(this.k, this.l, this.m, this.j, this.n);
                return Unit.f46060a;
            case 1:
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                afm0 afm0Var2 = ((AppWidgetFavoritesLargeProvider) dz5Var).c;
                if (afm0Var2 == null) {
                    Intrinsics.h("widgetFavoritesAnalyticsUseCase");
                    throw null;
                }
                afm0Var2.o(this.k, this.l, this.m, this.j, this.n);
                return Unit.f46060a;
            default:
                wne wneVar3 = wne.f39444a;
                z1x.P(obj);
                afm0 afm0Var3 = ((AppWidgetFavoritesSmallProvider) dz5Var).c;
                if (afm0Var3 == null) {
                    Intrinsics.h("widgetFavoritesAnalyticsUseCase");
                    throw null;
                }
                afm0Var3.o(this.k, this.l, this.m, this.j, this.n);
                return Unit.f46060a;
        }
    }
}
