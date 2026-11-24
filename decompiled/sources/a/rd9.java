package a;

import android.gov.nist.core.Separators;
import android.os.Bundle;
import androidx.fragment.app.Fragment;

/* JADX INFO: loaded from: classes.dex */
public final class rd9 implements nae0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f30280a;
    public String b;
    public String c;

    public rd9(byte b) {
        this.f30280a = b;
        switch (b) {
            case 1:
                break;
            default:
                this.b = "";
                break;
        }
    }

    @Override // a.nae0
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public String n(Fragment fragment, iiy iiyVar) {
        fragment.getClass();
        iiyVar.getClass();
        String str = this.c;
        if (str == null) {
            Bundle bundle = fragment.g;
            str = null;
            String string = bundle != null ? bundle.getString("TMP_ALERT_STYLE", this.b) : null;
            this.c = string;
            if (string != null) {
                return string;
            }
            e9d0.o();
        }
        return str;
    }

    public boolean equals(Object obj) {
        switch (this.f30280a) {
            case 1:
                if (!(obj instanceof tm80)) {
                    return false;
                }
                tm80 tm80Var = (tm80) obj;
                Object obj2 = tm80Var.f34182a;
                String str = this.b;
                if (obj2 != str && (obj2 == null || !obj2.equals(str))) {
                    return false;
                }
                Object obj3 = tm80Var.b;
                String str2 = this.c;
                return obj3 == str2 || (obj3 != null && obj3.equals(str2));
            default:
                return super.equals(obj);
        }
    }

    public int hashCode() {
        switch (this.f30280a) {
            case 1:
                String str = this.b;
                int iHashCode = str == null ? 0 : str.hashCode();
                String str2 = this.c;
                return iHashCode ^ (str2 != null ? str2.hashCode() : 0);
            default:
                return super.hashCode();
        }
    }

    public String toString() {
        switch (this.f30280a) {
            case 1:
                return "Pair{" + ((Object) this.b) + Separators.SP + ((Object) this.c) + "}";
            default:
                return super.toString();
        }
    }
}
