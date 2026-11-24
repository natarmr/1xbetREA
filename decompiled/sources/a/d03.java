package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class d03 extends rer implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ uiz f5251a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d03(uiz uizVar) {
        super(1, knx.class, "localToScreen", "startInput$localToScreen(Landroidx/compose/foundation/text/input/internal/LegacyPlatformTextInputServiceAdapter$LegacyPlatformTextInputNode;[F)V", 0);
        this.f5251a = uizVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        float[] fArr = ((ui30) obj).f35710a;
        j6z j6zVar = (j6z) ((hgk0) this.f5251a.r).getValue();
        if (j6zVar != null) {
            if (!j6zVar.h()) {
                j6zVar = null;
            }
            if (j6zVar != null) {
                j6zVar.J(fArr);
            }
        }
        return Unit.f46060a;
    }
}
