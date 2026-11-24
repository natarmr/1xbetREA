package a;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.gov.nist.core.Separators;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import org.xbet.client1.R;
import org.xplatform.uikit.components.dialog.DialogFields;

/* JADX INFO: loaded from: classes5.dex */
public final class evz implements ub00, wlu0, ept0 {
    public static d270 c(int i) {
        Object next;
        c0o c0oVar = d270.l;
        y2 y2VarH = ohs0.h(c0oVar, c0oVar);
        do {
            if (!y2VarH.hasNext()) {
                next = null;
                break;
            }
            next = y2VarH.next();
        } while (((d270) next).f5344a != i);
        d270 d270Var = (d270) next;
        return d270Var == null ? d270.UNKNOWN : d270Var;
    }

    public static r760 f(long j) {
        if (j == 0) {
            return r760.b;
        }
        if (j == 1) {
            return r760.c;
        }
        if (j == 2) {
            return r760.d;
        }
        if (j == 3) {
            return r760.e;
        }
        if (j == 5 || j == 13) {
            return r760.f;
        }
        if (j == 6) {
            return r760.g;
        }
        if (j == 7) {
            return r760.h;
        }
        if (j == 8) {
            return r760.i;
        }
        if (j == 9) {
            return r760.j;
        }
        if (j == 10) {
            return r760.k;
        }
        return j == 11 ? r760.l : r760.m;
    }

    public static tx00 g(DialogFields dialogFields, boolean z, boolean z2, boolean z3) {
        tx00 tx00Var = new tx00();
        tx00Var.R0(dialogFields);
        String str = dialogFields.f;
        if (str == null) {
            str = "";
        }
        iiy[] iiyVarArr = tx00.m2;
        tx00Var.k2.x(tx00Var, iiyVarArr[3], str);
        tx00Var.h2.v(tx00Var, iiyVarArr[0], z);
        tx00Var.i2.v(tx00Var, iiyVarArr[1], z2);
        tx00Var.j2.v(tx00Var, iiyVarArr[2], z3);
        return tx00Var;
    }

    @Override // a.wlu0
    public int a() {
        return R.id.view_tree_navigation_event_dispatcher_owner;
    }

    @Override // a.xro
    public wy40 b() {
        return wy40.l();
    }

    @Override // a.ub00
    public void d(View view, String str) {
        Uri uriBuild = Uri.parse(str);
        if (TextUtils.isEmpty(uriBuild.getScheme())) {
            uriBuild = uriBuild.buildUpon().scheme("https").build();
        }
        Context context = view.getContext();
        Intent intent = new Intent(CommonConstant.ACTION.HWID_SCHEME_URL, uriBuild);
        intent.putExtra("com.android.browser.application_id", context.getPackageName());
        try {
            context.startActivity(intent);
        } catch (ActivityNotFoundException unused) {
            Log.w("LinkResolverDef", "Actvity was not found for the link: '" + str + Separators.QUOTE);
        }
    }

    @Override // a.ept0
    public fpt0 e() {
        return new zd40();
    }
}
