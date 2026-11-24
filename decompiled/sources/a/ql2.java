package a;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;

/* JADX INFO: loaded from: classes4.dex */
public final class ql2 extends bnn0 implements ydr {
    public final /* synthetic */ byte i;
    public HashMap j;
    public Collection k;
    public Iterator l;
    public pbs0 m;
    public Collection n;
    public boolean o;
    public /* synthetic */ List p;
    public /* synthetic */ List q;
    public /* synthetic */ int r;
    public i3t0 s;
    public final /* synthetic */ i3t0 t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ql2(i3t0 i3t0Var, yje yjeVar, byte b) {
        super(4, yjeVar);
        this.i = b;
        this.t = i3t0Var;
    }

    /* JADX WARN: Code duplicated, block: B:127:0x0250 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:74:0x0235  */
    /* JADX WARN: Code duplicated, block: B:77:0x024b A[LOOP:5: B:72:0x022f->B:77:0x024b, LOOP_END] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x00e6 -> B:30:0x00ea). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x00f3 -> B:35:0x00f6). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:84:0x0289 -> B:85:0x028d). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // a.zw5
    public final java.lang.Object invokeSuspend(java.lang.Object r32) {
        /*
            Method dump skipped, instruction units count: 852
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.ql2.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // a.ydr
    public final Object j(Object obj, Object obj2, Object obj3, Object obj4) {
        byte b = this.i;
        i3t0 i3t0Var = this.t;
        List list = (List) obj;
        List list2 = (List) obj2;
        int iIntValue = ((Number) obj3).intValue();
        yje yjeVar = (yje) obj4;
        switch (b) {
            case 0:
                ql2 ql2Var = new ql2((ul2) i3t0Var, yjeVar, (byte) 0);
                ql2Var.p = list;
                ql2Var.q = list2;
                ql2Var.r = iIntValue;
                return ql2Var.invokeSuspend(Unit.f46060a);
            default:
                ql2 ql2Var2 = new ql2((v360) i3t0Var, yjeVar, (byte) 1);
                ql2Var2.p = list;
                ql2Var2.q = list2;
                ql2Var2.r = iIntValue;
                return ql2Var2.invokeSuspend(Unit.f46060a);
        }
    }
}
