package a;

import android.view.View;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class bbd implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f2303a;
    public final /* synthetic */ m1w b;
    public final /* synthetic */ cp c;

    public /* synthetic */ bbd(m1w m1wVar, cp cpVar, byte b) {
        this.f2303a = b;
        this.b = m1wVar;
        this.c = cpVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f2303a;
        cp cpVar = this.c;
        m1w m1wVar = this.b;
        View view = (View) obj;
        switch (b) {
            case 0:
                view.getClass();
                m1wVar.invoke(((zad) cpVar.u()).k);
                break;
            default:
                view.getClass();
                m1wVar.invoke(((fbr) cpVar.u()).f9275a);
                break;
        }
        return Unit.f46060a;
    }
}
