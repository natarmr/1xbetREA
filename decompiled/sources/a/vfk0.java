package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class vfk0 extends zzf0 implements Function2 {
    public long[] j;
    public int k;
    public int l;
    public byte m;
    public /* synthetic */ Object n;
    public final /* synthetic */ wfk0 o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vfk0(wfk0 wfk0Var, yje yjeVar) {
        super(2, yjeVar);
        this.o = wfk0Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        vfk0 vfk0Var = new vfk0(this.o, yjeVar);
        vfk0Var.n = obj;
        return vfk0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((vfk0) create((fgi0) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
    }

    /* JADX WARN: Code duplicated, block: B:22:0x007c  */
    /* JADX WARN: Code duplicated, block: B:24:0x0084  */
    /* JADX WARN: Code duplicated, block: B:27:0x009b  */
    /* JADX WARN: Code duplicated, block: B:30:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:32:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:34:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:36:0x00c5  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x0082 -> B:26:0x0099). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:36:0x00c5 -> B:37:0x00c6). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:27:0x009b
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // a.zw5
    public final java.lang.Object invokeSuspend(java.lang.Object r24) {
        /*
            Method dump skipped, instruction units count: 203
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.vfk0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
