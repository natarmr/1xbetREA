package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.CharsKt;
import kotlin.text.Regex;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes2.dex */
public final class yxc implements qjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f43414a;

    public yxc(yk5 yk5Var) {
        this.f43414a = (byte) 3;
    }

    /* JADX WARN: Code duplicated, block: B:61:0x01fa  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // a.qjt
    public final void a(htw htwVar, String str, j jVar) {
        boolean z;
        String strA;
        boolean z2 = true;
        boolean z3 = false;
        switch (this.f43414a) {
            case 0:
                ar20 ar20Var = cy2.M;
                jVar.getClass();
                int length = StringsKt.N(dwi0.N(jVar, str), kotlin.text.c.q(10, Separators.SP)).length();
                htwVar.f0("<pre>");
                List listA = jVar.a();
                if (Intrinsics.d(((j) CollectionsKt.d0(listA)).f15657a, cy2.d0)) {
                    listA = listA.subList(0, listA.size() - 1);
                }
                ArrayList arrayList = new ArrayList();
                Iterator it = listA.iterator();
                boolean z4 = false;
                boolean zD = false;
                boolean z5 = false;
                while (it.hasNext()) {
                    j jVar2 = (j) it.next();
                    if (z4 == z2) {
                        boolean z6 = z3;
                        ar20 ar20Var2 = cy2.c0;
                        List listJ = q3d.j(ar20Var2, ar20Var);
                        ar20 ar20Var3 = jVar2.f15657a;
                        if (listJ.contains(ar20Var3)) {
                            CharSequence charSequenceK = hic.K(length, hic.B(jVar2, str));
                            if (z5 && Intrinsics.d(ar20Var3, ar20Var2)) {
                                String str2 = StringsKt.l0(charSequenceK, "+") ? "line-added" : StringsKt.l0(charSequenceK, "-") ? "line-deleted" : null;
                                if (str2 != null) {
                                    String strL = hne.l('\"', "class=\"code-line ", str2);
                                    CharSequence[] charSequenceArr = new CharSequence[1];
                                    charSequenceArr[z6 ? 1 : 0] = strL;
                                    htwVar.h0(jVar2, "span", charSequenceArr, z6);
                                    htwVar.f0(charSequenceK);
                                    htwVar.g0("span");
                                } else {
                                    htwVar.f0(charSequenceK);
                                }
                            } else {
                                htwVar.f0(charSequenceK);
                            }
                            zD = Intrinsics.d(ar20Var3, ar20Var2);
                        } else {
                            it = it;
                            length = length;
                        }
                    } else {
                        it = it;
                        length = length;
                    }
                    if (z4 || !Intrinsics.d(jVar2.f15657a, cy2.a0)) {
                        z = true;
                    } else {
                        if (Intrinsics.d(jVar2.f15657a, cy2.z)) {
                            strA = "";
                            z = true;
                        } else {
                            Map map = tzn.f34812a;
                            z = true;
                            strA = tzn.a(dwi0.N(jVar2, str), true, true);
                        }
                        String string = StringsKt.u0(strA.toString()).toString();
                        int length2 = string.length();
                        int i = 0;
                        while (true) {
                            if (i >= length2) {
                                i = -1;
                            } else if (!CharsKt.d(string.charAt(i))) {
                                i++;
                            }
                        }
                        if (i != -1) {
                            string = string.substring(0, i);
                        }
                        z5 = (string.equals("diff") || string.equals("patch")) ? z : false;
                        arrayList.add("class=\"language-" + string + '\"');
                    }
                    if (z4 || !Intrinsics.d(jVar2.f15657a, ar20Var)) {
                        z3 = false;
                        z2 = z;
                    } else {
                        String[] strArr = (String[]) arrayList.toArray(new String[0]);
                        htwVar.h0(jVar, "code", (CharSequence[]) Arrays.copyOf(strArr, strArr.length), false);
                        z3 = false;
                        z2 = z;
                        z4 = z2;
                    }
                    it = it;
                    length = length;
                }
                int i2 = z3;
                if (!z4) {
                    String[] strArr2 = (String[]) arrayList.toArray(new String[i2]);
                    htwVar.h0(jVar, "code", (CharSequence[]) Arrays.copyOf(strArr2, strArr2.length), i2);
                }
                if (zD) {
                    htwVar.f0(Separators.RETURN);
                }
                htwVar.f0("</code></pre>");
                break;
            case 1:
                jVar.getClass();
                String string2 = StringsKt.u0(CollectionsKt.b0(jVar.a().subList(1, jVar.a().size() - 1), "", null, null, new s43(str, (byte) 1), 30)).toString();
                htwVar.h0(jVar, "code", new CharSequence[0], false);
                htwVar.f0(string2);
                htwVar.g0("code");
                break;
            case 2:
                jVar.getClass();
                htwVar.f0(dwi0.N(jVar, str));
                break;
            case 3:
                jVar.getClass();
                CharSequence charSequenceN = dwi0.N(jVar, str);
                Map map2 = tzn.f34812a;
                String strA2 = tzn.a(charSequenceN.subSequence(1, charSequenceN.length() - 1), true, false);
                Regex regex = pb00.b;
                htwVar.h0(jVar, "a", new CharSequence[]{"href=\"" + ((Object) y1w0.a(efx.E(charSequenceN, false))) + '\"'}, false);
                htwVar.f0(strA2);
                htwVar.g0("a");
                break;
            case 4:
                jVar.getClass();
                break;
            case 5:
                jVar.getClass();
                htwVar.f0("<pre>");
                htwVar.h0(jVar, "code", new CharSequence[0], false);
                for (j jVar3 : jVar.a()) {
                    if (Intrinsics.d(jVar3.f15657a, cy2.y)) {
                        htwVar.f0(hic.K(4, hic.B(jVar3, str)));
                    } else if (Intrinsics.d(jVar3.f15657a, cy2.M)) {
                        htwVar.f0(Separators.RETURN);
                    }
                }
                htwVar.f0(Separators.RETURN);
                htwVar.g0("code");
                htwVar.f0("</pre>");
                break;
            case 6:
                jVar.getClass();
                htwVar.f0("<hr />");
                break;
            case 7:
                jVar.getClass();
                htwVar.f0("<br />");
                break;
            default:
                jVar.getClass();
                for (j jVar4 : jVar.a()) {
                    if (q3d.j(cy2.M, cy2.A).contains(jVar4.f15657a)) {
                        htwVar.f0(dwi0.N(jVar4, str));
                    }
                }
                htwVar.f0(Separators.RETURN);
                break;
        }
    }

    public /* synthetic */ yxc(byte b) {
        this.f43414a = b;
    }
}
