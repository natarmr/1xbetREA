.class public final La/npl0;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic i:B

.field public j:Z

.field public final synthetic k:La/xpl0;


# direct methods
.method public synthetic constructor <init>(La/xpl0;La/yje;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/npl0;->i:B

    iput-object p1, p0, La/npl0;->k:La/xpl0;

    const/4 p1, 0x1

    invoke-direct {p0, p1, p2}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(La/yje;)La/yje;
    .locals 2

    .line 1
    iget-byte v0, p0, La/npl0;->i:B

    .line 2
    .line 3
    iget-object p0, p0, La/npl0;->k:La/xpl0;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance v0, La/npl0;

    .line 9
    .line 10
    const/4 v1, 0x2

    .line 11
    invoke-direct {v0, p0, p1, v1}, La/npl0;-><init>(La/xpl0;La/yje;B)V

    .line 12
    .line 13
    .line 14
    return-object v0

    .line 15
    :pswitch_0
    new-instance v0, La/npl0;

    .line 16
    .line 17
    const/4 v1, 0x1

    .line 18
    invoke-direct {v0, p0, p1, v1}, La/npl0;-><init>(La/xpl0;La/yje;B)V

    .line 19
    .line 20
    .line 21
    return-object v0

    .line 22
    :pswitch_1
    new-instance v0, La/npl0;

    .line 23
    .line 24
    const/4 v1, 0x0

    .line 25
    invoke-direct {v0, p0, p1, v1}, La/npl0;-><init>(La/xpl0;La/yje;B)V

    .line 26
    .line 27
    .line 28
    return-object v0

    .line 29
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-byte v0, p0, La/npl0;->i:B

    .line 2
    .line 3
    check-cast p1, La/yje;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0, p1}, La/npl0;->create(La/yje;)La/yje;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    check-cast p0, La/npl0;

    .line 13
    .line 14
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 15
    .line 16
    invoke-virtual {p0, p1}, La/npl0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    return-object p0

    .line 21
    :pswitch_0
    invoke-virtual {p0, p1}, La/npl0;->create(La/yje;)La/yje;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    check-cast p0, La/npl0;

    .line 26
    .line 27
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 28
    .line 29
    invoke-virtual {p0, p1}, La/npl0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    return-object p0

    .line 34
    :pswitch_1
    invoke-virtual {p0, p1}, La/npl0;->create(La/yje;)La/yje;

    .line 35
    .line 36
    .line 37
    move-result-object p0

    .line 38
    check-cast p0, La/npl0;

    .line 39
    .line 40
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 41
    .line 42
    invoke-virtual {p0, p1}, La/npl0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object p0

    .line 46
    return-object p0

    .line 47
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    .line 1
    iget-byte v0, p0, La/npl0;->i:B

    .line 2
    .line 3
    iget-object v1, p0, La/npl0;->k:La/xpl0;

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    const-string v3, "call to \'resume\' before \'invoke\' with coroutine"

    .line 7
    .line 8
    const/4 v4, 0x1

    .line 9
    packed-switch v0, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    sget-object v0, La/wne;->a:La/wne;

    .line 13
    .line 14
    iget-boolean v5, p0, La/npl0;->j:Z

    .line 15
    .line 16
    if-eqz v5, :cond_1

    .line 17
    .line 18
    if-ne v5, v4, :cond_0

    .line 19
    .line 20
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 21
    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    invoke-static {v3}, La/jf4;->n(Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    move-object p1, v2

    .line 28
    goto :goto_0

    .line 29
    :cond_1
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 30
    .line 31
    .line 32
    iput-boolean v4, p0, La/npl0;->j:Z

    .line 33
    .line 34
    sget p1, La/xpl0;->P:I

    .line 35
    .line 36
    invoke-virtual {v1, p0}, La/xpl0;->M(La/zje;)Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    if-ne p1, v0, :cond_2

    .line 41
    .line 42
    move-object p1, v0

    .line 43
    :cond_2
    :goto_0
    return-object p1

    .line 44
    :pswitch_0
    sget-object v0, La/wne;->a:La/wne;

    .line 45
    .line 46
    iget-boolean v5, p0, La/npl0;->j:Z

    .line 47
    .line 48
    if-eqz v5, :cond_4

    .line 49
    .line 50
    if-ne v5, v4, :cond_3

    .line 51
    .line 52
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 53
    .line 54
    .line 55
    goto :goto_1

    .line 56
    :cond_3
    invoke-static {v3}, La/jf4;->n(Ljava/lang/String;)V

    .line 57
    .line 58
    .line 59
    move-object p1, v2

    .line 60
    goto :goto_1

    .line 61
    :cond_4
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 62
    .line 63
    .line 64
    iput-boolean v4, p0, La/npl0;->j:Z

    .line 65
    .line 66
    sget p1, La/xpl0;->P:I

    .line 67
    .line 68
    invoke-virtual {v1, p0}, La/xpl0;->M(La/zje;)Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    move-result-object p1

    .line 72
    if-ne p1, v0, :cond_5

    .line 73
    .line 74
    move-object p1, v0

    .line 75
    :cond_5
    :goto_1
    return-object p1

    .line 76
    :pswitch_1
    sget-object v0, La/wne;->a:La/wne;

    .line 77
    .line 78
    iget-boolean v5, p0, La/npl0;->j:Z

    .line 79
    .line 80
    if-eqz v5, :cond_7

    .line 81
    .line 82
    if-ne v5, v4, :cond_6

    .line 83
    .line 84
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 85
    .line 86
    .line 87
    goto :goto_3

    .line 88
    :cond_6
    invoke-static {v3}, La/jf4;->n(Ljava/lang/String;)V

    .line 89
    .line 90
    .line 91
    goto :goto_4

    .line 92
    :cond_7
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 93
    .line 94
    .line 95
    iget-object p1, v1, La/xpl0;->E:La/hjd;

    .line 96
    .line 97
    new-instance v2, La/cid;

    .line 98
    .line 99
    iget-object v1, v1, La/xpl0;->o:Lorg/xplatform/search/impl/presentation/sport/models/SportSearchFragmentSettings;

    .line 100
    .line 101
    iget-object v1, v1, Lorg/xplatform/search/impl/presentation/sport/models/SportSearchFragmentSettings;->b:Lorg/xplatform/search/api/models/GlobalSearchContainerSettings;

    .line 102
    .line 103
    instance-of v1, v1, Lorg/xplatform/search/api/models/GlobalSearchContainerSettings$FromBetSlip;

    .line 104
    .line 105
    if-eqz v1, :cond_8

    .line 106
    .line 107
    new-instance v1, La/qr2;

    .line 108
    .line 109
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 110
    .line 111
    .line 112
    goto :goto_2

    .line 113
    :cond_8
    new-instance v1, La/pr2;

    .line 114
    .line 115
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 116
    .line 117
    .line 118
    :goto_2
    const-string v3, "global_search"

    .line 119
    .line 120
    invoke-direct {v2, v3, v1}, La/cid;-><init>(Ljava/lang/String;La/ms2;)V

    .line 121
    .line 122
    .line 123
    iput-boolean v4, p0, La/npl0;->j:Z

    .line 124
    .line 125
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 126
    .line 127
    .line 128
    invoke-virtual {p1, v2, p0}, La/hjd;->n(La/vid;La/yje;)Ljava/lang/Object;

    .line 129
    .line 130
    .line 131
    move-result-object p0

    .line 132
    if-ne p0, v0, :cond_9

    .line 133
    .line 134
    move-object v2, v0

    .line 135
    goto :goto_4

    .line 136
    :cond_9
    :goto_3
    sget-object v2, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 137
    .line 138
    :goto_4
    return-object v2

    .line 139
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
