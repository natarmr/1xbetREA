package a;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.collections.CollectionsKt;

/* JADX INFO: loaded from: classes.dex */
public final class y1a implements ca60 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f41845a;
    public final Object b;

    public /* synthetic */ y1a(Object obj, byte b) {
        this.f41845a = b;
        this.b = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [a.ru] */
    /* JADX WARN: Type inference failed for: r4v0, types: [a.iun] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r4v9, types: [java.util.ArrayList] */
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
    @Override // a.ca60
    public final void a(Object obj) {
        z1a z1aVar;
        ?? r1;
        j2a j2aVar;
        s88 s88Var;
        ?? arrayList;
        switch (this.f41845a) {
            case 0:
                List list = (List) obj;
                if (!((z1a) this.b).l.get() || (r1 = (z1aVar = (z1a) this.b).f) == 0 || (j2aVar = z1aVar.g) == null || (s88Var = z1aVar.i) == null) {
                    return;
                }
                if (list != null) {
                    arrayList = new ArrayList(r3d.q(list, 10));
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        arrayList.add(((h0a) it.next()).a());
                    }
                } else {
                    arrayList = iun.f15405a;
                }
                try {
                    List list2 = ((z1a) this.b).k;
                    arrayList.getClass();
                    Iterable<String> iterableL0 = ((AtomicBoolean) r1.j).get() ? iun.f15405a : CollectionsKt.L0(r1.c(arrayList));
                    iterableL0.getClass();
                    ArrayList arrayList2 = new ArrayList(r3d.q(iterableL0, 10));
                    for (String str : iterableL0) {
                        str.getClass();
                        arrayList2.add(xf0.H(str, null, null));
                    }
                    Set setF = eui0.f(CollectionsKt.P0(list2), CollectionsKt.P0(arrayList2));
                    if (!setF.isEmpty() && s88Var.k(j2aVar.c(), setF)) {
                        l8x.E0("CameraPresencePrvdr", "Camera removal update invalid. Aborting.");
                        return;
                    }
                } catch (Exception e) {
                    l8x.F0("CameraPresencePrvdr", "Failed to interrogate camera factory. Falling back to full update.", e);
                }
                try {
                    r1.t(arrayList);
                    Set setD = r1.d();
                    setD.getClass();
                    Set<String> set = setD;
                    ArrayList arrayList3 = new ArrayList(r3d.q(set, 10));
                    for (String str2 : set) {
                        str2.getClass();
                        arrayList3.add(xf0.H(str2, null, null));
                    }
                    if (arrayList3.equals(((z1a) this.b).k)) {
                        return;
                    }
                    z1a z1aVar2 = (z1a) this.b;
                    List listL0 = CollectionsKt.L0(z1aVar2.k);
                    if (arrayList3.equals(listL0)) {
                        return;
                    }
                    synchronized (z1aVar2.d) {
                        if (z1aVar2.e != null) {
                            l8x.U("CameraPresencePrvdr", "Camera list updated. Cancelling any pending retries.");
                            ScheduledFuture scheduledFuture = z1aVar2.e;
                            scheduledFuture.getClass();
                            scheduledFuture.cancel(false);
                            z1aVar2.e = null;
                        }
                        break;
                    }
                    Set setP0 = CollectionsKt.P0(listL0);
                    Set setP1 = CollectionsKt.P0(arrayList3);
                    Set setF2 = eui0.f(setP1, setP0);
                    Set setF3 = eui0.f(setP0, setP1);
                    ArrayList arrayList4 = new ArrayList();
                    ArrayList arrayList5 = new ArrayList(r3d.q(arrayList3, 10));
                    Iterator it2 = arrayList3.iterator();
                    while (it2.hasNext()) {
                        arrayList5.add(((h0a) it2.next()).a());
                    }
                    try {
                        Iterator it3 = setF3.iterator();
                        while (it3.hasNext()) {
                            z1aVar2.c(((h0a) it3.next()).a());
                        }
                        j2a j2aVar2 = z1aVar2.g;
                        if (j2aVar2 != null) {
                            l8x.U("CameraPresencePrvdr", "Updating CameraRepository...");
                            j2aVar2.a(arrayList5);
                            arrayList4.add(j2aVar2);
                            l8x.U("CameraPresencePrvdr", "CameraRepository updated successfully.");
                        }
                        if (!z1aVar2.m.isEmpty()) {
                            l8x.U("CameraPresencePrvdr", "Updating " + z1aVar2.m.size() + " dependent listeners...");
                            for (hmx hmxVar : z1aVar2.m) {
                                hmxVar.a(arrayList5);
                                arrayList4.add(hmxVar);
                            }
                        }
                        z1aVar2.k = arrayList3;
                        Iterator it4 = setF2.iterator();
                        while (it4.hasNext()) {
                            z1aVar2.a(((h0a) it4.next()).a());
                        }
                        z1aVar2.b(setF2, setF3);
                        return;
                    } catch (Exception e2) {
                        l8x.Y("CameraPresencePrvdr", "A core module failed to update. Rolling back changes.", e2);
                        ArrayList arrayList6 = new ArrayList(r3d.q(listL0, 10));
                        Iterator it5 = listL0.iterator();
                        while (it5.hasNext()) {
                            arrayList6.add(((h0a) it5.next()).a());
                        }
                        Iterator it6 = new yag0(arrayList4).iterator();
                        while (true) {
                            xag0 xag0Var = (xag0) it6;
                            if (!((ListIterator) xag0Var.b).hasPrevious()) {
                                Iterator it7 = setF3.iterator();
                                while (it7.hasNext()) {
                                    z1aVar2.a(((h0a) it7.next()).a());
                                }
                                Iterator it8 = setF2.iterator();
                                while (it8.hasNext()) {
                                    z1aVar2.c(((h0a) it8.next()).a());
                                }
                                return;
                            }
                            hmx hmxVar2 = (hmx) ((ListIterator) xag0Var.b).previous();
                            try {
                                hmxVar2.a(arrayList6);
                            } catch (Exception e3) {
                                l8x.Y("CameraPresencePrvdr", "Failed to rollback listener: " + hmxVar2, e3);
                            }
                        }
                    }
                } catch (Exception e4) {
                    l8x.F0("CameraPresencePrvdr", "CameraFactory failed to update. The camera list may be stale until the next update.", e4);
                    return;
                }
                break;
            default:
                ((sbe) this.b).accept(obj);
                return;
        }
    }

    @Override // a.ca60
    public final void onError(Throwable th) {
        switch (this.f41845a) {
            case 0:
                th.getClass();
                z1a z1aVar = (z1a) this.b;
                if (z1aVar.l.get()) {
                    l8x.Y("CameraPresencePrvdr", "Error from source camera presence observable. Triggering refresh.", th);
                    jrs0 jrs0Var = z1aVar.h;
                    if (jrs0Var != null) {
                        jrs0Var.f();
                    }
                    break;
                }
                break;
            default:
                l8x.Y("ObserverToConsumerAdapter", "Unexpected error in Observable", th);
                break;
        }
    }
}
