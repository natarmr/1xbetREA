.class public final synthetic La/tx4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/fy4;


# direct methods
.method public synthetic constructor <init>(La/fy4;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/tx4;->a:B

    iput-object p1, p0, La/tx4;->b:La/fy4;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11

    .line 1
    iget-byte v0, p0, La/tx4;->a:B

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    iget-object p0, p0, La/tx4;->b:La/fy4;

    .line 5
    .line 6
    packed-switch v0, :pswitch_data_0

    .line 7
    .line 8
    .line 9
    check-cast p1, Ljava/lang/Throwable;

    .line 10
    .line 11
    check-cast p2, Ljava/lang/String;

    .line 12
    .line 13
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 14
    .line 15
    .line 16
    iget-object p0, p0, La/fy4;->X:La/p7m0;

    .line 17
    .line 18
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 19
    .line 20
    .line 21
    sget-object p1, La/fm5;->a:La/fm5;

    .line 22
    .line 23
    invoke-virtual {p0, v1, p1}, La/p7m0;->o(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 24
    .line 25
    .line 26
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 27
    .line 28
    return-object p0

    .line 29
    :pswitch_0
    iget-object v0, p0, La/fy4;->a0:La/ol60;

    .line 30
    .line 31
    check-cast p1, Ljava/lang/Throwable;

    .line 32
    .line 33
    move-object v4, p2

    .line 34
    check-cast v4, Ljava/lang/String;

    .line 35
    .line 36
    sget-object v3, La/rek0;->b:La/rek0;

    .line 37
    .line 38
    invoke-static {v4, p1}, La/b1j;->z(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 39
    .line 40
    .line 41
    instance-of p2, p1, La/zhi0;

    .line 42
    .line 43
    if-eqz p2, :cond_7

    .line 44
    .line 45
    check-cast p1, La/zhi0;

    .line 46
    .line 47
    iget-object p2, p1, La/zhi0;->c:La/kuw;

    .line 48
    .line 49
    sget-object v2, La/i2o;->q:La/i2o;

    .line 50
    .line 51
    if-ne p2, v2, :cond_0

    .line 52
    .line 53
    new-instance p0, La/hw4;

    .line 54
    .line 55
    invoke-direct {p0, v4}, La/hw4;-><init>(Ljava/lang/String;)V

    .line 56
    .line 57
    .line 58
    invoke-virtual {v0, p0}, La/ol60;->f(Ljava/lang/Object;)V

    .line 59
    .line 60
    .line 61
    goto/16 :goto_3

    .line 62
    .line 63
    :cond_0
    sget-object v2, La/i2o;->n2:La/i2o;

    .line 64
    .line 65
    if-ne p2, v2, :cond_1

    .line 66
    .line 67
    new-instance p0, La/ew4;

    .line 68
    .line 69
    invoke-direct {p0, v4}, La/ew4;-><init>(Ljava/lang/String;)V

    .line 70
    .line 71
    .line 72
    invoke-virtual {v0, p0}, La/ol60;->f(Ljava/lang/Object;)V

    .line 73
    .line 74
    .line 75
    goto/16 :goto_3

    .line 76
    .line 77
    :cond_1
    sget-object v2, La/i2o;->A:La/i2o;

    .line 78
    .line 79
    if-eq p2, v2, :cond_5

    .line 80
    .line 81
    sget-object v2, La/i2o;->B:La/i2o;

    .line 82
    .line 83
    if-eq p2, v2, :cond_5

    .line 84
    .line 85
    sget-object v2, La/i2o;->K4:La/i2o;

    .line 86
    .line 87
    if-ne p2, v2, :cond_2

    .line 88
    .line 89
    goto :goto_1

    .line 90
    :cond_2
    sget-object p1, La/i2o;->v:La/i2o;

    .line 91
    .line 92
    if-eq p2, p1, :cond_4

    .line 93
    .line 94
    sget-object p1, La/i2o;->w:La/i2o;

    .line 95
    .line 96
    if-eq p2, p1, :cond_4

    .line 97
    .line 98
    sget-object p1, La/i2o;->x:La/i2o;

    .line 99
    .line 100
    if-ne p2, p1, :cond_3

    .line 101
    .line 102
    goto :goto_0

    .line 103
    :cond_3
    new-instance p0, La/fw4;

    .line 104
    .line 105
    new-instance v2, La/xdk0;

    .line 106
    .line 107
    const/4 v8, 0x0

    .line 108
    const/16 v9, 0x7c

    .line 109
    .line 110
    const/4 v5, 0x0

    .line 111
    const/4 v6, 0x0

    .line 112
    const/4 v7, 0x0

    .line 113
    invoke-direct/range {v2 .. v9}, La/xdk0;-><init>(La/sek0;Ljava/lang/String;Ljava/lang/String;La/idk0;La/kdk0;Ljava/lang/Integer;I)V

    .line 114
    .line 115
    .line 116
    invoke-direct {p0, v2}, La/fw4;-><init>(La/xdk0;)V

    .line 117
    .line 118
    .line 119
    invoke-virtual {v0, p0}, La/ol60;->f(Ljava/lang/Object;)V

    .line 120
    .line 121
    .line 122
    goto/16 :goto_3

    .line 123
    .line 124
    :cond_4
    :goto_0
    iget-object p1, p0, La/fy4;->J:La/loi0;

    .line 125
    .line 126
    iget-object p1, p1, La/loi0;->a:La/h03;

    .line 127
    .line 128
    iget-object p1, p1, La/h03;->b:Ljava/lang/Object;

    .line 129
    .line 130
    check-cast p1, La/nb7;

    .line 131
    .line 132
    const/4 p2, 0x1

    .line 133
    iput-boolean p2, p1, La/nb7;->b:Z

    .line 134
    .line 135
    new-instance p1, La/sx4;

    .line 136
    .line 137
    const/4 p2, 0x3

    .line 138
    invoke-direct {p1, p0, p2}, La/sx4;-><init>(La/fy4;B)V

    .line 139
    .line 140
    .line 141
    invoke-virtual {p0, p1}, La/fy4;->J(Lkotlin/jvm/functions/Function1;)V

    .line 142
    .line 143
    .line 144
    goto :goto_3

    .line 145
    :cond_5
    :goto_1
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 146
    .line 147
    .line 148
    move-result-object p1

    .line 149
    if-nez p1, :cond_6

    .line 150
    .line 151
    goto :goto_2

    .line 152
    :cond_6
    move-object v4, p1

    .line 153
    :goto_2
    invoke-static {p0}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 154
    .line 155
    .line 156
    move-result-object v5

    .line 157
    new-instance v6, La/ij4;

    .line 158
    .line 159
    const/16 p1, 0xc

    .line 160
    .line 161
    invoke-direct {v6, p1}, La/ij4;-><init>(B)V

    .line 162
    .line 163
    .line 164
    iget-object p1, p0, La/fy4;->g:La/mne;

    .line 165
    .line 166
    iget-object v8, p1, La/mne;->b:La/dvj;

    .line 167
    .line 168
    new-instance v9, La/cm3;

    .line 169
    .line 170
    const/16 p1, 0xe

    .line 171
    .line 172
    invoke-direct {v9, p0, v4, v1, p1}, La/cm3;-><init>(Ljava/lang/Object;Ljava/lang/Object;La/yje;B)V

    .line 173
    .line 174
    .line 175
    const/16 v10, 0xa

    .line 176
    .line 177
    const/4 v7, 0x0

    .line 178
    invoke-static/range {v5 .. v10}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 179
    .line 180
    .line 181
    goto :goto_3

    .line 182
    :cond_7
    invoke-static {p1}, La/hic;->C(Ljava/lang/Throwable;)Z

    .line 183
    .line 184
    .line 185
    move-result p1

    .line 186
    if-eqz p1, :cond_8

    .line 187
    .line 188
    iget-object p0, p0, La/fy4;->l:La/ctf0;

    .line 189
    .line 190
    new-instance p1, La/fw4;

    .line 191
    .line 192
    new-instance v1, La/xdk0;

    .line 193
    .line 194
    sget-object v2, La/pek0;->a:La/pek0;

    .line 195
    .line 196
    const/4 p2, 0x0

    .line 197
    new-array v3, p2, [Ljava/lang/Object;

    .line 198
    .line 199
    const v4, 0x7f130e13

    .line 200
    .line 201
    .line 202
    invoke-virtual {p0, v4, v3}, La/ctf0;->f(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 203
    .line 204
    .line 205
    move-result-object v3

    .line 206
    const v4, 0x7f130e11

    .line 207
    .line 208
    .line 209
    new-array p2, p2, [Ljava/lang/Object;

    .line 210
    .line 211
    invoke-virtual {p0, v4, p2}, La/ctf0;->f(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 212
    .line 213
    .line 214
    move-result-object v4

    .line 215
    const/4 v7, 0x0

    .line 216
    const/16 v8, 0x78

    .line 217
    .line 218
    const/4 v5, 0x0

    .line 219
    const/4 v6, 0x0

    .line 220
    invoke-direct/range {v1 .. v8}, La/xdk0;-><init>(La/sek0;Ljava/lang/String;Ljava/lang/String;La/idk0;La/kdk0;Ljava/lang/Integer;I)V

    .line 221
    .line 222
    .line 223
    invoke-direct {p1, v1}, La/fw4;-><init>(La/xdk0;)V

    .line 224
    .line 225
    .line 226
    invoke-virtual {v0, p1}, La/ol60;->f(Ljava/lang/Object;)V

    .line 227
    .line 228
    .line 229
    goto :goto_3

    .line 230
    :cond_8
    new-instance p0, La/fw4;

    .line 231
    .line 232
    new-instance v2, La/xdk0;

    .line 233
    .line 234
    const/4 v8, 0x0

    .line 235
    const/16 v9, 0x7c

    .line 236
    .line 237
    const/4 v5, 0x0

    .line 238
    const/4 v6, 0x0

    .line 239
    const/4 v7, 0x0

    .line 240
    invoke-direct/range {v2 .. v9}, La/xdk0;-><init>(La/sek0;Ljava/lang/String;Ljava/lang/String;La/idk0;La/kdk0;Ljava/lang/Integer;I)V

    .line 241
    .line 242
    .line 243
    invoke-direct {p0, v2}, La/fw4;-><init>(La/xdk0;)V

    .line 244
    .line 245
    .line 246
    invoke-virtual {v0, p0}, La/ol60;->f(Ljava/lang/Object;)V

    .line 247
    .line 248
    .line 249
    :goto_3
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 250
    .line 251
    return-object p0

    .line 252
    :pswitch_1
    check-cast p1, Ljava/lang/Throwable;

    .line 253
    .line 254
    move-object v2, p2

    .line 255
    check-cast v2, Ljava/lang/String;

    .line 256
    .line 257
    invoke-static {v2, p1}, La/b1j;->z(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 258
    .line 259
    .line 260
    iget-object p0, p0, La/fy4;->a0:La/ol60;

    .line 261
    .line 262
    new-instance p1, La/fw4;

    .line 263
    .line 264
    new-instance v0, La/xdk0;

    .line 265
    .line 266
    sget-object v1, La/rek0;->b:La/rek0;

    .line 267
    .line 268
    const/4 v6, 0x0

    .line 269
    const/16 v7, 0x7c

    .line 270
    .line 271
    const/4 v3, 0x0

    .line 272
    const/4 v4, 0x0

    .line 273
    const/4 v5, 0x0

    .line 274
    invoke-direct/range {v0 .. v7}, La/xdk0;-><init>(La/sek0;Ljava/lang/String;Ljava/lang/String;La/idk0;La/kdk0;Ljava/lang/Integer;I)V

    .line 275
    .line 276
    .line 277
    invoke-direct {p1, v0}, La/fw4;-><init>(La/xdk0;)V

    .line 278
    .line 279
    .line 280
    invoke-virtual {p0, p1}, La/ol60;->f(Ljava/lang/Object;)V

    .line 281
    .line 282
    .line 283
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 284
    .line 285
    return-object p0

    .line 286
    nop

    .line 287
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
