package a;

import android.gov.nist.core.Separators;
import com.github.mikephil.charting.data.Entry;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class v500 implements iuw {
    public boolean A;
    public int B;
    public ArrayList C;
    public int D;
    public float E;
    public float F;
    public float G;
    public usd H;
    public boolean I;
    public boolean J;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ArrayList f36806a;
    public ArrayList b;
    public String c;
    public int d;
    public boolean e;
    public transient e3u0 f;
    public int g;
    public float h;
    public float i;
    public boolean j;
    public boolean k;
    public cp10 l;
    public float m;
    public boolean n;
    public ArrayList o;
    public float p;
    public float q;
    public float r;
    public float s;
    public int t;
    public boolean u;
    public boolean v;
    public float w;
    public int x;
    public byte y;
    public float z;

    public final ArrayList a(float f) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = this.o;
        int size = arrayList2.size() - 1;
        int i = 0;
        while (i <= size) {
            int i2 = (size + i) / 2;
            float f2 = ((Entry) arrayList2.get(i2)).c;
            if (f == f2) {
                while (i2 > 0 && ((Entry) arrayList2.get(i2 - 1)).c == f) {
                    i2--;
                }
                int size2 = arrayList2.size();
                while (i2 < size2) {
                    Entry entry = (Entry) arrayList2.get(i2);
                    if (entry.c != f) {
                        break;
                    }
                    arrayList.add(entry);
                    i2++;
                }
                break;
            }
            if (f > f2) {
                i = i2 + 1;
            } else {
                size = i2 - 1;
            }
        }
        return arrayList;
    }

    public final Entry b(int i) {
        return (Entry) this.o.get(i);
    }

    public final Entry c(float f, float f2, int i) {
        int iD = d(f, f2, i);
        if (iD > -1) {
            return (Entry) this.o.get(iD);
        }
        return null;
    }

    public final int d(float f, float f2, int i) {
        int i2;
        Entry entry;
        ArrayList arrayList = this.o;
        if (arrayList == null || arrayList.isEmpty()) {
            return -1;
        }
        int size = arrayList.size() - 1;
        int i3 = 0;
        while (i3 < size) {
            int i4 = (i3 + size) / 2;
            float f3 = ((Entry) arrayList.get(i4)).c - f;
            int i5 = i4 + 1;
            float f4 = ((Entry) arrayList.get(i5)).c - f;
            float fAbs = Math.abs(f3);
            float fAbs2 = Math.abs(f4);
            if (fAbs2 >= fAbs) {
                if (fAbs >= fAbs2) {
                    double d = f3;
                    if (d < 0.0d) {
                        if (d < 0.0d) {
                        }
                    }
                }
                size = i4;
            }
            i3 = i5;
        }
        if (size != -1) {
            float f5 = ((Entry) arrayList.get(size)).c;
            if (i == 1) {
                if (f5 < f && size < arrayList.size() - 1) {
                    size++;
                }
            } else if (i == 2 && f5 > f && size > 0) {
                size--;
            }
            if (!Float.isNaN(f2)) {
                while (size > 0 && ((Entry) arrayList.get(size - 1)).c == f5) {
                    size--;
                }
                float f6 = ((Entry) arrayList.get(size)).f45454a;
                loop2: while (true) {
                    i2 = size;
                    do {
                        size++;
                        if (size >= arrayList.size()) {
                            break loop2;
                        }
                        entry = (Entry) arrayList.get(size);
                        if (entry.c != f5) {
                            break loop2;
                        }
                    } while (Math.abs(entry.f45454a - f2) >= Math.abs(f6 - f2));
                    f6 = f2;
                }
                return i2;
            }
        }
        return size;
    }

    public final String toString() {
        ArrayList arrayList = this.o;
        StringBuilder sb = new StringBuilder("DataSet, label: ");
        String str = this.c;
        if (str == null) {
            str = "";
        }
        sb.append(str);
        sb.append(", entries: ");
        sb.append(arrayList.size());
        sb.append(Separators.RETURN);
        StringBuffer stringBuffer = new StringBuffer(sb.toString());
        for (int i = 0; i < arrayList.size(); i++) {
            stringBuffer.append(((Entry) arrayList.get(i)).toString().concat(Separators.SP));
        }
        return stringBuffer.toString();
    }
}
