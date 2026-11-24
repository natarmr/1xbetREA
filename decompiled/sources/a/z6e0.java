package a;

import android.content.Context;
import android.view.LayoutInflater;
import android.widget.FrameLayout;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class z6e0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f43863a;
    public final /* synthetic */ j2m0 b;
    public final /* synthetic */ Function1 c;

    public /* synthetic */ z6e0(j2m0 j2m0Var, Function1 function1, byte b) {
        this.f43863a = b;
        this.b = j2m0Var;
        this.c = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f43863a;
        Function1 function1 = this.c;
        j2m0 j2m0Var = this.b;
        Context context = (Context) obj;
        switch (b) {
            case 0:
                context.getClass();
                iab iabVarB = iab.b(LayoutInflater.from(context));
                j2m0Var.b(iabVarB, function1);
                return (FrameLayout) iabVarB.d;
            default:
                context.getClass();
                iab iabVarB2 = iab.b(LayoutInflater.from(context));
                j2m0Var.b(iabVarB2, function1);
                return (FrameLayout) iabVarB2.d;
        }
    }
}
