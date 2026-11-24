package a;

import java.util.List;
import kotlin.Unit;

/* JADX INFO: loaded from: classes6.dex */
public final class vku implements gmq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ i89 f37593a;
    public final /* synthetic */ dgu b;
    public final /* synthetic */ String c;
    public final /* synthetic */ List d;
    public final /* synthetic */ List e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ boolean g;

    public vku(i89 i89Var, dgu dguVar, String str, List list, List list2, boolean z, boolean z2) {
        this.f37593a = i89Var;
        this.b = dguVar;
        this.c = str;
        this.d = list;
        this.e = list2;
        this.f = z;
        this.g = z2;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // a.gmq
    public final Object c(kmq kmqVar, yje yjeVar) {
        sku skuVar;
        if (yjeVar instanceof sku) {
            skuVar = (sku) yjeVar;
            int i = skuVar.j;
            if ((i & Integer.MIN_VALUE) != 0) {
                skuVar.j = i - Integer.MIN_VALUE;
            } else {
                skuVar = new sku(this, yjeVar);
            }
        } else {
            skuVar = new sku(this, yjeVar);
        }
        Object obj = skuVar.i;
        wne wneVar = wne.f39444a;
        int i2 = skuVar.j;
        if (i2 == 0) {
            z1x.P(obj);
            uku ukuVar = new uku(kmqVar, this.b, this.c, this.d, this.e, this.f, this.g);
            skuVar.j = 1;
            if (this.f37593a.c(ukuVar, skuVar) == wneVar) {
                return wneVar;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(obj);
        }
        return Unit.f46060a;
    }
}
