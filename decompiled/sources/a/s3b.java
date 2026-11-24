package a;

import android.view.View;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class s3b implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f31548a;
    public final /* synthetic */ t3b b;
    public final /* synthetic */ p3b c;

    public /* synthetic */ s3b(t3b t3bVar, p3b p3bVar, byte b) {
        this.f31548a = b;
        this.b = t3bVar;
        this.c = p3bVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f31548a;
        p3b p3bVar = this.c;
        t3b t3bVar = this.b;
        View view = (View) obj;
        switch (b) {
            case 0:
                view.getClass();
                t3bVar.v.invoke(p3bVar);
                break;
            default:
                view.getClass();
                t3bVar.v.invoke(p3bVar);
                break;
        }
        return Unit.f46060a;
    }
}
