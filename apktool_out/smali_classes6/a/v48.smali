.class public final La/v48;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public final synthetic j:La/kwj;

.field public final synthetic k:Lkotlin/jvm/functions/Function1;

.field public final synthetic l:I


# direct methods
.method public constructor <init>(La/kwj;ILkotlin/jvm/functions/Function1;La/yje;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-byte v0, p0, La/v48;->i:B

    .line 3
    .line 4
    iput-object p1, p0, La/v48;->j:La/kwj;

    .line 5
    .line 6
    iput p2, p0, La/v48;->l:I

    .line 7
    .line 8
    iput-object p3, p0, La/v48;->k:Lkotlin/jvm/functions/Function1;

    .line 9
    .line 10
    const/4 p1, 0x2

    .line 11
    invoke-direct {p0, p1, p4}, La/bnn0;-><init>(ILa/yje;)V

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method public constructor <init>(La/kwj;Lkotlin/jvm/functions/Function1;ILa/yje;)V
    .locals 1

    const/4 v0, 0x1

    iput-byte v0, p0, La/v48;->i:B

    .line 15
    iput-object p1, p0, La/v48;->j:La/kwj;

    iput-object p2, p0, La/v48;->k:Lkotlin/jvm/functions/Function1;

    iput p3, p0, La/v48;->l:I

    const/4 p1, 0x2

    invoke-direct {p0, p1, p4}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 2

    .line 1
    iget-byte p1, p0, La/v48;->i:B

    .line 2
    .line 3
    iget v0, p0, La/v48;->l:I

    .line 4
    .line 5
    iget-object v1, p0, La/v48;->k:Lkotlin/jvm/functions/Function1;

    .line 6
    .line 7
    iget-object p0, p0, La/v48;->j:La/kwj;

    .line 8
    .line 9
    packed-switch p1, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    new-instance p1, La/v48;

    .line 13
    .line 14
    invoke-direct {p1, p0, v1, v0, p2}, La/v48;-><init>(La/kwj;Lkotlin/jvm/functions/Function1;ILa/yje;)V

    .line 15
    .line 16
    .line 17
    return-object p1

    .line 18
    :pswitch_0
    new-instance p1, La/v48;

    .line 19
    .line 20
    invoke-direct {p1, p0, v0, v1, p2}, La/v48;-><init>(La/kwj;ILkotlin/jvm/functions/Function1;La/yje;)V

    .line 21
    .line 22
    .line 23
    return-object p1

    .line 24
    nop

    .line 25
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-byte v0, p0, La/v48;->i:B

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
    invoke-virtual {p0, p1, p2}, La/v48;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, La/v48;

    .line 15
    .line 16
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, La/v48;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    invoke-virtual {p0, p1, p2}, La/v48;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    check-cast p0, La/v48;

    .line 28
    .line 29
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 30
    .line 31
    invoke-virtual {p0, p1}, La/v48;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    .locals 3

    .line 1
    iget-byte v0, p0, La/v48;->i:B

    .line 2
    .line 3
    iget v1, p0, La/v48;->l:I

    .line 4
    .line 5
    iget-object v2, p0, La/v48;->k:Lkotlin/jvm/functions/Function1;

    .line 6
    .line 7
    iget-object p0, p0, La/v48;->j:La/kwj;

    .line 8
    .line 9
    packed-switch v0, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    sget-object v0, La/wne;->a:La/wne;

    .line 13
    .line 14
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 15
    .line 16
    .line 17
    iget-object p1, p0, La/xk80;->k:La/ywj;

    .line 18
    .line 19
    invoke-virtual {p1}, La/ywj;->a()Z

    .line 20
    .line 21
    .line 22
    move-result p1

    .line 23
    if-nez p1, :cond_1

    .line 24
    .line 25
    invoke-virtual {p0}, La/xk80;->k()I

    .line 26
    .line 27
    .line 28
    move-result p0

    .line 29
    if-nez v1, :cond_0

    .line 30
    .line 31
    const/4 p0, 0x0

    .line 32
    goto :goto_0

    .line 33
    :cond_0
    rem-int/2addr p0, v1

    .line 34
    add-int/2addr p0, v1

    .line 35
    rem-int/2addr p0, v1

    .line 36
    :goto_0
    new-instance p1, Ljava/lang/Integer;

    .line 37
    .line 38
    invoke-direct {p1, p0}, Ljava/lang/Integer;-><init>(I)V

    .line 39
    .line 40
    .line 41
    invoke-interface {v2, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    :cond_1
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 45
    .line 46
    return-object p0

    .line 47
    :pswitch_0
    sget-object v0, La/wne;->a:La/wne;

    .line 48
    .line 49
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 50
    .line 51
    .line 52
    iget-object p1, p0, La/xk80;->k:La/ywj;

    .line 53
    .line 54
    invoke-virtual {p1}, La/ywj;->a()Z

    .line 55
    .line 56
    .line 57
    move-result p1

    .line 58
    if-eqz p1, :cond_2

    .line 59
    .line 60
    invoke-virtual {p0}, La/xk80;->k()I

    .line 61
    .line 62
    .line 63
    move-result p1

    .line 64
    if-eq p1, v1, :cond_2

    .line 65
    .line 66
    new-instance p1, La/g48;

    .line 67
    .line 68
    invoke-virtual {p0}, La/xk80;->k()I

    .line 69
    .line 70
    .line 71
    move-result p0

    .line 72
    invoke-direct {p1, p0}, La/g48;-><init>(I)V

    .line 73
    .line 74
    .line 75
    invoke-interface {v2, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 76
    .line 77
    .line 78
    :cond_2
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 79
    .line 80
    return-object p0

    .line 81
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
