package a;

import android.view.View;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class cbd implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f4056a;
    public final /* synthetic */ vft b;
    public final /* synthetic */ cp c;

    public /* synthetic */ cbd(byte b, cp cpVar, vft vftVar) {
        this.f4056a = b;
        this.b = vftVar;
        this.c = cpVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f4056a;
        cp cpVar = this.c;
        vft vftVar = this.b;
        View view = (View) obj;
        switch (b) {
            case 0:
                view.getClass();
                vftVar.invoke(((zad) cpVar.u()).k);
                break;
            default:
                view.getClass();
                vftVar.invoke(((fbr) cpVar.u()).f9275a);
                break;
        }
        return Unit.f46060a;
    }
}
