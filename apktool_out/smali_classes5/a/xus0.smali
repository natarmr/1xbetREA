.class public final synthetic La/xus0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/dvs0;


# direct methods
.method public synthetic constructor <init>(La/dvs0;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/xus0;->a:B

    iput-object p1, p0, La/xus0;->b:La/dvs0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 12

    .line 1
    iget-byte v0, p0, La/xus0;->a:B

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    iget-object v2, p0, La/xus0;->b:La/dvs0;

    .line 5
    .line 6
    packed-switch v0, :pswitch_data_0

    .line 7
    .line 8
    .line 9
    sget-object v0, La/dvs0;->Q1:La/g9m0;

    .line 10
    .line 11
    iget-object v3, p0, La/xus0;->b:La/dvs0;

    .line 12
    .line 13
    iget-object p0, v3, La/dvs0;->N1:La/a8z;

    .line 14
    .line 15
    invoke-interface {p0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    check-cast p0, La/kyi;

    .line 20
    .line 21
    iget-object p0, p0, La/kyi;->a:La/sd60;

    .line 22
    .line 23
    iget-object p0, p0, La/sd60;->h:Ljava/lang/Object;

    .line 24
    .line 25
    move-object v1, p0

    .line 26
    check-cast v1, La/wdk0;

    .line 27
    .line 28
    invoke-static {v1}, La/x1x;->y(Ljava/lang/Object;)V

    .line 29
    .line 30
    .line 31
    new-instance v2, La/xdk0;

    .line 32
    .line 33
    sget-object v5, La/rek0;->b:La/rek0;

    .line 34
    .line 35
    const p0, 0x7f130dca

    .line 36
    .line 37
    .line 38
    invoke-virtual {v3, p0}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object v6

    .line 42
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 43
    .line 44
    .line 45
    const/4 v10, 0x0

    .line 46
    const/16 v11, 0x7c

    .line 47
    .line 48
    const/4 v7, 0x0

    .line 49
    const/4 v8, 0x0

    .line 50
    const/4 v9, 0x0

    .line 51
    move-object v4, v2

    .line 52
    invoke-direct/range {v4 .. v11}, La/xdk0;-><init>(La/sek0;Ljava/lang/String;Ljava/lang/String;La/idk0;La/kdk0;Ljava/lang/Integer;I)V

    .line 53
    .line 54
    .line 55
    const/16 v8, 0x3fc

    .line 56
    .line 57
    const/4 v4, 0x0

    .line 58
    const/4 v5, 0x0

    .line 59
    const/4 v6, 0x0

    .line 60
    invoke-static/range {v1 .. v8}, La/wdk0;->k(La/wdk0;La/xdk0;Landroidx/fragment/app/Fragment;Landroid/view/Window;Landroid/view/View;ZLjava/lang/Integer;I)La/ndk0;

    .line 61
    .line 62
    .line 63
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 64
    .line 65
    return-object p0

    .line 66
    :pswitch_0
    sget-object p0, La/dvs0;->Q1:La/g9m0;

    .line 67
    .line 68
    iget-object p0, v2, La/dvs0;->N1:La/a8z;

    .line 69
    .line 70
    invoke-interface {p0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    move-result-object p0

    .line 74
    check-cast p0, La/kyi;

    .line 75
    .line 76
    iget-object p0, p0, La/kyi;->d:La/n5d0;

    .line 77
    .line 78
    invoke-interface {p0}, La/o5d0;->get()Ljava/lang/Object;

    .line 79
    .line 80
    .line 81
    move-result-object p0

    .line 82
    check-cast p0, La/jyi;

    .line 83
    .line 84
    return-object p0

    .line 85
    :pswitch_1
    sget-object p0, La/dvs0;->Q1:La/g9m0;

    .line 86
    .line 87
    invoke-virtual {v2}, Landroidx/fragment/app/Fragment;->n0()La/kxq;

    .line 88
    .line 89
    .line 90
    move-result-object p0

    .line 91
    invoke-virtual {p0}, Landroid/app/Activity;->getApplication()Landroid/app/Application;

    .line 92
    .line 93
    .line 94
    move-result-object p0

    .line 95
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 96
    .line 97
    .line 98
    instance-of v0, p0, La/af3;

    .line 99
    .line 100
    if-eqz v0, :cond_0

    .line 101
    .line 102
    check-cast p0, La/af3;

    .line 103
    .line 104
    goto :goto_0

    .line 105
    :cond_0
    move-object p0, v1

    .line 106
    :goto_0
    const-class v0, La/evs0;

    .line 107
    .line 108
    if-eqz p0, :cond_3

    .line 109
    .line 110
    invoke-interface {p0}, La/af3;->d()La/wcf0;

    .line 111
    .line 112
    .line 113
    move-result-object p0

    .line 114
    invoke-virtual {p0, v0}, La/wcf0;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 115
    .line 116
    .line 117
    move-result-object p0

    .line 118
    check-cast p0, La/o5d0;

    .line 119
    .line 120
    if-eqz p0, :cond_1

    .line 121
    .line 122
    invoke-interface {p0}, La/o5d0;->get()Ljava/lang/Object;

    .line 123
    .line 124
    .line 125
    move-result-object p0

    .line 126
    check-cast p0, La/ze3;

    .line 127
    .line 128
    goto :goto_1

    .line 129
    :cond_1
    move-object p0, v1

    .line 130
    :goto_1
    instance-of v3, p0, La/evs0;

    .line 131
    .line 132
    if-nez v3, :cond_2

    .line 133
    .line 134
    move-object p0, v1

    .line 135
    :cond_2
    check-cast p0, La/evs0;

    .line 136
    .line 137
    if-eqz p0, :cond_3

    .line 138
    .line 139
    invoke-static {v2}, La/a4n0;->f(Landroidx/fragment/app/Fragment;)La/i1w0;

    .line 140
    .line 141
    .line 142
    move-result-object v0

    .line 143
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 144
    .line 145
    .line 146
    iget-object v1, p0, La/evs0;->a:La/sd60;

    .line 147
    .line 148
    iget-object p0, p0, La/evs0;->b:La/ok50;

    .line 149
    .line 150
    new-instance v2, La/kyi;

    .line 151
    .line 152
    invoke-direct {v2, v1, p0, v0}, La/kyi;-><init>(La/sd60;La/ok50;La/i1w0;)V

    .line 153
    .line 154
    .line 155
    move-object v1, v2

    .line 156
    goto :goto_2

    .line 157
    :cond_3
    const-string p0, "Cannot create dependency "

    .line 158
    .line 159
    invoke-static {v0, p0}, La/b1j;->i(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/String;

    .line 160
    .line 161
    .line 162
    move-result-object p0

    .line 163
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 164
    .line 165
    .line 166
    :goto_2
    return-object v1

    .line 167
    :pswitch_2
    sget-object p0, La/dvs0;->Q1:La/g9m0;

    .line 168
    .line 169
    invoke-virtual {v2}, La/dvs0;->H0()La/dws0;

    .line 170
    .line 171
    .line 172
    move-result-object v5

    .line 173
    iget-object p0, v5, La/dws0;->i:La/p7m0;

    .line 174
    .line 175
    invoke-virtual {p0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 176
    .line 177
    .line 178
    move-result-object p0

    .line 179
    check-cast p0, La/bws0;

    .line 180
    .line 181
    iget-boolean p0, p0, La/bws0;->f:Z

    .line 182
    .line 183
    if-nez p0, :cond_4

    .line 184
    .line 185
    iget-object p0, v5, La/dws0;->j:La/ol60;

    .line 186
    .line 187
    sget-object v0, La/uvs0;->a:La/uvs0;

    .line 188
    .line 189
    invoke-virtual {p0, v0}, La/ol60;->f(Ljava/lang/Object;)V

    .line 190
    .line 191
    .line 192
    goto :goto_3

    .line 193
    :cond_4
    iget-object p0, v5, La/dws0;->k:La/bby;

    .line 194
    .line 195
    if-eqz p0, :cond_5

    .line 196
    .line 197
    invoke-interface {p0}, La/bby;->isActive()Z

    .line 198
    .line 199
    .line 200
    move-result p0

    .line 201
    const/4 v0, 0x1

    .line 202
    if-ne p0, v0, :cond_5

    .line 203
    .line 204
    goto :goto_3

    .line 205
    :cond_5
    invoke-static {v5}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 206
    .line 207
    .line 208
    move-result-object p0

    .line 209
    new-instance v3, La/las0;

    .line 210
    .line 211
    const/4 v9, 0x0

    .line 212
    const/4 v10, 0x7

    .line 213
    const/4 v4, 0x1

    .line 214
    const-class v6, La/dws0;

    .line 215
    .line 216
    const-string v7, "onError"

    .line 217
    .line 218
    const-string v8, "onError(Ljava/lang/Throwable;)V"

    .line 219
    .line 220
    invoke-direct/range {v3 .. v10}, La/las0;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 221
    .line 222
    .line 223
    iget-object v0, v5, La/dws0;->b:La/mne;

    .line 224
    .line 225
    iget-object v9, v0, La/mne;->b:La/dvj;

    .line 226
    .line 227
    new-instance v8, La/qir0;

    .line 228
    .line 229
    const/16 v0, 0x18

    .line 230
    .line 231
    invoke-direct {v8, v5, v0}, La/qir0;-><init>(Ljava/lang/Object;B)V

    .line 232
    .line 233
    .line 234
    new-instance v10, La/cws0;

    .line 235
    .line 236
    const/4 v0, 0x0

    .line 237
    invoke-direct {v10, v5, v1, v0}, La/cws0;-><init>(La/dws0;La/yje;B)V

    .line 238
    .line 239
    .line 240
    const/16 v11, 0x8

    .line 241
    .line 242
    move-object v6, p0

    .line 243
    move-object v7, v3

    .line 244
    invoke-static/range {v6 .. v11}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 245
    .line 246
    .line 247
    move-result-object p0

    .line 248
    iput-object p0, v5, La/dws0;->k:La/bby;

    .line 249
    .line 250
    :goto_3
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 251
    .line 252
    return-object p0

    .line 253
    :pswitch_3
    sget-object p0, La/dvs0;->Q1:La/g9m0;

    .line 254
    .line 255
    invoke-virtual {v2}, La/dvs0;->H0()La/dws0;

    .line 256
    .line 257
    .line 258
    move-result-object p0

    .line 259
    invoke-virtual {v2}, Landroidx/fragment/app/Fragment;->D()Landroid/content/Context;

    .line 260
    .line 261
    .line 262
    move-result-object v0

    .line 263
    const-string v1, "com.google.android.apps.authenticator2"

    .line 264
    .line 265
    invoke-static {v0, v1}, La/v3c;->R(Landroid/content/Context;Ljava/lang/String;)Z

    .line 266
    .line 267
    .line 268
    move-result v0

    .line 269
    if-eqz v0, :cond_6

    .line 270
    .line 271
    sget-object v0, La/vvs0;->a:La/vvs0;

    .line 272
    .line 273
    goto :goto_4

    .line 274
    :cond_6
    sget-object v0, La/wvs0;->a:La/wvs0;

    .line 275
    .line 276
    :goto_4
    iget-object p0, p0, La/dws0;->j:La/ol60;

    .line 277
    .line 278
    invoke-virtual {p0, v0}, La/ol60;->f(Ljava/lang/Object;)V

    .line 279
    .line 280
    .line 281
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 282
    .line 283
    return-object p0

    .line 284
    :pswitch_4
    sget-object p0, La/dvs0;->Q1:La/g9m0;

    .line 285
    .line 286
    invoke-virtual {v2}, La/dvs0;->H0()La/dws0;

    .line 287
    .line 288
    .line 289
    move-result-object p0

    .line 290
    iget-object p0, p0, La/dws0;->j:La/ol60;

    .line 291
    .line 292
    new-instance v0, La/xvs0;

    .line 293
    .line 294
    sget-object v1, La/mvs0;->a:La/mvs0;

    .line 295
    .line 296
    invoke-direct {v0, v1}, La/xvs0;-><init>(La/rvs0;)V

    .line 297
    .line 298
    .line 299
    invoke-virtual {p0, v0}, La/ol60;->f(Ljava/lang/Object;)V

    .line 300
    .line 301
    .line 302
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 303
    .line 304
    return-object p0

    .line 305
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
