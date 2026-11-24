.class public final Lcom/appsflyer/internal/AFf1iSDK;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/appsflyer/internal/AFf1iSDK$AFa1vSDK;,
        Lcom/appsflyer/internal/AFf1iSDK$AFa1ySDK;
    }
.end annotation


# static fields
.field private static unregisterClient:Lcom/appsflyer/internal/AFf1iSDK;


# instance fields
.field private final d:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method private constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lcom/appsflyer/internal/AFf1iSDK$2;

    .line 5
    .line 6
    invoke-direct {v0, p0}, Lcom/appsflyer/internal/AFf1iSDK$2;-><init>(Lcom/appsflyer/internal/AFf1iSDK;)V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lcom/appsflyer/internal/AFf1iSDK;->d:Ljava/util/Map;

    .line 10
    .line 11
    return-void
.end method

.method private static AFKeystoreWrapper()Ljava/lang/String;
    .locals 12

    .line 1
    const-string v1, ";"

    .line 2
    .line 3
    new-instance v2, Ljava/lang/StringBuilder;

    .line 4
    .line 5
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 6
    .line 7
    .line 8
    :try_start_0
    invoke-static {}, Ljava/lang/Thread;->getAllStackTraces()Ljava/util/Map;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    const/4 v3, 0x0

    .line 21
    move v4, v3

    .line 22
    move v5, v4

    .line 23
    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 24
    .line 25
    .line 26
    move-result v6

    .line 27
    if-eqz v6, :cond_5

    .line 28
    .line 29
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v6

    .line 33
    check-cast v6, Ljava/util/Map$Entry;

    .line 34
    .line 35
    invoke-interface {v6}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object v6

    .line 39
    check-cast v6, [Ljava/lang/StackTraceElement;

    .line 40
    .line 41
    array-length v7, v6

    .line 42
    move v8, v3

    .line 43
    :goto_0
    if-ge v8, v7, :cond_0

    .line 44
    .line 45
    aget-object v9, v6, v8

    .line 46
    .line 47
    invoke-virtual {v9}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object v10

    .line 51
    const-string v11, "de.robv.android.xposed"

    .line 52
    .line 53
    invoke-virtual {v10, v11}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 54
    .line 55
    .line 56
    move-result v10

    .line 57
    if-eqz v10, :cond_3

    .line 58
    .line 59
    const/4 v10, 0x2

    .line 60
    if-gt v5, v10, :cond_3

    .line 61
    .line 62
    add-int/lit8 v5, v5, 0x1

    .line 63
    .line 64
    sget-object v10, Lcom/appsflyer/internal/AFf1iSDK$AFa1vSDK;->unregisterClient:Lcom/appsflyer/internal/AFf1iSDK$AFa1vSDK;

    .line 65
    .line 66
    iget-object v10, v10, Lcom/appsflyer/internal/AFf1iSDK$AFa1vSDK;->d:Ljava/lang/String;

    .line 67
    .line 68
    invoke-virtual {v2, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 69
    .line 70
    .line 71
    invoke-virtual {v9}, Ljava/lang/StackTraceElement;->getMethodName()Ljava/lang/String;

    .line 72
    .line 73
    .line 74
    move-result-object v10

    .line 75
    const-string v11, "main"

    .line 76
    .line 77
    invoke-virtual {v10, v11}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 78
    .line 79
    .line 80
    move-result v10

    .line 81
    if-eqz v10, :cond_1

    .line 82
    .line 83
    const-string v10, "+a"

    .line 84
    .line 85
    invoke-virtual {v2, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 86
    .line 87
    .line 88
    goto :goto_1

    .line 89
    :catchall_0
    move-exception v0

    .line 90
    move-object v6, v0

    .line 91
    goto :goto_2

    .line 92
    :cond_1
    :goto_1
    invoke-virtual {v9}, Ljava/lang/StackTraceElement;->getMethodName()Ljava/lang/String;

    .line 93
    .line 94
    .line 95
    move-result-object v10

    .line 96
    const-string v11, "handleHookedMethod"

    .line 97
    .line 98
    invoke-virtual {v10, v11}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 99
    .line 100
    .line 101
    move-result v10

    .line 102
    if-eqz v10, :cond_2

    .line 103
    .line 104
    const-string v10, "+h"

    .line 105
    .line 106
    invoke-virtual {v2, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 107
    .line 108
    .line 109
    :cond_2
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 110
    .line 111
    .line 112
    :cond_3
    invoke-virtual {v9}, Ljava/lang/StackTraceElement;->getClassName()Ljava/lang/String;

    .line 113
    .line 114
    .line 115
    move-result-object v9

    .line 116
    const-string v10, "com.android.internal.os.ZygoteInit"

    .line 117
    .line 118
    invoke-virtual {v9, v10}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 119
    .line 120
    .line 121
    move-result v9

    .line 122
    if-eqz v9, :cond_4

    .line 123
    .line 124
    add-int/lit8 v4, v4, 0x1

    .line 125
    .line 126
    :cond_4
    add-int/lit8 v8, v8, 0x1

    .line 127
    .line 128
    goto :goto_0

    .line 129
    :cond_5
    const/4 v0, 0x1

    .line 130
    if-le v4, v0, :cond_6

    .line 131
    .line 132
    const-string v0, "mz;"

    .line 133
    .line 134
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 135
    .line 136
    .line 137
    goto :goto_3

    .line 138
    :goto_2
    sget-object v3, Lcom/appsflyer/AFLogger;->INSTANCE:Lcom/appsflyer/AFLogger;

    .line 139
    .line 140
    sget-object v4, Lcom/appsflyer/sdk_base/logger/LogTag;->ANTI_FRAUD:Lcom/appsflyer/sdk_base/logger/LogTag;

    .line 141
    .line 142
    const/4 v7, 0x0

    .line 143
    const/4 v8, 0x0

    .line 144
    const-string v5, "hooking check error"

    .line 145
    .line 146
    invoke-virtual/range {v3 .. v8}, Lcom/appsflyer/sdk_base/logger/AFLoggerBase;->e(Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;Ljava/lang/Throwable;ZZ)V

    .line 147
    .line 148
    .line 149
    :cond_6
    :goto_3
    :try_start_1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 150
    .line 151
    const-string v3, "/proc/"

    .line 152
    .line 153
    invoke-direct {v0, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 154
    .line 155
    .line 156
    invoke-static {}, Landroid/os/Process;->myPid()I

    .line 157
    .line 158
    .line 159
    move-result v3

    .line 160
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 161
    .line 162
    .line 163
    const-string v3, "/maps"

    .line 164
    .line 165
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 166
    .line 167
    .line 168
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 169
    .line 170
    .line 171
    move-result-object v0

    .line 172
    const-string v3, "frida"

    .line 173
    .line 174
    invoke-static {v0, v3}, Lcom/appsflyer/internal/AFf1iSDK;->d(Ljava/lang/String;Ljava/lang/String;)Z

    .line 175
    .line 176
    .line 177
    move-result v0

    .line 178
    if-eqz v0, :cond_7

    .line 179
    .line 180
    sget-object v0, Lcom/appsflyer/internal/AFf1iSDK$AFa1vSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFf1iSDK$AFa1vSDK;

    .line 181
    .line 182
    iget-object v0, v0, Lcom/appsflyer/internal/AFf1iSDK$AFa1vSDK;->d:Ljava/lang/String;

    .line 183
    .line 184
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 185
    .line 186
    .line 187
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 188
    .line 189
    const/16 v3, 0x1d

    .line 190
    .line 191
    if-ge v0, v3, :cond_7

    .line 192
    .line 193
    const-string v0, "/proc/net/tcp"

    .line 194
    .line 195
    const-string v3, "69A2"

    .line 196
    .line 197
    invoke-static {v0, v3}, Lcom/appsflyer/internal/AFf1iSDK;->d(Ljava/lang/String;Ljava/lang/String;)Z

    .line 198
    .line 199
    .line 200
    move-result v0

    .line 201
    if-eqz v0, :cond_7

    .line 202
    .line 203
    const-string v0, "+prt"

    .line 204
    .line 205
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    .line 206
    .line 207
    .line 208
    goto :goto_4

    .line 209
    :catch_0
    move-exception v0

    .line 210
    move-object v6, v0

    .line 211
    sget-object v3, Lcom/appsflyer/AFLogger;->INSTANCE:Lcom/appsflyer/AFLogger;

    .line 212
    .line 213
    sget-object v4, Lcom/appsflyer/sdk_base/logger/LogTag;->ANTI_FRAUD:Lcom/appsflyer/sdk_base/logger/LogTag;

    .line 214
    .line 215
    const/4 v7, 0x0

    .line 216
    const/4 v8, 0x0

    .line 217
    const-string v5, "frida detection error"

    .line 218
    .line 219
    invoke-virtual/range {v3 .. v8}, Lcom/appsflyer/sdk_base/logger/AFLoggerBase;->e(Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;Ljava/lang/Throwable;ZZ)V

    .line 220
    .line 221
    .line 222
    invoke-virtual {v6}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 223
    .line 224
    .line 225
    move-result-object v0

    .line 226
    sget-object v3, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 227
    .line 228
    invoke-virtual {v0, v3}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 229
    .line 230
    .line 231
    move-result-object v0

    .line 232
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 233
    .line 234
    .line 235
    :cond_7
    :goto_4
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 236
    .line 237
    .line 238
    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 239
    .line 240
    .line 241
    move-result-object v0

    .line 242
    return-object v0
.end method

.method private static AFKeystoreWrapper(Ljava/lang/String;)Ljava/lang/String;
    .locals 8

    const/4 v1, 0x0

    .line 243
    :try_start_0
    const-string v0, "android.os.SystemProperties"

    invoke-static {v0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0

    const-string v2, "get"

    const-class v3, Ljava/lang/String;

    filled-new-array {v3}, [Ljava/lang/Class;

    move-result-object v3

    .line 244
    invoke-virtual {v0, v2, v3}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v0

    filled-new-array {p0}, [Ljava/lang/Object;

    move-result-object p0

    invoke-virtual {v0, v1, p0}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    :catch_0
    move-exception v0

    move-object p0, v0

    move-object v5, p0

    .line 245
    sget-object v2, Lcom/appsflyer/AFLogger;->INSTANCE:Lcom/appsflyer/AFLogger;

    sget-object v3, Lcom/appsflyer/sdk_base/logger/LogTag;->ANTI_FRAUD:Lcom/appsflyer/sdk_base/logger/LogTag;

    const/4 v6, 0x0

    const/4 v7, 0x0

    const-string v4, "error in props rfl"

    invoke-virtual/range {v2 .. v7}, Lcom/appsflyer/sdk_base/logger/AFLoggerBase;->e(Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;Ljava/lang/Throwable;ZZ)V

    return-object v1
.end method

.method public static AFLogger()Lcom/appsflyer/internal/AFf1iSDK;
    .locals 1

    .line 1
    sget-object v0, Lcom/appsflyer/internal/AFf1iSDK;->unregisterClient:Lcom/appsflyer/internal/AFf1iSDK;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Lcom/appsflyer/internal/AFf1iSDK;

    .line 6
    .line 7
    invoke-direct {v0}, Lcom/appsflyer/internal/AFf1iSDK;-><init>()V

    .line 8
    .line 9
    .line 10
    sput-object v0, Lcom/appsflyer/internal/AFf1iSDK;->unregisterClient:Lcom/appsflyer/internal/AFf1iSDK;

    .line 11
    .line 12
    :cond_0
    return-object v0
.end method

.method private static d(Ljava/lang/String;Ljava/lang/String;)Z
    .locals 6

    .line 1
    new-instance v0, Ljava/io/File;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    :try_start_0
    new-instance p0, Ljava/io/FileInputStream;

    .line 7
    .line 8
    invoke-direct {p0, v0}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V

    .line 9
    .line 10
    .line 11
    new-instance v0, Ljava/io/BufferedReader;

    .line 12
    .line 13
    new-instance v1, Ljava/io/InputStreamReader;

    .line 14
    .line 15
    invoke-static {}, Ljava/nio/charset/Charset;->defaultCharset()Ljava/nio/charset/Charset;

    .line 16
    .line 17
    .line 18
    move-result-object v2

    .line 19
    invoke-direct {v1, p0, v2}, Ljava/io/InputStreamReader;-><init>(Ljava/io/InputStream;Ljava/nio/charset/Charset;)V

    .line 20
    .line 21
    .line 22
    invoke-direct {v0, v1}, Ljava/io/BufferedReader;-><init>(Ljava/io/Reader;)V

    .line 23
    .line 24
    .line 25
    sget-object v1, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 26
    .line 27
    invoke-virtual {p1, v1}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    :cond_0
    invoke-virtual {v0}, Ljava/io/BufferedReader;->readLine()Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    if-eqz v1, :cond_1

    .line 36
    .line 37
    new-instance v2, Ljava/util/HashSet;

    .line 38
    .line 39
    sget-object v3, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 40
    .line 41
    invoke-virtual {v1, v3}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object v1

    .line 45
    const-string v3, "[\\s.,\\]\\-:/_\\[]"

    .line 46
    .line 47
    invoke-virtual {v1, v3}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object v1

    .line 51
    invoke-static {v1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 52
    .line 53
    .line 54
    move-result-object v1

    .line 55
    invoke-direct {v2, v1}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    .line 56
    .line 57
    .line 58
    invoke-virtual {v2, p1}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    .line 59
    .line 60
    .line 61
    move-result v1

    .line 62
    if-eqz v1, :cond_0

    .line 63
    .line 64
    invoke-virtual {v0}, Ljava/io/Reader;->close()V

    .line 65
    .line 66
    .line 67
    invoke-virtual {p0}, Ljava/io/InputStream;->close()V

    .line 68
    .line 69
    .line 70
    const/4 p0, 0x1

    .line 71
    return p0

    .line 72
    :cond_1
    invoke-virtual {v0}, Ljava/io/Reader;->close()V

    .line 73
    .line 74
    .line 75
    invoke-virtual {p0}, Ljava/io/InputStream;->close()V
    :try_end_0
    .catch Ljava/io/FileNotFoundException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 76
    .line 77
    .line 78
    const/4 p0, 0x0

    .line 79
    return p0

    .line 80
    :catch_0
    move-exception v0

    .line 81
    move-object p0, v0

    .line 82
    move-object v3, p0

    .line 83
    sget-object v0, Lcom/appsflyer/AFLogger;->INSTANCE:Lcom/appsflyer/AFLogger;

    .line 84
    .line 85
    sget-object v1, Lcom/appsflyer/sdk_base/logger/LogTag;->ANTI_FRAUD:Lcom/appsflyer/sdk_base/logger/LogTag;

    .line 86
    .line 87
    const/4 v4, 0x0

    .line 88
    const/4 v5, 0x0

    .line 89
    const-string v2, "GF"

    .line 90
    .line 91
    invoke-virtual/range {v0 .. v5}, Lcom/appsflyer/sdk_base/logger/AFLoggerBase;->e(Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;Ljava/lang/Throwable;ZZ)V

    .line 92
    .line 93
    .line 94
    new-instance p0, Ljava/lang/Exception;

    .line 95
    .line 96
    const-string p1, "GF"

    .line 97
    .line 98
    invoke-direct {p0, p1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 99
    .line 100
    .line 101
    throw p0

    .line 102
    :catch_1
    move-exception v0

    .line 103
    move-object p0, v0

    .line 104
    move-object v3, p0

    .line 105
    sget-object v0, Lcom/appsflyer/AFLogger;->INSTANCE:Lcom/appsflyer/AFLogger;

    .line 106
    .line 107
    sget-object v1, Lcom/appsflyer/sdk_base/logger/LogTag;->ANTI_FRAUD:Lcom/appsflyer/sdk_base/logger/LogTag;

    .line 108
    .line 109
    const/4 v4, 0x0

    .line 110
    const/4 v5, 0x0

    .line 111
    const-string v2, "IOF"

    .line 112
    .line 113
    invoke-virtual/range {v0 .. v5}, Lcom/appsflyer/sdk_base/logger/AFLoggerBase;->e(Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;Ljava/lang/Throwable;ZZ)V

    .line 114
    .line 115
    .line 116
    new-instance p0, Ljava/lang/Exception;

    .line 117
    .line 118
    const-string p1, "IOF"

    .line 119
    .line 120
    invoke-direct {p0, p1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 121
    .line 122
    .line 123
    throw p0

    .line 124
    :catch_2
    move-exception v0

    .line 125
    move-object p0, v0

    .line 126
    move-object v3, p0

    .line 127
    sget-object v0, Lcom/appsflyer/AFLogger;->INSTANCE:Lcom/appsflyer/AFLogger;

    .line 128
    .line 129
    sget-object v1, Lcom/appsflyer/sdk_base/logger/LogTag;->ANTI_FRAUD:Lcom/appsflyer/sdk_base/logger/LogTag;

    .line 130
    .line 131
    const/4 v4, 0x0

    .line 132
    const/4 v5, 0x0

    .line 133
    const-string v2, "FNF"

    .line 134
    .line 135
    invoke-virtual/range {v0 .. v5}, Lcom/appsflyer/sdk_base/logger/AFLoggerBase;->e(Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;Ljava/lang/Throwable;ZZ)V

    .line 136
    .line 137
    .line 138
    new-instance p0, Ljava/lang/Exception;

    .line 139
    .line 140
    const-string p1, "FNF"

    .line 141
    .line 142
    invoke-direct {p0, p1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 143
    .line 144
    .line 145
    throw p0
.end method

.method private registerClient()Lcom/appsflyer/internal/AFg1gSDK;
    .locals 8

    .line 1
    new-instance v1, Lcom/appsflyer/internal/AFg1gSDK;

    .line 2
    .line 3
    invoke-direct {v1}, Lcom/appsflyer/internal/AFg1gSDK;-><init>()V

    .line 4
    .line 5
    .line 6
    :try_start_0
    iget-object p0, p0, Lcom/appsflyer/internal/AFf1iSDK;->d:Ljava/util/Map;

    .line 7
    .line 8
    invoke-interface {p0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    invoke-interface {p0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    :cond_0
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    if-eqz v0, :cond_1

    .line 21
    .line 22
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    check-cast v0, Ljava/util/Map$Entry;

    .line 27
    .line 28
    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object v2

    .line 32
    check-cast v2, Ljava/lang/String;

    .line 33
    .line 34
    invoke-static {v2}, Lcom/appsflyer/internal/AFf1iSDK;->AFKeystoreWrapper(Ljava/lang/String;)Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object v2

    .line 38
    if-eqz v2, :cond_0

    .line 39
    .line 40
    const-string v3, ""

    .line 41
    .line 42
    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 43
    .line 44
    .line 45
    move-result v3

    .line 46
    if-nez v3, :cond_0

    .line 47
    .line 48
    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    check-cast v0, Ljava/lang/String;

    .line 53
    .line 54
    invoke-virtual {v1, v0, v2}, Lcom/appsflyer/internal/AFg1gSDK;->AFKeystoreWrapper(Ljava/lang/String;Ljava/lang/Object;)Lcom/appsflyer/internal/AFg1gSDK;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 55
    .line 56
    .line 57
    goto :goto_0

    .line 58
    :catch_0
    move-exception v0

    .line 59
    move-object p0, v0

    .line 60
    move-object v5, p0

    .line 61
    goto :goto_1

    .line 62
    :cond_1
    return-object v1

    .line 63
    :goto_1
    sget-object v2, Lcom/appsflyer/AFLogger;->INSTANCE:Lcom/appsflyer/AFLogger;

    .line 64
    .line 65
    sget-object v3, Lcom/appsflyer/sdk_base/logger/LogTag;->ANTI_FRAUD:Lcom/appsflyer/sdk_base/logger/LogTag;

    .line 66
    .line 67
    const/4 v6, 0x0

    .line 68
    const/4 v7, 0x0

    .line 69
    const-string v4, "failed to create props"

    .line 70
    .line 71
    invoke-virtual/range {v2 .. v7}, Lcom/appsflyer/sdk_base/logger/AFLoggerBase;->e(Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;Ljava/lang/Throwable;ZZ)V

    .line 72
    .line 73
    .line 74
    return-object v1
.end method

.method private unregisterClient(Landroid/content/Context;)Lcom/appsflyer/internal/AFg1gSDK;
    .locals 6

    .line 1
    new-instance p0, Lcom/appsflyer/internal/AFg1gSDK;

    .line 2
    .line 3
    invoke-direct {p0}, Lcom/appsflyer/internal/AFg1gSDK;-><init>()V

    .line 4
    .line 5
    .line 6
    :try_start_0
    sget-object v0, Lcom/appsflyer/internal/AFf1iSDK$AFa1ySDK;->registerClient:Lcom/appsflyer/internal/AFf1iSDK$AFa1ySDK;

    .line 7
    .line 8
    iget-object v0, v0, Lcom/appsflyer/internal/AFf1iSDK$AFa1ySDK;->AFKeystoreWrapper:Ljava/lang/String;

    .line 9
    .line 10
    invoke-static {}, Lcom/appsflyer/internal/AFf1iSDK;->AFKeystoreWrapper()Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    invoke-virtual {p0, v0, v1}, Lcom/appsflyer/internal/AFg1gSDK;->AFKeystoreWrapper(Ljava/lang/String;Ljava/lang/Object;)Lcom/appsflyer/internal/AFg1gSDK;

    .line 15
    .line 16
    .line 17
    sget-object v0, Lcom/appsflyer/internal/AFf1iSDK$AFa1ySDK;->AFLogger:Lcom/appsflyer/internal/AFf1iSDK$AFa1ySDK;

    .line 18
    .line 19
    iget-object v0, v0, Lcom/appsflyer/internal/AFf1iSDK$AFa1ySDK;->AFKeystoreWrapper:Ljava/lang/String;

    .line 20
    .line 21
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationInfo()Landroid/content/pm/ApplicationInfo;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    iget p1, p1, Landroid/content/pm/ApplicationInfo;->flags:I

    .line 26
    .line 27
    and-int/lit8 p1, p1, 0x2

    .line 28
    .line 29
    if-eqz p1, :cond_0

    .line 30
    .line 31
    const/4 p1, 0x1

    .line 32
    goto :goto_0

    .line 33
    :cond_0
    const/4 p1, 0x0

    .line 34
    :goto_0
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    invoke-virtual {p0, v0, p1}, Lcom/appsflyer/internal/AFg1gSDK;->AFKeystoreWrapper(Ljava/lang/String;Ljava/lang/Object;)Lcom/appsflyer/internal/AFg1gSDK;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 39
    .line 40
    .line 41
    return-object p0

    .line 42
    :catchall_0
    move-exception v0

    .line 43
    move-object p1, v0

    .line 44
    move-object v3, p1

    .line 45
    sget-object v0, Lcom/appsflyer/AFLogger;->INSTANCE:Lcom/appsflyer/AFLogger;

    .line 46
    .line 47
    sget-object v1, Lcom/appsflyer/sdk_base/logger/LogTag;->ANTI_FRAUD:Lcom/appsflyer/sdk_base/logger/LogTag;

    .line 48
    .line 49
    const/4 v4, 0x0

    .line 50
    const/4 v5, 0x0

    .line 51
    const-string v2, "failed to perform analysis checks"

    .line 52
    .line 53
    invoke-virtual/range {v0 .. v5}, Lcom/appsflyer/sdk_base/logger/AFLoggerBase;->e(Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;Ljava/lang/Throwable;ZZ)V

    .line 54
    .line 55
    .line 56
    return-object p0
.end method


# virtual methods
.method public final registerClient(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/Object;
    .locals 8

    const/4 v1, 0x0

    if-eqz p2, :cond_0

    .line 75
    :try_start_0
    const-string v0, "\\d+"

    invoke-virtual {p2, v0}, Ljava/lang/String;->matches(Ljava/lang/String;)Z

    move-result p2

    if-nez p2, :cond_1

    goto :goto_0

    :catch_0
    move-exception v0

    move-object p0, v0

    move-object v5, p0

    goto :goto_1

    .line 76
    :cond_0
    :goto_0
    const-string v1, "invalid timestamp"

    .line 77
    :cond_1
    new-instance p2, Lcom/appsflyer/internal/AFg1gSDK;

    invoke-direct {p2}, Lcom/appsflyer/internal/AFg1gSDK;-><init>()V

    .line 78
    const-string v0, "pr"

    invoke-direct {p0}, Lcom/appsflyer/internal/AFf1iSDK;->registerClient()Lcom/appsflyer/internal/AFg1gSDK;

    move-result-object v2

    invoke-virtual {p2, v0, v2}, Lcom/appsflyer/internal/AFg1gSDK;->AFKeystoreWrapper(Ljava/lang/String;Ljava/lang/Object;)Lcom/appsflyer/internal/AFg1gSDK;

    .line 79
    const-string v0, "an"

    invoke-direct {p0, p1}, Lcom/appsflyer/internal/AFf1iSDK;->unregisterClient(Landroid/content/Context;)Lcom/appsflyer/internal/AFg1gSDK;

    move-result-object p0

    invoke-virtual {p2, v0, p0}, Lcom/appsflyer/internal/AFg1gSDK;->AFKeystoreWrapper(Ljava/lang/String;Ljava/lang/Object;)Lcom/appsflyer/internal/AFg1gSDK;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object p2

    .line 80
    :goto_1
    sget-object v2, Lcom/appsflyer/AFLogger;->INSTANCE:Lcom/appsflyer/AFLogger;

    sget-object v3, Lcom/appsflyer/sdk_base/logger/LogTag;->ANTI_FRAUD:Lcom/appsflyer/sdk_base/logger/LogTag;

    const/4 v6, 0x0

    const/4 v7, 0x0

    const-string v4, "Failed to collect anti-fraud data"

    invoke-virtual/range {v2 .. v7}, Lcom/appsflyer/sdk_base/logger/AFLoggerBase;->e(Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;Ljava/lang/Throwable;ZZ)V

    return-object v1
.end method
