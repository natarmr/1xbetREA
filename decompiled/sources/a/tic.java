package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class tic extends zzf0 implements Function2 {
    public dpa0 j;
    public int k;
    public long l;
    public byte m;
    public /* synthetic */ Object n;
    public final /* synthetic */ boolean o;
    public final /* synthetic */ cgk0 p;
    public final /* synthetic */ pz40 q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tic(boolean z, cgk0 cgk0Var, pz40 pz40Var, yje yjeVar) {
        super(2, yjeVar);
        this.o = z;
        this.p = cgk0Var;
        this.q = pz40Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        tic ticVar = new tic(this.o, this.p, this.q, yjeVar);
        ticVar.n = obj;
        return ticVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((tic) create((inn0) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
    }

    /* JADX WARN: Code duplicated, block: B:47:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:85:0x0100 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:86:0x0105 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:87:? A[LOOP:1: B:45:0x00f0->B:87:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x0050 -> B:17:0x0053). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // a.zw5
    public final java.lang.Object invokeSuspend(java.lang.Object r21) {
        /*
            Method dump skipped, instruction units count: 480
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.tic.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
