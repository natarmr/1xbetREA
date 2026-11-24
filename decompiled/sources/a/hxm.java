package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final class hxm extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public /* synthetic */ Object j;
    public final /* synthetic */ float k;
    public final /* synthetic */ Object l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ hxm(xcz xczVar, float f, xcz xczVar2, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.j = xczVar;
        this.k = f;
        this.l = xczVar2;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        Object obj2 = this.l;
        switch (b) {
            case 0:
                return new hxm((xcz) this.j, this.k, (xcz) obj2, yjeVar, (byte) 0);
            case 1:
                return new hxm((xcz) this.j, this.k, (xcz) obj2, yjeVar, (byte) 1);
            case 2:
                return new hxm((xcz) this.j, this.k, (xcz) obj2, yjeVar, (byte) 2);
            case 3:
                return new hxm((xcz) this.j, this.k, (xcz) obj2, yjeVar, (byte) 3);
            default:
                hxm hxmVar = new hxm((jie0) obj2, this.k, yjeVar);
                hxmVar.j = obj;
                return hxmVar;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((hxm) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 1:
                return ((hxm) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 2:
                return ((hxm) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 3:
                return ((hxm) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((hxm) create((qah0) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        byte b = this.i;
        float f = this.k;
        Object obj2 = this.l;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                float f2 = -f;
                ((xcz) this.j).e(f2);
                ((xcz) obj2).e(f2);
                break;
            case 1:
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                float f3 = -f;
                ((xcz) this.j).e(f3);
                ((xcz) obj2).e(f3);
                break;
            case 2:
                wne wneVar3 = wne.f39444a;
                z1x.P(obj);
                float f4 = -f;
                ((xcz) this.j).e(f4);
                ((xcz) obj2).e(f4);
                break;
            case 3:
                wne wneVar4 = wne.f39444a;
                z1x.P(obj);
                float f5 = -f;
                ((xcz) this.j).e(f5);
                ((xcz) obj2).e(f5);
                break;
            default:
                wne wneVar5 = wne.f39444a;
                z1x.P(obj);
                ((jie0) obj2).f16571a = ((qah0) this.j).a(f);
                break;
        }
        return Unit.f46060a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hxm(jie0 jie0Var, float f, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 4;
        this.l = jie0Var;
        this.k = f;
    }
}
