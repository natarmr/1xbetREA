package a;

import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class iq3 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public Object j;
    public byte k;
    public int l;
    public Object m;
    public Object n;
    public final /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iq3(t33 t33Var, t33 t33Var2, int i, Function0 function0, mr0 mr0Var, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 5;
        this.m = t33Var;
        this.n = t33Var2;
        this.l = i;
        this.j = function0;
        this.o = mr0Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        Object obj2 = this.o;
        switch (b) {
            case 0:
                return new iq3((w46) obj2, this.l, yjeVar, (byte) 0);
            case 1:
                return new iq3((w46) obj2, this.l, yjeVar, (byte) 1);
            case 2:
                iq3 iq3Var = new iq3(this.j, obj2, yjeVar, (byte) 2);
                iq3Var.n = obj;
                return iq3Var;
            case 3:
                return new iq3((List) this.n, (xcz) this.j, (Map) obj2, yjeVar);
            case 4:
                iq3 iq3Var2 = new iq3(this.j, obj2, yjeVar, (byte) 4);
                iq3Var2.n = obj;
                return iq3Var2;
            default:
                return new iq3((t33) this.m, (t33) this.n, this.l, (Function0) this.j, (mr0) obj2, yjeVar);
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
        }
        return ((iq3) create(vneVar, yjeVar)).invokeSuspend(Unit.f46060a);
    }

    /* JADX WARN: Code duplicated, block: B:128:0x02d9 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:129:0x02db  */
    /* JADX WARN: Code duplicated, block: B:141:0x031b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:142:0x031d  */
    /* JADX WARN: Code duplicated, block: B:146:0x032d A[PHI: r0 r2 r3 r5 r8 r9 r10 r11 r12 r13
  0x032d: PHI (r0v51 a.lms0) = (r0v61 a.lms0), (r0v62 a.lms0) binds: [B:145:0x032a, B:141:0x031b] A[DONT_GENERATE, DONT_INLINE]
  0x032d: PHI (r2v13 a.vne) = (r2v43 a.vne), (r2v44 a.vne) binds: [B:145:0x032a, B:141:0x031b] A[DONT_GENERATE, DONT_INLINE]
  0x032d: PHI (r3v11 float) = (r3v31 float), (r3v32 float) binds: [B:145:0x032a, B:141:0x031b] A[DONT_GENERATE, DONT_INLINE]
  0x032d: PHI (r5v7 int) = (r5v9 int), (r5v10 int) binds: [B:145:0x032a, B:141:0x031b] A[DONT_GENERATE, DONT_INLINE]
  0x032d: PHI (r8v9 byte) = (r8v13 byte), (r8v14 byte) binds: [B:145:0x032a, B:141:0x031b] A[DONT_GENERATE, DONT_INLINE]
  0x032d: PHI (r9v4 a.htb) = (r9v16 a.htb), (r9v17 a.htb) binds: [B:145:0x032a, B:141:0x031b] A[DONT_GENERATE, DONT_INLINE]
  0x032d: PHI (r10v3 byte) = (r10v8 byte), (r10v9 byte) binds: [B:145:0x032a, B:141:0x031b] A[DONT_GENERATE, DONT_INLINE]
  0x032d: PHI (r11v7 byte) = (r11v11 byte), (r11v12 byte) binds: [B:145:0x032a, B:141:0x031b] A[DONT_GENERATE, DONT_INLINE]
  0x032d: PHI (r12v7 java.lang.Object) = (r12v9 java.lang.Object), (r12v11 java.lang.Object) binds: [B:145:0x032a, B:141:0x031b] A[DONT_GENERATE, DONT_INLINE]
  0x032d: PHI (r13v1 a.js40) = (r13v4 a.js40), (r13v5 a.js40) binds: [B:145:0x032a, B:141:0x031b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:148:0x033b  */
    /* JADX WARN: Code duplicated, block: B:151:0x035f  */
    /* JADX WARN: Code duplicated, block: B:154:0x0366  */
    /* JADX WARN: Code duplicated, block: B:156:0x0374  */
    /* JADX WARN: Code duplicated, block: B:158:0x03b6  */
    /* JADX WARN: Code duplicated, block: B:160:0x03bf  */
    /* JADX WARN: Code duplicated, block: B:163:0x03c5 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:164:0x03c7  */
    /* JADX WARN: Code duplicated, block: B:178:0x043a  */
    /* JADX WARN: Code duplicated, block: B:179:0x0441  */
    /* JADX WARN: Code duplicated, block: B:184:0x045c  */
    /* JADX WARN: Code duplicated, block: B:186:0x0466  */
    /* JADX WARN: Code duplicated, block: B:188:0x0479  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:154:0x0366 -> B:155:0x0367). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:180:0x0443 -> B:181:0x0453). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // a.zw5
    public final java.lang.Object invokeSuspend(java.lang.Object r27) {
        /*
            Method dump skipped, instruction units count: 1562
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.iq3.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ iq3(w46 w46Var, int i, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.o = w46Var;
        this.l = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ iq3(Object obj, Object obj2, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.j = obj;
        this.o = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iq3(List list, xcz xczVar, Map map, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 3;
        this.n = list;
        this.j = xczVar;
        this.o = map;
    }
}
