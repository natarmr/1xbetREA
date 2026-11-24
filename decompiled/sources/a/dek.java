package a;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes2.dex */
public final class dek implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f5955a;
    public final eek b;

    public /* synthetic */ dek(eek eekVar, byte b) {
        this.f5955a = b;
        this.b = eekVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f5955a;
        eek eekVar = this.b;
        switch (b) {
            case 0:
                List<hzs0> listM = eekVar.b.M();
                listM.getClass();
                ArrayList arrayList = new ArrayList(r3d.q(listM, 10));
                for (hzs0 hzs0Var : listM) {
                    hzs0Var.getClass();
                    arrayList.add(new niy(eekVar, hzs0Var));
                }
                return arrayList;
            default:
                Collection collectionB = eekVar.b.h().b();
                collectionB.getClass();
                Collection collection = collectionB;
                ArrayList arrayList2 = new ArrayList(r3d.q(collection, 10));
                Iterator it = collection.iterator();
                while (it.hasNext()) {
                    arrayList2.add(new wdk((wsy) it.next(), null));
                }
                return arrayList2;
        }
    }
}
