package org.xplatform.uikit.components.market.view;

import a.lt20;
import a.mt20;
import a.nr20;
import a.pr20;
import a.q3d;
import android.content.Context;
import android.util.AttributeSet;
import java.util.List;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes6.dex */
public final class DsMarketBlocked extends nr20 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f47251a;

    /* JADX WARN: Illegal instructions before constructor call */
    public DsMarketBlocked(Context context, AttributeSet attributeSet, int i) {
        attributeSet = (i & 2) != 0 ? null : attributeSet;
        context.getClass();
        super(context, attributeSet, R.attr.blockedStyle);
        this.f47251a = q3d.j(new pr20(this, attributeSet, R.attr.blockedStyle), new mt20(this, attributeSet, R.attr.blockedStyle));
    }

    @Override // a.nr20
    public List<lt20> getDelegates() {
        return this.f47251a;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DsMarketBlocked(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DsMarketBlocked(Context context) {
        this(context, null, 6);
        context.getClass();
    }
}
