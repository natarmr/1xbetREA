package a;

import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class pzj extends bnn0 implements Function2 {
    public final /* synthetic */ rzj i;
    public final /* synthetic */ ArrayList j;
    public final /* synthetic */ int k;
    public final /* synthetic */ int l;
    public final /* synthetic */ int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pzj(rzj rzjVar, yje yjeVar, ArrayList arrayList, int i, int i2, int i3) {
        super(2, yjeVar);
        this.i = rzjVar;
        this.j = arrayList;
        this.k = i;
        this.l = i2;
        this.m = i3;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        return new pzj(this.i, yjeVar, this.j, this.k, this.l, this.m);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((pzj) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        wne wneVar = wne.f39444a;
        z1x.P(obj);
        return this.i.n().a(this.k, this.l, this.m, this.j);
    }
}
