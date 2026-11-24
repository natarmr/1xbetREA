.class public final synthetic La/g0g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/n0x;


# direct methods
.method public synthetic constructor <init>(La/n0x;)V
    .locals 1

    .line 1
    const/4 v0, 0x6

    iput-byte v0, p0, La/g0g;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/g0g;->b:La/n0x;

    return-void
.end method

.method public synthetic constructor <init>(La/n0x;IB)V
    .locals 0

    .line 2
    iput-byte p3, p0, La/g0g;->a:B

    iput-object p1, p0, La/g0g;->b:La/n0x;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    .line 1
    iget-byte v0, p0, La/g0g;->a:B

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    iget-object p0, p0, La/g0g;->b:La/n0x;

    .line 5
    .line 6
    packed-switch v0, :pswitch_data_0

    .line 7
    .line 8
    .line 9
    check-cast p1, La/fet;

    .line 10
    .line 11
    check-cast p2, Ljava/lang/Integer;

    .line 12
    .line 13
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    invoke-static {v1}, La/x8x;->L(I)I

    .line 17
    .line 18
    .line 19
    move-result p2

    .line 20
    invoke-static {p0, p1, p2}, La/ktt0;->b(La/n0x;La/fet;I)V

    .line 21
    .line 22
    .line 23
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 24
    .line 25
    return-object p0

    .line 26
    :pswitch_0
    check-cast p1, La/fet;

    .line 27
    .line 28
    check-cast p2, Ljava/lang/Integer;

    .line 29
    .line 30
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 31
    .line 32
    .line 33
    invoke-static {v1}, La/x8x;->L(I)I

    .line 34
    .line 35
    .line 36
    move-result p2

    .line 37
    invoke-static {p0, p1, p2}, La/jpm0;->b(La/n0x;La/fet;I)V

    .line 38
    .line 39
    .line 40
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 41
    .line 42
    return-object p0

    .line 43
    :pswitch_1
    check-cast p1, La/fet;

    .line 44
    .line 45
    check-cast p2, Ljava/lang/Integer;

    .line 46
    .line 47
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 48
    .line 49
    .line 50
    invoke-static {v1}, La/x8x;->L(I)I

    .line 51
    .line 52
    .line 53
    move-result p2

    .line 54
    invoke-static {p0, p1, p2}, La/jtt0;->c(La/n0x;La/fet;I)V

    .line 55
    .line 56
    .line 57
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 58
    .line 59
    return-object p0

    .line 60
    :pswitch_2
    check-cast p1, La/fet;

    .line 61
    .line 62
    check-cast p2, Ljava/lang/Integer;

    .line 63
    .line 64
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 65
    .line 66
    .line 67
    invoke-static {v1}, La/x8x;->L(I)I

    .line 68
    .line 69
    .line 70
    move-result p2

    .line 71
    invoke-static {p0, p1, p2}, La/e9x;->s(La/n0x;La/fet;I)V

    .line 72
    .line 73
    .line 74
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 75
    .line 76
    return-object p0

    .line 77
    :pswitch_3
    move-object v3, p1

    .line 78
    check-cast v3, La/fet;

    .line 79
    .line 80
    check-cast p2, Ljava/lang/Integer;

    .line 81
    .line 82
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 83
    .line 84
    .line 85
    move-result p1

    .line 86
    and-int/lit8 p2, p1, 0x3

    .line 87
    .line 88
    const/4 v0, 0x2

    .line 89
    if-eq p2, v0, :cond_0

    .line 90
    .line 91
    move p2, v1

    .line 92
    goto :goto_0

    .line 93
    :cond_0
    const/4 p2, 0x0

    .line 94
    :goto_0
    and-int/2addr p1, v1

    .line 95
    invoke-virtual {v3, p1, p2}, La/fet;->U(IZ)Z

    .line 96
    .line 97
    .line 98
    move-result p1

    .line 99
    if-eqz p1, :cond_1

    .line 100
    .line 101
    new-instance p1, La/k1x;

    .line 102
    .line 103
    sget-object p2, La/dy2;->b:La/zfn;

    .line 104
    .line 105
    invoke-virtual {v3, p2}, La/fet;->k(Landroidx/compose/runtime/d;)Ljava/lang/Object;

    .line 106
    .line 107
    .line 108
    move-result-object p2

    .line 109
    check-cast p2, Landroid/content/Context;

    .line 110
    .line 111
    invoke-direct {p1, p2}, La/k1x;-><init>(Landroid/content/Context;)V

    .line 112
    .line 113
    .line 114
    invoke-interface {p0}, La/o0x;->a()Ljava/lang/Object;

    .line 115
    .line 116
    .line 117
    move-result-object p0

    .line 118
    iput-object p0, p1, La/k1x;->c:Ljava/lang/Object;

    .line 119
    .line 120
    invoke-virtual {p1}, La/k1x;->a()La/o1x;

    .line 121
    .line 122
    .line 123
    move-result-object v0

    .line 124
    const/4 v4, 0x0

    .line 125
    const/16 v5, 0x1e

    .line 126
    .line 127
    const/4 v1, 0x0

    .line 128
    const/4 v2, 0x0

    .line 129
    invoke-static/range {v0 .. v5}, La/l7x;->X(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;La/qge;La/fet;II)La/mz3;

    .line 130
    .line 131
    .line 132
    move-result-object v0

    .line 133
    sget-object p0, La/qmk;->a:La/zcl;

    .line 134
    .line 135
    const/high16 p0, 0x41c00000    # 24.0f

    .line 136
    .line 137
    sget-object p1, La/jm40;->b:La/jm40;

    .line 138
    .line 139
    invoke-static {p1, p0}, La/o7k0;->e(La/mm40;F)La/mm40;

    .line 140
    .line 141
    .line 142
    move-result-object p0

    .line 143
    const/high16 p1, 0x42940000    # 74.0f

    .line 144
    .line 145
    invoke-static {p0, p1}, La/o7k0;->s(La/mm40;F)La/mm40;

    .line 146
    .line 147
    .line 148
    move-result-object v2

    .line 149
    move-object v5, v3

    .line 150
    sget-wide v3, La/y3d;->g:J

    .line 151
    .line 152
    const/16 v6, 0xc30

    .line 153
    .line 154
    const/4 v7, 0x0

    .line 155
    invoke-static/range {v0 .. v7}, La/dww;->c(La/pm80;Ljava/lang/String;La/mm40;JLa/fet;II)V

    .line 156
    .line 157
    .line 158
    goto :goto_1

    .line 159
    :cond_1
    invoke-virtual {v3}, La/fet;->X()V

    .line 160
    .line 161
    .line 162
    :goto_1
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 163
    .line 164
    return-object p0

    .line 165
    :pswitch_4
    check-cast p1, La/fet;

    .line 166
    .line 167
    check-cast p2, Ljava/lang/Integer;

    .line 168
    .line 169
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 170
    .line 171
    .line 172
    invoke-static {v1}, La/x8x;->L(I)I

    .line 173
    .line 174
    .line 175
    move-result p2

    .line 176
    invoke-static {p0, p1, p2}, La/o9m;->g(La/n0x;La/fet;I)V

    .line 177
    .line 178
    .line 179
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 180
    .line 181
    return-object p0

    .line 182
    :pswitch_5
    check-cast p1, La/fet;

    .line 183
    .line 184
    check-cast p2, Ljava/lang/Integer;

    .line 185
    .line 186
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 187
    .line 188
    .line 189
    const/4 p2, 0x7

    .line 190
    invoke-static {p2}, La/x8x;->L(I)I

    .line 191
    .line 192
    .line 193
    move-result p2

    .line 194
    invoke-static {p0, p1, p2}, La/n6m;->a(La/n0x;La/fet;I)V

    .line 195
    .line 196
    .line 197
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 198
    .line 199
    return-object p0

    .line 200
    :pswitch_6
    check-cast p1, La/fet;

    .line 201
    .line 202
    check-cast p2, Ljava/lang/Integer;

    .line 203
    .line 204
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 205
    .line 206
    .line 207
    invoke-static {v1}, La/x8x;->L(I)I

    .line 208
    .line 209
    .line 210
    move-result p2

    .line 211
    invoke-static {p0, p1, p2}, La/rcb;->l(La/n0x;La/fet;I)V

    .line 212
    .line 213
    .line 214
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 215
    .line 216
    return-object p0

    .line 217
    :pswitch_7
    check-cast p1, La/fet;

    .line 218
    .line 219
    check-cast p2, Ljava/lang/Integer;

    .line 220
    .line 221
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 222
    .line 223
    .line 224
    invoke-static {v1}, La/x8x;->L(I)I

    .line 225
    .line 226
    .line 227
    move-result p2

    .line 228
    invoke-static {p0, p1, p2}, La/dub;->T(La/n0x;La/fet;I)V

    .line 229
    .line 230
    .line 231
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 232
    .line 233
    return-object p0

    .line 234
    :pswitch_8
    check-cast p1, La/fet;

    .line 235
    .line 236
    check-cast p2, Ljava/lang/Integer;

    .line 237
    .line 238
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 239
    .line 240
    .line 241
    invoke-static {v1}, La/x8x;->L(I)I

    .line 242
    .line 243
    .line 244
    move-result p2

    .line 245
    invoke-static {p0, p1, p2}, La/feb;->D(La/n0x;La/fet;I)V

    .line 246
    .line 247
    .line 248
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 249
    .line 250
    return-object p0

    .line 251
    :pswitch_9
    check-cast p1, La/fet;

    .line 252
    .line 253
    check-cast p2, Ljava/lang/Integer;

    .line 254
    .line 255
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 256
    .line 257
    .line 258
    invoke-static {v1}, La/x8x;->L(I)I

    .line 259
    .line 260
    .line 261
    move-result p2

    .line 262
    invoke-static {p0, p1, p2}, La/ozb;->a(La/n0x;La/fet;I)V

    .line 263
    .line 264
    .line 265
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 266
    .line 267
    return-object p0

    .line 268
    nop

    .line 269
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
