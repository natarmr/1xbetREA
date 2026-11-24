package a;

import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final class lah extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public qah j;
    public Map k;
    public Throwable l;
    public long m;
    public long n;
    public int o;
    public int p;
    public int q;
    public byte r;
    public /* synthetic */ Object s;
    public final /* synthetic */ qah t;
    public final /* synthetic */ jo20 u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ lah(qah qahVar, jo20 jo20Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.t = qahVar;
        this.u = jo20Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        jo20 jo20Var = this.u;
        qah qahVar = this.t;
        switch (b) {
            case 0:
                lah lahVar = new lah(qahVar, jo20Var, yjeVar, (byte) 0);
                lahVar.s = obj;
                return lahVar;
            case 1:
                lah lahVar2 = new lah(qahVar, jo20Var, yjeVar, (byte) 1);
                lahVar2.s = obj;
                return lahVar2;
            case 2:
                lah lahVar3 = new lah(qahVar, jo20Var, yjeVar, (byte) 2);
                lahVar3.s = obj;
                return lahVar3;
            default:
                lah lahVar4 = new lah(qahVar, jo20Var, yjeVar, (byte) 3);
                lahVar4.s = obj;
                return lahVar4;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        kmq kmqVar = (kmq) obj;
        yje yjeVar = (yje) obj2;
        switch (this.i) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
        }
        return ((lah) create(kmqVar, yjeVar)).invokeSuspend(Unit.f46060a);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(3:289|96|(1:99)) */
    /* JADX WARN: Can't wrap try/catch for region: R(3:303|160|(1:163)) */
    /* JADX WARN: Can't wrap try/catch for region: R(4:27|301|28|29) */
    /* JADX WARN: Can't wrap try/catch for region: R(7:220|293|221|222|305|236|237) */
    /* JADX WARN: Can't wrap try/catch for region: R(8:285|22|23|307|24|(4:27|301|28|29)|67|314) */
    /* JADX WARN: Can't wrap try/catch for region: R(9:295|228|283|229|230|231|287|232|(1:235)) */
    /* JADX WARN: Code duplicated, block: B:108:0x0249 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:109:0x024b  */
    /* JADX WARN: Code duplicated, block: B:111:0x0252  */
    /* JADX WARN: Code duplicated, block: B:113:0x0257  */
    /* JADX WARN: Code duplicated, block: B:114:0x0259  */
    /* JADX WARN: Code duplicated, block: B:117:0x025e  */
    /* JADX WARN: Code duplicated, block: B:120:0x027d  */
    /* JADX WARN: Code duplicated, block: B:122:0x0285  */
    /* JADX WARN: Code duplicated, block: B:124:0x028b  */
    /* JADX WARN: Code duplicated, block: B:126:0x0290  */
    /* JADX WARN: Code duplicated, block: B:127:0x0292  */
    /* JADX WARN: Code duplicated, block: B:130:0x0297  */
    /* JADX WARN: Code duplicated, block: B:133:0x02b7  */
    /* JADX WARN: Code duplicated, block: B:134:0x02bd  */
    /* JADX WARN: Code duplicated, block: B:135:0x02c2 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:136:0x02c4  */
    /* JADX WARN: Code duplicated, block: B:138:0x02ca  */
    /* JADX WARN: Code duplicated, block: B:163:0x0370  */
    /* JADX WARN: Code duplicated, block: B:173:0x03aa A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:174:0x03ac  */
    /* JADX WARN: Code duplicated, block: B:176:0x03b4  */
    /* JADX WARN: Code duplicated, block: B:178:0x03b9  */
    /* JADX WARN: Code duplicated, block: B:179:0x03bb  */
    /* JADX WARN: Code duplicated, block: B:182:0x03c0  */
    /* JADX WARN: Code duplicated, block: B:185:0x03df  */
    /* JADX WARN: Code duplicated, block: B:187:0x03e8  */
    /* JADX WARN: Code duplicated, block: B:189:0x03ee  */
    /* JADX WARN: Code duplicated, block: B:191:0x03f3  */
    /* JADX WARN: Code duplicated, block: B:192:0x03f5  */
    /* JADX WARN: Code duplicated, block: B:195:0x03fa  */
    /* JADX WARN: Code duplicated, block: B:198:0x041a  */
    /* JADX WARN: Code duplicated, block: B:199:0x0420  */
    /* JADX WARN: Code duplicated, block: B:200:0x0424 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:201:0x0426  */
    /* JADX WARN: Code duplicated, block: B:203:0x042c  */
    /* JADX WARN: Code duplicated, block: B:235:0x04f1  */
    /* JADX WARN: Code duplicated, block: B:252:0x053a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:253:0x053c  */
    /* JADX WARN: Code duplicated, block: B:255:0x0544  */
    /* JADX WARN: Code duplicated, block: B:257:0x0549  */
    /* JADX WARN: Code duplicated, block: B:258:0x054b  */
    /* JADX WARN: Code duplicated, block: B:261:0x0550  */
    /* JADX WARN: Code duplicated, block: B:264:0x056f  */
    /* JADX WARN: Code duplicated, block: B:266:0x0579  */
    /* JADX WARN: Code duplicated, block: B:268:0x0580  */
    /* JADX WARN: Code duplicated, block: B:270:0x0585  */
    /* JADX WARN: Code duplicated, block: B:271:0x0587  */
    /* JADX WARN: Code duplicated, block: B:274:0x058c  */
    /* JADX WARN: Code duplicated, block: B:277:0x05ac  */
    /* JADX WARN: Code duplicated, block: B:278:0x05b3  */
    /* JADX WARN: Code duplicated, block: B:279:0x05b8 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:27:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:280:0x05ba  */
    /* JADX WARN: Code duplicated, block: B:282:0x05c0  */
    /* JADX WARN: Code duplicated, block: B:285:0x008e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:289:0x01f5 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:295:0x04cf A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:303:0x034e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:41:0x00ea A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:42:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:45:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:47:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:48:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:51:0x0104  */
    /* JADX WARN: Code duplicated, block: B:55:0x0127  */
    /* JADX WARN: Code duplicated, block: B:57:0x0130  */
    /* JADX WARN: Code duplicated, block: B:59:0x0138  */
    /* JADX WARN: Code duplicated, block: B:61:0x013d  */
    /* JADX WARN: Code duplicated, block: B:62:0x013f  */
    /* JADX WARN: Code duplicated, block: B:65:0x0144  */
    /* JADX WARN: Code duplicated, block: B:68:0x0165  */
    /* JADX WARN: Code duplicated, block: B:69:0x016b  */
    /* JADX WARN: Code duplicated, block: B:70:0x0173  */
    /* JADX WARN: Code duplicated, block: B:72:0x0177  */
    /* JADX WARN: Code duplicated, block: B:74:0x017d  */
    /* JADX WARN: Code duplicated, block: B:99:0x0217  */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x023a, code lost:
    
        if (r2.a(r0, r24) == r7) goto L132;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x0242, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x027a, code lost:
    
        if (a.qcc.P(r9, r24) == r7) goto L132;
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x02b3, code lost:
    
        if (a.qcc.P(r9, r24) == r7) goto L132;
     */
    /* JADX WARN: Code restructure failed: missing block: B:166:0x0396, code lost:
    
        if (r2.a(r0, r24) == r7) goto L197;
     */
    /* JADX WARN: Code restructure failed: missing block: B:169:0x039e, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:170:0x039f, code lost:
    
        r19 = r3;
        r3 = r0;
        r0 = r19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:183:0x03dc, code lost:
    
        if (a.qcc.P(r10, r24) == r7) goto L197;
     */
    /* JADX WARN: Code restructure failed: missing block: B:196:0x0416, code lost:
    
        if (a.qcc.P(r10, r24) == r7) goto L197;
     */
    /* JADX WARN: Code restructure failed: missing block: B:238:0x0517, code lost:
    
        if (r2.a(r0, r24) == r7) goto L276;
     */
    /* JADX WARN: Code restructure failed: missing block: B:241:0x051f, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:243:0x0522, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:245:0x0524, code lost:
    
        r19 = r3;
        r3 = r0;
        r0 = r19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:246:0x052c, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:248:0x0530, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:262:0x056c, code lost:
    
        if (a.qcc.P(r10, r24) == r7) goto L276;
     */
    /* JADX WARN: Code restructure failed: missing block: B:275:0x05a8, code lost:
    
        if (a.qcc.P(r10, r24) == r7) goto L276;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00d5, code lost:
    
        if (r14.a(r0, r24) == r15) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00dd, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00df, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00e1, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00e2, code lost:
    
        r18 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0121, code lost:
    
        if (a.qcc.P(r9, r24) == r15) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0161, code lost:
    
        if (a.qcc.P(r9, r24) == r15) goto L67;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:121:0x0282 -> B:95:0x01f3). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:186:0x03e4 -> B:159:0x034c). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:265:0x0575 -> B:227:0x04cd). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:56:0x012c -> B:54:0x0124). Please report as a decompilation issue!!! */
    @Override // a.zw5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r25) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1484
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.lah.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
