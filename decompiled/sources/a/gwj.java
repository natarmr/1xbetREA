package a;

import android.net.Uri;
import androidx.media3.common.MediaItem;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class gwj implements un30 {
    public static final /* synthetic */ int j = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final uii f12030a;
    public final hsj b;
    public kwd c;
    public final long d;
    public final long e;
    public final long f;
    public final float g;
    public final float h;
    public boolean i;

    public gwj(hsj hsjVar, huj hujVar) {
        kwd kwdVar = new kwd();
        this.b = hsjVar;
        this.c = kwdVar;
        uii uiiVar = new uii(hujVar, kwdVar);
        this.f12030a = uiiVar;
        if (hsjVar != ((hsj) uiiVar.d)) {
            uiiVar.d = hsjVar;
            ((HashMap) uiiVar.b).clear();
            ((HashMap) uiiVar.c).clear();
        }
        this.d = -9223372036854775807L;
        this.e = -9223372036854775807L;
        this.f = -9223372036854775807L;
        this.g = -3.4028235E38f;
        this.h = -3.4028235E38f;
        this.i = true;
    }

    public static un30 f(Class cls, hbj hbjVar) {
        try {
            return (un30) cls.getConstructor(hbj.class).newInstance(hbjVar);
        } catch (Exception e) {
            itt0.o(e);
            return null;
        }
    }

    @Override // a.un30
    public final void a() {
        this.i = true;
        uii uiiVar = this.f12030a;
        synchronized (((huj) uiiVar.f35730a)) {
        }
        Iterator it = ((HashMap) uiiVar.c).values().iterator();
        while (it.hasNext()) {
            ((un30) it.next()).a();
        }
    }

    @Override // a.un30
    public final e06 b(MediaItem mediaItem) {
        MediaItem mediaItem2;
        Uri uri;
        String str;
        List list;
        long j2;
        b4x b4xVar;
        mediaItem.b.getClass();
        String scheme = mediaItem.b.f8073a.getScheme();
        if (scheme != null && scheme.equals("ssai")) {
            throw null;
        }
        boolean zEquals = Objects.equals(mediaItem.b.b, "application/x-image-uri");
        en30 en30Var = mediaItem.b;
        if (zEquals) {
            long j3 = en30Var.e;
            String str2 = vtt0.f38024a;
            throw null;
        }
        int iF = vtt0.F(en30Var.f8073a, en30Var.b);
        if (mediaItem.b.e != -9223372036854775807L) {
            huj hujVar = (huj) this.f12030a.f35730a;
            synchronized (hujVar) {
                hujVar.c = true;
            }
            huj hujVar2 = (huj) this.f12030a.f35730a;
            synchronized (hujVar2) {
                hujVar2.d = true;
            }
        }
        try {
            un30 un30VarP = this.f12030a.p(iF);
            cn30 cn30VarA = mediaItem.c.a();
            dn30 dn30Var = mediaItem.c;
            if (dn30Var.f6348a == -9223372036854775807L) {
                cn30VarA.f4635a = this.d;
            }
            if (dn30Var.d == -3.4028235E38f) {
                cn30VarA.d = this.g;
            }
            if (dn30Var.e == -3.4028235E38f) {
                cn30VarA.e = this.h;
            }
            if (dn30Var.b == -9223372036854775807L) {
                cn30VarA.b = this.e;
            }
            if (dn30Var.c == -9223372036854775807L) {
                cn30VarA.c = this.f;
            }
            dn30 dn30Var2 = new dn30(cn30VarA);
            if (dn30Var2.equals(mediaItem.c)) {
                mediaItem2 = mediaItem;
            } else {
                new xuz((byte) 15);
                List list2 = Collections.EMPTY_LIST;
                v3x v3xVar = b4x.b;
                rcf0 rcf0Var = rcf0.e;
                fn30 fn30Var = fn30.f9813a;
                mtc mtcVarA = mediaItem.e.a();
                String str3 = mediaItem.f45383a;
                jn30 jn30Var = mediaItem.d;
                mediaItem.c.a();
                fn30 fn30Var2 = mediaItem.f;
                en30 en30Var2 = mediaItem.b;
                if (en30Var2 != null) {
                    String str4 = en30Var2.b;
                    Uri uri2 = en30Var2.f8073a;
                    List list3 = en30Var2.c;
                    b4x b4xVar2 = en30Var2.d;
                    new xuz((byte) 15);
                    str = str4;
                    uri = uri2;
                    list = list3;
                    j2 = en30Var2.e;
                    b4xVar = b4xVar2;
                } else {
                    uri = null;
                    str = null;
                    list = list2;
                    j2 = -9223372036854775807L;
                    b4xVar = rcf0Var;
                }
                cn30 cn30VarA2 = dn30Var2.a();
                en30 en30Var3 = uri != null ? new en30(uri, str, null, list, b4xVar, j2) : null;
                if (str3 == null) {
                    str3 = "";
                }
                String str5 = str3;
                bn30 bn30Var = new bn30(mtcVarA);
                dn30 dn30Var3 = new dn30(cn30VarA2);
                if (jn30Var == null) {
                    jn30Var = jn30.C;
                }
                mediaItem2 = new MediaItem(str5, bn30Var, en30Var3, dn30Var3, jn30Var, fn30Var2);
            }
            e06 e06VarB = un30VarP.b(mediaItem2);
            b4x b4xVar3 = mediaItem2.b.d;
            if (!b4xVar3.isEmpty()) {
                e06[] e06VarArr = new e06[b4xVar3.size() + 1];
                e06VarArr[0] = e06VarB;
                if (b4xVar3.size() > 0) {
                    if (!this.i) {
                        this.b.getClass();
                        gn30 gn30Var = (gn30) b4xVar3.get(0);
                        new ArrayList(1);
                        new HashSet(1);
                        new CopyOnWriteArrayList();
                        new CopyOnWriteArrayList();
                        new xuz((byte) 15);
                        List list4 = Collections.EMPTY_LIST;
                        v3x v3xVar2 = b4x.b;
                        rcf0 rcf0Var2 = rcf0.e;
                        fn30 fn30Var3 = fn30.f9813a;
                        Uri uri3 = Uri.EMPTY;
                        gn30Var.getClass();
                        throw null;
                    }
                    awq awqVar = new awq();
                    ((gn30) b4xVar3.get(0)).getClass();
                    ArrayList arrayList = mg40.f21724a;
                    awqVar.o = null;
                    ((gn30) b4xVar3.get(0)).getClass();
                    awqVar.d = null;
                    ((gn30) b4xVar3.get(0)).getClass();
                    awqVar.e = 0;
                    ((gn30) b4xVar3.get(0)).getClass();
                    awqVar.f = 0;
                    ((gn30) b4xVar3.get(0)).getClass();
                    awqVar.b = null;
                    ((gn30) b4xVar3.get(0)).getClass();
                    awqVar.f1587a = null;
                    androidx.media3.common.b bVar = new androidx.media3.common.b(awqVar);
                    if (this.c.c(bVar)) {
                        awq awqVarA = bVar.a();
                        awqVarA.o = mg40.n("application/x-media3-cues");
                        awqVarA.k = bVar.p;
                        awqVarA.P = this.c.a(bVar);
                        new androidx.media3.common.b(awqVarA);
                    }
                    ((gn30) b4xVar3.get(0)).getClass();
                    throw null;
                }
                e06VarB = new s340(e06VarArr);
            }
            if (mediaItem2.e.f1132a != Long.MIN_VALUE) {
                cgx0 cgx0Var = new cgx0(e06VarB);
                bn30 bn30Var2 = mediaItem2.e;
                x0x.K(!cgx0Var.b);
                cgx0Var.d = bn30Var2.a();
                x0x.K(!cgx0Var.b);
                cgx0Var.b = true;
                e06VarB = new puc(cgx0Var);
            }
            mediaItem2.b.getClass();
            mediaItem2.b.getClass();
            return e06VarB;
        } catch (ClassNotFoundException e) {
            itt0.o(e);
            return null;
        }
    }

    @Override // a.un30
    public final /* bridge */ /* synthetic */ un30 c(x860 x860Var) {
        g(x860Var);
        return this;
    }

    @Override // a.un30
    public final void d(kwd kwdVar) {
        this.c = kwdVar;
        uii uiiVar = this.f12030a;
        uiiVar.e = kwdVar;
        huj hujVar = (huj) uiiVar.f35730a;
        synchronized (hujVar) {
            hujVar.b = kwdVar;
        }
        Iterator it = ((HashMap) uiiVar.c).values().iterator();
        while (it.hasNext()) {
            ((un30) it.next()).d(kwdVar);
        }
    }

    @Override // a.un30
    public final void e() {
        synchronized (((huj) this.f12030a.f35730a)) {
        }
    }

    public final void g(x860 x860Var) {
        x0x.G(x860Var, "MediaSource.Factory#setLoadErrorHandlingPolicy no longer handles null by instantiating a new DefaultLoadErrorHandlingPolicy. Explicitly construct and pass an instance in order to retain the old behavior.");
        uii uiiVar = this.f12030a;
        uiiVar.f = x860Var;
        Iterator it = ((HashMap) uiiVar.c).values().iterator();
        while (it.hasNext()) {
            ((un30) it.next()).c(x860Var);
        }
    }
}
