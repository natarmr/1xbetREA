.class public final synthetic La/gch;
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
    iput-byte p1, p0, La/gch;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 4

    .line 1
    iget-byte p0, p0, La/gch;->a:B

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    packed-switch p0, :pswitch_data_0

    .line 5
    .line 6
    .line 7
    new-instance p0, La/zw3;

    .line 8
    .line 9
    sget-object v1, La/zih;->a:La/zih;

    .line 10
    .line 11
    invoke-direct {p0, v1, v0}, La/zw3;-><init>(La/jiy;B)V

    .line 12
    .line 13
    .line 14
    return-object p0

    .line 15
    :pswitch_0
    new-instance p0, La/zw3;

    .line 16
    .line 17
    sget-object v1, La/vih;->a:La/vih;

    .line 18
    .line 19
    invoke-direct {p0, v1, v0}, La/zw3;-><init>(La/jiy;B)V

    .line 20
    .line 21
    .line 22
    return-object p0

    .line 23
    :pswitch_1
    new-instance p0, La/zw3;

    .line 24
    .line 25
    sget-object v1, La/pjh;->a:La/pjh;

    .line 26
    .line 27
    invoke-direct {p0, v1, v0}, La/zw3;-><init>(La/jiy;B)V

    .line 28
    .line 29
    .line 30
    return-object p0

    .line 31
    :pswitch_2
    new-instance p0, La/zw3;

    .line 32
    .line 33
    sget-object v1, La/fkh;->a:La/fkh;

    .line 34
    .line 35
    invoke-direct {p0, v1, v0}, La/zw3;-><init>(La/jiy;B)V

    .line 36
    .line 37
    .line 38
    return-object p0

    .line 39
    :pswitch_3
    new-instance p0, La/zw3;

    .line 40
    .line 41
    sget-object v1, La/fkh;->a:La/fkh;

    .line 42
    .line 43
    invoke-direct {p0, v1, v0}, La/zw3;-><init>(La/jiy;B)V

    .line 44
    .line 45
    .line 46
    return-object p0

    .line 47
    :pswitch_4
    new-instance p0, La/zw3;

    .line 48
    .line 49
    sget-object v1, La/sm8;->a:La/sm8;

    .line 50
    .line 51
    invoke-direct {p0, v1, v0}, La/zw3;-><init>(La/jiy;B)V

    .line 52
    .line 53
    .line 54
    return-object p0

    .line 55
    :pswitch_5
    new-instance p0, La/zw3;

    .line 56
    .line 57
    sget-object v1, La/gdy;->a:La/gdy;

    .line 58
    .line 59
    invoke-direct {p0, v1, v0}, La/zw3;-><init>(La/jiy;B)V

    .line 60
    .line 61
    .line 62
    return-object p0

    .line 63
    :pswitch_6
    new-instance p0, La/zw3;

    .line 64
    .line 65
    sget-object v1, La/hmh;->a:La/hmh;

    .line 66
    .line 67
    invoke-direct {p0, v1, v0}, La/zw3;-><init>(La/jiy;B)V

    .line 68
    .line 69
    .line 70
    return-object p0

    .line 71
    :pswitch_7
    new-instance p0, La/zw3;

    .line 72
    .line 73
    sget-object v1, La/tkh;->a:La/tkh;

    .line 74
    .line 75
    invoke-direct {p0, v1, v0}, La/zw3;-><init>(La/jiy;B)V

    .line 76
    .line 77
    .line 78
    return-object p0

    .line 79
    :pswitch_8
    new-instance p0, La/zw3;

    .line 80
    .line 81
    sget-object v1, La/hmh;->a:La/hmh;

    .line 82
    .line 83
    invoke-direct {p0, v1, v0}, La/zw3;-><init>(La/jiy;B)V

    .line 84
    .line 85
    .line 86
    return-object p0

    .line 87
    :pswitch_9
    invoke-static {}, Lorg/xplatform/cyber/section/api/tournament_bracket/domain/model/CyberTournamentBracketMatchStatusModel;->values()[Lorg/xplatform/cyber/section/api/tournament_bracket/domain/model/CyberTournamentBracketMatchStatusModel;

    .line 88
    .line 89
    .line 90
    move-result-object p0

    .line 91
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 92
    .line 93
    .line 94
    new-instance v0, La/g0o;

    .line 95
    .line 96
    const-string v1, "org.xplatform.cyber.section.api.tournament_bracket.domain.model.CyberTournamentBracketMatchStatusModel"

    .line 97
    .line 98
    invoke-direct {v0, v1, p0}, La/g0o;-><init>(Ljava/lang/String;[Ljava/lang/Enum;)V

    .line 99
    .line 100
    .line 101
    return-object v0

    .line 102
    :pswitch_a
    sget-object p0, Lorg/xplatform/cyber/section/impl/tournament_bracket/presentation/match_diaolog/model/CyberTournamentBracketMatchParams;->Companion:La/ekh;

    .line 103
    .line 104
    sget-object p0, Lorg/xplatform/cyber/section/api/tournament_bracket/domain/model/CyberTournamentBracketMatchStatusModel;->Companion:La/lkh;

    .line 105
    .line 106
    invoke-virtual {p0}, La/lkh;->serializer()La/jiy;

    .line 107
    .line 108
    .line 109
    move-result-object p0

    .line 110
    return-object p0

    .line 111
    :pswitch_b
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 112
    .line 113
    return-object p0

    .line 114
    :pswitch_c
    new-instance p0, La/zw3;

    .line 115
    .line 116
    sget-object v1, La/fkh;->a:La/fkh;

    .line 117
    .line 118
    invoke-direct {p0, v1, v0}, La/zw3;-><init>(La/jiy;B)V

    .line 119
    .line 120
    .line 121
    return-object p0

    .line 122
    :pswitch_d
    new-instance p0, La/zw3;

    .line 123
    .line 124
    sget-object v1, La/ysm0;->a:La/ysm0;

    .line 125
    .line 126
    invoke-direct {p0, v1, v0}, La/zw3;-><init>(La/jiy;B)V

    .line 127
    .line 128
    .line 129
    return-object p0

    .line 130
    :pswitch_e
    new-instance p0, La/zw3;

    .line 131
    .line 132
    sget-object v1, La/ysm0;->a:La/ysm0;

    .line 133
    .line 134
    invoke-direct {p0, v1, v0}, La/zw3;-><init>(La/jiy;B)V

    .line 135
    .line 136
    .line 137
    return-object p0

    .line 138
    :pswitch_f
    new-instance p0, La/zw3;

    .line 139
    .line 140
    sget-object v1, La/llh;->a:La/llh;

    .line 141
    .line 142
    invoke-direct {p0, v1, v0}, La/zw3;-><init>(La/jiy;B)V

    .line 143
    .line 144
    .line 145
    return-object p0

    .line 146
    :pswitch_10
    new-instance p0, La/zw3;

    .line 147
    .line 148
    sget-object v1, La/hlh;->a:La/hlh;

    .line 149
    .line 150
    invoke-direct {p0, v1, v0}, La/zw3;-><init>(La/jiy;B)V

    .line 151
    .line 152
    .line 153
    return-object p0

    .line 154
    :pswitch_11
    new-instance p0, La/zw3;

    .line 155
    .line 156
    sget-object v1, La/dlh;->a:La/dlh;

    .line 157
    .line 158
    invoke-direct {p0, v1, v0}, La/zw3;-><init>(La/jiy;B)V

    .line 159
    .line 160
    .line 161
    return-object p0

    .line 162
    :pswitch_12
    new-instance p0, La/zw3;

    .line 163
    .line 164
    sget-object v1, La/okx;->a:La/okx;

    .line 165
    .line 166
    invoke-direct {p0, v1, v0}, La/zw3;-><init>(La/jiy;B)V

    .line 167
    .line 168
    .line 169
    return-object p0

    .line 170
    :pswitch_13
    new-instance p0, La/zw3;

    .line 171
    .line 172
    sget-object v1, La/c1h;->a:La/c1h;

    .line 173
    .line 174
    invoke-direct {p0, v1, v0}, La/zw3;-><init>(La/jiy;B)V

    .line 175
    .line 176
    .line 177
    return-object p0

    .line 178
    :pswitch_14
    sget-object p0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 179
    .line 180
    invoke-static {p0}, Landroidx/compose/runtime/e;->e(Ljava/lang/Object;)La/pz40;

    .line 181
    .line 182
    .line 183
    move-result-object p0

    .line 184
    return-object p0

    .line 185
    :pswitch_15
    new-instance p0, La/zw3;

    .line 186
    .line 187
    sget-object v1, La/zeh;->a:La/zeh;

    .line 188
    .line 189
    invoke-direct {p0, v1, v0}, La/zw3;-><init>(La/jiy;B)V

    .line 190
    .line 191
    .line 192
    return-object p0

    .line 193
    :pswitch_16
    new-instance p0, La/zw3;

    .line 194
    .line 195
    sget-object v1, La/khh;->a:La/khh;

    .line 196
    .line 197
    invoke-direct {p0, v1, v0}, La/zw3;-><init>(La/jiy;B)V

    .line 198
    .line 199
    .line 200
    return-object p0

    .line 201
    :pswitch_17
    new-instance p0, La/zw3;

    .line 202
    .line 203
    new-instance v1, La/zw3;

    .line 204
    .line 205
    sget-object v2, La/feh;->a:La/feh;

    .line 206
    .line 207
    invoke-direct {v1, v2, v0}, La/zw3;-><init>(La/jiy;B)V

    .line 208
    .line 209
    .line 210
    invoke-direct {p0, v1, v0}, La/zw3;-><init>(La/jiy;B)V

    .line 211
    .line 212
    .line 213
    return-object p0

    .line 214
    :pswitch_18
    new-instance p0, La/zw3;

    .line 215
    .line 216
    sget-object v1, La/dfh;->a:La/dfh;

    .line 217
    .line 218
    invoke-direct {p0, v1, v0}, La/zw3;-><init>(La/jiy;B)V

    .line 219
    .line 220
    .line 221
    return-object p0

    .line 222
    :pswitch_19
    new-instance p0, La/zw3;

    .line 223
    .line 224
    sget-object v1, La/beh;->a:La/beh;

    .line 225
    .line 226
    invoke-direct {p0, v1, v0}, La/zw3;-><init>(La/jiy;B)V

    .line 227
    .line 228
    .line 229
    return-object p0

    .line 230
    :pswitch_1a
    new-instance p0, La/zw3;

    .line 231
    .line 232
    sget-object v1, La/ysm0;->a:La/ysm0;

    .line 233
    .line 234
    invoke-direct {p0, v1, v0}, La/zw3;-><init>(La/jiy;B)V

    .line 235
    .line 236
    .line 237
    return-object p0

    .line 238
    :pswitch_1b
    new-instance p0, La/zw3;

    .line 239
    .line 240
    sget-object v1, La/neh;->a:La/neh;

    .line 241
    .line 242
    invoke-direct {p0, v1, v0}, La/zw3;-><init>(La/jiy;B)V

    .line 243
    .line 244
    .line 245
    return-object p0

    .line 246
    :pswitch_1c
    new-instance p0, La/inv;

    .line 247
    .line 248
    sget-object v1, La/ysm0;->a:La/ysm0;

    .line 249
    .line 250
    new-instance v2, La/zw3;

    .line 251
    .line 252
    sget-object v3, La/xmo0;->a:La/xmo0;

    .line 253
    .line 254
    invoke-direct {v2, v3, v0}, La/zw3;-><init>(La/jiy;B)V

    .line 255
    .line 256
    .line 257
    const/4 v0, 0x1

    .line 258
    invoke-direct {p0, v1, v2, v0}, La/inv;-><init>(La/jiy;La/jiy;B)V

    .line 259
    .line 260
    .line 261
    return-object p0

    .line 262
    nop

    .line 263
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
