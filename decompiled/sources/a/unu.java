package a;

import java.util.Collection;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class unu extends bnn0 implements Function2 {
    public wdu i;
    public Collection j;
    public Iterator k;
    public String l;
    public Collection m;
    public int n;
    public boolean o;
    public long p;
    public byte q;
    public /* synthetic */ Object r;
    public final /* synthetic */ wdu s;
    public final /* synthetic */ boolean t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public unu(yje yjeVar, wdu wduVar, boolean z) {
        super(2, yjeVar);
        this.s = wduVar;
        this.t = z;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        unu unuVar = new unu(yjeVar, this.s, this.t);
        unuVar.r = obj;
        return unuVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((unu) create((kmq) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
    }

    /* JADX WARN: Code duplicated, block: B:24:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:27:0x00cd  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x00cd -> B:28:0x00d2). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // a.zw5
    public final java.lang.Object invokeSuspend(java.lang.Object r23) {
        /*
            Method dump skipped, instruction units count: 290
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.unu.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
