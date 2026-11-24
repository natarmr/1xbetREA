package a;

import android.os.Bundle;
import java.util.HashSet;

/* JADX INFO: loaded from: classes2.dex */
public final class vpw0 implements azw0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f37829a;
    public final /* synthetic */ Object b;

    public /* synthetic */ vpw0(Object obj, byte b) {
        this.f37829a = b;
        this.b = obj;
    }

    @Override // a.azw0
    public final void a(String str, String str2, Bundle bundle, long j) {
        byte b = this.f37829a;
        Object obj = this.b;
        switch (b) {
            case 0:
                fuj0 fuj0Var = (fuj0) obj;
                if (((HashSet) fuj0Var.f10166a).contains(str2)) {
                    Bundle bundle2 = new Bundle();
                    f4x f4xVar = tnw0.f34257a;
                    String strX = o5n0.x(str2, cwr0.o, cwr0.j);
                    if (strX != null) {
                        str2 = strX;
                    }
                    bundle2.putString("events", str2);
                    ((yzn0) fuj0Var.b).q(2, bundle2);
                    break;
                }
                break;
            default:
                if (str != null && !tnw0.f34257a.contains(str2)) {
                    Bundle bundle3 = new Bundle();
                    bundle3.putString("name", str2);
                    bundle3.putLong("timestampInMillis", j);
                    bundle3.putBundle("params", bundle);
                    ((yzn0) ((nmt0) obj).f23789a).q(3, bundle3);
                    break;
                }
                break;
        }
    }
}
