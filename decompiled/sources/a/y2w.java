package a;

import android.view.View;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class y2w implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f41924a;
    public final /* synthetic */ o0t b;

    public /* synthetic */ y2w(o0t o0tVar, byte b) {
        this.f41924a = b;
        this.b = o0tVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f41924a;
        o0t o0tVar = this.b;
        switch (b) {
            case 0:
                cp cpVar = (cp) obj;
                cpVar.getClass();
                View view = cpVar.f40887a;
                view.getClass();
                dyb.c0(view, new y2w(o0tVar, (byte) 1));
                cpVar.t(new b1w(cpVar, (byte) 1));
                break;
            default:
                ((View) obj).getClass();
                o0tVar.invoke();
                break;
        }
        return Unit.f46060a;
    }
}
