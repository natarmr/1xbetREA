.class public final synthetic La/rir0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/njr0;


# direct methods
.method public synthetic constructor <init>(La/njr0;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/rir0;->a:B

    iput-object p1, p0, La/rir0;->b:La/njr0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget-byte v0, p0, La/rir0;->a:B

    .line 2
    .line 3
    iget-object p0, p0, La/rir0;->b:La/njr0;

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
    new-instance v0, Lorg/xplatform/toto_bet/tirage/presentation/screen/TotoBetDsTirageScreen;

    .line 14
    .line 15
    iget-object v1, p0, La/njr0;->i:La/ctu;

    .line 16
    .line 17
    iget-object v1, v1, La/ctu;->a:La/rkr0;

    .line 18
    .line 19
    invoke-interface {v1}, La/rkr0;->r()La/lmr0;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    iget-object v1, v1, La/lmr0;->c:La/ulr0;

    .line 24
    .line 25
    invoke-virtual {v1}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    iget-object p0, p0, La/njr0;->i:La/ctu;

    .line 30
    .line 31
    iget-object p0, p0, La/ctu;->a:La/rkr0;

    .line 32
    .line 33
    invoke-interface {p0}, La/rkr0;->r()La/lmr0;

    .line 34
    .line 35
    .line 36
    move-result-object p0

    .line 37
    iget p0, p0, La/lmr0;->a:I

    .line 38
    .line 39
    invoke-direct {v0, v1, p0}, Lorg/xplatform/toto_bet/tirage/presentation/screen/TotoBetDsTirageScreen;-><init>(Ljava/lang/String;I)V

    .line 40
    .line 41
    .line 42
    invoke-virtual {p1, v0}, La/k0w0;->h(La/m7h0;)La/ikt0;

    .line 43
    .line 44
    .line 45
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 46
    .line 47
    return-object p0

    .line 48
    :pswitch_0
    check-cast p1, Ljava/lang/Throwable;

    .line 49
    .line 50
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 51
    .line 52
    .line 53
    iget-object p0, p0, La/njr0;->y:La/duj;

    .line 54
    .line 55
    new-instance v0, La/efr0;

    .line 56
    .line 57
    const/4 v1, 0x3

    .line 58
    invoke-direct {v0, v1}, La/efr0;-><init>(B)V

    .line 59
    .line 60
    .line 61
    invoke-virtual {p0, p1, v0}, La/duj;->b(Ljava/lang/Throwable;Lkotlin/jvm/functions/Function2;)V

    .line 62
    .line 63
    .line 64
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 65
    .line 66
    return-object p0

    .line 67
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
