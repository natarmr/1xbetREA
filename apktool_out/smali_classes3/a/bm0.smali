.class public final synthetic La/bm0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/dm0;


# direct methods
.method public synthetic constructor <init>(La/dm0;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/bm0;->a:B

    iput-object p1, p0, La/bm0;->b:La/dm0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 11

    .line 1
    iget-byte v0, p0, La/bm0;->a:B

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    iget-object p0, p0, La/bm0;->b:La/dm0;

    .line 5
    .line 6
    packed-switch v0, :pswitch_data_0

    .line 7
    .line 8
    .line 9
    sget-object v0, La/dm0;->S1:La/pek0;

    .line 10
    .line 11
    invoke-virtual {p0}, La/dm0;->G0()La/k3t0;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    sget-object v0, La/dl0;->a:La/dl0;

    .line 16
    .line 17
    invoke-virtual {p0, v0}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 18
    .line 19
    .line 20
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 21
    .line 22
    return-object p0

    .line 23
    :pswitch_0
    sget-object v0, La/dm0;->S1:La/pek0;

    .line 24
    .line 25
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->n0()La/kxq;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    invoke-virtual {v0}, Landroid/app/Activity;->getApplication()Landroid/app/Application;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 34
    .line 35
    .line 36
    instance-of v2, v0, La/af3;

    .line 37
    .line 38
    if-eqz v2, :cond_0

    .line 39
    .line 40
    check-cast v0, La/af3;

    .line 41
    .line 42
    goto :goto_0

    .line 43
    :cond_0
    move-object v0, v1

    .line 44
    :goto_0
    const-class v2, La/is0;

    .line 45
    .line 46
    if-eqz v0, :cond_3

    .line 47
    .line 48
    invoke-interface {v0}, La/af3;->d()La/wcf0;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    invoke-virtual {v0, v2}, La/wcf0;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object v0

    .line 56
    check-cast v0, La/o5d0;

    .line 57
    .line 58
    if-eqz v0, :cond_1

    .line 59
    .line 60
    invoke-interface {v0}, La/o5d0;->get()Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    move-result-object v0

    .line 64
    check-cast v0, La/ze3;

    .line 65
    .line 66
    goto :goto_1

    .line 67
    :cond_1
    move-object v0, v1

    .line 68
    :goto_1
    instance-of v3, v0, La/is0;

    .line 69
    .line 70
    if-nez v3, :cond_2

    .line 71
    .line 72
    move-object v0, v1

    .line 73
    :cond_2
    move-object v3, v0

    .line 74
    check-cast v3, La/is0;

    .line 75
    .line 76
    if-eqz v3, :cond_3

    .line 77
    .line 78
    sget-object v4, La/ir1;->c:La/ir1;

    .line 79
    .line 80
    const-class v0, La/dm0;

    .line 81
    .line 82
    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 83
    .line 84
    .line 85
    move-result-object v7

    .line 86
    iget-object v0, p0, La/dm0;->Q1:La/yzn0;

    .line 87
    .line 88
    sget-object v1, La/dm0;->U1:[La/iiy;

    .line 89
    .line 90
    const/4 v2, 0x1

    .line 91
    aget-object v1, v1, v2

    .line 92
    .line 93
    invoke-virtual {v0, p0, v1}, La/yzn0;->k(Landroidx/fragment/app/Fragment;La/iiy;)Ljava/io/Serializable;

    .line 94
    .line 95
    .line 96
    move-result-object p0

    .line 97
    move-object v9, p0

    .line 98
    check-cast v9, La/mdp;

    .line 99
    .line 100
    const/4 v6, 0x0

    .line 101
    const/4 v10, 0x6

    .line 102
    const/4 v5, 0x0

    .line 103
    const/4 v8, 0x1

    .line 104
    invoke-static/range {v3 .. v10}, La/is0;->a(La/is0;La/lr1;Lorg/xplatform/aggregator/impl/core/navigation/AggregatorScreenModel;Ljava/lang/String;Ljava/lang/String;ZLa/mdp;I)La/q7i;

    .line 105
    .line 106
    .line 107
    move-result-object v1

    .line 108
    goto :goto_2

    .line 109
    :cond_3
    const-string p0, "Cannot create dependency "

    .line 110
    .line 111
    invoke-static {v2, p0}, La/b1j;->i(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/String;

    .line 112
    .line 113
    .line 114
    move-result-object p0

    .line 115
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 116
    .line 117
    .line 118
    :goto_2
    return-object v1

    .line 119
    :pswitch_1
    sget-object v0, La/dm0;->S1:La/pek0;

    .line 120
    .line 121
    iget-object p0, p0, La/dm0;->K1:La/fiu0;

    .line 122
    .line 123
    if-eqz p0, :cond_4

    .line 124
    .line 125
    return-object p0

    .line 126
    :cond_4
    const-string p0, "viewModelFactory"

    .line 127
    .line 128
    invoke-static {p0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 129
    .line 130
    .line 131
    throw v1

    .line 132
    nop

    .line 133
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
