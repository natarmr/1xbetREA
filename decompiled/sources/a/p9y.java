package a;

import java.lang.reflect.Type;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes2.dex */
public final class p9y implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f26630a;
    public final t9y b;

    public /* synthetic */ p9y(t9y t9yVar, byte b) {
        this.f26630a = b;
        this.b = t9yVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f26630a;
        t9y t9yVar = this.b;
        switch (b) {
            case 0:
                return uvw.r(t9yVar);
            case 1:
                return fre0.W(t9yVar) ? uvw.r(t9yVar) : t9yVar.a();
            case 2:
                Type genericType = t9yVar.u().getGenericType();
                genericType.getClass();
                lun lunVar = lun.f20680a;
                lunVar.getClass();
                return tke.j0(genericType, lunVar, null, false, false, null, 30);
            default:
                return new s9y(t9yVar);
        }
    }
}
