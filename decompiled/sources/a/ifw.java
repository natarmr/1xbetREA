package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class ifw extends bnn0 implements Function2 {
    public kmq i;
    public long j;
    public long k;
    public byte l;
    public /* synthetic */ Object m;
    public final /* synthetic */ long n;
    public final /* synthetic */ fdw o;
    public final /* synthetic */ h7w p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ifw(long j, fdw fdwVar, h7w h7wVar, yje yjeVar) {
        super(2, yjeVar);
        this.n = j;
        this.o = fdwVar;
        this.p = h7wVar;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        ifw ifwVar = new ifw(this.n, this.o, this.p, yjeVar);
        ifwVar.m = obj;
        return ifwVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((ifw) create((kmq) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(7:19|20|21|53|29|(2:32|40)|46) */
    /* JADX WARN: Code duplicated, block: B:25:0x0072 A[Catch: all -> 0x004d, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x004d, blocks: (B:25:0x0072, B:15:0x0048, B:20:0x0055), top: B:51:0x0013 }] */
    /* JADX WARN: Code duplicated, block: B:28:0x008a  */
    /* JADX WARN: Code duplicated, block: B:32:0x009c  */
    /* JADX WARN: Code duplicated, block: B:37:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:44:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:49:0x00e9  */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x009e, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x009f, code lost:
    
        r2 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00c9, code lost:
    
        if (a.qcc.O(r12, r16) == r3) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00e3, code lost:
    
        if (r2.a(r0, r16) == r3) goto L46;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:41:0x00c9 -> B:43:0x00cc). Please report as a decompilation issue!!! */
    @Override // a.zw5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r17) {
        /*
            Method dump skipped, instruction units count: 236
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.ifw.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
