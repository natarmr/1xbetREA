package a;

import java.io.File;
import java.io.FilenameFilter;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class yrd implements FilenameFilter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f43116a;
    public final /* synthetic */ String b;

    public /* synthetic */ yrd(String str, byte b) {
        this.f43116a = b;
        this.b = str;
    }

    @Override // java.io.FilenameFilter
    public final boolean accept(File file, String str) {
        byte b = this.f43116a;
        String str2 = this.b;
        switch (b) {
            case 0:
                str.getClass();
                return (!StringsKt.O(str, "saved_config", false) || kotlin.text.c.x(str, str2, false) || kotlin.text.c.n(str, ".new", false) || kotlin.text.c.n(str, ".bak", false)) ? false : true;
            default:
                return str.startsWith(str2);
        }
    }
}
