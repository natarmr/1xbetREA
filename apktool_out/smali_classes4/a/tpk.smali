.class public final synthetic La/tpk;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/l7m0;

.field public final synthetic c:La/qdz;

.field public final synthetic d:Lkotlin/jvm/functions/Function1;

.field public final synthetic e:Lkotlin/jvm/functions/Function1;


# direct methods
.method public synthetic constructor <init>(La/l7m0;La/qdz;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;B)V
    .locals 0

    .line 1
    iput-byte p5, p0, La/tpk;->a:B

    iput-object p1, p0, La/tpk;->b:La/l7m0;

    iput-object p2, p0, La/tpk;->c:La/qdz;

    iput-object p3, p0, La/tpk;->d:Lkotlin/jvm/functions/Function1;

    iput-object p4, p0, La/tpk;->e:Lkotlin/jvm/functions/Function1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 12

    .line 1
    iget-byte v0, p0, La/tpk;->a:B

    .line 2
    .line 3
    const/16 v1, 0x11

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    const v3, 0x2fd4df92

    .line 7
    .line 8
    .line 9
    iget-object v4, p0, La/tpk;->b:La/l7m0;

    .line 10
    .line 11
    check-cast p1, La/hcz;

    .line 12
    .line 13
    packed-switch v0, :pswitch_data_0

    .line 14
    .line 15
    .line 16
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    invoke-interface {v4}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    check-cast v0, Ljava/util/List;

    .line 24
    .line 25
    new-instance v4, La/vbk;

    .line 26
    .line 27
    const/16 v5, 0x10

    .line 28
    .line 29
    invoke-direct {v4, v5}, La/vbk;-><init>(B)V

    .line 30
    .line 31
    .line 32
    new-instance v5, La/vbk;

    .line 33
    .line 34
    invoke-direct {v5, v1}, La/vbk;-><init>(B)V

    .line 35
    .line 36
    .line 37
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 38
    .line 39
    .line 40
    move-result v1

    .line 41
    new-instance v6, La/vtf;

    .line 42
    .line 43
    const/16 v7, 0x17

    .line 44
    .line 45
    invoke-direct {v6, v4, v0, v7}, La/vtf;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 46
    .line 47
    .line 48
    new-instance v4, La/vtf;

    .line 49
    .line 50
    const/16 v7, 0x18

    .line 51
    .line 52
    invoke-direct {v4, v5, v0, v7}, La/vtf;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 53
    .line 54
    .line 55
    new-instance v5, La/frk;

    .line 56
    .line 57
    iget-object v7, p0, La/tpk;->d:Lkotlin/jvm/functions/Function1;

    .line 58
    .line 59
    iget-object v8, p0, La/tpk;->c:La/qdz;

    .line 60
    .line 61
    iget-object p0, p0, La/tpk;->e:Lkotlin/jvm/functions/Function1;

    .line 62
    .line 63
    invoke-direct {v5, v0, v7, v8, p0}, La/frk;-><init>(Ljava/util/List;Lkotlin/jvm/functions/Function1;La/qdz;Lkotlin/jvm/functions/Function1;)V

    .line 64
    .line 65
    .line 66
    new-instance p0, La/ugd;

    .line 67
    .line 68
    invoke-direct {p0, v3, v2, v5}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 69
    .line 70
    .line 71
    invoke-virtual {p1, v1, v6, v4, p0}, La/hcz;->f(ILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;La/ydr;)V

    .line 72
    .line 73
    .line 74
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 75
    .line 76
    return-object p0

    .line 77
    :pswitch_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 78
    .line 79
    .line 80
    invoke-interface {v4}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 81
    .line 82
    .line 83
    move-result-object v0

    .line 84
    move-object v5, v0

    .line 85
    check-cast v5, Ljava/util/List;

    .line 86
    .line 87
    new-instance v0, La/vbk;

    .line 88
    .line 89
    const/16 v1, 0xe

    .line 90
    .line 91
    invoke-direct {v0, v1}, La/vbk;-><init>(B)V

    .line 92
    .line 93
    .line 94
    new-instance v1, La/vbk;

    .line 95
    .line 96
    const/16 v4, 0xf

    .line 97
    .line 98
    invoke-direct {v1, v4}, La/vbk;-><init>(B)V

    .line 99
    .line 100
    .line 101
    invoke-interface {v5}, Ljava/util/List;->size()I

    .line 102
    .line 103
    .line 104
    move-result v10

    .line 105
    new-instance v11, La/vtf;

    .line 106
    .line 107
    const/16 v4, 0x15

    .line 108
    .line 109
    invoke-direct {v11, v0, v5, v4}, La/vtf;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 110
    .line 111
    .line 112
    new-instance v0, La/vtf;

    .line 113
    .line 114
    const/16 v4, 0x16

    .line 115
    .line 116
    invoke-direct {v0, v1, v5, v4}, La/vtf;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 117
    .line 118
    .line 119
    new-instance v4, La/frk;

    .line 120
    .line 121
    const/4 v9, 0x0

    .line 122
    iget-object v6, p0, La/tpk;->c:La/qdz;

    .line 123
    .line 124
    iget-object v7, p0, La/tpk;->d:Lkotlin/jvm/functions/Function1;

    .line 125
    .line 126
    iget-object v8, p0, La/tpk;->e:Lkotlin/jvm/functions/Function1;

    .line 127
    .line 128
    invoke-direct/range {v4 .. v9}, La/frk;-><init>(Ljava/util/List;La/qdz;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;B)V

    .line 129
    .line 130
    .line 131
    new-instance p0, La/ugd;

    .line 132
    .line 133
    invoke-direct {p0, v3, v2, v4}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 134
    .line 135
    .line 136
    invoke-virtual {p1, v10, v11, v0, p0}, La/hcz;->f(ILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;La/ydr;)V

    .line 137
    .line 138
    .line 139
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 140
    .line 141
    return-object p0

    .line 142
    :pswitch_1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 143
    .line 144
    .line 145
    invoke-interface {v4}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 146
    .line 147
    .line 148
    move-result-object v0

    .line 149
    move-object v5, v0

    .line 150
    check-cast v5, La/a4x;

    .line 151
    .line 152
    new-instance v0, La/vbk;

    .line 153
    .line 154
    const/16 v1, 0xb

    .line 155
    .line 156
    invoke-direct {v0, v1}, La/vbk;-><init>(B)V

    .line 157
    .line 158
    .line 159
    new-instance v1, La/vbk;

    .line 160
    .line 161
    const/16 v4, 0xc

    .line 162
    .line 163
    invoke-direct {v1, v4}, La/vbk;-><init>(B)V

    .line 164
    .line 165
    .line 166
    invoke-interface {v5}, Ljava/util/List;->size()I

    .line 167
    .line 168
    .line 169
    move-result v10

    .line 170
    new-instance v11, La/vtf;

    .line 171
    .line 172
    const/16 v4, 0x13

    .line 173
    .line 174
    invoke-direct {v11, v0, v5, v4}, La/vtf;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 175
    .line 176
    .line 177
    new-instance v0, La/vtf;

    .line 178
    .line 179
    const/16 v4, 0x14

    .line 180
    .line 181
    invoke-direct {v0, v1, v5, v4}, La/vtf;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 182
    .line 183
    .line 184
    new-instance v4, La/vpk;

    .line 185
    .line 186
    const/4 v9, 0x1

    .line 187
    iget-object v6, p0, La/tpk;->c:La/qdz;

    .line 188
    .line 189
    iget-object v7, p0, La/tpk;->d:Lkotlin/jvm/functions/Function1;

    .line 190
    .line 191
    iget-object v8, p0, La/tpk;->e:Lkotlin/jvm/functions/Function1;

    .line 192
    .line 193
    invoke-direct/range {v4 .. v9}, La/vpk;-><init>(La/a4x;La/qdz;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;B)V

    .line 194
    .line 195
    .line 196
    new-instance p0, La/ugd;

    .line 197
    .line 198
    invoke-direct {p0, v3, v2, v4}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 199
    .line 200
    .line 201
    invoke-virtual {p1, v10, v11, v0, p0}, La/hcz;->f(ILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;La/ydr;)V

    .line 202
    .line 203
    .line 204
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 205
    .line 206
    return-object p0

    .line 207
    :pswitch_2
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 208
    .line 209
    .line 210
    invoke-interface {v4}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 211
    .line 212
    .line 213
    move-result-object v0

    .line 214
    move-object v5, v0

    .line 215
    check-cast v5, La/a4x;

    .line 216
    .line 217
    new-instance v0, La/vbk;

    .line 218
    .line 219
    const/16 v4, 0x9

    .line 220
    .line 221
    invoke-direct {v0, v4}, La/vbk;-><init>(B)V

    .line 222
    .line 223
    .line 224
    new-instance v4, La/vbk;

    .line 225
    .line 226
    const/16 v6, 0xa

    .line 227
    .line 228
    invoke-direct {v4, v6}, La/vbk;-><init>(B)V

    .line 229
    .line 230
    .line 231
    invoke-interface {v5}, Ljava/util/List;->size()I

    .line 232
    .line 233
    .line 234
    move-result v10

    .line 235
    new-instance v11, La/vtf;

    .line 236
    .line 237
    invoke-direct {v11, v0, v5, v1}, La/vtf;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 238
    .line 239
    .line 240
    new-instance v0, La/vtf;

    .line 241
    .line 242
    const/16 v1, 0x12

    .line 243
    .line 244
    invoke-direct {v0, v4, v5, v1}, La/vtf;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 245
    .line 246
    .line 247
    new-instance v4, La/vpk;

    .line 248
    .line 249
    const/4 v9, 0x0

    .line 250
    iget-object v6, p0, La/tpk;->c:La/qdz;

    .line 251
    .line 252
    iget-object v7, p0, La/tpk;->e:Lkotlin/jvm/functions/Function1;

    .line 253
    .line 254
    iget-object v8, p0, La/tpk;->d:Lkotlin/jvm/functions/Function1;

    .line 255
    .line 256
    invoke-direct/range {v4 .. v9}, La/vpk;-><init>(La/a4x;La/qdz;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;B)V

    .line 257
    .line 258
    .line 259
    new-instance p0, La/ugd;

    .line 260
    .line 261
    invoke-direct {p0, v3, v2, v4}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 262
    .line 263
    .line 264
    invoke-virtual {p1, v10, v11, v0, p0}, La/hcz;->f(ILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;La/ydr;)V

    .line 265
    .line 266
    .line 267
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 268
    .line 269
    return-object p0

    .line 270
    nop

    .line 271
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
