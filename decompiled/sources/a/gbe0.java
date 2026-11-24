package a;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import java.io.File;
import java.lang.ref.WeakReference;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final class gbe0 {
    public static final /* synthetic */ int f = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dbe0 f11014a;
    public final sje b;
    public final chf0 c;
    public final ngd d;
    public volatile /* synthetic */ int e;

    static {
        AtomicIntegerFieldUpdater.newUpdater(gbe0.class, "e");
    }

    public gbe0(dbe0 dbe0Var) {
        final byte b;
        this.f11014a = dbe0Var;
        byte b2 = 1;
        this.b = d5c.a(kotlin.coroutines.e.c(qem0.e(), new rrq(lwf.h, b2)));
        td9 td9Var = new td9();
        td9Var.b = new WeakReference(this);
        td9Var.c = new b23(td9Var, this);
        td9Var.d = new qz2(td9Var, b2);
        chf0 chf0Var = new chf0(this);
        this.c = chf0Var;
        ngd ngdVar = dbe0Var.f;
        gr00 gr00Var = new gr00();
        gr00Var.d = CollectionsKt.N0(ngdVar.f23479a);
        gr00Var.f11760a = CollectionsKt.N0(ngdVar.b);
        gr00Var.b = CollectionsKt.N0(ngdVar.c);
        List list = (List) ngdVar.f.getValue();
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new h8a((Pair) it.next(), (byte) 27));
        }
        gr00Var.c = arrayList;
        List list2 = (List) ngdVar.g.getValue();
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = list2.iterator();
        while (true) {
            b = 0;
            if (!it2.hasNext()) {
                break;
            }
            final nkj nkjVar = (nkj) it2.next();
            arrayList2.add(new Function0() { // from class: a.mgd
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    byte b3 = b;
                    nkj nkjVar2 = nkjVar;
                    switch (b3) {
                        case 0:
                            break;
                    }
                    return kotlin.collections.a.c(nkjVar2);
                }
            });
        }
        gr00Var.e = arrayList2;
        ArrayList arrayList3 = (ArrayList) gr00Var.d;
        ArrayList arrayList4 = (ArrayList) gr00Var.c;
        ArrayList arrayList5 = (ArrayList) gr00Var.b;
        ArrayList arrayList6 = (ArrayList) gr00Var.e;
        l1x l1xVar = dbe0Var.b;
        Object obj = l1xVar.n.f20682a.get(t0x.f33141a);
        byte b3 = 7;
        byte b4 = 6;
        if (((Boolean) (obj == null ? Boolean.TRUE : obj)).booleanValue()) {
            arrayList4.add(new o6e0(b4));
            arrayList6.add(new o6e0(b3));
        }
        v23 v23Var = new v23(b);
        tre0 tre0Var = sre0.f32672a;
        gr00Var.d(v23Var, tre0Var.b(Uri.class));
        gr00Var.d(new v23((byte) 3), tre0Var.b(Integer.class));
        arrayList5.add(new Pair(new o13((byte) 0), tre0Var.b(aot0.class)));
        gr00Var.e(new py3(b), tre0Var.b(aot0.class));
        gr00Var.e(new py3((byte) 4), tre0Var.b(aot0.class));
        gr00Var.e(new py3((byte) 9), tre0Var.b(aot0.class));
        gr00Var.e(new py3(b4), tre0Var.b(Drawable.class));
        kuo kuoVar = u0x.f34876a;
        Object obj2 = l1xVar.n.f20682a.get(u0x.f34876a);
        int iIntValue = ((Number) (obj2 == null ? 4 : obj2)).intValue();
        int i = hbi0.f12772a;
        gbi0 gbi0Var = new gbi0(iIntValue);
        int i2 = Build.VERSION.SDK_INT;
        Object obj3 = uko.f35837a;
        if (i2 >= 29) {
            Object obj4 = l1xVar.n.f20682a.get(u0x.c);
            if (((Boolean) (obj4 == null ? Boolean.TRUE : obj4)).booleanValue()) {
                Object obj5 = l1xVar.n.f20682a.get(u0x.b);
                if (((uko) (obj5 == null ? obj3 : obj5)).equals(obj3)) {
                    final q8m0 q8m0Var = new q8m0(gbi0Var);
                    final byte b5 = 1;
                    arrayList6.add(new Function0() { // from class: a.mgd
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            byte b6 = b5;
                            nkj nkjVar2 = q8m0Var;
                            switch (b6) {
                                case 0:
                                    break;
                            }
                            return kotlin.collections.a.c(nkjVar2);
                        }
                    });
                }
            }
        }
        Object obj6 = l1xVar.n.f20682a.get(u0x.b);
        final v68 v68Var = new v68(gbi0Var, (uko) (obj6 != null ? obj6 : obj3));
        final byte b6 = 1;
        arrayList6.add(new Function0() { // from class: a.mgd
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                byte b7 = b6;
                nkj nkjVar2 = v68Var;
                switch (b7) {
                    case 0:
                        break;
                }
                return kotlin.collections.a.c(nkjVar2);
            }
        });
        gr00Var.d(new v23(b6), tre0Var.b(File.class));
        gr00Var.e(new py3((byte) 8), tre0Var.b(aot0.class));
        gr00Var.e(new py3((byte) 3), tre0Var.b(ByteBuffer.class));
        gr00Var.d(new v23((byte) 4), tre0Var.b(String.class));
        byte b7 = 2;
        gr00Var.d(new v23(b7), tre0Var.b(y190.class));
        arrayList5.add(new Pair(new o13((byte) 1), tre0Var.b(aot0.class)));
        arrayList5.add(new Pair(new o13((byte) 2), tre0Var.b(aot0.class)));
        gr00Var.e(new py3((byte) 7), tre0Var.b(aot0.class));
        gr00Var.e(new py3(b7), tre0Var.b(byte[].class));
        gr00Var.e(new py3((byte) 5), tre0Var.b(aot0.class));
        gr00Var.e(new py3((byte) 1), tre0Var.b(Bitmap.class));
        arrayList3.add(new ryn(this, td9Var, chf0Var));
        this.d = new ngd(aac.e0(arrayList3), aac.e0((ArrayList) gr00Var.f11760a), aac.e0(arrayList5), aac.e0(arrayList4), aac.e0(arrayList6));
    }

    public final iwk a(o1x o1xVar) {
        return q8x.D(o1xVar, qjj.M(this.b, (CoroutineContext) this.f11014a.c.getValue(), new ebe0(this, o1xVar, null, (byte) 0), 2));
    }

    /* JADX WARN: Code duplicated, block: B:105:0x017f  */
    /* JADX WARN: Code duplicated, block: B:120:0x01b6 A[Catch: all -> 0x003f, TryCatch #5 {all -> 0x003f, blocks: (B:15:0x003a, B:134:0x0218, B:136:0x021e, B:137:0x0227, B:139:0x022b, B:142:0x0237, B:143:0x023c, B:28:0x006a, B:118:0x01af, B:120:0x01b6, B:122:0x01c0, B:123:0x01ca, B:124:0x01cd), top: B:169:0x002c }] */
    /* JADX WARN: Code duplicated, block: B:122:0x01c0 A[Catch: all -> 0x003f, TryCatch #5 {all -> 0x003f, blocks: (B:15:0x003a, B:134:0x0218, B:136:0x021e, B:137:0x0227, B:139:0x022b, B:142:0x0237, B:143:0x023c, B:28:0x006a, B:118:0x01af, B:120:0x01b6, B:122:0x01c0, B:123:0x01ca, B:124:0x01cd), top: B:169:0x002c }] */
    /* JADX WARN: Code duplicated, block: B:127:0x01e6  */
    /* JADX WARN: Code duplicated, block: B:133:0x0214  */
    /* JADX WARN: Code duplicated, block: B:136:0x021e A[Catch: all -> 0x003f, TryCatch #5 {all -> 0x003f, blocks: (B:15:0x003a, B:134:0x0218, B:136:0x021e, B:137:0x0227, B:139:0x022b, B:142:0x0237, B:143:0x023c, B:28:0x006a, B:118:0x01af, B:120:0x01b6, B:122:0x01c0, B:123:0x01ca, B:124:0x01cd), top: B:169:0x002c }] */
    /* JADX WARN: Code duplicated, block: B:137:0x0227 A[Catch: all -> 0x003f, TryCatch #5 {all -> 0x003f, blocks: (B:15:0x003a, B:134:0x0218, B:136:0x021e, B:137:0x0227, B:139:0x022b, B:142:0x0237, B:143:0x023c, B:28:0x006a, B:118:0x01af, B:120:0x01b6, B:122:0x01c0, B:123:0x01ca, B:124:0x01cd), top: B:169:0x002c }] */
    /* JADX WARN: Code duplicated, block: B:139:0x022b A[Catch: all -> 0x003f, TRY_LEAVE, TryCatch #5 {all -> 0x003f, blocks: (B:15:0x003a, B:134:0x0218, B:136:0x021e, B:137:0x0227, B:139:0x022b, B:142:0x0237, B:143:0x023c, B:28:0x006a, B:118:0x01af, B:120:0x01b6, B:122:0x01c0, B:123:0x01ca, B:124:0x01cd), top: B:169:0x002c }] */
    /* JADX WARN: Code duplicated, block: B:142:0x0237 A[Catch: all -> 0x003f, TRY_ENTER, TryCatch #5 {all -> 0x003f, blocks: (B:15:0x003a, B:134:0x0218, B:136:0x021e, B:137:0x0227, B:139:0x022b, B:142:0x0237, B:143:0x023c, B:28:0x006a, B:118:0x01af, B:120:0x01b6, B:122:0x01c0, B:123:0x01ca, B:124:0x01cd), top: B:169:0x002c }] */
    /* JADX WARN: Code duplicated, block: B:152:0x0251 A[Catch: all -> 0x025e, TRY_LEAVE, TryCatch #4 {all -> 0x025e, blocks: (B:150:0x024d, B:152:0x0251, B:157:0x0260, B:158:0x0265), top: B:168:0x024d }] */
    /* JADX WARN: Code duplicated, block: B:157:0x0260 A[Catch: all -> 0x025e, TRY_ENTER, TryCatch #4 {all -> 0x025e, blocks: (B:150:0x024d, B:152:0x0251, B:157:0x0260, B:158:0x0265), top: B:168:0x024d }] */
    /* JADX WARN: Code duplicated, block: B:8:0x001c  */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x01a6, code lost:
    
        if (r1.d(r9) == r10) goto L132;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r17v0, types: [a.gbe0, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v23 */
    /* JADX WARN: Type inference failed for: r1v24 */
    /* JADX WARN: Type inference failed for: r1v26, types: [a.o1x, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v15, types: [a.gqw0] */
    /* JADX WARN: Type inference failed for: r3v17, types: [a.gqw0, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v18, types: [a.o1x] */
    /* JADX WARN: Type inference failed for: r3v19 */
    /* JADX WARN: Type inference failed for: r3v21 */
    /* JADX WARN: Type inference failed for: r3v22, types: [a.gqw0] */
    /* JADX WARN: Type inference failed for: r3v25 */
    /* JADX WARN: Type inference failed for: r3v29 */
    /* JADX WARN: Type inference failed for: r3v3, types: [int] */
    /* JADX WARN: Type inference failed for: r3v30 */
    /* JADX WARN: Type inference failed for: r3v31 */
    /* JADX WARN: Type inference failed for: r3v4, types: [a.gqw0, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v2, types: [a.o1x] */
    /* JADX WARN: Type inference failed for: r4v21, types: [a.o1x, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v22 */
    /* JADX WARN: Type inference failed for: r4v23, types: [a.gqw0, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v24 */
    /* JADX WARN: Type inference failed for: r4v25 */
    /* JADX WARN: Type inference failed for: r4v26, types: [a.o1x] */
    /* JADX WARN: Type inference failed for: r4v29 */
    /* JADX WARN: Type inference failed for: r4v33 */
    /* JADX WARN: Type inference failed for: r4v34 */
    /* JADX WARN: Type inference failed for: r4v35 */
    /* JADX WARN: Type inference failed for: r4v36 */
    /* JADX WARN: Type inference failed for: r4v37 */
    /* JADX WARN: Type inference failed for: r4v38 */
    /* JADX WARN: Type inference failed for: r4v9, types: [a.o1x] */
    /* JADX WARN: Type inference failed for: r5v0, types: [a.o1x] */
    /* JADX WARN: Type inference failed for: r5v1, types: [a.kmf0] */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v22 */
    /* JADX WARN: Type inference failed for: r5v27 */
    /* JADX WARN: Type inference failed for: r6v12, types: [kotlin.jvm.functions.Function1] */
    /* JADX WARN: Type inference failed for: r6v7, types: [kotlin.jvm.functions.Function1] */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v13 */
    /* JADX WARN: Type inference failed for: r8v15 */
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
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(a.o1x r18, int r19, a.zje r20) {
        /*
            Method dump skipped, instruction units count: 618
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.gbe0.b(a.o1x, int, a.zje):java.lang.Object");
    }

    public final Object c(o1x o1xVar, zje zjeVar) {
        return ((o1xVar.c instanceof zjt) || (o1xVar.r instanceof qbe0) || ((glz) qbc.P(o1xVar, t1x.e)) != null) ? d5c.J(zjeVar, new g4e0((Object) this, (Object) o1xVar, (yje) null, (byte) 3)) : b(o1xVar, 1, zjeVar);
    }

    public final jbe0 d() {
        return (jbe0) this.f11014a.d.getValue();
    }

    /* JADX WARN: Code duplicated, block: B:8:0x001e  */
    public final void e(r1o r1oVar, uto0 uto0Var, gqw0 gqw0Var) {
        o1x o1xVar = r1oVar.b;
        dyw dywVar = r1oVar.f29691a;
        if (uto0Var instanceof cns0) {
            hms0 hms0VarA = ((wls0) qbc.P(o1xVar, t1x.f33190a)).a((cns0) uto0Var, r1oVar);
            if (hms0VarA instanceof g660) {
                uto0Var.onError(dywVar);
            } else {
                gqw0Var.getClass();
                hms0VarA.a();
            }
        } else if (uto0Var != null) {
            uto0Var.onError(dywVar);
        }
        gqw0Var.getClass();
        n1x n1xVar = o1xVar.d;
        if (n1xVar != null) {
            n1xVar.k(o1xVar, r1oVar);
        }
    }

    /* JADX WARN: Code duplicated, block: B:8:0x001e  */
    public final void f(hhn0 hhn0Var, uto0 uto0Var, gqw0 gqw0Var) {
        o1x o1xVar = hhn0Var.b;
        dyw dywVar = hhn0Var.f13073a;
        if (uto0Var instanceof cns0) {
            hms0 hms0VarA = ((wls0) qbc.P(o1xVar, t1x.f33190a)).a((cns0) uto0Var, hhn0Var);
            if (hms0VarA instanceof g660) {
                uto0Var.onSuccess(dywVar);
            } else {
                gqw0Var.getClass();
                hms0VarA.a();
            }
        } else if (uto0Var != null) {
            uto0Var.onSuccess(dywVar);
        }
        gqw0Var.getClass();
        n1x n1xVar = o1xVar.d;
        if (n1xVar != null) {
            n1xVar.h(o1xVar, hhn0Var);
        }
    }
}
