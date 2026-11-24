.class public final La/mu3;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public j:Z

.field public k:Z

.field public final synthetic l:Z

.field public m:Ljava/lang/Object;

.field public final synthetic n:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(BLa/yje;Ljava/lang/Object;ZZ)V
    .locals 0

    .line 23
    iput-byte p1, p0, La/mu3;->i:B

    iput-boolean p4, p0, La/mu3;->k:Z

    iput-object p3, p0, La/mu3;->n:Ljava/lang/Object;

    iput-boolean p5, p0, La/mu3;->l:Z

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method

.method public constructor <init>(La/yje;La/ge10;La/odd;ZZ)V
    .locals 1

    const/4 v0, 0x6

    iput-byte v0, p0, La/mu3;->i:B

    .line 21
    iput-object p2, p0, La/mu3;->m:Ljava/lang/Object;

    iput-object p3, p0, La/mu3;->n:Ljava/lang/Object;

    iput-boolean p4, p0, La/mu3;->k:Z

    iput-boolean p5, p0, La/mu3;->l:Z

    const/4 p2, 0x2

    invoke-direct {p0, p2, p1}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method

.method public constructor <init>(La/yje;La/nnp;Ljava/util/List;ZZ)V
    .locals 1

    const/4 v0, 0x3

    iput-byte v0, p0, La/mu3;->i:B

    .line 20
    iput-object p2, p0, La/mu3;->m:Ljava/lang/Object;

    iput-object p3, p0, La/mu3;->n:Ljava/lang/Object;

    iput-boolean p4, p0, La/mu3;->k:Z

    iput-boolean p5, p0, La/mu3;->l:Z

    const/4 p2, 0x2

    invoke-direct {p0, p2, p1}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method

.method public constructor <init>(La/yje;La/zdg0;Lkotlin/jvm/functions/Function2;ZZ)V
    .locals 1

    const/4 v0, 0x1

    iput-byte v0, p0, La/mu3;->i:B

    .line 22
    iput-object p2, p0, La/mu3;->m:Ljava/lang/Object;

    iput-boolean p4, p0, La/mu3;->k:Z

    iput-boolean p5, p0, La/mu3;->l:Z

    iput-object p3, p0, La/mu3;->n:Ljava/lang/Object;

    const/4 p2, 0x2

    invoke-direct {p0, p2, p1}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method

.method public constructor <init>(La/zu3;ZLa/yje;)V
    .locals 1

    const/4 v0, 0x0

    iput-byte v0, p0, La/mu3;->i:B

    .line 19
    iput-object p1, p0, La/mu3;->n:Ljava/lang/Object;

    iput-boolean p2, p0, La/mu3;->l:Z

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method

