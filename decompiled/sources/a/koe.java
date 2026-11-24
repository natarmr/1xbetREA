package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final class koe extends bnn0 implements Function2 {
    public int i;
    public int j;
    public byte k;
    public /* synthetic */ Object l;
    public final /* synthetic */ Function2 m;
    public final /* synthetic */ boolean n;
    public final /* synthetic */ int o;
    public final /* synthetic */ String p;
    public final /* synthetic */ long q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public koe(Function2 function2, boolean z, int i, String str, long j, yje yjeVar) {
        super(2, yjeVar);
        this.m = function2;
        this.n = z;
        this.o = i;
        this.p = str;
        this.q = j;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        koe koeVar = new koe(this.m, this.n, this.o, this.p, this.q, yjeVar);
        koeVar.l = obj;
        return koeVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((koe) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0042  */
    /* JADX WARN: Code duplicated, block: B:33:0x0064  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x0042 -> B:49:0x00aa). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:48:0x00a9 -> B:49:0x00aa). Please report as a decompilation issue!!! */
    @Override // a.zw5
    public final Object invokeSuspend(Object obj) throws Exception {
        int i;
        boolean z;
        int i2;
        Function2 function2;
        vne vneVar = (vne) this.l;
        wne wneVar = wne.f39444a;
        byte b = this.k;
        if (b == 0) {
            z1x.P(obj);
            i = 0;
            function2 = this.m;
            this.l = vneVar;
            this.i = i;
            this.j = 0;
            this.k = (byte) 1;
            if (function2.invoke(vneVar, this) != wneVar) {
                i2 = 0;
            }
            return wneVar;
        }
        if (b == 1) {
            i2 = this.j;
            i = this.i;
            try {
                z1x.P(obj);
            } catch (Exception e) {
                boolean z2 = e instanceof zhi0;
                zhi0 zhi0Var = z2 ? (zhi0) e : null;
                boolean z3 = zhi0Var != null ? zhi0Var.e : false;
                if (this.n) {
                    zhi0 zhi0Var2 = z2 ? (zhi0) e : null;
                    if (zhi0Var2 != null) {
                        z = zhi0Var2.f;
                    } else {
                        z = false;
                    }
                } else {
                    z = false;
                }
                int i3 = i + 1;
                i2 = (z3 || z || !(i < this.o)) ? 0 : 1;
                StringBuilder sbP = kng0.p(i3, "ALARM1 from ", this.p, " // ", " retry // delay ");
                long j = this.q;
                System.out.println((Object) brm0.k(j, " sec", sbP));
                if (i2 == 0) {
                    throw e;
                }
                uen uenVar = wen.b;
                long jW0 = ibc.w0(j, bfn.SECONDS);
                this.l = vneVar;
                this.i = i3;
                this.j = i2;
                this.k = (byte) 2;
                if (qcc.P(jW0, this) != wneVar) {
                    i = i3;
                }
                return wneVar;
            }
        } else {
            if (b != 2) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            i2 = this.j;
            i = this.i;
            z1x.P(obj);
        }
        if (i2 != 0 || !d5c.R(vneVar)) {
            return Unit.f46060a;
        }
        function2 = this.m;
        this.l = vneVar;
        this.i = i;
        this.j = 0;
        this.k = (byte) 1;
        if (function2.invoke(vneVar, this) != wneVar) {
            i2 = 0;
            if (i2 != 0) {
            }
            return Unit.f46060a;
        }
        return wneVar;
    }
}
