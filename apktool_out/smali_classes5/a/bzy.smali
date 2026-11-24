.class public final synthetic La/bzy;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/ezy;


# direct methods
.method public synthetic constructor <init>(La/ezy;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/bzy;->a:B

    iput-object p1, p0, La/bzy;->b:La/ezy;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/bzy;->a:B

    .line 4
    .line 5
    sget-object v2, La/ukd;->a:La/cl5;

    .line 6
    .line 7
    const v3, 0x7f7fffff    # Float.MAX_VALUE

    .line 8
    .line 9
    .line 10
    const-string v4, "invalid weight; must be greater than zero"

    .line 11
    .line 12
    const-wide/16 v5, 0x0

    .line 13
    .line 14
    const/high16 v7, 0x3f800000    # 1.0f

    .line 15
    .line 16
    const/4 v8, 0x0

    .line 17
    const/4 v9, 0x2

    .line 18
    const/4 v10, 0x1

    .line 19
    iget-object v0, v0, La/bzy;->b:La/ezy;

    .line 20
    .line 21
    packed-switch v1, :pswitch_data_0

    .line 22
    .line 23
    .line 24
    move-object/from16 v14, p1

    .line 25
    .line 26
    check-cast v14, La/fet;

    .line 27
    .line 28
    move-object/from16 v1, p2

    .line 29
    .line 30
    check-cast v1, Ljava/lang/Integer;

    .line 31
    .line 32
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 33
    .line 34
    .line 35
    move-result v1

    .line 36
    and-int/lit8 v11, v1, 0x3

    .line 37
    .line 38
    if-eq v11, v9, :cond_0

    .line 39
    .line 40
    move v8, v10

    .line 41
    :cond_0
    and-int/2addr v1, v10

    .line 42
    invoke-virtual {v14, v1, v8}, La/fet;->U(IZ)Z

    .line 43
    .line 44
    .line 45
    move-result v1

    .line 46
    if-eqz v1, :cond_4

    .line 47
    .line 48
    float-to-double v8, v7

    .line 49
    cmpl-double v1, v8, v5

    .line 50
    .line 51
    if-lez v1, :cond_1

    .line 52
    .line 53
    goto :goto_0

    .line 54
    :cond_1
    invoke-static {v4}, La/vcx;->a(Ljava/lang/String;)V

    .line 55
    .line 56
    .line 57
    :goto_0
    new-instance v11, La/x7z;

    .line 58
    .line 59
    cmpl-float v1, v7, v3

    .line 60
    .line 61
    if-lez v1, :cond_2

    .line 62
    .line 63
    goto :goto_1

    .line 64
    :cond_2
    move v3, v7

    .line 65
    :goto_1
    invoke-direct {v11, v3, v10}, La/x7z;-><init>(FZ)V

    .line 66
    .line 67
    .line 68
    iget-object v12, v0, La/ezy;->b:La/mdp0;

    .line 69
    .line 70
    invoke-virtual {v14}, La/fet;->P()Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    move-result-object v0

    .line 74
    if-ne v0, v2, :cond_3

    .line 75
    .line 76
    new-instance v0, La/hvy;

    .line 77
    .line 78
    const/4 v1, 0x6

    .line 79
    invoke-direct {v0, v1}, La/hvy;-><init>(B)V

    .line 80
    .line 81
    .line 82
    invoke-virtual {v14, v0}, La/fet;->o0(Ljava/lang/Object;)V

    .line 83
    .line 84
    .line 85
    :cond_3
    move-object v13, v0

    .line 86
    check-cast v13, Lkotlin/jvm/functions/Function2;

    .line 87
    .line 88
    const/16 v15, 0x180

    .line 89
    .line 90
    const/16 v16, 0x0

    .line 91
    .line 92
    invoke-static/range {v11 .. v16}, La/kcp0;->a(La/mm40;La/udp0;Lkotlin/jvm/functions/Function2;La/fet;II)V

    .line 93
    .line 94
    .line 95
    goto :goto_2

    .line 96
    :cond_4
    invoke-virtual {v14}, La/fet;->X()V

    .line 97
    .line 98
    .line 99
    :goto_2
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 100
    .line 101
    return-object v0

    .line 102
    :pswitch_0
    move-object/from16 v1, p1

    .line 103
    .line 104
    check-cast v1, La/fet;

    .line 105
    .line 106
    move-object/from16 v11, p2

    .line 107
    .line 108
    check-cast v11, Ljava/lang/Integer;

    .line 109
    .line 110
    invoke-virtual {v11}, Ljava/lang/Integer;->intValue()I

    .line 111
    .line 112
    .line 113
    move-result v11

    .line 114
    and-int/lit8 v12, v11, 0x3

    .line 115
    .line 116
    if-eq v12, v9, :cond_5

    .line 117
    .line 118
    move v8, v10

    .line 119
    :cond_5
    and-int/lit8 v9, v11, 0x1

    .line 120
    .line 121
    invoke-virtual {v1, v9, v8}, La/fet;->U(IZ)Z

    .line 122
    .line 123
    .line 124
    move-result v8

    .line 125
    if-eqz v8, :cond_9

    .line 126
    .line 127
    float-to-double v8, v7

    .line 128
    cmpl-double v5, v8, v5

    .line 129
    .line 130
    if-lez v5, :cond_6

    .line 131
    .line 132
    goto :goto_3

    .line 133
    :cond_6
    invoke-static {v4}, La/vcx;->a(Ljava/lang/String;)V

    .line 134
    .line 135
    .line 136
    :goto_3
    new-instance v4, La/x7z;

    .line 137
    .line 138
    cmpl-float v5, v7, v3

    .line 139
    .line 140
    if-lez v5, :cond_7

    .line 141
    .line 142
    goto :goto_4

    .line 143
    :cond_7
    move v3, v7

    .line 144
    :goto_4
    invoke-direct {v4, v3, v10}, La/x7z;-><init>(FZ)V

    .line 145
    .line 146
    .line 147
    iget-object v0, v0, La/ezy;->a:La/mdp0;

    .line 148
    .line 149
    invoke-virtual {v1}, La/fet;->P()Ljava/lang/Object;

    .line 150
    .line 151
    .line 152
    move-result-object v3

    .line 153
    if-ne v3, v2, :cond_8

    .line 154
    .line 155
    new-instance v3, La/hvy;

    .line 156
    .line 157
    const/4 v2, 0x5

    .line 158
    invoke-direct {v3, v2}, La/hvy;-><init>(B)V

    .line 159
    .line 160
    .line 161
    invoke-virtual {v1, v3}, La/fet;->o0(Ljava/lang/Object;)V

    .line 162
    .line 163
    .line 164
    :cond_8
    check-cast v3, Lkotlin/jvm/functions/Function2;

    .line 165
    .line 166
    const/16 v5, 0x180

    .line 167
    .line 168
    const/4 v6, 0x0

    .line 169
    move-object v2, v4

    .line 170
    move-object v4, v1

    .line 171
    move-object v1, v2

    .line 172
    move-object v2, v0

    .line 173
    invoke-static/range {v1 .. v6}, La/kcp0;->a(La/mm40;La/udp0;Lkotlin/jvm/functions/Function2;La/fet;II)V

    .line 174
    .line 175
    .line 176
    goto :goto_5

    .line 177
    :cond_9
    move-object v4, v1

    .line 178
    invoke-virtual {v4}, La/fet;->X()V

    .line 179
    .line 180
    .line 181
    :goto_5
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 182
    .line 183
    return-object v0

    .line 184
    nop

    .line 185
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
