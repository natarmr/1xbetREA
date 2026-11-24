package a;

import android.content.Context;
import android.content.res.XmlResourceParser;
import android.util.Log;
import android.util.Xml;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes.dex */
public final class iky {
    public static final HashMap b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public HashMap f14951a = new HashMap();

    static {
        HashMap map = new HashMap();
        b = map;
        try {
            map.put("KeyAttribute", ujy.class.getConstructor(null));
            map.put("KeyPosition", xky.class.getConstructor(null));
            map.put("KeyCycle", yjy.class.getConstructor(null));
            map.put("KeyTimeCycle", ely.class.getConstructor(null));
            map.put("KeyTrigger", gly.class.getConstructor(null));
        } catch (NoSuchMethodException e) {
            Log.e("KeyFrames", "unable to load", e);
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public iky(Context context, XmlResourceParser xmlResourceParser) {
        HashMap map;
        HashMap map2;
        rjy elyVar;
        try {
            int eventType = xmlResourceParser.getEventType();
            rjy rjyVar = null;
            while (eventType != 1) {
                if (eventType == 2) {
                    String name = xmlResourceParser.getName();
                    if (b.containsKey(name)) {
                        switch (name.hashCode()) {
                            case -300573030:
                                if (!name.equals("KeyTimeCycle")) {
                                    throw new NullPointerException("Key " + name + " not found");
                                }
                                elyVar = new ely();
                                elyVar.e(context, Xml.asAttributeSet(xmlResourceParser));
                                b(elyVar);
                                rjyVar = elyVar;
                                break;
                                break;
                            case -298435811:
                                if (!name.equals("KeyAttribute")) {
                                    throw new NullPointerException("Key " + name + " not found");
                                }
                                elyVar = new ujy();
                                elyVar.e(context, Xml.asAttributeSet(xmlResourceParser));
                                b(elyVar);
                                rjyVar = elyVar;
                                break;
                                break;
                            case 540053991:
                                if (!name.equals("KeyCycle")) {
                                    throw new NullPointerException("Key " + name + " not found");
                                }
                                elyVar = new yjy();
                                elyVar.e(context, Xml.asAttributeSet(xmlResourceParser));
                                b(elyVar);
                                rjyVar = elyVar;
                                break;
                                break;
                            case 1153397896:
                                if (!name.equals("KeyPosition")) {
                                    throw new NullPointerException("Key " + name + " not found");
                                }
                                elyVar = new xky();
                                elyVar.e(context, Xml.asAttributeSet(xmlResourceParser));
                                b(elyVar);
                                rjyVar = elyVar;
                                break;
                                break;
                            case 1308496505:
                                if (!name.equals("KeyTrigger")) {
                                    throw new NullPointerException("Key " + name + " not found");
                                }
                                elyVar = new gly();
                                elyVar.e(context, Xml.asAttributeSet(xmlResourceParser));
                                b(elyVar);
                                rjyVar = elyVar;
                                break;
                                break;
                            default:
                                throw new NullPointerException("Key " + name + " not found");
                        }
                    }
                    if (name.equalsIgnoreCase("CustomAttribute")) {
                        if (rjyVar != null && (map2 = rjyVar.e) != null) {
                            x2e.d(context, xmlResourceParser, map2);
                        }
                    } else if (name.equalsIgnoreCase("CustomMethod") && rjyVar != null && (map = rjyVar.e) != null) {
                        x2e.d(context, xmlResourceParser, map);
                    }
                } else if (eventType == 3 && "KeyFrameSet".equals(xmlResourceParser.getName())) {
                    return;
                }
                eventType = xmlResourceParser.next();
            }
        } catch (IOException e) {
            Log.e("KeyFrames", "Error parsing XML resource", e);
        } catch (XmlPullParserException e2) {
            Log.e("KeyFrames", "Error parsing XML resource", e2);
        }
    }

    public final void a(ds40 ds40Var) {
        ArrayList arrayList = ds40Var.w;
        HashMap map = this.f14951a;
        ArrayList arrayList2 = (ArrayList) map.get(Integer.valueOf(ds40Var.c));
        if (arrayList2 != null) {
            arrayList.addAll(arrayList2);
        }
        ArrayList<rjy> arrayList3 = (ArrayList) map.get(-1);
        if (arrayList3 != null) {
            for (rjy rjyVar : arrayList3) {
                String str = ((a3e) ds40Var.b.getLayoutParams()).Y;
                String str2 = rjyVar.c;
                if ((str2 == null || str == null) ? false : str.matches(str2)) {
                    arrayList.add(rjyVar);
                }
            }
        }
    }

    public final void b(rjy rjyVar) {
        HashMap map = this.f14951a;
        if (!map.containsKey(Integer.valueOf(rjyVar.b))) {
            map.put(Integer.valueOf(rjyVar.b), new ArrayList());
        }
        ArrayList arrayList = (ArrayList) map.get(Integer.valueOf(rjyVar.b));
        if (arrayList != null) {
            arrayList.add(rjyVar);
        }
    }
}
