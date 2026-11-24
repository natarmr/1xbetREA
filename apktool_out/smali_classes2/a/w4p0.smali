.class public final La/w4p0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/u73;
.implements La/w7;
.implements La/uhv0;
.implements La/mff0;
.implements La/qfw0;
.implements La/g1x0;
.implements La/thx0;


# instance fields
.field public final synthetic a:B

.field public b:Ljava/lang/Object;


# direct methods
.method public constructor <init>(B)V
    .locals 0

    iput-byte p1, p0, La/w4p0;->a:B

    packed-switch p1, :pswitch_data_0

    .line 62
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 63
    new-instance p1, Ljava/util/LinkedHashMap;

    invoke-direct {p1}, Ljava/util/LinkedHashMap;-><init>()V

    iput-object p1, p0, La/w4p0;->b:Ljava/lang/Object;

    return-void

    .line 64
    :pswitch_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void

    :pswitch_data_0
    .packed-switch 0x1b
        :pswitch_0
    .end packed-switch
.end method

.method public constructor <init>(FF)V
    .locals 1

    const/16 v0, 0xd

    iput-byte v0, p0, La/w4p0;->a:B

    .line 75
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 76
    new-instance v0, La/mlq;

    invoke-direct {v0, p1, p2}, La/mlq;-><init>(FF)V

    iput-object v0, p0, La/w4p0;->b:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(La/clz;)V
    .locals 1

    const/16 v0, 0xf

    iput-byte v0, p0, La/w4p0;->a:B

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 71
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 72
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, La/w4p0;->b:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(La/gii0;B)V
    .locals 1

    .line 1
    iput-byte p2, p0, La/w4p0;->a:B

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    sparse-switch p2, :sswitch_data_0

    .line 7
    .line 8
    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 10
    .line 11
    .line 12
    new-instance p2, La/enj0;

    .line 13
    .line 14
    const/16 v0, 0x1a

    .line 15
    .line 16
    invoke-direct {p2, p1, v0}, La/enj0;-><init>(La/gii0;B)V

    .line 17
    .line 18
    .line 19
    iput-object p2, p0, La/w4p0;->b:Ljava/lang/Object;

    .line 20
    .line 21
    return-void

    .line 22
    :sswitch_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 23
    .line 24
    .line 25
    new-instance p2, La/lkr0;

    .line 26
    .line 27
    const/16 v0, 0x19

    .line 28
    .line 29
    invoke-direct {p2, p1, v0}, La/lkr0;-><init>(La/gii0;B)V

    .line 30
    .line 31
    .line 32
    iput-object p2, p0, La/w4p0;->b:Ljava/lang/Object;

    .line 33
    .line 34
    return-void

    .line 35
    :sswitch_1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 36
    .line 37
    .line 38
    new-instance p2, La/lkr0;

    .line 39
    .line 40
    const/16 v0, 0x9

    .line 41
    .line 42
    invoke-direct {p2, p1, v0}, La/lkr0;-><init>(La/gii0;B)V

    .line 43
    .line 44
    .line 45
    iput-object p2, p0, La/w4p0;->b:Ljava/lang/Object;

    .line 46
    .line 47
    return-void

    .line 48
    :sswitch_2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 49
    .line 50
    .line 51
    new-instance p2, La/lkr0;

    .line 52
    .line 53
    const/4 v0, 0x2

    .line 54
    invoke-direct {p2, p1, v0}, La/lkr0;-><init>(La/gii0;B)V

    .line 55
    .line 56
    .line 57
    iput-object p2, p0, La/w4p0;->b:Ljava/lang/Object;

    .line 58
    .line 59
    return-void

    .line 60
    nop

    .line 61
    :sswitch_data_0
    .sparse-switch
        0x3 -> :sswitch_2
        0x4 -> :sswitch_1
        0x12 -> :sswitch_0
    .end sparse-switch
.end method

