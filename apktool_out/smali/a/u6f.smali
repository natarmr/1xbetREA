.class public final La/u6f;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public j:La/r7f;

.field public k:Z

.field public final synthetic l:La/r7f;


# direct methods
.method public synthetic constructor <init>(La/r7f;La/yje;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/u6f;->i:B

    iput-object p1, p0, La/u6f;->l:La/r7f;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 1

    .line 1
    iget-byte p1, p0, La/u6f;->i:B

    .line 2
    .line 3
    iget-object p0, p0, La/u6f;->l:La/r7f;

    .line 4
    .line 5
    packed-switch p1, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance p1, La/u6f;

    .line 9
    .line 10
    const/4 v0, 0x1

    .line 11
    invoke-direct {p1, p0, p2, v0}, La/u6f;-><init>(La/r7f;La/yje;B)V

    .line 12
    .line 13
    .line 14
    return-object p1

    .line 15
    :pswitch_0
    new-instance p1, La/u6f;

    .line 16
    .line 17
    const/4 v0, 0x0

    .line 18
    invoke-direct {p1, p0, p2, v0}, La/u6f;-><init>(La/r7f;La/yje;B)V

    .line 19
    .line 20
    .line 21
    return-object p1

    .line 22
    nop

    .line 23
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-byte v0, p0, La/u6f;->i:B

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
    invoke-virtual {p0, p1, p2}, La/u6f;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, La/u6f;

    .line 15
    .line 16
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, La/u6f;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    invoke-virtual {p0, p1, p2}, La/u6f;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    check-cast p0, La/u6f;

    .line 28
    .line 29
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 30
    .line 31
    invoke-virtual {p0, p1}, La/u6f;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    .locals 6

    .line 1
    iget-byte v0, p0, La/u6f;->i:B

    .line 2
    .line 3
    iget-object v1, p0, La/u6f;->l:La/r7f;

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
    iget-boolean v5, p0, La/u6f;->k:Z

    .line 15
    .line 16
    if-eqz v5, :cond_1

    .line 17
    .line 18
    if-ne v5, v4, :cond_0

    .line 19
    .line 20
    iget-object v1, p0, La/u6f;->j:La/r7f;

    .line 21
    .line 22
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 23
    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    invoke-static {v3}, La/jf4;->n(Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    goto :goto_1

    .line 30
    :cond_1
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 31
    .line 32
    .line 33
    iget-object p1, v1, La/r7f;->w0:La/khf0;

    .line 34
    .line 35
    sget-object v2, La/bm5;->i:La/bm5;

    .line 36
    .line 37
    iput-object v1, p0, La/u6f;->j:La/r7f;

    .line 38
    .line 39
    iput-boolean v4, p0, La/u6f;->k:Z

    .line 40
    .line 41
    invoke-static {p1, v2, p0}, La/khf0;->G(La/khf0;La/bm5;La/yje;)Ljava/io/Serializable;

    .line 42
    .line 43
    .line 44
    move-result-object p1

    .line 45
    if-ne p1, v0, :cond_2

    .line 46
    .line 47
    move-object v2, v0

    .line 48
    goto :goto_1

    .line 49
    :cond_2
    :goto_0
    check-cast p1, La/ql5;

    .line 50
    .line 51
    invoke-virtual {v1, p1}, La/r7f;->i0(La/ql5;)V

    .line 52
    .line 53
    .line 54
    sget-object v2, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 55
    .line 56
    :goto_1
    return-object v2

    .line 57
    :pswitch_0
    sget-object v0, La/wne;->a:La/wne;

    .line 58
    .line 59
    iget-boolean v5, p0, La/u6f;->k:Z

    .line 60
    .line 61
    if-eqz v5, :cond_4

    .line 62
    .line 63
    if-ne v5, v4, :cond_3

    .line 64
    .line 65
    iget-object p0, p0, La/u6f;->j:La/r7f;

    .line 66
    .line 67
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 68
    .line 69
    .line 70
    goto :goto_2

    .line 71
    :cond_3
    invoke-static {v3}, La/jf4;->n(Ljava/lang/String;)V

    .line 72
    .line 73
    .line 74
    goto :goto_3

    .line 75
    :cond_4
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 76
    .line 77
    .line 78
    iget-object p1, v1, La/r7f;->w0:La/khf0;

    .line 79
    .line 80
    sget-object v2, La/bm5;->i:La/bm5;

    .line 81
    .line 82
    iput-object v1, p0, La/u6f;->j:La/r7f;

    .line 83
    .line 84
    iput-boolean v4, p0, La/u6f;->k:Z

    .line 85
    .line 86
    invoke-static {p1, v2, p0}, La/khf0;->G(La/khf0;La/bm5;La/yje;)Ljava/io/Serializable;

    .line 87
    .line 88
    .line 89
    move-result-object p1

    .line 90
    if-ne p1, v0, :cond_5

    .line 91
    .line 92
    move-object v2, v0

    .line 93
    goto :goto_3

    .line 94
    :cond_5
    move-object p0, v1

    .line 95
    :goto_2
    check-cast p1, La/ql5;

    .line 96
    .line 97
    invoke-virtual {p0, p1}, La/r7f;->i0(La/ql5;)V

    .line 98
    .line 99
    .line 100
    sget-object p0, La/j3f;->a:La/j3f;

    .line 101
    .line 102
    invoke-virtual {v1, p0}, La/r7f;->R(La/c4f;)V

    .line 103
    .line 104
    .line 105
    sget-object v2, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 106
    .line 107
    :goto_3
    return-object v2

    .line 108
    nop

    .line 109
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
