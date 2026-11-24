.class public final La/s7p0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/v6t0;


# instance fields
.field public final synthetic a:B

.field public final b:La/ctf0;

.field public final c:Ljava/lang/Object;

.field public final d:La/n0o0;

.field public final e:La/n0o0;


# direct methods
.method public constructor <init>(La/aat0;La/ctf0;La/g2v;)V
    .locals 2

    const/4 v0, 0x1

    iput-byte v0, p0, La/s7p0;->a:B

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 91
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 92
    iput-object p2, p0, La/s7p0;->b:La/ctf0;

    .line 93
    iput-object p3, p0, La/s7p0;->c:Ljava/lang/Object;

    .line 94
    new-instance p2, La/caz;

    const/16 p3, 0x1a

    invoke-direct {p2, p0, p3}, La/caz;-><init>(Ljava/lang/Object;B)V

    .line 95
    new-instance p3, La/yw9;

    const/4 v0, 0x0

    const/16 v1, 0x14

    invoke-direct {p3, v0, p2, v1}, La/yw9;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    invoke-static {p3}, La/maz;->b(Lkotlin/jvm/functions/Function0;)La/n0o0;

    move-result-object p2

    .line 96
    iput-object p2, p0, La/s7p0;->d:La/n0o0;

    .line 97
    new-instance p2, La/lcr0;

    const/16 p3, 0x19

    invoke-direct {p2, p0, p3}, La/lcr0;-><init>(Ljava/lang/Object;B)V

    .line 98
    new-instance p3, La/yw9;

    invoke-direct {p3, p1, p2, v1}, La/yw9;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    invoke-static {p3}, La/maz;->b(Lkotlin/jvm/functions/Function0;)La/n0o0;

    move-result-object p1

    .line 99
    iput-object p1, p0, La/s7p0;->e:La/n0o0;

    return-void
.end method

.method public constructor <init>(La/kyo0;La/ctf0;)V
    .locals 3

    const/4 v0, 0x4

    iput-byte v0, p0, La/s7p0;->a:B

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 100
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 101
    iput-object p2, p0, La/s7p0;->b:La/ctf0;

    .line 102
    iget-object p2, p1, La/kyo0;->e:La/j3p0;

    .line 103
    invoke-static {p2}, La/bkb;->H(Ljava/lang/Object;)La/n0o0;

    move-result-object p2

    iput-object p2, p0, La/s7p0;->d:La/n0o0;

    .line 104
    sget-object p2, La/j3p0;->e:La/c0o;

    .line 105
    new-instance v0, La/ttn0;

    const/16 v1, 0x10

    invoke-direct {v0, p0, v1}, La/ttn0;-><init>(Ljava/lang/Object;B)V

    .line 106
    new-instance v1, La/yw9;

    const/16 v2, 0x14

    invoke-direct {v1, p2, v0, v2}, La/yw9;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    invoke-static {v1}, La/maz;->b(Lkotlin/jvm/functions/Function0;)La/n0o0;

    move-result-object p2

    .line 107
    iput-object p2, p0, La/s7p0;->e:La/n0o0;

    .line 108
    new-instance p2, La/meo0;

    const/16 v0, 0xb

    invoke-direct {p2, v0}, La/meo0;-><init>(B)V

    .line 109
    new-instance v0, La/yw9;

    invoke-direct {v0, p1, p2, v2}, La/yw9;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    invoke-static {v0}, La/maz;->b(Lkotlin/jvm/functions/Function0;)La/n0o0;

    move-result-object p1

    .line 110
    iput-object p1, p0, La/s7p0;->c:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(La/p7p0;La/ctf0;La/g2v;)V
    .locals 2

    const/4 v0, 0x0

    iput-byte v0, p0, La/s7p0;->a:B

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 82
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 83
    iput-object p2, p0, La/s7p0;->b:La/ctf0;

    .line 84
    iput-object p3, p0, La/s7p0;->c:Ljava/lang/Object;

    .line 85
    new-instance p2, La/caz;

    const/16 p3, 0x13

    invoke-direct {p2, p0, p3}, La/caz;-><init>(Ljava/lang/Object;B)V

    .line 86
    new-instance p3, La/yw9;

    const/4 v0, 0x0

    const/16 v1, 0x14

    invoke-direct {p3, v0, p2, v1}, La/yw9;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    invoke-static {p3}, La/maz;->b(Lkotlin/jvm/functions/Function0;)La/n0o0;

    move-result-object p2

    .line 87
    iput-object p2, p0, La/s7p0;->d:La/n0o0;

    .line 88
    new-instance p2, La/ttn0;

    const/16 p3, 0x15

    invoke-direct {p2, p0, p3}, La/ttn0;-><init>(Ljava/lang/Object;B)V

    .line 89
    new-instance p3, La/yw9;

    invoke-direct {p3, p1, p2, v1}, La/yw9;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    invoke-static {p3}, La/maz;->b(Lkotlin/jvm/functions/Function0;)La/n0o0;

    move-result-object p1

    .line 90
    iput-object p1, p0, La/s7p0;->e:La/n0o0;

    return-void
