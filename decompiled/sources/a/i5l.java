package a;

import android.content.Context;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class i5l implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f14196a;
    public final /* synthetic */ amw b;

    public /* synthetic */ i5l(amw amwVar, byte b) {
        this.f14196a = b;
        this.b = amwVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f14196a;
        amw amwVar = this.b;
        Context context = (Context) obj;
        switch (b) {
            case 0:
                context.getClass();
                m5l m5lVar = new m5l(context);
                m5lVar.setScrollViewKeeper(amwVar);
                return m5lVar;
            default:
                context.getClass();
                j7l j7lVar = new j7l(context);
                j7lVar.setScrollViewKeeper(amwVar);
                return j7lVar;
        }
    }
}
