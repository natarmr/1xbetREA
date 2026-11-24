package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import org.xplatform.personal.impl.presentation.documentchoice.models.PersonalDocumentRedesignUiModel;

/* JADX INFO: loaded from: classes3.dex */
public final class ixk implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f15545a;
    public final /* synthetic */ Function1 b;
    public final /* synthetic */ PersonalDocumentRedesignUiModel c;

    public /* synthetic */ ixk(Function1 function1, PersonalDocumentRedesignUiModel personalDocumentRedesignUiModel, byte b) {
        this.f15545a = b;
        this.b = function1;
        this.c = personalDocumentRedesignUiModel;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f15545a;
        PersonalDocumentRedesignUiModel personalDocumentRedesignUiModel = this.c;
        Function1 function1 = this.b;
        switch (b) {
            case 0:
                function1.invoke(personalDocumentRedesignUiModel);
                break;
            default:
                function1.invoke(personalDocumentRedesignUiModel);
                break;
        }
        return Unit.f46060a;
    }
}
