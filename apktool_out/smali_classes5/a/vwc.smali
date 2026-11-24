.class public final synthetic La/vwc;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/ywc;


# direct methods
.method public synthetic constructor <init>(La/ywc;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/vwc;->a:B

    iput-object p1, p0, La/vwc;->b:La/ywc;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 4

    .line 1
    iget-byte v0, p0, La/vwc;->a:B

    .line 2
    .line 3
    iget-object p0, p0, La/vwc;->b:La/ywc;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    sget-object v0, La/ywc;->W1:La/kl5;

    .line 9
    .line 10
    invoke-virtual {p0}, La/ywc;->H0()La/qxc;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    invoke-virtual {p0}, La/qxc;->x()V

    .line 15
    .line 16
    .line 17
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 18
    .line 19
    return-object p0

    .line 20
    :pswitch_0
    sget-object v0, La/ywc;->W1:La/kl5;

    .line 21
    .line 22
    iget-object p0, p0, La/ywc;->K1:La/fiu0;

    .line 23
    .line 24
    if-eqz p0, :cond_0

    .line 25
    .line 26
    return-object p0

    .line 27
    :cond_0
    const-string p0, "viewModelFactory"

    .line 28
    .line 29
    invoke-static {p0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    const/4 p0, 0x0

    .line 33
    throw p0

    .line 34
    :pswitch_1
    sget-object v0, La/ywc;->W1:La/kl5;

    .line 35
    .line 36
    invoke-virtual {p0}, La/ywc;->H0()La/qxc;

    .line 37
    .line 38
    .line 39
    move-result-object p0

    .line 40
    iget-object p0, p0, La/qxc;->f:La/i1w0;

    .line 41
    .line 42
    invoke-static {p0}, La/b1j;->q(La/i1w0;)Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    new-instance v1, La/c8d;

    .line 47
    .line 48
    sget-object v2, La/y7d;->a:La/v7d;

    .line 49
    .line 50
    sget-object v3, La/p0w0;->a:La/p0w0;

    .line 51
    .line 52
    invoke-direct {v1, v2, v3}, La/c8d;-><init>(La/w7d;La/g1w0;)V

    .line 53
    .line 54
    .line 55
    const/4 v2, 0x0

    .line 56
    invoke-static {v0, v1, p0, v0, v2}, La/b1j;->p(Ljava/util/concurrent/CopyOnWriteArrayList;La/c8d;La/i1w0;Ljava/util/concurrent/CopyOnWriteArrayList;I)Ljava/util/ListIterator;

    .line 57
    .line 58
    .line 59
    move-result-object v0

    .line 60
    :goto_0
    move-object v1, v0

    .line 61
    check-cast v1, La/paw;

    .line 62
    .line 63
    invoke-virtual {v1}, La/paw;->hasNext()Z

    .line 64
    .line 65
    .line 66
    move-result v2

    .line 67
    if-eqz v2, :cond_1

    .line 68
    .line 69
    invoke-virtual {v1}, La/paw;->next()Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    move-result-object v1

    .line 73
    check-cast v1, La/oe50;

    .line 74
    .line 75
    invoke-virtual {p0, v1}, La/i1w0;->a(La/oe50;)V

    .line 76
    .line 77
    .line 78
    goto :goto_0

    .line 79
    :cond_1
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 80
    .line 81
    return-object p0

    .line 82
    nop

    .line 83
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
