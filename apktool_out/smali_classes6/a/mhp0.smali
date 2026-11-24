.class public final synthetic La/mhp0;
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
    iput-byte p1, p0, La/mhp0;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 8

    .line 1
    iget-byte p0, p0, La/mhp0;->a:B

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    packed-switch p0, :pswitch_data_0

    .line 5
    .line 6
    .line 7
    new-instance v1, La/fzp0;

    .line 8
    .line 9
    sget-object p0, Lorg/xplatform/statistic/tennis/impl/summary/domain/models/TennisSummaryFilterModel;->Companion:La/wxp0;

    .line 10
    .line 11
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    sget-object v7, Lorg/xplatform/statistic/tennis/impl/summary/domain/models/TennisSummaryFilterModel;->d:Lorg/xplatform/statistic/tennis/impl/summary/domain/models/TennisSummaryFilterModel;

    .line 15
    .line 16
    const/4 v2, 0x1

    .line 17
    const/4 v3, 0x0

    .line 18
    const/4 v4, 0x0

    .line 19
    const/4 v5, 0x0

    .line 20
    const/4 v6, 0x0

    .line 21
    invoke-direct/range {v1 .. v7}, La/fzp0;-><init>(ZZZLa/uyp0;ZLorg/xplatform/statistic/tennis/impl/summary/domain/models/TennisSummaryFilterModel;)V

    .line 22
    .line 23
    .line 24
    return-object v1

    .line 25
    :pswitch_0
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 26
    .line 27
    return-object p0

    .line 28
    :pswitch_1
    new-instance p0, La/nyp0;

    .line 29
    .line 30
    sget-object v0, Lorg/xplatform/statistic/tennis/impl/summary/domain/models/TennisSummaryFilterModel;->Companion:La/wxp0;

    .line 31
    .line 32
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 33
    .line 34
    .line 35
    sget-object v0, Lorg/xplatform/statistic/tennis/impl/summary/domain/models/TennisSummaryFilterModel;->d:Lorg/xplatform/statistic/tennis/impl/summary/domain/models/TennisSummaryFilterModel;

    .line 36
    .line 37
    invoke-direct {p0, v0, v0, v0}, La/nyp0;-><init>(Lorg/xplatform/statistic/tennis/impl/summary/domain/models/TennisSummaryFilterModel;Lorg/xplatform/statistic/tennis/impl/summary/domain/models/TennisSummaryFilterModel;Lorg/xplatform/statistic/tennis/impl/summary/domain/models/TennisSummaryFilterModel;)V

    .line 38
    .line 39
    .line 40
    return-object p0

    .line 41
    :pswitch_2
    sget-object p0, Lorg/xplatform/statistic/tennis/impl/summary/domain/models/TennisSummaryFilterModel;->Companion:La/wxp0;

    .line 42
    .line 43
    invoke-static {}, Lorg/xplatform/statistic/tennis/impl/summary/domain/models/TennisSurfaceType;->values()[Lorg/xplatform/statistic/tennis/impl/summary/domain/models/TennisSurfaceType;

    .line 44
    .line 45
    .line 46
    move-result-object p0

    .line 47
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 48
    .line 49
    .line 50
    new-instance v0, La/g0o;

    .line 51
    .line 52
    const-string v1, "org.xplatform.statistic.tennis.impl.summary.domain.models.TennisSurfaceType"

    .line 53
    .line 54
    invoke-direct {v0, v1, p0}, La/g0o;-><init>(Ljava/lang/String;[Ljava/lang/Enum;)V

    .line 55
    .line 56
    .line 57
    return-object v0

    .line 58
    :pswitch_3
    new-instance p0, La/zw3;

    .line 59
    .line 60
    sget-object v1, La/yyp0;->a:La/yyp0;

    .line 61
    .line 62
    invoke-direct {p0, v1, v0}, La/zw3;-><init>(La/jiy;B)V

    .line 63
    .line 64
    .line 65
    return-object p0

    .line 66
    :pswitch_4
    sget-object p0, La/zwp0;->a:La/zfn;

    .line 67
    .line 68
    sget-object p0, La/fmm;->a:La/fmm;

    .line 69
    .line 70
    return-object p0

    .line 71
    :pswitch_5
    new-instance p0, La/zvp0;

    .line 72
    .line 73
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 74
    .line 75
    .line 76
    return-object p0

    .line 77
    :pswitch_6
    new-instance p0, La/zw3;

    .line 78
    .line 79
    sget-object v1, La/ztp0;->a:La/ztp0;

    .line 80
    .line 81
    invoke-direct {p0, v1, v0}, La/zw3;-><init>(La/jiy;B)V

    .line 82
    .line 83
    .line 84
    return-object p0

    .line 85
    :pswitch_7
    invoke-static {v0}, Landroidx/compose/runtime/e;->b(I)La/cgk0;

    .line 86
    .line 87
    .line 88
    move-result-object p0

    .line 89
    return-object p0

    .line 90
    :pswitch_8
    new-instance p0, La/xcz;

    .line 91
    .line 92
    const/4 v1, 0x3

    .line 93
    invoke-direct {p0, v0, v1, v0}, La/xcz;-><init>(III)V

    .line 94
    .line 95
    .line 96
    return-object p0

    .line 97
    :pswitch_9
    new-instance p0, La/zw3;

    .line 98
    .line 99
    sget-object v1, La/uhp0;->a:La/uhp0;

    .line 100
    .line 101
    invoke-direct {p0, v1, v0}, La/zw3;-><init>(La/jiy;B)V

    .line 102
    .line 103
    .line 104
    return-object p0

    .line 105
    :pswitch_a
    sget-object p0, La/jpp0;->O1:La/s2m0;

    .line 106
    .line 107
    new-instance p0, La/bdz;

    .line 108
    .line 109
    invoke-direct {p0}, La/bdz;-><init>()V

    .line 110
    .line 111
    .line 112
    return-object p0

    .line 113
    :pswitch_b
    new-instance p0, La/zw3;

    .line 114
    .line 115
    sget-object v1, La/v5p0;->a:La/v5p0;

    .line 116
    .line 117
    invoke-direct {p0, v1, v0}, La/zw3;-><init>(La/jiy;B)V

    .line 118
    .line 119
    .line 120
    return-object p0

    .line 121
    :pswitch_c
    new-instance p0, La/zw3;

    .line 122
    .line 123
    sget-object v1, La/ewb;->a:La/ewb;

    .line 124
    .line 125
    invoke-direct {p0, v1, v0}, La/zw3;-><init>(La/jiy;B)V

    .line 126
    .line 127
    .line 128
    return-object p0

    .line 129
    :pswitch_d
    new-instance p0, La/zw3;

    .line 130
    .line 131
    sget-object v1, La/whp0;->a:La/whp0;

    .line 132
    .line 133
    invoke-direct {p0, v1, v0}, La/zw3;-><init>(La/jiy;B)V

    .line 134
    .line 135
    .line 136
    return-object p0

    .line 137
    :pswitch_e
    new-instance p0, La/zw3;

    .line 138
    .line 139
    sget-object v1, La/zmp0;->a:La/zmp0;

    .line 140
    .line 141
    invoke-direct {p0, v1, v0}, La/zw3;-><init>(La/jiy;B)V

    .line 142
    .line 143
    .line 144
    return-object p0

    .line 145
    :pswitch_f
    new-instance p0, La/zw3;

    .line 146
    .line 147
    sget-object v1, La/o9a0;->a:La/o9a0;

    .line 148
    .line 149
    invoke-direct {p0, v1, v0}, La/zw3;-><init>(La/jiy;B)V

    .line 150
    .line 151
    .line 152
    return-object p0

    .line 153
    :pswitch_10
    new-instance p0, La/zw3;

    .line 154
    .line 155
    sget-object v1, La/mlp0;->a:La/mlp0;

    .line 156
    .line 157
    invoke-direct {p0, v1, v0}, La/zw3;-><init>(La/jiy;B)V

    .line 158
    .line 159
    .line 160
    return-object p0

    .line 161
    :pswitch_11
    new-instance p0, La/zw3;

    .line 162
    .line 163
    sget-object v1, La/whp0;->a:La/whp0;

    .line 164
    .line 165
    invoke-direct {p0, v1, v0}, La/zw3;-><init>(La/jiy;B)V

    .line 166
    .line 167
    .line 168
    return-object p0

    .line 169
    :pswitch_12
    new-instance p0, La/zw3;

    .line 170
    .line 171
    sget-object v1, La/kz30;->a:La/kz30;

    .line 172
    .line 173
    invoke-direct {p0, v1, v0}, La/zw3;-><init>(La/jiy;B)V

    .line 174
    .line 175
    .line 176
    return-object p0

    .line 177
    :pswitch_13
    new-instance p0, La/zw3;

    .line 178
    .line 179
    sget-object v1, La/taa0;->a:La/taa0;

    .line 180
    .line 181
    invoke-direct {p0, v1, v0}, La/zw3;-><init>(La/jiy;B)V

    .line 182
    .line 183
    .line 184
    return-object p0

    .line 185
    :pswitch_14
    new-instance p0, La/zw3;

    .line 186
    .line 187
    sget-object v1, La/elp0;->a:La/elp0;

    .line 188
    .line 189
    invoke-direct {p0, v1, v0}, La/zw3;-><init>(La/jiy;B)V

    .line 190
    .line 191
    .line 192
    return-object p0

    .line 193
    :pswitch_15
    new-instance p0, La/zw3;

    .line 194
    .line 195
    sget-object v1, La/p9a0;->a:La/p9a0;

    .line 196
    .line 197
    invoke-direct {p0, v1, v0}, La/zw3;-><init>(La/jiy;B)V

    .line 198
    .line 199
    .line 200
    return-object p0

    .line 201
    :pswitch_16
    new-instance p0, La/zw3;

    .line 202
    .line 203
    sget-object v1, La/b4n0;->a:La/b4n0;

    .line 204
    .line 205
    invoke-direct {p0, v1, v0}, La/zw3;-><init>(La/jiy;B)V

    .line 206
    .line 207
    .line 208
    return-object p0

    .line 209
    :pswitch_17
    new-instance p0, La/zw3;

    .line 210
    .line 211
    sget-object v1, La/p280;->a:La/p280;

    .line 212
    .line 213
    invoke-direct {p0, v1, v0}, La/zw3;-><init>(La/jiy;B)V

    .line 214
    .line 215
    .line 216
    return-object p0

    .line 217
    :pswitch_18
    new-instance p0, La/zw3;

    .line 218
    .line 219
    sget-object v1, La/e4n0;->a:La/e4n0;

    .line 220
    .line 221
    invoke-direct {p0, v1, v0}, La/zw3;-><init>(La/jiy;B)V

    .line 222
    .line 223
    .line 224
    return-object p0

    .line 225
    :pswitch_19
    new-instance p0, La/zw3;

    .line 226
    .line 227
    sget-object v1, La/d4n0;->a:La/d4n0;

    .line 228
    .line 229
    invoke-direct {p0, v1, v0}, La/zw3;-><init>(La/jiy;B)V

    .line 230
    .line 231
    .line 232
    return-object p0

    .line 233
    :pswitch_1a
    new-instance p0, La/zw3;

    .line 234
    .line 235
    sget-object v1, La/c4n0;->a:La/c4n0;

    .line 236
    .line 237
    invoke-direct {p0, v1, v0}, La/zw3;-><init>(La/jiy;B)V

    .line 238
    .line 239
    .line 240
    return-object p0

    .line 241
    :pswitch_1b
    new-instance p0, La/ghp0;

    .line 242
    .line 243
    const/4 v1, 0x0

    .line 244
    const/4 v2, 0x1

    .line 245
    invoke-direct {p0, v1, v2, v0, v0}, La/ghp0;-><init>(La/shp0;ZZZ)V

    .line 246
    .line 247
    .line 248
    return-object p0

    .line 249
    :pswitch_1c
    new-instance p0, La/zw3;

    .line 250
    .line 251
    sget-object v1, La/chp0;->a:La/chp0;

    .line 252
    .line 253
    invoke-direct {p0, v1, v0}, La/zw3;-><init>(La/jiy;B)V

    .line 254
    .line 255
    .line 256
    return-object p0

    .line 257
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
