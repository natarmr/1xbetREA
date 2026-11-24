.class public final synthetic La/iwg0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:D

.field public final synthetic c:D


# direct methods
.method public synthetic constructor <init>(DDB)V
    .locals 0

    .line 1
    iput-byte p5, p0, La/iwg0;->a:B

    iput-wide p1, p0, La/iwg0;->b:D

    iput-wide p3, p0, La/iwg0;->c:D

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 29

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/iwg0;->a:B

    .line 4
    .line 5
    packed-switch v1, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    move-object/from16 v1, p1

    .line 9
    .line 10
    check-cast v1, La/oyg0;

    .line 11
    .line 12
    move-object/from16 v2, p2

    .line 13
    .line 14
    check-cast v2, La/txu0;

    .line 15
    .line 16
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 20
    .line 21
    .line 22
    iget-boolean v1, v2, La/txu0;->h:Z

    .line 23
    .line 24
    if-eqz v1, :cond_0

    .line 25
    .line 26
    sget-object v1, La/gwu0;->b:La/gwu0;

    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_0
    sget-object v1, La/gwu0;->c:La/gwu0;

    .line 30
    .line 31
    :goto_0
    sget-object v3, La/hwu0;->b:La/hwu0;

    .line 32
    .line 33
    new-instance v6, La/fwu0;

    .line 34
    .line 35
    const/4 v4, 0x1

    .line 36
    invoke-direct {v6, v1, v3, v4}, La/fwu0;-><init>(La/gwu0;La/hwu0;Z)V

    .line 37
    .line 38
    .line 39
    iget-wide v3, v0, La/iwg0;->b:D

    .line 40
    .line 41
    iget-wide v0, v0, La/iwg0;->c:D

    .line 42
    .line 43
    cmpl-double v5, v3, v0

    .line 44
    .line 45
    if-ltz v5, :cond_1

    .line 46
    .line 47
    sget-object v0, La/cxu0;->a:La/cxu0;

    .line 48
    .line 49
    :goto_1
    move-object v7, v0

    .line 50
    goto :goto_2

    .line 51
    :cond_1
    cmpg-double v3, v3, v0

    .line 52
    .line 53
    if-gez v3, :cond_2

    .line 54
    .line 55
    new-instance v3, La/bxu0;

    .line 56
    .line 57
    iget-object v4, v2, La/txu0;->d:La/axu0;

    .line 58
    .line 59
    iget-object v4, v4, La/axu0;->c:Ljava/lang/String;

    .line 60
    .line 61
    invoke-direct {v3, v4, v0, v1}, La/bxu0;-><init>(Ljava/lang/String;D)V

    .line 62
    .line 63
    .line 64
    move-object v7, v3

    .line 65
    goto :goto_2

    .line 66
    :cond_2
    iget-object v0, v2, La/txu0;->f:La/dxu0;

    .line 67
    .line 68
    goto :goto_1

    .line 69
    :goto_2
    const-wide/16 v10, 0x0

    .line 70
    .line 71
    const/16 v12, 0x1cf

    .line 72
    .line 73
    const/4 v3, 0x0

    .line 74
    const/4 v4, 0x0

    .line 75
    const/4 v5, 0x0

    .line 76
    const/4 v8, 0x0

    .line 77
    const/4 v9, 0x0

    .line 78
    invoke-static/range {v2 .. v12}, La/txu0;->a(La/txu0;Ljava/lang/String;ZLa/axu0;La/fwu0;La/dxu0;ZZDI)La/txu0;

    .line 79
    .line 80
    .line 81
    move-result-object v0

    .line 82
    return-object v0

    .line 83
    :pswitch_0
    move-object/from16 v1, p1

    .line 84
    .line 85
    check-cast v1, La/oyg0;

    .line 86
    .line 87
    move-object/from16 v2, p2

    .line 88
    .line 89
    check-cast v2, La/svg0;

    .line 90
    .line 91
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 92
    .line 93
    .line 94
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 95
    .line 96
    .line 97
    iget-wide v10, v0, La/iwg0;->b:D

    .line 98
    .line 99
    invoke-static {v10, v11}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 100
    .line 101
    .line 102
    move-result-object v3

    .line 103
    const-string v4, "KEY_STAKE_VALUE"

    .line 104
    .line 105
    invoke-static {v1, v3, v4}, La/q7x;->F(La/oyg0;Ljava/lang/Object;Ljava/lang/String;)V

    .line 106
    .line 107
    .line 108
    iget-wide v12, v0, La/iwg0;->c:D

    .line 109
    .line 110
    invoke-static {v12, v13}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 111
    .line 112
    .line 113
    move-result-object v0

    .line 114
    const-string v3, "KEY_PAYMENT_VALUE"

    .line 115
    .line 116
    invoke-static {v1, v0, v3}, La/q7x;->F(La/oyg0;Ljava/lang/Object;Ljava/lang/String;)V

    .line 117
    .line 118
    .line 119
    const/16 v27, 0x0

    .line 120
    .line 121
    const v28, 0x7fff9f

    .line 122
    .line 123
    .line 124
    const/4 v3, 0x0

    .line 125
    const/4 v4, 0x0

    .line 126
    const/4 v5, 0x0

    .line 127
    const-wide/16 v6, 0x0

    .line 128
    .line 129
    const-wide/16 v8, 0x0

    .line 130
    .line 131
    const-wide/16 v14, 0x0

    .line 132
    .line 133
    const-wide/16 v16, 0x0

    .line 134
    .line 135
    const-wide/16 v18, 0x0

    .line 136
    .line 137
    const/16 v20, 0x0

    .line 138
    .line 139
    const/16 v21, 0x0

    .line 140
    .line 141
    const/16 v22, 0x0

    .line 142
    .line 143
    const/16 v23, 0x0

    .line 144
    .line 145
    const/16 v24, 0x0

    .line 146
    .line 147
    const/16 v25, 0x0

    .line 148
    .line 149
    const/16 v26, 0x0

    .line 150
    .line 151
    invoke-static/range {v2 .. v28}, La/svg0;->a(La/svg0;FFFDDDDDDDZZLa/xtg0;La/wvg0;La/ytg0;La/ql5;Ljava/util/List;Ljava/util/List;I)La/svg0;

    .line 152
    .line 153
    .line 154
    move-result-object v0

    .line 155
    return-object v0

    .line 156
    nop

    .line 157
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
