.class public final synthetic La/l1w;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/k4r;
.implements La/zon0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/s1w;


# direct methods
.method public synthetic constructor <init>(La/s1w;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/l1w;->a:B

    iput-object p1, p0, La/l1w;->b:La/s1w;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public b()V
    .locals 1

    .line 1
    sget-object v0, La/s1w;->d2:La/bst;

    .line 2
    .line 3
    iget-object p0, p0, La/l1w;->b:La/s1w;

    .line 4
    .line 5
    invoke-virtual {p0}, La/s1w;->M0()La/naw;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    const/4 v0, 0x0

    .line 10
    invoke-virtual {p0, v0}, La/naw;->G(Z)V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public i(Landroid/os/Bundle;Ljava/lang/String;)V
    .locals 1

    .line 1
    iget-byte v0, p0, La/l1w;->a:B

    .line 2
    .line 3
    iget-object p0, p0, La/l1w;->b:La/s1w;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    sget-object v0, La/s1w;->d2:La/bst;

    .line 9
    .line 10
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    const-string v0, "REQUEST_HIDE_BET_HISTORY_ITEM_KEY"

    .line 14
    .line 15
    invoke-virtual {p2, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 16
    .line 17
    .line 18
    move-result p2

    .line 19
    if-nez p2, :cond_0

    .line 20
    .line 21
    goto :goto_1

    .line 22
    :cond_0
    const-string p2, "RESULT_BET_HISTORY_ITEM_CLICK"

    .line 23
    .line 24
    invoke-virtual {p1, p2}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    if-eqz v0, :cond_2

    .line 29
    .line 30
    invoke-virtual {p1, p2}, Landroid/os/Bundle;->getSerializable(Ljava/lang/String;)Ljava/io/Serializable;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    instance-of p2, p1, La/s77;

    .line 35
    .line 36
    if-eqz p2, :cond_1

    .line 37
    .line 38
    check-cast p1, La/s77;

    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_1
    const/4 p1, 0x0

    .line 42
    :goto_0
    if-eqz p1, :cond_3

    .line 43
    .line 44
    invoke-virtual {p0}, La/s1w;->M0()La/naw;

    .line 45
    .line 46
    .line 47
    move-result-object p0

    .line 48
    invoke-virtual {p0, p1}, La/naw;->E(La/s77;)V

    .line 49
    .line 50
    .line 51
    goto :goto_1

    .line 52
    :cond_2
    const-string p2, "RESULT_HIDE_HISTORY_CLICK"

    .line 53
    .line 54
    invoke-virtual {p1, p2}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    .line 55
    .line 56
    .line 57
    move-result p1

    .line 58
    if-eqz p1, :cond_3

    .line 59
    .line 60
    invoke-virtual {p0}, La/s1w;->M0()La/naw;

    .line 61
    .line 62
    .line 63
    move-result-object p0

    .line 64
    iget-object p1, p0, La/naw;->l0:La/q37;

    .line 65
    .line 66
    sget-object p2, La/f4w;->h:La/f4w;

    .line 67
    .line 68
    invoke-virtual {p1, p2}, La/q37;->b(La/f4w;)V

    .line 69
    .line 70
    .line 71
    iget-object p1, p0, La/naw;->Z0:La/ol60;

    .line 72
    .line 73
    new-instance p2, La/i9w;

    .line 74
    .line 75
    iget-object p0, p0, La/naw;->Q0:La/sff0;

    .line 76
    .line 77
    iget-object p0, p0, La/sff0;->a:La/gx7;

    .line 78
    .line 79
    iget-object p0, p0, La/gx7;->b:La/q57;

    .line 80
    .line 81
    iget p0, p0, La/q57;->d:I

    .line 82
    .line 83
    invoke-direct {p2, p0}, La/i9w;-><init>(I)V

    .line 84
    .line 85
    .line 86
    invoke-virtual {p1, p2}, La/ol60;->f(Ljava/lang/Object;)V

    .line 87
    .line 88
    .line 89
    :cond_3
    :goto_1
    return-void

    .line 90
    :pswitch_0
    sget-object v0, La/s1w;->d2:La/bst;

    .line 91
    .line 92
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 93
    .line 94
    .line 95
    const-string p2, "BET_INFO_FRAGMENT_REQUEST_KEY"

    .line 96
    .line 97
    invoke-virtual {p1, p2}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    .line 98
    .line 99
    .line 100
    move-result v0

    .line 101
    if-eqz v0, :cond_4

    .line 102
    .line 103
    invoke-virtual {p1, p2}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 104
    .line 105
    .line 106
    move-result-object p1

    .line 107
    if-eqz p1, :cond_4

    .line 108
    .line 109
    invoke-virtual {p0}, La/s1w;->M0()La/naw;

    .line 110
    .line 111
    .line 112
    move-result-object p0

    .line 113
    iget-object p0, p0, La/naw;->J:La/td9;

    .line 114
    .line 115
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 116
    .line 117
    .line 118
    new-instance p2, La/ka6;

    .line 119
    .line 120
    const/4 v0, 0x7

    .line 121
    invoke-direct {p2, p1, v0}, La/ka6;-><init>(Ljava/lang/String;B)V

    .line 122
    .line 123
    .line 124
    invoke-virtual {p0, p2}, La/td9;->h(Lkotlin/jvm/functions/Function1;)V

    .line 125
    .line 126
    .line 127
    const/4 p1, 0x0

    .line 128
    iput-boolean p1, p0, La/td9;->a:Z

    .line 129
    .line 130
    new-instance p2, La/bp00;

    .line 131
    .line 132
    invoke-direct {p2, p1}, La/mva;-><init>(Z)V

    .line 133
    .line 134
    .line 135
    iput-object p2, p0, La/td9;->e:Ljava/lang/Object;

    .line 136
    .line 137
    new-instance p1, La/umu;

    .line 138
    .line 139
    const/16 p2, 0x1b

    .line 140
    .line 141
    invoke-direct {p1, p2}, La/umu;-><init>(B)V

    .line 142
    .line 143
    .line 144
    invoke-virtual {p0, p1}, La/td9;->h(Lkotlin/jvm/functions/Function1;)V

    .line 145
    .line 146
    .line 147
    :cond_4
    return-void

    .line 148
    nop

    .line 149
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
