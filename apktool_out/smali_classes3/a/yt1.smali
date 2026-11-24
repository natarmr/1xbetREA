.class public final synthetic La/yt1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/k4r;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/au1;


# direct methods
.method public synthetic constructor <init>(La/au1;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/yt1;->a:B

    iput-object p1, p0, La/yt1;->b:La/au1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final i(Landroid/os/Bundle;Ljava/lang/String;)V
    .locals 3

    .line 1
    iget-byte v0, p0, La/yt1;->a:B

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/16 v2, 0x21

    .line 5
    .line 6
    iget-object p0, p0, La/yt1;->b:La/au1;

    .line 7
    .line 8
    packed-switch v0, :pswitch_data_0

    .line 9
    .line 10
    .line 11
    sget-object p1, La/au1;->Z1:La/jdk0;

    .line 12
    .line 13
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    invoke-virtual {p0}, La/au1;->G0()La/k3t0;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    sget-object p1, La/js1;->a:La/js1;

    .line 21
    .line 22
    invoke-virtual {p0, p1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 23
    .line 24
    .line 25
    return-void

    .line 26
    :pswitch_0
    sget-object v0, La/au1;->Z1:La/jdk0;

    .line 27
    .line 28
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 29
    .line 30
    .line 31
    sget p2, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 32
    .line 33
    if-lt p2, v2, :cond_0

    .line 34
    .line 35
    invoke-static {p1}, La/e4e0;->q(Landroid/os/Bundle;)Ljava/io/Serializable;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    goto :goto_1

    .line 40
    :cond_0
    const-string p2, "RESULT_TOURNAMENT_PAGE"

    .line 41
    .line 42
    invoke-virtual {p1, p2}, Landroid/os/Bundle;->getSerializable(Ljava/lang/String;)Ljava/io/Serializable;

    .line 43
    .line 44
    .line 45
    move-result-object p1

    .line 46
    instance-of p2, p1, La/s9s0;

    .line 47
    .line 48
    if-nez p2, :cond_1

    .line 49
    .line 50
    goto :goto_0

    .line 51
    :cond_1
    move-object v1, p1

    .line 52
    :goto_0
    move-object p1, v1

    .line 53
    check-cast p1, La/s9s0;

    .line 54
    .line 55
    :goto_1
    check-cast p1, La/s9s0;

    .line 56
    .line 57
    if-eqz p1, :cond_2

    .line 58
    .line 59
    invoke-virtual {p0}, La/au1;->G0()La/k3t0;

    .line 60
    .line 61
    .line 62
    move-result-object p0

    .line 63
    new-instance p2, La/qs1;

    .line 64
    .line 65
    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    .line 66
    .line 67
    .line 68
    move-result p1

    .line 69
    invoke-direct {p2, p1}, La/qs1;-><init>(I)V

    .line 70
    .line 71
    .line 72
    invoke-virtual {p0, p2}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 73
    .line 74
    .line 75
    :cond_2
    return-void

    .line 76
    :pswitch_1
    sget-object v0, La/au1;->Z1:La/jdk0;

    .line 77
    .line 78
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 79
    .line 80
    .line 81
    sget p2, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 82
    .line 83
    if-lt p2, v2, :cond_3

    .line 84
    .line 85
    invoke-static {p1}, La/c7;->A(Landroid/os/Bundle;)Ljava/io/Serializable;

    .line 86
    .line 87
    .line 88
    move-result-object p1

    .line 89
    goto :goto_3

    .line 90
    :cond_3
    const-string p2, "TOURNAMENT_PAGE_ITEM"

    .line 91
    .line 92
    invoke-virtual {p1, p2}, Landroid/os/Bundle;->getSerializable(Ljava/lang/String;)Ljava/io/Serializable;

    .line 93
    .line 94
    .line 95
    move-result-object p1

    .line 96
    instance-of p2, p1, La/s9s0;

    .line 97
    .line 98
    if-nez p2, :cond_4

    .line 99
    .line 100
    goto :goto_2

    .line 101
    :cond_4
    move-object v1, p1

    .line 102
    :goto_2
    move-object p1, v1

    .line 103
    check-cast p1, La/s9s0;

    .line 104
    .line 105
    :goto_3
    check-cast p1, La/s9s0;

    .line 106
    .line 107
    if-eqz p1, :cond_5

    .line 108
    .line 109
    invoke-virtual {p0}, La/au1;->G0()La/k3t0;

    .line 110
    .line 111
    .line 112
    move-result-object p0

    .line 113
    new-instance p2, La/qs1;

    .line 114
    .line 115
    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    .line 116
    .line 117
    .line 118
    move-result p1

    .line 119
    invoke-direct {p2, p1}, La/qs1;-><init>(I)V

    .line 120
    .line 121
    .line 122
    invoke-virtual {p0, p2}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 123
    .line 124
    .line 125
    :cond_5
    return-void

    .line 126
    nop

    .line 127
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
