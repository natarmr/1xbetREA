package a;

import android.view.View;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class mnm implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f22096a;
    public final /* synthetic */ Function1 b;
    public final /* synthetic */ nnm c;

    public /* synthetic */ mnm(Function1 function1, nnm nnmVar, byte b) {
        this.f22096a = b;
        this.b = function1;
        this.c = nnmVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f22096a;
        nnm nnmVar = this.c;
        Function1 function1 = this.b;
        View view = (View) obj;
        switch (b) {
            case 0:
                view.getClass();
                function1.invoke(Boolean.valueOf(nnmVar.f.f27870a));
                break;
            default:
                view.getClass();
                function1.invoke(Boolean.valueOf(nnmVar.f.b));
                break;
        }
        return Unit.f46060a;
    }
}
