.class public final La/i360;
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

.field public final synthetic n:La/rz50;


# direct methods
.method public synthetic constructor <init>(La/v360;La/rz50;La/yje;B)V
    .locals 0

    .line 1
    iput-byte p4, p0, La/i360;->i:B

    iput-object p1, p0, La/i360;->m:La/v360;

    iput-object p2, p0, La/i360;->n:La/rz50;

    const/4 p1, 0x3

    invoke-direct {p0, p1, p3}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final F(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 1
    iget-byte v0, p0, La/i360;->i:B

    .line 2
    .line 3
    check-cast p1, La/kmq;

    .line 4
    .line 5
    check-cast p2, Ljava/lang/Throwable;

    .line 6
    .line 7
    check-cast p3, La/yje;

    .line 8
    .line 9
    packed-switch v0, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    new-instance v0, La/i360;

    .line 13
    .line 14
    iget-object v1, p0, La/i360;->n:La/rz50;

    .line 15
    .line 16
    const/4 v2, 0x1

    .line 17
    iget-object p0, p0, La/i360;->m:La/v360;

    .line 18
    .line 19
    invoke-direct {v0, p0, v1, p3, v2}, La/i360;-><init>(La/v360;La/rz50;La/yje;B)V

    .line 20
    .line 21
    .line 22
    iput-object p1, v0, La/i360;->k:La/kmq;

    .line 23
    .line 24
    iput-object p2, v0, La/i360;->l:Ljava/lang/Throwable;

    .line 25
    .line 26
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 27
    .line 28
    invoke-virtual {v0, p0}, La/i360;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object p0

    .line 32
    return-object p0

    .line 33
    :pswitch_0
    new-instance v0, La/i360;

    .line 34
    .line 35
    iget-object v1, p0, La/i360;->n:La/rz50;

    .line 36
    .line 37
    const/4 v2, 0x0

    .line 38
    iget-object p0, p0, La/i360;->m:La/v360;

    .line 39
    .line 40
    invoke-direct {v0, p0, v1, p3, v2}, La/i360;-><init>(La/v360;La/rz50;La/yje;B)V

    .line 41
    .line 42
    .line 43
    iput-object p1, v0, La/i360;->k:La/kmq;

    .line 44
    .line 45
    iput-object p2, v0, La/i360;->l:Ljava/lang/Throwable;

    .line 46
    .line 47
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 48
    .line 49
    invoke-virtual {v0, p0}, La/i360;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    move-result-object p0

    .line 53
    return-object p0

    .line 54
    nop

    .line 55
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    .line 1
    iget-byte v0, p0, La/i360;->i:B

    .line 2
    .line 3
    iget-object v1, p0, La/i360;->n:La/rz50;

    .line 4
    .line 5
    iget-object v2, p0, La/i360;->m:La/v360;

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
    iget-object v0, p0, La/i360;->k:La/kmq;

    .line 15
    .line 16
    iget-object v6, p0, La/i360;->l:Ljava/lang/Throwable;

    .line 17
    .line 18
    sget-object v7, La/wne;->a:La/wne;

    .line 19
    .line 20
    iget-boolean v8, p0, La/i360;->j:Z

    .line 21
    .line 22
    if-eqz v8, :cond_1

    .line 23
    .line 24
    if-ne v8, v4, :cond_0

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
    sget p1, La/v360;->x0:I

    .line 38
    .line 39
    invoke-virtual {v2, v6}, La/v360;->b0(Ljava/lang/Throwable;)V

    .line 40
    .line 41
    .line 42
    iput-object v5, p0, La/i360;->k:La/kmq;

    .line 43
    .line 44
    iput-object v5, p0, La/i360;->l:Ljava/lang/Throwable;

    .line 45
    .line 46
    iput-boolean v4, p0, La/i360;->j:Z

    .line 47
    .line 48
    invoke-interface {v0, v1, p0}, La/kmq;->a(Ljava/lang/Object;La/yje;)Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    move-result-object p0

    .line 52
    if-ne p0, v7, :cond_2

    .line 53
    .line 54
    move-object v5, v7

    .line 55
    goto :goto_1

    .line 56
    :cond_2
    :goto_0
    sget-object v5, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 57
    .line 58
    :goto_1
    return-object v5

    .line 59
    :pswitch_0
    iget-object v0, p0, La/i360;->k:La/kmq;

    .line 60
    .line 61
    iget-object v6, p0, La/i360;->l:Ljava/lang/Throwable;

    .line 62
    .line 63
    sget-object v7, La/wne;->a:La/wne;

    .line 64
    .line 65
    iget-boolean v8, p0, La/i360;->j:Z

    .line 66
    .line 67
    if-eqz v8, :cond_4

    .line 68
    .line 69
    if-ne v8, v4, :cond_3

    .line 70
    .line 71
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 72
    .line 73
    .line 74
    goto :goto_2

    .line 75
    :cond_3
    invoke-static {v3}, La/jf4;->n(Ljava/lang/String;)V

    .line 76
    .line 77
    .line 78
    goto :goto_3

    .line 79
    :cond_4
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 80
    .line 81
    .line 82
    sget p1, La/v360;->x0:I

    .line 83
    .line 84
    invoke-virtual {v2, v6}, La/v360;->b0(Ljava/lang/Throwable;)V

    .line 85
    .line 86
    .line 87
    iput-object v5, p0, La/i360;->k:La/kmq;

    .line 88
    .line 89
    iput-object v5, p0, La/i360;->l:Ljava/lang/Throwable;

    .line 90
    .line 91
    iput-boolean v4, p0, La/i360;->j:Z

    .line 92
    .line 93
    invoke-interface {v0, v1, p0}, La/kmq;->a(Ljava/lang/Object;La/yje;)Ljava/lang/Object;

    .line 94
    .line 95
    .line 96
    move-result-object p0

    .line 97
    if-ne p0, v7, :cond_5

    .line 98
    .line 99
    move-object v5, v7

    .line 100
    goto :goto_3

    .line 101
    :cond_5
    :goto_2
    sget-object v5, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 102
    .line 103
    :goto_3
    return-object v5

    .line 104
    nop

    .line 105
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
