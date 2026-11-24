.class public final La/kvh0;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic i:B

.field public j:Z

.field public final synthetic k:La/pvh0;

.field public final synthetic l:Ljava/lang/Object;

.field public final synthetic m:La/oms0;


# direct methods
.method public synthetic constructor <init>(La/pvh0;Ljava/lang/Object;La/oms0;La/yje;B)V
    .locals 0

    .line 1
    iput-byte p5, p0, La/kvh0;->i:B

    iput-object p1, p0, La/kvh0;->k:La/pvh0;

    iput-object p2, p0, La/kvh0;->l:Ljava/lang/Object;

    iput-object p3, p0, La/kvh0;->m:La/oms0;

    const/4 p1, 0x1

    invoke-direct {p0, p1, p4}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(La/yje;)La/yje;
    .locals 8

    .line 1
    iget-byte v0, p0, La/kvh0;->i:B

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    new-instance v1, La/kvh0;

    .line 7
    .line 8
    iget-object v4, p0, La/kvh0;->m:La/oms0;

    .line 9
    .line 10
    const/4 v6, 0x1

    .line 11
    iget-object v2, p0, La/kvh0;->k:La/pvh0;

    .line 12
    .line 13
    iget-object v3, p0, La/kvh0;->l:Ljava/lang/Object;

    .line 14
    .line 15
    move-object v5, p1

    .line 16
    invoke-direct/range {v1 .. v6}, La/kvh0;-><init>(La/pvh0;Ljava/lang/Object;La/oms0;La/yje;B)V

    .line 17
    .line 18
    .line 19
    return-object v1

    .line 20
    :pswitch_0
    move-object v5, p1

    .line 21
    new-instance v2, La/kvh0;

    .line 22
    .line 23
    move-object v6, v5

    .line 24
    iget-object v5, p0, La/kvh0;->m:La/oms0;

    .line 25
    .line 26
    const/4 v7, 0x0

    .line 27
    iget-object v3, p0, La/kvh0;->k:La/pvh0;

    .line 28
    .line 29
    iget-object v4, p0, La/kvh0;->l:Ljava/lang/Object;

    .line 30
    .line 31
    invoke-direct/range {v2 .. v7}, La/kvh0;-><init>(La/pvh0;Ljava/lang/Object;La/oms0;La/yje;B)V

    .line 32
    .line 33
    .line 34
    return-object v2

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-byte v0, p0, La/kvh0;->i:B

    .line 2
    .line 3
    check-cast p1, La/yje;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0, p1}, La/kvh0;->create(La/yje;)La/yje;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    check-cast p0, La/kvh0;

    .line 13
    .line 14
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 15
    .line 16
    invoke-virtual {p0, p1}, La/kvh0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    return-object p0

    .line 21
    :pswitch_0
    invoke-virtual {p0, p1}, La/kvh0;->create(La/yje;)La/yje;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    check-cast p0, La/kvh0;

    .line 26
    .line 27
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 28
    .line 29
    invoke-virtual {p0, p1}, La/kvh0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    return-object p0

    .line 34
    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11

    .line 1
    iget-byte v0, p0, La/kvh0;->i:B

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 5
    .line 6
    const/4 v3, 0x1

    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    sget-object v0, La/wne;->a:La/wne;

    .line 11
    .line 12
    iget-boolean v4, p0, La/kvh0;->j:Z

    .line 13
    .line 14
    iget-object v5, p0, La/kvh0;->m:La/oms0;

    .line 15
    .line 16
    if-eqz v4, :cond_1

    .line 17
    .line 18
    if-ne v4, v3, :cond_0

    .line 19
    .line 20
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 21
    .line 22
    .line 23
    goto :goto_1

    .line 24
    :cond_0
    invoke-static {v2}, La/jf4;->n(Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    goto :goto_2

    .line 28
    :cond_1
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 29
    .line 30
    .line 31
    iget-object p1, p0, La/kvh0;->k:La/pvh0;

    .line 32
    .line 33
    invoke-virtual {p1}, La/pvh0;->o1()V

    .line 34
    .line 35
    .line 36
    iget-object v1, p1, La/pvh0;->c:La/pz40;

    .line 37
    .line 38
    const-wide/high16 v6, -0x8000000000000000L

    .line 39
    .line 40
    iput-wide v6, p1, La/pvh0;->n:J

    .line 41
    .line 42
    const/4 v2, 0x0

    .line 43
    invoke-virtual {p1, v2}, La/pvh0;->u1(F)V

    .line 44
    .line 45
    .line 46
    iget-object v4, p1, La/pvh0;->d:La/pz40;

    .line 47
    .line 48
    check-cast v4, La/hgk0;

    .line 49
    .line 50
    invoke-virtual {v4}, La/hgk0;->getValue()Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object v4

    .line 54
    iget-object v6, p0, La/kvh0;->l:Ljava/lang/Object;

    .line 55
    .line 56
    invoke-static {v6, v4}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 57
    .line 58
    .line 59
    move-result v4

    .line 60
    const/high16 v7, -0x3fc00000    # -3.0f

    .line 61
    .line 62
    if-eqz v4, :cond_2

    .line 63
    .line 64
    const/high16 v4, -0x3f800000    # -4.0f

    .line 65
    .line 66
    goto :goto_0

    .line 67
    :cond_2
    move-object v4, v1

    .line 68
    check-cast v4, La/hgk0;

    .line 69
    .line 70
    invoke-virtual {v4}, La/hgk0;->getValue()Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    move-result-object v4

    .line 74
    invoke-static {v6, v4}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 75
    .line 76
    .line 77
    move-result v4

    .line 78
    if-eqz v4, :cond_3

    .line 79
    .line 80
    const/high16 v4, -0x3f600000    # -5.0f

    .line 81
    .line 82
    goto :goto_0

    .line 83
    :cond_3
    move v4, v7

    .line 84
    :goto_0
    invoke-virtual {v5, v6}, La/oms0;->r(Ljava/lang/Object;)V

    .line 85
    .line 86
    .line 87
    const-wide/16 v8, 0x0

    .line 88
    .line 89
    invoke-virtual {v5, v8, v9}, La/oms0;->o(J)V

    .line 90
    .line 91
    .line 92
    check-cast v1, La/hgk0;

    .line 93
    .line 94
    invoke-virtual {v1, v6}, La/hgk0;->setValue(Ljava/lang/Object;)V

    .line 95
    .line 96
    .line 97
    invoke-virtual {p1, v2}, La/pvh0;->u1(F)V

    .line 98
    .line 99
    .line 100
    invoke-virtual {p1, v6}, La/pvh0;->I0(Ljava/lang/Object;)V

    .line 101
    .line 102
    .line 103
    invoke-virtual {v5, v4}, La/oms0;->k(F)V

    .line 104
    .line 105
    .line 106
    cmpg-float v1, v4, v7

    .line 107
    .line 108
    if-nez v1, :cond_4

    .line 109
    .line 110
    iput-boolean v3, p0, La/kvh0;->j:Z

    .line 111
    .line 112
    invoke-virtual {p1, p0}, La/pvh0;->x1(La/zje;)Ljava/lang/Object;

    .line 113
    .line 114
    .line 115
    move-result-object p0

    .line 116
    if-ne p0, v0, :cond_4

    .line 117
    .line 118
    move-object v1, v0

    .line 119
    goto :goto_2

    .line 120
    :cond_4
    :goto_1
    invoke-virtual {v5}, La/oms0;->j()V

    .line 121
    .line 122
    .line 123
    sget-object v1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 124
    .line 125
    :goto_2
    return-object v1

    .line 126
    :pswitch_0
    sget-object v0, La/wne;->a:La/wne;

    .line 127
    .line 128
    iget-boolean v4, p0, La/kvh0;->j:Z

    .line 129
    .line 130
    if-eqz v4, :cond_6

    .line 131
    .line 132
    if-ne v4, v3, :cond_5

    .line 133
    .line 134
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 135
    .line 136
    .line 137
    goto :goto_3

    .line 138
    :cond_5
    invoke-static {v2}, La/jf4;->n(Ljava/lang/String;)V

    .line 139
    .line 140
    .line 141
    goto :goto_4

    .line 142
    :cond_6
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 143
    .line 144
    .line 145
    new-instance v5, La/kv;

    .line 146
    .line 147
    const/4 v9, 0x0

    .line 148
    const/16 v10, 0x12

    .line 149
    .line 150
    iget-object v6, p0, La/kvh0;->k:La/pvh0;

    .line 151
    .line 152
    iget-object v7, p0, La/kvh0;->l:Ljava/lang/Object;

    .line 153
    .line 154
    iget-object v8, p0, La/kvh0;->m:La/oms0;

    .line 155
    .line 156
    invoke-direct/range {v5 .. v10}, La/kv;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;La/yje;B)V

    .line 157
    .line 158
    .line 159
    iput-boolean v3, p0, La/kvh0;->j:Z

    .line 160
    .line 161
    invoke-static {p0, v5}, La/d5c;->J(La/yje;Lkotlin/jvm/functions/Function2;)Ljava/lang/Object;

    .line 162
    .line 163
    .line 164
    move-result-object p0

    .line 165
    if-ne p0, v0, :cond_7

    .line 166
    .line 167
    move-object v1, v0

    .line 168
    goto :goto_4

    .line 169
    :cond_7
    :goto_3
    sget-object v1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 170
    .line 171
    :goto_4
    return-object v1

    .line 172
    nop

    .line 173
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
