.class public final La/jpp;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public j:Z

.field public final synthetic k:La/uii;

.field public final synthetic l:J


# direct methods
.method public synthetic constructor <init>(La/uii;JLa/yje;B)V
    .locals 0

    .line 1
    iput-byte p5, p0, La/jpp;->i:B

    iput-object p1, p0, La/jpp;->k:La/uii;

    iput-wide p2, p0, La/jpp;->l:J

    const/4 p1, 0x2

    invoke-direct {p0, p1, p4}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 7

    .line 1
    iget-byte p1, p0, La/jpp;->i:B

    .line 2
    .line 3
    packed-switch p1, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    new-instance v0, La/jpp;

    .line 7
    .line 8
    iget-wide v2, p0, La/jpp;->l:J

    .line 9
    .line 10
    const/4 v5, 0x1

    .line 11
    iget-object v1, p0, La/jpp;->k:La/uii;

    .line 12
    .line 13
    move-object v4, p2

    .line 14
    invoke-direct/range {v0 .. v5}, La/jpp;-><init>(La/uii;JLa/yje;B)V

    .line 15
    .line 16
    .line 17
    return-object v0

    .line 18
    :pswitch_0
    move-object v4, p2

    .line 19
    new-instance v1, La/jpp;

    .line 20
    .line 21
    move-object v5, v4

    .line 22
    iget-wide v3, p0, La/jpp;->l:J

    .line 23
    .line 24
    const/4 v6, 0x0

    .line 25
    iget-object v2, p0, La/jpp;->k:La/uii;

    .line 26
    .line 27
    invoke-direct/range {v1 .. v6}, La/jpp;-><init>(La/uii;JLa/yje;B)V

    .line 28
    .line 29
    .line 30
    return-object v1

    .line 31
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-byte v0, p0, La/jpp;->i:B

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
    invoke-virtual {p0, p1, p2}, La/jpp;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, La/jpp;

    .line 15
    .line 16
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, La/jpp;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    invoke-virtual {p0, p1, p2}, La/jpp;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    check-cast p0, La/jpp;

    .line 28
    .line 29
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 30
    .line 31
    invoke-virtual {p0, p1}, La/jpp;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    iget-byte v0, p0, La/jpp;->i:B

    .line 2
    .line 3
    iget-wide v1, p0, La/jpp;->l:J

    .line 4
    .line 5
    iget-object v3, p0, La/jpp;->k:La/uii;

    .line 6
    .line 7
    const/4 v4, 0x0

    .line 8
    const-string v5, "call to \'resume\' before \'invoke\' with coroutine"

    .line 9
    .line 10
    const/4 v6, 0x1

    .line 11
    packed-switch v0, :pswitch_data_0

    .line 12
    .line 13
    .line 14
    sget-object v0, La/wne;->a:La/wne;

    .line 15
    .line 16
    iget-boolean v7, p0, La/jpp;->j:Z

    .line 17
    .line 18
    if-eqz v7, :cond_1

    .line 19
    .line 20
    if-ne v7, v6, :cond_0

    .line 21
    .line 22
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 23
    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    invoke-static {v5}, La/jf4;->n(Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    move-object p1, v4

    .line 30
    goto :goto_0

    .line 31
    :cond_1
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 32
    .line 33
    .line 34
    iget-object p1, v3, La/uii;->d:Ljava/lang/Object;

    .line 35
    .line 36
    check-cast p1, La/gzt;

    .line 37
    .line 38
    iput-boolean v6, p0, La/jpp;->j:Z

    .line 39
    .line 40
    iget-object p1, p1, La/gzt;->a:La/zkg;

    .line 41
    .line 42
    invoke-virtual {p1, v1, v2, p0}, La/zkg;->a(JLa/zje;)Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object p1

    .line 46
    if-ne p1, v0, :cond_2

    .line 47
    .line 48
    move-object p1, v0

    .line 49
    :cond_2
    :goto_0
    return-object p1

    .line 50
    :pswitch_0
    sget-object v0, La/wne;->a:La/wne;

    .line 51
    .line 52
    iget-boolean v7, p0, La/jpp;->j:Z

    .line 53
    .line 54
    if-eqz v7, :cond_4

    .line 55
    .line 56
    if-ne v7, v6, :cond_3

    .line 57
    .line 58
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 59
    .line 60
    .line 61
    goto :goto_1

    .line 62
    :cond_3
    invoke-static {v5}, La/jf4;->n(Ljava/lang/String;)V

    .line 63
    .line 64
    .line 65
    move-object p1, v4

    .line 66
    goto :goto_1

    .line 67
    :cond_4
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 68
    .line 69
    .line 70
    iget-object p1, v3, La/uii;->b:Ljava/lang/Object;

    .line 71
    .line 72
    check-cast p1, La/nmo;

    .line 73
    .line 74
    iput-boolean v6, p0, La/jpp;->j:Z

    .line 75
    .line 76
    iget-object p1, p1, La/nmo;->a:Ljava/lang/Object;

    .line 77
    .line 78
    check-cast p1, La/zkg;

    .line 79
    .line 80
    invoke-virtual {p1, v1, v2, p0}, La/zkg;->b(JLa/zje;)Ljava/lang/Object;

    .line 81
    .line 82
    .line 83
    move-result-object p1

    .line 84
    if-ne p1, v0, :cond_5

    .line 85
    .line 86
    move-object p1, v0

    .line 87
    :cond_5
    :goto_1
    return-object p1

    .line 88
    nop

    .line 89
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
