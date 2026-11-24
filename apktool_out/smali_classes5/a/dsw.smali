.class public final synthetic La/dsw;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/ydr;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/pz40;


# direct methods
.method public synthetic constructor <init>(La/pz40;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/dsw;->a:B

    iput-object p1, p0, La/dsw;->b:La/pz40;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final j(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    .line 1
    iget-byte v0, p0, La/dsw;->a:B

    .line 2
    .line 3
    const/4 v1, 0x6

    .line 4
    const/16 v2, 0x90

    .line 5
    .line 6
    const/16 v3, 0x10

    .line 7
    .line 8
    const/16 v4, 0x20

    .line 9
    .line 10
    const/4 v5, 0x1

    .line 11
    iget-object p0, p0, La/dsw;->b:La/pz40;

    .line 12
    .line 13
    const/4 v6, 0x0

    .line 14
    packed-switch v0, :pswitch_data_0

    .line 15
    .line 16
    .line 17
    check-cast p1, La/y5d;

    .line 18
    .line 19
    check-cast p2, La/mm40;

    .line 20
    .line 21
    check-cast p3, La/fet;

    .line 22
    .line 23
    check-cast p4, Ljava/lang/Integer;

    .line 24
    .line 25
    invoke-static {p4, p1, p2}, La/dw9;->d(Ljava/lang/Integer;La/y5d;La/mm40;)I

    .line 26
    .line 27
    .line 28
    move-result p1

    .line 29
    and-int/lit8 p4, p1, 0x30

    .line 30
    .line 31
    if-nez p4, :cond_1

    .line 32
    .line 33
    invoke-virtual {p3, p2}, La/fet;->g(Ljava/lang/Object;)Z

    .line 34
    .line 35
    .line 36
    move-result p4

    .line 37
    if-eqz p4, :cond_0

    .line 38
    .line 39
    move v3, v4

    .line 40
    :cond_0
    or-int/2addr p1, v3

    .line 41
    :cond_1
    and-int/lit16 p4, p1, 0x91

    .line 42
    .line 43
    if-eq p4, v2, :cond_2

    .line 44
    .line 45
    move v6, v5

    .line 46
    :cond_2
    and-int/2addr p1, v5

    .line 47
    invoke-virtual {p3, p1, v6}, La/fet;->U(IZ)Z

    .line 48
    .line 49
    .line 50
    move-result p1

    .line 51
    if-eqz p1, :cond_3

    .line 52
    .line 53
    new-instance p1, La/esw;

    .line 54
    .line 55
    invoke-direct {p1, v1, p2, p0}, La/esw;-><init>(BLa/mm40;La/pz40;)V

    .line 56
    .line 57
    .line 58
    const p0, 0x15451ee8

    .line 59
    .line 60
    .line 61
    invoke-static {p0, p1, p3}, La/u1c;->M(ILa/wdr;La/fet;)La/ugd;

    .line 62
    .line 63
    .line 64
    move-result-object p0

    .line 65
    invoke-static {p0, p3, v1}, La/kr00;->a(La/ugd;La/fet;I)V

    .line 66
    .line 67
    .line 68
    goto :goto_0

    .line 69
    :cond_3
    invoke-virtual {p3}, La/fet;->X()V

    .line 70
    .line 71
    .line 72
    :goto_0
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 73
    .line 74
    return-object p0

    .line 75
    :pswitch_0
    check-cast p1, La/rk80;

    .line 76
    .line 77
    check-cast p2, Ljava/lang/Integer;

    .line 78
    .line 79
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 80
    .line 81
    .line 82
    move-result p2

    .line 83
    check-cast p3, La/fet;

    .line 84
    .line 85
    check-cast p4, Ljava/lang/Integer;

    .line 86
    .line 87
    invoke-virtual {p4}, Ljava/lang/Integer;->intValue()I

    .line 88
    .line 89
    .line 90
    move-result p4

    .line 91
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 92
    .line 93
    .line 94
    and-int/lit8 p1, p4, 0x30

    .line 95
    .line 96
    if-nez p1, :cond_5

    .line 97
    .line 98
    invoke-virtual {p3, p2}, La/fet;->e(I)Z

    .line 99
    .line 100
    .line 101
    move-result p1

    .line 102
    if-eqz p1, :cond_4

    .line 103
    .line 104
    move v3, v4

    .line 105
    :cond_4
    or-int/2addr p4, v3

    .line 106
    :cond_5
    and-int/lit16 p1, p4, 0x91

    .line 107
    .line 108
    if-eq p1, v2, :cond_6

    .line 109
    .line 110
    move v6, v5

    .line 111
    :cond_6
    and-int/lit8 p1, p4, 0x1

    .line 112
    .line 113
    invoke-virtual {p3, p1, v6}, La/fet;->U(IZ)Z

    .line 114
    .line 115
    .line 116
    move-result p1

    .line 117
    if-eqz p1, :cond_8

    .line 118
    .line 119
    sget-object p1, La/jm40;->b:La/jm40;

    .line 120
    .line 121
    const/high16 v0, 0x3f800000    # 1.0f

    .line 122
    .line 123
    invoke-static {p1, v0}, La/o7k0;->d(La/mm40;F)La/mm40;

    .line 124
    .line 125
    .line 126
    move-result-object p1

    .line 127
    const-string v0, "COLUMN_PAGER_TAG"

    .line 128
    .line 129
    invoke-static {p1, v0}, La/o2e;->e0(La/mm40;Ljava/lang/String;)La/mm40;

    .line 130
    .line 131
    .line 132
    move-result-object p1

    .line 133
    new-instance v0, La/qw3;

    .line 134
    .line 135
    new-instance v2, La/jf4;

    .line 136
    .line 137
    const/16 v3, 0xe

    .line 138
    .line 139
    invoke-direct {v2, v3}, La/jf4;-><init>(B)V

    .line 140
    .line 141
    .line 142
    const/high16 v3, -0x3e800000    # -16.0f

    .line 143
    .line 144
    invoke-direct {v0, v3, v5, v2}, La/qw3;-><init>(FZLa/rw3;)V

    .line 145
    .line 146
    .line 147
    sget-object v2, La/gqw0;->m:La/xx7;

    .line 148
    .line 149
    invoke-static {v0, v2, p3, v1}, La/w5d;->a(La/sw3;La/xx7;La/fet;I)La/x5d;

    .line 150
    .line 151
    .line 152
    move-result-object v0

    .line 153
    iget-wide v1, p3, La/fet;->T:J

    .line 154
    .line 155
    invoke-static {v1, v2}, Ljava/lang/Long;->hashCode(J)I

    .line 156
    .line 157
    .line 158
    move-result v1

    .line 159
    invoke-virtual {p3}, La/fet;->m()La/bh90;

    .line 160
    .line 161
    .line 162
    move-result-object v2

    .line 163
    invoke-static {p3, p1}, La/kbc;->c0(La/fet;La/mm40;)La/mm40;

    .line 164
    .line 165
    .line 166
    move-result-object p1

    .line 167
    sget-object v3, La/mkd;->c0:La/gqw0;

    .line 168
    .line 169
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 170
    .line 171
    .line 172
    invoke-virtual {p3}, La/fet;->i0()V

    .line 173
    .line 174
    .line 175
    iget-boolean v3, p3, La/fet;->S:Z

    .line 176
    .line 177
    if-eqz v3, :cond_7

    .line 178
    .line 179
    sget-object v3, La/e7z;->u1:La/pcy;

    .line 180
    .line 181
    invoke-virtual {p3, v3}, La/fet;->l(Lkotlin/jvm/functions/Function0;)V

    .line 182
    .line 183
    .line 184
    goto :goto_1

    .line 185
    :cond_7
    invoke-virtual {p3}, La/fet;->r0()V

    .line 186
    .line 187
    .line 188
    :goto_1
    sget-object v3, La/gqw0;->x:La/shd;

    .line 189
    .line 190
    invoke-static {p3, v0, v3}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 191
    .line 192
    .line 193
    sget-object v0, La/gqw0;->w:La/shd;

    .line 194
    .line 195
    invoke-static {p3, v2, v0}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 196
    .line 197
    .line 198
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 199
    .line 200
    .line 201
    move-result-object v0

    .line 202
    sget-object v1, La/gqw0;->y:La/shd;

    .line 203
    .line 204
    invoke-static {p3, v0, v1}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 205
    .line 206
    .line 207
    invoke-static {p3}, La/jpm0;->n(La/fet;)V

    .line 208
    .line 209
    .line 210
    sget-object v0, La/gqw0;->v:La/shd;

    .line 211
    .line 212
    invoke-static {p3, p1, v0}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 213
    .line 214
    .line 215
    and-int/lit8 p1, p4, 0x70

    .line 216
    .line 217
    invoke-static {p0, p2, p3, p1}, La/wdx;->b(La/pz40;ILa/fet;I)V

    .line 218
    .line 219
    .line 220
    invoke-static {p0, p2, p3, p1}, La/wdx;->o(La/pz40;ILa/fet;I)V

    .line 221
    .line 222
    .line 223
    invoke-virtual {p3, v5}, La/fet;->r(Z)V

    .line 224
    .line 225
    .line 226
    goto :goto_2

    .line 227
    :cond_8
    invoke-virtual {p3}, La/fet;->X()V

    .line 228
    .line 229
    .line 230
    :goto_2
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 231
    .line 232
    return-object p0

    .line 233
    :pswitch_1
    check-cast p1, La/y5d;

    .line 234
    .line 235
    check-cast p2, La/mm40;

    .line 236
    .line 237
    check-cast p3, La/fet;

    .line 238
    .line 239
    check-cast p4, Ljava/lang/Integer;

    .line 240
    .line 241
    invoke-static {p4, p1, p2}, La/dw9;->d(Ljava/lang/Integer;La/y5d;La/mm40;)I

    .line 242
    .line 243
    .line 244
    move-result p1

    .line 245
    and-int/lit8 p4, p1, 0x30

    .line 246
    .line 247
    if-nez p4, :cond_a

    .line 248
    .line 249
    invoke-virtual {p3, p2}, La/fet;->g(Ljava/lang/Object;)Z

    .line 250
    .line 251
    .line 252
    move-result p4

    .line 253
    if-eqz p4, :cond_9

    .line 254
    .line 255
    move v3, v4

    .line 256
    :cond_9
    or-int/2addr p1, v3

    .line 257
    :cond_a
    and-int/lit16 p4, p1, 0x91

    .line 258
    .line 259
    if-eq p4, v2, :cond_b

    .line 260
    .line 261
    move p4, v5

    .line 262
    goto :goto_3

    .line 263
    :cond_b
    move p4, v6

    .line 264
    :goto_3
    and-int/2addr p1, v5

    .line 265
    invoke-virtual {p3, p1, p4}, La/fet;->U(IZ)Z

    .line 266
    .line 267
    .line 268
    move-result p1

    .line 269
    if-eqz p1, :cond_c

    .line 270
    .line 271
    sget-object p1, La/gzy;->a:La/zfn;

    .line 272
    .line 273
    sget-object p4, La/bmd;->n:La/zfn;

    .line 274
    .line 275
    invoke-virtual {p3, p4}, La/fet;->k(Landroidx/compose/runtime/d;)Ljava/lang/Object;

    .line 276
    .line 277
    .line 278
    move-result-object p4

    .line 279
    invoke-virtual {p1, p4}, La/zfn;->a(Ljava/lang/Object;)La/l5d0;

    .line 280
    .line 281
    .line 282
    move-result-object p1

    .line 283
    new-instance p4, La/esw;

    .line 284
    .line 285
    invoke-direct {p4, v6, p2, p0}, La/esw;-><init>(BLa/mm40;La/pz40;)V

    .line 286
    .line 287
    .line 288
    const p0, -0x663f8832

    .line 289
    .line 290
    .line 291
    invoke-static {p0, p4, p3}, La/u1c;->M(ILa/wdr;La/fet;)La/ugd;

    .line 292
    .line 293
    .line 294
    move-result-object p0

    .line 295
    const/16 p2, 0x38

    .line 296
    .line 297
    invoke-static {p1, p0, p3, p2}, La/obc;->d(La/l5d0;Lkotlin/jvm/functions/Function2;La/fet;I)V

    .line 298
    .line 299
    .line 300
    goto :goto_4

    .line 301
    :cond_c
    invoke-virtual {p3}, La/fet;->X()V

    .line 302
    .line 303
    .line 304
    :goto_4
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 305
    .line 306
    return-object p0

    .line 307
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
