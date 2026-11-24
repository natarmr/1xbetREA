package a;

import java.util.Comparator;

/* JADX INFO: loaded from: classes.dex */
public final class cbz implements Comparator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f4084a;
    public final /* synthetic */ androidx.compose.foundation.lazy.layout.c b;

    public /* synthetic */ cbz(androidx.compose.foundation.lazy.layout.c cVar, byte b) {
        this.f4084a = b;
        this.b = cVar;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        byte b = this.f4084a;
        androidx.compose.foundation.lazy.layout.c cVar = this.b;
        switch (b) {
            case 0:
                return Integer.valueOf(cVar.a(((kbz) obj).getKey())).compareTo(Integer.valueOf(cVar.a(((kbz) obj2).getKey())));
            case 1:
                return Integer.valueOf(cVar.a(((kbz) obj).getKey())).compareTo(Integer.valueOf(cVar.a(((kbz) obj2).getKey())));
            case 2:
                return Integer.valueOf(cVar.a(((kbz) obj2).getKey())).compareTo(Integer.valueOf(cVar.a(((kbz) obj).getKey())));
            default:
                return Integer.valueOf(cVar.a(((kbz) obj2).getKey())).compareTo(Integer.valueOf(cVar.a(((kbz) obj).getKey())));
        }
    }
}
