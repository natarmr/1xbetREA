.class public final synthetic La/gsw;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/jsw;


# direct methods
.method public synthetic constructor <init>(La/jsw;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/gsw;->a:B

    iput-object p1, p0, La/gsw;->b:La/jsw;

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
    iget-byte v1, v0, La/gsw;->a:B

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
    iget-object v0, v0, La/gsw;->b:La/jsw;

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
    iget-object v12, v0, La/jsw;->b:La/mdp0;

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
    new-instance v0, La/x2w;

    .line 77
    .line 78
    const/16 v1, 0x1c

    .line 79
    .line 80
    invoke-direct {v0, v1}, La/x2w;-><init>(B)V

    .line 81
    .line 82
    .line 83
    invoke-virtual {v14, v0}, La/fet;->o0(Ljava/lang/Object;)V

    .line 84
    .line 85
    .line 86
    :cond_3
    move-object v13, v0

    .line 87
    check-cast v13, Lkotlin/jvm/functions/Function2;

    .line 88
    .line 89
    const/16 v15, 0x180

    .line 90
    .line 91
    const/16 v16, 0x0

    .line 92
    .line 93
    invoke-static/range {v11 .. v16}, La/kcp0;->a(La/mm40;La/udp0;Lkotlin/jvm/functions/Function2;La/fet;II)V

    .line 94
    .line 95
    .line 96
    goto :goto_2

    .line 97
    :cond_4
    invoke-virtual {v14}, La/fet;->X()V

    .line 98
    .line 99
    .line 100
    :goto_2
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 101
    .line 102
    return-object v0

    .line 103
    :pswitch_0
    move-object/from16 v1, p1

    .line 104
    .line 105
    check-cast v1, La/fet;

    .line 106
    .line 107
    move-object/from16 v11, p2

    .line 108
    .line 109
    check-cast v11, Ljava/lang/Integer;

    .line 110
    .line 111
    invoke-virtual {v11}, Ljava/lang/Integer;->intValue()I

    .line 112
    .line 113
    .line 114
    move-result v11

    .line 115
    and-int/lit8 v12, v11, 0x3

    .line 116
    .line 117
    if-eq v12, v9, :cond_5

    .line 118
    .line 119
    move v8, v10

    .line 120
    :cond_5
    and-int/lit8 v9, v11, 0x1

    .line 121
    .line 122
    invoke-virtual {v1, v9, v8}, La/fet;->U(IZ)Z

    .line 123
    .line 124
    .line 125
    move-result v8

    .line 126
    if-eqz v8, :cond_9

    .line 127
    .line 128
    float-to-double v8, v7

    .line 129
    cmpl-double v5, v8, v5

    .line 130
    .line 131
    if-lez v5, :cond_6

    .line 132
    .line 133
    goto :goto_3

    .line 134
    :cond_6
    invoke-static {v4}, La/vcx;->a(Ljava/lang/String;)V

    .line 135
    .line 136
    .line 137
    :goto_3
    new-instance v4, La/x7z;

    .line 138
    .line 139
    cmpl-float v5, v7, v3

    .line 140
    .line 141
    if-lez v5, :cond_7

    .line 142
    .line 143
    goto :goto_4

    .line 144
    :cond_7
    move v3, v7

    .line 145
    :goto_4
    invoke-direct {v4, v3, v10}, La/x7z;-><init>(FZ)V

    .line 146
    .line 147
    .line 148
    iget-object v0, v0, La/jsw;->a:La/mdp0;

    .line 149
    .line 150
    invoke-virtual {v1}, La/fet;->P()Ljava/lang/Object;

    .line 151
    .line 152
    .line 153
    move-result-object v3

    .line 154
    if-ne v3, v2, :cond_8

    .line 155
    .line 156
    new-instance v3, La/x2w;

    .line 157
    .line 158
    const/16 v2, 0x1b

    .line 159
    .line 160
    invoke-direct {v3, v2}, La/x2w;-><init>(B)V

    .line 161
    .line 162
    .line 163
    invoke-virtual {v1, v3}, La/fet;->o0(Ljava/lang/Object;)V

    .line 164
    .line 165
    .line 166
    :cond_8
    check-cast v3, Lkotlin/jvm/functions/Function2;

    .line 167
    .line 168
    const/16 v5, 0x180

    .line 169
    .line 170
    const/4 v6, 0x0

    .line 171
    move-object v2, v4

    .line 172
    move-object v4, v1

    .line 173
    move-object v1, v2

    .line 174
    move-object v2, v0

    .line 175
    invoke-static/range {v1 .. v6}, La/kcp0;->a(La/mm40;La/udp0;Lkotlin/jvm/functions/Function2;La/fet;II)V

    .line 176
    .line 177
    .line 178
    goto :goto_5

    .line 179
    :cond_9
    move-object v4, v1

    .line 180
    invoke-virtual {v4}, La/fet;->X()V

    .line 181
    .line 182
    .line 183
    :goto_5
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 184
    .line 185
    return-object v0

    .line 186
    nop

    .line 187
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
