package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class yy40 extends zzf0 implements Function2 {
    public sjt j;
    public zy40 k;
    public long[] l;
    public int m;
    public boolean n;
    public /* synthetic */ Object o;
    public final /* synthetic */ zy40 p;
    public final /* synthetic */ sjt q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yy40(zy40 zy40Var, sjt sjtVar, yje yjeVar) {
        super(2, yjeVar);
        this.p = zy40Var;
        this.q = sjtVar;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        yy40 yy40Var = new yy40(this.p, this.q, yjeVar);
        yy40Var.o = obj;
        return yy40Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((yy40) create((fgi0) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        fgi0 fgi0Var;
        zy40 zy40Var;
        long[] jArr;
        int i;
        sjt sjtVar;
        wne wneVar = wne.f39444a;
        boolean z = this.n;
        if (!z) {
            z1x.P(obj);
            fgi0Var = (fgi0) this.o;
            zy40Var = this.p;
            xy40 xy40Var = zy40Var.b;
            jArr = xy40Var.c;
            i = xy40Var.e;
            sjtVar = this.q;
        } else {
            if (!z) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            i = this.m;
            jArr = this.l;
            zy40Var = this.k;
            sjtVar = this.j;
            fgi0Var = (fgi0) this.o;
            z1x.P(obj);
        }
        if (i == Integer.MAX_VALUE) {
            return Unit.f46060a;
        }
        int i2 = (int) ((jArr[i] >> 31) & 2147483647L);
        sjtVar.b = i;
        Object obj2 = zy40Var.b.b[i];
        this.o = fgi0Var;
        this.j = sjtVar;
        this.k = zy40Var;
        this.l = jArr;
        this.m = i2;
        this.n = true;
        fgi0Var.a(this, obj2);
        return wneVar;
    }
}
