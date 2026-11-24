package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class iu9 extends bnn0 implements Function2 {
    public boolean i;
    public final /* synthetic */ ju9 j;
    public final /* synthetic */ String k;
    public final /* synthetic */ String l;
    public final /* synthetic */ int m;
    public final /* synthetic */ String n;
    public final /* synthetic */ String o;
    public final /* synthetic */ Integer p;
    public final /* synthetic */ String q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iu9(ju9 ju9Var, String str, String str2, int i, String str3, String str4, Integer num, String str5, yje yjeVar) {
        super(2, yjeVar);
        this.j = ju9Var;
        this.k = str;
        this.l = str2;
        this.m = i;
        this.n = str3;
        this.o = str4;
        this.p = num;
        this.q = str5;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        return new iu9(this.j, this.k, this.l, this.m, this.n, this.o, this.p, this.q, yjeVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((iu9) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        wne wneVar = wne.f39444a;
        boolean z = this.i;
        if (!z) {
            z1x.P(obj);
            ju9 ju9Var = this.j;
            ok50 ok50Var = ju9Var.f17142a;
            String strA = ju9Var.d.a();
            Integer num = this.p;
            zin0 zin0Var = new zin0(this.k, this.l, new yin0(this.m, this.n, num != null ? num.intValue() : 1, this.o));
            String strC = this.q;
            if (strC == null) {
                strC = ju9Var.b.c();
            }
            this.i = true;
            obj = ((qu9) ((zm) ok50Var.f25390a).invoke()).e(strA, zin0Var, strC, this);
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
        return m0x0.T((ht9) ((q16) obj).a());
    }
}
