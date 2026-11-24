package a;

import android.view.View;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class c5t implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f3789a;
    public final /* synthetic */ g9b0 b;
    public final /* synthetic */ String c;
    public final /* synthetic */ cp d;

    public /* synthetic */ c5t(byte b, cp cpVar, g9b0 g9b0Var, String str) {
        this.f3789a = b;
        this.b = g9b0Var;
        this.c = str;
        this.d = cpVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f3789a;
        cp cpVar = this.d;
        String str = this.c;
        g9b0 g9b0Var = this.b;
        ((View) obj).getClass();
        switch (b) {
            case 0:
                g9b0Var.E(str, ((qv60) cpVar.u()).b);
                break;
            case 1:
                g9b0Var.E(str, ((pv60) cpVar.u()).b);
                break;
            case 2:
                g9b0Var.E(str, ((pv60) cpVar.u()).b);
                break;
            default:
                mo60 mo60Var = ((tv60) cpVar.u()).b.b;
                g9b0Var.D(str, mo60Var, "160291", ((s7b0) cpVar.u).b.getLoadedPictureUrl());
                break;
        }
        return Unit.f46060a;
    }
}
