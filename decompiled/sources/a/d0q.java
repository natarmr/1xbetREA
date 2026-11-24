package a;

import java.io.File;
import java.util.ArrayDeque;

/* JADX INFO: loaded from: classes2.dex */
public final class d0q extends s2 {
    public final ArrayDeque c;
    public final /* synthetic */ f0q d;

    public d0q(f0q f0qVar) {
        this.d = f0qVar;
        ArrayDeque arrayDeque = new ArrayDeque();
        this.c = arrayDeque;
        File file = f0qVar.f8728a;
        if (file.isDirectory()) {
            arrayDeque.push(b(file));
        } else if (!file.isFile()) {
            this.f31478a = (byte) 2;
        } else {
            file.getClass();
            arrayDeque.push(new b0q(file));
        }
    }

    @Override // a.s2
    public final void a() {
        File file;
        while (true) {
            ArrayDeque arrayDeque = this.c;
            e0q e0qVar = (e0q) arrayDeque.peek();
            if (e0qVar == null) {
                file = null;
                break;
            }
            File fileA = e0qVar.a();
            if (fileA == null) {
                arrayDeque.pop();
            } else {
                if (fileA.equals(e0qVar.f7000a) || !fileA.isDirectory() || arrayDeque.size() >= this.d.f) {
                    file = fileA;
                    break;
                }
                arrayDeque.push(b(fileA));
            }
        }
        if (file == null) {
            this.f31478a = (byte) 2;
        } else {
            this.b = file;
            this.f31478a = (byte) 1;
        }
    }

    public final zzp b(File file) {
        int iOrdinal = this.d.b.ordinal();
        if (iOrdinal == 0) {
            return new c0q(this, file);
        }
        if (iOrdinal == 1) {
            return new a0q(this, file);
        }
        t9f.b();
        return null;
    }
}
