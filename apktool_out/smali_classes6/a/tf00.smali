.class public final synthetic La/tf00;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/sdm0;


# direct methods
.method public synthetic constructor <init>(La/sdm0;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/tf00;->a:B

    iput-object p1, p0, La/tf00;->b:La/sdm0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 13

    .line 1
    iget-byte v0, p0, La/tf00;->a:B

    .line 2
    .line 3
    const/high16 v1, 0x41400000    # 12.0f

    .line 4
    .line 5
    sget-object v2, La/jm40;->b:La/jm40;

    .line 6
    .line 7
    const/4 v3, 0x2

    .line 8
    const/4 v4, 0x0

    .line 9
    const/4 v5, 0x1

    .line 10
    iget-object p0, p0, La/tf00;->b:La/sdm0;

    .line 11
    .line 12
    packed-switch v0, :pswitch_data_0

    .line 13
    .line 14
    .line 15
    move-object v11, p1

    .line 16
    check-cast v11, La/fet;

    .line 17
    .line 18
    check-cast p2, Ljava/lang/Integer;

    .line 19
    .line 20
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 21
    .line 22
    .line 23
    move-result p1

    .line 24
    and-int/lit8 p2, p1, 0x3

    .line 25
    .line 26
    if-eq p2, v3, :cond_0

    .line 27
    .line 28
    move p2, v5

    .line 29
    goto :goto_0

    .line 30
    :cond_0
    move p2, v4

    .line 31
    :goto_0
    and-int/2addr p1, v5

    .line 32
    invoke-virtual {v11, p1, p2}, La/fet;->U(IZ)Z

    .line 33
    .line 34
    .line 35
    move-result p1

    .line 36
    if-eqz p1, :cond_1

    .line 37
    .line 38
    iget-object p1, p0, La/sdm0;->a:Ljava/lang/String;

    .line 39
    .line 40
    invoke-static {p1, v11, v4}, La/hfm0;->c(Ljava/lang/String;La/fet;I)V

    .line 41
    .line 42
    .line 43
    sget-object p1, La/qmk;->a:La/zcl;

    .line 44
    .line 45
    invoke-static {v2, v1}, La/o7k0;->e(La/mm40;F)La/mm40;

    .line 46
    .line 47
    .line 48
    move-result-object p1

    .line 49
    invoke-static {v4, v11, p1}, La/zq8;->a(ILa/fet;La/mm40;)V

    .line 50
    .line 51
    .line 52
    iget-object v6, p0, La/sdm0;->b:Ljava/lang/String;

    .line 53
    .line 54
    iget-object v7, p0, La/sdm0;->c:Ljava/lang/String;

    .line 55
    .line 56
    sget-object v9, La/gqw0;->i:La/zx7;

    .line 57
    .line 58
    const/4 v10, 0x1

    .line 59
    const/16 v12, 0x6d80

    .line 60
    .line 61
    const/4 v8, 0x0

    .line 62
    invoke-static/range {v6 .. v12}, La/hfm0;->l(Ljava/lang/String;Ljava/lang/String;ILa/zx7;ILa/fet;I)V

    .line 63
    .line 64
    .line 65
    goto :goto_1

    .line 66
    :cond_1
    invoke-virtual {v11}, La/fet;->X()V

    .line 67
    .line 68
    .line 69
    :goto_1
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 70
    .line 71
    return-object p0

    .line 72
    :pswitch_0
    check-cast p1, La/fet;

    .line 73
    .line 74
    check-cast p2, Ljava/lang/Integer;

    .line 75
    .line 76
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 77
    .line 78
    .line 79
    move-result p2

    .line 80
    and-int/lit8 v0, p2, 0x3

    .line 81
    .line 82
    if-eq v0, v3, :cond_2

    .line 83
    .line 84
    move v0, v5

    .line 85
    goto :goto_2

    .line 86
    :cond_2
    move v0, v4

    .line 87
    :goto_2
    and-int/2addr p2, v5

    .line 88
    invoke-virtual {p1, p2, v0}, La/fet;->U(IZ)Z

    .line 89
    .line 90
    .line 91
    move-result p2

    .line 92
    if-eqz p2, :cond_4

    .line 93
    .line 94
    iget-object p2, p0, La/sdm0;->a:Ljava/lang/String;

    .line 95
    .line 96
    invoke-static {p2, p1, v4}, La/ucx;->f(Ljava/lang/String;La/fet;I)V

    .line 97
    .line 98
    .line 99
    const/high16 p2, 0x3f800000    # 1.0f

    .line 100
    .line 101
    invoke-static {v2, p2}, La/o7k0;->d(La/mm40;F)La/mm40;

    .line 102
    .line 103
    .line 104
    move-result-object p2

    .line 105
    sget-object v0, La/qmk;->a:La/zcl;

    .line 106
    .line 107
    const/high16 v0, 0x41000000    # 8.0f

    .line 108
    .line 109
    const/4 v1, 0x0

    .line 110
    invoke-static {p2, v1, v0, v5}, La/s5x0;->L(La/mm40;FFI)La/mm40;

    .line 111
    .line 112
    .line 113
    move-result-object p2

    .line 114
    sget-object v0, La/gqw0;->e:La/zx7;

    .line 115
    .line 116
    invoke-static {v0, v4}, La/zq8;->c(La/u12;Z)La/tj30;

    .line 117
    .line 118
    .line 119
    move-result-object v0

    .line 120
    iget-wide v1, p1, La/fet;->T:J

    .line 121
    .line 122
    invoke-static {v1, v2}, Ljava/lang/Long;->hashCode(J)I

    .line 123
    .line 124
    .line 125
    move-result v1

    .line 126
    invoke-virtual {p1}, La/fet;->m()La/bh90;

    .line 127
    .line 128
    .line 129
    move-result-object v2

    .line 130
    invoke-static {p1, p2}, La/kbc;->c0(La/fet;La/mm40;)La/mm40;

    .line 131
    .line 132
    .line 133
    move-result-object p2

    .line 134
    sget-object v3, La/mkd;->c0:La/gqw0;

    .line 135
    .line 136
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 137
    .line 138
    .line 139
    invoke-virtual {p1}, La/fet;->i0()V

    .line 140
    .line 141
    .line 142
    iget-boolean v3, p1, La/fet;->S:Z

    .line 143
    .line 144
    if-eqz v3, :cond_3

    .line 145
    .line 146
    sget-object v3, La/e7z;->u1:La/pcy;

    .line 147
    .line 148
    invoke-virtual {p1, v3}, La/fet;->l(Lkotlin/jvm/functions/Function0;)V

    .line 149
    .line 150
    .line 151
    goto :goto_3

    .line 152
    :cond_3
    invoke-virtual {p1}, La/fet;->r0()V

    .line 153
    .line 154
    .line 155
    :goto_3
    sget-object v3, La/gqw0;->x:La/shd;

    .line 156
    .line 157
    invoke-static {p1, v0, v3}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 158
    .line 159
    .line 160
    sget-object v0, La/gqw0;->w:La/shd;

    .line 161
    .line 162
    invoke-static {p1, v2, v0}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 163
    .line 164
    .line 165
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 166
    .line 167
    .line 168
    move-result-object v0

    .line 169
    sget-object v1, La/gqw0;->y:La/shd;

    .line 170
    .line 171
    invoke-static {p1, v0, v1}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 172
    .line 173
    .line 174
    invoke-static {p1}, La/jpm0;->n(La/fet;)V

    .line 175
    .line 176
    .line 177
    sget-object v0, La/gqw0;->v:La/shd;

    .line 178
    .line 179
    invoke-static {p1, p2, v0}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 180
    .line 181
    .line 182
    iget-object p2, p0, La/sdm0;->b:Ljava/lang/String;

    .line 183
    .line 184
    iget-object p0, p0, La/sdm0;->c:Ljava/lang/String;

    .line 185
    .line 186
    const/16 v0, 0x180

    .line 187
    .line 188
    invoke-static {p2, p0, v5, p1, v0}, La/ucx;->v(Ljava/lang/String;Ljava/lang/String;ILa/fet;I)V

    .line 189
    .line 190
    .line 191
    invoke-virtual {p1, v5}, La/fet;->r(Z)V

    .line 192
    .line 193
    .line 194
    goto :goto_4

    .line 195
    :cond_4
    invoke-virtual {p1}, La/fet;->X()V

    .line 196
    .line 197
    .line 198
    :goto_4
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 199
    .line 200
    return-object p0

    .line 201
    :pswitch_1
    check-cast p1, La/fet;

    .line 202
    .line 203
    check-cast p2, Ljava/lang/Integer;

    .line 204
    .line 205
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 206
    .line 207
    .line 208
    move-result p2

    .line 209
    and-int/lit8 v0, p2, 0x3

    .line 210
    .line 211
    if-eq v0, v3, :cond_5

    .line 212
    .line 213
    move v0, v5

    .line 214
    goto :goto_5

    .line 215
    :cond_5
    move v0, v4

    .line 216
    :goto_5
    and-int/2addr p2, v5

    .line 217
    invoke-virtual {p1, p2, v0}, La/fet;->U(IZ)Z

    .line 218
    .line 219
    .line 220
    move-result p2

    .line 221
    if-eqz p2, :cond_6

    .line 222
    .line 223
    iget-object p2, p0, La/sdm0;->a:Ljava/lang/String;

    .line 224
    .line 225
    invoke-static {p2, p1, v4}, La/yyw;->h(Ljava/lang/String;La/fet;I)V

    .line 226
    .line 227
    .line 228
    sget-object p2, La/qmk;->a:La/zcl;

    .line 229
    .line 230
    invoke-static {v2, v1}, La/o7k0;->e(La/mm40;F)La/mm40;

    .line 231
    .line 232
    .line 233
    move-result-object p2

    .line 234
    invoke-static {v4, p1, p2}, La/zq8;->a(ILa/fet;La/mm40;)V

    .line 235
    .line 236
    .line 237
    iget-object v1, p0, La/sdm0;->c:Ljava/lang/String;

    .line 238
    .line 239
    iget-object v0, p0, La/sdm0;->b:Ljava/lang/String;

    .line 240
    .line 241
    sget-object v3, La/gqw0;->i:La/zx7;

    .line 242
    .line 243
    const/4 v4, 0x1

    .line 244
    const/16 v6, 0x6d80

    .line 245
    .line 246
    const/4 v2, 0x0

    .line 247
    move-object v5, p1

    .line 248
    invoke-static/range {v0 .. v6}, La/yyw;->y(Ljava/lang/String;Ljava/lang/String;ILa/zx7;ILa/fet;I)V

    .line 249
    .line 250
    .line 251
    goto :goto_6

    .line 252
    :cond_6
    move-object v5, p1

    .line 253
    invoke-virtual {v5}, La/fet;->X()V

    .line 254
    .line 255
    .line 256
    :goto_6
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 257
    .line 258
    return-object p0

    .line 259
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
