package a;

import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes3.dex */
public final class qq10 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public boolean j;
    public final /* synthetic */ vq10 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ qq10(vq10 vq10Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = vq10Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        vq10 vq10Var = this.k;
        switch (b) {
            case 0:
                return new qq10(vq10Var, yjeVar, (byte) 0);
            case 1:
                return new qq10(vq10Var, yjeVar, (byte) 1);
            case 2:
                return new qq10(vq10Var, yjeVar, (byte) 2);
            default:
                qq10 qq10Var = new qq10(vq10Var, yjeVar, (byte) 3);
                qq10Var.j = ((Boolean) obj).booleanValue();
                return qq10Var;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((qq10) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 1:
                return ((qq10) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 2:
                return ((qq10) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                return ((qq10) create(bool, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        Object value;
        Object jq10Var;
        Object value2;
        byte b = this.i;
        vq10 vq10Var = this.k;
        byte b2 = 0;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                boolean z = this.j;
                if (!z) {
                    z1x.P(obj);
                    rou rouVar = vq10Var.p;
                    this.j = true;
                    obj = rouVar.a(false, this);
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
                vq10Var.q.d(new u400(vq10Var, ((m2c0) obj).Z, (byte) 20));
                return Unit.f46060a;
            case 1:
                wne wneVar2 = wne.f39444a;
                boolean z2 = this.j;
                if (!z2) {
                    z1x.P(obj);
                    qoj0 qoj0Var = vq10Var.w;
                    this.j = true;
                    if (qoj0Var.a(dq10.f6492a, this) == wneVar2) {
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
            case 2:
                wne wneVar3 = wne.f39444a;
                boolean z3 = this.j;
                if (!z3) {
                    z1x.P(obj);
                    this.j = true;
                    if (vq10Var.w(false, this) == wneVar3) {
                        return wneVar3;
                    }
                } else {
                    if (!z3) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            default:
                p7m0 p7m0Var = vq10Var.v;
                boolean z4 = this.j;
                wne wneVar4 = wne.f39444a;
                z1x.P(obj);
                if (!z4 && !(p7m0Var.getValue() instanceof jq10)) {
                    do {
                        value2 = p7m0Var.getValue();
                    } while (!p7m0Var.m(value2, new hq10(g2v.d(vq10Var.h, pb10.g, null, null, R.string.data_retrieval_error, R.string.try_again_text, new bq10(vq10Var, b2), 94))));
                } else if (z4 || !(p7m0Var.getValue() instanceof jq10)) {
                    vq10Var.x(false);
                } else {
                    do {
                        value = p7m0Var.getValue();
                        jq10Var = (kq10) value;
                        if (jq10Var instanceof jq10) {
                            List<Object> list = ((jq10) jq10Var).f16928a;
                            ArrayList arrayList = new ArrayList(r3d.q(list, 10));
                            for (Object objC : list) {
                                if (objC instanceof cr10) {
                                    objC = cr10.c((cr10) objC, false, 59);
                                }
                                arrayList.add(objC);
                            }
                            jq10Var = new jq10(arrayList, false, false);
                        }
                    } while (!p7m0Var.m(value, jq10Var));
                }
                return Unit.f46060a;
        }
    }
}
