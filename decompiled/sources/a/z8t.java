package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class z8t extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public byte j;
    public double k;
    public Object l;
    public final /* synthetic */ Object m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z8t(Object obj, Object obj2, double d, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.l = obj;
        this.m = obj2;
        this.k = d;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        Object obj2 = this.m;
        switch (b) {
            case 0:
                return new z8t((i7t) this.l, (a9t) obj2, this.k, yjeVar, (byte) 0);
            case 1:
                return new z8t((q5w) this.l, (n3w) obj2, this.k, yjeVar, (byte) 1);
            case 2:
                return new z8t((naw) this.l, (n3w) obj2, this.k, yjeVar, (byte) 2);
            case 3:
                return new z8t((a2y) obj2, this.k, yjeVar, (byte) 3);
            case 4:
                return new z8t((e6y) obj2, this.k, yjeVar, (byte) 4);
            case 5:
                return new z8t((eh70) obj2, yjeVar, (byte) 5);
            case 6:
                return new z8t((ji70) obj2, yjeVar, (byte) 6);
            default:
                return new z8t((wyj0) obj2, yjeVar, (byte) 7);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        vne vneVar = (vne) obj;
        yje yjeVar = (yje) obj2;
        switch (this.i) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
        }
        return ((z8t) create(vneVar, yjeVar)).invokeSuspend(Unit.f46060a);
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0240  */
    /* JADX WARN: Code duplicated, block: B:103:0x0247  */
    /* JADX WARN: Code duplicated, block: B:25:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:28:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:31:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:34:0x0100  */
    /* JADX WARN: Code duplicated, block: B:55:0x0185  */
    /* JADX WARN: Code duplicated, block: B:56:0x0188  */
    /* JADX WARN: Code duplicated, block: B:59:0x018e  */
    /* JADX WARN: Code duplicated, block: B:60:0x0191  */
    /* JADX WARN: Code duplicated, block: B:66:0x01a2  */
    /* JADX WARN: Code duplicated, block: B:88:0x0214  */
    /* JADX WARN: Code duplicated, block: B:92:0x022a  */
    /* JADX WARN: Code duplicated, block: B:93:0x022d  */
    /* JADX WARN: Code duplicated, block: B:96:0x0233  */
    /* JADX WARN: Code duplicated, block: B:97:0x0236  */
    /* JADX WARN: Code restructure failed: missing block: B:160:0x0425, code lost:
    
        if (a.qjj.d0(r0, r1, r5) == r13) goto L161;
     */
    /* JADX WARN: Code restructure failed: missing block: B:176:0x0485, code lost:
    
        if (a.qjj.d0(r0, r1, r5) == r12) goto L170;
     */
    /* JADX WARN: Code restructure failed: missing block: B:195:0x055c, code lost:
    
        if (r1 == r4) goto L196;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x01f8, code lost:
    
        if (r1 == r0) goto L87;
     */
    @Override // a.zw5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r33) throws java.lang.Exception {
        /*
            Method dump skipped, instruction units count: 1496
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.z8t.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z8t(i3t0 i3t0Var, double d, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.m = i3t0Var;
        this.k = d;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z8t(w46 w46Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.m = w46Var;
    }
}
