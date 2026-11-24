package a;

import android.window.OnBackInvokedDispatcher;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class sfd implements zkz {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f32114a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ sfd(Object obj, Object obj2, byte b) {
        this.f32114a = b;
        this.b = obj;
        this.c = obj2;
    }

    @Override // a.zkz
    public final void l(clz clzVar, kkz kkzVar) {
        byte b = this.f32114a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                jg60 jg60Var = (jg60) obj2;
                agd agdVar = (agd) obj;
                if (kkzVar == kkz.ON_CREATE) {
                    OnBackInvokedDispatcher onBackInvokedDispatcher = agdVar.getOnBackInvokedDispatcher();
                    onBackInvokedDispatcher.getClass();
                    jg60Var.d(onBackInvokedDispatcher);
                }
                break;
            default:
                pz40 pz40Var = (pz40) obj;
                if (kkzVar == ((kkz) obj2)) {
                    ((Function0) pz40Var.getValue()).invoke();
                }
                break;
        }
    }
}
