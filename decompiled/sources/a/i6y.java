package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final class i6y extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public /* synthetic */ Object j;
    public final /* synthetic */ k6y k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i6y(k6y k6yVar, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = k6yVar;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        k6y k6yVar = this.k;
        switch (b) {
            case 0:
                i6y i6yVar = new i6y(k6yVar, yjeVar, (byte) 0);
                i6yVar.j = obj;
                return i6yVar;
            case 1:
                i6y i6yVar2 = new i6y(k6yVar, yjeVar, (byte) 1);
                i6yVar2.j = obj;
                return i6yVar2;
            case 2:
                i6y i6yVar3 = new i6y(k6yVar, yjeVar, (byte) 2);
                i6yVar3.j = obj;
                return i6yVar3;
            default:
                i6y i6yVar4 = new i6y(k6yVar, yjeVar, (byte) 3);
                i6yVar4.j = obj;
                return i6yVar4;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((i6y) create((r6y) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 1:
                return ((i6y) create((o6y) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 2:
                return ((i6y) create((t2y) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((i6y) create((l6y) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0215, code lost:
    
        if ((r0 instanceof a.p6y) != false) goto L33;
     */
    @Override // a.zw5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r17) {
        /*
            Method dump skipped, instruction units count: 552
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.i6y.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
