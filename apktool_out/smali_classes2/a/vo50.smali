.class public final synthetic La/vo50;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/ydr;


# instance fields
.field public final synthetic a:La/kwj;

.field public final synthetic b:I

.field public final synthetic c:Ljava/util/ArrayList;

.field public final synthetic d:I

.field public final synthetic e:Lkotlin/jvm/functions/Function2;

.field public final synthetic f:Lkotlin/jvm/functions/Function2;


# direct methods
.method public synthetic constructor <init>(La/kwj;ILjava/util/ArrayList;ILkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/vo50;->a:La/kwj;

    iput p2, p0, La/vo50;->b:I

    iput-object p3, p0, La/vo50;->c:Ljava/util/ArrayList;

    iput p4, p0, La/vo50;->d:I

    iput-object p5, p0, La/vo50;->e:Lkotlin/jvm/functions/Function2;

    iput-object p6, p0, La/vo50;->f:Lkotlin/jvm/functions/Function2;

    return-void
.end method


# virtual methods
.method public final j(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    .line 1
    check-cast p1, La/rk80;

    .line 2
    .line 3
    check-cast p2, Ljava/lang/Integer;

    .line 4
    .line 5
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 6
    .line 7
    .line 8
    move-result p2

    .line 9
    move-object v4, p3

    .line 10
    check-cast v4, La/fet;

    .line 11
    .line 12
    check-cast p4, Ljava/lang/Integer;

    .line 13
    .line 14
    invoke-virtual {p4}, Ljava/lang/Integer;->intValue()I

    .line 15
    .line 16
    .line 17
    move-result p3

    .line 18
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 19
    .line 20
    .line 21
    and-int/lit8 p1, p3, 0x30

    .line 22
    .line 23
    if-nez p1, :cond_1

    .line 24
    .line 25
    invoke-virtual {v4, p2}, La/fet;->e(I)Z

    .line 26
    .line 27
    .line 28
    move-result p1

    .line 29
    if-eqz p1, :cond_0

    .line 30
    .line 31
    const/16 p1, 0x20

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_0
    const/16 p1, 0x10

    .line 35
    .line 36
    :goto_0
    or-int/2addr p3, p1

    .line 37
    :cond_1
    and-int/lit16 p1, p3, 0x91

    .line 38
    .line 39
    const/16 p4, 0x90

    .line 40
    .line 41
    const/4 v0, 0x0

    .line 42
    const/4 v1, 0x1

    .line 43
    if-eq p1, p4, :cond_2

    .line 44
    .line 45
    move p1, v1

    .line 46
    goto :goto_1

    .line 47
    :cond_2
    move p1, v0

    .line 48
    :goto_1
    and-int/2addr p3, v1

    .line 49
    invoke-virtual {v4, p3, p1}, La/fet;->U(IZ)Z

    .line 50
    .line 51
    .line 52
    move-result p1

    .line 53
    if-eqz p1, :cond_c

    .line 54
    .line 55
    iget-object p1, p0, La/vo50;->a:La/kwj;

    .line 56
    .line 57
    invoke-virtual {p1}, La/xk80;->k()I

    .line 58
    .line 59
    .line 60
    move-result p3

    .line 61
    sub-int/2addr p3, p2

    .line 62
    int-to-float p3, p3

    .line 63
    invoke-virtual {p1}, La/xk80;->l()F

    .line 64
    .line 65
    .line 66
    move-result p1

    .line 67
    add-float/2addr p1, p3

    .line 68
    iget p3, p0, La/vo50;->b:I

    .line 69
    .line 70
    if-nez p3, :cond_3

    .line 71
    .line 72
    :goto_2
    move p2, v0

    .line 73
    goto :goto_3

    .line 74
    :cond_3
    rem-int/2addr p2, p3

    .line 75
    add-int/2addr p2, p3

    .line 76
    rem-int v0, p2, p3

    .line 77
    .line 78
    goto :goto_2

    .line 79
    :goto_3
    iget-object p3, p0, La/vo50;->c:Ljava/util/ArrayList;

    .line 80
    .line 81
    invoke-virtual {p3, p2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 82
    .line 83
    .line 84
    move-result-object p3

    .line 85
    check-cast p3, La/it50;

    .line 86
    .line 87
    invoke-static {p1}, Ljava/lang/Math;->abs(F)F

    .line 88
    .line 89
    .line 90
    move-result p4

    .line 91
    const/4 v0, 0x0

    .line 92
    const/high16 v2, 0x3f800000    # 1.0f

    .line 93
    .line 94
    invoke-static {p4, v0, v2}, La/l1e0;->c(FFF)F

    .line 95
    .line 96
    .line 97
    move-result p4

    .line 98
    sub-float p4, v2, p4

    .line 99
    .line 100
    const v3, 0x3fcccccd    # 1.6f

    .line 101
    .line 102
    .line 103
    invoke-static {v3, v2, p4}, La/l7x;->O(FFF)F

    .line 104
    .line 105
    .line 106
    move-result p4

    .line 107
    sget-object v3, La/bmd;->n:La/zfn;

    .line 108
    .line 109
    invoke-virtual {v4, v3}, La/fet;->k(Landroidx/compose/runtime/d;)Ljava/lang/Object;

    .line 110
    .line 111
    .line 112
    move-result-object v3

    .line 113
    sget-object v5, La/k6z;->b:La/k6z;

    .line 114
    .line 115
    const/high16 v6, -0x40800000    # -1.0f

    .line 116
    .line 117
    if-ne v3, v5, :cond_4

    .line 118
    .line 119
    move v3, v2

    .line 120
    goto :goto_4

    .line 121
    :cond_4
    move v3, v6

    .line 122
    :goto_4
    iget v5, p0, La/vo50;->d:I

    .line 123
    .line 124
    int-to-float v5, v5

    .line 125
    sub-float v7, p4, v2

    .line 126
    .line 127
    mul-float/2addr v7, v5

    .line 128
    const/high16 v5, 0x40000000    # 2.0f

    .line 129
    .line 130
    div-float/2addr v7, v5

    .line 131
    mul-float/2addr v7, v3

    .line 132
    cmpl-float p1, p1, v0

    .line 133
    .line 134
    if-lez p1, :cond_5

    .line 135
    .line 136
    goto :goto_5

    .line 137
    :cond_5
    move v2, v6

    .line 138
    :goto_5
    mul-float p1, v7, v2

    .line 139
    .line 140
    sget-object v0, La/o7k0;->c:La/n0q;

    .line 141
    .line 142
    iget-object v2, p0, La/vo50;->e:Lkotlin/jvm/functions/Function2;

    .line 143
    .line 144
    invoke-virtual {v4, v2}, La/fet;->g(Ljava/lang/Object;)Z

    .line 145
    .line 146
    .line 147
    move-result v3

    .line 148
    invoke-virtual {v4, p3}, La/fet;->i(Ljava/lang/Object;)Z

    .line 149
    .line 150
    .line 151
    move-result v5

    .line 152
    or-int/2addr v3, v5

    .line 153
    invoke-virtual {v4}, La/fet;->P()Ljava/lang/Object;

    .line 154
    .line 155
    .line 156
    move-result-object v5

    .line 157
    sget-object v9, La/ukd;->a:La/cl5;

    .line 158
    .line 159
    if-nez v3, :cond_6

    .line 160
    .line 161
    if-ne v5, v9, :cond_7

    .line 162
    .line 163
    :cond_6
    new-instance v5, La/uo50;

    .line 164
    .line 165
    invoke-direct {v5, v2, p3, v1}, La/uo50;-><init>(Lkotlin/jvm/functions/Function2;La/it50;B)V

    .line 166
    .line 167
    .line 168
    invoke-virtual {v4, v5}, La/fet;->o0(Ljava/lang/Object;)V

    .line 169
    .line 170
    .line 171
    :cond_7
    check-cast v5, Lkotlin/jvm/functions/Function0;

    .line 172
    .line 173
    const/16 v7, 0x6186

    .line 174
    .line 175
    const/4 v8, 0x5

    .line 176
    const/4 v1, 0x0

    .line 177
    const/4 v2, 0x0

    .line 178
    const/4 v3, 0x0

    .line 179
    move-object v6, v4

    .line 180
    const/4 v4, 0x0

    .line 181
    invoke-static/range {v0 .. v8}, La/phu0;->F(La/mm40;La/ymx;La/d6x;ZLa/gy40;Lkotlin/jvm/functions/Function0;La/fet;II)La/mm40;

    .line 182
    .line 183
    .line 184
    move-result-object v0

    .line 185
    invoke-virtual {v6, p4}, La/fet;->d(F)Z

    .line 186
    .line 187
    .line 188
    move-result v1

    .line 189
    invoke-virtual {v6, p1}, La/fet;->d(F)Z

    .line 190
    .line 191
    .line 192
    move-result v2

    .line 193
    or-int/2addr v1, v2

    .line 194
    invoke-virtual {v6}, La/fet;->P()Ljava/lang/Object;

    .line 195
    .line 196
    .line 197
    move-result-object v2

    .line 198
    if-nez v1, :cond_8

    .line 199
    .line 200
    if-ne v2, v9, :cond_9

    .line 201
    .line 202
    :cond_8
    new-instance v2, La/ih10;

    .line 203
    .line 204
    const/4 v1, 0x5

    .line 205
    invoke-direct {v2, p4, p1, v1}, La/ih10;-><init>(FFB)V

    .line 206
    .line 207
    .line 208
    invoke-virtual {v6, v2}, La/fet;->o0(Ljava/lang/Object;)V

    .line 209
    .line 210
    .line 211
    :cond_9
    check-cast v2, Lkotlin/jvm/functions/Function1;

    .line 212
    .line 213
    invoke-static {v0, v2}, La/i4w0;->T(La/mm40;Lkotlin/jvm/functions/Function1;)La/mm40;

    .line 214
    .line 215
    .line 216
    move-result-object v0

    .line 217
    iget-object v1, p3, La/it50;->e:La/wyq0;

    .line 218
    .line 219
    iget-object p0, p0, La/vo50;->f:Lkotlin/jvm/functions/Function2;

    .line 220
    .line 221
    invoke-virtual {v6, p0}, La/fet;->g(Ljava/lang/Object;)Z

    .line 222
    .line 223
    .line 224
    move-result p1

    .line 225
    invoke-virtual {v6, p3}, La/fet;->i(Ljava/lang/Object;)Z

    .line 226
    .line 227
    .line 228
    move-result p4

    .line 229
    or-int/2addr p1, p4

    .line 230
    invoke-virtual {v6}, La/fet;->P()Ljava/lang/Object;

    .line 231
    .line 232
    .line 233
    move-result-object p4

    .line 234
    if-nez p1, :cond_a

    .line 235
    .line 236
    if-ne p4, v9, :cond_b

    .line 237
    .line 238
    :cond_a
    new-instance p4, La/rw40;

    .line 239
    .line 240
    const/16 p1, 0xc

    .line 241
    .line 242
    invoke-direct {p4, p0, p3, p1}, La/rw40;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 243
    .line 244
    .line 245
    invoke-virtual {v6, p4}, La/fet;->o0(Ljava/lang/Object;)V

    .line 246
    .line 247
    .line 248
    :cond_b
    move-object v3, p4

    .line 249
    check-cast v3, Lkotlin/jvm/functions/Function1;

    .line 250
    .line 251
    const/4 v5, 0x0

    .line 252
    move v2, p2

    .line 253
    move-object v4, v6

    .line 254
    invoke-static/range {v0 .. v5}, La/lv00;->O(La/mm40;La/wyq0;ILkotlin/jvm/functions/Function1;La/fet;I)V

    .line 255
    .line 256
    .line 257
    goto :goto_6

    .line 258
    :cond_c
    move-object v6, v4

    .line 259
    invoke-virtual {v6}, La/fet;->X()V

    .line 260
    .line 261
    .line 262
    :goto_6
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 263
    .line 264
    return-object p0
.end method
