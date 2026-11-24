.class public final synthetic La/nwk0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/xdr;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:F

.field public final synthetic c:Lkotlin/jvm/functions/Function0;


# direct methods
.method public synthetic constructor <init>(FLkotlin/jvm/functions/Function0;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/nwk0;->a:B

    iput p1, p0, La/nwk0;->b:F

    iput-object p2, p0, La/nwk0;->c:Lkotlin/jvm/functions/Function0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final F(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 20

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/nwk0;->a:B

    .line 4
    .line 5
    const/16 v2, 0xa

    .line 6
    .line 7
    sget-object v3, La/ukd;->a:La/cl5;

    .line 8
    .line 9
    const/4 v4, 0x0

    .line 10
    const/16 v5, 0x10

    .line 11
    .line 12
    const/4 v6, 0x1

    .line 13
    iget v7, v0, La/nwk0;->b:F

    .line 14
    .line 15
    packed-switch v1, :pswitch_data_0

    .line 16
    .line 17
    .line 18
    move-object/from16 v1, p1

    .line 19
    .line 20
    check-cast v1, La/yhg0;

    .line 21
    .line 22
    move-object/from16 v8, p2

    .line 23
    .line 24
    check-cast v8, La/fet;

    .line 25
    .line 26
    move-object/from16 v9, p3

    .line 27
    .line 28
    check-cast v9, Ljava/lang/Integer;

    .line 29
    .line 30
    invoke-virtual {v9}, Ljava/lang/Integer;->intValue()I

    .line 31
    .line 32
    .line 33
    move-result v9

    .line 34
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 35
    .line 36
    .line 37
    and-int/lit8 v1, v9, 0x11

    .line 38
    .line 39
    if-eq v1, v5, :cond_0

    .line 40
    .line 41
    move v4, v6

    .line 42
    :cond_0
    and-int/lit8 v1, v9, 0x1

    .line 43
    .line 44
    invoke-virtual {v8, v1, v4}, La/fet;->U(IZ)Z

    .line 45
    .line 46
    .line 47
    move-result v1

    .line 48
    if-eqz v1, :cond_3

    .line 49
    .line 50
    invoke-virtual {v8, v7}, La/fet;->d(F)Z

    .line 51
    .line 52
    .line 53
    move-result v1

    .line 54
    invoke-virtual {v8}, La/fet;->P()Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move-result-object v4

    .line 58
    if-nez v1, :cond_1

    .line 59
    .line 60
    if-ne v4, v3, :cond_2

    .line 61
    .line 62
    :cond_1
    new-instance v4, La/rt2;

    .line 63
    .line 64
    invoke-direct {v4, v7, v2}, La/rt2;-><init>(FB)V

    .line 65
    .line 66
    .line 67
    invoke-virtual {v8, v4}, La/fet;->o0(Ljava/lang/Object;)V

    .line 68
    .line 69
    .line 70
    :cond_2
    move-object v15, v4

    .line 71
    check-cast v15, Lkotlin/jvm/functions/Function0;

    .line 72
    .line 73
    sget-object v17, La/o2e;->e:La/ugd;

    .line 74
    .line 75
    const v19, 0x180006

    .line 76
    .line 77
    .line 78
    move-object/from16 v18, v8

    .line 79
    .line 80
    sget-object v8, La/jm40;->b:La/jm40;

    .line 81
    .line 82
    const-wide/16 v9, 0x0

    .line 83
    .line 84
    const-wide/16 v11, 0x0

    .line 85
    .line 86
    const-wide/16 v13, 0x0

    .line 87
    .line 88
    iget-object v0, v0, La/nwk0;->c:Lkotlin/jvm/functions/Function0;

    .line 89
    .line 90
    move-object/from16 v16, v0

    .line 91
    .line 92
    invoke-static/range {v8 .. v19}, La/ozb;->h(La/mm40;JJJLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;La/ugd;La/fet;I)V

    .line 93
    .line 94
    .line 95
    goto :goto_0

    .line 96
    :cond_3
    move-object/from16 v18, v8

    .line 97
    .line 98
    invoke-virtual/range {v18 .. v18}, La/fet;->X()V

    .line 99
    .line 100
    .line 101
    :goto_0
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 102
    .line 103
    return-object v0

    .line 104
    :pswitch_0
    move-object/from16 v1, p1

    .line 105
    .line 106
    check-cast v1, La/yhg0;

    .line 107
    .line 108
    move-object/from16 v8, p2

    .line 109
    .line 110
    check-cast v8, La/fet;

    .line 111
    .line 112
    move-object/from16 v9, p3

    .line 113
    .line 114
    check-cast v9, Ljava/lang/Integer;

    .line 115
    .line 116
    invoke-virtual {v9}, Ljava/lang/Integer;->intValue()I

    .line 117
    .line 118
    .line 119
    move-result v9

    .line 120
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 121
    .line 122
    .line 123
    and-int/lit8 v1, v9, 0x11

    .line 124
    .line 125
    if-eq v1, v5, :cond_4

    .line 126
    .line 127
    move v4, v6

    .line 128
    :cond_4
    and-int/lit8 v1, v9, 0x1

    .line 129
    .line 130
    invoke-virtual {v8, v1, v4}, La/fet;->U(IZ)Z

    .line 131
    .line 132
    .line 133
    move-result v1

    .line 134
    if-eqz v1, :cond_7

    .line 135
    .line 136
    invoke-virtual {v8, v7}, La/fet;->d(F)Z

    .line 137
    .line 138
    .line 139
    move-result v1

    .line 140
    invoke-virtual {v8}, La/fet;->P()Ljava/lang/Object;

    .line 141
    .line 142
    .line 143
    move-result-object v4

    .line 144
    if-nez v1, :cond_5

    .line 145
    .line 146
    if-ne v4, v3, :cond_6

    .line 147
    .line 148
    :cond_5
    new-instance v4, La/rt2;

    .line 149
    .line 150
    invoke-direct {v4, v7, v2}, La/rt2;-><init>(FB)V

    .line 151
    .line 152
    .line 153
    invoke-virtual {v8, v4}, La/fet;->o0(Ljava/lang/Object;)V

    .line 154
    .line 155
    .line 156
    :cond_6
    move-object v15, v4

    .line 157
    check-cast v15, Lkotlin/jvm/functions/Function0;

    .line 158
    .line 159
    sget-object v17, La/o2e;->d:La/ugd;

    .line 160
    .line 161
    const v19, 0x180006

    .line 162
    .line 163
    .line 164
    move-object/from16 v18, v8

    .line 165
    .line 166
    sget-object v8, La/jm40;->b:La/jm40;

    .line 167
    .line 168
    const-wide/16 v9, 0x0

    .line 169
    .line 170
    const-wide/16 v11, 0x0

    .line 171
    .line 172
    const-wide/16 v13, 0x0

    .line 173
    .line 174
    iget-object v0, v0, La/nwk0;->c:Lkotlin/jvm/functions/Function0;

    .line 175
    .line 176
    move-object/from16 v16, v0

    .line 177
    .line 178
    invoke-static/range {v8 .. v19}, La/ozb;->h(La/mm40;JJJLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;La/ugd;La/fet;I)V

    .line 179
    .line 180
    .line 181
    goto :goto_1

    .line 182
    :cond_7
    move-object/from16 v18, v8

    .line 183
    .line 184
    invoke-virtual/range {v18 .. v18}, La/fet;->X()V

    .line 185
    .line 186
    .line 187
    :goto_1
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 188
    .line 189
    return-object v0

    .line 190
    nop

    .line 191
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
