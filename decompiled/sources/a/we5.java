package a;

import java.io.File;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class we5 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public byte j;
    public Object k;
    public Object l;
    public /* synthetic */ Object m;
    public long n;
    public Object o;
    public final /* synthetic */ Object p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ we5(ze5 ze5Var, String str, File file, long j, String str2, Object obj, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = ze5Var;
        this.l = str;
        this.m = file;
        this.n = j;
        this.o = str2;
        this.p = obj;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        Object obj2 = this.p;
        switch (b) {
            case 0:
                return new we5((ze5) this.k, (String) this.l, (File) this.m, this.n, (String) this.o, (rwn) obj2, yjeVar, (byte) 0);
            case 1:
                return new we5((ze5) this.k, (String) this.l, (File) this.m, this.n, (String) this.o, (xwn) obj2, yjeVar, (byte) 1);
            case 2:
                we5 we5Var = new we5((ieu) obj2, this.n, (String) this.l, yjeVar);
                we5Var.m = obj;
                return we5Var;
            case 3:
                we5 we5Var2 = new we5((wdu) this.m, (gu1) obj2, yjeVar, (byte) 3);
                we5Var2.o = obj;
                return we5Var2;
            default:
                we5 we5Var3 = new we5((wdu) this.m, (gu1) obj2, yjeVar, (byte) 4);
                we5Var3.o = obj;
                return we5Var3;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((we5) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 1:
                return ((we5) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 2:
                return ((we5) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 3:
                return ((we5) create((kmq) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((we5) create((kmq) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x0265, code lost:
    
        if (r0.q(r12, r11, r5) == r14) goto L101;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0099, code lost:
    
        if (r14.a(r0, r5) == r11) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0126, code lost:
    
        if (r7.a(r0, r5) == r11) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x019a, code lost:
    
        if (r0 == r3) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x01fc, code lost:
    
        if (r0.s(r12, r11, r5) == r14) goto L78;
     */
    @Override // a.zw5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r18) {
        /*
            Method dump skipped, instruction units count: 646
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.we5.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ we5(wdu wduVar, gu1 gu1Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.m = wduVar;
        this.p = gu1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public we5(ieu ieuVar, long j, String str, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 2;
        this.p = ieuVar;
        this.n = j;
        this.l = str;
    }
}
