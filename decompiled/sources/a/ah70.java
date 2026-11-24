package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class ah70 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public iie0 j;
    public int k;
    public int l;
    public byte m;
    public final /* synthetic */ double n;
    public final /* synthetic */ w46 o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ah70(w46 w46Var, double d, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.o = w46Var;
        this.n = d;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        w46 w46Var = this.o;
        switch (b) {
            case 0:
                return new ah70((eh70) w46Var, this.n, yjeVar, (byte) 0);
            default:
                return new ah70((ji70) w46Var, this.n, yjeVar, (byte) 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        vne vneVar = (vne) obj;
        yje yjeVar = (yje) obj2;
        switch (this.i) {
            case 0:
                break;
        }
        return ((ah70) create(vneVar, yjeVar)).invokeSuspend(Unit.f46060a);
    }

    /* JADX WARN: Code duplicated, block: B:102:0x01b4  */
    /* JADX WARN: Code duplicated, block: B:29:0x0092  */
    /* JADX WARN: Code duplicated, block: B:33:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:34:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:36:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:37:0x00af  */
    /* JADX WARN: Code duplicated, block: B:39:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:40:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:42:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:43:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:49:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:70:0x0142  */
    /* JADX WARN: Code duplicated, block: B:71:0x0144  */
    /* JADX WARN: Code duplicated, block: B:74:0x0157  */
    /* JADX WARN: Code duplicated, block: B:75:0x0159  */
    /* JADX WARN: Code duplicated, block: B:79:0x016d  */
    /* JADX WARN: Code duplicated, block: B:82:0x0178  */
    /* JADX WARN: Code duplicated, block: B:86:0x018b  */
    /* JADX WARN: Code duplicated, block: B:87:0x018e  */
    /* JADX WARN: Code duplicated, block: B:89:0x0192  */
    /* JADX WARN: Code duplicated, block: B:90:0x0195  */
    /* JADX WARN: Code duplicated, block: B:92:0x0199  */
    /* JADX WARN: Code duplicated, block: B:93:0x019c  */
    /* JADX WARN: Code duplicated, block: B:95:0x01a0  */
    /* JADX WARN: Code duplicated, block: B:96:0x01a3  */
    /* JADX WARN: Code duplicated, block: B:99:0x01ad  */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0127, code lost:
    
        if (r6 == r8) goto L78;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // a.zw5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r34) throws java.lang.Exception {
        /*
            Method dump skipped, instruction units count: 472
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.ah70.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
