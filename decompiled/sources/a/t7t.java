package a;

import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class t7t implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f33483a;
    public final Object b;

    public /* synthetic */ t7t(Object obj, byte b) {
        this.f33483a = b;
        this.b = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v20, types: [a.sf80] */
    /* JADX WARN: Type inference failed for: r6v3, types: [a.iun] */
    /* JADX WARN: Type inference failed for: r6v4, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r6v5, types: [java.util.ArrayList] */
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
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        ?? arrayList;
        byte b = this.f33483a;
        Object obj = this.b;
        switch (b) {
            case 0:
                return (riu0) ((jfl) obj).invoke();
            case 1:
                return (b8t) obj;
            case 2:
                return (riu0) ((t7t) obj).invoke();
            case 3:
                ArrayList arrayList2 = ((iet) obj).f14651a;
                hz40 hz40Var = new hz40(arrayList2.size());
                int size = arrayList2.size();
                for (int i = 0; i < size; i++) {
                    jky jkyVar = (jky) arrayList2.get(i);
                    Object obj2 = jkyVar.b;
                    int i2 = jkyVar.f16691a;
                    fx40.a(hz40Var, obj2 != null ? new sby(Integer.valueOf(i2), jkyVar.b) : Integer.valueOf(i2), jkyVar);
                }
                return new fx40(hz40Var);
            case 4:
                return (hkt) obj;
            case 5:
                return (riu0) ((t7t) obj).invoke();
            case 6:
                ((gst0) ((a6u) obj).c).h(false, false);
                return Unit.f46060a;
            case 7:
                o7v o7vVar = (o7v) obj;
                List listH = o7vVar.h();
                ArrayList arrayList3 = new ArrayList(3);
                h1 h1Var = o7vVar.b;
                Collection collectionB = h1Var.h().b();
                collectionB.getClass();
                ArrayList arrayList4 = new ArrayList();
                Iterator it = collectionB.iterator();
                while (it.hasNext()) {
                    w3d.u(arrayList4, uvw.t(((wsy) it.next()).y(), null, 3));
                }
                ArrayList arrayList5 = new ArrayList();
                for (Object obj3 : arrayList4) {
                    if (obj3 instanceof mp9) {
                        arrayList5.add(obj3);
                    }
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Object obj4 : arrayList5) {
                    g950 name = ((mp9) obj4).getName();
                    Object arrayList6 = linkedHashMap.get(name);
                    if (arrayList6 == null) {
                        arrayList6 = new ArrayList();
                        linkedHashMap.put(name, arrayList6);
                    }
                    ((List) arrayList6).add(obj4);
                }
                for (Map.Entry entry : linkedHashMap.entrySet()) {
                    Object key = entry.getKey();
                    key.getClass();
                    g950 g950Var = (g950) key;
                    List list = (List) entry.getValue();
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                    for (Object obj5 : list) {
                        Boolean boolValueOf = Boolean.valueOf(((mp9) obj5) instanceof mer);
                        Object arrayList7 = linkedHashMap2.get(boolValueOf);
                        if (arrayList7 == null) {
                            arrayList7 = new ArrayList();
                            linkedHashMap2.put(boolValueOf, arrayList7);
                        }
                        ((List) arrayList7).add(obj5);
                    }
                    for (Map.Entry entry2 : linkedHashMap2.entrySet()) {
                        boolean zBooleanValue = ((Boolean) entry2.getKey()).booleanValue();
                        List list2 = (List) entry2.getValue();
                        ?? r3 = sf80.c;
                        if (zBooleanValue) {
                            arrayList = new ArrayList();
                            for (Object obj6 : listH) {
                                if (Intrinsics.d(((wjj) ((mer) obj6)).getName(), g950Var)) {
                                    arrayList.add(obj6);
                                }
                            }
                        } else {
                            arrayList = iun.f15405a;
                        }
                        r3.h(g950Var, list2, arrayList, h1Var, new n7v(arrayList3, o7vVar));
                    }
                }
                return CollectionsKt.q0(listH, d5c.I(arrayList3));
            case 8:
                return (igv) obj;
            case 9:
                return (jgv) obj;
            case 10:
                return (riu0) ((t7t) obj).invoke();
            case 11:
                return (riu0) ((t7t) obj).invoke();
            case 12:
                return (bhv) obj;
            case 13:
                return (riu0) ((t7t) obj).invoke();
            case 14:
                return (lkv) obj;
            case 15:
                return (riu0) ((t7t) obj).invoke();
            case 16:
                return (rwv) obj;
            case 17:
                return (riu0) ((t7t) obj).invoke();
            case 18:
                return (jyv) obj;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                return (riu0) ((t7t) obj).invoke();
            case 20:
                return (izv) obj;
            case 21:
                return (riu0) ((t7t) obj).invoke();
            case 22:
                return (t0w) obj;
            case 23:
                return (riu0) ((t7t) obj).invoke();
            case 24:
                return (s1w) obj;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                return (riu0) ((t7t) obj).invoke();
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                return (y3w) obj;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                return (riu0) ((t7t) obj).invoke();
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                return (x6w) obj;
            default:
                return (riu0) ((t7t) obj).invoke();
        }
    }
}
