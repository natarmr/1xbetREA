package a;

import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.xplatform.favorites.impl.presentation.adapters.models.FavoriteGroupHeaderUiItem;

/* JADX INFO: loaded from: classes4.dex */
public final class gh2 extends bnn0 implements Function1 {
    public hh2 i;
    public Iterator j;
    public byte k;
    public final /* synthetic */ hh2 l;
    public final /* synthetic */ List m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gh2(hh2 hh2Var, List list, yje yjeVar) {
        super(1, yjeVar);
        this.l = hh2Var;
        this.m = list;
    }

    @Override // a.zw5
    public final yje create(yje yjeVar) {
        return new gh2(this.l, this.m, yjeVar);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((gh2) create((yje) obj)).invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        Iterator it;
        hh2 hh2Var;
        wne wneVar = wne.f39444a;
        byte b = this.k;
        if (b == 0) {
            z1x.P(obj);
            hh2 hh2Var2 = this.l;
            hat hatVar = ((ug2) hh2Var2.D()).c;
            List list = this.m;
            if (list != null) {
                it = list.iterator();
                hh2Var = hh2Var2;
            }
            return Unit.f46060a;
        }
        if (b != 1 && b != 2 && b != 3 && b != 4) {
            jf4.n("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        it = this.j;
        hh2Var = this.i;
        z1x.P(obj);
        while (it.hasNext()) {
            FavoriteGroupHeaderUiItem favoriteGroupHeaderUiItem = (FavoriteGroupHeaderUiItem) it.next();
            if (favoriteGroupHeaderUiItem != null) {
                if (favoriteGroupHeaderUiItem instanceof FavoriteGroupHeaderUiItem.Live) {
                    this.i = hh2Var;
                    this.j = it;
                    this.k = (byte) 1;
                    int i = hh2.O;
                    if (hh2Var.O(this) == wneVar) {
                        return wneVar;
                    }
                } else if (favoriteGroupHeaderUiItem instanceof FavoriteGroupHeaderUiItem.Line) {
                    this.i = hh2Var;
                    this.j = it;
                    this.k = (byte) 2;
                    int i2 = hh2.O;
                    if (hh2Var.N(this) == wneVar) {
                        return wneVar;
                    }
                } else if (favoriteGroupHeaderUiItem instanceof FavoriteGroupHeaderUiItem.Results) {
                    this.i = hh2Var;
                    this.j = it;
                    this.k = (byte) 3;
                    int i3 = hh2.O;
                    if (hh2Var.P(this) == wneVar) {
                        return wneVar;
                    }
                } else if (favoriteGroupHeaderUiItem instanceof FavoriteGroupHeaderUiItem.All) {
                    this.i = hh2Var;
                    this.j = it;
                    this.k = (byte) 4;
                    int i4 = hh2.O;
                    if (hh2Var.M(this) == wneVar) {
                        return wneVar;
                    }
                } else {
                    continue;
                }
            }
        }
        return Unit.f46060a;
    }
}
