package a;

import android.util.Base64;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class kvu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final t3x f18972a = new t3x(new int[]{0, 2, 1}, 3);
    public static final t3x b = new t3x(new int[]{0, 2, 1, 3, 4}, 5);
    public static final t3x c = new t3x(new int[]{0, 2, 1, 5, 3, 4}, 6);
    public static final t3x d = t3x.b(2, 1, 6, 5, 3, 4);
    public static final t3x e = t3x.b(2, 1, 7, 5, 6, 3, 4);

    public static ed40 a(List list) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            String str = (String) list.get(i);
            String str2 = vtt0.f38024a;
            String[] strArrSplit = str.split("=", 2);
            if (strArrSplit.length != 2) {
                f1t0.g0("VorbisUtil", "Failed to parse Vorbis comment: ".concat(str));
            } else if (strArrSplit[0].equals("METADATA_BLOCK_PICTURE")) {
                try {
                    arrayList.add(nt90.d(new fq80(Base64.decode(strArrSplit[1], 0))));
                } catch (RuntimeException e2) {
                    f1t0.h0("VorbisUtil", "Failed to parse vorbis picture", e2);
                }
            } else {
                arrayList.add(new hvu0(strArrSplit[0], strArrSplit[1]));
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new ed40(arrayList);
    }
}
