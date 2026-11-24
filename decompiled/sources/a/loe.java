package a;

import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final class loe extends bnn0 implements Function2 {
    public int i;
    public int j;
    public byte k;
    public /* synthetic */ Object l;
    public final /* synthetic */ Function2 m;
    public final /* synthetic */ byte n;
    public final /* synthetic */ String o;
    public final /* synthetic */ long p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public loe(Function2 function2, int i, String str, long j, yje yjeVar) {
        super(2, yjeVar);
        this.m = function2;
        this.n = i;
        this.o = str;
        this.p = j;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        loe loeVar = new loe(this.m, this.n, this.o, this.p, yjeVar);
        loeVar.l = obj;
        return loeVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((loe) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0040  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x0040 -> B:28:0x007e). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x007b -> B:28:0x007e). Please report as a decompilation issue!!! */
    @Override // a.zw5
    public final Object invokeSuspend(Object obj) throws Exception {
        int i;
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
                int i3 = i + 1;
                int i4 = i < this.n ? 1 : 0;
                if (i4 == 0) {
                    throw e;
                }
                StringBuilder sbP = kng0.p(i3, "ALARM1 from ", this.o, " // ", " retry // delay ");
                long j = this.p;
                System.out.println((Object) brm0.k(j, " sec", sbP));
                long millis = TimeUnit.SECONDS.toMillis(j);
                this.l = vneVar;
                this.i = i3;
                this.j = i4;
                this.k = (byte) 2;
                if (qcc.O(millis, this) != wneVar) {
                    int i5 = i4;
                    i = i3;
                    i2 = i5;
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
