package a;

import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes4.dex */
public final class x600 extends bnn0 implements Function2 {
    public byte i;
    public /* synthetic */ Object j;
    public final /* synthetic */ List k;
    public final /* synthetic */ wdu l;
    public final /* synthetic */ boolean m;
    public final /* synthetic */ String n;
    public final /* synthetic */ int o;
    public final /* synthetic */ boolean p;
    public final /* synthetic */ long q;
    public final /* synthetic */ long r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x600(List list, wdu wduVar, boolean z, String str, int i, boolean z2, long j, long j2, yje yjeVar) {
        super(2, yjeVar);
        this.k = list;
        this.l = wduVar;
        this.m = z;
        this.n = str;
        this.o = i;
        this.p = z2;
        this.q = j;
        this.r = j2;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        x600 x600Var = new x600(this.k, this.l, this.m, this.n, this.o, this.p, this.q, this.r, yjeVar);
        x600Var.j = obj;
        return x600Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((x600) create((kmq) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        wdu wduVar = this.l;
        knf0 knf0Var = (knf0) wduVar.f;
        kmq kmqVar = (kmq) this.j;
        wne wneVar = wne.f39444a;
        byte b = this.i;
        if (b != 0) {
            if (b == 1) {
                z1x.P(obj);
            } else {
                if (b != 2) {
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                z1x.P(obj);
            }
            return Unit.f46060a;
        }
        z1x.P(obj);
        if (this.k.isEmpty()) {
            iun iunVar = iun.f15405a;
            this.j = kmqVar;
            this.i = (byte) 1;
            if (kmqVar.a(iunVar, this) == wneVar) {
                return wneVar;
            }
        }
        String strC = knf0Var.c();
        int iB = knf0Var.b();
        m2c0 m2c0VarA = ((x2c0) wduVar.e).a();
        vsg0 vsg0VarH0 = bkb.h0(30L, TimeUnit.SECONDS, new w600(this.m, this.n, this.o, m2c0VarA != null ? StringsKt.toIntOrNull(m2c0VarA.c) : null, iB, strC, this.p, this.q, wduVar, this.k, this.r, null));
        this.j = null;
        this.i = (byte) 2;
        if (slb.Q(kmqVar, vsg0VarH0, this) == wneVar) {
            return wneVar;
        }
        return Unit.f46060a;
    }
}
