package a;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public class nd00 extends fdx {
    public static final nd00 b = new nd00(0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f23318a;

    public /* synthetic */ nd00(byte b2) {
        this.f23318a = b2;
    }

    @Override // a.nw70
    public void b(htw htwVar, String str, j jVar) {
        byte b2 = this.f23318a;
        jVar.getClass();
    }

    @Override // a.nw70
    public void c(htw htwVar, String str, j jVar) {
        byte b2 = this.f23318a;
        jVar.getClass();
    }

    @Override // a.fdx
    public List d(j jVar) {
        switch (this.f23318a) {
            case 1:
                fr20 fr20Var = cy2.j0;
                jVar.getClass();
                List listA = jVar.a();
                int i = 0;
                while (i < listA.size() && Intrinsics.d(((j) listA.get(i)).f15657a, fr20Var)) {
                    i++;
                }
                int size = listA.size();
                while (size > i && Intrinsics.d(((j) listA.get(size - 1)).f15657a, fr20Var)) {
                    size--;
                }
                return listA.subList(i, size);
            default:
                return super.d(jVar);
        }
    }
}
