package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.xplatform.uikit.compose.color.StaticColors;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class rja implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f30582a;
    public final /* synthetic */ long b;
    public final /* synthetic */ vtm0 c;

    public /* synthetic */ rja(long j, vtm0 vtm0Var, byte b) {
        this.f30582a = b;
        this.b = j;
        this.c = vtm0Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f30582a) {
            case 0:
                fhl fhlVar = (fhl) obj;
                fhlVar.getClass();
                fhl.o0(fhlVar, StaticColors.INSTANCE.m126getWhite200d7_KjU(), 0L, 0L, this.b, this.c, 230);
                break;
            case 1:
                fhl fhlVar2 = (fhl) obj;
                fhlVar2.getClass();
                pz40 pz40Var = s6t0.f31722a;
                fhl.o0(fhlVar2, s6t0.b().f33626a.getSeparator(), 0L, 0L, this.b, this.c, 230);
                break;
            default:
                fhl fhlVar3 = (fhl) obj;
                fhlVar3.getClass();
                pz40 pz40Var2 = s6t0.f31722a;
                fhl.o0(fhlVar3, StaticColors.INSTANCE.m126getWhite200d7_KjU(), 0L, 0L, this.b, this.c, 230);
                break;
        }
        return Unit.f46060a;
    }
}
