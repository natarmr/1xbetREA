package a;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.collections.CollectionsKt;
import org.xplatform.cyber.section.api.domain.entity.CyberGamesPage;

/* JADX INFO: loaded from: classes4.dex */
public final class dqu implements bqu {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final img f6531a;

    public dqu(img imgVar) {
        this.f6531a = imgVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
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
    public final Object a(int i, zje zjeVar, List list) {
        cqu cquVar;
        Object g0g0Var;
        img imgVar = this.f6531a;
        laj lajVar = imgVar.b;
        if (zjeVar instanceof cqu) {
            cquVar = (cqu) zjeVar;
            int i2 = cquVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                cquVar.l = i2 - Integer.MIN_VALUE;
            } else {
                cquVar = new cqu(this, zjeVar);
            }
        } else {
            cquVar = new cqu(this, zjeVar);
        }
        Object objA = cquVar.j;
        Object obj = wne.f39444a;
        int i3 = cquVar.l;
        try {
            if (i3 == 0) {
                z1x.P(objA);
                e0g0 e0g0Var = j0g0.b;
                CyberGamesPage.Virtual virtual = CyberGamesPage.Virtual.INSTANCE;
                cquVar.i = list;
                cquVar.l = 1;
                objA = imgVar.a(virtual, i, false, cquVar);
                if (objA == obj) {
                    return obj;
                }
            } else {
                if (i3 != 1) {
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                list = cquVar.i;
                z1x.P(objA);
            }
            g0g0Var = (List) objA;
            e0g0 e0g0Var2 = j0g0.b;
        } catch (Throwable th) {
            e0g0 e0g0Var3 = j0g0.b;
            g0g0Var = new g0g0(th);
        }
        if (!(g0g0Var instanceof g0g0)) {
            List list2 = (List) g0g0Var;
            CyberGamesPage.Virtual virtual2 = CyberGamesPage.Virtual.INSTANCE;
            virtual2.getClass();
            list2.getClass();
            LinkedHashMap linkedHashMap = lajVar.f19707a;
            Object or30Var = linkedHashMap.get(virtual2);
            if (or30Var == null) {
                or30Var = new or30();
                linkedHashMap.put(virtual2, or30Var);
            }
            ((or30) or30Var).d(list2);
        }
        if (j0g0.a(g0g0Var) != null) {
            CyberGamesPage.Virtual virtual3 = CyberGamesPage.Virtual.INSTANCE;
            virtual3.getClass();
            LinkedHashMap linkedHashMap2 = lajVar.f19707a;
            Object or30Var2 = linkedHashMap2.get(virtual3);
            if (or30Var2 == null) {
                or30Var2 = new or30();
                linkedHashMap2.put(virtual3, or30Var2);
            }
            g0g0Var = (List) ((or30) or30Var2).c(Long.MAX_VALUE);
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : (List) g0g0Var) {
            if (!axq.y(((cmg) obj2).f4602a, list)) {
                arrayList.add(obj2);
            }
        }
        f1e0.f8761a.getClass();
        if (arrayList.isEmpty()) {
            return null;
        }
        return CollectionsKt.Q(arrayList, f1e0.b.f(arrayList.size()));
    }
}
