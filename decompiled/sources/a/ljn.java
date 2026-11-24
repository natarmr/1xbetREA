package a;

import android.content.Context;
import android.content.res.Configuration;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final class ljn extends View {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ kjn f20159a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ljn(kjn kjnVar, Context context) {
        super(context);
        this.f20159a = kjnVar;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        configuration.getClass();
        this.f20159a.run();
    }
}
