.class public final Lcom/appsflyer/internal/AFb1tSDK;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/appsflyer/internal/AFa1aSDK;


# instance fields
.field private AFKeystoreWrapper:Z

.field AFLogger:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field private final d:Lcom/appsflyer/internal/AFd1zSDK;


# direct methods
.method public constructor <init>(Lcom/appsflyer/internal/AFd1zSDK;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Lcom/appsflyer/internal/AFb1tSDK;->d:Lcom/appsflyer/internal/AFd1zSDK;

    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final AFLogger(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/appsflyer/internal/AFb1tSDK;->AFKeystoreWrapper:Z

    .line 2
    .line 3
    return-void
.end method

.method public final d()Ljava/util/Map;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object p0, p0, Lcom/appsflyer/internal/AFb1tSDK;->AFLogger:Ljava/util/Map;

    .line 2
    .line 3
    return-object p0
.end method

.method public final registerClient()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/appsflyer/internal/AFb1tSDK;->AFKeystoreWrapper:Z

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    iget-object p0, p0, Lcom/appsflyer/internal/AFb1tSDK;->AFLogger:Ljava/util/Map;

    .line 6
    .line 7
    if-eqz p0, :cond_0

    .line 8
    .line 9
    invoke-interface {p0}, Ljava/util/Map;->isEmpty()Z

    .line 10
    .line 11
    .line 12
    move-result p0

    .line 13
    if-eqz p0, :cond_1

    .line 14
    .line 15
    :cond_0
    const/4 p0, 0x1

    .line 16
    return p0

    .line 17
    :cond_1
    const/4 p0, 0x0

    .line 18
    return p0
.end method

.method public final unregisterClient()V
    .locals 10

    .line 1
    iget-boolean v0, p0, Lcom/appsflyer/internal/AFb1tSDK;->AFKeystoreWrapper:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    goto :goto_0

    .line 6
    :cond_0
    iget-object v0, p0, Lcom/appsflyer/internal/AFb1tSDK;->d:Lcom/appsflyer/internal/AFd1zSDK;

    .line 7
    .line 8
    iget-object v0, v0, Lcom/appsflyer/internal/AFd1zSDK;->d:Landroid/content/Context;

    .line 9
    .line 10
    if-nez v0, :cond_1

    .line 11
    .line 12
    :goto_0
    return-void

    .line 13
    :cond_1
    new-instance v1, Ljava/util/LinkedHashMap;

    .line 14
    .line 15
    invoke-direct {v1}, Ljava/util/LinkedHashMap;-><init>()V

    .line 16
    .line 17
    .line 18
    iput-object v1, p0, Lcom/appsflyer/internal/AFb1tSDK;->AFLogger:Ljava/util/Map;

    .line 19
    .line 20
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 21
    .line 22
    .line 23
    move-result-wide v1

    .line 24
    new-instance v3, Lcom/appsflyer/internal/AFb1tSDK$AFa1uSDK;

    .line 25
    .line 26
    invoke-direct {v3, p0, v1, v2}, Lcom/appsflyer/internal/AFb1tSDK$AFa1uSDK;-><init>(Lcom/appsflyer/internal/AFb1tSDK;J)V

    .line 27
    .line 28
    .line 29
    :try_start_0
    const-string p0, "com.facebook.FacebookSdk"

    .line 30
    .line 31
    invoke-static {p0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    const-string v1, "sdkInitialize"

    .line 36
    .line 37
    const-class v2, Landroid/content/Context;

    .line 38
    .line 39
    filled-new-array {v2}, [Ljava/lang/Class;

    .line 40
    .line 41
    .line 42
    move-result-object v4

    .line 43
    invoke-virtual {p0, v1, v4}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 44
    .line 45
    .line 46
    move-result-object p0

    .line 47
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object v1

    .line 51
    const/4 v4, 0x0

    .line 52
    invoke-virtual {p0, v4, v1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    const-string p0, "com.facebook.applinks.AppLinkData"

    .line 56
    .line 57
    invoke-static {p0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    .line 58
    .line 59
    .line 60
    move-result-object p0

    .line 61
    const-string v1, "com.facebook.applinks.AppLinkData$CompletionHandler"

    .line 62
    .line 63
    invoke-static {v1}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    .line 64
    .line 65
    .line 66
    move-result-object v1

    .line 67
    const-string v5, "fetchDeferredAppLinkData"

    .line 68
    .line 69
    const-class v6, Ljava/lang/String;

    .line 70
    .line 71
    filled-new-array {v2, v6, v1}, [Ljava/lang/Class;

    .line 72
    .line 73
    .line 74
    move-result-object v2

    .line 75
    invoke-virtual {p0, v5, v2}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 76
    .line 77
    .line 78
    move-result-object v2

    .line 79
    new-instance v5, Lcom/appsflyer/internal/AFa1cSDK$5;

    .line 80
    .line 81
    invoke-direct {v5, p0, v3}, Lcom/appsflyer/internal/AFa1cSDK$5;-><init>(Ljava/lang/Class;Lcom/appsflyer/internal/AFa1cSDK$AFa1tSDK;)V

    .line 82
    .line 83
    .line 84
    invoke-virtual {v1}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    .line 85
    .line 86
    .line 87
    move-result-object p0

    .line 88
    filled-new-array {v1}, [Ljava/lang/Class;

    .line 89
    .line 90
    .line 91
    move-result-object v1

    .line 92
    invoke-static {p0, v1, v5}, Ljava/lang/reflect/Proxy;->newProxyInstance(Ljava/lang/ClassLoader;[Ljava/lang/Class;Ljava/lang/reflect/InvocationHandler;)Ljava/lang/Object;

    .line 93
    .line 94
    .line 95
    move-result-object p0

    .line 96
    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 97
    .line 98
    .line 99
    move-result-object v1

    .line 100
    const-string v5, "facebook_app_id"

    .line 101
    .line 102
    const-string v6, "string"

    .line 103
    .line 104
    invoke-virtual {v0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 105
    .line 106
    .line 107
    move-result-object v7

    .line 108
    invoke-virtual {v1, v5, v6, v7}, Landroid/content/res/Resources;->getIdentifier(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I

    .line 109
    .line 110
    .line 111
    move-result v1

    .line 112
    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 113
    .line 114
    .line 115
    move-result-object v1

    .line 116
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 117
    .line 118
    .line 119
    move-result v5

    .line 120
    if-eqz v5, :cond_2

    .line 121
    .line 122
    const-string p0, "Facebook app id not defined in resources"

    .line 123
    .line 124
    invoke-interface {v3, p0}, Lcom/appsflyer/internal/AFa1cSDK$AFa1tSDK;->AFKeystoreWrapper(Ljava/lang/String;)V

    .line 125
    .line 126
    .line 127
    return-void

    .line 128
    :catch_0
    move-exception v0

    .line 129
    move-object p0, v0

    .line 130
    move-object v7, p0

    .line 131
    goto :goto_1

    .line 132
    :catch_1
    move-exception v0

    .line 133
    move-object p0, v0

    .line 134
    move-object v7, p0

    .line 135
    goto :goto_2

    .line 136
    :catch_2
    move-exception v0

    .line 137
    move-object p0, v0

    .line 138
    move-object v7, p0

    .line 139
    goto :goto_3

    .line 140
    :catch_3
    move-exception v0

    .line 141
    move-object p0, v0

    .line 142
    move-object v7, p0

    .line 143
    goto :goto_4

    .line 144
    :cond_2
    filled-new-array {v0, v1, p0}, [Ljava/lang/Object;

    .line 145
    .line 146
    .line 147
    move-result-object p0

    .line 148
    invoke-virtual {v2, v4, p0}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/NoSuchMethodException; {:try_start_0 .. :try_end_0} :catch_3
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_0

    .line 149
    .line 150
    .line 151
    return-void

    .line 152
    :goto_1
    sget-object v4, Lcom/appsflyer/AFLogger;->INSTANCE:Lcom/appsflyer/AFLogger;

    .line 153
    .line 154
    sget-object v5, Lcom/appsflyer/sdk_base/logger/LogTag;->META_REFERRER:Lcom/appsflyer/sdk_base/logger/LogTag;

    .line 155
    .line 156
    const/4 v8, 0x0

    .line 157
    const/4 v9, 0x0

    .line 158
    const-string v6, "FB illegal access"

    .line 159
    .line 160
    invoke-virtual/range {v4 .. v9}, Lcom/appsflyer/sdk_base/logger/AFLoggerBase;->e(Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;Ljava/lang/Throwable;ZZ)V

    .line 161
    .line 162
    .line 163
    invoke-virtual {v7}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 164
    .line 165
    .line 166
    move-result-object p0

    .line 167
    invoke-interface {v3, p0}, Lcom/appsflyer/internal/AFa1cSDK$AFa1tSDK;->AFKeystoreWrapper(Ljava/lang/String;)V

    .line 168
    .line 169
    .line 170
    return-void

    .line 171
    :goto_2
    sget-object v4, Lcom/appsflyer/AFLogger;->INSTANCE:Lcom/appsflyer/AFLogger;

    .line 172
    .line 173
    sget-object v5, Lcom/appsflyer/sdk_base/logger/LogTag;->META_REFERRER:Lcom/appsflyer/sdk_base/logger/LogTag;

    .line 174
    .line 175
    const/4 v8, 0x0

    .line 176
    const/4 v9, 0x0

    .line 177
    const-string v6, "FB class missing error"

    .line 178
    .line 179
    invoke-virtual/range {v4 .. v9}, Lcom/appsflyer/sdk_base/logger/AFLoggerBase;->e(Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;Ljava/lang/Throwable;ZZ)V

    .line 180
    .line 181
    .line 182
    invoke-virtual {v7}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 183
    .line 184
    .line 185
    move-result-object p0

    .line 186
    invoke-interface {v3, p0}, Lcom/appsflyer/internal/AFa1cSDK$AFa1tSDK;->AFKeystoreWrapper(Ljava/lang/String;)V

    .line 187
    .line 188
    .line 189
    return-void

    .line 190
    :goto_3
    sget-object v4, Lcom/appsflyer/AFLogger;->INSTANCE:Lcom/appsflyer/AFLogger;

    .line 191
    .line 192
    sget-object v5, Lcom/appsflyer/sdk_base/logger/LogTag;->META_REFERRER:Lcom/appsflyer/sdk_base/logger/LogTag;

    .line 193
    .line 194
    const/4 v8, 0x0

    .line 195
    const/4 v9, 0x0

    .line 196
    const-string v6, "FB invocation error"

    .line 197
    .line 198
    invoke-virtual/range {v4 .. v9}, Lcom/appsflyer/sdk_base/logger/AFLoggerBase;->e(Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;Ljava/lang/Throwable;ZZ)V

    .line 199
    .line 200
    .line 201
    invoke-virtual {v7}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 202
    .line 203
    .line 204
    move-result-object p0

    .line 205
    invoke-interface {v3, p0}, Lcom/appsflyer/internal/AFa1cSDK$AFa1tSDK;->AFKeystoreWrapper(Ljava/lang/String;)V

    .line 206
    .line 207
    .line 208
    return-void

    .line 209
    :goto_4
    sget-object v4, Lcom/appsflyer/AFLogger;->INSTANCE:Lcom/appsflyer/AFLogger;

    .line 210
    .line 211
    sget-object v5, Lcom/appsflyer/sdk_base/logger/LogTag;->META_REFERRER:Lcom/appsflyer/sdk_base/logger/LogTag;

    .line 212
    .line 213
    const/4 v8, 0x0

    .line 214
    const/4 v9, 0x0

    .line 215
    const-string v6, "FB method missing error"

    .line 216
    .line 217
    invoke-virtual/range {v4 .. v9}, Lcom/appsflyer/sdk_base/logger/AFLoggerBase;->e(Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;Ljava/lang/Throwable;ZZ)V

    .line 218
    .line 219
    .line 220
    invoke-virtual {v7}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 221
    .line 222
    .line 223
    move-result-object p0

    .line 224
    invoke-interface {v3, p0}, Lcom/appsflyer/internal/AFa1cSDK$AFa1tSDK;->AFKeystoreWrapper(Ljava/lang/String;)V

    .line 225
    .line 226
    .line 227
    return-void
.end method
