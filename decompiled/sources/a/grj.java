package a;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.gov.nist.core.Separators;
import android.net.Uri;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes3.dex */
public final class grj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final jlx f11780a;
    public final ctf0 b;
    public final us00 c;

    public grj(jlx jlxVar, ctf0 ctf0Var, us00 us00Var) {
        ctf0Var.getClass();
        this.f11780a = jlxVar;
        this.b = ctf0Var;
        this.c = us00Var;
    }

    public final void a(String str) {
        str.getClass();
        String strA = this.b.b.a(R.string.deeplink_scheme, Arrays.copyOf(new Object[0], 0));
        String scheme = Uri.parse(str).getScheme();
        if (scheme != null && StringsKt.O(scheme, Separators.SLASH, false)) {
            scheme = null;
        }
        if (scheme == null) {
            str = kng0.l(strA, "://", str);
        }
        Intent intent = new Intent(CommonConstant.ACTION.HWID_SCHEME_URL, Uri.parse(str));
        boolean z = Intrinsics.d(scheme, strA) || scheme == null;
        us00 us00Var = this.c;
        if (sj3.K(us00Var) && z) {
            this.f11780a.a(intent);
            return;
        }
        if (z) {
            try {
                intent.setPackage(us00Var.getPackageName());
            } catch (ActivityNotFoundException e) {
                e.printStackTrace();
                return;
            }
        }
        intent.addFlags(268435456);
        us00Var.startActivity(intent);
    }

    public final void b(String str) {
        str.getClass();
        String strA = this.b.b.a(R.string.deeplink_scheme, Arrays.copyOf(new Object[0], 0));
        String scheme = Uri.parse(str).getScheme();
        if (scheme != null && StringsKt.O(scheme, Separators.SLASH, false)) {
            scheme = null;
        }
        if (scheme == null) {
            str = kng0.l(strA, "://", str);
        }
        Intent intent = new Intent(CommonConstant.ACTION.HWID_SCHEME_URL, Uri.parse(str));
        try {
            intent.addFlags(268435456);
            this.c.startActivity(intent);
        } catch (ActivityNotFoundException e) {
            e.printStackTrace();
        }
    }
}
