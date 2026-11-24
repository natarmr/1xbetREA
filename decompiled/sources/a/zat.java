package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class zat extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public kzj j;
    public pbt k;
    public kzj l;
    public byte m;
    public /* synthetic */ Object n;
    public final /* synthetic */ pbt o;
    public final /* synthetic */ boolean p;
    public final /* synthetic */ String q;
    public final /* synthetic */ int r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ zat(byte b, int i, yje yjeVar, pbt pbtVar, String str, boolean z) {
        super(2, yjeVar);
        this.i = b;
        this.o = pbtVar;
        this.p = z;
        this.q = str;
        this.r = i;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        switch (this.i) {
            case 0:
                zat zatVar = new zat((byte) 0, this.r, yjeVar, this.o, this.q, this.p);
                zatVar.n = obj;
                return zatVar;
            default:
                zat zatVar2 = new zat((byte) 1, this.r, yjeVar, this.o, this.q, this.p);
                zatVar2.n = obj;
                return zatVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        vne vneVar = (vne) obj;
        yje yjeVar = (yje) obj2;
        switch (this.i) {
            case 0:
                break;
        }
        return ((zat) create(vneVar, yjeVar)).invokeSuspend(Unit.f46060a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0062, code lost:
    
        if (r0 == r15) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00a2, code lost:
    
        if (r0 == r15) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00fd, code lost:
    
        if (r0 == r15) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x013e, code lost:
    
        if (r0 == r15) goto L67;
     */
    @Override // a.zw5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r17) {
        /*
            Method dump skipped, instruction units count: 332
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.zat.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
