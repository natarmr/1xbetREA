package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes2.dex */
public abstract class hpy extends ppy {
    public abstract Object a();

    public final String toString() {
        String string;
        StringBuilder sb = new StringBuilder(getClass().getSimpleName());
        sb.append('(');
        if (this instanceof kpy) {
            string = Separators.DOUBLE_QUOTE + ((Object) ((kpy) this).f18696a) + '\"';
        } else {
            string = a().toString();
        }
        return axq.m(sb, string, ')');
    }
}
