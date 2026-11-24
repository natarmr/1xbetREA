.class public final synthetic La/ybb0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/ccb0;


# direct methods
.method public synthetic constructor <init>(La/ccb0;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/ybb0;->a:B

    iput-object p1, p0, La/ybb0;->b:La/ccb0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    .line 1
    iget-byte v0, p0, La/ybb0;->a:B

    .line 2
    .line 3
    iget-object p0, p0, La/ybb0;->b:La/ccb0;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    check-cast p1, La/hdb0;

    .line 9
    .line 10
    sget-object v0, La/ccb0;->X1:La/mi70;

    .line 11
    .line 12
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    invoke-virtual {p0}, La/ccb0;->I0()La/k3t0;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    new-instance v0, La/cya0;

    .line 20
    .line 21
    invoke-direct {v0, p1}, La/cya0;-><init>(La/hdb0;)V

    .line 22
    .line 23
    .line 24
    invoke-virtual {p0, v0}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 25
    .line 26
    .line 27
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 28
    .line 29
    return-object p0

    .line 30
    :pswitch_0
    check-cast p1, La/lwk;

    .line 31
    .line 32
    sget-object v0, La/ccb0;->X1:La/mi70;

    .line 33
    .line 34
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 35
    .line 36
    .line 37
    new-instance p1, La/xbb0;

    .line 38
    .line 39
    const/16 v0, 0xb

    .line 40
    .line 41
    invoke-direct {p1, p0, v0}, La/xbb0;-><init>(La/ccb0;B)V

    .line 42
    .line 43
    .line 44
    const-string v0, "REQUEST_SUCCESS_AUTHENTICATOR_DIALOG_KEY"

    .line 45
    .line 46
    invoke-static {p0, v0, p1}, La/ccq0;->V(Landroidx/fragment/app/Fragment;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V

    .line 47
    .line 48
    .line 49
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->F()Landroidx/fragment/app/e;

    .line 50
    .line 51
    .line 52
    move-result-object p1

    .line 53
    new-instance v0, La/zbb0;

    .line 54
    .line 55
    const/4 v1, 0x1

    .line 56
    invoke-direct {v0, p0, v1}, La/zbb0;-><init>(La/ccb0;B)V

    .line 57
    .line 58
    .line 59
    const-string v2, "RESET_HASH_SECRET_KEY"

    .line 60
    .line 61
    invoke-virtual {p1, v2, p0, v0}, Landroidx/fragment/app/e;->u0(Ljava/lang/String;La/clz;La/k4r;)V

    .line 62
    .line 63
    .line 64
    new-instance p1, La/xbb0;

    .line 65
    .line 66
    const/4 v0, 0x6

    .line 67
    invoke-direct {p1, p0, v0}, La/xbb0;-><init>(La/ccb0;B)V

    .line 68
    .line 69
    .line 70
    const-string v0, "ADD_ADDITIONAL_EVENTS_TO_COUPON_DIALOG_REQUEST__KEY"

    .line 71
    .line 72
    invoke-static {p0, v0, p1}, La/ccq0;->T(Landroidx/fragment/app/Fragment;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V

    .line 73
    .line 74
    .line 75
    new-instance p1, La/xbb0;

    .line 76
    .line 77
    const/16 v0, 0xc

    .line 78
    .line 79
    invoke-direct {p1, p0, v0}, La/xbb0;-><init>(La/ccb0;B)V

    .line 80
    .line 81
    .line 82
    const-string v0, "SWITCH_ON_NOTIFICATION_INFO_DIALOG_REQUEST_KEY"

    .line 83
    .line 84
    invoke-static {p0, v0, p1}, La/ccq0;->V(Landroidx/fragment/app/Fragment;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V

    .line 85
    .line 86
    .line 87
    new-instance p1, La/xbb0;

    .line 88
    .line 89
    const/4 v0, 0x7

    .line 90
    invoke-direct {p1, p0, v0}, La/xbb0;-><init>(La/ccb0;B)V

    .line 91
    .line 92
    .line 93
    const-string v0, "KEY_2FA_ALERT"

    .line 94
    .line 95
    invoke-static {p0, v0, p1}, La/ccq0;->V(Landroidx/fragment/app/Fragment;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V

    .line 96
    .line 97
    .line 98
    new-instance p1, La/xbb0;

    .line 99
    .line 100
    const/16 v0, 0x8

    .line 101
    .line 102
    invoke-direct {p1, p0, v0}, La/xbb0;-><init>(La/ccb0;B)V

    .line 103
    .line 104
    .line 105
    const-string v0, "KZ_IDENTIFICATION_ALERT_REQUEST_KEY"

    .line 106
    .line 107
    invoke-static {p0, v0, p1}, La/ccq0;->V(Landroidx/fragment/app/Fragment;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V

    .line 108
    .line 109
    .line 110
    new-instance p1, La/xbb0;

    .line 111
    .line 112
    const/16 v2, 0x9

    .line 113
    .line 114
    invoke-direct {p1, p0, v2}, La/xbb0;-><init>(La/ccb0;B)V

    .line 115
    .line 116
    .line 117
    invoke-static {p0, v0, p1}, La/ccq0;->T(Landroidx/fragment/app/Fragment;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V

    .line 118
    .line 119
    .line 120
    invoke-virtual {p0}, La/ccb0;->I0()La/k3t0;

    .line 121
    .line 122
    .line 123
    move-result-object p1

    .line 124
    new-instance v0, La/hxa0;

    .line 125
    .line 126
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->n0()La/kxq;

    .line 127
    .line 128
    .line 129
    move-result-object v2

    .line 130
    invoke-virtual {v2}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    .line 131
    .line 132
    .line 133
    move-result-object v2

    .line 134
    invoke-virtual {v2}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    .line 135
    .line 136
    .line 137
    move-result-object v3

    .line 138
    const/4 v4, 0x0

    .line 139
    if-eqz v3, :cond_1

    .line 140
    .line 141
    const-string v5, "REQUEST_SECTION_FROM_WIDGET"

    .line 142
    .line 143
    invoke-virtual {v3, v5}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    .line 144
    .line 145
    .line 146
    move-result v5

    .line 147
    if-nez v5, :cond_0

    .line 148
    .line 149
    const-string v5, "af_consumed"

    .line 150
    .line 151
    invoke-virtual {v3, v5}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    .line 152
    .line 153
    .line 154
    move-result v5

    .line 155
    if-nez v5, :cond_0

    .line 156
    .line 157
    const-string v5, "REQUEST_WIDGET_SETTINGS"

    .line 158
    .line 159
    invoke-virtual {v3, v5}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    .line 160
    .line 161
    .line 162
    move-result v3

    .line 163
    if-eqz v3, :cond_1

    .line 164
    .line 165
    :cond_0
    move v3, v1

    .line 166
    goto :goto_0

    .line 167
    :cond_1
    move v3, v4

    .line 168
    :goto_0
    sget-object v5, La/csj0;->h:La/c0o;

    .line 169
    .line 170
    if-eqz v5, :cond_3

    .line 171
    .line 172
    invoke-virtual {v5}, La/u1;->isEmpty()Z

    .line 173
    .line 174
    .line 175
    move-result v6

    .line 176
    if-eqz v6, :cond_3

    .line 177
    .line 178
    :cond_2
    move v5, v4

    .line 179
    goto :goto_1

    .line 180
    :cond_3
    invoke-virtual {v5}, La/b3;->iterator()Ljava/util/Iterator;

    .line 181
    .line 182
    .line 183
    move-result-object v5

    .line 184
    :cond_4
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 185
    .line 186
    .line 187
    move-result v6

    .line 188
    if-eqz v6, :cond_2

    .line 189
    .line 190
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 191
    .line 192
    .line 193
    move-result-object v6

    .line 194
    check-cast v6, La/csj0;

    .line 195
    .line 196
    invoke-virtual {v2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    .line 197
    .line 198
    .line 199
    move-result-object v7

    .line 200
    invoke-virtual {v6}, La/csj0;->a()Ljava/lang/String;

    .line 201
    .line 202
    .line 203
    move-result-object v6

    .line 204
    invoke-static {v7, v6}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 205
    .line 206
    .line 207
    move-result v6

    .line 208
    if-eqz v6, :cond_4

    .line 209
    .line 210
    move v5, v1

    .line 211
    :goto_1
    const-string v6, "PUSH_INTENT"

    .line 212
    .line 213
    invoke-virtual {v2, v6}, Landroid/content/Intent;->hasCategory(Ljava/lang/String;)Z

    .line 214
    .line 215
    .line 216
    move-result v6

    .line 217
    const-string v7, "CUSTOM_INTENT"

    .line 218
    .line 219
    invoke-virtual {v2, v7}, Landroid/content/Intent;->hasCategory(Ljava/lang/String;)Z

    .line 220
    .line 221
    .line 222
    move-result v7

    .line 223
    if-nez v7, :cond_5

    .line 224
    .line 225
    if-nez v3, :cond_5

    .line 226
    .line 227
    if-nez v5, :cond_5

    .line 228
    .line 229
    if-nez v6, :cond_5

    .line 230
    .line 231
    invoke-virtual {v2}, Landroid/content/Intent;->getData()Landroid/net/Uri;

    .line 232
    .line 233
    .line 234
    move-result-object v2

    .line 235
    if-nez v2, :cond_5

    .line 236
    .line 237
    goto :goto_2

    .line 238
    :cond_5
    move v1, v4

    .line 239
    :goto_2
    invoke-direct {v0, v1}, La/hxa0;-><init>(Z)V

    .line 240
    .line 241
    .line 242
    invoke-virtual {p1, v0}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 243
    .line 244
    .line 245
    invoke-virtual {p0}, La/ccb0;->H0()La/wdk0;

    .line 246
    .line 247
    .line 248
    move-result-object p1

    .line 249
    iget-boolean v0, p0, La/ccb0;->R1:Z

    .line 250
    .line 251
    invoke-static {p1, p0, v0}, La/wdk0;->l(La/wdk0;Landroidx/fragment/app/Fragment;Z)V

    .line 252
    .line 253
    .line 254
    new-instance p1, La/ty2;

    .line 255
    .line 256
    const/16 v0, 0x13

    .line 257
    .line 258
    invoke-direct {p1, p0, v0}, La/ty2;-><init>(Ljava/lang/Object;B)V

    .line 259
    .line 260
    .line 261
    return-object p1

    .line 262
    :pswitch_1
    check-cast p1, Ljava/lang/Integer;

    .line 263
    .line 264
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 265
    .line 266
    .line 267
    move-result p1

    .line 268
    sget-object v0, La/ccb0;->X1:La/mi70;

    .line 269
    .line 270
    invoke-virtual {p0}, La/ccb0;->I0()La/k3t0;

    .line 271
    .line 272
    .line 273
    move-result-object p0

    .line 274
    new-instance v0, La/hya0;

    .line 275
    .line 276
    invoke-direct {v0, p1}, La/hya0;-><init>(I)V

    .line 277
    .line 278
    .line 279
    invoke-virtual {p0, v0}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 280
    .line 281
    .line 282
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 283
    .line 284
    return-object p0

    .line 285
    :pswitch_2
    check-cast p1, Ljava/lang/Integer;

    .line 286
    .line 287
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 288
    .line 289
    .line 290
    move-result p1

    .line 291
    sget-object v0, La/ccb0;->X1:La/mi70;

    .line 292
    .line 293
    invoke-virtual {p0}, La/ccb0;->I0()La/k3t0;

    .line 294
    .line 295
    .line 296
    move-result-object p0

    .line 297
    new-instance v0, La/hya0;

    .line 298
    .line 299
    invoke-direct {v0, p1}, La/hya0;-><init>(I)V

    .line 300
    .line 301
    .line 302
    invoke-virtual {p0, v0}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 303
    .line 304
    .line 305
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 306
    .line 307
    return-object p0

    .line 308
    :pswitch_3
    check-cast p1, La/ylb0;

    .line 309
    .line 310
    sget-object v0, La/ccb0;->X1:La/mi70;

    .line 311
    .line 312
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 313
    .line 314
    .line 315
    invoke-virtual {p0}, La/ccb0;->I0()La/k3t0;

    .line 316
    .line 317
    .line 318
    move-result-object p0

    .line 319
    new-instance v0, La/eya0;

    .line 320
    .line 321
    invoke-direct {v0, p1}, La/eya0;-><init>(La/ylb0;)V

    .line 322
    .line 323
    .line 324
    invoke-virtual {p0, v0}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 325
    .line 326
    .line 327
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 328
    .line 329
    return-object p0

    .line 330
    nop

    .line 331
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
