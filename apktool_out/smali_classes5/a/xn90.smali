.class public final synthetic La/xn90;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/xdr;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/l7m0;

.field public final synthetic c:La/ao90;


# direct methods
.method public synthetic constructor <init>(La/pz40;La/ao90;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/xn90;->a:B

    iput-object p1, p0, La/xn90;->b:La/l7m0;

    iput-object p2, p0, La/xn90;->c:La/ao90;

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
    iget-byte v1, v0, La/xn90;->a:B

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
    iget-object v6, v0, La/xn90;->c:La/ao90;

    .line 12
    .line 13
    iget-object v0, v0, La/xn90;->b:La/l7m0;

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
    sget-object v9, La/ao90;->o2:La/xi70;

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
    invoke-virtual {v6}, La/ao90;->P0()La/k3t0;

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
    new-instance v8, La/yi90;

    .line 71
    .line 72
    const/4 v14, 0x0

    .line 73
    const/4 v15, 0x4

    .line 74
    const/4 v9, 0x1

    .line 75
    const-class v11, La/k3t0;

    .line 76
    .line 77
    const-string v12, "onAction"

    .line 78
    .line 79
    const-string v13, "onAction(Ljava/lang/Object;)V"

    .line 80
    .line 81
    invoke-direct/range {v8 .. v15}, La/yi90;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 82
    .line 83
    .line 84
    invoke-virtual {v7, v8}, La/fet;->o0(Ljava/lang/Object;)V

    .line 85
    .line 86
    .line 87
    move-object v3, v8

    .line 88
    :cond_2
    check-cast v3, La/jhy;

    .line 89
    .line 90
    check-cast v3, Lkotlin/jvm/functions/Function1;

    .line 91
    .line 92
    invoke-static {v0, v3, v7, v5}, La/kc5;->s0(La/l7m0;Lkotlin/jvm/functions/Function1;La/fet;I)V

    .line 93
    .line 94
    .line 95
    goto :goto_1

    .line 96
    :cond_3
    invoke-virtual {v7}, La/fet;->X()V

    .line 97
    .line 98
    .line 99
    :goto_1
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 100
    .line 101
    return-object v0

    .line 102
    :pswitch_0
    move-object/from16 v1, p1

    .line 103
    .line 104
    check-cast v1, La/y5d;

    .line 105
    .line 106
    move-object/from16 v7, p2

    .line 107
    .line 108
    check-cast v7, La/fet;

    .line 109
    .line 110
    move-object/from16 v8, p3

    .line 111
    .line 112
    check-cast v8, Ljava/lang/Integer;

    .line 113
    .line 114
    invoke-virtual {v8}, Ljava/lang/Integer;->intValue()I

    .line 115
    .line 116
    .line 117
    move-result v8

    .line 118
    sget-object v9, La/ao90;->o2:La/xi70;

    .line 119
    .line 120
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 121
    .line 122
    .line 123
    and-int/lit8 v1, v8, 0x11

    .line 124
    .line 125
    if-eq v1, v3, :cond_4

    .line 126
    .line 127
    move v1, v4

    .line 128
    goto :goto_2

    .line 129
    :cond_4
    move v1, v5

    .line 130
    :goto_2
    and-int/lit8 v3, v8, 0x1

    .line 131
    .line 132
    invoke-virtual {v7, v3, v1}, La/fet;->U(IZ)Z

    .line 133
    .line 134
    .line 135
    move-result v1

    .line 136
    if-eqz v1, :cond_7

    .line 137
    .line 138
    invoke-virtual {v6}, La/ao90;->P0()La/k3t0;

    .line 139
    .line 140
    .line 141
    move-result-object v10

    .line 142
    invoke-virtual {v7, v10}, La/fet;->i(Ljava/lang/Object;)Z

    .line 143
    .line 144
    .line 145
    move-result v1

    .line 146
    invoke-virtual {v7}, La/fet;->P()Ljava/lang/Object;

    .line 147
    .line 148
    .line 149
    move-result-object v3

    .line 150
    if-nez v1, :cond_5

    .line 151
    .line 152
    if-ne v3, v2, :cond_6

    .line 153
    .line 154
    :cond_5
    new-instance v8, La/yi90;

    .line 155
    .line 156
    const/4 v14, 0x0

    .line 157
    const/4 v15, 0x3

    .line 158
    const/4 v9, 0x1

    .line 159
    const-class v11, La/k3t0;

    .line 160
    .line 161
    const-string v12, "onAction"

    .line 162
    .line 163
    const-string v13, "onAction(Ljava/lang/Object;)V"

    .line 164
    .line 165
    invoke-direct/range {v8 .. v15}, La/yi90;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 166
    .line 167
    .line 168
    invoke-virtual {v7, v8}, La/fet;->o0(Ljava/lang/Object;)V

    .line 169
    .line 170
    .line 171
    move-object v3, v8

    .line 172
    :cond_6
    check-cast v3, La/jhy;

    .line 173
    .line 174
    check-cast v3, Lkotlin/jvm/functions/Function1;

    .line 175
    .line 176
    invoke-static {v0, v3, v7, v5}, La/m8x;->r(La/l7m0;Lkotlin/jvm/functions/Function1;La/fet;I)V

    .line 177
    .line 178
    .line 179
    goto :goto_3

    .line 180
    :cond_7
    invoke-virtual {v7}, La/fet;->X()V

    .line 181
    .line 182
    .line 183
    :goto_3
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
