.class public final synthetic La/ozt0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/tzt0;


# direct methods
.method public synthetic constructor <init>(La/tzt0;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/ozt0;->a:B

    iput-object p1, p0, La/ozt0;->b:La/tzt0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 6

    .line 1
    iget-byte v0, p0, La/ozt0;->a:B

    .line 2
    .line 3
    iget-object p0, p0, La/ozt0;->b:La/tzt0;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, La/tzt0;->i:La/a7q;

    .line 9
    .line 10
    const-wide/16 v1, 0x28

    .line 11
    .line 12
    const-wide/16 v3, 0x1b

    .line 13
    .line 14
    invoke-virtual {v0, v1, v2, v3, v4}, La/a7q;->a(JJ)La/vsg0;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    new-instance v1, La/ak9;

    .line 19
    .line 20
    const/16 v2, 0xb

    .line 21
    .line 22
    invoke-direct {v1, v0, v2}, La/ak9;-><init>(La/vsg0;B)V

    .line 23
    .line 24
    .line 25
    invoke-static {p0}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    new-instance v0, La/o6m0;

    .line 30
    .line 31
    const-wide v2, 0x7fffffffffffffffL

    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    invoke-direct {v0, v2, v3}, La/o6m0;-><init>(J)V

    .line 37
    .line 38
    .line 39
    new-instance v2, La/cqr;

    .line 40
    .line 41
    const v3, 0x7f0606d8

    .line 42
    .line 43
    .line 44
    const/4 v4, 0x0

    .line 45
    const-string v5, ""

    .line 46
    .line 47
    invoke-direct {v2, v5, v3, v4}, La/cqr;-><init>(Ljava/lang/String;IZ)V

    .line 48
    .line 49
    .line 50
    invoke-static {v1, p0, v0, v2}, La/vtb;->h0(La/gmq;La/vne;La/lpj0;Ljava/lang/Object;)La/xae0;

    .line 51
    .line 52
    .line 53
    move-result-object p0

    .line 54
    return-object p0

    .line 55
    :pswitch_0
    iget-object p0, p0, La/tzt0;->v:La/hqc;

    .line 56
    .line 57
    invoke-virtual {p0}, La/hqc;->a()La/gmq;

    .line 58
    .line 59
    .line 60
    move-result-object p0

    .line 61
    return-object p0

    .line 62
    :pswitch_1
    iget-object v0, p0, La/tzt0;->o:La/dwu;

    .line 63
    .line 64
    iget-object v1, p0, La/tzt0;->G:Ljava/util/ArrayList;

    .line 65
    .line 66
    sget-object v2, La/dam0;->b:La/dam0;

    .line 67
    .line 68
    invoke-virtual {v0, v1, v2}, La/dwu;->a(Ljava/util/List;La/dam0;)La/zj2;

    .line 69
    .line 70
    .line 71
    move-result-object v0

    .line 72
    new-instance v1, La/rtq0;

    .line 73
    .line 74
    const/4 v2, 0x0

    .line 75
    const/16 v3, 0x12

    .line 76
    .line 77
    invoke-direct {v1, p0, v2, v3}, La/rtq0;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 78
    .line 79
    .line 80
    new-instance p0, La/fnq;

    .line 81
    .line 82
    const/4 v2, 0x4

    .line 83
    invoke-direct {p0, v0, v1, v2}, La/fnq;-><init>(La/gmq;Lkotlin/jvm/functions/Function2;B)V

    .line 84
    .line 85
    .line 86
    return-object p0

    .line 87
    :pswitch_2
    iget-object p0, p0, La/tzt0;->w:La/lbu;

    .line 88
    .line 89
    invoke-virtual {p0}, La/lbu;->j()Z

    .line 90
    .line 91
    .line 92
    move-result p0

    .line 93
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 94
    .line 95
    .line 96
    move-result-object p0

    .line 97
    return-object p0

    .line 98
    :pswitch_3
    iget-object p0, p0, La/tzt0;->m:La/svu;

    .line 99
    .line 100
    invoke-virtual {p0}, La/svu;->l()Z

    .line 101
    .line 102
    .line 103
    move-result p0

    .line 104
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 105
    .line 106
    .line 107
    move-result-object p0

    .line 108
    return-object p0

    .line 109
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
