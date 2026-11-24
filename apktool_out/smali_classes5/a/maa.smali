.class public final synthetic La/maa;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/ydr;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/waa;


# direct methods
.method public synthetic constructor <init>(La/waa;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/maa;->a:B

    iput-object p1, p0, La/maa;->b:La/waa;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final j(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    .line 1
    iget-byte v0, p0, La/maa;->a:B

    .line 2
    .line 3
    const/16 v1, 0x90

    .line 4
    .line 5
    const/16 v2, 0x10

    .line 6
    .line 7
    const/16 v3, 0x20

    .line 8
    .line 9
    const/4 v4, 0x1

    .line 10
    const/4 v5, 0x0

    .line 11
    iget-object p0, p0, La/maa;->b:La/waa;

    .line 12
    .line 13
    check-cast p1, La/y5d;

    .line 14
    .line 15
    check-cast p2, La/mm40;

    .line 16
    .line 17
    check-cast p3, La/fet;

    .line 18
    .line 19
    check-cast p4, Ljava/lang/Integer;

    .line 20
    .line 21
    packed-switch v0, :pswitch_data_0

    .line 22
    .line 23
    .line 24
    invoke-static {p4, p1, p2}, La/dw9;->d(Ljava/lang/Integer;La/y5d;La/mm40;)I

    .line 25
    .line 26
    .line 27
    move-result p1

    .line 28
    and-int/lit8 p4, p1, 0x30

    .line 29
    .line 30
    if-nez p4, :cond_1

    .line 31
    .line 32
    invoke-virtual {p3, p2}, La/fet;->g(Ljava/lang/Object;)Z

    .line 33
    .line 34
    .line 35
    move-result p4

    .line 36
    if-eqz p4, :cond_0

    .line 37
    .line 38
    move v2, v3

    .line 39
    :cond_0
    or-int/2addr p1, v2

    .line 40
    :cond_1
    and-int/lit16 p4, p1, 0x91

    .line 41
    .line 42
    if-eq p4, v1, :cond_2

    .line 43
    .line 44
    move p4, v4

    .line 45
    goto :goto_0

    .line 46
    :cond_2
    move p4, v5

    .line 47
    :goto_0
    and-int/2addr p1, v4

    .line 48
    invoke-virtual {p3, p1, p4}, La/fet;->U(IZ)Z

    .line 49
    .line 50
    .line 51
    move-result p1

    .line 52
    if-eqz p1, :cond_4

    .line 53
    .line 54
    sget-object p1, La/qmk;->a:La/zcl;

    .line 55
    .line 56
    const/high16 p1, 0x42000000    # 32.0f

    .line 57
    .line 58
    invoke-static {p2, p1}, La/o7k0;->e(La/mm40;F)La/mm40;

    .line 59
    .line 60
    .line 61
    move-result-object p1

    .line 62
    iget-object p0, p0, La/waa;->j:La/j83;

    .line 63
    .line 64
    sget-object p2, La/gqw0;->k:La/yx7;

    .line 65
    .line 66
    sget-object p4, La/uc9;->e:La/nw3;

    .line 67
    .line 68
    sget-object v0, La/p8a;->c:La/ugd;

    .line 69
    .line 70
    invoke-static {p4, p2, p3, v5}, La/shg0;->a(La/ow3;La/yx7;La/fet;I)La/thg0;

    .line 71
    .line 72
    .line 73
    move-result-object p2

    .line 74
    iget-wide v1, p3, La/fet;->T:J

    .line 75
    .line 76
    invoke-static {v1, v2}, Ljava/lang/Long;->hashCode(J)I

    .line 77
    .line 78
    .line 79
    move-result p4

    .line 80
    invoke-virtual {p3}, La/fet;->m()La/bh90;

    .line 81
    .line 82
    .line 83
    move-result-object v1

    .line 84
    invoke-static {p3, p1}, La/kbc;->c0(La/fet;La/mm40;)La/mm40;

    .line 85
    .line 86
    .line 87
    move-result-object p1

    .line 88
    sget-object v2, La/mkd;->c0:La/gqw0;

    .line 89
    .line 90
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 91
    .line 92
    .line 93
    invoke-virtual {p3}, La/fet;->i0()V

    .line 94
    .line 95
    .line 96
    iget-boolean v2, p3, La/fet;->S:Z

    .line 97
    .line 98
    if-eqz v2, :cond_3

    .line 99
    .line 100
    sget-object v2, La/e7z;->u1:La/pcy;

    .line 101
    .line 102
    invoke-virtual {p3, v2}, La/fet;->l(Lkotlin/jvm/functions/Function0;)V

    .line 103
    .line 104
    .line 105
    goto :goto_1

    .line 106
    :cond_3
    invoke-virtual {p3}, La/fet;->r0()V

    .line 107
    .line 108
    .line 109
    :goto_1
    sget-object v2, La/gqw0;->x:La/shd;

    .line 110
    .line 111
    invoke-static {p3, p2, v2}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 112
    .line 113
    .line 114
    sget-object p2, La/gqw0;->w:La/shd;

    .line 115
    .line 116
    invoke-static {p3, v1, p2}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 117
    .line 118
    .line 119
    invoke-static {p4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 120
    .line 121
    .line 122
    move-result-object p2

    .line 123
    sget-object p4, La/gqw0;->y:La/shd;

    .line 124
    .line 125
    invoke-static {p3, p2, p4}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 126
    .line 127
    .line 128
    invoke-static {p3}, La/jpm0;->n(La/fet;)V

    .line 129
    .line 130
    .line 131
    sget-object p2, La/gqw0;->v:La/shd;

    .line 132
    .line 133
    invoke-static {p3, p1, p2}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 134
    .line 135
    .line 136
    sget-object p1, La/zhg0;->a:La/zhg0;

    .line 137
    .line 138
    const/4 p2, 0x6

    .line 139
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 140
    .line 141
    .line 142
    move-result-object p2

    .line 143
    invoke-virtual {v0, p1, p0, p3, p2}, La/ugd;->j(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 144
    .line 145
    .line 146
    invoke-virtual {p3, v4}, La/fet;->r(Z)V

    .line 147
    .line 148
    .line 149
    goto :goto_2

    .line 150
    :cond_4
    invoke-virtual {p3}, La/fet;->X()V

    .line 151
    .line 152
    .line 153
    :goto_2
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 154
    .line 155
    return-object p0

    .line 156
    :pswitch_0
    invoke-static {p4, p1, p2}, La/dw9;->d(Ljava/lang/Integer;La/y5d;La/mm40;)I

    .line 157
    .line 158
    .line 159
    move-result p2

    .line 160
    and-int/lit8 p4, p2, 0x6

    .line 161
    .line 162
    if-nez p4, :cond_6

    .line 163
    .line 164
    invoke-virtual {p3, p1}, La/fet;->g(Ljava/lang/Object;)Z

    .line 165
    .line 166
    .line 167
    move-result p4

    .line 168
    if-eqz p4, :cond_5

    .line 169
    .line 170
    const/4 p4, 0x4

    .line 171
    goto :goto_3

    .line 172
    :cond_5
    const/4 p4, 0x2

    .line 173
    :goto_3
    or-int/2addr p2, p4

    .line 174
    :cond_6
    and-int/lit16 p4, p2, 0x83

    .line 175
    .line 176
    const/16 v0, 0x82

    .line 177
    .line 178
    if-eq p4, v0, :cond_7

    .line 179
    .line 180
    move p4, v4

    .line 181
    goto :goto_4

    .line 182
    :cond_7
    move p4, v5

    .line 183
    :goto_4
    and-int/2addr p2, v4

    .line 184
    invoke-virtual {p3, p2, p4}, La/fet;->U(IZ)Z

    .line 185
    .line 186
    .line 187
    move-result p2

    .line 188
    if-eqz p2, :cond_8

    .line 189
    .line 190
    sget-object p2, La/qmk;->a:La/zcl;

    .line 191
    .line 192
    const/high16 p2, 0x42a00000    # 80.0f

    .line 193
    .line 194
    sget-object p4, La/jm40;->b:La/jm40;

    .line 195
    .line 196
    invoke-static {p4, p2}, La/o7k0;->s(La/mm40;F)La/mm40;

    .line 197
    .line 198
    .line 199
    move-result-object p2

    .line 200
    sget-object p4, La/gqw0;->n:La/xx7;

    .line 201
    .line 202
    invoke-virtual {p1, p2, p4}, La/y5d;->a(La/mm40;La/xx7;)La/mm40;

    .line 203
    .line 204
    .line 205
    move-result-object p1

    .line 206
    iget-object p0, p0, La/waa;->b:La/j83;

    .line 207
    .line 208
    invoke-static {p1, p0, p3, v5}, La/wdx;->m(La/mm40;La/j83;La/fet;I)V

    .line 209
    .line 210
    .line 211
    goto :goto_5

    .line 212
    :cond_8
    invoke-virtual {p3}, La/fet;->X()V

    .line 213
    .line 214
    .line 215
    :goto_5
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 216
    .line 217
    return-object p0

    .line 218
    :pswitch_1
    invoke-static {p4, p1, p2}, La/dw9;->d(Ljava/lang/Integer;La/y5d;La/mm40;)I

    .line 219
    .line 220
    .line 221
    move-result p1

    .line 222
    and-int/lit8 p4, p1, 0x30

    .line 223
    .line 224
    if-nez p4, :cond_a

    .line 225
    .line 226
    invoke-virtual {p3, p2}, La/fet;->g(Ljava/lang/Object;)Z

    .line 227
    .line 228
    .line 229
    move-result p4

    .line 230
    if-eqz p4, :cond_9

    .line 231
    .line 232
    move v2, v3

    .line 233
    :cond_9
    or-int/2addr p1, v2

    .line 234
    :cond_a
    and-int/lit16 p4, p1, 0x91

    .line 235
    .line 236
    if-eq p4, v1, :cond_b

    .line 237
    .line 238
    move v5, v4

    .line 239
    :cond_b
    and-int/2addr p1, v4

    .line 240
    invoke-virtual {p3, p1, v5}, La/fet;->U(IZ)Z

    .line 241
    .line 242
    .line 243
    move-result p1

    .line 244
    if-eqz p1, :cond_c

    .line 245
    .line 246
    sget-object p1, La/qmk;->a:La/zcl;

    .line 247
    .line 248
    const/high16 p1, 0x41c00000    # 24.0f

    .line 249
    .line 250
    invoke-static {p2, p1}, La/o7k0;->e(La/mm40;F)La/mm40;

    .line 251
    .line 252
    .line 253
    move-result-object p1

    .line 254
    iget-object p0, p0, La/waa;->a:La/j83;

    .line 255
    .line 256
    invoke-static {p1, p0, p3}, La/ahy;->k(La/mm40;La/j83;La/fet;)V

    .line 257
    .line 258
    .line 259
    goto :goto_6

    .line 260
    :cond_c
    invoke-virtual {p3}, La/fet;->X()V

    .line 261
    .line 262
    .line 263
    :goto_6
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 264
    .line 265
    return-object p0

    .line 266
    nop

    .line 267
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
