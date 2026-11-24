package a;

import androidx.fragment.app.Fragment;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class dj3 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public boolean j;
    public Object k;
    public Object l;
    public Object m;
    public Object n;
    public Object o;
    public Object p;
    public /* synthetic */ Object q;
    public Object r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ dj3(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.l = obj;
        this.m = obj2;
        this.n = obj3;
        this.o = obj4;
        this.p = obj5;
        this.k = obj6;
        this.q = obj7;
        this.r = obj8;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        switch (this.i) {
            case 0:
                dj3 dj3Var = new dj3((ij3) this.p, yjeVar);
                dj3Var.q = obj;
                return dj3Var;
            case 1:
                dj3 dj3Var2 = new dj3((rrd) this.p, (String) this.q, (tw2) this.r, yjeVar);
                dj3Var2.k = obj;
                return dj3Var2;
            case 2:
                return new dj3((Function0) this.l, (List) this.m, (w6k) this.n, (List) this.o, (pz40) this.p, (pz40) this.k, (cgk0) this.q, (pz40) this.r, yjeVar, (byte) 2);
            case 3:
                return new dj3((r2w) this.q, (n3w) this.r, yjeVar);
            default:
                return new dj3((clz) this.l, (l7m0) this.m, (roq0) this.n, (lme0) this.o, (Fragment) this.p, (Function1) this.k, (Function0) this.q, (Function0) this.r, yjeVar, (byte) 4);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((dj3) create((arq) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 1:
                return ((dj3) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 2:
                return ((dj3) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 3:
                return ((dj3) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((dj3) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    /* JADX WARN: Code duplicated, block: B:123:0x03ad  */
    /* JADX WARN: Code duplicated, block: B:125:0x03c6  */
    /* JADX WARN: Code duplicated, block: B:126:0x03c8  */
    /* JADX WARN: Code duplicated, block: B:129:0x03d5  */
    /* JADX WARN: Code duplicated, block: B:132:0x03f5  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:126:0x03c8 -> B:127:0x03c9). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:129:0x03d5 -> B:128:0x03d3). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x00bc -> B:27:0x00c0). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:89:0x02f4 -> B:138:0x02f6). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:132:0x03f5
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // a.zw5
    public final java.lang.Object invokeSuspend(java.lang.Object r27) {
        /*
            Method dump skipped, instruction units count: 1028
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.dj3.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dj3(rrd rrdVar, String str, tw2 tw2Var, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 1;
        this.p = rrdVar;
        this.q = str;
        this.r = tw2Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dj3(r2w r2wVar, n3w n3wVar, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 3;
        this.q = r2wVar;
        this.r = n3wVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dj3(ij3 ij3Var, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 0;
        this.p = ij3Var;
    }
}
