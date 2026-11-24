.class public final synthetic La/gp;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/xdr;


# instance fields
.field public final synthetic a:La/hh80;

.field public final synthetic b:I

.field public final synthetic c:F

.field public final synthetic d:F

.field public final synthetic e:La/ugd;


# direct methods
.method public synthetic constructor <init>(La/hh80;IFFLa/ugd;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/gp;->a:La/hh80;

    iput p2, p0, La/gp;->b:I

    iput p3, p0, La/gp;->c:F

    iput p4, p0, La/gp;->d:F

    iput-object p5, p0, La/gp;->e:La/ugd;

    return-void
.end method


# virtual methods
.method public final F(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    .line 1
    check-cast p1, La/lr8;

    .line 2
    .line 3
    check-cast p2, La/fet;

    .line 4
    .line 5
    check-cast p3, Ljava/lang/Integer;

    .line 6
    .line 7
    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    .line 8
    .line 9
    .line 10
    move-result p3

    .line 11
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    and-int/lit8 v0, p3, 0x6

    .line 15
    .line 16
    if-nez v0, :cond_1

    .line 17
    .line 18
    invoke-virtual {p2, p1}, La/fet;->g(Ljava/lang/Object;)Z

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    if-eqz v0, :cond_0

    .line 23
    .line 24
    const/4 v0, 0x4

    .line 25
    goto :goto_0

    .line 26
    :cond_0
    const/4 v0, 0x2

    .line 27
    :goto_0
    or-int/2addr p3, v0

    .line 28
    :cond_1
    and-int/lit8 v0, p3, 0x13

    .line 29
    .line 30
    const/16 v1, 0x12

    .line 31
    .line 32
    const/4 v2, 0x0

    .line 33
    const/4 v3, 0x1

    .line 34
    if-eq v0, v1, :cond_2

    .line 35
    .line 36
    move v0, v3

    .line 37
    goto :goto_1

    .line 38
    :cond_2
    move v0, v2

    .line 39
    :goto_1
    and-int/2addr p3, v3

    .line 40
    invoke-virtual {p2, p3, v0}, La/fet;->U(IZ)Z

    .line 41
    .line 42
    .line 43
    move-result p3

    .line 44
    if-eqz p3, :cond_7

    .line 45
    .line 46
    sget-object p3, La/bmd;->n:La/zfn;

    .line 47
    .line 48
    invoke-virtual {p2, p3}, La/fet;->k(Landroidx/compose/runtime/d;)Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    move-result-object p3

    .line 52
    check-cast p3, La/k6z;

    .line 53
    .line 54
    iget-object v0, p0, La/gp;->a:La/hh80;

    .line 55
    .line 56
    invoke-static {v0, p3}, La/s5x0;->B(La/hh80;La/k6z;)F

    .line 57
    .line 58
    .line 59
    move-result v1

    .line 60
    invoke-static {v0, p3}, La/s5x0;->A(La/hh80;La/k6z;)F

    .line 61
    .line 62
    .line 63
    move-result p3

    .line 64
    add-float/2addr p3, v1

    .line 65
    invoke-virtual {p1}, La/lr8;->d()F

    .line 66
    .line 67
    .line 68
    move-result p1

    .line 69
    sub-float/2addr p1, p3

    .line 70
    iget p3, p0, La/gp;->b:I

    .line 71
    .line 72
    int-to-float v1, p3

    .line 73
    div-float v4, p1, v1

    .line 74
    .line 75
    new-instance v5, La/ycl;

    .line 76
    .line 77
    invoke-direct {v5, v4}, La/ycl;-><init>(F)V

    .line 78
    .line 79
    .line 80
    new-instance v4, La/ycl;

    .line 81
    .line 82
    iget v6, p0, La/gp;->c:F

    .line 83
    .line 84
    invoke-direct {v4, v6}, La/ycl;-><init>(F)V

    .line 85
    .line 86
    .line 87
    new-instance v6, La/ycl;

    .line 88
    .line 89
    iget v7, p0, La/gp;->d:F

    .line 90
    .line 91
    invoke-direct {v6, v7}, La/ycl;-><init>(F)V

    .line 92
    .line 93
    .line 94
    invoke-static {v5, v4, v6}, La/l1e0;->h(Ljava/lang/Comparable;Ljava/lang/Comparable;Ljava/lang/Comparable;)Ljava/lang/Comparable;

    .line 95
    .line 96
    .line 97
    move-result-object v4

    .line 98
    check-cast v4, La/ycl;

    .line 99
    .line 100
    iget v4, v4, La/ycl;->a:F

    .line 101
    .line 102
    mul-float/2addr v1, v4

    .line 103
    sub-float/2addr p1, v1

    .line 104
    const/4 v1, 0x0

    .line 105
    if-le p3, v3, :cond_3

    .line 106
    .line 107
    sget-object v5, La/qmk;->a:La/zcl;

    .line 108
    .line 109
    invoke-static {p1, v1}, La/ycl;->a(FF)I

    .line 110
    .line 111
    .line 112
    move-result v5

    .line 113
    if-lez v5, :cond_3

    .line 114
    .line 115
    add-int/lit8 v1, p3, -0x1

    .line 116
    .line 117
    int-to-float v1, v1

    .line 118
    div-float v1, p1, v1

    .line 119
    .line 120
    goto :goto_2

    .line 121
    :cond_3
    sget-object p1, La/qmk;->a:La/zcl;

    .line 122
    .line 123
    :goto_2
    const/high16 p1, 0x3f800000    # 1.0f

    .line 124
    .line 125
    sget-object v5, La/jm40;->b:La/jm40;

    .line 126
    .line 127
    invoke-static {v5, p1}, La/o7k0;->d(La/mm40;F)La/mm40;

    .line 128
    .line 129
    .line 130
    move-result-object p1

    .line 131
    invoke-static {p1, v0}, La/s5x0;->I(La/mm40;La/hh80;)La/mm40;

    .line 132
    .line 133
    .line 134
    move-result-object p1

    .line 135
    if-le p3, v3, :cond_4

    .line 136
    .line 137
    new-instance v0, La/qw3;

    .line 138
    .line 139
    new-instance v6, La/jf4;

    .line 140
    .line 141
    const/16 v7, 0xe

    .line 142
    .line 143
    invoke-direct {v6, v7}, La/jf4;-><init>(B)V

    .line 144
    .line 145
    .line 146
    invoke-direct {v0, v1, v3, v6}, La/qw3;-><init>(FZLa/rw3;)V

    .line 147
    .line 148
    .line 149
    goto :goto_3

    .line 150
    :cond_4
    sget-object v0, La/uc9;->a:La/lw3;

    .line 151
    .line 152
    :goto_3
    sget-object v1, La/gqw0;->k:La/yx7;

    .line 153
    .line 154
    const/16 v6, 0x30

    .line 155
    .line 156
    invoke-static {v0, v1, p2, v6}, La/shg0;->a(La/ow3;La/yx7;La/fet;I)La/thg0;

    .line 157
    .line 158
    .line 159
    move-result-object v0

    .line 160
    iget-wide v6, p2, La/fet;->T:J

    .line 161
    .line 162
    invoke-static {v6, v7}, Ljava/lang/Long;->hashCode(J)I

    .line 163
    .line 164
    .line 165
    move-result v1

    .line 166
    invoke-virtual {p2}, La/fet;->m()La/bh90;

    .line 167
    .line 168
    .line 169
    move-result-object v6

    .line 170
    invoke-static {p2, p1}, La/kbc;->c0(La/fet;La/mm40;)La/mm40;

    .line 171
    .line 172
    .line 173
    move-result-object p1

    .line 174
    sget-object v7, La/mkd;->c0:La/gqw0;

    .line 175
    .line 176
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 177
    .line 178
    .line 179
    invoke-virtual {p2}, La/fet;->i0()V

    .line 180
    .line 181
    .line 182
    iget-boolean v7, p2, La/fet;->S:Z

    .line 183
    .line 184
    if-eqz v7, :cond_5

    .line 185
    .line 186
    sget-object v7, La/e7z;->u1:La/pcy;

    .line 187
    .line 188
    invoke-virtual {p2, v7}, La/fet;->l(Lkotlin/jvm/functions/Function0;)V

    .line 189
    .line 190
    .line 191
    goto :goto_4

    .line 192
    :cond_5
    invoke-virtual {p2}, La/fet;->r0()V

    .line 193
    .line 194
    .line 195
    :goto_4
    sget-object v7, La/gqw0;->x:La/shd;

    .line 196
    .line 197
    invoke-static {p2, v0, v7}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 198
    .line 199
    .line 200
    sget-object v0, La/gqw0;->w:La/shd;

    .line 201
    .line 202
    invoke-static {p2, v6, v0}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 203
    .line 204
    .line 205
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 206
    .line 207
    .line 208
    move-result-object v0

    .line 209
    sget-object v1, La/gqw0;->y:La/shd;

    .line 210
    .line 211
    invoke-static {p2, v0, v1}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 212
    .line 213
    .line 214
    invoke-static {p2}, La/jpm0;->n(La/fet;)V

    .line 215
    .line 216
    .line 217
    sget-object v0, La/gqw0;->v:La/shd;

    .line 218
    .line 219
    invoke-static {p2, p1, v0}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 220
    .line 221
    .line 222
    const p1, -0x56f9efcd

    .line 223
    .line 224
    .line 225
    invoke-virtual {p2, p1}, La/fet;->e0(I)V

    .line 226
    .line 227
    .line 228
    move p1, v2

    .line 229
    :goto_5
    if-ge p1, p3, :cond_6

    .line 230
    .line 231
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 232
    .line 233
    .line 234
    move-result-object v0

    .line 235
    invoke-static {v5, v4}, La/o7k0;->s(La/mm40;F)La/mm40;

    .line 236
    .line 237
    .line 238
    move-result-object v1

    .line 239
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 240
    .line 241
    .line 242
    move-result-object v6

    .line 243
    iget-object v7, p0, La/gp;->e:La/ugd;

    .line 244
    .line 245
    invoke-virtual {v7, v0, v1, p2, v6}, La/ugd;->j(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 246
    .line 247
    .line 248
    add-int/lit8 p1, p1, 0x1

    .line 249
    .line 250
    goto :goto_5

    .line 251
    :cond_6
    invoke-virtual {p2, v2}, La/fet;->r(Z)V

    .line 252
    .line 253
    .line 254
    invoke-virtual {p2, v3}, La/fet;->r(Z)V

    .line 255
    .line 256
    .line 257
    goto :goto_6

    .line 258
    :cond_7
    invoke-virtual {p2}, La/fet;->X()V

    .line 259
    .line 260
    .line 261
    :goto_6
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 262
    .line 263
    return-object p0
.end method
