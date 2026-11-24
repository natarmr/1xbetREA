.class public final synthetic La/mye;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/rye;


# direct methods
.method public synthetic constructor <init>(La/rye;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/mye;->a:B

    iput-object p1, p0, La/mye;->b:La/rye;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 9

    .line 1
    iget-byte p1, p0, La/mye;->a:B

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
    iget-object p0, p0, La/mye;->b:La/rye;

    .line 9
    .line 10
    packed-switch p1, :pswitch_data_0

    .line 11
    .line 12
    .line 13
    sget-object p1, La/rye;->S1:La/kwd;

    .line 14
    .line 15
    invoke-virtual {p0}, La/rye;->H0()La/h620;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    iget-object p1, p0, La/h620;->Q:La/ih5;

    .line 20
    .line 21
    sget-object v0, La/k7k;->g1:La/k7k;

    .line 22
    .line 23
    invoke-virtual {p1, v0}, La/ih5;->f(La/k7k;)V

    .line 24
    .line 25
    .line 26
    iget-object p1, p0, La/h620;->R:La/l7k;

    .line 27
    .line 28
    sget-object v0, La/y1p;->b:La/y1p;

    .line 29
    .line 30
    iget-object v0, p0, La/h620;->S:La/cmt;

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
    new-instance v4, La/p520;

    .line 46
    .line 47
    const/4 p1, 0x3

    .line 48
    invoke-direct {v4, p0, p1}, La/p520;-><init>(La/h620;B)V

    .line 49
    .line 50
    .line 51
    iget-object p1, p0, La/h620;->c:La/mne;

    .line 52
    .line 53
    iget-object v6, p1, La/mne;->a:La/rwj;

    .line 54
    .line 55
    new-instance v7, La/cm10;

    .line 56
    .line 57
    invoke-direct {v7, p0, v2}, La/cm10;-><init>(La/h620;La/yje;)V

    .line 58
    .line 59
    .line 60
    const/16 v8, 0xa

    .line 61
    .line 62
    const/4 v5, 0x0

    .line 63
    invoke-static/range {v3 .. v8}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 64
    .line 65
    .line 66
    return-void

    .line 67
    :pswitch_0
    sget-object p1, La/rye;->S1:La/kwd;

    .line 68
    .line 69
    invoke-virtual {p0}, La/rye;->H0()La/h620;

    .line 70
    .line 71
    .line 72
    move-result-object p0

    .line 73
    iget-object p1, p0, La/h620;->F:La/ih5;

    .line 74
    .line 75
    invoke-virtual {p1, v1}, La/ih5;->c(Ljava/lang/String;)V

    .line 76
    .line 77
    .line 78
    iget-object p1, p0, La/h620;->E:La/gg5;

    .line 79
    .line 80
    invoke-virtual {p1, v1}, La/gg5;->i(Ljava/lang/String;)V

    .line 81
    .line 82
    .line 83
    iget-object p0, p0, La/h620;->V:La/p7m0;

    .line 84
    .line 85
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 86
    .line 87
    .line 88
    invoke-virtual {p0, v2, v0}, La/p7m0;->o(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 89
    .line 90
    .line 91
    return-void

    .line 92
    :pswitch_1
    sget-object p1, La/rye;->S1:La/kwd;

    .line 93
    .line 94
    invoke-virtual {p0}, La/rye;->H0()La/h620;

    .line 95
    .line 96
    .line 97
    move-result-object p0

    .line 98
    iget-object p1, p0, La/h620;->F:La/ih5;

    .line 99
    .line 100
    invoke-virtual {p1, v1}, La/ih5;->c(Ljava/lang/String;)V

    .line 101
    .line 102
    .line 103
    iget-object p1, p0, La/h620;->E:La/gg5;

    .line 104
    .line 105
    invoke-virtual {p1, v1}, La/gg5;->i(Ljava/lang/String;)V

    .line 106
    .line 107
    .line 108
    iget-object p0, p0, La/h620;->V:La/p7m0;

    .line 109
    .line 110
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 111
    .line 112
    .line 113
    invoke-virtual {p0, v2, v0}, La/p7m0;->o(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 114
    .line 115
    .line 116
    return-void

    .line 117
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
