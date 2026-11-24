.class public final synthetic La/npk0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/tpk0;


# direct methods
.method public synthetic constructor <init>(La/tpk0;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/npk0;->a:B

    iput-object p1, p0, La/npk0;->b:La/tpk0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 1
    iget-byte v0, p0, La/npk0;->a:B

    .line 2
    .line 3
    iget-object p0, p0, La/npk0;->b:La/tpk0;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    check-cast p1, La/k0w0;

    .line 9
    .line 10
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    iget-object v0, p0, La/tpk0;->A:La/zie0;

    .line 14
    .line 15
    invoke-virtual {p0}, La/i3t0;->D()Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    check-cast p0, La/jpk0;

    .line 20
    .line 21
    iget p0, p0, La/jpk0;->a:I

    .line 22
    .line 23
    sget-object v1, La/ifh0;->a:La/ifh0;

    .line 24
    .line 25
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 26
    .line 27
    .line 28
    new-instance v0, Lorg/xplatform/special_event/impl/search/navigation/SearchScreenFactory$getScreen$1;

    .line 29
    .line 30
    invoke-direct {v0, p0, v1}, Lorg/xplatform/special_event/impl/search/navigation/SearchScreenFactory$getScreen$1;-><init>(ILa/ifh0;)V

    .line 31
    .line 32
    .line 33
    invoke-virtual {p1, v0}, La/k0w0;->h(La/m7h0;)La/ikt0;

    .line 34
    .line 35
    .line 36
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 37
    .line 38
    return-object p0

    .line 39
    :pswitch_0
    check-cast p1, Ljava/lang/Throwable;

    .line 40
    .line 41
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 42
    .line 43
    .line 44
    iget-object v0, p0, La/tpk0;->N:La/duj;

    .line 45
    .line 46
    new-instance v1, La/edk0;

    .line 47
    .line 48
    const/4 v2, 0x3

    .line 49
    invoke-direct {v1, p0, v2}, La/edk0;-><init>(Ljava/lang/Object;B)V

    .line 50
    .line 51
    .line 52
    invoke-virtual {v0, p1, v1}, La/duj;->b(Ljava/lang/Throwable;Lkotlin/jvm/functions/Function2;)V

    .line 53
    .line 54
    .line 55
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 56
    .line 57
    return-object p0

    .line 58
    nop

    .line 59
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
