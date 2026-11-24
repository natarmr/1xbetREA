package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.xplatform.ui_core.game_broadcating.models.GameBroadcastType;

/* JADX INFO: loaded from: classes3.dex */
public final class k0s extends bnn0 implements Function2 {
    public boolean i;
    public final /* synthetic */ l0s j;
    public final /* synthetic */ long k;
    public final /* synthetic */ long l;
    public final /* synthetic */ long m;
    public final /* synthetic */ long n;
    public final /* synthetic */ boolean o;
    public final /* synthetic */ GameBroadcastType p;
    public final /* synthetic */ grs q;
    public final /* synthetic */ String r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0s(l0s l0sVar, long j, long j2, long j3, long j4, boolean z, GameBroadcastType gameBroadcastType, grs grsVar, String str, yje yjeVar) {
        super(2, yjeVar);
        this.j = l0sVar;
        this.k = j;
        this.l = j2;
        this.m = j3;
        this.n = j4;
        this.o = z;
        this.p = gameBroadcastType;
        this.q = grsVar;
        this.r = str;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        return new k0s(this.j, this.k, this.l, this.m, this.n, this.o, this.p, this.q, this.r, yjeVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((k0s) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        Object objB;
        wne wneVar = wne.f39444a;
        boolean z = this.i;
        Object obj2 = null;
        l0s l0sVar = this.j;
        if (!z) {
            z1x.P(obj);
            h3c h3cVar = l0sVar.u;
            this.i = true;
            objB = h3cVar.b(this.k, this);
            if (objB == wneVar) {
                return wneVar;
            }
        } else {
            if (!z) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(obj);
            objB = obj;
        }
        boolean zBooleanValue = ((Boolean) objB).booleanValue();
        for (Object obj3 : l0sVar.y) {
            if (((d0t) obj3).f5282a == this.l) {
                obj2 = obj3;
                break;
            }
        }
        d0t d0tVar = (d0t) obj2;
        l0sVar.i.c().d(new wid(l0sVar, this.l, this.k, this.m, zBooleanValue, this.n, this.o, this.p, this.q, this.r, d0tVar != null ? d0tVar.O : 0, (byte) 1));
        return Unit.f46060a;
    }
}
