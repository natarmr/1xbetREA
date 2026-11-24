.class public final La/eo6;
.super La/c2;
.source "SourceFile"


# instance fields
.field public final synthetic c:B

.field public final synthetic d:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/eo6;->c:B

    iput-object p1, p0, La/eo6;->d:Ljava/lang/Object;

    const/16 p1, 0x8

    invoke-direct {p0, p1}, La/c2;-><init>(B)V

    return-void
.end method


# virtual methods
.method public final q(I)I
    .locals 3

    .line 1
    iget-byte v0, p0, La/eo6;->c:B

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    const/4 v2, 0x2

    .line 5
    iget-object p0, p0, La/eo6;->d:Ljava/lang/Object;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    check-cast p0, La/w4b0;

    .line 11
    .line 12
    sget-object v0, La/w4b0;->Q1:La/nh70;

    .line 13
    .line 14
    invoke-virtual {p0}, La/w4b0;->G0()La/s4b0;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    iget-object p0, p0, La/zz3;->e:La/yz3;

    .line 19
    .line 20
    iget-object p0, p0, La/yz3;->f:Ljava/util/List;

    .line 21
    .line 22
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 23
    .line 24
    .line 25
    invoke-static {p1, p0}, Lkotlin/collections/CollectionsKt;->W(ILjava/util/List;)Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    check-cast p0, La/p6t0;

    .line 30
    .line 31
    instance-of p0, p0, La/ghj;

    .line 32
    .line 33
    if-eqz p0, :cond_0

    .line 34
    .line 35
    move v1, v2

    .line 36
    :cond_0
    return v1

    .line 37
    :pswitch_0
    check-cast p0, La/qn50;

    .line 38
    .line 39
    iget-object p0, p0, La/qn50;->c:Ljava/util/ArrayList;

    .line 40
    .line 41
    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    .line 42
    .line 43
    .line 44
    move-result p0

    .line 45
    if-eq p0, v1, :cond_1

    .line 46
    .line 47
    goto :goto_0

    .line 48
    :cond_1
    move v1, v2

    .line 49
    :goto_0
    return v1

    .line 50
    :pswitch_1
    check-cast p0, Lorg/xplatform/favorites/impl/presentation/category/e;

    .line 51
    .line 52
    sget-object v0, Lorg/xplatform/favorites/impl/presentation/category/e;->V1:La/sek;

    .line 53
    .line 54
    iget-object p0, p0, Lorg/xplatform/favorites/impl/presentation/category/e;->R1:La/n0o0;

    .line 55
    .line 56
    invoke-virtual {p0}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    move-result-object p0

    .line 60
    check-cast p0, La/y3p;

    .line 61
    .line 62
    iget-object p0, p0, La/zz3;->e:La/yz3;

    .line 63
    .line 64
    iget-object p0, p0, La/yz3;->f:Ljava/util/List;

    .line 65
    .line 66
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 67
    .line 68
    .line 69
    invoke-static {p1, p0}, Lkotlin/collections/CollectionsKt;->W(ILjava/util/List;)Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    move-result-object p0

    .line 73
    check-cast p0, La/p6t0;

    .line 74
    .line 75
    if-nez p0, :cond_2

    .line 76
    .line 77
    goto :goto_1

    .line 78
    :cond_2
    instance-of p0, p0, La/b0s;

    .line 79
    .line 80
    if-eqz p0, :cond_3

    .line 81
    .line 82
    goto :goto_2

    .line 83
    :cond_3
    :goto_1
    move v1, v2

    .line 84
    :goto_2
    return v1

    .line 85
    :pswitch_2
    check-cast p0, La/fo6;

    .line 86
    .line 87
    sget-object v0, La/fo6;->W1:La/kj5;

    .line 88
    .line 89
    iget-object p0, p0, La/fo6;->V1:La/a8z;

    .line 90
    .line 91
    invoke-interface {p0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 92
    .line 93
    .line 94
    move-result-object p0

    .line 95
    check-cast p0, La/xv6;

    .line 96
    .line 97
    iget-object p0, p0, La/zz3;->e:La/yz3;

    .line 98
    .line 99
    iget-object p0, p0, La/yz3;->f:Ljava/util/List;

    .line 100
    .line 101
    invoke-interface {p0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 102
    .line 103
    .line 104
    move-result-object p0

    .line 105
    check-cast p0, La/p6t0;

    .line 106
    .line 107
    if-nez p0, :cond_4

    .line 108
    .line 109
    goto :goto_4

    .line 110
    :cond_4
    instance-of p1, p0, La/npp0;

    .line 111
    .line 112
    if-eqz p1, :cond_5

    .line 113
    .line 114
    goto :goto_3

    .line 115
    :cond_5
    instance-of p1, p0, La/gpp0;

    .line 116
    .line 117
    if-eqz p1, :cond_6

    .line 118
    .line 119
    goto :goto_3

    .line 120
    :cond_6
    instance-of p1, p0, La/r07;

    .line 121
    .line 122
    if-eqz p1, :cond_7

    .line 123
    .line 124
    :goto_3
    const/4 v2, 0x6

    .line 125
    goto :goto_5

    .line 126
    :cond_7
    instance-of p1, p0, La/ah;

    .line 127
    .line 128
    if-eqz p1, :cond_8

    .line 129
    .line 130
    goto :goto_5

    .line 131
    :cond_8
    instance-of p1, p0, La/de7;

    .line 132
    .line 133
    if-eqz p1, :cond_9

    .line 134
    .line 135
    check-cast p0, La/de7;

    .line 136
    .line 137
    iget-byte v2, p0, La/de7;->g:B

    .line 138
    .line 139
    goto :goto_5

    .line 140
    :cond_9
    :goto_4
    const/4 v2, 0x3

    .line 141
    :goto_5
    return v2

    .line 142
    nop

    .line 143
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
