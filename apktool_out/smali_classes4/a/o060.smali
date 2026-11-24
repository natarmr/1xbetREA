.class public final La/o060;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements La/ydr;


# instance fields
.field public final synthetic i:B

.field public synthetic j:La/ncz;

.field public synthetic k:La/ncz;

.field public final synthetic l:La/pz40;


# direct methods
.method public synthetic constructor <init>(La/pz40;La/yje;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/o060;->i:B

    iput-object p1, p0, La/o060;->l:La/pz40;

    const/4 p1, 0x4

    invoke-direct {p0, p1, p2}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 1
    iget-byte v0, p0, La/o060;->i:B

    .line 2
    .line 3
    iget-object v1, p0, La/o060;->l:La/pz40;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, La/o060;->j:La/ncz;

    .line 9
    .line 10
    iget-object p0, p0, La/o060;->k:La/ncz;

    .line 11
    .line 12
    sget-object v2, La/wne;->a:La/wne;

    .line 13
    .line 14
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 15
    .line 16
    .line 17
    new-instance p1, La/qrl0;

    .line 18
    .line 19
    iget v0, v0, La/ncz;->a:I

    .line 20
    .line 21
    iget p0, p0, La/ncz;->a:I

    .line 22
    .line 23
    invoke-direct {p1, v0, p0}, La/qrl0;-><init>(II)V

    .line 24
    .line 25
    .line 26
    invoke-interface {v1}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    check-cast p0, Lkotlin/jvm/functions/Function1;

    .line 31
    .line 32
    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 36
    .line 37
    return-object p0

    .line 38
    :pswitch_0
    iget-object v0, p0, La/o060;->j:La/ncz;

    .line 39
    .line 40
    iget-object p0, p0, La/o060;->k:La/ncz;

    .line 41
    .line 42
    sget-object v2, La/wne;->a:La/wne;

    .line 43
    .line 44
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 45
    .line 46
    .line 47
    new-instance p1, La/a060;

    .line 48
    .line 49
    iget v0, v0, La/ncz;->a:I

    .line 50
    .line 51
    iget p0, p0, La/ncz;->a:I

    .line 52
    .line 53
    invoke-direct {p1, v0, p0}, La/a060;-><init>(II)V

    .line 54
    .line 55
    .line 56
    invoke-interface {v1}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    move-result-object p0

    .line 60
    check-cast p0, Lkotlin/jvm/functions/Function1;

    .line 61
    .line 62
    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 66
    .line 67
    return-object p0

    .line 68
    nop

    .line 69
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final j(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-byte v0, p0, La/o060;->i:B

    .line 2
    .line 3
    iget-object p0, p0, La/o060;->l:La/pz40;

    .line 4
    .line 5
    check-cast p1, La/vne;

    .line 6
    .line 7
    check-cast p2, La/ncz;

    .line 8
    .line 9
    check-cast p3, La/ncz;

    .line 10
    .line 11
    check-cast p4, La/yje;

    .line 12
    .line 13
    packed-switch v0, :pswitch_data_0

    .line 14
    .line 15
    .line 16
    new-instance p1, La/o060;

    .line 17
    .line 18
    const/4 v0, 0x1

    .line 19
    invoke-direct {p1, p0, p4, v0}, La/o060;-><init>(La/pz40;La/yje;B)V

    .line 20
    .line 21
    .line 22
    iput-object p2, p1, La/o060;->j:La/ncz;

    .line 23
    .line 24
    iput-object p3, p1, La/o060;->k:La/ncz;

    .line 25
    .line 26
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 27
    .line 28
    invoke-virtual {p1, p0}, La/o060;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object p0

    .line 32
    return-object p0

    .line 33
    :pswitch_0
    new-instance p1, La/o060;

    .line 34
    .line 35
    const/4 v0, 0x0

    .line 36
    invoke-direct {p1, p0, p4, v0}, La/o060;-><init>(La/pz40;La/yje;B)V

    .line 37
    .line 38
    .line 39
    iput-object p2, p1, La/o060;->j:La/ncz;

    .line 40
    .line 41
    iput-object p3, p1, La/o060;->k:La/ncz;

    .line 42
    .line 43
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 44
    .line 45
    invoke-virtual {p1, p0}, La/o060;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object p0

    .line 49
    return-object p0

    .line 50
    nop

    .line 51
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
