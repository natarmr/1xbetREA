package a;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.gov.nist.core.Separators;
import android.net.Uri;
import com.huawei.hms.support.api.entity.common.CommonConstant;

/* JADX INFO: loaded from: classes.dex */
public final class u23 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f34928a;

    public u23(Context context) {
        this.f34928a = context;
    }

    public final void a(String str) {
        try {
            this.f34928a.startActivity(new Intent(CommonConstant.ACTION.HWID_SCHEME_URL, Uri.parse(str)));
        } catch (ActivityNotFoundException e) {
            e9d0.t(kng0.l("Can't open ", str, Separators.DOT), e);
        }
    }
}
