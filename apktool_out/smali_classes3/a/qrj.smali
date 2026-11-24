.class public final synthetic La/qrj;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/zrj;


# direct methods
.method public synthetic constructor <init>(La/zrj;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/qrj;->a:B

    iput-object p1, p0, La/qrj;->b:La/zrj;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    .line 1
    iget-byte v0, p0, La/qrj;->a:B

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    const/4 v2, 0x2

    .line 5
    iget-object p0, p0, La/qrj;->b:La/zrj;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    check-cast p1, La/i1w0;

    .line 11
    .line 12
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    new-instance v0, La/x2i;

    .line 16
    .line 17
    const/16 v1, 0x13

    .line 18
    .line 19
    invoke-direct {v0, p0, v1}, La/x2i;-><init>(La/zrj;B)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {p1, v0}, La/i1w0;->d(Lkotlin/jvm/functions/Function1;)V

    .line 23
    .line 24
    .line 25
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 26
    .line 27
    return-object p0

    .line 28
    :pswitch_0
    check-cast p1, La/i1w0;

    .line 29
    .line 30
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 31
    .line 32
    .line 33
    new-instance v0, La/x2i;

    .line 34
    .line 35
    const/16 v1, 0x15

    .line 36
    .line 37
    invoke-direct {v0, p0, v1}, La/x2i;-><init>(La/zrj;B)V

    .line 38
    .line 39
    .line 40
    invoke-virtual {p1, v0}, La/i1w0;->d(Lkotlin/jvm/functions/Function1;)V

    .line 41
    .line 42
    .line 43
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 44
    .line 45
    return-object p0

    .line 46
    :pswitch_1
    check-cast p1, La/k0w0;

    .line 47
    .line 48
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 49
    .line 50
    .line 51
    iget-object v0, p0, La/zrj;->k:La/vqc;

    .line 52
    .line 53
    new-instance v3, Lorg/xplatform/cyber/section/api/home/CyberHomeParams;

    .line 54
    .line 55
    sget-object v4, Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage$Real;->INSTANCE:Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage$Real;

    .line 56
    .line 57
    sget-object v5, Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesParentSectionModel$FromSection;->INSTANCE:Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesParentSectionModel$FromSection;

    .line 58
    .line 59
    invoke-direct {v3, v4, v5}, Lorg/xplatform/cyber/section/api/home/CyberHomeParams;-><init>(Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesParentSectionModel;)V

    .line 60
    .line 61
    .line 62
    new-instance v4, Lorg/xplatform/cyber/section/impl/navigation/CyberGamesScreenFactoryImpl$homeScreen$1;

    .line 63
    .line 64
    invoke-direct {v4, v0, v3}, Lorg/xplatform/cyber/section/impl/navigation/CyberGamesScreenFactoryImpl$homeScreen$1;-><init>(La/vqc;Lorg/xplatform/cyber/section/api/home/CyberHomeParams;)V

    .line 65
    .line 66
    .line 67
    iget-object p0, p0, La/zrj;->k:La/vqc;

    .line 68
    .line 69
    new-instance v0, Lorg/xplatform/cyber/section/impl/navigation/CyberGamesScreenFactoryImpl$hltvAwardsScreen$1;

    .line 70
    .line 71
    invoke-direct {v0, p0}, Lorg/xplatform/cyber/section/impl/navigation/CyberGamesScreenFactoryImpl$hltvAwardsScreen$1;-><init>(La/vqc;)V

    .line 72
    .line 73
    .line 74
    new-array p0, v2, [La/m7h0;

    .line 75
    .line 76
    const/4 v2, 0x0

    .line 77
    aput-object v4, p0, v2

    .line 78
    .line 79
    aput-object v0, p0, v1

    .line 80
    .line 81
    invoke-virtual {p1, p0}, La/k0w0;->i([La/m7h0;)V

    .line 82
    .line 83
    .line 84
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 85
    .line 86
    return-object p0

    .line 87
    :pswitch_2
    check-cast p1, La/i1w0;

    .line 88
    .line 89
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 90
    .line 91
    .line 92
    new-instance v0, La/qrj;

    .line 93
    .line 94
    const/4 v1, 0x4

    .line 95
    invoke-direct {v0, p0, v1}, La/qrj;-><init>(La/zrj;B)V

    .line 96
    .line 97
    .line 98
    invoke-virtual {p1, v0}, La/i1w0;->d(Lkotlin/jvm/functions/Function1;)V

    .line 99
    .line 100
    .line 101
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 102
    .line 103
    return-object p0

    .line 104
    :pswitch_3
    check-cast p1, La/k0w0;

    .line 105
    .line 106
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 107
    .line 108
    .line 109
    iget-object p0, p0, La/zrj;->g:La/zx10;

    .line 110
    .line 111
    sget-object v0, La/r040;->i:La/r040;

    .line 112
    .line 113
    invoke-static {p0, v0, v1, v2}, La/zx10;->k(La/zx10;La/r040;ZI)Lorg/xplatform/main_menu/impl/navigation/MainMenuFragmentScreen;

    .line 114
    .line 115
    .line 116
    move-result-object p0

    .line 117
    invoke-virtual {p1, p0}, La/k0w0;->h(La/m7h0;)La/ikt0;

    .line 118
    .line 119
    .line 120
    move-result-object p0

    .line 121
    iget-object p0, p0, La/ikt0;->a:Ljava/lang/Object;

    .line 122
    .line 123
    check-cast p0, La/c8d;

    .line 124
    .line 125
    sget-object p1, La/cfx0;->o:La/bjk;

    .line 126
    .line 127
    new-instance v0, La/v7d;

    .line 128
    .line 129
    invoke-direct {v0, v1, p1, p1}, La/v7d;-><init>(ZLa/bjk;La/bjk;)V

    .line 130
    .line 131
    .line 132
    iput-object v0, p0, La/c8d;->a:La/w7d;

    .line 133
    .line 134
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 135
    .line 136
    return-object p0

    .line 137
    :pswitch_4
    check-cast p1, La/i1w0;

    .line 138
    .line 139
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 140
    .line 141
    .line 142
    new-instance v0, La/x2i;

    .line 143
    .line 144
    const/16 v1, 0x14

    .line 145
    .line 146
    invoke-direct {v0, p0, v1}, La/x2i;-><init>(La/zrj;B)V

    .line 147
    .line 148
    .line 149
    invoke-virtual {p1, v0}, La/i1w0;->d(Lkotlin/jvm/functions/Function1;)V

    .line 150
    .line 151
    .line 152
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 153
    .line 154
    return-object p0

    .line 155
    :pswitch_5
    check-cast p1, La/i1w0;

    .line 156
    .line 157
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 158
    .line 159
    .line 160
    new-instance v0, La/qrj;

    .line 161
    .line 162
    invoke-direct {v0, p0, v2}, La/qrj;-><init>(La/zrj;B)V

    .line 163
    .line 164
    .line 165
    invoke-virtual {p1, v0}, La/i1w0;->d(Lkotlin/jvm/functions/Function1;)V

    .line 166
    .line 167
    .line 168
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 169
    .line 170
    return-object p0

    .line 171
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
