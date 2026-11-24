package a;

import java.io.Serializable;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class vq0 extends bnn0 implements Function2 {
    public boolean i;
    public final /* synthetic */ jr0 j;
    public final /* synthetic */ long k;
    public final /* synthetic */ boolean l;
    public final /* synthetic */ int m;
    public final /* synthetic */ int n;
    public final /* synthetic */ String o;
    public final /* synthetic */ String p;
    public final /* synthetic */ String q;
    public final /* synthetic */ boolean r;
    public final /* synthetic */ boolean s;
    public final /* synthetic */ boolean t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vq0(jr0 jr0Var, long j, boolean z, int i, int i2, String str, String str2, String str3, boolean z2, boolean z3, boolean z4, yje yjeVar) {
        super(2, yjeVar);
        this.j = jr0Var;
        this.k = j;
        this.l = z;
        this.m = i;
        this.n = i2;
        this.o = str;
        this.p = str2;
        this.q = str3;
        this.r = z2;
        this.s = z3;
        this.t = z4;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        return new vq0(this.j, this.k, this.l, this.m, this.n, this.o, this.p, this.q, this.r, this.s, this.t, yjeVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((vq0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        wne wneVar = wne.f39444a;
        boolean z = this.i;
        if (!z) {
            z1x.P(obj);
            this.i = true;
            Serializable serializableB = this.j.b(this.k, this.l, this.m, this.n, this.o, this.p, this.q, this.r, this.s, this.t, this);
            return serializableB == wneVar ? wneVar : serializableB;
        }
        if (z) {
            z1x.P(obj);
            return obj;
        }
        jf4.n("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}
