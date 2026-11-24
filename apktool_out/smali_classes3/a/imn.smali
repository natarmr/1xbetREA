.class public final synthetic La/imn;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/k4r;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/kmn;


# direct methods
.method public synthetic constructor <init>(La/kmn;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/imn;->a:B

    iput-object p1, p0, La/imn;->b:La/kmn;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final i(Landroid/os/Bundle;Ljava/lang/String;)V
    .locals 2

    .line 1
    iget-byte v0, p0, La/imn;->a:B

    .line 2
    .line 3
    iget-object p0, p0, La/imn;->b:La/kmn;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    sget-object v0, La/kmn;->Q1:La/xak;

    .line 9
    .line 10
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    const-string v0, "REQUEST_SELECT_BET_SYSTEM_TYPE_DIALOG_KEY"

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
    goto :goto_0

    .line 22
    :cond_0
    const-string p2, "SELECT_BET_SYSTEM_TYPE_DIALOG_RESULT_KEY"

    .line 23
    .line 24
    invoke-virtual {p1, p2}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    if-eqz v0, :cond_1

    .line 29
    .line 30
    invoke-virtual {p1, p2}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;)I

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    invoke-virtual {p0}, La/kmn;->G0()La/k3t0;

    .line 35
    .line 36
    .line 37
    move-result-object p0

    .line 38
    new-instance v1, La/ukn;

    .line 39
    .line 40
    invoke-direct {v1, v0}, La/ukn;-><init>(I)V

    .line 41
    .line 42
    .line 43
    invoke-virtual {p0, v1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 44
    .line 45
    .line 46
    invoke-virtual {p1, p2}, Landroid/os/Bundle;->remove(Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    :cond_1
    :goto_0
    return-void

    .line 50
    :pswitch_0
    sget-object v0, La/kmn;->Q1:La/xak;

    .line 51
    .line 52
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 53
    .line 54
    .line 55
    const-string v0, "REQUEST_SELECT_COUPON_TYPE_DIALOG_KEY"

    .line 56
    .line 57
    invoke-virtual {p2, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 58
    .line 59
    .line 60
    move-result p2

    .line 61
    if-nez p2, :cond_2

    .line 62
    .line 63
    goto :goto_1

    .line 64
    :cond_2
    const-string p2, "SELECT_COUPON_TYPE_DIALOG_RESULT_KEY"

    .line 65
    .line 66
    invoke-virtual {p1, p2}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    .line 67
    .line 68
    .line 69
    move-result v0

    .line 70
    if-eqz v0, :cond_3

    .line 71
    .line 72
    invoke-virtual {p1, p2}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;)I

    .line 73
    .line 74
    .line 75
    move-result v0

    .line 76
    invoke-virtual {p0}, La/kmn;->G0()La/k3t0;

    .line 77
    .line 78
    .line 79
    move-result-object p0

    .line 80
    new-instance v1, La/qkn;

    .line 81
    .line 82
    invoke-direct {v1, v0}, La/qkn;-><init>(I)V

    .line 83
    .line 84
    .line 85
    invoke-virtual {p0, v1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 86
    .line 87
    .line 88
    invoke-virtual {p1, p2}, Landroid/os/Bundle;->remove(Ljava/lang/String;)V

    .line 89
    .line 90
    .line 91
    :cond_3
    :goto_1
    return-void

    .line 92
    :pswitch_1
    sget-object v0, La/kmn;->Q1:La/xak;

    .line 93
    .line 94
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 95
    .line 96
    .line 97
    const-string v0, "REQUEST_SELECT_COEF_CHECK_TYPE_DIALOG_KEY"

    .line 98
    .line 99
    invoke-virtual {p2, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 100
    .line 101
    .line 102
    move-result p2

    .line 103
    if-nez p2, :cond_4

    .line 104
    .line 105
    goto :goto_2

    .line 106
    :cond_4
    const-string p2, "SELECT_COEF_CHECK_TYPE_DIALOG_RESULT_KEY"

    .line 107
    .line 108
    invoke-virtual {p1, p2}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    .line 109
    .line 110
    .line 111
    move-result v0

    .line 112
    if-eqz v0, :cond_5

    .line 113
    .line 114
    invoke-virtual {p1, p2}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;)I

    .line 115
    .line 116
    .line 117
    move-result v0

    .line 118
    invoke-virtual {p0}, La/kmn;->G0()La/k3t0;

    .line 119
    .line 120
    .line 121
    move-result-object p0

    .line 122
    new-instance v1, La/pkn;

    .line 123
    .line 124
    invoke-direct {v1, v0}, La/pkn;-><init>(I)V

    .line 125
    .line 126
    .line 127
    invoke-virtual {p0, v1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 128
    .line 129
    .line 130
    invoke-virtual {p1, p2}, Landroid/os/Bundle;->remove(Ljava/lang/String;)V

    .line 131
    .line 132
    .line 133
    :cond_5
    :goto_2
    return-void

    .line 134
    nop

    .line 135
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
