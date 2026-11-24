package a;

import java.io.Serializable;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final class nru extends bnn0 implements Function2 {
    public boolean i;
    public final /* synthetic */ boolean j;
    public final /* synthetic */ edu k;
    public final /* synthetic */ long l;
    public final /* synthetic */ long m;
    public final /* synthetic */ long n;
    public final /* synthetic */ long o;
    public final /* synthetic */ int p;
    public final /* synthetic */ long q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nru(boolean z, edu eduVar, long j, long j2, long j3, long j4, int i, long j5, yje yjeVar) {
        super(2, yjeVar);
        this.j = z;
        this.k = eduVar;
        this.l = j;
        this.m = j2;
        this.n = j3;
        this.o = j4;
        this.p = i;
        this.q = j5;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        return new nru(this.j, this.k, this.l, this.m, this.n, this.o, this.p, this.q, yjeVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((nru) create(Long.valueOf(((Number) obj).longValue()), (yje) obj2)).invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
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
        boolean z2 = this.j;
        edu eduVar = this.k;
        boolean zD = z2 ? ((gst0) eduVar.b).d(true) : false;
        gxu gxuVar = (gxu) eduVar.c;
        this.i = true;
        Serializable serializableE = gxuVar.e(this.l, this.m, this.n, this.o, this.p, zD, this.q, this);
        return serializableE == wneVar ? wneVar : serializableE;
    }
}
