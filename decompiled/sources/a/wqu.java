package a;

import java.util.List;
import kotlin.Unit;
import kotlin.collections.IndexedValue;

/* JADX INFO: loaded from: classes3.dex */
public final class wqu extends bnn0 implements xdr {
    public final /* synthetic */ byte i;
    public boolean j;
    public /* synthetic */ kmq k;
    public /* synthetic */ Object l;
    public final /* synthetic */ xzp m;
    public final /* synthetic */ boolean n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ wqu(yje yjeVar, xzp xzpVar, boolean z, byte b) {
        super(3, yjeVar);
        this.i = b;
        this.m = xzpVar;
        this.n = z;
    }

    @Override // a.xdr
    public final Object F(Object obj, Object obj2, Object obj3) {
        byte b = this.i;
        boolean z = this.n;
        xzp xzpVar = this.m;
        kmq kmqVar = (kmq) obj;
        yje yjeVar = (yje) obj3;
        switch (b) {
            case 0:
                wqu wquVar = new wqu(yjeVar, xzpVar, z, (byte) 0);
                wquVar.k = kmqVar;
                wquVar.l = obj2;
                return wquVar.invokeSuspend(Unit.f46060a);
            default:
                wqu wquVar2 = new wqu(yjeVar, xzpVar, z, (byte) 1);
                wquVar2.k = kmqVar;
                wquVar2.l = obj2;
                return wquVar2.invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        byte b = this.i;
        boolean z = this.n;
        xzp xzpVar = this.m;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                boolean z2 = this.j;
                if (!z2) {
                    z1x.P(obj);
                    kmq kmqVar = this.k;
                    IndexedValue indexedValue = (IndexedValue) this.l;
                    int i = indexedValue.f46061a;
                    acu acuVarK = ((v7i) xzpVar.c).k((List) indexedValue.b, z, ((pru) xzpVar.g).a().O1);
                    this.k = null;
                    this.l = null;
                    this.j = true;
                    if (slb.Q(kmqVar, acuVarK, this) == wneVar) {
                        return wneVar;
                    }
                } else {
                    if (!z2) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            default:
                wne wneVar2 = wne.f39444a;
                boolean z3 = this.j;
                if (!z3) {
                    z1x.P(obj);
                    kmq kmqVar2 = this.k;
                    acu acuVarK2 = ((v7i) xzpVar.c).k((List) this.l, z, ((pru) xzpVar.g).a().O1);
                    this.k = null;
                    this.l = null;
                    this.j = true;
                    if (slb.Q(kmqVar2, acuVarK2, this) == wneVar2) {
                        return wneVar2;
                    }
                } else {
                    if (!z3) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
        }
    }
}
