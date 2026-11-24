package a;

import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
public final class ifg extends bnn0 implements Function1 {
    public final /* synthetic */ byte i;
    public boolean j;
    public final /* synthetic */ jfg k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ifg(jfg jfgVar, yje yjeVar, byte b) {
        super(1, yjeVar);
        this.i = b;
        this.k = jfgVar;
    }

    @Override // a.zw5
    public final yje create(yje yjeVar) {
        byte b = this.i;
        jfg jfgVar = this.k;
        switch (b) {
            case 0:
                return new ifg(jfgVar, yjeVar, (byte) 0);
            default:
                return new ifg(jfgVar, yjeVar, (byte) 1);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        yje yjeVar = (yje) obj;
        switch (this.i) {
            case 0:
                break;
        }
        return ((ifg) create(yjeVar)).invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        byte b = this.i;
        jfg jfgVar = this.k;
        yje yjeVar = null;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                boolean z = this.j;
                if (!z) {
                    z1x.P(obj);
                    hjd hjdVar = jfgVar.q;
                    cid cidVar = new cid("", new jq2(jfgVar.o.f46549a));
                    this.j = true;
                    hjdVar.getClass();
                    if (hjdVar.a(cidVar, this) == wneVar) {
                        return wneVar;
                    }
                } else {
                    if (!z) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            default:
                Object obj2 = wne.f39444a;
                boolean z2 = this.j;
                if (!z2) {
                    z1x.P(obj);
                    khf0 khf0Var = jfgVar.p;
                    long j = jfgVar.o.f46549a;
                    List listA = ((luu) khf0Var.c).f20692a.a();
                    tcg tcgVar = ((udg) khf0Var.b).b;
                    LinkedHashMap linkedHashMap = tcgVar.f;
                    Long lValueOf = Long.valueOf(j);
                    Object objB = linkedHashMap.get(lValueOf);
                    if (objB == null) {
                        objB = roj0.b(1, 0, i99.b, 2);
                        linkedHashMap.put(lValueOf, objB);
                    }
                    vae0 vae0VarM = vtb.M((mz40) objB);
                    LinkedHashMap linkedHashMap2 = tcgVar.g;
                    Long lValueOf2 = Long.valueOf(j);
                    Object objB2 = linkedHashMap2.get(lValueOf2);
                    if (objB2 == null) {
                        objB2 = roj0.b(1, 0, i99.b, 2);
                        linkedHashMap2.put(lValueOf2, objB2);
                    }
                    dnq dnqVar = new dnq(dub.f0(vae0VarM, vtb.M((mz40) objB2), ((arc) khf0Var.d).f1338a.b.b, new xo1(listA, yjeVar, (byte) 3)), new rl2(3, null, (byte) 6), (byte) 1);
                    qoj0 qoj0Var = jfgVar.v.f1338a.b.b;
                    ko0 ko0Var = new ko0(jfgVar, (yje) null, (byte) 9);
                    this.j = true;
                    gmq[] gmqVarArr = {dnqVar, qoj0Var};
                    Object objG = tdc.G(this, h660.f12515a, new kh1((Object) ko0Var, (yje) null, (byte) 9), pul.j, gmqVarArr);
                    if (objG != obj2) {
                        objG = Unit.f46060a;
                    }
                    if (objG != obj2) {
                        objG = Unit.f46060a;
                    }
                    if (objG == obj2) {
                        return obj2;
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
}
