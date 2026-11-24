package a;

import android.content.ComponentCallbacks2;
import android.content.ContextWrapper;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.view.View;
import android.webkit.MimeTypeMap;
import androidx.activity.result.ActivityResult;
import androidx.fragment.app.Fragment;
import com.huawei.hms.push.constant.RemoteMessageConst;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;
import org.xplatform.uikit.components.dialog.DialogFields;
import org.xplatform.uikit.components.dialog.utils.ActionDialogButtonStyle;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0005\u0006B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\n²\u0006\u0014\u0010\t\u001a\n \b*\u0004\u0018\u00010\u00070\u00078\nX\u008a\u0084\u0002"}, d2 = {"La/i5e;", "La/nw5;", "La/jik;", "<init>", "()V", "a/f5e", "a/kud", "", "kotlin.jvm.PlatformType", "filePath", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class i5e extends nw5<jik> {
    public ii e2;
    public reu f2;
    public wdk0 g2;
    public fdi h2;
    public final kiu0 i2;
    public final ywq j2;
    public final a8z k2;
    public final es l2;
    public final nae0 m2;
    public qog0 n2;
    public final ywq o2;
    public final ywq p2;
    public static final /* synthetic */ iiy[] r2 = {new ez40(i5e.class, "bundleMimeTypes", "getBundleMimeTypes()Ljava/util/List;", 0), new j0d0(i5e.class, "binding", "getBinding()Lorg/xplatform/consultantchat/impl/databinding/DialogConsultantFileBinding;", 0), new ez40(i5e.class, "pendingPermissionReadFileResult", "getPendingPermissionReadFileResult()Lorg/xplatform/consultantchat/presentation/dialogs/file/model/PendingPermissionReadFileResult;", 0)};
    public static final kud q2 = new kud();

    public i5e() {
        final byte b = 0;
        y4e y4eVar = new y4e(this, b);
        svc svcVar = new svc(this, (byte) 18);
        wez wezVar = wez.b;
        a8z a8zVarA = maz.a(wezVar, new svc(svcVar, (byte) 19));
        this.i2 = agc.G(this, sre0.f32672a.b(c6e.class), new wpb(a8zVarA, (byte) 24), new wpb(a8zVarA, (byte) 25), y4eVar);
        this.j2 = m0(new wn(this) { // from class: a.z4e
            public final /* synthetic */ i5e b;

            {
                this.b = this;
            }

            /* JADX WARN: Code duplicated, block: B:29:0x006e  */
            @Override // a.wn
            public final void a(Object obj) {
                f5e f5eVarA1;
                byte b2 = b;
                i5e i5eVar = this.b;
                switch (b2) {
                    case 0:
                        kud kudVar = i5e.q2;
                        if (((ActivityResult) obj).f45280a == -1) {
                            c6e c6eVarW0 = i5eVar.W0();
                            Bundle bundle = i5eVar.g;
                            String string = bundle != null ? bundle.getString("FILE_PATH_BUNDLE_NAME") : null;
                            if (string == null) {
                                string = "";
                            }
                            c6eVarW0.x(kotlin.collections.a.c(new File(string)));
                            break;
                        }
                        break;
                    case 1:
                        List<Uri> list = (List) obj;
                        kud kudVar2 = i5e.q2;
                        list.getClass();
                        if (list.isEmpty()) {
                            i5eVar.x0();
                        } else {
                            ArrayList arrayList = new ArrayList();
                            for (Uri uri : list) {
                                String scheme = uri.getScheme();
                                if (scheme == null) {
                                    f5eVarA1 = null;
                                } else {
                                    int iHashCode = scheme.hashCode();
                                    if (iHashCode != 3143036) {
                                        if (iHashCode == 951530617 && scheme.equals(RemoteMessageConst.Notification.CONTENT)) {
                                            f5eVarA1 = i5eVar.Z0(uri);
                                        } else {
                                            f5eVarA1 = null;
                                        }
                                    } else if (scheme.equals("file")) {
                                        f5eVarA1 = i5eVar.a1(yqm0.u(uri));
                                    } else {
                                        f5eVarA1 = null;
                                    }
                                }
                                if (f5eVarA1 != null) {
                                    arrayList.add(f5eVarA1);
                                }
                            }
                            ArrayList arrayList2 = new ArrayList();
                            for (Object obj2 : arrayList) {
                                if (obj2 instanceof b5e) {
                                    arrayList2.add(obj2);
                                }
                            }
                            ArrayList arrayList3 = new ArrayList(r3d.q(arrayList2, 10));
                            Iterator it = arrayList2.iterator();
                            while (it.hasNext()) {
                                arrayList3.add(((b5e) it.next()).f2000a);
                            }
                            if (arrayList3.isEmpty()) {
                                i5eVar.c1();
                                i5eVar.x0();
                            } else {
                                i5eVar.W0().x(arrayList3);
                            }
                        }
                        break;
                    default:
                        Uri uri2 = (Uri) obj;
                        kud kudVar3 = i5e.q2;
                        if (uri2 != null) {
                            i5eVar.Y0(uri2);
                        }
                        break;
                }
            }
        }, new xn((byte) 4));
        final byte b2 = 2;
        this.k2 = maz.a(wezVar, new y4e(this, b2));
        this.l2 = new es("BUNDLE_MIME_TYPES");
        this.m2 = ltt0.p(this, g5e.f10713a);
        final byte b3 = 1;
        this.o2 = m0(new wn(this) { // from class: a.z4e
            public final /* synthetic */ i5e b;

            {
                this.b = this;
            }

            /* JADX WARN: Code duplicated, block: B:29:0x006e  */
            @Override // a.wn
            public final void a(Object obj) {
                f5e f5eVarA1;
                byte b4 = b3;
                i5e i5eVar = this.b;
                switch (b4) {
                    case 0:
                        kud kudVar = i5e.q2;
                        if (((ActivityResult) obj).f45280a == -1) {
                            c6e c6eVarW0 = i5eVar.W0();
                            Bundle bundle = i5eVar.g;
                            String string = bundle != null ? bundle.getString("FILE_PATH_BUNDLE_NAME") : null;
                            if (string == null) {
                                string = "";
                            }
                            c6eVarW0.x(kotlin.collections.a.c(new File(string)));
                            break;
                        }
                        break;
                    case 1:
                        List<Uri> list = (List) obj;
                        kud kudVar2 = i5e.q2;
                        list.getClass();
                        if (list.isEmpty()) {
                            i5eVar.x0();
                        } else {
                            ArrayList arrayList = new ArrayList();
                            for (Uri uri : list) {
                                String scheme = uri.getScheme();
                                if (scheme == null) {
                                    f5eVarA1 = null;
                                } else {
                                    int iHashCode = scheme.hashCode();
                                    if (iHashCode != 3143036) {
                                        if (iHashCode == 951530617 && scheme.equals(RemoteMessageConst.Notification.CONTENT)) {
                                            f5eVarA1 = i5eVar.Z0(uri);
                                        } else {
                                            f5eVarA1 = null;
                                        }
                                    } else if (scheme.equals("file")) {
                                        f5eVarA1 = i5eVar.a1(yqm0.u(uri));
                                    } else {
                                        f5eVarA1 = null;
                                    }
                                }
                                if (f5eVarA1 != null) {
                                    arrayList.add(f5eVarA1);
                                }
                            }
                            ArrayList arrayList2 = new ArrayList();
                            for (Object obj2 : arrayList) {
                                if (obj2 instanceof b5e) {
                                    arrayList2.add(obj2);
                                }
                            }
                            ArrayList arrayList3 = new ArrayList(r3d.q(arrayList2, 10));
                            Iterator it = arrayList2.iterator();
                            while (it.hasNext()) {
                                arrayList3.add(((b5e) it.next()).f2000a);
                            }
                            if (arrayList3.isEmpty()) {
                                i5eVar.c1();
                                i5eVar.x0();
                            } else {
                                i5eVar.W0().x(arrayList3);
                            }
                        }
                        break;
                    default:
                        Uri uri2 = (Uri) obj;
                        kud kudVar3 = i5e.q2;
                        if (uri2 != null) {
                            i5eVar.Y0(uri2);
                        }
                        break;
                }
            }
        }, new xn(b3));
        this.p2 = m0(new wn(this) { // from class: a.z4e
            public final /* synthetic */ i5e b;

            {
                this.b = this;
            }

            /* JADX WARN: Code duplicated, block: B:29:0x006e  */
            @Override // a.wn
            public final void a(Object obj) {
                f5e f5eVarA1;
                byte b4 = b2;
                i5e i5eVar = this.b;
                switch (b4) {
                    case 0:
                        kud kudVar = i5e.q2;
                        if (((ActivityResult) obj).f45280a == -1) {
                            c6e c6eVarW0 = i5eVar.W0();
                            Bundle bundle = i5eVar.g;
                            String string = bundle != null ? bundle.getString("FILE_PATH_BUNDLE_NAME") : null;
                            if (string == null) {
                                string = "";
                            }
                            c6eVarW0.x(kotlin.collections.a.c(new File(string)));
                            break;
                        }
                        break;
                    case 1:
                        List<Uri> list = (List) obj;
                        kud kudVar2 = i5e.q2;
                        list.getClass();
                        if (list.isEmpty()) {
                            i5eVar.x0();
                        } else {
                            ArrayList arrayList = new ArrayList();
                            for (Uri uri : list) {
                                String scheme = uri.getScheme();
                                if (scheme == null) {
                                    f5eVarA1 = null;
                                } else {
                                    int iHashCode = scheme.hashCode();
                                    if (iHashCode != 3143036) {
                                        if (iHashCode == 951530617 && scheme.equals(RemoteMessageConst.Notification.CONTENT)) {
                                            f5eVarA1 = i5eVar.Z0(uri);
                                        } else {
                                            f5eVarA1 = null;
                                        }
                                    } else if (scheme.equals("file")) {
                                        f5eVarA1 = i5eVar.a1(yqm0.u(uri));
                                    } else {
                                        f5eVarA1 = null;
                                    }
                                }
                                if (f5eVarA1 != null) {
                                    arrayList.add(f5eVarA1);
                                }
                            }
                            ArrayList arrayList2 = new ArrayList();
                            for (Object obj2 : arrayList) {
                                if (obj2 instanceof b5e) {
                                    arrayList2.add(obj2);
                                }
                            }
                            ArrayList arrayList3 = new ArrayList(r3d.q(arrayList2, 10));
                            Iterator it = arrayList2.iterator();
                            while (it.hasNext()) {
                                arrayList3.add(((b5e) it.next()).f2000a);
                            }
                            if (arrayList3.isEmpty()) {
                                i5eVar.c1();
                                i5eVar.x0();
                            } else {
                                i5eVar.W0().x(arrayList3);
                            }
                        }
                        break;
                    default:
                        Uri uri2 = (Uri) obj;
                        kud kudVar3 = i5e.q2;
                        if (uri2 != null) {
                            i5eVar.Y0(uri2);
                        }
                        break;
                }
            }
        }, new xn(b));
        jd90 jd90Var = jd90.f16318a;
        r2[2].getClass();
        Bundle bundle = this.g;
        if (bundle == null) {
            bundle = new Bundle();
            s0(bundle);
        }
        bundle.putSerializable("ARG_PENDING_FILE_PERMISSION_RESULT", jd90Var);
    }

    public static ArrayList b1(List list) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (kotlin.text.c.x((String) obj, "image/", true)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    @Override // a.nw5
    public final int I0() {
        return R.attr.uikitBackgroundContent;
    }

    @Override // a.nw5
    public final yfu0 L0() {
        Object objN = this.m2.n(r2[1], this);
        objN.getClass();
        return (jik) objN;
    }

    @Override // a.nw5
    public final void P0() {
        ComponentCallbacks2 application = n0().getApplication();
        application.getClass();
        af3 af3Var = application instanceof af3 ? (af3) application : null;
        if (af3Var != null) {
            o5d0 o5d0Var = (o5d0) af3Var.d().get(f7e.class);
            ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
            f7e f7eVar = (f7e) (ze3Var instanceof f7e ? ze3Var : null);
            if (f7eVar != null) {
                f6i f6iVarA = f7eVar.a(a4n0.f(this));
                this.e2 = (ii) f6iVarA.e;
                this.f2 = (reu) f6iVarA.p;
                this.g2 = (wdk0) f6iVarA.f;
                this.h2 = (fdi) ((n5d0) f6iVarA.t).get();
                return;
            }
        }
        jf4.n(b1j.i(f7e.class, "Cannot create dependency "));
    }

    @Override // a.nw5
    public final int Q0() {
        return R.id.root;
    }

    @Override // a.nw5
    public final String R0() {
        String strH = H(R.string.bottom_file_max_file_size_description);
        strH.getClass();
        return strH;
    }

    @Override // a.nw5
    public final String S0() {
        String strH = H(R.string.bottom_file_title);
        strH.getClass();
        return strH;
    }

    public final File T0(Bitmap bitmap) throws IOException {
        File file = new File(new ContextWrapper(o0()).getDir(Environment.DIRECTORY_PICTURES, 0), UUID.randomUUID() + ".jpeg");
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        bitmap.compress(Bitmap.CompressFormat.JPEG, 100, fileOutputStream);
        fileOutputStream.flush();
        fileOutputStream.close();
        return file;
    }

    public final ii U0() {
        ii iiVar = this.e2;
        if (iiVar != null) {
            return iiVar;
        }
        Intrinsics.h("actionDialogManager");
        throw null;
    }

    public final File V0(Uri uri, String str) throws IOException {
        InputStream inputStreamOpenInputStream = o0().getContentResolver().openInputStream(uri);
        File file = new File(o0().getFilesDir(), str);
        if (inputStreamOpenInputStream != null) {
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(file);
                try {
                    wha0.J(inputStreamOpenInputStream, fileOutputStream, 8192);
                    fileOutputStream.close();
                    inputStreamOpenInputStream.close();
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        bkb.E(fileOutputStream, th);
                        throw th2;
                    }
                }
            } catch (Throwable th3) {
                try {
                    throw th3;
                } catch (Throwable th4) {
                    bkb.E(inputStreamOpenInputStream, th3);
                    throw th4;
                }
            }
        }
        if (inputStreamOpenInputStream != null) {
            inputStreamOpenInputStream.close();
        }
        return file;
    }

    public final c6e W0() {
        return (c6e) this.i2.getValue();
    }

    public final void X0(f5e f5eVar) {
        if (f5eVar instanceof b5e) {
            W0().x(kotlin.collections.a.c(((b5e) f5eVar).f2000a));
            return;
        }
        if (f5eVar.equals(c5e.f3768a)) {
            c1();
            x0();
            return;
        }
        if (f5eVar instanceof d5e) {
            c6e c6eVarW0 = W0();
            File file = ((d5e) f5eVar).f5501a;
            sac.V(jiu0.a(c6eVarW0), u5e.f35089a, null, c6eVarW0.i.b, new v5e(c6eVarW0, file, null), 10);
            return;
        }
        if (!f5eVar.equals(e5e.f7230a)) {
            t9f.b();
            return;
        }
        ii iiVarU0 = U0();
        String strH = H(R.string.error);
        String strH2 = H(R.string.unsupported_file_type);
        String strH3 = H(R.string.ok_new);
        strH3.getClass();
        iiVarU0.d(new DialogFields((CharSequence) strH, (CharSequence) strH2, (CharSequence) strH3, (String) null, (String) null, (String) null, (String) null, (ActionDialogButtonStyle) null, n12.b, false, 1528), F());
        x0();
    }

    public final void Y0(Uri uri) {
        String scheme = uri.getScheme();
        if (scheme != null) {
            int iHashCode = scheme.hashCode();
            if (iHashCode != 3143036) {
                if (iHashCode == 951530617 && scheme.equals(RemoteMessageConst.Notification.CONTENT)) {
                    X0(Z0(uri));
                    return;
                }
            } else if (scheme.equals("file")) {
                X0(a1(yqm0.u(uri)));
                return;
            }
        }
        c1();
        x0();
    }

    @Override // a.nw5, a.sik, androidx.fragment.app.Fragment
    public final void Z() {
        super.Z();
        qog0 qog0Var = this.n2;
        if (qog0Var != null) {
            rg90 rg90Var = (rg90) this.k2.getValue();
            rg90Var.getClass();
            qog0Var.f29072a.remove(rg90Var);
        }
    }

    public final f5e Z0(Uri uri) {
        f5e b5eVar;
        iiy[] iiyVarArr = r2;
        es esVar = this.l2;
        c5e c5eVar = c5e.f3768a;
        try {
            Cursor cursorQuery = o0().getContentResolver().query(uri, null, null, null, null);
            if (cursorQuery == null) {
                return c5eVar;
            }
            try {
                int columnIndex = cursorQuery.getColumnIndex("_size");
                int columnIndex2 = cursorQuery.getColumnIndex("_display_name");
                if (!cursorQuery.moveToFirst()) {
                    c1();
                    cursorQuery.close();
                    return c5eVar;
                }
                cursorQuery.getLong(columnIndex);
                n0o0 n0o0VarB = maz.b(new x9c(cursorQuery, columnIndex2, (byte) 1));
                String str = (String) n0o0VarB.getValue();
                str.getClass();
                qek0 qek0Var = j85.b;
                if (kotlin.text.c.n(str, ".heic", true)) {
                    Bitmap bitmapDecodeStream = BitmapFactory.decodeStream(o0().getContentResolver().openInputStream(uri));
                    bitmapDecodeStream.getClass();
                    b5eVar = new b5e(T0(bitmapDecodeStream));
                } else {
                    ArrayList<String> arrayListB1 = b1(esVar.n(this, iiyVarArr[0]));
                    if (!arrayListB1.isEmpty()) {
                        for (String str2 : arrayListB1) {
                            String strE = k0q.e(new File((String) n0o0VarB.getValue()));
                            MimeTypeMap singleton = MimeTypeMap.getSingleton();
                            String lowerCase = strE.toLowerCase(Locale.ROOT);
                            lowerCase.getClass();
                            if (kotlin.text.c.o(str2, singleton.getMimeTypeFromExtension(lowerCase))) {
                                String str3 = (String) n0o0VarB.getValue();
                                str3.getClass();
                                b5eVar = new b5e(V0(uri, str3));
                            }
                        }
                    }
                    List<String> listN = esVar.n(this, iiyVarArr[0]);
                    if (!listN.isEmpty()) {
                        for (String str4 : listN) {
                            String strE2 = k0q.e(new File((String) n0o0VarB.getValue()));
                            MimeTypeMap singleton2 = MimeTypeMap.getSingleton();
                            String lowerCase2 = strE2.toLowerCase(Locale.ROOT);
                            lowerCase2.getClass();
                            if (kotlin.text.c.o(str4, singleton2.getMimeTypeFromExtension(lowerCase2))) {
                                String str5 = (String) n0o0VarB.getValue();
                                str5.getClass();
                                b5eVar = new d5e(V0(uri, str5));
                            }
                        }
                    }
                    b5eVar = e5e.f7230a;
                }
                cursorQuery.close();
                return b5eVar;
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    bkb.E(cursorQuery, th);
                    throw th2;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
            return c5eVar;
        }
    }

    public final f5e a1(File file) {
        iiy[] iiyVarArr = r2;
        es esVar = this.l2;
        c5e c5eVar = c5e.f3768a;
        try {
            String absolutePath = file.getAbsolutePath();
            if (file.exists() && file.canRead()) {
                if (kotlin.text.c.x(sj3.c0(file), "image", false)) {
                    return new b5e(file);
                }
                absolutePath.getClass();
                qek0 qek0Var = j85.b;
                if (kotlin.text.c.n(absolutePath, ".heic", true)) {
                    Bitmap bitmapDecodeStream = BitmapFactory.decodeStream(new FileInputStream(file));
                    bitmapDecodeStream.getClass();
                    return new b5e(T0(bitmapDecodeStream));
                }
                ArrayList<String> arrayListB1 = b1(esVar.n(this, iiyVarArr[0]));
                if (!arrayListB1.isEmpty()) {
                    for (String str : arrayListB1) {
                        String strE = k0q.e(file);
                        MimeTypeMap singleton = MimeTypeMap.getSingleton();
                        String lowerCase = strE.toLowerCase(Locale.ROOT);
                        lowerCase.getClass();
                        if (kotlin.text.c.o(str, singleton.getMimeTypeFromExtension(lowerCase))) {
                            return new b5e(file);
                        }
                    }
                }
                List<String> listN = esVar.n(this, iiyVarArr[0]);
                if (!listN.isEmpty()) {
                    for (String str2 : listN) {
                        String strE2 = k0q.e(file);
                        MimeTypeMap singleton2 = MimeTypeMap.getSingleton();
                        String lowerCase2 = strE2.toLowerCase(Locale.ROOT);
                        lowerCase2.getClass();
                        if (kotlin.text.c.o(str2, singleton2.getMimeTypeFromExtension(lowerCase2))) {
                            return new d5e(file);
                        }
                    }
                }
                return e5e.f7230a;
            }
            return c5eVar;
        } catch (Exception e) {
            e.printStackTrace();
            return c5eVar;
        }
    }

    public final void c1() {
        wdk0 wdk0Var = this.g2;
        if (wdk0Var == null) {
            Intrinsics.h("snackbarManager");
            throw null;
        }
        rek0 rek0Var = rek0.b;
        String strH = H(R.string.something_went_wrong);
        strH.getClass();
        wdk0.k(wdk0Var, new xdk0(rek0Var, strH, null, null, null, null, 124), this, null, null, false, null, 1020);
    }

    @Override // a.nw5, androidx.fragment.app.Fragment
    public final void i0(View view, Bundle bundle) throws Exception {
        view.getClass();
        super.i0(view, bundle);
        Fragment fragment = this.y;
        byte b = 3;
        if (fragment != null) {
            ccq0.V(fragment, "VERIFICATION_PERMISSION", new y4e(this, b));
        }
        Fragment fragment2 = this.y;
        final byte b2 = 1;
        if (fragment2 != null) {
            ccq0.T(fragment2, "VERIFICATION_PERMISSION", new y4e(this, b2));
        }
        final byte b3 = 0;
        n0().r().u0(m2a.class.getName(), this, new lrc(new m2a((byte) 0), this));
        ol60 ol60Var = W0().j;
        fob fobVar = new fob(this, null, (byte) 15);
        lkz lkzVar = lkz.f20223a;
        clz clzVarW = aac.W(this);
        qjj.W(x0x.Q(clzVarW.x()), null, null, new cxd((gmq) ol60Var, clzVarW, fobVar, (yje) null, (byte) 0), 3);
        iiy[] iiyVarArr = r2;
        iiy iiyVar = iiyVarArr[1];
        nae0 nae0Var = this.m2;
        Object objN = nae0Var.n(iiyVar, this);
        objN.getClass();
        jik jikVar = (jik) objN;
        dyb.O(jikVar.b, new Function1(this) { // from class: a.a5e
            public final /* synthetic */ i5e b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                byte b4 = b3;
                i5e i5eVar = this.b;
                View view2 = (View) obj;
                switch (b4) {
                    case 0:
                        kud kudVar = i5e.q2;
                        view2.getClass();
                        c6e c6eVarW0 = i5eVar.W0();
                        sac.V(jiu0.a(c6eVarW0), b6e.f2049a, null, c6eVarW0.i.b, new z5e(c6eVarW0, null, (byte) 2), 10);
                        break;
                    case 1:
                        kud kudVar2 = i5e.q2;
                        view2.getClass();
                        c6e c6eVarW1 = i5eVar.W0();
                        sac.V(jiu0.a(c6eVarW1), a6e.f314a, null, c6eVarW1.i.b, new z5e(c6eVarW1, null, (byte) 1), 10);
                        break;
                    default:
                        kud kudVar3 = i5e.q2;
                        view2.getClass();
                        c6e c6eVarW2 = i5eVar.W0();
                        sac.V(jiu0.a(c6eVarW2), y5e.f42041a, null, c6eVarW2.i.b, new z5e(c6eVarW2, null, (byte) 0), 10);
                        break;
                }
                return Unit.f46060a;
            }
        });
        dyb.O(jikVar.d, new Function1(this) { // from class: a.a5e
            public final /* synthetic */ i5e b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                byte b4 = b2;
                i5e i5eVar = this.b;
                View view2 = (View) obj;
                switch (b4) {
                    case 0:
                        kud kudVar = i5e.q2;
                        view2.getClass();
                        c6e c6eVarW0 = i5eVar.W0();
                        sac.V(jiu0.a(c6eVarW0), b6e.f2049a, null, c6eVarW0.i.b, new z5e(c6eVarW0, null, (byte) 2), 10);
                        break;
                    case 1:
                        kud kudVar2 = i5e.q2;
                        view2.getClass();
                        c6e c6eVarW1 = i5eVar.W0();
                        sac.V(jiu0.a(c6eVarW1), a6e.f314a, null, c6eVarW1.i.b, new z5e(c6eVarW1, null, (byte) 1), 10);
                        break;
                    default:
                        kud kudVar3 = i5e.q2;
                        view2.getClass();
                        c6e c6eVarW2 = i5eVar.W0();
                        sac.V(jiu0.a(c6eVarW2), y5e.f42041a, null, c6eVarW2.i.b, new z5e(c6eVarW2, null, (byte) 0), 10);
                        break;
                }
                return Unit.f46060a;
            }
        });
        final byte b4 = 2;
        dyb.O(jikVar.c, new Function1(this) { // from class: a.a5e
            public final /* synthetic */ i5e b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                byte b5 = b4;
                i5e i5eVar = this.b;
                View view2 = (View) obj;
                switch (b5) {
                    case 0:
                        kud kudVar = i5e.q2;
                        view2.getClass();
                        c6e c6eVarW0 = i5eVar.W0();
                        sac.V(jiu0.a(c6eVarW0), b6e.f2049a, null, c6eVarW0.i.b, new z5e(c6eVarW0, null, (byte) 2), 10);
                        break;
                    case 1:
                        kud kudVar2 = i5e.q2;
                        view2.getClass();
                        c6e c6eVarW1 = i5eVar.W0();
                        sac.V(jiu0.a(c6eVarW1), a6e.f314a, null, c6eVarW1.i.b, new z5e(c6eVarW1, null, (byte) 1), 10);
                        break;
                    default:
                        kud kudVar3 = i5e.q2;
                        view2.getClass();
                        c6e c6eVarW2 = i5eVar.W0();
                        sac.V(jiu0.a(c6eVarW2), y5e.f42041a, null, c6eVarW2.i.b, new z5e(c6eVarW2, null, (byte) 0), 10);
                        break;
                }
                return Unit.f46060a;
            }
        });
        Object objN2 = nae0Var.n(iiyVarArr[1], this);
        objN2.getClass();
        jik jikVar2 = (jik) objN2;
        reu reuVar = this.f2;
        if (reuVar == null) {
            Intrinsics.h("hasCameraUseCase");
            throw null;
        }
        boolean zHasSystemFeature = ((tgk) ((rrc) reuVar.b).b).f33916a.getPackageManager().hasSystemFeature("android.hardware.camera.any");
        jikVar2.e.setVisibility(zHasSystemFeature ? 0 : 8);
        jikVar2.b.setVisibility(zHasSystemFeature ? (byte) 0 : (byte) 8);
    }
}
