.class public final synthetic La/rn3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/tn3;


# direct methods
.method public synthetic constructor <init>(La/tn3;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/rn3;->a:B

    iput-object p1, p0, La/rn3;->b:La/tn3;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    .line 1
    iget-byte v0, p0, La/rn3;->a:B

    .line 2
    .line 3
    iget-object p0, p0, La/rn3;->b:La/tn3;

    .line 4
    .line 5
    check-cast p1, Landroid/view/View;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    sget-object v0, La/tn3;->c2:La/hfk0;

    .line 11
    .line 12
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    iget-object p0, p0, La/tn3;->b2:La/kiu0;

    .line 16
    .line 17
    invoke-virtual {p0}, La/kiu0;->getValue()Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    check-cast p0, La/fo3;

    .line 22
    .line 23
    iget-object p1, p0, La/fo3;->f:La/bby;

    .line 24
    .line 25
    if-eqz p1, :cond_0

    .line 26
    .line 27
    invoke-interface {p1}, La/bby;->isActive()Z

    .line 28
    .line 29
    .line 30
    move-result p1

    .line 31
    const/4 v0, 0x1

    .line 32
    if-ne p1, v0, :cond_0

    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_0
    invoke-static {p0}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 36
    .line 37
    .line 38
    move-result-object v1

    .line 39
    new-instance v2, La/b33;

    .line 40
    .line 41
    const/4 p1, 0x6

    .line 42
    invoke-direct {v2, p0, p1}, La/b33;-><init>(Ljava/lang/Object;B)V

    .line 43
    .line 44
    .line 45
    iget-object p1, p0, La/fo3;->e:La/mne;

    .line 46
    .line 47
    iget-object v4, p1, La/mne;->c:La/vs10;

    .line 48
    .line 49
    new-instance v5, La/y32;

    .line 50
    .line 51
    const/4 p1, 0x0

    .line 52
    invoke-direct {v5, p0, p1}, La/y32;-><init>(La/fo3;La/yje;)V

    .line 53
    .line 54
    .line 55
    const/16 v6, 0xa

    .line 56
    .line 57
    const/4 v3, 0x0

    .line 58
    invoke-static/range {v1 .. v6}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 59
    .line 60
    .line 61
    move-result-object p1

    .line 62
    iput-object p1, p0, La/fo3;->f:La/bby;

    .line 63
    .line 64
    :goto_0
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 65
    .line 66
    return-object p0

    .line 67
    :pswitch_0
    sget-object v0, La/tn3;->c2:La/hfk0;

    .line 68
    .line 69
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 70
    .line 71
    .line 72
    invoke-virtual {p0}, La/yo8;->x0()V

    .line 73
    .line 74
    .line 75
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 76
    .line 77
    return-object p0

    .line 78
    nop

    .line 79
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
