package a;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final class vml extends bnn0 implements Function2 {
    public /* synthetic */ Object i;
    public final /* synthetic */ List j;
    public final /* synthetic */ lml k;
    public final /* synthetic */ float l;
    public final /* synthetic */ float m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vml(List list, lml lmlVar, float f, float f2, yje yjeVar) {
        super(2, yjeVar);
        this.j = list;
        this.k = lmlVar;
        this.l = f;
        this.m = f2;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        vml vmlVar = new vml(this.j, this.k, this.l, this.m, yjeVar);
        vmlVar.i = obj;
        return vmlVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((vml) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        vne vneVar = (vne) this.i;
        wne wneVar = wne.f39444a;
        z1x.P(obj);
        int i = 0;
        for (Object obj2 : this.j) {
            int i2 = i + 1;
            if (i < 0) {
                q3d.p();
                throw null;
            }
            qjj.W(vneVar, null, null, new uml(this.k, i, this.l, (pzh) obj2, this.m, null), 3);
            i = i2;
        }
        return Unit.f46060a;
    }
}
