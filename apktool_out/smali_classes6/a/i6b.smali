.class public final synthetic La/i6b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/xdr;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:J


# direct methods
.method public synthetic constructor <init>(BJ)V
    .locals 0

    .line 1
    iput-byte p1, p0, La/i6b;->a:B

    iput-wide p2, p0, La/i6b;->b:J

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final F(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11

    .line 1
    iget-byte v0, p0, La/i6b;->a:B

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/high16 v2, 0x41000000    # 8.0f

    .line 5
    .line 6
    sget-object v3, La/jm40;->b:La/jm40;

    .line 7
    .line 8
    const/16 v4, 0x12

    .line 9
    .line 10
    const/4 v5, 0x2

    .line 11
    const/4 v6, 0x4

    .line 12
    const/4 v7, 0x1

    .line 13
    const/4 v8, 0x0

    .line 14
    iget-wide v9, p0, La/i6b;->b:J

    .line 15
    .line 16
    packed-switch v0, :pswitch_data_0

    .line 17
    .line 18
    .line 19
    check-cast p1, La/vwv;

    .line 20
    .line 21
    check-cast p2, La/fet;

    .line 22
    .line 23
    check-cast p3, Ljava/lang/Integer;

    .line 24
    .line 25
    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    .line 26
    .line 27
    .line 28
    move-result p0

    .line 29
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 30
    .line 31
    .line 32
    and-int/lit8 p3, p0, 0x6

    .line 33
    .line 34
    if-nez p3, :cond_1

    .line 35
    .line 36
    invoke-virtual {p2, p1}, La/fet;->g(Ljava/lang/Object;)Z

    .line 37
    .line 38
    .line 39
    move-result p3

    .line 40
    if-eqz p3, :cond_0

    .line 41
    .line 42
    move v5, v6

    .line 43
    :cond_0
    or-int/2addr p0, v5

    .line 44
    :cond_1
    and-int/lit8 p3, p0, 0x13

    .line 45
    .line 46
    if-eq p3, v4, :cond_2

    .line 47
    .line 48
    goto :goto_0

    .line 49
    :cond_2
    move v7, v8

    .line 50
    :goto_0
    and-int/lit8 p3, p0, 0x1

    .line 51
    .line 52
    invoke-virtual {p2, p3, v7}, La/fet;->U(IZ)Z

    .line 53
    .line 54
    .line 55
    move-result p3

    .line 56
    if-eqz p3, :cond_3

    .line 57
    .line 58
    sget-object p3, La/jd8;->n:La/ljc;

    .line 59
    .line 60
    invoke-static {v3, v9, v10, p3}, La/i120;->Q(La/mm40;JLa/yjj0;)La/mm40;

    .line 61
    .line 62
    .line 63
    move-result-object p3

    .line 64
    sget-object v0, La/qmk;->a:La/zcl;

    .line 65
    .line 66
    invoke-static {p2}, La/qmk;->a(La/fet;)La/wfn;

    .line 67
    .line 68
    .line 69
    move-result-object v0

    .line 70
    iget v0, v0, La/wfn;->c:F

    .line 71
    .line 72
    invoke-static {p2}, La/qmk;->a(La/fet;)La/wfn;

    .line 73
    .line 74
    .line 75
    move-result-object v1

    .line 76
    iget v1, v1, La/wfn;->c:F

    .line 77
    .line 78
    invoke-static {p3, v0, v2, v1, v2}, La/s5x0;->M(La/mm40;FFFF)La/mm40;

    .line 79
    .line 80
    .line 81
    move-result-object p3

    .line 82
    shl-int/lit8 p0, p0, 0x3

    .line 83
    .line 84
    and-int/lit8 p0, p0, 0x70

    .line 85
    .line 86
    invoke-static {p3, p1, p2, p0}, La/qbc;->v(La/mm40;La/vwv;La/fet;I)V

    .line 87
    .line 88
    .line 89
    goto :goto_1

    .line 90
    :cond_3
    invoke-virtual {p2}, La/fet;->X()V

    .line 91
    .line 92
    .line 93
    :goto_1
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 94
    .line 95
    return-object p0

    .line 96
    :pswitch_0
    check-cast p1, La/x5b;

    .line 97
    .line 98
    check-cast p2, La/fet;

    .line 99
    .line 100
    check-cast p3, Ljava/lang/Integer;

    .line 101
    .line 102
    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    .line 103
    .line 104
    .line 105
    move-result p0

    .line 106
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 107
    .line 108
    .line 109
    and-int/lit8 p3, p0, 0x6

    .line 110
    .line 111
    if-nez p3, :cond_5

    .line 112
    .line 113
    invoke-virtual {p2, p1}, La/fet;->g(Ljava/lang/Object;)Z

    .line 114
    .line 115
    .line 116
    move-result p3

    .line 117
    if-eqz p3, :cond_4

    .line 118
    .line 119
    goto :goto_2

    .line 120
    :cond_4
    move v6, v5

    .line 121
    :goto_2
    or-int/2addr p0, v6

    .line 122
    :cond_5
    and-int/lit8 p3, p0, 0x13

    .line 123
    .line 124
    if-eq p3, v4, :cond_6

    .line 125
    .line 126
    goto :goto_3

    .line 127
    :cond_6
    move v7, v8

    .line 128
    :goto_3
    and-int/lit8 p3, p0, 0x1

    .line 129
    .line 130
    invoke-virtual {p2, p3, v7}, La/fet;->U(IZ)Z

    .line 131
    .line 132
    .line 133
    move-result p3

    .line 134
    if-eqz p3, :cond_7

    .line 135
    .line 136
    sget-object p3, La/jd8;->n:La/ljc;

    .line 137
    .line 138
    invoke-static {v3, v9, v10, p3}, La/i120;->Q(La/mm40;JLa/yjj0;)La/mm40;

    .line 139
    .line 140
    .line 141
    move-result-object p3

    .line 142
    sget-object v0, La/qmk;->a:La/zcl;

    .line 143
    .line 144
    const/high16 v0, 0x41800000    # 16.0f

    .line 145
    .line 146
    invoke-static {p3, v0, v1, v5}, La/s5x0;->L(La/mm40;FFI)La/mm40;

    .line 147
    .line 148
    .line 149
    move-result-object v0

    .line 150
    sget-object v2, La/mrv;->a:La/ugd;

    .line 151
    .line 152
    sget-object v3, La/mrv;->b:La/ugd;

    .line 153
    .line 154
    shl-int/lit8 p0, p0, 0x3

    .line 155
    .line 156
    and-int/lit8 p0, p0, 0x70

    .line 157
    .line 158
    or-int/lit16 v5, p0, 0xd80

    .line 159
    .line 160
    move-object v1, p1

    .line 161
    move-object v4, p2

    .line 162
    invoke-static/range {v0 .. v5}, La/phu0;->h(La/mm40;La/x5b;La/ugd;La/ugd;La/fet;I)V

    .line 163
    .line 164
    .line 165
    goto :goto_4

    .line 166
    :cond_7
    move-object v4, p2

    .line 167
    invoke-virtual {v4}, La/fet;->X()V

    .line 168
    .line 169
    .line 170
    :goto_4
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 171
    .line 172
    return-object p0

    .line 173
    :pswitch_1
    check-cast p1, La/x5b;

    .line 174
    .line 175
    check-cast p2, La/fet;

    .line 176
    .line 177
    check-cast p3, Ljava/lang/Integer;

    .line 178
    .line 179
    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    .line 180
    .line 181
    .line 182
    move-result p0

    .line 183
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 184
    .line 185
    .line 186
    and-int/lit8 p3, p0, 0x6

    .line 187
    .line 188
    if-nez p3, :cond_9

    .line 189
    .line 190
    invoke-virtual {p2, p1}, La/fet;->g(Ljava/lang/Object;)Z

    .line 191
    .line 192
    .line 193
    move-result p3

    .line 194
    if-eqz p3, :cond_8

    .line 195
    .line 196
    goto :goto_5

    .line 197
    :cond_8
    move v6, v5

    .line 198
    :goto_5
    or-int/2addr p0, v6

    .line 199
    :cond_9
    and-int/lit8 p3, p0, 0x13

    .line 200
    .line 201
    if-eq p3, v4, :cond_a

    .line 202
    .line 203
    goto :goto_6

    .line 204
    :cond_a
    move v7, v8

    .line 205
    :goto_6
    and-int/lit8 p3, p0, 0x1

    .line 206
    .line 207
    invoke-virtual {p2, p3, v7}, La/fet;->U(IZ)Z

    .line 208
    .line 209
    .line 210
    move-result p3

    .line 211
    if-eqz p3, :cond_b

    .line 212
    .line 213
    sget-object p3, La/jd8;->n:La/ljc;

    .line 214
    .line 215
    invoke-static {v3, v9, v10, p3}, La/i120;->Q(La/mm40;JLa/yjj0;)La/mm40;

    .line 216
    .line 217
    .line 218
    move-result-object p3

    .line 219
    sget-object v0, La/qmk;->a:La/zcl;

    .line 220
    .line 221
    invoke-static {p3, v2, v1, v5}, La/s5x0;->L(La/mm40;FFI)La/mm40;

    .line 222
    .line 223
    .line 224
    move-result-object v0

    .line 225
    sget-object v2, La/ntr;->a:La/ugd;

    .line 226
    .line 227
    sget-object v3, La/ntr;->b:La/ugd;

    .line 228
    .line 229
    shl-int/lit8 p0, p0, 0x3

    .line 230
    .line 231
    and-int/lit8 p0, p0, 0x70

    .line 232
    .line 233
    or-int/lit16 v5, p0, 0xd80

    .line 234
    .line 235
    move-object v1, p1

    .line 236
    move-object v4, p2

    .line 237
    invoke-static/range {v0 .. v5}, La/phu0;->h(La/mm40;La/x5b;La/ugd;La/ugd;La/fet;I)V

    .line 238
    .line 239
    .line 240
    goto :goto_7

    .line 241
    :cond_b
    move-object v4, p2

    .line 242
    invoke-virtual {v4}, La/fet;->X()V

    .line 243
    .line 244
    .line 245
    :goto_7
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 246
    .line 247
    return-object p0

    .line 248
    nop

    .line 249
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
