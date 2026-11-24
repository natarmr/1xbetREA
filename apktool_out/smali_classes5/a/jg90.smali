.class public final La/jg90;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public j:Z

.field public final synthetic k:La/xcz;

.field public final synthetic l:Ljava/util/List;

.field public final synthetic m:La/hie0;


# direct methods
.method public synthetic constructor <init>(La/xcz;Ljava/util/List;La/hie0;La/yje;B)V
    .locals 0

    .line 1
    iput-byte p5, p0, La/jg90;->i:B

    iput-object p1, p0, La/jg90;->k:La/xcz;

    iput-object p2, p0, La/jg90;->l:Ljava/util/List;

    iput-object p3, p0, La/jg90;->m:La/hie0;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p4}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 7

    .line 1
    iget-byte p1, p0, La/jg90;->i:B

    .line 2
    .line 3
    packed-switch p1, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    new-instance v0, La/jg90;

    .line 7
    .line 8
    iget-object v3, p0, La/jg90;->m:La/hie0;

    .line 9
    .line 10
    const/4 v5, 0x1

    .line 11
    iget-object v1, p0, La/jg90;->k:La/xcz;

    .line 12
    .line 13
    iget-object v2, p0, La/jg90;->l:Ljava/util/List;

    .line 14
    .line 15
    move-object v4, p2

    .line 16
    invoke-direct/range {v0 .. v5}, La/jg90;-><init>(La/xcz;Ljava/util/List;La/hie0;La/yje;B)V

    .line 17
    .line 18
    .line 19
    return-object v0

    .line 20
    :pswitch_0
    move-object v4, p2

    .line 21
    new-instance v1, La/jg90;

    .line 22
    .line 23
    move-object v5, v4

    .line 24
    iget-object v4, p0, La/jg90;->m:La/hie0;

    .line 25
    .line 26
    const/4 v6, 0x0

    .line 27
    iget-object v2, p0, La/jg90;->k:La/xcz;

    .line 28
    .line 29
    iget-object v3, p0, La/jg90;->l:Ljava/util/List;

    .line 30
    .line 31
    invoke-direct/range {v1 .. v6}, La/jg90;-><init>(La/xcz;Ljava/util/List;La/hie0;La/yje;B)V

    .line 32
    .line 33
    .line 34
    return-object v1

    .line 35
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-byte v0, p0, La/jg90;->i:B

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
    invoke-virtual {p0, p1, p2}, La/jg90;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, La/jg90;

    .line 15
    .line 16
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, La/jg90;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    invoke-virtual {p0, p1, p2}, La/jg90;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    check-cast p0, La/jg90;

    .line 28
    .line 29
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 30
    .line 31
    invoke-virtual {p0, p1}, La/jg90;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    .locals 8

    .line 1
    iget-byte v0, p0, La/jg90;->i:B

    .line 2
    .line 3
    iget-object v1, p0, La/jg90;->m:La/hie0;

    .line 4
    .line 5
    iget-object v2, p0, La/jg90;->l:Ljava/util/List;

    .line 6
    .line 7
    iget-object v3, p0, La/jg90;->k:La/xcz;

    .line 8
    .line 9
    const-string v4, "call to \'resume\' before \'invoke\' with coroutine"

    .line 10
    .line 11
    const/4 v5, 0x1

    .line 12
    const/4 v6, 0x0

    .line 13
    packed-switch v0, :pswitch_data_0

    .line 14
    .line 15
    .line 16
    sget-object v0, La/wne;->a:La/wne;

    .line 17
    .line 18
    iget-boolean v7, p0, La/jg90;->j:Z

    .line 19
    .line 20
    if-eqz v7, :cond_1

    .line 21
    .line 22
    if-ne v7, v5, :cond_0

    .line 23
    .line 24
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 25
    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_0
    invoke-static {v4}, La/jf4;->n(Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    goto :goto_1

    .line 32
    :cond_1
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 33
    .line 34
    .line 35
    new-instance p1, La/a7s;

    .line 36
    .line 37
    const/16 v4, 0x1d

    .line 38
    .line 39
    invoke-direct {p1, v3, v4}, La/a7s;-><init>(La/xcz;B)V

    .line 40
    .line 41
    .line 42
    invoke-static {v6, p1}, La/ydx;->V(La/ufk0;Lkotlin/jvm/functions/Function0;)La/vsg0;

    .line 43
    .line 44
    .line 45
    move-result-object p1

    .line 46
    new-instance v3, La/ig90;

    .line 47
    .line 48
    invoke-direct {v3, v2, v1, v5}, La/ig90;-><init>(Ljava/util/List;La/hie0;B)V

    .line 49
    .line 50
    .line 51
    iput-boolean v5, p0, La/jg90;->j:Z

    .line 52
    .line 53
    invoke-virtual {p1, v3, p0}, La/vsg0;->c(La/kmq;La/yje;)Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    move-result-object p0

    .line 57
    if-ne p0, v0, :cond_2

    .line 58
    .line 59
    move-object v6, v0

    .line 60
    goto :goto_1

    .line 61
    :cond_2
    :goto_0
    sget-object v6, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 62
    .line 63
    :goto_1
    return-object v6

    .line 64
    :pswitch_0
    sget-object v0, La/wne;->a:La/wne;

    .line 65
    .line 66
    iget-boolean v7, p0, La/jg90;->j:Z

    .line 67
    .line 68
    if-eqz v7, :cond_4

    .line 69
    .line 70
    if-ne v7, v5, :cond_3

    .line 71
    .line 72
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 73
    .line 74
    .line 75
    goto :goto_2

    .line 76
    :cond_3
    invoke-static {v4}, La/jf4;->n(Ljava/lang/String;)V

    .line 77
    .line 78
    .line 79
    goto :goto_3

    .line 80
    :cond_4
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 81
    .line 82
    .line 83
    new-instance p1, La/a7s;

    .line 84
    .line 85
    const/16 v4, 0x1c

    .line 86
    .line 87
    invoke-direct {p1, v3, v4}, La/a7s;-><init>(La/xcz;B)V

    .line 88
    .line 89
    .line 90
    invoke-static {v6, p1}, La/ydx;->V(La/ufk0;Lkotlin/jvm/functions/Function0;)La/vsg0;

    .line 91
    .line 92
    .line 93
    move-result-object p1

    .line 94
    new-instance v3, La/ig90;

    .line 95
    .line 96
    const/4 v4, 0x0

    .line 97
    invoke-direct {v3, v2, v1, v4}, La/ig90;-><init>(Ljava/util/List;La/hie0;B)V

    .line 98
    .line 99
    .line 100
    iput-boolean v5, p0, La/jg90;->j:Z

    .line 101
    .line 102
    invoke-virtual {p1, v3, p0}, La/vsg0;->c(La/kmq;La/yje;)Ljava/lang/Object;

    .line 103
    .line 104
    .line 105
    move-result-object p0

    .line 106
    if-ne p0, v0, :cond_5

    .line 107
    .line 108
    move-object v6, v0

    .line 109
    goto :goto_3

    .line 110
    :cond_5
    :goto_2
    sget-object v6, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 111
    .line 112
    :goto_3
    return-object v6

    .line 113
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
