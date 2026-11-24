package a;

import android.graphics.Matrix;
import android.graphics.Path;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class gb10 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float f10994a;
    public float b;
    public float c;
    public float d;
    public float e;
    public Object f = new ArrayList();
    public Object g = new ArrayList();

    public gb10() {
        d(0.0f, 270.0f, 0.0f);
    }

    public void a(float f) {
        float f2 = this.d;
        if (f2 == f) {
            return;
        }
        float f3 = ((f - f2) + 360.0f) % 360.0f;
        if (f3 > 180.0f) {
            return;
        }
        float f4 = this.b;
        float f5 = this.c;
        qkj0 qkj0Var = new qkj0(f4, f5, f4, f5);
        qkj0Var.f = this.d;
        qkj0Var.g = f3;
        ((ArrayList) this.g).add(new okj0(qkj0Var));
        this.d = f;
    }

    public void b(Matrix matrix, Path path) {
        ArrayList arrayList = (ArrayList) this.f;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((skj0) arrayList.get(i)).a(matrix, path);
        }
    }

    public void c(float f, float f2) {
        rkj0 rkj0Var = new rkj0();
        rkj0Var.b = f;
        rkj0Var.c = f2;
        ((ArrayList) this.f).add(rkj0Var);
        pkj0 pkj0Var = new pkj0(rkj0Var, this.b, this.c);
        float fB = pkj0Var.b() + 270.0f;
        float fB2 = pkj0Var.b() + 270.0f;
        a(fB);
        ((ArrayList) this.g).add(pkj0Var);
        this.d = fB2;
        this.b = f;
        this.c = f2;
    }

    public void d(float f, float f2, float f3) {
        this.f10994a = f;
        this.b = 0.0f;
        this.c = f;
        this.d = f2;
        this.e = (f2 + f3) % 360.0f;
        ((ArrayList) this.f).clear();
        ((ArrayList) this.g).clear();
    }
}
