package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.text.StringsKt__StringsKt;

/* JADX INFO: loaded from: classes4.dex */
public final class xep {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q7d0 f40752a;
    public final p7m0 b;

    public xep(q7d0 q7d0Var) {
        q7d0Var.getClass();
        this.f40752a = q7d0Var;
        this.b = q7m0.a(iun.f15405a);
    }

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
    public final List a() {
        p7m0 p7m0Var;
        Object value;
        Object next;
        q7d0 q7d0Var = this.f40752a;
        q7d0Var.getClass();
        String string = q7d0Var.a().getString("DASHBOARD_ORDER", "");
        List listSplit$default = StringsKt__StringsKt.split$default(string != null ? string : "", new String[]{Separators.COMMA}, false, 0, 6, null);
        ArrayList arrayList = new ArrayList();
        Iterator it = listSplit$default.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            String str = (String) it.next();
            if (str.length() <= 0) {
                str = null;
            }
            Long lValueOf = str != null ? Long.valueOf(Long.parseLong(str)) : null;
            if (lValueOf != null) {
                arrayList.add(lValueOf);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            long jLongValue = ((Number) it2.next()).longValue();
            c0o c0oVar = k460.e;
            y2 y2VarH = ohs0.h(c0oVar, c0oVar);
            do {
                if (!y2VarH.hasNext()) {
                    next = null;
                    break;
                }
                next = y2VarH.next();
            } while (((k460) next).f17654a != jLongValue);
            k460 k460Var = (k460) next;
            if (k460Var != null) {
                arrayList2.add(k460Var);
            }
        }
        boolean zIsEmpty = arrayList2.isEmpty();
        List list = arrayList2;
        if (zIsEmpty) {
            list = k460.e;
        }
        do {
            p7m0Var = this.b;
            value = p7m0Var.getValue();
        } while (!p7m0Var.m(value, list));
        return list;
    }
}
