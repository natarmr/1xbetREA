.class public final La/qof0;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public j:Z

.field public final synthetic k:La/vof0;

.field public final synthetic l:Ljava/util/ArrayList;

.field public final synthetic m:Z

.field public final synthetic n:La/mrf0;


# direct methods
.method public synthetic constructor <init>(La/vof0;Ljava/util/ArrayList;ZLa/mrf0;La/yje;B)V
    .locals 0

    .line 1
    iput-byte p6, p0, La/qof0;->i:B

    iput-object p1, p0, La/qof0;->k:La/vof0;

    iput-object p2, p0, La/qof0;->l:Ljava/util/ArrayList;

    iput-boolean p3, p0, La/qof0;->m:Z

    iput-object p4, p0, La/qof0;->n:La/mrf0;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p5}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 8

    .line 1
    iget-byte p1, p0, La/qof0;->i:B

    .line 2
    .line 3
    packed-switch p1, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    new-instance v0, La/qof0;

    .line 7
    .line 8
    iget-object v4, p0, La/qof0;->n:La/mrf0;

    .line 9
    .line 10
    const/4 v6, 0x1

    .line 11
    iget-object v1, p0, La/qof0;->k:La/vof0;

    .line 12
    .line 13
    iget-object v2, p0, La/qof0;->l:Ljava/util/ArrayList;

    .line 14
    .line 15
    iget-boolean v3, p0, La/qof0;->m:Z

    .line 16
    .line 17
    move-object v5, p2

    .line 18
    invoke-direct/range {v0 .. v6}, La/qof0;-><init>(La/vof0;Ljava/util/ArrayList;ZLa/mrf0;La/yje;B)V

    .line 19
    .line 20
    .line 21
    return-object v0

    .line 22
    :pswitch_0
    move-object v5, p2

    .line 23
    new-instance v1, La/qof0;

    .line 24
    .line 25
    move-object v6, v5

    .line 26
    iget-object v5, p0, La/qof0;->n:La/mrf0;

    .line 27
    .line 28
    const/4 v7, 0x0

    .line 29
    iget-object v2, p0, La/qof0;->k:La/vof0;

    .line 30
    .line 31
    iget-object v3, p0, La/qof0;->l:Ljava/util/ArrayList;

    .line 32
    .line 33
    iget-boolean v4, p0, La/qof0;->m:Z

    .line 34
    .line 35
    invoke-direct/range {v1 .. v7}, La/qof0;-><init>(La/vof0;Ljava/util/ArrayList;ZLa/mrf0;La/yje;B)V

    .line 36
    .line 37
    .line 38
    return-object v1

    .line 39
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-byte v0, p0, La/qof0;->i:B

    .line 2
    .line 3
    check-cast p1, La/vne;

    .line 4
    .line 5
    check-cast p2, La/yje;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0, p1, p2}, La/qof0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, La/qof0;

    .line 15
    .line 16
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, La/qof0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    invoke-virtual {p0, p1, p2}, La/qof0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    check-cast p0, La/qof0;

    .line 28
    .line 29
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 30
    .line 31
    invoke-virtual {p0, p1}, La/qof0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    return-object p0

    .line 36
    nop

    .line 37
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 15

    .line 1
    iget-byte v0, p0, La/qof0;->i:B

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
    sget-object v6, La/wne;->a:La/wne;

    .line 11
    .line 12
    iget-boolean v0, p0, La/qof0;->j:Z

    .line 13
    .line 14
    if-eqz v0, :cond_1

    .line 15
    .line 16
    if-ne v0, v3, :cond_0

    .line 17
    .line 18
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 19
    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    invoke-static {v2}, La/jf4;->n(Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    goto :goto_1

    .line 26
    :cond_1
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 27
    .line 28
    .line 29
    new-instance v4, La/b0c0;

    .line 30
    .line 31
    const/4 v13, 0x0

    .line 32
    const/16 v14, 0x13

    .line 33
    .line 34
    const/4 v8, 0x0

    .line 35
    iget-object v0, p0, La/qof0;->k:La/vof0;

    .line 36
    .line 37
    const-class v10, La/vof0;

    .line 38
    .line 39
    const-string v11, "applyDoors"

    .line 40
    .line 41
    const-string v12, "applyDoors()V"

    .line 42
    .line 43
    move-object v9, v0

    .line 44
    move-object v7, v4

    .line 45
    invoke-direct/range {v7 .. v14}, La/b0c0;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 46
    .line 47
    .line 48
    iput-boolean v3, p0, La/qof0;->j:Z

    .line 49
    .line 50
    sget-object v1, La/vof0;->O1:[La/iiy;

    .line 51
    .line 52
    iget-object v1, p0, La/qof0;->l:Ljava/util/ArrayList;

    .line 53
    .line 54
    iget-boolean v2, p0, La/qof0;->m:Z

    .line 55
    .line 56
    iget-object v3, p0, La/qof0;->n:La/mrf0;

    .line 57
    .line 58
    move-object v5, p0

    .line 59
    invoke-virtual/range {v0 .. v5}, La/vof0;->L0(Ljava/util/ArrayList;ZLa/mrf0;Lkotlin/jvm/functions/Function0;La/zje;)Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    move-result-object v0

    .line 63
    if-ne v0, v6, :cond_2

    .line 64
    .line 65
    move-object v1, v6

    .line 66
    goto :goto_1

    .line 67
    :cond_2
    :goto_0
    sget-object v1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 68
    .line 69
    :goto_1
    return-object v1

    .line 70
    :pswitch_0
    sget-object v6, La/wne;->a:La/wne;

    .line 71
    .line 72
    iget-boolean v0, p0, La/qof0;->j:Z

    .line 73
    .line 74
    if-eqz v0, :cond_4

    .line 75
    .line 76
    if-ne v0, v3, :cond_3

    .line 77
    .line 78
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 79
    .line 80
    .line 81
    goto :goto_2

    .line 82
    :cond_3
    invoke-static {v2}, La/jf4;->n(Ljava/lang/String;)V

    .line 83
    .line 84
    .line 85
    goto :goto_3

    .line 86
    :cond_4
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 87
    .line 88
    .line 89
    new-instance v4, La/b0c0;

    .line 90
    .line 91
    sget-object v0, La/vof0;->O1:[La/iiy;

    .line 92
    .line 93
    iget-object v0, p0, La/qof0;->k:La/vof0;

    .line 94
    .line 95
    invoke-virtual {v0}, La/vof0;->I0()La/aqf0;

    .line 96
    .line 97
    .line 98
    move-result-object v9

    .line 99
    const/4 v13, 0x0

    .line 100
    const/16 v14, 0x12

    .line 101
    .line 102
    const/4 v8, 0x0

    .line 103
    const-class v10, La/aqf0;

    .line 104
    .line 105
    const-string v11, "onGameApplied"

    .line 106
    .line 107
    const-string v12, "onGameApplied()V"

    .line 108
    .line 109
    move-object v7, v4

    .line 110
    invoke-direct/range {v7 .. v14}, La/b0c0;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 111
    .line 112
    .line 113
    iput-boolean v3, p0, La/qof0;->j:Z

    .line 114
    .line 115
    iget-object v1, p0, La/qof0;->l:Ljava/util/ArrayList;

    .line 116
    .line 117
    iget-boolean v2, p0, La/qof0;->m:Z

    .line 118
    .line 119
    iget-object v3, p0, La/qof0;->n:La/mrf0;

    .line 120
    .line 121
    move-object v5, p0

    .line 122
    invoke-virtual/range {v0 .. v5}, La/vof0;->L0(Ljava/util/ArrayList;ZLa/mrf0;Lkotlin/jvm/functions/Function0;La/zje;)Ljava/lang/Object;

    .line 123
    .line 124
    .line 125
    move-result-object v0

    .line 126
    if-ne v0, v6, :cond_5

    .line 127
    .line 128
    move-object v1, v6

    .line 129
    goto :goto_3

    .line 130
    :cond_5
    :goto_2
    sget-object v1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 131
    .line 132
    :goto_3
    return-object v1

    .line 133
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