.end method

.method public constructor <init>(La/wat0;La/ctf0;La/g2v;)V
    .locals 2

    const/4 v0, 0x2

    iput-byte v0, p0, La/s7p0;->a:B

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 72
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 73
    iput-object p2, p0, La/s7p0;->b:La/ctf0;

    .line 74
    iput-object p3, p0, La/s7p0;->c:Ljava/lang/Object;

    .line 75
    new-instance p2, La/caz;

    const/16 p3, 0x1b

    invoke-direct {p2, p0, p3}, La/caz;-><init>(Ljava/lang/Object;B)V

    .line 76
    new-instance p3, La/yw9;

    const/4 v0, 0x0

    const/16 v1, 0x14

    invoke-direct {p3, v0, p2, v1}, La/yw9;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    invoke-static {p3}, La/maz;->b(Lkotlin/jvm/functions/Function0;)La/n0o0;

    move-result-object p2

    .line 77
    iput-object p2, p0, La/s7p0;->d:La/n0o0;

    .line 78
    iget-object p1, p1, La/wat0;->b:La/j0g0;

    .line 79
    new-instance p2, La/qzs0;

    const/4 p3, 0x3

    invoke-direct {p2, p3}, La/qzs0;-><init>(B)V

    .line 80
    new-instance p3, La/yw9;

    invoke-direct {p3, p1, p2, v1}, La/yw9;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    invoke-static {p3}, La/maz;->b(Lkotlin/jvm/functions/Function0;)La/n0o0;

    move-result-object p1

    .line 81
    iput-object p1, p0, La/s7p0;->e:La/n0o0;

    return-void
.end method

