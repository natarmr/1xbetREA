package a;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class z5e extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public c6e j;
    public boolean k;
    public final /* synthetic */ c6e l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z5e(c6e c6eVar, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.l = c6eVar;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        c6e c6eVar = this.l;
        switch (b) {
            case 0:
                return new z5e(c6eVar, yjeVar, (byte) 0);
            case 1:
                return new z5e(c6eVar, yjeVar, (byte) 1);
            default:
                return new z5e(c6eVar, yjeVar, (byte) 2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        vne vneVar = (vne) obj;
        yje yjeVar = (yje) obj2;
        switch (this.i) {
            case 0:
                break;
            case 1:
                break;
        }
        return ((z5e) create(vneVar, yjeVar)).invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        byte b = this.i;
        c6e c6eVar = this.l;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                boolean z = this.k;
                if (!z) {
                    z1x.P(obj);
                    this.j = c6eVar;
                    this.k = true;
                    obj = c6eVar.w(this);
                    if (obj == wneVar) {
                        return wneVar;
                    }
                } else {
                    if (!z) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    c6eVar = this.j;
                    z1x.P(obj);
                }
                c6eVar.y(new l5e((List) obj));
                return Unit.f46060a;
            case 1:
                wne wneVar2 = wne.f39444a;
                boolean z2 = this.k;
                if (!z2) {
                    z1x.P(obj);
                    this.j = c6eVar;
                    this.k = true;
                    obj = c6eVar.w(this);
                    if (obj == wneVar2) {
                        return wneVar2;
                    }
                } else {
                    if (!z2) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    c6eVar = this.j;
                    z1x.P(obj);
                }
                c6eVar.y(new m5e((List) obj));
                return Unit.f46060a;
            default:
                wne wneVar3 = wne.f39444a;
                boolean z3 = this.k;
                if (!z3) {
                    z1x.P(obj);
                    this.j = c6eVar;
                    this.k = true;
                    obj = c6eVar.w(this);
                    if (obj == wneVar3) {
                        return wneVar3;
                    }
                } else {
                    if (!z3) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    c6eVar = this.j;
                    z1x.P(obj);
                }
                c6eVar.y(new n5e((List) obj));
                return Unit.f46060a;
        }
    }
}
