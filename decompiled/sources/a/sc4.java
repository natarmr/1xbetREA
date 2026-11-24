package a;

import org.xplatform.login.core.presentation.model.AuthDataModel;

/* JADX INFO: loaded from: classes2.dex */
public abstract class sc4 {
    public static final AuthDataModel a(uu4 uu4Var) {
        if (uu4Var instanceof tu4) {
            tu4 tu4Var = (tu4) uu4Var;
            return new AuthDataModel.User(tu4Var.f34533a, tu4Var.b, tu4Var.c, tu4Var.d);
        }
        if (uu4Var instanceof su4) {
            su4 su4Var = (su4) uu4Var;
            return new AuthDataModel.Social(su4Var.b, su4Var.f32804a, su4Var.c, su4Var.d, su4Var.e);
        }
        if (!(uu4Var instanceof ru4)) {
            t9f.b();
            return null;
        }
        String str = ((ru4) uu4Var).f31106a;
        str.getClass();
        return new AuthDataModel.Qr(str);
    }
}
