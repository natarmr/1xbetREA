package a;

import android.content.Intent;
import android.net.Uri;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class h590 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f12469a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ l590 c;

    public /* synthetic */ h590(boolean z, l590 l590Var, byte b) {
        this.f12469a = b;
        this.b = z;
        this.c = l590Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f12469a;
        l590 l590Var = this.c;
        boolean z = this.b;
        switch (b) {
            case 0:
                if (z) {
                    ywq ywqVar = l590Var.V1;
                    Intent intentJ = hne.j("android.settings.APPLICATION_DETAILS_SETTINGS");
                    intentJ.setData(Uri.fromParts("package", l590Var.n0().getPackageName(), null));
                    ywqVar.a(intentJ);
                } else {
                    nh70 nh70Var = l590.Y1;
                    l590Var.I0();
                }
                break;
            default:
                if (z) {
                    ywq ywqVar2 = l590Var.V1;
                    Intent intentJ2 = hne.j("android.settings.APPLICATION_DETAILS_SETTINGS");
                    intentJ2.setData(Uri.fromParts("package", l590Var.n0().getPackageName(), null));
                    ywqVar2.a(intentJ2);
                } else {
                    nh70 nh70Var2 = l590.Y1;
                    l590Var.I0();
                }
                break;
        }
        return Unit.f46060a;
    }
}
