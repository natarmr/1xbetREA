.class public final La/xze;
.super La/zx5;
.source "SourceFile"


# instance fields
.field public final synthetic o:B


# direct methods
.method public synthetic constructor <init>(Landroidx/fragment/app/e;La/glz;Ljava/util/List;B)V
    .locals 0

    .line 1
    iput-byte p4, p0, La/xze;->o:B

    invoke-direct {p0, p1, p2, p3}, La/zx5;-><init>(Landroidx/fragment/app/e;La/glz;Ljava/util/List;)V

    return-void
.end method


# virtual methods
.method public final B(I)Landroidx/fragment/app/Fragment;
    .locals 2

    .line 1
    iget-byte v0, p0, La/xze;->o:B

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    iget-object p0, p0, La/zx5;->n:Ljava/lang/Object;

    .line 5
    .line 6
    packed-switch v0, :pswitch_data_0

    .line 7
    .line 8
    .line 9
    check-cast p0, Ljava/util/ArrayList;

    .line 10
    .line 11
    invoke-virtual {p0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    check-cast p0, La/y6q;

    .line 16
    .line 17
    if-eqz p0, :cond_1

    .line 18
    .line 19
    instance-of p1, p0, La/x6q;

    .line 20
    .line 21
    const/4 v0, 0x1

    .line 22
    if-eqz p1, :cond_0

    .line 23
    .line 24
    sget-object p1, La/kvj0;->S1:La/eke0;

    .line 25
    .line 26
    check-cast p0, La/x6q;

    .line 27
    .line 28
    iget-object p0, p0, La/x6q;->a:Lorg/xplatform/feature/fin_bet/impl/domain/model/FinBetInfoModel;

    .line 29
    .line 30
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 31
    .line 32
    .line 33
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 34
    .line 35
    .line 36
    new-instance v1, La/kvj0;

    .line 37
    .line 38
    invoke-direct {v1}, La/kvj0;-><init>()V

    .line 39
    .line 40
    .line 41
    sget-object p1, La/kvj0;->U1:[La/iiy;

    .line 42
    .line 43
    aget-object p1, p1, v0

    .line 44
    .line 45
    iget-object v0, v1, La/kvj0;->R1:La/khf0;

    .line 46
    .line 47
    invoke-virtual {v0, v1, p1, p0}, La/khf0;->J(Landroidx/fragment/app/Fragment;La/iiy;Landroid/os/Parcelable;)V

    .line 48
    .line 49
    .line 50
    goto :goto_0

    .line 51
    :cond_0
    instance-of p1, p0, La/w6q;

    .line 52
    .line 53
    if-eqz p1, :cond_1

    .line 54
    .line 55
    sget-object p1, La/idc0;->S1:La/jh70;

    .line 56
    .line 57
    check-cast p0, La/w6q;

    .line 58
    .line 59
    iget-object p0, p0, La/w6q;->a:Lorg/xplatform/feature/fin_bet/impl/domain/model/FinBetInfoModel;

    .line 60
    .line 61
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 62
    .line 63
    .line 64
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 65
    .line 66
    .line 67
    new-instance v1, La/idc0;

    .line 68
    .line 69
    invoke-direct {v1}, La/idc0;-><init>()V

    .line 70
    .line 71
    .line 72
    sget-object p1, La/idc0;->U1:[La/iiy;

    .line 73
    .line 74
    aget-object p1, p1, v0

    .line 75
    .line 76
    iget-object v0, v1, La/idc0;->Q1:La/khf0;

    .line 77
    .line 78
    invoke-virtual {v0, v1, p1, p0}, La/khf0;->J(Landroidx/fragment/app/Fragment;La/iiy;Landroid/os/Parcelable;)V

    .line 79
    .line 80
    .line 81
    goto :goto_0

    .line 82
    :cond_1
    invoke-static {}, La/t9f;->b()V

    .line 83
    .line 84
    .line 85
    :goto_0
    return-object v1

    .line 86
    :pswitch_0
    check-cast p0, Ljava/util/ArrayList;

    .line 87
    .line 88
    invoke-virtual {p0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 89
    .line 90
    .line 91
    move-result-object p0

    .line 92
    check-cast p0, La/ko7;

    .line 93
    .line 94
    sget-object p1, La/jo7;->b:La/jo7;

    .line 95
    .line 96
    invoke-static {p0, p1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 97
    .line 98
    .line 99
    move-result p1

    .line 100
    if-eqz p1, :cond_2

    .line 101
    .line 102
    sget-object p0, La/gze;->S1:La/usd;

    .line 103
    .line 104
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 105
    .line 106
    .line 107
    new-instance v1, La/gze;

    .line 108
    .line 109
    invoke-direct {v1}, La/gze;-><init>()V

    .line 110
    .line 111
    .line 112
    goto :goto_1

    .line 113
    :cond_2
    sget-object p1, La/io7;->b:La/io7;

    .line 114
    .line 115
    invoke-static {p0, p1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 116
    .line 117
    .line 118
    move-result p1

    .line 119
    if-eqz p1, :cond_3

    .line 120
    .line 121
    sget-object p0, La/xye;->U1:La/nwd;

    .line 122
    .line 123
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 124
    .line 125
    .line 126
    new-instance v1, La/xye;

    .line 127
    .line 128
    invoke-direct {v1}, La/xye;-><init>()V

    .line 129
    .line 130
    .line 131
    goto :goto_1

    .line 132
    :cond_3
    instance-of p0, p0, La/ho7;

    .line 133
    .line 134
    if-eqz p0, :cond_4

    .line 135
    .line 136
    sget-object p0, La/rye;->S1:La/kwd;

    .line 137
    .line 138
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 139
    .line 140
    .line 141
    new-instance v1, La/rye;

    .line 142
    .line 143
    invoke-direct {v1}, La/rye;-><init>()V

    .line 144
    .line 145
    .line 146
    goto :goto_1

    .line 147
    :cond_4
    invoke-static {}, La/t9f;->b()V

    .line 148
    .line 149
    .line 150
    :goto_1
    return-object v1

    .line 151
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
