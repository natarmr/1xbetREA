.class public final synthetic La/ves0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/zes0;


# direct methods
.method public synthetic constructor <init>(La/zes0;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/ves0;->a:B

    iput-object p1, p0, La/ves0;->b:La/zes0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 5

    .line 1
    iget-byte v0, p0, La/ves0;->a:B

    .line 2
    .line 3
    iget-object p0, p0, La/ves0;->b:La/zes0;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    sget-object v0, La/zes0;->b2:La/m6m0;

    .line 9
    .line 10
    iget-object p0, p0, La/zes0;->N1:La/kiu0;

    .line 11
    .line 12
    invoke-virtual {p0}, La/kiu0;->getValue()Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    check-cast p0, La/vfs0;

    .line 17
    .line 18
    iget-object p0, p0, La/vfs0;->d:La/i1w0;

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
    sget-object v0, La/zes0;->b2:La/m6m0;

    .line 61
    .line 62
    new-instance v0, La/les0;

    .line 63
    .line 64
    iget-object v1, p0, La/zes0;->X1:La/phf0;

    .line 65
    .line 66
    sget-object v2, La/zes0;->c2:[La/iiy;

    .line 67
    .line 68
    const/16 v3, 0x9

    .line 69
    .line 70
    aget-object v2, v2, v3

    .line 71
    .line 72
    invoke-virtual {v1, p0, v2}, La/phf0;->l(Landroidx/fragment/app/Fragment;La/iiy;)Ljava/lang/String;

    .line 73
    .line 74
    .line 75
    move-result-object p0

    .line 76
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 77
    .line 78
    .line 79
    sget-object v1, La/les0;->f:La/pn20;

    .line 80
    .line 81
    invoke-direct {v0, v1}, La/zz3;-><init>(La/dtb;)V

    .line 82
    .line 83
    .line 84
    new-instance v1, La/efr0;

    .line 85
    .line 86
    const/16 v2, 0x13

    .line 87
    .line 88
    invoke-direct {v1, v2}, La/efr0;-><init>(B)V

    .line 89
    .line 90
    .line 91
    new-instance v2, La/ka6;

    .line 92
    .line 93
    const/16 v3, 0x11

    .line 94
    .line 95
    invoke-direct {v2, p0, v3}, La/ka6;-><init>(Ljava/lang/String;B)V

    .line 96
    .line 97
    .line 98
    new-instance p0, La/d8q0;

    .line 99
    .line 100
    const/4 v3, 0x3

    .line 101
    const/16 v4, 0xf

    .line 102
    .line 103
    invoke-direct {p0, v3, v4}, La/d8q0;-><init>(IB)V

    .line 104
    .line 105
    .line 106
    sget-object v3, La/pfo0;->x:La/pfo0;

    .line 107
    .line 108
    new-instance v4, La/gbn;

    .line 109
    .line 110
    invoke-direct {v4, v1, p0, v2, v3}, La/gbn;-><init>(Lkotlin/jvm/functions/Function2;La/xdr;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V

    .line 111
    .line 112
    .line 113
    iget-object p0, v0, La/zz3;->d:La/dp;

    .line 114
    .line 115
    invoke-virtual {p0, v4}, La/dp;->b(La/gbn;)V

    .line 116
    .line 117
    .line 118
    return-object v0

    .line 119
    :pswitch_1
    iget-object p0, p0, La/zes0;->M1:La/fiu0;

    .line 120
    .line 121
    if-eqz p0, :cond_1

    .line 122
    .line 123
    return-object p0

    .line 124
    :cond_1
    const-string p0, "viewModelFactory"

    .line 125
    .line 126
    invoke-static {p0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 127
    .line 128
    .line 129
    const/4 p0, 0x0

    .line 130
    throw p0

    .line 131
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
