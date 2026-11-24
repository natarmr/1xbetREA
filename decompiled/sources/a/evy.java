package a;

import android.graphics.drawable.Drawable;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class evy implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f8496a;
    public final /* synthetic */ fvy b;
    public final /* synthetic */ n0x c;

    public /* synthetic */ evy(fvy fvyVar, n0x n0xVar, byte b) {
        this.f8496a = b;
        this.b = fvyVar;
        this.c = n0xVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f8496a;
        n0x n0xVar = this.c;
        fvy fvyVar = this.b;
        switch (b) {
            case 0:
                ((Drawable) obj).getClass();
                fvyVar.j = n0xVar.f22722a;
                break;
            case 1:
                fvy.b(fvyVar, n0xVar);
                break;
            default:
                ((Drawable) obj).getClass();
                fvyVar.j = n0xVar.f22722a;
                break;
        }
        return Boolean.FALSE;
    }
}
