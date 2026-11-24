.class public final La/oyh;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public j:Z

.field public final synthetic k:La/aeg0;

.field public final synthetic l:Z

.field public final synthetic m:Z

.field public final synthetic n:Lkotlin/jvm/functions/Function1;


# direct methods
.method public constructor <init>(La/aeg0;ZZLkotlin/jvm/functions/Function1;La/yje;)V
    .locals 1

    const/4 v0, 0x0

    iput-byte v0, p0, La/oyh;->i:B

    .line 17
    iput-object p1, p0, La/oyh;->k:La/aeg0;

    iput-boolean p2, p0, La/oyh;->l:Z

    iput-boolean p3, p0, La/oyh;->m:Z

    iput-object p4, p0, La/oyh;->n:Lkotlin/jvm/functions/Function1;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p5}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method

.method public constructor <init>(La/yje;La/aeg0;ZZLkotlin/jvm/functions/Function1;)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-byte v0, p0, La/oyh;->i:B

    .line 3
    .line 4
    iput-object p2, p0, La/oyh;->k:La/aeg0;

    .line 5
    .line 6
    iput-boolean p3, p0, La/oyh;->l:Z

    .line 7
    .line 8
    iput-boolean p4, p0, La/oyh;->m:Z

    .line 9
    .line 10
    iput-object p5, p0, La/oyh;->n:Lkotlin/jvm/functions/Function1;

    .line 11
    .line 12
    const/4 p2, 0x2

    .line 13
    invoke-direct {p0, p2, p1}, La/bnn0;-><init>(ILa/yje;)V

    .line 14
    .line 15
    .line 16
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 7

    .line 1
    iget-byte p1, p0, La/oyh;->i:B

    .line 2
    .line 3
    packed-switch p1, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    new-instance v0, La/oyh;

    .line 7
    .line 8
    iget-boolean v4, p0, La/oyh;->m:Z

    .line 9
    .line 10
    iget-object v5, p0, La/oyh;->n:Lkotlin/jvm/functions/Function1;

    .line 11
    .line 12
    iget-object v2, p0, La/oyh;->k:La/aeg0;

    .line 13
    .line 14
    iget-boolean v3, p0, La/oyh;->l:Z

    .line 15
    .line 16
    move-object v1, p2

    .line 17
    invoke-direct/range {v0 .. v5}, La/oyh;-><init>(La/yje;La/aeg0;ZZLkotlin/jvm/functions/Function1;)V

    .line 18
    .line 19
    .line 20
    return-object v0

    .line 21
    :pswitch_0
    move-object v1, p2

    .line 22
    new-instance p1, La/oyh;

    .line 23
    .line 24
    iget-boolean v4, p0, La/oyh;->m:Z

    .line 25
    .line 26
    iget-object v5, p0, La/oyh;->n:Lkotlin/jvm/functions/Function1;

    .line 27
    .line 28
    iget-object v2, p0, La/oyh;->k:La/aeg0;

    .line 29
    .line 30
    iget-boolean v3, p0, La/oyh;->l:Z

    .line 31
    .line 32
    move-object v6, v1

    .line 33
    move-object v1, p1

    .line 34
    invoke-direct/range {v1 .. v6}, La/oyh;-><init>(La/aeg0;ZZLkotlin/jvm/functions/Function1;La/yje;)V

    .line 35
    .line 36
    .line 37
    return-object v1

    .line 38
    nop

    .line 39
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-byte v0, p0, La/oyh;->i:B

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
    invoke-virtual {p0, p1, p2}, La/oyh;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, La/oyh;

    .line 15
    .line 16
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, La/oyh;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    invoke-virtual {p0, p1, p2}, La/oyh;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    check-cast p0, La/oyh;

    .line 28
    .line 29
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 30
    .line 31
    invoke-virtual {p0, p1}, La/oyh;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    .locals 12

    .line 1
    iget-byte v0, p0, La/oyh;->i:B

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
    iget-boolean v4, p0, La/oyh;->j:Z

    .line 13
    .line 14
    if-eqz v4, :cond_1

    .line 15
    .line 16
    if-ne v4, v3, :cond_0

    .line 17
    .line 18
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

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
    move-object p1, v1

    .line 26
    goto :goto_0

    .line 27
    :cond_1
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 28
    .line 29
    .line 30
    new-instance v5, La/nyh;

    .line 31
    .line 32
    iget-object v10, p0, La/oyh;->n:Lkotlin/jvm/functions/Function1;

    .line 33
    .line 34
    const/4 v11, 0x1

    .line 35
    iget-boolean v6, p0, La/oyh;->m:Z

    .line 36
    .line 37
    iget-boolean v7, p0, La/oyh;->l:Z

    .line 38
    .line 39
    iget-object v8, p0, La/oyh;->k:La/aeg0;

    .line 40
    .line 41
    const/4 v9, 0x0

    .line 42
    invoke-direct/range {v5 .. v11}, La/nyh;-><init>(ZZLa/aeg0;La/yje;Lkotlin/jvm/functions/Function1;B)V

    .line 43
    .line 44
    .line 45
    iput-boolean v3, p0, La/oyh;->j:Z

    .line 46
    .line 47
    invoke-virtual {v8, v7, v5, p0}, La/aeg0;->r(ZLkotlin/jvm/functions/Function2;La/zje;)Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object p1

    .line 51
    if-ne p1, v0, :cond_2

    .line 52
    .line 53
    move-object p1, v0

    .line 54
    :cond_2
    :goto_0
    return-object p1

    .line 55
    :pswitch_0
    sget-object v0, La/wne;->a:La/wne;

    .line 56
    .line 57
    iget-boolean v4, p0, La/oyh;->j:Z

    .line 58
    .line 59
    if-eqz v4, :cond_4

    .line 60
    .line 61
    if-ne v4, v3, :cond_3

    .line 62
    .line 63
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 64
    .line 65
    .line 66
    goto :goto_1

    .line 67
    :cond_3
    invoke-static {v2}, La/jf4;->n(Ljava/lang/String;)V

    .line 68
    .line 69
    .line 70
    move-object p1, v1

    .line 71
    goto :goto_1

    .line 72
    :cond_4
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 73
    .line 74
    .line 75
    new-instance v5, La/nyh;

    .line 76
    .line 77
    const/4 v9, 0x0

    .line 78
    const/4 v11, 0x0

    .line 79
    iget-boolean v6, p0, La/oyh;->m:Z

    .line 80
    .line 81
    iget-boolean v7, p0, La/oyh;->l:Z

    .line 82
    .line 83
    iget-object v8, p0, La/oyh;->k:La/aeg0;

    .line 84
    .line 85
    iget-object v10, p0, La/oyh;->n:Lkotlin/jvm/functions/Function1;

    .line 86
    .line 87
    invoke-direct/range {v5 .. v11}, La/nyh;-><init>(ZZLa/aeg0;La/yje;Lkotlin/jvm/functions/Function1;B)V

    .line 88
    .line 89
    .line 90
    iput-boolean v3, p0, La/oyh;->j:Z

    .line 91
    .line 92
    invoke-virtual {v8, v7, v5, p0}, La/aeg0;->r(ZLkotlin/jvm/functions/Function2;La/zje;)Ljava/lang/Object;

    .line 93
    .line 94
    .line 95
    move-result-object p1

    .line 96
    if-ne p1, v0, :cond_5

    .line 97
    .line 98
    move-object p1, v0

    .line 99
    :cond_5
    :goto_1
    return-object p1

    .line 100
    nop

    .line 101
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
