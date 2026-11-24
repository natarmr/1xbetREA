.class public final La/mqe;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public j:Z

.field public synthetic k:Ljava/lang/Object;

.field public final synthetic l:La/nqe;

.field public final synthetic m:Ljava/util/ArrayList;


# direct methods
.method public synthetic constructor <init>(La/nqe;Ljava/util/ArrayList;La/yje;B)V
    .locals 0

    .line 1
    iput-byte p4, p0, La/mqe;->i:B

    iput-object p1, p0, La/mqe;->l:La/nqe;

    iput-object p2, p0, La/mqe;->m:Ljava/util/ArrayList;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 3

    .line 1
    iget-byte v0, p0, La/mqe;->i:B

    .line 2
    .line 3
    iget-object v1, p0, La/mqe;->m:Ljava/util/ArrayList;

    .line 4
    .line 5
    iget-object p0, p0, La/mqe;->l:La/nqe;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    new-instance v0, La/mqe;

    .line 11
    .line 12
    const/4 v2, 0x2

    .line 13
    invoke-direct {v0, p0, v1, p2, v2}, La/mqe;-><init>(La/nqe;Ljava/util/ArrayList;La/yje;B)V

    .line 14
    .line 15
    .line 16
    iput-object p1, v0, La/mqe;->k:Ljava/lang/Object;

    .line 17
    .line 18
    return-object v0

    .line 19
    :pswitch_0
    new-instance v0, La/mqe;

    .line 20
    .line 21
    const/4 v2, 0x1

    .line 22
    invoke-direct {v0, p0, v1, p2, v2}, La/mqe;-><init>(La/nqe;Ljava/util/ArrayList;La/yje;B)V

    .line 23
    .line 24
    .line 25
    iput-object p1, v0, La/mqe;->k:Ljava/lang/Object;

    .line 26
    .line 27
    return-object v0

    .line 28
    :pswitch_1
    new-instance v0, La/mqe;

    .line 29
    .line 30
    const/4 v2, 0x0

    .line 31
    invoke-direct {v0, p0, v1, p2, v2}, La/mqe;-><init>(La/nqe;Ljava/util/ArrayList;La/yje;B)V

    .line 32
    .line 33
    .line 34
    iput-object p1, v0, La/mqe;->k:Ljava/lang/Object;

    .line 35
    .line 36
    return-object v0

    .line 37
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-byte v0, p0, La/mqe;->i:B

    .line 2
    .line 3
    check-cast p1, La/qpg0;

    .line 4
    .line 5
    check-cast p2, La/yje;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0, p1, p2}, La/mqe;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, La/mqe;

    .line 15
    .line 16
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, La/mqe;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    invoke-virtual {p0, p1, p2}, La/mqe;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    check-cast p0, La/mqe;

    .line 28
    .line 29
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 30
    .line 31
    invoke-virtual {p0, p1}, La/mqe;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    return-object p0

    .line 36
    :pswitch_1
    invoke-virtual {p0, p1, p2}, La/mqe;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 37
    .line 38
    .line 39
    move-result-object p0

    .line 40
    check-cast p0, La/mqe;

    .line 41
    .line 42
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 43
    .line 44
    invoke-virtual {p0, p1}, La/mqe;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object p0

    .line 48
    return-object p0

    .line 49
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    .line 1
    iget-byte v0, p0, La/mqe;->i:B

    .line 2
    .line 3
    iget-object v1, p0, La/mqe;->m:Ljava/util/ArrayList;

    .line 4
    .line 5
    iget-object v2, p0, La/mqe;->l:La/nqe;

    .line 6
    .line 7
    const-string v3, "call to \'resume\' before \'invoke\' with coroutine"

    .line 8
    .line 9
    const/4 v4, 0x1

    .line 10
    const/4 v5, 0x0

    .line 11
    packed-switch v0, :pswitch_data_0

    .line 12
    .line 13
    .line 14
    iget-object v0, p0, La/mqe;->k:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast v0, La/qpg0;

    .line 17
    .line 18
    sget-object v6, La/wne;->a:La/wne;

    .line 19
    .line 20
    iget-boolean v7, p0, La/mqe;->j:Z

    .line 21
    .line 22
    if-eqz v7, :cond_1

    .line 23
    .line 24
    if-ne v7, v4, :cond_0

    .line 25
    .line 26
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 27
    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_0
    invoke-static {v3}, La/jf4;->n(Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    goto :goto_1

    .line 34
    :cond_1
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 35
    .line 36
    .line 37
    iget-object p1, v2, La/nqe;->c:La/fu6;

    .line 38
    .line 39
    iput-object v5, p0, La/mqe;->k:Ljava/lang/Object;

    .line 40
    .line 41
    iput-boolean v4, p0, La/mqe;->j:Z

    .line 42
    .line 43
    invoke-virtual {p1, v0, v1}, La/ulb;->R(La/qpg0;Ljava/util/ArrayList;)Lkotlin/Unit;

    .line 44
    .line 45
    .line 46
    move-result-object p0

    .line 47
    if-ne p0, v6, :cond_2

    .line 48
    .line 49
    move-object v5, v6

    .line 50
    goto :goto_1

    .line 51
    :cond_2
    :goto_0
    sget-object v5, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 52
    .line 53
    :goto_1
    return-object v5

    .line 54
    :pswitch_0
    iget-object v0, p0, La/mqe;->k:Ljava/lang/Object;

    .line 55
    .line 56
    check-cast v0, La/qpg0;

    .line 57
    .line 58
    sget-object v6, La/wne;->a:La/wne;

    .line 59
    .line 60
    iget-boolean v7, p0, La/mqe;->j:Z

    .line 61
    .line 62
    if-eqz v7, :cond_4

    .line 63
    .line 64
    if-ne v7, v4, :cond_3

    .line 65
    .line 66
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 67
    .line 68
    .line 69
    goto :goto_2

    .line 70
    :cond_3
    invoke-static {v3}, La/jf4;->n(Ljava/lang/String;)V

    .line 71
    .line 72
    .line 73
    goto :goto_3

    .line 74
    :cond_4
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 75
    .line 76
    .line 77
    iget-object p1, v2, La/nqe;->d:La/wti;

    .line 78
    .line 79
    iput-object v5, p0, La/mqe;->k:Ljava/lang/Object;

    .line 80
    .line 81
    iput-boolean v4, p0, La/mqe;->j:Z

    .line 82
    .line 83
    invoke-virtual {p1, v0, v1, p0}, La/wti;->D(La/qpg0;Ljava/util/ArrayList;La/zje;)Ljava/lang/Object;

    .line 84
    .line 85
    .line 86
    move-result-object p0

    .line 87
    if-ne p0, v6, :cond_5

    .line 88
    .line 89
    move-object v5, v6

    .line 90
    goto :goto_3

    .line 91
    :cond_5
    :goto_2
    sget-object v5, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 92
    .line 93
    :goto_3
    return-object v5

    .line 94
    :pswitch_1
    iget-object v0, p0, La/mqe;->k:Ljava/lang/Object;

    .line 95
    .line 96
    check-cast v0, La/qpg0;

    .line 97
    .line 98
    sget-object v6, La/wne;->a:La/wne;

    .line 99
    .line 100
    iget-boolean v7, p0, La/mqe;->j:Z

    .line 101
    .line 102
    if-eqz v7, :cond_7

    .line 103
    .line 104
    if-ne v7, v4, :cond_6

    .line 105
    .line 106
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 107
    .line 108
    .line 109
    goto :goto_4

    .line 110
    :cond_6
    invoke-static {v3}, La/jf4;->n(Ljava/lang/String;)V

    .line 111
    .line 112
    .line 113
    goto :goto_5

    .line 114
    :cond_7
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 115
    .line 116
    .line 117
    iget-object p1, v2, La/nqe;->b:La/sj3;

    .line 118
    .line 119
    iput-object v5, p0, La/mqe;->k:Ljava/lang/Object;

    .line 120
    .line 121
    iput-boolean v4, p0, La/mqe;->j:Z

    .line 122
    .line 123
    invoke-virtual {p1, v0, v1}, La/sj3;->k0(La/qpg0;Ljava/lang/Iterable;)Lkotlin/Unit;

    .line 124
    .line 125
    .line 126
    move-result-object p0

    .line 127
    if-ne p0, v6, :cond_8

    .line 128
    .line 129
    move-object v5, v6

    .line 130
    goto :goto_5

    .line 131
    :cond_8
    :goto_4
    sget-object v5, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 132
    .line 133
    :goto_5
    return-object v5

    .line 134
    nop

    .line 135
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
