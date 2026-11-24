package a;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class z2g extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public final /* synthetic */ pz40 j;
    public final /* synthetic */ pz40 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z2g(pz40 pz40Var, pz40 pz40Var2, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.j = pz40Var;
        this.k = pz40Var2;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        pz40 pz40Var = this.k;
        pz40 pz40Var2 = this.j;
        switch (b) {
            case 0:
                return new z2g(pz40Var2, pz40Var, yjeVar, (byte) 0);
            default:
                return new z2g(pz40Var2, pz40Var, yjeVar, (byte) 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        vne vneVar = (vne) obj;
        yje yjeVar = (yje) obj2;
        switch (this.i) {
            case 0:
                break;
        }
        return ((z2g) create(vneVar, yjeVar)).invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        byte b = this.i;
        pz40 pz40Var = this.j;
        pz40 pz40Var2 = this.k;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                v0h0 v0h0Var = e3g.f7133a;
                if (((Boolean) pz40Var2.getValue()).booleanValue()) {
                    pz40Var.setValue(Boolean.TRUE);
                }
                break;
            default:
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                ArrayList arrayListQ0 = CollectionsKt.q0(CollectionsKt.q0(((kml) pz40Var.getValue()).f18545a, ((kml) pz40Var.getValue()).b), ((kml) pz40Var.getValue()).c);
                ArrayList arrayList = new ArrayList(r3d.q(arrayListQ0, 10));
                Iterator it = arrayListQ0.iterator();
                while (it.hasNext()) {
                    arrayList.add(String.valueOf(((ezh) it.next()).f8671a));
                }
                if (!arrayList.equals((List) pz40Var2.getValue())) {
                    pz40Var2.setValue(arrayList);
                }
                break;
        }
        return Unit.f46060a;
    }
}
