.class public final La/nou0;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public j:Z

.field public final synthetic k:La/oou0;


# direct methods
.method public synthetic constructor <init>(La/oou0;La/yje;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/nou0;->i:B

    iput-object p1, p0, La/nou0;->k:La/oou0;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 2

    .line 1
    iget-byte v0, p0, La/nou0;->i:B

    .line 2
    .line 3
    iget-object p0, p0, La/nou0;->k:La/oou0;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance v0, La/nou0;

    .line 9
    .line 10
    const/4 v1, 0x1

    .line 11
    invoke-direct {v0, p0, p2, v1}, La/nou0;-><init>(La/oou0;La/yje;B)V

    .line 12
    .line 13
    .line 14
    check-cast p1, Ljava/lang/Boolean;

    .line 15
    .line 16
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 17
    .line 18
    .line 19
    move-result p0

    .line 20
    iput-boolean p0, v0, La/nou0;->j:Z

    .line 21
    .line 22
    return-object v0

    .line 23
    :pswitch_0
    new-instance p1, La/nou0;

    .line 24
    .line 25
    const/4 v0, 0x0

    .line 26
    invoke-direct {p1, p0, p2, v0}, La/nou0;-><init>(La/oou0;La/yje;B)V

    .line 27
    .line 28
    .line 29
    return-object p1

    .line 30
    nop

    .line 31
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-byte v0, p0, La/nou0;->i:B

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, Ljava/lang/Boolean;

    .line 7
    .line 8
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 9
    .line 10
    .line 11
    check-cast p2, La/yje;

    .line 12
    .line 13
    invoke-virtual {p0, p1, p2}, La/nou0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    check-cast p0, La/nou0;

    .line 18
    .line 19
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 20
    .line 21
    invoke-virtual {p0, p1}, La/nou0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    return-object p0

    .line 26
    :pswitch_0
    check-cast p1, La/vne;

    .line 27
    .line 28
    check-cast p2, La/yje;

    .line 29
    .line 30
    invoke-virtual {p0, p1, p2}, La/nou0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    check-cast p0, La/nou0;

    .line 35
    .line 36
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 37
    .line 38
    invoke-virtual {p0, p1}, La/nou0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object p0

    .line 42
    return-object p0

    .line 43
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 16

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/nou0;->i:B

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    const/4 v3, 0x1

    .line 7
    iget-object v4, v0, La/nou0;->k:La/oou0;

    .line 8
    .line 9
    packed-switch v1, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    iget-boolean v9, v0, La/nou0;->j:Z

    .line 13
    .line 14
    sget-object v0, La/wne;->a:La/wne;

    .line 15
    .line 16
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 17
    .line 18
    .line 19
    if-eqz v9, :cond_1

    .line 20
    .line 21
    sget v0, La/oou0;->w:I

    .line 22
    .line 23
    iget-object v0, v4, La/oou0;->v:La/bby;

    .line 24
    .line 25
    if-eqz v0, :cond_0

    .line 26
    .line 27
    invoke-interface {v0}, La/bby;->isActive()Z

    .line 28
    .line 29
    .line 30
    move-result v0

    .line 31
    if-ne v0, v3, :cond_0

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_0
    invoke-static {v4}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 35
    .line 36
    .line 37
    move-result-object v10

    .line 38
    iget-object v0, v4, La/oou0;->p:La/mne;

    .line 39
    .line 40
    iget-object v13, v0, La/mne;->b:La/dvj;

    .line 41
    .line 42
    new-instance v11, La/npt0;

    .line 43
    .line 44
    const/16 v0, 0xe

    .line 45
    .line 46
    invoke-direct {v11, v4, v0}, La/npt0;-><init>(Ljava/lang/Object;B)V

    .line 47
    .line 48
    .line 49
    new-instance v14, La/nou0;

    .line 50
    .line 51
    const/4 v0, 0x0

    .line 52
    invoke-direct {v14, v4, v2, v0}, La/nou0;-><init>(La/oou0;La/yje;B)V

    .line 53
    .line 54
    .line 55
    const/16 v15, 0xa

    .line 56
    .line 57
    const/4 v12, 0x0

    .line 58
    invoke-static/range {v10 .. v15}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 59
    .line 60
    .line 61
    move-result-object v0

    .line 62
    iput-object v0, v4, La/oou0;->v:La/bby;

    .line 63
    .line 64
    :cond_1
    :goto_0
    sget v0, La/oou0;->w:I

    .line 65
    .line 66
    iget-object v0, v4, La/i3t0;->i:La/ocj;

    .line 67
    .line 68
    iget-object v1, v0, La/ocj;->a:La/p7m0;

    .line 69
    .line 70
    :cond_2
    invoke-virtual {v1}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    move-result-object v0

    .line 74
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 75
    .line 76
    .line 77
    move-object v5, v0

    .line 78
    check-cast v5, La/kou0;

    .line 79
    .line 80
    const/4 v8, 0x0

    .line 81
    const/4 v10, 0x7

    .line 82
    const/4 v6, 0x0

    .line 83
    const/4 v7, 0x0

    .line 84
    invoke-static/range {v5 .. v10}, La/kou0;->a(La/kou0;Ljava/lang/String;La/j0g0;ZZI)La/kou0;

    .line 85
    .line 86
    .line 87
    move-result-object v2

    .line 88
    invoke-virtual {v1, v0, v2}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 89
    .line 90
    .line 91
    move-result v0

    .line 92
    if-eqz v0, :cond_2

    .line 93
    .line 94
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 95
    .line 96
    return-object v0

    .line 97
    :pswitch_0
    sget-object v1, La/wne;->a:La/wne;

    .line 98
    .line 99
    iget-boolean v5, v0, La/nou0;->j:Z

    .line 100
    .line 101
    if-eqz v5, :cond_4

    .line 102
    .line 103
    if-ne v5, v3, :cond_3

    .line 104
    .line 105
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 106
    .line 107
    .line 108
    move-object/from16 v0, p1

    .line 109
    .line 110
    goto :goto_1

    .line 111
    :cond_3
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 112
    .line 113
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 114
    .line 115
    .line 116
    goto :goto_2

    .line 117
    :cond_4
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 118
    .line 119
    .line 120
    iget-object v2, v4, La/oou0;->q:La/r2u;

    .line 121
    .line 122
    iget-object v5, v4, La/oou0;->t:Lorg/xplatform/cyber/section/api/virtualgamescategories/VirtualCategoryDisciplinesParams;

    .line 123
    .line 124
    iget-object v5, v5, Lorg/xplatform/cyber/section/api/virtualgamescategories/VirtualCategoryDisciplinesParams;->a:Ljava/util/ArrayList;

    .line 125
    .line 126
    iput-boolean v3, v0, La/nou0;->j:Z

    .line 127
    .line 128
    invoke-virtual {v2, v5, v0}, La/r2u;->a(Ljava/util/List;La/zje;)Ljava/io/Serializable;

    .line 129
    .line 130
    .line 131
    move-result-object v0

    .line 132
    if-ne v0, v1, :cond_5

    .line 133
    .line 134
    move-object v2, v1

    .line 135
    goto :goto_2

    .line 136
    :cond_5
    :goto_1
    check-cast v0, Ljava/util/List;

    .line 137
    .line 138
    sget v1, La/oou0;->w:I

    .line 139
    .line 140
    iget-object v1, v4, La/i3t0;->i:La/ocj;

    .line 141
    .line 142
    iget-object v1, v1, La/ocj;->a:La/p7m0;

    .line 143
    .line 144
    :cond_6
    invoke-virtual {v1}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 145
    .line 146
    .line 147
    move-result-object v2

    .line 148
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 149
    .line 150
    .line 151
    move-object v3, v2

    .line 152
    check-cast v3, La/kou0;

    .line 153
    .line 154
    new-instance v5, La/j0g0;

    .line 155
    .line 156
    invoke-direct {v5, v0}, La/j0g0;-><init>(Ljava/lang/Object;)V

    .line 157
    .line 158
    .line 159
    const/4 v7, 0x0

    .line 160
    const/16 v8, 0xd

    .line 161
    .line 162
    const/4 v4, 0x0

    .line 163
    const/4 v6, 0x0

    .line 164
    invoke-static/range {v3 .. v8}, La/kou0;->a(La/kou0;Ljava/lang/String;La/j0g0;ZZI)La/kou0;

    .line 165
    .line 166
    .line 167
    move-result-object v3

    .line 168
    invoke-virtual {v1, v2, v3}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 169
    .line 170
    .line 171
    move-result v2

    .line 172
    if-eqz v2, :cond_6

    .line 173
    .line 174
    sget-object v2, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 175
    .line 176
    :goto_2
    return-object v2

    .line 177
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
