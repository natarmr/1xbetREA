package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.xplatform.feature.fin_bet.impl.makebet.presentation.make_bet.ui_model.StepInputUiModel;

/* JADX INFO: loaded from: classes4.dex */
public final class hxj0 extends bnn0 implements Function2 {
    public Object i;
    public ql5 j;
    public yxj0 k;
    public Object l;
    public StepInputUiModel m;
    public String n;
    public double o;
    public double p;
    public double q;
    public double r;
    public boolean s;
    public int t;
    public byte u;
    public final /* synthetic */ yxj0 v;
    public final /* synthetic */ ql5 w;
    public final /* synthetic */ double x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hxj0(yxj0 yxj0Var, ql5 ql5Var, double d, yje yjeVar) {
        super(2, yjeVar);
        this.v = yxj0Var;
        this.w = ql5Var;
        this.x = d;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        return new hxj0(this.v, this.w, this.x, yjeVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((hxj0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
    }

    /* JADX WARN: Code duplicated, block: B:34:0x00de  */
    /* JADX WARN: Code duplicated, block: B:35:0x0105  */
    /* JADX WARN: Code duplicated, block: B:38:0x0137  */
    /* JADX WARN: Code duplicated, block: B:46:0x017c  */
    /* JADX WARN: Code duplicated, block: B:48:0x017f  */
    /* JADX WARN: Code duplicated, block: B:49:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x00de -> B:44:0x0174). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x0137 -> B:39:0x014d). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // a.zw5
    public final java.lang.Object invokeSuspend(java.lang.Object r40) {
        /*
            Method dump skipped, instruction units count: 391
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.hxj0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
