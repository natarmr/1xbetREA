.class public final La/u6t0;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public final synthetic j:Lkotlin/jvm/functions/Function1;

.field public final synthetic k:La/o0x;

.field public final synthetic l:La/o0x;

.field public final synthetic m:La/pz40;


# direct methods
.method public synthetic constructor <init>(Lkotlin/jvm/functions/Function1;La/o0x;La/o0x;La/pz40;La/yje;B)V
    .locals 0

    .line 1
    iput-byte p6, p0, La/u6t0;->i:B

    iput-object p1, p0, La/u6t0;->j:Lkotlin/jvm/functions/Function1;

    iput-object p2, p0, La/u6t0;->k:La/o0x;

    iput-object p3, p0, La/u6t0;->l:La/o0x;

    iput-object p4, p0, La/u6t0;->m:La/pz40;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p5}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 8

    .line 1
    iget-byte p1, p0, La/u6t0;->i:B

    .line 2
    .line 3
    packed-switch p1, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    new-instance v0, La/u6t0;

    .line 7
    .line 8
    iget-object v4, p0, La/u6t0;->m:La/pz40;

    .line 9
    .line 10
    const/4 v6, 0x1

    .line 11
    iget-object v1, p0, La/u6t0;->j:Lkotlin/jvm/functions/Function1;

    .line 12
    .line 13
    iget-object v2, p0, La/u6t0;->k:La/o0x;

    .line 14
    .line 15
    iget-object v3, p0, La/u6t0;->l:La/o0x;

    .line 16
    .line 17
    move-object v5, p2

    .line 18
    invoke-direct/range {v0 .. v6}, La/u6t0;-><init>(Lkotlin/jvm/functions/Function1;La/o0x;La/o0x;La/pz40;La/yje;B)V

    .line 19
    .line 20
    .line 21
    return-object v0

    .line 22
    :pswitch_0
    move-object v5, p2

    .line 23
    new-instance v1, La/u6t0;

    .line 24
    .line 25
    move-object v6, v5

    .line 26
    iget-object v5, p0, La/u6t0;->m:La/pz40;

    .line 27
    .line 28
    const/4 v7, 0x0

    .line 29
    iget-object v2, p0, La/u6t0;->j:Lkotlin/jvm/functions/Function1;

    .line 30
    .line 31
    iget-object v3, p0, La/u6t0;->k:La/o0x;

    .line 32
    .line 33
    iget-object v4, p0, La/u6t0;->l:La/o0x;

    .line 34
    .line 35
    invoke-direct/range {v1 .. v7}, La/u6t0;-><init>(Lkotlin/jvm/functions/Function1;La/o0x;La/o0x;La/pz40;La/yje;B)V

    .line 36
    .line 37
    .line 38
    return-object v1

    .line 39
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-byte v0, p0, La/u6t0;->i:B

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
    invoke-virtual {p0, p1, p2}, La/u6t0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, La/u6t0;

    .line 15
    .line 16
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, La/u6t0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    invoke-virtual {p0, p1, p2}, La/u6t0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    check-cast p0, La/u6t0;

    .line 28
    .line 29
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 30
    .line 31
    invoke-virtual {p0, p1}, La/u6t0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    .locals 4

    .line 1
    iget-byte v0, p0, La/u6t0;->i:B

    .line 2
    .line 3
    iget-object v1, p0, La/u6t0;->l:La/o0x;

    .line 4
    .line 5
    iget-object v2, p0, La/u6t0;->k:La/o0x;

    .line 6
    .line 7
    iget-object v3, p0, La/u6t0;->m:La/pz40;

    .line 8
    .line 9
    iget-object p0, p0, La/u6t0;->j:Lkotlin/jvm/functions/Function1;

    .line 10
    .line 11
    packed-switch v0, :pswitch_data_0

    .line 12
    .line 13
    .line 14
    sget-object v0, La/wne;->a:La/wne;

    .line 15
    .line 16
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 17
    .line 18
    .line 19
    invoke-interface {v3}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    check-cast p1, Ljava/lang/Boolean;

    .line 24
    .line 25
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 26
    .line 27
    .line 28
    move-result p1

    .line 29
    if-eqz p1, :cond_0

    .line 30
    .line 31
    move-object v1, v2

    .line 32
    :cond_0
    invoke-interface {p0, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 36
    .line 37
    return-object p0

    .line 38
    :pswitch_0
    sget-object v0, La/wne;->a:La/wne;

    .line 39
    .line 40
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 41
    .line 42
    .line 43
    invoke-interface {v3}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object p1

    .line 47
    check-cast p1, Ljava/lang/Boolean;

    .line 48
    .line 49
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 50
    .line 51
    .line 52
    move-result p1

    .line 53
    if-eqz p1, :cond_1

    .line 54
    .line 55
    move-object v1, v2

    .line 56
    :cond_1
    invoke-interface {p0, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 60
    .line 61
    return-object p0

    .line 62
    nop

    .line 63
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
