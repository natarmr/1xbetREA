package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class ye1 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public vne j;
    public qgd k;
    public int l;
    public int m;
    public long n;
    public byte o;
    public /* synthetic */ Object p;
    public final /* synthetic */ qgd q;
    public final /* synthetic */ long r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ye1(qgd qgdVar, long j, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.q = qgdVar;
        this.r = j;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        switch (this.i) {
            case 0:
                ye1 ye1Var = new ye1(this.q, this.r, yjeVar, (byte) 0);
                ye1Var.p = obj;
                return ye1Var;
            default:
                ye1 ye1Var2 = new ye1(this.q, this.r, yjeVar, (byte) 1);
                ye1Var2.p = obj;
                return ye1Var2;
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
        return ((ye1) create(vneVar, yjeVar)).invokeSuspend(Unit.f46060a);
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 3 */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Unreachable block: B:137:0x026d
        	at jadx.core.dex.visitors.blocks.BlockProcessor.checkForUnreachableBlocks(BlockProcessor.java:143)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:58)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:50)
        */
    @Override // a.zw5
    public final java.lang.Object invokeSuspend(java.lang.Object r23) {
        /*
            Method dump skipped, instruction units count: 784
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.ye1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
