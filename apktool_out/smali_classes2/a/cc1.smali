.class public final synthetic La/cc1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/kc1;

.field public final synthetic c:La/mlr;


# direct methods
.method public synthetic constructor <init>(La/kc1;La/mlr;)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    iput-byte v0, p0, La/cc1;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/cc1;->b:La/kc1;

    iput-object p2, p0, La/cc1;->c:La/mlr;

    return-void
.end method

.method public synthetic constructor <init>(La/mlr;La/kc1;)V
    .locals 1

    .line 2
    const/4 v0, 0x0

    iput-byte v0, p0, La/cc1;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/cc1;->c:La/mlr;

    iput-object p2, p0, La/cc1;->b:La/kc1;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 20

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/cc1;->a:B

    .line 4
    .line 5
    iget-object v2, v0, La/cc1;->c:La/mlr;

    .line 6
    .line 7
    iget-object v0, v0, La/cc1;->b:La/kc1;

    .line 8
    .line 9
    packed-switch v1, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    move-object/from16 v1, p1

    .line 13
    .line 14
    check-cast v1, La/x7d;

    .line 15
    .line 16
    invoke-virtual {v0}, La/i3t0;->D()Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    check-cast v0, La/xb1;

    .line 21
    .line 22
    iget-object v0, v0, La/xb1;->a:La/db1;

    .line 23
    .line 24
    iget-boolean v0, v0, La/db1;->j:Z

    .line 25
    .line 26
    const/4 v3, 0x1

    .line 27
    if-eqz v0, :cond_0

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_0
    iget-boolean v0, v2, La/mlr;->n:Z

    .line 31
    .line 32
    if-nez v0, :cond_1

    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_1
    const/4 v3, 0x0

    .line 36
    :goto_0
    iput-boolean v3, v1, La/x7d;->a:Z

    .line 37
    .line 38
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 39
    .line 40
    return-object v0

    .line 41
    :pswitch_0
    move-object/from16 v1, p1

    .line 42
    .line 43
    check-cast v1, La/k0w0;

    .line 44
    .line 45
    iget-wide v4, v2, La/mlr;->a:J

    .line 46
    .line 47
    iget-object v6, v2, La/mlr;->f:Ljava/lang/String;

    .line 48
    .line 49
    iget-wide v7, v2, La/mlr;->c:J

    .line 50
    .line 51
    iget-boolean v9, v2, La/mlr;->l:Z

    .line 52
    .line 53
    iget-wide v10, v2, La/mlr;->b:J

    .line 54
    .line 55
    iget-boolean v12, v2, La/mlr;->m:Z

    .line 56
    .line 57
    invoke-virtual {v0}, La/i3t0;->D()Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    move-result-object v3

    .line 61
    check-cast v3, La/xb1;

    .line 62
    .line 63
    iget-object v3, v3, La/xb1;->a:La/db1;

    .line 64
    .line 65
    iget-boolean v13, v3, La/db1;->g:Z

    .line 66
    .line 67
    invoke-virtual {v0}, La/i3t0;->D()Ljava/lang/Object;

    .line 68
    .line 69
    .line 70
    move-result-object v3

    .line 71
    check-cast v3, La/xb1;

    .line 72
    .line 73
    iget-object v3, v3, La/xb1;->a:La/db1;

    .line 74
    .line 75
    iget v14, v3, La/db1;->h:I

    .line 76
    .line 77
    iget-boolean v15, v2, La/mlr;->n:Z

    .line 78
    .line 79
    invoke-virtual {v0}, La/i3t0;->D()Ljava/lang/Object;

    .line 80
    .line 81
    .line 82
    move-result-object v3

    .line 83
    check-cast v3, La/xb1;

    .line 84
    .line 85
    iget-object v3, v3, La/xb1;->a:La/db1;

    .line 86
    .line 87
    iget-boolean v3, v3, La/db1;->j:Z

    .line 88
    .line 89
    invoke-virtual {v0}, La/i3t0;->D()Ljava/lang/Object;

    .line 90
    .line 91
    .line 92
    move-result-object v16

    .line 93
    move/from16 v17, v3

    .line 94
    .line 95
    move-object/from16 v3, v16

    .line 96
    .line 97
    check-cast v3, La/xb1;

    .line 98
    .line 99
    iget-boolean v3, v3, La/xb1;->k:Z

    .line 100
    .line 101
    invoke-virtual {v0}, La/i3t0;->D()Ljava/lang/Object;

    .line 102
    .line 103
    .line 104
    move-result-object v16

    .line 105
    move/from16 v19, v3

    .line 106
    .line 107
    move-object/from16 v3, v16

    .line 108
    .line 109
    check-cast v3, La/xb1;

    .line 110
    .line 111
    iget-object v3, v3, La/xb1;->a:La/db1;

    .line 112
    .line 113
    iget-object v3, v3, La/db1;->l:Ljava/lang/String;

    .line 114
    .line 115
    move-object/from16 v18, v3

    .line 116
    .line 117
    new-instance v3, Lorg/xplatform/aggregator/game/impl/game/navigation/AggregatorGameScreens$AggregatorPreloadGameScreen;

    .line 118
    .line 119
    const/16 v16, 0x0

    .line 120
    .line 121
    invoke-direct/range {v3 .. v19}, Lorg/xplatform/aggregator/game/impl/game/navigation/AggregatorGameScreens$AggregatorPreloadGameScreen;-><init>(JLjava/lang/String;JZJZZIZZZLjava/lang/String;Z)V

    .line 122
    .line 123
    .line 124
    invoke-virtual {v1, v3}, La/k0w0;->h(La/m7h0;)La/ikt0;

    .line 125
    .line 126
    .line 127
    move-result-object v1

    .line 128
    new-instance v3, La/cc1;

    .line 129
    .line 130
    invoke-direct {v3, v0, v2}, La/cc1;-><init>(La/kc1;La/mlr;)V

    .line 131
    .line 132
    .line 133
    iget-object v0, v1, La/ikt0;->a:Ljava/lang/Object;

    .line 134
    .line 135
    check-cast v0, La/c8d;

    .line 136
    .line 137
    new-instance v1, La/x7d;

    .line 138
    .line 139
    invoke-direct {v1}, La/x7d;-><init>()V

    .line 140
    .line 141
    .line 142
    invoke-virtual {v3, v1}, La/cc1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 143
    .line 144
    .line 145
    new-instance v2, La/v7d;

    .line 146
    .line 147
    iget-boolean v3, v1, La/x7d;->a:Z

    .line 148
    .line 149
    iget-object v4, v1, La/x7d;->b:La/bjk;

    .line 150
    .line 151
    iget-object v1, v1, La/x7d;->c:La/bjk;

    .line 152
    .line 153
    invoke-direct {v2, v3, v4, v1}, La/v7d;-><init>(ZLa/bjk;La/bjk;)V

    .line 154
    .line 155
    .line 156
    iput-object v2, v0, La/c8d;->a:La/w7d;

    .line 157
    .line 158
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 159
    .line 160
    return-object v0

    .line 161
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
