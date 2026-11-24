package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class q1w extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public /* synthetic */ Object j;
    public final /* synthetic */ s1w k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q1w(s1w s1wVar, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = s1wVar;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        s1w s1wVar = this.k;
        switch (b) {
            case 0:
                q1w q1wVar = new q1w(s1wVar, yjeVar, (byte) 0);
                q1wVar.j = obj;
                return q1wVar;
            case 1:
                q1w q1wVar2 = new q1w(s1wVar, yjeVar, (byte) 1);
                q1wVar2.j = obj;
                return q1wVar2;
            case 2:
                q1w q1wVar3 = new q1w(s1wVar, yjeVar, (byte) 2);
                q1wVar3.j = obj;
                return q1wVar3;
            case 3:
                q1w q1wVar4 = new q1w(s1wVar, yjeVar, (byte) 3);
                q1wVar4.j = obj;
                return q1wVar4;
            case 4:
                q1w q1wVar5 = new q1w(s1wVar, yjeVar, (byte) 4);
                q1wVar5.j = obj;
                return q1wVar5;
            case 5:
                q1w q1wVar6 = new q1w(s1wVar, yjeVar, (byte) 5);
                q1wVar6.j = obj;
                return q1wVar6;
            default:
                q1w q1wVar7 = new q1w(s1wVar, yjeVar, (byte) 6);
                q1wVar7.j = obj;
                return q1wVar7;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((q1w) create((s4w) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 1:
                return ((q1w) create((t4w) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 2:
                return ((q1w) create((h7d) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 3:
                return ((q1w) create((s9w) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 4:
                return ((q1w) create((p9w) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 5:
                return ((q1w) create((gn5) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((q1w) create((l9h0) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:133:0x0300, code lost:
    
        if ((r0 instanceof a.fn5) != false) goto L134;
     */
    @Override // a.zw5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r35) throws java.lang.Exception {
        /*
            Method dump skipped, instruction units count: 3008
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.q1w.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
