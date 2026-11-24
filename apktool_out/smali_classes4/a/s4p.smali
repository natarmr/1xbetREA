.class public final La/s4p;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements La/xdr;


# instance fields
.field public final synthetic i:B

.field public synthetic j:Ljava/lang/Throwable;

.field public final synthetic k:Lorg/xplatform/favorites/impl/presentation/category/a;


# direct methods
.method public synthetic constructor <init>(Lorg/xplatform/favorites/impl/presentation/category/a;La/yje;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/s4p;->i:B

    iput-object p1, p0, La/s4p;->k:Lorg/xplatform/favorites/impl/presentation/category/a;

    const/4 p1, 0x3

    invoke-direct {p0, p1, p2}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final F(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-byte v0, p0, La/s4p;->i:B

    .line 2
    .line 3
    iget-object p0, p0, La/s4p;->k:Lorg/xplatform/favorites/impl/presentation/category/a;

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
    new-instance p1, La/s4p;

    .line 15
    .line 16
    const/4 v0, 0x1

    .line 17
    invoke-direct {p1, p0, p3, v0}, La/s4p;-><init>(Lorg/xplatform/favorites/impl/presentation/category/a;La/yje;B)V

    .line 18
    .line 19
    .line 20
    iput-object p2, p1, La/s4p;->j:Ljava/lang/Throwable;

    .line 21
    .line 22
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 23
    .line 24
    invoke-virtual {p1, p0}, La/s4p;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    return-object p0

    .line 29
    :pswitch_0
    new-instance p1, La/s4p;

    .line 30
    .line 31
    const/4 v0, 0x0

    .line 32
    invoke-direct {p1, p0, p3, v0}, La/s4p;-><init>(Lorg/xplatform/favorites/impl/presentation/category/a;La/yje;B)V

    .line 33
    .line 34
    .line 35
    iput-object p2, p1, La/s4p;->j:Ljava/lang/Throwable;

    .line 36
    .line 37
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 38
    .line 39
    invoke-virtual {p1, p0}, La/s4p;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object p0

    .line 43
    return-object p0

    .line 44
    nop

    .line 45
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 1
    iget-byte v0, p0, La/s4p;->i:B

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    iget-object v2, p0, La/s4p;->k:Lorg/xplatform/favorites/impl/presentation/category/a;

    .line 5
    .line 6
    iget-object p0, p0, La/s4p;->j:Ljava/lang/Throwable;

    .line 7
    .line 8
    packed-switch v0, :pswitch_data_0

    .line 9
    .line 10
    .line 11
    sget-object v0, La/wne;->a:La/wne;

    .line 12
    .line 13
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 14
    .line 15
    .line 16
    sget p1, Lorg/xplatform/favorites/impl/presentation/category/a;->L:I

    .line 17
    .line 18
    iget-object p1, v2, Lorg/xplatform/favorites/impl/presentation/category/a;->B:La/duj;

    .line 19
    .line 20
    new-instance v0, La/q4p;

    .line 21
    .line 22
    invoke-direct {v0, v2, v1}, La/q4p;-><init>(Lorg/xplatform/favorites/impl/presentation/category/a;B)V

    .line 23
    .line 24
    .line 25
    invoke-virtual {p1, p0, v0}, La/duj;->b(Ljava/lang/Throwable;Lkotlin/jvm/functions/Function2;)V

    .line 26
    .line 27
    .line 28
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 29
    .line 30
    return-object p0

    .line 31
    :pswitch_0
    sget-object v0, La/wne;->a:La/wne;

    .line 32
    .line 33
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 34
    .line 35
    .line 36
    sget p1, Lorg/xplatform/favorites/impl/presentation/category/a;->L:I

    .line 37
    .line 38
    iget-object p1, v2, Lorg/xplatform/favorites/impl/presentation/category/a;->B:La/duj;

    .line 39
    .line 40
    new-instance v0, La/q4p;

    .line 41
    .line 42
    invoke-direct {v0, v2, v1}, La/q4p;-><init>(Lorg/xplatform/favorites/impl/presentation/category/a;B)V

    .line 43
    .line 44
    .line 45
    invoke-virtual {p1, p0, v0}, La/duj;->b(Ljava/lang/Throwable;Lkotlin/jvm/functions/Function2;)V

    .line 46
    .line 47
    .line 48
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 49
    .line 50
    return-object p0

    .line 51
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
