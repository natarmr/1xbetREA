package com.huawei.agconnect.config.impl;

import android.content.Context;
import android.util.Log;
import com.huawei.agconnect.config.AesDecrypt;
import com.huawei.agconnect.config.IDecrypt;

/* JADX INFO: loaded from: classes2.dex */
public class FixedDecrypt implements AesDecrypt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f45682a;
    public final String b;
    public DecryptLocalResource c;

    public FixedDecrypt(Context context, String str) {
        Log.d("AGC_FixedDecrypt", "init");
        this.f45682a = context;
        this.b = str;
    }

    @Override // com.huawei.agconnect.config.AesDecrypt
    public final String a(String str) {
        IDecrypt iDecryptB = this.c;
        if (iDecryptB == null) {
            iDecryptB = b();
            this.c = (DecryptLocalResource) iDecryptB;
        }
        return ((DecryptLocalResource) iDecryptB).a(ResourcesUtils.b(this.f45682a, this.b, "agc_", str));
    }

    public final IDecrypt b() {
        Context context = this.f45682a;
        String str = this.b;
        return new DecryptLocalResource(new AesParam(5000, ResourcesUtils.b(context, str, "agc_", "/AD91D45E3E72DB6989DDCB13287E75061FABCB933D886E6C6ABEF0939B577138"), ResourcesUtils.b(context, str, "agc_", "/B314B3BF013DF5AC4134E880AF3D2B7C9FFBE8F0305EAC1C898145E2BCF1F21C"), ResourcesUtils.b(context, str, "agc_", "/C767BD8FDF53E53D059BE95B09E2A71056F5F180AECC62836B287ACA5793421B"), ResourcesUtils.b(context, str, "agc_", "/DCB3E6D4C2CF80F30D89CDBC412C964DA8381BB84668769391FBCC3E329AD0FD"), "PBKDF2WithHmacSHA1"));
    }
}
