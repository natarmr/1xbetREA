.class public final synthetic La/td60;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/ywv0;


# direct methods
.method public synthetic constructor <init>(La/ywv0;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/td60;->a:B

    iput-object p1, p0, La/td60;->b:La/ywv0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 4

    .line 1
    iget-byte v0, p0, La/td60;->a:B

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x1

    .line 5
    iget-object p0, p0, La/td60;->b:La/ywv0;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    iget-object p0, p0, La/ywv0;->i:La/vkr0;

    .line 11
    .line 12
    invoke-virtual {p0}, La/vkr0;->x()V

    .line 13
    .line 14
    .line 15
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 16
    .line 17
    return-object p0

    .line 18
    :pswitch_0
    iget-object p0, p0, La/ywv0;->i:La/vkr0;

    .line 19
    .line 20
    invoke-virtual {p0}, La/vkr0;->x()V

    .line 21
    .line 22
    .line 23
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 24
    .line 25
    return-object p0

    .line 26
    :pswitch_1
    invoke-static {p0}, La/pvm0;->s(La/ywv0;)La/bxv0;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    iget-object v0, v0, La/bxv0;->f:La/stv0;

    .line 31
    .line 32
    sget-object v3, La/stv0;->c:La/stv0;

    .line 33
    .line 34
    if-eq v0, v3, :cond_0

    .line 35
    .line 36
    iget-object p0, p0, La/ywv0;->f:La/mkt0;

    .line 37
    .line 38
    iget-object p0, p0, La/mkt0;->c:Ljava/lang/Object;

    .line 39
    .line 40
    check-cast p0, La/pz40;

    .line 41
    .line 42
    check-cast p0, La/hgk0;

    .line 43
    .line 44
    invoke-virtual {p0}, La/hgk0;->getValue()Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object p0

    .line 48
    check-cast p0, Ljava/lang/Boolean;

    .line 49
    .line 50
    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 51
    .line 52
    .line 53
    move-result p0

    .line 54
    if-nez p0, :cond_0

    .line 55
    .line 56
    move v1, v2

    .line 57
    :cond_0
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 58
    .line 59
    .line 60
    move-result-object p0

    .line 61
    return-object p0

    .line 62
    :pswitch_2
    iget-object p0, p0, La/ywv0;->b:La/h0q0;

    .line 63
    .line 64
    iget-object p0, p0, La/h0q0;->c:Ljava/lang/Object;

    .line 65
    .line 66
    check-cast p0, La/pz40;

    .line 67
    .line 68
    check-cast p0, La/hgk0;

    .line 69
    .line 70
    invoke-virtual {p0}, La/hgk0;->getValue()Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    move-result-object p0

    .line 74
    check-cast p0, La/ssv0;

    .line 75
    .line 76
    return-object p0

    .line 77
    :pswitch_3
    invoke-static {p0}, La/pvm0;->s(La/ywv0;)La/bxv0;

    .line 78
    .line 79
    .line 80
    move-result-object p0

    .line 81
    iget-object p0, p0, La/bxv0;->f:La/stv0;

    .line 82
    .line 83
    sget-object v0, La/stv0;->c:La/stv0;

    .line 84
    .line 85
    if-eq p0, v0, :cond_1

    .line 86
    .line 87
    move v1, v2

    .line 88
    :cond_1
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 89
    .line 90
    .line 91
    move-result-object p0

    .line 92
    return-object p0

    .line 93
    :pswitch_4
    invoke-static {p0}, La/pvm0;->s(La/ywv0;)La/bxv0;

    .line 94
    .line 95
    .line 96
    move-result-object p0

    .line 97
    iget-object p0, p0, La/bxv0;->b:La/jtv0;

    .line 98
    .line 99
    return-object p0

    .line 100
    :pswitch_5
    invoke-static {p0}, La/pvm0;->s(La/ywv0;)La/bxv0;

    .line 101
    .line 102
    .line 103
    move-result-object p0

    .line 104
    iget-object p0, p0, La/bxv0;->a:La/cxv0;

    .line 105
    .line 106
    return-object p0

    .line 107
    :pswitch_6
    new-instance v0, La/avv0;

    .line 108
    .line 109
    iget-object p0, p0, La/ywv0;->b:La/h0q0;

    .line 110
    .line 111
    invoke-virtual {p0}, La/h0q0;->l()La/bsv0;

    .line 112
    .line 113
    .line 114
    move-result-object p0

    .line 115
    invoke-direct {v0, p0}, La/avv0;-><init>(La/bsv0;)V

    .line 116
    .line 117
    .line 118
    return-object v0

    .line 119
    :pswitch_7
    iget-object p0, p0, La/ywv0;->d:La/glt0;

    .line 120
    .line 121
    invoke-virtual {p0}, La/glt0;->f()Z

    .line 122
    .line 123
    .line 124
    move-result p0

    .line 125
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 126
    .line 127
    .line 128
    move-result-object p0

    .line 129
    return-object p0

    .line 130
    :pswitch_8
    iget-object p0, p0, La/ywv0;->c:La/fht0;

    .line 131
    .line 132
    invoke-virtual {p0}, La/fht0;->f()La/cvv0;

    .line 133
    .line 134
    .line 135
    move-result-object p0

    .line 136
    if-eqz p0, :cond_2

    .line 137
    .line 138
    iget p0, p0, La/cvv0;->f:I

    .line 139
    .line 140
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 141
    .line 142
    .line 143
    move-result-object p0

    .line 144
    goto :goto_0

    .line 145
    :cond_2
    const/4 p0, 0x0

    .line 146
    :goto_0
    return-object p0

    .line 147
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
