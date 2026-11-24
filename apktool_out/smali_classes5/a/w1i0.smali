.class public final synthetic La/w1i0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/x1i0;


# direct methods
.method public synthetic constructor <init>(La/x1i0;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/w1i0;->a:B

    iput-object p1, p0, La/w1i0;->b:La/x1i0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 4

    .line 1
    iget-byte v0, p0, La/w1i0;->a:B

    .line 2
    .line 3
    iget-object p0, p0, La/w1i0;->b:La/x1i0;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    sget-object v0, La/x1i0;->n2:La/zie0;

    .line 9
    .line 10
    invoke-virtual {p0}, La/x1i0;->Q0()La/k3t0;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    sget-object v0, La/s1i0;->a:La/s1i0;

    .line 15
    .line 16
    invoke-virtual {p0, v0}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 17
    .line 18
    .line 19
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 20
    .line 21
    return-object p0

    .line 22
    :pswitch_0
    new-instance v0, La/q0h0;

    .line 23
    .line 24
    iget-object p0, p0, La/x1i0;->l2:La/n0o0;

    .line 25
    .line 26
    invoke-virtual {p0}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    check-cast p0, La/bti;

    .line 31
    .line 32
    iget-object p0, p0, La/bti;->c:La/n5d0;

    .line 33
    .line 34
    invoke-interface {p0}, La/o5d0;->get()Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object p0

    .line 38
    check-cast p0, La/ati;

    .line 39
    .line 40
    invoke-direct {v0, p0}, La/q0h0;-><init>(La/p0h0;)V

    .line 41
    .line 42
    .line 43
    return-object v0

    .line 44
    :pswitch_1
    sget-object v0, La/x1i0;->n2:La/zie0;

    .line 45
    .line 46
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->n0()La/kxq;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    invoke-virtual {v0}, Landroid/app/Activity;->getApplication()Landroid/app/Application;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 55
    .line 56
    .line 57
    instance-of v1, v0, La/af3;

    .line 58
    .line 59
    const/4 v2, 0x0

    .line 60
    if-eqz v1, :cond_0

    .line 61
    .line 62
    check-cast v0, La/af3;

    .line 63
    .line 64
    goto :goto_0

    .line 65
    :cond_0
    move-object v0, v2

    .line 66
    :goto_0
    const-class v1, La/y1i0;

    .line 67
    .line 68
    if-eqz v0, :cond_3

    .line 69
    .line 70
    invoke-interface {v0}, La/af3;->d()La/wcf0;

    .line 71
    .line 72
    .line 73
    move-result-object v0

    .line 74
    invoke-virtual {v0, v1}, La/wcf0;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 75
    .line 76
    .line 77
    move-result-object v0

    .line 78
    check-cast v0, La/o5d0;

    .line 79
    .line 80
    if-eqz v0, :cond_1

    .line 81
    .line 82
    invoke-interface {v0}, La/o5d0;->get()Ljava/lang/Object;

    .line 83
    .line 84
    .line 85
    move-result-object v0

    .line 86
    check-cast v0, La/ze3;

    .line 87
    .line 88
    goto :goto_1

    .line 89
    :cond_1
    move-object v0, v2

    .line 90
    :goto_1
    instance-of v3, v0, La/y1i0;

    .line 91
    .line 92
    if-nez v3, :cond_2

    .line 93
    .line 94
    move-object v0, v2

    .line 95
    :cond_2
    check-cast v0, La/y1i0;

    .line 96
    .line 97
    if-eqz v0, :cond_3

    .line 98
    .line 99
    invoke-virtual {p0}, La/x1i0;->P0()Lorg/xplatform/results/impl/presentation/dialogs/results/params/SelectDateScreenParams;

    .line 100
    .line 101
    .line 102
    move-result-object p0

    .line 103
    iget-object v0, v0, La/y1i0;->a:La/mne;

    .line 104
    .line 105
    new-instance v2, La/bti;

    .line 106
    .line 107
    invoke-direct {v2, p0, v0}, La/bti;-><init>(Lorg/xplatform/results/impl/presentation/dialogs/results/params/SelectDateScreenParams;La/mne;)V

    .line 108
    .line 109
    .line 110
    goto :goto_2

    .line 111
    :cond_3
    const-string p0, "Cannot create dependency "

    .line 112
    .line 113
    invoke-static {v1, p0}, La/b1j;->i(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/String;

    .line 114
    .line 115
    .line 116
    move-result-object p0

    .line 117
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 118
    .line 119
    .line 120
    :goto_2
    return-object v2

    .line 121
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
