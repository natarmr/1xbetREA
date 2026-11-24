.class public final La/gsu;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements La/ydr;


# instance fields
.field public final synthetic i:B

.field public synthetic j:Ljava/lang/Throwable;

.field public k:Z

.field public final synthetic l:Ljava/lang/Object;


# direct methods
.method public constructor <init>(La/zos;La/yje;)V
    .locals 1

    const/4 v0, 0x2

    iput-byte v0, p0, La/gsu;->i:B

    .line 2
    iput-object p1, p0, La/gsu;->l:Ljava/lang/Object;

    const/4 p1, 0x4

    invoke-direct {p0, p1, p2}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;ZLa/yje;B)V
    .locals 0

    .line 1
    iput-byte p4, p0, La/gsu;->i:B

    iput-object p1, p0, La/gsu;->l:Ljava/lang/Object;

    iput-boolean p2, p0, La/gsu;->k:Z

    const/4 p1, 0x4

    invoke-direct {p0, p1, p3}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    .line 1
    iget-byte v0, p0, La/gsu;->i:B

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    iget-object v2, p0, La/gsu;->l:Ljava/lang/Object;

    .line 5
    .line 6
    const/4 v3, 0x1

    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    iget-object v0, p0, La/gsu;->j:Ljava/lang/Throwable;

    .line 11
    .line 12
    sget-object v1, La/wne;->a:La/wne;

    .line 13
    .line 14
    iget-boolean v4, p0, La/gsu;->k:Z

    .line 15
    .line 16
    const/4 v5, 0x0

    .line 17
    if-eqz v4, :cond_1

    .line 18
    .line 19
    if-ne v4, v3, :cond_0

    .line 20
    .line 21
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 22
    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_0
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 26
    .line 27
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    move-object v1, v5

    .line 31
    goto :goto_1

    .line 32
    :cond_1
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 33
    .line 34
    .line 35
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 36
    .line 37
    .line 38
    check-cast v2, La/zos;

    .line 39
    .line 40
    iget-object p1, v2, La/zos;->b:La/sip;

    .line 41
    .line 42
    invoke-static {p1}, La/kpb;->v(La/sip;)J

    .line 43
    .line 44
    .line 45
    move-result-wide v6

    .line 46
    iput-object v5, p0, La/gsu;->j:Ljava/lang/Throwable;

    .line 47
    .line 48
    iput-boolean v3, p0, La/gsu;->k:Z

    .line 49
    .line 50
    invoke-static {v6, v7, p0}, La/qcc;->P(JLa/yje;)Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object p0

    .line 54
    if-ne p0, v1, :cond_2

    .line 55
    .line 56
    goto :goto_1

    .line 57
    :cond_2
    :goto_0
    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 58
    .line 59
    :goto_1
    return-object v1

    .line 60
    :pswitch_0
    iget-object v0, p0, La/gsu;->j:Ljava/lang/Throwable;

    .line 61
    .line 62
    sget-object v4, La/wne;->a:La/wne;

    .line 63
    .line 64
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 65
    .line 66
    .line 67
    check-cast v2, La/tzi;

    .line 68
    .line 69
    iget-boolean p0, p0, La/gsu;->k:Z

    .line 70
    .line 71
    invoke-static {v0}, La/agc;->W(Ljava/lang/Throwable;)Z

    .line 72
    .line 73
    .line 74
    move-result p1

    .line 75
    if-eqz p1, :cond_4

    .line 76
    .line 77
    if-eqz p0, :cond_3

    .line 78
    .line 79
    iget-object p0, v2, La/tzi;->h:Ljava/lang/Object;

    .line 80
    .line 81
    check-cast p0, La/t4v;

    .line 82
    .line 83
    invoke-virtual {p0}, La/t4v;->a()V

    .line 84
    .line 85
    .line 86
    goto :goto_2

    .line 87
    :cond_3
    iget-object p0, v2, La/tzi;->i:Ljava/lang/Object;

    .line 88
    .line 89
    check-cast p0, La/wsc;

    .line 90
    .line 91
    invoke-virtual {p0}, La/wsc;->a()V

    .line 92
    .line 93
    .line 94
    :goto_2
    move v1, v3

    .line 95
    :cond_4
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 96
    .line 97
    .line 98
    move-result-object p0

    .line 99
    return-object p0

    .line 100
    :pswitch_1
    iget-object v0, p0, La/gsu;->j:Ljava/lang/Throwable;

    .line 101
    .line 102
    sget-object v4, La/wne;->a:La/wne;

    .line 103
    .line 104
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 105
    .line 106
    .line 107
    check-cast v2, La/wdu;

    .line 108
    .line 109
    iget-boolean p0, p0, La/gsu;->k:Z

    .line 110
    .line 111
    invoke-static {v0}, La/agc;->W(Ljava/lang/Throwable;)Z

    .line 112
    .line 113
    .line 114
    move-result p1

    .line 115
    if-eqz p1, :cond_6

    .line 116
    .line 117
    if-eqz p0, :cond_5

    .line 118
    .line 119
    iget-object p0, v2, La/wdu;->h:Ljava/lang/Object;

    .line 120
    .line 121
    check-cast p0, La/ort;

    .line 122
    .line 123
    iget-object p0, p0, La/ort;->a:La/gst0;

    .line 124
    .line 125
    invoke-virtual {p0}, La/gst0;->j()V

    .line 126
    .line 127
    .line 128
    goto :goto_3

    .line 129
    :cond_5
    iget-object p0, v2, La/wdu;->i:Ljava/lang/Object;

    .line 130
    .line 131
    check-cast p0, La/x1u;

    .line 132
    .line 133
    iget-object p0, p0, La/x1u;->a:La/gst0;

    .line 134
    .line 135
    invoke-virtual {p0}, La/gst0;->i()V

    .line 136
    .line 137
    .line 138
    :goto_3
    move v1, v3

    .line 139
    :cond_6
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 140
    .line 141
    .line 142
    move-result-object p0

    .line 143
    return-object p0

    .line 144
    nop

    .line 145
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final j(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget-byte v0, p0, La/gsu;->i:B

    .line 2
    .line 3
    iget-object v1, p0, La/gsu;->l:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast p1, La/kmq;

    .line 6
    .line 7
    check-cast p2, Ljava/lang/Throwable;

    .line 8
    .line 9
    check-cast p3, Ljava/lang/Number;

    .line 10
    .line 11
    invoke-virtual {p3}, Ljava/lang/Number;->longValue()J

    .line 12
    .line 13
    .line 14
    check-cast p4, La/yje;

    .line 15
    .line 16
    packed-switch v0, :pswitch_data_0

    .line 17
    .line 18
    .line 19
    new-instance p0, La/gsu;

    .line 20
    .line 21
    check-cast v1, La/zos;

    .line 22
    .line 23
    invoke-direct {p0, v1, p4}, La/gsu;-><init>(La/zos;La/yje;)V

    .line 24
    .line 25
    .line 26
    iput-object p2, p0, La/gsu;->j:Ljava/lang/Throwable;

    .line 27
    .line 28
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 29
    .line 30
    invoke-virtual {p0, p1}, La/gsu;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    return-object p0

    .line 35
    :pswitch_0
    new-instance p1, La/gsu;

    .line 36
    .line 37
    check-cast v1, La/tzi;

    .line 38
    .line 39
    iget-boolean p0, p0, La/gsu;->k:Z

    .line 40
    .line 41
    const/4 p3, 0x1

    .line 42
    invoke-direct {p1, v1, p0, p4, p3}, La/gsu;-><init>(Ljava/lang/Object;ZLa/yje;B)V

    .line 43
    .line 44
    .line 45
    iput-object p2, p1, La/gsu;->j:Ljava/lang/Throwable;

    .line 46
    .line 47
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 48
    .line 49
    invoke-virtual {p1, p0}, La/gsu;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    move-result-object p0

    .line 53
    return-object p0

    .line 54
    :pswitch_1
    new-instance p1, La/gsu;

    .line 55
    .line 56
    check-cast v1, La/wdu;

    .line 57
    .line 58
    iget-boolean p0, p0, La/gsu;->k:Z

    .line 59
    .line 60
    const/4 p3, 0x0

    .line 61
    invoke-direct {p1, v1, p0, p4, p3}, La/gsu;-><init>(Ljava/lang/Object;ZLa/yje;B)V

    .line 62
    .line 63
    .line 64
    iput-object p2, p1, La/gsu;->j:Ljava/lang/Throwable;

    .line 65
    .line 66
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 67
    .line 68
    invoke-virtual {p1, p0}, La/gsu;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    move-result-object p0

    .line 72
    return-object p0

    .line 73
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
