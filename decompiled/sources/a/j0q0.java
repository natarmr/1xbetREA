package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final class j0q0 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public long j;
    public long k;
    public int l;
    public int m;
    public int n;
    public String o;
    public Throwable p;
    public byte q;
    public final /* synthetic */ String r;
    public Object s;
    public final /* synthetic */ Object t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j0q0(Object obj, String str, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.t = obj;
        this.r = str;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        String str = this.r;
        Object obj2 = this.t;
        switch (b) {
            case 0:
                return new j0q0((k0q0) obj2, str, yjeVar, (byte) 0);
            case 1:
                return new j0q0((ykv0) obj2, str, yjeVar, (byte) 1);
            default:
                return new j0q0((klv0) obj2, str, yjeVar, (byte) 2);
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
        }
        return ((j0q0) create(vneVar, yjeVar)).invokeSuspend(Unit.f46060a);
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 4 */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Unreachable block: B:339:0x05ce
        	at jadx.core.dex.visitors.blocks.BlockProcessor.checkForUnreachableBlocks(BlockProcessor.java:143)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:58)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:50)
        */
    @Override // a.zw5
    public final java.lang.Object invokeSuspend(java.lang.Object r44) {
        /*
            Method dump skipped, instruction units count: 1658
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.j0q0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
