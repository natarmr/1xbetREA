.class public final synthetic La/mjb0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/tjb0;


# direct methods
.method public synthetic constructor <init>(La/tjb0;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/mjb0;->a:B

    iput-object p1, p0, La/mjb0;->b:La/tjb0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    .line 1
    iget-byte v0, p0, La/mjb0;->a:B

    .line 2
    .line 3
    iget-object p0, p0, La/mjb0;->b:La/tjb0;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    check-cast p1, Ljava/lang/Integer;

    .line 9
    .line 10
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 11
    .line 12
    .line 13
    move-result p1

    .line 14
    new-instance v0, La/d5l0;

    .line 15
    .line 16
    iget-object v1, p0, La/tjb0;->o:La/ctf0;

    .line 17
    .line 18
    const/4 v2, 0x0

    .line 19
    new-array v3, v2, [Ljava/lang/Object;

    .line 20
    .line 21
    iget-object v1, v1, La/ctf0;->b:La/lsm0;

    .line 22
    .line 23
    invoke-static {v3, v2}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v2

    .line 27
    invoke-virtual {v1, p1, v2}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    invoke-direct {v0, p1}, La/d5l0;-><init>(Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    invoke-virtual {p0, v0}, La/x2t0;->g(Ljava/lang/Object;)V

    .line 35
    .line 36
    .line 37
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 38
    .line 39
    return-object p0

    .line 40
    :pswitch_0
    check-cast p1, La/k0w0;

    .line 41
    .line 42
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 43
    .line 44
    .line 45
    iget-object v0, p0, La/tjb0;->r:La/eke0;

    .line 46
    .line 47
    new-instance v1, Lorg/xplatform/feed/navigation/SportFilterScreenParams;

    .line 48
    .line 49
    invoke-virtual {p0}, La/x2t0;->d()Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    move-result-object p0

    .line 53
    check-cast p0, La/e5l0;

    .line 54
    .line 55
    iget-object p0, p0, La/e5l0;->g:La/ms2;

    .line 56
    .line 57
    invoke-direct {v1, p0}, Lorg/xplatform/feed/navigation/SportFilterScreenParams;-><init>(La/ms2;)V

    .line 58
    .line 59
    .line 60
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 61
    .line 62
    .line 63
    new-instance p0, Lorg/xplatform/feed/navigation/SportFilterScreenFactoryImpl$getSportFilterScreen$1;

    .line 64
    .line 65
    invoke-direct {p0, v1}, Lorg/xplatform/feed/navigation/SportFilterScreenFactoryImpl$getSportFilterScreen$1;-><init>(Lorg/xplatform/feed/navigation/SportFilterScreenParams;)V

    .line 66
    .line 67
    .line 68
    invoke-virtual {p1, p0}, La/k0w0;->h(La/m7h0;)La/ikt0;

    .line 69
    .line 70
    .line 71
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 72
    .line 73
    return-object p0

    .line 74
    nop

    .line 75
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
