.class public final La/q87;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public j:Z

.field public final synthetic k:La/f97;


# direct methods
.method public synthetic constructor <init>(La/f97;La/yje;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/q87;->i:B

    iput-object p1, p0, La/q87;->k:La/f97;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 2

    .line 1
    iget-byte v0, p0, La/q87;->i:B

    .line 2
    .line 3
    iget-object p0, p0, La/q87;->k:La/f97;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance p1, La/q87;

    .line 9
    .line 10
    const/4 v0, 0x6

    .line 11
    invoke-direct {p1, p0, p2, v0}, La/q87;-><init>(La/f97;La/yje;B)V

    .line 12
    .line 13
    .line 14
    return-object p1

    .line 15
    :pswitch_0
    new-instance p1, La/q87;

    .line 16
    .line 17
    const/4 v0, 0x5

    .line 18
    invoke-direct {p1, p0, p2, v0}, La/q87;-><init>(La/f97;La/yje;B)V

    .line 19
    .line 20
    .line 21
    return-object p1

    .line 22
    :pswitch_1
    new-instance p1, La/q87;

    .line 23
    .line 24
    const/4 v0, 0x4

    .line 25
    invoke-direct {p1, p0, p2, v0}, La/q87;-><init>(La/f97;La/yje;B)V

    .line 26
    .line 27
    .line 28
    return-object p1

    .line 29
    :pswitch_2
    new-instance p1, La/q87;

    .line 30
    .line 31
    const/4 v0, 0x3

    .line 32
    invoke-direct {p1, p0, p2, v0}, La/q87;-><init>(La/f97;La/yje;B)V

    .line 33
    .line 34
    .line 35
    return-object p1

    .line 36
    :pswitch_3
    new-instance p1, La/q87;

    .line 37
    .line 38
    const/4 v0, 0x2

    .line 39
    invoke-direct {p1, p0, p2, v0}, La/q87;-><init>(La/f97;La/yje;B)V

    .line 40
    .line 41
    .line 42
    return-object p1

    .line 43
    :pswitch_4
    new-instance v0, La/q87;

    .line 44
    .line 45
    const/4 v1, 0x1

    .line 46
    invoke-direct {v0, p0, p2, v1}, La/q87;-><init>(La/f97;La/yje;B)V

    .line 47
    .line 48
    .line 49
    check-cast p1, Ljava/lang/Boolean;

    .line 50
    .line 51
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 52
    .line 53
    .line 54
    move-result p0

    .line 55
    iput-boolean p0, v0, La/q87;->j:Z

    .line 56
    .line 57
    return-object v0

    .line 58
    :pswitch_5
    new-instance p1, La/q87;

    .line 59
    .line 60
    const/4 v0, 0x0

    .line 61
    invoke-direct {p1, p0, p2, v0}, La/q87;-><init>(La/f97;La/yje;B)V

    .line 62
    .line 63
    .line 64
    return-object p1

    .line 65
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-byte v0, p0, La/q87;->i:B

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, La/vne;

    .line 7
    .line 8
    check-cast p2, La/yje;

    .line 9
    .line 10
    invoke-virtual {p0, p1, p2}, La/q87;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, La/q87;

    .line 15
    .line 16
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, La/q87;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    check-cast p1, La/vne;

    .line 24
    .line 25
    check-cast p2, La/yje;

    .line 26
    .line 27
    invoke-virtual {p0, p1, p2}, La/q87;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    check-cast p0, La/q87;

    .line 32
    .line 33
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 34
    .line 35
    invoke-virtual {p0, p1}, La/q87;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    return-object p0

    .line 40
    :pswitch_1
    check-cast p1, La/vne;

    .line 41
    .line 42
    check-cast p2, La/yje;

    .line 43
    .line 44
    invoke-virtual {p0, p1, p2}, La/q87;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 45
    .line 46
    .line 47
    move-result-object p0

    .line 48
    check-cast p0, La/q87;

    .line 49
    .line 50
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 51
    .line 52
    invoke-virtual {p0, p1}, La/q87;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object p0

    .line 56
    return-object p0

    .line 57
    :pswitch_2
    check-cast p1, La/vne;

    .line 58
    .line 59
    check-cast p2, La/yje;

    .line 60
    .line 61
    invoke-virtual {p0, p1, p2}, La/q87;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 62
    .line 63
    .line 64
    move-result-object p0

    .line 65
    check-cast p0, La/q87;

    .line 66
    .line 67
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 68
    .line 69
    invoke-virtual {p0, p1}, La/q87;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    move-result-object p0

    .line 73
    return-object p0

    .line 74
    :pswitch_3
    check-cast p1, La/vne;

    .line 75
    .line 76
    check-cast p2, La/yje;

    .line 77
    .line 78
    invoke-virtual {p0, p1, p2}, La/q87;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 79
    .line 80
    .line 81
    move-result-object p0

    .line 82
    check-cast p0, La/q87;

    .line 83
    .line 84
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 85
    .line 86
    invoke-virtual {p0, p1}, La/q87;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 87
    .line 88
    .line 89
    move-result-object p0

    .line 90
    return-object p0

    .line 91
    :pswitch_4
    check-cast p1, Ljava/lang/Boolean;

    .line 92
    .line 93
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 94
    .line 95
    .line 96
    check-cast p2, La/yje;

    .line 97
    .line 98
    invoke-virtual {p0, p1, p2}, La/q87;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 99
    .line 100
    .line 101
    move-result-object p0

    .line 102
    check-cast p0, La/q87;

    .line 103
    .line 104
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 105
    .line 106
    invoke-virtual {p0, p1}, La/q87;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 107
    .line 108
    .line 109
    move-result-object p0

    .line 110
    return-object p0

    .line 111
    :pswitch_5
    check-cast p1, La/vne;

    .line 112
    .line 113
    check-cast p2, La/yje;

    .line 114
    .line 115
    invoke-virtual {p0, p1, p2}, La/q87;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 116
    .line 117
    .line 118
    move-result-object p0

    .line 119
    check-cast p0, La/q87;

    .line 120
    .line 121
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 122
    .line 123
    invoke-virtual {p0, p1}, La/q87;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 124
    .line 125
    .line 126
    move-result-object p0

    .line 127
    return-object p0

    .line 128
    nop

    .line 129
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 37

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/q87;->i:B

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    const-string v3, "call to \'resume\' before \'invoke\' with coroutine"

    .line 7
    .line 8
    const/4 v4, 0x1

    .line 9
    const/4 v5, 0x0

    .line 10
    iget-object v6, v0, La/q87;->k:La/f97;

    .line 11
    .line 12
    packed-switch v1, :pswitch_data_0

    .line 13
    .line 14
    .line 15
    sget-object v1, La/wne;->a:La/wne;

    .line 16
    .line 17
    iget-boolean v2, v0, La/q87;->j:Z

    .line 18
    .line 19
    if-eqz v2, :cond_1

    .line 20
    .line 21
    if-ne v2, v4, :cond_0

    .line 22
    .line 23
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 24
    .line 25
    .line 26
    move-object/from16 v0, p1

    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_0
    invoke-static {v3}, La/jf4;->n(Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    goto :goto_1

    .line 33
    :cond_1
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 34
    .line 35
    .line 36
    invoke-virtual {v6}, La/i3t0;->D()Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object v2

    .line 40
    check-cast v2, La/i77;

    .line 41
    .line 42
    iget-object v2, v2, La/i77;->e:La/ql5;

    .line 43
    .line 44
    if-nez v2, :cond_3

    .line 45
    .line 46
    iput-boolean v4, v0, La/q87;->j:Z

    .line 47
    .line 48
    invoke-virtual {v6, v0}, La/f97;->T(La/yje;)Ljava/io/Serializable;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    if-ne v0, v1, :cond_2

    .line 53
    .line 54
    move-object v5, v1

    .line 55
    goto :goto_1

    .line 56
    :cond_2
    :goto_0
    move-object v2, v0

    .line 57
    check-cast v2, La/ql5;

    .line 58
    .line 59
    :cond_3
    iget-object v0, v6, La/f97;->p:Lorg/xplatform/bet_history/core/presentation/BetHistoryScreenModel;

    .line 60
    .line 61
    invoke-static {v0}, La/i8w;->a(Lorg/xplatform/bet_history/core/presentation/BetHistoryScreenModel;)La/f8w;

    .line 62
    .line 63
    .line 64
    move-result-object v0

    .line 65
    invoke-virtual {v6}, La/i3t0;->D()Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    move-result-object v1

    .line 69
    check-cast v1, La/i77;

    .line 70
    .line 71
    iget-object v1, v1, La/i77;->i:Lorg/xplatform/bet_history/history/domain/model/HistoryTypeModel;

    .line 72
    .line 73
    new-instance v3, La/o67;

    .line 74
    .line 75
    invoke-direct {v3, v2, v0, v1}, La/o67;-><init>(La/ql5;La/f8w;Lorg/xplatform/bet_history/history/domain/model/HistoryTypeModel;)V

    .line 76
    .line 77
    .line 78
    invoke-virtual {v6, v3}, La/i3t0;->G(Ljava/lang/Object;)V

    .line 79
    .line 80
    .line 81
    sget-object v5, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 82
    .line 83
    :goto_1
    return-object v5

    .line 84
    :pswitch_0
    sget-object v1, La/wne;->a:La/wne;

    .line 85
    .line 86
    iget-boolean v7, v0, La/q87;->j:Z

    .line 87
    .line 88
    if-eqz v7, :cond_5

    .line 89
    .line 90
    if-ne v7, v4, :cond_4

    .line 91
    .line 92
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 93
    .line 94
    .line 95
    move-object/from16 v0, p1

    .line 96
    .line 97
    goto :goto_2

    .line 98
    :cond_4
    invoke-static {v3}, La/jf4;->n(Ljava/lang/String;)V

    .line 99
    .line 100
    .line 101
    goto/16 :goto_4

    .line 102
    .line 103
    :cond_5
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 104
    .line 105
    .line 106
    iget-object v3, v6, La/f97;->z:La/rou;

    .line 107
    .line 108
    iput-boolean v4, v0, La/q87;->j:Z

    .line 109
    .line 110
    invoke-virtual {v3, v2, v0}, La/rou;->a(ZLa/yje;)Ljava/lang/Object;

    .line 111
    .line 112
    .line 113
    move-result-object v0

    .line 114
    if-ne v0, v1, :cond_6

    .line 115
    .line 116
    move-object v5, v1

    .line 117
    goto/16 :goto_4

    .line 118
    .line 119
    :cond_6
    :goto_2
    check-cast v0, La/m2c0;

    .line 120
    .line 121
    iget-object v0, v0, La/m2c0;->k:La/jqt0;

    .line 122
    .line 123
    sget-object v1, La/jqt0;->c:La/jqt0;

    .line 124
    .line 125
    sget-object v3, La/jqt0;->d:La/jqt0;

    .line 126
    .line 127
    filled-new-array {v1, v3}, [La/jqt0;

    .line 128
    .line 129
    .line 130
    move-result-object v1

    .line 131
    invoke-static {v1}, La/q3d;->j([Ljava/lang/Object;)Ljava/util/List;

    .line 132
    .line 133
    .line 134
    move-result-object v1

    .line 135
    invoke-interface {v1, v0}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 136
    .line 137
    .line 138
    move-result v0

    .line 139
    if-eqz v0, :cond_7

    .line 140
    .line 141
    invoke-virtual {v6}, La/i3t0;->D()Ljava/lang/Object;

    .line 142
    .line 143
    .line 144
    move-result-object v1

    .line 145
    check-cast v1, La/i77;

    .line 146
    .line 147
    iget-boolean v1, v1, La/i77;->Q:Z

    .line 148
    .line 149
    if-eqz v1, :cond_7

    .line 150
    .line 151
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    .line 152
    .line 153
    .line 154
    move-result-object v0

    .line 155
    new-instance v10, Lorg/xplatform/ui_core/calendar/model/BorderDateTimeModel;

    .line 156
    .line 157
    invoke-virtual {v0}, Ljava/util/Calendar;->getTimeInMillis()J

    .line 158
    .line 159
    .line 160
    move-result-wide v3

    .line 161
    invoke-static {v3, v4, v0}, La/bsr0;->g0(JLjava/util/Calendar;)Lorg/xplatform/uikit/compose/components/picker/model/SimpleDate;

    .line 162
    .line 163
    .line 164
    move-result-object v1

    .line 165
    invoke-direct {v10, v1, v5}, Lorg/xplatform/ui_core/calendar/model/BorderDateTimeModel;-><init>(Lorg/xplatform/uikit/compose/components/picker/model/SimpleDate;Lorg/xplatform/uikit/compose/components/picker/model/TimeOfDay23;)V

    .line 166
    .line 167
    .line 168
    const/4 v3, 0x5

    .line 169
    const/16 v4, -0x59

    .line 170
    .line 171
    invoke-virtual {v0, v3, v4}, Ljava/util/Calendar;->add(II)V

    .line 172
    .line 173
    .line 174
    new-instance v9, Lorg/xplatform/ui_core/calendar/model/BorderDateTimeModel;

    .line 175
    .line 176
    invoke-virtual {v0}, Ljava/util/Calendar;->getTimeInMillis()J

    .line 177
    .line 178
    .line 179
    move-result-wide v3

    .line 180
    invoke-static {v3, v4, v0}, La/bsr0;->g0(JLjava/util/Calendar;)Lorg/xplatform/uikit/compose/components/picker/model/SimpleDate;

    .line 181
    .line 182
    .line 183
    move-result-object v3

    .line 184
    invoke-direct {v9, v3, v5}, Lorg/xplatform/ui_core/calendar/model/BorderDateTimeModel;-><init>(Lorg/xplatform/uikit/compose/components/picker/model/SimpleDate;Lorg/xplatform/uikit/compose/components/picker/model/TimeOfDay23;)V

    .line 185
    .line 186
    .line 187
    new-instance v7, Lorg/xplatform/ui_core/calendar/model/DateRangeWithTimeCalendarBottomSheetParams;

    .line 188
    .line 189
    iget-object v3, v6, La/f97;->r:La/ctf0;

    .line 190
    .line 191
    new-array v4, v2, [Ljava/lang/Object;

    .line 192
    .line 193
    iget-object v3, v3, La/ctf0;->b:La/lsm0;

    .line 194
    .line 195
    invoke-static {v4, v2}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 196
    .line 197
    .line 198
    move-result-object v2

    .line 199
    const v4, 0x7f13030f

    .line 200
    .line 201
    .line 202
    invoke-virtual {v3, v4, v2}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 203
    .line 204
    .line 205
    move-result-object v8

    .line 206
    sget-object v2, La/ulq0;->a:La/ulq0;

    .line 207
    .line 208
    invoke-virtual {v0}, Ljava/util/Calendar;->getTimeInMillis()J

    .line 209
    .line 210
    .line 211
    move-result-wide v2

    .line 212
    new-instance v11, Ljava/lang/Long;

    .line 213
    .line 214
    invoke-direct {v11, v2, v3}, Ljava/lang/Long;-><init>(J)V

    .line 215
    .line 216
    .line 217
    invoke-static {v1, v0}, La/wdx;->J(Lorg/xplatform/uikit/compose/components/picker/model/SimpleDate;Ljava/util/Calendar;)V

    .line 218
    .line 219
    .line 220
    invoke-virtual {v0}, Ljava/util/Calendar;->getTimeInMillis()J

    .line 221
    .line 222
    .line 223
    move-result-wide v0

    .line 224
    new-instance v12, Ljava/lang/Long;

    .line 225
    .line 226
    invoke-direct {v12, v0, v1}, Ljava/lang/Long;-><init>(J)V

    .line 227
    .line 228
    .line 229
    const/16 v13, 0x10

    .line 230
    .line 231
    invoke-direct/range {v7 .. v13}, Lorg/xplatform/ui_core/calendar/model/DateRangeWithTimeCalendarBottomSheetParams;-><init>(Ljava/lang/String;Lorg/xplatform/ui_core/calendar/model/BorderDateTimeModel;Lorg/xplatform/ui_core/calendar/model/BorderDateTimeModel;Ljava/lang/Long;Ljava/lang/Long;I)V

    .line 232
    .line 233
    .line 234
    new-instance v0, La/a67;

    .line 235
    .line 236
    invoke-direct {v0, v7}, La/a67;-><init>(Lorg/xplatform/ui_core/calendar/model/DateRangeWithTimeCalendarBottomSheetParams;)V

    .line 237
    .line 238
    .line 239
    invoke-virtual {v6, v0}, La/i3t0;->G(Ljava/lang/Object;)V

    .line 240
    .line 241
    .line 242
    goto :goto_3

    .line 243
    :cond_7
    if-eqz v0, :cond_8

    .line 244
    .line 245
    new-instance v0, La/y57;

    .line 246
    .line 247
    const-wide/16 v1, 0x0

    .line 248
    .line 249
    invoke-direct {v0, v1, v2}, La/y57;-><init>(J)V

    .line 250
    .line 251
    .line 252
    sget v1, La/f97;->R0:I

    .line 253
    .line 254
    invoke-virtual {v6, v0}, La/i3t0;->G(Ljava/lang/Object;)V

    .line 255
    .line 256
    .line 257
    goto :goto_3

    .line 258
    :cond_8
    sget v0, La/f97;->R0:I

    .line 259
    .line 260
    sget-object v0, La/b67;->a:La/b67;

    .line 261
    .line 262
    invoke-virtual {v6, v0}, La/i3t0;->G(Ljava/lang/Object;)V

    .line 263
    .line 264
    .line 265
    :goto_3
    sget-object v5, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 266
    .line 267
    :goto_4
    return-object v5

    .line 268
    :pswitch_1
    sget-object v1, La/wne;->a:La/wne;

    .line 269
    .line 270
    iget-boolean v7, v0, La/q87;->j:Z

    .line 271
    .line 272
    if-eqz v7, :cond_a

    .line 273
    .line 274
    if-ne v7, v4, :cond_9

    .line 275
    .line 276
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 277
    .line 278
    .line 279
    goto :goto_5

    .line 280
    :cond_9
    invoke-static {v3}, La/jf4;->n(Ljava/lang/String;)V

    .line 281
    .line 282
    .line 283
    goto :goto_6

    .line 284
    :cond_a
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 285
    .line 286
    .line 287
    iput-boolean v4, v0, La/q87;->j:Z

    .line 288
    .line 289
    sget v3, La/f97;->R0:I

    .line 290
    .line 291
    invoke-virtual {v6, v2, v0}, La/f97;->N(ZLa/zje;)Ljava/lang/Object;

    .line 292
    .line 293
    .line 294
    move-result-object v0

    .line 295
    if-ne v0, v1, :cond_b

    .line 296
    .line 297
    move-object v5, v1

    .line 298
    goto :goto_6

    .line 299
    :cond_b
    :goto_5
    sget-object v5, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 300
    .line 301
    :goto_6
    return-object v5

    .line 302
    :pswitch_2
    sget-object v1, La/wne;->a:La/wne;

    .line 303
    .line 304
    iget-boolean v2, v0, La/q87;->j:Z

    .line 305
    .line 306
    if-eqz v2, :cond_d

    .line 307
    .line 308
    if-ne v2, v4, :cond_c

    .line 309
    .line 310
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 311
    .line 312
    .line 313
    move-object/from16 v0, p1

    .line 314
    .line 315
    goto :goto_7

    .line 316
    :cond_c
    invoke-static {v3}, La/jf4;->n(Ljava/lang/String;)V

    .line 317
    .line 318
    .line 319
    goto :goto_8

    .line 320
    :cond_d
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 321
    .line 322
    .line 323
    iget-object v2, v6, La/f97;->O:La/ocl;

    .line 324
    .line 325
    iput-boolean v4, v0, La/q87;->j:Z

    .line 326
    .line 327
    invoke-virtual {v2}, La/ocl;->j()Ljava/util/List;

    .line 328
    .line 329
    .line 330
    move-result-object v0

    .line 331
    if-ne v0, v1, :cond_e

    .line 332
    .line 333
    move-object v5, v1

    .line 334
    goto :goto_8

    .line 335
    :cond_e
    :goto_7
    move-object/from16 v26, v0

    .line 336
    .line 337
    check-cast v26, Ljava/util/List;

    .line 338
    .line 339
    sget v0, La/f97;->R0:I

    .line 340
    .line 341
    iget-object v0, v6, La/i3t0;->i:La/ocj;

    .line 342
    .line 343
    iget-object v1, v0, La/ocj;->a:La/p7m0;

    .line 344
    .line 345
    :cond_f
    invoke-virtual {v1}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 346
    .line 347
    .line 348
    move-result-object v0

    .line 349
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 350
    .line 351
    .line 352
    move-object v7, v0

    .line 353
    check-cast v7, La/i77;

    .line 354
    .line 355
    const v35, -0x800001

    .line 356
    .line 357
    .line 358
    const/16 v36, 0x7ff

    .line 359
    .line 360
    const/4 v8, 0x0

    .line 361
    const/4 v9, 0x0

    .line 362
    const/4 v10, 0x0

    .line 363
    const/4 v11, 0x0

    .line 364
    const/4 v12, 0x0

    .line 365
    const/4 v13, 0x0

    .line 366
    const/4 v14, 0x0

    .line 367
    const/4 v15, 0x0

    .line 368
    const/16 v16, 0x0

    .line 369
    .line 370
    const/16 v17, 0x0

    .line 371
    .line 372
    const/16 v18, 0x0

    .line 373
    .line 374
    const/16 v19, 0x0

    .line 375
    .line 376
    const/16 v20, 0x0

    .line 377
    .line 378
    const/16 v21, 0x0

    .line 379
    .line 380
    const/16 v22, 0x0

    .line 381
    .line 382
    const/16 v23, 0x0

    .line 383
    .line 384
    const/16 v24, 0x0

    .line 385
    .line 386
    const/16 v25, 0x0

    .line 387
    .line 388
    const/16 v27, 0x0

    .line 389
    .line 390
    const/16 v28, 0x0

    .line 391
    .line 392
    const/16 v29, 0x0

    .line 393
    .line 394
    const/16 v30, 0x0

    .line 395
    .line 396
    const/16 v31, 0x0

    .line 397
    .line 398
    const/16 v32, 0x0

    .line 399
    .line 400
    const/16 v33, 0x0

    .line 401
    .line 402
    const/16 v34, 0x0

    .line 403
    .line 404
    invoke-static/range {v7 .. v36}, La/i77;->a(La/i77;ZZZLa/ql5;Ljava/lang/String;La/ov7;Lorg/xplatform/bet_history/history/domain/model/HistoryTypeModel;ZLa/wdj;Ljava/util/List;ZZZLjava/util/Map;Ljava/util/List;La/dyv;La/qgv0;ZLjava/util/List;ZZZLjava/util/List;Ljava/util/List;Ljava/util/HashMap;Ljava/util/List;Ljava/util/LinkedHashMap;II)La/i77;

    .line 405
    .line 406
    .line 407
    move-result-object v2

    .line 408
    invoke-virtual {v1, v0, v2}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 409
    .line 410
    .line 411
    move-result v0

    .line 412
    if-eqz v0, :cond_f

    .line 413
    .line 414
    sget-object v5, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 415
    .line 416
    :goto_8
    return-object v5

    .line 417
    :pswitch_3
    sget-object v1, La/wne;->a:La/wne;

    .line 418
    .line 419
    iget-boolean v2, v0, La/q87;->j:Z

    .line 420
    .line 421
    if-eqz v2, :cond_11

    .line 422
    .line 423
    if-ne v2, v4, :cond_10

    .line 424
    .line 425
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 426
    .line 427
    .line 428
    goto :goto_9

    .line 429
    :cond_10
    invoke-static {v3}, La/jf4;->n(Ljava/lang/String;)V

    .line 430
    .line 431
    .line 432
    goto :goto_a

    .line 433
    :cond_11
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 434
    .line 435
    .line 436
    sget-object v2, La/wen;->b:La/uen;

    .line 437
    .line 438
    const-wide/16 v2, 0x3e8

    .line 439
    .line 440
    sget-object v5, La/bfn;->d:La/bfn;

    .line 441
    .line 442
    invoke-static {v2, v3, v5}, La/ibc;->w0(JLa/bfn;)J

    .line 443
    .line 444
    .line 445
    move-result-wide v2

    .line 446
    iput-boolean v4, v0, La/q87;->j:Z

    .line 447
    .line 448
    invoke-static {v2, v3, v0}, La/qcc;->P(JLa/yje;)Ljava/lang/Object;

    .line 449
    .line 450
    .line 451
    move-result-object v0

    .line 452
    if-ne v0, v1, :cond_12

    .line 453
    .line 454
    move-object v5, v1

    .line 455
    goto :goto_a

    .line 456
    :cond_12
    :goto_9
    sget v0, La/f97;->R0:I

    .line 457
    .line 458
    iget-object v0, v6, La/i3t0;->i:La/ocj;

    .line 459
    .line 460
    iget-object v1, v0, La/ocj;->a:La/p7m0;

    .line 461
    .line 462
    :cond_13
    invoke-virtual {v1}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 463
    .line 464
    .line 465
    move-result-object v0

    .line 466
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 467
    .line 468
    .line 469
    move-object v2, v0

    .line 470
    check-cast v2, La/i77;

    .line 471
    .line 472
    const v30, -0x400001

    .line 473
    .line 474
    .line 475
    const/16 v31, 0x7ff

    .line 476
    .line 477
    const/4 v3, 0x0

    .line 478
    const/4 v4, 0x0

    .line 479
    const/4 v5, 0x0

    .line 480
    const/4 v6, 0x0

    .line 481
    const/4 v7, 0x0

    .line 482
    const/4 v8, 0x0

    .line 483
    const/4 v9, 0x0

    .line 484
    const/4 v10, 0x0

    .line 485
    const/4 v11, 0x0

    .line 486
    const/4 v12, 0x0

    .line 487
    const/4 v13, 0x0

    .line 488
    const/4 v14, 0x0

    .line 489
    const/4 v15, 0x0

    .line 490
    const/16 v16, 0x0

    .line 491
    .line 492
    const/16 v17, 0x0

    .line 493
    .line 494
    const/16 v18, 0x0

    .line 495
    .line 496
    const/16 v19, 0x0

    .line 497
    .line 498
    const/16 v20, 0x0

    .line 499
    .line 500
    const/16 v21, 0x0

    .line 501
    .line 502
    const/16 v22, 0x0

    .line 503
    .line 504
    const/16 v23, 0x0

    .line 505
    .line 506
    const/16 v24, 0x0

    .line 507
    .line 508
    const/16 v25, 0x0

    .line 509
    .line 510
    const/16 v26, 0x0

    .line 511
    .line 512
    const/16 v27, 0x0

    .line 513
    .line 514
    const/16 v28, 0x0

    .line 515
    .line 516
    const/16 v29, 0x0

    .line 517
    .line 518
    invoke-static/range {v2 .. v31}, La/i77;->a(La/i77;ZZZLa/ql5;Ljava/lang/String;La/ov7;Lorg/xplatform/bet_history/history/domain/model/HistoryTypeModel;ZLa/wdj;Ljava/util/List;ZZZLjava/util/Map;Ljava/util/List;La/dyv;La/qgv0;ZLjava/util/List;ZZZLjava/util/List;Ljava/util/List;Ljava/util/HashMap;Ljava/util/List;Ljava/util/LinkedHashMap;II)La/i77;

    .line 519
    .line 520
    .line 521
    move-result-object v2

    .line 522
    invoke-virtual {v1, v0, v2}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 523
    .line 524
    .line 525
    move-result v0

    .line 526
    if-eqz v0, :cond_13

    .line 527
    .line 528
    sget-object v5, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 529
    .line 530
    :goto_a
    return-object v5

    .line 531
    :pswitch_4
    iget-boolean v0, v0, La/q87;->j:Z

    .line 532
    .line 533
    sget-object v1, La/wne;->a:La/wne;

    .line 534
    .line 535
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 536
    .line 537
    .line 538
    iget-object v1, v6, La/i3t0;->i:La/ocj;

    .line 539
    .line 540
    invoke-virtual {v6}, La/i3t0;->D()Ljava/lang/Object;

    .line 541
    .line 542
    .line 543
    move-result-object v2

    .line 544
    check-cast v2, La/i77;

    .line 545
    .line 546
    iget-boolean v2, v2, La/i77;->C:Z

    .line 547
    .line 548
    if-eqz v2, :cond_14

    .line 549
    .line 550
    if-nez v0, :cond_18

    .line 551
    .line 552
    :cond_14
    invoke-virtual {v6}, La/i3t0;->D()Ljava/lang/Object;

    .line 553
    .line 554
    .line 555
    move-result-object v2

    .line 556
    check-cast v2, La/i77;

    .line 557
    .line 558
    iget-object v2, v2, La/i77;->t:Ljava/util/List;

    .line 559
    .line 560
    invoke-interface {v2}, Ljava/util/Collection;->isEmpty()Z

    .line 561
    .line 562
    .line 563
    move-result v2

    .line 564
    if-eqz v2, :cond_18

    .line 565
    .line 566
    invoke-virtual {v6}, La/i3t0;->D()Ljava/lang/Object;

    .line 567
    .line 568
    .line 569
    move-result-object v2

    .line 570
    check-cast v2, La/i77;

    .line 571
    .line 572
    iget-boolean v2, v2, La/i77;->C:Z

    .line 573
    .line 574
    if-eqz v2, :cond_16

    .line 575
    .line 576
    if-nez v0, :cond_16

    .line 577
    .line 578
    iget-object v2, v1, La/ocj;->a:La/p7m0;

    .line 579
    .line 580
    :cond_15
    invoke-virtual {v2}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 581
    .line 582
    .line 583
    move-result-object v3

    .line 584
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 585
    .line 586
    .line 587
    move-object v4, v3

    .line 588
    check-cast v4, La/i77;

    .line 589
    .line 590
    const/16 v32, -0x6

    .line 591
    .line 592
    const/16 v33, 0x7ff

    .line 593
    .line 594
    const/4 v5, 0x0

    .line 595
    const/4 v6, 0x0

    .line 596
    const/4 v7, 0x1

    .line 597
    const/4 v8, 0x0

    .line 598
    const/4 v9, 0x0

    .line 599
    const/4 v10, 0x0

    .line 600
    const/4 v11, 0x0

    .line 601
    const/4 v12, 0x0

    .line 602
    const/4 v13, 0x0

    .line 603
    const/4 v14, 0x0

    .line 604
    const/4 v15, 0x0

    .line 605
    const/16 v16, 0x0

    .line 606
    .line 607
    const/16 v17, 0x0

    .line 608
    .line 609
    const/16 v18, 0x0

    .line 610
    .line 611
    const/16 v19, 0x0

    .line 612
    .line 613
    const/16 v20, 0x0

    .line 614
    .line 615
    const/16 v21, 0x0

    .line 616
    .line 617
    const/16 v22, 0x0

    .line 618
    .line 619
    const/16 v23, 0x0

    .line 620
    .line 621
    const/16 v24, 0x0

    .line 622
    .line 623
    const/16 v25, 0x0

    .line 624
    .line 625
    const/16 v26, 0x0

    .line 626
    .line 627
    const/16 v27, 0x0

    .line 628
    .line 629
    const/16 v28, 0x0

    .line 630
    .line 631
    const/16 v29, 0x0

    .line 632
    .line 633
    const/16 v30, 0x0

    .line 634
    .line 635
    const/16 v31, 0x0

    .line 636
    .line 637
    invoke-static/range {v4 .. v33}, La/i77;->a(La/i77;ZZZLa/ql5;Ljava/lang/String;La/ov7;Lorg/xplatform/bet_history/history/domain/model/HistoryTypeModel;ZLa/wdj;Ljava/util/List;ZZZLjava/util/Map;Ljava/util/List;La/dyv;La/qgv0;ZLjava/util/List;ZZZLjava/util/List;Ljava/util/List;Ljava/util/HashMap;Ljava/util/List;Ljava/util/LinkedHashMap;II)La/i77;

    .line 638
    .line 639
    .line 640
    move-result-object v4

    .line 641
    invoke-virtual {v2, v3, v4}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 642
    .line 643
    .line 644
    move-result v3

    .line 645
    if-eqz v3, :cond_15

    .line 646
    .line 647
    goto :goto_b

    .line 648
    :cond_16
    invoke-virtual {v6}, La/i3t0;->D()Ljava/lang/Object;

    .line 649
    .line 650
    .line 651
    move-result-object v2

    .line 652
    check-cast v2, La/i77;

    .line 653
    .line 654
    iget-boolean v2, v2, La/i77;->C:Z

    .line 655
    .line 656
    if-nez v2, :cond_18

    .line 657
    .line 658
    if-eqz v0, :cond_18

    .line 659
    .line 660
    iget-object v2, v1, La/ocj;->a:La/p7m0;

    .line 661
    .line 662
    :cond_17
    invoke-virtual {v2}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 663
    .line 664
    .line 665
    move-result-object v3

    .line 666
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 667
    .line 668
    .line 669
    move-object v7, v3

    .line 670
    check-cast v7, La/i77;

    .line 671
    .line 672
    const/16 v35, -0x2

    .line 673
    .line 674
    const/16 v36, 0x7ff

    .line 675
    .line 676
    const/4 v8, 0x1

    .line 677
    const/4 v9, 0x0

    .line 678
    const/4 v10, 0x0

    .line 679
    const/4 v11, 0x0

    .line 680
    const/4 v12, 0x0

    .line 681
    const/4 v13, 0x0

    .line 682
    const/4 v14, 0x0

    .line 683
    const/4 v15, 0x0

    .line 684
    const/16 v16, 0x0

    .line 685
    .line 686
    const/16 v17, 0x0

    .line 687
    .line 688
    const/16 v18, 0x0

    .line 689
    .line 690
    const/16 v19, 0x0

    .line 691
    .line 692
    const/16 v20, 0x0

    .line 693
    .line 694
    const/16 v21, 0x0

    .line 695
    .line 696
    const/16 v22, 0x0

    .line 697
    .line 698
    const/16 v23, 0x0

    .line 699
    .line 700
    const/16 v24, 0x0

    .line 701
    .line 702
    const/16 v25, 0x0

    .line 703
    .line 704
    const/16 v26, 0x0

    .line 705
    .line 706
    const/16 v27, 0x0

    .line 707
    .line 708
    const/16 v28, 0x0

    .line 709
    .line 710
    const/16 v29, 0x0

    .line 711
    .line 712
    const/16 v30, 0x0

    .line 713
    .line 714
    const/16 v31, 0x0

    .line 715
    .line 716
    const/16 v32, 0x0

    .line 717
    .line 718
    const/16 v33, 0x0

    .line 719
    .line 720
    const/16 v34, 0x0

    .line 721
    .line 722
    invoke-static/range {v7 .. v36}, La/i77;->a(La/i77;ZZZLa/ql5;Ljava/lang/String;La/ov7;Lorg/xplatform/bet_history/history/domain/model/HistoryTypeModel;ZLa/wdj;Ljava/util/List;ZZZLjava/util/Map;Ljava/util/List;La/dyv;La/qgv0;ZLjava/util/List;ZZZLjava/util/List;Ljava/util/List;Ljava/util/HashMap;Ljava/util/List;Ljava/util/LinkedHashMap;II)La/i77;

    .line 723
    .line 724
    .line 725
    move-result-object v4

    .line 726
    invoke-virtual {v2, v3, v4}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 727
    .line 728
    .line 729
    move-result v3

    .line 730
    if-eqz v3, :cond_17

    .line 731
    .line 732
    invoke-virtual {v6}, La/f97;->h0()V

    .line 733
    .line 734
    .line 735
    invoke-virtual {v6}, La/f97;->a0()V

    .line 736
    .line 737
    .line 738
    :cond_18
    :goto_b
    iget-object v1, v1, La/ocj;->a:La/p7m0;

    .line 739
    .line 740
    :goto_c
    invoke-virtual {v1}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 741
    .line 742
    .line 743
    move-result-object v2

    .line 744
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 745
    .line 746
    .line 747
    move-object v6, v2

    .line 748
    check-cast v6, La/i77;

    .line 749
    .line 750
    const v34, -0x10000001

    .line 751
    .line 752
    .line 753
    const/16 v35, 0x7ff

    .line 754
    .line 755
    const/4 v7, 0x0

    .line 756
    const/4 v8, 0x0

    .line 757
    const/4 v9, 0x0

    .line 758
    const/4 v10, 0x0

    .line 759
    const/4 v11, 0x0

    .line 760
    const/4 v12, 0x0

    .line 761
    const/4 v13, 0x0

    .line 762
    const/4 v14, 0x0

    .line 763
    const/4 v15, 0x0

    .line 764
    const/16 v16, 0x0

    .line 765
    .line 766
    const/16 v17, 0x0

    .line 767
    .line 768
    const/16 v18, 0x0

    .line 769
    .line 770
    const/16 v19, 0x0

    .line 771
    .line 772
    const/16 v20, 0x0

    .line 773
    .line 774
    const/16 v21, 0x0

    .line 775
    .line 776
    const/16 v22, 0x0

    .line 777
    .line 778
    const/16 v23, 0x0

    .line 779
    .line 780
    const/16 v24, 0x0

    .line 781
    .line 782
    const/16 v25, 0x0

    .line 783
    .line 784
    const/16 v26, 0x0

    .line 785
    .line 786
    const/16 v27, 0x0

    .line 787
    .line 788
    const/16 v29, 0x0

    .line 789
    .line 790
    const/16 v30, 0x0

    .line 791
    .line 792
    const/16 v31, 0x0

    .line 793
    .line 794
    const/16 v32, 0x0

    .line 795
    .line 796
    const/16 v33, 0x0

    .line 797
    .line 798
    move/from16 v28, v0

    .line 799
    .line 800
    invoke-static/range {v6 .. v35}, La/i77;->a(La/i77;ZZZLa/ql5;Ljava/lang/String;La/ov7;Lorg/xplatform/bet_history/history/domain/model/HistoryTypeModel;ZLa/wdj;Ljava/util/List;ZZZLjava/util/Map;Ljava/util/List;La/dyv;La/qgv0;ZLjava/util/List;ZZZLjava/util/List;Ljava/util/List;Ljava/util/HashMap;Ljava/util/List;Ljava/util/LinkedHashMap;II)La/i77;

    .line 801
    .line 802
    .line 803
    move-result-object v0

    .line 804
    invoke-virtual {v1, v2, v0}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 805
    .line 806
    .line 807
    move-result v0

    .line 808
    if-eqz v0, :cond_19

    .line 809
    .line 810
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 811
    .line 812
    return-object v0

    .line 813
    :cond_19
    move/from16 v0, v28

    .line 814
    .line 815
    goto :goto_c

    .line 816
    :pswitch_5
    sget-object v1, La/wne;->a:La/wne;

    .line 817
    .line 818
    iget-boolean v2, v0, La/q87;->j:Z

    .line 819
    .line 820
    if-eqz v2, :cond_1b

    .line 821
    .line 822
    if-ne v2, v4, :cond_1a

    .line 823
    .line 824
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 825
    .line 826
    .line 827
    goto :goto_d

    .line 828
    :cond_1a
    invoke-static {v3}, La/jf4;->n(Ljava/lang/String;)V

    .line 829
    .line 830
    .line 831
    goto :goto_e

    .line 832
    :cond_1b
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 833
    .line 834
    .line 835
    iput-boolean v4, v0, La/q87;->j:Z

    .line 836
    .line 837
    sget v2, La/f97;->R0:I

    .line 838
    .line 839
    invoke-virtual {v6, v4, v0}, La/f97;->N(ZLa/zje;)Ljava/lang/Object;

    .line 840
    .line 841
    .line 842
    move-result-object v0

    .line 843
    if-ne v0, v1, :cond_1c

    .line 844
    .line 845
    move-object v5, v1

    .line 846
    goto :goto_e

    .line 847
    :cond_1c
    :goto_d
    sget-object v5, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 848
    .line 849
    :goto_e
    return-object v5

    .line 850
    nop

    .line 851
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
