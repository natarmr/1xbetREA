.class public final synthetic La/jl5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/k4r;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/ol5;


# direct methods
.method public synthetic constructor <init>(La/ol5;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/jl5;->a:B

    iput-object p1, p0, La/jl5;->b:La/ol5;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final i(Landroid/os/Bundle;Ljava/lang/String;)V
    .locals 3

    .line 1
    iget-byte v0, p0, La/jl5;->a:B

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/16 v2, 0x21

    .line 5
    .line 6
    iget-object p0, p0, La/jl5;->b:La/ol5;

    .line 7
    .line 8
    packed-switch v0, :pswitch_data_0

    .line 9
    .line 10
    .line 11
    sget-object v0, La/ol5;->R1:La/kl5;

    .line 12
    .line 13
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    const-string v0, "CHANGE_BALANCE_KEY"

    .line 17
    .line 18
    invoke-virtual {p2, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 19
    .line 20
    .line 21
    move-result p2

    .line 22
    if-nez p2, :cond_0

    .line 23
    .line 24
    goto :goto_2

    .line 25
    :cond_0
    const-string p2, "RESULT_ON_ITEM_SELECTED_LISTENER_KEY"

    .line 26
    .line 27
    invoke-virtual {p1, p2}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    .line 28
    .line 29
    .line 30
    move-result v0

    .line 31
    if-eqz v0, :cond_3

    .line 32
    .line 33
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 34
    .line 35
    if-lt v0, v2, :cond_1

    .line 36
    .line 37
    invoke-static {p1}, La/c7;->r(Landroid/os/Bundle;)Ljava/io/Serializable;

    .line 38
    .line 39
    .line 40
    move-result-object p1

    .line 41
    goto :goto_1

    .line 42
    :cond_1
    invoke-virtual {p1, p2}, Landroid/os/Bundle;->getSerializable(Ljava/lang/String;)Ljava/io/Serializable;

    .line 43
    .line 44
    .line 45
    move-result-object p1

    .line 46
    instance-of p2, p1, La/ql5;

    .line 47
    .line 48
    if-nez p2, :cond_2

    .line 49
    .line 50
    goto :goto_0

    .line 51
    :cond_2
    move-object v1, p1

    .line 52
    :goto_0
    move-object p1, v1

    .line 53
    check-cast p1, La/ql5;

    .line 54
    .line 55
    :goto_1
    check-cast p1, La/ql5;

    .line 56
    .line 57
    invoke-virtual {p0}, La/ol5;->G0()La/dk5;

    .line 58
    .line 59
    .line 60
    move-result-object p0

    .line 61
    invoke-virtual {p0, p1}, La/dk5;->E(La/ql5;)V

    .line 62
    .line 63
    .line 64
    :cond_3
    :goto_2
    return-void

    .line 65
    :pswitch_0
    sget-object v0, La/ol5;->R1:La/kl5;

    .line 66
    .line 67
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 68
    .line 69
    .line 70
    const-string p2, "NEGATIVE_CLICK_REQUEST_KEY"

    .line 71
    .line 72
    invoke-virtual {p1, p2}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    .line 73
    .line 74
    .line 75
    move-result p2

    .line 76
    if-eqz p2, :cond_4

    .line 77
    .line 78
    invoke-virtual {p0}, La/ol5;->G0()La/dk5;

    .line 79
    .line 80
    .line 81
    move-result-object p0

    .line 82
    invoke-virtual {p0}, La/dk5;->D()V

    .line 83
    .line 84
    .line 85
    goto :goto_5

    .line 86
    :cond_4
    const-string p2, "CHANGE_BALANCE_REQUEST_KEY"

    .line 87
    .line 88
    invoke-virtual {p1, p2}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;)Z

    .line 89
    .line 90
    .line 91
    move-result p2

    .line 92
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 93
    .line 94
    if-lt v0, v2, :cond_5

    .line 95
    .line 96
    invoke-static {p1}, La/c7;->C(Landroid/os/Bundle;)Ljava/io/Serializable;

    .line 97
    .line 98
    .line 99
    move-result-object p1

    .line 100
    goto :goto_4

    .line 101
    :cond_5
    const-string v0, "GET_BALANCE_REQUEST_KEY"

    .line 102
    .line 103
    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getSerializable(Ljava/lang/String;)Ljava/io/Serializable;

    .line 104
    .line 105
    .line 106
    move-result-object p1

    .line 107
    instance-of v0, p1, La/ql5;

    .line 108
    .line 109
    if-nez v0, :cond_6

    .line 110
    .line 111
    goto :goto_3

    .line 112
    :cond_6
    move-object v1, p1

    .line 113
    :goto_3
    move-object p1, v1

    .line 114
    check-cast p1, La/ql5;

    .line 115
    .line 116
    :goto_4
    check-cast p1, La/ql5;

    .line 117
    .line 118
    invoke-virtual {p0}, La/ol5;->G0()La/dk5;

    .line 119
    .line 120
    .line 121
    move-result-object v0

    .line 122
    invoke-virtual {v0, p1}, La/dk5;->w(La/ql5;)V

    .line 123
    .line 124
    .line 125
    invoke-virtual {p0}, La/ol5;->G0()La/dk5;

    .line 126
    .line 127
    .line 128
    move-result-object p0

    .line 129
    iget-object p0, p0, La/dk5;->E:La/zlt0;

    .line 130
    .line 131
    iget-object p0, p0, La/zlt0;->b:Ljava/lang/Object;

    .line 132
    .line 133
    check-cast p0, La/vlk;

    .line 134
    .line 135
    iget-object p0, p0, La/vlk;->a:La/vwb0;

    .line 136
    .line 137
    const-string p1, "changeBalance"

    .line 138
    .line 139
    invoke-virtual {p0, p1, p2}, La/vwb0;->e(Ljava/lang/String;Z)V

    .line 140
    .line 141
    .line 142
    :goto_5
    return-void

    .line 143
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
