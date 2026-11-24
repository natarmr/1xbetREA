package a;

import java.io.File;
import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;

/* JADX INFO: loaded from: classes3.dex */
public final class qv {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g45 f29365a;

    /* JADX WARN: Code duplicated, block: B:38:0x00cf A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x001d  */
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
    public Object a(int i, zje zjeVar) {
        gbu gbuVar;
        Object objK;
        byte b;
        byte b2;
        int i2;
        List list;
        gxb gxbVar;
        a640 a640Var;
        g45 g45Var = this.f29365a;
        i7e i7eVar = (i7e) g45Var.c;
        if (zjeVar instanceof gbu) {
            gbuVar = (gbu) zjeVar;
            int i3 = gbuVar.n;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                gbuVar.n = i3 - Integer.MIN_VALUE;
            } else {
                gbuVar = new gbu(this, zjeVar);
            }
        } else {
            gbuVar = new gbu(this, zjeVar);
        }
        Object obj = gbuVar.l;
        Serializable serializable = wne.f39444a;
        int i4 = gbuVar.n;
        if (i4 == 0) {
            z1x.P(obj);
            a1t a1tVar = new a1t(i7eVar.i, (byte) 15);
            int i5 = i;
            gbuVar.i = i5 == true ? (byte) 1 : (byte) 0;
            gbuVar.n = 1;
            objK = ntb.K(a1tVar, gbuVar);
            b = i5;
            if (objK != serializable) {
            }
            return serializable;
        }
        if (i4 == 1) {
            byte b3 = gbuVar.i;
            z1x.P(obj);
            objK = obj;
            b = b3;
        } else {
            if (i4 != 2) {
                if (i4 != 3) {
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                List list2 = gbuVar.k;
                z1x.P(obj);
                return list2;
            }
            i2 = gbuVar.j;
            byte b4 = gbuVar.i;
            z1x.P(obj);
            b2 = b4;
        }
        list = (List) obj;
        gxbVar = (gxb) i7eVar.i.getValue();
        a640Var = (a640) CollectionsKt.f0(list);
        if (a640Var != null && a640Var.b() > gxbVar.j.f38222a) {
            g45Var.j0(gxb.a(gxbVar, false, 0, 0, null, false, null, new vxy(a640Var.b(), a640Var.e() instanceof srt0), 511));
        }
        gbuVar.k = list;
        gbuVar.i = b2;
        gbuVar.j = i2;
        gbuVar.n = 3;
        if (g45Var.l0(list) != serializable) {
            return serializable;
        }
        return list;
        int i6 = ((gxb) objK).d;
        int i7 = i6 >= 1 ? i6 : 1;
        gbuVar.i = b;
        gbuVar.j = i7;
        gbuVar.n = 2;
        Serializable serializableR = g45Var.r(i7, 0, b, gbuVar);
        if (serializableR != serializable) {
            b2 = b;
            obj = serializableR;
            i2 = i7;
            list = (List) obj;
            gxbVar = (gxb) i7eVar.i.getValue();
            a640Var = (a640) CollectionsKt.f0(list);
            if (a640Var != null) {
                g45Var.j0(gxb.a(gxbVar, false, 0, 0, null, false, null, new vxy(a640Var.b(), a640Var.e() instanceof srt0), 511));
            }
            gbuVar.k = list;
            gbuVar.i = b2;
            gbuVar.j = i2;
            gbuVar.n = 3;
            if (g45Var.l0(list) != serializable) {
                return list;
            }
        }
        return serializable;
    }

    public void b(File file, String str, String str2) {
        str.getClass();
        str2.getClass();
        file.getClass();
        gcl gclVar = (gcl) this.f29365a.d;
        gclVar.getClass();
        p7m0 p7m0Var = gclVar.d;
        LinkedHashMap linkedHashMapP = xp20.p((Map) p7m0Var.getValue());
        linkedHashMapP.put(str, new vnt0(file.getAbsolutePath(), str2));
        gclVar.b.h("KEY_UPLOADED_MEDIA_IDS", gclVar.c.d(new inv(ysm0.f43175a, vnt0.Companion.serializer(), (byte) 1), linkedHashMapP));
        p7m0Var.o(null, linkedHashMapP);
        gclVar.d();
    }
}
