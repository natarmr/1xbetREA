package a;

import org.xbet.client1.R;
import org.xplatform.uikit.components.views.AppCompatView;

/* JADX INFO: loaded from: classes6.dex */
public final class u0m extends AppCompatView {
    public final void setStyle(yrm yrmVar) {
        int i;
        yrmVar.getClass();
        int iOrdinal = yrmVar.ordinal();
        if (iOrdinal == 0) {
            i = R.drawable.ic_custom_badge_popular;
        } else if (iOrdinal == 1) {
            i = R.drawable.ic_custom_badge_new;
        } else {
            if (iOrdinal != 2) {
                t9f.b();
                return;
            }
            i = 0;
        }
        setBackgroundResource(i);
    }
}
