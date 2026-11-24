.class public final synthetic La/wbm0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/ybm0;


# direct methods
.method public synthetic constructor <init>(La/ybm0;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/wbm0;->a:B

    iput-object p1, p0, La/wbm0;->b:La/ybm0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 1
    iget-byte v0, p0, La/wbm0;->a:B

    .line 2
    .line 3
    iget-object p0, p0, La/wbm0;->b:La/ybm0;

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
    iget-object v0, p0, La/ybm0;->v:La/svs0;

    .line 14
    .line 15
    iget-wide v1, p0, La/ybm0;->r:J

    .line 16
    .line 17
    iget-object p0, p0, La/ybm0;->q:Ljava/lang/String;

    .line 18
    .line 19
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 20
    .line 21
    .line 22
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 23
    .line 24
    .line 25
    new-instance v0, Lorg/xplatform/statistic/upcoming_events/navigation/UpcomingEventsScreen;

    .line 26
    .line 27
    invoke-direct {v0, p0, v1, v2}, Lorg/xplatform/statistic/upcoming_events/navigation/UpcomingEventsScreen;-><init>(Ljava/lang/String;J)V

    .line 28
    .line 29
    .line 30
    invoke-virtual {p1, v0}, La/k0w0;->h(La/m7h0;)La/ikt0;

    .line 31
    .line 32
    .line 33
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 34
    .line 35
    return-object p0

    .line 36
    :pswitch_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 37
    .line 38
    .line 39
    iget-object v0, p0, La/ybm0;->w:La/kl5;

    .line 40
    .line 41
    iget-wide v1, p0, La/ybm0;->r:J

    .line 42
    .line 43
    iget-object p0, p0, La/ybm0;->q:Ljava/lang/String;

    .line 44
    .line 45
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 46
    .line 47
    .line 48
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 49
    .line 50
    .line 51
    new-instance v0, Lorg/xplatform/statistic/completedmatches/navigation/CompletedMatchesScreens;

    .line 52
    .line 53
    invoke-direct {v0, p0, v1, v2}, Lorg/xplatform/statistic/completedmatches/navigation/CompletedMatchesScreens;-><init>(Ljava/lang/String;J)V

    .line 54
    .line 55
    .line 56
    invoke-virtual {p1, v0}, La/k0w0;->h(La/m7h0;)La/ikt0;

    .line 57
    .line 58
    .line 59
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 60
    .line 61
    return-object p0

    .line 62
    nop

    .line 63
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
