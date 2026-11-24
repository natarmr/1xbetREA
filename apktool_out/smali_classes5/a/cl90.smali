.class public final synthetic La/cl90;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/xdr;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/el90;


# direct methods
.method public synthetic constructor <init>(La/el90;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/cl90;->a:B

    iput-object p1, p0, La/cl90;->b:La/el90;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final F(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    .line 1
    iget-byte v0, p0, La/cl90;->a:B

    .line 2
    .line 3
    const-string v1, "resourceManager"

    .line 4
    .line 5
    const/16 v2, 0xe

    .line 6
    .line 7
    iget-object p0, p0, La/cl90;->b:La/el90;

    .line 8
    .line 9
    const/4 v3, 0x0

    .line 10
    const/4 v4, 0x1

    .line 11
    const/4 v5, 0x0

    .line 12
    check-cast p1, La/y5d;

    .line 13
    .line 14
    check-cast p2, La/fet;

    .line 15
    .line 16
    check-cast p3, Ljava/lang/Integer;

    .line 17
    .line 18
    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    .line 19
    .line 20
    .line 21
    move-result p3

    .line 22
    packed-switch v0, :pswitch_data_0

    .line 23
    .line 24
    .line 25
    sget-object v0, La/el90;->m2:La/nh70;

    .line 26
    .line 27
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 28
    .line 29
    .line 30
    and-int/lit8 p1, p3, 0x11

    .line 31
    .line 32
    const/16 v0, 0x10

    .line 33
    .line 34
    if-eq p1, v0, :cond_0

    .line 35
    .line 36
    move p1, v4

    .line 37
    goto :goto_0

    .line 38
    :cond_0
    move p1, v5

    .line 39
    :goto_0
    and-int/2addr p3, v4

    .line 40
    invoke-virtual {p2, p3, p1}, La/fet;->U(IZ)Z

    .line 41
    .line 42
    .line 43
    move-result p1

    .line 44
    if-eqz p1, :cond_7

    .line 45
    .line 46
    sget-object p1, La/jm40;->b:La/jm40;

    .line 47
    .line 48
    invoke-static {p2}, La/x0x;->a0(La/fet;)La/bk50;

    .line 49
    .line 50
    .line 51
    move-result-object p3

    .line 52
    invoke-static {p1, p3, v3}, La/cjx;->V(La/mm40;La/vj50;La/yj50;)La/mm40;

    .line 53
    .line 54
    .line 55
    move-result-object p1

    .line 56
    invoke-static {p2}, La/wha0;->T(La/fet;)La/rah0;

    .line 57
    .line 58
    .line 59
    move-result-object p3

    .line 60
    invoke-static {p1, p3, v5, v2}, La/wha0;->a0(La/mm40;La/rah0;ZI)La/mm40;

    .line 61
    .line 62
    .line 63
    move-result-object p1

    .line 64
    sget-object p3, La/uc9;->c:La/mw3;

    .line 65
    .line 66
    sget-object v0, La/gqw0;->m:La/xx7;

    .line 67
    .line 68
    invoke-static {p3, v0, p2, v5}, La/w5d;->a(La/sw3;La/xx7;La/fet;I)La/x5d;

    .line 69
    .line 70
    .line 71
    move-result-object p3

    .line 72
    iget-wide v6, p2, La/fet;->T:J

    .line 73
    .line 74
    invoke-static {v6, v7}, Ljava/lang/Long;->hashCode(J)I

    .line 75
    .line 76
    .line 77
    move-result v0

    .line 78
    invoke-virtual {p2}, La/fet;->m()La/bh90;

    .line 79
    .line 80
    .line 81
    move-result-object v2

    .line 82
    invoke-static {p2, p1}, La/kbc;->c0(La/fet;La/mm40;)La/mm40;

    .line 83
    .line 84
    .line 85
    move-result-object p1

    .line 86
    sget-object v6, La/mkd;->c0:La/gqw0;

    .line 87
    .line 88
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 89
    .line 90
    .line 91
    invoke-virtual {p2}, La/fet;->i0()V

    .line 92
    .line 93
    .line 94
    iget-boolean v6, p2, La/fet;->S:Z

    .line 95
    .line 96
    if-eqz v6, :cond_1

    .line 97
    .line 98
    sget-object v6, La/e7z;->u1:La/pcy;

    .line 99
    .line 100
    invoke-virtual {p2, v6}, La/fet;->l(Lkotlin/jvm/functions/Function0;)V

    .line 101
    .line 102
    .line 103
    goto :goto_1

    .line 104
    :cond_1
    invoke-virtual {p2}, La/fet;->r0()V

    .line 105
    .line 106
    .line 107
    :goto_1
    sget-object v6, La/gqw0;->x:La/shd;

    .line 108
    .line 109
    invoke-static {p2, p3, v6}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 110
    .line 111
    .line 112
    sget-object p3, La/gqw0;->w:La/shd;

    .line 113
    .line 114
    invoke-static {p2, v2, p3}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 115
    .line 116
    .line 117
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 118
    .line 119
    .line 120
    move-result-object p3

    .line 121
    sget-object v0, La/gqw0;->y:La/shd;

    .line 122
    .line 123
    invoke-static {p2, p3, v0}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 124
    .line 125
    .line 126
    invoke-static {p2}, La/jpm0;->n(La/fet;)V

    .line 127
    .line 128
    .line 129
    sget-object p3, La/gqw0;->v:La/shd;

    .line 130
    .line 131
    invoke-static {p2, p1, p3}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 132
    .line 133
    .line 134
    iget-object p1, p0, La/el90;->k2:La/ctf0;

    .line 135
    .line 136
    if-eqz p1, :cond_6

    .line 137
    .line 138
    invoke-virtual {p2, p0}, La/fet;->i(Ljava/lang/Object;)Z

    .line 139
    .line 140
    .line 141
    move-result p3

    .line 142
    invoke-virtual {p2}, La/fet;->P()Ljava/lang/Object;

    .line 143
    .line 144
    .line 145
    move-result-object v0

    .line 146
    sget-object v1, La/ukd;->a:La/cl5;

    .line 147
    .line 148
    if-nez p3, :cond_2

    .line 149
    .line 150
    if-ne v0, v1, :cond_3

    .line 151
    .line 152
    :cond_2
    new-instance v0, La/dl90;

    .line 153
    .line 154
    invoke-direct {v0, p0, v5}, La/dl90;-><init>(La/el90;B)V

    .line 155
    .line 156
    .line 157
    invoke-virtual {p2, v0}, La/fet;->o0(Ljava/lang/Object;)V

    .line 158
    .line 159
    .line 160
    :cond_3
    check-cast v0, Lkotlin/jvm/functions/Function0;

    .line 161
    .line 162
    invoke-virtual {p2, p0}, La/fet;->i(Ljava/lang/Object;)Z

    .line 163
    .line 164
    .line 165
    move-result p3

    .line 166
    invoke-virtual {p2}, La/fet;->P()Ljava/lang/Object;

    .line 167
    .line 168
    .line 169
    move-result-object v2

    .line 170
    if-nez p3, :cond_4

    .line 171
    .line 172
    if-ne v2, v1, :cond_5

    .line 173
    .line 174
    :cond_4
    new-instance v2, La/dl90;

    .line 175
    .line 176
    invoke-direct {v2, p0, v4}, La/dl90;-><init>(La/el90;B)V

    .line 177
    .line 178
    .line 179
    invoke-virtual {p2, v2}, La/fet;->o0(Ljava/lang/Object;)V

    .line 180
    .line 181
    .line 182
    :cond_5
    check-cast v2, Lkotlin/jvm/functions/Function0;

    .line 183
    .line 184
    const/4 p0, 0x6

    .line 185
    invoke-static {p1, v0, v2, p2, p0}, La/p7x;->g(La/ctf0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;La/fet;I)V

    .line 186
    .line 187
    .line 188
    invoke-virtual {p2, v4}, La/fet;->r(Z)V

    .line 189
    .line 190
    .line 191
    goto :goto_2

    .line 192
    :cond_6
    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 193
    .line 194
    .line 195
    throw v3

    .line 196
    :cond_7
    invoke-virtual {p2}, La/fet;->X()V

    .line 197
    .line 198
    .line 199
    :goto_2
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 200
    .line 201
    return-object p0

    .line 202
    :pswitch_0
    sget-object v0, La/el90;->m2:La/nh70;

    .line 203
    .line 204
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 205
    .line 206
    .line 207
    and-int/lit8 v0, p3, 0x6

    .line 208
    .line 209
    if-nez v0, :cond_9

    .line 210
    .line 211
    invoke-virtual {p2, p1}, La/fet;->g(Ljava/lang/Object;)Z

    .line 212
    .line 213
    .line 214
    move-result v0

    .line 215
    if-eqz v0, :cond_8

    .line 216
    .line 217
    const/4 v0, 0x4

    .line 218
    goto :goto_3

    .line 219
    :cond_8
    const/4 v0, 0x2

    .line 220
    :goto_3
    or-int/2addr p3, v0

    .line 221
    :cond_9
    and-int/lit8 v0, p3, 0x13

    .line 222
    .line 223
    const/16 v6, 0x12

    .line 224
    .line 225
    if-eq v0, v6, :cond_a

    .line 226
    .line 227
    goto :goto_4

    .line 228
    :cond_a
    move v4, v5

    .line 229
    :goto_4
    and-int/lit8 v0, p3, 0x1

    .line 230
    .line 231
    invoke-virtual {p2, v0, v4}, La/fet;->U(IZ)Z

    .line 232
    .line 233
    .line 234
    move-result v0

    .line 235
    if-eqz v0, :cond_c

    .line 236
    .line 237
    iget-object p0, p0, La/el90;->k2:La/ctf0;

    .line 238
    .line 239
    if-eqz p0, :cond_b

    .line 240
    .line 241
    and-int/2addr p3, v2

    .line 242
    invoke-static {p1, p0, p2, p3}, La/p7x;->o(La/y5d;La/ctf0;La/fet;I)V

    .line 243
    .line 244
    .line 245
    goto :goto_5

    .line 246
    :cond_b
    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 247
    .line 248
    .line 249
    throw v3

    .line 250
    :cond_c
    invoke-virtual {p2}, La/fet;->X()V

    .line 251
    .line 252
    .line 253
    :goto_5
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 254
    .line 255
    return-object p0

    .line 256
    nop

    .line 257
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
