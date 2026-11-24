package a;

import android.net.Uri;
import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class tbw {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final sbw f33689a;
    public final HashMap b;
    public final ArrayList c;
    public String d;

    public tbw(sbw sbwVar, String str, Uri uri, int i) {
        this.f33689a = sbwVar;
        HashMap map = new HashMap();
        this.b = map;
        map.put(str, uri);
        this.d = str;
        ArrayList arrayList = new ArrayList();
        this.c = arrayList;
        if (i != -1) {
            arrayList.add(Integer.valueOf(i));
        }
    }

    public final f4x a() {
        return f4x.m(this.b.keySet());
    }

    public final Uri b() {
        Uri uri = (Uri) this.b.get(this.d);
        uri.getClass();
        return uri;
    }
}
