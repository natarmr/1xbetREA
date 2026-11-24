package a;

import androidx.fragment.app.Fragment;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;
import java.util.Set;
import kotlin.collections.CollectionsKt;

/* JADX INFO: loaded from: classes.dex */
public final class kz2 implements kwk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f19133a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ kz2(Object obj, Object obj2, Object obj3, Object obj4, byte b) {
        this.f19133a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
    }

    @Override // a.kwk
    public final void a() {
        byte b = this.f19133a;
        Object obj = this.e;
        Object obj2 = this.d;
        Object obj3 = this.c;
        Object obj4 = this.b;
        switch (b) {
            case 0:
                androidx.fragment.app.e eVar = (androidx.fragment.app.e) obj4;
                Fragment fragment = (Fragment) obj3;
                ((d5r) obj2).f5520a.setValue(eVar.q0(fragment));
                if (((hie0) obj).f13108a) {
                    zb5 zb5Var = new zb5(eVar);
                    zb5Var.n(fragment);
                    zb5Var.i();
                } else if (!eVar.a0()) {
                    zb5 zb5Var2 = new zb5(eVar);
                    zb5Var2.n(fragment);
                    zb5Var2.h();
                }
                break;
            default:
                boolean zRemove = ((Set) obj4).remove(obj3);
                if (!((Set) obj2).contains(obj3) && zRemove) {
                    List list = (List) ((pz40) obj).getValue();
                    if (!(list instanceof RandomAccess)) {
                        Iterator it = CollectionsKt.t0(list).iterator();
                        while (it.hasNext()) {
                            ((pb50) it.next()).f26690a.invoke(obj3);
                        }
                    } else {
                        int size = list.size() - 1;
                        if (size >= 0) {
                            while (true) {
                                int i = size - 1;
                                ((pb50) list.get(size)).f26690a.invoke(obj3);
                                if (i >= 0) {
                                    size = i;
                                }
                            }
                        }
                    }
                    break;
                }
                break;
        }
    }
}
