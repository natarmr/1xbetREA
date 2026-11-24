package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.xplatform.uikit.compose.color.StaticColors;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class y1d implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f41849a;
    public final /* synthetic */ f3d b;

    public /* synthetic */ y1d(f3d f3dVar, byte b) {
        this.f41849a = b;
        this.b = f3dVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f41849a;
        f3d f3dVar = this.b;
        switch (b) {
            case 0:
                uag0 uag0Var = (uag0) obj;
                uag0Var.getClass();
                float fD = (f3dVar.d() * 0.5f) + 1.0f;
                uag0Var.w(fD);
                uag0Var.y(fD);
                return Unit.f46060a;
            case 1:
                fhl fhlVar = (fhl) obj;
                fhlVar.getClass();
                pz40 pz40Var = s6t0.f31722a;
                fhl.u(fhlVar, s6t0.b().f33626a.getBackgroundContent(), 0L, 0L, f3dVar.d(), null, null, 0, 118);
                return Unit.f46060a;
            case 2:
                g7z g7zVar = (g7z) obj;
                g7zVar.getClass();
                g7zVar.a();
                pz40 pz40Var2 = s6t0.f31722a;
                fhl.u(g7zVar, fbc.P(f3dVar.d(), StaticColors.INSTANCE.m123getWhite0d7_KjU(), s6t0.b().f33626a.getSecondary()), 0L, 0L, 0.0f, null, null, 9, 62);
                return Unit.f46060a;
            default:
                float fFloatValue = ((Float) obj).floatValue();
                agk0 agk0Var = f3dVar.f8856a;
                float fL = agk0Var.l() - fFloatValue;
                agk0 agk0Var2 = f3dVar.d;
                float fC = l1e0.c(fL, 0.0f, agk0Var2.l());
                float fL2 = agk0Var.l() - fC;
                agk0Var.m(fC);
                ((hgk0) f3dVar.b).setValue(Boolean.valueOf(fC == agk0Var2.l()));
                return Float.valueOf(fL2);
        }
    }
}
