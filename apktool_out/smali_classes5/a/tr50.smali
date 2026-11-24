.class public final synthetic La/tr50;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/wr50;


# direct methods
.method public synthetic constructor <init>(La/wr50;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/tr50;->a:B

    iput-object p1, p0, La/tr50;->b:La/wr50;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 4

    .line 1
    iget-byte v0, p0, La/tr50;->a:B

    .line 2
    .line 3
    iget-object p0, p0, La/tr50;->b:La/wr50;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    sget-object v0, La/wr50;->S1:La/wsz;

    .line 9
    .line 10
    iget-object p0, p0, La/wr50;->M1:La/kiu0;

    .line 11
    .line 12
    invoke-virtual {p0}, La/kiu0;->getValue()Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    check-cast p0, La/ut50;

    .line 17
    .line 18
    iget-object p0, p0, La/ut50;->l:La/i1w0;

    .line 19
    .line 20
    invoke-static {p0}, La/b1j;->q(La/i1w0;)Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    new-instance v1, La/c8d;

    .line 25
    .line 26
    sget-object v2, La/y7d;->a:La/v7d;

    .line 27
    .line 28
    sget-object v3, La/p0w0;->a:La/p0w0;

    .line 29
    .line 30
    invoke-direct {v1, v2, v3}, La/c8d;-><init>(La/w7d;La/g1w0;)V

    .line 31
    .line 32
    .line 33
    const/4 v2, 0x0

    .line 34
    invoke-static {v0, v1, p0, v0, v2}, La/b1j;->p(Ljava/util/concurrent/CopyOnWriteArrayList;La/c8d;La/i1w0;Ljava/util/concurrent/CopyOnWriteArrayList;I)Ljava/util/ListIterator;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    :goto_0
    move-object v1, v0

    .line 39
    check-cast v1, La/paw;

    .line 40
    .line 41
    invoke-virtual {v1}, La/paw;->hasNext()Z

    .line 42
    .line 43
    .line 44
    move-result v2

    .line 45
    if-eqz v2, :cond_0

    .line 46
    .line 47
    invoke-virtual {v1}, La/paw;->next()Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object v1

    .line 51
    check-cast v1, La/oe50;

    .line 52
    .line 53
    invoke-virtual {p0, v1}, La/i1w0;->a(La/oe50;)V

    .line 54
    .line 55
    .line 56
    goto :goto_0

    .line 57
    :cond_0
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 58
    .line 59
    return-object p0

    .line 60
    :pswitch_0
    sget-object v0, La/wr50;->S1:La/wsz;

    .line 61
    .line 62
    new-instance v0, La/tn50;

    .line 63
    .line 64
    new-instance v1, La/p0z;

    .line 65
    .line 66
    const/16 v2, 0x13

    .line 67
    .line 68
    invoke-direct {v1, p0, v2}, La/p0z;-><init>(Ljava/lang/Object;B)V

    .line 69
    .line 70
    .line 71
    new-instance v2, La/b530;

    .line 72
    .line 73
    const/16 v3, 0x15

    .line 74
    .line 75
    invoke-direct {v2, p0, v3}, La/b530;-><init>(Ljava/lang/Object;B)V

    .line 76
    .line 77
    .line 78
    invoke-direct {v0, v1, v2}, La/tn50;-><init>(La/p0z;La/b530;)V

    .line 79
    .line 80
    .line 81
    return-object v0

    .line 82
    :pswitch_1
    sget-object v0, La/wr50;->S1:La/wsz;

    .line 83
    .line 84
    iget-object p0, p0, La/wr50;->L1:La/fiu0;

    .line 85
    .line 86
    if-eqz p0, :cond_1

    .line 87
    .line 88
    return-object p0

    .line 89
    :cond_1
    const-string p0, "viewModelFactory"

    .line 90
    .line 91
    invoke-static {p0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 92
    .line 93
    .line 94
    const/4 p0, 0x0

    .line 95
    throw p0

    .line 96
    nop

    .line 97
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
