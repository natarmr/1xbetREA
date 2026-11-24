package a;

import java.util.Enumeration;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class hko implements Enumeration {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f13216a;
    public int b;

    @Override // java.util.Enumeration
    public final boolean hasMoreElements() {
        switch (this.f13216a) {
            case 0:
                int i = this.b;
                wko[] wkoVarArr = lko.b;
                return i < 4;
            default:
                int i2 = this.b;
                wko[] wkoVarArr2 = lko.b;
                return i2 < 4;
        }
    }

    @Override // java.util.Enumeration
    public final Object nextElement() {
        switch (this.f13216a) {
            case 0:
                HashMap map = new HashMap();
                for (wko wkoVar : lko.c[this.b]) {
                    map.put(wkoVar.b, wkoVar);
                }
                this.b++;
                return map;
            default:
                this.b++;
                return new HashMap();
        }
    }
}
