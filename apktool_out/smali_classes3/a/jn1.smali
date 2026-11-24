.class public final synthetic La/jn1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/on1;


# direct methods
.method public synthetic constructor <init>(La/on1;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/jn1;->a:B

    iput-object p1, p0, La/jn1;->b:La/on1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 11

    .line 1
    iget-byte v0, p0, La/jn1;->a:B

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    iget-object p0, p0, La/jn1;->b:La/on1;

    .line 5
    .line 6
    packed-switch v0, :pswitch_data_0

    .line 7
    .line 8
    .line 9
    sget-object v0, La/on1;->S1:La/hfk0;

    .line 10
    .line 11
    invoke-virtual {p0}, La/on1;->G0()La/k3t0;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    sget-object v0, La/xm1;->a:La/xm1;

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
    new-instance v0, La/q0h0;

    .line 24
    .line 25
    iget-object p0, p0, La/on1;->K1:La/p7i;

    .line 26
    .line 27
    if-eqz p0, :cond_0

    .line 28
    .line 29
    invoke-direct {v0, p0}, La/q0h0;-><init>(La/p0h0;)V

    .line 30
    .line 31
    .line 32
    return-object v0

    .line 33
    :cond_0
    const-string p0, "viewModelFactory"

    .line 34
    .line 35
    invoke-static {p0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    throw v1

    .line 39
    :pswitch_1
    sget-object v0, La/on1;->S1:La/hfk0;

    .line 40
    .line 41
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->n0()La/kxq;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    invoke-virtual {v0}, Landroid/app/Activity;->getApplication()Landroid/app/Application;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 50
    .line 51
    .line 52
    instance-of v2, v0, La/af3;

    .line 53
    .line 54
    if-eqz v2, :cond_1

    .line 55
    .line 56
    check-cast v0, La/af3;

    .line 57
    .line 58
    goto :goto_0

    .line 59
    :cond_1
    move-object v0, v1

    .line 60
    :goto_0
    const-class v2, La/is0;

    .line 61
    .line 62
    if-eqz v0, :cond_4

    .line 63
    .line 64
    invoke-interface {v0}, La/af3;->d()La/wcf0;

    .line 65
    .line 66
    .line 67
    move-result-object v0

    .line 68
    invoke-virtual {v0, v2}, La/wcf0;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    move-result-object v0

    .line 72
    check-cast v0, La/o5d0;

    .line 73
    .line 74
    if-eqz v0, :cond_2

    .line 75
    .line 76
    invoke-interface {v0}, La/o5d0;->get()Ljava/lang/Object;

    .line 77
    .line 78
    .line 79
    move-result-object v0

    .line 80
    check-cast v0, La/ze3;

    .line 81
    .line 82
    goto :goto_1

    .line 83
    :cond_2
    move-object v0, v1

    .line 84
    :goto_1
    instance-of v3, v0, La/is0;

    .line 85
    .line 86
    if-nez v3, :cond_3

    .line 87
    .line 88
    move-object v0, v1

    .line 89
    :cond_3
    move-object v3, v0

    .line 90
    check-cast v3, La/is0;

    .line 91
    .line 92
    if-eqz v3, :cond_4

    .line 93
    .line 94
    sget-object v4, La/ir1;->c:La/ir1;

    .line 95
    .line 96
    iget-object v0, p0, La/on1;->O1:La/phf0;

    .line 97
    .line 98
    sget-object v1, La/on1;->U1:[La/iiy;

    .line 99
    .line 100
    const/4 v2, 0x0

    .line 101
    aget-object v1, v1, v2

    .line 102
    .line 103
    invoke-virtual {v0, p0, v1}, La/phf0;->l(Landroidx/fragment/app/Fragment;La/iiy;)Ljava/lang/String;

    .line 104
    .line 105
    .line 106
    move-result-object v6

    .line 107
    const-class p0, La/on1;

    .line 108
    .line 109
    invoke-virtual {p0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 110
    .line 111
    .line 112
    move-result-object v7

    .line 113
    const/4 v9, 0x0

    .line 114
    const/16 v10, 0x22

    .line 115
    .line 116
    const/4 v5, 0x0

    .line 117
    const/4 v8, 0x1

    .line 118
    invoke-static/range {v3 .. v10}, La/is0;->a(La/is0;La/lr1;Lorg/xplatform/aggregator/impl/core/navigation/AggregatorScreenModel;Ljava/lang/String;Ljava/lang/String;ZLa/mdp;I)La/q7i;

    .line 119
    .line 120
    .line 121
    move-result-object v1

    .line 122
    goto :goto_2

    .line 123
    :cond_4
    const-string p0, "Cannot create dependency "

    .line 124
    .line 125
    invoke-static {v2, p0}, La/b1j;->i(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/String;

    .line 126
    .line 127
    .line 128
    move-result-object p0

    .line 129
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 130
    .line 131
    .line 132
    :goto_2
    return-object v1

    .line 133
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
