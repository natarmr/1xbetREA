.class public final La/phs;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public synthetic j:Ljava/lang/Object;

.field public final synthetic k:La/uhs;


# direct methods
.method public synthetic constructor <init>(La/uhs;La/yje;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/phs;->i:B

    iput-object p1, p0, La/phs;->k:La/uhs;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 2

    .line 1
    iget-byte v0, p0, La/phs;->i:B

    .line 2
    .line 3
    iget-object p0, p0, La/phs;->k:La/uhs;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance v0, La/phs;

    .line 9
    .line 10
    const/4 v1, 0x1

    .line 11
    invoke-direct {v0, p0, p2, v1}, La/phs;-><init>(La/uhs;La/yje;B)V

    .line 12
    .line 13
    .line 14
    iput-object p1, v0, La/phs;->j:Ljava/lang/Object;

    .line 15
    .line 16
    return-object v0

    .line 17
    :pswitch_0
    new-instance v0, La/phs;

    .line 18
    .line 19
    const/4 v1, 0x0

    .line 20
    invoke-direct {v0, p0, p2, v1}, La/phs;-><init>(La/uhs;La/yje;B)V

    .line 21
    .line 22
    .line 23
    iput-object p1, v0, La/phs;->j:Ljava/lang/Object;

    .line 24
    .line 25
    return-object v0

    .line 26
    nop

    .line 27
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-byte v0, p0, La/phs;->i:B

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, Ljava/lang/String;

    .line 7
    .line 8
    check-cast p2, La/yje;

    .line 9
    .line 10
    invoke-virtual {p0, p1, p2}, La/phs;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, La/phs;

    .line 15
    .line 16
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, La/phs;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    check-cast p1, Ljava/util/List;

    .line 24
    .line 25
    check-cast p2, La/yje;

    .line 26
    .line 27
    invoke-virtual {p0, p1, p2}, La/phs;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    check-cast p0, La/phs;

    .line 32
    .line 33
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 34
    .line 35
    invoke-virtual {p0, p1}, La/phs;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    return-object p0

    .line 40
    nop

    .line 41
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    .line 1
    iget-byte v0, p0, La/phs;->i:B

    .line 2
    .line 3
    iget-object v1, p0, La/phs;->k:La/uhs;

    .line 4
    .line 5
    iget-object p0, p0, La/phs;->j:Ljava/lang/Object;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    move-object v0, p0

    .line 11
    check-cast v0, Ljava/lang/String;

    .line 12
    .line 13
    sget-object p0, La/wne;->a:La/wne;

    .line 14
    .line 15
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 16
    .line 17
    .line 18
    sget p0, La/uhs;->J:I

    .line 19
    .line 20
    iget-object v2, v1, La/uhs;->D:La/qz40;

    .line 21
    .line 22
    :cond_0
    move-object p0, v2

    .line 23
    check-cast p0, La/p7m0;

    .line 24
    .line 25
    invoke-virtual {p0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    move-object v1, p1

    .line 30
    check-cast v1, Ljava/lang/String;

    .line 31
    .line 32
    invoke-virtual {p0, p1, v0}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 33
    .line 34
    .line 35
    move-result p0

    .line 36
    if-eqz p0, :cond_0

    .line 37
    .line 38
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 39
    .line 40
    return-object p0

    .line 41
    :pswitch_0
    check-cast p0, Ljava/util/List;

    .line 42
    .line 43
    sget-object v0, La/wne;->a:La/wne;

    .line 44
    .line 45
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 46
    .line 47
    .line 48
    sget p1, La/uhs;->J:I

    .line 49
    .line 50
    iget-object p1, v1, La/uhs;->o:Lorg/xplatform/feed/linelive/presentation/feeds/child/champs/models/FeedGameItemsScreenParams;

    .line 51
    .line 52
    iget-object p1, p1, Lorg/xplatform/feed/linelive/presentation/feeds/child/champs/models/FeedGameItemsScreenParams;->a:Ljava/util/List;

    .line 53
    .line 54
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 55
    .line 56
    .line 57
    move-result p1

    .line 58
    const/4 v0, 0x1

    .line 59
    if-ne p1, v0, :cond_4

    .line 60
    .line 61
    invoke-virtual {v1}, La/i3t0;->D()Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    move-result-object p1

    .line 65
    check-cast p1, La/cis;

    .line 66
    .line 67
    iget-object p1, p1, La/cis;->a:Ljava/lang/String;

    .line 68
    .line 69
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 70
    .line 71
    .line 72
    move-result p1

    .line 73
    if-nez p1, :cond_4

    .line 74
    .line 75
    invoke-static {p0}, Lkotlin/collections/CollectionsKt;->firstOrNull(Ljava/util/List;)Ljava/lang/Object;

    .line 76
    .line 77
    .line 78
    move-result-object p0

    .line 79
    check-cast p0, La/klr;

    .line 80
    .line 81
    if-eqz p0, :cond_1

    .line 82
    .line 83
    invoke-virtual {p0}, La/klr;->c()Ljava/lang/String;

    .line 84
    .line 85
    .line 86
    move-result-object p0

    .line 87
    goto :goto_0

    .line 88
    :cond_1
    const/4 p0, 0x0

    .line 89
    :goto_0
    if-nez p0, :cond_2

    .line 90
    .line 91
    const-string p0, ""

    .line 92
    .line 93
    :cond_2
    move-object v3, p0

    .line 94
    iget-object p0, v1, La/i3t0;->i:La/ocj;

    .line 95
    .line 96
    iget-object p0, p0, La/ocj;->a:La/p7m0;

    .line 97
    .line 98
    :cond_3
    invoke-virtual {p0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 99
    .line 100
    .line 101
    move-result-object p1

    .line 102
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 103
    .line 104
    .line 105
    iget-object v0, v1, La/i3t0;->f:La/oyg0;

    .line 106
    .line 107
    move-object v2, p1

    .line 108
    check-cast v2, La/cis;

    .line 109
    .line 110
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 111
    .line 112
    .line 113
    const/4 v8, 0x0

    .line 114
    const/16 v9, 0x7e

    .line 115
    .line 116
    const/4 v4, 0x0

    .line 117
    const/4 v5, 0x0

    .line 118
    const/4 v6, 0x0

    .line 119
    const/4 v7, 0x0

    .line 120
    invoke-static/range {v2 .. v9}, La/cis;->a(La/cis;Ljava/lang/String;Ljava/util/List;La/ais;La/bis;ZZI)La/cis;

    .line 121
    .line 122
    .line 123
    move-result-object v0

    .line 124
    invoke-virtual {p0, p1, v0}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 125
    .line 126
    .line 127
    move-result p1

    .line 128
    if-eqz p1, :cond_3

    .line 129
    .line 130
    iget-object p0, v1, La/uhs;->t:La/imf0;

    .line 131
    .line 132
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 133
    .line 134
    .line 135
    iget-object p0, p0, La/imf0;->a:La/hkp;

    .line 136
    .line 137
    iget-object p0, p0, La/hkp;->a:La/gkp;

    .line 138
    .line 139
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 140
    .line 141
    .line 142
    iget-object p0, p0, La/gkp;->d:La/ol60;

    .line 143
    .line 144
    invoke-virtual {p0, v3}, La/ol60;->f(Ljava/lang/Object;)V

    .line 145
    .line 146
    .line 147
    :cond_4
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 148
    .line 149
    return-object p0

    .line 150
    nop

    .line 151
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
