package a;

import java.io.Serializable;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class ftv extends a1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f10133a;
    public final p78 b;
    public final Serializable c;

    public ftv() {
        this.f10133a = (byte) 1;
        this.b = new c5x();
        this.c = new ArrayList();
    }

    @Override // a.a1
    public void a(CharSequence charSequence) {
        switch (this.f10133a) {
            case 1:
                ((ArrayList) this.c).add(charSequence);
                break;
        }
    }

    /* JADX WARN: Code duplicated, block: B:22:0x003f A[LOOP:2: B:20:0x003b->B:22:0x003f, LOOP_END] */
    @Override // a.a1
    public void c() {
        int i;
        StringBuilder sb;
        int i2;
        switch (this.f10133a) {
            case 1:
                ArrayList arrayList = (ArrayList) this.c;
                int size = arrayList.size();
                do {
                    size--;
                    if (size >= 0) {
                        CharSequence charSequence = (CharSequence) arrayList.get(size);
                        int length = charSequence.length();
                        i2 = 0;
                        while (true) {
                            if (i2 < length) {
                                char cCharAt = charSequence.charAt(i2);
                                if (cCharAt != ' ') {
                                    switch (cCharAt) {
                                        case '\t':
                                        case '\n':
                                        case 11:
                                        case '\f':
                                        case '\r':
                                            break;
                                    }
                                }
                                i2++;
                            } else {
                                i2 = -1;
                            }
                        }
                    }
                    sb = new StringBuilder();
                    for (i = 0; i < size + 1; i++) {
                        sb.append((CharSequence) arrayList.get(i));
                        sb.append('\n');
                    }
                    ((c5x) this.b).g = sb.toString();
                    break;
                } while (i2 == -1);
                sb = new StringBuilder();
                while (i < size + 1) {
                    sb.append((CharSequence) arrayList.get(i));
                    sb.append('\n');
                }
                ((c5x) this.b).g = sb.toString();
                break;
        }
    }

    @Override // a.a1
    public final p78 d() {
        byte b = this.f10133a;
        p78 p78Var = this.b;
        switch (b) {
            case 0:
                return (etv) p78Var;
            default:
                return (c5x) p78Var;
        }
    }

    @Override // a.a1
    public void f(kdx kdxVar) {
        switch (this.f10133a) {
            case 0:
                kdxVar.f((String) this.c, (etv) this.b);
                break;
        }
    }

    @Override // a.a1
    public final iyc g(yxk yxkVar) {
        switch (this.f10133a) {
            case 0:
                return null;
            default:
                if (yxkVar.g >= 4) {
                    return new iyc(-1, yxkVar.c + 4, false);
                }
                if (yxkVar.h) {
                    return iyc.a(yxkVar.e);
                }
                return null;
        }
    }

    public ftv(int i, String str) {
        this.f10133a = (byte) 0;
        etv etvVar = new etv();
        this.b = etvVar;
        etvVar.g = i;
        this.c = str;
    }
}
