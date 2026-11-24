.class public final synthetic La/n620;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/c720;


# direct methods
.method public synthetic constructor <init>(La/c720;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/n620;->a:B

    iput-object p1, p0, La/n620;->b:La/c720;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 8

    .line 1
    iget-byte v0, p0, La/n620;->a:B

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    iget-object p0, p0, La/n620;->b:La/c720;

    .line 5
    .line 6
    packed-switch v0, :pswitch_data_0

    .line 7
    .line 8
    .line 9
    sget-object v0, La/c720;->p2:La/wsz;

    .line 10
    .line 11
    iget-object p0, p0, La/c720;->i2:La/kiu0;

    .line 12
    .line 13
    invoke-virtual {p0}, La/kiu0;->getValue()Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    check-cast p0, La/kn20;

    .line 18
    .line 19
    invoke-static {p0}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 20
    .line 21
    .line 22
    move-result-object v2

    .line 23
    sget-object v3, La/om20;->a:La/om20;

    .line 24
    .line 25
    iget-object v0, p0, La/kn20;->e:La/mne;

    .line 26
    .line 27
    iget-object v5, v0, La/mne;->b:La/dvj;

    .line 28
    .line 29
    new-instance v6, La/z210;

    .line 30
    .line 31
    const/16 v0, 0xa

    .line 32
    .line 33
    invoke-direct {v6, p0, v1, v0}, La/z210;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 34
    .line 35
    .line 36
    const/16 v7, 0xa

    .line 37
    .line 38
    const/4 v4, 0x0

    .line 39
    invoke-static/range {v2 .. v7}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 40
    .line 41
    .line 42
    invoke-static {}, La/dyb;->u0()V

    .line 43
    .line 44
    .line 45
    :goto_0
    sget-object p0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 46
    .line 47
    return-object p0

    .line 48
    :pswitch_0
    sget-object v0, La/c720;->p2:La/wsz;

    .line 49
    .line 50
    iget-object p0, p0, La/c720;->i2:La/kiu0;

    .line 51
    .line 52
    invoke-virtual {p0}, La/kiu0;->getValue()Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object p0

    .line 56
    check-cast p0, La/kn20;

    .line 57
    .line 58
    iget-object p0, p0, La/kn20;->d:La/i1w0;

    .line 59
    .line 60
    invoke-static {p0}, La/b1j;->q(La/i1w0;)Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 61
    .line 62
    .line 63
    move-result-object v0

    .line 64
    new-instance v1, La/c8d;

    .line 65
    .line 66
    sget-object v2, La/y7d;->a:La/v7d;

    .line 67
    .line 68
    sget-object v3, La/n0w0;->a:La/n0w0;

    .line 69
    .line 70
    invoke-direct {v1, v2, v3}, La/c8d;-><init>(La/w7d;La/g1w0;)V

    .line 71
    .line 72
    .line 73
    invoke-static {v0, v1}, La/rz4;->g(Ljava/util/concurrent/CopyOnWriteArrayList;La/c8d;)La/y9v0;

    .line 74
    .line 75
    .line 76
    move-result-object v1

    .line 77
    sget-object v2, La/wez;->b:La/wez;

    .line 78
    .line 79
    const/4 v3, 0x0

    .line 80
    invoke-static {v2, v1, p0, v0, v3}, La/rz4;->p(La/wez;La/y9v0;La/i1w0;Ljava/util/concurrent/CopyOnWriteArrayList;I)Ljava/util/ListIterator;

    .line 81
    .line 82
    .line 83
    move-result-object v0

    .line 84
    :goto_1
    move-object v1, v0

    .line 85
    check-cast v1, La/paw;

    .line 86
    .line 87
    invoke-virtual {v1}, La/paw;->hasNext()Z

    .line 88
    .line 89
    .line 90
    move-result v2

    .line 91
    if-eqz v2, :cond_0

    .line 92
    .line 93
    invoke-virtual {v1}, La/paw;->next()Ljava/lang/Object;

    .line 94
    .line 95
    .line 96
    move-result-object v1

    .line 97
    check-cast v1, La/oe50;

    .line 98
    .line 99
    invoke-virtual {p0, v1}, La/i1w0;->a(La/oe50;)V

    .line 100
    .line 101
    .line 102
    goto :goto_1

    .line 103
    :cond_0
    invoke-static {}, La/dyb;->u0()V

    .line 104
    .line 105
    .line 106
    goto :goto_0

    .line 107
    :pswitch_1
    iget-object p0, p0, La/c720;->o2:La/fiu0;

    .line 108
    .line 109
    if-eqz p0, :cond_1

    .line 110
    .line 111
    return-object p0

    .line 112
    :cond_1
    const-string p0, "viewModelFactory"

    .line 113
    .line 114
    invoke-static {p0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 115
    .line 116
    .line 117
    throw v1

    .line 118
    nop

    .line 119
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
