.class public final synthetic La/q3l0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/a4x;

.field public final synthetic c:La/xdr;

.field public final synthetic d:Lkotlin/jvm/functions/Function1;

.field public final synthetic e:Lkotlin/jvm/functions/Function0;

.field public final synthetic f:Lkotlin/jvm/functions/Function0;

.field public final synthetic g:La/ngk0;

.field public final synthetic h:La/pz40;


# direct methods
.method public synthetic constructor <init>(La/a4x;La/xdr;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;La/ngk0;La/pz40;B)V
    .locals 0

    .line 1
    iput-byte p8, p0, La/q3l0;->a:B

    iput-object p1, p0, La/q3l0;->b:La/a4x;

    iput-object p2, p0, La/q3l0;->c:La/xdr;

    iput-object p3, p0, La/q3l0;->d:Lkotlin/jvm/functions/Function1;

    iput-object p4, p0, La/q3l0;->e:Lkotlin/jvm/functions/Function0;

    iput-object p5, p0, La/q3l0;->f:Lkotlin/jvm/functions/Function0;

    iput-object p6, p0, La/q3l0;->g:La/ngk0;

    iput-object p7, p0, La/q3l0;->h:La/pz40;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 16

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/q3l0;->a:B

    .line 4
    .line 5
    const/4 v2, 0x4

    .line 6
    const v3, 0x799532c4

    .line 7
    .line 8
    .line 9
    const/4 v4, 0x1

    .line 10
    packed-switch v1, :pswitch_data_0

    .line 11
    .line 12
    .line 13
    move-object/from16 v1, p1

    .line 14
    .line 15
    check-cast v1, La/hcz;

    .line 16
    .line 17
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 18
    .line 19
    .line 20
    new-instance v5, La/jak0;

    .line 21
    .line 22
    const/16 v6, 0x15

    .line 23
    .line 24
    invoke-direct {v5, v6}, La/jak0;-><init>(B)V

    .line 25
    .line 26
    .line 27
    iget-object v8, v0, La/q3l0;->b:La/a4x;

    .line 28
    .line 29
    invoke-interface {v8}, Ljava/util/List;->size()I

    .line 30
    .line 31
    .line 32
    move-result v6

    .line 33
    new-instance v7, La/o3l0;

    .line 34
    .line 35
    invoke-direct {v7, v5, v8, v2}, La/o3l0;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 36
    .line 37
    .line 38
    new-instance v2, La/y9k0;

    .line 39
    .line 40
    const/4 v5, 0x7

    .line 41
    invoke-direct {v2, v8, v5}, La/y9k0;-><init>(Ljava/util/List;B)V

    .line 42
    .line 43
    .line 44
    move-object v5, v7

    .line 45
    new-instance v7, La/z3l0;

    .line 46
    .line 47
    const/4 v15, 0x3

    .line 48
    iget-object v9, v0, La/q3l0;->c:La/xdr;

    .line 49
    .line 50
    iget-object v10, v0, La/q3l0;->d:Lkotlin/jvm/functions/Function1;

    .line 51
    .line 52
    iget-object v11, v0, La/q3l0;->e:Lkotlin/jvm/functions/Function0;

    .line 53
    .line 54
    iget-object v12, v0, La/q3l0;->f:Lkotlin/jvm/functions/Function0;

    .line 55
    .line 56
    iget-object v13, v0, La/q3l0;->g:La/ngk0;

    .line 57
    .line 58
    iget-object v14, v0, La/q3l0;->h:La/pz40;

    .line 59
    .line 60
    invoke-direct/range {v7 .. v15}, La/z3l0;-><init>(Ljava/util/List;La/xdr;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;La/ngk0;La/pz40;B)V

    .line 61
    .line 62
    .line 63
    new-instance v0, La/ugd;

    .line 64
    .line 65
    invoke-direct {v0, v3, v4, v7}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 66
    .line 67
    .line 68
    invoke-virtual {v1, v6, v5, v2, v0}, La/hcz;->f(ILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;La/ydr;)V

    .line 69
    .line 70
    .line 71
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 72
    .line 73
    return-object v0

    .line 74
    :pswitch_0
    move-object/from16 v1, p1

    .line 75
    .line 76
    check-cast v1, La/hcz;

    .line 77
    .line 78
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 79
    .line 80
    .line 81
    new-instance v2, La/jak0;

    .line 82
    .line 83
    const/16 v5, 0x14

    .line 84
    .line 85
    invoke-direct {v2, v5}, La/jak0;-><init>(B)V

    .line 86
    .line 87
    .line 88
    iget-object v7, v0, La/q3l0;->b:La/a4x;

    .line 89
    .line 90
    invoke-interface {v7}, Ljava/util/List;->size()I

    .line 91
    .line 92
    .line 93
    move-result v5

    .line 94
    new-instance v15, La/o3l0;

    .line 95
    .line 96
    const/4 v6, 0x3

    .line 97
    invoke-direct {v15, v2, v7, v6}, La/o3l0;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 98
    .line 99
    .line 100
    new-instance v2, La/y9k0;

    .line 101
    .line 102
    const/4 v6, 0x6

    .line 103
    invoke-direct {v2, v7, v6}, La/y9k0;-><init>(Ljava/util/List;B)V

    .line 104
    .line 105
    .line 106
    new-instance v6, La/z3l0;

    .line 107
    .line 108
    const/4 v14, 0x2

    .line 109
    iget-object v8, v0, La/q3l0;->c:La/xdr;

    .line 110
    .line 111
    iget-object v9, v0, La/q3l0;->d:Lkotlin/jvm/functions/Function1;

    .line 112
    .line 113
    iget-object v10, v0, La/q3l0;->e:Lkotlin/jvm/functions/Function0;

    .line 114
    .line 115
    iget-object v11, v0, La/q3l0;->f:Lkotlin/jvm/functions/Function0;

    .line 116
    .line 117
    iget-object v12, v0, La/q3l0;->g:La/ngk0;

    .line 118
    .line 119
    iget-object v13, v0, La/q3l0;->h:La/pz40;

    .line 120
    .line 121
    invoke-direct/range {v6 .. v14}, La/z3l0;-><init>(Ljava/util/List;La/xdr;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;La/ngk0;La/pz40;B)V

    .line 122
    .line 123
    .line 124
    new-instance v0, La/ugd;

    .line 125
    .line 126
    invoke-direct {v0, v3, v4, v6}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 127
    .line 128
    .line 129
    invoke-virtual {v1, v5, v15, v2, v0}, La/hcz;->f(ILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;La/ydr;)V

    .line 130
    .line 131
    .line 132
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 133
    .line 134
    return-object v0

    .line 135
    :pswitch_1
    move-object/from16 v1, p1

    .line 136
    .line 137
    check-cast v1, La/hcz;

    .line 138
    .line 139
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 140
    .line 141
    .line 142
    new-instance v2, La/jak0;

    .line 143
    .line 144
    const/16 v5, 0x13

    .line 145
    .line 146
    invoke-direct {v2, v5}, La/jak0;-><init>(B)V

    .line 147
    .line 148
    .line 149
    iget-object v7, v0, La/q3l0;->b:La/a4x;

    .line 150
    .line 151
    invoke-interface {v7}, Ljava/util/List;->size()I

    .line 152
    .line 153
    .line 154
    move-result v5

    .line 155
    new-instance v15, La/o3l0;

    .line 156
    .line 157
    const/4 v6, 0x2

    .line 158
    invoke-direct {v15, v2, v7, v6}, La/o3l0;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 159
    .line 160
    .line 161
    new-instance v2, La/y9k0;

    .line 162
    .line 163
    const/4 v6, 0x5

    .line 164
    invoke-direct {v2, v7, v6}, La/y9k0;-><init>(Ljava/util/List;B)V

    .line 165
    .line 166
    .line 167
    new-instance v6, La/z3l0;

    .line 168
    .line 169
    const/4 v14, 0x1

    .line 170
    iget-object v8, v0, La/q3l0;->c:La/xdr;

    .line 171
    .line 172
    iget-object v9, v0, La/q3l0;->d:Lkotlin/jvm/functions/Function1;

    .line 173
    .line 174
    iget-object v10, v0, La/q3l0;->e:Lkotlin/jvm/functions/Function0;

    .line 175
    .line 176
    iget-object v11, v0, La/q3l0;->f:Lkotlin/jvm/functions/Function0;

    .line 177
    .line 178
    iget-object v12, v0, La/q3l0;->g:La/ngk0;

    .line 179
    .line 180
    iget-object v13, v0, La/q3l0;->h:La/pz40;

    .line 181
    .line 182
    invoke-direct/range {v6 .. v14}, La/z3l0;-><init>(Ljava/util/List;La/xdr;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;La/ngk0;La/pz40;B)V

    .line 183
    .line 184
    .line 185
    new-instance v0, La/ugd;

    .line 186
    .line 187
    invoke-direct {v0, v3, v4, v6}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 188
    .line 189
    .line 190
    invoke-virtual {v1, v5, v15, v2, v0}, La/hcz;->f(ILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;La/ydr;)V

    .line 191
    .line 192
    .line 193
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 194
    .line 195
    return-object v0

    .line 196
    :pswitch_2
    move-object/from16 v1, p1

    .line 197
    .line 198
    check-cast v1, La/hcz;

    .line 199
    .line 200
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 201
    .line 202
    .line 203
    new-instance v5, La/jak0;

    .line 204
    .line 205
    const/16 v6, 0x12

    .line 206
    .line 207
    invoke-direct {v5, v6}, La/jak0;-><init>(B)V

    .line 208
    .line 209
    .line 210
    iget-object v8, v0, La/q3l0;->b:La/a4x;

    .line 211
    .line 212
    invoke-interface {v8}, Ljava/util/List;->size()I

    .line 213
    .line 214
    .line 215
    move-result v6

    .line 216
    new-instance v7, La/o3l0;

    .line 217
    .line 218
    invoke-direct {v7, v5, v8, v4}, La/o3l0;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 219
    .line 220
    .line 221
    new-instance v5, La/y9k0;

    .line 222
    .line 223
    invoke-direct {v5, v8, v2}, La/y9k0;-><init>(Ljava/util/List;B)V

    .line 224
    .line 225
    .line 226
    move-object v2, v7

    .line 227
    new-instance v7, La/z3l0;

    .line 228
    .line 229
    const/4 v15, 0x0

    .line 230
    iget-object v9, v0, La/q3l0;->c:La/xdr;

    .line 231
    .line 232
    iget-object v10, v0, La/q3l0;->d:Lkotlin/jvm/functions/Function1;

    .line 233
    .line 234
    iget-object v11, v0, La/q3l0;->e:Lkotlin/jvm/functions/Function0;

    .line 235
    .line 236
    iget-object v12, v0, La/q3l0;->f:Lkotlin/jvm/functions/Function0;

    .line 237
    .line 238
    iget-object v13, v0, La/q3l0;->g:La/ngk0;

    .line 239
    .line 240
    iget-object v14, v0, La/q3l0;->h:La/pz40;

    .line 241
    .line 242
    invoke-direct/range {v7 .. v15}, La/z3l0;-><init>(Ljava/util/List;La/xdr;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;La/ngk0;La/pz40;B)V

    .line 243
    .line 244
    .line 245
    new-instance v0, La/ugd;

    .line 246
    .line 247
    invoke-direct {v0, v3, v4, v7}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 248
    .line 249
    .line 250
    invoke-virtual {v1, v6, v2, v5, v0}, La/hcz;->f(ILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;La/ydr;)V

    .line 251
    .line 252
    .line 253
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 254
    .line 255
    return-object v0

    .line 256
    nop

    .line 257
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