.method public constructor <init>(La/h7q;)V
    .locals 1

    const/16 v0, 0x8

    iput-byte v0, p0, La/w4p0;->a:B

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 65
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/w4p0;->b:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(La/njv0;La/jhv0;La/bzs0;)V
    .locals 0

    const/16 p1, 0x11

    iput-byte p1, p0, La/w4p0;->a:B

    .line 73
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 74
    iput-object p2, p0, La/w4p0;->b:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(La/oaw0;Lcom/google/android/gms/auth/api/identity/GetSignInIntentRequest;)V
    .locals 0

    const/16 p1, 0x14

    iput-byte p1, p0, La/w4p0;->a:B

    .line 70
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, La/w4p0;->b:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(La/wwb0;)V
    .locals 1

    const/4 v0, 0x1

    iput-byte v0, p0, La/w4p0;->a:B

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 66
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 67
    iput-object p1, p0, La/w4p0;->b:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(La/zep;)V
    .locals 1

    const/16 v0, 0x10

    iput-byte v0, p0, La/w4p0;->a:B

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 68
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 69
    iput-object p1, p0, La/w4p0;->b:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;B)V
    .locals 0

    .line 61
    iput-byte p2, p0, La/w4p0;->a:B

    iput-object p1, p0, La/w4p0;->b:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(ILjava/lang/Throwable;[B)V
    .locals 17

    .line 1
    move/from16 v0, p1

    .line 2
    .line 3
    move-object/from16 v1, p2

    .line 4
    .line 5
    move-object/from16 v2, p0

    .line 6
    .line 7
    move-object/from16 v3, p3

    .line 8
    .line 9
    iget-object v2, v2, La/w4p0;->b:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast v2, La/kxw0;

    .line 12
    .line 13
    const-string v4, "timestamp"

    .line 14
    .line 15
    const-string v5, "gad_source"

    .line 16
    .line 17
    const-string v6, "gbraid"

    .line 18
    .line 19
    const-string v7, "gclid"

    .line 20
    .line 21
    const-string v8, "deeplink"

    .line 22
    .line 23
    const-string v9, ""

    .line 24
    .line 25
    iget-object v10, v2, La/kxw0;->f:La/uuw0;

    .line 26
    .line 27
    const/16 v11, 0xc8

    .line 28
    .line 29
    if-eq v0, v11, :cond_1

    .line 30
    .line 31
    const/16 v11, 0xcc

    .line 32
    .line 33
    if-eq v0, v11, :cond_1

    .line 34
    .line 35
    const/16 v11, 0x130

    .line 36
    .line 37
    if-ne v0, v11, :cond_0

    .line 38
    .line 39
    move v0, v11

    .line 40
    goto :goto_0

    .line 41
    :cond_0
    move-object v2, v10

    .line 42
    goto/16 :goto_6

    .line 43
    .line 44
    :cond_1
    :goto_0
    if-nez v1, :cond_0

    .line 45
    .line 46
    iget-object v0, v2, La/kxw0;->e:La/wvw0;

    .line 47
    .line 48
    invoke-static {v0}, La/kxw0;->e(La/p4;)V

    .line 49
    .line 50
    .line 51
    iget-object v0, v0, La/wvw0;->u:La/mvw0;

    .line 52
    .line 53
    const/4 v1, 0x1

    .line 54
    invoke-virtual {v0, v1}, La/mvw0;->b(Z)V

    .line 55
    .line 56
    .line 57
    if-eqz v3, :cond_2

    .line 58
    .line 59
    array-length v0, v3

    .line 60
    if-nez v0, :cond_3

    .line 61
    .line 62
    :cond_2
    move-object v2, v10

    .line 63
    goto/16 :goto_5

    .line 64
    .line 65
    :cond_3
    new-instance v0, Ljava/lang/String;

    .line 66
    .line 67
    invoke-direct {v0, v3}, Ljava/lang/String;-><init>([B)V

    .line 68
    .line 69
    .line 70
    :try_start_0
    new-instance v1, Lorg/json/JSONObject;

    .line 71
    .line 72
    invoke-direct {v1, v0}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 73
    .line 74
    .line 75
    invoke-virtual {v1, v8, v9}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 76
    .line 77
    .line 78
    move-result-object v0

    .line 79
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 80
    .line 81
    .line 82
    move-result v3

    .line 83
    if-eqz v3, :cond_4

    .line 84
    .line 85
    invoke-static {v10}, La/kxw0;->g(La/ryw0;)V

    .line 86
    .line 87
    .line 88
    iget-object v0, v10, La/uuw0;->n:La/quw0;

    .line 89
    .line 90
    const-string v1, "Deferred Deep Link is empty."

    .line 91
    .line 92
    invoke-virtual {v0, v1}, La/quw0;->a(Ljava/lang/String;)V

    .line 93
    .line 94
    .line 95
    return-void

    .line 96
    :catch_0
    move-exception v0

    .line 97
    move-object v2, v10

    .line 98
    goto/16 :goto_3

    .line 99
    .line 100
    :cond_4
    invoke-virtual {v1, v7, v9}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 101
    .line 102
    .line 103
    move-result-object v3

    .line 104
    invoke-virtual {v1, v6, v9}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 105
    .line 106
    .line 107
    move-result-object v11

    .line 108
    invoke-virtual {v1, v5, v9}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 109
    .line 110
    .line 111
    move-result-object v9

    .line 112
    const-wide/16 v12, 0x0

    .line 113
    .line 114
    invoke-virtual {v1, v4, v12, v13}, Lorg/json/JSONObject;->optDouble(Ljava/lang/String;D)D

    .line 115
    .line 116
    .line 117
    move-result-wide v12

    .line 118
    new-instance v1, Landroid/os/Bundle;

    .line 119
    .line 120
    invoke-direct {v1}, Landroid/os/Bundle;-><init>()V

    .line 121
    .line 122
    .line 123
    iget-object v14, v2, La/kxw0;->i:La/x6x0;

    .line 124
    .line 125
    invoke-static {v14}, La/kxw0;->e(La/p4;)V

    .line 126
    .line 127
    .line 128
    iget-object v15, v14, La/p4;->b:Ljava/lang/Object;

    .line 129
    .line 130
    check-cast v15, La/kxw0;

    .line 131
    .line 132
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 133
    .line 134
    .line 135
    move-result v16

    .line 136
    if-eqz v16, :cond_5

    .line 137
    .line 138
    move-object/from16 v16, v10

    .line 139
    .line 140
    goto/16 :goto_2

    .line 141
    .line 142
    :cond_5
    move-wide/from16 p0, v12

    .line 143
    .line 144
    iget-object v12, v15, La/kxw0;->a:Landroid/content/Context;

    .line 145
    .line 146
    invoke-virtual {v12}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 147
    .line 148
    .line 149
    move-result-object v13
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 150
    move-object/from16 v16, v10

    .line 151
    .line 152
    :try_start_1
    new-instance v10, Landroid/content/Intent;

    .line 153
    .line 154
    move-object/from16 p2, v14

    .line 155
    .line 156
    const-string v14, "android.intent.action.VIEW"

    .line 157
    .line 158
    move-object/from16 p3, v15

    .line 159
    .line 160
    invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 161
    .line 162
    .line 163
    move-result-object v15

    .line 164
    invoke-direct {v10, v14, v15}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V

    .line 165
    .line 166
    .line 167
    const/4 v14, 0x0

    .line 168
    invoke-virtual {v13, v10, v14}, Landroid/content/pm/PackageManager;->queryIntentActivities(Landroid/content/Intent;I)Ljava/util/List;

    .line 169
    .line 170
    .line 171
    move-result-object v10

    .line 172
    if-eqz v10, :cond_9

    .line 173
    .line 174
    invoke-interface {v10}, Ljava/util/List;->isEmpty()Z

    .line 175
    .line 176
    .line 177
    move-result v10

    .line 178
    if-nez v10, :cond_9

    .line 179
    .line 180
    invoke-static {v11}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 181
    .line 182
    .line 183
    move-result v10

    .line 184
    if-nez v10, :cond_6

    .line 185
    .line 186
    invoke-virtual {v1, v6, v11}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 187
    .line 188
    .line 189
    goto :goto_1

    .line 190
    :catch_1
    move-exception v0

    .line 191
    move-object/from16 v2, v16

    .line 192
    .line 193
    goto/16 :goto_3

    .line 194
    .line 195
    :cond_6
    :goto_1
    invoke-static {v9}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 196
    .line 197
    .line 198
    move-result v6

    .line 199
    if-nez v6, :cond_7

    .line 200
    .line 201
    invoke-virtual {v1, v5, v9}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 202
    .line 203
    .line 204
    :cond_7
    invoke-virtual {v1, v7, v3}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 205
    .line 206
    .line 207
    const-string v3, "_cis"

    .line 208
    .line 209
    const-string v5, "ddp"

    .line 210
    .line 211
    invoke-virtual {v1, v3, v5}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 212
    .line 213
    .line 214
    iget-object v2, v2, La/kxw0;->m:La/b1x0;

    .line 215
    .line 216
    const-string v3, "auto"

    .line 217
    .line 218
    const-string v5, "_cmp"

    .line 219
    .line 220
    invoke-virtual {v2, v1, v3, v5}, La/b1x0;->s1(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/String;)V

    .line 221
    .line 222
    .line 223
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 224
    .line 225
    .line 226
    move-result v1
    :try_end_1
    .catch Lorg/json/JSONException; {:try_start_1 .. :try_end_1} :catch_1

    .line 227
    if-nez v1, :cond_a

    .line 228
    .line 229
    :try_start_2
    const-string v1, "google.analytics.deferred.deeplink.prefs"

    .line 230
    .line 231
    invoke-virtual {v12, v1, v14}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    .line 232
    .line 233
    .line 234
    move-result-object v1

    .line 235
    invoke-interface {v1}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 236
    .line 237
    .line 238
    move-result-object v1

    .line 239
    invoke-interface {v1, v8, v0}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 240
    .line 241
    .line 242
    invoke-static/range {p0 .. p1}, Ljava/lang/Double;->doubleToRawLongBits(D)J

    .line 243
    .line 244
    .line 245
    move-result-wide v2

    .line 246
    invoke-interface {v1, v4, v2, v3}, Landroid/content/SharedPreferences$Editor;->putLong(Ljava/lang/String;J)Landroid/content/SharedPreferences$Editor;

    .line 247
    .line 248
    .line 249
    invoke-interface {v1}, Landroid/content/SharedPreferences$Editor;->commit()Z

    .line 250
    .line 251
    .line 252
    move-result v0
    :try_end_2
    .catch Ljava/lang/RuntimeException; {:try_start_2 .. :try_end_2} :catch_2
    .catch Lorg/json/JSONException; {:try_start_2 .. :try_end_2} :catch_1

    .line 253
    if-eqz v0, :cond_a

    .line 254
    .line 255
    :try_start_3
    new-instance v0, Landroid/content/Intent;

    .line 256
    .line 257
    const-string v1, "android.google.analytics.action.DEEPLINK_ACTION"

    .line 258
    .line 259
    invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 260
    .line 261
    .line 262
    move-object/from16 v15, p3

    .line 263
    .line 264
    iget-object v1, v15, La/kxw0;->a:Landroid/content/Context;

    .line 265
    .line 266
    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 267
    .line 268
    const/16 v3, 0x22

    .line 269
    .line 270
    if-ge v2, v3, :cond_8

    .line 271
    .line 272
    invoke-virtual {v1, v0}, Landroid/content/Context;->sendBroadcast(Landroid/content/Intent;)V

    .line 273
    .line 274
    .line 275
    return-void

    .line 276
    :cond_8
    invoke-static {}, La/mmv;->d()Landroid/app/BroadcastOptions;

    .line 277
    .line 278
    .line 279
    move-result-object v2

    .line 280
    invoke-static {v2}, La/mmv;->e(Landroid/app/BroadcastOptions;)Landroid/app/BroadcastOptions;

    .line 281
    .line 282
    .line 283
    move-result-object v2

    .line 284
    invoke-static {v2}, La/big0;->b(Landroid/app/BroadcastOptions;)Landroid/os/Bundle;

    .line 285
    .line 286
    .line 287
    move-result-object v2

    .line 288
    invoke-static {v1, v2, v0}, La/big0;->e(Landroid/content/Context;Landroid/os/Bundle;Landroid/content/Intent;)V

    .line 289
    .line 290
    .line 291
    return-void

    .line 292
    :catch_2
    move-exception v0

    .line 293
    move-object/from16 v1, p2

    .line 294
    .line 295
    iget-object v1, v1, La/p4;->b:Ljava/lang/Object;

    .line 296
    .line 297
    check-cast v1, La/kxw0;

    .line 298
    .line 299
    iget-object v1, v1, La/kxw0;->f:La/uuw0;

    .line 300
    .line 301
    invoke-static {v1}, La/kxw0;->g(La/ryw0;)V

    .line 302
    .line 303
    .line 304
    iget-object v1, v1, La/uuw0;->g:La/quw0;

    .line 305
    .line 306
    const-string v2, "Failed to persist Deferred Deep Link. exception"

    .line 307
    .line 308
    invoke-virtual {v1, v0, v2}, La/quw0;->b(Ljava/lang/Object;Ljava/lang/String;)V

    .line 309
    .line 310
    .line 311
    goto :goto_4

    .line 312
    :cond_9
    :goto_2
    invoke-static/range {v16 .. v16}, La/kxw0;->g(La/ryw0;)V
    :try_end_3
    .catch Lorg/json/JSONException; {:try_start_3 .. :try_end_3} :catch_1

    .line 313
    .line 314
    .line 315
    move-object/from16 v2, v16

    .line 316
    .line 317
    :try_start_4
    iget-object v1, v2, La/uuw0;->j:La/quw0;

    .line 318
    .line 319
    const-string v4, "Deferred Deep Link validation failed. gclid, gbraid, deep link"

    .line 320
    .line 321
    invoke-virtual {v1, v4, v3, v11, v0}, La/quw0;->d(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    :try_end_4
    .catch Lorg/json/JSONException; {:try_start_4 .. :try_end_4} :catch_3

    .line 322
    .line 323
    .line 324
    return-void

    .line 325
    :catch_3
    move-exception v0

    .line 326
    :goto_3
    invoke-static {v2}, La/kxw0;->g(La/ryw0;)V

    .line 327
    .line 328
    .line 329
    iget-object v1, v2, La/uuw0;->g:La/quw0;

    .line 330
    .line 331
    const-string v2, "Failed to parse the Deferred Deep Link response. exception"

    .line 332
    .line 333
    invoke-virtual {v1, v0, v2}, La/quw0;->b(Ljava/lang/Object;Ljava/lang/String;)V

    .line 334
    .line 335
    .line 336
    :cond_a
    :goto_4
    return-void

    .line 337
    :goto_5
    invoke-static {v2}, La/kxw0;->g(La/ryw0;)V

    .line 338
    .line 339
    .line 340
    iget-object v0, v2, La/uuw0;->n:La/quw0;

    .line 341
    .line 342
    const-string v1, "Deferred Deep Link response empty."

    .line 343
    .line 344
    invoke-virtual {v0, v1}, La/quw0;->a(Ljava/lang/String;)V

    .line 345
    .line 346
    .line 347
    return-void

    .line 348
    :goto_6
    invoke-static {v2}, La/kxw0;->g(La/ryw0;)V

    .line 349
    .line 350
    .line 351
    iget-object v2, v2, La/uuw0;->j:La/quw0;

    .line 352
    .line 353
    const-string v3, "Network Request for Deferred Deep Link failed. response, exception"

    .line 354
    .line 355
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 356
    .line 357
    .line 358
    move-result-object v0

    .line 359
    invoke-virtual {v2, v0, v1, v3}, La/quw0;->c(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V

    .line 360
    .line 361
    .line 362
    return-void
.end method

.method public accept(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 2

    .line 1
    iget-byte v0, p0, La/w4p0;->a:B

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    packed-switch v0, :pswitch_data_0

    .line 5
    .line 6
    .line 7
    :pswitch_0
    check-cast p2, Lcom/google/android/gms/tasks/TaskCompletionSource;

    .line 8
    .line 9
    check-cast p1, La/i0x0;

    .line 10
    .line 11
    invoke-virtual {p1}, La/hz5;->l()Landroid/os/IInterface;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    check-cast p1, La/h0x0;

    .line 16
    .line 17
    new-instance v0, La/izw0;

    .line 18
    .line 19
    iget-object p0, p0, La/w4p0;->b:Ljava/lang/Object;

    .line 20
    .line 21
    check-cast p0, La/tzw0;

    .line 22
    .line 23
    invoke-direct {v0, p0, p2}, La/izw0;-><init>(La/tzw0;Lcom/google/android/gms/tasks/TaskCompletionSource;)V

    .line 24
    .line 25
    .line 26
    invoke-virtual {p1}, La/y4w0;->G()Landroid/os/Parcel;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    invoke-static {p0, v0}, La/wmw0;->c(Landroid/os/Parcel;Landroid/os/IInterface;)V

    .line 31
    .line 32
    .line 33
    const/16 p2, 0x1b

    .line 34
    .line 35
    invoke-virtual {p1, p0, p2}, La/y4w0;->H(Landroid/os/Parcel;I)V

    .line 36
    .line 37
    .line 38
    return-void

    .line 39
    :pswitch_1
    check-cast p2, Lcom/google/android/gms/tasks/TaskCompletionSource;

    .line 40
    .line 41
    check-cast p1, La/fhw0;

    .line 42
    .line 43
    invoke-virtual {p1}, La/hz5;->l()Landroid/os/IInterface;

    .line 44
    .line 45
    .line 46
    move-result-object p1

    .line 47
    check-cast p1, La/kzw0;

    .line 48
    .line 49
    new-instance v0, La/hiw0;

    .line 50
    .line 51
    iget-object p0, p0, La/w4p0;->b:Ljava/lang/Object;

    .line 52
    .line 53
    check-cast p0, La/mmx;

    .line 54
    .line 55
    invoke-direct {v0, p0, p2}, La/hiw0;-><init>(La/mmx;Lcom/google/android/gms/tasks/TaskCompletionSource;)V

    .line 56
    .line 57
    .line 58
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    .line 59
    .line 60
    .line 61
    move-result-object p0

    .line 62
    const-string p2, "com.google.android.gms.auth.api.phone.internal.ISmsRetrieverApiService"

    .line 63
    .line 64
    invoke-virtual {p0, p2}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V

    .line 65
    .line 66
    .line 67
    sget p2, La/ynw0;->a:I

    .line 68
    .line 69
    invoke-virtual {p0, v0}, Landroid/os/Parcel;->writeStrongBinder(Landroid/os/IBinder;)V

    .line 70
    .line 71
    .line 72
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    .line 73
    .line 74
    .line 75
    move-result-object p2

    .line 76
    :try_start_0
    iget-object p1, p1, La/kzw0;->a:Landroid/os/IBinder;

    .line 77
    .line 78
    const/4 v0, 0x0

    .line 79
    invoke-interface {p1, v1, p0, p2, v0}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z

    .line 80
    .line 81
    .line 82
    invoke-virtual {p2}, Landroid/os/Parcel;->readException()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 83
    .line 84
    .line 85
    invoke-virtual {p0}, Landroid/os/Parcel;->recycle()V

    .line 86
    .line 87
    .line 88
    invoke-virtual {p2}, Landroid/os/Parcel;->recycle()V

    .line 89
    .line 90
    .line 91
    return-void

    .line 92
    :catchall_0
    move-exception p1

    .line 93
    invoke-virtual {p0}, Landroid/os/Parcel;->recycle()V

    .line 94
    .line 95
    .line 96
    invoke-virtual {p2}, Landroid/os/Parcel;->recycle()V

    .line 97
    .line 98
    .line 99
    throw p1

    .line 100
    :pswitch_2
    check-cast p1, La/paw0;

    .line 101
    .line 102
    check-cast p2, Lcom/google/android/gms/tasks/TaskCompletionSource;

    .line 103
    .line 104
    new-instance v0, La/maw0;

    .line 105
    .line 106
    invoke-direct {v0, p2, v1}, La/maw0;-><init>(Lcom/google/android/gms/tasks/TaskCompletionSource;B)V

    .line 107
    .line 108
    .line 109
    invoke-virtual {p1}, La/hz5;->l()Landroid/os/IInterface;

    .line 110
    .line 111
    .line 112
    move-result-object p1

    .line 113
    check-cast p1, La/ebw0;

    .line 114
    .line 115
    iget-object p0, p0, La/w4p0;->b:Ljava/lang/Object;

    .line 116
    .line 117
    check-cast p0, Lcom/google/android/gms/auth/api/identity/GetSignInIntentRequest;

    .line 118
    .line 119
    invoke-virtual {p1}, La/y4w0;->C()Landroid/os/Parcel;

    .line 120
    .line 121
    .line 122
    move-result-object p2

    .line 123
    sget v1, La/taw0;->a:I

    .line 124
    .line 125
    invoke-virtual {p2, v0}, Landroid/os/Parcel;->writeStrongBinder(Landroid/os/IBinder;)V

    .line 126
    .line 127
    .line 128
    invoke-static {p2, p0}, La/taw0;->c(Landroid/os/Parcel;Landroid/os/Parcelable;)V

    .line 129
    .line 130
    .line 131
    const/4 p0, 0x3

    .line 132
    invoke-virtual {p1, p2, p0}, La/y4w0;->D(Landroid/os/Parcel;I)V

    .line 133
    .line 134
    .line 135
    return-void

    .line 136
    nop

    .line 137
    :pswitch_data_0
    .packed-switch 0x14
        :pswitch_2
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method

.method public b(La/ikt0;Ljava/lang/CharSequence;)Ljava/util/Iterator;
    .locals 2

    .line 1
    iget-object p0, p0, La/w4p0;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, La/gvw0;

    .line 4
    .line 5
    new-instance v0, La/nex0;

    .line 6
    .line 7
    const/4 v1, 0x1

    .line 8
    invoke-direct {v0, p1, p2, p0, v1}, La/nex0;-><init>(La/ikt0;Ljava/lang/CharSequence;Ljava/lang/Object;B)V

    .line 9
    .line 10
    .line 11
    return-object v0
.end method

.method public c(ILa/md80;La/bnn0;)Ljava/lang/Object;
    .locals 4

    .line 1
    iget-object p0, p0, La/w4p0;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, La/rkr0;

    .line 4
    .line 5
    invoke-interface {p0}, La/rkr0;->s()Ljava/util/Map;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    new-instance v1, Ljava/util/LinkedHashMap;

    .line 10
    .line 11
    invoke-direct {v1, v0}, Ljava/util/LinkedHashMap;-><init>(Ljava/util/Map;)V

    .line 12
    .line 13
    .line 14
    new-instance v2, Ljava/lang/Integer;

    .line 15
    .line 16
    invoke-direct {v2, p1}, Ljava/lang/Integer;-><init>(I)V

    .line 17
    .line 18
    .line 19
    invoke-interface {v0, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    if-nez v0, :cond_0

    .line 24
    .line 25
    sget-object v0, La/xun;->a:La/xun;

    .line 26
    .line 27
    :cond_0
    check-cast v0, Ljava/lang/Iterable;

    .line 28
    .line 29
    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->O0(Ljava/lang/Iterable;)Ljava/util/LinkedHashSet;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    invoke-interface {v0, p2}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 34
    .line 35
    .line 36
    move-result v2

    .line 37
    if-eqz v2, :cond_1

    .line 38
    .line 39
    invoke-interface {v0, p2}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    .line 40
    .line 41
    .line 42
    goto :goto_0

    .line 43
    :cond_1
    invoke-interface {p0}, La/rkr0;->r()La/lmr0;

    .line 44
    .line 45
    .line 46
    move-result-object v2

    .line 47
    iget-object v2, v2, La/lmr0;->c:La/ulr0;

    .line 48
    .line 49
    sget-object v3, La/ulr0;->h:La/ulr0;

    .line 50
    .line 51
    if-ne v2, v3, :cond_2

    .line 52
    .line 53
    invoke-interface {v0}, Ljava/util/Set;->clear()V

    .line 54
    .line 55
    .line 56
    :cond_2
    invoke-interface {v0, p2}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 57
    .line 58
    .line 59
    :goto_0
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    .line 60
    .line 61
    .line 62
    move-result p2

    .line 63
    if-nez p2, :cond_3

    .line 64
    .line 65
    new-instance p2, Ljava/lang/Integer;

    .line 66
    .line 67
    invoke-direct {p2, p1}, Ljava/lang/Integer;-><init>(I)V

    .line 68
    .line 69
    .line 70
    invoke-interface {v1, p2, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    goto :goto_1

    .line 74
    :cond_3
    new-instance p2, Ljava/lang/Integer;

    .line 75
    .line 76
    invoke-direct {p2, p1}, Ljava/lang/Integer;-><init>(I)V

    .line 77
    .line 78
    .line 79
    invoke-interface {v1, p2}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 80
    .line 81
    .line 82
    :goto_1
    invoke-interface {p0, v1, p3}, La/rkr0;->n(Ljava/util/HashMap;La/bnn0;)Ljava/lang/Object;

    .line 83
    .line 84
    .line 85
    move-result-object p0

    .line 86
    sget-object p1, La/wne;->a:La/wne;

    .line 87
    .line 88
    if-ne p0, p1, :cond_4

    .line 89
    .line 90
    return-object p0

    .line 91
    :cond_4
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 92
    .line 93
    return-object p0
.end method

.method public d(La/uaq0;)Ljava/util/ArrayList;
    .locals 9

    .line 1
    iget-object p0, p0, La/w4p0;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, La/x4p0;

    .line 4
    .line 5
    sget-object v0, La/x4p0;->d:Ljava/util/List;

    .line 6
    .line 7
    new-instance v1, Ljava/util/ArrayList;

    .line 8
    .line 9
    const/16 v2, 0xa

    .line 10
    .line 11
    invoke-static {v0, v2}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 12
    .line 13
    .line 14
    move-result v2

    .line 15
    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 16
    .line 17
    .line 18
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 23
    .line 24
    .line 25
    move-result v2

    .line 26
    if-eqz v2, :cond_7

    .line 27
    .line 28
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object v2

    .line 32
    check-cast v2, La/v4p0;

    .line 33
    .line 34
    iget-object v3, p0, La/x4p0;->c:La/knf0;

    .line 35
    .line 36
    invoke-virtual {v3}, La/knf0;->c()Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object v3

    .line 40
    const-string v4, "ru"

    .line 41
    .line 42
    const/4 v5, 0x0

    .line 43
    invoke-static {v3, v4, v5}, Lkotlin/text/StringsKt;->O(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 44
    .line 45
    .line 46
    move-result v3

    .line 47
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 48
    .line 49
    .line 50
    new-instance v4, La/r4p0;

    .line 51
    .line 52
    if-eqz v3, :cond_0

    .line 53
    .line 54
    const-string v3, "/ru/"

    .line 55
    .line 56
    goto :goto_1

    .line 57
    :cond_0
    const-string v3, "/en/"

    .line 58
    .line 59
    :goto_1
    sget-object v5, La/u4p0;->a:La/u4p0;

    .line 60
    .line 61
    invoke-virtual {v2, v5}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 62
    .line 63
    .line 64
    move-result v5

    .line 65
    if-eqz v5, :cond_1

    .line 66
    .line 67
    const-string v5, "1"

    .line 68
    .line 69
    goto :goto_2

    .line 70
    :cond_1
    sget-object v5, La/t4p0;->a:La/t4p0;

    .line 71
    .line 72
    invoke-virtual {v2, v5}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 73
    .line 74
    .line 75
    move-result v5

    .line 76
    if-eqz v5, :cond_2

    .line 77
    .line 78
    const-string v5, "2"

    .line 79
    .line 80
    goto :goto_2

    .line 81
    :cond_2
    sget-object v5, La/s4p0;->a:La/s4p0;

    .line 82
    .line 83
    invoke-virtual {v2, v5}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 84
    .line 85
    .line 86
    move-result v5

    .line 87
    if-eqz v5, :cond_6

    .line 88
    .line 89
    const-string v5, "3"

    .line 90
    .line 91
    :goto_2
    sget-object v6, La/uaq0;->a:La/s9m0;

    .line 92
    .line 93
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 94
    .line 95
    .line 96
    invoke-static {p1}, La/s9m0;->j(La/uaq0;)Z

    .line 97
    .line 98
    .line 99
    move-result v6

    .line 100
    const-string v7, "_l"

    .line 101
    .line 102
    if-eqz v6, :cond_3

    .line 103
    .line 104
    goto :goto_3

    .line 105
    :cond_3
    invoke-static {p1}, La/s9m0;->i(La/uaq0;)Z

    .line 106
    .line 107
    .line 108
    move-result v6

    .line 109
    if-eqz v6, :cond_4

    .line 110
    .line 111
    const-string v7, "_d"

    .line 112
    .line 113
    goto :goto_3

    .line 114
    :cond_4
    invoke-static {p1}, La/s9m0;->k(La/uaq0;)Z

    .line 115
    .line 116
    .line 117
    move-result v6

    .line 118
    if-eqz v6, :cond_5

    .line 119
    .line 120
    const-string v7, "_n"

    .line 121
    .line 122
    :cond_5
    :goto_3
    const-string v6, "static/img/android/instructions/teambet"

    .line 123
    .line 124
    const-string v8, ".webp"

    .line 125
    .line 126
    invoke-static {v6, v3, v5, v7, v8}, La/b1j;->k(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 127
    .line 128
    .line 129
    move-result-object v3

    .line 130
    invoke-direct {v4, v2, v3}, La/r4p0;-><init>(La/v4p0;Ljava/lang/String;)V

    .line 131
    .line 132
    .line 133
    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 134
    .line 135
    .line 136
    goto :goto_0

    .line 137
    :cond_6
    invoke-static {}, La/t9f;->b()V

    .line 138
    .line 139
    .line 140
    const/4 p0, 0x0

    .line 141
    return-object p0

    .line 142
    :cond_7
    return-object v1
.end method

.method public e(Landroid/view/View;)Z
    .locals 2

    .line 1
    check-cast p1, Landroidx/viewpager2/widget/ViewPager2;

    .line 2
    .line 3
    iget-object p0, p0, La/w4p0;->b:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast p0, La/fht0;

    .line 6
    .line 7
    invoke-virtual {p1}, Landroidx/viewpager2/widget/ViewPager2;->getCurrentItem()I

    .line 8
    .line 9
    .line 10
    move-result p1

    .line 11
    const/4 v0, 0x1

    .line 12
    add-int/2addr p1, v0

    .line 13
    iget-object p0, p0, La/fht0;->d:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast p0, Landroidx/viewpager2/widget/ViewPager2;

    .line 16
    .line 17
    iget-boolean v1, p0, Landroidx/viewpager2/widget/ViewPager2;->r:Z

    .line 18
    .line 19
    if-eqz v1, :cond_0

    .line 20
    .line 21
    invoke-virtual {p0, p1, v0}, Landroidx/viewpager2/widget/ViewPager2;->f(IZ)V

    .line 22
    .line 23
    .line 24
    :cond_0
    return v0
.end method

.method public f(J)V
    .locals 0

    .line 1
    iget-object p0, p0, La/w4p0;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, La/zn00;

    .line 4
    .line 5
    iget-object p0, p0, La/zn00;->b:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast p0, La/tfh0;

    .line 8
    .line 9
    iget-object p0, p0, La/tfh0;->a:La/p7m0;

    .line 10
    .line 11
    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    const/4 p2, 0x0

    .line 16
    invoke-virtual {p0, p2, p1}, La/p7m0;->o(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 17
    .line 18
    .line 19
    return-void
.end method

.method public g(Landroid/app/Activity;)La/gmq;
    .locals 2

    .line 1
    new-instance v0, La/npu0;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, p0, p1, v1}, La/npu0;-><init>(La/w4p0;Landroid/app/Activity;La/yje;)V

    .line 5
    .line 6
    .line 7
    invoke-static {v0}, La/nkb;->y(Lkotlin/jvm/functions/Function2;)La/bq9;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    sget-object p1, La/tvk;->a:La/rwj;

    .line 12
    .line 13
    sget-object p1, La/ys10;->a:La/vs10;

    .line 14
    .line 15
    invoke-static {p0, p1}, La/ulb;->L(La/gmq;Lkotlin/coroutines/CoroutineContext;)La/gmq;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    return-object p0
.end method

.method public get(I)La/xkq;
    .locals 0

    .line 1
    iget-object p0, p0, La/w4p0;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, La/mlq;

    .line 4
    .line 5
    return-object p0
.end method

.method public zzb(Ljava/lang/Class;)Z
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    move v1, v0

    .line 3
    :goto_0
    const/4 v2, 0x2

    .line 4
    if-ge v1, v2, :cond_1

    .line 5
    .line 6
    iget-object v2, p0, La/w4p0;->b:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v2, [La/qfw0;

    .line 9
    .line 10
    aget-object v2, v2, v1

    .line 11
    .line 12
    invoke-interface {v2, p1}, La/qfw0;->zzb(Ljava/lang/Class;)Z

    .line 13
    .line 14
    .line 15
    move-result v2

    .line 16
    if-eqz v2, :cond_0

    .line 17
    .line 18
    const/4 p0, 0x1

    .line 19
    return p0

    .line 20
    :cond_0
    add-int/lit8 v1, v1, 0x1

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_1
    return v0
.end method

.method public zzc(Ljava/lang/Class;)La/cgw0;
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    :goto_0
    const/4 v1, 0x2

    .line 3
    if-ge v0, v1, :cond_1

    .line 4
    .line 5
    iget-object v1, p0, La/w4p0;->b:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v1, [La/qfw0;

    .line 8
    .line 9
    aget-object v1, v1, v0

    .line 10
    .line 11
    invoke-interface {v1, p1}, La/qfw0;->zzb(Ljava/lang/Class;)Z

    .line 12
    .line 13
    .line 14
    move-result v2

    .line 15
    if-eqz v2, :cond_0

    .line 16
    .line 17
    invoke-interface {v1, p1}, La/qfw0;->zzc(Ljava/lang/Class;)La/cgw0;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    return-object p0

    .line 22
    :cond_0
    add-int/lit8 v0, v0, 0x1

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_1
    invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    const-string p1, "No factory is available for message type: "

    .line 30
    .line 31
    invoke-virtual {p1, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    invoke-static {p0}, La/v4i0;->p(Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    const/4 p0, 0x0

    .line 39
    return-object p0
.end method
