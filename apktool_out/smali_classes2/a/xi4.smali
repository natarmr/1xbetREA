.class public final synthetic La/xi4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/k4r;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/cj4;


# direct methods
.method public synthetic constructor <init>(La/cj4;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/xi4;->a:B

    iput-object p1, p0, La/xi4;->b:La/cj4;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final i(Landroid/os/Bundle;Ljava/lang/String;)V
    .locals 3

    .line 1
    iget-byte v0, p0, La/xi4;->a:B

    .line 2
    .line 3
    iget-object p0, p0, La/xi4;->b:La/cj4;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    sget-object v0, La/cj4;->U1:La/gfk0;

    .line 9
    .line 10
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    const-string v0, "KEY_LOGIN_QR_SCANNER_REQUEST"

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
    const-string p2, "KEY_LOGIN_QR_SCANNER_BUNDLE"

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
    invoke-virtual {p1, p2}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    if-eqz p1, :cond_2

    .line 35
    .line 36
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 37
    .line 38
    .line 39
    move-result p2

    .line 40
    if-nez p2, :cond_1

    .line 41
    .line 42
    goto :goto_0

    .line 43
    :cond_1
    invoke-virtual {p0}, La/cj4;->G0()La/k3t0;

    .line 44
    .line 45
    .line 46
    move-result-object p0

    .line 47
    new-instance p2, La/gi4;

    .line 48
    .line 49
    invoke-direct {p2, p1}, La/gi4;-><init>(Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    invoke-virtual {p0, p2}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 53
    .line 54
    .line 55
    :cond_2
    :goto_0
    return-void

    .line 56
    :pswitch_0
    sget-object v0, La/cj4;->U1:La/gfk0;

    .line 57
    .line 58
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 59
    .line 60
    .line 61
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 62
    .line 63
    const/16 v1, 0x21

    .line 64
    .line 65
    const/4 v2, 0x0

    .line 66
    if-lt v0, v1, :cond_3

    .line 67
    .line 68
    invoke-static {p1, p2}, La/c7;->i(Landroid/os/Bundle;Ljava/lang/String;)Ljava/io/Serializable;

    .line 69
    .line 70
    .line 71
    move-result-object p1

    .line 72
    goto :goto_1

    .line 73
    :cond_3
    invoke-virtual {p1, p2}, Landroid/os/Bundle;->getSerializable(Ljava/lang/String;)Ljava/io/Serializable;

    .line 74
    .line 75
    .line 76
    move-result-object p1

    .line 77
    instance-of p2, p1, La/rvs0;

    .line 78
    .line 79
    if-nez p2, :cond_4

    .line 80
    .line 81
    move-object p1, v2

    .line 82
    :cond_4
    check-cast p1, La/rvs0;

    .line 83
    .line 84
    :goto_1
    instance-of p2, p1, La/rvs0;

    .line 85
    .line 86
    if-eqz p2, :cond_5

    .line 87
    .line 88
    move-object v2, p1

    .line 89
    check-cast v2, La/rvs0;

    .line 90
    .line 91
    :cond_5
    if-eqz v2, :cond_6

    .line 92
    .line 93
    invoke-virtual {p0}, La/cj4;->G0()La/k3t0;

    .line 94
    .line 95
    .line 96
    move-result-object p0

    .line 97
    new-instance p1, La/mi4;

    .line 98
    .line 99
    invoke-direct {p1, v2}, La/mi4;-><init>(La/rvs0;)V

    .line 100
    .line 101
    .line 102
    invoke-virtual {p0, p1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 103
    .line 104
    .line 105
    :cond_6
    return-void

    .line 106
    nop

    .line 107
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
