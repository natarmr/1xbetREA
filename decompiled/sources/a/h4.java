package a;

import java.util.Collection;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class h4 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f12410a;
    public final /* synthetic */ Collection b;

    public /* synthetic */ h4(Collection collection, byte b) {
        this.f12410a = b;
        this.b = collection;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        boolean zContains;
        byte b = this.f12410a;
        Collection<?> collection = this.b;
        switch (b) {
            case 0:
                zContains = collection.contains(obj);
                break;
            case 1:
                zContains = collection.contains(obj);
                break;
            case 2:
                zContains = collection.contains(obj);
                break;
            default:
                zContains = ((List) obj).retainAll(collection);
                break;
        }
        return Boolean.valueOf(zContains);
    }
}
