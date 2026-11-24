.class public final synthetic La/tvk0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/iwk0;

.field public final synthetic c:La/ttk0;


# direct methods
.method public synthetic constructor <init>(La/iwk0;La/ttk0;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/tvk0;->a:B

    iput-object p1, p0, La/tvk0;->b:La/iwk0;

    iput-object p2, p0, La/tvk0;->c:La/ttk0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget-byte v0, p0, La/tvk0;->a:B

    .line 2
    .line 3
    iget-object v1, p0, La/tvk0;->c:La/ttk0;

    .line 4
    .line 5
    iget-object p0, p0, La/tvk0;->b:La/iwk0;

    .line 6
    .line 7
    check-cast p1, La/k0w0;

    .line 8
    .line 9
    packed-switch v0, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    iget-object p0, p0, La/iwk0;->M:La/mk30;

    .line 16
    .line 17
    iget v0, v1, La/ttk0;->a:I

    .line 18
    .line 19
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 20
    .line 21
    .line 22
    new-instance p0, Lorg/xplatform/special_event/impl/medal_statistic/navigation/MedalStatisticScreenFactoryImpl$getMedalStatisticScreen$1;

    .line 23
    .line 24
    invoke-direct {p0, v0}, Lorg/xplatform/special_event/impl/medal_statistic/navigation/MedalStatisticScreenFactoryImpl$getMedalStatisticScreen$1;-><init>(I)V

    .line 25
    .line 26
    .line 27
    invoke-virtual {p1, p0}, La/k0w0;->h(La/m7h0;)La/ikt0;

    .line 28
    .line 29
    .line 30
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 31
    .line 32
    return-object p0

    .line 33
    :pswitch_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 34
    .line 35
    .line 36
    iget-object p0, p0, La/iwk0;->v0:La/m6m0;

    .line 37
    .line 38
    iget v0, v1, La/ttk0;->a:I

    .line 39
    .line 40
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 41
    .line 42
    .line 43
    new-instance v1, Lorg/xplatform/special_event/impl/top_players/navigation/TopPlayersScreenFactoryImpl$getScreen$1;

    .line 44
    .line 45
    invoke-direct {v1, p0, v0}, Lorg/xplatform/special_event/impl/top_players/navigation/TopPlayersScreenFactoryImpl$getScreen$1;-><init>(La/m6m0;I)V

    .line 46
    .line 47
    .line 48
    invoke-virtual {p1, v1}, La/k0w0;->h(La/m7h0;)La/ikt0;

    .line 49
    .line 50
    .line 51
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 52
    .line 53
    return-object p0

    .line 54
    nop

    .line 55
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
