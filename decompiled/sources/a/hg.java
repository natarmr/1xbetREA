package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final class hg extends bnn0 implements Function2 {
    public t33 i;
    public t33 j;
    public float k;
    public float l;
    public float m;
    public byte n;
    public /* synthetic */ Object o;
    public final /* synthetic */ boolean p;
    public final /* synthetic */ t33 q;
    public final /* synthetic */ pz40 r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hg(boolean z, t33 t33Var, pz40 pz40Var, yje yjeVar) {
        super(2, yjeVar);
        this.p = z;
        this.q = t33Var;
        this.r = pz40Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        hg hgVar = new hg(this.p, this.q, this.r, yjeVar);
        hgVar.o = obj;
        return hgVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((hg) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
    }

    /* JADX WARN: Code duplicated, block: B:26:0x00a0 A[PHI: r0 r1 r2 r3
  0x00a0: PHI (r0v7 a.vne) = (r0v1 a.vne), (r0v3 a.vne), (r0v1 a.vne) binds: [B:25:0x009e, B:37:0x0105, B:7:0x0016] A[DONT_GENERATE, DONT_INLINE]
  0x00a0: PHI (r1v14 float) = (r1v8 float), (r1v10 float), (r1v17 float) binds: [B:25:0x009e, B:37:0x0105, B:7:0x0016] A[DONT_GENERATE, DONT_INLINE]
  0x00a0: PHI (r2v23 float) = (r2v17 float), (r2v18 float), (r2v26 float) binds: [B:25:0x009e, B:37:0x0105, B:7:0x0016] A[DONT_GENERATE, DONT_INLINE]
  0x00a0: PHI (r3v9 float) = (r3v3 float), (r3v4 float), (r3v12 float) binds: [B:25:0x009e, B:37:0x0105, B:7:0x0016] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:28:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:31:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:35:0x00ed  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:37:0x0105 -> B:26:0x00a0). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // a.zw5
    public final java.lang.Object invokeSuspend(java.lang.Object r17) {
        /*
            Method dump skipped, instruction units count: 270
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.hg.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
