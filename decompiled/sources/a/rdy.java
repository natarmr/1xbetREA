package a;

import java.util.LinkedHashMap;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class rdy extends ldy {
    public String i;
    public boolean j;

    @Override // a.ldy
    public final mcy J() {
        return new edy((LinkedHashMap) this.h);
    }

    @Override // a.ldy
    public final void M(mcy mcyVar, String str) {
        str.getClass();
        mcyVar.getClass();
        if (!this.j) {
            LinkedHashMap linkedHashMap = (LinkedHashMap) this.h;
            String str2 = this.i;
            if (str2 == null) {
                Intrinsics.h("tag");
                throw null;
            }
            linkedHashMap.put(str2, mcyVar);
            this.j = true;
            return;
        }
        if (mcyVar instanceof jdy) {
            this.i = ((jdy) mcyVar).b();
            this.j = false;
        } else {
            if (mcyVar instanceof edy) {
                throw xww.d(gdy.b);
            }
            if (mcyVar instanceof yby) {
                throw xww.d(acy.b);
            }
            t9f.b();
        }
    }
}
