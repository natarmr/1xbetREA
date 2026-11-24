.class public final synthetic La/ko8;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:F

.field public final synthetic c:F

.field public final synthetic d:F

.field public final synthetic e:Ljava/lang/Object;

.field public final synthetic f:La/wdr;


# direct methods
.method public synthetic constructor <init>(La/a4x;FFFLkotlin/jvm/functions/Function1;)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    iput-byte v0, p0, La/ko8;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/ko8;->e:Ljava/lang/Object;

    iput p2, p0, La/ko8;->b:F

    iput p3, p0, La/ko8;->c:F

    iput p4, p0, La/ko8;->d:F

    iput-object p5, p0, La/ko8;->f:La/wdr;

    return-void
.end method

.method public synthetic constructor <init>(La/mm40;FFFLa/ugd;I)V
    .locals 0

    .line 2
    const/4 p6, 0x0

    iput-byte p6, p0, La/ko8;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/ko8;->e:Ljava/lang/Object;

    iput p2, p0, La/ko8;->b:F

    iput p3, p0, La/ko8;->c:F

    iput p4, p0, La/ko8;->d:F

    iput-object p5, p0, La/ko8;->f:La/wdr;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11

    .line 1
    iget-byte v0, p0, La/ko8;->a:B

    .line 2
    .line 3
    iget-object v1, p0, La/ko8;->f:La/wdr;

    .line 4
    .line 5
    iget-object v2, p0, La/ko8;->e:Ljava/lang/Object;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    check-cast v2, La/a4x;

    .line 11
    .line 12
    check-cast v1, Lkotlin/jvm/functions/Function1;

    .line 13
    .line 14
    check-cast p1, La/fet;

    .line 15
    .line 16
    check-cast p2, Ljava/lang/Integer;

    .line 17
    .line 18
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 19
    .line 20
    .line 21
    move-result p2

    .line 22
    and-int/lit8 v0, p2, 0x3

    .line 23
    .line 24
    const/4 v3, 0x2

    .line 25
    const/4 v4, 0x0

    .line 26
    const/4 v5, 0x1

    .line 27
    if-eq v0, v3, :cond_0

    .line 28
    .line 29
    move v0, v5

    .line 30
    goto :goto_0

    .line 31
    :cond_0
    move v0, v4

    .line 32
    :goto_0
    and-int/2addr p2, v5

    .line 33
    invoke-virtual {p1, p2, v0}, La/fet;->U(IZ)Z

    .line 34
    .line 35
    .line 36
    move-result p2

    .line 37
    if-eqz p2, :cond_8

    .line 38
    .line 39
    sget-object p2, La/jm40;->b:La/jm40;

    .line 40
    .line 41
    const/high16 v0, 0x3f800000    # 1.0f

    .line 42
    .line 43
    invoke-static {p2, v0}, La/o7k0;->d(La/mm40;F)La/mm40;

    .line 44
    .line 45
    .line 46
    move-result-object p2

    .line 47
    invoke-virtual {p1, v2}, La/fet;->g(Ljava/lang/Object;)Z

    .line 48
    .line 49
    .line 50
    move-result v0

    .line 51
    iget v3, p0, La/ko8;->b:F

    .line 52
    .line 53
    invoke-virtual {p1, v3}, La/fet;->d(F)Z

    .line 54
    .line 55
    .line 56
    move-result v6

    .line 57
    or-int/2addr v0, v6

    .line 58
    iget v6, p0, La/ko8;->c:F

    .line 59
    .line 60
    invoke-virtual {p1, v6}, La/fet;->d(F)Z

    .line 61
    .line 62
    .line 63
    move-result v7

    .line 64
    or-int/2addr v0, v7

    .line 65
    iget p0, p0, La/ko8;->d:F

    .line 66
    .line 67
    invoke-virtual {p1, p0}, La/fet;->d(F)Z

    .line 68
    .line 69
    .line 70
    move-result v7

    .line 71
    or-int/2addr v0, v7

    .line 72
    invoke-virtual {p1}, La/fet;->P()Ljava/lang/Object;

    .line 73
    .line 74
    .line 75
    move-result-object v7

    .line 76
    sget-object v8, La/ukd;->a:La/cl5;

    .line 77
    .line 78
    if-nez v0, :cond_1

    .line 79
    .line 80
    if-ne v7, v8, :cond_2

    .line 81
    .line 82
    :cond_1
    new-instance v7, La/t900;

    .line 83
    .line 84
    invoke-direct {v7, v2, v3, v6, p0}, La/t900;-><init>(La/a4x;FFF)V

    .line 85
    .line 86
    .line 87
    invoke-virtual {p1, v7}, La/fet;->o0(Ljava/lang/Object;)V

    .line 88
    .line 89
    .line 90
    :cond_2
    check-cast v7, La/tj30;

    .line 91
    .line 92
    iget-wide v9, p1, La/fet;->T:J

    .line 93
    .line 94
    invoke-static {v9, v10}, Ljava/lang/Long;->hashCode(J)I

    .line 95
    .line 96
    .line 97
    move-result p0

    .line 98
    invoke-virtual {p1}, La/fet;->m()La/bh90;

    .line 99
    .line 100
    .line 101
    move-result-object v0

    .line 102
    invoke-static {p1, p2}, La/kbc;->c0(La/fet;La/mm40;)La/mm40;

    .line 103
    .line 104
    .line 105
    move-result-object p2

    .line 106
    sget-object v3, La/mkd;->c0:La/gqw0;

    .line 107
    .line 108
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 109
    .line 110
    .line 111
    invoke-virtual {p1}, La/fet;->i0()V

    .line 112
    .line 113
    .line 114
    iget-boolean v3, p1, La/fet;->S:Z

    .line 115
    .line 116
    if-eqz v3, :cond_3

    .line 117
    .line 118
    sget-object v3, La/e7z;->u1:La/pcy;

    .line 119
    .line 120
    invoke-virtual {p1, v3}, La/fet;->l(Lkotlin/jvm/functions/Function0;)V

    .line 121
    .line 122
    .line 123
    goto :goto_1

    .line 124
    :cond_3
    invoke-virtual {p1}, La/fet;->r0()V

    .line 125
    .line 126
    .line 127
    :goto_1
    sget-object v3, La/gqw0;->x:La/shd;

    .line 128
    .line 129
    invoke-static {p1, v7, v3}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 130
    .line 131
    .line 132
    sget-object v3, La/gqw0;->w:La/shd;

    .line 133
    .line 134
    invoke-static {p1, v0, v3}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 135
    .line 136
    .line 137
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 138
    .line 139
    .line 140
    move-result-object p0

    .line 141
    sget-object v0, La/gqw0;->y:La/shd;

    .line 142
    .line 143
    invoke-static {p1, p0, v0}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 144
    .line 145
    .line 146
    invoke-static {p1}, La/jpm0;->n(La/fet;)V

    .line 147
    .line 148
    .line 149
    sget-object p0, La/gqw0;->v:La/shd;

    .line 150
    .line 151
    const v0, -0x52282ad6

    .line 152
    .line 153
    .line 154
    invoke-static {p1, p2, p0, v0, v2}, La/h97;->o(La/fet;La/mm40;La/shd;ILa/a4x;)Ljava/util/Iterator;

    .line 155
    .line 156
    .line 157
    move-result-object p0

    .line 158
    :goto_2
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 159
    .line 160
    .line 161
    move-result p2

    .line 162
    if-eqz p2, :cond_7

    .line 163
    .line 164
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 165
    .line 166
    .line 167
    move-result-object p2

    .line 168
    check-cast p2, La/a4x;

    .line 169
    .line 170
    const v0, -0x522825f1

    .line 171
    .line 172
    .line 173
    invoke-virtual {p1, v0}, La/fet;->e0(I)V

    .line 174
    .line 175
    .line 176
    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 177
    .line 178
    .line 179
    move-result-object p2

    .line 180
    :goto_3
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 181
    .line 182
    .line 183
    move-result v0

    .line 184
    if-eqz v0, :cond_6

    .line 185
    .line 186
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 187
    .line 188
    .line 189
    move-result-object v0

    .line 190
    check-cast v0, La/nea0;

    .line 191
    .line 192
    invoke-virtual {p1, v1}, La/fet;->g(Ljava/lang/Object;)Z

    .line 193
    .line 194
    .line 195
    move-result v2

    .line 196
    invoke-virtual {p1, v0}, La/fet;->g(Ljava/lang/Object;)Z

    .line 197
    .line 198
    .line 199
    move-result v3

    .line 200
    or-int/2addr v2, v3

    .line 201
    invoke-virtual {p1}, La/fet;->P()Ljava/lang/Object;

    .line 202
    .line 203
    .line 204
    move-result-object v3

    .line 205
    if-nez v2, :cond_4

    .line 206
    .line 207
    if-ne v3, v8, :cond_5

    .line 208
    .line 209
    :cond_4
    new-instance v3, La/mbz;

    .line 210
    .line 211
    const/16 v2, 0x9

    .line 212
    .line 213
    invoke-direct {v3, v1, v0, v2}, La/mbz;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 214
    .line 215
    .line 216
    invoke-virtual {p1, v3}, La/fet;->o0(Ljava/lang/Object;)V

    .line 217
    .line 218
    .line 219
    :cond_5
    check-cast v3, Lkotlin/jvm/functions/Function0;

    .line 220
    .line 221
    invoke-static {v0, v3, p1, v4}, La/s0x;->p(La/nea0;Lkotlin/jvm/functions/Function0;La/fet;I)V

    .line 222
    .line 223
    .line 224
    goto :goto_3

    .line 225
    :cond_6
    invoke-virtual {p1, v4}, La/fet;->r(Z)V

    .line 226
    .line 227
    .line 228
    goto :goto_2

    .line 229
    :cond_7
    invoke-virtual {p1, v4}, La/fet;->r(Z)V

    .line 230
    .line 231
    .line 232
    invoke-virtual {p1, v5}, La/fet;->r(Z)V

    .line 233
    .line 234
    .line 235
    goto :goto_4

    .line 236
    :cond_8
    invoke-virtual {p1}, La/fet;->X()V

    .line 237
    .line 238
    .line 239
    :goto_4
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 240
    .line 241
    return-object p0

    .line 242
    :pswitch_0
    move-object v0, v2

    .line 243
    check-cast v0, La/mm40;

    .line 244
    .line 245
    move-object v4, v1

    .line 246
    check-cast v4, La/ugd;

    .line 247
    .line 248
    move-object v5, p1

    .line 249
    check-cast v5, La/fet;

    .line 250
    .line 251
    check-cast p2, Ljava/lang/Integer;

    .line 252
    .line 253
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 254
    .line 255
    .line 256
    const/16 p1, 0x6001

    .line 257
    .line 258
    invoke-static {p1}, La/x8x;->L(I)I

    .line 259
    .line 260
    .line 261
    move-result v6

    .line 262
    iget v1, p0, La/ko8;->b:F

    .line 263
    .line 264
    iget v2, p0, La/ko8;->c:F

    .line 265
    .line 266
    iget v3, p0, La/ko8;->d:F

    .line 267
    .line 268
    invoke-static/range {v0 .. v6}, La/f1t0;->l(La/mm40;FFFLa/ugd;La/fet;I)V

    .line 269
    .line 270
    .line 271
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 272
    .line 273
    return-object p0

    .line 274
    nop

    .line 275
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
