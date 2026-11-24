package a;

import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public class ggy extends yzp {
    @Override // a.yzp
    public final void e(y190 y190Var) throws IOException {
        y190Var.getClass();
        if (y190Var.toFile().mkdir()) {
            return;
        }
        h7k h7kVarV = v(y190Var);
        if (h7kVarV == null || !h7kVarV.c) {
            itt0.j(y190Var, "failed to create directory: ");
        }
    }

    public String toString() {
        return "JvmSystemFileSystem";
    }
}
