.class public final synthetic La/kdw;
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
    iput-byte p1, p0, La/kdw;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 29

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v0, v0, La/kdw;->a:B

    .line 4
    .line 5
    sget-object v1, La/bid;->a:La/bid;

    .line 6
    .line 7
    const/4 v2, 0x1

    .line 8
    const/4 v3, 0x0

    .line 9
    packed-switch v0, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    sget-object v0, La/iun;->a:La/iun;

    .line 13
    .line 14
    new-instance v1, La/acx;

    .line 15
    .line 16
    invoke-direct {v1, v0, v2, v3, v3}, La/acx;-><init>(Ljava/util/List;ZZZ)V

    .line 17
    .line 18
    .line 19
    return-object v1

    .line 20
    :pswitch_0
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 21
    .line 22
    return-object v0

    .line 23
    :pswitch_1
    new-instance v0, La/zw3;

    .line 24
    .line 25
    sget-object v1, La/lcx;->a:La/lcx;

    .line 26
    .line 27
    invoke-direct {v0, v1, v3}, La/zw3;-><init>(La/jiy;B)V

    .line 28
    .line 29
    .line 30
    return-object v0

    .line 31
    :pswitch_2
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 32
    .line 33
    return-object v0

    .line 34
    :pswitch_3
    new-instance v1, Lorg/xplatform/uikit/compose/color/IndividualColors;

    .line 35
    .line 36
    sget-wide v2, La/y3d;->g:J

    .line 37
    .line 38
    const/16 v28, 0x0

    .line 39
    .line 40
    move-wide v4, v2

    .line 41
    move-wide v6, v2

    .line 42
    move-wide v8, v2

    .line 43
    move-wide v10, v2

    .line 44
    move-wide v12, v2

    .line 45
    move-wide v14, v2

    .line 46
    move-wide/from16 v16, v2

    .line 47
    .line 48
    move-wide/from16 v18, v2

    .line 49
    .line 50
    move-wide/from16 v20, v2

    .line 51
    .line 52
    move-wide/from16 v22, v2

    .line 53
    .line 54
    move-wide/from16 v24, v2

    .line 55
    .line 56
    move-wide/from16 v26, v2

    .line 57
    .line 58
    invoke-direct/range {v1 .. v28}, Lorg/xplatform/uikit/compose/color/IndividualColors;-><init>(JJJJJJJJJJJJJLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 59
    .line 60
    .line 61
    return-object v1

    .line 62
    :pswitch_4
    sget-object v0, La/a6x;->a:La/zfn;

    .line 63
    .line 64
    sget-object v0, La/ptj;->a:La/ptj;

    .line 65
    .line 66
    return-object v0

    .line 67
    :pswitch_5
    new-instance v0, La/zw3;

    .line 68
    .line 69
    sget-object v1, La/moa;->a:La/moa;

    .line 70
    .line 71
    invoke-direct {v0, v1, v3}, La/zw3;-><init>(La/jiy;B)V

    .line 72
    .line 73
    .line 74
    return-object v0

    .line 75
    :pswitch_6
    new-instance v0, La/zw3;

    .line 76
    .line 77
    sget-object v1, La/moa;->a:La/moa;

    .line 78
    .line 79
    invoke-direct {v0, v1, v3}, La/zw3;-><init>(La/jiy;B)V

    .line 80
    .line 81
    .line 82
    return-object v0

    .line 83
    :pswitch_7
    sget-object v0, La/jut0;->a:La/n0o0;

    .line 84
    .line 85
    invoke-virtual {v0}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 86
    .line 87
    .line 88
    move-result-object v0

    .line 89
    check-cast v0, La/bbe0;

    .line 90
    .line 91
    return-object v0

    .line 92
    :pswitch_8
    sget-object v0, La/tvk;->a:La/rwj;

    .line 93
    .line 94
    sget-object v0, La/ys10;->a:La/vs10;

    .line 95
    .line 96
    invoke-virtual {v0}, La/vs10;->x()La/vs10;

    .line 97
    .line 98
    .line 99
    move-result-object v0

    .line 100
    return-object v0

    .line 101
    :pswitch_9
    new-instance v0, La/zw3;

    .line 102
    .line 103
    sget-object v1, La/ysm0;->a:La/ysm0;

    .line 104
    .line 105
    invoke-direct {v0, v1, v3}, La/zw3;-><init>(La/jiy;B)V

    .line 106
    .line 107
    .line 108
    return-object v0

    .line 109
    :pswitch_a
    new-instance v0, La/zw3;

    .line 110
    .line 111
    sget-object v1, La/ysm0;->a:La/ysm0;

    .line 112
    .line 113
    invoke-direct {v0, v1, v3}, La/zw3;-><init>(La/jiy;B)V

    .line 114
    .line 115
    .line 116
    return-object v0

    .line 117
    :pswitch_b
    sget-object v0, La/k6z;->a:La/k6z;

    .line 118
    .line 119
    return-object v0

    .line 120
    :pswitch_c
    sget-object v0, La/k6z;->a:La/k6z;

    .line 121
    .line 122
    return-object v0

    .line 123
    :pswitch_d
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 124
    .line 125
    const-string v1, "CompositionLocal LocalHostDefaultProvider not present"

    .line 126
    .line 127
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 128
    .line 129
    .line 130
    throw v0

    .line 131
    :pswitch_e
    new-instance v0, La/zw3;

    .line 132
    .line 133
    sget-object v1, La/spw;->a:La/spw;

    .line 134
    .line 135
    invoke-direct {v0, v1, v3}, La/zw3;-><init>(La/jiy;B)V

    .line 136
    .line 137
    .line 138
    return-object v0

    .line 139
    :pswitch_f
    new-instance v0, La/zw3;

    .line 140
    .line 141
    sget-object v1, La/zow;->a:La/zow;

    .line 142
    .line 143
    invoke-direct {v0, v1, v3}, La/zw3;-><init>(La/jiy;B)V

    .line 144
    .line 145
    .line 146
    return-object v0

    .line 147
    :pswitch_10
    new-instance v0, La/zw3;

    .line 148
    .line 149
    sget-object v1, La/d040;->a:La/d040;

    .line 150
    .line 151
    invoke-direct {v0, v1, v3}, La/zw3;-><init>(La/jiy;B)V

    .line 152
    .line 153
    .line 154
    return-object v0

    .line 155
    :pswitch_11
    new-instance v4, La/crw;

    .line 156
    .line 157
    sget-object v5, La/lak0;->c:La/lak0;

    .line 158
    .line 159
    const/4 v9, 0x1

    .line 160
    const/4 v6, 0x1

    .line 161
    const/4 v7, 0x0

    .line 162
    const/4 v8, 0x0

    .line 163
    invoke-direct/range {v4 .. v9}, La/crw;-><init>(Ljava/util/List;ZZZZ)V

    .line 164
    .line 165
    .line 166
    return-object v4

    .line 167
    :pswitch_12
    sget-object v0, La/gpw;->a:La/zfn;

    .line 168
    .line 169
    sget-object v0, La/fmm;->a:La/fmm;

    .line 170
    .line 171
    return-object v0

    .line 172
    :pswitch_13
    new-instance v0, La/low;

    .line 173
    .line 174
    new-instance v1, La/gow;

    .line 175
    .line 176
    sget-object v4, La/iun;->a:La/iun;

    .line 177
    .line 178
    invoke-direct {v1, v4}, La/gow;-><init>(Ljava/util/List;)V

    .line 179
    .line 180
    .line 181
    invoke-direct {v0, v2, v3, v3, v1}, La/low;-><init>(ZZZLa/gow;)V

    .line 182
    .line 183
    .line 184
    return-object v0

    .line 185
    :pswitch_14
    new-instance v0, La/zw3;

    .line 186
    .line 187
    sget-object v1, La/msd0;->a:La/msd0;

    .line 188
    .line 189
    invoke-direct {v0, v1, v3}, La/zw3;-><init>(La/jiy;B)V

    .line 190
    .line 191
    .line 192
    return-object v0

    .line 193
    :pswitch_15
    new-instance v0, La/zw3;

    .line 194
    .line 195
    sget-object v1, La/jmw;->a:La/jmw;

    .line 196
    .line 197
    invoke-direct {v0, v1, v3}, La/zw3;-><init>(La/jiy;B)V

    .line 198
    .line 199
    .line 200
    return-object v0

    .line 201
    :pswitch_16
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 202
    .line 203
    return-object v0

    .line 204
    :pswitch_17
    new-instance v0, La/zw3;

    .line 205
    .line 206
    sget-object v1, La/e040;->a:La/e040;

    .line 207
    .line 208
    invoke-direct {v0, v1, v3}, La/zw3;-><init>(La/jiy;B)V

    .line 209
    .line 210
    .line 211
    return-object v0

    .line 212
    :pswitch_18
    sget v0, La/tkw;->C:I

    .line 213
    .line 214
    return-object v1

    .line 215
    :pswitch_19
    sget v0, La/ukw;->X:I

    .line 216
    .line 217
    return-object v1

    .line 218
    :pswitch_1a
    new-instance v0, La/zw3;

    .line 219
    .line 220
    sget-object v1, La/wcw;->a:La/wcw;

    .line 221
    .line 222
    invoke-direct {v0, v1, v3}, La/zw3;-><init>(La/jiy;B)V

    .line 223
    .line 224
    .line 225
    return-object v0

    .line 226
    :pswitch_1b
    new-instance v0, La/zw3;

    .line 227
    .line 228
    sget-object v1, La/tdw;->a:La/tdw;

    .line 229
    .line 230
    invoke-direct {v0, v1, v3}, La/zw3;-><init>(La/jiy;B)V

    .line 231
    .line 232
    .line 233
    return-object v0

    .line 234
    :pswitch_1c
    new-instance v0, La/zw3;

    .line 235
    .line 236
    sget-object v1, La/xdw;->a:La/xdw;

    .line 237
    .line 238
    invoke-direct {v0, v1, v3}, La/zw3;-><init>(La/jiy;B)V

    .line 239
    .line 240
    .line 241
    return-object v0

    .line 242
    nop

    .line 243
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1c
        :pswitch_1b
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
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
