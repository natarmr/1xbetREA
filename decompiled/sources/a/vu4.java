package a;

import org.xplatform.login.core.presentation.model.AuthDataModel;

/* JADX INFO: loaded from: classes2.dex */
public abstract class vu4 {
    public static final uu4 a(AuthDataModel authDataModel) {
        authDataModel.getClass();
        if (authDataModel != null) {
            if (authDataModel instanceof AuthDataModel.Social) {
                AuthDataModel.Social social = (AuthDataModel.Social) authDataModel;
                return new su4(social.b, social.f46754a, social.c, social.d, social.e);
            }
            if (authDataModel instanceof AuthDataModel.User) {
                AuthDataModel.User user = (AuthDataModel.User) authDataModel;
                return new tu4(user.f46755a, user.b, user.c, user.d);
            }
            if (authDataModel instanceof AuthDataModel.Qr) {
                String str = ((AuthDataModel.Qr) authDataModel).f46753a;
                str.getClass();
                return new ru4(str);
            }
        }
        t9f.b();
        return null;
    }
}
