package a;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IndexedValue;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes2.dex */
public final class h8y implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f12652a;
    public final i8y b;

    public /* synthetic */ h8y(i8y i8yVar, byte b) {
        this.f12652a = b;
        this.b = i8yVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f12652a;
        i8y i8yVar = this.b;
        switch (b) {
            case 0:
                return CollectionsKt.b0(i8yVar.getParameters(), "", "<init>(", ")V", j9x.f, 24);
            case 1:
                return n2x.v(i8yVar.c);
            case 2:
                rx3 rx3VarS0 = CollectionsKt.S0(i8yVar.d);
                ArrayList arrayList = new ArrayList(r3d.q(rx3VarS0, 10));
                Iterator it = rx3VarS0.iterator();
                while (true) {
                    iil iilVar = (iil) it;
                    if (!iilVar.b.hasNext()) {
                        return arrayList;
                    }
                    IndexedValue indexedValue = (IndexedValue) iilVar.next();
                    int i = indexedValue.f46061a;
                    Method method = (Method) indexedValue.b;
                    method.getClass();
                    arrayList.add(new j8y(i8yVar, method, i));
                }
                break;
            case 3:
                Class clsG = azw.G(i8yVar.c);
                List list = i8yVar.d;
                ArrayList arrayList2 = new ArrayList(r3d.q(list, 10));
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(((Method) it2.next()).getName());
                }
                return new q83(clsG, arrayList2, o83.b, p83.f26536a, i8yVar.d);
            default:
                Class clsG2 = azw.G(i8yVar.c);
                List list2 = i8yVar.d;
                ArrayList arrayList3 = new ArrayList(r3d.q(list2, 10));
                Iterator it3 = list2.iterator();
                while (it3.hasNext()) {
                    arrayList3.add(((Method) it3.next()).getName());
                }
                return new q83(clsG2, arrayList3, o83.f24813a, p83.f26536a, i8yVar.d);
        }
    }
}
