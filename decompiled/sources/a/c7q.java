package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final class c7q extends bnn0 implements Function2 {
    public long i;
    public long j;
    public int k;
    public int l;
    public int m;
    public int n;
    public int o;
    public int p;
    public h7q q;
    public ocq r;
    public Throwable s;
    public byte t;
    public final /* synthetic */ h7q u;
    public final /* synthetic */ int v;
    public final /* synthetic */ int w;
    public final /* synthetic */ int x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c7q(h7q h7qVar, int i, int i2, int i3, yje yjeVar) {
        super(2, yjeVar);
        ocq ocqVar = ocq.f25039a;
        this.u = h7qVar;
        this.v = i;
        this.w = i2;
        this.x = i3;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        ocq ocqVar = ocq.f25039a;
        return new c7q(this.u, this.v, this.w, this.x, yjeVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((c7q) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(16:194|19|20|190|21|(2:23|(1:25)(2:26|27))(1:28)|200|29|30|192|31|32|188|33|34|(2:36|181)(1:37)) */
    /* JADX WARN: Can't wrap try/catch for region: R(7:0|2|(1:(5:(1:(1:7)(2:8|9))(1:10)|11|168|157|(16:194|19|20|190|21|(2:23|(1:25)(2:26|27))(1:28)|200|29|30|192|31|32|188|33|34|(2:36|181)(1:37))(1:(2:185|186)(1:187)))(4:12|198|13|14))(2:17|(16:194|19|20|190|21|(2:23|(1:25)(2:26|27))(1:28)|200|29|30|192|31|32|188|33|34|(2:36|181)(1:37))(1:(2:185|186)(1:187)))|196|38|39|(2:41|(2:43|(5:45|(2:48|46)|205|49|(2:51|(2:53|(2:55|(2:57|(2:59|(4:61|(1:63)(1:64)|65|(4:67|(1:69)(1:70)|71|(5:73|(5:76|(1:78)|79|(2:81|(2:83|(4:85|(1:90)(1:(1:96)(1:97))|91|98)(3:209|99|100))(3:208|101|102))(3:207|103|104)|74)|206|105|(5:107|(2:110|108)|210|111|112)(2:113|114))(2:115|116))(2:117|118))(2:119|120))(2:121|122))(2:123|124))(2:125|126))(2:127|128))(2:129|130))(2:131|132))(2:133|134))(2:135|136)) */
    /* JADX WARN: Code duplicated, block: B:107:0x0242  */
    /* JADX WARN: Code duplicated, block: B:110:0x0255 A[LOOP:2: B:108:0x024f->B:110:0x0255, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:113:0x0269  */
    /* JADX WARN: Code duplicated, block: B:115:0x026d  */
    /* JADX WARN: Code duplicated, block: B:117:0x0271  */
    /* JADX WARN: Code duplicated, block: B:119:0x0275  */
    /* JADX WARN: Code duplicated, block: B:121:0x0279  */
    /* JADX WARN: Code duplicated, block: B:123:0x027d  */
    /* JADX WARN: Code duplicated, block: B:125:0x0281  */
    /* JADX WARN: Code duplicated, block: B:127:0x0285  */
    /* JADX WARN: Code duplicated, block: B:129:0x0289  */
    /* JADX WARN: Code duplicated, block: B:131:0x028d  */
    /* JADX WARN: Code duplicated, block: B:133:0x0291  */
    /* JADX WARN: Code duplicated, block: B:135:0x0295  */
    /* JADX WARN: Code duplicated, block: B:154:0x02c1 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:155:0x02c3  */
    /* JADX WARN: Code duplicated, block: B:158:0x02cf  */
    /* JADX WARN: Code duplicated, block: B:160:0x02d7  */
    /* JADX WARN: Code duplicated, block: B:161:0x02d9  */
    /* JADX WARN: Code duplicated, block: B:164:0x02de  */
    /* JADX WARN: Code duplicated, block: B:167:0x0300  */
    /* JADX WARN: Code duplicated, block: B:169:0x0307  */
    /* JADX WARN: Code duplicated, block: B:171:0x0315  */
    /* JADX WARN: Code duplicated, block: B:173:0x031d  */
    /* JADX WARN: Code duplicated, block: B:175:0x0324  */
    /* JADX WARN: Code duplicated, block: B:176:0x0326  */
    /* JADX WARN: Code duplicated, block: B:179:0x032b  */
    /* JADX WARN: Code duplicated, block: B:182:0x034d  */
    /* JADX WARN: Code duplicated, block: B:183:0x0355  */
    /* JADX WARN: Code duplicated, block: B:184:0x035d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:185:0x035f  */
    /* JADX WARN: Code duplicated, block: B:187:0x0365  */
    /* JADX WARN: Code duplicated, block: B:194:0x00d6 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:207:0x0235 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:208:0x0231 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:209:0x022d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:211:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:212:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:23:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:25:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:26:0x00e7 A[Catch: all -> 0x02b4, TryCatch #1 {all -> 0x02b4, blocks: (B:21:0x00da, B:26:0x00e7, B:27:0x00ec), top: B:190:0x00da }] */
    /* JADX WARN: Code duplicated, block: B:28:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:36:0x012f  */
    /* JADX WARN: Code duplicated, block: B:37:0x0132  */
    /* JADX WARN: Code duplicated, block: B:41:0x0140  */
    /* JADX WARN: Code duplicated, block: B:43:0x0144  */
    /* JADX WARN: Code duplicated, block: B:45:0x014c  */
    /* JADX WARN: Code duplicated, block: B:48:0x0161 A[LOOP:0: B:46:0x015b->B:48:0x0161, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:51:0x0173  */
    /* JADX WARN: Code duplicated, block: B:53:0x017c  */
    /* JADX WARN: Code duplicated, block: B:55:0x0185  */
    /* JADX WARN: Code duplicated, block: B:57:0x018e  */
    /* JADX WARN: Code duplicated, block: B:59:0x0197  */
    /* JADX WARN: Code duplicated, block: B:61:0x01a4  */
    /* JADX WARN: Code duplicated, block: B:63:0x01a8  */
    /* JADX WARN: Code duplicated, block: B:64:0x01ad  */
    /* JADX WARN: Code duplicated, block: B:67:0x01b2  */
    /* JADX WARN: Code duplicated, block: B:69:0x01ba  */
    /* JADX WARN: Code duplicated, block: B:70:0x01bf  */
    /* JADX WARN: Code duplicated, block: B:73:0x01c4  */
    /* JADX WARN: Code duplicated, block: B:76:0x01d7  */
    /* JADX WARN: Code duplicated, block: B:78:0x01e5  */
    /* JADX WARN: Code duplicated, block: B:81:0x01ed  */
    /* JADX WARN: Code duplicated, block: B:83:0x01f5  */
    /* JADX WARN: Code duplicated, block: B:85:0x01fd  */
    /* JADX WARN: Code duplicated, block: B:88:0x0206  */
    /* JADX WARN: Code duplicated, block: B:92:0x0213  */
    /* JADX WARN: Code duplicated, block: B:94:0x0216  */
    /* JADX WARN: Code duplicated, block: B:97:0x0221  */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x0299, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x029a, code lost:
    
        r8 = r15;
        r15 = r0;
        r0 = r8;
        r8 = r4;
        r4 = r2;
        r2 = r8;
        r8 = r1;
        r1 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x02a2, code lost:
    
        r5 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x02a4, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x02a6, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x02a7, code lost:
    
        r12 = r3;
        r7 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x02aa, code lost:
    
        r5 = r15;
        r15 = r0;
        r0 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x02ae, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x02af, code lost:
    
        r12 = r3;
        r7 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x02b1, code lost:
    
        r3 = r20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x02b4, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x02b6, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x02b7, code lost:
    
        r12 = r3;
        r3 = r7;
        r7 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:203:0x0303, code lost:
    
        r15 = r0;
        r0 = r3;
        r3 = r12;
     */
    @Override // a.zw5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r29) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 870
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.c7q.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
