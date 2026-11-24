.class public final synthetic La/yxn0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/zyn0;


# direct methods
.method public synthetic constructor <init>(La/zyn0;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/yxn0;->a:B

    iput-object p1, p0, La/yxn0;->b:La/zyn0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 10

    .line 1
    iget-byte v0, p0, La/yxn0;->a:B

    .line 2
    .line 3
    iget-object v1, p0, La/yxn0;->b:La/zyn0;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    iget-object v2, v1, La/zyn0;->I:La/sa10;

    .line 9
    .line 10
    sget-object v3, La/pb10;->g:La/pb10;

    .line 11
    .line 12
    new-instance v6, La/yxn0;

    .line 13
    .line 14
    const/4 p0, 0x0

    .line 15
    invoke-direct {v6, v1, p0}, La/yxn0;-><init>(La/zyn0;B)V

    .line 16
    .line 17
    .line 18
    const-wide/16 v7, 0x2710

    .line 19
    .line 20
    const v4, 0x7f130415

    .line 21
    .line 22
    .line 23
    const v5, 0x7f130986

    .line 24
    .line 25
    .line 26
    invoke-virtual/range {v2 .. v8}, La/sa10;->a(La/pb10;IILkotlin/jvm/functions/Function0;J)La/ra10;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    return-object p0

    .line 31
    :pswitch_0
    iget-object v2, p0, La/yxn0;->b:La/zyn0;

    .line 32
    .line 33
    iget-object p0, v2, La/zyn0;->I:La/sa10;

    .line 34
    .line 35
    sget-object v8, La/pb10;->g:La/pb10;

    .line 36
    .line 37
    new-instance v0, La/cym0;

    .line 38
    .line 39
    const/4 v6, 0x0

    .line 40
    const/4 v7, 0x2

    .line 41
    const/4 v1, 0x0

    .line 42
    const-class v3, La/zyn0;

    .line 43
    .line 44
    const-string v4, "onLottieButtonClick"

    .line 45
    .line 46
    const-string v5, "onLottieButtonClick()V"

    .line 47
    .line 48
    invoke-direct/range {v0 .. v7}, La/cym0;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 49
    .line 50
    .line 51
    move-object v4, v8

    .line 52
    const-wide/16 v8, 0x2710

    .line 53
    .line 54
    const v5, 0x7f130677

    .line 55
    .line 56
    .line 57
    const v6, 0x7f131690

    .line 58
    .line 59
    .line 60
    move-object v3, p0

    .line 61
    move-object v7, v0

    .line 62
    invoke-virtual/range {v3 .. v9}, La/sa10;->a(La/pb10;IILkotlin/jvm/functions/Function0;J)La/ra10;

    .line 63
    .line 64
    .line 65
    move-result-object p0

    .line 66
    return-object p0

    .line 67
    :pswitch_1
    iget-object p0, v1, La/zyn0;->d0:La/pru;

    .line 68
    .line 69
    invoke-virtual {p0}, La/pru;->a()La/sff0;

    .line 70
    .line 71
    .line 72
    move-result-object p0

    .line 73
    return-object p0

    .line 74
    :pswitch_2
    invoke-virtual {v1}, La/i3t0;->D()Ljava/lang/Object;

    .line 75
    .line 76
    .line 77
    move-result-object p0

    .line 78
    check-cast p0, La/vxn0;

    .line 79
    .line 80
    iget-boolean p0, p0, La/vxn0;->f:Z

    .line 81
    .line 82
    if-eqz p0, :cond_0

    .line 83
    .line 84
    goto :goto_0

    .line 85
    :cond_0
    iget-object p0, v1, La/zyn0;->N:La/e41;

    .line 86
    .line 87
    iget-object p0, p0, La/e41;->a:La/s1p;

    .line 88
    .line 89
    const-wide/16 v2, 0xc38

    .line 90
    .line 91
    sget-object v0, La/xun;->a:La/xun;

    .line 92
    .line 93
    invoke-virtual {p0, v0, v2, v3}, La/s1p;->a(Ljava/util/Set;J)V

    .line 94
    .line 95
    .line 96
    iget-object p0, v1, La/zyn0;->p:La/s31;

    .line 97
    .line 98
    iget-object p0, p0, La/s31;->a:La/kt2;

    .line 99
    .line 100
    const-string v0, "swipex_filter_end_event_call"

    .line 101
    .line 102
    invoke-interface {p0, v0}, La/kt2;->c(Ljava/lang/String;)V

    .line 103
    .line 104
    .line 105
    :goto_0
    invoke-virtual {v1}, La/zyn0;->R()V

    .line 106
    .line 107
    .line 108
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 109
    .line 110
    return-object p0

    .line 111
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
