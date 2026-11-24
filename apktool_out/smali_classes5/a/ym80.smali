.class public final synthetic La/ym80;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/w6n;

.field public final synthetic c:La/j5a0;

.field public final synthetic d:Lkotlin/jvm/functions/Function2;


# direct methods
.method public synthetic constructor <init>(La/w6n;La/j5a0;Lkotlin/jvm/functions/Function2;B)V
    .locals 0

    .line 1
    iput-byte p4, p0, La/ym80;->a:B

    iput-object p1, p0, La/ym80;->b:La/w6n;

    iput-object p2, p0, La/ym80;->c:La/j5a0;

    iput-object p3, p0, La/ym80;->d:Lkotlin/jvm/functions/Function2;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    .line 1
    iget-byte v0, p0, La/ym80;->a:B

    .line 2
    .line 3
    sget-object v1, La/ukd;->a:La/cl5;

    .line 4
    .line 5
    const-string v2, "FAVORITE_ICON"

    .line 6
    .line 7
    const/4 v3, 0x2

    .line 8
    const/4 v4, 0x0

    .line 9
    const/4 v5, 0x1

    .line 10
    iget-object v6, p0, La/ym80;->d:Lkotlin/jvm/functions/Function2;

    .line 11
    .line 12
    iget-object v7, p0, La/ym80;->c:La/j5a0;

    .line 13
    .line 14
    iget-object p0, p0, La/ym80;->b:La/w6n;

    .line 15
    .line 16
    check-cast p1, La/fet;

    .line 17
    .line 18
    check-cast p2, Ljava/lang/Integer;

    .line 19
    .line 20
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 21
    .line 22
    .line 23
    move-result p2

    .line 24
    packed-switch v0, :pswitch_data_0

    .line 25
    .line 26
    .line 27
    and-int/lit8 v0, p2, 0x3

    .line 28
    .line 29
    if-eq v0, v3, :cond_0

    .line 30
    .line 31
    move v0, v5

    .line 32
    goto :goto_0

    .line 33
    :cond_0
    move v0, v4

    .line 34
    :goto_0
    and-int/2addr p2, v5

    .line 35
    invoke-virtual {p1, p2, v0}, La/fet;->U(IZ)Z

    .line 36
    .line 37
    .line 38
    move-result p2

    .line 39
    if-eqz p2, :cond_3

    .line 40
    .line 41
    check-cast v7, La/a5a0;

    .line 42
    .line 43
    iget-object p2, v7, La/a5a0;->d:La/cap;

    .line 44
    .line 45
    sget-object v0, La/gap;->a:La/zfn;

    .line 46
    .line 47
    invoke-virtual {p1, v0}, La/fet;->k(Landroidx/compose/runtime/d;)Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    check-cast v0, La/k6z;

    .line 52
    .line 53
    invoke-static {p0, p2, v0}, La/gap;->b(La/w6n;La/cap;La/k6z;)La/mm40;

    .line 54
    .line 55
    .line 56
    move-result-object p0

    .line 57
    invoke-static {p0, v2}, La/mrv;->k0(La/mm40;Ljava/lang/Object;)La/mm40;

    .line 58
    .line 59
    .line 60
    move-result-object p0

    .line 61
    if-nez v6, :cond_2

    .line 62
    .line 63
    const p2, -0x585e794d

    .line 64
    .line 65
    .line 66
    invoke-virtual {p1, p2}, La/fet;->e0(I)V

    .line 67
    .line 68
    .line 69
    invoke-virtual {p1}, La/fet;->P()Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    move-result-object p2

    .line 73
    if-ne p2, v1, :cond_1

    .line 74
    .line 75
    new-instance p2, La/ogj0;

    .line 76
    .line 77
    const/16 v0, 0x1a

    .line 78
    .line 79
    invoke-direct {p2, v0}, La/ogj0;-><init>(B)V

    .line 80
    .line 81
    .line 82
    invoke-virtual {p1, p2}, La/fet;->o0(Ljava/lang/Object;)V

    .line 83
    .line 84
    .line 85
    :cond_1
    move-object v6, p2

    .line 86
    check-cast v6, Lkotlin/jvm/functions/Function2;

    .line 87
    .line 88
    :goto_1
    invoke-virtual {p1, v4}, La/fet;->r(Z)V

    .line 89
    .line 90
    .line 91
    goto :goto_2

    .line 92
    :cond_2
    const p2, 0xdaa5cc3

    .line 93
    .line 94
    .line 95
    invoke-virtual {p1, p2}, La/fet;->e0(I)V

    .line 96
    .line 97
    .line 98
    goto :goto_1

    .line 99
    :goto_2
    invoke-static {p0, v7, v6, p1, v4}, La/xkb;->t(La/mm40;La/a5a0;Lkotlin/jvm/functions/Function2;La/fet;I)V

    .line 100
    .line 101
    .line 102
    goto :goto_3

    .line 103
    :cond_3
    invoke-virtual {p1}, La/fet;->X()V

    .line 104
    .line 105
    .line 106
    :goto_3
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 107
    .line 108
    return-object p0

    .line 109
    :pswitch_0
    and-int/lit8 v0, p2, 0x3

    .line 110
    .line 111
    if-eq v0, v3, :cond_4

    .line 112
    .line 113
    move v0, v5

    .line 114
    goto :goto_4

    .line 115
    :cond_4
    move v0, v4

    .line 116
    :goto_4
    and-int/2addr p2, v5

    .line 117
    invoke-virtual {p1, p2, v0}, La/fet;->U(IZ)Z

    .line 118
    .line 119
    .line 120
    move-result p2

    .line 121
    if-eqz p2, :cond_7

    .line 122
    .line 123
    check-cast v7, La/a5a0;

    .line 124
    .line 125
    iget-object p2, v7, La/a5a0;->d:La/cap;

    .line 126
    .line 127
    sget-object v0, La/gap;->a:La/zfn;

    .line 128
    .line 129
    invoke-virtual {p1, v0}, La/fet;->k(Landroidx/compose/runtime/d;)Ljava/lang/Object;

    .line 130
    .line 131
    .line 132
    move-result-object v0

    .line 133
    check-cast v0, La/k6z;

    .line 134
    .line 135
    invoke-static {p0, p2, v0}, La/gap;->b(La/w6n;La/cap;La/k6z;)La/mm40;

    .line 136
    .line 137
    .line 138
    move-result-object p0

    .line 139
    invoke-static {p0, v2}, La/mrv;->k0(La/mm40;Ljava/lang/Object;)La/mm40;

    .line 140
    .line 141
    .line 142
    move-result-object p0

    .line 143
    if-nez v6, :cond_6

    .line 144
    .line 145
    const p2, -0x606aacb9

    .line 146
    .line 147
    .line 148
    invoke-virtual {p1, p2}, La/fet;->e0(I)V

    .line 149
    .line 150
    .line 151
    invoke-virtual {p1}, La/fet;->P()Ljava/lang/Object;

    .line 152
    .line 153
    .line 154
    move-result-object p2

    .line 155
    if-ne p2, v1, :cond_5

    .line 156
    .line 157
    new-instance p2, La/zc70;

    .line 158
    .line 159
    const/16 v0, 0x14

    .line 160
    .line 161
    invoke-direct {p2, v0}, La/zc70;-><init>(B)V

    .line 162
    .line 163
    .line 164
    invoke-virtual {p1, p2}, La/fet;->o0(Ljava/lang/Object;)V

    .line 165
    .line 166
    .line 167
    :cond_5
    move-object v6, p2

    .line 168
    check-cast v6, Lkotlin/jvm/functions/Function2;

    .line 169
    .line 170
    :goto_5
    invoke-virtual {p1, v4}, La/fet;->r(Z)V

    .line 171
    .line 172
    .line 173
    goto :goto_6

    .line 174
    :cond_6
    const p2, 0x7080adaf

    .line 175
    .line 176
    .line 177
    invoke-virtual {p1, p2}, La/fet;->e0(I)V

    .line 178
    .line 179
    .line 180
    goto :goto_5

    .line 181
    :goto_6
    invoke-static {p0, v7, v6, p1, v4}, La/xkb;->t(La/mm40;La/a5a0;Lkotlin/jvm/functions/Function2;La/fet;I)V

    .line 182
    .line 183
    .line 184
    goto :goto_7

    .line 185
    :cond_7
    invoke-virtual {p1}, La/fet;->X()V

    .line 186
    .line 187
    .line 188
    :goto_7
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 189
    .line 190
    return-object p0

    .line 191
    :pswitch_1
    and-int/lit8 v0, p2, 0x3

    .line 192
    .line 193
    if-eq v0, v3, :cond_8

    .line 194
    .line 195
    move v0, v5

    .line 196
    goto :goto_8

    .line 197
    :cond_8
    move v0, v4

    .line 198
    :goto_8
    and-int/2addr p2, v5

    .line 199
    invoke-virtual {p1, p2, v0}, La/fet;->U(IZ)Z

    .line 200
    .line 201
    .line 202
    move-result p2

    .line 203
    if-eqz p2, :cond_b

    .line 204
    .line 205
    check-cast v7, La/a5a0;

    .line 206
    .line 207
    iget-object p2, v7, La/a5a0;->d:La/cap;

    .line 208
    .line 209
    sget-object v0, La/gap;->a:La/zfn;

    .line 210
    .line 211
    invoke-virtual {p1, v0}, La/fet;->k(Landroidx/compose/runtime/d;)Ljava/lang/Object;

    .line 212
    .line 213
    .line 214
    move-result-object v0

    .line 215
    check-cast v0, La/k6z;

    .line 216
    .line 217
    invoke-static {p0, p2, v0}, La/gap;->b(La/w6n;La/cap;La/k6z;)La/mm40;

    .line 218
    .line 219
    .line 220
    move-result-object p0

    .line 221
    invoke-static {p0, v2}, La/mrv;->k0(La/mm40;Ljava/lang/Object;)La/mm40;

    .line 222
    .line 223
    .line 224
    move-result-object p0

    .line 225
    if-nez v6, :cond_a

    .line 226
    .line 227
    const p2, -0x56676c30

    .line 228
    .line 229
    .line 230
    invoke-virtual {p1, p2}, La/fet;->e0(I)V

    .line 231
    .line 232
    .line 233
    invoke-virtual {p1}, La/fet;->P()Ljava/lang/Object;

    .line 234
    .line 235
    .line 236
    move-result-object p2

    .line 237
    if-ne p2, v1, :cond_9

    .line 238
    .line 239
    new-instance p2, La/zc70;

    .line 240
    .line 241
    const/16 v0, 0x15

    .line 242
    .line 243
    invoke-direct {p2, v0}, La/zc70;-><init>(B)V

    .line 244
    .line 245
    .line 246
    invoke-virtual {p1, p2}, La/fet;->o0(Ljava/lang/Object;)V

    .line 247
    .line 248
    .line 249
    :cond_9
    move-object v6, p2

    .line 250
    check-cast v6, Lkotlin/jvm/functions/Function2;

    .line 251
    .line 252
    :goto_9
    invoke-virtual {p1, v4}, La/fet;->r(Z)V

    .line 253
    .line 254
    .line 255
    goto :goto_a

    .line 256
    :cond_a
    const p2, 0x1e3eb806

    .line 257
    .line 258
    .line 259
    invoke-virtual {p1, p2}, La/fet;->e0(I)V

    .line 260
    .line 261
    .line 262
    goto :goto_9

    .line 263
    :goto_a
    invoke-static {p0, v7, v6, p1, v4}, La/xkb;->t(La/mm40;La/a5a0;Lkotlin/jvm/functions/Function2;La/fet;I)V

    .line 264
    .line 265
    .line 266
    goto :goto_b

    .line 267
    :cond_b
    invoke-virtual {p1}, La/fet;->X()V

    .line 268
    .line 269
    .line 270
    :goto_b
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 271
    .line 272
    return-object p0

    .line 273
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
