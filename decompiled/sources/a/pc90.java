package a;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes5.dex */
public final class pc90 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p7m0 f26748a = q7m0.a(null);

    public final void a(cd90 cd90Var) {
        p7m0 p7m0Var;
        Object value;
        ui9 ui9Var;
        ArrayList arrayList;
        ArrayList arrayList2 = cd90Var.d;
        do {
            p7m0Var = this.f26748a;
            value = p7m0Var.getValue();
            ui9Var = (ui9) value;
            arrayList = cd90Var.c;
        } while (!p7m0Var.m(value, ui9Var != null ? new ui9(arrayList, arrayList2, cd90Var.f4151a, cd90Var.b, Integer.valueOf(ui9Var.c), Integer.valueOf(ui9Var.d)) : new ui9(arrayList, arrayList2, cd90Var.f4151a, cd90Var.b, null, null)));
    }
}
