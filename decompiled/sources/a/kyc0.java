package a;

import java.util.Arrays;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes5.dex */
public final class kyc0 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public boolean j;
    public final /* synthetic */ lyc0 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ kyc0(lyc0 lyc0Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = lyc0Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        lyc0 lyc0Var = this.k;
        switch (b) {
            case 0:
                return new kyc0(lyc0Var, yjeVar, (byte) 0);
            case 1:
                return new kyc0(lyc0Var, yjeVar, (byte) 1);
            default:
                return new kyc0(lyc0Var, yjeVar, (byte) 2);
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
        return ((kyc0) create(vneVar, yjeVar)).invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        Object value;
        Object objA;
        Object value2;
        Object value3;
        Object objA2;
        Object value4;
        Object objA3;
        Object value5;
        byte b = this.i;
        dfe dfeVar = dfe.f5996a;
        lyc0 lyc0Var = this.k;
        switch (b) {
            case 0:
                ctf0 ctf0Var = lyc0Var.w;
                ocj ocjVar = lyc0Var.i;
                wne wneVar = wne.f39444a;
                boolean z = this.j;
                if (!z) {
                    z1x.P(obj);
                    int i = lyc0.E;
                    p7m0 p7m0Var = ocjVar.f25029a;
                    do {
                        value = p7m0Var.getValue();
                        value.getClass();
                    } while (!p7m0Var.m(value, mmc0.a((mmc0) value, dfeVar, null, null, 2039)));
                    wou wouVar = lyc0Var.r;
                    this.j = true;
                    objA = wouVar.a(this);
                    if (objA == wneVar) {
                        return wneVar;
                    }
                } else {
                    if (!z) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                    objA = obj;
                }
                etc0 etc0Var = (etc0) objA;
                w5c0 w5c0Var = new w5c0(ctf0Var.b.a(R.string.promo_codes_title, Arrays.copyOf(new Object[0], 0)), etc0Var.f8369a ? String.valueOf(etc0Var.c) : null, etc0Var.f8369a ? ctf0Var.b.a(R.string.pts_symbol, Arrays.copyOf(new Object[0], 0)) : null, new m0x(R.drawable.promo_banner_icon, null, 6));
                p7m0 p7m0Var2 = ocjVar.f25029a;
                do {
                    value2 = p7m0Var2.getValue();
                    value2.getClass();
                } while (!p7m0Var2.m(value2, mmc0.a((mmc0) value2, new afe(w5c0Var), null, null, 2039)));
                return Unit.f46060a;
            case 1:
                ocj ocjVar2 = lyc0Var.i;
                wne wneVar2 = wne.f39444a;
                boolean z2 = this.j;
                if (!z2) {
                    z1x.P(obj);
                    int i2 = lyc0.E;
                    p7m0 p7m0Var3 = ocjVar2.f25029a;
                    do {
                        value3 = p7m0Var3.getValue();
                        value3.getClass();
                    } while (!p7m0Var3.m(value3, mmc0.a((mmc0) value3, null, null, dfeVar, 2015)));
                    epu epuVar = lyc0Var.p;
                    this.j = true;
                    objA2 = epuVar.a(this);
                    if (objA2 == wneVar2) {
                        return wneVar2;
                    }
                } else {
                    if (!z2) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                    objA2 = obj;
                }
                lc00 lc00VarA = lyc0Var.t.a(((Boolean) objA2).booleanValue(), lyc0Var.q.a());
                p7m0 p7m0Var4 = ocjVar2.f25029a;
                do {
                    value4 = p7m0Var4.getValue();
                    value4.getClass();
                } while (!p7m0Var4.m(value4, mmc0.a((mmc0) value4, null, null, new afe(dyb.o0(lc00VarA)), 2015)));
                return Unit.f46060a;
            default:
                ctf0 ctf0Var2 = lyc0Var.w;
                wne wneVar3 = wne.f39444a;
                boolean z3 = this.j;
                if (!z3) {
                    z1x.P(obj);
                    wou wouVar2 = lyc0Var.r;
                    this.j = true;
                    objA3 = wouVar2.a(this);
                    if (objA3 == wneVar3) {
                        return wneVar3;
                    }
                } else {
                    if (!z3) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                    objA3 = obj;
                }
                etc0 etc0Var2 = (etc0) objA3;
                w5c0 w5c0Var2 = new w5c0(ctf0Var2.b.a(R.string.promo_codes_title, Arrays.copyOf(new Object[0], 0)), etc0Var2.f8369a ? String.valueOf(etc0Var2.c) : null, etc0Var2.f8369a ? ctf0Var2.b.a(R.string.pts_symbol, Arrays.copyOf(new Object[0], 0)) : null, new m0x(R.drawable.promo_banner_icon, null, 6));
                p7m0 p7m0Var5 = lyc0Var.i.f25029a;
                do {
                    value5 = p7m0Var5.getValue();
                    value5.getClass();
                } while (!p7m0Var5.m(value5, mmc0.a((mmc0) value5, new afe(w5c0Var2), null, null, 2039)));
                return Unit.f46060a;
        }
    }
}
