.class public final synthetic La/hc1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/kc1;

.field public final synthetic c:La/f02;


# direct methods
.method public synthetic constructor <init>(La/f02;La/kc1;)V
    .locals 1

    .line 2
    const/4 v0, 0x0

    iput-byte v0, p0, La/hc1;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/hc1;->c:La/f02;

    iput-object p2, p0, La/hc1;->b:La/kc1;

    return-void
.end method

.method public synthetic constructor <init>(La/kc1;La/f02;)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    iput-byte v0, p0, La/hc1;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/hc1;->b:La/kc1;

    iput-object p2, p0, La/hc1;->c:La/f02;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 16

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/hc1;->a:B

    .line 4
    .line 5
    iget-object v2, v0, La/hc1;->c:La/f02;

    .line 6
    .line 7
    iget-object v0, v0, La/hc1;->b:La/kc1;

    .line 8
    .line 9
    packed-switch v1, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    move-object/from16 v1, p1

    .line 13
    .line 14
    check-cast v1, La/k0w0;

    .line 15
    .line 16
    new-instance v3, Lorg/xplatform/aggregator/game/impl/game/navigation/AggregatorGameScreens$AggregatorMultiModeGameFragmentScreen;

    .line 17
    .line 18
    invoke-virtual {v0}, La/i3t0;->D()Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object v4

    .line 22
    check-cast v4, La/xb1;

    .line 23
    .line 24
    iget-object v4, v4, La/xb1;->a:La/db1;

    .line 25
    .line 26
    iget-wide v4, v4, La/db1;->a:J

    .line 27
    .line 28
    invoke-virtual {v0}, La/i3t0;->D()Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object v6

    .line 32
    check-cast v6, La/xb1;

    .line 33
    .line 34
    iget-object v6, v6, La/xb1;->a:La/db1;

    .line 35
    .line 36
    iget-boolean v6, v6, La/db1;->g:Z

    .line 37
    .line 38
    invoke-virtual {v0}, La/i3t0;->D()Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object v7

    .line 42
    check-cast v7, La/xb1;

    .line 43
    .line 44
    iget-object v7, v7, La/xb1;->a:La/db1;

    .line 45
    .line 46
    iget-boolean v7, v7, La/db1;->i:Z

    .line 47
    .line 48
    invoke-virtual {v0}, La/i3t0;->D()Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    move-result-object v8

    .line 52
    check-cast v8, La/xb1;

    .line 53
    .line 54
    iget-boolean v8, v8, La/xb1;->c:Z

    .line 55
    .line 56
    iget-object v9, v2, La/f02;->b:Ljava/lang/String;

    .line 57
    .line 58
    iget-object v10, v2, La/f02;->c:Ljava/lang/String;

    .line 59
    .line 60
    invoke-virtual {v0}, La/i3t0;->D()Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    move-result-object v2

    .line 64
    check-cast v2, La/xb1;

    .line 65
    .line 66
    iget-wide v11, v2, La/xb1;->g:J

    .line 67
    .line 68
    invoke-virtual {v0}, La/i3t0;->D()Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    move-result-object v2

    .line 72
    check-cast v2, La/xb1;

    .line 73
    .line 74
    iget-object v2, v2, La/xb1;->a:La/db1;

    .line 75
    .line 76
    iget-boolean v13, v2, La/db1;->j:Z

    .line 77
    .line 78
    invoke-virtual {v0}, La/i3t0;->D()Ljava/lang/Object;

    .line 79
    .line 80
    .line 81
    move-result-object v2

    .line 82
    check-cast v2, La/xb1;

    .line 83
    .line 84
    iget-object v2, v2, La/xb1;->a:La/db1;

    .line 85
    .line 86
    iget-boolean v14, v2, La/db1;->e:Z

    .line 87
    .line 88
    invoke-virtual {v0}, La/i3t0;->D()Ljava/lang/Object;

    .line 89
    .line 90
    .line 91
    move-result-object v0

    .line 92
    check-cast v0, La/xb1;

    .line 93
    .line 94
    iget-object v0, v0, La/xb1;->a:La/db1;

    .line 95
    .line 96
    iget-object v15, v0, La/db1;->l:Ljava/lang/String;

    .line 97
    .line 98
    invoke-direct/range {v3 .. v15}, Lorg/xplatform/aggregator/game/impl/game/navigation/AggregatorGameScreens$AggregatorMultiModeGameFragmentScreen;-><init>(JZZZLjava/lang/String;Ljava/lang/String;JZZLjava/lang/String;)V

    .line 99
    .line 100
    .line 101
    invoke-virtual {v1, v3}, La/k0w0;->k(La/m7h0;)V

    .line 102
    .line 103
    .line 104
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 105
    .line 106
    return-object v0

    .line 107
    :pswitch_0
    move-object/from16 v1, p1

    .line 108
    .line 109
    check-cast v1, La/k0w0;

    .line 110
    .line 111
    new-instance v3, Lorg/xplatform/aggregator/game/impl/game/navigation/AggregatorGameScreens$AggregatorGameFragmentScreen;

    .line 112
    .line 113
    iget-object v4, v2, La/f02;->a:Ljava/lang/String;

    .line 114
    .line 115
    iget-object v5, v2, La/f02;->b:Ljava/lang/String;

    .line 116
    .line 117
    iget-object v6, v2, La/f02;->c:Ljava/lang/String;

    .line 118
    .line 119
    invoke-virtual {v0}, La/i3t0;->D()Ljava/lang/Object;

    .line 120
    .line 121
    .line 122
    move-result-object v2

    .line 123
    check-cast v2, La/xb1;

    .line 124
    .line 125
    iget-object v2, v2, La/xb1;->a:La/db1;

    .line 126
    .line 127
    iget-boolean v2, v2, La/db1;->f:Z

    .line 128
    .line 129
    if-eqz v2, :cond_0

    .line 130
    .line 131
    invoke-virtual {v0}, La/i3t0;->D()Ljava/lang/Object;

    .line 132
    .line 133
    .line 134
    move-result-object v2

    .line 135
    check-cast v2, La/xb1;

    .line 136
    .line 137
    iget-boolean v2, v2, La/xb1;->c:Z

    .line 138
    .line 139
    if-nez v2, :cond_0

    .line 140
    .line 141
    const/4 v2, 0x1

    .line 142
    :goto_0
    move v7, v2

    .line 143
    goto :goto_1

    .line 144
    :cond_0
    const/4 v2, 0x0

    .line 145
    goto :goto_0

    .line 146
    :goto_1
    invoke-virtual {v0}, La/i3t0;->D()Ljava/lang/Object;

    .line 147
    .line 148
    .line 149
    move-result-object v2

    .line 150
    check-cast v2, La/xb1;

    .line 151
    .line 152
    iget-wide v8, v2, La/xb1;->g:J

    .line 153
    .line 154
    invoke-virtual {v0}, La/i3t0;->D()Ljava/lang/Object;

    .line 155
    .line 156
    .line 157
    move-result-object v0

    .line 158
    check-cast v0, La/xb1;

    .line 159
    .line 160
    iget-wide v10, v0, La/xb1;->f:J

    .line 161
    .line 162
    invoke-direct/range {v3 .. v11}, Lorg/xplatform/aggregator/game/impl/game/navigation/AggregatorGameScreens$AggregatorGameFragmentScreen;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZJJ)V

    .line 163
    .line 164
    .line 165
    invoke-virtual {v1, v3}, La/k0w0;->k(La/m7h0;)V

    .line 166
    .line 167
    .line 168
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 169
    .line 170
    return-object v0

    .line 171
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
