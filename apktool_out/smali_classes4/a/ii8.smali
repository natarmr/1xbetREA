.class public final synthetic La/ii8;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/k4r;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/ni8;


# direct methods
.method public synthetic constructor <init>(La/ni8;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/ii8;->a:B

    iput-object p1, p0, La/ii8;->b:La/ni8;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final i(Landroid/os/Bundle;Ljava/lang/String;)V
    .locals 3

    .line 1
    iget-byte v0, p0, La/ii8;->a:B

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/16 v2, 0x21

    .line 5
    .line 6
    iget-object p0, p0, La/ii8;->b:La/ni8;

    .line 7
    .line 8
    packed-switch v0, :pswitch_data_0

    .line 9
    .line 10
    .line 11
    sget-object v0, La/ni8;->U1:La/yk5;

    .line 12
    .line 13
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    const-string v0, "OneXGames.BONUS_NOT_USED_RESULT_KEY"

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
    const-string p2, "OneXGames.BONUS_NOT_USED_RESULT_DATA_KEY"

    .line 26
    .line 27
    invoke-virtual {p1, p2}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    .line 28
    .line 29
    .line 30
    move-result v0

    .line 31
    if-eqz v0, :cond_4

    .line 32
    .line 33
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 34
    .line 35
    if-lt v0, v2, :cond_1

    .line 36
    .line 37
    invoke-static {p1}, La/uq6;->v(Landroid/os/Bundle;)Ljava/io/Serializable;

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
    instance-of p2, p1, La/csr;

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
    check-cast p1, La/csr;

    .line 54
    .line 55
    :goto_1
    check-cast p1, La/csr;

    .line 56
    .line 57
    if-nez p1, :cond_3

    .line 58
    .line 59
    sget-object p1, La/csr;->e:La/csr;

    .line 60
    .line 61
    :cond_3
    invoke-virtual {p0}, La/ni8;->G0()La/k3t0;

    .line 62
    .line 63
    .line 64
    move-result-object p0

    .line 65
    new-instance p2, La/nh8;

    .line 66
    .line 67
    invoke-direct {p2, p1}, La/nh8;-><init>(La/csr;)V

    .line 68
    .line 69
    .line 70
    invoke-virtual {p0, p2}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 71
    .line 72
    .line 73
    :cond_4
    :goto_2
    return-void

    .line 74
    :pswitch_0
    sget-object v0, La/ni8;->U1:La/yk5;

    .line 75
    .line 76
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 77
    .line 78
    .line 79
    const-string v0, "SELECT_BALANCE_REQUEST_KEY"

    .line 80
    .line 81
    invoke-virtual {p2, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 82
    .line 83
    .line 84
    move-result p2

    .line 85
    if-nez p2, :cond_5

    .line 86
    .line 87
    goto :goto_5

    .line 88
    :cond_5
    sget p2, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 89
    .line 90
    if-lt p2, v2, :cond_6

    .line 91
    .line 92
    invoke-static {p1}, La/c7;->r(Landroid/os/Bundle;)Ljava/io/Serializable;

    .line 93
    .line 94
    .line 95
    move-result-object p1

    .line 96
    goto :goto_4

    .line 97
    :cond_6
    const-string p2, "RESULT_ON_ITEM_SELECTED_LISTENER_KEY"

    .line 98
    .line 99
    invoke-virtual {p1, p2}, Landroid/os/Bundle;->getSerializable(Ljava/lang/String;)Ljava/io/Serializable;

    .line 100
    .line 101
    .line 102
    move-result-object p1

    .line 103
    instance-of p2, p1, La/ql5;

    .line 104
    .line 105
    if-nez p2, :cond_7

    .line 106
    .line 107
    goto :goto_3

    .line 108
    :cond_7
    move-object v1, p1

    .line 109
    :goto_3
    move-object p1, v1

    .line 110
    check-cast p1, La/ql5;

    .line 111
    .line 112
    :goto_4
    check-cast p1, La/ql5;

    .line 113
    .line 114
    if-eqz p1, :cond_8

    .line 115
    .line 116
    invoke-virtual {p0}, La/ni8;->G0()La/k3t0;

    .line 117
    .line 118
    .line 119
    move-result-object p0

    .line 120
    new-instance p2, La/lh8;

    .line 121
    .line 122
    invoke-direct {p2, p1}, La/lh8;-><init>(La/ql5;)V

    .line 123
    .line 124
    .line 125
    invoke-virtual {p0, p2}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 126
    .line 127
    .line 128
    :cond_8
    :goto_5
    return-void

    .line 129
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
