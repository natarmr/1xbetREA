package a;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes2.dex */
public final class n9z implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f23163a;
    public final p9z b;

    public /* synthetic */ n9z(p9z p9zVar, byte b) {
        this.f23163a = b;
        this.b = p9zVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f23163a;
        p9z p9zVar = this.b;
        switch (b) {
            case 0:
                Class<?>[] declaredClasses = p9zVar.o.f22221a.getDeclaredClasses();
                declaredClasses.getClass();
                return CollectionsKt.P0(pgi0.t(pgi0.q(pgi0.i(tx3.t(declaredClasses), b180.k), b180.l)));
            case 1:
                List listB = p9zVar.o.b();
                ArrayList arrayList = new ArrayList();
                for (Object obj : listB) {
                    if (((sqe0) obj).f32626a.isEnumConstant()) {
                        arrayList.add(obj);
                    }
                }
                int iA = wp20.a(r3d.q(arrayList, 10));
                if (iA < 16) {
                    iA = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(iA);
                for (Object obj2 : arrayList) {
                    linkedHashMap.put(((sqe0) obj2).c(), obj2);
                }
                return linkedHashMap;
            default:
                return eui0.g(p9zVar.c(), p9zVar.g());
        }
    }
}
