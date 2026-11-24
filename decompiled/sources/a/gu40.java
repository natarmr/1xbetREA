package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class gu40 extends bnn0 implements Function2 {
    public hie0 i;
    public hie0 j;
    public int k;
    public byte l;
    public /* synthetic */ Object m;
    public final /* synthetic */ jie0 n;
    public final /* synthetic */ mie0 o;
    public final /* synthetic */ mie0 p;
    public final /* synthetic */ float q;
    public final /* synthetic */ iu40 r;
    public final /* synthetic */ float s;
    public final /* synthetic */ sch0 t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gu40(jie0 jie0Var, mie0 mie0Var, mie0 mie0Var2, float f, iu40 iu40Var, float f2, sch0 sch0Var, yje yjeVar) {
        super(2, yjeVar);
        this.n = jie0Var;
        this.o = mie0Var;
        this.p = mie0Var2;
        this.q = f;
        this.r = iu40Var;
        this.s = f2;
        this.t = sch0Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        gu40 gu40Var = new gu40(this.n, this.o, this.p, this.q, this.r, this.s, this.t, yjeVar);
        gu40Var.m = obj;
        return gu40Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((gu40) create((rch0) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0078  */
    /* JADX WARN: Code duplicated, block: B:18:0x009a  */
    /* JADX WARN: Code duplicated, block: B:20:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:43:0x01c9  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:36:0x0192 -> B:37:0x0193). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // a.zw5
    public final java.lang.Object invokeSuspend(java.lang.Object r23) {
        /*
            Method dump skipped, instruction units count: 472
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.gu40.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
