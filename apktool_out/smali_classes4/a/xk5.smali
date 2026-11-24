.class public final synthetic La/xk5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/k4r;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/bl5;


# direct methods
.method public synthetic constructor <init>(La/bl5;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/xk5;->a:B

    iput-object p1, p0, La/xk5;->b:La/bl5;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final i(Landroid/os/Bundle;Ljava/lang/String;)V
    .locals 3

    .line 1
    iget-byte v0, p0, La/xk5;->a:B

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/16 v2, 0x21

    .line 5
    .line 6
    iget-object p0, p0, La/xk5;->b:La/bl5;

    .line 7
    .line 8
    packed-switch v0, :pswitch_data_0

    .line 9
    .line 10
    .line 11
    sget-object v0, La/bl5;->R1:La/yk5;

    .line 12
    .line 13
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    const-string p2, "NEGATIVE_CLICK_REQUEST_KEY"

    .line 17
    .line 18
    invoke-virtual {p1, p2}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    .line 19
    .line 20
    .line 21
    move-result p2

    .line 22
    if-eqz p2, :cond_0

    .line 23
    .line 24
    invoke-virtual {p0}, La/bl5;->G0()La/dk5;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    invoke-virtual {p0}, La/dk5;->D()V

    .line 29
    .line 30
    .line 31
    goto :goto_2

    .line 32
    :cond_0
    const-string p2, "CHANGE_BALANCE_REQUEST_KEY"

    .line 33
    .line 34
    invoke-virtual {p1, p2}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;)Z

    .line 35
    .line 36
    .line 37
    move-result p2

    .line 38
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 39
    .line 40
    if-lt v0, v2, :cond_1

    .line 41
    .line 42
    invoke-static {p1}, La/c7;->C(Landroid/os/Bundle;)Ljava/io/Serializable;

    .line 43
    .line 44
    .line 45
    move-result-object p1

    .line 46
    goto :goto_1

    .line 47
    :cond_1
    const-string v0, "GET_BALANCE_REQUEST_KEY"

    .line 48
    .line 49
    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getSerializable(Ljava/lang/String;)Ljava/io/Serializable;

    .line 50
    .line 51
    .line 52
    move-result-object p1

    .line 53
    instance-of v0, p1, La/ql5;

    .line 54
    .line 55
    if-nez v0, :cond_2

    .line 56
    .line 57
    goto :goto_0

    .line 58
    :cond_2
    move-object v1, p1

    .line 59
    :goto_0
    move-object p1, v1

    .line 60
    check-cast p1, La/ql5;

    .line 61
    .line 62
    :goto_1
    check-cast p1, La/ql5;

    .line 63
    .line 64
    invoke-virtual {p0}, La/bl5;->G0()La/dk5;

    .line 65
    .line 66
    .line 67
    move-result-object v0

    .line 68
    invoke-virtual {v0, p1}, La/dk5;->w(La/ql5;)V

    .line 69
    .line 70
    .line 71
    invoke-virtual {p0}, La/bl5;->G0()La/dk5;

    .line 72
    .line 73
    .line 74
    move-result-object p0

    .line 75
    iget-object p0, p0, La/dk5;->E:La/zlt0;

    .line 76
    .line 77
    iget-object p0, p0, La/zlt0;->b:Ljava/lang/Object;

    .line 78
    .line 79
    check-cast p0, La/vlk;

    .line 80
    .line 81
    iget-object p0, p0, La/vlk;->a:La/vwb0;

    .line 82
    .line 83
    const-string p1, "changeBalance"

    .line 84
    .line 85
    invoke-virtual {p0, p1, p2}, La/vwb0;->e(Ljava/lang/String;Z)V

    .line 86
    .line 87
    .line 88
    :goto_2
    return-void

    .line 89
    :pswitch_0
    sget-object v0, La/bl5;->R1:La/yk5;

    .line 90
    .line 91
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 92
    .line 93
    .line 94
    const-string v0, "CHANGE_BALANCE_KEY"

    .line 95
    .line 96
    invoke-virtual {p2, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 97
    .line 98
    .line 99
    move-result p2

    .line 100
    if-nez p2, :cond_3

    .line 101
    .line 102
    goto :goto_5

    .line 103
    :cond_3
    const-string p2, "RESULT_ON_ITEM_SELECTED_LISTENER_KEY"

    .line 104
    .line 105
    invoke-virtual {p1, p2}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    .line 106
    .line 107
    .line 108
    move-result v0

    .line 109
    if-eqz v0, :cond_6

    .line 110
    .line 111
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 112
    .line 113
    if-lt v0, v2, :cond_4

    .line 114
    .line 115
    invoke-static {p1}, La/c7;->r(Landroid/os/Bundle;)Ljava/io/Serializable;

    .line 116
    .line 117
    .line 118
    move-result-object p1

    .line 119
    goto :goto_4

    .line 120
    :cond_4
    invoke-virtual {p1, p2}, Landroid/os/Bundle;->getSerializable(Ljava/lang/String;)Ljava/io/Serializable;

    .line 121
    .line 122
    .line 123
    move-result-object p1

    .line 124
    instance-of p2, p1, La/ql5;

    .line 125
    .line 126
    if-nez p2, :cond_5

    .line 127
    .line 128
    goto :goto_3

    .line 129
    :cond_5
    move-object v1, p1

    .line 130
    :goto_3
    move-object p1, v1

    .line 131
    check-cast p1, La/ql5;

    .line 132
    .line 133
    :goto_4
    check-cast p1, La/ql5;

    .line 134
    .line 135
    invoke-virtual {p0}, La/bl5;->G0()La/dk5;

    .line 136
    .line 137
    .line 138
    move-result-object p0

    .line 139
    invoke-virtual {p0, p1}, La/dk5;->E(La/ql5;)V

    .line 140
    .line 141
    .line 142
    :cond_6
    :goto_5
    return-void

    .line 143
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
