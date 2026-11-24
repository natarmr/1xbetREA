.class public final synthetic La/ikt;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/mkt;


# direct methods
.method public synthetic constructor <init>(La/mkt;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/ikt;->a:B

    iput-object p1, p0, La/ikt;->b:La/mkt;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget-byte v0, p0, La/ikt;->a:B

    .line 2
    .line 3
    iget-object p0, p0, La/ikt;->b:La/mkt;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    check-cast p1, La/k0w0;

    .line 9
    .line 10
    iget-object p0, p0, La/mkt;->e:La/evz;

    .line 11
    .line 12
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    new-instance p0, Lorg/xplatform/client1/features/main/MainScreenProviderImpl$screen$1;

    .line 16
    .line 17
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 18
    .line 19
    .line 20
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 21
    .line 22
    .line 23
    new-instance v0, La/y0w0;

    .line 24
    .line 25
    invoke-direct {v0, p0}, La/y0w0;-><init>(La/m7h0;)V

    .line 26
    .line 27
    .line 28
    invoke-virtual {p1, v0}, La/k0w0;->b(La/g1w0;)La/ikt0;

    .line 29
    .line 30
    .line 31
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 32
    .line 33
    return-object p0

    .line 34
    :pswitch_0
    check-cast p1, Ljava/lang/Throwable;

    .line 35
    .line 36
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 37
    .line 38
    .line 39
    iget-object p0, p0, La/mkt;->l:La/duj;

    .line 40
    .line 41
    iget-object v0, p0, La/duj;->a:La/eyg0;

    .line 42
    .line 43
    new-instance v1, La/uu00;

    .line 44
    .line 45
    iget-object p0, p0, La/duj;->b:La/ctf0;

    .line 46
    .line 47
    invoke-static {p1, p0}, La/jwb;->G(Ljava/lang/Throwable;La/ctf0;)Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object p0

    .line 51
    invoke-direct {v1, p0}, La/uu00;-><init>(Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    invoke-virtual {v0, v1}, La/eyg0;->m(La/vu00;)V

    .line 55
    .line 56
    .line 57
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 58
    .line 59
    return-object p0

    .line 60
    :pswitch_1
    check-cast p1, Ljava/lang/Throwable;

    .line 61
    .line 62
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 63
    .line 64
    .line 65
    iget-object p0, p0, La/mkt;->l:La/duj;

    .line 66
    .line 67
    iget-object v0, p0, La/duj;->a:La/eyg0;

    .line 68
    .line 69
    new-instance v1, La/uu00;

    .line 70
    .line 71
    iget-object p0, p0, La/duj;->b:La/ctf0;

    .line 72
    .line 73
    invoke-static {p1, p0}, La/jwb;->G(Ljava/lang/Throwable;La/ctf0;)Ljava/lang/String;

    .line 74
    .line 75
    .line 76
    move-result-object p0

    .line 77
    invoke-direct {v1, p0}, La/uu00;-><init>(Ljava/lang/String;)V

    .line 78
    .line 79
    .line 80
    invoke-virtual {v0, v1}, La/eyg0;->m(La/vu00;)V

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
