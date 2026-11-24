.class public final synthetic La/g52;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:Lorg/xplatform/uikit/compose/components/picker/model/SimpleDate;

.field public final synthetic c:Ljava/util/Calendar;

.field public final synthetic d:Lorg/xplatform/uikit/compose/components/picker/model/SimpleDate;


# direct methods
.method public synthetic constructor <init>(Lorg/xplatform/uikit/compose/components/picker/model/SimpleDate;Ljava/util/Calendar;Lorg/xplatform/uikit/compose/components/picker/model/SimpleDate;B)V
    .locals 0

    .line 1
    iput-byte p4, p0, La/g52;->a:B

    iput-object p1, p0, La/g52;->b:Lorg/xplatform/uikit/compose/components/picker/model/SimpleDate;

    iput-object p2, p0, La/g52;->c:Ljava/util/Calendar;

    iput-object p3, p0, La/g52;->d:Lorg/xplatform/uikit/compose/components/picker/model/SimpleDate;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 38

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/g52;->a:B

    .line 4
    .line 5
    const-wide/16 v2, 0x0

    .line 6
    .line 7
    const-wide/16 v4, 0x3e8

    .line 8
    .line 9
    iget-object v6, v0, La/g52;->d:Lorg/xplatform/uikit/compose/components/picker/model/SimpleDate;

    .line 10
    .line 11
    iget-object v7, v0, La/g52;->c:Ljava/util/Calendar;

    .line 12
    .line 13
    iget-object v0, v0, La/g52;->b:Lorg/xplatform/uikit/compose/components/picker/model/SimpleDate;

    .line 14
    .line 15
    packed-switch v1, :pswitch_data_0

    .line 16
    .line 17
    .line 18
    move-object/from16 v1, p1

    .line 19
    .line 20
    check-cast v1, La/oyg0;

    .line 21
    .line 22
    move-object/from16 v8, p2

    .line 23
    .line 24
    check-cast v8, La/i77;

    .line 25
    .line 26
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 27
    .line 28
    .line 29
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 30
    .line 31
    .line 32
    new-instance v1, La/vdj;

    .line 33
    .line 34
    if-eqz v0, :cond_0

    .line 35
    .line 36
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 37
    .line 38
    .line 39
    invoke-static {v0, v7}, La/wdx;->J(Lorg/xplatform/uikit/compose/components/picker/model/SimpleDate;Ljava/util/Calendar;)V

    .line 40
    .line 41
    .line 42
    invoke-virtual {v7}, Ljava/util/Calendar;->getTimeInMillis()J

    .line 43
    .line 44
    .line 45
    move-result-wide v9

    .line 46
    goto :goto_0

    .line 47
    :cond_0
    move-wide v9, v2

    .line 48
    :goto_0
    div-long/2addr v9, v4

    .line 49
    if-eqz v6, :cond_1

    .line 50
    .line 51
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 52
    .line 53
    .line 54
    invoke-static {v6, v7}, La/wdx;->J(Lorg/xplatform/uikit/compose/components/picker/model/SimpleDate;Ljava/util/Calendar;)V

    .line 55
    .line 56
    .line 57
    invoke-virtual {v7}, Ljava/util/Calendar;->getTimeInMillis()J

    .line 58
    .line 59
    .line 60
    move-result-wide v2

    .line 61
    :cond_1
    div-long/2addr v2, v4

    .line 62
    invoke-direct {v1, v9, v10, v2, v3}, La/vdj;-><init>(JJ)V

    .line 63
    .line 64
    .line 65
    const v36, -0x1000802

    .line 66
    .line 67
    .line 68
    const/16 v37, 0x7ff

    .line 69
    .line 70
    const/4 v9, 0x1

    .line 71
    const/4 v10, 0x0

    .line 72
    const/4 v11, 0x0

    .line 73
    const/4 v12, 0x0

    .line 74
    const/4 v13, 0x0

    .line 75
    const/4 v14, 0x0

    .line 76
    const/4 v15, 0x0

    .line 77
    const/16 v16, 0x0

    .line 78
    .line 79
    const/16 v18, 0x0

    .line 80
    .line 81
    const/16 v19, 0x0

    .line 82
    .line 83
    const/16 v20, 0x0

    .line 84
    .line 85
    const/16 v21, 0x0

    .line 86
    .line 87
    const/16 v22, 0x0

    .line 88
    .line 89
    const/16 v23, 0x0

    .line 90
    .line 91
    const/16 v24, 0x0

    .line 92
    .line 93
    const/16 v25, 0x0

    .line 94
    .line 95
    const/16 v26, 0x0

    .line 96
    .line 97
    const/16 v27, 0x0

    .line 98
    .line 99
    const/16 v28, 0x1

    .line 100
    .line 101
    const/16 v29, 0x0

    .line 102
    .line 103
    const/16 v30, 0x0

    .line 104
    .line 105
    const/16 v31, 0x0

    .line 106
    .line 107
    const/16 v32, 0x0

    .line 108
    .line 109
    const/16 v33, 0x0

    .line 110
    .line 111
    const/16 v34, 0x0

    .line 112
    .line 113
    const/16 v35, 0x0

    .line 114
    .line 115
    move-object/from16 v17, v1

    .line 116
    .line 117
    invoke-static/range {v8 .. v37}, La/i77;->a(La/i77;ZZZLa/ql5;Ljava/lang/String;La/ov7;Lorg/xplatform/bet_history/history/domain/model/HistoryTypeModel;ZLa/wdj;Ljava/util/List;ZZZLjava/util/Map;Ljava/util/List;La/dyv;La/qgv0;ZLjava/util/List;ZZZLjava/util/List;Ljava/util/List;Ljava/util/HashMap;Ljava/util/List;Ljava/util/LinkedHashMap;II)La/i77;

    .line 118
    .line 119
    .line 120
    move-result-object v0

    .line 121
    return-object v0

    .line 122
    :pswitch_0
    move-object/from16 v1, p1

    .line 123
    .line 124
    check-cast v1, La/oyg0;

    .line 125
    .line 126
    move-object/from16 v8, p2

    .line 127
    .line 128
    check-cast v8, La/c52;

    .line 129
    .line 130
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 131
    .line 132
    .line 133
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 134
    .line 135
    .line 136
    new-instance v1, La/vdj;

    .line 137
    .line 138
    if-eqz v0, :cond_2

    .line 139
    .line 140
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 141
    .line 142
    .line 143
    invoke-static {v0, v7}, La/wdx;->J(Lorg/xplatform/uikit/compose/components/picker/model/SimpleDate;Ljava/util/Calendar;)V

    .line 144
    .line 145
    .line 146
    invoke-virtual {v7}, Ljava/util/Calendar;->getTimeInMillis()J

    .line 147
    .line 148
    .line 149
    move-result-wide v9

    .line 150
    goto :goto_1

    .line 151
    :cond_2
    move-wide v9, v2

    .line 152
    :goto_1
    div-long/2addr v9, v4

    .line 153
    if-eqz v6, :cond_3

    .line 154
    .line 155
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 156
    .line 157
    .line 158
    invoke-static {v6, v7}, La/wdx;->J(Lorg/xplatform/uikit/compose/components/picker/model/SimpleDate;Ljava/util/Calendar;)V

    .line 159
    .line 160
    .line 161
    invoke-virtual {v7}, Ljava/util/Calendar;->getTimeInMillis()J

    .line 162
    .line 163
    .line 164
    move-result-wide v2

    .line 165
    :cond_3
    div-long/2addr v2, v4

    .line 166
    invoke-direct {v1, v9, v10, v2, v3}, La/vdj;-><init>(JJ)V

    .line 167
    .line 168
    .line 169
    const/16 v0, 0xfef

    .line 170
    .line 171
    const/4 v2, 0x0

    .line 172
    invoke-static {v8, v2, v2, v1, v0}, La/c52;->a(La/c52;Ljava/util/List;Ljava/util/List;La/wdj;I)La/c52;

    .line 173
    .line 174
    .line 175
    move-result-object v0

    .line 176
    return-object v0

    .line 177
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
