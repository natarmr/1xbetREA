package a;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class p1r implements s1r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f26217a;
    public final String b;
    public final /* synthetic */ androidx.fragment.app.e c;

    public /* synthetic */ p1r(androidx.fragment.app.e eVar, String str, byte b) {
        this.f26217a = b;
        this.c = eVar;
        this.b = str;
    }

    @Override // a.s1r
    public final boolean a(ArrayList arrayList, ArrayList arrayList2) {
        switch (this.f26217a) {
            case 0:
                androidx.fragment.app.e eVar = this.c;
                String str = this.b;
                if (eVar.n0(arrayList, arrayList2, str)) {
                    return eVar.i0(arrayList, arrayList2, str, -1, 1);
                }
                return false;
            default:
                return this.c.n0(arrayList, arrayList2, this.b);
        }
    }
}
