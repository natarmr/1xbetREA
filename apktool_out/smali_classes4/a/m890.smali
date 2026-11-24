.class public final synthetic La/m890;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/o890;


# direct methods
.method public synthetic constructor <init>(La/o890;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/m890;->a:B

    iput-object p1, p0, La/m890;->b:La/o890;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    .line 1
    iget-byte v0, p0, La/m890;->a:B

    .line 2
    .line 3
    const/16 v1, 0xa

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    iget-object p0, p0, La/m890;->b:La/o890;

    .line 7
    .line 8
    packed-switch v0, :pswitch_data_0

    .line 9
    .line 10
    .line 11
    check-cast p1, La/eg60;

    .line 12
    .line 13
    sget-object v0, La/o890;->f2:La/jh70;

    .line 14
    .line 15
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 16
    .line 17
    .line 18
    invoke-virtual {p0}, La/o890;->M0()La/p990;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    invoke-virtual {p0}, La/p990;->A()V

    .line 23
    .line 24
    .line 25
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 26
    .line 27
    return-object p0

    .line 28
    :pswitch_0
    check-cast p1, Ljava/lang/String;

    .line 29
    .line 30
    sget-object v0, La/o890;->f2:La/jh70;

    .line 31
    .line 32
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 33
    .line 34
    .line 35
    invoke-virtual {p0}, La/o890;->M0()La/p990;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    new-instance v0, La/v890;

    .line 40
    .line 41
    invoke-direct {v0, p1}, La/v890;-><init>(Ljava/lang/String;)V

    .line 42
    .line 43
    .line 44
    invoke-static {p0}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 45
    .line 46
    .line 47
    move-result-object v3

    .line 48
    iget-object p1, p0, La/p990;->p:La/mne;

    .line 49
    .line 50
    iget-object v6, p1, La/mne;->c:La/vs10;

    .line 51
    .line 52
    new-instance v4, La/ev80;

    .line 53
    .line 54
    const/16 p1, 0x12

    .line 55
    .line 56
    invoke-direct {v4, p1}, La/ev80;-><init>(B)V

    .line 57
    .line 58
    .line 59
    new-instance v7, La/s980;

    .line 60
    .line 61
    invoke-direct {v7, p0, v0, v2, v1}, La/s980;-><init>(Ljava/lang/Object;Ljava/lang/Object;La/yje;B)V

    .line 62
    .line 63
    .line 64
    const/16 v8, 0xa

    .line 65
    .line 66
    const/4 v5, 0x0

    .line 67
    invoke-static/range {v3 .. v8}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 68
    .line 69
    .line 70
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 71
    .line 72
    return-object p0

    .line 73
    :pswitch_1
    check-cast p1, La/mbu0;

    .line 74
    .line 75
    sget-object v0, La/o890;->f2:La/jh70;

    .line 76
    .line 77
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 78
    .line 79
    .line 80
    invoke-virtual {p0}, La/o890;->M0()La/p990;

    .line 81
    .line 82
    .line 83
    move-result-object p0

    .line 84
    sget-object v0, La/mbu0;->l:La/c0o;

    .line 85
    .line 86
    invoke-virtual {v0, p1}, La/c0o;->contains(Ljava/lang/Object;)Z

    .line 87
    .line 88
    .line 89
    move-result v0

    .line 90
    if-eqz v0, :cond_0

    .line 91
    .line 92
    invoke-virtual {p0}, La/p990;->B()V

    .line 93
    .line 94
    .line 95
    invoke-static {p0}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 96
    .line 97
    .line 98
    move-result-object v3

    .line 99
    iget-object v0, p0, La/p990;->p:La/mne;

    .line 100
    .line 101
    iget-object v6, v0, La/mne;->b:La/dvj;

    .line 102
    .line 103
    new-instance v4, La/r890;

    .line 104
    .line 105
    const/4 v0, 0x4

    .line 106
    invoke-direct {v4, p0, v0}, La/r890;-><init>(La/p990;B)V

    .line 107
    .line 108
    .line 109
    new-instance v7, La/w090;

    .line 110
    .line 111
    invoke-direct {v7, p0, p1, v2, v1}, La/w090;-><init>(Ljava/lang/Object;Ljava/io/Serializable;La/yje;B)V

    .line 112
    .line 113
    .line 114
    const/16 v8, 0xa

    .line 115
    .line 116
    const/4 v5, 0x0

    .line 117
    invoke-static/range {v3 .. v8}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 118
    .line 119
    .line 120
    :cond_0
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 121
    .line 122
    return-object p0

    .line 123
    :pswitch_2
    check-cast p1, La/jb90;

    .line 124
    .line 125
    sget-object v0, La/o890;->f2:La/jh70;

    .line 126
    .line 127
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 128
    .line 129
    .line 130
    iget-object p0, p0, La/o890;->R1:La/ojj;

    .line 131
    .line 132
    if-eqz p0, :cond_1

    .line 133
    .line 134
    invoke-virtual {p0, p1}, La/ojj;->b(La/jb90;)V

    .line 135
    .line 136
    .line 137
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 138
    .line 139
    return-object p0

    .line 140
    :cond_1
    const-string p0, "webViewErrorLogger"

    .line 141
    .line 142
    invoke-static {p0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 143
    .line 144
    .line 145
    throw v2

    .line 146
    nop

    .line 147
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
