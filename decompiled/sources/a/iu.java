package a;

import java.io.Serializable;
import java.util.List;
import kotlin.collections.CollectionsKt;

/* JADX INFO: loaded from: classes3.dex */
public final class iu {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g45 f15374a;

    /* JADX WARN: Code duplicated, block: B:37:0x00d9 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public Object a(int i, int i2, zje zjeVar) {
        mnf0 mnf0Var;
        int i3;
        byte b;
        byte b2;
        int i4;
        List list;
        gxb gxbVar;
        a640 a640Var;
        int i5 = i;
        int i6 = i2;
        if (zjeVar instanceof mnf0) {
            mnf0Var = (mnf0) zjeVar;
            int i7 = mnf0Var.o;
            if ((i7 & Integer.MIN_VALUE) != 0) {
                mnf0Var.o = i7 - Integer.MIN_VALUE;
            } else {
                mnf0Var = new mnf0(this, zjeVar);
            }
        } else {
            mnf0Var = new mnf0(this, zjeVar);
        }
        Object obj = mnf0Var.m;
        Serializable serializable = wne.f39444a;
        int i8 = mnf0Var.o;
        g45 g45Var = this.f15374a;
        if (i8 == 0) {
            z1x.P(obj);
            i3 = i6 - ((i5 == true ? 1 : 0) / 2);
            if (i3 < 1) {
                i3 = 1;
            }
            List list2 = iun.f15405a;
            mnf0Var.i = i5 == true ? (byte) 1 : (byte) 0;
            mnf0Var.j = i6;
            mnf0Var.k = i3;
            mnf0Var.o = 1;
            b = i5;
            if (g45Var.l0(list2) != serializable) {
            }
            return serializable;
        }
        if (i8 == 1) {
            int i9 = mnf0Var.k;
            i6 = mnf0Var.j;
            byte b3 = mnf0Var.i;
            z1x.P(obj);
            i3 = i9;
            b = b3;
        } else {
            if (i8 != 2) {
                if (i8 != 3) {
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                List list3 = mnf0Var.l;
                z1x.P(obj);
                return list3;
            }
            i4 = mnf0Var.k;
            i6 = mnf0Var.j;
            byte b4 = mnf0Var.i;
            z1x.P(obj);
            b2 = b4;
        }
        list = (List) obj;
        gxbVar = (gxb) ((i7e) g45Var.c).i.getValue();
        a640Var = (a640) CollectionsKt.f0(list);
        if (a640Var != null && a640Var.b() > gxbVar.j.f38222a) {
            g45Var.j0(gxb.a(gxbVar, false, 0, 0, null, false, null, new vxy(a640Var.b(), a640Var.e() instanceof srt0), 511));
        }
        mnf0Var.l = list;
        mnf0Var.i = b2;
        mnf0Var.j = i6;
        mnf0Var.k = i4;
        mnf0Var.o = 3;
        if (g45Var.l0(list) != serializable) {
            return serializable;
        }
        return list;
        mnf0Var.i = b;
        mnf0Var.j = i6;
        mnf0Var.k = i3;
        mnf0Var.o = 2;
        Serializable serializableR = g45Var.r(i3, 0, b, mnf0Var);
        if (serializableR != serializable) {
            b2 = b;
            i4 = i3;
            obj = serializableR;
            list = (List) obj;
            gxbVar = (gxb) ((i7e) g45Var.c).i.getValue();
            a640Var = (a640) CollectionsKt.f0(list);
            if (a640Var != null) {
                g45Var.j0(gxb.a(gxbVar, false, 0, 0, null, false, null, new vxy(a640Var.b(), a640Var.e() instanceof srt0), 511));
            }
            mnf0Var.l = list;
            mnf0Var.i = b2;
            mnf0Var.j = i6;
            mnf0Var.k = i4;
            mnf0Var.o = 3;
            if (g45Var.l0(list) != serializable) {
                return list;
            }
        }
        return serializable;
    }

    /* JADX WARN: Code duplicated, block: B:42:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:45:0x00f1 A[PHI: r12
  0x00f1: PHI (r12v4 a.rcl) = (r12v2 a.rcl), (r12v7 a.rcl) binds: [B:43:0x00ee, B:19:0x0046] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:48:0x0108  */
    /* JADX WARN: Code duplicated, block: B:51:0x010d  */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00d1, code lost:
    
        if (kotlin.Unit.f46060a == r13) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x010f, code lost:
    
        if (r11 == r13) goto L53;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object b(a.rcl r12, a.zje r13) {
        /*
            Method dump skipped, instruction units count: 277
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.iu.b(a.rcl, a.zje):java.lang.Object");
    }
}
