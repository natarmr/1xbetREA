.class public final synthetic La/hi2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/qi2;


# direct methods
.method public synthetic constructor <init>(La/qi2;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/hi2;->a:B

    iput-object p1, p0, La/hi2;->b:La/qi2;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 1
    iget-byte v0, p0, La/hi2;->a:B

    .line 2
    .line 3
    iget-object p0, p0, La/hi2;->b:La/qi2;

    .line 4
    .line 5
    check-cast p1, La/k0w0;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    iget-object p0, p0, La/qi2;->q:La/rrc;

    .line 14
    .line 15
    sget-object v0, La/m7r0;->a:La/m7r0;

    .line 16
    .line 17
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 18
    .line 19
    .line 20
    new-instance v1, Lorg/xplatform/feed/navigation/FeedPopularScreenFactoryImpl$getTopGamesContainerScreen$1;

    .line 21
    .line 22
    invoke-direct {v1, p0, v0}, Lorg/xplatform/feed/navigation/FeedPopularScreenFactoryImpl$getTopGamesContainerScreen$1;-><init>(La/rrc;La/m7r0;)V

    .line 23
    .line 24
    .line 25
    invoke-virtual {p1, v1}, La/k0w0;->h(La/m7h0;)La/ikt0;

    .line 26
    .line 27
    .line 28
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 29
    .line 30
    return-object p0

    .line 31
    :pswitch_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 32
    .line 33
    .line 34
    new-instance v0, La/pn;

    .line 35
    .line 36
    const/4 v1, 0x0

    .line 37
    const/4 v2, 0x7

    .line 38
    invoke-direct {v0, p0, v1, v2}, La/pn;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 39
    .line 40
    .line 41
    new-instance p0, La/b1w0;

    .line 42
    .line 43
    invoke-direct {p0, v0}, La/b1w0;-><init>(Lkotlin/jvm/functions/Function1;)V

    .line 44
    .line 45
    .line 46
    invoke-virtual {p1, p0}, La/k0w0;->b(La/g1w0;)La/ikt0;

    .line 47
    .line 48
    .line 49
    move-result-object p0

    .line 50
    iget-object p0, p0, La/ikt0;->a:Ljava/lang/Object;

    .line 51
    .line 52
    check-cast p0, La/c8d;

    .line 53
    .line 54
    sget-object p1, La/cfx0;->o:La/bjk;

    .line 55
    .line 56
    new-instance v0, La/v7d;

    .line 57
    .line 58
    const/4 v1, 0x1

    .line 59
    invoke-direct {v0, v1, p1, p1}, La/v7d;-><init>(ZLa/bjk;La/bjk;)V

    .line 60
    .line 61
    .line 62
    iput-object v0, p0, La/c8d;->a:La/w7d;

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
