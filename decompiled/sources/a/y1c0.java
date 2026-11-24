package a;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.xplatform.personal.impl.presentation.edit_tj.models.EditProfileTjItemEnum;
import org.xplatform.personal.impl.presentation.edit_tj.models.ProfileEditTjUiModel;

/* JADX INFO: loaded from: classes5.dex */
public final class y1c0 extends bnn0 implements Function2 {
    public boolean i;
    public final /* synthetic */ b2c0 j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y1c0(b2c0 b2c0Var, yje yjeVar) {
        super(2, yjeVar);
        this.j = b2c0Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        return new y1c0(this.j, yjeVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((y1c0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        wne wneVar = wne.f39444a;
        boolean z = this.i;
        b2c0 b2c0Var = this.j;
        if (!z) {
            z1x.P(obj);
            w4p0 w4p0Var = b2c0Var.v;
            List listJ = q3d.j(new mq90(1, b2c0Var.O(1)), new mq90(0, b2c0Var.O(0)));
            this.i = true;
            ((dq00) w4p0Var.b).k(listJ);
            if (Unit.f46060a == wneVar) {
                return wneVar;
            }
        } else {
            if (!z) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(obj);
        }
        Object obj2 = ((p1c0) b2c0Var.D()).b.get(EditProfileTjItemEnum.k);
        ProfileEditTjUiModel.ProfileEditItemClickableTjUiModel profileEditItemClickableTjUiModel = obj2 instanceof ProfileEditTjUiModel.ProfileEditItemClickableTjUiModel ? (ProfileEditTjUiModel.ProfileEditItemClickableTjUiModel) obj2 : null;
        b2c0Var.G(new i1c0(profileEditItemClickableTjUiModel != null ? profileEditItemClickableTjUiModel.c : 0));
        return Unit.f46060a;
    }
}
