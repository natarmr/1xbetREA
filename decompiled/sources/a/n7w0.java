package a;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
public final class n7w0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f23061a = new ArrayList();

    public final void a(Object obj, String str) {
        String string;
        if (obj == null || (string = obj.toString()) == null) {
            string = "null";
        }
        this.f23061a.add(new g7w0(str, string));
    }
}
