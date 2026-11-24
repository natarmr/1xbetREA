.class public final synthetic La/jgf0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/k4r;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/lgf0;


# direct methods
.method public synthetic constructor <init>(La/lgf0;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/jgf0;->a:B

    iput-object p1, p0, La/jgf0;->b:La/lgf0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final i(Landroid/os/Bundle;Ljava/lang/String;)V
    .locals 4

    .line 1
    iget-byte v0, p0, La/jgf0;->a:B

    .line 2
    .line 3
    iget-object p0, p0, La/jgf0;->b:La/lgf0;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    sget-object p1, La/lgf0;->N1:La/gle0;

    .line 9
    .line 10
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    invoke-virtual {p2}, Ljava/lang/String;->hashCode()I

    .line 14
    .line 15
    .line 16
    move-result p1

    .line 17
    const v0, -0x1a6c55d7

    .line 18
    .line 19
    .line 20
    if-eq p1, v0, :cond_0

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_0
    const-string p1, "CHANGE_VALUE_BS_DIALOG_REQUEST_KEY"

    .line 24
    .line 25
    invoke-virtual {p2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 26
    .line 27
    .line 28
    move-result p1

    .line 29
    if-eqz p1, :cond_1

    .line 30
    .line 31
    invoke-virtual {p0}, La/lgf0;->G0()La/k3t0;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    sget-object p1, La/dgf0;->a:La/dgf0;

    .line 36
    .line 37
    invoke-virtual {p0, p1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 38
    .line 39
    .line 40
    :cond_1
    :goto_0
    return-void

    .line 41
    :pswitch_0
    sget-object v0, La/lgf0;->N1:La/gle0;

    .line 42
    .line 43
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 44
    .line 45
    .line 46
    invoke-virtual {p2}, Ljava/lang/String;->hashCode()I

    .line 47
    .line 48
    .line 49
    move-result v0

    .line 50
    const v1, 0x39350142

    .line 51
    .line 52
    .line 53
    if-eq v0, v1, :cond_2

    .line 54
    .line 55
    goto :goto_4

    .line 56
    :cond_2
    const-string v0, "FILTERS_BS_DIALOG_REQUEST_KEY"

    .line 57
    .line 58
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 59
    .line 60
    .line 61
    move-result p2

    .line 62
    if-eqz p2, :cond_9

    .line 63
    .line 64
    sget p2, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 65
    .line 66
    const/4 v0, 0x0

    .line 67
    const/16 v1, 0x21

    .line 68
    .line 69
    if-lt p2, v1, :cond_3

    .line 70
    .line 71
    invoke-static {p1}, La/e4e0;->k(Landroid/os/Bundle;)Ljava/io/Serializable;

    .line 72
    .line 73
    .line 74
    move-result-object v2

    .line 75
    goto :goto_1

    .line 76
    :cond_3
    const-string v2, "KEYS_FILTER_TYPE"

    .line 77
    .line 78
    invoke-virtual {p1, v2}, Landroid/os/Bundle;->getSerializable(Ljava/lang/String;)Ljava/io/Serializable;

    .line 79
    .line 80
    .line 81
    move-result-object v2

    .line 82
    instance-of v3, v2, La/nmy;

    .line 83
    .line 84
    if-nez v3, :cond_4

    .line 85
    .line 86
    move-object v2, v0

    .line 87
    :cond_4
    check-cast v2, La/nmy;

    .line 88
    .line 89
    :goto_1
    check-cast v2, La/nmy;

    .line 90
    .line 91
    if-nez v2, :cond_5

    .line 92
    .line 93
    sget-object v2, La/nmy;->c:La/nmy;

    .line 94
    .line 95
    :cond_5
    if-lt p2, v1, :cond_6

    .line 96
    .line 97
    invoke-static {p1}, La/e4e0;->n(Landroid/os/Bundle;)Ljava/io/Serializable;

    .line 98
    .line 99
    .line 100
    move-result-object p1

    .line 101
    goto :goto_3

    .line 102
    :cond_6
    const-string p2, "KEYS_SORT_TYPE"

    .line 103
    .line 104
    invoke-virtual {p1, p2}, Landroid/os/Bundle;->getSerializable(Ljava/lang/String;)Ljava/io/Serializable;

    .line 105
    .line 106
    .line 107
    move-result-object p1

    .line 108
    instance-of p2, p1, La/cny;

    .line 109
    .line 110
    if-nez p2, :cond_7

    .line 111
    .line 112
    goto :goto_2

    .line 113
    :cond_7
    move-object v0, p1

    .line 114
    :goto_2
    move-object p1, v0

    .line 115
    check-cast p1, La/cny;

    .line 116
    .line 117
    :goto_3
    check-cast p1, La/cny;

    .line 118
    .line 119
    if-nez p1, :cond_8

    .line 120
    .line 121
    sget-object p1, La/cny;->c:La/cny;

    .line 122
    .line 123
    :cond_8
    invoke-virtual {p0}, La/lgf0;->G0()La/k3t0;

    .line 124
    .line 125
    .line 126
    move-result-object p0

    .line 127
    new-instance p2, La/cgf0;

    .line 128
    .line 129
    invoke-direct {p2, v2, p1}, La/cgf0;-><init>(La/nmy;La/cny;)V

    .line 130
    .line 131
    .line 132
    invoke-virtual {p0, p2}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 133
    .line 134
    .line 135
    :cond_9
    :goto_4
    return-void

    .line 136
    nop

    .line 137
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
