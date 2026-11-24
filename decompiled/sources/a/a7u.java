package a;

import java.io.File;

/* JADX INFO: loaded from: classes3.dex */
public final class a7u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mii0 f391a;

    public /* synthetic */ a7u(mii0 mii0Var) {
        this.f391a = mii0Var;
    }

    public void a(String str) {
        str.getClass();
        hk3 hk3Var = (hk3) this.f391a.e;
        hk3Var.getClass();
        File file = new File(hk3Var.f13190a.getFilesDir(), ".CWAC-Update");
        file.mkdirs();
        new File(file, hk3.c(str)).renameTo(new File(file, hk3.b(str)));
    }
}
