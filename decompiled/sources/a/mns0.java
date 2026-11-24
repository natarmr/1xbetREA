package a;

import android.gov.nist.core.Separators;
import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class mns0 {
    public final View b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f22105a = new HashMap();
    public final ArrayList c = new ArrayList();

    public mns0(View view) {
        this.b = view;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof mns0)) {
            return false;
        }
        mns0 mns0Var = (mns0) obj;
        return this.b == mns0Var.b && this.f22105a.equals(mns0Var.f22105a);
    }

    public final int hashCode() {
        return this.f22105a.hashCode() + (this.b.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sbT = brm0.t("TransitionValues@" + Integer.toHexString(hashCode()) + ":\n", "    view = ");
        sbT.append(this.b);
        sbT.append(Separators.RETURN);
        String strConcat = sbT.toString().concat("    values:");
        HashMap map = this.f22105a;
        for (String str : map.keySet()) {
            strConcat = strConcat + "    " + str + ": " + map.get(str) + Separators.RETURN;
        }
        return strConcat;
    }
}
