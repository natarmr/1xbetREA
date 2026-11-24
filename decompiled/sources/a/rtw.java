package a;

import android.gov.nist.core.Separators;
import okhttp3.Response;

/* JADX INFO: loaded from: classes3.dex */
public final class rtw extends RuntimeException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f31096a;

    public rtw(jtf0 jtf0Var) {
        StringBuilder sb = new StringBuilder("HTTP ");
        Response response = jtf0Var.f17098a;
        int i = response.d;
        sb.append(i);
        sb.append(Separators.SP);
        sb.append(response.c);
        super(sb.toString());
        this.f31096a = i;
    }
}
