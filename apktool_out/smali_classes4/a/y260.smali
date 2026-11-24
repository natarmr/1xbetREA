.class public final La/y260;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements La/xdr;


# instance fields
.field public final synthetic i:B

.field public j:Z

.field public synthetic k:La/kmq;

.field public synthetic l:Ljava/lang/Throwable;

.field public final synthetic m:La/v360;


# direct methods
.method public synthetic constructor <init>(La/v360;La/yje;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/y260;->i:B

    iput-object p1, p0, La/y260;->m:La/v360;

    const/4 p1, 0x3

    invoke-direct {p0, p1, p2}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final F(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget-byte v0, p0, La/y260;->i:B

    .line 2
    .line 3
    iget-object p0, p0, La/y260;->m:La/v360;

    .line 4
    .line 5
    check-cast p1, La/kmq;

    .line 6
    .line 7
    check-cast p2, Ljava/lang/Throwable;

    .line 8
    .line 9
    check-cast p3, La/yje;

    .line 10
    .line 11
    packed-switch v0, :pswitch_data_0

    .line 12
    .line 13
    .line 14
    new-instance v0, La/y260;

    .line 15
    .line 16
    const/4 v1, 0x1

    .line 17
    invoke-direct {v0, p0, p3, v1}, La/y260;-><init>(La/v360;La/yje;B)V

    .line 18
    .line 19
    .line 20
    iput-object p1, v0, La/y260;->k:La/kmq;

    .line 21
    .line 22
    iput-object p2, v0, La/y260;->l:Ljava/lang/Throwable;

    .line 23
    .line 24
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 25
    .line 26
    invoke-virtual {v0, p0}, La/y260;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    return-object p0

    .line 31
    :pswitch_0
    new-instance v0, La/y260;

    .line 32
    .line 33
    const/4 v1, 0x0

    .line 34
    invoke-direct {v0, p0, p3, v1}, La/y260;-><init>(La/v360;La/yje;B)V

    .line 35
    .line 36
    .line 37
    iput-object p1, v0, La/y260;->k:La/kmq;

    .line 38
    .line 39
    iput-object p2, v0, La/y260;->l:Ljava/lang/Throwable;

    .line 40
    .line 41
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 42
    .line 43
    invoke-virtual {v0, p0}, La/y260;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object p0

    .line 47
    return-object p0

    .line 48
    nop

    .line 49
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    .line 1
    iget-byte v0, p0, La/y260;->i:B

    .line 2
    .line 3
    iget-object v1, p0, La/y260;->m:La/v360;

    .line 4
    .line 5
    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 6
    .line 7
    const/4 v3, 0x1

    .line 8
    const/4 v4, 0x0

    .line 9
    packed-switch v0, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    iget-object v0, p0, La/y260;->k:La/kmq;

    .line 13
    .line 14
    iget-object v5, p0, La/y260;->l:Ljava/lang/Throwable;

    .line 15
    .line 16
    sget-object v6, La/wne;->a:La/wne;

    .line 17
    .line 18
    iget-boolean v7, p0, La/y260;->j:Z

    .line 19
    .line 20
    if-eqz v7, :cond_1

    .line 21
    .line 22
    if-ne v7, v3, :cond_0

    .line 23
    .line 24
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 25
    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_0
    invoke-static {v2}, La/jf4;->n(Ljava/lang/String;)V

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
    sget p1, La/v360;->x0:I

    .line 36
    .line 37
    invoke-virtual {v1, v5}, La/v360;->b0(Ljava/lang/Throwable;)V

    .line 38
    .line 39
    .line 40
    new-instance p1, La/pz50;

    .line 41
    .line 42
    invoke-direct {p1, v5}, La/pz50;-><init>(Ljava/lang/Throwable;)V

    .line 43
    .line 44
    .line 45
    iput-object v4, p0, La/y260;->k:La/kmq;

    .line 46
    .line 47
    iput-object v4, p0, La/y260;->l:Ljava/lang/Throwable;

    .line 48
    .line 49
    iput-boolean v3, p0, La/y260;->j:Z

    .line 50
    .line 51
    invoke-interface {v0, p1, p0}, La/kmq;->a(Ljava/lang/Object;La/yje;)Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    move-result-object p0

    .line 55
    if-ne p0, v6, :cond_2

    .line 56
    .line 57
    move-object v4, v6

    .line 58
    goto :goto_1

    .line 59
    :cond_2
    :goto_0
    sget-object v4, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 60
    .line 61
    :goto_1
    return-object v4

    .line 62
    :pswitch_0
    iget-object v0, p0, La/y260;->k:La/kmq;

    .line 63
    .line 64
    iget-object v5, p0, La/y260;->l:Ljava/lang/Throwable;

    .line 65
    .line 66
    sget-object v6, La/wne;->a:La/wne;

    .line 67
    .line 68
    iget-boolean v7, p0, La/y260;->j:Z

    .line 69
    .line 70
    if-eqz v7, :cond_4

    .line 71
    .line 72
    if-ne v7, v3, :cond_3

    .line 73
    .line 74
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 75
    .line 76
    .line 77
    goto :goto_2

    .line 78
    :cond_3
    invoke-static {v2}, La/jf4;->n(Ljava/lang/String;)V

    .line 79
    .line 80
    .line 81
    goto :goto_3

    .line 82
    :cond_4
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 83
    .line 84
    .line 85
    sget p1, La/v360;->x0:I

    .line 86
    .line 87
    invoke-virtual {v1, v5}, La/v360;->b0(Ljava/lang/Throwable;)V

    .line 88
    .line 89
    .line 90
    new-instance p1, La/pz50;

    .line 91
    .line 92
    invoke-direct {p1, v5}, La/pz50;-><init>(Ljava/lang/Throwable;)V

    .line 93
    .line 94
    .line 95
    iput-object v4, p0, La/y260;->k:La/kmq;

    .line 96
    .line 97
    iput-object v4, p0, La/y260;->l:Ljava/lang/Throwable;

    .line 98
    .line 99
    iput-boolean v3, p0, La/y260;->j:Z

    .line 100
    .line 101
    invoke-interface {v0, p1, p0}, La/kmq;->a(Ljava/lang/Object;La/yje;)Ljava/lang/Object;

    .line 102
    .line 103
    .line 104
    move-result-object p0

    .line 105
    if-ne p0, v6, :cond_5

    .line 106
    .line 107
    move-object v4, v6

    .line 108
    goto :goto_3

    .line 109
    :cond_5
    :goto_2
    sget-object v4, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 110
    .line 111
    :goto_3
    return-object v4

    .line 112
    nop

    .line 113
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
