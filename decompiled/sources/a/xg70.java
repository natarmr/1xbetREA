package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class xg70 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public ql5 j;
    public iie0 k;
    public int l;
    public int m;
    public byte n;
    public final /* synthetic */ double o;
    public final /* synthetic */ w46 p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ xg70(w46 w46Var, double d, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.p = w46Var;
        this.o = d;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        w46 w46Var = this.p;
        switch (b) {
            case 0:
                return new xg70((eh70) w46Var, this.o, yjeVar, (byte) 0);
            default:
                return new xg70((ji70) w46Var, this.o, yjeVar, (byte) 1);
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
        return ((xg70) create(vneVar, yjeVar)).invokeSuspend(Unit.f46060a);
    }

    /* JADX WARN: Code duplicated, block: B:103:0x01da A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:106:0x01e1  */
    /* JADX WARN: Code duplicated, block: B:107:0x01e4  */
    /* JADX WARN: Code duplicated, block: B:109:0x01e8  */
    /* JADX WARN: Code duplicated, block: B:110:0x01eb  */
    /* JADX WARN: Code duplicated, block: B:112:0x01ef  */
    /* JADX WARN: Code duplicated, block: B:113:0x01f2  */
    /* JADX WARN: Code duplicated, block: B:115:0x01f6  */
    /* JADX WARN: Code duplicated, block: B:116:0x01f9  */
    /* JADX WARN: Code duplicated, block: B:119:0x0203  */
    /* JADX WARN: Code duplicated, block: B:122:0x020a  */
    /* JADX WARN: Code duplicated, block: B:29:0x0099  */
    /* JADX WARN: Code duplicated, block: B:36:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:43:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:44:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:46:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:47:0x00db  */
    /* JADX WARN: Code duplicated, block: B:49:0x00df  */
    /* JADX WARN: Code duplicated, block: B:50:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:52:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:53:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:59:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:80:0x0172  */
    /* JADX WARN: Code duplicated, block: B:81:0x0174  */
    /* JADX WARN: Code duplicated, block: B:84:0x0187  */
    /* JADX WARN: Code duplicated, block: B:85:0x0189  */
    /* JADX WARN: Code duplicated, block: B:89:0x019f  */
    /* JADX WARN: Code duplicated, block: B:92:0x01a9  */
    /* JADX WARN: Code duplicated, block: B:97:0x01c7  */
    /* JADX WARN: Code duplicated, block: B:99:0x01cf  */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0155, code lost:
    
        if (r6 == r8) goto L88;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // a.zw5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r33) throws java.lang.Exception {
        /*
            Method dump skipped, instruction units count: 558
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.xg70.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
