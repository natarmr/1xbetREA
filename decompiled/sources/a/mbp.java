package a;

import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.xplatform.favorites.impl.presentation.adapters.models.FavoriteGroupHeaderUiItem;

/* JADX INFO: loaded from: classes4.dex */
public final class mbp extends bnn0 implements Function2 {
    public final /* synthetic */ ccp i;
    public final /* synthetic */ List j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mbp(ccp ccpVar, List list, yje yjeVar) {
        super(2, yjeVar);
        this.i = ccpVar;
        this.j = list;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        return new mbp(this.i, this.j, yjeVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((mbp) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        Object value;
        boolean z;
        boolean z2;
        yje yjeVar;
        wne wneVar = wne.f39444a;
        z1x.P(obj);
        ccp ccpVar = this.i;
        mne mneVar = ccpVar.H;
        int i = ccp.u0;
        p7m0 p7m0Var = ccpVar.i.f25029a;
        do {
            value = p7m0Var.getValue();
            value.getClass();
        } while (!p7m0Var.m(value, dd80.a((dd80) value, true, false, false, false, false, false, null, null, false, 8189)));
        List<FavoriteGroupHeaderUiItem> list = this.j;
        byte b = 0;
        byte b2 = 1;
        if (list.isEmpty()) {
            z = false;
            break;
        }
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                z = false;
                break;
            }
            if (((FavoriteGroupHeaderUiItem) it.next()) instanceof FavoriteGroupHeaderUiItem.Champs) {
                z = true;
                break;
            }
        }
        if (list.isEmpty()) {
            z2 = false;
            break;
        }
        Iterator it2 = list.iterator();
        while (true) {
            if (!it2.hasNext()) {
                z2 = false;
                break;
            }
            if (((FavoriteGroupHeaderUiItem) it2.next()) instanceof FavoriteGroupHeaderUiItem.Teams) {
                z2 = true;
                break;
            }
        }
        yje yjeVar2 = null;
        if (z || z2) {
            boolean z3 = z;
            yjeVar = null;
            sac.V(jiu0.a(ccpVar), new k4p(1, ccpVar, ccp.class, "handleFavoriteClickError", "handleFavoriteClickError(Ljava/lang/Throwable;)V", 0, (byte) 11), null, mneVar.b, new wz0(z2, ccpVar, z3, yjeVar2, (byte) 2), 10);
        } else {
            yjeVar = null;
        }
        for (FavoriteGroupHeaderUiItem favoriteGroupHeaderUiItem : list) {
            if (favoriteGroupHeaderUiItem != null) {
                if (favoriteGroupHeaderUiItem instanceof FavoriteGroupHeaderUiItem.Aggregator) {
                    sac.V(jiu0.a(ccpVar), new k4p(1, ccpVar, ccp.class, "handleFavoriteClickError", "handleFavoriteClickError(Ljava/lang/Throwable;)V", 0, (byte) 8), new ibp(ccpVar, (byte) 2), mneVar.f22085a, new lbp(ccpVar, yjeVar, b), 8);
                } else if (favoriteGroupHeaderUiItem instanceof FavoriteGroupHeaderUiItem.XGames) {
                    sac.V(jiu0.a(ccpVar), new k4p(1, ccpVar, ccp.class, "handleFavoriteClickError", "handleFavoriteClickError(Ljava/lang/Throwable;)V", 0, (byte) 10), new ibp(ccpVar, (byte) 1), mneVar.f22085a, new lbp(ccpVar, yjeVar, b2), 8);
                }
            }
        }
        return Unit.f46060a;
    }
}
