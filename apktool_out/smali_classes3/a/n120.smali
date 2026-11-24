.class public final synthetic La/n120;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/w220;


# direct methods
.method public synthetic constructor <init>(La/w220;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/n120;->a:B

    iput-object p1, p0, La/n120;->b:La/w220;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    .line 1
    iget-byte v0, p0, La/n120;->a:B

    .line 2
    .line 3
    iget-object p0, p0, La/n120;->b:La/w220;

    .line 4
    .line 5
    check-cast p1, Ljava/lang/Throwable;

    .line 6
    .line 7
    check-cast p2, Ljava/lang/String;

    .line 8
    .line 9
    packed-switch v0, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    iget-object p0, p0, La/w220;->i:La/rjo;

    .line 13
    .line 14
    invoke-virtual {p0, p1}, La/rjo;->a(Ljava/lang/Throwable;)V

    .line 15
    .line 16
    .line 17
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 18
    .line 19
    return-object p0

    .line 20
    :pswitch_0
    iget-object p0, p0, La/w220;->i:La/rjo;

    .line 21
    .line 22
    invoke-virtual {p0, p1}, La/rjo;->a(Ljava/lang/Throwable;)V

    .line 23
    .line 24
    .line 25
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 26
    .line 27
    return-object p0

    .line 28
    :pswitch_1
    iget-object p0, p0, La/w220;->i:La/rjo;

    .line 29
    .line 30
    invoke-virtual {p0, p1}, La/rjo;->a(Ljava/lang/Throwable;)V

    .line 31
    .line 32
    .line 33
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 34
    .line 35
    return-object p0

    .line 36
    :pswitch_2
    iget-object p0, p0, La/w220;->i:La/rjo;

    .line 37
    .line 38
    invoke-virtual {p0, p1}, La/rjo;->a(Ljava/lang/Throwable;)V

    .line 39
    .line 40
    .line 41
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 42
    .line 43
    return-object p0

    .line 44
    :pswitch_3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 45
    .line 46
    .line 47
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 48
    .line 49
    .line 50
    invoke-static {p0}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    iget-object p1, p0, La/w220;->C:La/mne;

    .line 55
    .line 56
    iget-object v3, p1, La/mne;->a:La/rwj;

    .line 57
    .line 58
    sget-object v1, La/o220;->a:La/o220;

    .line 59
    .line 60
    new-instance v4, La/xr10;

    .line 61
    .line 62
    const/4 p1, 0x0

    .line 63
    const/4 v2, 0x3

    .line 64
    invoke-direct {v4, p0, p2, p1, v2}, La/xr10;-><init>(Ljava/lang/Object;Ljava/lang/Object;La/yje;B)V

    .line 65
    .line 66
    .line 67
    const/16 v5, 0xa

    .line 68
    .line 69
    const/4 v2, 0x0

    .line 70
    invoke-static/range {v0 .. v5}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 71
    .line 72
    .line 73
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 74
    .line 75
    return-object p0

    .line 76
    nop

    .line 77
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
