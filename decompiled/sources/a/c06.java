package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final class c06 extends bnn0 implements Function2 {
    public boolean i;
    public final /* synthetic */ d06 j;
    public final /* synthetic */ boolean k;
    public final /* synthetic */ String l;
    public final /* synthetic */ long m;
    public final /* synthetic */ String n;
    public final /* synthetic */ double o;
    public final /* synthetic */ String p;
    public final /* synthetic */ String q;
    public final /* synthetic */ String r;
    public final /* synthetic */ boolean s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c06(d06 d06Var, boolean z, String str, long j, String str2, double d, String str3, String str4, String str5, boolean z2, yje yjeVar) {
        super(2, yjeVar);
        this.j = d06Var;
        this.k = z;
        this.l = str;
        this.m = j;
        this.n = str2;
        this.o = d;
        this.p = str3;
        this.q = str4;
        this.r = str5;
        this.s = z2;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        return new c06(this.j, this.k, this.l, this.m, this.n, this.o, this.p, this.q, this.r, this.s, yjeVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((c06) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        wne wneVar = wne.f39444a;
        boolean z = this.i;
        d06 d06Var = this.j;
        if (!z) {
            z1x.P(obj);
            m1u m1uVar = d06Var.n;
            ehn0 ehn0Var = new ehn0(this.k, this.l, this.m, this.n, this.o, this.p, this.q, this.r, this.s);
            this.i = true;
            if (m1uVar.a(ehn0Var, this) == wneVar) {
                return wneVar;
            }
        } else {
            if (!z) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(obj);
        }
        d06Var.o.f(j320.f15811a);
        return Unit.f46060a;
    }
}
