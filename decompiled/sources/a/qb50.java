package a;

import java.util.Iterator;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class qb50 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f28432a;
    public final /* synthetic */ Set b;

    public /* synthetic */ qb50(Set set, byte b) {
        this.f28432a = b;
        this.b = set;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f28432a;
        Set set = this.b;
        qzg0 qzg0Var = (qzg0) obj;
        switch (b) {
            case 0:
                qzg0Var.getClass();
                set.getClass();
                qaj qajVar = new qaj();
                nw20 nw20Var = new nw20(sre0.f32672a.b(rb50.class));
                Iterator it = set.iterator();
                while (it.hasNext()) {
                    ((hb50) it.next()).a(nw20Var);
                }
                nw20Var.a(qajVar);
                qzg0Var.f29576a = qajVar.b();
                break;
            default:
                qzg0Var.getClass();
                qaj qajVar2 = new qaj();
                tre0 tre0Var = sre0.f32672a;
                nw20 nw20Var2 = new nw20(tre0Var.b(rb50.class));
                nw20Var2.s(tre0Var.b(kwv0.class), kwv0.INSTANCE.serializer());
                Iterator it2 = set.iterator();
                while (it2.hasNext()) {
                    ((hb50) it2.next()).a(nw20Var2);
                }
                nw20Var2.a(qajVar2);
                qzg0Var.f29576a = qajVar2.b();
                break;
        }
        return Unit.f46060a;
    }
}
