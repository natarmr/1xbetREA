package com.huawei.hms.opendevice;

import a.ohq;
import com.huawei.hms.support.log.HMSLog;
import com.huawei.hms.utils.IOUtils;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;

/* JADX INFO: loaded from: classes2.dex */
public abstract class m {
    public static String a(String str) throws Throwable {
        InputStreamReader inputStreamReader;
        File file = new File(str);
        StringBuilder sb = new StringBuilder();
        BufferedReader bufferedReader = null;
        try {
            try {
                inputStreamReader = new InputStreamReader(new FileInputStream(file), "UTF-8");
                try {
                    BufferedReader bufferedReader2 = new BufferedReader(inputStreamReader);
                    while (true) {
                        try {
                            String line = bufferedReader2.readLine();
                            if (line == null) {
                                break;
                            }
                            sb.append(line);
                        } catch (FileNotFoundException unused) {
                            bufferedReader = bufferedReader2;
                            HMSLog.e("StreamUtil", "file not exist.");
                            IOUtils.closeQuietly((Reader) inputStreamReader);
                            IOUtils.closeQuietly((Reader) bufferedReader);
                        } catch (IOException unused2) {
                            bufferedReader = bufferedReader2;
                            HMSLog.e("StreamUtil", "read value IOException.");
                            IOUtils.closeQuietly((Reader) inputStreamReader);
                            IOUtils.closeQuietly((Reader) bufferedReader);
                        } catch (Throwable th) {
                            th = th;
                            bufferedReader = bufferedReader2;
                            IOUtils.closeQuietly((Reader) inputStreamReader);
                            IOUtils.closeQuietly((Reader) bufferedReader);
                            throw th;
                        }
                    }
                    IOUtils.closeQuietly((Reader) inputStreamReader);
                    IOUtils.closeQuietly((Reader) bufferedReader2);
                } catch (FileNotFoundException unused3) {
                } catch (IOException unused4) {
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (FileNotFoundException unused5) {
            inputStreamReader = null;
        } catch (IOException unused6) {
            inputStreamReader = null;
        } catch (Throwable th3) {
            th = th3;
            inputStreamReader = null;
        }
        return sb.toString();
    }

    public static void a(File file) throws IOException {
        if (file.exists()) {
            return;
        }
        if (file.getParentFile() != null) {
            if (!file.getParentFile().exists() && !file.getParentFile().mkdirs()) {
                HMSLog.e("StreamUtil", "make parent dirs failed.");
                ohq.l("make parent dirs failed");
                return;
            } else {
                if (file.createNewFile()) {
                    return;
                }
                HMSLog.e("StreamUtil", "create file failed.");
                ohq.l("create file failed");
                return;
            }
        }
        HMSLog.e("StreamUtil", "parent file is null.");
        ohq.l("parent file is null");
    }
}
