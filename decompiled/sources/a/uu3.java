package a;

import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class uu3 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public byte j;
    public Object k;
    public Object l;
    public Object m;
    public Object n;
    public /* synthetic */ Object o;
    public Object p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uu3(hzb0 hzb0Var, kmq kmqVar, xdr xdrVar, Object obj, dby dbyVar, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 1;
        this.m = hzb0Var;
        this.n = kmqVar;
        this.o = xdrVar;
        this.k = obj;
        this.p = dbyVar;
    }

    public static final String l(String str) {
        StringBuilder sb = new StringBuilder();
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char cCharAt = str.charAt(i);
            if (Character.isDigit(cCharAt)) {
                sb.append(cCharAt);
            }
        }
        return sb.toString();
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        switch (this.i) {
            case 0:
                uu3 uu3Var = new uu3((mie0) this.m, (zu3) this.o, (hie0) this.p, (mie0) this.n, yjeVar);
                uu3Var.k = obj;
                return uu3Var;
            case 1:
                return new uu3((hzb0) this.m, (kmq) this.n, (xdr) this.o, this.k, (dby) this.p, yjeVar);
            case 2:
                uu3 uu3Var2 = new uu3((List) this.o, (ArrayList) this.p, yjeVar, (byte) 2);
                uu3Var2.n = obj;
                return uu3Var2;
            case 3:
                return new uu3((c0t) this.m, (Long) this.n, (Long) this.o, (m9s) this.p, yjeVar);
            case 4:
                d050 d050Var = d050.f5256a;
                uu3 uu3Var3 = new uu3((h050) this.o, (Function1) this.p, yjeVar);
                uu3Var3.n = obj;
                return uu3Var3;
            case 5:
                uu3 uu3Var4 = new uu3((mie0) this.m, (zk50) this.o, (mie0) this.n, (gl50) this.p, yjeVar);
                uu3Var4.k = obj;
                return uu3Var4;
            case 6:
                return new uu3((nyf0) this.m, (String) this.n, (String) this.k, (String) this.o, (we50) this.p, yjeVar);
            case 7:
                uu3 uu3Var5 = new uu3((org.xplatform.settings.impl.presentation.a) this.o, yjeVar);
                uu3Var5.k = obj;
                return uu3Var5;
            case 8:
                uu3 uu3Var6 = new uu3((wyj0) this.p, yjeVar);
                uu3Var6.o = obj;
                return uu3Var6;
            default:
                uu3 uu3Var7 = new uu3((ufk0) this.o, (Function0) this.p, yjeVar, (byte) 9);
                uu3Var7.n = obj;
                return uu3Var7;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        switch (this.i) {
            case 0:
                return ((uu3) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 1:
                return ((uu3) create((Unit) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 2:
                return ((uu3) create(obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 3:
                return ((uu3) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 4:
                return ((uu3) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 5:
                return ((uu3) create((ol50) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 6:
                return ((uu3) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 7:
                return ((uu3) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 8:
                return ((uu3) create((kmq) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                ((uu3) create((kmq) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
                return wne.f39444a;
        }
    }

    /* JADX WARN: Code duplicated, block: B:269:0x06c7 A[PHI: r1 r3 r4
  0x06c7: PHI (r1v28 java.lang.Object) = (r1v25 java.lang.Object), (r1v26 java.lang.Object), (r1v27 java.lang.Object), (r1v32 java.lang.Object) binds: [B:268:0x06b6, B:275:0x06eb, B:277:0x0715, B:265:0x0688] A[DONT_GENERATE, DONT_INLINE]
  0x06c7: PHI (r3v10 java.util.Iterator) = (r3v8 java.util.Iterator), (r3v9 java.util.Iterator), (r3v9 java.util.Iterator), (r3v16 java.util.Iterator) binds: [B:268:0x06b6, B:275:0x06eb, B:277:0x0715, B:265:0x0688] A[DONT_GENERATE, DONT_INLINE]
  0x06c7: PHI (r4v16 java.util.List) = (r4v14 java.util.List), (r4v15 java.util.List), (r4v15 java.util.List), (r4v20 java.util.List) binds: [B:268:0x06b6, B:275:0x06eb, B:277:0x0715, B:265:0x0688] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:271:0x06cd  */
    /* JADX WARN: Code duplicated, block: B:274:0x06e5 A[PHI: r1 r3 r4 r6 r8
  0x06e5: PHI (r1v26 java.lang.Object) = (r1v28 java.lang.Object), (r1v29 java.lang.Object) binds: [B:272:0x06e2, B:267:0x069e] A[DONT_GENERATE, DONT_INLINE]
  0x06e5: PHI (r3v9 java.util.Iterator) = (r3v10 java.util.Iterator), (r3v13 java.util.Iterator) binds: [B:272:0x06e2, B:267:0x069e] A[DONT_GENERATE, DONT_INLINE]
  0x06e5: PHI (r4v15 java.util.List) = (r4v16 java.util.List), (r4v19 java.util.List) binds: [B:272:0x06e2, B:267:0x069e] A[DONT_GENERATE, DONT_INLINE]
  0x06e5: PHI (r6v8 a.xoj0) = (r6v12 a.xoj0), (r6v15 a.xoj0) binds: [B:272:0x06e2, B:267:0x069e] A[DONT_GENERATE, DONT_INLINE]
  0x06e5: PHI (r8v2 java.lang.Object) = (r8v7 java.lang.Object), (r8v9 java.lang.Object) binds: [B:272:0x06e2, B:267:0x069e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:276:0x06ed  */
    /* JADX WARN: Code duplicated, block: B:331:0x0825  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0, types: [a.yje] */
    /* JADX WARN: Type inference failed for: r11v18, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r11v28 */
    /* JADX WARN: Type inference failed for: r11v29 */
    /* JADX WARN: Type inference failed for: r2v24, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v33, types: [a.i050, byte] */
    /* JADX WARN: Type inference failed for: r2v91, types: [a.dw5] */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r4v83, types: [a.htb] */
    /* JADX WARN: Type inference failed for: r4v85, types: [a.htb, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v86, types: [a.htb, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v91 */
    /* JADX WARN: Type inference failed for: r4v92 */
    /* JADX WARN: Type inference failed for: r4v93 */
    /* JADX WARN: Type inference failed for: r4v94 */
    /* JADX WARN: Type inference failed for: r4v95 */
    /* JADX WARN: Type inference failed for: r4v96 */
    /* JADX WARN: Type inference failed for: r6v41, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v42, types: [a.ufk0, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v47 */
    /* JADX WARN: Type inference failed for: r6v48 */
    /* JADX WARN: Type inference failed for: r6v49 */
    /* JADX WARN: Type inference failed for: r6v50 */
    /* JADX WARN: Type inference failed for: r6v51 */
    /* JADX WARN: Type inference failed for: r6v52 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:275:0x06eb -> B:269:0x06c7). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:277:0x0715 -> B:269:0x06c7). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x0097 -> B:26:0x007e). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:35:0x00ab -> B:26:0x007e). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:58:0x0129 -> B:55:0x0106). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // a.zw5
    public final java.lang.Object invokeSuspend(java.lang.Object r37) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 2142
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.uu3.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uu3(h050 h050Var, Function1 function1, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 4;
        d050 d050Var = d050.f5256a;
        this.o = h050Var;
        this.p = function1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uu3(c0t c0tVar, Long l, Long l2, m9s m9sVar, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 3;
        this.m = c0tVar;
        this.n = l;
        this.o = l2;
        this.p = m9sVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uu3(mie0 mie0Var, zu3 zu3Var, hie0 hie0Var, mie0 mie0Var2, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 0;
        this.m = mie0Var;
        this.o = zu3Var;
        this.p = hie0Var;
        this.n = mie0Var2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uu3(mie0 mie0Var, zk50 zk50Var, mie0 mie0Var2, gl50 gl50Var, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 5;
        this.m = mie0Var;
        this.o = zk50Var;
        this.n = mie0Var2;
        this.p = gl50Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uu3(nyf0 nyf0Var, String str, String str2, String str3, we50 we50Var, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 6;
        this.m = nyf0Var;
        this.n = str;
        this.k = str2;
        this.o = str3;
        this.p = we50Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uu3(wyj0 wyj0Var, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 8;
        this.p = wyj0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ uu3(Object obj, Object obj2, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.o = obj;
        this.p = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uu3(org.xplatform.settings.impl.presentation.a aVar, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 7;
        this.o = aVar;
    }
}
