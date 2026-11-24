package a;

import android.graphics.Matrix;
import android.graphics.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: loaded from: classes.dex */
public final class m340 implements b290, sfv {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Path f21095a = new Path();
    public final Path b = new Path();
    public final Path c = new Path();
    public final ArrayList d = new ArrayList();
    public final l340 e;

    public m340(l340 l340Var) {
        this.e = l340Var;
    }

    public final void a(Path.Op op) {
        Path path = this.b;
        path.reset();
        Path path2 = this.f21095a;
        path2.reset();
        ArrayList arrayList = this.d;
        for (int size = arrayList.size() - 1; size >= 1; size--) {
            b290 b290Var = (b290) arrayList.get(size);
            if (b290Var instanceof dee) {
                dee deeVar = (dee) b290Var;
                ArrayList arrayList2 = (ArrayList) deeVar.f();
                for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
                    Path pathC = ((b290) arrayList2.get(size2)).c();
                    Matrix matrixE = deeVar.d;
                    hls0 hls0Var = deeVar.l;
                    if (hls0Var != null) {
                        matrixE = hls0Var.e();
                    } else {
                        matrixE.reset();
                    }
                    pathC.transform(matrixE);
                    path.addPath(pathC);
                }
            } else {
                path.addPath(b290Var.c());
            }
        }
        int i = 0;
        b290 b290Var2 = (b290) arrayList.get(0);
        if (b290Var2 instanceof dee) {
            dee deeVar2 = (dee) b290Var2;
            List listF = deeVar2.f();
            while (true) {
                ArrayList arrayList3 = (ArrayList) listF;
                if (i >= arrayList3.size()) {
                    break;
                }
                Path pathC2 = ((b290) arrayList3.get(i)).c();
                Matrix matrixE2 = deeVar2.d;
                hls0 hls0Var2 = deeVar2.l;
                if (hls0Var2 != null) {
                    matrixE2 = hls0Var2.e();
                } else {
                    matrixE2.reset();
                }
                pathC2.transform(matrixE2);
                path2.addPath(pathC2);
                i++;
            }
        } else {
            path2.set(b290Var2.c());
        }
        this.c.op(path2, path, op);
    }

    @Override // a.qde
    public final void b(List list, List list2) {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.d;
            if (i >= arrayList.size()) {
                return;
            }
            ((b290) arrayList.get(i)).b(list, list2);
            i++;
        }
    }

    @Override // a.b290
    public final Path c() {
        Path path = this.c;
        path.reset();
        l340 l340Var = this.e;
        if (!l340Var.b) {
            int iE = hne.E(l340Var.f19341a);
            if (iE == 0) {
                int i = 0;
                while (true) {
                    ArrayList arrayList = this.d;
                    if (i >= arrayList.size()) {
                        break;
                    }
                    path.addPath(((b290) arrayList.get(i)).c());
                    i++;
                }
            } else {
                if (iE == 1) {
                    a(Path.Op.UNION);
                    return path;
                }
                if (iE == 2) {
                    a(Path.Op.REVERSE_DIFFERENCE);
                    return path;
                }
                if (iE == 3) {
                    a(Path.Op.INTERSECT);
                    return path;
                }
                if (iE == 4) {
                    a(Path.Op.XOR);
                    return path;
                }
            }
        }
        return path;
    }

    @Override // a.sfv
    public final void f(ListIterator listIterator) {
        while (listIterator.hasPrevious() && listIterator.previous() != this) {
        }
        while (listIterator.hasPrevious()) {
            qde qdeVar = (qde) listIterator.previous();
            if (qdeVar instanceof b290) {
                this.d.add((b290) qdeVar);
                listIterator.remove();
            }
        }
    }
}
