package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final class u6h extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public boolean j;
    public final /* synthetic */ pz40 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u6h(boolean z, pz40 pz40Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.j = z;
        this.k = pz40Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        pz40 pz40Var = this.k;
        switch (b) {
            case 0:
                return new u6h(this.j, pz40Var, yjeVar, (byte) 0);
            case 1:
                u6h u6hVar = new u6h(pz40Var, yjeVar, (byte) 1);
                u6hVar.j = ((Boolean) obj).booleanValue();
                return u6hVar;
            case 2:
                u6h u6hVar2 = new u6h(pz40Var, yjeVar, (byte) 2);
                u6hVar2.j = ((Boolean) obj).booleanValue();
                return u6hVar2;
            case 3:
                return new u6h(pz40Var, yjeVar, (byte) 3);
            case 4:
                return new u6h(pz40Var, yjeVar, (byte) 4);
            case 5:
                return new u6h(pz40Var, yjeVar, (byte) 5);
            case 6:
                return new u6h(pz40Var, yjeVar, (byte) 6);
            case 7:
                return new u6h(pz40Var, yjeVar, (byte) 7);
            default:
                return new u6h(this.j, pz40Var, yjeVar, (byte) 8);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((u6h) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 1:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                return ((u6h) create(bool, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 2:
                Boolean bool2 = (Boolean) obj;
                bool2.booleanValue();
                return ((u6h) create(bool2, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 3:
                return ((u6h) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 4:
                return ((u6h) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 5:
                return ((u6h) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 6:
                return ((u6h) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 7:
                return ((u6h) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((u6h) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    /* JADX WARN: Code duplicated, block: B:40:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:42:0x00b0  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:41:0x00ae -> B:43:0x00b2). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // a.zw5
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            Method dump skipped, instruction units count: 376
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.u6h.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u6h(pz40 pz40Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = pz40Var;
    }
}
