.class public final La/htv0;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements La/xdr;


# instance fields
.field public final synthetic i:B

.field public final synthetic j:La/ywv0;


# direct methods
.method public synthetic constructor <init>(La/ywv0;La/yje;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/htv0;->i:B

    iput-object p1, p0, La/htv0;->j:La/ywv0;

    const/4 p1, 0x3

    invoke-direct {p0, p1, p2}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final F(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-byte v0, p0, La/htv0;->i:B

    .line 2
    .line 3
    check-cast p1, La/vne;

    .line 4
    .line 5
    check-cast p2, La/ne60;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    iget-wide p1, p2, La/ne60;->a:J

    .line 11
    .line 12
    check-cast p3, La/yje;

    .line 13
    .line 14
    new-instance p1, La/htv0;

    .line 15
    .line 16
    iget-object p0, p0, La/htv0;->j:La/ywv0;

    .line 17
    .line 18
    const/4 p2, 0x1

    .line 19
    invoke-direct {p1, p0, p3, p2}, La/htv0;-><init>(La/ywv0;La/yje;B)V

    .line 20
    .line 21
    .line 22
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 23
    .line 24
    invoke-virtual {p1, p0}, La/htv0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    return-object p0

    .line 29
    :pswitch_0
    iget-wide p1, p2, La/ne60;->a:J

    .line 30
    .line 31
    check-cast p3, La/yje;

    .line 32
    .line 33
    new-instance p1, La/htv0;

    .line 34
    .line 35
    iget-object p0, p0, La/htv0;->j:La/ywv0;

    .line 36
    .line 37
    const/4 p2, 0x0

    .line 38
    invoke-direct {p1, p0, p3, p2}, La/htv0;-><init>(La/ywv0;La/yje;B)V

    .line 39
    .line 40
    .line 41
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 42
    .line 43
    invoke-virtual {p1, p0}, La/htv0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    .locals 1

    .line 1
    iget-byte v0, p0, La/htv0;->i:B

    .line 2
    .line 3
    iget-object p0, p0, La/htv0;->j:La/ywv0;

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
    iget-object p0, p0, La/ywv0;->m:La/vkr0;

    .line 14
    .line 15
    iget-object p0, p0, La/vkr0;->c:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast p0, La/mkt0;

    .line 18
    .line 19
    iget-object p0, p0, La/mkt0;->b:Ljava/lang/Object;

    .line 20
    .line 21
    check-cast p0, La/pz40;

    .line 22
    .line 23
    check-cast p0, La/hgk0;

    .line 24
    .line 25
    invoke-virtual {p0}, La/hgk0;->getValue()Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    check-cast p1, Ljava/lang/Boolean;

    .line 30
    .line 31
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 32
    .line 33
    .line 34
    move-result p1

    .line 35
    if-eqz p1, :cond_0

    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_0
    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 39
    .line 40
    invoke-virtual {p0, p1}, La/hgk0;->setValue(Ljava/lang/Object;)V

    .line 41
    .line 42
    .line 43
    :goto_0
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 44
    .line 45
    return-object p0

    .line 46
    :pswitch_0
    sget-object v0, La/wne;->a:La/wne;

    .line 47
    .line 48
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 49
    .line 50
    .line 51
    iget-object p0, p0, La/ywv0;->l:La/oxv0;

    .line 52
    .line 53
    invoke-virtual {p0}, La/oxv0;->b()V

    .line 54
    .line 55
    .line 56
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 57
    .line 58
    return-object p0

    .line 59
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
