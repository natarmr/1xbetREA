.class public final synthetic La/bze;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/gze;


# direct methods
.method public synthetic constructor <init>(La/gze;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/bze;->a:B

    iput-object p1, p0, La/bze;->b:La/gze;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 9

    .line 1
    iget-byte p1, p0, La/bze;->a:B

    .line 2
    .line 3
    sget-object v0, La/xb50;->a:La/xb50;

    .line 4
    .line 5
    const-string v1, "coupon"

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    iget-object p0, p0, La/bze;->b:La/gze;

    .line 9
    .line 10
    packed-switch p1, :pswitch_data_0

    .line 11
    .line 12
    .line 13
    sget-object p1, La/gze;->S1:La/usd;

    .line 14
    .line 15
    invoke-virtual {p0}, La/gze;->I0()La/qg20;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    iget-object p1, p0, La/qg20;->I0:La/ih5;

    .line 20
    .line 21
    sget-object v0, La/k7k;->g1:La/k7k;

    .line 22
    .line 23
    invoke-virtual {p1, v0}, La/ih5;->f(La/k7k;)V

    .line 24
    .line 25
    .line 26
    iget-object p1, p0, La/qg20;->J0:La/l7k;

    .line 27
    .line 28
    sget-object v0, La/y1p;->b:La/y1p;

    .line 29
    .line 30
    iget-object v0, p0, La/qg20;->K0:La/cmt;

    .line 31
    .line 32
    invoke-virtual {v0}, La/cmt;->g()Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    const-string v1, "regular_coupon"

    .line 37
    .line 38
    invoke-virtual {p1, v1, v0}, La/l7k;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 39
    .line 40
    .line 41
    invoke-static {p0}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 42
    .line 43
    .line 44
    move-result-object v3

    .line 45
    new-instance v4, La/cd20;

    .line 46
    .line 47
    const/4 p1, 0x4

    .line 48
    invoke-direct {v4, p0, p1}, La/cd20;-><init>(La/qg20;B)V

    .line 49
    .line 50
    .line 51
    iget-object p1, p0, La/qg20;->d:La/mne;

    .line 52
    .line 53
    iget-object v6, p1, La/mne;->a:La/rwj;

    .line 54
    .line 55
    new-instance v7, La/v620;

    .line 56
    .line 57
    const/16 p1, 0x16

    .line 58
    .line 59
    invoke-direct {v7, p0, v2, p1}, La/v620;-><init>(La/w46;La/yje;B)V

    .line 60
    .line 61
    .line 62
    const/16 v8, 0xa

    .line 63
    .line 64
    const/4 v5, 0x0

    .line 65
    invoke-static/range {v3 .. v8}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 66
    .line 67
    .line 68
    return-void

    .line 69
    :pswitch_0
    sget-object p1, La/gze;->S1:La/usd;

    .line 70
    .line 71
    invoke-virtual {p0}, La/gze;->I0()La/qg20;

    .line 72
    .line 73
    .line 74
    move-result-object p0

    .line 75
    iget-object p1, p0, La/qg20;->r0:La/ih5;

    .line 76
    .line 77
    invoke-virtual {p1, v1}, La/ih5;->c(Ljava/lang/String;)V

    .line 78
    .line 79
    .line 80
    iget-object p1, p0, La/qg20;->s0:La/gg5;

    .line 81
    .line 82
    invoke-virtual {p1, v1}, La/gg5;->i(Ljava/lang/String;)V

    .line 83
    .line 84
    .line 85
    iget-object p0, p0, La/qg20;->b1:La/p7m0;

    .line 86
    .line 87
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 88
    .line 89
    .line 90
    invoke-virtual {p0, v2, v0}, La/p7m0;->o(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 91
    .line 92
    .line 93
    return-void

    .line 94
    :pswitch_1
    sget-object p1, La/gze;->S1:La/usd;

    .line 95
    .line 96
    invoke-virtual {p0}, La/gze;->I0()La/qg20;

    .line 97
    .line 98
    .line 99
    move-result-object p0

    .line 100
    iget-object p1, p0, La/qg20;->r0:La/ih5;

    .line 101
    .line 102
    invoke-virtual {p1, v1}, La/ih5;->c(Ljava/lang/String;)V

    .line 103
    .line 104
    .line 105
    iget-object p1, p0, La/qg20;->s0:La/gg5;

    .line 106
    .line 107
    invoke-virtual {p1, v1}, La/gg5;->i(Ljava/lang/String;)V

    .line 108
    .line 109
    .line 110
    iget-object p0, p0, La/qg20;->b1:La/p7m0;

    .line 111
    .line 112
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 113
    .line 114
    .line 115
    invoke-virtual {p0, v2, v0}, La/p7m0;->o(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 116
    .line 117
    .line 118
    return-void

    .line 119
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
