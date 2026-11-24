package a;

import android.content.Context;
import java.util.List;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes6.dex */
public final class pkm extends nr20 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f27141a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pkm(Context context) {
        super(context, null, R.attr.showMoreStyle);
        context.getClass();
        this.f27141a = q3d.j(new pr20(this, null, R.attr.showMoreStyle), new mt20(this, null, R.attr.showMoreStyle));
    }

    @Override // a.nr20
    public List<lt20> getDelegates() {
        return this.f27141a;
    }
}
