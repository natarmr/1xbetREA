package a;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public abstract class jkd implements mry {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f16663a;

    public jkd(byte b) {
        switch (b) {
            case 1:
                this.f16663a = new ArrayList();
                break;
            default:
                this.f16663a = new ArrayList();
                break;
        }
    }

    @Override // a.mry
    public void a() {
        i((String[]) this.f16663a.toArray(new String[0]));
    }

    public boolean b(int i, het hetVar, Object obj) {
        ArrayList arrayList = hetVar.f12939a;
        if (arrayList == null) {
            g(i, hetVar, null);
            return true;
        }
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            Object obj2 = arrayList.get(i2);
            if (!(obj2 instanceof bet)) {
                if (!(obj2 instanceof het)) {
                    udk.e(obj2, "Unexpected child source info ");
                    break;
                }
                if (b(i, (het) obj2, obj)) {
                    g(0, hetVar, obj2);
                    return true;
                }
            } else if (obj2 == obj) {
                g(0, hetVar, obj2);
                return true;
            }
        }
        return false;
    }

    @Override // a.mry
    public void e(Object obj) {
        if (obj instanceof String) {
            this.f16663a.add((String) obj);
        }
    }

    @Override // a.mry
    public lry f(qlc qlcVar) {
        return null;
    }

    public void g(int i, het hetVar, Object obj) {
        this.f16663a.add(new kkd(i, null, null));
    }

    public void h(int i, Object obj, het hetVar, Object obj2) {
        if (Intrinsics.d(obj, ukd.f35823a)) {
            g(i, hetVar, null);
        }
    }

    public abstract void i(String[] strArr);

    @Override // a.mry
    public void c(tlc tlcVar) {
    }

    @Override // a.mry
    public void d(qlc qlcVar, g950 g950Var) {
    }
}
