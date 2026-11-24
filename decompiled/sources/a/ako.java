package a;

import java.util.List;
import java.util.concurrent.TimeoutException;
import kotlin.collections.CollectionsKt;

/* JADX INFO: loaded from: classes5.dex */
public final class ako extends Exception {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f1031a;

    public ako(TimeoutException timeoutException, List list) {
        super(timeoutException);
        this.f1031a = list;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        StringBuilder sb = new StringBuilder("The execution took too long to complete. Original exception: ");
        sb.append(getCause());
        sb.append(", execution thread stacktrace: ");
        List list = this.f1031a;
        return axq.m(sb, list != null ? CollectionsKt.b0(list, null, null, null, gzn.j, 31) : null, '.');
    }
}
