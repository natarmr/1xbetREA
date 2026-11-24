package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.xplatform.bethistory.sale.presentation.SaleDataModel;

/* JADX INFO: loaded from: classes3.dex */
public final class swg0 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public boolean j;
    public final /* synthetic */ cxg0 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ swg0(cxg0 cxg0Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = cxg0Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        cxg0 cxg0Var = this.k;
        switch (b) {
            case 0:
                return new swg0(cxg0Var, yjeVar, (byte) 0);
            case 1:
                swg0 swg0Var = new swg0(cxg0Var, yjeVar, (byte) 1);
                swg0Var.j = ((Boolean) obj).booleanValue();
                return swg0Var;
            case 2:
                return new swg0(cxg0Var, yjeVar, (byte) 2);
            default:
                return new swg0(cxg0Var, yjeVar, (byte) 3);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((swg0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 1:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                return ((swg0) create(bool, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 2:
                return ((swg0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((swg0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    /* JADX WARN: Code duplicated, block: B:66:0x0169  */
    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        Object objD0;
        SaleDataModel saleDataModelD;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        Object value;
        byte b = this.i;
        cxg0 cxg0Var = this.k;
        switch (b) {
            case 0:
                n3w n3wVar = cxg0Var.l;
                wne wneVar = wne.f39444a;
                boolean z5 = this.j;
                if (!z5) {
                    z1x.P(obj);
                    cu cuVar = cxg0Var.b;
                    long j = cxg0Var.n;
                    String str = n3wVar.f22868a;
                    this.j = true;
                    objD0 = qjj.d0(((mne) cuVar.b).b, new ir((Object) cuVar, j, (Object) str, (yje) null, (byte) 16), this);
                    if (objD0 == wneVar) {
                        return wneVar;
                    }
                } else {
                    if (!z5) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                    objD0 = obj;
                }
                ytg0 ytg0Var = (ytg0) objD0;
                cxg0Var.F(false);
                double d = ytg0Var.f43216a;
                double d2 = ytg0Var.c;
                double d3 = ytg0Var.d;
                double d4 = ytg0Var.e;
                double d5 = ytg0Var.f;
                double d6 = ytg0Var.g;
                double d7 = ytg0Var.h;
                double d8 = d - ((d4 * d) / d3);
                SaleDataModel saleDataModel = new SaleDataModel(d, d2, d3, d4, d8, d5, d6, d5, d7, 0.0d, d8, d4);
                boolean z6 = cxg0Var.p;
                sff0 sff0Var = cxg0Var.o;
                double d9 = (100.0d * d7) / d8;
                si30.a(d9);
                si30.a(d9);
                boolean z7 = cxg0Var.m;
                if (z7) {
                    saleDataModelD = saleDataModel;
                    saleDataModel = SaleDataModel.a(saleDataModelD, 0.0d, d5, 0.0d, 0.0d, 0.0d, 0.0d, 4091);
                } else {
                    saleDataModelD = saleDataModel;
                }
                cxg0Var.r = saleDataModel;
                boolean z8 = saleDataModel.b == 0.0d || !sff0Var.f32117a.f12063a.n;
                cxg0Var.q = z8;
                boolean z9 = saleDataModel.g > 0.0d;
                if (z8 && !z7) {
                    z = true;
                    z2 = false;
                    z3 = false;
                    z4 = false;
                } else if (z8 && z9 && z7) {
                    z = false;
                    z2 = true;
                    z3 = false;
                    z4 = false;
                } else if (!z8 && z9 && z7) {
                    z = false;
                    z2 = false;
                    z3 = false;
                    z4 = true;
                } else {
                    if (sff0Var.f32117a.f12063a.n) {
                        z = false;
                        z2 = false;
                        z3 = true;
                    } else {
                        z = true;
                        z2 = false;
                        z3 = false;
                    }
                    z4 = false;
                }
                if (z6) {
                    saleDataModelD = cxg0.D(saleDataModelD);
                }
                double d10 = saleDataModelD.c;
                pn40 pn40Var = pn40.f27267a;
                String strD = pn40.d(d10, n3wVar.g, p3u0.c);
                cxg0Var.v = d10;
                if (z6) {
                    saleDataModel = cxg0.D(saleDataModel);
                }
                p7m0 p7m0Var = cxg0Var.y;
                do {
                    value = p7m0Var.getValue();
                } while (!p7m0Var.m(value, m9h0.a((m9h0) value, cxg0Var.z(saleDataModel), 0, 0, 0, z, z2, z3, z4, false, strD, null, 0, 6686)));
                cxg0Var.x = true;
                cxg0Var.w(0);
                return Unit.f46060a;
            case 1:
                boolean z10 = this.j;
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                p7m0 p7m0Var2 = cxg0Var.y;
                while (true) {
                    Object value2 = p7m0Var2.getValue();
                    boolean z11 = z10;
                    if (p7m0Var2.m(value2, m9h0.a((m9h0) value2, null, 0, 0, 0, false, false, false, false, z11, null, null, 0, 7679))) {
                        boolean z12 = cxg0Var.w;
                        if (!z12 && z11 && !cxg0Var.x) {
                            cxg0Var.x();
                        } else if (!z12 && z11 && cxg0Var.x) {
                            cxg0Var.F(false);
                        }
                        cxg0Var.w = z11;
                        return Unit.f46060a;
                    }
                    z10 = z11;
                }
                break;
            case 2:
                wne wneVar3 = wne.f39444a;
                boolean z13 = this.j;
                if (!z13) {
                    z1x.P(obj);
                    this.j = true;
                    if (qcc.O(200L, this) == wneVar3) {
                        return wneVar3;
                    }
                } else {
                    if (!z13) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                p7m0 p7m0Var3 = cxg0Var.z;
                p7m0Var3.getClass();
                p7m0Var3.o(null, pwg0.f27710a);
                return Unit.f46060a;
            default:
                wne wneVar4 = wne.f39444a;
                boolean z14 = this.j;
                if (!z14) {
                    z1x.P(obj);
                    wwv wwvVar = cxg0Var.d;
                    n3w n3wVar2 = cxg0Var.l;
                    ctx ctxVar = new ctx(false, n3wVar2, cxg0Var.n, n3wVar2.g);
                    this.j = true;
                    if (wwvVar.a(ctxVar, this) == wneVar4) {
                        return wneVar4;
                    }
                } else {
                    if (!z14) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
        }
    }
}
