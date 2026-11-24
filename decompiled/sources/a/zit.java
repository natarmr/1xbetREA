package a;

import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public abstract class zit implements Cloneable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final kjt f44454a;
    public kjt b;

    public zit(kjt kjtVar) {
        this.f44454a = kjtVar;
        if (kjtVar.m()) {
            jf4.o("Default instance must be immutable.");
            throw null;
        }
        this.b = (kjt) kjtVar.j(4);
    }

    public static void g(Iterable iterable, List list) {
        Charset charset = dmx.f6339a;
        iterable.getClass();
        if (iterable instanceof sez) {
            List listA = ((sez) iterable).a();
            sez sezVar = (sez) list;
            int size = list.size();
            for (Object obj : listA) {
                if (obj == null) {
                    String str = "Element at index " + (sezVar.size() - size) + " is null.";
                    for (int size2 = sezVar.size() - 1; size2 >= size; size2--) {
                        sezVar.remove(size2);
                    }
                    hny.u(str);
                    return;
                }
                if (obj instanceof lg9) {
                    sezVar.L0((lg9) obj);
                } else {
                    sezVar.add((String) obj);
                }
            }
            return;
        }
        if (iterable instanceof sjx) {
            list.addAll((Collection) iterable);
            return;
        }
        if ((list instanceof ArrayList) && (iterable instanceof Collection)) {
            ((ArrayList) list).ensureCapacity(((Collection) iterable).size() + list.size());
        }
        int size3 = list.size();
        for (Object obj2 : iterable) {
            if (obj2 == null) {
                String str2 = "Element at index " + (list.size() - size3) + " is null.";
                for (int size4 = list.size() - 1; size4 >= size3; size4--) {
                    list.remove(size4);
                }
                hny.u(str2);
                return;
            }
            list.add(obj2);
        }
    }

    public final Object clone() {
        zit zitVar = (zit) this.f44454a.j(5);
        boolean zM = this.b.m();
        kjt kjtVar = this.b;
        if (zM) {
            kjtVar.getClass();
            b5d0 b5d0Var = b5d0.c;
            b5d0Var.getClass();
            b5d0Var.a(kjtVar.getClass()).b(kjtVar);
            kjtVar.n();
            kjtVar = this.b;
        }
        zitVar.b = kjtVar;
        return zitVar;
    }

    public final kjt h() {
        boolean zM = this.b.m();
        kjt kjtVar = this.b;
        if (zM) {
            kjtVar.getClass();
            b5d0 b5d0Var = b5d0.c;
            b5d0Var.getClass();
            b5d0Var.a(kjtVar.getClass()).b(kjtVar);
            kjtVar.n();
            kjtVar = this.b;
        }
        kjtVar.getClass();
        boolean zC = true;
        byte bByteValue = ((Byte) kjtVar.j(1)).byteValue();
        if (bByteValue != 1) {
            if (bByteValue == 0) {
                zC = false;
            } else {
                b5d0 b5d0Var2 = b5d0.c;
                b5d0Var2.getClass();
                zC = b5d0Var2.a(kjtVar.getClass()).c(kjtVar);
                kjtVar.j(2);
            }
        }
        if (zC) {
            return kjtVar;
        }
        throw new ss3("Message was missing required fields.  (Lite runtime could not determine which fields were missing).");
    }

    public final void i() {
        if (this.b.m()) {
            return;
        }
        kjt kjtVar = (kjt) this.f44454a.j(4);
        kjt kjtVar2 = this.b;
        b5d0 b5d0Var = b5d0.c;
        b5d0Var.getClass();
        b5d0Var.a(kjtVar.getClass()).a(kjtVar, kjtVar2);
        this.b = kjtVar;
    }
}
