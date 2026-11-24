.class public final synthetic La/z4f0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/t2g0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/x5f0;


# direct methods
.method public synthetic constructor <init>(La/x5f0;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/z4f0;->a:B

    iput-object p1, p0, La/z4f0;->b:La/x5f0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onResult(Ljava/lang/Object;)V
    .locals 12

    .line 1
    iget-byte v0, p0, La/z4f0;->a:B

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    instance-of v0, p1, Ljava/lang/Integer;

    .line 10
    .line 11
    const/4 v1, 0x0

    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    move-object v0, p1

    .line 15
    check-cast v0, Ljava/lang/Integer;

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    move-object v0, v1

    .line 19
    :goto_0
    if-eqz v0, :cond_1

    .line 20
    .line 21
    check-cast p1, Ljava/lang/Number;

    .line 22
    .line 23
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    .line 24
    .line 25
    .line 26
    move-result p1

    .line 27
    iget-object p0, p0, La/z4f0;->b:La/x5f0;

    .line 28
    .line 29
    invoke-static {p0}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 30
    .line 31
    .line 32
    move-result-object v2

    .line 33
    iget-object v0, p0, La/x5f0;->Z:La/mne;

    .line 34
    .line 35
    iget-object v5, v0, La/mne;->a:La/rwj;

    .line 36
    .line 37
    new-instance v3, La/y4f0;

    .line 38
    .line 39
    const/4 v0, 0x2

    .line 40
    invoke-direct {v3, p0, v0}, La/y4f0;-><init>(La/x5f0;B)V

    .line 41
    .line 42
    .line 43
    new-instance v6, Le;

    .line 44
    .line 45
    const/4 v0, 0x7

    .line 46
    invoke-direct {v6, p0, p1, v1, v0}, Le;-><init>(Ljava/lang/Object;ILa/yje;B)V

    .line 47
    .line 48
    .line 49
    const/16 v7, 0xa

    .line 50
    .line 51
    const/4 v4, 0x0

    .line 52
    invoke-static/range {v2 .. v7}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 53
    .line 54
    .line 55
    :cond_1
    return-void

    .line 56
    :pswitch_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 57
    .line 58
    .line 59
    instance-of v0, p1, La/kl90;

    .line 60
    .line 61
    const/4 v5, 0x0

    .line 62
    if-eqz v0, :cond_2

    .line 63
    .line 64
    move-object v0, p1

    .line 65
    check-cast v0, La/kl90;

    .line 66
    .line 67
    goto :goto_1

    .line 68
    :cond_2
    move-object v0, v5

    .line 69
    :goto_1
    if-eqz v0, :cond_3

    .line 70
    .line 71
    check-cast p1, La/kl90;

    .line 72
    .line 73
    iget v3, p1, La/kl90;->a:I

    .line 74
    .line 75
    iget-boolean v4, p1, La/kl90;->b:Z

    .line 76
    .line 77
    iget-object v2, p0, La/z4f0;->b:La/x5f0;

    .line 78
    .line 79
    invoke-static {v2}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 80
    .line 81
    .line 82
    move-result-object p0

    .line 83
    sget-object v7, La/t5f0;->a:La/t5f0;

    .line 84
    .line 85
    iget-object p1, v2, La/x5f0;->Z:La/mne;

    .line 86
    .line 87
    iget-object v9, p1, La/mne;->a:La/rwj;

    .line 88
    .line 89
    new-instance v1, La/a48;

    .line 90
    .line 91
    const/4 v6, 0x4

    .line 92
    invoke-direct/range {v1 .. v6}, La/a48;-><init>(La/diu0;IZLa/yje;B)V

    .line 93
    .line 94
    .line 95
    const/16 v11, 0xa

    .line 96
    .line 97
    const/4 v8, 0x0

    .line 98
    move-object v6, p0

    .line 99
    move-object v10, v1

    .line 100
    invoke-static/range {v6 .. v11}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 101
    .line 102
    .line 103
    :cond_3
    return-void

    .line 104
    nop

    .line 105
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
