.class public final synthetic La/b8s;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/g9s;


# direct methods
.method public synthetic constructor <init>(La/g9s;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/b8s;->a:B

    iput-object p1, p0, La/b8s;->b:La/g9s;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 12

    .line 1
    iget-byte v0, p0, La/b8s;->a:B

    .line 2
    .line 3
    iget-object p0, p0, La/b8s;->b:La/g9s;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    check-cast p1, La/k0w0;

    .line 9
    .line 10
    iget-object v0, p0, La/g9s;->N:La/yfm0;

    .line 11
    .line 12
    invoke-virtual {p0}, La/i3t0;->D()Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    check-cast v1, La/r7s;

    .line 17
    .line 18
    iget-wide v1, v1, La/r7s;->a:J

    .line 19
    .line 20
    invoke-static {v1, v2}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    invoke-virtual {p0}, La/i3t0;->D()Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    check-cast p0, La/r7s;

    .line 29
    .line 30
    iget-wide v2, p0, La/r7s;->e:J

    .line 31
    .line 32
    check-cast v0, La/zfm0;

    .line 33
    .line 34
    invoke-virtual {v0, v2, v3, v1}, La/zfm0;->a(JLjava/lang/String;)Lcom/github/terrakok/cicerone/androidx/FragmentScreen;

    .line 35
    .line 36
    .line 37
    move-result-object p0

    .line 38
    invoke-virtual {p1, p0}, La/k0w0;->k(La/m7h0;)V

    .line 39
    .line 40
    .line 41
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 42
    .line 43
    return-object p0

    .line 44
    :pswitch_0
    check-cast p1, La/k0w0;

    .line 45
    .line 46
    iget-object v0, p0, La/g9s;->O:La/zie0;

    .line 47
    .line 48
    invoke-virtual {p0}, La/i3t0;->D()Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    move-result-object p0

    .line 52
    check-cast p0, La/r7s;

    .line 53
    .line 54
    iget-wide v3, p0, La/r7s;->a:J

    .line 55
    .line 56
    iget-boolean v2, p0, La/r7s;->d:Z

    .line 57
    .line 58
    iget-object v1, p0, La/r7s;->g:Ljava/lang/Long;

    .line 59
    .line 60
    if-eqz v1, :cond_0

    .line 61
    .line 62
    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    .line 63
    .line 64
    .line 65
    move-result-wide v5

    .line 66
    :goto_0
    move-wide v9, v5

    .line 67
    goto :goto_1

    .line 68
    :cond_0
    const-wide/16 v5, -0x1

    .line 69
    .line 70
    goto :goto_0

    .line 71
    :goto_1
    sget-object v11, La/tef0;->c:La/tef0;

    .line 72
    .line 73
    sget-object v1, La/pb10;->c:La/xuz;

    .line 74
    .line 75
    iget-wide v5, p0, La/r7s;->e:J

    .line 76
    .line 77
    new-instance v1, Lorg/xplatform/related/api/presentation/RelatedParams;

    .line 78
    .line 79
    const-wide/16 v7, -0x1

    .line 80
    .line 81
    invoke-direct/range {v1 .. v11}, Lorg/xplatform/related/api/presentation/RelatedParams;-><init>(ZJJJJLa/tef0;)V

    .line 82
    .line 83
    .line 84
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 85
    .line 86
    .line 87
    new-instance p0, Lorg/xplatform/related/impl/navigation/RelatedScreenFactoryImpl$getScreen$1;

    .line 88
    .line 89
    invoke-direct {p0, v0, v1}, Lorg/xplatform/related/impl/navigation/RelatedScreenFactoryImpl$getScreen$1;-><init>(La/zie0;Lorg/xplatform/related/api/presentation/RelatedParams;)V

    .line 90
    .line 91
    .line 92
    invoke-virtual {p1, p0}, La/k0w0;->k(La/m7h0;)V

    .line 93
    .line 94
    .line 95
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 96
    .line 97
    return-object p0

    .line 98
    :pswitch_1
    check-cast p1, Ljava/lang/Integer;

    .line 99
    .line 100
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 101
    .line 102
    .line 103
    move-result p1

    .line 104
    new-instance v0, La/m7s;

    .line 105
    .line 106
    invoke-direct {v0, p1}, La/m7s;-><init>(I)V

    .line 107
    .line 108
    .line 109
    invoke-virtual {p0, v0}, La/i3t0;->G(Ljava/lang/Object;)V

    .line 110
    .line 111
    .line 112
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 113
    .line 114
    return-object p0

    .line 115
    :pswitch_2
    check-cast p1, La/k0w0;

    .line 116
    .line 117
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 118
    .line 119
    .line 120
    new-instance v0, La/yip;

    .line 121
    .line 122
    const/16 v1, 0x1b

    .line 123
    .line 124
    invoke-direct {v0, p0, v1}, La/yip;-><init>(Ljava/lang/Object;B)V

    .line 125
    .line 126
    .line 127
    new-instance p0, La/a1w0;

    .line 128
    .line 129
    invoke-direct {p0, v0}, La/a1w0;-><init>(Lkotlin/jvm/functions/Function0;)V

    .line 130
    .line 131
    .line 132
    invoke-virtual {p1, p0}, La/k0w0;->b(La/g1w0;)La/ikt0;

    .line 133
    .line 134
    .line 135
    move-result-object p0

    .line 136
    iget-object p0, p0, La/ikt0;->a:Ljava/lang/Object;

    .line 137
    .line 138
    check-cast p0, La/c8d;

    .line 139
    .line 140
    sget-object p1, La/cfx0;->o:La/bjk;

    .line 141
    .line 142
    new-instance v0, La/v7d;

    .line 143
    .line 144
    const/4 v1, 0x1

    .line 145
    invoke-direct {v0, v1, p1, p1}, La/v7d;-><init>(ZLa/bjk;La/bjk;)V

    .line 146
    .line 147
    .line 148
    iput-object v0, p0, La/c8d;->a:La/w7d;

    .line 149
    .line 150
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 151
    .line 152
    return-object p0

    .line 153
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
