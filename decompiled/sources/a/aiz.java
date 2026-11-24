package a;

import java.util.Collection;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
public final class aiz extends bnn0 implements Function1 {
    public final /* synthetic */ byte i;
    public Collection j;
    public Iterator k;
    public Collection l;
    public long m;
    public boolean n;
    public i3t0 o;
    public final /* synthetic */ i3t0 p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ aiz(i3t0 i3t0Var, yje yjeVar, byte b) {
        super(1, yjeVar);
        this.i = b;
        this.p = i3t0Var;
    }

    @Override // a.zw5
    public final yje create(yje yjeVar) {
        byte b = this.i;
        i3t0 i3t0Var = this.p;
        switch (b) {
            case 0:
                return new aiz((eiz) i3t0Var, yjeVar, (byte) 0);
            default:
                return new aiz((els0) i3t0Var, yjeVar, (byte) 1);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        yje yjeVar = (yje) obj;
        switch (this.i) {
            case 0:
                break;
        }
        return ((aiz) create(yjeVar)).invokeSuspend(Unit.f46060a);
    }

    /* JADX WARN: Code duplicated, block: B:47:0x019e  */
    /* JADX WARN: Code duplicated, block: B:49:0x01c4  */
    /* JADX WARN: Code duplicated, block: B:50:0x01c7  */
    /* JADX WARN: Code duplicated, block: B:53:0x01e0  */
    /* JADX WARN: Code duplicated, block: B:54:0x01e8  */
    /* JADX WARN: Code duplicated, block: B:56:0x01f1  */
    /* JADX WARN: Code duplicated, block: B:58:0x01f7  */
    /* JADX WARN: Code duplicated, block: B:60:0x01fb  */
    /* JADX WARN: Code duplicated, block: B:62:0x0201  */
    /* JADX WARN: Code duplicated, block: B:65:0x0210  */
    /* JADX WARN: Code duplicated, block: B:67:0x0220  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v11 */
    /* JADX WARN: Type inference failed for: r10v12 */
    /* JADX WARN: Type inference failed for: r10v8, types: [boolean, int] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x0083 -> B:16:0x0084). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:50:0x01c7 -> B:51:0x01c8). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // a.zw5
    public final java.lang.Object invokeSuspend(java.lang.Object r37) {
        /*
            Method dump skipped, instruction units count: 642
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.aiz.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
