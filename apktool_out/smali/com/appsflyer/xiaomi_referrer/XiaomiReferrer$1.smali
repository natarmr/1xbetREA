.class Lcom/appsflyer/xiaomi_referrer/XiaomiReferrer$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/miui/referrer/api/GetAppsReferrerStateListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/appsflyer/xiaomi_referrer/XiaomiReferrer;->start(Landroid/content/Context;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/appsflyer/xiaomi_referrer/XiaomiReferrer;

.field final synthetic val$context:Landroid/content/Context;

.field final synthetic val$referrerClient:Lcom/miui/referrer/api/GetAppsReferrerClient;


# direct methods
.method public constructor <init>(Lcom/appsflyer/xiaomi_referrer/XiaomiReferrer;Landroid/content/Context;Lcom/miui/referrer/api/GetAppsReferrerClient;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lcom/appsflyer/xiaomi_referrer/XiaomiReferrer$1;->this$0:Lcom/appsflyer/xiaomi_referrer/XiaomiReferrer;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/appsflyer/xiaomi_referrer/XiaomiReferrer$1;->val$context:Landroid/content/Context;

    .line 4
    .line 5
    iput-object p3, p0, Lcom/appsflyer/xiaomi_referrer/XiaomiReferrer$1;->val$referrerClient:Lcom/miui/referrer/api/GetAppsReferrerClient;

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public onGetAppsReferrerSetupFinished(I)V
    .locals 5

    .line 1
    const-string v0, "com.xiaomi.mipicks"

    .line 2
    .line 3
    :try_start_0
    iget-object v1, p0, Lcom/appsflyer/xiaomi_referrer/XiaomiReferrer$1;->this$0:Lcom/appsflyer/xiaomi_referrer/XiaomiReferrer;

    .line 4
    .line 5
    iget-object v1, v1, Lcom/appsflyer/sdk_base/referrer/Referrer;->map:Ljava/util/Map;

    .line 6
    .line 7
    const-string v2, "api_ver"

    .line 8
    .line 9
    iget-object v3, p0, Lcom/appsflyer/xiaomi_referrer/XiaomiReferrer$1;->val$context:Landroid/content/Context;

    .line 10
    .line 11
    invoke-static {v3, v0}, Lcom/appsflyer/sdk_base/util/AndroidExtensionsKt;->getVersionCode(Landroid/content/Context;Ljava/lang/String;)J

    .line 12
    .line 13
    .line 14
    move-result-wide v3

    .line 15
    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 16
    .line 17
    .line 18
    move-result-object v3

    .line 19
    invoke-interface {v1, v2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    iget-object v1, p0, Lcom/appsflyer/xiaomi_referrer/XiaomiReferrer$1;->this$0:Lcom/appsflyer/xiaomi_referrer/XiaomiReferrer;

    .line 23
    .line 24
    iget-object v1, v1, Lcom/appsflyer/sdk_base/referrer/Referrer;->map:Ljava/util/Map;

    .line 25
    .line 26
    const-string v2, "api_ver_name"

    .line 27
    .line 28
    iget-object v3, p0, Lcom/appsflyer/xiaomi_referrer/XiaomiReferrer$1;->val$context:Landroid/content/Context;

    .line 29
    .line 30
    invoke-static {v3, v0}, Lcom/appsflyer/sdk_base/util/AndroidExtensionsKt;->getVersionName(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    invoke-interface {v1, v2, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 35
    .line 36
    .line 37
    const/4 v0, -0x1

    .line 38
    const-string v1, "response"

    .line 39
    .line 40
    if-eq p1, v0, :cond_5

    .line 41
    .line 42
    if-eqz p1, :cond_4

    .line 43
    .line 44
    const/4 v0, 0x1

    .line 45
    if-eq p1, v0, :cond_3

    .line 46
    .line 47
    const/4 v0, 0x2

    .line 48
    if-eq p1, v0, :cond_2

    .line 49
    .line 50
    iget-object v0, p0, Lcom/appsflyer/xiaomi_referrer/XiaomiReferrer$1;->this$0:Lcom/appsflyer/xiaomi_referrer/XiaomiReferrer;

    .line 51
    .line 52
    const-string v2, "XiaomiInstallReferrer DEVELOPER_ERROR"

    .line 53
    .line 54
    const/4 v3, 0x3

    .line 55
    if-eq p1, v3, :cond_1

    .line 56
    .line 57
    const/4 v3, 0x4

    .line 58
    if-eq p1, v3, :cond_0

    .line 59
    .line 60
    :try_start_1
    iget-object p1, v0, Lcom/appsflyer/xiaomi_referrer/XiaomiReferrer;->logger:Lcom/appsflyer/sdk_base/logger/AFLoggerBase;

    .line 61
    .line 62
    sget-object v0, Lcom/appsflyer/sdk_base/logger/LogTag;->REFERRER:Lcom/appsflyer/sdk_base/logger/LogTag;

    .line 63
    .line 64
    const-string v1, "responseCode not found."

    .line 65
    .line 66
    invoke-virtual {p1, v0, v1}, Lcom/appsflyer/sdk_base/logger/AFLoggerBase;->w(Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;)V

    .line 67
    .line 68
    .line 69
    goto :goto_0

    .line 70
    :catchall_0
    move-exception p1

    .line 71
    goto/16 :goto_2

    .line 72
    .line 73
    :cond_0
    iget-object p1, v0, Lcom/appsflyer/xiaomi_referrer/XiaomiReferrer;->logger:Lcom/appsflyer/sdk_base/logger/AFLoggerBase;

    .line 74
    .line 75
    sget-object v0, Lcom/appsflyer/sdk_base/logger/LogTag;->REFERRER:Lcom/appsflyer/sdk_base/logger/LogTag;

    .line 76
    .line 77
    invoke-virtual {p1, v0, v2}, Lcom/appsflyer/sdk_base/logger/AFLoggerBase;->w(Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;)V

    .line 78
    .line 79
    .line 80
    iget-object p1, p0, Lcom/appsflyer/xiaomi_referrer/XiaomiReferrer$1;->this$0:Lcom/appsflyer/xiaomi_referrer/XiaomiReferrer;

    .line 81
    .line 82
    iget-object p1, p1, Lcom/appsflyer/sdk_base/referrer/Referrer;->map:Ljava/util/Map;

    .line 83
    .line 84
    const-string v0, "PERMISSION_ERROR"

    .line 85
    .line 86
    invoke-interface {p1, v1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 87
    .line 88
    .line 89
    goto :goto_0

    .line 90
    :cond_1
    iget-object p1, v0, Lcom/appsflyer/xiaomi_referrer/XiaomiReferrer;->logger:Lcom/appsflyer/sdk_base/logger/AFLoggerBase;

    .line 91
    .line 92
    sget-object v0, Lcom/appsflyer/sdk_base/logger/LogTag;->REFERRER:Lcom/appsflyer/sdk_base/logger/LogTag;

    .line 93
    .line 94
    invoke-virtual {p1, v0, v2}, Lcom/appsflyer/sdk_base/logger/AFLoggerBase;->w(Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;)V

    .line 95
    .line 96
    .line 97
    iget-object p1, p0, Lcom/appsflyer/xiaomi_referrer/XiaomiReferrer$1;->this$0:Lcom/appsflyer/xiaomi_referrer/XiaomiReferrer;

    .line 98
    .line 99
    iget-object p1, p1, Lcom/appsflyer/sdk_base/referrer/Referrer;->map:Ljava/util/Map;

    .line 100
    .line 101
    const-string v0, "DEVELOPER_ERROR"

    .line 102
    .line 103
    invoke-interface {p1, v1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 104
    .line 105
    .line 106
    goto :goto_0

    .line 107
    :cond_2
    iget-object p1, p0, Lcom/appsflyer/xiaomi_referrer/XiaomiReferrer$1;->this$0:Lcom/appsflyer/xiaomi_referrer/XiaomiReferrer;

    .line 108
    .line 109
    iget-object p1, p1, Lcom/appsflyer/xiaomi_referrer/XiaomiReferrer;->logger:Lcom/appsflyer/sdk_base/logger/AFLoggerBase;

    .line 110
    .line 111
    sget-object v0, Lcom/appsflyer/sdk_base/logger/LogTag;->REFERRER:Lcom/appsflyer/sdk_base/logger/LogTag;

    .line 112
    .line 113
    const-string v2, "XiaomiInstallReferrer FEATURE_NOT_SUPPORTED"

    .line 114
    .line 115
    invoke-virtual {p1, v0, v2}, Lcom/appsflyer/sdk_base/logger/AFLoggerBase;->w(Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;)V

    .line 116
    .line 117
    .line 118
    iget-object p1, p0, Lcom/appsflyer/xiaomi_referrer/XiaomiReferrer$1;->this$0:Lcom/appsflyer/xiaomi_referrer/XiaomiReferrer;

    .line 119
    .line 120
    iget-object p1, p1, Lcom/appsflyer/sdk_base/referrer/Referrer;->map:Ljava/util/Map;

    .line 121
    .line 122
    const-string v0, "FEATURE_NOT_SUPPORTED"

    .line 123
    .line 124
    invoke-interface {p1, v1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 125
    .line 126
    .line 127
    goto :goto_0

    .line 128
    :cond_3
    iget-object p1, p0, Lcom/appsflyer/xiaomi_referrer/XiaomiReferrer$1;->this$0:Lcom/appsflyer/xiaomi_referrer/XiaomiReferrer;

    .line 129
    .line 130
    iget-object p1, p1, Lcom/appsflyer/sdk_base/referrer/Referrer;->map:Ljava/util/Map;

    .line 131
    .line 132
    const-string v0, "SERVICE_UNAVAILABLE"

    .line 133
    .line 134
    invoke-interface {p1, v1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 135
    .line 136
    .line 137
    iget-object p1, p0, Lcom/appsflyer/xiaomi_referrer/XiaomiReferrer$1;->this$0:Lcom/appsflyer/xiaomi_referrer/XiaomiReferrer;

    .line 138
    .line 139
    iget-object p1, p1, Lcom/appsflyer/xiaomi_referrer/XiaomiReferrer;->logger:Lcom/appsflyer/sdk_base/logger/AFLoggerBase;

    .line 140
    .line 141
    sget-object v0, Lcom/appsflyer/sdk_base/logger/LogTag;->REFERRER:Lcom/appsflyer/sdk_base/logger/LogTag;

    .line 142
    .line 143
    const-string v1, "XiaomiInstallReferrer not supported"

    .line 144
    .line 145
    invoke-virtual {p1, v0, v1}, Lcom/appsflyer/sdk_base/logger/AFLoggerBase;->w(Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;)V

    .line 146
    .line 147
    .line 148
    goto :goto_0

    .line 149
    :cond_4
    iget-object p1, p0, Lcom/appsflyer/xiaomi_referrer/XiaomiReferrer$1;->this$0:Lcom/appsflyer/xiaomi_referrer/XiaomiReferrer;

    .line 150
    .line 151
    iget-object v0, p0, Lcom/appsflyer/xiaomi_referrer/XiaomiReferrer$1;->val$referrerClient:Lcom/miui/referrer/api/GetAppsReferrerClient;

    .line 152
    .line 153
    invoke-static {p1, v0}, Lcom/appsflyer/xiaomi_referrer/XiaomiReferrer;->a(Lcom/appsflyer/xiaomi_referrer/XiaomiReferrer;Lcom/miui/referrer/api/GetAppsReferrerClient;)V

    .line 154
    .line 155
    .line 156
    goto :goto_0

    .line 157
    :cond_5
    iget-object p1, p0, Lcom/appsflyer/xiaomi_referrer/XiaomiReferrer$1;->this$0:Lcom/appsflyer/xiaomi_referrer/XiaomiReferrer;

    .line 158
    .line 159
    iget-object p1, p1, Lcom/appsflyer/xiaomi_referrer/XiaomiReferrer;->logger:Lcom/appsflyer/sdk_base/logger/AFLoggerBase;

    .line 160
    .line 161
    sget-object v0, Lcom/appsflyer/sdk_base/logger/LogTag;->REFERRER:Lcom/appsflyer/sdk_base/logger/LogTag;

    .line 162
    .line 163
    const-string v2, "XiaomiInstallReferrer SERVICE_DISCONNECTED"

    .line 164
    .line 165
    invoke-virtual {p1, v0, v2}, Lcom/appsflyer/sdk_base/logger/AFLoggerBase;->w(Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;)V

    .line 166
    .line 167
    .line 168
    iget-object p1, p0, Lcom/appsflyer/xiaomi_referrer/XiaomiReferrer$1;->this$0:Lcom/appsflyer/xiaomi_referrer/XiaomiReferrer;

    .line 169
    .line 170
    iget-object p1, p1, Lcom/appsflyer/sdk_base/referrer/Referrer;->map:Ljava/util/Map;

    .line 171
    .line 172
    const-string v0, "SERVICE_DISCONNECTED"

    .line 173
    .line 174
    invoke-interface {p1, v1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 175
    .line 176
    .line 177
    :goto_0
    iget-object p1, p0, Lcom/appsflyer/xiaomi_referrer/XiaomiReferrer$1;->this$0:Lcom/appsflyer/xiaomi_referrer/XiaomiReferrer;

    .line 178
    .line 179
    iget-object p1, p1, Lcom/appsflyer/xiaomi_referrer/XiaomiReferrer;->logger:Lcom/appsflyer/sdk_base/logger/AFLoggerBase;

    .line 180
    .line 181
    sget-object v0, Lcom/appsflyer/sdk_base/logger/LogTag;->REFERRER:Lcom/appsflyer/sdk_base/logger/LogTag;

    .line 182
    .line 183
    const-string v1, "Xiaomi Install Referrer collected locally"

    .line 184
    .line 185
    invoke-virtual {p1, v0, v1}, Lcom/appsflyer/sdk_base/logger/AFLoggerBase;->d(Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 186
    .line 187
    .line 188
    :goto_1
    iget-object p1, p0, Lcom/appsflyer/xiaomi_referrer/XiaomiReferrer$1;->this$0:Lcom/appsflyer/xiaomi_referrer/XiaomiReferrer;

    .line 189
    .line 190
    invoke-virtual {p1}, Lcom/appsflyer/sdk_base/referrer/Referrer;->finish()V

    .line 191
    .line 192
    .line 193
    iget-object p0, p0, Lcom/appsflyer/xiaomi_referrer/XiaomiReferrer$1;->val$referrerClient:Lcom/miui/referrer/api/GetAppsReferrerClient;

    .line 194
    .line 195
    invoke-virtual {p0}, Lcom/miui/referrer/api/GetAppsReferrerClient;->endConnection()V

    .line 196
    .line 197
    .line 198
    return-void

    .line 199
    :goto_2
    :try_start_2
    iget-object v0, p0, Lcom/appsflyer/xiaomi_referrer/XiaomiReferrer$1;->this$0:Lcom/appsflyer/xiaomi_referrer/XiaomiReferrer;

    .line 200
    .line 201
    invoke-virtual {v0, p1}, Lcom/appsflyer/xiaomi_referrer/XiaomiReferrer;->onError(Ljava/lang/Throwable;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 202
    .line 203
    .line 204
    goto :goto_1

    .line 205
    :catchall_1
    move-exception p1

    .line 206
    iget-object v0, p0, Lcom/appsflyer/xiaomi_referrer/XiaomiReferrer$1;->this$0:Lcom/appsflyer/xiaomi_referrer/XiaomiReferrer;

    .line 207
    .line 208
    invoke-virtual {v0}, Lcom/appsflyer/sdk_base/referrer/Referrer;->finish()V

    .line 209
    .line 210
    .line 211
    iget-object p0, p0, Lcom/appsflyer/xiaomi_referrer/XiaomiReferrer$1;->val$referrerClient:Lcom/miui/referrer/api/GetAppsReferrerClient;

    .line 212
    .line 213
    invoke-virtual {p0}, Lcom/miui/referrer/api/GetAppsReferrerClient;->endConnection()V

    .line 214
    .line 215
    .line 216
    throw p1
.end method

.method public onGetAppsServiceDisconnected()V
    .locals 0

    return-void
.end method
