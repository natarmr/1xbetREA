package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes5.dex */
public final class pod0 extends bnn0 implements Function2 {
    public tod0 i;
    public mod0 j;
    public String k;
    public double l;
    public byte m;
    public final /* synthetic */ tod0 n;
    public final /* synthetic */ String o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pod0(tod0 tod0Var, String str, yje yjeVar) {
        super(2, yjeVar);
        this.n = tod0Var;
        this.o = str;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        return new pod0(this.n, this.o, yjeVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((pod0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
    }

    /* JADX WARN: Code duplicated, block: B:35:0x008e  */
    /* JADX WARN: Code duplicated, block: B:36:0x009c  */
    /* JADX WARN: Code duplicated, block: B:39:0x00ad  */
    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        double d;
        boolean z;
        double d2;
        Object objB;
        mod0 mod0Var;
        Object dod0Var;
        Object objC;
        tod0 tod0Var;
        String str;
        tod0 tod0Var2 = this.n;
        p7m0 p7m0Var = tod0Var2.m;
        wne wneVar = wne.f39444a;
        byte b = this.m;
        if (b != 0) {
            if (b == 1) {
                double d3 = this.l;
                mod0Var = this.j;
                tod0 tod0Var3 = this.i;
                z1x.P(obj);
                d2 = d3;
                tod0Var2 = tod0Var3;
                objB = obj;
            } else {
                if (b != 2) {
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                str = this.k;
                tod0 tod0Var4 = this.i;
                z1x.P(obj);
                tod0Var = tod0Var4;
                objC = obj;
            }
            eod0 eod0Var = new eod0(str, slb.Y((xuf) objC));
            tod0Var2 = tod0Var;
            dod0Var = eod0Var;
            tod0Var2.n.f(dod0Var);
            return Unit.f46060a;
        }
        z1x.P(obj);
        Object value = p7m0Var.getValue();
        mod0 mod0Var2 = value instanceof mod0 ? (mod0) value : null;
        if (mod0Var2 != null) {
            double d4 = mod0Var2.g;
            String str2 = this.o;
            double dO = wvb.O(str2);
            if (!StringsKt.W(str2) && mod0Var2.b) {
                if (mod0Var2.f22131a || dO < d4) {
                    d = dO;
                    if (mod0Var2.e != d && d >= d4) {
                        z = true;
                    }
                } else {
                    z = true;
                    d = dO;
                }
                d2 = d;
                mod0 mod0VarA = mod0.a(mod0Var2, false, z, d2, 91);
                p7m0Var.getClass();
                p7m0Var.o(null, mod0VarA);
                if (wvb.O(str2) < d4) {
                    ahu ahuVar = tod0Var2.h;
                    this.i = tod0Var2;
                    this.j = mod0Var2;
                    this.l = d2;
                    this.m = (byte) 1;
                    objB = ahuVar.b(bm5.f2822a, this);
                    if (objB != wneVar) {
                        mod0Var = mod0Var2;
                    }
                    return wneVar;
                }
                dod0Var = new dod0(e9x.I(tod0Var2.k, d4, mod0Var2.d));
                tod0Var2.n.f(dod0Var);
            } else {
                d = dO;
            }
            z = false;
            d2 = d;
            mod0 mod0VarA2 = mod0.a(mod0Var2, false, z, d2, 91);
            p7m0Var.getClass();
            p7m0Var.o(null, mod0VarA2);
            if (wvb.O(str2) < d4) {
                ahu ahuVar2 = tod0Var2.h;
                this.i = tod0Var2;
                this.j = mod0Var2;
                this.l = d2;
                this.m = (byte) 1;
                objB = ahuVar2.b(bm5.f2822a, this);
                if (objB != wneVar) {
                    mod0Var = mod0Var2;
                }
                return wneVar;
            }
            dod0Var = new dod0(e9x.I(tod0Var2.k, d4, mod0Var2.d));
            tod0Var2.n.f(dod0Var);
        }
        return Unit.f46060a;
        long j = ((ql5) objB).e;
        String strI = e9x.I(tod0Var2.k, mod0Var.g, mod0Var.d);
        m0u m0uVar = tod0Var2.i;
        this.i = tod0Var2;
        this.j = null;
        this.k = strI;
        this.l = d2;
        this.m = (byte) 2;
        objC = m0uVar.f20973a.c(j, this);
        if (objC != wneVar) {
            tod0Var = tod0Var2;
            str = strI;
            eod0 eod0Var2 = new eod0(str, slb.Y((xuf) objC));
            tod0Var2 = tod0Var;
            dod0Var = eod0Var2;
            tod0Var2.n.f(dod0Var);
            return Unit.f46060a;
        }
        return wneVar;
    }
}
