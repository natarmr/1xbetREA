.class public final synthetic La/u210;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/b310;


# direct methods
.method public synthetic constructor <init>(La/b310;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/u210;->a:B

    iput-object p1, p0, La/u210;->b:La/b310;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 6

    .line 1
    iget-byte v0, p0, La/u210;->a:B

    .line 2
    .line 3
    iget-object p0, p0, La/u210;->b:La/b310;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, La/b310;->i:La/a7q;

    .line 9
    .line 10
    const-wide/16 v1, 0x28

    .line 11
    .line 12
    const-wide/16 v3, 0x2

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
    const/4 v2, 0x5

    .line 21
    invoke-direct {v1, v0, v2}, La/ak9;-><init>(La/vsg0;B)V

    .line 22
    .line 23
    .line 24
    invoke-static {p0}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    new-instance v0, La/o6m0;

    .line 29
    .line 30
    const-wide v2, 0x7fffffffffffffffL

    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    invoke-direct {v0, v2, v3}, La/o6m0;-><init>(J)V

    .line 36
    .line 37
    .line 38
    new-instance v2, La/cqr;

    .line 39
    .line 40
    const v3, 0x7f0606d8

    .line 41
    .line 42
    .line 43
    const/4 v4, 0x0

    .line 44
    const-string v5, ""

    .line 45
    .line 46
    invoke-direct {v2, v5, v3, v4}, La/cqr;-><init>(Ljava/lang/String;IZ)V

    .line 47
    .line 48
    .line 49
    invoke-static {v1, p0, v0, v2}, La/vtb;->h0(La/gmq;La/vne;La/lpj0;Ljava/lang/Object;)La/xae0;

    .line 50
    .line 51
    .line 52
    move-result-object p0

    .line 53
    return-object p0

    .line 54
    :pswitch_0
    iget-object p0, p0, La/b310;->v:La/hqc;

    .line 55
    .line 56
    invoke-virtual {p0}, La/hqc;->a()La/gmq;

    .line 57
    .line 58
    .line 59
    move-result-object p0

    .line 60
    return-object p0

    .line 61
    :pswitch_1
    iget-object v0, p0, La/b310;->o:La/dwu;

    .line 62
    .line 63
    iget-object v1, p0, La/b310;->G:Ljava/util/ArrayList;

    .line 64
    .line 65
    sget-object v2, La/dam0;->b:La/dam0;

    .line 66
    .line 67
    invoke-virtual {v0, v1, v2}, La/dwu;->a(Ljava/util/List;La/dam0;)La/zj2;

    .line 68
    .line 69
    .line 70
    move-result-object v0

    .line 71
    new-instance v1, La/kaw;

    .line 72
    .line 73
    const/4 v2, 0x0

    .line 74
    const/16 v3, 0x1c

    .line 75
    .line 76
    invoke-direct {v1, p0, v2, v3}, La/kaw;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 77
    .line 78
    .line 79
    new-instance p0, La/fnq;

    .line 80
    .line 81
    const/4 v2, 0x4

    .line 82
    invoke-direct {p0, v0, v1, v2}, La/fnq;-><init>(La/gmq;Lkotlin/jvm/functions/Function2;B)V

    .line 83
    .line 84
    .line 85
    return-object p0

    .line 86
    :pswitch_2
    iget-object p0, p0, La/b310;->w:La/lbu;

    .line 87
    .line 88
    invoke-virtual {p0}, La/lbu;->j()Z

    .line 89
    .line 90
    .line 91
    move-result p0

    .line 92
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 93
    .line 94
    .line 95
    move-result-object p0

    .line 96
    return-object p0

    .line 97
    :pswitch_3
    iget-object p0, p0, La/b310;->m:La/svu;

    .line 98
    .line 99
    invoke-virtual {p0}, La/svu;->l()Z

    .line 100
    .line 101
    .line 102
    move-result p0

    .line 103
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 104
    .line 105
    .line 106
    move-result-object p0

    .line 107
    return-object p0

    .line 108
    nop

    .line 109
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
