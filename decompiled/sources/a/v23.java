package a;

import android.content.Context;
import android.content.res.Resources;
import android.gov.nist.core.Separators;
import android.net.Uri;
import java.io.File;

/* JADX INFO: loaded from: classes.dex */
public final class v23 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f36664a;

    public /* synthetic */ v23(byte b) {
        this.f36664a = b;
    }

    public final aot0 a(Object obj, a780 a780Var) {
        switch (this.f36664a) {
            case 0:
                return dqm0.H(((Uri) obj).toString());
            case 1:
                return dqm0.h(((File) obj).getPath());
            case 2:
                return dqm0.h(((y190) obj).f41844a.x());
            case 3:
                int iIntValue = ((Number) obj).intValue();
                Context context = a780Var.f354a;
                try {
                    if (context.getResources().getResourceEntryName(iIntValue) != null) {
                        return dqm0.H("android.resource://" + context.getPackageName() + Separators.SLASH + iIntValue);
                    }
                } catch (Resources.NotFoundException unused) {
                }
                return null;
            default:
                return dqm0.H((String) obj);
        }
    }
}
