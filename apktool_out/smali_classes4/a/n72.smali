.class public final synthetic La/n72;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:Ljava/util/Calendar;


# direct methods
.method public synthetic constructor <init>(Ljava/util/Calendar;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/n72;->a:B

    iput-object p1, p0, La/n72;->b:Ljava/util/Calendar;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 16

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/n72;->a:B

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    const/4 v3, 0x0

    .line 7
    const/4 v4, 0x2

    .line 8
    const/4 v5, 0x0

    .line 9
    iget-object v0, v0, La/n72;->b:Ljava/util/Calendar;

    .line 10
    .line 11
    packed-switch v1, :pswitch_data_0

    .line 12
    .line 13
    .line 14
    move-object/from16 v1, p1

    .line 15
    .line 16
    check-cast v1, La/azg0;

    .line 17
    .line 18
    move-object/from16 v6, p2

    .line 19
    .line 20
    check-cast v6, La/xk9;

    .line 21
    .line 22
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 23
    .line 24
    .line 25
    if-eqz v6, :cond_0

    .line 26
    .line 27
    new-array v5, v4, [J

    .line 28
    .line 29
    iget-object v1, v6, La/xk9;->a:Lorg/xplatform/uikit/compose/components/calendar/model/SimpleDateTime;

    .line 30
    .line 31
    invoke-static {v1, v0}, La/wdx;->e0(Lorg/xplatform/uikit/compose/components/calendar/model/SimpleDateTime;Ljava/util/Calendar;)J

    .line 32
    .line 33
    .line 34
    move-result-wide v7

    .line 35
    aput-wide v7, v5, v3

    .line 36
    .line 37
    iget-object v1, v6, La/xk9;->b:Lorg/xplatform/uikit/compose/components/calendar/model/SimpleDateTime;

    .line 38
    .line 39
    invoke-static {v1, v0}, La/wdx;->e0(Lorg/xplatform/uikit/compose/components/calendar/model/SimpleDateTime;Ljava/util/Calendar;)J

    .line 40
    .line 41
    .line 42
    move-result-wide v0

    .line 43
    aput-wide v0, v5, v2

    .line 44
    .line 45
    :cond_0
    return-object v5

    .line 46
    :pswitch_0
    move-object/from16 v1, p1

    .line 47
    .line 48
    check-cast v1, La/azg0;

    .line 49
    .line 50
    move-object/from16 v6, p2

    .line 51
    .line 52
    check-cast v6, La/wk9;

    .line 53
    .line 54
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 55
    .line 56
    .line 57
    if-eqz v6, :cond_1

    .line 58
    .line 59
    new-array v5, v4, [J

    .line 60
    .line 61
    iget-object v1, v6, La/wk9;->a:Lorg/xplatform/uikit/compose/components/picker/model/SimpleDate;

    .line 62
    .line 63
    invoke-static {v1, v0}, La/wdx;->f0(Lorg/xplatform/uikit/compose/components/picker/model/SimpleDate;Ljava/util/Calendar;)J

    .line 64
    .line 65
    .line 66
    move-result-wide v7

    .line 67
    aput-wide v7, v5, v3

    .line 68
    .line 69
    iget-object v1, v6, La/wk9;->b:Lorg/xplatform/uikit/compose/components/picker/model/SimpleDate;

    .line 70
    .line 71
    invoke-static {v1, v0}, La/wdx;->f0(Lorg/xplatform/uikit/compose/components/picker/model/SimpleDate;Ljava/util/Calendar;)J

    .line 72
    .line 73
    .line 74
    move-result-wide v0

    .line 75
    aput-wide v0, v5, v2

    .line 76
    .line 77
    :cond_1
    return-object v5

    .line 78
    :pswitch_1
    move-object/from16 v1, p1

    .line 79
    .line 80
    check-cast v1, La/azg0;

    .line 81
    .line 82
    move-object/from16 v2, p2

    .line 83
    .line 84
    check-cast v2, Lorg/xplatform/uikit/compose/components/calendar/model/DateRangeModel;

    .line 85
    .line 86
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 87
    .line 88
    .line 89
    if-eqz v2, :cond_5

    .line 90
    .line 91
    iget-object v1, v2, Lorg/xplatform/uikit/compose/components/calendar/model/DateRangeModel;->b:Lorg/xplatform/uikit/compose/components/picker/model/SimpleDate;

    .line 92
    .line 93
    iget-object v2, v2, Lorg/xplatform/uikit/compose/components/calendar/model/DateRangeModel;->a:Lorg/xplatform/uikit/compose/components/picker/model/SimpleDate;

    .line 94
    .line 95
    if-nez v2, :cond_2

    .line 96
    .line 97
    if-nez v1, :cond_2

    .line 98
    .line 99
    goto :goto_1

    .line 100
    :cond_2
    if-eqz v2, :cond_3

    .line 101
    .line 102
    invoke-static {v2, v0}, La/wdx;->J(Lorg/xplatform/uikit/compose/components/picker/model/SimpleDate;Ljava/util/Calendar;)V

    .line 103
    .line 104
    .line 105
    invoke-virtual {v0}, Ljava/util/Calendar;->getTimeInMillis()J

    .line 106
    .line 107
    .line 108
    move-result-wide v2

    .line 109
    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 110
    .line 111
    .line 112
    move-result-object v2

    .line 113
    goto :goto_0

    .line 114
    :cond_3
    move-object v2, v5

    .line 115
    :goto_0
    if-eqz v1, :cond_4

    .line 116
    .line 117
    invoke-static {v1, v0}, La/wdx;->J(Lorg/xplatform/uikit/compose/components/picker/model/SimpleDate;Ljava/util/Calendar;)V

    .line 118
    .line 119
    .line 120
    invoke-virtual {v0}, Ljava/util/Calendar;->getTimeInMillis()J

    .line 121
    .line 122
    .line 123
    move-result-wide v0

    .line 124
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 125
    .line 126
    .line 127
    move-result-object v5

    .line 128
    :cond_4
    filled-new-array {v2, v5}, [Ljava/lang/Long;

    .line 129
    .line 130
    .line 131
    move-result-object v0

    .line 132
    invoke-static {v0}, La/q3d;->j([Ljava/lang/Object;)Ljava/util/List;

    .line 133
    .line 134
    .line 135
    move-result-object v0

    .line 136
    goto :goto_2

    .line 137
    :cond_5
    :goto_1
    filled-new-array {v5, v5}, [Ljava/lang/Void;

    .line 138
    .line 139
    .line 140
    move-result-object v0

    .line 141
    invoke-static {v0}, La/q3d;->j([Ljava/lang/Object;)Ljava/util/List;

    .line 142
    .line 143
    .line 144
    move-result-object v0

    .line 145
    :goto_2
    return-object v0

    .line 146
    :pswitch_2
    move-object/from16 v1, p1

    .line 147
    .line 148
    check-cast v1, La/azg0;

    .line 149
    .line 150
    move-object/from16 v2, p2

    .line 151
    .line 152
    check-cast v2, Lorg/xplatform/uikit/compose/components/picker/model/SimpleDate;

    .line 153
    .line 154
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 155
    .line 156
    .line 157
    if-eqz v2, :cond_6

    .line 158
    .line 159
    invoke-static {v2, v0}, La/wdx;->J(Lorg/xplatform/uikit/compose/components/picker/model/SimpleDate;Ljava/util/Calendar;)V

    .line 160
    .line 161
    .line 162
    invoke-virtual {v0}, Ljava/util/Calendar;->getTimeInMillis()J

    .line 163
    .line 164
    .line 165
    move-result-wide v0

    .line 166
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 167
    .line 168
    .line 169
    move-result-object v5

    .line 170
    :cond_6
    return-object v5

    .line 171
    :pswitch_3
    move-object/from16 v1, p1

    .line 172
    .line 173
    check-cast v1, La/oyg0;

    .line 174
    .line 175
    move-object/from16 v2, p2

    .line 176
    .line 177
    check-cast v2, La/g72;

    .line 178
    .line 179
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 180
    .line 181
    .line 182
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 183
    .line 184
    .line 185
    invoke-virtual {v0}, Ljava/util/Calendar;->getTime()Ljava/util/Date;

    .line 186
    .line 187
    .line 188
    move-result-object v4

    .line 189
    const-string v0, "KEY_CURRENT_DATE"

    .line 190
    .line 191
    invoke-static {v1, v4, v0}, La/q7x;->F(La/oyg0;Ljava/lang/Object;Ljava/lang/String;)V

    .line 192
    .line 193
    .line 194
    sget-object v12, La/xun;->a:La/xun;

    .line 195
    .line 196
    const-string v0, "KEY_SELECTED_IDS"

    .line 197
    .line 198
    invoke-static {v1, v12, v0}, La/q7x;->F(La/oyg0;Ljava/lang/Object;Ljava/lang/String;)V

    .line 199
    .line 200
    .line 201
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 202
    .line 203
    const-string v3, "KEY_SELECTION_ENABLE"

    .line 204
    .line 205
    invoke-static {v1, v0, v3}, La/q7x;->F(La/oyg0;Ljava/lang/Object;Ljava/lang/String;)V

    .line 206
    .line 207
    .line 208
    const/4 v14, 0x0

    .line 209
    const v15, 0x67ffd

    .line 210
    .line 211
    .line 212
    const/4 v3, 0x0

    .line 213
    const/4 v5, 0x0

    .line 214
    const/4 v6, 0x0

    .line 215
    const/4 v7, 0x0

    .line 216
    const/4 v8, 0x0

    .line 217
    const/4 v9, 0x0

    .line 218
    const/4 v10, 0x0

    .line 219
    const/4 v11, 0x0

    .line 220
    const/4 v13, 0x0

    .line 221
    invoke-static/range {v2 .. v15}, La/g72;->a(La/g72;Ljava/lang/String;Ljava/util/Date;ZLa/f72;ZZZZZLjava/util/Set;Ljava/util/List;Ljava/util/Set;I)La/g72;

    .line 222
    .line 223
    .line 224
    move-result-object v0

    .line 225
    return-object v0

    .line 226
    nop

    .line 227
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
