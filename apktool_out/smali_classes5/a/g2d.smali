.class public final synthetic La/g2d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/xdr;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/f3d;

.field public final synthetic c:Lkotlin/jvm/functions/Function0;


# direct methods
.method public synthetic constructor <init>(La/f3d;Lkotlin/jvm/functions/Function0;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/g2d;->a:B

    iput-object p1, p0, La/g2d;->b:La/f3d;

    iput-object p2, p0, La/g2d;->c:Lkotlin/jvm/functions/Function0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final F(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 19

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/g2d;->a:B

    .line 4
    .line 5
    sget-object v2, La/ukd;->a:La/cl5;

    .line 6
    .line 7
    const/4 v3, 0x0

    .line 8
    const/16 v4, 0x10

    .line 9
    .line 10
    const/4 v5, 0x1

    .line 11
    iget-object v6, v0, La/g2d;->b:La/f3d;

    .line 12
    .line 13
    packed-switch v1, :pswitch_data_0

    .line 14
    .line 15
    .line 16
    move-object/from16 v1, p1

    .line 17
    .line 18
    check-cast v1, La/yhg0;

    .line 19
    .line 20
    move-object/from16 v7, p2

    .line 21
    .line 22
    check-cast v7, La/fet;

    .line 23
    .line 24
    move-object/from16 v8, p3

    .line 25
    .line 26
    check-cast v8, Ljava/lang/Integer;

    .line 27
    .line 28
    invoke-virtual {v8}, Ljava/lang/Integer;->intValue()I

    .line 29
    .line 30
    .line 31
    move-result v8

    .line 32
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 33
    .line 34
    .line 35
    and-int/lit8 v1, v8, 0x11

    .line 36
    .line 37
    if-eq v1, v4, :cond_0

    .line 38
    .line 39
    move v3, v5

    .line 40
    :cond_0
    and-int/lit8 v1, v8, 0x1

    .line 41
    .line 42
    invoke-virtual {v7, v1, v3}, La/fet;->U(IZ)Z

    .line 43
    .line 44
    .line 45
    move-result v1

    .line 46
    if-eqz v1, :cond_3

    .line 47
    .line 48
    invoke-virtual {v7, v6}, La/fet;->g(Ljava/lang/Object;)Z

    .line 49
    .line 50
    .line 51
    move-result v1

    .line 52
    invoke-virtual {v7}, La/fet;->P()Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object v3

    .line 56
    if-nez v1, :cond_1

    .line 57
    .line 58
    if-ne v3, v2, :cond_2

    .line 59
    .line 60
    :cond_1
    new-instance v3, La/s82;

    .line 61
    .line 62
    const/4 v1, 0x2

    .line 63
    invoke-direct {v3, v6, v1}, La/s82;-><init>(La/f3d;B)V

    .line 64
    .line 65
    .line 66
    invoke-virtual {v7, v3}, La/fet;->o0(Ljava/lang/Object;)V

    .line 67
    .line 68
    .line 69
    :cond_2
    move-object v14, v3

    .line 70
    check-cast v14, Lkotlin/jvm/functions/Function0;

    .line 71
    .line 72
    sget-object v16, La/y860;->b:La/ugd;

    .line 73
    .line 74
    const v18, 0x180006

    .line 75
    .line 76
    .line 77
    move-object/from16 v17, v7

    .line 78
    .line 79
    sget-object v7, La/jm40;->b:La/jm40;

    .line 80
    .line 81
    const-wide/16 v8, 0x0

    .line 82
    .line 83
    const-wide/16 v10, 0x0

    .line 84
    .line 85
    const-wide/16 v12, 0x0

    .line 86
    .line 87
    iget-object v15, v0, La/g2d;->c:Lkotlin/jvm/functions/Function0;

    .line 88
    .line 89
    invoke-static/range {v7 .. v18}, La/ozb;->h(La/mm40;JJJLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;La/ugd;La/fet;I)V

    .line 90
    .line 91
    .line 92
    goto :goto_0

    .line 93
    :cond_3
    move-object/from16 v17, v7

    .line 94
    .line 95
    invoke-virtual/range {v17 .. v17}, La/fet;->X()V

    .line 96
    .line 97
    .line 98
    :goto_0
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 99
    .line 100
    return-object v0

    .line 101
    :pswitch_0
    move-object/from16 v1, p1

    .line 102
    .line 103
    check-cast v1, La/yhg0;

    .line 104
    .line 105
    move-object/from16 v7, p2

    .line 106
    .line 107
    check-cast v7, La/fet;

    .line 108
    .line 109
    move-object/from16 v8, p3

    .line 110
    .line 111
    check-cast v8, Ljava/lang/Integer;

    .line 112
    .line 113
    invoke-virtual {v8}, Ljava/lang/Integer;->intValue()I

    .line 114
    .line 115
    .line 116
    move-result v8

    .line 117
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 118
    .line 119
    .line 120
    and-int/lit8 v1, v8, 0x11

    .line 121
    .line 122
    if-eq v1, v4, :cond_4

    .line 123
    .line 124
    move v3, v5

    .line 125
    :cond_4
    and-int/lit8 v1, v8, 0x1

    .line 126
    .line 127
    invoke-virtual {v7, v1, v3}, La/fet;->U(IZ)Z

    .line 128
    .line 129
    .line 130
    move-result v1

    .line 131
    if-eqz v1, :cond_7

    .line 132
    .line 133
    invoke-virtual {v7, v6}, La/fet;->g(Ljava/lang/Object;)Z

    .line 134
    .line 135
    .line 136
    move-result v1

    .line 137
    invoke-virtual {v7}, La/fet;->P()Ljava/lang/Object;

    .line 138
    .line 139
    .line 140
    move-result-object v3

    .line 141
    if-nez v1, :cond_5

    .line 142
    .line 143
    if-ne v3, v2, :cond_6

    .line 144
    .line 145
    :cond_5
    new-instance v3, La/s82;

    .line 146
    .line 147
    const/4 v1, 0x3

    .line 148
    invoke-direct {v3, v6, v1}, La/s82;-><init>(La/f3d;B)V

    .line 149
    .line 150
    .line 151
    invoke-virtual {v7, v3}, La/fet;->o0(Ljava/lang/Object;)V

    .line 152
    .line 153
    .line 154
    :cond_6
    move-object v14, v3

    .line 155
    check-cast v14, Lkotlin/jvm/functions/Function0;

    .line 156
    .line 157
    sget-object v16, La/y860;->a:La/ugd;

    .line 158
    .line 159
    const v18, 0x180006

    .line 160
    .line 161
    .line 162
    move-object/from16 v17, v7

    .line 163
    .line 164
    sget-object v7, La/jm40;->b:La/jm40;

    .line 165
    .line 166
    const-wide/16 v8, 0x0

    .line 167
    .line 168
    const-wide/16 v10, 0x0

    .line 169
    .line 170
    const-wide/16 v12, 0x0

    .line 171
    .line 172
    iget-object v15, v0, La/g2d;->c:Lkotlin/jvm/functions/Function0;

    .line 173
    .line 174
    invoke-static/range {v7 .. v18}, La/ozb;->h(La/mm40;JJJLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;La/ugd;La/fet;I)V

    .line 175
    .line 176
    .line 177
    goto :goto_1

    .line 178
    :cond_7
    move-object/from16 v17, v7

    .line 179
    .line 180
    invoke-virtual/range {v17 .. v17}, La/fet;->X()V

    .line 181
    .line 182
    .line 183
    :goto_1
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
