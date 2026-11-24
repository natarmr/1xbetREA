package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.xplatform.referral.api.domain.model.ReferralNetworkInfo;

/* JADX INFO: loaded from: classes5.dex */
public final class spe0 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public qz40 j;
    public rne0 k;
    public String l;
    public byte m;
    public final /* synthetic */ tpe0 n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ spe0(tpe0 tpe0Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.n = tpe0Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        tpe0 tpe0Var = this.n;
        switch (b) {
            case 0:
                return new spe0(tpe0Var, yjeVar, (byte) 0);
            default:
                return new spe0(tpe0Var, yjeVar, (byte) 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        vne vneVar = (vne) obj;
        yje yjeVar = (yje) obj2;
        switch (this.i) {
            case 0:
                break;
        }
        return ((spe0) create(vneVar, yjeVar)).invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        qz40 qz40Var;
        rne0 rne0Var;
        Object objW;
        qz40 qz40Var2;
        String str;
        qz40 qz40Var3;
        rne0 rne0Var2;
        Object objW2;
        qz40 qz40Var4;
        rne0 rne0Var3;
        String str2;
        byte b = this.i;
        tpe0 tpe0Var = this.n;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                byte b2 = this.m;
                if (b2 == 0) {
                    z1x.P(obj);
                    qz40Var = tpe0Var.i;
                    rne0Var = tpe0Var.e;
                    abu abuVar = tpe0Var.c;
                    this.j = qz40Var;
                    this.k = rne0Var;
                    this.m = (byte) 1;
                    objW = abuVar.w(this);
                    if (objW != wneVar) {
                    }
                    return wneVar;
                }
                if (b2 == 1) {
                    rne0Var = this.k;
                    qz40 qz40Var5 = this.j;
                    z1x.P(obj);
                    objW = obj;
                    qz40Var = qz40Var5;
                } else {
                    if (b2 != 2) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    str = this.l;
                    rne0Var = this.k;
                    qz40Var2 = this.j;
                    z1x.P(obj);
                }
                long[] jArr = {((long) tpe0Var.k) * 1000};
                rne0Var.getClass();
                xpe0 xpe0Var = new xpe0(rne0.a(str, (ReferralNetworkInfo) obj, jArr));
                p7m0 p7m0Var = (p7m0) qz40Var2;
                p7m0Var.getClass();
                p7m0Var.o(null, xpe0Var);
                return Unit.f46060a;
                String str3 = (String) objW;
                hnu hnuVar = tpe0Var.b;
                this.j = qz40Var;
                this.k = rne0Var;
                this.l = str3;
                this.m = (byte) 2;
                Object objI = hnu.i(hnuVar, 0, this, 3);
                if (objI != wneVar) {
                    qz40 qz40Var6 = qz40Var;
                    obj = objI;
                    qz40Var2 = qz40Var6;
                    str = str3;
                    long[] jArr2 = {((long) tpe0Var.k) * 1000};
                    rne0Var.getClass();
                    xpe0 xpe0Var2 = new xpe0(rne0.a(str, (ReferralNetworkInfo) obj, jArr2));
                    p7m0 p7m0Var2 = (p7m0) qz40Var2;
                    p7m0Var2.getClass();
                    p7m0Var2.o(null, xpe0Var2);
                    return Unit.f46060a;
                }
                return wneVar;
            default:
                int i = tpe0Var.k;
                wne wneVar2 = wne.f39444a;
                byte b3 = this.m;
                if (b3 == 0) {
                    z1x.P(obj);
                    qz40Var3 = tpe0Var.i;
                    rne0Var2 = tpe0Var.e;
                    abu abuVar2 = tpe0Var.c;
                    this.j = qz40Var3;
                    this.k = rne0Var2;
                    this.m = (byte) 1;
                    objW2 = abuVar2.w(this);
                    if (objW2 != wneVar2) {
                    }
                    return wneVar2;
                }
                if (b3 == 1) {
                    rne0Var2 = this.k;
                    qz40 qz40Var7 = this.j;
                    z1x.P(obj);
                    objW2 = obj;
                    qz40Var3 = qz40Var7;
                } else {
                    if (b3 != 2) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    str2 = this.l;
                    rne0Var3 = this.k;
                    qz40Var4 = this.j;
                    z1x.P(obj);
                }
                rne0Var3.getClass();
                xpe0 xpe0Var3 = new xpe0(rne0.a(str2, (ReferralNetworkInfo) obj, new long[]{((long) (i - 2592000)) * 1000, ((long) i) * 1000}));
                p7m0 p7m0Var3 = (p7m0) qz40Var4;
                p7m0Var3.getClass();
                p7m0Var3.o(null, xpe0Var3);
                return Unit.f46060a;
                String str4 = (String) objW2;
                this.j = qz40Var3;
                this.k = rne0Var2;
                this.l = str4;
                this.m = (byte) 2;
                Object objI2 = hnu.i(tpe0Var.b, i - 2592000, this, 2);
                if (objI2 != wneVar2) {
                    qz40 qz40Var8 = qz40Var3;
                    obj = objI2;
                    qz40Var4 = qz40Var8;
                    rne0Var3 = rne0Var2;
                    str2 = str4;
                    rne0Var3.getClass();
                    xpe0 xpe0Var4 = new xpe0(rne0.a(str2, (ReferralNetworkInfo) obj, new long[]{((long) (i - 2592000)) * 1000, ((long) i) * 1000}));
                    p7m0 p7m0Var4 = (p7m0) qz40Var4;
                    p7m0Var4.getClass();
                    p7m0Var4.o(null, xpe0Var4);
                    return Unit.f46060a;
                }
                return wneVar2;
        }
    }
}
