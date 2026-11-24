package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final class nor extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public byte j;
    public final /* synthetic */ long k;
    public final /* synthetic */ boolean l;
    public final /* synthetic */ long m;
    public final /* synthetic */ long n;
    public final /* synthetic */ boolean o;
    public final /* synthetic */ diu0 p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nor(ncl0 ncl0Var, long j, long j2, boolean z, long j3, boolean z2, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 4;
        this.p = ncl0Var;
        this.k = j;
        this.m = j2;
        this.l = z;
        this.n = j3;
        this.o = z2;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        diu0 diu0Var = this.p;
        switch (b) {
            case 0:
                return new nor((spr) diu0Var, this.k, this.l, this.m, this.n, this.o, yjeVar, (byte) 0);
            case 1:
                return new nor((k4s) diu0Var, this.k, this.l, this.m, this.n, this.o, yjeVar, (byte) 1);
            case 2:
                return new nor((g9s) diu0Var, this.k, this.l, this.m, this.n, this.o, yjeVar, (byte) 2);
            case 3:
                return new nor((yks) diu0Var, this.k, this.l, this.m, this.n, this.o, yjeVar, (byte) 3);
            default:
                return new nor((ncl0) diu0Var, this.k, this.m, this.l, this.n, this.o, yjeVar);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        vne vneVar = (vne) obj;
        yje yjeVar = (yje) obj2;
        switch (this.i) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
        }
        return ((nor) create(vneVar, yjeVar)).invokeSuspend(Unit.f46060a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x008b, code lost:
    
        if (a.slb.N(r2, r19) == r14) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0106, code lost:
    
        if (a.slb.N(r2, r19) == r15) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0176, code lost:
    
        if (a.slb.N(r2, r19) == r15) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x01e0, code lost:
    
        if (a.slb.N(r2, r19) == r15) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0250, code lost:
    
        if (a.slb.N(r2, r19) == r15) goto L86;
     */
    @Override // a.zw5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r20) {
        /*
            Method dump skipped, instruction units count: 612
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.nor.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ nor(i3t0 i3t0Var, long j, boolean z, long j2, long j3, boolean z2, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.p = i3t0Var;
        this.k = j;
        this.l = z;
        this.m = j2;
        this.n = j3;
        this.o = z2;
    }
}
