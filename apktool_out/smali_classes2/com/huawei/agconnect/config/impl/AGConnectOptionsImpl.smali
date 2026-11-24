.class public Lcom/huawei/agconnect/config/impl/AGConnectOptionsImpl;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/agconnect/AGConnectOptions;


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:Landroid/content/Context;

.field public final c:Ljava/lang/String;

.field public final d:Lcom/huawei/agconnect/AGCRoutePolicy;

.field public final e:Lcom/huawei/agconnect/config/ConfigReader;

.field public final f:Lcom/huawei/agconnect/config/impl/DecryptExclamationMark;

.field public final g:Ljava/util/HashMap;

.field public final h:Ljava/util/ArrayList;

.field public final i:Ljava/util/HashMap;


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/io/InputStream;Ljava/util/HashMap;Ljava/util/ArrayList;)V
    .locals 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/HashMap;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lcom/huawei/agconnect/config/impl/AGConnectOptionsImpl;->i:Ljava/util/HashMap;

    .line 10
    .line 11
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    :cond_0
    iput-object p1, p0, Lcom/huawei/agconnect/config/impl/AGConnectOptionsImpl;->b:Landroid/content/Context;

    .line 22
    .line 23
    invoke-virtual {p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    iput-object v0, p0, Lcom/huawei/agconnect/config/impl/AGConnectOptionsImpl;->c:Ljava/lang/String;

    .line 28
    .line 29
    const-string v1, "AGConnectOptionsImpl"

    .line 30
    .line 31
    if-eqz p2, :cond_1

    .line 32
    .line 33
    new-instance p1, Lcom/huawei/agconnect/config/impl/InputStreamReader;

    .line 34
    .line 35
    invoke-direct {p1, p2, v0}, Lcom/huawei/agconnect/config/impl/InputStreamReader;-><init>(Ljava/io/InputStream;Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    iput-object p1, p0, Lcom/huawei/agconnect/config/impl/AGConnectOptionsImpl;->e:Lcom/huawei/agconnect/config/ConfigReader;

    .line 39
    .line 40
    :try_start_0
    invoke-interface {p2}, Ljava/io/Closeable;->close()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 41
    .line 42
    .line 43
    goto :goto_0

    .line 44
    :catch_0
    const-string p1, "Utils"

    .line 45
    .line 46
    const-string p2, "Exception when closing the \'Closeable\'."

    .line 47
    .line 48
    invoke-static {p1, p2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 49
    .line 50
    .line 51
    :goto_0
    const-string p1, "use InputStreamReader"

    .line 52
    .line 53
    :goto_1
    invoke-static {v1, p1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 54
    .line 55
    .line 56
    goto :goto_2

    .line 57
    :cond_1
    new-instance p2, Lcom/huawei/agconnect/config/impl/SecurityResourcesReader;

    .line 58
    .line 59
    invoke-direct {p2, p1, v0}, Lcom/huawei/agconnect/config/impl/SecurityResourcesReader;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    .line 60
    .line 61
    .line 62
    iput-object p2, p0, Lcom/huawei/agconnect/config/impl/AGConnectOptionsImpl;->e:Lcom/huawei/agconnect/config/ConfigReader;

    .line 63
    .line 64
    const-string p1, "use SecurityResourcesReader"

    .line 65
    .line 66
    goto :goto_1

    .line 67
    :goto_2
    new-instance p1, Lcom/huawei/agconnect/config/impl/DecryptExclamationMark;

    .line 68
    .line 69
    iget-object p2, p0, Lcom/huawei/agconnect/config/impl/AGConnectOptionsImpl;->e:Lcom/huawei/agconnect/config/ConfigReader;

    .line 70
    .line 71
    invoke-direct {p1, p2}, Lcom/huawei/agconnect/config/impl/DecryptExclamationMark;-><init>(Lcom/huawei/agconnect/config/ConfigReader;)V

    .line 72
    .line 73
    .line 74
    iput-object p1, p0, Lcom/huawei/agconnect/config/impl/AGConnectOptionsImpl;->f:Lcom/huawei/agconnect/config/impl/DecryptExclamationMark;

    .line 75
    .line 76
    const-string p1, "/region"

    .line 77
    .line 78
    const/4 v0, 0x0

    .line 79
    invoke-interface {p2, p1, v0}, Lcom/huawei/agconnect/config/ConfigReader;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 80
    .line 81
    .line 82
    move-result-object p1

    .line 83
    iget-object p2, p0, Lcom/huawei/agconnect/config/impl/AGConnectOptionsImpl;->e:Lcom/huawei/agconnect/config/ConfigReader;

    .line 84
    .line 85
    const-string v2, "/agcgw/url"

    .line 86
    .line 87
    invoke-interface {p2, v2, v0}, Lcom/huawei/agconnect/config/ConfigReader;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 88
    .line 89
    .line 90
    move-result-object p2

    .line 91
    invoke-static {p1, p2}, Lcom/huawei/agconnect/config/impl/Utils;->b(Ljava/lang/String;Ljava/lang/String;)Lcom/huawei/agconnect/AGCRoutePolicy;

    .line 92
    .line 93
    .line 94
    move-result-object p1

    .line 95
    const-string p2, "getRoutePolicyFromJson"

    .line 96
    .line 97
    invoke-static {v1, p2}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 98
    .line 99
    .line 100
    iput-object p1, p0, Lcom/huawei/agconnect/config/impl/AGConnectOptionsImpl;->d:Lcom/huawei/agconnect/AGCRoutePolicy;

    .line 101
    .line 102
    new-instance p1, Ljava/util/HashMap;

    .line 103
    .line 104
    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    .line 105
    .line 106
    .line 107
    invoke-virtual {p3}, Ljava/util/HashMap;->entrySet()Ljava/util/Set;

    .line 108
    .line 109
    .line 110
    move-result-object p2

    .line 111
    invoke-interface {p2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 112
    .line 113
    .line 114
    move-result-object p2

    .line 115
    :goto_3
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 116
    .line 117
    .line 118
    move-result p3

    .line 119
    if-eqz p3, :cond_2

    .line 120
    .line 121
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 122
    .line 123
    .line 124
    move-result-object p3

    .line 125
    check-cast p3, Ljava/util/Map$Entry;

    .line 126
    .line 127
    invoke-interface {p3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 128
    .line 129
    .line 130
    move-result-object v0

    .line 131
    check-cast v0, Ljava/lang/String;

    .line 132
    .line 133
    invoke-static {v0}, Lcom/huawei/agconnect/config/impl/Utils;->a(Ljava/lang/String;)Ljava/lang/String;

    .line 134
    .line 135
    .line 136
    move-result-object v0

    .line 137
    invoke-interface {p3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 138
    .line 139
    .line 140
    move-result-object p3

    .line 141
    invoke-virtual {p1, v0, p3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 142
    .line 143
    .line 144
    goto :goto_3

    .line 145
    :cond_2
    iput-object p1, p0, Lcom/huawei/agconnect/config/impl/AGConnectOptionsImpl;->g:Ljava/util/HashMap;

    .line 146
    .line 147
    iput-object p4, p0, Lcom/huawei/agconnect/config/impl/AGConnectOptionsImpl;->h:Ljava/util/ArrayList;

    .line 148
    .line 149
    new-instance p2, Ljava/lang/StringBuilder;

    .line 150
    .line 151
    const-string p3, "{packageName=\'"

    .line 152
    .line 153
    invoke-direct {p2, p3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 154
    .line 155
    .line 156
    iget-object p3, p0, Lcom/huawei/agconnect/config/impl/AGConnectOptionsImpl;->c:Ljava/lang/String;

    .line 157
    .line 158
    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 159
    .line 160
    .line 161
    const-string p3, "\', routePolicy="

    .line 162
    .line 163
    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 164
    .line 165
    .line 166
    iget-object p3, p0, Lcom/huawei/agconnect/config/impl/AGConnectOptionsImpl;->d:Lcom/huawei/agconnect/AGCRoutePolicy;

    .line 167
    .line 168
    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 169
    .line 170
    .line 171
    const-string p3, ", reader="

    .line 172
    .line 173
    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 174
    .line 175
    .line 176
    iget-object p3, p0, Lcom/huawei/agconnect/config/impl/AGConnectOptionsImpl;->e:Lcom/huawei/agconnect/config/ConfigReader;

    .line 177
    .line 178
    invoke-virtual {p3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 179
    .line 180
    .line 181
    move-result-object p3

    .line 182
    invoke-virtual {p3}, Ljava/lang/String;->hashCode()I

    .line 183
    .line 184
    .line 185
    move-result p3

    .line 186
    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 187
    .line 188
    .line 189
    const-string p3, ", customConfigMap="

    .line 190
    .line 191
    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 192
    .line 193
    .line 194
    new-instance p3, Lorg/json/JSONObject;

    .line 195
    .line 196
    invoke-direct {p3, p1}, Lorg/json/JSONObject;-><init>(Ljava/util/Map;)V

    .line 197
    .line 198
    .line 199
    invoke-virtual {p3}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    .line 200
    .line 201
    .line 202
    move-result-object p1

    .line 203
    invoke-virtual {p1}, Ljava/lang/String;->hashCode()I

    .line 204
    .line 205
    .line 206
    move-result p1

    .line 207
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 208
    .line 209
    .line 210
    const/16 p1, 0x7d

    .line 211
    .line 212
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 213
    .line 214
    .line 215
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 216
    .line 217
    .line 218
    move-result-object p1

    .line 219
    invoke-virtual {p1}, Ljava/lang/String;->hashCode()I

    .line 220
    .line 221
    .line 222
    move-result p1

    .line 223
    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 224
    .line 225
    .line 226
    move-result-object p1

    .line 227
    iput-object p1, p0, Lcom/huawei/agconnect/config/impl/AGConnectOptionsImpl;->a:Ljava/lang/String;

    .line 228
    .line 229
    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/huawei/agconnect/config/impl/AGConnectOptionsImpl;->a:Ljava/lang/String;

    return-object p0
.end method

.method public final b()Lcom/huawei/agconnect/AGCRoutePolicy;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/huawei/agconnect/config/impl/AGConnectOptionsImpl;->d:Lcom/huawei/agconnect/AGCRoutePolicy;

    if-nez p0, :cond_0

    sget-object p0, Lcom/huawei/agconnect/AGCRoutePolicy;->b:Lcom/huawei/agconnect/AGCRoutePolicy;

    :cond_0
    return-object p0
.end method

.method public final getContext()Landroid/content/Context;
    .locals 0

    iget-object p0, p0, Lcom/huawei/agconnect/config/impl/AGConnectOptionsImpl;->b:Landroid/content/Context;

    return-object p0
.end method

.method public final getString(Ljava/lang/String;)Ljava/lang/String;
    .locals 5

    .line 1
    const/4 v0, 0x0

    .line 2
    const-string v1, "AGConnectOptionsImpl"

    .line 3
    .line 4
    if-nez p1, :cond_0

    .line 5
    .line 6
    const-string p0, "getString path is null"

    .line 7
    .line 8
    invoke-static {v1, p0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 9
    .line 10
    .line 11
    return-object v0

    .line 12
    :cond_0
    invoke-static {p1}, Lcom/huawei/agconnect/config/impl/Utils;->a(Ljava/lang/String;)Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    iget-object v2, p0, Lcom/huawei/agconnect/config/impl/AGConnectOptionsImpl;->g:Ljava/util/HashMap;

    .line 17
    .line 18
    invoke-virtual {v2, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object v2

    .line 22
    check-cast v2, Ljava/lang/String;

    .line 23
    .line 24
    if-eqz v2, :cond_1

    .line 25
    .line 26
    const-string p0, "use customValue"

    .line 27
    .line 28
    :goto_0
    invoke-static {v1, p0}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 29
    .line 30
    .line 31
    return-object v2

    .line 32
    :cond_1
    sget-object v2, Lcom/huawei/agconnect/JsonProcessingFactory;->a:Ljava/util/HashMap;

    .line 33
    .line 34
    invoke-virtual {v2, p1}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    .line 35
    .line 36
    .line 37
    move-result v3

    .line 38
    if-nez v3, :cond_2

    .line 39
    .line 40
    const-string v2, "processors not containsKey: "

    .line 41
    .line 42
    :goto_1
    invoke-virtual {v2, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object v2

    .line 46
    invoke-static {v1, v2}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 47
    .line 48
    .line 49
    move-object v2, v0

    .line 50
    goto :goto_2

    .line 51
    :cond_2
    iget-object v3, p0, Lcom/huawei/agconnect/config/impl/AGConnectOptionsImpl;->i:Ljava/util/HashMap;

    .line 52
    .line 53
    invoke-virtual {v3, p1}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    .line 54
    .line 55
    .line 56
    move-result v4

    .line 57
    if-eqz v4, :cond_3

    .line 58
    .line 59
    invoke-virtual {v3, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    move-result-object v2

    .line 63
    check-cast v2, Ljava/lang/String;

    .line 64
    .line 65
    goto :goto_2

    .line 66
    :cond_3
    invoke-virtual {v2, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    move-result-object v2

    .line 70
    check-cast v2, Lcom/huawei/agconnect/JsonProcessingFactory$JsonProcessor;

    .line 71
    .line 72
    if-nez v2, :cond_4

    .line 73
    .line 74
    const-string v2, "processors is null: "

    .line 75
    .line 76
    goto :goto_1

    .line 77
    :cond_4
    invoke-interface {v2, p0}, Lcom/huawei/agconnect/JsonProcessingFactory$JsonProcessor;->a(Lcom/huawei/agconnect/AGConnectOptions;)Ljava/lang/String;

    .line 78
    .line 79
    .line 80
    move-result-object v2

    .line 81
    invoke-virtual {v3, p1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 82
    .line 83
    .line 84
    :goto_2
    if-eqz v2, :cond_5

    .line 85
    .line 86
    const-string p0, "use processValue"

    .line 87
    .line 88
    goto :goto_0

    .line 89
    :cond_5
    iget-object v1, p0, Lcom/huawei/agconnect/config/impl/AGConnectOptionsImpl;->e:Lcom/huawei/agconnect/config/ConfigReader;

    .line 90
    .line 91
    invoke-interface {v1, p1, v0}, Lcom/huawei/agconnect/config/ConfigReader;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 92
    .line 93
    .line 94
    move-result-object p1

    .line 95
    invoke-static {p1}, Lcom/huawei/agconnect/config/impl/DecryptExclamationMark;->b(Ljava/lang/String;)Z

    .line 96
    .line 97
    .line 98
    move-result v0

    .line 99
    if-eqz v0, :cond_6

    .line 100
    .line 101
    iget-object p0, p0, Lcom/huawei/agconnect/config/impl/AGConnectOptionsImpl;->f:Lcom/huawei/agconnect/config/impl/DecryptExclamationMark;

    .line 102
    .line 103
    invoke-virtual {p0, p1}, Lcom/huawei/agconnect/config/impl/DecryptExclamationMark;->c(Ljava/lang/String;)Ljava/lang/String;

    .line 104
    .line 105
    .line 106
    move-result-object p0

    .line 107
    return-object p0

    .line 108
    :cond_6
    return-object p1
.end method
