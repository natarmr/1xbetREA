.class public final synthetic La/zk3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:Lorg/xplatform/app_update/impl/presentation/apk_service/AppUpdateDownloadApkService;


# direct methods
.method public synthetic constructor <init>(Lorg/xplatform/app_update/impl/presentation/apk_service/AppUpdateDownloadApkService;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/zk3;->a:B

    iput-object p1, p0, La/zk3;->b:Lorg/xplatform/app_update/impl/presentation/apk_service/AppUpdateDownloadApkService;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 12

    .line 1
    iget-byte v0, p0, La/zk3;->a:B

    .line 2
    .line 3
    iget-object p0, p0, La/zk3;->b:Lorg/xplatform/app_update/impl/presentation/apk_service/AppUpdateDownloadApkService;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    sget v0, Lorg/xplatform/app_update/impl/presentation/apk_service/AppUpdateDownloadApkService;->g:I

    .line 9
    .line 10
    new-instance v0, La/al3;

    .line 11
    .line 12
    invoke-direct {v0, p0}, La/al3;-><init>(Lorg/xplatform/app_update/impl/presentation/apk_service/AppUpdateDownloadApkService;)V

    .line 13
    .line 14
    .line 15
    return-object v0

    .line 16
    :pswitch_0
    iget-object p0, p0, Lorg/xplatform/app_update/impl/presentation/apk_service/AppUpdateDownloadApkService;->d:La/n0o0;

    .line 17
    .line 18
    invoke-virtual {p0}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    check-cast p0, La/o8i;

    .line 23
    .line 24
    new-instance v0, La/gl3;

    .line 25
    .line 26
    new-instance v1, La/b8u;

    .line 27
    .line 28
    new-instance v2, La/jm3;

    .line 29
    .line 30
    iget-object v3, p0, La/o8i;->a:La/q7d0;

    .line 31
    .line 32
    iget-object v4, p0, La/o8i;->b:La/us3;

    .line 33
    .line 34
    const/4 v5, 0x0

    .line 35
    invoke-direct {v2, v3, v4, v5}, La/jm3;-><init>(La/q7d0;La/us3;B)V

    .line 36
    .line 37
    .line 38
    invoke-direct {v1, v2}, La/b8u;-><init>(Ljava/lang/Object;)V

    .line 39
    .line 40
    .line 41
    new-instance v2, La/f4u;

    .line 42
    .line 43
    new-instance v3, La/jm3;

    .line 44
    .line 45
    iget-object v6, p0, La/o8i;->a:La/q7d0;

    .line 46
    .line 47
    invoke-direct {v3, v6, v4, v5}, La/jm3;-><init>(La/q7d0;La/us3;B)V

    .line 48
    .line 49
    .line 50
    const/16 v4, 0x16

    .line 51
    .line 52
    invoke-direct {v2, v3, v4}, La/f4u;-><init>(Ljava/lang/Object;B)V

    .line 53
    .line 54
    .line 55
    iget-object v3, p0, La/o8i;->c:La/kl5;

    .line 56
    .line 57
    iget-object v4, p0, La/o8i;->d:La/cad;

    .line 58
    .line 59
    iget-object v4, v4, La/cad;->b:Ljava/lang/Object;

    .line 60
    .line 61
    check-cast v4, La/psc;

    .line 62
    .line 63
    invoke-virtual {v4}, La/psc;->h()La/mne;

    .line 64
    .line 65
    .line 66
    move-result-object v4

    .line 67
    invoke-static {v4}, La/x1x;->x(Ljava/lang/Object;)V

    .line 68
    .line 69
    .line 70
    new-instance v5, La/cl3;

    .line 71
    .line 72
    iget-object p0, p0, La/o8i;->e:La/esg0;

    .line 73
    .line 74
    invoke-virtual {p0}, La/esg0;->Q()La/mii0;

    .line 75
    .line 76
    .line 77
    move-result-object v6

    .line 78
    invoke-direct {v5, v6}, La/cl3;-><init>(La/mii0;)V

    .line 79
    .line 80
    .line 81
    new-instance v6, La/ani0;

    .line 82
    .line 83
    new-instance v7, La/prc;

    .line 84
    .line 85
    iget-object v8, p0, La/esg0;->a:Ljava/lang/Object;

    .line 86
    .line 87
    check-cast v8, La/dcl;

    .line 88
    .line 89
    invoke-direct {v7, v8}, La/prc;-><init>(La/dcl;)V

    .line 90
    .line 91
    .line 92
    invoke-direct {v6, v7}, La/ani0;-><init>(Ljava/lang/Object;)V

    .line 93
    .line 94
    .line 95
    new-instance v7, La/a7u;

    .line 96
    .line 97
    invoke-virtual {p0}, La/esg0;->Q()La/mii0;

    .line 98
    .line 99
    .line 100
    move-result-object v9

    .line 101
    invoke-direct {v7, v9}, La/a7u;-><init>(La/mii0;)V

    .line 102
    .line 103
    .line 104
    move-object v9, v8

    .line 105
    new-instance v8, La/cl3;

    .line 106
    .line 107
    invoke-virtual {p0}, La/esg0;->Q()La/mii0;

    .line 108
    .line 109
    .line 110
    move-result-object v10

    .line 111
    invoke-direct {v8, v10}, La/cl3;-><init>(La/mii0;)V

    .line 112
    .line 113
    .line 114
    move-object v10, v9

    .line 115
    new-instance v9, La/wsf0;

    .line 116
    .line 117
    new-instance v11, La/prc;

    .line 118
    .line 119
    invoke-direct {v11, v10}, La/prc;-><init>(La/dcl;)V

    .line 120
    .line 121
    .line 122
    const/16 v10, 0x19

    .line 123
    .line 124
    invoke-direct {v9, v11, v10}, La/wsf0;-><init>(Ljava/lang/Object;B)V

    .line 125
    .line 126
    .line 127
    new-instance v10, La/a7u;

    .line 128
    .line 129
    invoke-virtual {p0}, La/esg0;->Q()La/mii0;

    .line 130
    .line 131
    .line 132
    move-result-object v11

    .line 133
    invoke-direct {v10, v11}, La/a7u;-><init>(La/mii0;)V

    .line 134
    .line 135
    .line 136
    new-instance v11, La/zx10;

    .line 137
    .line 138
    invoke-virtual {p0}, La/esg0;->Q()La/mii0;

    .line 139
    .line 140
    .line 141
    move-result-object p0

    .line 142
    invoke-direct {v11, p0}, La/zx10;-><init>(Ljava/lang/Object;)V

    .line 143
    .line 144
    .line 145
    invoke-direct/range {v0 .. v11}, La/gl3;-><init>(La/b8u;La/f4u;La/kl5;La/mne;La/cl3;La/ani0;La/a7u;La/cl3;La/wsf0;La/a7u;La/zx10;)V

    .line 146
    .line 147
    .line 148
    return-object v0

    .line 149
    :pswitch_1
    sget v0, Lorg/xplatform/app_update/impl/presentation/apk_service/AppUpdateDownloadApkService;->g:I

    .line 150
    .line 151
    invoke-virtual {p0}, Landroid/app/Service;->getApplication()Landroid/app/Application;

    .line 152
    .line 153
    .line 154
    move-result-object v0

    .line 155
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 156
    .line 157
    .line 158
    instance-of v1, v0, La/af3;

    .line 159
    .line 160
    const/4 v2, 0x0

    .line 161
    if-eqz v1, :cond_0

    .line 162
    .line 163
    check-cast v0, La/af3;

    .line 164
    .line 165
    goto :goto_0

    .line 166
    :cond_0
    move-object v0, v2

    .line 167
    :goto_0
    const-class v1, La/hl3;

    .line 168
    .line 169
    if-eqz v0, :cond_3

    .line 170
    .line 171
    invoke-interface {v0}, La/af3;->d()La/wcf0;

    .line 172
    .line 173
    .line 174
    move-result-object v0

    .line 175
    invoke-virtual {v0, v1}, La/wcf0;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 176
    .line 177
    .line 178
    move-result-object v0

    .line 179
    check-cast v0, La/o5d0;

    .line 180
    .line 181
    if-eqz v0, :cond_1

    .line 182
    .line 183
    invoke-interface {v0}, La/o5d0;->get()Ljava/lang/Object;

    .line 184
    .line 185
    .line 186
    move-result-object v0

    .line 187
    check-cast v0, La/ze3;

    .line 188
    .line 189
    goto :goto_1

    .line 190
    :cond_1
    move-object v0, v2

    .line 191
    :goto_1
    instance-of v3, v0, La/hl3;

    .line 192
    .line 193
    if-nez v3, :cond_2

    .line 194
    .line 195
    move-object v0, v2

    .line 196
    :cond_2
    check-cast v0, La/hl3;

    .line 197
    .line 198
    if-eqz v0, :cond_3

    .line 199
    .line 200
    invoke-virtual {p0}, Landroid/app/Service;->getApplication()Landroid/app/Application;

    .line 201
    .line 202
    .line 203
    move-result-object p0

    .line 204
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 205
    .line 206
    .line 207
    invoke-static {p0}, La/y0x0;->J(Landroid/app/Application;)La/esg0;

    .line 208
    .line 209
    .line 210
    move-result-object v3

    .line 211
    iget-object v2, v0, La/hl3;->a:La/cad;

    .line 212
    .line 213
    iget-object p0, v0, La/hl3;->b:La/vwb0;

    .line 214
    .line 215
    iget-object v4, v0, La/hl3;->c:La/kl5;

    .line 216
    .line 217
    iget-object v5, v0, La/hl3;->d:La/q7d0;

    .line 218
    .line 219
    iget-object v6, v0, La/hl3;->e:La/us3;

    .line 220
    .line 221
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 222
    .line 223
    .line 224
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 225
    .line 226
    .line 227
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 228
    .line 229
    .line 230
    new-instance v1, La/o8i;

    .line 231
    .line 232
    invoke-direct/range {v1 .. v6}, La/o8i;-><init>(La/cad;La/esg0;La/kl5;La/q7d0;La/us3;)V

    .line 233
    .line 234
    .line 235
    move-object v2, v1

    .line 236
    goto :goto_2

    .line 237
    :cond_3
    const-string p0, "Cannot create dependency "

    .line 238
    .line 239
    invoke-static {v1, p0}, La/b1j;->i(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/String;

    .line 240
    .line 241
    .line 242
    move-result-object p0

    .line 243
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 244
    .line 245
    .line 246
    :goto_2
    return-object v2

    .line 247
    :pswitch_2
    sget v0, Lorg/xplatform/app_update/impl/presentation/apk_service/AppUpdateDownloadApkService;->g:I

    .line 248
    .line 249
    const-string v0, "notification"

    .line 250
    .line 251
    invoke-virtual {p0, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 252
    .line 253
    .line 254
    move-result-object p0

    .line 255
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 256
    .line 257
    .line 258
    check-cast p0, Landroid/app/NotificationManager;

    .line 259
    .line 260
    return-object p0

    .line 261
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
