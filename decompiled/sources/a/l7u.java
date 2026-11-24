package a;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;

/* JADX INFO: loaded from: classes4.dex */
public final class l7u extends bnn0 implements ydr {
    public List i;
    public a6u j;
    public Collection k;
    public Iterator l;
    public Collection m;
    public boolean n;
    public /* synthetic */ List o;
    public /* synthetic */ boolean p;
    public /* synthetic */ String q;
    public final /* synthetic */ List r;
    public final /* synthetic */ a6u s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l7u(List list, a6u a6uVar, yje yjeVar) {
        super(4, yjeVar);
        this.r = list;
        this.s = a6uVar;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0099  */
    /* JADX WARN: Code duplicated, block: B:27:0x00c8 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:28:0x00c9  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x00c9 -> B:29:0x00ca). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // a.zw5
    public final java.lang.Object invokeSuspend(java.lang.Object r18) {
        /*
            Method dump skipped, instruction units count: 267
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.l7u.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // a.ydr
    public final Object j(Object obj, Object obj2, Object obj3, Object obj4) {
        boolean zBooleanValue = ((Boolean) obj2).booleanValue();
        l7u l7uVar = new l7u(this.r, this.s, (yje) obj4);
        l7uVar.o = (List) obj;
        l7uVar.p = zBooleanValue;
        l7uVar.q = (String) obj3;
        return l7uVar.invokeSuspend(Unit.f46060a);
    }
}
