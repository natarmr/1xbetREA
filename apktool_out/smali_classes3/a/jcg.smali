.class public final synthetic La/jcg;
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
    iput-byte p1, p0, La/jcg;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 3

    .line 1
    iget-byte p0, p0, La/jcg;->a:B

    .line 2
    .line 3
    const/4 v0, 0x1

    .line 4
    const/4 v1, 0x0

    .line 5
    packed-switch p0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance p0, La/zw3;

    .line 9
    .line 10
    sget-object v0, La/cgh;->a:La/cgh;

    .line 11
    .line 12
    invoke-direct {p0, v0, v1}, La/zw3;-><init>(La/jiy;B)V

    .line 13
    .line 14
    .line 15
    return-object p0

    .line 16
    :pswitch_0
    new-instance p0, La/zw3;

    .line 17
    .line 18
    sget-object v0, La/tmg;->a:La/tmg;

    .line 19
    .line 20
    invoke-direct {p0, v0, v1}, La/zw3;-><init>(La/jiy;B)V

    .line 21
    .line 22
    .line 23
    return-object p0

    .line 24
    :pswitch_1
    new-instance p0, La/zw3;

    .line 25
    .line 26
    sget-object v0, La/lmg;->a:La/lmg;

    .line 27
    .line 28
    invoke-direct {p0, v0, v1}, La/zw3;-><init>(La/jiy;B)V

    .line 29
    .line 30
    .line 31
    return-object p0

    .line 32
    :pswitch_2
    new-instance p0, La/zw3;

    .line 33
    .line 34
    sget-object v0, La/jls;->a:La/jls;

    .line 35
    .line 36
    invoke-direct {p0, v0, v1}, La/zw3;-><init>(La/jiy;B)V

    .line 37
    .line 38
    .line 39
    return-object p0

    .line 40
    :pswitch_3
    new-instance p0, La/zw3;

    .line 41
    .line 42
    sget-object v0, La/n8h;->a:La/n8h;

    .line 43
    .line 44
    invoke-direct {p0, v0, v1}, La/zw3;-><init>(La/jiy;B)V

    .line 45
    .line 46
    .line 47
    return-object p0

    .line 48
    :pswitch_4
    new-instance p0, La/zw3;

    .line 49
    .line 50
    sget-object v0, La/fev;->a:La/fev;

    .line 51
    .line 52
    invoke-direct {p0, v0, v1}, La/zw3;-><init>(La/jiy;B)V

    .line 53
    .line 54
    .line 55
    return-object p0

    .line 56
    :pswitch_5
    new-instance p0, La/zw3;

    .line 57
    .line 58
    sget-object v0, La/fev;->a:La/fev;

    .line 59
    .line 60
    invoke-direct {p0, v0, v1}, La/zw3;-><init>(La/jiy;B)V

    .line 61
    .line 62
    .line 63
    return-object p0

    .line 64
    :pswitch_6
    new-instance p0, La/zw3;

    .line 65
    .line 66
    sget-object v0, La/fev;->a:La/fev;

    .line 67
    .line 68
    invoke-direct {p0, v0, v1}, La/zw3;-><init>(La/jiy;B)V

    .line 69
    .line 70
    .line 71
    return-object p0

    .line 72
    :pswitch_7
    new-instance p0, La/zw3;

    .line 73
    .line 74
    sget-object v0, La/s710;->a:La/s710;

    .line 75
    .line 76
    invoke-direct {p0, v0, v1}, La/zw3;-><init>(La/jiy;B)V

    .line 77
    .line 78
    .line 79
    return-object p0

    .line 80
    :pswitch_8
    new-instance p0, La/zw3;

    .line 81
    .line 82
    sget-object v0, La/s710;->a:La/s710;

    .line 83
    .line 84
    invoke-direct {p0, v0, v1}, La/zw3;-><init>(La/jiy;B)V

    .line 85
    .line 86
    .line 87
    return-object p0

    .line 88
    :pswitch_9
    new-instance p0, La/zw3;

    .line 89
    .line 90
    sget-object v0, La/ysm0;->a:La/ysm0;

    .line 91
    .line 92
    invoke-direct {p0, v0, v1}, La/zw3;-><init>(La/jiy;B)V

    .line 93
    .line 94
    .line 95
    return-object p0

    .line 96
    :pswitch_a
    new-instance p0, La/zw3;

    .line 97
    .line 98
    sget-object v0, La/okx;->a:La/okx;

    .line 99
    .line 100
    invoke-direct {p0, v0, v1}, La/zw3;-><init>(La/jiy;B)V

    .line 101
    .line 102
    .line 103
    return-object p0

    .line 104
    :pswitch_b
    new-instance p0, La/g0o;

    .line 105
    .line 106
    sget-object v0, La/kjg;->INSTANCE:La/kjg;

    .line 107
    .line 108
    new-array v1, v1, [Ljava/lang/annotation/Annotation;

    .line 109
    .line 110
    const-string v2, "org.xplatform.cyber.game.core.data.model.games.CyberCommonGameStatisticResponse"

    .line 111
    .line 112
    invoke-direct {p0, v2, v0, v1}, La/g0o;-><init>(Ljava/lang/String;Ljava/lang/Object;[Ljava/lang/annotation/Annotation;)V

    .line 113
    .line 114
    .line 115
    return-object p0

    .line 116
    :pswitch_c
    sget-object p0, La/ijg;->a:La/ijg;

    .line 117
    .line 118
    return-object p0

    .line 119
    :pswitch_d
    invoke-static {}, La/sip;->values()[La/sip;

    .line 120
    .line 121
    .line 122
    move-result-object p0

    .line 123
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 124
    .line 125
    .line 126
    new-instance v0, La/g0o;

    .line 127
    .line 128
    const-string v1, "org.xplatform.betting.core.zip.domain.model.FeedKind"

    .line 129
    .line 130
    invoke-direct {v0, v1, p0}, La/g0o;-><init>(Ljava/lang/String;[Ljava/lang/Enum;)V

    .line 131
    .line 132
    .line 133
    return-object v0

    .line 134
    :pswitch_e
    new-instance p0, La/xcz;

    .line 135
    .line 136
    const/4 v0, 0x3

    .line 137
    invoke-direct {p0, v1, v0, v1}, La/xcz;-><init>(III)V

    .line 138
    .line 139
    .line 140
    return-object p0

    .line 141
    :pswitch_f
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 142
    .line 143
    const-string v0, "No CyberFeedFilterRepository provided"

    .line 144
    .line 145
    invoke-direct {p0, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 146
    .line 147
    .line 148
    throw p0

    .line 149
    :pswitch_10
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 150
    .line 151
    const-string v0, "No CyberChampsMainParams provided"

    .line 152
    .line 153
    invoke-direct {p0, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 154
    .line 155
    .line 156
    throw p0

    .line 157
    :pswitch_11
    sget p0, La/jfg;->B:I

    .line 158
    .line 159
    sget-object p0, La/bid;->a:La/bid;

    .line 160
    .line 161
    return-object p0

    .line 162
    :pswitch_12
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 163
    .line 164
    return-object p0

    .line 165
    :pswitch_13
    new-instance p0, La/zw3;

    .line 166
    .line 167
    sget-object v0, La/kcg;->a:La/kcg;

    .line 168
    .line 169
    invoke-direct {p0, v0, v1}, La/zw3;-><init>(La/jiy;B)V

    .line 170
    .line 171
    .line 172
    return-object p0

    .line 173
    :pswitch_14
    new-instance p0, La/zw3;

    .line 174
    .line 175
    sget-object v0, La/kcg;->a:La/kcg;

    .line 176
    .line 177
    invoke-direct {p0, v0, v1}, La/zw3;-><init>(La/jiy;B)V

    .line 178
    .line 179
    .line 180
    return-object p0

    .line 181
    :pswitch_15
    new-instance p0, La/zw3;

    .line 182
    .line 183
    sget-object v0, La/s710;->a:La/s710;

    .line 184
    .line 185
    invoke-direct {p0, v0, v1}, La/zw3;-><init>(La/jiy;B)V

    .line 186
    .line 187
    .line 188
    return-object p0

    .line 189
    :pswitch_16
    sget-object p0, La/i99;->b:La/i99;

    .line 190
    .line 191
    const/4 v2, 0x2

    .line 192
    invoke-static {v0, v1, p0, v2}, La/roj0;->b(IILa/i99;I)La/qoj0;

    .line 193
    .line 194
    .line 195
    move-result-object p0

    .line 196
    return-object p0

    .line 197
    :pswitch_17
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 198
    .line 199
    return-object p0

    .line 200
    :pswitch_18
    new-instance p0, La/inv;

    .line 201
    .line 202
    sget-object v1, La/ysm0;->a:La/ysm0;

    .line 203
    .line 204
    invoke-direct {p0, v1, v1, v0}, La/inv;-><init>(La/jiy;La/jiy;B)V

    .line 205
    .line 206
    .line 207
    return-object p0

    .line 208
    :pswitch_19
    new-instance p0, La/zw3;

    .line 209
    .line 210
    sget-object v0, La/ysm0;->a:La/ysm0;

    .line 211
    .line 212
    invoke-direct {p0, v0, v1}, La/zw3;-><init>(La/jiy;B)V

    .line 213
    .line 214
    .line 215
    return-object p0

    .line 216
    :pswitch_1a
    new-instance p0, La/zw3;

    .line 217
    .line 218
    sget-object v0, La/s710;->a:La/s710;

    .line 219
    .line 220
    invoke-direct {p0, v0, v1}, La/zw3;-><init>(La/jiy;B)V

    .line 221
    .line 222
    .line 223
    return-object p0

    .line 224
    :pswitch_1b
    new-instance p0, La/zw3;

    .line 225
    .line 226
    sget-object v0, La/s710;->a:La/s710;

    .line 227
    .line 228
    invoke-direct {p0, v0, v1}, La/zw3;-><init>(La/jiy;B)V

    .line 229
    .line 230
    .line 231
    return-object p0

    .line 232
    :pswitch_1c
    new-instance p0, La/zw3;

    .line 233
    .line 234
    sget-object v0, La/ysm0;->a:La/ysm0;

    .line 235
    .line 236
    invoke-direct {p0, v0, v1}, La/zw3;-><init>(La/jiy;B)V

    .line 237
    .line 238
    .line 239
    return-object p0

    .line 240
    nop

    .line 241
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
