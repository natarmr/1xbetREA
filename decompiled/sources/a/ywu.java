package a;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.gov.nist.javax.sip.header.ParameterNames;
import android.graphics.Typeface;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.javax.sip.header.WarningHeader;
import android.javax.sip.message.Response;
import android.util.AttributeSet;
import android.util.TypedValue;
import com.huawei.hms.adapter.internal.AvailableCode;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.TreeMap;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicReference;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import org.xplatform.special_event.impl.special_event_tab.presentation.model.SpecialEventTabScreenParams;

/* JADX INFO: loaded from: classes5.dex */
public final class ywu implements n1x, l0t0, zmh0, jvb0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f43390a;
    public Object b;
    public Object c;
    public Object d;

    public ywu(byte[] bArr) throws GeneralSecurityException {
        this.f43390a = (byte) 15;
        twt0.a(bArr.length);
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
        this.b = secretKeySpec;
        if (!brm0.a(1)) {
            hny.o("Can not use AES-CMAC in FIPS-mode.");
            throw null;
        }
        Cipher cipher = (Cipher) lyn.b.f20870a.a("AES/ECB/NoPadding");
        cipher.init(1, secretKeySpec);
        byte[] bArrR = uc9.R(cipher.doFinal(new byte[16]));
        this.c = bArrR;
        this.d = uc9.R(bArrR);
    }

    public static final ywu j(gny gnyVar) throws GeneralSecurityException {
        if (gnyVar.z() <= 0) {
            hny.o("empty keyset");
            return null;
        }
        ArrayList arrayList = new ArrayList(gnyVar.z());
        for (fny fnyVar : gnyVar.A()) {
            fnyVar.getClass();
            try {
                try {
                    l7x l7xVarA = jz40.b.a(w4d0.a(fnyVar.x().z(), fnyVar.x().A(), fnyVar.x().y(), fnyVar.z(), fnyVar.z() == af80.RAW ? null : Integer.valueOf(fnyVar.y())));
                    int iOrdinal = fnyVar.A().ordinal();
                    if (iOrdinal != 1 && iOrdinal != 2 && iOrdinal != 3) {
                        throw new GeneralSecurityException("Unknown key status");
                    }
                    arrayList.add(new iny(l7xVarA));
                } catch (GeneralSecurityException unused) {
                    arrayList.add(null);
                }
            } catch (GeneralSecurityException e) {
                throw new ss3("Creating a protokey serialization failed", e);
            }
        }
        return new ywu(gnyVar, Collections.unmodifiableList(arrayList));
    }

    public static ywu y(int i, int i2, Context context, AttributeSet attributeSet, int[] iArr) {
        return new ywu(context, context.obtainStyledAttributes(attributeSet, iArr, i, i2));
    }

    public static final ywu z(yk50 yk50Var, r60 r60Var) throws GeneralSecurityException, IOException {
        byte[] bArr = new byte[0];
        ByteArrayInputStream byteArrayInputStream = (ByteArrayInputStream) yk50Var.b;
        try {
            own ownVarZ = own.z(byteArrayInputStream, qso.a());
            byteArrayInputStream.close();
            if (ownVarZ.x().size() == 0) {
                hny.o("empty keyset");
                return null;
            }
            try {
                gny gnyVarE = gny.E(r60Var.b(ownVarZ.x().h(), bArr), qso.a());
                if (gnyVarE.z() > 0) {
                    return j(gnyVarE);
                }
                throw new GeneralSecurityException("empty keyset");
            } catch (ynx unused) {
                hny.o("invalid keyset, corrupted key material");
                return null;
            }
        } catch (Throwable th) {
            byteArrayInputStream.close();
            throw th;
        }
    }

    public void A() {
        ((TypedArray) this.c).recycle();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object B(ArrayList arrayList, zje zjeVar) {
        vix vixVar;
        if (zjeVar instanceof vix) {
            vixVar = (vix) zjeVar;
            int i = vixVar.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                vixVar.k = i - Integer.MIN_VALUE;
            } else {
                vixVar = new vix(this, zjeVar);
            }
        } else {
            vixVar = new vix(this, zjeVar);
        }
        Object obj = vixVar.i;
        wne wneVar = wne.f39444a;
        int i2 = vixVar.k;
        if (i2 == 0) {
            z1x.P(obj);
            dvj dvjVar = ((mne) this.b).b;
            oed oedVar = new oed(this, arrayList, null);
            vixVar.k = 1;
            if (qjj.d0(dvjVar, oedVar, vixVar) == wneVar) {
                return wneVar;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(obj);
        }
        return Unit.f46060a;
    }

    public boolean C(float f, int i) {
        switch (i) {
            case WarningHeader.INCOMPATIBLE_BANDWIDTH_UNITS /* 303 */:
                ((vdv0) this.b).p = f;
                return true;
            case WarningHeader.MEDIA_TYPE_NOT_AVAILABLE /* 304 */:
                ((vdv0) this.b).k = f;
                return true;
            case 305:
                ((vdv0) this.b).l = f;
                return true;
            case WarningHeader.ATTRIBUTE_NOT_UNDERSTOOD /* 306 */:
                ((vdv0) this.b).m = f;
                return true;
            case WarningHeader.SESSION_DESCRIPTION_PARAMETER_NOT_UNDERSTOOD /* 307 */:
            default:
                return false;
            case 308:
                ((vdv0) this.b).h = f;
                return true;
            case 309:
                ((vdv0) this.b).i = f;
                return true;
            case 310:
                ((vdv0) this.b).j = f;
                return true;
            case 311:
                ((vdv0) this.b).n = f;
                return true;
            case 312:
                ((vdv0) this.b).o = f;
                return true;
            case 313:
                ((vdv0) this.b).f = f;
                return true;
            case 314:
                ((vdv0) this.b).g = f;
                return true;
            case 315:
            case 316:
                return true;
        }
    }

    public void D() {
        md3 md3Var = (md3) this.d;
        if (md3Var != null) {
            try {
                ((us00) this.b).unregisterReceiver(md3Var);
                this.d = null;
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    @Override // a.zmh0
    public void a(fq80 fq80Var) {
        long jD;
        long j;
        ((coq0) this.c).getClass();
        String str = vtt0.f38024a;
        coq0 coq0Var = (coq0) this.c;
        synchronized (coq0Var) {
            try {
                long j2 = coq0Var.c;
                jD = j2 != -9223372036854775807L ? j2 + coq0Var.b : coq0Var.d();
            } catch (Throwable th) {
                throw th;
            }
        }
        coq0 coq0Var2 = (coq0) this.c;
        synchronized (coq0Var2) {
            j = coq0Var2.b;
        }
        if (jD == -9223372036854775807L || j == -9223372036854775807L) {
            return;
        }
        androidx.media3.common.b bVar = (androidx.media3.common.b) this.b;
        if (j != bVar.u) {
            awq awqVarA = bVar.a();
            awqVarA.t = j;
            androidx.media3.common.b bVar2 = new androidx.media3.common.b(awqVarA);
            this.b = bVar2;
            ((ncs0) this.d).c(bVar2);
        }
        int iA = fq80Var.a();
        ((ncs0) this.d).a(iA, fq80Var);
        ((ncs0) this.d).b(jD, 1, iA, 0, null);
    }

    @Override // a.zmh0
    public void b(coq0 coq0Var, huo huoVar, zrs0 zrs0Var) {
        this.c = coq0Var;
        zrs0Var.a();
        zrs0Var.b();
        ncs0 ncs0VarQ = huoVar.q(zrs0Var.d, 5);
        this.d = ncs0VarQ;
        ncs0VarQ.c((androidx.media3.common.b) this.b);
    }

    @Override // a.l0t0
    public boolean c(int i, int i2) {
        if (!C(i2, i)) {
            cu40 cu40Var = (cu40) this.c;
            switch (i) {
                case 607:
                    cu40Var.c = i2;
                case Response.SESSION_NOT_ACCEPTABLE /* 606 */:
                    return true;
                case 608:
                case 609:
                case 610:
                case 611:
                case 612:
                    break;
                default:
                    return false;
            }
        }
        return true;
    }

    @Override // a.l0t0
    public boolean d(float f, int i) {
        if (!C(f, i)) {
            cu40 cu40Var = (cu40) this.c;
            switch (i) {
                case 601:
                    cu40Var.d = f;
                case Response.BUSY_EVERYWHERE /* 600 */:
                case 602:
                    return true;
                default:
                    return false;
            }
        }
        return true;
    }

    @Override // a.l0t0
    public boolean e(int i, String str) {
        cu40 cu40Var = (cu40) this.c;
        if (i == 605) {
            cu40Var.f4970a = str;
            return true;
        }
        if (i != 603) {
            return i == 604;
        }
        cu40Var.b = str;
        return true;
    }

    @Override // a.jvb0
    public byte[] f(byte[] bArr, int i) throws GeneralSecurityException {
        byte[] bArrJ0;
        if (i > 16) {
            throw new InvalidAlgorithmParameterException("outputLength too large, max is 16 bytes");
        }
        if (!brm0.a(1)) {
            hny.o("Can not use AES-CMAC in FIPS-mode.");
            return null;
        }
        Cipher cipher = (Cipher) lyn.b.f20870a.a("AES/ECB/NoPadding");
        cipher.init(1, (SecretKeySpec) this.b);
        int iMax = Math.max(1, (int) Math.ceil(((double) bArr.length) / 16.0d));
        if (iMax * 16 == bArr.length) {
            bArrJ0 = nia0.i0(bArr, (iMax - 1) * 16, (byte[]) this.c, 0, 16);
        } else {
            byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, (iMax - 1) * 16, bArr.length);
            if (bArrCopyOfRange.length >= 16) {
                jf4.o("x must be smaller than a block.");
                return null;
            }
            byte[] bArrCopyOf = Arrays.copyOf(bArrCopyOfRange, 16);
            bArrCopyOf[bArrCopyOfRange.length] = -128;
            bArrJ0 = nia0.j0(bArrCopyOf, (byte[]) this.d);
        }
        byte[] bArrDoFinal = new byte[16];
        for (int i2 = 0; i2 < iMax - 1; i2++) {
            bArrDoFinal = cipher.doFinal(nia0.i0(bArrDoFinal, 0, bArr, i2 * 16, 16));
        }
        return Arrays.copyOf(cipher.doFinal(nia0.j0(bArrJ0, bArrDoFinal)), i);
    }

    public TreeMap g(String str) {
        knf0 knf0Var = (knf0) this.d;
        String strC = knf0Var.c();
        int iB = knf0Var.b();
        str.getClass();
        jo20 jo20Var = new jo20();
        jo20Var.put("fcountry", Integer.valueOf(iB));
        jo20Var.put("gr", 1357);
        jo20Var.put(ParameterNames.ID, str);
        jo20Var.put("lng", strC);
        jo20Var.put("ref", 1);
        return new TreeMap(jo20Var.b());
    }

    @Override // a.n1x
    public void h(o1x o1xVar, hhn0 hhn0Var) {
        ColorStateList colorStateList;
        dyw dywVar = hhn0Var.f13073a;
        r0x r0xVar = (r0x) this.c;
        Resources resources = r0xVar.f29650a.getResources();
        resources.getClass();
        Drawable drawableQ = c3x.q(dywVar, resources);
        if ((drawableQ instanceof BitmapDrawable) && (colorStateList = r0xVar.b) != null) {
            ((BitmapDrawable) drawableQ).setTintList(colorStateList);
        }
        ((Function1) this.d).invoke(drawableQ);
    }

    public void i(v3 v3Var) {
        HashSet hashSet = (HashSet) this.d;
        ArrayList arrayList = (ArrayList) this.c;
        if (arrayList.contains(v3Var)) {
            return;
        }
        if (hashSet.contains(v3Var)) {
            e9d0.v(hashSet, "Cyclic dependency chain found: ");
            return;
        }
        hashSet.add(v3Var);
        v3Var.a(this);
        hashSet.remove(v3Var);
        if (arrayList.contains(v3Var)) {
            return;
        }
        if (ime.class.isAssignableFrom(v3Var.getClass())) {
            arrayList.add(0, v3Var);
        } else {
            arrayList.add(v3Var);
        }
    }

    @Override // a.n1x
    public void k(o1x o1xVar, r1o r1oVar) {
        ((Function1) this.b).invoke(r1oVar.c);
    }

    public v3 l() {
        v3 v3Var;
        v3 v3Var2;
        ArrayList arrayList = (ArrayList) this.b;
        Iterator it = ((ArrayList) this.c).iterator();
        do {
            if (!it.hasNext()) {
                v3Var = null;
                break;
            }
            v3Var = (v3) it.next();
        } while (!ime.class.isAssignableFrom(v3Var.getClass()));
        if (v3Var != null) {
            return v3Var;
        }
        Iterator it2 = arrayList.iterator();
        do {
            if (!it2.hasNext()) {
                v3Var2 = null;
                break;
            }
            v3Var2 = (v3) it2.next();
        } while (!ime.class.isAssignableFrom(v3Var2.getClass()));
        if (v3Var2 != null) {
            i(v3Var2);
            return v3Var2;
        }
        e9d0.k("Requested plugin is not added: ", ime.class.getName(), ", plugins: ", arrayList);
        return null;
    }

    public ColorStateList m(int i) {
        int resourceId;
        ColorStateList colorStateListN0;
        TypedArray typedArray = (TypedArray) this.c;
        return (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0 || (colorStateListN0 = jiq0.n0(resourceId, (Context) this.b)) == null) ? typedArray.getColorStateList(i) : colorStateListN0;
    }

    public Drawable n(int i) {
        int resourceId;
        TypedArray typedArray = (TypedArray) this.c;
        return (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0) ? typedArray.getDrawable(i) : epv0.U(resourceId, (Context) this.b);
    }

    public Drawable o(int i) {
        int resourceId;
        Drawable drawableE;
        if (!((TypedArray) this.c).hasValue(i) || (resourceId = ((TypedArray) this.c).getResourceId(i, 0)) == 0) {
            return null;
        }
        td3 td3VarA = td3.a();
        Context context = (Context) this.b;
        synchronized (td3VarA) {
            drawableE = td3VarA.f33746a.e(context, resourceId, true);
        }
        return drawableE;
    }

    public Typeface p(int i, int i2, ke3 ke3Var) {
        int resourceId = ((TypedArray) this.c).getResourceId(i, 0);
        if (resourceId == 0) {
            return null;
        }
        TypedValue typedValue = (TypedValue) this.d;
        if (typedValue == null) {
            typedValue = new TypedValue();
            this.d = typedValue;
        }
        TypedValue typedValue2 = typedValue;
        Context context = (Context) this.b;
        ThreadLocal threadLocal = itf0.f15351a;
        if (context.isRestricted()) {
            return null;
        }
        return itf0.b(context, resourceId, typedValue2, i2, ke3Var, true, false);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object q(zje zjeVar) {
        kw00 kw00Var;
        Object g0g0Var;
        if (zjeVar instanceof kw00) {
            kw00Var = (kw00) zjeVar;
            int i = kw00Var.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                kw00Var.k = i - Integer.MIN_VALUE;
            } else {
                kw00Var = new kw00(this, zjeVar);
            }
        } else {
            kw00Var = new kw00(this, zjeVar);
        }
        Object objD0 = kw00Var.i;
        wne wneVar = wne.f39444a;
        int i2 = kw00Var.k;
        yje yjeVar = null;
        try {
            if (i2 == 0) {
                z1x.P(objD0);
                e0g0 e0g0Var = j0g0.b;
                dvj dvjVar = ((mne) this.d).b;
                slx slxVar = new slx(this, yjeVar, (byte) 21);
                kw00Var.k = 1;
                objD0 = qjj.d0(dvjVar, slxVar, kw00Var);
                if (objD0 == wneVar) {
                    return wneVar;
                }
            } else {
                if (i2 != 1) {
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                z1x.P(objD0);
            }
            g0g0Var = (List) objD0;
            e0g0 e0g0Var2 = j0g0.b;
        } catch (Throwable th) {
            e0g0 e0g0Var3 = j0g0.b;
            g0g0Var = new g0g0(th);
        }
        return j0g0.a(g0g0Var) == null ? g0g0Var : iun.f15405a;
    }

    public Object r(Class cls) throws GeneralSecurityException {
        Class clsA;
        Object objC;
        Object objB;
        AtomicReference atomicReference = pcf0.f26757a;
        try {
            HashMap map = ((dwb0) bz40.b.f3448a.get()).b;
            if (map.containsKey(cls)) {
                clsA = ((jwb0) map.get(cls)).a();
            } else {
                e9d0.h(cls, " available", "No input primitive class for ");
                clsA = null;
            }
        } catch (GeneralSecurityException unused) {
        }
        if (clsA == null) {
            throw new GeneralSecurityException("No wrapper found for ".concat(cls.getName()));
        }
        List list = (List) this.c;
        gny gnyVar = (gny) this.b;
        int i = ttt0.f34523a;
        int iB = gnyVar.B();
        Iterator it = gnyVar.A().iterator();
        int i2 = 0;
        boolean z = false;
        boolean z2 = true;
        while (true) {
            boolean zHasNext = it.hasNext();
            zky zkyVar = zky.ENABLED;
            if (!zHasNext) {
                if (i2 == 0) {
                    hny.o("keyset must contain at least one ENABLED key");
                    return null;
                }
                if (!z && !z2) {
                    hny.o("keyset doesn't contain a valid primary key");
                    return null;
                }
                n660 n660Var = new n660();
                n660Var.b = new ConcurrentHashMap();
                n660Var.f22981a = clsA;
                n660Var.d = mq40.b;
                mq40 mq40Var = (mq40) this.d;
                if (((ConcurrentHashMap) n660Var.b) == null) {
                    jf4.n("setAnnotations cannot be called after build");
                    return null;
                }
                n660Var.d = mq40Var;
                for (int i3 = 0; i3 < gnyVar.z(); i3++) {
                    fny fnyVarY = gnyVar.y(i3);
                    if (fnyVarY.A().equals(zkyVar)) {
                        try {
                            fky fkyVarX = fnyVarY.x();
                            AtomicReference atomicReference2 = pcf0.f26757a;
                            objC = pcf0.c(fkyVarX.z(), fkyVarX.A(), clsA);
                        } catch (GeneralSecurityException e) {
                            if (!e.getMessage().contains("No key manager found for key type ") && !e.getMessage().contains(" not supported by key manager of type ")) {
                                throw e;
                            }
                            objC = null;
                        }
                        if (list.get(i3) != null) {
                            try {
                                objB = pcf0.b(((iny) list.get(i3)).f15094a, clsA);
                            } catch (GeneralSecurityException unused2) {
                                objB = null;
                            }
                        } else {
                            objB = null;
                        }
                        if (fnyVarY.y() == gnyVar.B()) {
                            n660Var.a(objB, objC, fnyVarY, true);
                        } else {
                            n660Var.a(objB, objC, fnyVarY, false);
                        }
                    }
                }
                ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) n660Var.b;
                if (concurrentHashMap == null) {
                    jf4.n("build cannot be called twice");
                    return null;
                }
                fwb0 fwb0Var = (fwb0) n660Var.c;
                mq40 mq40Var2 = (mq40) n660Var.d;
                Class cls2 = (Class) n660Var.f22981a;
                gxu gxuVar = new gxu();
                gxuVar.f12096a = concurrentHashMap;
                gxuVar.b = fwb0Var;
                gxuVar.c = mq40Var2;
                n660Var.b = null;
                AtomicReference atomicReference3 = pcf0.f26757a;
                HashMap map2 = ((dwb0) bz40.b.f3448a.get()).b;
                if (!map2.containsKey(cls)) {
                    ohq.v(cls, "No wrapper found for ");
                    return null;
                }
                jwb0 jwb0Var = (jwb0) map2.get(cls);
                if (cls2.equals(jwb0Var.a()) && jwb0Var.a().equals(cls2)) {
                    return jwb0Var.c(gxuVar);
                }
                hny.o("Input primitive type of the wrapper doesn't match the type of primitives in the provided PrimitiveSet");
                return null;
            }
            fny fnyVar = (fny) it.next();
            if (fnyVar.A() == zkyVar) {
                if (!fnyVar.B()) {
                    throw new GeneralSecurityException(String.format("key %d has no key data", Integer.valueOf(fnyVar.y())));
                }
                if (fnyVar.z() == af80.UNKNOWN_PREFIX) {
                    throw new GeneralSecurityException(String.format("key %d has unknown prefix", Integer.valueOf(fnyVar.y())));
                }
                if (fnyVar.A() == zky.UNKNOWN_STATUS) {
                    throw new GeneralSecurityException(String.format("key %d has unknown status", Integer.valueOf(fnyVar.y())));
                }
                if (fnyVar.y() == iB) {
                    if (z) {
                        hny.o("keyset contains multiple primary keys");
                        return null;
                    }
                    z = true;
                }
                if (fnyVar.x().y() != eky.ASYMMETRIC_PUBLIC) {
                    z2 = false;
                }
                i2++;
            }
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(4:75|27|(1:30)|63) */
    /* JADX WARN: Code duplicated, block: B:30:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:37:0x00e8 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:38:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:39:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:41:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:42:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:45:0x0101  */
    /* JADX WARN: Code duplicated, block: B:48:0x011b  */
    /* JADX WARN: Code duplicated, block: B:51:0x011f  */
    /* JADX WARN: Code duplicated, block: B:53:0x012a  */
    /* JADX WARN: Code duplicated, block: B:55:0x0131  */
    /* JADX WARN: Code duplicated, block: B:57:0x0137  */
    /* JADX WARN: Code duplicated, block: B:58:0x0139  */
    /* JADX WARN: Code duplicated, block: B:61:0x013e  */
    /* JADX WARN: Code duplicated, block: B:64:0x0156  */
    /* JADX WARN: Code duplicated, block: B:66:0x0163  */
    /* JADX WARN: Code duplicated, block: B:67:0x016c  */
    /* JADX WARN: Code duplicated, block: B:68:0x0175 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:69:0x0177  */
    /* JADX WARN: Code duplicated, block: B:71:0x017d  */
    /* JADX WARN: Code duplicated, block: B:75:0x00a9 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00df, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00e0, code lost:
    
        r15 = r9;
        r9 = r0;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x00ea -> B:26:0x00a7). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:64:0x0156 -> B:14:0x004c). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:67:0x016c -> B:50:0x011d). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object s(java.lang.String r23, a.zje r24) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 383
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.ywu.s(java.lang.String, a.zje):java.lang.Object");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(4:75|27|(1:30)|63) */
    /* JADX WARN: Code duplicated, block: B:30:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:37:0x00e8 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:38:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:39:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:41:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:42:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:45:0x0101  */
    /* JADX WARN: Code duplicated, block: B:48:0x011b  */
    /* JADX WARN: Code duplicated, block: B:51:0x011f  */
    /* JADX WARN: Code duplicated, block: B:53:0x012a  */
    /* JADX WARN: Code duplicated, block: B:55:0x0131  */
    /* JADX WARN: Code duplicated, block: B:57:0x0137  */
    /* JADX WARN: Code duplicated, block: B:58:0x0139  */
    /* JADX WARN: Code duplicated, block: B:61:0x013e  */
    /* JADX WARN: Code duplicated, block: B:64:0x0156  */
    /* JADX WARN: Code duplicated, block: B:66:0x0163  */
    /* JADX WARN: Code duplicated, block: B:67:0x016c  */
    /* JADX WARN: Code duplicated, block: B:68:0x0175 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:69:0x0177  */
    /* JADX WARN: Code duplicated, block: B:71:0x017d  */
    /* JADX WARN: Code duplicated, block: B:75:0x00a9 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00df, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00e0, code lost:
    
        r15 = r9;
        r9 = r0;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x00ea -> B:26:0x00a7). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:64:0x0156 -> B:14:0x004c). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:67:0x016c -> B:50:0x011d). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object t(java.lang.String r23, a.zje r24) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 383
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.ywu.t(java.lang.String, a.zje):java.lang.Object");
    }

    public String toString() {
        switch (this.f43390a) {
            case 6:
                return ttt0.a((gny) this.b).toString();
            case 11:
                return ((vdv0) this.b).b + ", " + ((vdv0) this.b).c + ", " + ((vdv0) this.b).d + ", " + ((vdv0) this.b).e;
            default:
                return super.toString();
        }
    }

    public boolean u() throws IOException {
        String strTrim;
        ArrayDeque arrayDeque = (ArrayDeque) this.c;
        if (((String) this.d) == null) {
            if (!arrayDeque.isEmpty()) {
                String str = (String) arrayDeque.poll();
                str.getClass();
                this.d = str;
                return true;
            }
            do {
                String line = ((BufferedReader) this.b).readLine();
                this.d = line;
                if (line == null) {
                    return false;
                }
                strTrim = line.trim();
                this.d = strTrim;
            } while (strTrim.isEmpty());
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    public Object v(long j, String str, kzv kzvVar, zje zjeVar) {
        e4v e4vVar;
        uoy uoyVarJ;
        if (zjeVar instanceof e4v) {
            e4vVar = (e4v) zjeVar;
            int i = e4vVar.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                e4vVar.k = i - Integer.MIN_VALUE;
            } else {
                e4vVar = new e4v(this, zjeVar);
            }
        } else {
            e4vVar = new e4v(this, zjeVar);
        }
        Object objJ = e4vVar.i;
        wne wneVar = wne.f39444a;
        int i2 = e4vVar.k;
        ru6 ru6Var = null;
        if (i2 == 0) {
            z1x.P(objJ);
            fht0 fht0Var = (fht0) this.b;
            long jA = ((x1u) this.c).a();
            lc00 lc00VarB = kotlin.collections.a.b();
            if (kzvVar != null) {
                String str2 = kzvVar.i;
                long j2 = kzvVar.Q;
                if (kzvVar.q) {
                    tqt tqtVar = uoy.b;
                    byte b = kzvVar.S.f36034a;
                    tqtVar.getClass();
                    uoyVarJ = tqt.j(b);
                } else {
                    uoyVarJ = uoy.LINE;
                }
                uoy uoyVar = uoyVarJ;
                nob0 nob0Var = kzvVar.P;
                double d = nob0Var.b;
                long j3 = nob0Var.f23860a;
                std stdVar = gwe.b;
                ru6Var = new ru6(-1L, str2, 0.0d, j2, uoyVar, d, 0L, j3, 0, (Double) null, (String) null, 3328);
            }
            if (ru6Var != null) {
                lc00VarB.add(ru6Var);
            }
            lc00 lc00VarA = kotlin.collections.a.a(lc00VarB);
            iun iunVar = iun.f15405a;
            q4f q4fVar = kzvVar.b;
            int iA = q4fVar.a();
            Boolean bool = Boolean.TRUE;
            byte b2 = ((pru) this.d).a().I1.f26017a;
            e4vVar.k = 1;
            objJ = fht0Var.j(jA, j, lc00VarA, iunVar, 0L, q4fVar, iA, false, false, false, bool, str, b2, false, e4vVar);
            if (objJ == wneVar) {
                return wneVar;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(objJ);
        }
        return CollectionsKt.firstOrNull((List) objJ);
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0061  */
    /* JADX WARN: Code duplicated, block: B:23:0x007d A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:26:0x0086  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x007b -> B:24:0x007e). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public java.lang.Object w(a.zje r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof a.gag0
            if (r0 == 0) goto L13
            r0 = r9
            a.gag0 r0 = (a.gag0) r0
            int r1 = r0.n
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.n = r1
            goto L18
        L13:
            a.gag0 r0 = new a.gag0
            r0.<init>(r8, r9)
        L18:
            java.lang.Object r9 = r0.l
            a.wne r1 = a.wne.f39444a
            int r2 = r0.n
            r3 = 1
            if (r2 == 0) goto L36
            if (r2 != r3) goto L2f
            java.lang.Object r2 = r0.k
            java.util.Iterator r4 = r0.j
            java.util.Collection r5 = r0.i
            java.util.Collection r5 = (java.util.Collection) r5
            a.z1x.P(r9)
            goto L7e
        L2f:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            a.jf4.n(r8)
            r8 = 0
            return r8
        L36:
            a.z1x.P(r9)
            java.lang.Object r9 = r8.b
            a.yru r9 = (a.yru) r9
            a.dpi0 r9 = r9.f43139a
            java.lang.Object r9 = r9.f6468a
            a.g090 r9 = (a.g090) r9
            java.util.List r9 = r9.l()
            boolean r2 = r9.isEmpty()
            if (r2 == 0) goto L50
            kotlin.Unit r8 = kotlin.Unit.f46060a
            return r8
        L50:
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r9 = r9.iterator()
            r4 = r9
            r5 = r2
        L5b:
            boolean r9 = r4.hasNext()
            if (r9 == 0) goto L8a
            java.lang.Object r2 = r4.next()
            r9 = r2
            a.gv00 r9 = (a.gv00) r9
            java.lang.Object r6 = r8.d
            a.ojj r6 = (a.ojj) r6
            r7 = r5
            java.util.Collection r7 = (java.util.Collection) r7
            r0.i = r7
            r0.j = r4
            r0.k = r2
            r0.n = r3
            java.io.Serializable r9 = r6.a(r9, r0)
            if (r9 != r1) goto L7e
            return r1
        L7e:
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            if (r9 != 0) goto L5b
            r5.add(r2)
            goto L5b
        L8a:
            java.util.List r5 = (java.util.List) r5
            java.lang.Object r8 = r8.c
            a.yru r8 = (a.yru) r8
            r5.getClass()
            a.dpi0 r8 = r8.f43139a
            java.lang.Object r8 = r8.f6468a
            a.g090 r8 = (a.g090) r8
            r8.w(r5)
            kotlin.Unit r8 = kotlin.Unit.f46060a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: a.ywu.w(a.zje):java.lang.Object");
    }

    public String x() {
        if (!u()) {
            itt0.a();
            return null;
        }
        String str = (String) this.d;
        this.d = null;
        return str;
    }

    public ywu(rrc rrcVar, vwb0 vwb0Var) {
        this.f43390a = (byte) 16;
        vwb0Var.getClass();
        this.b = rrcVar;
        this.c = vwb0Var;
        this.d = maz.b(new p7d0(this, (byte) 5));
    }

    public ywu(wyu wyuVar, zwu zwuVar, wgu wguVar) {
        this.f43390a = (byte) 0;
        wyuVar.getClass();
        wguVar.getClass();
        this.b = wyuVar;
        this.c = zwuVar;
        this.d = wguVar;
    }

    public ywu(mpt mptVar, k7u k7uVar, ot otVar) {
        this.f43390a = (byte) 20;
        k7uVar.getClass();
        this.b = mptVar;
        this.c = k7uVar;
        this.d = otVar;
    }

    public ywu(nr00 nr00Var, knf0 knf0Var, mne mneVar) {
        this.f43390a = (byte) 8;
        knf0Var.getClass();
        this.b = nr00Var;
        this.c = knf0Var;
        this.d = mneVar;
    }

    public ywu(mne mneVar, afm0 afm0Var, knf0 knf0Var) {
        this.f43390a = (byte) 23;
        knf0Var.getClass();
        this.b = mneVar;
        this.c = afm0Var;
        this.d = knf0Var;
    }

    public ywu(knf0 knf0Var, svu svuVar, mne mneVar) {
        this.f43390a = (byte) 7;
        knf0Var.getClass();
        this.b = knf0Var;
        this.c = svuVar;
        this.d = mneVar;
    }

    public ywu(mne mneVar, kd30 kd30Var, knf0 knf0Var) {
        this.f43390a = (byte) 14;
        knf0Var.getClass();
        this.b = kd30Var;
        this.c = knf0Var;
        this.d = mneVar;
    }

    public ywu(mne mneVar, btt0 btt0Var, gii0 gii0Var) {
        this.f43390a = (byte) 5;
        btt0Var.getClass();
        gii0Var.getClass();
        this.b = mneVar;
        this.c = btt0Var;
        this.d = new tpv(gii0Var, (byte) 7);
    }

    public ywu(eyg0 eyg0Var, s1p0 s1p0Var, knf0 knf0Var) {
        this.f43390a = (byte) 25;
        s1p0Var.getClass();
        knf0Var.getClass();
        this.b = eyg0Var;
        this.c = s1p0Var;
        this.d = knf0Var;
    }

    public ywu(fck0 fck0Var, knf0 knf0Var, btt0 btt0Var) {
        this.f43390a = (byte) 28;
        knf0Var.getClass();
        btt0Var.getClass();
        this.b = fck0Var;
        this.c = knf0Var;
        this.d = btt0Var;
    }

    public ywu(afm0 afm0Var, mne mneVar, knf0 knf0Var) {
        this.f43390a = (byte) 26;
        knf0Var.getClass();
        this.b = afm0Var;
        this.c = mneVar;
        this.d = knf0Var;
    }

    public ywu(us00 us00Var) {
        this.f43390a = (byte) 2;
        this.b = us00Var;
        this.c = roj0.b(1, 0, i99.b, 2);
    }

    public ywu(ArrayList arrayList) {
        this.f43390a = (byte) 17;
        this.b = arrayList;
        this.c = new ArrayList(arrayList.size());
        this.d = new HashSet(3);
    }

    public ywu(SpecialEventTabScreenParams specialEventTabScreenParams, yo4 yo4Var, zr1 zr1Var) {
        this.f43390a = (byte) 22;
        this.b = yo4Var;
        this.c = zr1Var;
        this.d = specialEventTabScreenParams.c.b;
    }

    public ywu(ye80 ye80Var) {
        this.f43390a = (byte) 21;
        this.b = ye80Var;
        this.c = o2e.Y(1);
        this.d = o2e.Z(hvc.f13721a);
    }

    public ywu(byte b) {
        this.f43390a = b;
        switch (b) {
            case AvailableCode.HMS_IS_SPOOF /* 29 */:
                this.b = new WeakHashMap();
                this.c = new WeakHashMap();
                this.d = new WeakHashMap();
                break;
        }
    }

    public ywu(String str) {
        this.f43390a = (byte) 13;
        awq awqVar = new awq();
        awqVar.n = mg40.n("video/mp2t");
        awqVar.o = mg40.n(str);
        this.b = new androidx.media3.common.b(awqVar);
    }

    public /* synthetic */ ywu(Object obj, Object obj2, Object obj3, byte b) {
        this.f43390a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    public ywu(Context context, TypedArray typedArray) {
        this.f43390a = (byte) 27;
        this.b = context;
        this.c = typedArray;
    }

    public ywu(Runnable runnable) {
        this.f43390a = (byte) 10;
        this.c = new CopyOnWriteArrayList();
        this.d = new HashMap();
        this.b = runnable;
    }

    public ywu(vdv0 vdv0Var) {
        this.f43390a = (byte) 11;
        new HashMap();
        cu40 cu40Var = new cu40();
        cu40Var.f4970a = null;
        cu40Var.b = null;
        cu40Var.c = -1;
        cu40Var.d = Float.NaN;
        this.c = cu40Var;
        wv00 wv00Var = new wv00();
        wv00Var.f39816a = (byte) 4;
        this.d = wv00Var;
        this.b = vdv0Var;
    }

    public ywu(gny gnyVar, List list) {
        this.f43390a = (byte) 6;
        this.b = gnyVar;
        this.c = list;
        this.d = mq40.b;
    }

    public ywu(ArrayDeque arrayDeque, BufferedReader bufferedReader) {
        this.f43390a = (byte) 3;
        this.c = arrayDeque;
        this.b = bufferedReader;
    }
}
