.class public final synthetic La/ofc;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/xdr;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/l7m0;

.field public final synthetic c:La/qfc;


# direct methods
.method public synthetic constructor <init>(La/pz40;La/qfc;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/ofc;->a:B

    iput-object p1, p0, La/ofc;->b:La/l7m0;

    iput-object p2, p0, La/ofc;->c:La/qfc;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final F(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 16

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/ofc;->a:B

    .line 4
    .line 5
    sget-object v2, La/ukd;->a:La/cl5;

    .line 6
    .line 7
    const/16 v3, 0x10

    .line 8
    .line 9
    const/4 v4, 0x1

    .line 10
    const/4 v5, 0x0

    .line 11
    iget-object v6, v0, La/ofc;->c:La/qfc;

    .line 12
    .line 13
    iget-object v0, v0, La/ofc;->b:La/l7m0;

    .line 14
    .line 15
    packed-switch v1, :pswitch_data_0

    .line 16
    .line 17
    .line 18
    move-object/from16 v1, p1

    .line 19
    .line 20
    check-cast v1, La/y5d;

    .line 21
    .line 22
    move-object/from16 v7, p2

    .line 23
    .line 24
    check-cast v7, La/fet;

    .line 25
    .line 26
    move-object/from16 v8, p3

    .line 27
    .line 28
    check-cast v8, Ljava/lang/Integer;

    .line 29
    .line 30
    invoke-virtual {v8}, Ljava/lang/Integer;->intValue()I

    .line 31
    .line 32
    .line 33
    move-result v8

    .line 34
    sget v9, La/qfc;->m2:I

    .line 35
    .line 36
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 37
    .line 38
    .line 39
    and-int/lit8 v1, v8, 0x11

    .line 40
    .line 41
    if-eq v1, v3, :cond_0

    .line 42
    .line 43
    move v1, v4

    .line 44
    goto :goto_0

    .line 45
    :cond_0
    move v1, v5

    .line 46
    :goto_0
    and-int/lit8 v3, v8, 0x1

    .line 47
    .line 48
    invoke-virtual {v7, v3, v1}, La/fet;->U(IZ)Z

    .line 49
    .line 50
    .line 51
    move-result v1

    .line 52
    if-eqz v1, :cond_3

    .line 53
    .line 54
    invoke-virtual {v6}, La/qfc;->P0()La/k3t0;

    .line 55
    .line 56
    .line 57
    move-result-object v10

    .line 58
    invoke-virtual {v7, v10}, La/fet;->i(Ljava/lang/Object;)Z

    .line 59
    .line 60
    .line 61
    move-result v1

    .line 62
    invoke-virtual {v7}, La/fet;->P()Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    move-result-object v3

    .line 66
    if-nez v1, :cond_1

    .line 67
    .line 68
    if-ne v3, v2, :cond_2

    .line 69
    .line 70
    :cond_1
    new-instance v8, La/zhb;

    .line 71
    .line 72
    const/4 v14, 0x0

    .line 73
    const/16 v15, 0x16

    .line 74
    .line 75
    const/4 v9, 0x1

    .line 76
    const-class v11, La/k3t0;

    .line 77
    .line 78
    const-string v12, "onAction"

    .line 79
    .line 80
    const-string v13, "onAction(Ljava/lang/Object;)V"

    .line 81
    .line 82
    invoke-direct/range {v8 .. v15}, La/zhb;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 83
    .line 84
    .line 85
    invoke-virtual {v7, v8}, La/fet;->o0(Ljava/lang/Object;)V

    .line 86
    .line 87
    .line 88
    move-object v3, v8

    .line 89
    :cond_2
    check-cast v3, La/jhy;

    .line 90
    .line 91
    check-cast v3, Lkotlin/jvm/functions/Function1;

    .line 92
    .line 93
    invoke-static {v0, v3, v7, v5}, La/lv00;->q(La/l7m0;Lkotlin/jvm/functions/Function1;La/fet;I)V

    .line 94
    .line 95
    .line 96
    goto :goto_1

    .line 97
    :cond_3
    invoke-virtual {v7}, La/fet;->X()V

    .line 98
    .line 99
    .line 100
    :goto_1
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 101
    .line 102
    return-object v0

    .line 103
    :pswitch_0
    move-object/from16 v1, p1

    .line 104
    .line 105
    check-cast v1, La/y5d;

    .line 106
    .line 107
    move-object/from16 v7, p2

    .line 108
    .line 109
    check-cast v7, La/fet;

    .line 110
    .line 111
    move-object/from16 v8, p3

    .line 112
    .line 113
    check-cast v8, Ljava/lang/Integer;

    .line 114
    .line 115
    invoke-virtual {v8}, Ljava/lang/Integer;->intValue()I

    .line 116
    .line 117
    .line 118
    move-result v8

    .line 119
    sget v9, La/qfc;->m2:I

    .line 120
    .line 121
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 122
    .line 123
    .line 124
    and-int/lit8 v1, v8, 0x11

    .line 125
    .line 126
    if-eq v1, v3, :cond_4

    .line 127
    .line 128
    move v1, v4

    .line 129
    goto :goto_2

    .line 130
    :cond_4
    move v1, v5

    .line 131
    :goto_2
    and-int/lit8 v3, v8, 0x1

    .line 132
    .line 133
    invoke-virtual {v7, v3, v1}, La/fet;->U(IZ)Z

    .line 134
    .line 135
    .line 136
    move-result v1

    .line 137
    if-eqz v1, :cond_7

    .line 138
    .line 139
    invoke-virtual {v6}, La/qfc;->P0()La/k3t0;

    .line 140
    .line 141
    .line 142
    move-result-object v10

    .line 143
    invoke-virtual {v7, v10}, La/fet;->i(Ljava/lang/Object;)Z

    .line 144
    .line 145
    .line 146
    move-result v1

    .line 147
    invoke-virtual {v7}, La/fet;->P()Ljava/lang/Object;

    .line 148
    .line 149
    .line 150
    move-result-object v3

    .line 151
    if-nez v1, :cond_5

    .line 152
    .line 153
    if-ne v3, v2, :cond_6

    .line 154
    .line 155
    :cond_5
    new-instance v8, La/zhb;

    .line 156
    .line 157
    const/4 v14, 0x0

    .line 158
    const/16 v15, 0x15

    .line 159
    .line 160
    const/4 v9, 0x1

    .line 161
    const-class v11, La/k3t0;

    .line 162
    .line 163
    const-string v12, "onAction"

    .line 164
    .line 165
    const-string v13, "onAction(Ljava/lang/Object;)V"

    .line 166
    .line 167
    invoke-direct/range {v8 .. v15}, La/zhb;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 168
    .line 169
    .line 170
    invoke-virtual {v7, v8}, La/fet;->o0(Ljava/lang/Object;)V

    .line 171
    .line 172
    .line 173
    move-object v3, v8

    .line 174
    :cond_6
    check-cast v3, La/jhy;

    .line 175
    .line 176
    check-cast v3, Lkotlin/jvm/functions/Function1;

    .line 177
    .line 178
    invoke-static {v0, v3, v7, v5}, La/vfc;->d(La/l7m0;Lkotlin/jvm/functions/Function1;La/fet;I)V

    .line 179
    .line 180
    .line 181
    goto :goto_3

    .line 182
    :cond_7
    invoke-virtual {v7}, La/fet;->X()V

    .line 183
    .line 184
    .line 185
    :goto_3
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 186
    .line 187
    return-object v0

    .line 188
    nop

    .line 189
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
