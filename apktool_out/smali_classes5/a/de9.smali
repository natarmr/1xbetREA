.class public final synthetic La/de9;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/mm40;

.field public final synthetic c:La/a4x;

.field public final synthetic d:Lkotlin/jvm/functions/Function1;


# direct methods
.method public synthetic constructor <init>(La/mm40;La/a4x;Lkotlin/jvm/functions/Function1;)V
    .locals 1

    .line 1
    const/4 v0, 0x6

    iput-byte v0, p0, La/de9;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/de9;->b:La/mm40;

    iput-object p2, p0, La/de9;->c:La/a4x;

    iput-object p3, p0, La/de9;->d:Lkotlin/jvm/functions/Function1;

    return-void
.end method

.method public synthetic constructor <init>(La/mm40;La/a4x;Lkotlin/jvm/functions/Function1;IB)V
    .locals 0

    .line 2
    iput-byte p5, p0, La/de9;->a:B

    iput-object p1, p0, La/de9;->b:La/mm40;

    iput-object p2, p0, La/de9;->c:La/a4x;

    iput-object p3, p0, La/de9;->d:Lkotlin/jvm/functions/Function1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 12

    .line 1
    iget-byte v0, p0, La/de9;->a:B

    .line 2
    .line 3
    const/4 v1, 0x7

    .line 4
    const/4 v2, 0x1

    .line 5
    iget-object v3, p0, La/de9;->b:La/mm40;

    .line 6
    .line 7
    iget-object v4, p0, La/de9;->d:Lkotlin/jvm/functions/Function1;

    .line 8
    .line 9
    iget-object v5, p0, La/de9;->c:La/a4x;

    .line 10
    .line 11
    packed-switch v0, :pswitch_data_0

    .line 12
    .line 13
    .line 14
    check-cast p1, La/fet;

    .line 15
    .line 16
    check-cast p2, Ljava/lang/Integer;

    .line 17
    .line 18
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 19
    .line 20
    .line 21
    invoke-static {v2}, La/x8x;->L(I)I

    .line 22
    .line 23
    .line 24
    move-result p0

    .line 25
    invoke-static {p0, p1, v5, v3, v4}, La/hfm0;->j(ILa/fet;La/a4x;La/mm40;Lkotlin/jvm/functions/Function1;)V

    .line 26
    .line 27
    .line 28
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 29
    .line 30
    return-object p0

    .line 31
    :pswitch_0
    check-cast p1, La/fet;

    .line 32
    .line 33
    check-cast p2, Ljava/lang/Integer;

    .line 34
    .line 35
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 36
    .line 37
    .line 38
    invoke-static {v2}, La/x8x;->L(I)I

    .line 39
    .line 40
    .line 41
    move-result p0

    .line 42
    invoke-static {p0, p1, v5, v3, v4}, La/afn0;->f(ILa/fet;La/a4x;La/mm40;Lkotlin/jvm/functions/Function1;)V

    .line 43
    .line 44
    .line 45
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 46
    .line 47
    return-object p0

    .line 48
    :pswitch_1
    check-cast p1, La/fet;

    .line 49
    .line 50
    check-cast p2, Ljava/lang/Integer;

    .line 51
    .line 52
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 53
    .line 54
    .line 55
    invoke-static {v1}, La/x8x;->L(I)I

    .line 56
    .line 57
    .line 58
    move-result p0

    .line 59
    invoke-static {p0, p1, v5, v3, v4}, La/ju70;->F(ILa/fet;La/a4x;La/mm40;Lkotlin/jvm/functions/Function1;)V

    .line 60
    .line 61
    .line 62
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 63
    .line 64
    return-object p0

    .line 65
    :pswitch_2
    check-cast p1, La/fet;

    .line 66
    .line 67
    check-cast p2, Ljava/lang/Integer;

    .line 68
    .line 69
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 70
    .line 71
    .line 72
    invoke-static {v1}, La/x8x;->L(I)I

    .line 73
    .line 74
    .line 75
    move-result p0

    .line 76
    invoke-static {p0, p1, v5, v3, v4}, La/y860;->S(ILa/fet;La/a4x;La/mm40;Lkotlin/jvm/functions/Function1;)V

    .line 77
    .line 78
    .line 79
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 80
    .line 81
    return-object p0

    .line 82
    :pswitch_3
    move-object v9, p1

    .line 83
    check-cast v9, La/fet;

    .line 84
    .line 85
    check-cast p2, Ljava/lang/Integer;

    .line 86
    .line 87
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 88
    .line 89
    .line 90
    move-result p1

    .line 91
    and-int/lit8 p2, p1, 0x3

    .line 92
    .line 93
    const/4 v0, 0x2

    .line 94
    if-eq p2, v0, :cond_0

    .line 95
    .line 96
    move p2, v2

    .line 97
    goto :goto_0

    .line 98
    :cond_0
    const/4 p2, 0x0

    .line 99
    :goto_0
    and-int/2addr p1, v2

    .line 100
    invoke-virtual {v9, p1, p2}, La/fet;->U(IZ)Z

    .line 101
    .line 102
    .line 103
    move-result p1

    .line 104
    if-eqz p1, :cond_3

    .line 105
    .line 106
    invoke-static {v9}, La/xfn;->a(La/fet;)La/wfn;

    .line 107
    .line 108
    .line 109
    move-result-object p1

    .line 110
    iget p1, p1, La/wfn;->d:F

    .line 111
    .line 112
    invoke-static {v9}, La/xfn;->a(La/fet;)La/wfn;

    .line 113
    .line 114
    .line 115
    move-result-object p2

    .line 116
    iget p2, p2, La/wfn;->d:F

    .line 117
    .line 118
    sget-object v1, La/qmk;->a:La/zcl;

    .line 119
    .line 120
    const/high16 v1, 0x41c00000    # 24.0f

    .line 121
    .line 122
    const/4 v2, 0x0

    .line 123
    invoke-static {p1, v2, p2, v1, v0}, La/s5x0;->u(FFFFI)La/lh80;

    .line 124
    .line 125
    .line 126
    move-result-object p1

    .line 127
    invoke-static {p1, v9}, La/knm0;->f(La/hh80;La/fet;)La/ch80;

    .line 128
    .line 129
    .line 130
    move-result-object v2

    .line 131
    invoke-virtual {v9, v5}, La/fet;->g(Ljava/lang/Object;)Z

    .line 132
    .line 133
    .line 134
    move-result p1

    .line 135
    invoke-virtual {v9, v4}, La/fet;->g(Ljava/lang/Object;)Z

    .line 136
    .line 137
    .line 138
    move-result p2

    .line 139
    or-int/2addr p1, p2

    .line 140
    invoke-virtual {v9}, La/fet;->P()Ljava/lang/Object;

    .line 141
    .line 142
    .line 143
    move-result-object p2

    .line 144
    if-nez p1, :cond_1

    .line 145
    .line 146
    sget-object p1, La/ukd;->a:La/cl5;

    .line 147
    .line 148
    if-ne p2, p1, :cond_2

    .line 149
    .line 150
    :cond_1
    new-instance p2, La/or0;

    .line 151
    .line 152
    const/16 p1, 0x1d

    .line 153
    .line 154
    invoke-direct {p2, v5, v4, p1}, La/or0;-><init>(La/a4x;Lkotlin/jvm/functions/Function1;B)V

    .line 155
    .line 156
    .line 157
    invoke-virtual {v9, p2}, La/fet;->o0(Ljava/lang/Object;)V

    .line 158
    .line 159
    .line 160
    :cond_2
    move-object v8, p2

    .line 161
    check-cast v8, Lkotlin/jvm/functions/Function1;

    .line 162
    .line 163
    const/4 v10, 0x0

    .line 164
    const/16 v11, 0x1fa

    .line 165
    .line 166
    iget-object v0, p0, La/de9;->b:La/mm40;

    .line 167
    .line 168
    const/4 v1, 0x0

    .line 169
    const/4 v3, 0x0

    .line 170
    const/4 v4, 0x0

    .line 171
    const/4 v5, 0x0

    .line 172
    const/4 v6, 0x0

    .line 173
    const/4 v7, 0x0

    .line 174
    invoke-static/range {v0 .. v11}, La/b8k0;->e(La/mm40;La/xcz;La/hh80;La/sw3;La/xx7;La/qkq;ZLa/vf80;Lkotlin/jvm/functions/Function1;La/fet;II)V

    .line 175
    .line 176
    .line 177
    goto :goto_1

    .line 178
    :cond_3
    invoke-virtual {v9}, La/fet;->X()V

    .line 179
    .line 180
    .line 181
    :goto_1
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 182
    .line 183
    return-object p0

    .line 184
    :pswitch_4
    check-cast p1, La/fet;

    .line 185
    .line 186
    check-cast p2, Ljava/lang/Integer;

    .line 187
    .line 188
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 189
    .line 190
    .line 191
    invoke-static {v1}, La/x8x;->L(I)I

    .line 192
    .line 193
    .line 194
    move-result p0

    .line 195
    invoke-static {p0, p1, v5, v3, v4}, La/wdx;->q(ILa/fet;La/a4x;La/mm40;Lkotlin/jvm/functions/Function1;)V

    .line 196
    .line 197
    .line 198
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 199
    .line 200
    return-object p0

    .line 201
    :pswitch_5
    check-cast p1, La/fet;

    .line 202
    .line 203
    check-cast p2, Ljava/lang/Integer;

    .line 204
    .line 205
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 206
    .line 207
    .line 208
    invoke-static {v2}, La/x8x;->L(I)I

    .line 209
    .line 210
    .line 211
    move-result p0

    .line 212
    invoke-static {p0, p1, v5, v3, v4}, La/s0x;->a(ILa/fet;La/a4x;La/mm40;Lkotlin/jvm/functions/Function1;)V

    .line 213
    .line 214
    .line 215
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 216
    .line 217
    return-object p0

    .line 218
    :pswitch_6
    check-cast p1, La/fet;

    .line 219
    .line 220
    check-cast p2, Ljava/lang/Integer;

    .line 221
    .line 222
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 223
    .line 224
    .line 225
    invoke-static {v2}, La/x8x;->L(I)I

    .line 226
    .line 227
    .line 228
    move-result p0

    .line 229
    invoke-static {p0, p1, v5, v3, v4}, La/q0x;->g(ILa/fet;La/a4x;La/mm40;Lkotlin/jvm/functions/Function1;)V

    .line 230
    .line 231
    .line 232
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 233
    .line 234
    return-object p0

    .line 235
    :pswitch_7
    check-cast p1, La/fet;

    .line 236
    .line 237
    check-cast p2, Ljava/lang/Integer;

    .line 238
    .line 239
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 240
    .line 241
    .line 242
    invoke-static {v2}, La/x8x;->L(I)I

    .line 243
    .line 244
    .line 245
    move-result p0

    .line 246
    invoke-static {p0, p1, v5, v3, v4}, La/p8a;->C(ILa/fet;La/a4x;La/mm40;Lkotlin/jvm/functions/Function1;)V

    .line 247
    .line 248
    .line 249
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 250
    .line 251
    return-object p0

    .line 252
    :pswitch_8
    check-cast p1, La/fet;

    .line 253
    .line 254
    check-cast p2, Ljava/lang/Integer;

    .line 255
    .line 256
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 257
    .line 258
    .line 259
    invoke-static {v2}, La/x8x;->L(I)I

    .line 260
    .line 261
    .line 262
    move-result p0

    .line 263
    invoke-static {p0, p1, v5, v3, v4}, La/hic;->a(ILa/fet;La/a4x;La/mm40;Lkotlin/jvm/functions/Function1;)V

    .line 264
    .line 265
    .line 266
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 267
    .line 268
    return-object p0

    .line 269
    :pswitch_9
    check-cast p1, La/fet;

    .line 270
    .line 271
    check-cast p2, Ljava/lang/Integer;

    .line 272
    .line 273
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 274
    .line 275
    .line 276
    invoke-static {v2}, La/x8x;->L(I)I

    .line 277
    .line 278
    .line 279
    move-result p0

    .line 280
    invoke-static {p0, p1, v5, v3, v4}, La/j120;->j(ILa/fet;La/a4x;La/mm40;Lkotlin/jvm/functions/Function1;)V

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