.method public constructor <init>(ZLa/cb8;ZZLjava/util/Map;La/yje;)V
    .locals 1

    .line 1
    const/4 v0, 0x2

    .line 2
    iput-byte v0, p0, La/mu3;->i:B

    .line 3
    .line 4
    iput-boolean p1, p0, La/mu3;->j:Z

    .line 5
    .line 6
    iput-object p2, p0, La/mu3;->m:Ljava/lang/Object;

    .line 7
    .line 8
    iput-boolean p3, p0, La/mu3;->k:Z

    .line 9
    .line 10
    iput-boolean p4, p0, La/mu3;->l:Z

    .line 11
    .line 12
    iput-object p5, p0, La/mu3;->n:Ljava/lang/Object;

    .line 13
    .line 14
    const/4 p1, 0x2

    .line 15
    invoke-direct {p0, p1, p6}, La/bnn0;-><init>(ILa/yje;)V

    .line 16
    .line 17
    .line 18
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 10

    .line 1
    iget-byte v0, p0, La/mu3;->i:B

    .line 2
    .line 3
    iget-object v1, p0, La/mu3;->n:Ljava/lang/Object;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance v2, La/mu3;

    .line 9
    .line 10
    iget-object p1, p0, La/mu3;->m:Ljava/lang/Object;

    .line 11
    .line 12
    move-object v4, p1

    .line 13
    check-cast v4, La/ge10;

    .line 14
    .line 15
    move-object v5, v1

    .line 16
    check-cast v5, La/odd;

    .line 17
    .line 18
    iget-boolean v6, p0, La/mu3;->k:Z

    .line 19
    .line 20
    iget-boolean v7, p0, La/mu3;->l:Z

    .line 21
    .line 22
    move-object v3, p2

    .line 23
    invoke-direct/range {v2 .. v7}, La/mu3;-><init>(La/yje;La/ge10;La/odd;ZZ)V

    .line 24
    .line 25
    .line 26
    return-object v2

    .line 27
    :pswitch_0
    move-object v4, p2

    .line 28
    new-instance v3, La/mu3;

    .line 29
    .line 30
    iget-boolean v7, p0, La/mu3;->k:Z

    .line 31
    .line 32
    move-object v6, v1

    .line 33
    check-cast v6, La/xzp;

    .line 34
    .line 35
    iget-boolean v8, p0, La/mu3;->l:Z

    .line 36
    .line 37
    move-object v5, v4

    .line 38
    const/4 v4, 0x5

    .line 39
    invoke-direct/range {v3 .. v8}, La/mu3;-><init>(BLa/yje;Ljava/lang/Object;ZZ)V

    .line 40
    .line 41
    .line 42
    iput-object p1, v3, La/mu3;->m:Ljava/lang/Object;

    .line 43
    .line 44
    return-object v3

    .line 45
    :pswitch_1
    move-object v4, p2

    .line 46
    new-instance v3, La/mu3;

    .line 47
    .line 48
    iget-boolean v7, p0, La/mu3;->k:Z

    .line 49
    .line 50
    move-object v6, v1

    .line 51
    check-cast v6, La/rrd;

    .line 52
    .line 53
    iget-boolean v8, p0, La/mu3;->l:Z

    .line 54
    .line 55
    move-object v5, v4

    .line 56
    const/4 v4, 0x4

    .line 57
    invoke-direct/range {v3 .. v8}, La/mu3;-><init>(BLa/yje;Ljava/lang/Object;ZZ)V

    .line 58
    .line 59
    .line 60
    iput-object p1, v3, La/mu3;->m:Ljava/lang/Object;

    .line 61
    .line 62
    return-object v3

    .line 63
    :pswitch_2
    move-object v4, p2

    .line 64
    new-instance v3, La/mu3;

    .line 65
    .line 66
    iget-object p1, p0, La/mu3;->m:Ljava/lang/Object;

    .line 67
    .line 68
    move-object v5, p1

    .line 69
    check-cast v5, La/nnp;

    .line 70
    .line 71
    move-object v6, v1

    .line 72
    check-cast v6, Ljava/util/List;

    .line 73
    .line 74
    iget-boolean v7, p0, La/mu3;->k:Z

    .line 75
    .line 76
    iget-boolean v8, p0, La/mu3;->l:Z

    .line 77
    .line 78
    invoke-direct/range {v3 .. v8}, La/mu3;-><init>(La/yje;La/nnp;Ljava/util/List;ZZ)V

    .line 79
    .line 80
    .line 81
    return-object v3

    .line 82
    :pswitch_3
    move-object v4, p2

    .line 83
    new-instance v3, La/mu3;

    .line 84
    .line 85
    move-object v5, v4

    .line 86
    iget-boolean v4, p0, La/mu3;->j:Z

    .line 87
    .line 88
    iget-object p1, p0, La/mu3;->m:Ljava/lang/Object;

    .line 89
    .line 90
    check-cast p1, La/cb8;

    .line 91
    .line 92
    iget-boolean v6, p0, La/mu3;->k:Z

    .line 93
    .line 94
    iget-boolean v7, p0, La/mu3;->l:Z

    .line 95
    .line 96
    move-object v8, v1

    .line 97
    check-cast v8, Ljava/util/Map;

    .line 98
    .line 99
    move-object v9, v5

    .line 100
    move-object v5, p1

    .line 101
    invoke-direct/range {v3 .. v9}, La/mu3;-><init>(ZLa/cb8;ZZLjava/util/Map;La/yje;)V

    .line 102
    .line 103
    .line 104
    return-object v3

    .line 105
    :pswitch_4
    move-object v4, p2

    .line 106
    new-instance v3, La/mu3;

    .line 107
    .line 108
    iget-object p1, p0, La/mu3;->m:Ljava/lang/Object;

    .line 109
    .line 110
    move-object v5, p1

    .line 111
    check-cast v5, La/zdg0;

    .line 112
    .line 113
    iget-boolean v7, p0, La/mu3;->k:Z

    .line 114
    .line 115
    iget-boolean v8, p0, La/mu3;->l:Z

    .line 116
    .line 117
    move-object v6, v1

    .line 118
    check-cast v6, Lkotlin/jvm/functions/Function2;

    .line 119
    .line 120
    invoke-direct/range {v3 .. v8}, La/mu3;-><init>(La/yje;La/zdg0;Lkotlin/jvm/functions/Function2;ZZ)V

    .line 121
    .line 122
    .line 123
    return-object v3

    .line 124
    :pswitch_5
    move-object v4, p2

    .line 125
    new-instance p1, La/mu3;

    .line 126
    .line 127
    check-cast v1, La/zu3;

    .line 128
    .line 129
    iget-boolean p0, p0, La/mu3;->l:Z

    .line 130
    .line 131
    invoke-direct {p1, v1, p0, v4}, La/mu3;-><init>(La/zu3;ZLa/yje;)V

    .line 132
    .line 133
    .line 134
    return-object p1

    .line 135
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-byte v0, p0, La/mu3;->i:B

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, La/vne;

    .line 7
    .line 8
    check-cast p2, La/yje;

    .line 9
    .line 10
    invoke-virtual {p0, p1, p2}, La/mu3;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, La/mu3;

    .line 15
    .line 16
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, La/mu3;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    check-cast p1, La/kmq;

    .line 24
    .line 25
    check-cast p2, La/yje;

    .line 26
    .line 27
    invoke-virtual {p0, p1, p2}, La/mu3;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    check-cast p0, La/mu3;

    .line 32
    .line 33
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 34
    .line 35
    invoke-virtual {p0, p1}, La/mu3;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    return-object p0

    .line 40
    :pswitch_1
    check-cast p1, La/kmq;

    .line 41
    .line 42
    check-cast p2, La/yje;

    .line 43
    .line 44
    invoke-virtual {p0, p1, p2}, La/mu3;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 45
    .line 46
    .line 47
    move-result-object p0

    .line 48
    check-cast p0, La/mu3;

    .line 49
    .line 50
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 51
    .line 52
    invoke-virtual {p0, p1}, La/mu3;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object p0

    .line 56
    return-object p0

    .line 57
    :pswitch_2
    check-cast p1, La/vne;

    .line 58
    .line 59
    check-cast p2, La/yje;

    .line 60
    .line 61
    invoke-virtual {p0, p1, p2}, La/mu3;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 62
    .line 63
    .line 64
    move-result-object p0

    .line 65
    check-cast p0, La/mu3;

    .line 66
    .line 67
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 68
    .line 69
    invoke-virtual {p0, p1}, La/mu3;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    move-result-object p0

    .line 73
    return-object p0

    .line 74
    :pswitch_3
    check-cast p1, La/vne;

    .line 75
    .line 76
    check-cast p2, La/yje;

    .line 77
    .line 78
    invoke-virtual {p0, p1, p2}, La/mu3;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 79
    .line 80
    .line 81
    move-result-object p0

    .line 82
    check-cast p0, La/mu3;

    .line 83
    .line 84
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 85
    .line 86
    invoke-virtual {p0, p1}, La/mu3;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 87
    .line 88
    .line 89
    move-result-object p0

    .line 90
    return-object p0

    .line 91
    :pswitch_4
    check-cast p1, La/vne;

    .line 92
    .line 93
    check-cast p2, La/yje;

    .line 94
    .line 95
    invoke-virtual {p0, p1, p2}, La/mu3;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 96
    .line 97
    .line 98
    move-result-object p0

    .line 99
    check-cast p0, La/mu3;

    .line 100
    .line 101
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 102
    .line 103
    invoke-virtual {p0, p1}, La/mu3;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 104
    .line 105
    .line 106
    move-result-object p0

    .line 107
    return-object p0

    .line 108
    :pswitch_5
    check-cast p1, La/vne;

    .line 109
    .line 110
    check-cast p2, La/yje;

    .line 111
    .line 112
    invoke-virtual {p0, p1, p2}, La/mu3;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 113
    .line 114
    .line 115
    move-result-object p0

    .line 116
    check-cast p0, La/mu3;

    .line 117
    .line 118
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 119
    .line 120
    invoke-virtual {p0, p1}, La/mu3;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 121
    .line 122
    .line 123
    move-result-object p0

    .line 124
    return-object p0

    .line 125
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 31

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/mu3;->i:B

    .line 4
    .line 5
    const/16 v2, 0x17

    .line 6
    .line 7
    const/4 v3, 0x6

    .line 8
    const/4 v5, 0x3

    .line 9
    const/16 v6, 0x16

    .line 10
    .line 11
    const/4 v7, 0x0

    .line 12
    const/4 v8, 0x0

    .line 13
    const/4 v9, 0x1

    .line 14
    packed-switch v1, :pswitch_data_0

    .line 15
    .line 16
    .line 17
    iget-boolean v1, v0, La/mu3;->k:Z

    .line 18
    .line 19
    iget-object v2, v0, La/mu3;->n:Ljava/lang/Object;

    .line 20
    .line 21
    check-cast v2, La/odd;

    .line 22
    .line 23
    iget-object v4, v0, La/mu3;->m:Ljava/lang/Object;

    .line 24
    .line 25
    check-cast v4, La/ge10;

    .line 26
    .line 27
    sget-object v5, La/wne;->a:La/wne;

    .line 28
    .line 29
    iget-boolean v6, v0, La/mu3;->j:Z

    .line 30
    .line 31
    if-eqz v6, :cond_1

    .line 32
    .line 33
    if-ne v6, v9, :cond_0

    .line 34
    .line 35
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 36
    .line 37
    .line 38
    move-object/from16 v6, p1

    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_0
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 42
    .line 43
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    goto/16 :goto_4

    .line 47
    .line 48
    :cond_1
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 49
    .line 50
    .line 51
    iget-object v6, v4, La/ge10;->i:La/jzj;

    .line 52
    .line 53
    if-eqz v6, :cond_3

    .line 54
    .line 55
    iput-boolean v9, v0, La/mu3;->j:Z

    .line 56
    .line 57
    invoke-interface {v6, v0}, La/jzj;->await(La/yje;)Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    move-result-object v6

    .line 61
    if-ne v6, v5, :cond_2

    .line 62
    .line 63
    move-object v8, v5

    .line 64
    goto/16 :goto_4

    .line 65
    .line 66
    :cond_2
    :goto_0
    check-cast v6, Ljava/lang/Boolean;

    .line 67
    .line 68
    invoke-virtual {v6}, Ljava/lang/Boolean;->booleanValue()Z

    .line 69
    .line 70
    .line 71
    move-result v5

    .line 72
    goto :goto_1

    .line 73
    :cond_3
    move v5, v7

    .line 74
    :goto_1
    const/4 v6, -0x1

    .line 75
    if-eqz v5, :cond_4

    .line 76
    .line 77
    iget-object v0, v4, La/ge10;->f:La/hy40;

    .line 78
    .line 79
    invoke-virtual {v4, v0, v6}, La/ge10;->c(La/hy40;I)V

    .line 80
    .line 81
    .line 82
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 83
    .line 84
    const-string v1, "Low Light Boost is disabled when expected frame rate range exceeds 30."

    .line 85
    .line 86
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 87
    .line 88
    .line 89
    invoke-virtual {v2, v0}, La/odd;->b0(Ljava/lang/Throwable;)Z

    .line 90
    .line 91
    .line 92
    goto :goto_3

    .line 93
    :cond_4
    iput-boolean v1, v4, La/ge10;->e:Z

    .line 94
    .line 95
    if-nez v1, :cond_5

    .line 96
    .line 97
    iget-object v5, v4, La/ge10;->f:La/hy40;

    .line 98
    .line 99
    invoke-virtual {v4, v5, v6}, La/ge10;->c(La/hy40;I)V

    .line 100
    .line 101
    .line 102
    :cond_5
    iget-object v5, v4, La/ge10;->c:La/pot0;

    .line 103
    .line 104
    if-eqz v5, :cond_b

    .line 105
    .line 106
    if-eqz v1, :cond_6

    .line 107
    .line 108
    iget-object v5, v4, La/ge10;->f:La/hy40;

    .line 109
    .line 110
    invoke-virtual {v4, v5, v7}, La/ge10;->c(La/hy40;I)V

    .line 111
    .line 112
    .line 113
    :cond_6
    iget-boolean v0, v0, La/mu3;->l:Z

    .line 114
    .line 115
    iget-object v5, v4, La/ge10;->h:La/odd;

    .line 116
    .line 117
    if-eqz v0, :cond_8

    .line 118
    .line 119
    if-eqz v5, :cond_7

    .line 120
    .line 121
    const-string v0, "There is a new enableLowLightBoost being set"

    .line 122
    .line 123
    invoke-static {v0, v5}, La/dw9;->z(Ljava/lang/String;La/odd;)V

    .line 124
    .line 125
    .line 126
    :cond_7
    iput-object v8, v4, La/ge10;->h:La/odd;

    .line 127
    .line 128
    goto :goto_2

    .line 129
    :cond_8
    if-eqz v5, :cond_9

    .line 130
    .line 131
    invoke-static {v2, v5}, La/vzb;->g0(La/jzj;La/ndd;)V

    .line 132
    .line 133
    .line 134
    :cond_9
    :goto_2
    iput-object v2, v4, La/ge10;->h:La/odd;

    .line 135
    .line 136
    iget-object v0, v4, La/ge10;->a:La/i7m0;

    .line 137
    .line 138
    if-eqz v1, :cond_a

    .line 139
    .line 140
    new-instance v8, Ljava/lang/Integer;

    .line 141
    .line 142
    invoke-direct {v8, v3}, Ljava/lang/Integer;-><init>(I)V

    .line 143
    .line 144
    .line 145
    :cond_a
    iget-object v1, v0, La/i7m0;->d:Ljava/lang/Object;

    .line 146
    .line 147
    monitor-enter v1

    .line 148
    :try_start_0
    iput-object v8, v0, La/i7m0;->k:Ljava/lang/Integer;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 149
    .line 150
    monitor-exit v1

    .line 151
    invoke-virtual {v0}, La/i7m0;->f()La/odd;

    .line 152
    .line 153
    .line 154
    move-result-object v0

    .line 155
    invoke-static {v0, v2}, La/vzb;->g0(La/jzj;La/ndd;)V

    .line 156
    .line 157
    .line 158
    new-instance v0, La/ygy;

    .line 159
    .line 160
    const/16 v1, 0xc

    .line 161
    .line 162
    invoke-direct {v0, v2, v4, v1}, La/ygy;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 163
    .line 164
    .line 165
    invoke-virtual {v2, v0}, La/pby;->invokeOnCompletion(Lkotlin/jvm/functions/Function1;)La/nwk;

    .line 166
    .line 167
    .line 168
    goto :goto_3

    .line 169
    :catchall_0
    move-exception v0

    .line 170
    monitor-exit v1

    .line 171
    throw v0

    .line 172
    :cond_b
    const-string v0, "Camera is not active."

    .line 173
    .line 174
    invoke-static {v0, v2}, La/dw9;->z(Ljava/lang/String;La/odd;)V

    .line 175
    .line 176
    .line 177
    :goto_3
    sget-object v8, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 178
    .line 179
    :goto_4
    return-object v8

    .line 180
    :pswitch_0
    iget-boolean v1, v0, La/mu3;->l:Z

    .line 181
    .line 182
    iget-boolean v3, v0, La/mu3;->k:Z

    .line 183
    .line 184
    iget-object v10, v0, La/mu3;->n:Ljava/lang/Object;

    .line 185
    .line 186
    check-cast v10, La/xzp;

    .line 187
    .line 188
    iget-object v11, v0, La/mu3;->m:Ljava/lang/Object;

    .line 189
    .line 190
    check-cast v11, La/kmq;

    .line 191
    .line 192
    sget-object v12, La/wne;->a:La/wne;

    .line 193
    .line 194
    iget-boolean v13, v0, La/mu3;->j:Z

    .line 195
    .line 196
    if-eqz v13, :cond_d

    .line 197
    .line 198
    if-ne v13, v9, :cond_c

    .line 199
    .line 200
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 201
    .line 202
    .line 203
    goto/16 :goto_5

    .line 204
    .line 205
    :cond_c
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 206
    .line 207
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 208
    .line 209
    .line 210
    goto/16 :goto_6

    .line 211
    .line 212
    :cond_d
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 213
    .line 214
    .line 215
    if-eqz v3, :cond_e

    .line 216
    .line 217
    iget-object v13, v10, La/xzp;->f:Ljava/lang/Object;

    .line 218
    .line 219
    check-cast v13, La/yqc;

    .line 220
    .line 221
    sget-object v14, La/y9s;->d:La/y9s;

    .line 222
    .line 223
    invoke-virtual {v13, v14}, La/yqc;->w(La/y9s;)V

    .line 224
    .line 225
    .line 226
    :cond_e
    iget-object v13, v10, La/xzp;->e:Ljava/lang/Object;

    .line 227
    .line 228
    check-cast v13, La/cmt;

    .line 229
    .line 230
    sget-object v14, La/y9s;->d:La/y9s;

    .line 231
    .line 232
    iget-object v13, v13, La/cmt;->b:Ljava/lang/Object;

    .line 233
    .line 234
    check-cast v13, La/w5z;

    .line 235
    .line 236
    invoke-virtual {v13, v14}, La/w5z;->r(La/y9s;)La/gmq;

    .line 237
    .line 238
    .line 239
    move-result-object v13

    .line 240
    new-instance v14, La/tqu;

    .line 241
    .line 242
    invoke-direct {v14, v10, v8, v7}, La/tqu;-><init>(La/xzp;La/yje;B)V

    .line 243
    .line 244
    .line 245
    new-instance v15, La/oz0;

    .line 246
    .line 247
    const/16 v4, 0xe

    .line 248
    .line 249
    invoke-direct {v15, v5, v8, v4}, La/oz0;-><init>(ILa/yje;B)V

    .line 250
    .line 251
    .line 252
    invoke-static {v13, v14, v15}, La/uvw;->O(La/gmq;Lkotlin/jvm/functions/Function1;La/xdr;)La/a1g;

    .line 253
    .line 254
    .line 255
    move-result-object v4

    .line 256
    new-instance v5, La/i89;

    .line 257
    .line 258
    invoke-direct {v5, v4, v6}, La/i89;-><init>(La/gmq;B)V

    .line 259
    .line 260
    .line 261
    new-instance v4, La/i89;

    .line 262
    .line 263
    invoke-direct {v4, v5, v2}, La/i89;-><init>(La/gmq;B)V

    .line 264
    .line 265
    .line 266
    new-instance v2, La/wqu;

    .line 267
    .line 268
    invoke-direct {v2, v8, v10, v1, v7}, La/wqu;-><init>(La/yje;La/xzp;ZB)V

    .line 269
    .line 270
    .line 271
    invoke-static {v4, v2}, La/aoq;->c(La/gmq;La/xdr;)La/utb;

    .line 272
    .line 273
    .line 274
    move-result-object v2

    .line 275
    new-instance v4, La/hie0;

    .line 276
    .line 277
    invoke-direct {v4}, Ljava/lang/Object;-><init>()V

    .line 278
    .line 279
    .line 280
    iput-boolean v3, v4, La/hie0;->a:Z

    .line 281
    .line 282
    iget-object v3, v10, La/xzp;->a:Ljava/lang/Object;

    .line 283
    .line 284
    check-cast v3, La/dgu;

    .line 285
    .line 286
    new-instance v5, La/u5u;

    .line 287
    .line 288
    const/4 v13, 0x4

    .line 289
    invoke-direct {v5, v3, v8, v13}, La/u5u;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 290
    .line 291
    .line 292
    new-instance v3, La/vsg0;

    .line 293
    .line 294
    invoke-direct {v3, v5}, La/vsg0;-><init>(Lkotlin/jvm/functions/Function2;)V

    .line 295
    .line 296
    .line 297
    new-instance v5, La/qqu;

    .line 298
    .line 299
    invoke-direct {v5, v3, v4, v9}, La/qqu;-><init>(La/vsg0;La/hie0;B)V

    .line 300
    .line 301
    .line 302
    new-instance v3, La/lqu;

    .line 303
    .line 304
    invoke-direct {v3, v4, v9}, La/lqu;-><init>(La/hie0;B)V

    .line 305
    .line 306
    .line 307
    new-instance v4, La/tqu;

    .line 308
    .line 309
    invoke-direct {v4, v10, v8, v9}, La/tqu;-><init>(La/xzp;La/yje;B)V

    .line 310
    .line 311
    .line 312
    new-instance v13, La/ko0;

    .line 313
    .line 314
    const/16 v14, 0x14

    .line 315
    .line 316
    invoke-direct {v13, v10, v8, v14}, La/ko0;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 317
    .line 318
    .line 319
    new-instance v14, La/t3t;

    .line 320
    .line 321
    const/4 v15, 0x7

    .line 322
    invoke-direct {v14, v10, v15}, La/t3t;-><init>(Ljava/lang/Object;B)V

    .line 323
    .line 324
    .line 325
    const/16 v23, 0x8

    .line 326
    .line 327
    const-wide/16 v18, 0x8

    .line 328
    .line 329
    move-object/from16 v17, v3

    .line 330
    .line 331
    move-object/from16 v20, v4

    .line 332
    .line 333
    move-object/from16 v16, v5

    .line 334
    .line 335
    move-object/from16 v21, v13

    .line 336
    .line 337
    move-object/from16 v22, v14

    .line 338
    .line 339
    invoke-static/range {v16 .. v23}, La/uvw;->P(La/gmq;Lkotlin/jvm/functions/Function0;JLkotlin/jvm/functions/Function1;La/xdr;Lkotlin/jvm/functions/Function1;I)La/a1g;

    .line 340
    .line 341
    .line 342
    move-result-object v3

    .line 343
    new-instance v4, La/i89;

    .line 344
    .line 345
    invoke-direct {v4, v3, v6}, La/i89;-><init>(La/gmq;B)V

    .line 346
    .line 347
    .line 348
    new-instance v3, La/wqu;

    .line 349
    .line 350
    invoke-direct {v3, v8, v10, v1, v9}, La/wqu;-><init>(La/yje;La/xzp;ZB)V

    .line 351
    .line 352
    .line 353
    invoke-static {v4, v3}, La/aoq;->c(La/gmq;La/xdr;)La/utb;

    .line 354
    .line 355
    .line 356
    move-result-object v1

    .line 357
    const/4 v3, 0x2

    .line 358
    new-array v3, v3, [La/gmq;

    .line 359
    .line 360
    aput-object v1, v3, v7

    .line 361
    .line 362
    aput-object v2, v3, v9

    .line 363
    .line 364
    invoke-static {v3}, La/aoq;->b([La/gmq;)La/ltb;

    .line 365
    .line 366
    .line 367
    move-result-object v1

    .line 368
    iput-object v8, v0, La/mu3;->m:Ljava/lang/Object;

    .line 369
    .line 370
    iput-boolean v9, v0, La/mu3;->j:Z

    .line 371
    .line 372
    invoke-static {v11, v1, v0}, La/slb;->Q(La/kmq;La/gmq;La/yje;)Ljava/lang/Object;

    .line 373
    .line 374
    .line 375
    move-result-object v0

    .line 376
    if-ne v0, v12, :cond_f

    .line 377
    .line 378
    move-object v8, v12

    .line 379
    goto :goto_6

    .line 380
    :cond_f
    :goto_5
    sget-object v8, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 381
    .line 382
    :goto_6
    return-object v8

    .line 383
    :pswitch_1
    iget-boolean v1, v0, La/mu3;->l:Z

    .line 384
    .line 385
    iget-boolean v4, v0, La/mu3;->k:Z

    .line 386
    .line 387
    iget-object v10, v0, La/mu3;->n:Ljava/lang/Object;

    .line 388
    .line 389
    check-cast v10, La/rrd;

    .line 390
    .line 391
    iget-object v11, v0, La/mu3;->m:Ljava/lang/Object;

    .line 392
    .line 393
    check-cast v11, La/kmq;

    .line 394
    .line 395
    sget-object v12, La/wne;->a:La/wne;

    .line 396
    .line 397
    iget-boolean v13, v0, La/mu3;->j:Z

    .line 398
    .line 399
    if-eqz v13, :cond_11

    .line 400
    .line 401
    if-ne v13, v9, :cond_10

    .line 402
    .line 403
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 404
    .line 405
    .line 406
    goto/16 :goto_7

    .line 407
    .line 408
    :cond_10
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 409
    .line 410
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 411
    .line 412
    .line 413
    goto/16 :goto_8

    .line 414
    .line 415
    :cond_11
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 416
    .line 417
    .line 418
    if-eqz v4, :cond_12

    .line 419
    .line 420
    iget-object v8, v10, La/rrd;->f:Ljava/lang/Object;

    .line 421
    .line 422
    check-cast v8, La/yqc;

    .line 423
    .line 424
    sget-object v13, La/y9s;->c:La/y9s;

    .line 425
    .line 426
    invoke-virtual {v8, v13}, La/yqc;->w(La/y9s;)V

    .line 427
    .line 428
    .line 429
    :cond_12
    iget-object v8, v10, La/rrd;->g:Ljava/lang/Object;

    .line 430
    .line 431
    check-cast v8, La/cmt;

    .line 432
    .line 433
    sget-object v13, La/y9s;->c:La/y9s;

    .line 434
    .line 435
    iget-object v8, v8, La/cmt;->b:Ljava/lang/Object;

    .line 436
    .line 437
    check-cast v8, La/w5z;

    .line 438
    .line 439
    invoke-virtual {v8, v13}, La/w5z;->r(La/y9s;)La/gmq;

    .line 440
    .line 441
    .line 442
    move-result-object v8

    .line 443
    new-instance v13, La/mqu;

    .line 444
    .line 445
    const/4 v14, 0x0

    .line 446
    invoke-direct {v13, v10, v14, v7}, La/mqu;-><init>(La/rrd;La/yje;B)V

    .line 447
    .line 448
    .line 449
    new-instance v15, La/oz0;

    .line 450
    .line 451
    const/16 v3, 0xd

    .line 452
    .line 453
    invoke-direct {v15, v5, v14, v3}, La/oz0;-><init>(ILa/yje;B)V

    .line 454
    .line 455
    .line 456
    invoke-static {v8, v13, v15}, La/uvw;->O(La/gmq;Lkotlin/jvm/functions/Function1;La/xdr;)La/a1g;

    .line 457
    .line 458
    .line 459
    move-result-object v3

    .line 460
    new-instance v5, La/i89;

    .line 461
    .line 462
    invoke-direct {v5, v3, v6}, La/i89;-><init>(La/gmq;B)V

    .line 463
    .line 464
    .line 465
    new-instance v3, La/i89;

    .line 466
    .line 467
    invoke-direct {v3, v5, v2}, La/i89;-><init>(La/gmq;B)V

    .line 468
    .line 469
    .line 470
    new-instance v2, La/rqu;

    .line 471
    .line 472
    invoke-direct {v2, v14, v10, v1, v7}, La/rqu;-><init>(La/yje;La/rrd;ZB)V

    .line 473
    .line 474
    .line 475
    invoke-static {v3, v2}, La/aoq;->c(La/gmq;La/xdr;)La/utb;

    .line 476
    .line 477
    .line 478
    move-result-object v2

    .line 479
    new-instance v3, La/hie0;

    .line 480
    .line 481
    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    .line 482
    .line 483
    .line 484
    iput-boolean v4, v3, La/hie0;->a:Z

    .line 485
    .line 486
    iget-object v4, v10, La/rrd;->i:Ljava/lang/Object;

    .line 487
    .line 488
    check-cast v4, La/viu;

    .line 489
    .line 490
    invoke-virtual {v4}, La/viu;->a()J

    .line 491
    .line 492
    .line 493
    move-result-wide v4

    .line 494
    invoke-static {v4, v5}, La/ynq0;->f(J)J

    .line 495
    .line 496
    .line 497
    move-result-wide v18

    .line 498
    iget-object v4, v10, La/rrd;->b:Ljava/lang/Object;

    .line 499
    .line 500
    move-object/from16 v17, v4

    .line 501
    .line 502
    check-cast v17, La/f7u;

    .line 503
    .line 504
    new-instance v16, La/ir;

    .line 505
    .line 506
    const/16 v21, 0xf

    .line 507
    .line 508
    move-object/from16 v20, v14

    .line 509
    .line 510
    invoke-direct/range {v16 .. v21}, La/ir;-><init>(Ljava/lang/Object;JLa/yje;B)V

    .line 511
    .line 512
    .line 513
    move-object/from16 v4, v16

    .line 514
    .line 515
    move-object/from16 v5, v20

    .line 516
    .line 517
    new-instance v8, La/vsg0;

    .line 518
    .line 519
    invoke-direct {v8, v4}, La/vsg0;-><init>(Lkotlin/jvm/functions/Function2;)V

    .line 520
    .line 521
    .line 522
    new-instance v4, La/qqu;

    .line 523
    .line 524
    invoke-direct {v4, v8, v3, v7}, La/qqu;-><init>(La/vsg0;La/hie0;B)V

    .line 525
    .line 526
    .line 527
    new-instance v8, La/lqu;

    .line 528
    .line 529
    invoke-direct {v8, v3, v7}, La/lqu;-><init>(La/hie0;B)V

    .line 530
    .line 531
    .line 532
    new-instance v3, La/mqu;

    .line 533
    .line 534
    invoke-direct {v3, v10, v5, v9}, La/mqu;-><init>(La/rrd;La/yje;B)V

    .line 535
    .line 536
    .line 537
    new-instance v13, La/ko0;

    .line 538
    .line 539
    const/16 v14, 0x13

    .line 540
    .line 541
    invoke-direct {v13, v10, v5, v14}, La/ko0;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 542
    .line 543
    .line 544
    new-instance v14, La/t3t;

    .line 545
    .line 546
    const/4 v15, 0x6

    .line 547
    invoke-direct {v14, v10, v15}, La/t3t;-><init>(Ljava/lang/Object;B)V

    .line 548
    .line 549
    .line 550
    const/16 v30, 0x8

    .line 551
    .line 552
    const-wide/16 v25, 0x1e

    .line 553
    .line 554
    move-object/from16 v27, v3

    .line 555
    .line 556
    move-object/from16 v23, v4

    .line 557
    .line 558
    move-object/from16 v24, v8

    .line 559
    .line 560
    move-object/from16 v28, v13

    .line 561
    .line 562
    move-object/from16 v29, v14

    .line 563
    .line 564
    invoke-static/range {v23 .. v30}, La/uvw;->P(La/gmq;Lkotlin/jvm/functions/Function0;JLkotlin/jvm/functions/Function1;La/xdr;Lkotlin/jvm/functions/Function1;I)La/a1g;

    .line 565
    .line 566
    .line 567
    move-result-object v3

    .line 568
    new-instance v4, La/i89;

    .line 569
    .line 570
    invoke-direct {v4, v3, v6}, La/i89;-><init>(La/gmq;B)V

    .line 571
    .line 572
    .line 573
    new-instance v3, La/rqu;

    .line 574
    .line 575
    invoke-direct {v3, v5, v10, v1, v9}, La/rqu;-><init>(La/yje;La/rrd;ZB)V

    .line 576
    .line 577
    .line 578
    invoke-static {v4, v3}, La/aoq;->c(La/gmq;La/xdr;)La/utb;

    .line 579
    .line 580
    .line 581
    move-result-object v1

    .line 582
    const/4 v3, 0x2

    .line 583
    new-array v3, v3, [La/gmq;

    .line 584
    .line 585
    aput-object v1, v3, v7

    .line 586
    .line 587
    aput-object v2, v3, v9

    .line 588
    .line 589
    invoke-static {v3}, La/aoq;->b([La/gmq;)La/ltb;

    .line 590
    .line 591
    .line 592
    move-result-object v1

    .line 593
    iput-object v5, v0, La/mu3;->m:Ljava/lang/Object;

    .line 594
    .line 595
    iput-boolean v9, v0, La/mu3;->j:Z

    .line 596
    .line 597
    invoke-static {v11, v1, v0}, La/slb;->Q(La/kmq;La/gmq;La/yje;)Ljava/lang/Object;

    .line 598
    .line 599
    .line 600
    move-result-object v0

    .line 601
    if-ne v0, v12, :cond_13

    .line 602
    .line 603
    move-object v8, v12

    .line 604
    goto :goto_8

    .line 605
    :cond_13
    :goto_7
    sget-object v8, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 606
    .line 607
    :goto_8
    return-object v8

    .line 608
    :pswitch_2
    iget-object v1, v0, La/mu3;->m:Ljava/lang/Object;

    .line 609
    .line 610
    move-object v4, v1

    .line 611
    check-cast v4, La/nnp;

    .line 612
    .line 613
    sget-object v1, La/wne;->a:La/wne;

    .line 614
    .line 615
    iget-boolean v2, v0, La/mu3;->j:Z

    .line 616
    .line 617
    if-eqz v2, :cond_15

    .line 618
    .line 619
    if-ne v2, v9, :cond_14

    .line 620
    .line 621
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 622
    .line 623
    .line 624
    goto :goto_9

    .line 625
    :cond_14
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 626
    .line 627
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 628
    .line 629
    .line 630
    goto :goto_a

    .line 631
    :cond_15
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 632
    .line 633
    .line 634
    iget-object v2, v4, La/nnp;->z:La/dxt;

    .line 635
    .line 636
    iget-object v2, v2, La/dxt;->a:La/lef0;

    .line 637
    .line 638
    iget-object v2, v2, La/lef0;->a:Ljava/lang/Object;

    .line 639
    .line 640
    check-cast v2, La/m8l0;

    .line 641
    .line 642
    iget-object v2, v2, La/m8l0;->f:La/p7m0;

    .line 643
    .line 644
    invoke-static {v2}, La/vtb;->N(La/qz40;)La/xae0;

    .line 645
    .line 646
    .line 647
    move-result-object v10

    .line 648
    iget-object v2, v0, La/mu3;->n:Ljava/lang/Object;

    .line 649
    .line 650
    move-object v5, v2

    .line 651
    check-cast v5, Ljava/util/List;

    .line 652
    .line 653
    iget-boolean v6, v0, La/mu3;->k:Z

    .line 654
    .line 655
    iget-boolean v7, v0, La/mu3;->l:Z

    .line 656
    .line 657
    new-instance v2, La/dnp;

    .line 658
    .line 659
    const/4 v3, 0x0

    .line 660
    invoke-direct/range {v2 .. v7}, La/dnp;-><init>(La/yje;La/nnp;Ljava/util/List;ZZ)V

    .line 661
    .line 662
    .line 663
    invoke-static {v10, v2}, La/aoq;->c(La/gmq;La/xdr;)La/utb;

    .line 664
    .line 665
    .line 666
    move-result-object v2

    .line 667
    new-instance v3, La/rj;

    .line 668
    .line 669
    const/16 v5, 0x1a

    .line 670
    .line 671
    invoke-direct {v3, v4, v8, v5}, La/rj;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 672
    .line 673
    .line 674
    new-instance v4, La/dnq;

    .line 675
    .line 676
    invoke-direct {v4, v2, v3, v9}, La/dnq;-><init>(La/gmq;La/xdr;B)V

    .line 677
    .line 678
    .line 679
    iput-boolean v9, v0, La/mu3;->j:Z

    .line 680
    .line 681
    invoke-static {v4, v0}, La/slb;->N(La/gmq;La/yje;)Ljava/lang/Object;

    .line 682
    .line 683
    .line 684
    move-result-object v0

    .line 685
    if-ne v0, v1, :cond_16

    .line 686
    .line 687
    move-object v8, v1

    .line 688
    goto :goto_a

    .line 689
    :cond_16
    :goto_9
    sget-object v8, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 690
    .line 691
    :goto_a
    return-object v8

    .line 692
    :pswitch_3
    iget-object v1, v0, La/mu3;->n:Ljava/lang/Object;

    .line 693
    .line 694
    check-cast v1, Ljava/util/Map;

    .line 695
    .line 696
    iget-object v2, v0, La/mu3;->m:Ljava/lang/Object;

    .line 697
    .line 698
    check-cast v2, La/cb8;

    .line 699
    .line 700
    sget-object v3, La/wne;->a:La/wne;

    .line 701
    .line 702
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 703
    .line 704
    .line 705
    iget-boolean v3, v0, La/mu3;->j:Z

    .line 706
    .line 707
    if-eqz v3, :cond_19

    .line 708
    .line 709
    invoke-virtual {v2}, La/cb8;->a()Z

    .line 710
    .line 711
    .line 712
    move-result v3

    .line 713
    iget-object v4, v2, La/cb8;->d:La/pz40;

    .line 714
    .line 715
    iget-object v5, v2, La/cb8;->e:La/pz40;

    .line 716
    .line 717
    if-nez v3, :cond_19

    .line 718
    .line 719
    iget-boolean v3, v0, La/mu3;->k:Z

    .line 720
    .line 721
    if-eqz v3, :cond_17

    .line 722
    .line 723
    iget-object v3, v2, La/cb8;->g:La/pz40;

    .line 724
    .line 725
    sget-object v6, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 726
    .line 727
    check-cast v3, La/hgk0;

    .line 728
    .line 729
    invoke-virtual {v3, v6}, La/hgk0;->setValue(Ljava/lang/Object;)V

    .line 730
    .line 731
    .line 732
    :cond_17
    iget-boolean v0, v0, La/mu3;->l:Z

    .line 733
    .line 734
    if-eqz v0, :cond_18

    .line 735
    .line 736
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 737
    .line 738
    .line 739
    check-cast v5, La/hgk0;

    .line 740
    .line 741
    invoke-virtual {v5, v1}, La/hgk0;->setValue(Ljava/lang/Object;)V

    .line 742
    .line 743
    .line 744
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 745
    .line 746
    check-cast v4, La/hgk0;

    .line 747
    .line 748
    invoke-virtual {v4, v0}, La/hgk0;->setValue(Ljava/lang/Object;)V

    .line 749
    .line 750
    .line 751
    sget-object v1, La/k73;->a:La/k73;

    .line 752
    .line 753
    iget-object v3, v2, La/cb8;->a:La/pz40;

    .line 754
    .line 755
    check-cast v3, La/hgk0;

    .line 756
    .line 757
    invoke-virtual {v3, v1}, La/hgk0;->setValue(Ljava/lang/Object;)V

    .line 758
    .line 759
    .line 760
    iget-object v1, v2, La/cb8;->b:La/cgk0;

    .line 761
    .line 762
    invoke-virtual {v1, v7}, La/cgk0;->m(I)V

    .line 763
    .line 764
    .line 765
    iget-object v1, v2, La/cb8;->c:La/pz40;

    .line 766
    .line 767
    check-cast v1, La/hgk0;

    .line 768
    .line 769
    invoke-virtual {v1, v0}, La/hgk0;->setValue(Ljava/lang/Object;)V

    .line 770
    .line 771
    .line 772
    iget-object v0, v2, La/cb8;->f:La/pz40;

    .line 773
    .line 774
    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 775
    .line 776
    check-cast v0, La/hgk0;

    .line 777
    .line 778
    invoke-virtual {v0, v1}, La/hgk0;->setValue(Ljava/lang/Object;)V

    .line 779
    .line 780
    .line 781
    iget-object v0, v2, La/cb8;->h:La/cgk0;

    .line 782
    .line 783
    invoke-virtual {v0, v7}, La/cgk0;->m(I)V

    .line 784
    .line 785
    .line 786
    goto :goto_b

    .line 787
    :cond_18
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 788
    .line 789
    .line 790
    check-cast v5, La/hgk0;

    .line 791
    .line 792
    invoke-virtual {v5, v1}, La/hgk0;->setValue(Ljava/lang/Object;)V

    .line 793
    .line 794
    .line 795
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 796
    .line 797
    check-cast v4, La/hgk0;

    .line 798
    .line 799
    invoke-virtual {v4, v0}, La/hgk0;->setValue(Ljava/lang/Object;)V

    .line 800
    .line 801
    .line 802
    :cond_19
    :goto_b
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 803
    .line 804
    return-object v0

    .line 805
    :pswitch_4
    sget-object v1, La/wne;->a:La/wne;

    .line 806
    .line 807
    iget-boolean v2, v0, La/mu3;->j:Z

    .line 808
    .line 809
    if-eqz v2, :cond_1b

    .line 810
    .line 811
    if-ne v2, v9, :cond_1a

    .line 812
    .line 813
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 814
    .line 815
    .line 816
    move-object/from16 v0, p1

    .line 817
    .line 818
    goto :goto_c

    .line 819
    :cond_1a
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 820
    .line 821
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 822
    .line 823
    .line 824
    move-object v0, v8

    .line 825
    goto :goto_c

    .line 826
    :cond_1b
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 827
    .line 828
    .line 829
    iget-object v2, v0, La/mu3;->m:Ljava/lang/Object;

    .line 830
    .line 831
    move-object v5, v2

    .line 832
    check-cast v5, La/zdg0;

    .line 833
    .line 834
    iget-boolean v8, v0, La/mu3;->k:Z

    .line 835
    .line 836
    iget-boolean v7, v0, La/mu3;->l:Z

    .line 837
    .line 838
    iget-object v2, v0, La/mu3;->n:Ljava/lang/Object;

    .line 839
    .line 840
    move-object v6, v2

    .line 841
    check-cast v6, Lkotlin/jvm/functions/Function2;

    .line 842
    .line 843
    new-instance v3, La/lyh;

    .line 844
    .line 845
    const/4 v4, 0x0

    .line 846
    invoke-direct/range {v3 .. v8}, La/lyh;-><init>(La/yje;La/zdg0;Lkotlin/jvm/functions/Function2;ZZ)V

    .line 847
    .line 848
    .line 849
    iput-boolean v9, v0, La/mu3;->j:Z

    .line 850
    .line 851
    invoke-virtual {v5, v8, v3, v0}, La/zdg0;->h(ZLkotlin/jvm/functions/Function2;La/zje;)Ljava/lang/Object;

    .line 852
    .line 853
    .line 854
    move-result-object v0

    .line 855
    if-ne v0, v1, :cond_1c

    .line 856
    .line 857
    move-object v0, v1

    .line 858
    :cond_1c
    :goto_c
    return-object v0

    .line 859
    :pswitch_5
    iget-object v1, v0, La/mu3;->n:Ljava/lang/Object;

    .line 860
    .line 861
    check-cast v1, La/zu3;

    .line 862
    .line 863
    sget-object v2, La/wne;->a:La/wne;

    .line 864
    .line 865
    iget-boolean v3, v0, La/mu3;->k:Z

    .line 866
    .line 867
    if-eqz v3, :cond_1e

    .line 868
    .line 869
    if-ne v3, v9, :cond_1d

    .line 870
    .line 871
    iget-boolean v2, v0, La/mu3;->j:Z

    .line 872
    .line 873
    iget-object v0, v0, La/mu3;->m:Ljava/lang/Object;

    .line 874
    .line 875
    check-cast v0, La/cgk;

    .line 876
    .line 877
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 878
    .line 879
    .line 880
    move-object v3, v0

    .line 881
    move-object/from16 v0, p1

    .line 882
    .line 883
    goto :goto_d

    .line 884
    :cond_1d
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 885
    .line 886
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 887
    .line 888
    .line 889
    goto/16 :goto_1b

    .line 890
    .line 891
    :cond_1e
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 892
    .line 893
    .line 894
    iget-object v3, v1, La/zu3;->d0:La/z7z;

    .line 895
    .line 896
    invoke-interface {v3}, La/z7z;->get()Ljava/lang/Object;

    .line 897
    .line 898
    .line 899
    move-result-object v3

    .line 900
    check-cast v3, La/cgk;

    .line 901
    .line 902
    iget-boolean v4, v0, La/mu3;->l:Z

    .line 903
    .line 904
    iget-object v6, v1, La/zu3;->f0:La/z7z;

    .line 905
    .line 906
    invoke-interface {v6}, La/z7z;->get()Ljava/lang/Object;

    .line 907
    .line 908
    .line 909
    move-result-object v6

    .line 910
    check-cast v6, La/dgk;

    .line 911
    .line 912
    iput-object v3, v0, La/mu3;->m:Ljava/lang/Object;

    .line 913
    .line 914
    iput-boolean v4, v0, La/mu3;->j:Z

    .line 915
    .line 916
    iput-boolean v9, v0, La/mu3;->k:Z

    .line 917
    .line 918
    invoke-virtual {v6, v7, v0}, La/dgk;->a(ZLa/bnn0;)Ljava/lang/Object;

    .line 919
    .line 920
    .line 921
    move-result-object v0

    .line 922
    if-ne v0, v2, :cond_1f

    .line 923
    .line 924
    move-object v8, v2

    .line 925
    goto/16 :goto_1b

    .line 926
    .line 927
    :cond_1f
    move v2, v4

    .line 928
    :goto_d
    check-cast v0, Ljava/lang/Boolean;

    .line 929
    .line 930
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 931
    .line 932
    .line 933
    move-result v0

    .line 934
    const-string v4, "tablet"

    .line 935
    .line 936
    const-string v6, "other"

    .line 937
    .line 938
    const-string v10, "phone"

    .line 939
    .line 940
    const-string v11, "foldable"

    .line 941
    .line 942
    iget-object v12, v3, La/cgk;->b:La/a1d;

    .line 943
    .line 944
    iget-object v12, v12, La/a1d;->b:Ljava/lang/Object;

    .line 945
    .line 946
    check-cast v12, La/tgk;

    .line 947
    .line 948
    invoke-virtual {v12}, La/tgk;->d()Ljava/lang/String;

    .line 949
    .line 950
    .line 951
    move-result-object v13

    .line 952
    invoke-virtual {v13}, Ljava/lang/String;->hashCode()I

    .line 953
    .line 954
    .line 955
    move-result v14

    .line 956
    sparse-switch v14, :sswitch_data_0

    .line 957
    .line 958
    .line 959
    goto :goto_e

    .line 960
    :sswitch_0
    invoke-virtual {v13, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 961
    .line 962
    .line 963
    move-result v13

    .line 964
    if-nez v13, :cond_20

    .line 965
    .line 966
    goto :goto_e

    .line 967
    :cond_20
    sget-object v13, La/ugk;->c:La/ugk;

    .line 968
    .line 969
    goto :goto_f

    .line 970
    :sswitch_1
    invoke-virtual {v13, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 971
    .line 972
    .line 973
    move-result v13

    .line 974
    if-nez v13, :cond_21

    .line 975
    .line 976
    goto :goto_e

    .line 977
    :cond_21
    sget-object v13, La/ugk;->a:La/ugk;

    .line 978
    .line 979
    goto :goto_f

    .line 980
    :sswitch_2
    invoke-virtual {v13, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 981
    .line 982
    .line 983
    move-result v13

    .line 984
    if-nez v13, :cond_22

    .line 985
    .line 986
    goto :goto_e

    .line 987
    :cond_22
    sget-object v13, La/ugk;->d:La/ugk;

    .line 988
    .line 989
    goto :goto_f

    .line 990
    :sswitch_3
    invoke-virtual {v13, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 991
    .line 992
    .line 993
    move-result v13

    .line 994
    if-nez v13, :cond_23

    .line 995
    .line 996
    :goto_e
    move-object v13, v8

    .line 997
    goto :goto_f

    .line 998
    :cond_23
    sget-object v13, La/ugk;->b:La/ugk;

    .line 999
    .line 1000
    :goto_f
    if-eqz v13, :cond_24

    .line 1001
    .line 1002
    goto/16 :goto_1a

    .line 1003
    .line 1004
    :cond_24
    iget-object v3, v3, La/cgk;->a:La/vgk;

    .line 1005
    .line 1006
    iget-object v3, v3, La/vgk;->a:La/us00;

    .line 1007
    .line 1008
    if-nez v2, :cond_33

    .line 1009
    .line 1010
    if-nez v0, :cond_28

    .line 1011
    .line 1012
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 1013
    .line 1014
    const/16 v2, 0x1e

    .line 1015
    .line 1016
    if-lt v0, v2, :cond_28

    .line 1017
    .line 1018
    const-string v0, "sensor"

    .line 1019
    .line 1020
    invoke-virtual {v3, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 1021
    .line 1022
    .line 1023
    move-result-object v0

    .line 1024
    instance-of v2, v0, Landroid/hardware/SensorManager;

    .line 1025
    .line 1026
    if-eqz v2, :cond_25

    .line 1027
    .line 1028
    check-cast v0, Landroid/hardware/SensorManager;

    .line 1029
    .line 1030
    goto :goto_10

    .line 1031
    :cond_25
    move-object v0, v8

    .line 1032
    :goto_10
    if-eqz v0, :cond_26

    .line 1033
    .line 1034
    const/16 v2, 0x24

    .line 1035
    .line 1036
    invoke-virtual {v0, v2}, Landroid/hardware/SensorManager;->getDefaultSensor(I)Landroid/hardware/Sensor;

    .line 1037
    .line 1038
    .line 1039
    move-result-object v0

    .line 1040
    goto :goto_11

    .line 1041
    :cond_26
    move-object v0, v8

    .line 1042
    :goto_11
    if-eqz v0, :cond_27

    .line 1043
    .line 1044
    goto :goto_12

    .line 1045
    :cond_27
    invoke-virtual {v3}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 1046
    .line 1047
    .line 1048
    move-result-object v0

    .line 1049
    const-string v2, "android.hardware.sensor.hinge_angle"

    .line 1050
    .line 1051
    invoke-virtual {v0, v2}, Landroid/content/pm/PackageManager;->hasSystemFeature(Ljava/lang/String;)Z

    .line 1052
    .line 1053
    .line 1054
    move-result v0

    .line 1055
    if-eqz v0, :cond_28

    .line 1056
    .line 1057
    :goto_12
    invoke-static {}, La/sto;->a()I

    .line 1058
    .line 1059
    .line 1060
    move-result v0

    .line 1061
    if-lt v0, v9, :cond_28

    .line 1062
    .line 1063
    goto/16 :goto_17

    .line 1064
    .line 1065
    :cond_28
    sget-object v0, Landroid/os/Build;->MODEL:Ljava/lang/String;

    .line 1066
    .line 1067
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1068
    .line 1069
    .line 1070
    sget-object v2, Ljava/util/Locale;->ENGLISH:Ljava/util/Locale;

    .line 1071
    .line 1072
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1073
    .line 1074
    .line 1075
    invoke-virtual {v0, v2}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 1076
    .line 1077
    .line 1078
    move-result-object v0

    .line 1079
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1080
    .line 1081
    .line 1082
    sget-object v2, La/vgk;->d:Ljava/util/List;

    .line 1083
    .line 1084
    if-eqz v2, :cond_29

    .line 1085
    .line 1086
    invoke-interface {v2}, Ljava/util/Collection;->isEmpty()Z

    .line 1087
    .line 1088
    .line 1089
    move-result v13

    .line 1090
    if-eqz v13, :cond_29

    .line 1091
    .line 1092
    goto :goto_13

    .line 1093
    :cond_29
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 1094
    .line 1095
    .line 1096
    move-result-object v2

    .line 1097
    :cond_2a
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 1098
    .line 1099
    .line 1100
    move-result v13

    .line 1101
    if-eqz v13, :cond_2b

    .line 1102
    .line 1103
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1104
    .line 1105
    .line 1106
    move-result-object v13

    .line 1107
    check-cast v13, Ljava/lang/String;

    .line 1108
    .line 1109
    invoke-static {v0, v13, v7}, Lkotlin/text/StringsKt;->O(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 1110
    .line 1111
    .line 1112
    move-result v13

    .line 1113
    if-eqz v13, :cond_2a

    .line 1114
    .line 1115
    goto/16 :goto_17

    .line 1116
    .line 1117
    :cond_2b
    :goto_13
    const-string v0, "android"

    .line 1118
    .line 1119
    const-string v2, "config_displayFeatures"

    .line 1120
    .line 1121
    :try_start_1
    invoke-virtual {v3}, La/us00;->getResources()Landroid/content/res/Resources;

    .line 1122
    .line 1123
    .line 1124
    move-result-object v13

    .line 1125
    const-string v14, "string"

    .line 1126
    .line 1127
    invoke-virtual {v13, v2, v14, v0}, Landroid/content/res/Resources;->getIdentifier(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I

    .line 1128
    .line 1129
    .line 1130
    move-result v13

    .line 1131
    if-nez v13, :cond_2c

    .line 1132
    .line 1133
    move v13, v7

    .line 1134
    goto :goto_14

    .line 1135
    :cond_2c
    invoke-virtual {v3}, La/us00;->getResources()Landroid/content/res/Resources;

    .line 1136
    .line 1137
    .line 1138
    move-result-object v14

    .line 1139
    invoke-virtual {v14, v13}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    .line 1140
    .line 1141
    .line 1142
    move-result-object v13

    .line 1143
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1144
    .line 1145
    .line 1146
    invoke-static {v13}, La/vgk;->a(Ljava/lang/String;)Z

    .line 1147
    .line 1148
    .line 1149
    move-result v13

    .line 1150
    :goto_14
    if-nez v13, :cond_33

    .line 1151
    .line 1152
    invoke-virtual {v3}, La/us00;->getResources()Landroid/content/res/Resources;

    .line 1153
    .line 1154
    .line 1155
    move-result-object v13

    .line 1156
    const-string v14, "array"

    .line 1157
    .line 1158
    invoke-virtual {v13, v2, v14, v0}, Landroid/content/res/Resources;->getIdentifier(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I

    .line 1159
    .line 1160
    .line 1161
    move-result v0

    .line 1162
    if-nez v0, :cond_2d

    .line 1163
    .line 1164
    goto :goto_16

    .line 1165
    :cond_2d
    invoke-virtual {v3}, La/us00;->getResources()Landroid/content/res/Resources;

    .line 1166
    .line 1167
    .line 1168
    move-result-object v2

    .line 1169
    invoke-virtual {v2, v0}, Landroid/content/res/Resources;->getStringArray(I)[Ljava/lang/String;

    .line 1170
    .line 1171
    .line 1172
    move-result-object v0

    .line 1173
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1174
    .line 1175
    .line 1176
    array-length v2, v0

    .line 1177
    :goto_15
    if-ge v7, v2, :cond_2f

    .line 1178
    .line 1179
    aget-object v13, v0, v7

    .line 1180
    .line 1181
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1182
    .line 1183
    .line 1184
    invoke-static {v13}, La/vgk;->a(Ljava/lang/String;)Z

    .line 1185
    .line 1186
    .line 1187
    move-result v13
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    .line 1188
    if-eqz v13, :cond_2e

    .line 1189
    .line 1190
    goto :goto_17

    .line 1191
    :cond_2e
    add-int/lit8 v7, v7, 0x1

    .line 1192
    .line 1193
    goto :goto_15

    .line 1194
    :catch_0
    :cond_2f
    :goto_16
    invoke-virtual {v3}, La/us00;->getResources()Landroid/content/res/Resources;

    .line 1195
    .line 1196
    .line 1197
    move-result-object v0

    .line 1198
    invoke-virtual {v0}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    .line 1199
    .line 1200
    .line 1201
    move-result-object v0

    .line 1202
    iget v2, v0, Landroid/content/res/Configuration;->uiMode:I

    .line 1203
    .line 1204
    and-int/lit8 v2, v2, 0xf

    .line 1205
    .line 1206
    invoke-virtual {v3}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 1207
    .line 1208
    .line 1209
    move-result-object v3

    .line 1210
    const-string v7, "android.hardware.type.pc"

    .line 1211
    .line 1212
    invoke-virtual {v3, v7}, Landroid/content/pm/PackageManager;->hasSystemFeature(Ljava/lang/String;)Z

    .line 1213
    .line 1214
    .line 1215
    move-result v3

    .line 1216
    if-eqz v3, :cond_30

    .line 1217
    .line 1218
    sget-object v0, La/ugk;->d:La/ugk;

    .line 1219
    .line 1220
    goto :goto_18

    .line 1221
    :cond_30
    sget-object v3, La/vgk;->b:Ljava/util/Set;

    .line 1222
    .line 1223
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1224
    .line 1225
    .line 1226
    move-result-object v2

    .line 1227
    invoke-interface {v3, v2}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 1228
    .line 1229
    .line 1230
    move-result v2

    .line 1231
    if-eqz v2, :cond_31

    .line 1232
    .line 1233
    sget-object v0, La/ugk;->d:La/ugk;

    .line 1234
    .line 1235
    goto :goto_18

    .line 1236
    :cond_31
    iget v0, v0, Landroid/content/res/Configuration;->smallestScreenWidthDp:I

    .line 1237
    .line 1238
    const/16 v2, 0x258

    .line 1239
    .line 1240
    if-lt v0, v2, :cond_32

    .line 1241
    .line 1242
    sget-object v0, La/ugk;->b:La/ugk;

    .line 1243
    .line 1244
    goto :goto_18

    .line 1245
    :cond_32
    sget-object v0, La/ugk;->a:La/ugk;

    .line 1246
    .line 1247
    goto :goto_18

    .line 1248
    :cond_33
    :goto_17
    sget-object v0, La/ugk;->c:La/ugk;

    .line 1249
    .line 1250
    :goto_18
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    .line 1251
    .line 1252
    .line 1253
    move-result v0

    .line 1254
    if-eqz v0, :cond_36

    .line 1255
    .line 1256
    if-eq v0, v9, :cond_37

    .line 1257
    .line 1258
    const/4 v3, 0x2

    .line 1259
    if-eq v0, v3, :cond_35

    .line 1260
    .line 1261
    if-ne v0, v5, :cond_34

    .line 1262
    .line 1263
    move-object v4, v6

    .line 1264
    goto :goto_19

    .line 1265
    :cond_34
    invoke-static {}, La/t9f;->b()V

    .line 1266
    .line 1267
    .line 1268
    goto :goto_1b

    .line 1269
    :cond_35
    move-object v4, v11

    .line 1270
    goto :goto_19

    .line 1271
    :cond_36
    move-object v4, v10

    .line 1272
    :cond_37
    :goto_19
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1273
    .line 1274
    .line 1275
    iput-object v4, v12, La/tgk;->l:Ljava/lang/String;

    .line 1276
    .line 1277
    iget-object v0, v12, La/tgk;->b:La/q7d0;

    .line 1278
    .line 1279
    const-string v2, "DEVICE_FORM_FACTOR"

    .line 1280
    .line 1281
    invoke-virtual {v0, v2, v4}, La/q7d0;->g(Ljava/lang/String;Ljava/lang/String;)V

    .line 1282
    .line 1283
    .line 1284
    :goto_1a
    iget-object v0, v1, La/zu3;->e0:La/z7z;

    .line 1285
    .line 1286
    invoke-interface {v0}, La/z7z;->get()Ljava/lang/Object;

    .line 1287
    .line 1288
    .line 1289
    move-result-object v0

    .line 1290
    check-cast v0, La/b5u;

    .line 1291
    .line 1292
    iget-object v0, v0, La/b5u;->a:La/a1d;

    .line 1293
    .line 1294
    iget-object v0, v0, La/a1d;->b:Ljava/lang/Object;

    .line 1295
    .line 1296
    check-cast v0, La/tgk;

    .line 1297
    .line 1298
    invoke-virtual {v0}, La/tgk;->d()Ljava/lang/String;

    .line 1299
    .line 1300
    .line 1301
    move-result-object v0

    .line 1302
    invoke-static {v0}, Lkotlin/text/StringsKt;->W(Ljava/lang/CharSequence;)Z

    .line 1303
    .line 1304
    .line 1305
    move-result v2

    .line 1306
    if-nez v2, :cond_38

    .line 1307
    .line 1308
    move-object v8, v0

    .line 1309
    :cond_38
    if-eqz v8, :cond_39

    .line 1310
    .line 1311
    iget-object v0, v1, La/zu3;->i:La/z7z;

    .line 1312
    .line 1313
    invoke-interface {v0}, La/z7z;->get()Ljava/lang/Object;

    .line 1314
    .line 1315
    .line 1316
    move-result-object v0

    .line 1317
    check-cast v0, La/zgk;

    .line 1318
    .line 1319
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1320
    .line 1321
    .line 1322
    iget-object v0, v0, La/zgk;->a:La/kt2;

    .line 1323
    .line 1324
    const-string v1, "device_form_factor"

    .line 1325
    .line 1326
    invoke-interface {v0, v1, v8}, La/kt2;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 1327
    .line 1328
    .line 1329
    :cond_39
    sget-object v8, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1330
    .line 1331
    :goto_1b
    return-object v8

    .line 1332
    nop

    .line 1333
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch

    .line 1334
    .line 1335
    .line 1336
    .line 1337
    .line 1338
    .line 1339
    .line 1340
    .line 1341
    .line 1342
    .line 1343
    .line 1344
    .line 1345
    .line 1346
    .line 1347
    .line 1348
    .line 1349
    :sswitch_data_0
    .sparse-switch
        -0x3488c19a -> :sswitch_3
        0x6527f10 -> :sswitch_2
        0x65b3d6e -> :sswitch_1
        0x1185b8db -> :sswitch_0
    .end sparse-switch
.end method
