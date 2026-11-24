package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class ie6 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public p7m0 j;
    public me6 k;
    public String l;
    public q88 m;
    public boolean n;
    public final /* synthetic */ me6 o;
    public final /* synthetic */ q88 p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ie6(me6 me6Var, q88 q88Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.o = me6Var;
        this.p = q88Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        q88 q88Var = this.p;
        me6 me6Var = this.o;
        switch (b) {
            case 0:
                return new ie6(me6Var, q88Var, yjeVar, (byte) 0);
            default:
                return new ie6(me6Var, q88Var, yjeVar, (byte) 1);
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
        return ((ie6) create(vneVar, yjeVar)).invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        p7m0 p7m0Var;
        String str;
        p7m0 p7m0Var2;
        String str2;
        byte b = this.i;
        q88 q88Var = this.p;
        me6 me6Var = this.o;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                boolean z = this.n;
                if (!z) {
                    z1x.P(obj);
                    p7m0 p7m0Var3 = me6Var.z;
                    String str3 = q88Var.g;
                    this.j = p7m0Var3;
                    this.k = me6Var;
                    this.l = str3;
                    this.m = q88Var;
                    this.n = true;
                    Object objP = me6Var.o.a() == q4f.m ? me6Var.t.p(me6Var.b, this) : Boolean.FALSE;
                    if (objP == wneVar) {
                        return wneVar;
                    }
                    obj = objP;
                    p7m0Var = p7m0Var3;
                    str = str3;
                } else {
                    if (!z) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    q88Var = this.m;
                    str = this.l;
                    me6Var = this.k;
                    p7m0Var = this.j;
                    z1x.P(obj);
                }
                zd6 zd6VarB = me6Var.B(str, q88Var, ((Boolean) obj).booleanValue());
                p7m0Var.getClass();
                p7m0Var.o(null, zd6VarB);
                return Unit.f46060a;
            default:
                wne wneVar2 = wne.f39444a;
                boolean z2 = this.n;
                if (!z2) {
                    z1x.P(obj);
                    p7m0 p7m0Var4 = me6Var.z;
                    String str4 = q88Var.g;
                    this.j = p7m0Var4;
                    this.k = me6Var;
                    this.l = str4;
                    this.m = q88Var;
                    this.n = true;
                    Object objP2 = me6Var.o.a() == q4f.m ? me6Var.t.p(me6Var.b, this) : Boolean.FALSE;
                    if (objP2 == wneVar2) {
                        return wneVar2;
                    }
                    obj = objP2;
                    p7m0Var2 = p7m0Var4;
                    str2 = str4;
                } else {
                    if (!z2) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    q88Var = this.m;
                    str2 = this.l;
                    me6Var = this.k;
                    p7m0Var2 = this.j;
                    z1x.P(obj);
                }
                zd6 zd6VarB2 = me6Var.B(str2, q88Var, ((Boolean) obj).booleanValue());
                p7m0Var2.getClass();
                p7m0Var2.o(null, zd6VarB2);
                return Unit.f46060a;
        }
    }
}
