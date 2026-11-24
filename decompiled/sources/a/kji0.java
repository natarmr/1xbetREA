package a;

import java.io.FileInputStream;
import java.io.IOException;
import kotlin.Unit;
import kotlin.text.Charsets;

/* JADX INFO: loaded from: classes2.dex */
public final class kji0 implements mhi0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final vji0 f18387a;

    public kji0(vji0 vji0Var) {
        vji0Var.getClass();
        this.f18387a = vji0Var;
    }

    @Override // a.mhi0
    public final Object G() {
        return new gji0(this.f18387a.a(null), null, null);
    }

    @Override // a.mhi0
    public final Unit b0(Object obj, k7t0 k7t0Var) throws IOException {
        byte[] bytes = vby.d.d(gji0.Companion.serializer(), (gji0) obj).getBytes(Charsets.UTF_8);
        bytes.getClass();
        k7t0Var.f17840a.write(bytes);
        return Unit.f46060a;
    }

    @Override // a.mhi0
    public final Object f0(FileInputStream fileInputStream) throws soe {
        try {
            uby ubyVar = vby.d;
            String strM = kotlin.text.c.m(wha0.S(fileInputStream));
            ubyVar.getClass();
            return (gji0) ubyVar.b(gji0.Companion.serializer(), strM);
        } catch (Exception e) {
            throw new soe("Cannot parse session data", e);
        }
    }
}
