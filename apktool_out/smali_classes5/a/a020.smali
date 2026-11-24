.class public final synthetic La/a020;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/c020;


# direct methods
.method public synthetic constructor <init>(La/c020;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/a020;->a:B

    iput-object p1, p0, La/a020;->b:La/c020;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 9

    .line 1
    iget-byte v0, p0, La/a020;->a:B

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x0

    .line 5
    iget-object p0, p0, La/a020;->b:La/c020;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    sget-object v0, La/c020;->U1:La/wsz;

    .line 11
    .line 12
    invoke-virtual {p0}, La/c020;->I0()La/l020;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    iget-object v0, p0, La/l020;->l:La/zg;

    .line 17
    .line 18
    iget-object v0, v0, La/zg;->a:La/kt2;

    .line 19
    .line 20
    const-string v2, "acc_pers_data_move"

    .line 21
    .line 22
    const-string v3, "screen"

    .line 23
    .line 24
    const-string v4, "settings"

    .line 25
    .line 26
    invoke-static {v3, v4, v0, v2}, La/i8i;->D(Ljava/lang/String;Ljava/lang/String;La/kt2;Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    iget-object v0, p0, La/l020;->k:La/au0;

    .line 30
    .line 31
    iget-object v0, v0, La/au0;->a:La/s1p;

    .line 32
    .line 33
    const-wide/16 v2, 0x2b04

    .line 34
    .line 35
    invoke-static {v4, v0, v2, v3}, La/b1j;->v(Ljava/lang/String;La/s1p;J)V

    .line 36
    .line 37
    .line 38
    iget-object v0, p0, La/l020;->d:La/i1w0;

    .line 39
    .line 40
    invoke-static {v0}, La/b1j;->q(La/i1w0;)Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 41
    .line 42
    .line 43
    move-result-object v2

    .line 44
    iget-object p0, p0, La/l020;->b:La/jh70;

    .line 45
    .line 46
    invoke-static {p0, v1}, La/jh70;->j(La/jh70;Z)Lorg/xplatform/personal/impl/navigation/PersonalScreen$PersonalDataScreen;

    .line 47
    .line 48
    .line 49
    move-result-object p0

    .line 50
    instance-of v3, p0, Lorg/xplatform/core/navigation/dialog/DialogScreen;

    .line 51
    .line 52
    if-eqz v3, :cond_0

    .line 53
    .line 54
    new-instance v3, La/e1w0;

    .line 55
    .line 56
    check-cast p0, Lorg/xplatform/core/navigation/dialog/DialogScreen;

    .line 57
    .line 58
    invoke-direct {v3, p0}, La/e1w0;-><init>(Lorg/xplatform/core/navigation/dialog/DialogScreen;)V

    .line 59
    .line 60
    .line 61
    new-instance p0, La/c8d;

    .line 62
    .line 63
    sget-object v4, La/y7d;->a:La/v7d;

    .line 64
    .line 65
    invoke-direct {p0, v4, v3}, La/c8d;-><init>(La/w7d;La/g1w0;)V

    .line 66
    .line 67
    .line 68
    invoke-virtual {v2, p0}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    .line 69
    .line 70
    .line 71
    goto :goto_0

    .line 72
    :cond_0
    new-instance v3, La/w0w0;

    .line 73
    .line 74
    invoke-direct {v3, p0}, La/w0w0;-><init>(La/m7h0;)V

    .line 75
    .line 76
    .line 77
    new-instance p0, La/c8d;

    .line 78
    .line 79
    sget-object v4, La/y7d;->a:La/v7d;

    .line 80
    .line 81
    invoke-direct {p0, v4, v3}, La/c8d;-><init>(La/w7d;La/g1w0;)V

    .line 82
    .line 83
    .line 84
    invoke-virtual {v2, p0}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    .line 85
    .line 86
    .line 87
    :goto_0
    invoke-static {v0, v2, v1}, La/b1j;->o(La/i1w0;Ljava/util/concurrent/CopyOnWriteArrayList;I)Ljava/util/ListIterator;

    .line 88
    .line 89
    .line 90
    move-result-object p0

    .line 91
    :goto_1
    move-object v1, p0

    .line 92
    check-cast v1, La/paw;

    .line 93
    .line 94
    invoke-virtual {v1}, La/paw;->hasNext()Z

    .line 95
    .line 96
    .line 97
    move-result v2

    .line 98
    if-eqz v2, :cond_1

    .line 99
    .line 100
    invoke-virtual {v1}, La/paw;->next()Ljava/lang/Object;

    .line 101
    .line 102
    .line 103
    move-result-object v1

    .line 104
    check-cast v1, La/oe50;

    .line 105
    .line 106
    invoke-virtual {v0, v1}, La/i1w0;->a(La/oe50;)V

    .line 107
    .line 108
    .line 109
    goto :goto_1

    .line 110
    :cond_1
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 111
    .line 112
    return-object p0

    .line 113
    :pswitch_0
    sget-object v0, La/c020;->U1:La/wsz;

    .line 114
    .line 115
    invoke-virtual {p0}, La/c020;->I0()La/l020;

    .line 116
    .line 117
    .line 118
    move-result-object p0

    .line 119
    iget-object v0, p0, La/l020;->m:La/s31;

    .line 120
    .line 121
    invoke-virtual {v0}, La/s31;->p()V

    .line 122
    .line 123
    .line 124
    iget-object v0, p0, La/l020;->n:La/s64;

    .line 125
    .line 126
    const-string v1, "details"

    .line 127
    .line 128
    invoke-virtual {v0, v1}, La/s64;->e(Ljava/lang/String;)V

    .line 129
    .line 130
    .line 131
    invoke-static {p0}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 132
    .line 133
    .line 134
    move-result-object v3

    .line 135
    iget-object v0, p0, La/l020;->h:La/mne;

    .line 136
    .line 137
    iget-object v6, v0, La/mne;->a:La/rwj;

    .line 138
    .line 139
    new-instance v4, La/h020;

    .line 140
    .line 141
    const/4 v0, 0x2

    .line 142
    invoke-direct {v4, p0, v0}, La/h020;-><init>(La/l020;B)V

    .line 143
    .line 144
    .line 145
    new-instance v7, La/slx;

    .line 146
    .line 147
    const/16 v0, 0x1d

    .line 148
    .line 149
    invoke-direct {v7, p0, v2, v0}, La/slx;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 150
    .line 151
    .line 152
    const/16 v8, 0xa

    .line 153
    .line 154
    const/4 v5, 0x0

    .line 155
    invoke-static/range {v3 .. v8}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 156
    .line 157
    .line 158
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 159
    .line 160
    return-object p0

    .line 161
    :pswitch_1
    sget-object v0, La/c020;->U1:La/wsz;

    .line 162
    .line 163
    invoke-virtual {p0}, La/c020;->I0()La/l020;

    .line 164
    .line 165
    .line 166
    move-result-object p0

    .line 167
    iget-object v0, p0, La/l020;->t:La/p7m0;

    .line 168
    .line 169
    new-instance v1, La/tz10;

    .line 170
    .line 171
    iget-object p0, p0, La/l020;->s:La/p7m0;

    .line 172
    .line 173
    invoke-virtual {p0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 174
    .line 175
    .line 176
    move-result-object p0

    .line 177
    check-cast p0, La/d020;

    .line 178
    .line 179
    iget-object p0, p0, La/d020;->c:Ljava/lang/String;

    .line 180
    .line 181
    invoke-direct {v1, p0}, La/tz10;-><init>(Ljava/lang/String;)V

    .line 182
    .line 183
    .line 184
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 185
    .line 186
    .line 187
    invoke-virtual {v0, v2, v1}, La/p7m0;->o(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 188
    .line 189
    .line 190
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 191
    .line 192
    return-object p0

    .line 193
    :pswitch_2
    iget-object p0, p0, La/c020;->N1:La/fiu0;

    .line 194
    .line 195
    if-eqz p0, :cond_2

    .line 196
    .line 197
    return-object p0

    .line 198
    :cond_2
    const-string p0, "viewModelFactory"

    .line 199
    .line 200
    invoke-static {p0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 201
    .line 202
    .line 203
    throw v2

    .line 204
    :pswitch_3
    sget-object v0, La/c020;->U1:La/wsz;

    .line 205
    .line 206
    new-instance v1, La/hc50;

    .line 207
    .line 208
    sget-object v3, La/ybg0;->a:La/ybg0;

    .line 209
    .line 210
    new-instance v5, La/a020;

    .line 211
    .line 212
    const/4 v0, 0x5

    .line 213
    invoke-direct {v5, p0, v0}, La/a020;-><init>(La/c020;B)V

    .line 214
    .line 215
    .line 216
    const/16 v6, 0x7f0

    .line 217
    .line 218
    const-string v2, "INFO_BUTTON_ID"

    .line 219
    .line 220
    const v4, 0x7f080965

    .line 221
    .line 222
    .line 223
    invoke-direct/range {v1 .. v6}, La/hc50;-><init>(Ljava/lang/String;La/ybg0;ILkotlin/jvm/functions/Function0;I)V

    .line 224
    .line 225
    .line 226
    return-object v1

    .line 227
    :pswitch_4
    sget-object v0, La/c020;->U1:La/wsz;

    .line 228
    .line 229
    new-instance v1, La/hc50;

    .line 230
    .line 231
    sget-object v3, La/ybg0;->a:La/ybg0;

    .line 232
    .line 233
    new-instance v5, La/a020;

    .line 234
    .line 235
    const/4 v0, 0x6

    .line 236
    invoke-direct {v5, p0, v0}, La/a020;-><init>(La/c020;B)V

    .line 237
    .line 238
    .line 239
    const/16 v6, 0x7f0

    .line 240
    .line 241
    const-string v2, "PROFILE_BUTTON_ID"

    .line 242
    .line 243
    const v4, 0x7f080831

    .line 244
    .line 245
    .line 246
    invoke-direct/range {v1 .. v6}, La/hc50;-><init>(Ljava/lang/String;La/ybg0;ILkotlin/jvm/functions/Function0;I)V

    .line 247
    .line 248
    .line 249
    return-object v1

    .line 250
    :pswitch_5
    sget-object v0, La/c020;->U1:La/wsz;

    .line 251
    .line 252
    invoke-virtual {p0}, La/c020;->I0()La/l020;

    .line 253
    .line 254
    .line 255
    move-result-object p0

    .line 256
    iget-object p0, p0, La/l020;->d:La/i1w0;

    .line 257
    .line 258
    invoke-static {p0}, La/b1j;->q(La/i1w0;)Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 259
    .line 260
    .line 261
    move-result-object v0

    .line 262
    new-instance v2, La/c8d;

    .line 263
    .line 264
    sget-object v3, La/y7d;->a:La/v7d;

    .line 265
    .line 266
    sget-object v4, La/p0w0;->a:La/p0w0;

    .line 267
    .line 268
    invoke-direct {v2, v3, v4}, La/c8d;-><init>(La/w7d;La/g1w0;)V

    .line 269
    .line 270
    .line 271
    invoke-static {v0, v2, p0, v0, v1}, La/b1j;->p(Ljava/util/concurrent/CopyOnWriteArrayList;La/c8d;La/i1w0;Ljava/util/concurrent/CopyOnWriteArrayList;I)Ljava/util/ListIterator;

    .line 272
    .line 273
    .line 274
    move-result-object v0

    .line 275
    :goto_2
    move-object v1, v0

    .line 276
    check-cast v1, La/paw;

    .line 277
    .line 278
    invoke-virtual {v1}, La/paw;->hasNext()Z

    .line 279
    .line 280
    .line 281
    move-result v2

    .line 282
    if-eqz v2, :cond_3

    .line 283
    .line 284
    invoke-virtual {v1}, La/paw;->next()Ljava/lang/Object;

    .line 285
    .line 286
    .line 287
    move-result-object v1

    .line 288
    check-cast v1, La/oe50;

    .line 289
    .line 290
    invoke-virtual {p0, v1}, La/i1w0;->a(La/oe50;)V

    .line 291
    .line 292
    .line 293
    goto :goto_2

    .line 294
    :cond_3
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 295
    .line 296
    return-object p0

    .line 297
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
