.class public final La/mih0;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic i:B

.field public j:Z

.field public final synthetic k:La/sih0;


# direct methods
.method public synthetic constructor <init>(La/sih0;La/yje;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/mih0;->i:B

    iput-object p1, p0, La/mih0;->k:La/sih0;

    const/4 p1, 0x1

    invoke-direct {p0, p1, p2}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(La/yje;)La/yje;
    .locals 2

    .line 1
    iget-byte v0, p0, La/mih0;->i:B

    .line 2
    .line 3
    iget-object p0, p0, La/mih0;->k:La/sih0;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance v0, La/mih0;

    .line 9
    .line 10
    const/4 v1, 0x1

    .line 11
    invoke-direct {v0, p0, p1, v1}, La/mih0;-><init>(La/sih0;La/yje;B)V

    .line 12
    .line 13
    .line 14
    return-object v0

    .line 15
    :pswitch_0
    new-instance v0, La/mih0;

    .line 16
    .line 17
    const/4 v1, 0x0

    .line 18
    invoke-direct {v0, p0, p1, v1}, La/mih0;-><init>(La/sih0;La/yje;B)V

    .line 19
    .line 20
    .line 21
    return-object v0

    .line 22
    nop

    .line 23
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-byte v0, p0, La/mih0;->i:B

    .line 2
    .line 3
    check-cast p1, La/yje;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0, p1}, La/mih0;->create(La/yje;)La/yje;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    check-cast p0, La/mih0;

    .line 13
    .line 14
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 15
    .line 16
    invoke-virtual {p0, p1}, La/mih0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    return-object p0

    .line 21
    :pswitch_0
    invoke-virtual {p0, p1}, La/mih0;->create(La/yje;)La/yje;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    check-cast p0, La/mih0;

    .line 26
    .line 27
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 28
    .line 29
    invoke-virtual {p0, p1}, La/mih0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    .locals 21

    .line 1
    move-object/from16 v5, p0

    .line 2
    .line 3
    iget-byte v0, v5, La/mih0;->i:B

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 7
    .line 8
    iget-object v3, v5, La/mih0;->k:La/sih0;

    .line 9
    .line 10
    const/4 v4, 0x1

    .line 11
    packed-switch v0, :pswitch_data_0

    .line 12
    .line 13
    .line 14
    sget-object v6, La/wne;->a:La/wne;

    .line 15
    .line 16
    iget-boolean v0, v5, La/mih0;->j:Z

    .line 17
    .line 18
    if-eqz v0, :cond_1

    .line 19
    .line 20
    if-ne v0, v4, :cond_0

    .line 21
    .line 22
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 23
    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    invoke-static {v2}, La/jf4;->n(Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    goto :goto_1

    .line 30
    :cond_1
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 31
    .line 32
    .line 33
    iget-object v0, v3, La/sih0;->r:La/yhi;

    .line 34
    .line 35
    iget v1, v3, La/sih0;->p:I

    .line 36
    .line 37
    invoke-static {v3}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 38
    .line 39
    .line 40
    move-result-object v2

    .line 41
    invoke-virtual {v3}, La/i3t0;->D()Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object v7

    .line 45
    check-cast v7, La/uhh0;

    .line 46
    .line 47
    iget-object v7, v7, La/uhh0;->w:La/n0w;

    .line 48
    .line 49
    invoke-virtual {v3}, La/i3t0;->D()Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    move-result-object v3

    .line 53
    check-cast v3, La/uhh0;

    .line 54
    .line 55
    iget-boolean v3, v3, La/uhh0;->s:Z

    .line 56
    .line 57
    iput-boolean v4, v5, La/mih0;->j:Z

    .line 58
    .line 59
    move v4, v3

    .line 60
    move-object v3, v7

    .line 61
    invoke-virtual/range {v0 .. v5}, La/yhi;->e(ILa/bvc;La/n0w;ZLa/zje;)Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    move-result-object v0

    .line 65
    if-ne v0, v6, :cond_2

    .line 66
    .line 67
    move-object v1, v6

    .line 68
    goto :goto_1

    .line 69
    :cond_2
    :goto_0
    sget-object v1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 70
    .line 71
    :goto_1
    return-object v1

    .line 72
    :pswitch_0
    sget-object v0, La/wne;->a:La/wne;

    .line 73
    .line 74
    iget-boolean v6, v5, La/mih0;->j:Z

    .line 75
    .line 76
    if-eqz v6, :cond_4

    .line 77
    .line 78
    if-ne v6, v4, :cond_3

    .line 79
    .line 80
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 81
    .line 82
    .line 83
    move-object/from16 v1, p1

    .line 84
    .line 85
    goto :goto_2

    .line 86
    :cond_3
    invoke-static {v2}, La/jf4;->n(Ljava/lang/String;)V

    .line 87
    .line 88
    .line 89
    goto :goto_3

    .line 90
    :cond_4
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 91
    .line 92
    .line 93
    iget-object v1, v3, La/sih0;->u:La/j3c;

    .line 94
    .line 95
    iput-boolean v4, v5, La/mih0;->j:Z

    .line 96
    .line 97
    invoke-virtual {v1, v5}, La/j3c;->c(La/yje;)Ljava/lang/Object;

    .line 98
    .line 99
    .line 100
    move-result-object v1

    .line 101
    if-ne v1, v0, :cond_5

    .line 102
    .line 103
    move-object v1, v0

    .line 104
    goto :goto_3

    .line 105
    :cond_5
    :goto_2
    move-object v15, v1

    .line 106
    check-cast v15, La/wcb;

    .line 107
    .line 108
    sget v0, La/sih0;->N:I

    .line 109
    .line 110
    iget-object v0, v3, La/i3t0;->i:La/ocj;

    .line 111
    .line 112
    iget-object v0, v0, La/ocj;->a:La/p7m0;

    .line 113
    .line 114
    :cond_6
    invoke-virtual {v0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 115
    .line 116
    .line 117
    move-result-object v1

    .line 118
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 119
    .line 120
    .line 121
    move-object v4, v1

    .line 122
    check-cast v4, La/uhh0;

    .line 123
    .line 124
    const/16 v19, 0x0

    .line 125
    .line 126
    const v20, 0x3fff7ff

    .line 127
    .line 128
    .line 129
    const/4 v5, 0x0

    .line 130
    const/4 v6, 0x0

    .line 131
    const/4 v7, 0x0

    .line 132
    const/4 v8, 0x0

    .line 133
    const/4 v9, 0x0

    .line 134
    const/4 v10, 0x0

    .line 135
    const/4 v11, 0x0

    .line 136
    const/4 v12, 0x0

    .line 137
    const-wide/16 v13, 0x0

    .line 138
    .line 139
    const/16 v16, 0x0

    .line 140
    .line 141
    const/16 v17, 0x0

    .line 142
    .line 143
    const/16 v18, 0x0

    .line 144
    .line 145
    invoke-static/range {v4 .. v20}, La/uhh0;->a(La/uhh0;Ljava/lang/String;Ljava/lang/String;La/cxk0;La/cxk0;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;JLa/wcb;Ljava/util/LinkedHashSet;La/mfh0;ZLa/sah0;I)La/uhh0;

    .line 146
    .line 147
    .line 148
    move-result-object v2

    .line 149
    invoke-virtual {v0, v1, v2}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 150
    .line 151
    .line 152
    move-result v1

    .line 153
    if-eqz v1, :cond_6

    .line 154
    .line 155
    sget-object v1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 156
    .line 157
    :goto_3
    return-object v1

    .line 158
    nop

    .line 159
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
