package a;

import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class jo6 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public ArrayList j;
    public ch20 k;
    public double l;
    public byte m;
    public final /* synthetic */ boolean n;
    public final /* synthetic */ long o;
    public final /* synthetic */ diu0 p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ jo6(byte b, long j, yje yjeVar, diu0 diu0Var, boolean z) {
        super(2, yjeVar);
        this.i = b;
        this.p = diu0Var;
        this.n = z;
        this.o = j;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        diu0 diu0Var = this.p;
        switch (b) {
            case 0:
                return new jo6((byte) 0, this.o, yjeVar, (po6) diu0Var, this.n);
            default:
                return new jo6((byte) 1, this.o, yjeVar, (vp6) diu0Var, this.n);
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
        return ((jo6) create(vneVar, yjeVar)).invokeSuspend(Unit.f46060a);
    }

    /* JADX WARN: Code duplicated, block: B:22:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:23:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:46:0x0189  */
    /* JADX WARN: Code duplicated, block: B:47:0x018e  */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00cf, code lost:
    
        if (r0 == r13) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x01a5, code lost:
    
        if (r1 == r14) goto L50;
     */
    @Override // a.zw5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r29) {
        /*
            Method dump skipped, instruction units count: 472
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.jo6.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
