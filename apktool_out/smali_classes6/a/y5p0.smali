.class public final La/y5p0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/ydr;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:Ljava/util/List;

.field public final synthetic c:La/a4x;


# direct methods
.method public synthetic constructor <init>(Ljava/util/List;La/a4x;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/y5p0;->a:B

    iput-object p1, p0, La/y5p0;->b:Ljava/util/List;

    iput-object p2, p0, La/y5p0;->c:La/a4x;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final j(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    .line 1
    iget-byte v0, p0, La/y5p0;->a:B

    .line 2
    .line 3
    iget-object v1, p0, La/y5p0;->c:La/a4x;

    .line 4
    .line 5
    iget-object p0, p0, La/y5p0;->b:Ljava/util/List;

    .line 6
    .line 7
    const/16 v2, 0x92

    .line 8
    .line 9
    const/16 v3, 0x10

    .line 10
    .line 11
    const/16 v4, 0x20

    .line 12
    .line 13
    const/4 v5, 0x2

    .line 14
    const/4 v6, 0x4

    .line 15
    const/4 v7, 0x0

    .line 16
    const/4 v8, 0x1

    .line 17
    packed-switch v0, :pswitch_data_0

    .line 18
    .line 19
    .line 20
    check-cast p1, La/g9z;

    .line 21
    .line 22
    check-cast p2, Ljava/lang/Number;

    .line 23
    .line 24
    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    .line 25
    .line 26
    .line 27
    move-result p2

    .line 28
    check-cast p3, La/fet;

    .line 29
    .line 30
    check-cast p4, Ljava/lang/Number;

    .line 31
    .line 32
    invoke-virtual {p4}, Ljava/lang/Number;->intValue()I

    .line 33
    .line 34
    .line 35
    move-result p4

    .line 36
    and-int/lit8 v0, p4, 0x6

    .line 37
    .line 38
    if-nez v0, :cond_1

    .line 39
    .line 40
    invoke-virtual {p3, p1}, La/fet;->g(Ljava/lang/Object;)Z

    .line 41
    .line 42
    .line 43
    move-result p1

    .line 44
    if-eqz p1, :cond_0

    .line 45
    .line 46
    move v5, v6

    .line 47
    :cond_0
    or-int p1, p4, v5

    .line 48
    .line 49
    goto :goto_0

    .line 50
    :cond_1
    move p1, p4

    .line 51
    :goto_0
    and-int/lit8 p4, p4, 0x30

    .line 52
    .line 53
    if-nez p4, :cond_3

    .line 54
    .line 55
    invoke-virtual {p3, p2}, La/fet;->e(I)Z

    .line 56
    .line 57
    .line 58
    move-result p4

    .line 59
    if-eqz p4, :cond_2

    .line 60
    .line 61
    move v3, v4

    .line 62
    :cond_2
    or-int/2addr p1, v3

    .line 63
    :cond_3
    and-int/lit16 p4, p1, 0x93

    .line 64
    .line 65
    if-eq p4, v2, :cond_4

    .line 66
    .line 67
    move p4, v8

    .line 68
    goto :goto_1

    .line 69
    :cond_4
    move p4, v7

    .line 70
    :goto_1
    and-int/2addr p1, v8

    .line 71
    invoke-virtual {p3, p1, p4}, La/fet;->U(IZ)Z

    .line 72
    .line 73
    .line 74
    move-result p1

    .line 75
    if-eqz p1, :cond_6

    .line 76
    .line 77
    invoke-interface {p0, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 78
    .line 79
    .line 80
    move-result-object p0

    .line 81
    check-cast p0, La/zhs0;

    .line 82
    .line 83
    const p1, 0x4d8f10c8    # 3.000302E8f

    .line 84
    .line 85
    .line 86
    invoke-virtual {p3, p1}, La/fet;->e0(I)V

    .line 87
    .line 88
    .line 89
    sget-object p1, La/qmk;->a:La/zcl;

    .line 90
    .line 91
    invoke-static {p3}, La/xfn;->a(La/fet;)La/wfn;

    .line 92
    .line 93
    .line 94
    move-result-object p1

    .line 95
    iget p1, p1, La/wfn;->d:F

    .line 96
    .line 97
    invoke-static {p3}, La/xfn;->a(La/fet;)La/wfn;

    .line 98
    .line 99
    .line 100
    move-result-object p4

    .line 101
    iget p4, p4, La/wfn;->d:F

    .line 102
    .line 103
    invoke-static {v1}, La/q3d;->i(Ljava/util/List;)I

    .line 104
    .line 105
    .line 106
    move-result v0

    .line 107
    if-ne p2, v0, :cond_5

    .line 108
    .line 109
    const/high16 p2, 0x41c00000    # 24.0f

    .line 110
    .line 111
    goto :goto_2

    .line 112
    :cond_5
    const/4 p2, 0x0

    .line 113
    :goto_2
    sget-object v0, La/jm40;->b:La/jm40;

    .line 114
    .line 115
    const/high16 v1, 0x41400000    # 12.0f

    .line 116
    .line 117
    invoke-static {v0, p1, v1, p4, p2}, La/s5x0;->M(La/mm40;FFFF)La/mm40;

    .line 118
    .line 119
    .line 120
    move-result-object p1

    .line 121
    invoke-static {p1, p0, p3, v7}, La/iom0;->d(La/mm40;La/zhs0;La/fet;I)V

    .line 122
    .line 123
    .line 124
    invoke-virtual {p3, v7}, La/fet;->r(Z)V

    .line 125
    .line 126
    .line 127
    goto :goto_3

    .line 128
    :cond_6
    invoke-virtual {p3}, La/fet;->X()V

    .line 129
    .line 130
    .line 131
    :goto_3
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 132
    .line 133
    return-object p0

    .line 134
    :pswitch_0
    check-cast p1, La/g9z;

    .line 135
    .line 136
    check-cast p2, Ljava/lang/Number;

    .line 137
    .line 138
    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    .line 139
    .line 140
    .line 141
    move-result p2

    .line 142
    check-cast p3, La/fet;

    .line 143
    .line 144
    check-cast p4, Ljava/lang/Number;

    .line 145
    .line 146
    invoke-virtual {p4}, Ljava/lang/Number;->intValue()I

    .line 147
    .line 148
    .line 149
    move-result p4

    .line 150
    and-int/lit8 v0, p4, 0x6

    .line 151
    .line 152
    if-nez v0, :cond_8

    .line 153
    .line 154
    invoke-virtual {p3, p1}, La/fet;->g(Ljava/lang/Object;)Z

    .line 155
    .line 156
    .line 157
    move-result p1

    .line 158
    if-eqz p1, :cond_7

    .line 159
    .line 160
    move v5, v6

    .line 161
    :cond_7
    or-int p1, p4, v5

    .line 162
    .line 163
    goto :goto_4

    .line 164
    :cond_8
    move p1, p4

    .line 165
    :goto_4
    and-int/lit8 p4, p4, 0x30

    .line 166
    .line 167
    if-nez p4, :cond_a

    .line 168
    .line 169
    invoke-virtual {p3, p2}, La/fet;->e(I)Z

    .line 170
    .line 171
    .line 172
    move-result p4

    .line 173
    if-eqz p4, :cond_9

    .line 174
    .line 175
    move v3, v4

    .line 176
    :cond_9
    or-int/2addr p1, v3

    .line 177
    :cond_a
    and-int/lit16 p4, p1, 0x93

    .line 178
    .line 179
    if-eq p4, v2, :cond_b

    .line 180
    .line 181
    move p4, v8

    .line 182
    goto :goto_5

    .line 183
    :cond_b
    move p4, v7

    .line 184
    :goto_5
    and-int/2addr p1, v8

    .line 185
    invoke-virtual {p3, p1, p4}, La/fet;->U(IZ)Z

    .line 186
    .line 187
    .line 188
    move-result p1

    .line 189
    if-eqz p1, :cond_f

    .line 190
    .line 191
    invoke-interface {p0, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 192
    .line 193
    .line 194
    move-result-object p0

    .line 195
    check-cast p0, La/d6p0;

    .line 196
    .line 197
    const p1, 0x35e6683c

    .line 198
    .line 199
    .line 200
    invoke-virtual {p3, p1}, La/fet;->e0(I)V

    .line 201
    .line 202
    .line 203
    invoke-static {v1}, La/q3d;->i(Ljava/util/List;)I

    .line 204
    .line 205
    .line 206
    move-result p1

    .line 207
    sget-object v0, La/jm40;->b:La/jm40;

    .line 208
    .line 209
    if-ne p2, p1, :cond_c

    .line 210
    .line 211
    sget-object p1, La/qmk;->a:La/zcl;

    .line 212
    .line 213
    const/high16 v4, 0x41e00000    # 28.0f

    .line 214
    .line 215
    const/4 v5, 0x7

    .line 216
    const/4 v1, 0x0

    .line 217
    const/4 v2, 0x0

    .line 218
    const/4 v3, 0x0

    .line 219
    invoke-static/range {v0 .. v5}, La/s5x0;->N(La/mm40;FFFFI)La/mm40;

    .line 220
    .line 221
    .line 222
    move-result-object v0

    .line 223
    :cond_c
    if-eqz p0, :cond_e

    .line 224
    .line 225
    instance-of p1, p0, La/b6p0;

    .line 226
    .line 227
    if-eqz p1, :cond_d

    .line 228
    .line 229
    const p1, 0x35eace29

    .line 230
    .line 231
    .line 232
    invoke-virtual {p3, p1}, La/fet;->e0(I)V

    .line 233
    .line 234
    .line 235
    check-cast p0, La/b6p0;

    .line 236
    .line 237
    invoke-static {v0, p0, p3, v7}, La/b34;->P(La/mm40;La/b6p0;La/fet;I)V

    .line 238
    .line 239
    .line 240
    invoke-virtual {p3, v7}, La/fet;->r(Z)V

    .line 241
    .line 242
    .line 243
    goto :goto_6

    .line 244
    :cond_d
    instance-of p1, p0, La/c6p0;

    .line 245
    .line 246
    if-eqz p1, :cond_e

    .line 247
    .line 248
    const p1, 0x35ef3265

    .line 249
    .line 250
    .line 251
    invoke-virtual {p3, p1}, La/fet;->e0(I)V

    .line 252
    .line 253
    .line 254
    check-cast p0, La/c6p0;

    .line 255
    .line 256
    invoke-static {v0, p0, p3, v7}, La/kc5;->C0(La/mm40;La/c6p0;La/fet;I)V

    .line 257
    .line 258
    .line 259
    invoke-virtual {p3, v7}, La/fet;->r(Z)V

    .line 260
    .line 261
    .line 262
    :goto_6
    invoke-virtual {p3, v7}, La/fet;->r(Z)V

    .line 263
    .line 264
    .line 265
    goto :goto_7

    .line 266
    :cond_e
    const p0, 0x9ff45b8

    .line 267
    .line 268
    .line 269
    invoke-static {p0, p3, v7}, La/b1j;->f(ILa/fet;Z)La/m460;

    .line 270
    .line 271
    .line 272
    move-result-object p0

    .line 273
    throw p0

    .line 274
    :cond_f
    invoke-virtual {p3}, La/fet;->X()V

    .line 275
    .line 276
    .line 277
    :goto_7
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 278
    .line 279
    return-object p0

    .line 280
    nop

    .line 281
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
