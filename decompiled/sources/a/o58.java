package a;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Binder;
import android.os.Process;

/* JADX INFO: loaded from: classes2.dex */
public final class o58 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f24675a;

    public o58(Context context, byte b) {
        switch (b) {
            case 1:
                this.f24675a = context;
                break;
            default:
                this.f24675a = context.getApplicationContext();
                break;
        }
    }

    public ApplicationInfo a(int i, String str) {
        return this.f24675a.getPackageManager().getApplicationInfo(str, i);
    }

    public PackageInfo b(int i, String str) {
        return this.f24675a.getPackageManager().getPackageInfo(str, i);
    }

    public boolean c() {
        String nameForUid;
        int callingUid = Binder.getCallingUid();
        int iMyUid = Process.myUid();
        Context context = this.f24675a;
        if (callingUid == iMyUid) {
            return cjx.U(context);
        }
        if (!ufx.F() || (nameForUid = context.getPackageManager().getNameForUid(Binder.getCallingUid())) == null) {
            return false;
        }
        return context.getPackageManager().isInstantApp(nameForUid);
    }
}
