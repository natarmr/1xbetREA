.class public final synthetic La/bvj0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/kvj0;


# direct methods
.method public synthetic constructor <init>(La/kvj0;)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    iput-byte v0, p0, La/bvj0;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/bvj0;->b:La/kvj0;

    return-void
.end method

.method public synthetic constructor <init>(La/kvj0;Lorg/xplatform/ui_core/viewcomponents/views/MakeBetBalanceViewDs;)V
    .locals 0

    .line 2
    const/4 p2, 0x0

    iput-byte p2, p0, La/bvj0;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/bvj0;->b:La/kvj0;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 4

    .line 1
    iget-byte p1, p0, La/bvj0;->a:B

    .line 2
    .line 3
    const-string v0, "fin_bet"

    .line 4
    .line 5
    iget-object p0, p0, La/bvj0;->b:La/kvj0;

    .line 6
    .line 7
    packed-switch p1, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    sget-object p1, La/kvj0;->S1:La/eke0;

    .line 11
    .line 12
    invoke-virtual {p0}, La/kvj0;->M0()La/yxj0;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    iget-object p1, p0, La/yxj0;->P:La/ih5;

    .line 17
    .line 18
    sget-object v1, La/k7k;->i1:La/k7k;

    .line 19
    .line 20
    invoke-virtual {p1, v1}, La/ih5;->f(La/k7k;)V

    .line 21
    .line 22
    .line 23
    iget-object p1, p0, La/yxj0;->Q:La/l7k;

    .line 24
    .line 25
    sget-object v1, La/y1p;->b:La/y1p;

    .line 26
    .line 27
    iget-object v1, p0, La/yxj0;->S:La/cmt;

    .line 28
    .line 29
    invoke-virtual {v1}, La/cmt;->g()Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    invoke-virtual {p1, v0, v1}, La/l7k;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    invoke-virtual {p0}, La/yxj0;->D()La/ql5;

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    if-nez p1, :cond_0

    .line 41
    .line 42
    goto :goto_0

    .line 43
    :cond_0
    iget-object v0, p0, La/yxj0;->t:La/mii0;

    .line 44
    .line 45
    iget-object v0, v0, La/mii0;->b:Ljava/lang/Object;

    .line 46
    .line 47
    check-cast v0, La/kt2;

    .line 48
    .line 49
    const-string v1, "ev_place_bet_deposit"

    .line 50
    .line 51
    invoke-interface {v0, v1}, La/kt2;->c(Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    iget-object v0, p0, La/yxj0;->r:La/v88;

    .line 55
    .line 56
    iget-object p0, p0, La/yxj0;->z:La/i1w0;

    .line 57
    .line 58
    const/4 v1, 0x1

    .line 59
    iget-wide v2, p1, La/ql5;->a:J

    .line 60
    .line 61
    invoke-virtual {v0, p0, v1, v2, v3}, La/v88;->a(La/i1w0;ZJ)V

    .line 62
    .line 63
    .line 64
    :goto_0
    return-void

    .line 65
    :pswitch_0
    sget-object p1, La/kvj0;->S1:La/eke0;

    .line 66
    .line 67
    invoke-virtual {p0}, La/kvj0;->M0()La/yxj0;

    .line 68
    .line 69
    .line 70
    move-result-object p0

    .line 71
    iget-object p1, p0, La/yxj0;->v:La/ih5;

    .line 72
    .line 73
    invoke-virtual {p1, v0}, La/ih5;->c(Ljava/lang/String;)V

    .line 74
    .line 75
    .line 76
    iget-object p1, p0, La/yxj0;->u:La/gg5;

    .line 77
    .line 78
    invoke-virtual {p1, v0}, La/gg5;->i(Ljava/lang/String;)V

    .line 79
    .line 80
    .line 81
    iget-object p1, p0, La/yxj0;->Y:La/p7m0;

    .line 82
    .line 83
    new-instance v0, La/vb50;

    .line 84
    .line 85
    iget-object p0, p0, La/yxj0;->T:La/bm5;

    .line 86
    .line 87
    invoke-direct {v0, p0}, La/vb50;-><init>(La/bm5;)V

    .line 88
    .line 89
    .line 90
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 91
    .line 92
    .line 93
    const/4 p0, 0x0

    .line 94
    invoke-virtual {p1, p0, v0}, La/p7m0;->o(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 95
    .line 96
    .line 97
    return-void

    .line 98
    nop

    .line 99
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
