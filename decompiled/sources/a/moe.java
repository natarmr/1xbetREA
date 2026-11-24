package a;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final class moe extends bnn0 implements Function2 {
    public int i;
    public int j;
    public byte k;
    public /* synthetic */ Object l;
    public final /* synthetic */ Function2 m;
    public final /* synthetic */ List n;
    public final /* synthetic */ List o;
    public final /* synthetic */ int p;
    public final /* synthetic */ Function0 q;
    public final /* synthetic */ String r;
    public final /* synthetic */ long s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public moe(Function2 function2, List list, List list2, int i, Function0 function0, String str, long j, yje yjeVar) {
        super(2, yjeVar);
        this.m = function2;
        this.n = list;
        this.o = list2;
        this.p = i;
        this.q = function0;
        this.r = str;
        this.s = j;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        moe moeVar = new moe(this.m, this.n, this.o, this.p, this.q, this.r, this.s, yjeVar);
        moeVar.l = obj;
        return moeVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((moe) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0046  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x0046 -> B:48:0x00d3). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:47:0x00d1 -> B:48:0x00d3). Please report as a decompilation issue!!! */
    @Override // a.zw5
    public final Object invokeSuspend(Object obj) throws Exception {
        int i;
        Object next;
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
                int i3 = i;
                vne vneVar2 = vneVar;
                Iterator it = this.n.iterator();
                do {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                } while (!((Class) next).isInstance(e));
                Class cls = (Class) next;
                int i4 = i3 + 1;
                i2 = (i3 >= this.p || (cls != null ? cls.isInstance(e) : false) || (e instanceof zhi0 ? rz4.C(((zhi0) e).f44396a, this.o) : false)) ? 0 : 1;
                if (i2 == 0) {
                    throw e;
                }
                Function0 function0 = this.q;
                if (function0 != null) {
                    rwj rwjVar = tvk.f34603a;
                    sac.V(vneVar2, ske.e, null, ys10.f43147a, new wi1(null, function0), 10);
                }
                StringBuilder sbP = kng0.p(i4, "ALARM1 from ", this.r, " // ", " retry // delay ");
                long j = this.s;
                System.out.println((Object) brm0.k(j, " sec", sbP));
                long millis = TimeUnit.SECONDS.toMillis(j);
                this.l = vneVar2;
                this.i = i4;
                this.j = i2;
                this.k = (byte) 2;
                if (qcc.O(millis, this) != wneVar) {
                    vneVar = vneVar2;
                    i = i4;
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
