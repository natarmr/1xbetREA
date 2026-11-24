package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class mee extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public long j;
    public boolean k;
    public /* synthetic */ Object l;
    public final /* synthetic */ Object m;
    public final /* synthetic */ Object n;
    public final /* synthetic */ Object o;
    public final /* synthetic */ Object p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mee(hw90 hw90Var, String str, long j, o9q0 o9q0Var, k7q0 k7q0Var, qe60 qe60Var, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 3;
        this.l = hw90Var;
        this.m = str;
        this.j = j;
        this.n = o9q0Var;
        this.o = k7q0Var;
        this.p = qe60Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        Object obj2 = this.p;
        Object obj3 = this.o;
        Object obj4 = this.n;
        Object obj5 = this.m;
        switch (b) {
            case 0:
                mee meeVar = new mee(obj5, obj4, obj3, this.j, obj2, yjeVar, (byte) 0);
                meeVar.l = obj;
                return meeVar;
            case 1:
                return new mee((mdm) this.l, (String) obj5, (pz40) obj4, (pz40) obj3, (pz40) obj2, yjeVar);
            case 2:
                mee meeVar2 = new mee(obj5, obj4, obj3, this.j, obj2, yjeVar, (byte) 2);
                meeVar2.l = obj;
                return meeVar2;
            default:
                return new mee((hw90) this.l, (String) obj5, this.j, (o9q0) obj4, (k7q0) obj3, (qe60) obj2, yjeVar);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((mee) create((rch0) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 1:
                return ((mee) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 2:
                return ((mee) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((mee) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    /* JADX WARN: Code duplicated, block: B:48:0x0137  */
    /* JADX WARN: Code duplicated, block: B:50:0x0160  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:49:0x015e -> B:51:0x0162). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // a.zw5
    public final java.lang.Object invokeSuspend(java.lang.Object r16) {
        /*
            Method dump skipped, instruction units count: 466
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.mee.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mee(mdm mdmVar, String str, pz40 pz40Var, pz40 pz40Var2, pz40 pz40Var3, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 1;
        this.l = mdmVar;
        this.m = str;
        this.n = pz40Var;
        this.o = pz40Var2;
        this.p = pz40Var3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ mee(Object obj, Object obj2, Object obj3, long j, Object obj4, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.m = obj;
        this.n = obj2;
        this.o = obj3;
        this.j = j;
        this.p = obj4;
    }
}
