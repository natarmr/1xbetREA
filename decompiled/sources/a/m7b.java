package a;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final class m7b extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public byte j;
    public /* synthetic */ Object k;
    public final /* synthetic */ y7b l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m7b(y7b y7bVar, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.l = y7bVar;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        y7b y7bVar = this.l;
        switch (b) {
            case 0:
                m7b m7bVar = new m7b(y7bVar, yjeVar, (byte) 0);
                m7bVar.k = obj;
                return m7bVar;
            default:
                m7b m7bVar2 = new m7b(y7bVar, yjeVar, (byte) 1);
                m7bVar2.k = obj;
                return m7bVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((m7b) create((xvm0) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((m7b) create((List) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0117, code lost:
    
        if (r2.a(r3, r27) == r1) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0237, code lost:
    
        if (r2.i(r4, r27) == r1) goto L84;
     */
    @Override // a.zw5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r28) {
        /*
            Method dump skipped, instruction units count: 642
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.m7b.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
