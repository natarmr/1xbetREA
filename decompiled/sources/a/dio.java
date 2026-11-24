package a;

import kotlin.jvm.functions.Function0;
import org.xplatform.onexdatabase.OnexDatabase;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class dio implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f6149a;
    public final /* synthetic */ rrc b;

    public /* synthetic */ dio(rrc rrcVar, byte b) {
        this.f6149a = b;
        this.b = rrcVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f6149a;
        rrc rrcVar = this.b;
        switch (b) {
            case 0:
                return ((OnexDatabase) rrcVar.b).n();
            case 1:
                return ((OnexDatabase) rrcVar.b).m();
            case 2:
                return ((OnexDatabase) rrcVar.b).n();
            case 3:
                return ((OnexDatabase) rrcVar.b).p();
            case 4:
                return ((OnexDatabase) rrcVar.b).p();
            case 5:
                return ((OnexDatabase) rrcVar.b).t();
            case 6:
                return ((OnexDatabase) rrcVar.b).u();
            default:
                return ((OnexDatabase) rrcVar.b).v();
        }
    }
}
