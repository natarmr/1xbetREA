package a;

import android.content.Context;
import android.graphics.Path;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes5.dex */
public final class j500 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f15911a;
    public final ArrayList b;
    public final n0o0 c;
    public final Path d;

    public j500(Context context, String str) {
        str.getClass();
        this.f15911a = str;
        this.b = new ArrayList();
        this.c = maz.b(new i7q(context, (byte) 15));
        this.d = new Path();
    }

    public final void a() {
        Path path = this.d;
        path.reset();
        ArrayList arrayList = this.b;
        path.moveTo(((o700) arrayList.get(0)).f24761a, ((o700) arrayList.get(0)).b);
        for (int i = 1; i < arrayList.size(); i++) {
            path.lineTo(((o700) arrayList.get(i)).f24761a, ((o700) arrayList.get(i)).b);
        }
    }
}
