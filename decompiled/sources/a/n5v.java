package a;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final class n5v extends bnn0 implements Function2 {
    public boolean i;
    public final /* synthetic */ List j;
    public final /* synthetic */ dgu k;
    public final /* synthetic */ boolean l;
    public final /* synthetic */ int m;
    public final /* synthetic */ long n;
    public final /* synthetic */ String o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n5v(List list, dgu dguVar, boolean z, int i, long j, String str, yje yjeVar) {
        super(2, yjeVar);
        this.j = list;
        this.k = dguVar;
        this.l = z;
        this.m = i;
        this.n = j;
        this.o = str;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        return new n5v(this.j, this.k, this.l, this.m, this.n, this.o, yjeVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((n5v) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        wne wneVar = wne.f39444a;
        boolean z = this.i;
        if (!z) {
            z1x.P(obj);
            List list = this.j;
            if (list.isEmpty()) {
                return iun.f15405a;
            }
            wdu wduVar = (wdu) this.k.c;
            this.i = true;
            obj = wduVar.j(list, this.l, this.m, this.n, j8p.d, false, this.o, this);
            if (obj == wneVar) {
                return wneVar;
            }
        } else {
            if (!z) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(obj);
        }
        return (List) obj;
    }
}
