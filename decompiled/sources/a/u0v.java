package a;

import java.io.Serializable;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final class u0v extends bnn0 implements Function2 {
    public boolean i;
    public final /* synthetic */ daf j;
    public final /* synthetic */ boolean k;
    public final /* synthetic */ List l;
    public final /* synthetic */ boolean m;
    public final /* synthetic */ long n;
    public final /* synthetic */ jvn o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u0v(daf dafVar, boolean z, List list, boolean z2, long j, jvn jvnVar, yje yjeVar) {
        super(2, yjeVar);
        this.j = dafVar;
        this.k = z;
        this.l = list;
        this.m = z2;
        this.n = j;
        this.o = jvnVar;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        return new u0v(this.j, this.k, this.l, this.m, this.n, this.o, yjeVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((u0v) create(Long.valueOf(((Number) obj).longValue()), (yje) obj2)).invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        Serializable serializableN;
        wne wneVar = wne.f39444a;
        boolean z = this.i;
        if (z) {
            if (z) {
                z1x.P(obj);
                return obj;
            }
            jf4.n("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        z1x.P(obj);
        this.i = true;
        daf dafVar = this.j;
        boolean z2 = this.k;
        List list = this.l;
        boolean z3 = this.m;
        long j = this.n;
        jvn jvnVar = this.o;
        if (z2) {
            serializableN = ((h0q0) ((yfu) dafVar.d).f42558a).o(1, list, z3, j, jvnVar, this);
        } else {
            serializableN = ((h0q0) ((n4u) dafVar.e).b).n(1, list, z3, j, jvnVar, ynq0.f(((viu) dafVar.b).a()), this);
        }
        return serializableN == wneVar ? wneVar : serializableN;
    }
}
