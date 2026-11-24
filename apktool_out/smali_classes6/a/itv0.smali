.class public final La/itv0;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements La/xdr;


# instance fields
.field public final synthetic i:B

.field public synthetic j:F

.field public final synthetic k:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;La/yje;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/itv0;->i:B

    iput-object p1, p0, La/itv0;->k:Ljava/lang/Object;

    const/4 p1, 0x3

    invoke-direct {p0, p1, p2}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final F(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-byte v0, p0, La/itv0;->i:B

    .line 2
    .line 3
    check-cast p1, La/vne;

    .line 4
    .line 5
    check-cast p2, Ljava/lang/Number;

    .line 6
    .line 7
    invoke-virtual {p2}, Ljava/lang/Number;->floatValue()F

    .line 8
    .line 9
    .line 10
    move-result p1

    .line 11
    check-cast p3, La/yje;

    .line 12
    .line 13
    packed-switch v0, :pswitch_data_0

    .line 14
    .line 15
    .line 16
    new-instance p2, La/itv0;

    .line 17
    .line 18
    iget-object p0, p0, La/itv0;->k:Ljava/lang/Object;

    .line 19
    .line 20
    check-cast p0, Lkotlin/jvm/functions/Function1;

    .line 21
    .line 22
    const/4 v0, 0x2

    .line 23
    invoke-direct {p2, p0, p3, v0}, La/itv0;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 24
    .line 25
    .line 26
    iput p1, p2, La/itv0;->j:F

    .line 27
    .line 28
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 29
    .line 30
    invoke-virtual {p2, p0}, La/itv0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    return-object p0

    .line 35
    :pswitch_0
    new-instance p2, La/itv0;

    .line 36
    .line 37
    iget-object p0, p0, La/itv0;->k:Ljava/lang/Object;

    .line 38
    .line 39
    check-cast p0, La/ywv0;

    .line 40
    .line 41
    const/4 v0, 0x1

    .line 42
    invoke-direct {p2, p0, p3, v0}, La/itv0;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 43
    .line 44
    .line 45
    iput p1, p2, La/itv0;->j:F

    .line 46
    .line 47
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 48
    .line 49
    invoke-virtual {p2, p0}, La/itv0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    move-result-object p0

    .line 53
    return-object p0

    .line 54
    :pswitch_1
    new-instance p2, La/itv0;

    .line 55
    .line 56
    iget-object p0, p0, La/itv0;->k:Ljava/lang/Object;

    .line 57
    .line 58
    check-cast p0, La/ywv0;

    .line 59
    .line 60
    const/4 v0, 0x0

    .line 61
    invoke-direct {p2, p0, p3, v0}, La/itv0;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 62
    .line 63
    .line 64
    iput p1, p2, La/itv0;->j:F

    .line 65
    .line 66
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 67
    .line 68
    invoke-virtual {p2, p0}, La/itv0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    move-result-object p0

    .line 72
    return-object p0

    .line 73
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget-byte v0, p0, La/itv0;->i:B

    .line 2
    .line 3
    iget-object v1, p0, La/itv0;->k:Ljava/lang/Object;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    sget-object v0, La/wne;->a:La/wne;

    .line 9
    .line 10
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 11
    .line 12
    .line 13
    iget p0, p0, La/itv0;->j:F

    .line 14
    .line 15
    check-cast v1, Lkotlin/jvm/functions/Function1;

    .line 16
    .line 17
    new-instance p1, Ljava/lang/Float;

    .line 18
    .line 19
    invoke-direct {p1, p0}, Ljava/lang/Float;-><init>(F)V

    .line 20
    .line 21
    .line 22
    invoke-interface {v1, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 26
    .line 27
    return-object p0

    .line 28
    :pswitch_0
    iget p0, p0, La/itv0;->j:F

    .line 29
    .line 30
    sget-object v0, La/wne;->a:La/wne;

    .line 31
    .line 32
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 33
    .line 34
    .line 35
    check-cast v1, La/ywv0;

    .line 36
    .line 37
    iget-object p1, v1, La/ywv0;->m:La/vkr0;

    .line 38
    .line 39
    iget-object p1, p1, La/vkr0;->e:Ljava/lang/Object;

    .line 40
    .line 41
    check-cast p1, La/hcp0;

    .line 42
    .line 43
    new-instance v0, La/juv0;

    .line 44
    .line 45
    invoke-direct {v0, p0}, La/juv0;-><init>(F)V

    .line 46
    .line 47
    .line 48
    iget-object p0, p1, La/hcp0;->c:Ljava/lang/Object;

    .line 49
    .line 50
    check-cast p0, La/q99;

    .line 51
    .line 52
    invoke-interface {p0, v0}, La/jbi0;->f(Ljava/lang/Object;)Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 56
    .line 57
    return-object p0

    .line 58
    :pswitch_1
    iget p0, p0, La/itv0;->j:F

    .line 59
    .line 60
    sget-object v0, La/wne;->a:La/wne;

    .line 61
    .line 62
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 63
    .line 64
    .line 65
    check-cast v1, La/ywv0;

    .line 66
    .line 67
    iget-object p1, v1, La/ywv0;->l:La/oxv0;

    .line 68
    .line 69
    iget-object p1, p1, La/oxv0;->j:La/hcp0;

    .line 70
    .line 71
    new-instance v0, La/qxv0;

    .line 72
    .line 73
    invoke-direct {v0, p0}, La/qxv0;-><init>(F)V

    .line 74
    .line 75
    .line 76
    iget-object p0, p1, La/hcp0;->c:Ljava/lang/Object;

    .line 77
    .line 78
    check-cast p0, La/q99;

    .line 79
    .line 80
    invoke-interface {p0, v0}, La/jbi0;->f(Ljava/lang/Object;)Ljava/lang/Object;

    .line 81
    .line 82
    .line 83
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 84
    .line 85
    return-object p0

    .line 86
    nop

    .line 87
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
