package a;

import java.util.Set;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final class p4m extends bnn0 implements Function2 {
    public final /* synthetic */ byte i = 2;
    public byte j;
    public /* synthetic */ boolean k;
    public int l;
    public Object m;
    public final /* synthetic */ Object n;
    public final /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p4m(j700 j700Var, ouu ouuVar, int i, Set set, yje yjeVar) {
        super(2, yjeVar);
        this.m = j700Var;
        this.n = ouuVar;
        this.l = i;
        this.o = set;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        Object obj2 = this.o;
        Object obj3 = this.n;
        switch (b) {
            case 0:
                return new p4m(this.k, (rah0) this.m, (pz40) obj3, (pz40) obj2, yjeVar);
            case 1:
                p4m p4mVar = new p4m((j700) this.m, (ouu) obj3, this.l, (Set) obj2, yjeVar);
                p4mVar.k = ((Boolean) obj).booleanValue();
                return p4mVar;
            default:
                return new p4m((bs60) obj3, (String) obj2, this.k, this.l, yjeVar);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((p4m) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 1:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                return ((p4m) create(bool, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((p4m) create((Pair) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    /* JADX WARN: Code duplicated, block: B:158:0x03db A[PHI: r2
  0x03db: PHI (r2v11 int) = (r2v10 int), (r2v16 int) binds: [B:156:0x03d8, B:144:0x037f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:160:0x03e3  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:156:0x03d8 -> B:158:0x03db). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // a.zw5
    public final java.lang.Object invokeSuspend(java.lang.Object r28) {
        /*
            Method dump skipped, instruction units count: 1084
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.p4m.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p4m(bs60 bs60Var, String str, boolean z, int i, yje yjeVar) {
        super(2, yjeVar);
        this.n = bs60Var;
        this.o = str;
        this.k = z;
        this.l = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p4m(boolean z, rah0 rah0Var, pz40 pz40Var, pz40 pz40Var2, yje yjeVar) {
        super(2, yjeVar);
        this.k = z;
        this.m = rah0Var;
        this.n = pz40Var;
        this.o = pz40Var2;
    }
}
