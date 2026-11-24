.class public final synthetic La/avs0;
.super La/rer;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V
    .locals 0

    .line 1
    iput-byte p7, p0, La/avs0;->a:B

    invoke-direct/range {p0 .. p6}, La/qer;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 11

    .line 1
    iget-byte v0, p0, La/avs0;->a:B

    .line 2
    .line 3
    const/16 v1, 0x10

    .line 4
    .line 5
    const/4 v2, 0x6

    .line 6
    sget-object v3, La/e9u0;->a:La/e9u0;

    .line 7
    .line 8
    const/4 v4, 0x0

    .line 9
    packed-switch v0, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    iget-object p0, p0, La/op9;->receiver:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast p0, La/wzv0;

    .line 15
    .line 16
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->p0()Landroidx/fragment/app/Fragment;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    return-object p0

    .line 21
    :pswitch_0
    iget-object p0, p0, La/op9;->receiver:Ljava/lang/Object;

    .line 22
    .line 23
    check-cast p0, La/cyv0;

    .line 24
    .line 25
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->p0()Landroidx/fragment/app/Fragment;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    return-object p0

    .line 30
    :pswitch_1
    iget-object p0, p0, La/op9;->receiver:Ljava/lang/Object;

    .line 31
    .line 32
    check-cast p0, La/ruv0;

    .line 33
    .line 34
    invoke-virtual {p0}, La/ruv0;->c()V

    .line 35
    .line 36
    .line 37
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 38
    .line 39
    return-object p0

    .line 40
    :pswitch_2
    iget-object p0, p0, La/op9;->receiver:Ljava/lang/Object;

    .line 41
    .line 42
    check-cast p0, La/cgv0;

    .line 43
    .line 44
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 45
    .line 46
    .line 47
    new-instance p0, La/dgv0;

    .line 48
    .line 49
    const/4 v0, 0x0

    .line 50
    sget-object v1, La/iun;->a:La/iun;

    .line 51
    .line 52
    const-string v2, ""

    .line 53
    .line 54
    const/4 v3, 0x1

    .line 55
    invoke-direct {p0, v2, v1, v3, v0}, La/dgv0;-><init>(Ljava/lang/String;Ljava/util/List;ZZ)V

    .line 56
    .line 57
    .line 58
    return-object p0

    .line 59
    :pswitch_3
    iget-object p0, p0, La/op9;->receiver:Ljava/lang/Object;

    .line 60
    .line 61
    check-cast p0, La/d7v0;

    .line 62
    .line 63
    sget-object v0, La/w6v0;->a:La/w6v0;

    .line 64
    .line 65
    invoke-virtual {p0, v0}, La/d7v0;->z(La/a7v0;)V

    .line 66
    .line 67
    .line 68
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 69
    .line 70
    return-object p0

    .line 71
    :pswitch_4
    iget-object p0, p0, La/op9;->receiver:Ljava/lang/Object;

    .line 72
    .line 73
    check-cast p0, Lcom/yandex/authsdk/internal/WebViewLoginActivity;

    .line 74
    .line 75
    sget v0, Lcom/yandex/authsdk/internal/WebViewLoginActivity;->e:I

    .line 76
    .line 77
    iget-object v0, p0, Lcom/yandex/authsdk/internal/WebViewLoginActivity;->d:La/cgx0;

    .line 78
    .line 79
    if-eqz v0, :cond_1

    .line 80
    .line 81
    invoke-virtual {v0}, La/cgx0;->l()V

    .line 82
    .line 83
    .line 84
    iget-object v0, p0, Lcom/yandex/authsdk/internal/WebViewLoginActivity;->c:Landroid/webkit/WebView;

    .line 85
    .line 86
    if-eqz v0, :cond_0

    .line 87
    .line 88
    invoke-virtual {v0}, Landroid/webkit/WebView;->stopLoading()V

    .line 89
    .line 90
    .line 91
    new-instance v0, Landroid/content/Intent;

    .line 92
    .line 93
    invoke-direct {v0}, Landroid/content/Intent;-><init>()V

    .line 94
    .line 95
    .line 96
    new-instance v1, La/d2w0;

    .line 97
    .line 98
    const-string v2, "security.error"

    .line 99
    .line 100
    invoke-direct {v1, v2}, La/d2w0;-><init>(Ljava/lang/String;)V

    .line 101
    .line 102
    .line 103
    const-string v2, "com.yandex.authsdk.EXTRA_ERROR"

    .line 104
    .line 105
    invoke-virtual {v0, v2, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/io/Serializable;)Landroid/content/Intent;

    .line 106
    .line 107
    .line 108
    const/4 v1, -0x1

    .line 109
    invoke-virtual {p0, v1, v0}, Landroid/app/Activity;->setResult(ILandroid/content/Intent;)V

    .line 110
    .line 111
    .line 112
    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    .line 113
    .line 114
    .line 115
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 116
    .line 117
    return-object p0

    .line 118
    :cond_0
    const-string p0, "webView"

    .line 119
    .line 120
    invoke-static {p0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 121
    .line 122
    .line 123
    throw v4

    .line 124
    :cond_1
    const-string p0, "sslErrorHandler"

    .line 125
    .line 126
    invoke-static {p0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 127
    .line 128
    .line 129
    throw v4

    .line 130
    :pswitch_5
    iget-object p0, p0, La/op9;->receiver:Ljava/lang/Object;

    .line 131
    .line 132
    check-cast p0, La/hsu0;

    .line 133
    .line 134
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->p0()Landroidx/fragment/app/Fragment;

    .line 135
    .line 136
    .line 137
    move-result-object p0

    .line 138
    return-object p0

    .line 139
    :pswitch_6
    iget-object p0, p0, La/op9;->receiver:Ljava/lang/Object;

    .line 140
    .line 141
    check-cast p0, La/esu0;

    .line 142
    .line 143
    iget-object p0, p0, La/esu0;->d:La/hzg;

    .line 144
    .line 145
    check-cast p0, La/uzg;

    .line 146
    .line 147
    invoke-virtual {p0}, La/uzg;->a()V

    .line 148
    .line 149
    .line 150
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 151
    .line 152
    return-object p0

    .line 153
    :pswitch_7
    iget-object p0, p0, La/op9;->receiver:Ljava/lang/Object;

    .line 154
    .line 155
    check-cast p0, La/xru0;

    .line 156
    .line 157
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->p0()Landroidx/fragment/app/Fragment;

    .line 158
    .line 159
    .line 160
    move-result-object p0

    .line 161
    return-object p0

    .line 162
    :pswitch_8
    iget-object p0, p0, La/op9;->receiver:Ljava/lang/Object;

    .line 163
    .line 164
    check-cast p0, La/abu0;

    .line 165
    .line 166
    invoke-virtual {p0}, La/abu0;->B()V

    .line 167
    .line 168
    .line 169
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 170
    .line 171
    return-object p0

    .line 172
    :pswitch_9
    iget-object p0, p0, La/op9;->receiver:Ljava/lang/Object;

    .line 173
    .line 174
    check-cast p0, La/abu0;

    .line 175
    .line 176
    invoke-virtual {p0}, La/abu0;->A()V

    .line 177
    .line 178
    .line 179
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 180
    .line 181
    return-object p0

    .line 182
    :pswitch_a
    iget-object p0, p0, La/op9;->receiver:Ljava/lang/Object;

    .line 183
    .line 184
    check-cast p0, La/i9u0;

    .line 185
    .line 186
    iget-object v0, p0, La/i9u0;->g:La/p7m0;

    .line 187
    .line 188
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 189
    .line 190
    .line 191
    invoke-virtual {v0, v4, v3}, La/p7m0;->o(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 192
    .line 193
    .line 194
    invoke-static {p0}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 195
    .line 196
    .line 197
    move-result-object v5

    .line 198
    iget-object v0, p0, La/i9u0;->f:La/mne;

    .line 199
    .line 200
    iget-object v8, v0, La/mne;->a:La/rwj;

    .line 201
    .line 202
    new-instance v6, La/npt0;

    .line 203
    .line 204
    invoke-direct {v6, p0, v2}, La/npt0;-><init>(Ljava/lang/Object;B)V

    .line 205
    .line 206
    .line 207
    new-instance v9, La/k6s0;

    .line 208
    .line 209
    invoke-direct {v9, p0, v4, v1}, La/k6s0;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 210
    .line 211
    .line 212
    const/16 v10, 0xa

    .line 213
    .line 214
    const/4 v7, 0x0

    .line 215
    invoke-static/range {v5 .. v10}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 216
    .line 217
    .line 218
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 219
    .line 220
    return-object p0

    .line 221
    :pswitch_b
    iget-object p0, p0, La/op9;->receiver:Ljava/lang/Object;

    .line 222
    .line 223
    check-cast p0, La/i9u0;

    .line 224
    .line 225
    iget-object v0, p0, La/i9u0;->g:La/p7m0;

    .line 226
    .line 227
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 228
    .line 229
    .line 230
    invoke-virtual {v0, v4, v3}, La/p7m0;->o(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 231
    .line 232
    .line 233
    invoke-static {p0}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 234
    .line 235
    .line 236
    move-result-object v5

    .line 237
    iget-object v0, p0, La/i9u0;->f:La/mne;

    .line 238
    .line 239
    iget-object v8, v0, La/mne;->a:La/rwj;

    .line 240
    .line 241
    new-instance v6, La/npt0;

    .line 242
    .line 243
    invoke-direct {v6, p0, v2}, La/npt0;-><init>(Ljava/lang/Object;B)V

    .line 244
    .line 245
    .line 246
    new-instance v9, La/k6s0;

    .line 247
    .line 248
    invoke-direct {v9, p0, v4, v1}, La/k6s0;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 249
    .line 250
    .line 251
    const/16 v10, 0xa

    .line 252
    .line 253
    const/4 v7, 0x0

    .line 254
    invoke-static/range {v5 .. v10}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 255
    .line 256
    .line 257
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 258
    .line 259
    return-object p0

    .line 260
    :pswitch_c
    iget-object p0, p0, La/op9;->receiver:Ljava/lang/Object;

    .line 261
    .line 262
    check-cast p0, La/g7u0;

    .line 263
    .line 264
    invoke-virtual {p0}, La/g7u0;->w()V

    .line 265
    .line 266
    .line 267
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 268
    .line 269
    return-object p0

    .line 270
    :pswitch_d
    iget-object p0, p0, La/op9;->receiver:Ljava/lang/Object;

    .line 271
    .line 272
    check-cast p0, La/dws0;

    .line 273
    .line 274
    iget-object p0, p0, La/dws0;->j:La/ol60;

    .line 275
    .line 276
    new-instance v0, La/xvs0;

    .line 277
    .line 278
    sget-object v1, La/mvs0;->a:La/mvs0;

    .line 279
    .line 280
    invoke-direct {v0, v1}, La/xvs0;-><init>(La/rvs0;)V

    .line 281
    .line 282
    .line 283
    invoke-virtual {p0, v0}, La/ol60;->f(Ljava/lang/Object;)V

    .line 284
    .line 285
    .line 286
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 287
    .line 288
    return-object p0

    .line 289
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
