.class public final La/b7r0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/kmq;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/g7r0;


# direct methods
.method public synthetic constructor <init>(La/g7r0;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/b7r0;->a:B

    iput-object p1, p0, La/b7r0;->b:La/g7r0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;La/yje;)Ljava/lang/Object;
    .locals 28

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p2

    .line 4
    .line 5
    iget-byte v2, v0, La/b7r0;->a:B

    .line 6
    .line 7
    const/4 v3, 0x0

    .line 8
    iget-object v0, v0, La/b7r0;->b:La/g7r0;

    .line 9
    .line 10
    packed-switch v2, :pswitch_data_0

    .line 11
    .line 12
    .line 13
    move-object/from16 v2, p1

    .line 14
    .line 15
    check-cast v2, Ljava/util/List;

    .line 16
    .line 17
    sget v4, La/g7r0;->L:I

    .line 18
    .line 19
    iget-object v4, v0, La/i3t0;->i:La/ocj;

    .line 20
    .line 21
    iget-object v4, v4, La/ocj;->a:La/p7m0;

    .line 22
    .line 23
    :cond_0
    invoke-virtual {v4}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v5

    .line 27
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 28
    .line 29
    .line 30
    iget-object v6, v0, La/i3t0;->f:La/oyg0;

    .line 31
    .line 32
    move-object v7, v5

    .line 33
    check-cast v7, La/w6r0;

    .line 34
    .line 35
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 36
    .line 37
    .line 38
    new-instance v6, La/idt;

    .line 39
    .line 40
    invoke-direct {v6, v2}, La/idt;-><init>(Ljava/util/List;)V

    .line 41
    .line 42
    .line 43
    const/16 v26, 0x0

    .line 44
    .line 45
    const v27, 0x7affff

    .line 46
    .line 47
    .line 48
    const/4 v8, 0x0

    .line 49
    const/4 v9, 0x0

    .line 50
    const/4 v10, 0x0

    .line 51
    const/4 v11, 0x0

    .line 52
    const/4 v12, 0x0

    .line 53
    const/4 v13, 0x0

    .line 54
    const/4 v14, 0x0

    .line 55
    const/4 v15, 0x0

    .line 56
    const/16 v16, 0x0

    .line 57
    .line 58
    const/16 v17, 0x0

    .line 59
    .line 60
    const/16 v18, 0x0

    .line 61
    .line 62
    const/16 v19, 0x0

    .line 63
    .line 64
    const/16 v20, 0x0

    .line 65
    .line 66
    const/16 v21, 0x0

    .line 67
    .line 68
    const/16 v23, 0x0

    .line 69
    .line 70
    const/16 v24, 0x0

    .line 71
    .line 72
    const/16 v25, 0x0

    .line 73
    .line 74
    move-object/from16 v22, v6

    .line 75
    .line 76
    invoke-static/range {v7 .. v27}, La/w6r0;->a(La/w6r0;ZZLa/m7r0;La/h8l0;La/g8l0;La/v5l0;La/wcb;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;ZZLa/hn00;La/odt;La/odt;ZZZI)La/w6r0;

    .line 77
    .line 78
    .line 79
    move-result-object v6

    .line 80
    invoke-virtual {v4, v5, v6}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 81
    .line 82
    .line 83
    move-result v5

    .line 84
    if-eqz v5, :cond_0

    .line 85
    .line 86
    invoke-virtual {v0}, La/i3t0;->D()Ljava/lang/Object;

    .line 87
    .line 88
    .line 89
    move-result-object v4

    .line 90
    check-cast v4, La/w6r0;

    .line 91
    .line 92
    iget-object v4, v4, La/w6r0;->r:La/odt;

    .line 93
    .line 94
    instance-of v5, v4, La/idt;

    .line 95
    .line 96
    if-eqz v5, :cond_1

    .line 97
    .line 98
    move-object v3, v4

    .line 99
    check-cast v3, La/idt;

    .line 100
    .line 101
    :cond_1
    if-eqz v3, :cond_2

    .line 102
    .line 103
    iget-object v3, v3, La/idt;->a:Ljava/util/List;

    .line 104
    .line 105
    if-nez v3, :cond_3

    .line 106
    .line 107
    :cond_2
    sget-object v3, La/iun;->a:La/iun;

    .line 108
    .line 109
    :cond_3
    iget-object v0, v0, La/g7r0;->v:La/hjd;

    .line 110
    .line 111
    new-instance v4, La/did;

    .line 112
    .line 113
    invoke-static {v2, v3}, Lkotlin/collections/CollectionsKt;->q0(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/ArrayList;

    .line 114
    .line 115
    .line 116
    move-result-object v2

    .line 117
    invoke-direct {v4, v2}, La/did;-><init>(Ljava/util/List;)V

    .line 118
    .line 119
    .line 120
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 121
    .line 122
    .line 123
    invoke-virtual {v0, v4, v1}, La/hjd;->n(La/vid;La/yje;)Ljava/lang/Object;

    .line 124
    .line 125
    .line 126
    move-result-object v0

    .line 127
    sget-object v1, La/wne;->a:La/wne;

    .line 128
    .line 129
    if-ne v0, v1, :cond_4

    .line 130
    .line 131
    goto :goto_0

    .line 132
    :cond_4
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 133
    .line 134
    :goto_0
    return-object v0

    .line 135
    :pswitch_0
    move-object/from16 v2, p1

    .line 136
    .line 137
    check-cast v2, Ljava/util/List;

    .line 138
    .line 139
    sget v4, La/g7r0;->L:I

    .line 140
    .line 141
    iget-object v4, v0, La/i3t0;->i:La/ocj;

    .line 142
    .line 143
    iget-object v4, v4, La/ocj;->a:La/p7m0;

    .line 144
    .line 145
    :cond_5
    invoke-virtual {v4}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 146
    .line 147
    .line 148
    move-result-object v5

    .line 149
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 150
    .line 151
    .line 152
    iget-object v6, v0, La/i3t0;->f:La/oyg0;

    .line 153
    .line 154
    move-object v7, v5

    .line 155
    check-cast v7, La/w6r0;

    .line 156
    .line 157
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 158
    .line 159
    .line 160
    new-instance v6, La/idt;

    .line 161
    .line 162
    invoke-direct {v6, v2}, La/idt;-><init>(Ljava/util/List;)V

    .line 163
    .line 164
    .line 165
    const/16 v26, 0x0

    .line 166
    .line 167
    const v27, 0x75ffff

    .line 168
    .line 169
    .line 170
    const/4 v8, 0x0

    .line 171
    const/4 v9, 0x0

    .line 172
    const/4 v10, 0x0

    .line 173
    const/4 v11, 0x0

    .line 174
    const/4 v12, 0x0

    .line 175
    const/4 v13, 0x0

    .line 176
    const/4 v14, 0x0

    .line 177
    const/4 v15, 0x0

    .line 178
    const/16 v16, 0x0

    .line 179
    .line 180
    const/16 v17, 0x0

    .line 181
    .line 182
    const/16 v18, 0x0

    .line 183
    .line 184
    const/16 v19, 0x0

    .line 185
    .line 186
    const/16 v20, 0x0

    .line 187
    .line 188
    const/16 v21, 0x0

    .line 189
    .line 190
    const/16 v22, 0x0

    .line 191
    .line 192
    const/16 v24, 0x0

    .line 193
    .line 194
    const/16 v25, 0x0

    .line 195
    .line 196
    move-object/from16 v23, v6

    .line 197
    .line 198
    invoke-static/range {v7 .. v27}, La/w6r0;->a(La/w6r0;ZZLa/m7r0;La/h8l0;La/g8l0;La/v5l0;La/wcb;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;ZZLa/hn00;La/odt;La/odt;ZZZI)La/w6r0;

    .line 199
    .line 200
    .line 201
    move-result-object v6

    .line 202
    invoke-virtual {v4, v5, v6}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 203
    .line 204
    .line 205
    move-result v5

    .line 206
    if-eqz v5, :cond_5

    .line 207
    .line 208
    invoke-virtual {v0}, La/i3t0;->D()Ljava/lang/Object;

    .line 209
    .line 210
    .line 211
    move-result-object v4

    .line 212
    check-cast v4, La/w6r0;

    .line 213
    .line 214
    iget-object v4, v4, La/w6r0;->q:La/odt;

    .line 215
    .line 216
    instance-of v5, v4, La/idt;

    .line 217
    .line 218
    if-eqz v5, :cond_6

    .line 219
    .line 220
    move-object v3, v4

    .line 221
    check-cast v3, La/idt;

    .line 222
    .line 223
    :cond_6
    if-eqz v3, :cond_7

    .line 224
    .line 225
    iget-object v3, v3, La/idt;->a:Ljava/util/List;

    .line 226
    .line 227
    if-nez v3, :cond_8

    .line 228
    .line 229
    :cond_7
    sget-object v3, La/iun;->a:La/iun;

    .line 230
    .line 231
    :cond_8
    iget-object v0, v0, La/g7r0;->v:La/hjd;

    .line 232
    .line 233
    new-instance v4, La/did;

    .line 234
    .line 235
    invoke-static {v3, v2}, Lkotlin/collections/CollectionsKt;->q0(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/ArrayList;

    .line 236
    .line 237
    .line 238
    move-result-object v2

    .line 239
    invoke-direct {v4, v2}, La/did;-><init>(Ljava/util/List;)V

    .line 240
    .line 241
    .line 242
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 243
    .line 244
    .line 245
    invoke-virtual {v0, v4, v1}, La/hjd;->n(La/vid;La/yje;)Ljava/lang/Object;

    .line 246
    .line 247
    .line 248
    move-result-object v0

    .line 249
    sget-object v1, La/wne;->a:La/wne;

    .line 250
    .line 251
    if-ne v0, v1, :cond_9

    .line 252
    .line 253
    goto :goto_1

    .line 254
    :cond_9
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 255
    .line 256
    :goto_1
    return-object v0

    .line 257
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
