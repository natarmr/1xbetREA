.class public final synthetic La/gk60;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/ik60;


# direct methods
.method public synthetic constructor <init>(La/ik60;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/gk60;->a:B

    iput-object p1, p0, La/gk60;->b:La/ik60;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 9

    .line 1
    iget-byte v0, p0, La/gk60;->a:B

    .line 2
    .line 3
    iget-object v1, p0, La/gk60;->b:La/ik60;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    sget-object v0, La/ik60;->Q1:[La/iiy;

    .line 9
    .line 10
    new-instance v0, La/kk60;

    .line 11
    .line 12
    new-instance v1, La/jw50;

    .line 13
    .line 14
    const/4 v7, 0x0

    .line 15
    const/16 v8, 0x10

    .line 16
    .line 17
    const/4 v2, 0x1

    .line 18
    iget-object v3, p0, La/gk60;->b:La/ik60;

    .line 19
    .line 20
    const-class v4, La/ik60;

    .line 21
    .line 22
    const-string v5, "onOnboardingSectionClick"

    .line 23
    .line 24
    const-string v6, "onOnboardingSectionClick(Lorg/xplatform/onboarding_section/impl/presentation/OnboardingSectionsUiModel;)V"

    .line 25
    .line 26
    invoke-direct/range {v1 .. v8}, La/jw50;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 27
    .line 28
    .line 29
    invoke-direct {v0}, La/qv5;-><init>()V

    .line 30
    .line 31
    .line 32
    new-instance p0, La/rj50;

    .line 33
    .line 34
    const/16 v2, 0x1a

    .line 35
    .line 36
    invoke-direct {p0, v2}, La/rj50;-><init>(B)V

    .line 37
    .line 38
    .line 39
    new-instance v2, La/cd60;

    .line 40
    .line 41
    const/4 v3, 0x5

    .line 42
    invoke-direct {v2, v1, v3}, La/cd60;-><init>(Ljava/lang/Object;B)V

    .line 43
    .line 44
    .line 45
    new-instance v1, La/tvx;

    .line 46
    .line 47
    const/4 v3, 0x3

    .line 48
    const/16 v4, 0x1c

    .line 49
    .line 50
    invoke-direct {v1, v3, v4}, La/tvx;-><init>(IB)V

    .line 51
    .line 52
    .line 53
    sget-object v3, La/gvy;->f1:La/gvy;

    .line 54
    .line 55
    new-instance v4, La/gbn;

    .line 56
    .line 57
    invoke-direct {v4, p0, v1, v2, v3}, La/gbn;-><init>(Lkotlin/jvm/functions/Function2;La/xdr;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V

    .line 58
    .line 59
    .line 60
    iget-object p0, v0, La/zz3;->d:La/dp;

    .line 61
    .line 62
    invoke-virtual {p0, v4}, La/dp;->b(La/gbn;)V

    .line 63
    .line 64
    .line 65
    return-object v0

    .line 66
    :pswitch_0
    sget-object p0, La/ik60;->Q1:[La/iiy;

    .line 67
    .line 68
    new-instance p0, La/ry3;

    .line 69
    .line 70
    invoke-static {v1}, La/a4n0;->f(Landroidx/fragment/app/Fragment;)La/i1w0;

    .line 71
    .line 72
    .line 73
    move-result-object v0

    .line 74
    iget-object v1, v1, La/ik60;->L1:La/lmi;

    .line 75
    .line 76
    if-eqz v1, :cond_0

    .line 77
    .line 78
    invoke-direct {p0, v0, v1}, La/ry3;-><init>(La/i1w0;La/giu0;)V

    .line 79
    .line 80
    .line 81
    return-object p0

    .line 82
    :cond_0
    const-string p0, "viewModelFactory"

    .line 83
    .line 84
    invoke-static {p0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 85
    .line 86
    .line 87
    const/4 p0, 0x0

    .line 88
    throw p0

    .line 89
    :pswitch_1
    sget-object p0, La/ik60;->Q1:[La/iiy;

    .line 90
    .line 91
    iget-object p0, v1, La/ik60;->M1:La/kiu0;

    .line 92
    .line 93
    invoke-virtual {p0}, La/kiu0;->getValue()Ljava/lang/Object;

    .line 94
    .line 95
    .line 96
    move-result-object p0

    .line 97
    check-cast p0, La/pk60;

    .line 98
    .line 99
    iget-object p0, p0, La/pk60;->o:La/i1w0;

    .line 100
    .line 101
    invoke-static {p0}, La/b1j;->q(La/i1w0;)Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 102
    .line 103
    .line 104
    move-result-object v0

    .line 105
    new-instance v1, La/c8d;

    .line 106
    .line 107
    sget-object v2, La/y7d;->a:La/v7d;

    .line 108
    .line 109
    sget-object v3, La/p0w0;->a:La/p0w0;

    .line 110
    .line 111
    invoke-direct {v1, v2, v3}, La/c8d;-><init>(La/w7d;La/g1w0;)V

    .line 112
    .line 113
    .line 114
    const/4 v2, 0x0

    .line 115
    invoke-static {v0, v1, p0, v0, v2}, La/b1j;->p(Ljava/util/concurrent/CopyOnWriteArrayList;La/c8d;La/i1w0;Ljava/util/concurrent/CopyOnWriteArrayList;I)Ljava/util/ListIterator;

    .line 116
    .line 117
    .line 118
    move-result-object v0

    .line 119
    :goto_0
    move-object v1, v0

    .line 120
    check-cast v1, La/paw;

    .line 121
    .line 122
    invoke-virtual {v1}, La/paw;->hasNext()Z

    .line 123
    .line 124
    .line 125
    move-result v2

    .line 126
    if-eqz v2, :cond_1

    .line 127
    .line 128
    invoke-virtual {v1}, La/paw;->next()Ljava/lang/Object;

    .line 129
    .line 130
    .line 131
    move-result-object v1

    .line 132
    check-cast v1, La/oe50;

    .line 133
    .line 134
    invoke-virtual {p0, v1}, La/i1w0;->a(La/oe50;)V

    .line 135
    .line 136
    .line 137
    goto :goto_0

    .line 138
    :cond_1
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 139
    .line 140
    return-object p0

    .line 141
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
