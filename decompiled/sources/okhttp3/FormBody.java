package okhttp3;

import a.f99;
import a.t99;
import java.io.EOFException;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.text.Regex;
import okhttp3.internal._UtilJvmKt;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lokhttp3/FormBody;", "Lokhttp3/RequestBody;", "Builder", "Companion", "okhttp"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class FormBody extends RequestBody {
    public static final MediaType d;
    public final List b;
    public final List c;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lokhttp3/FormBody$Builder;", "", "okhttp"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ArrayList f46095a = new ArrayList();
        public final ArrayList b = new ArrayList();
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lokhttp3/FormBody$Companion;", "", "Lokhttp3/MediaType;", "CONTENT_TYPE", "Lokhttp3/MediaType;", "okhttp"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    static {
        Regex regex = MediaType.e;
        d = MediaType.Companion.a("application/x-www-form-urlencoded");
    }

    public FormBody(ArrayList arrayList, ArrayList arrayList2) {
        this.b = _UtilJvmKt.j(arrayList);
        this.c = _UtilJvmKt.j(arrayList2);
    }

    @Override // okhttp3.RequestBody
    public final long a() {
        return e(null, true);
    }

    @Override // okhttp3.RequestBody
    /* JADX INFO: renamed from: b */
    public final MediaType getD() {
        return d;
    }

    @Override // okhttp3.RequestBody
    public final void d(t99 t99Var) throws EOFException {
        e(t99Var, false);
    }

    public final long e(t99 t99Var, boolean z) throws EOFException {
        f99 f99VarG;
        if (z) {
            f99VarG = new f99();
        } else {
            t99Var.getClass();
            f99VarG = t99Var.g();
        }
        List list = this.b;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (i > 0) {
                f99VarG.V(38);
            }
            f99VarG.c0((String) list.get(i));
            f99VarG.V(61);
            f99VarG.c0((String) this.c.get(i));
        }
        if (!z) {
            return 0L;
        }
        long j = f99VarG.b;
        f99VarG.a();
        return j;
    }
}
