package a;

import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes2.dex */
public final class jz40 {
    public static final jz40 b = new jz40();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AtomicReference f17393a = new AtomicReference(new khi0(new hhi0((byte) 0)));

    public final l7x a(w4d0 w4d0Var) {
        AtomicReference atomicReference = this.f17393a;
        khi0 khi0Var = (khi0) atomicReference.get();
        khi0Var.getClass();
        sg9 sg9Var = w4d0Var.b;
        if (!khi0Var.b.containsKey(new ihi0(w4d0.class, sg9Var))) {
            try {
                bjz bjzVar = new bjz();
                w4d0Var.d.ordinal();
                return bjzVar;
            } catch (GeneralSecurityException e) {
                throw new ss3("Creating a LegacyProtoKey failed", e);
            }
        }
        khi0 khi0Var2 = (khi0) atomicReference.get();
        khi0Var2.getClass();
        ihi0 ihi0Var = new ihi0(w4d0.class, sg9Var);
        HashMap map = khi0Var2.b;
        if (map.containsKey(ihi0Var)) {
            return ((rky) map.get(ihi0Var)).b.b(w4d0Var);
        }
        e9d0.h(ihi0Var, " available", "No Key Parser for requested key type ");
        return null;
    }

    public final synchronized void b(rky rkyVar) {
        hhi0 hhi0Var = new hhi0((khi0) this.f17393a.get());
        rkyVar.getClass();
        ihi0 ihi0Var = new ihi0(w4d0.class, rkyVar.f30671a);
        HashMap map = hhi0Var.b;
        if (map.containsKey(ihi0Var)) {
            rky rkyVar2 = (rky) map.get(ihi0Var);
            if (!rkyVar2.equals(rkyVar) || rkyVar != rkyVar2) {
                ohq.v(ihi0Var, "Attempt to register non-equal parser for already existing object of type: ");
            }
        } else {
            map.put(ihi0Var, rkyVar);
        }
        this.f17393a.set(new khi0(hhi0Var));
    }

    public final synchronized void c(yky ykyVar) {
        hhi0 hhi0Var = new hhi0((khi0) this.f17393a.get());
        jhi0 jhi0Var = new jhi0(ykyVar.f42814a, w4d0.class);
        HashMap map = hhi0Var.f13065a;
        if (map.containsKey(jhi0Var)) {
            yky ykyVar2 = (yky) map.get(jhi0Var);
            if (!ykyVar2.equals(ykyVar) || ykyVar != ykyVar2) {
                ohq.v(jhi0Var, "Attempt to register non-equal serializer for already existing object of type: ");
            }
        } else {
            map.put(jhi0Var, ykyVar);
        }
        this.f17393a.set(new khi0(hhi0Var));
    }

    public final synchronized void d(uo80 uo80Var) {
        hhi0 hhi0Var = new hhi0((khi0) this.f17393a.get());
        uo80Var.getClass();
        ihi0 ihi0Var = new ihi0(x4d0.class, uo80Var.f36000a);
        HashMap map = hhi0Var.d;
        if (map.containsKey(ihi0Var)) {
            uo80 uo80Var2 = (uo80) map.get(ihi0Var);
            if (!uo80Var2.equals(uo80Var) || uo80Var != uo80Var2) {
                ohq.v(ihi0Var, "Attempt to register non-equal parser for already existing object of type: ");
            }
        } else {
            map.put(ihi0Var, uo80Var);
        }
        this.f17393a.set(new khi0(hhi0Var));
    }

    public final synchronized void e(vo80 vo80Var) {
        hhi0 hhi0Var = new hhi0((khi0) this.f17393a.get());
        jhi0 jhi0Var = new jhi0(vo80Var.f37754a, x4d0.class);
        HashMap map = hhi0Var.c;
        if (map.containsKey(jhi0Var)) {
            vo80 vo80Var2 = (vo80) map.get(jhi0Var);
            if (!vo80Var2.equals(vo80Var) || vo80Var != vo80Var2) {
                ohq.v(jhi0Var, "Attempt to register non-equal serializer for already existing object of type: ");
            }
        } else {
            map.put(jhi0Var, vo80Var);
        }
        this.f17393a.set(new khi0(hhi0Var));
    }
}
