package a;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes3.dex */
public final class zhd implements dlz {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f44387a;
    public final /* synthetic */ Object b;

    public /* synthetic */ zhd(ilz ilzVar, Object obj, byte b) {
        this.f44387a = b;
        this.b = obj;
    }

    @Override // a.dlz
    public final void a() {
        byte b = this.f44387a;
        Object obj = this.b;
        switch (b) {
            case 0:
                Function0 function0 = (Function0) obj;
                if (function0 != null) {
                    function0.invoke();
                }
                break;
            default:
                ((kfp) obj).e();
                break;
        }
    }
}
