package a;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes6.dex */
public final class fza implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f10398a;
    public final /* synthetic */ gza b;

    public /* synthetic */ fza(gza gzaVar, byte b) {
        this.f10398a = b;
        this.b = gzaVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        long backgroundContent;
        long background;
        byte b = this.f10398a;
        gza gzaVar = this.b;
        switch (b) {
            case 0:
                if (gzaVar.c) {
                    pz40 pz40Var = s6t0.f31722a;
                    backgroundContent = s6t0.b().f33626a.getBackgroundLight60();
                } else {
                    pz40 pz40Var2 = s6t0.f31722a;
                    backgroundContent = s6t0.b().f33626a.getBackgroundContent();
                }
                return new y3d(backgroundContent);
            default:
                if (gzaVar.c) {
                    pz40 pz40Var3 = s6t0.f31722a;
                    background = s6t0.b().f33626a.getBackgroundContent();
                } else {
                    pz40 pz40Var4 = s6t0.f31722a;
                    background = s6t0.b().f33626a.getBackground();
                }
                return new y3d(background);
        }
    }
}
