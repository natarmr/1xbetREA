package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class ab50 extends cb50 {
    public final byte b;

    /* JADX WARN: Multi-variable type inference failed */
    public ab50(int i) {
        super("MENU");
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ab50) && this.b == ((ab50) obj).b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b);
    }

    public final String toString() {
        return ua80.e(this.b, "Menu(mainMenuCategoryId=", Separators.RPAREN);
    }
}
