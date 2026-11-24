package a;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.yandex.authsdk.YandexAuthLoginOptions;
import com.yandex.authsdk.YandexAuthOptions;
import com.yandex.authsdk.internal.ChromeTabLoginActivity;

/* JADX INFO: loaded from: classes2.dex */
public final class wic extends tw00 {
    public final /* synthetic */ byte i;
    public final /* synthetic */ r8x j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ wic(r8x r8xVar, uw00 uw00Var, byte b) {
        super(uw00Var);
        this.i = b;
        this.j = r8xVar;
    }

    @Override // a.bsr0
    public final Intent Z(Context context, Object obj) {
        byte b = this.i;
        r8x r8xVar = this.j;
        switch (b) {
            case 0:
                k2w0 k2w0Var = (k2w0) obj;
                k2w0Var.getClass();
                Intent intent = new Intent(context, (Class<?>) ChromeTabLoginActivity.class);
                intent.putExtra("com.yandex.authsdk.internal.EXTRA_PACKAGE_NAME", ((xic) r8xVar).b);
                YandexAuthOptions yandexAuthOptions = k2w0Var.f17592a;
                YandexAuthLoginOptions yandexAuthLoginOptions = k2w0Var.b;
                String str = k2w0Var.c;
                yandexAuthOptions.getClass();
                yandexAuthLoginOptions.getClass();
                str.getClass();
                intent.putExtra("com.yandex.authsdk.EXTRA_OPTIONS", yandexAuthOptions);
                intent.putExtra("com.yandex.authsdk.EXTRA_LOGIN_OPTIONS", yandexAuthLoginOptions);
                intent.putExtra("com.yandex.authsdk.EXTRA_STATE", str);
                return intent;
            default:
                k2w0 k2w0Var2 = (k2w0) obj;
                k2w0Var2.getClass();
                Intent intent2 = ((q950) r8xVar).b;
                YandexAuthOptions yandexAuthOptions2 = k2w0Var2.f17592a;
                yandexAuthOptions2.getClass();
                intent2.putExtra("com.yandex.auth.CLIENT_ID", yandexAuthOptions2.f46055a);
                intent2.putExtra("com.yandex.auth.USE_TESTING_ENV", !TextUtils.equals(yandexAuthOptions2.c, "oauth.yandex.ru"));
                intent2.putExtra("com.yandex.auth.FORCE_CONFIRM", true);
                return intent2;
        }
    }
}
