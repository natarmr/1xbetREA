.class public final synthetic La/sz80;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/xz80;


# direct methods
.method public synthetic constructor <init>(La/xz80;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/sz80;->a:B

    iput-object p1, p0, La/sz80;->b:La/xz80;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 14

    .line 1
    iget-byte v0, p0, La/sz80;->a:B

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x0

    .line 5
    iget-object v3, p0, La/sz80;->b:La/xz80;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    sget-object p0, La/xz80;->U1:La/xi70;

    .line 11
    .line 12
    invoke-virtual {v3}, La/xz80;->H0()Lorg/xplatform/security/impl/presentation/password/change/input_password/f;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    iget-object v0, p0, Lorg/xplatform/security/impl/presentation/password/change/input_password/f;->q:La/c4m0;

    .line 17
    .line 18
    invoke-static {v0}, La/v3c;->N(La/bby;)V

    .line 19
    .line 20
    .line 21
    iget-object p0, p0, Lorg/xplatform/security/impl/presentation/password/change/input_password/f;->m:La/p7m0;

    .line 22
    .line 23
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 24
    .line 25
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 26
    .line 27
    .line 28
    invoke-virtual {p0, v2, v0}, La/p7m0;->o(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 29
    .line 30
    .line 31
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 32
    .line 33
    return-object p0

    .line 34
    :pswitch_0
    sget-object p0, La/xz80;->U1:La/xi70;

    .line 35
    .line 36
    invoke-virtual {v3}, La/xz80;->H0()Lorg/xplatform/security/impl/presentation/password/change/input_password/f;

    .line 37
    .line 38
    .line 39
    move-result-object p0

    .line 40
    iget-object p0, p0, Lorg/xplatform/security/impl/presentation/password/change/input_password/f;->c:La/i1w0;

    .line 41
    .line 42
    invoke-static {p0}, La/b1j;->q(La/i1w0;)Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    new-instance v2, La/c8d;

    .line 47
    .line 48
    sget-object v3, La/y7d;->a:La/v7d;

    .line 49
    .line 50
    sget-object v4, La/p0w0;->a:La/p0w0;

    .line 51
    .line 52
    invoke-direct {v2, v3, v4}, La/c8d;-><init>(La/w7d;La/g1w0;)V

    .line 53
    .line 54
    .line 55
    invoke-static {v0, v2, p0, v0, v1}, La/b1j;->p(Ljava/util/concurrent/CopyOnWriteArrayList;La/c8d;La/i1w0;Ljava/util/concurrent/CopyOnWriteArrayList;I)Ljava/util/ListIterator;

    .line 56
    .line 57
    .line 58
    move-result-object v0

    .line 59
    :goto_0
    move-object v1, v0

    .line 60
    check-cast v1, La/paw;

    .line 61
    .line 62
    invoke-virtual {v1}, La/paw;->hasNext()Z

    .line 63
    .line 64
    .line 65
    move-result v2

    .line 66
    if-eqz v2, :cond_0

    .line 67
    .line 68
    invoke-virtual {v1}, La/paw;->next()Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    move-result-object v1

    .line 72
    check-cast v1, La/oe50;

    .line 73
    .line 74
    invoke-virtual {p0, v1}, La/i1w0;->a(La/oe50;)V

    .line 75
    .line 76
    .line 77
    goto :goto_0

    .line 78
    :cond_0
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 79
    .line 80
    return-object p0

    .line 81
    :pswitch_1
    sget-object p0, La/xz80;->U1:La/xi70;

    .line 82
    .line 83
    invoke-virtual {v3}, La/xz80;->H0()Lorg/xplatform/security/impl/presentation/password/change/input_password/f;

    .line 84
    .line 85
    .line 86
    move-result-object p0

    .line 87
    iget-boolean v0, p0, Lorg/xplatform/security/impl/presentation/password/change/input_password/f;->s:Z

    .line 88
    .line 89
    if-nez v0, :cond_1

    .line 90
    .line 91
    iget-object p0, p0, Lorg/xplatform/security/impl/presentation/password/change/input_password/f;->p:La/ol60;

    .line 92
    .line 93
    sget-object v0, La/a090;->a:La/a090;

    .line 94
    .line 95
    invoke-virtual {p0, v0}, La/ol60;->f(Ljava/lang/Object;)V

    .line 96
    .line 97
    .line 98
    goto :goto_1

    .line 99
    :cond_1
    iget-object v0, p0, Lorg/xplatform/security/impl/presentation/password/change/input_password/f;->n:La/xae0;

    .line 100
    .line 101
    iget-object v0, v0, La/xae0;->a:La/n7m0;

    .line 102
    .line 103
    invoke-interface {v0}, La/n7m0;->getValue()Ljava/lang/Object;

    .line 104
    .line 105
    .line 106
    move-result-object v0

    .line 107
    check-cast v0, Lorg/xplatform/security/impl/presentation/password/change/input_password/PasswordChangeViewModel$ScreenUiState;

    .line 108
    .line 109
    invoke-virtual {v0}, Lorg/xplatform/security/impl/presentation/password/change/input_password/PasswordChangeViewModel$ScreenUiState;->a()Ljava/lang/String;

    .line 110
    .line 111
    .line 112
    move-result-object v0

    .line 113
    new-instance v3, La/wk70;

    .line 114
    .line 115
    const/16 v4, 0x1d

    .line 116
    .line 117
    invoke-direct {v3, p0, v2, v4}, La/wk70;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 118
    .line 119
    .line 120
    new-instance v4, La/vsg0;

    .line 121
    .line 122
    invoke-direct {v4, v3}, La/vsg0;-><init>(Lkotlin/jvm/functions/Function2;)V

    .line 123
    .line 124
    .line 125
    new-instance v3, La/za60;

    .line 126
    .line 127
    const/4 v5, 0x6

    .line 128
    invoke-direct {v3, v2, p0, v5}, La/za60;-><init>(La/yje;Ljava/lang/Object;B)V

    .line 129
    .line 130
    .line 131
    invoke-static {v4, v3}, La/aoq;->c(La/gmq;La/xdr;)La/utb;

    .line 132
    .line 133
    .line 134
    move-result-object v3

    .line 135
    new-instance v4, La/s980;

    .line 136
    .line 137
    const/4 v5, 0x4

    .line 138
    invoke-direct {v4, p0, v2, v5}, La/s980;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 139
    .line 140
    .line 141
    new-instance v6, La/fnq;

    .line 142
    .line 143
    invoke-direct {v6, v3, v4, v5}, La/fnq;-><init>(La/gmq;Lkotlin/jvm/functions/Function2;B)V

    .line 144
    .line 145
    .line 146
    new-instance v3, La/nv;

    .line 147
    .line 148
    const/4 v4, 0x3

    .line 149
    invoke-direct {v3, v6, v2, v4}, La/nv;-><init>(La/fnq;La/yje;B)V

    .line 150
    .line 151
    .line 152
    new-instance v4, La/vsg0;

    .line 153
    .line 154
    invoke-direct {v4, v3}, La/vsg0;-><init>(Lkotlin/jvm/functions/Function2;)V

    .line 155
    .line 156
    .line 157
    new-instance v3, La/z210;

    .line 158
    .line 159
    const/16 v6, 0x17

    .line 160
    .line 161
    invoke-direct {v3, p0, v2, v6}, La/z210;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 162
    .line 163
    .line 164
    new-instance v6, La/fnq;

    .line 165
    .line 166
    invoke-direct {v6, v4, v3}, La/fnq;-><init>(La/gmq;Lkotlin/jvm/functions/Function2;)V

    .line 167
    .line 168
    .line 169
    new-instance v3, La/zm70;

    .line 170
    .line 171
    const/16 v4, 0x19

    .line 172
    .line 173
    invoke-direct {v3, p0, v0, v2, v4}, La/zm70;-><init>(Ljava/lang/Object;Ljava/lang/Object;La/yje;B)V

    .line 174
    .line 175
    .line 176
    new-instance v0, La/fnq;

    .line 177
    .line 178
    invoke-direct {v0, v6, v3, v5}, La/fnq;-><init>(La/gmq;Lkotlin/jvm/functions/Function2;B)V

    .line 179
    .line 180
    .line 181
    new-instance v3, La/gbv;

    .line 182
    .line 183
    const/16 v4, 0x11

    .line 184
    .line 185
    invoke-direct {v3, p0, v2, v4}, La/gbv;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 186
    .line 187
    .line 188
    new-instance v4, La/dnq;

    .line 189
    .line 190
    invoke-direct {v4, v0, v3, v1}, La/dnq;-><init>(La/gmq;La/xdr;B)V

    .line 191
    .line 192
    .line 193
    invoke-static {p0}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 194
    .line 195
    .line 196
    move-result-object v0

    .line 197
    iget-object v1, p0, Lorg/xplatform/security/impl/presentation/password/change/input_password/f;->k:La/mne;

    .line 198
    .line 199
    iget-object v1, v1, La/mne;->a:La/rwj;

    .line 200
    .line 201
    invoke-static {v0, v1}, La/d5c;->S(La/vne;Lkotlin/coroutines/CoroutineContext;)La/sje;

    .line 202
    .line 203
    .line 204
    move-result-object v0

    .line 205
    new-instance v1, Lorg/xplatform/security/impl/presentation/password/change/input_password/e;

    .line 206
    .line 207
    invoke-direct {v1, p0, v2}, Lorg/xplatform/security/impl/presentation/password/change/input_password/e;-><init>(Lorg/xplatform/security/impl/presentation/password/change/input_password/f;La/yje;)V

    .line 208
    .line 209
    .line 210
    invoke-static {v4, v0, v1}, La/sac;->T(La/gmq;La/vne;Lkotlin/jvm/functions/Function2;)La/c4m0;

    .line 211
    .line 212
    .line 213
    move-result-object v0

    .line 214
    iput-object v0, p0, Lorg/xplatform/security/impl/presentation/password/change/input_password/f;->q:La/c4m0;

    .line 215
    .line 216
    :goto_1
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 217
    .line 218
    return-object p0

    .line 219
    :pswitch_2
    sget-object v0, La/xz80;->U1:La/xi70;

    .line 220
    .line 221
    iget-object v5, p0, La/sz80;->b:La/xz80;

    .line 222
    .line 223
    iget-object v3, v5, La/xz80;->P1:La/wdk0;

    .line 224
    .line 225
    if-eqz v3, :cond_2

    .line 226
    .line 227
    new-instance v4, La/xdk0;

    .line 228
    .line 229
    sget-object v7, La/rek0;->b:La/rek0;

    .line 230
    .line 231
    const p0, 0x7f130dca

    .line 232
    .line 233
    .line 234
    invoke-virtual {v5, p0}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 235
    .line 236
    .line 237
    move-result-object v8

    .line 238
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 239
    .line 240
    .line 241
    const/4 v12, 0x0

    .line 242
    const/16 v13, 0x7c

    .line 243
    .line 244
    const/4 v9, 0x0

    .line 245
    const/4 v10, 0x0

    .line 246
    const/4 v11, 0x0

    .line 247
    move-object v6, v4

    .line 248
    invoke-direct/range {v6 .. v13}, La/xdk0;-><init>(La/sek0;Ljava/lang/String;Ljava/lang/String;La/idk0;La/kdk0;Ljava/lang/Integer;I)V

    .line 249
    .line 250
    .line 251
    const/16 v10, 0x3fc

    .line 252
    .line 253
    const/4 v6, 0x0

    .line 254
    const/4 v7, 0x0

    .line 255
    const/4 v8, 0x0

    .line 256
    invoke-static/range {v3 .. v10}, La/wdk0;->k(La/wdk0;La/xdk0;Landroidx/fragment/app/Fragment;Landroid/view/Window;Landroid/view/View;ZLjava/lang/Integer;I)La/ndk0;

    .line 257
    .line 258
    .line 259
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 260
    .line 261
    return-object p0

    .line 262
    :cond_2
    const-string p0, "snackbarManager"

    .line 263
    .line 264
    invoke-static {p0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 265
    .line 266
    .line 267
    throw v2

    .line 268
    :pswitch_3
    new-instance p0, La/t0h0;

    .line 269
    .line 270
    iget-object v0, v3, La/xz80;->M1:La/ini;

    .line 271
    .line 272
    if-eqz v0, :cond_3

    .line 273
    .line 274
    invoke-static {v3}, La/a4n0;->f(Landroidx/fragment/app/Fragment;)La/i1w0;

    .line 275
    .line 276
    .line 277
    move-result-object v1

    .line 278
    invoke-direct {p0, v0, v1}, La/t0h0;-><init>(La/j0h0;La/i1w0;)V

    .line 279
    .line 280
    .line 281
    return-object p0

    .line 282
    :cond_3
    const-string p0, "viewModelFactory"

    .line 283
    .line 284
    invoke-static {p0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 285
    .line 286
    .line 287
    throw v2

    .line 288
    nop

    .line 289
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
