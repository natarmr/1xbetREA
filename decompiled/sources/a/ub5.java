package a;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final class ub5 implements olz {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f35362a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ub5(nlz nlzVar, Object obj, byte b) {
        this.f35362a = b;
        this.b = obj;
    }

    @Override // a.olz
    public final void a() {
        byte b = this.f35362a;
        Object obj = this.b;
        switch (b) {
            case 0:
                uhd uhdVar = (uhd) obj;
                ((v62) uhdVar.f3600a).f(false);
                ((qb5) uhdVar.b).i(false);
                break;
            case 1:
                Function0 function0 = (Function0) obj;
                if (function0 != null) {
                    function0.invoke();
                }
                break;
            default:
                ((ckd) obj).Q(false);
                break;
        }
    }
}
