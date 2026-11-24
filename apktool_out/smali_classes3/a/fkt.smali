.class public final synthetic La/fkt;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/hkt;


# direct methods
.method public synthetic constructor <init>(La/hkt;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/fkt;->a:B

    iput-object p1, p0, La/fkt;->b:La/hkt;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    .line 1
    iget-byte v0, p0, La/fkt;->a:B

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    iget-object p0, p0, La/fkt;->b:La/hkt;

    .line 5
    .line 6
    check-cast p1, Landroid/view/View;

    .line 7
    .line 8
    packed-switch v0, :pswitch_data_0

    .line 9
    .line 10
    .line 11
    sget-object v0, La/hkt;->Z1:La/pek;

    .line 12
    .line 13
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    invoke-virtual {p0}, La/hkt;->I0()La/mkt;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    iget-object p1, p0, La/mkt;->d:La/y3v;

    .line 21
    .line 22
    iget-object p1, p1, La/y3v;->b:Ljava/lang/Object;

    .line 23
    .line 24
    check-cast p1, La/kt2;

    .line 25
    .line 26
    const-string v0, "screen"

    .line 27
    .line 28
    const-string v2, "login_restrict_country"

    .line 29
    .line 30
    const-string v3, "login_page_call"

    .line 31
    .line 32
    invoke-static {v0, v2, p1, v3}, La/i8i;->D(Ljava/lang/String;Ljava/lang/String;La/kt2;Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    iget-object p1, p0, La/mkt;->h:La/s64;

    .line 36
    .line 37
    sget-object v0, La/y1p;->b:La/y1p;

    .line 38
    .line 39
    invoke-virtual {p1, v2}, La/s64;->c(Ljava/lang/String;)V

    .line 40
    .line 41
    .line 42
    iget-object p1, p0, La/mkt;->j:La/dpc;

    .line 43
    .line 44
    iget-object p1, p1, La/dpc;->a:La/chf0;

    .line 45
    .line 46
    iget-object p1, p1, La/chf0;->b:Ljava/lang/Object;

    .line 47
    .line 48
    check-cast p1, La/zte0;

    .line 49
    .line 50
    iget-object p1, p1, La/zte0;->a:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 51
    .line 52
    invoke-virtual {p1, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 53
    .line 54
    .line 55
    iget-object p1, p0, La/mkt;->k:La/ani0;

    .line 56
    .line 57
    const/4 v0, 0x0

    .line 58
    invoke-virtual {p1, v0}, La/ani0;->d(Z)V

    .line 59
    .line 60
    .line 61
    iget-object p0, p0, La/mkt;->f:La/i1w0;

    .line 62
    .line 63
    new-instance p1, La/vls;

    .line 64
    .line 65
    const/16 v0, 0x18

    .line 66
    .line 67
    invoke-direct {p1, v0}, La/vls;-><init>(B)V

    .line 68
    .line 69
    .line 70
    invoke-virtual {p0, p1}, La/i1w0;->d(Lkotlin/jvm/functions/Function1;)V

    .line 71
    .line 72
    .line 73
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 74
    .line 75
    return-object p0

    .line 76
    :pswitch_0
    sget-object v0, La/hkt;->Z1:La/pek;

    .line 77
    .line 78
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 79
    .line 80
    .line 81
    invoke-virtual {p0}, La/hkt;->I0()La/mkt;

    .line 82
    .line 83
    .line 84
    move-result-object p0

    .line 85
    invoke-static {p0}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 86
    .line 87
    .line 88
    move-result-object v2

    .line 89
    iget-object p1, p0, La/mkt;->g:La/mne;

    .line 90
    .line 91
    iget-object v5, p1, La/mne;->b:La/dvj;

    .line 92
    .line 93
    new-instance v3, La/ikt;

    .line 94
    .line 95
    invoke-direct {v3, p0, v1}, La/ikt;-><init>(La/mkt;B)V

    .line 96
    .line 97
    .line 98
    new-instance v6, La/fhq;

    .line 99
    .line 100
    const/4 p1, 0x0

    .line 101
    const/4 v0, 0x7

    .line 102
    invoke-direct {v6, p0, p1, v0}, La/fhq;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 103
    .line 104
    .line 105
    const/16 v7, 0xa

    .line 106
    .line 107
    const/4 v4, 0x0

    .line 108
    invoke-static/range {v2 .. v7}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 109
    .line 110
    .line 111
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 112
    .line 113
    return-object p0

    .line 114
    :pswitch_1
    sget-object v0, La/hkt;->Z1:La/pek;

    .line 115
    .line 116
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 117
    .line 118
    .line 119
    new-instance p1, Landroid/content/Intent;

    .line 120
    .line 121
    const-string v0, "android.settings.LOCATION_SOURCE_SETTINGS"

    .line 122
    .line 123
    invoke-direct {p1, v0}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 124
    .line 125
    .line 126
    invoke-virtual {p0, p1}, Landroidx/fragment/app/Fragment;->w0(Landroid/content/Intent;)V

    .line 127
    .line 128
    .line 129
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 130
    .line 131
    return-object p0

    .line 132
    nop

    .line 133
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
