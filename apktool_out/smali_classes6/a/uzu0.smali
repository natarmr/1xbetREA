.class public final synthetic La/uzu0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/k4r;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/xzu0;


# direct methods
.method public synthetic constructor <init>(La/xzu0;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/uzu0;->a:B

    iput-object p1, p0, La/uzu0;->b:La/xzu0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final i(Landroid/os/Bundle;Ljava/lang/String;)V
    .locals 1

    .line 1
    iget-byte v0, p0, La/uzu0;->a:B

    .line 2
    .line 3
    iget-object p0, p0, La/uzu0;->b:La/xzu0;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    sget-object v0, La/xzu0;->S1:La/uxs0;

    .line 9
    .line 10
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    const-string p2, "SELECT_ACTIVE_ACTION_KEY"

    .line 14
    .line 15
    invoke-virtual {p1, p2}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    if-eqz v0, :cond_0

    .line 20
    .line 21
    invoke-virtual {p1, p2}, Landroid/os/BaseBundle;->getLong(Ljava/lang/String;)J

    .line 22
    .line 23
    .line 24
    move-result-wide p1

    .line 25
    invoke-virtual {p0}, La/xzu0;->G0()La/k3t0;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    new-instance v0, La/hzu0;

    .line 30
    .line 31
    invoke-direct {v0, p1, p2}, La/hzu0;-><init>(J)V

    .line 32
    .line 33
    .line 34
    invoke-virtual {p0, v0}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 35
    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_0
    const-string p2, "SELECT_REMOVE_ACTION_KEY"

    .line 39
    .line 40
    invoke-virtual {p1, p2}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    .line 41
    .line 42
    .line 43
    move-result v0

    .line 44
    if-eqz v0, :cond_1

    .line 45
    .line 46
    invoke-virtual {p1, p2}, Landroid/os/BaseBundle;->getLong(Ljava/lang/String;)J

    .line 47
    .line 48
    .line 49
    move-result-wide p1

    .line 50
    invoke-virtual {p0}, La/xzu0;->G0()La/k3t0;

    .line 51
    .line 52
    .line 53
    move-result-object p0

    .line 54
    new-instance v0, La/ozu0;

    .line 55
    .line 56
    invoke-direct {v0, p1, p2}, La/ozu0;-><init>(J)V

    .line 57
    .line 58
    .line 59
    invoke-virtual {p0, v0}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 60
    .line 61
    .line 62
    :cond_1
    :goto_0
    return-void

    .line 63
    :pswitch_0
    sget-object v0, La/xzu0;->S1:La/uxs0;

    .line 64
    .line 65
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 66
    .line 67
    .line 68
    const-string p2, "NEGATIVE_CLICK_REQUEST_KEY"

    .line 69
    .line 70
    invoke-virtual {p1, p2}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    .line 71
    .line 72
    .line 73
    move-result p2

    .line 74
    if-nez p2, :cond_2

    .line 75
    .line 76
    const-string p2, "CHANGE_BALANCE_REQUEST_KEY"

    .line 77
    .line 78
    invoke-virtual {p1, p2}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;)Z

    .line 79
    .line 80
    .line 81
    move-result p1

    .line 82
    invoke-virtual {p0}, La/xzu0;->G0()La/k3t0;

    .line 83
    .line 84
    .line 85
    move-result-object p0

    .line 86
    new-instance p2, La/lzu0;

    .line 87
    .line 88
    invoke-direct {p2, p1}, La/lzu0;-><init>(Z)V

    .line 89
    .line 90
    .line 91
    invoke-virtual {p0, p2}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 92
    .line 93
    .line 94
    :cond_2
    return-void

    .line 95
    :pswitch_1
    sget-object p1, La/xzu0;->S1:La/uxs0;

    .line 96
    .line 97
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 98
    .line 99
    .line 100
    invoke-virtual {p0}, La/xzu0;->G0()La/k3t0;

    .line 101
    .line 102
    .line 103
    move-result-object p0

    .line 104
    new-instance p1, La/fzu0;

    .line 105
    .line 106
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 107
    .line 108
    .line 109
    invoke-virtual {p0, p1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 110
    .line 111
    .line 112
    return-void

    .line 113
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
