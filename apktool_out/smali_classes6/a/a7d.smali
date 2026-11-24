.class public final synthetic La/a7d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B


# direct methods
.method public synthetic constructor <init>(B)V
    .locals 0

    .line 1
    iput-byte p1, p0, La/a7d;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 47

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v0, v0, La/a7d;->a:B

    .line 4
    .line 5
    const/4 v1, 0x1

    .line 6
    const/4 v2, 0x0

    .line 7
    const/4 v3, 0x0

    .line 8
    packed-switch v0, :pswitch_data_0

    .line 9
    .line 10
    .line 11
    const-string v0, "LocalClipboard"

    .line 12
    .line 13
    invoke-static {v0}, La/bmd;->b(Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    throw v3

    .line 17
    :pswitch_0
    const-string v0, "LocalClipboardManager"

    .line 18
    .line 19
    invoke-static {v0}, La/bmd;->b(Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    throw v3

    .line 23
    :pswitch_1
    const-string v0, "LocalAutofillManager"

    .line 24
    .line 25
    invoke-static {v0}, La/bmd;->b(Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    throw v3

    .line 29
    :pswitch_2
    const-string v0, "LocalAutofillTree"

    .line 30
    .line 31
    invoke-static {v0}, La/bmd;->b(Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    throw v3

    .line 35
    :pswitch_3
    return-object v3

    .line 36
    :pswitch_4
    new-instance v0, La/amd;

    .line 37
    .line 38
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 39
    .line 40
    .line 41
    return-object v0

    .line 42
    :pswitch_5
    const-string v0, "LocalWindowInfo"

    .line 43
    .line 44
    invoke-static {v0}, La/bmd;->b(Ljava/lang/String;)V

    .line 45
    .line 46
    .line 47
    throw v3

    .line 48
    :pswitch_6
    const-string v0, "LocalViewConfiguration"

    .line 49
    .line 50
    invoke-static {v0}, La/bmd;->b(Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    throw v3

    .line 54
    :pswitch_7
    return-object v3

    .line 55
    :pswitch_8
    new-instance v0, La/e7z;

    .line 56
    .line 57
    const/4 v1, 0x2

    .line 58
    invoke-direct {v0, v1}, La/e7z;-><init>(I)V

    .line 59
    .line 60
    .line 61
    return-object v0

    .line 62
    :pswitch_9
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 63
    .line 64
    return-object v0

    .line 65
    :pswitch_a
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 66
    .line 67
    return-object v0

    .line 68
    :pswitch_b
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 69
    .line 70
    return-object v0

    .line 71
    :pswitch_c
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 72
    .line 73
    return-object v0

    .line 74
    :pswitch_d
    new-instance v3, La/ls2;

    .line 75
    .line 76
    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    .line 77
    .line 78
    .line 79
    sget-object v4, La/iun;->a:La/iun;

    .line 80
    .line 81
    new-instance v5, La/m0k0;

    .line 82
    .line 83
    const/16 v45, 0x0

    .line 84
    .line 85
    const/16 v46, 0x0

    .line 86
    .line 87
    const-wide/16 v6, -0x1

    .line 88
    .line 89
    const-string v8, ""

    .line 90
    .line 91
    const-wide/16 v9, -0x1

    .line 92
    .line 93
    const-string v11, ""

    .line 94
    .line 95
    const-string v12, ""

    .line 96
    .line 97
    const-string v13, ""

    .line 98
    .line 99
    const-wide/16 v14, -0x1

    .line 100
    .line 101
    const-string v16, ""

    .line 102
    .line 103
    const-string v17, ""

    .line 104
    .line 105
    const-string v18, ""

    .line 106
    .line 107
    const/16 v19, 0x0

    .line 108
    .line 109
    const-string v20, ""

    .line 110
    .line 111
    const/16 v21, -0x1

    .line 112
    .line 113
    const/16 v22, -0x1

    .line 114
    .line 115
    const-string v23, ""

    .line 116
    .line 117
    const-string v24, ""

    .line 118
    .line 119
    const/16 v25, 0x0

    .line 120
    .line 121
    const/16 v26, 0x0

    .line 122
    .line 123
    const-string v27, ""

    .line 124
    .line 125
    const-string v28, ""

    .line 126
    .line 127
    const-string v29, ""

    .line 128
    .line 129
    const-string v30, ""

    .line 130
    .line 131
    const-wide/16 v31, -0x1

    .line 132
    .line 133
    const/16 v33, 0x0

    .line 134
    .line 135
    const-wide/16 v34, -0x1

    .line 136
    .line 137
    const-wide/16 v36, -0x1

    .line 138
    .line 139
    const/16 v38, 0x0

    .line 140
    .line 141
    const-wide/16 v39, -0x1

    .line 142
    .line 143
    const-wide/16 v41, -0x1

    .line 144
    .line 145
    const-string v43, ""

    .line 146
    .line 147
    const/16 v44, 0x0

    .line 148
    .line 149
    invoke-direct/range {v5 .. v46}, La/m0k0;-><init>(JLjava/lang/String;JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;IILjava/lang/String;Ljava/lang/String;IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JZJJZJJLjava/lang/String;ZZZ)V

    .line 150
    .line 151
    .line 152
    sget-object v0, La/m97;->Companion:La/k97;

    .line 153
    .line 154
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 155
    .line 156
    .line 157
    invoke-static {}, La/k97;->a()La/m97;

    .line 158
    .line 159
    .line 160
    move-result-object v6

    .line 161
    new-instance v1, La/tjd;

    .line 162
    .line 163
    const-string v2, ""

    .line 164
    .line 165
    invoke-direct/range {v1 .. v6}, La/tjd;-><init>(Ljava/lang/String;La/ms2;Ljava/util/List;La/m0k0;La/m97;)V

    .line 166
    .line 167
    .line 168
    return-object v1

    .line 169
    :pswitch_e
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 170
    .line 171
    return-object v0

    .line 172
    :pswitch_f
    new-instance v0, La/inv;

    .line 173
    .line 174
    sget-object v2, La/ysm0;->a:La/ysm0;

    .line 175
    .line 176
    invoke-direct {v0, v2, v2, v1}, La/inv;-><init>(La/jiy;La/jiy;B)V

    .line 177
    .line 178
    .line 179
    return-object v0

    .line 180
    :pswitch_10
    sget-object v0, La/iun;->a:La/iun;

    .line 181
    .line 182
    new-instance v3, La/sed;

    .line 183
    .line 184
    invoke-direct {v3, v0, v1, v2}, La/sed;-><init>(Ljava/util/List;ZZ)V

    .line 185
    .line 186
    .line 187
    return-object v3

    .line 188
    :pswitch_11
    new-instance v4, La/cfd;

    .line 189
    .line 190
    const/4 v10, 0x0

    .line 191
    sget-object v7, La/iun;->a:La/iun;

    .line 192
    .line 193
    const-wide/16 v5, 0x0

    .line 194
    .line 195
    const/4 v8, 0x1

    .line 196
    const/4 v9, 0x0

    .line 197
    invoke-direct/range {v4 .. v10}, La/cfd;-><init>(JLjava/util/List;ZZZ)V

    .line 198
    .line 199
    .line 200
    return-object v4

    .line 201
    :pswitch_12
    new-instance v0, La/zw3;

    .line 202
    .line 203
    sget-object v1, La/whp0;->a:La/whp0;

    .line 204
    .line 205
    invoke-direct {v0, v1, v2}, La/zw3;-><init>(La/jiy;B)V

    .line 206
    .line 207
    .line 208
    return-object v0

    .line 209
    :pswitch_13
    new-instance v0, La/zw3;

    .line 210
    .line 211
    sget-object v1, La/q680;->a:La/q680;

    .line 212
    .line 213
    invoke-direct {v0, v1, v2}, La/zw3;-><init>(La/jiy;B)V

    .line 214
    .line 215
    .line 216
    return-object v0

    .line 217
    :pswitch_14
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 218
    .line 219
    invoke-static {v0}, Landroidx/compose/runtime/e;->e(Ljava/lang/Object;)La/pz40;

    .line 220
    .line 221
    .line 222
    move-result-object v0

    .line 223
    return-object v0

    .line 224
    :pswitch_15
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 225
    .line 226
    return-object v0

    .line 227
    :pswitch_16
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 228
    .line 229
    return-object v0

    .line 230
    :pswitch_17
    new-instance v0, La/zw3;

    .line 231
    .line 232
    sget-object v1, La/okx;->a:La/okx;

    .line 233
    .line 234
    invoke-direct {v0, v1, v2}, La/zw3;-><init>(La/jiy;B)V

    .line 235
    .line 236
    .line 237
    return-object v0

    .line 238
    :pswitch_18
    new-instance v0, La/zw3;

    .line 239
    .line 240
    sget-object v1, La/okx;->a:La/okx;

    .line 241
    .line 242
    invoke-direct {v0, v1, v2}, La/zw3;-><init>(La/jiy;B)V

    .line 243
    .line 244
    .line 245
    return-object v0

    .line 246
    :pswitch_19
    new-instance v0, La/zw3;

    .line 247
    .line 248
    sget-object v1, La/okx;->a:La/okx;

    .line 249
    .line 250
    invoke-direct {v0, v1, v2}, La/zw3;-><init>(La/jiy;B)V

    .line 251
    .line 252
    .line 253
    return-object v0

    .line 254
    :pswitch_1a
    new-instance v0, La/zw3;

    .line 255
    .line 256
    sget-object v1, La/ne8;->a:La/ne8;

    .line 257
    .line 258
    invoke-direct {v0, v1, v2}, La/zw3;-><init>(La/jiy;B)V

    .line 259
    .line 260
    .line 261
    return-object v0

    .line 262
    nop

    .line 263
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_7
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
