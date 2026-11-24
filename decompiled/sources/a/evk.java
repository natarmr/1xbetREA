package a;

import java.io.IOException;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class evk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f8472a;
    public final long[] b = new long[2];
    public final ArrayList c = new ArrayList(2);
    public final ArrayList d = new ArrayList(2);
    public boolean e;
    public boolean f;
    public o24 g;
    public int h;
    public final /* synthetic */ hvk i;

    public evk(hvk hvkVar, String str) {
        this.i = hvkVar;
        this.f8472a = str;
        StringBuilder sb = new StringBuilder(str);
        sb.append('.');
        int length = sb.length();
        for (int i = 0; i < 2; i++) {
            sb.append(i);
            this.c.add(this.i.f13730a.e(sb.toString()));
            sb.append(".tmp");
            this.d.add(this.i.f13730a.e(sb.toString()));
            sb.setLength(length);
        }
    }

    public final fvk a() {
        if (!this.e || this.g != null || this.f) {
            return null;
        }
        ArrayList arrayList = this.c;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            hvk hvkVar = this.i;
            if (i >= size) {
                this.h++;
                return new fvk(hvkVar, this);
            }
            if (!hvkVar.q.n((y190) arrayList.get(i))) {
                try {
                    hvkVar.r(this);
                } catch (IOException unused) {
                }
                return null;
            }
            i++;
        }
    }
}
