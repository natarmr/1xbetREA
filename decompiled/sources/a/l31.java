package a;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes3.dex */
public final class l31 extends bnn0 implements Function2 {
    public byte i;
    public /* synthetic */ Object j;
    public final /* synthetic */ boolean k;
    public final /* synthetic */ n31 l;
    public final /* synthetic */ int m;
    public final /* synthetic */ List n;
    public final /* synthetic */ long o;
    public final /* synthetic */ List p;
    public final /* synthetic */ boolean q;
    public final /* synthetic */ String r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l31(boolean z, n31 n31Var, int i, List list, long j, List list2, boolean z2, String str, yje yjeVar) {
        super(2, yjeVar);
        this.k = z;
        this.l = n31Var;
        this.m = i;
        this.n = list;
        this.o = j;
        this.p = list2;
        this.q = z2;
        this.r = str;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        l31 l31Var = new l31(this.k, this.l, this.m, this.n, this.o, this.p, this.q, this.r, yjeVar);
        l31Var.j = obj;
        return l31Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((l31) create((kmq) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
    }

    /* JADX WARN: Code duplicated, block: B:33:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:36:0x00c4 A[LOOP:1: B:34:0x00be->B:36:0x00c4, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:37:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:39:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:50:0x0143  */
    /* JADX WARN: Code duplicated, block: B:53:0x0158 A[LOOP:0: B:51:0x0152->B:53:0x0158, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:54:0x0168  */
    /* JADX WARN: Code duplicated, block: B:56:0x016b  */
    /* JADX WARN: Code duplicated, block: B:58:0x0170  */
    /* JADX WARN: Code duplicated, block: B:68:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v25, types: [a.j51] */
    /* JADX WARN: Type inference failed for: r1v5, types: [a.kmq] */
    /* JADX WARN: Type inference failed for: r5v14 */
    /* JADX WARN: Type inference failed for: r5v15 */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v7, types: [a.iun] */
    /* JADX WARN: Type inference failed for: r5v8, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r5v9, types: [java.lang.Object, java.util.List] */
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
    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        n31 n31Var;
        String str;
        wne wneVar;
        Object objA;
        Object g0g0Var;
        Object objZ;
        List list;
        ?? arrayList;
        n31 n31Var2;
        Iterator it;
        ?? r5;
        List list2;
        ArrayList arrayList2;
        Object obj2;
        Iterator it2;
        kmq kmqVar = (kmq) this.j;
        wne wneVar2 = wne.f39444a;
        byte b = this.i;
        String str2 = this.r;
        n31 n31Var3 = this.l;
        if (b == 0) {
            z1x.P(obj);
            if (this.k) {
                xzp xzpVar = n31Var3.f22826a;
                jo20 jo20VarK = cwr0.K(0, this.m, this.n, null, cs0.u(this.o), this.p, null, null, null, null, Boolean.valueOf(this.q), null, null, 30664);
                try {
                    e0g0 e0g0Var = j0g0.b;
                    g0g0Var = n31Var3.e.a();
                } catch (Throwable th) {
                    e0g0 e0g0Var2 = j0g0.b;
                    g0g0Var = new g0g0(th);
                }
                if (g0g0Var instanceof g0g0) {
                    g0g0Var = null;
                }
                String str3 = (String) g0g0Var;
                if (str3 == null || str3.length() <= 0) {
                    str3 = null;
                }
                this.j = kmqVar;
                this.i = (byte) 1;
                objZ = xzp.z(xzpVar, jo20VarK, str3, this);
                if (objZ == wneVar2) {
                    return wneVar2;
                }
                list = ((ty0) ((dx5) objZ).a()).f34728a;
                if (list != null) {
                    arrayList = new ArrayList(r3d.q(list, 10));
                    it = list.iterator();
                    while (it.hasNext()) {
                        arrayList.add(saj.h0((bw0) it.next(), str2));
                    }
                } else {
                    arrayList = 0;
                }
                if (arrayList == 0) {
                    arrayList = iun.f15405a;
                }
                kmqVar = kmqVar;
                wneVar = wneVar2;
                n31Var2 = n31Var3;
                r5 = arrayList;
                n31Var2.c.a(r5);
                this.j = null;
                this.i = (byte) 3;
                if (kmqVar.a(r5, this) == wneVar) {
                    return wneVar;
                }
            } else {
                xzp xzpVar2 = n31Var3.f22826a;
                knf0 knf0Var = n31Var3.b;
                knf0Var.getClass();
                int iB = knf0Var.b();
                m2c0 m2c0VarA = n31Var3.d.a();
                Integer intOrNull = m2c0VarA != null ? StringsKt.toIntOrNull(m2c0VarA.c) : null;
                knf0Var.getClass();
                String strC = knf0Var.c();
                knf0Var.getClass();
                this.j = kmqVar;
                this.i = (byte) 2;
                n31Var = n31Var3;
                str = str2;
                wneVar = wneVar2;
                objA = xzpVar2.A(this.o, intOrNull, "", this.n, this.p, "", iB, false, 0, this.m, this.q, strC, this);
                if (objA == wneVar) {
                    return wneVar;
                }
                list2 = ((bt0) ((dx5) objA).a()).f3158a;
                if (list2 != null) {
                    arrayList2 = new ArrayList(r3d.q(list2, 10));
                    it2 = list2.iterator();
                    while (it2.hasNext()) {
                        arrayList2.add(saj.g0((ys0) it2.next(), str));
                    }
                } else {
                    arrayList2 = null;
                }
                if (arrayList2 == null) {
                    obj2 = iun.f15405a;
                } else {
                    obj2 = arrayList2;
                }
                n31Var2 = n31Var;
                r5 = obj2;
                n31Var2.c.a(r5);
                this.j = null;
                this.i = (byte) 3;
                if (kmqVar.a(r5, this) == wneVar) {
                    return wneVar;
                }
            }
        } else if (b == 1) {
            z1x.P(obj);
            objZ = obj;
            list = ((ty0) ((dx5) objZ).a()).f34728a;
            if (list != null) {
                arrayList = new ArrayList(r3d.q(list, 10));
                it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(saj.h0((bw0) it.next(), str2));
                }
            } else {
                arrayList = 0;
            }
            if (arrayList == 0) {
                arrayList = iun.f15405a;
            }
            kmqVar = kmqVar;
            wneVar = wneVar2;
            n31Var2 = n31Var3;
            r5 = arrayList;
            n31Var2.c.a(r5);
            this.j = null;
            this.i = (byte) 3;
            if (kmqVar.a(r5, this) == wneVar) {
                return wneVar;
            }
        } else if (b == 2) {
            z1x.P(obj);
            objA = obj;
            str = str2;
            n31Var = n31Var3;
            wneVar = wneVar2;
            list2 = ((bt0) ((dx5) objA).a()).f3158a;
            if (list2 != null) {
                arrayList2 = new ArrayList(r3d.q(list2, 10));
                it2 = list2.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(saj.g0((ys0) it2.next(), str));
                }
            } else {
                arrayList2 = null;
            }
            if (arrayList2 == null) {
                obj2 = iun.f15405a;
            } else {
                obj2 = arrayList2;
            }
            n31Var2 = n31Var;
            r5 = obj2;
            n31Var2.c.a(r5);
            this.j = null;
            this.i = (byte) 3;
            if (kmqVar.a(r5, this) == wneVar) {
                return wneVar;
            }
        } else {
            if (b != 3) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(obj);
        }
        return Unit.f46060a;
    }
}
