.class public final La/dj3;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public j:Z

.field public k:Ljava/lang/Object;

.field public l:Ljava/lang/Object;

.field public m:Ljava/lang/Object;

.field public n:Ljava/lang/Object;

.field public o:Ljava/lang/Object;

.field public p:Ljava/lang/Object;

.field public synthetic q:Ljava/lang/Object;

.field public r:Ljava/lang/Object;


# direct methods
.method public constructor <init>(La/ij3;La/yje;)V
    .locals 1

    const/4 v0, 0x0

    iput-byte v0, p0, La/dj3;->i:B

    .line 4
    iput-object p1, p0, La/dj3;->p:Ljava/lang/Object;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method

.method public constructor <init>(La/r2w;La/n3w;La/yje;)V
    .locals 1

    const/4 v0, 0x3

    iput-byte v0, p0, La/dj3;->i:B

    .line 3
    iput-object p1, p0, La/dj3;->q:Ljava/lang/Object;

    iput-object p2, p0, La/dj3;->r:Ljava/lang/Object;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method

.method public constructor <init>(La/rrd;Ljava/lang/String;La/tw2;La/yje;)V
    .locals 1

    const/4 v0, 0x1

    iput-byte v0, p0, La/dj3;->i:B

    .line 2
    iput-object p1, p0, La/dj3;->p:Ljava/lang/Object;

    iput-object p2, p0, La/dj3;->q:Ljava/lang/Object;

    iput-object p3, p0, La/dj3;->r:Ljava/lang/Object;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p4}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;La/yje;B)V
    .locals 0

    .line 1
    iput-byte p10, p0, La/dj3;->i:B

    iput-object p1, p0, La/dj3;->l:Ljava/lang/Object;

    iput-object p2, p0, La/dj3;->m:Ljava/lang/Object;

    iput-object p3, p0, La/dj3;->n:Ljava/lang/Object;

    iput-object p4, p0, La/dj3;->o:Ljava/lang/Object;

    iput-object p5, p0, La/dj3;->p:Ljava/lang/Object;

    iput-object p6, p0, La/dj3;->k:Ljava/lang/Object;

    iput-object p7, p0, La/dj3;->q:Ljava/lang/Object;

    iput-object p8, p0, La/dj3;->r:Ljava/lang/Object;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p9}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 13

    .line 1
    iget-byte v0, p0, La/dj3;->i:B

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    new-instance v1, La/dj3;

    .line 7
    .line 8
    iget-object p1, p0, La/dj3;->l:Ljava/lang/Object;

    .line 9
    .line 10
    move-object v2, p1

    .line 11
    check-cast v2, La/clz;

    .line 12
    .line 13
    iget-object p1, p0, La/dj3;->m:Ljava/lang/Object;

    .line 14
    .line 15
    move-object v3, p1

    .line 16
    check-cast v3, La/l7m0;

    .line 17
    .line 18
    iget-object p1, p0, La/dj3;->n:Ljava/lang/Object;

    .line 19
    .line 20
    move-object v4, p1

    .line 21
    check-cast v4, La/roq0;

    .line 22
    .line 23
    iget-object p1, p0, La/dj3;->o:Ljava/lang/Object;

    .line 24
    .line 25
    move-object v5, p1

    .line 26
    check-cast v5, La/lme0;

    .line 27
    .line 28
    iget-object p1, p0, La/dj3;->p:Ljava/lang/Object;

    .line 29
    .line 30
    move-object v6, p1

    .line 31
    check-cast v6, Landroidx/fragment/app/Fragment;

    .line 32
    .line 33
    iget-object p1, p0, La/dj3;->k:Ljava/lang/Object;

    .line 34
    .line 35
    move-object v7, p1

    .line 36
    check-cast v7, Lkotlin/jvm/functions/Function1;

    .line 37
    .line 38
    iget-object p1, p0, La/dj3;->q:Ljava/lang/Object;

    .line 39
    .line 40
    move-object v8, p1

    .line 41
    check-cast v8, Lkotlin/jvm/functions/Function0;

    .line 42
    .line 43
    iget-object p0, p0, La/dj3;->r:Ljava/lang/Object;

    .line 44
    .line 45
    move-object v9, p0

    .line 46
    check-cast v9, Lkotlin/jvm/functions/Function0;

    .line 47
    .line 48
    const/4 v11, 0x4

    .line 49
    move-object v10, p2

    .line 50
    invoke-direct/range {v1 .. v11}, La/dj3;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;La/yje;B)V

    .line 51
    .line 52
    .line 53
    return-object v1

    .line 54
    :pswitch_0
    move-object v10, p2

    .line 55
    new-instance p1, La/dj3;

    .line 56
    .line 57
    iget-object p2, p0, La/dj3;->q:Ljava/lang/Object;

    .line 58
    .line 59
    check-cast p2, La/r2w;

    .line 60
    .line 61
    iget-object p0, p0, La/dj3;->r:Ljava/lang/Object;

    .line 62
    .line 63
    check-cast p0, La/n3w;

    .line 64
    .line 65
    invoke-direct {p1, p2, p0, v10}, La/dj3;-><init>(La/r2w;La/n3w;La/yje;)V

    .line 66
    .line 67
    .line 68
    return-object p1

    .line 69
    :pswitch_1
    move-object v10, p2

    .line 70
    new-instance v2, La/dj3;

    .line 71
    .line 72
    iget-object p1, p0, La/dj3;->l:Ljava/lang/Object;

    .line 73
    .line 74
    move-object v3, p1

    .line 75
    check-cast v3, Lkotlin/jvm/functions/Function0;

    .line 76
    .line 77
    iget-object p1, p0, La/dj3;->m:Ljava/lang/Object;

    .line 78
    .line 79
    move-object v4, p1

    .line 80
    check-cast v4, Ljava/util/List;

    .line 81
    .line 82
    iget-object p1, p0, La/dj3;->n:Ljava/lang/Object;

    .line 83
    .line 84
    move-object v5, p1

    .line 85
    check-cast v5, La/w6k;

    .line 86
    .line 87
    iget-object p1, p0, La/dj3;->o:Ljava/lang/Object;

    .line 88
    .line 89
    move-object v6, p1

    .line 90
    check-cast v6, Ljava/util/List;

    .line 91
    .line 92
    iget-object p1, p0, La/dj3;->p:Ljava/lang/Object;

    .line 93
    .line 94
    move-object v7, p1

    .line 95
    check-cast v7, La/pz40;

    .line 96
    .line 97
    iget-object p1, p0, La/dj3;->k:Ljava/lang/Object;

    .line 98
    .line 99
    move-object v8, p1

    .line 100
    check-cast v8, La/pz40;

    .line 101
    .line 102
    iget-object p1, p0, La/dj3;->q:Ljava/lang/Object;

    .line 103
    .line 104
    move-object v9, p1

    .line 105
    check-cast v9, La/cgk0;

    .line 106
    .line 107
    iget-object p0, p0, La/dj3;->r:Ljava/lang/Object;

    .line 108
    .line 109
    check-cast p0, La/pz40;

    .line 110
    .line 111
    const/4 v12, 0x2

    .line 112
    move-object v11, v10

    .line 113
    move-object v10, p0

    .line 114
    invoke-direct/range {v2 .. v12}, La/dj3;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;La/yje;B)V

    .line 115
    .line 116
    .line 117
    return-object v2

    .line 118
    :pswitch_2
    move-object v10, p2

    .line 119
    new-instance p2, La/dj3;

    .line 120
    .line 121
    iget-object v0, p0, La/dj3;->p:Ljava/lang/Object;

    .line 122
    .line 123
    check-cast v0, La/rrd;

    .line 124
    .line 125
    iget-object v1, p0, La/dj3;->q:Ljava/lang/Object;

    .line 126
    .line 127
    check-cast v1, Ljava/lang/String;

    .line 128
    .line 129
    iget-object p0, p0, La/dj3;->r:Ljava/lang/Object;

    .line 130
    .line 131
    check-cast p0, La/tw2;

    .line 132
    .line 133
    invoke-direct {p2, v0, v1, p0, v10}, La/dj3;-><init>(La/rrd;Ljava/lang/String;La/tw2;La/yje;)V

    .line 134
    .line 135
    .line 136
    iput-object p1, p2, La/dj3;->k:Ljava/lang/Object;

    .line 137
    .line 138
    return-object p2

    .line 139
    :pswitch_3
    move-object v10, p2

    .line 140
    new-instance p2, La/dj3;

    .line 141
    .line 142
    iget-object p0, p0, La/dj3;->p:Ljava/lang/Object;

    .line 143
    .line 144
    check-cast p0, La/ij3;

    .line 145
    .line 146
    invoke-direct {p2, p0, v10}, La/dj3;-><init>(La/ij3;La/yje;)V

    .line 147
    .line 148
    .line 149
    iput-object p1, p2, La/dj3;->q:Ljava/lang/Object;

    .line 150
    .line 151
    return-object p2

    .line 152
    nop

    .line 153
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-byte v0, p0, La/dj3;->i:B

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
    invoke-virtual {p0, p1, p2}, La/dj3;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, La/dj3;

    .line 15
    .line 16
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, La/dj3;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    check-cast p1, La/vne;

    .line 24
    .line 25
    check-cast p2, La/yje;

    .line 26
    .line 27
    invoke-virtual {p0, p1, p2}, La/dj3;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    check-cast p0, La/dj3;

    .line 32
    .line 33
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 34
    .line 35
    invoke-virtual {p0, p1}, La/dj3;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    return-object p0

    .line 40
    :pswitch_1
    check-cast p1, La/vne;

    .line 41
    .line 42
    check-cast p2, La/yje;

    .line 43
    .line 44
    invoke-virtual {p0, p1, p2}, La/dj3;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 45
    .line 46
    .line 47
    move-result-object p0

    .line 48
    check-cast p0, La/dj3;

    .line 49
    .line 50
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 51
    .line 52
    invoke-virtual {p0, p1}, La/dj3;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    invoke-virtual {p0, p1, p2}, La/dj3;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 62
    .line 63
    .line 64
    move-result-object p0

    .line 65
    check-cast p0, La/dj3;

    .line 66
    .line 67
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 68
    .line 69
    invoke-virtual {p0, p1}, La/dj3;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    move-result-object p0

    .line 73
    return-object p0

    .line 74
    :pswitch_3
    check-cast p1, La/arq;

    .line 75
    .line 76
    check-cast p2, La/yje;

    .line 77
    .line 78
    invoke-virtual {p0, p1, p2}, La/dj3;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 79
    .line 80
    .line 81
    move-result-object p0

    .line 82
    check-cast p0, La/dj3;

    .line 83
    .line 84
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 85
    .line 86
    invoke-virtual {p0, p1}, La/dj3;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 87
    .line 88
    .line 89
    move-result-object p0

    .line 90
    return-object p0

    .line 91
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 26

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/dj3;->i:B

    .line 4
    .line 5
    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 6
    .line 7
    const/4 v3, 0x0

    .line 8
    const/4 v4, 0x1

    .line 9
    packed-switch v1, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    sget-object v1, La/wne;->a:La/wne;

    .line 13
    .line 14
    iget-boolean v5, v0, La/dj3;->j:Z

    .line 15
    .line 16
    if-eqz v5, :cond_1

    .line 17
    .line 18
    if-ne v5, v4, :cond_0

    .line 19
    .line 20
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

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
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 29
    .line 30
    .line 31
    iget-object v2, v0, La/dj3;->l:Ljava/lang/Object;

    .line 32
    .line 33
    check-cast v2, La/clz;

    .line 34
    .line 35
    sget-object v3, La/lkz;->e:La/lkz;

    .line 36
    .line 37
    new-instance v5, La/s6d;

    .line 38
    .line 39
    iget-object v6, v0, La/dj3;->m:Ljava/lang/Object;

    .line 40
    .line 41
    check-cast v6, La/l7m0;

    .line 42
    .line 43
    iget-object v7, v0, La/dj3;->n:Ljava/lang/Object;

    .line 44
    .line 45
    check-cast v7, La/roq0;

    .line 46
    .line 47
    iget-object v8, v0, La/dj3;->o:Ljava/lang/Object;

    .line 48
    .line 49
    check-cast v8, La/lme0;

    .line 50
    .line 51
    iget-object v9, v0, La/dj3;->p:Ljava/lang/Object;

    .line 52
    .line 53
    check-cast v9, Landroidx/fragment/app/Fragment;

    .line 54
    .line 55
    iget-object v10, v0, La/dj3;->k:Ljava/lang/Object;

    .line 56
    .line 57
    check-cast v10, Lkotlin/jvm/functions/Function1;

    .line 58
    .line 59
    iget-object v11, v0, La/dj3;->q:Ljava/lang/Object;

    .line 60
    .line 61
    check-cast v11, Lkotlin/jvm/functions/Function0;

    .line 62
    .line 63
    iget-object v12, v0, La/dj3;->r:Ljava/lang/Object;

    .line 64
    .line 65
    check-cast v12, Lkotlin/jvm/functions/Function0;

    .line 66
    .line 67
    const/4 v13, 0x0

    .line 68
    const/16 v14, 0x8

    .line 69
    .line 70
    invoke-direct/range {v5 .. v14}, La/s6d;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;La/yje;B)V

    .line 71
    .line 72
    .line 73
    iput-boolean v4, v0, La/dj3;->j:Z

    .line 74
    .line 75
    invoke-interface {v2}, La/clz;->x()La/glz;

    .line 76
    .line 77
    .line 78
    move-result-object v2

    .line 79
    invoke-static {v2, v3, v5, v0}, La/efx;->H(La/glz;La/lkz;Lkotlin/jvm/functions/Function2;La/bnn0;)Ljava/lang/Object;

    .line 80
    .line 81
    .line 82
    move-result-object v0

    .line 83
    if-ne v0, v1, :cond_2

    .line 84
    .line 85
    goto :goto_0

    .line 86
    :cond_2
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 87
    .line 88
    :goto_0
    if-ne v0, v1, :cond_3

    .line 89
    .line 90
    move-object v3, v1

    .line 91
    goto :goto_2

    .line 92
    :cond_3
    :goto_1
    sget-object v3, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 93
    .line 94
    :goto_2
    return-object v3

    .line 95
    :pswitch_0
    sget-object v1, La/wne;->a:La/wne;

    .line 96
    .line 97
    iget-boolean v5, v0, La/dj3;->j:Z

    .line 98
    .line 99
    if-eqz v5, :cond_5

    .line 100
    .line 101
    if-ne v5, v4, :cond_4

    .line 102
    .line 103
    iget-object v2, v0, La/dj3;->p:Ljava/lang/Object;

    .line 104
    .line 105
    check-cast v2, La/d3w;

    .line 106
    .line 107
    iget-object v3, v0, La/dj3;->o:Ljava/lang/Object;

    .line 108
    .line 109
    check-cast v3, La/n3w;

    .line 110
    .line 111
    iget-object v5, v0, La/dj3;->k:Ljava/lang/Object;

    .line 112
    .line 113
    iget-object v6, v0, La/dj3;->m:Ljava/lang/Object;

    .line 114
    .line 115
    check-cast v6, La/r2w;

    .line 116
    .line 117
    iget-object v7, v0, La/dj3;->l:Ljava/lang/Object;

    .line 118
    .line 119
    check-cast v7, La/n3w;

    .line 120
    .line 121
    iget-object v8, v0, La/dj3;->n:Ljava/lang/Object;

    .line 122
    .line 123
    check-cast v8, La/p7m0;

    .line 124
    .line 125
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 126
    .line 127
    .line 128
    move-object v9, v8

    .line 129
    move-object v8, v2

    .line 130
    move-object v2, v9

    .line 131
    move-object v9, v3

    .line 132
    move-object v3, v7

    .line 133
    move-object/from16 v7, p1

    .line 134
    .line 135
    goto :goto_4

    .line 136
    :cond_4
    invoke-static {v2}, La/jf4;->n(Ljava/lang/String;)V

    .line 137
    .line 138
    .line 139
    goto :goto_5

    .line 140
    :cond_5
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 141
    .line 142
    .line 143
    iget-object v2, v0, La/dj3;->q:Ljava/lang/Object;

    .line 144
    .line 145
    check-cast v2, La/r2w;

    .line 146
    .line 147
    iget-object v3, v2, La/r2w;->y:La/p7m0;

    .line 148
    .line 149
    iget-object v5, v0, La/dj3;->r:Ljava/lang/Object;

    .line 150
    .line 151
    check-cast v5, La/n3w;

    .line 152
    .line 153
    move-object v6, v2

    .line 154
    move-object v8, v3

    .line 155
    move-object v3, v5

    .line 156
    :goto_3
    invoke-virtual {v8}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 157
    .line 158
    .line 159
    move-result-object v5

    .line 160
    move-object v2, v5

    .line 161
    check-cast v2, La/d3w;

    .line 162
    .line 163
    iget-object v7, v6, La/r2w;->h:La/h3c;

    .line 164
    .line 165
    iput-object v8, v0, La/dj3;->n:Ljava/lang/Object;

    .line 166
    .line 167
    iput-object v3, v0, La/dj3;->l:Ljava/lang/Object;

    .line 168
    .line 169
    iput-object v6, v0, La/dj3;->m:Ljava/lang/Object;

    .line 170
    .line 171
    iput-object v5, v0, La/dj3;->k:Ljava/lang/Object;

    .line 172
    .line 173
    iput-object v3, v0, La/dj3;->o:Ljava/lang/Object;

    .line 174
    .line 175
    iput-object v2, v0, La/dj3;->p:Ljava/lang/Object;

    .line 176
    .line 177
    iput-boolean v4, v0, La/dj3;->j:Z

    .line 178
    .line 179
    iget-object v7, v7, La/h3c;->a:La/sjl0;

    .line 180
    .line 181
    invoke-virtual {v7, v0}, La/sjl0;->d(La/zje;)Ljava/io/Serializable;

    .line 182
    .line 183
    .line 184
    move-result-object v7

    .line 185
    if-ne v7, v1, :cond_6

    .line 186
    .line 187
    move-object v3, v1

    .line 188
    goto :goto_5

    .line 189
    :cond_6
    move-object v9, v8

    .line 190
    move-object v8, v2

    .line 191
    move-object v2, v9

    .line 192
    move-object v9, v3

    .line 193
    :goto_4
    move-object v10, v7

    .line 194
    check-cast v10, Ljava/util/List;

    .line 195
    .line 196
    const/4 v15, 0x0

    .line 197
    const/16 v16, 0xe2

    .line 198
    .line 199
    const/4 v11, 0x0

    .line 200
    const/4 v12, 0x0

    .line 201
    const-wide/16 v13, 0x0

    .line 202
    .line 203
    invoke-static/range {v8 .. v16}, La/d3w;->a(La/d3w;La/n3w;Ljava/util/List;ZZJZI)La/d3w;

    .line 204
    .line 205
    .line 206
    move-result-object v7

    .line 207
    invoke-virtual {v2, v5, v7}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 208
    .line 209
    .line 210
    move-result v5

    .line 211
    if-eqz v5, :cond_7

    .line 212
    .line 213
    sget-object v3, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 214
    .line 215
    :goto_5
    return-object v3

    .line 216
    :cond_7
    move-object v8, v2

    .line 217
    goto :goto_3

    .line 218
    :pswitch_1
    iget-object v1, v0, La/dj3;->m:Ljava/lang/Object;

    .line 219
    .line 220
    check-cast v1, Ljava/util/List;

    .line 221
    .line 222
    iget-object v5, v0, La/dj3;->p:Ljava/lang/Object;

    .line 223
    .line 224
    check-cast v5, La/pz40;

    .line 225
    .line 226
    sget-object v6, La/wne;->a:La/wne;

    .line 227
    .line 228
    iget-boolean v7, v0, La/dj3;->j:Z

    .line 229
    .line 230
    if-eqz v7, :cond_9

    .line 231
    .line 232
    if-ne v7, v4, :cond_8

    .line 233
    .line 234
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 235
    .line 236
    .line 237
    goto/16 :goto_7

    .line 238
    .line 239
    :cond_8
    invoke-static {v2}, La/jf4;->n(Ljava/lang/String;)V

    .line 240
    .line 241
    .line 242
    goto/16 :goto_8

    .line 243
    .line 244
    :cond_9
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 245
    .line 246
    .line 247
    iget-object v2, v0, La/dj3;->l:Ljava/lang/Object;

    .line 248
    .line 249
    check-cast v2, Lkotlin/jvm/functions/Function0;

    .line 250
    .line 251
    invoke-interface {v2}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    .line 252
    .line 253
    .line 254
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 255
    .line 256
    .line 257
    move-result v2

    .line 258
    const/16 v3, 0x9

    .line 259
    .line 260
    if-le v2, v3, :cond_b

    .line 261
    .line 262
    invoke-static {v1}, La/hkb;->K(Ljava/util/List;)La/kml;

    .line 263
    .line 264
    .line 265
    move-result-object v1

    .line 266
    invoke-interface {v5, v1}, La/pz40;->setValue(Ljava/lang/Object;)V

    .line 267
    .line 268
    .line 269
    iget-object v1, v0, La/dj3;->k:Ljava/lang/Object;

    .line 270
    .line 271
    check-cast v1, La/pz40;

    .line 272
    .line 273
    invoke-interface {v5}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 274
    .line 275
    .line 276
    move-result-object v2

    .line 277
    check-cast v2, La/kml;

    .line 278
    .line 279
    iget-object v2, v2, La/kml;->a:La/i4;

    .line 280
    .line 281
    invoke-interface {v5}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 282
    .line 283
    .line 284
    move-result-object v3

    .line 285
    check-cast v3, La/kml;

    .line 286
    .line 287
    iget-object v3, v3, La/kml;->b:La/i4;

    .line 288
    .line 289
    invoke-static {v2, v3}, Lkotlin/collections/CollectionsKt;->q0(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/ArrayList;

    .line 290
    .line 291
    .line 292
    move-result-object v2

    .line 293
    invoke-interface {v5}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 294
    .line 295
    .line 296
    move-result-object v3

    .line 297
    check-cast v3, La/kml;

    .line 298
    .line 299
    iget-object v3, v3, La/kml;->c:La/i4;

    .line 300
    .line 301
    invoke-static {v2, v3}, Lkotlin/collections/CollectionsKt;->q0(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/ArrayList;

    .line 302
    .line 303
    .line 304
    move-result-object v2

    .line 305
    new-instance v3, Ljava/util/ArrayList;

    .line 306
    .line 307
    const/16 v5, 0xa

    .line 308
    .line 309
    invoke-static {v2, v5}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 310
    .line 311
    .line 312
    move-result v5

    .line 313
    invoke-direct {v3, v5}, Ljava/util/ArrayList;-><init>(I)V

    .line 314
    .line 315
    .line 316
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 317
    .line 318
    .line 319
    move-result-object v2

    .line 320
    :goto_6
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 321
    .line 322
    .line 323
    move-result v5

    .line 324
    if-eqz v5, :cond_a

    .line 325
    .line 326
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 327
    .line 328
    .line 329
    move-result-object v5

    .line 330
    check-cast v5, La/ezh;

    .line 331
    .line 332
    iget-wide v7, v5, La/ezh;->a:J

    .line 333
    .line 334
    invoke-static {v7, v8}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 335
    .line 336
    .line 337
    move-result-object v5

    .line 338
    invoke-virtual {v3, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 339
    .line 340
    .line 341
    goto :goto_6

    .line 342
    :cond_a
    invoke-interface {v1, v3}, La/pz40;->setValue(Ljava/lang/Object;)V

    .line 343
    .line 344
    .line 345
    :cond_b
    iget-object v1, v0, La/dj3;->n:Ljava/lang/Object;

    .line 346
    .line 347
    check-cast v1, La/w6k;

    .line 348
    .line 349
    sget-object v2, La/qmk;->a:La/zcl;

    .line 350
    .line 351
    const/high16 v2, 0x40c00000    # 6.0f

    .line 352
    .line 353
    invoke-interface {v1, v2}, La/w6k;->T(F)I

    .line 354
    .line 355
    .line 356
    move-result v1

    .line 357
    iget-object v2, v0, La/dj3;->q:Ljava/lang/Object;

    .line 358
    .line 359
    check-cast v2, La/cgk0;

    .line 360
    .line 361
    invoke-virtual {v2}, La/cgk0;->l()I

    .line 362
    .line 363
    .line 364
    move-result v2

    .line 365
    add-int/2addr v2, v1

    .line 366
    if-gtz v2, :cond_c

    .line 367
    .line 368
    sget-object v3, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 369
    .line 370
    goto :goto_8

    .line 371
    :cond_c
    iget-object v1, v0, La/dj3;->r:Ljava/lang/Object;

    .line 372
    .line 373
    check-cast v1, La/pz40;

    .line 374
    .line 375
    sget-object v3, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 376
    .line 377
    invoke-interface {v1, v3}, La/pz40;->setValue(Ljava/lang/Object;)V

    .line 378
    .line 379
    .line 380
    iget-object v1, v0, La/dj3;->o:Ljava/lang/Object;

    .line 381
    .line 382
    check-cast v1, Ljava/util/List;

    .line 383
    .line 384
    int-to-float v2, v2

    .line 385
    sget-object v3, La/lml;->e:La/lml;

    .line 386
    .line 387
    iput-boolean v4, v0, La/dj3;->j:Z

    .line 388
    .line 389
    invoke-static {v1, v2, v3, v0}, La/hkb;->z(Ljava/util/List;FLa/lml;La/zje;)Ljava/lang/Object;

    .line 390
    .line 391
    .line 392
    move-result-object v0

    .line 393
    if-ne v0, v6, :cond_d

    .line 394
    .line 395
    move-object v3, v6

    .line 396
    goto :goto_8

    .line 397
    :cond_d
    :goto_7
    sget-object v3, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 398
    .line 399
    :goto_8
    return-object v3

    .line 400
    :pswitch_2
    sget-object v9, La/tv9;->f:La/tv9;

    .line 401
    .line 402
    iget-object v1, v0, La/dj3;->q:Ljava/lang/Object;

    .line 403
    .line 404
    move-object v12, v1

    .line 405
    check-cast v12, Ljava/lang/String;

    .line 406
    .line 407
    iget-object v1, v0, La/dj3;->p:Ljava/lang/Object;

    .line 408
    .line 409
    move-object v11, v1

    .line 410
    check-cast v11, La/rrd;

    .line 411
    .line 412
    iget-object v1, v0, La/dj3;->r:Ljava/lang/Object;

    .line 413
    .line 414
    move-object v13, v1

    .line 415
    check-cast v13, La/tw2;

    .line 416
    .line 417
    sget-object v1, La/wne;->a:La/wne;

    .line 418
    .line 419
    iget-boolean v5, v0, La/dj3;->j:Z

    .line 420
    .line 421
    const/16 v6, 0xc

    .line 422
    .line 423
    const-string v7, "CXCP"

    .line 424
    .line 425
    const/4 v14, 0x0

    .line 426
    if-eqz v5, :cond_f

    .line 427
    .line 428
    if-ne v5, v4, :cond_e

    .line 429
    .line 430
    iget-object v2, v0, La/dj3;->o:Ljava/lang/Object;

    .line 431
    .line 432
    check-cast v2, La/mie0;

    .line 433
    .line 434
    iget-object v3, v0, La/dj3;->n:Ljava/lang/Object;

    .line 435
    .line 436
    check-cast v3, La/mie0;

    .line 437
    .line 438
    iget-object v5, v0, La/dj3;->m:Ljava/lang/Object;

    .line 439
    .line 440
    check-cast v5, La/mie0;

    .line 441
    .line 442
    iget-object v8, v0, La/dj3;->l:Ljava/lang/Object;

    .line 443
    .line 444
    check-cast v8, La/mie0;

    .line 445
    .line 446
    iget-object v10, v0, La/dj3;->k:Ljava/lang/Object;

    .line 447
    .line 448
    check-cast v10, La/vne;

    .line 449
    .line 450
    :try_start_0
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 451
    .line 452
    .line 453
    move-object v4, v5

    .line 454
    move-object/from16 v21, v7

    .line 455
    .line 456
    move-object/from16 v17, v12

    .line 457
    .line 458
    move-object/from16 v18, v13

    .line 459
    .line 460
    move-object/from16 v5, p1

    .line 461
    .line 462
    goto/16 :goto_d

    .line 463
    .line 464
    :catchall_0
    move-exception v0

    .line 465
    move-object v6, v7

    .line 466
    goto/16 :goto_f

    .line 467
    .line 468
    :cond_e
    invoke-static {v2}, La/jf4;->n(Ljava/lang/String;)V

    .line 469
    .line 470
    .line 471
    goto/16 :goto_10

    .line 472
    .line 473
    :cond_f
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 474
    .line 475
    .line 476
    iget-object v2, v0, La/dj3;->k:Ljava/lang/Object;

    .line 477
    .line 478
    check-cast v2, La/vne;

    .line 479
    .line 480
    new-instance v3, La/mie0;

    .line 481
    .line 482
    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    .line 483
    .line 484
    .line 485
    new-instance v10, La/l19;

    .line 486
    .line 487
    const/16 v15, 0x17

    .line 488
    .line 489
    invoke-direct/range {v10 .. v15}, La/l19;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;La/yje;B)V

    .line 490
    .line 491
    .line 492
    move-object v15, v14

    .line 493
    move-object v14, v13

    .line 494
    move-object v13, v12

    .line 495
    const/4 v5, 0x3

    .line 496
    invoke-static {v2, v15, v10, v5}, La/qjj;->M(La/vne;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/kzj;

    .line 497
    .line 498
    .line 499
    move-result-object v8

    .line 500
    iput-object v8, v3, La/mie0;->a:Ljava/lang/Object;

    .line 501
    .line 502
    new-instance v8, La/mie0;

    .line 503
    .line 504
    invoke-direct {v8}, Ljava/lang/Object;-><init>()V

    .line 505
    .line 506
    .line 507
    new-instance v10, La/qv3;

    .line 508
    .line 509
    const/16 v12, 0x1a

    .line 510
    .line 511
    invoke-direct {v10, v14, v15, v12}, La/qv3;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 512
    .line 513
    .line 514
    invoke-static {v2, v15, v10, v5}, La/qjj;->M(La/vne;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/kzj;

    .line 515
    .line 516
    .line 517
    move-result-object v10

    .line 518
    iput-object v10, v8, La/mie0;->a:Ljava/lang/Object;

    .line 519
    .line 520
    new-instance v10, La/mie0;

    .line 521
    .line 522
    invoke-direct {v10}, Ljava/lang/Object;-><init>()V

    .line 523
    .line 524
    .line 525
    new-instance v12, La/b04;

    .line 526
    .line 527
    const/4 v4, 0x2

    .line 528
    invoke-direct {v12, v4, v15, v5}, La/b04;-><init>(ILa/yje;B)V

    .line 529
    .line 530
    .line 531
    invoke-static {v2, v15, v15, v12, v5}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 532
    .line 533
    .line 534
    move-result-object v4

    .line 535
    iput-object v4, v10, La/mie0;->a:Ljava/lang/Object;

    .line 536
    .line 537
    new-instance v4, La/mie0;

    .line 538
    .line 539
    invoke-direct {v4}, Ljava/lang/Object;-><init>()V

    .line 540
    .line 541
    .line 542
    new-instance v12, La/ya;

    .line 543
    .line 544
    invoke-direct {v12, v11, v15, v6}, La/ya;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 545
    .line 546
    .line 547
    invoke-static {v2, v15, v15, v12, v5}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 548
    .line 549
    .line 550
    move-result-object v5

    .line 551
    iput-object v5, v4, La/mie0;->a:Ljava/lang/Object;

    .line 552
    .line 553
    move-object v5, v3

    .line 554
    move-object v3, v10

    .line 555
    move-object v10, v2

    .line 556
    move-object v2, v4

    .line 557
    move-object v4, v8

    .line 558
    :goto_9
    invoke-static {v10}, La/d5c;->R(La/vne;)Z

    .line 559
    .line 560
    .line 561
    move-result v8

    .line 562
    if-eqz v8, :cond_1a

    .line 563
    .line 564
    move v8, v6

    .line 565
    :try_start_1
    new-instance v6, La/o2i0;

    .line 566
    .line 567
    invoke-interface {v0}, La/yje;->getContext()Lkotlin/coroutines/CoroutineContext;

    .line 568
    .line 569
    .line 570
    move-result-object v11

    .line 571
    invoke-direct {v6, v11}, La/o2i0;-><init>(Lkotlin/coroutines/CoroutineContext;)V

    .line 572
    .line 573
    .line 574
    iget-object v11, v5, La/mie0;->a:Ljava/lang/Object;

    .line 575
    .line 576
    check-cast v11, La/jzj;

    .line 577
    .line 578
    const/4 v12, 0x0

    .line 579
    if-eqz v11, :cond_10

    .line 580
    .line 581
    invoke-interface {v11}, La/jzj;->getOnAwait()La/i1i0;

    .line 582
    .line 583
    .line 584
    move-result-object v11

    .line 585
    new-instance v8, La/w2a;

    .line 586
    .line 587
    invoke-direct {v8, v5, v13, v15, v12}, La/w2a;-><init>(La/mie0;Ljava/lang/String;La/yje;B)V

    .line 588
    .line 589
    .line 590
    invoke-virtual {v6, v11, v8}, La/o2i0;->g(La/i1i0;Lkotlin/jvm/functions/Function2;)V

    .line 591
    .line 592
    .line 593
    :cond_10
    iget-object v8, v4, La/mie0;->a:Ljava/lang/Object;

    .line 594
    .line 595
    check-cast v8, La/jzj;

    .line 596
    .line 597
    if-eqz v8, :cond_11

    .line 598
    .line 599
    invoke-interface {v8}, La/jzj;->getOnAwait()La/i1i0;

    .line 600
    .line 601
    .line 602
    move-result-object v8

    .line 603
    new-instance v11, La/w2a;

    .line 604
    .line 605
    const/4 v12, 0x1

    .line 606
    invoke-direct {v11, v4, v13, v15, v12}, La/w2a;-><init>(La/mie0;Ljava/lang/String;La/yje;B)V

    .line 607
    .line 608
    .line 609
    invoke-virtual {v6, v8, v11}, La/o2i0;->g(La/i1i0;Lkotlin/jvm/functions/Function2;)V

    .line 610
    .line 611
    .line 612
    :cond_11
    iget-object v8, v3, La/mie0;->a:Ljava/lang/Object;

    .line 613
    .line 614
    check-cast v8, La/bby;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 615
    .line 616
    move-object v11, v10

    .line 617
    sget-object v10, La/p2i0;->e:La/pfw;

    .line 618
    .line 619
    if-eqz v8, :cond_12

    .line 620
    .line 621
    :try_start_2
    invoke-interface {v8}, La/bby;->getOnJoin()La/h1i0;

    .line 622
    .line 623
    .line 624
    move-result-object v8

    .line 625
    move-object v12, v11

    .line 626
    new-instance v11, La/x2a;

    .line 627
    .line 628
    invoke-direct {v11, v3, v5, v14, v15}, La/x2a;-><init>(La/mie0;La/mie0;La/tw2;La/yje;)V

    .line 629
    .line 630
    .line 631
    move-object/from16 v18, v5

    .line 632
    .line 633
    new-instance v5, La/m2i0;

    .line 634
    .line 635
    move-object v15, v8

    .line 636
    check-cast v15, La/nw20;

    .line 637
    .line 638
    iget-object v15, v15, La/nw20;->a:Ljava/lang/Object;

    .line 639
    .line 640
    check-cast v15, La/pby;

    .line 641
    .line 642
    check-cast v8, La/nw20;

    .line 643
    .line 644
    iget-object v8, v8, La/nw20;->b:Ljava/lang/Object;

    .line 645
    .line 646
    check-cast v8, La/xdr;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 647
    .line 648
    move-object/from16 v20, v12

    .line 649
    .line 650
    const/4 v12, 0x0

    .line 651
    move-object/from16 v21, v7

    .line 652
    .line 653
    move-object/from16 v17, v13

    .line 654
    .line 655
    move-object v7, v15

    .line 656
    move-object/from16 v13, v18

    .line 657
    .line 658
    move-object/from16 v15, v20

    .line 659
    .line 660
    move-object/from16 v18, v14

    .line 661
    .line 662
    const/4 v14, 0x0

    .line 663
    :try_start_3
    invoke-direct/range {v5 .. v12}, La/m2i0;-><init>(La/o2i0;Ljava/lang/Object;La/xdr;La/xdr;Ljava/lang/Object;La/bnn0;La/xdr;)V

    .line 664
    .line 665
    .line 666
    invoke-virtual {v6, v5, v14}, La/o2i0;->h(La/m2i0;Z)V

    .line 667
    .line 668
    .line 669
    goto :goto_b

    .line 670
    :goto_a
    move-object/from16 v6, v21

    .line 671
    .line 672
    goto/16 :goto_f

    .line 673
    .line 674
    :catchall_1
    move-exception v0

    .line 675
    move-object/from16 v21, v7

    .line 676
    .line 677
    goto :goto_a

    .line 678
    :cond_12
    move-object/from16 v21, v7

    .line 679
    .line 680
    move-object v15, v11

    .line 681
    move-object/from16 v17, v13

    .line 682
    .line 683
    move-object/from16 v18, v14

    .line 684
    .line 685
    const/4 v14, 0x0

    .line 686
    move-object v13, v5

    .line 687
    :goto_b
    iget-object v5, v2, La/mie0;->a:Ljava/lang/Object;

    .line 688
    .line 689
    check-cast v5, La/bby;

    .line 690
    .line 691
    if-eqz v5, :cond_13

    .line 692
    .line 693
    invoke-interface {v5}, La/bby;->getOnJoin()La/h1i0;

    .line 694
    .line 695
    .line 696
    move-result-object v5

    .line 697
    new-instance v11, La/m91;

    .line 698
    .line 699
    const/4 v7, 0x6

    .line 700
    const/4 v8, 0x0

    .line 701
    invoke-direct {v11, v2, v8, v7}, La/m91;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 702
    .line 703
    .line 704
    move-object v7, v5

    .line 705
    new-instance v5, La/m2i0;

    .line 706
    .line 707
    move-object v8, v7

    .line 708
    check-cast v8, La/nw20;

    .line 709
    .line 710
    iget-object v8, v8, La/nw20;->a:Ljava/lang/Object;

    .line 711
    .line 712
    check-cast v8, La/pby;

    .line 713
    .line 714
    check-cast v7, La/nw20;

    .line 715
    .line 716
    iget-object v7, v7, La/nw20;->b:Ljava/lang/Object;

    .line 717
    .line 718
    check-cast v7, La/xdr;

    .line 719
    .line 720
    const/4 v12, 0x0

    .line 721
    move-object/from16 v25, v8

    .line 722
    .line 723
    move-object v8, v7

    .line 724
    move-object/from16 v7, v25

    .line 725
    .line 726
    invoke-direct/range {v5 .. v12}, La/m2i0;-><init>(La/o2i0;Ljava/lang/Object;La/xdr;La/xdr;Ljava/lang/Object;La/bnn0;La/xdr;)V

    .line 727
    .line 728
    .line 729
    invoke-virtual {v6, v5, v14}, La/o2i0;->h(La/m2i0;Z)V

    .line 730
    .line 731
    .line 732
    goto :goto_c

    .line 733
    :catchall_2
    move-exception v0

    .line 734
    goto :goto_a

    .line 735
    :cond_13
    :goto_c
    iput-object v15, v0, La/dj3;->k:Ljava/lang/Object;

    .line 736
    .line 737
    iput-object v13, v0, La/dj3;->l:Ljava/lang/Object;

    .line 738
    .line 739
    iput-object v4, v0, La/dj3;->m:Ljava/lang/Object;

    .line 740
    .line 741
    iput-object v3, v0, La/dj3;->n:Ljava/lang/Object;

    .line 742
    .line 743
    iput-object v2, v0, La/dj3;->o:Ljava/lang/Object;

    .line 744
    .line 745
    const/4 v12, 0x1

    .line 746
    iput-boolean v12, v0, La/dj3;->j:Z

    .line 747
    .line 748
    invoke-static {v6, v0}, La/o2i0;->d(La/o2i0;La/bnn0;)Ljava/lang/Object;

    .line 749
    .line 750
    .line 751
    move-result-object v5

    .line 752
    if-ne v5, v1, :cond_14

    .line 753
    .line 754
    move-object v3, v1

    .line 755
    goto/16 :goto_10

    .line 756
    .line 757
    :cond_14
    move-object v8, v13

    .line 758
    move-object v10, v15

    .line 759
    :goto_d
    check-cast v5, La/hw70;

    .line 760
    .line 761
    if-eqz v5, :cond_19

    .line 762
    .line 763
    new-instance v0, Ljava/lang/StringBuilder;

    .line 764
    .line 765
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 766
    .line 767
    .line 768
    const-string v1, "Camera open completed: "

    .line 769
    .line 770
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 771
    .line 772
    .line 773
    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 774
    .line 775
    .line 776
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 777
    .line 778
    .line 779
    move-result-object v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 780
    move-object/from16 v6, v21

    .line 781
    .line 782
    :try_start_4
    invoke-static {v6, v0}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 783
    .line 784
    .line 785
    iget-object v0, v8, La/mie0;->a:Ljava/lang/Object;

    .line 786
    .line 787
    check-cast v0, La/jzj;

    .line 788
    .line 789
    if-eqz v0, :cond_15

    .line 790
    .line 791
    const/4 v14, 0x0

    .line 792
    invoke-interface {v0, v14}, La/bby;->cancel(Ljava/util/concurrent/CancellationException;)V

    .line 793
    .line 794
    .line 795
    goto :goto_e

    .line 796
    :catchall_3
    move-exception v0

    .line 797
    goto :goto_f

    .line 798
    :cond_15
    const/4 v14, 0x0

    .line 799
    :goto_e
    iget-object v0, v4, La/mie0;->a:Ljava/lang/Object;

    .line 800
    .line 801
    check-cast v0, La/jzj;

    .line 802
    .line 803
    if-eqz v0, :cond_16

    .line 804
    .line 805
    invoke-interface {v0, v14}, La/bby;->cancel(Ljava/util/concurrent/CancellationException;)V

    .line 806
    .line 807
    .line 808
    :cond_16
    iget-object v0, v3, La/mie0;->a:Ljava/lang/Object;

    .line 809
    .line 810
    check-cast v0, La/bby;

    .line 811
    .line 812
    if-eqz v0, :cond_17

    .line 813
    .line 814
    invoke-interface {v0, v14}, La/bby;->cancel(Ljava/util/concurrent/CancellationException;)V

    .line 815
    .line 816
    .line 817
    :cond_17
    iget-object v0, v2, La/mie0;->a:Ljava/lang/Object;

    .line 818
    .line 819
    check-cast v0, La/bby;

    .line 820
    .line 821
    if-eqz v0, :cond_18

    .line 822
    .line 823
    invoke-interface {v0, v14}, La/bby;->cancel(Ljava/util/concurrent/CancellationException;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_3

    .line 824
    .line 825
    .line 826
    :cond_18
    move-object v3, v5

    .line 827
    goto :goto_10

    .line 828
    :cond_19
    move-object v5, v8

    .line 829
    move-object/from16 v13, v17

    .line 830
    .line 831
    move-object/from16 v14, v18

    .line 832
    .line 833
    move-object/from16 v7, v21

    .line 834
    .line 835
    const/16 v6, 0xc

    .line 836
    .line 837
    const/4 v15, 0x0

    .line 838
    goto/16 :goto_9

    .line 839
    .line 840
    :goto_f
    const-string v1, "Unexpected throwable during camera opening!"

    .line 841
    .line 842
    invoke-static {v6, v1, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 843
    .line 844
    .line 845
    throw v0

    .line 846
    :cond_1a
    new-instance v3, La/hw70;

    .line 847
    .line 848
    new-instance v0, La/az9;

    .line 849
    .line 850
    const/16 v8, 0xc

    .line 851
    .line 852
    invoke-direct {v0, v8}, La/az9;-><init>(I)V

    .line 853
    .line 854
    .line 855
    const/4 v12, 0x1

    .line 856
    const/4 v14, 0x0

    .line 857
    invoke-direct {v3, v14, v0, v12}, La/hw70;-><init>(La/tw2;La/az9;I)V

    .line 858
    .line 859
    .line 860
    :goto_10
    return-object v3

    .line 861
    :pswitch_3
    move v12, v4

    .line 862
    iget-object v1, v0, La/dj3;->q:Ljava/lang/Object;

    .line 863
    .line 864
    check-cast v1, La/arq;

    .line 865
    .line 866
    sget-object v4, La/wne;->a:La/wne;

    .line 867
    .line 868
    iget-boolean v5, v0, La/dj3;->j:Z

    .line 869
    .line 870
    if-eqz v5, :cond_1c

    .line 871
    .line 872
    if-ne v5, v12, :cond_1b

    .line 873
    .line 874
    iget-object v1, v0, La/dj3;->r:Ljava/lang/Object;

    .line 875
    .line 876
    check-cast v1, La/jh3;

    .line 877
    .line 878
    iget-object v2, v0, La/dj3;->m:Ljava/lang/Object;

    .line 879
    .line 880
    check-cast v2, La/iy3;

    .line 881
    .line 882
    iget-object v5, v0, La/dj3;->k:Ljava/lang/Object;

    .line 883
    .line 884
    iget-object v6, v0, La/dj3;->o:Ljava/lang/Object;

    .line 885
    .line 886
    check-cast v6, La/ij3;

    .line 887
    .line 888
    iget-object v7, v0, La/dj3;->n:Ljava/lang/Object;

    .line 889
    .line 890
    check-cast v7, La/p7m0;

    .line 891
    .line 892
    iget-object v8, v0, La/dj3;->l:Ljava/lang/Object;

    .line 893
    .line 894
    check-cast v8, La/iy3;

    .line 895
    .line 896
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 897
    .line 898
    .line 899
    move-object v9, v8

    .line 900
    const/4 v12, 0x1

    .line 901
    move-object/from16 v8, p1

    .line 902
    .line 903
    goto :goto_11

    .line 904
    :cond_1b
    invoke-static {v2}, La/jf4;->n(Ljava/lang/String;)V

    .line 905
    .line 906
    .line 907
    goto/16 :goto_14

    .line 908
    .line 909
    :cond_1c
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 910
    .line 911
    .line 912
    invoke-interface {v1}, La/arq;->a()F

    .line 913
    .line 914
    .line 915
    move-result v1

    .line 916
    invoke-static {v1}, La/jd8;->k0(F)La/iy3;

    .line 917
    .line 918
    .line 919
    move-result-object v1

    .line 920
    iget-object v2, v0, La/dj3;->p:Ljava/lang/Object;

    .line 921
    .line 922
    check-cast v2, La/ij3;

    .line 923
    .line 924
    iget-object v5, v2, La/ij3;->j0:La/p7m0;

    .line 925
    .line 926
    move-object v6, v2

    .line 927
    move-object v7, v5

    .line 928
    move-object v2, v1

    .line 929
    :cond_1d
    invoke-virtual {v7}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 930
    .line 931
    .line 932
    move-result-object v5

    .line 933
    move-object v1, v5

    .line 934
    check-cast v1, La/jh3;

    .line 935
    .line 936
    sget v8, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 937
    .line 938
    const/16 v9, 0x1d

    .line 939
    .line 940
    if-lt v8, v9, :cond_1f

    .line 941
    .line 942
    iget-object v8, v6, La/ij3;->i:La/nmo;

    .line 943
    .line 944
    iput-object v3, v0, La/dj3;->q:Ljava/lang/Object;

    .line 945
    .line 946
    iput-object v2, v0, La/dj3;->l:Ljava/lang/Object;

    .line 947
    .line 948
    iput-object v7, v0, La/dj3;->n:Ljava/lang/Object;

    .line 949
    .line 950
    iput-object v6, v0, La/dj3;->o:Ljava/lang/Object;

    .line 951
    .line 952
    iput-object v5, v0, La/dj3;->k:Ljava/lang/Object;

    .line 953
    .line 954
    iput-object v2, v0, La/dj3;->m:Ljava/lang/Object;

    .line 955
    .line 956
    iput-object v1, v0, La/dj3;->r:Ljava/lang/Object;

    .line 957
    .line 958
    const/4 v12, 0x1

    .line 959
    iput-boolean v12, v0, La/dj3;->j:Z

    .line 960
    .line 961
    invoke-virtual {v8, v0}, La/nmo;->g(La/zje;)Ljava/lang/Object;

    .line 962
    .line 963
    .line 964
    move-result-object v8

    .line 965
    if-ne v8, v4, :cond_1e

    .line 966
    .line 967
    move-object v3, v4

    .line 968
    goto :goto_14

    .line 969
    :cond_1e
    move-object v9, v2

    .line 970
    :goto_11
    check-cast v8, La/ne5;

    .line 971
    .line 972
    invoke-static {v8, v9}, La/nnw0;->J(La/ne5;La/iy3;)La/ph3;

    .line 973
    .line 974
    .line 975
    move-result-object v8

    .line 976
    move-object v14, v2

    .line 977
    move-object/from16 v16, v8

    .line 978
    .line 979
    move-object v2, v9

    .line 980
    :goto_12
    move-object v13, v1

    .line 981
    goto :goto_13

    .line 982
    :cond_1f
    const/4 v12, 0x1

    .line 983
    move-object v14, v2

    .line 984
    move-object/from16 v16, v3

    .line 985
    .line 986
    goto :goto_12

    .line 987
    :goto_13
    const/16 v23, 0x0

    .line 988
    .line 989
    const/16 v24, 0xfed

    .line 990
    .line 991
    const/4 v15, 0x0

    .line 992
    const/16 v17, 0x0

    .line 993
    .line 994
    const/16 v18, 0x0

    .line 995
    .line 996
    const/16 v19, 0x0

    .line 997
    .line 998
    const/16 v20, 0x0

    .line 999
    .line 1000
    const/16 v21, 0x0

    .line 1001
    .line 1002
    const/16 v22, 0x0

    .line 1003
    .line 1004
    invoke-static/range {v13 .. v24}, La/jh3;->a(La/jh3;La/iy3;Ljava/util/ArrayList;La/ph3;La/oc5;La/oc5;Ljava/lang/String;La/yfw;Ljava/util/Set;ZZI)La/jh3;

    .line 1005
    .line 1006
    .line 1007
    move-result-object v1

    .line 1008
    invoke-virtual {v7, v5, v1}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1009
    .line 1010
    .line 1011
    move-result v1

    .line 1012
    if-eqz v1, :cond_1d

    .line 1013
    .line 1014
    sget-object v3, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1015
    .line 1016
    :goto_14
    return-object v3

    .line 1017
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