.method public constructor <init>(Lorg/xplatform/ufc/api/weight_class_rating/UfcWeightClassRatingParams;La/z7v0;La/g2v;La/ctf0;)V
    .locals 2

    .line 1
    const/4 v0, 0x3

    .line 2
    iput-byte v0, p0, La/s7p0;->a:B

    .line 3
    .line 4
    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    iput-object p3, p0, La/s7p0;->c:Ljava/lang/Object;

    .line 11
    .line 12
    iput-object p4, p0, La/s7p0;->b:La/ctf0;

    .line 13
    .line 14
    new-instance p3, La/xlr0;

    .line 15
    .line 16
    const/16 p4, 0xb

    .line 17
    .line 18
    invoke-direct {p3, p1, p0, p4}, La/xlr0;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 19
    .line 20
    .line 21
    new-instance p4, La/yw9;

    .line 22
    .line 23
    const/4 v0, 0x0

    .line 24
    const/16 v1, 0x14

    .line 25
    .line 26
    invoke-direct {p4, v0, p3, v1}, La/yw9;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 27
    .line 28
    .line 29
    invoke-static {p4}, La/maz;->b(Lkotlin/jvm/functions/Function0;)La/n0o0;

    .line 30
    .line 31
    .line 32
    move-result-object p3

    .line 33
    iput-object p3, p0, La/s7p0;->d:La/n0o0;

    .line 34
    .line 35
    iget-object p2, p2, La/z7v0;->a:La/j0g0;

    .line 36
    .line 37
    if-eqz p2, :cond_1

    .line 38
    .line 39
    iget-object p2, p2, La/j0g0;->a:Ljava/lang/Object;

    .line 40
    .line 41
    instance-of p3, p2, La/g0g0;

    .line 42
    .line 43
    if-eqz p3, :cond_0

    .line 44
    .line 45
    goto :goto_0

    .line 46
    :cond_0
    move-object v0, p2

    .line 47
    :goto_0
    check-cast v0, Ljava/util/List;

    .line 48
    .line 49
    :cond_1
    if-nez v0, :cond_2

    .line 50
    .line 51
    sget-object v0, La/iun;->a:La/iun;

    .line 52
    .line 53
    :cond_2
    new-instance p2, La/xis0;

    .line 54
    .line 55
    const/16 p3, 0x1a

    .line 56
    .line 57
    invoke-direct {p2, p0, p1, p3}, La/xis0;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 58
    .line 59
    .line 60
    new-instance p1, La/yw9;

    .line 61
    .line 62
    invoke-direct {p1, v0, p2, v1}, La/yw9;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 63
    .line 64
    .line 65
    invoke-static {p1}, La/maz;->b(Lkotlin/jvm/functions/Function0;)La/n0o0;

    .line 66
    .line 67
    .line 68
    move-result-object p1

    .line 69
    iput-object p1, p0, La/s7p0;->e:La/n0o0;

    .line 70
    .line 71
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11

    .line 1
    iget-byte v0, p0, La/s7p0;->a:B

    .line 2
    .line 3
    const/16 v1, 0xa

    .line 4
    .line 5
    const-wide/16 v2, -0x1

    .line 6
    .line 7
    const/4 v4, 0x0

    .line 8
    const/4 v5, 0x1

    .line 9
    iget-object v6, p0, La/s7p0;->e:La/n0o0;

    .line 10
    .line 11
    iget-object v7, p0, La/s7p0;->c:Ljava/lang/Object;

    .line 12
    .line 13
    iget-object p0, p0, La/s7p0;->d:La/n0o0;

    .line 14
    .line 15
    packed-switch v0, :pswitch_data_0

    .line 16
    .line 17
    .line 18
    check-cast p1, La/kyo0;

    .line 19
    .line 20
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 21
    .line 22
    .line 23
    invoke-virtual {p0}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    check-cast v0, La/fee;

    .line 28
    .line 29
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 30
    .line 31
    .line 32
    invoke-virtual {v0}, La/fee;->a()La/pz40;

    .line 33
    .line 34
    .line 35
    move-result-object v1

    .line 36
    invoke-virtual {v0}, La/fee;->a()La/pz40;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    invoke-interface {v0}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    check-cast v0, La/j3p0;

    .line 45
    .line 46
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 47
    .line 48
    .line 49
    iget-object v0, p1, La/kyo0;->e:La/j3p0;

    .line 50
    .line 51
    invoke-interface {v1, v0}, La/pz40;->setValue(Ljava/lang/Object;)V

    .line 52
    .line 53
    .line 54
    check-cast v7, La/n0o0;

    .line 55
    .line 56
    invoke-virtual {v7}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    move-result-object v0

    .line 60
    check-cast v0, La/fee;

    .line 61
    .line 62
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 63
    .line 64
    .line 65
    invoke-virtual {v0}, La/fee;->a()La/pz40;

    .line 66
    .line 67
    .line 68
    move-result-object v1

    .line 69
    invoke-virtual {v0}, La/fee;->a()La/pz40;

    .line 70
    .line 71
    .line 72
    move-result-object v0

    .line 73
    invoke-interface {v0}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 74
    .line 75
    .line 76
    move-result-object v0

    .line 77
    check-cast v0, La/kyo0;

    .line 78
    .line 79
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 80
    .line 81
    .line 82
    invoke-interface {v1, p1}, La/pz40;->setValue(Ljava/lang/Object;)V

    .line 83
    .line 84
    .line 85
    invoke-virtual {v7}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 86
    .line 87
    .line 88
    move-result-object v0

    .line 89
    check-cast v0, La/fee;

    .line 90
    .line 91
    invoke-virtual {v0}, La/fee;->b()Ljava/lang/Object;

    .line 92
    .line 93
    .line 94
    move-result-object v0

    .line 95
    check-cast v0, La/q6n;

    .line 96
    .line 97
    iget-object p1, p1, La/kyo0;->a:La/jyo0;

    .line 98
    .line 99
    if-eqz p1, :cond_0

    .line 100
    .line 101
    iget-object p1, p1, La/jyo0;->a:La/dxh0;

    .line 102
    .line 103
    goto :goto_0

    .line 104
    :cond_0
    sget-object p1, La/axh0;->a:La/axh0;

    .line 105
    .line 106
    :goto_0
    invoke-virtual {v6}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 107
    .line 108
    .line 109
    move-result-object v1

    .line 110
    check-cast v1, La/fee;

    .line 111
    .line 112
    invoke-virtual {v1}, La/fee;->b()Ljava/lang/Object;

    .line 113
    .line 114
    .line 115
    move-result-object v1

    .line 116
    check-cast v1, La/a4x;

    .line 117
    .line 118
    invoke-virtual {p0}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 119
    .line 120
    .line 121
    move-result-object p0

    .line 122
    check-cast p0, La/fee;

    .line 123
    .line 124
    invoke-virtual {p0}, La/fee;->c()Ljava/lang/Object;

    .line 125
    .line 126
    .line 127
    move-result-object p0

    .line 128
    check-cast p0, La/j3p0;

    .line 129
    .line 130
    new-instance v2, La/lyo0;

    .line 131
    .line 132
    invoke-direct {v2, v0, v1, p1, p0}, La/lyo0;-><init>(La/q6n;La/a4x;La/dxh0;La/j3p0;)V

    .line 133
    .line 134
    .line 135
    return-object v2

    .line 136
    :pswitch_0
    check-cast p1, La/z7v0;

    .line 137
    .line 138
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 139
    .line 140
    .line 141
    new-instance v0, La/b8v0;

    .line 142
    .line 143
    invoke-virtual {p0}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 144
    .line 145
    .line 146
    move-result-object p0

    .line 147
    check-cast p0, La/fee;

    .line 148
    .line 149
    iget-object p0, p0, La/fee;->e:La/zbk;

    .line 150
    .line 151
    check-cast v7, La/g2v;

    .line 152
    .line 153
    iget-object v2, p1, La/z7v0;->a:La/j0g0;

    .line 154
    .line 155
    if-nez v2, :cond_1

    .line 156
    .line 157
    iget-boolean p1, p1, La/z7v0;->b:Z

    .line 158
    .line 159
    if-nez p1, :cond_1

    .line 160
    .line 161
    new-instance p1, La/y7v0;

    .line 162
    .line 163
    new-instance v1, La/w7v0;

    .line 164
    .line 165
    sget-object v2, La/ldm;->a:La/ldm;

    .line 166
    .line 167
    invoke-static {v7, v2}, La/yyw;->N(La/g2v;La/ldm;)La/mdm;

    .line 168
    .line 169
    .line 170
    move-result-object v2

    .line 171
    invoke-direct {v1, v2}, La/w7v0;-><init>(La/mdm;)V

    .line 172
    .line 173
    .line 174
    invoke-direct {p1, v1}, La/y7v0;-><init>(La/w7v0;)V

    .line 175
    .line 176
    .line 177
    goto/16 :goto_2

    .line 178
    .line 179
    :cond_1
    sget-object p1, La/v7v0;->a:La/v7v0;

    .line 180
    .line 181
    if-nez v2, :cond_3

    .line 182
    .line 183
    new-instance v2, La/y7v0;

    .line 184
    .line 185
    new-instance v3, La/p7v0;

    .line 186
    .line 187
    const-string v5, "CHAMPION_SHIMMER"

    .line 188
    .line 189
    sget-object v6, La/hoh;->a:La/hoh;

    .line 190
    .line 191
    invoke-direct {v3, v5, v6}, La/p7v0;-><init>(Ljava/lang/String;La/ioh;)V

    .line 192
    .line 193
    .line 194
    new-instance v5, Ljava/util/ArrayList;

    .line 195
    .line 196
    invoke-direct {v5, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 197
    .line 198
    .line 199
    :goto_1
    if-ge v4, v1, :cond_2

    .line 200
    .line 201
    new-instance v6, La/u7v0;

    .line 202
    .line 203
    invoke-static {v4}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 204
    .line 205
    .line 206
    move-result-object v7

    .line 207
    sget-object v8, La/loh;->a:La/loh;

    .line 208
    .line 209
    invoke-direct {v6, v7, v8}, La/u7v0;-><init>(Ljava/lang/String;La/moh;)V

    .line 210
    .line 211
    .line 212
    invoke-virtual {v5, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 213
    .line 214
    .line 215
    add-int/lit8 v4, v4, 0x1

    .line 216
    .line 217
    goto :goto_1

    .line 218
    :cond_2
    invoke-static {}, Lkotlin/collections/a;->b()La/lc00;

    .line 219
    .line 220
    .line 221
    move-result-object v1

    .line 222
    invoke-virtual {v1, v3}, La/lc00;->add(Ljava/lang/Object;)Z

    .line 223
    .line 224
    .line 225
    invoke-virtual {v1, v5}, La/lc00;->addAll(Ljava/util/Collection;)Z

    .line 226
    .line 227
    .line 228
    invoke-static {v1}, Lkotlin/collections/a;->a(Ljava/util/List;)La/lc00;

    .line 229
    .line 230
    .line 231
    move-result-object v1

    .line 232
    invoke-static {v1}, La/dyb;->o0(Ljava/lang/Iterable;)La/a4x;

    .line 233
    .line 234
    .line 235
    move-result-object v1

    .line 236
    invoke-direct {v2, p1, v1}, La/y7v0;-><init>(La/x7v0;La/a4x;)V

    .line 237
    .line 238
    .line 239
    move-object p1, v2

    .line 240
    goto/16 :goto_2

    .line 241
    .line 242
    :cond_3
    iget-object v1, v2, La/j0g0;->a:Ljava/lang/Object;

    .line 243
    .line 244
    instance-of v2, v1, La/g0g0;

    .line 245
    .line 246
    if-eqz v2, :cond_4

    .line 247
    .line 248
    new-instance p1, La/y7v0;

    .line 249
    .line 250
    new-instance v1, La/w7v0;

    .line 251
    .line 252
    sget-object v2, La/ldm;->a:La/ldm;

    .line 253
    .line 254
    invoke-static {v7, v2}, La/yyw;->N(La/g2v;La/ldm;)La/mdm;

    .line 255
    .line 256
    .line 257
    move-result-object v2

    .line 258
    invoke-direct {v1, v2}, La/w7v0;-><init>(La/mdm;)V

    .line 259
    .line 260
    .line 261
    invoke-direct {p1, v1}, La/y7v0;-><init>(La/w7v0;)V

    .line 262
    .line 263
    .line 264
    goto :goto_2

    .line 265
    :cond_4
    invoke-virtual {v6}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 266
    .line 267
    .line 268
    move-result-object v2

    .line 269
    check-cast v2, La/fee;

    .line 270
    .line 271
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 272
    .line 273
    .line 274
    invoke-virtual {v2}, La/fee;->a()La/pz40;

    .line 275
    .line 276
    .line 277
    move-result-object v3

    .line 278
    invoke-virtual {v2}, La/fee;->a()La/pz40;

    .line 279
    .line 280
    .line 281
    move-result-object v2

    .line 282
    invoke-interface {v2}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 283
    .line 284
    .line 285
    move-result-object v2

    .line 286
    check-cast v2, Ljava/util/List;

    .line 287
    .line 288
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 289
    .line 290
    .line 291
    instance-of v2, v1, La/g0g0;

    .line 292
    .line 293
    if-eqz v2, :cond_5

    .line 294
    .line 295
    const/4 v1, 0x0

    .line 296
    :cond_5
    check-cast v1, Ljava/util/List;

    .line 297
    .line 298
    if-nez v1, :cond_6

    .line 299
    .line 300
    sget-object v1, La/iun;->a:La/iun;

    .line 301
    .line 302
    :cond_6
    invoke-interface {v3, v1}, La/pz40;->setValue(Ljava/lang/Object;)V

    .line 303
    .line 304
    .line 305
    invoke-virtual {v6}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 306
    .line 307
    .line 308
    move-result-object v1

    .line 309
    check-cast v1, La/fee;

    .line 310
    .line 311
    invoke-virtual {v1}, La/fee;->b()Ljava/lang/Object;

    .line 312
    .line 313
    .line 314
    move-result-object v1

    .line 315
    check-cast v1, La/a4x;

    .line 316
    .line 317
    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    .line 318
    .line 319
    .line 320
    move-result v1

    .line 321
    if-eqz v1, :cond_7

    .line 322
    .line 323
    new-instance p1, La/y7v0;

    .line 324
    .line 325
    new-instance v1, La/w7v0;

    .line 326
    .line 327
    invoke-static {v7}, La/yyw;->M(La/g2v;)La/mdm;

    .line 328
    .line 329
    .line 330
    move-result-object v2

    .line 331
    invoke-direct {v1, v2}, La/w7v0;-><init>(La/mdm;)V

    .line 332
    .line 333
    .line 334
    invoke-direct {p1, v1}, La/y7v0;-><init>(La/w7v0;)V

    .line 335
    .line 336
    .line 337
    goto :goto_2

    .line 338
    :cond_7
    new-instance v1, La/y7v0;

    .line 339
    .line 340
    invoke-static {}, Lkotlin/collections/a;->b()La/lc00;

    .line 341
    .line 342
    .line 343
    move-result-object v2

    .line 344
    invoke-virtual {v6}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 345
    .line 346
    .line 347
    move-result-object v3

    .line 348
    check-cast v3, La/fee;

    .line 349
    .line 350
    invoke-virtual {v3}, La/fee;->b()Ljava/lang/Object;

    .line 351
    .line 352
    .line 353
    move-result-object v3

    .line 354
    check-cast v3, Ljava/util/Collection;

    .line 355
    .line 356
    invoke-static {v2, v3, v2}, La/twn;->k(La/lc00;Ljava/util/Collection;La/lc00;)La/a4x;

    .line 357
    .line 358
    .line 359
    move-result-object v2

    .line 360
    invoke-direct {v1, p1, v2}, La/y7v0;-><init>(La/x7v0;La/a4x;)V

    .line 361
    .line 362
    .line 363
    move-object p1, v1

    .line 364
    :goto_2
    invoke-direct {v0, p0, p1}, La/b8v0;-><init>(La/l7m0;La/y7v0;)V

    .line 365
    .line 366
    .line 367
    return-object v0

    .line 368
    :pswitch_1
    check-cast p1, La/wat0;

    .line 369
    .line 370
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 371
    .line 372
    .line 373
    invoke-virtual {v6}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 374
    .line 375
    .line 376
    move-result-object v0

    .line 377
    check-cast v0, La/fee;

    .line 378
    .line 379
    iget-object p1, p1, La/wat0;->b:La/j0g0;

    .line 380
    .line 381
    invoke-virtual {v0, p1}, La/fee;->d(Ljava/lang/Object;)V

    .line 382
    .line 383
    .line 384
    if-nez p1, :cond_8

    .line 385
    .line 386
    move v0, v5

    .line 387
    goto :goto_3

    .line 388
    :cond_8
    move v0, v4

    .line 389
    :goto_3
    if-eqz v0, :cond_a

    .line 390
    .line 391
    new-instance v6, Ljava/util/ArrayList;

    .line 392
    .line 393
    invoke-direct {v6, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 394
    .line 395
    .line 396
    :goto_4
    if-ge v4, v1, :cond_9

    .line 397
    .line 398
    new-instance v8, La/pat0;

    .line 399
    .line 400
    const-string v9, "CHAMP_PRIZE_POOL_SHIMMER_KEY"

    .line 401
    .line 402
    invoke-static {v4, v9}, La/twn;->m(ILjava/lang/String;)Ljava/lang/String;

    .line 403
    .line 404
    .line 405
    move-result-object v9

    .line 406
    sget-object v10, La/p8m;->a:La/p8m;

    .line 407
    .line 408
    invoke-direct {v8, v9, v10}, La/pat0;-><init>(Ljava/lang/String;La/q8m;)V

    .line 409
    .line 410
    .line 411
    invoke-virtual {v6, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 412
    .line 413
    .line 414
    add-int/lit8 v4, v4, 0x1

    .line 415
    .line 416
    goto :goto_4

    .line 417
    :cond_9
    invoke-static {v6}, La/dyb;->o0(Ljava/lang/Iterable;)La/a4x;

    .line 418
    .line 419
    .line 420
    move-result-object v1

    .line 421
    goto :goto_5

    .line 422
    :cond_a
    invoke-virtual {v6}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 423
    .line 424
    .line 425
    move-result-object v1

    .line 426
    check-cast v1, La/fee;

    .line 427
    .line 428
    invoke-virtual {v1}, La/fee;->b()Ljava/lang/Object;

    .line 429
    .line 430
    .line 431
    move-result-object v1

    .line 432
    check-cast v1, Ljava/lang/Iterable;

    .line 433
    .line 434
    invoke-static {v1}, La/dyb;->o0(Ljava/lang/Iterable;)La/a4x;

    .line 435
    .line 436
    .line 437
    move-result-object v1

    .line 438
    :goto_5
    new-instance v4, La/xat0;

    .line 439
    .line 440
    invoke-virtual {p0}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 441
    .line 442
    .line 443
    move-result-object p0

    .line 444
    check-cast p0, La/fee;

    .line 445
    .line 446
    invoke-virtual {p0}, La/fee;->b()Ljava/lang/Object;

    .line 447
    .line 448
    .line 449
    move-result-object p0

    .line 450
    check-cast p0, La/gat0;

    .line 451
    .line 452
    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    .line 453
    .line 454
    .line 455
    move-result v6

    .line 456
    check-cast v7, La/g2v;

    .line 457
    .line 458
    if-eqz p1, :cond_b

    .line 459
    .line 460
    iget-object p1, p1, La/j0g0;->a:Ljava/lang/Object;

    .line 461
    .line 462
    instance-of p1, p1, La/g0g0;

    .line 463
    .line 464
    if-ne p1, v5, :cond_b

    .line 465
    .line 466
    new-instance p1, La/rat0;

    .line 467
    .line 468
    invoke-static {v2, v3, v7}, La/ozb;->Q(JLa/g2v;)La/mdm;

    .line 469
    .line 470
    .line 471
    move-result-object v2

    .line 472
    invoke-direct {p1, v2}, La/rat0;-><init>(La/mdm;)V

    .line 473
    .line 474
    .line 475
    goto :goto_6

    .line 476
    :cond_b
    if-eqz v6, :cond_c

    .line 477
    .line 478
    new-instance p1, La/rat0;

    .line 479
    .line 480
    invoke-static {v2, v3, v7}, La/ozb;->P(JLa/g2v;)La/mdm;

    .line 481
    .line 482
    .line 483
    move-result-object v2

    .line 484
    invoke-direct {p1, v2}, La/rat0;-><init>(La/mdm;)V

    .line 485
    .line 486
    .line 487
    goto :goto_6

    .line 488
    :cond_c
    sget-object p1, La/qat0;->a:La/qat0;

    .line 489
    .line 490
    :goto_6
    invoke-direct {v4, p0, p1, v1, v0}, La/xat0;-><init>(La/gat0;La/sat0;La/a4x;Z)V

    .line 491
    .line 492
    .line 493
    return-object v4

    .line 494
    :pswitch_2
    check-cast p1, La/aat0;

    .line 495
    .line 496
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 497
    .line 498
    .line 499
    invoke-virtual {v6}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 500
    .line 501
    .line 502
    move-result-object v0

    .line 503
    check-cast v0, La/fee;

    .line 504
    .line 505
    invoke-virtual {v0, p1}, La/fee;->d(Ljava/lang/Object;)V

    .line 506
    .line 507
    .line 508
    iget-object p1, p1, La/aat0;->b:La/j0g0;

    .line 509
    .line 510
    if-nez p1, :cond_d

    .line 511
    .line 512
    move v0, v5

    .line 513
    goto :goto_7

    .line 514
    :cond_d
    move v0, v4

    .line 515
    :goto_7
    if-eqz v0, :cond_e

    .line 516
    .line 517
    new-instance v1, La/bat0;

    .line 518
    .line 519
    const-string v6, "CHAMP_INFO_SHIMMER_KEY"

    .line 520
    .line 521
    sget-object v8, La/hnh;->a:La/hnh;

    .line 522
    .line 523
    invoke-direct {v1, v6, v8}, La/bat0;-><init>(Ljava/lang/String;La/inh;)V

    .line 524
    .line 525
    .line 526
    const/4 v6, 0x2

    .line 527
    new-array v6, v6, [La/p6t0;

    .line 528
    .line 529
    sget-object v8, La/adt0;->a:La/adt0;

    .line 530
    .line 531
    aput-object v8, v6, v4

    .line 532
    .line 533
    aput-object v1, v6, v5

    .line 534
    .line 535
    invoke-static {v6}, La/dyb;->g0([Ljava/lang/Object;)La/i4;

    .line 536
    .line 537
    .line 538
    move-result-object v1

    .line 539
    goto :goto_8

    .line 540
    :cond_e
    invoke-virtual {v6}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 541
    .line 542
    .line 543
    move-result-object v1

    .line 544
    check-cast v1, La/fee;

    .line 545
    .line 546
    invoke-virtual {v1}, La/fee;->b()Ljava/lang/Object;

    .line 547
    .line 548
    .line 549
    move-result-object v1

    .line 550
    check-cast v1, Ljava/lang/Iterable;

    .line 551
    .line 552
    invoke-static {v1}, La/dyb;->o0(Ljava/lang/Iterable;)La/a4x;

    .line 553
    .line 554
    .line 555
    move-result-object v1

    .line 556
    :goto_8
    new-instance v4, La/cat0;

    .line 557
    .line 558
    invoke-virtual {p0}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 559
    .line 560
    .line 561
    move-result-object p0

    .line 562
    check-cast p0, La/fee;

    .line 563
    .line 564
    invoke-virtual {p0}, La/fee;->b()Ljava/lang/Object;

    .line 565
    .line 566
    .line 567
    move-result-object p0

    .line 568
    check-cast p0, La/gat0;

    .line 569
    .line 570
    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    .line 571
    .line 572
    .line 573
    move-result v6

    .line 574
    check-cast v7, La/g2v;

    .line 575
    .line 576
    if-eqz p1, :cond_f

    .line 577
    .line 578
    iget-object p1, p1, La/j0g0;->a:Ljava/lang/Object;

    .line 579
    .line 580
    instance-of p1, p1, La/g0g0;

    .line 581
    .line 582
    if-ne p1, v5, :cond_f

    .line 583
    .line 584
    new-instance p1, La/v9t0;

    .line 585
    .line 586
    invoke-static {v2, v3, v7}, La/ozb;->Q(JLa/g2v;)La/mdm;

    .line 587
    .line 588
    .line 589
    move-result-object v2

    .line 590
    invoke-direct {p1, v2}, La/v9t0;-><init>(La/mdm;)V

    .line 591
    .line 592
    .line 593
    goto :goto_9

    .line 594
    :cond_f
    if-eqz v6, :cond_10

    .line 595
    .line 596
    new-instance p1, La/v9t0;

    .line 597
    .line 598
    invoke-static {v2, v3, v7}, La/ozb;->P(JLa/g2v;)La/mdm;

    .line 599
    .line 600
    .line 601
    move-result-object v2

    .line 602
    invoke-direct {p1, v2}, La/v9t0;-><init>(La/mdm;)V

    .line 603
    .line 604
    .line 605
    goto :goto_9

    .line 606
    :cond_10
    sget-object p1, La/u9t0;->a:La/u9t0;

    .line 607
    .line 608
    :goto_9
    invoke-direct {v4, p0, p1, v1, v0}, La/cat0;-><init>(La/gat0;La/w9t0;La/a4x;Z)V

    .line 609
    .line 610
    .line 611
    return-object v4

    .line 612
    :pswitch_3
    check-cast p1, La/p7p0;

    .line 613
    .line 614
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 615
    .line 616
    .line 617
    invoke-virtual {v6}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 618
    .line 619
    .line 620
    move-result-object v0

    .line 621
    check-cast v0, La/fee;

    .line 622
    .line 623
    invoke-virtual {v0, p1}, La/fee;->d(Ljava/lang/Object;)V

    .line 624
    .line 625
    .line 626
    iget-object v0, p1, La/p7p0;->b:La/o9p0;

    .line 627
    .line 628
    iget-boolean p1, p1, La/p7p0;->a:Z

    .line 629
    .line 630
    if-nez v0, :cond_11

    .line 631
    .line 632
    if-eqz p1, :cond_11

    .line 633
    .line 634
    goto :goto_a

    .line 635
    :cond_11
    move v5, v4

    .line 636
    :goto_a
    if-eqz v5, :cond_13

    .line 637
    .line 638
    new-instance v0, Ljava/util/ArrayList;

    .line 639
    .line 640
    const/16 v1, 0x8

    .line 641
    .line 642
    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 643
    .line 644
    .line 645
    :goto_b
    if-ge v4, v1, :cond_12

    .line 646
    .line 647
    new-instance v6, La/q7p0;

    .line 648
    .line 649
    const-string v8, "ACHIEVEMENTS_SHIMMER_KEY"

    .line 650
    .line 651
    invoke-static {v4, v8}, La/twn;->m(ILjava/lang/String;)Ljava/lang/String;

    .line 652
    .line 653
    .line 654
    move-result-object v8

    .line 655
    sget-object v9, La/i0g;->a:La/i0g;

    .line 656
    .line 657
    invoke-direct {v6, v8, v9}, La/q7p0;-><init>(Ljava/lang/String;La/j0g;)V

    .line 658
    .line 659
    .line 660
    invoke-virtual {v0, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 661
    .line 662
    .line 663
    add-int/lit8 v4, v4, 0x1

    .line 664
    .line 665
    goto :goto_b

    .line 666
    :cond_12
    invoke-static {v0}, La/dyb;->o0(Ljava/lang/Iterable;)La/a4x;

    .line 667
    .line 668
    .line 669
    move-result-object v0

    .line 670
    goto :goto_c

    .line 671
    :cond_13
    if-eqz v0, :cond_14

    .line 672
    .line 673
    invoke-virtual {v6}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 674
    .line 675
    .line 676
    move-result-object v0

    .line 677
    check-cast v0, La/fee;

    .line 678
    .line 679
    invoke-virtual {v0}, La/fee;->b()Ljava/lang/Object;

    .line 680
    .line 681
    .line 682
    move-result-object v0

    .line 683
    check-cast v0, Ljava/lang/Iterable;

    .line 684
    .line 685
    invoke-static {v0}, La/dyb;->o0(Ljava/lang/Iterable;)La/a4x;

    .line 686
    .line 687
    .line 688
    move-result-object v0

    .line 689
    goto :goto_c

    .line 690
    :cond_14
    sget-object v0, La/lak0;->c:La/lak0;

    .line 691
    .line 692
    :goto_c
    new-instance v1, La/r7p0;

    .line 693
    .line 694
    invoke-virtual {p0}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 695
    .line 696
    .line 697
    move-result-object p0

    .line 698
    check-cast p0, La/fee;

    .line 699
    .line 700
    invoke-virtual {p0}, La/fee;->b()Ljava/lang/Object;

    .line 701
    .line 702
    .line 703
    move-result-object p0

    .line 704
    check-cast p0, La/p9p0;

    .line 705
    .line 706
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 707
    .line 708
    .line 709
    move-result v4

    .line 710
    check-cast v7, La/g2v;

    .line 711
    .line 712
    if-eqz v4, :cond_15

    .line 713
    .line 714
    if-nez p1, :cond_15

    .line 715
    .line 716
    new-instance p1, La/i7p0;

    .line 717
    .line 718
    invoke-static {v2, v3, v7}, La/ozb;->Q(JLa/g2v;)La/mdm;

    .line 719
    .line 720
    .line 721
    move-result-object v2

    .line 722
    invoke-direct {p1, v2}, La/i7p0;-><init>(La/mdm;)V

    .line 723
    .line 724
    .line 725
    goto :goto_d

    .line 726
    :cond_15
    if-eqz v4, :cond_16

    .line 727
    .line 728
    new-instance p1, La/i7p0;

    .line 729
    .line 730
    invoke-static {v2, v3, v7}, La/ozb;->P(JLa/g2v;)La/mdm;

    .line 731
    .line 732
    .line 733
    move-result-object v2

    .line 734
    invoke-direct {p1, v2}, La/i7p0;-><init>(La/mdm;)V

    .line 735
    .line 736
    .line 737
    goto :goto_d

    .line 738
    :cond_16
    sget-object p1, La/h7p0;->a:La/h7p0;

    .line 739
    .line 740
    :goto_d
    invoke-direct {v1, p0, p1, v0, v5}, La/r7p0;-><init>(La/p9p0;La/j7p0;La/a4x;Z)V

    .line 741
    .line 742
    .line 743
    return-object v1

    .line 744
    nop

    .line 745
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
