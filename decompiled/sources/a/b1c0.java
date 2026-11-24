package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.xplatform.personal.impl.presentation.edit_tj.models.ProfileEditTjUiModel;

/* JADX INFO: loaded from: classes5.dex */
public final class b1c0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Function1 f1800a;
    public final /* synthetic */ ProfileEditTjUiModel b;

    public b1c0(Function1 function1, ProfileEditTjUiModel profileEditTjUiModel) {
        this.f1800a = function1;
        this.b = profileEditTjUiModel;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        x5q0 x5q0Var = (x5q0) obj;
        x5q0Var.getClass();
        if (x5q0Var instanceof w5q0) {
            this.f1800a.invoke(new org.xplatform.personal.impl.presentation.edit_tj.models.b((w5q0) x5q0Var, (ProfileEditTjUiModel.ProfileEditItemTjUiModel) this.b));
        }
        return Unit.f46060a;
    }
}
