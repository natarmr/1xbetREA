package a;

import java.io.Serializable;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final class h1v extends bnn0 implements Function2 {
    public final /* synthetic */ byte i = 1;
    public boolean j;
    public final /* synthetic */ long k;
    public final /* synthetic */ int l;
    public final /* synthetic */ Object m;
    public final /* synthetic */ Object n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h1v(wdu wduVar, int i, jvn jvnVar, long j, yje yjeVar) {
        super(2, yjeVar);
        this.m = wduVar;
        this.l = i;
        this.n = jvnVar;
        this.k = j;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        Object obj2 = this.n;
        Object obj3 = this.m;
        switch (b) {
            case 0:
                long j = this.k;
                return new h1v((wdu) obj3, this.l, (jvn) obj2, j, yjeVar);
            default:
                return new h1v((cyu) obj3, this.k, this.l, (lu0) obj2, yjeVar);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((h1v) create(Long.valueOf(((Number) obj).longValue()), (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((h1v) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        byte b = this.i;
        Object obj2 = this.n;
        Object obj3 = this.m;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                boolean z = this.j;
                if (z) {
                    if (z) {
                        z1x.P(obj);
                        return obj;
                    }
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                z1x.P(obj);
                kvt kvtVar = (kvt) ((wdu) obj3).b;
                y9s y9sVar = y9s.f42264a;
                this.j = true;
                Serializable serializableM = kvtVar.f18970a.M(this.l, (jvn) obj2, y9sVar, this.k, this);
                return serializableM == wneVar ? wneVar : serializableM;
            default:
                wne wneVar2 = wne.f39444a;
                boolean z2 = this.j;
                if (!z2) {
                    z1x.P(obj);
                    this.j = true;
                    if (((dn0) ((cyu) obj3).b).q(this.k, this.l, (lu0) obj2, this) == wneVar2) {
                        return wneVar2;
                    }
                } else {
                    if (!z2) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h1v(cyu cyuVar, long j, int i, lu0 lu0Var, yje yjeVar) {
        super(2, yjeVar);
        this.m = cyuVar;
        this.k = j;
        this.l = i;
        this.n = lu0Var;
    }
}
