package a;

import android.content.Context;
import android.content.Intent;
import android.os.Parcelable;
import com.google.android.gms.auth.api.identity.SignInCredential;
import com.google.android.gms.common.api.Status;
import com.huawei.hms.support.feature.result.CommonConstant;

/* JADX INFO: loaded from: classes2.dex */
public final class oaw0 extends nav {
    public static final yzn0 m = new yzn0("Auth.Api.Identity.SignIn.API", new kmx((byte) 6), new qek0());
    public final String l;

    public oaw0(Context context, dbw0 dbw0Var) {
        super(context, m, dbw0Var, mav.c);
        this.l = qaw0.a();
    }

    public static SignInCredential c(Intent intent) throws qa3 {
        Status status = Status.g;
        if (intent == null) {
            throw new qa3(status);
        }
        Parcelable.Creator<Status> creator = Status.CREATOR;
        byte[] byteArrayExtra = intent.getByteArrayExtra(CommonConstant.KEY_STATUS);
        Status status2 = (Status) (byteArrayExtra == null ? null : n6x.w(byteArrayExtra, creator));
        if (status2 == null) {
            throw new qa3(Status.i);
        }
        if (!status2.m()) {
            throw new qa3(status2);
        }
        Parcelable.Creator<SignInCredential> creator2 = SignInCredential.CREATOR;
        byte[] byteArrayExtra2 = intent.getByteArrayExtra("sign_in_credential");
        SignInCredential signInCredential = (SignInCredential) (byteArrayExtra2 != null ? n6x.w(byteArrayExtra2, creator2) : null);
        if (signInCredential != null) {
            return signInCredential;
        }
        throw new qa3(status);
    }
}
