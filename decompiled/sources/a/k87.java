package a;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class k87 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f17860a;
    public final /* synthetic */ long b;
    public final /* synthetic */ long c;

    public /* synthetic */ k87(byte b, long j, long j2) {
        this.f17860a = b;
        this.b = j;
        this.c = j2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Object next;
        Set setH;
        byte b = this.f17860a;
        long j = this.c;
        long j2 = this.b;
        oyg0 oyg0Var = (oyg0) obj;
        switch (b) {
            case 0:
                return i77.a((i77) obj2, true, false, false, null, null, null, null, false, new vdj(j2, j), null, false, false, false, null, null, null, null, false, null, false, false, false, null, null, null, null, null, -2050, 2047);
            default:
                gvn0 gvn0Var = (gvn0) obj2;
                oyg0Var.getClass();
                gvn0Var.getClass();
                Set set = gvn0Var.g;
                Set set2 = set;
                Iterator it = set2.iterator();
                while (true) {
                    if (it.hasNext()) {
                        next = it.next();
                        roo rooVar = (roo) next;
                        if (rooVar.f30849a != j2 || rooVar.b != j) {
                        }
                    } else {
                        next = null;
                    }
                }
                roo rooVar2 = (roo) next;
                if (rooVar2 != null) {
                    ArrayList arrayList = new ArrayList();
                    for (Object obj3 : set2) {
                        if (!Intrinsics.d((roo) obj3, rooVar2)) {
                            arrayList.add(obj3);
                        }
                    }
                    setH = CollectionsKt.P0(arrayList);
                } else {
                    setH = eui0.h(set, new roo(j2, j));
                }
                return gvn0.a(gvn0Var, false, false, false, false, null, null, setH, 191);
        }
    }
}
