.class public final La/rpl0;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public synthetic j:Ljava/lang/Object;

.field public final synthetic k:La/xpl0;

.field public final synthetic l:La/vne;


# direct methods
.method public synthetic constructor <init>(La/xpl0;La/vne;La/yje;B)V
    .locals 0

    .line 1
    iput-byte p4, p0, La/rpl0;->i:B

    iput-object p1, p0, La/rpl0;->k:La/xpl0;

    iput-object p2, p0, La/rpl0;->l:La/vne;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 3

    .line 1
    iget-byte v0, p0, La/rpl0;->i:B

    .line 2
    .line 3
    iget-object v1, p0, La/rpl0;->l:La/vne;

    .line 4
    .line 5
    iget-object p0, p0, La/rpl0;->k:La/xpl0;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    new-instance v0, La/rpl0;

    .line 11
    .line 12
    const/4 v2, 0x1

    .line 13
    invoke-direct {v0, p0, v1, p2, v2}, La/rpl0;-><init>(La/xpl0;La/vne;La/yje;B)V

    .line 14
    .line 15
    .line 16
    iput-object p1, v0, La/rpl0;->j:Ljava/lang/Object;

    .line 17
    .line 18
    return-object v0

    .line 19
    :pswitch_0
    new-instance v0, La/rpl0;

    .line 20
    .line 21
    const/4 v2, 0x0

    .line 22
    invoke-direct {v0, p0, v1, p2, v2}, La/rpl0;-><init>(La/xpl0;La/vne;La/yje;B)V

    .line 23
    .line 24
    .line 25
    iput-object p1, v0, La/rpl0;->j:Ljava/lang/Object;

    .line 26
    .line 27
    return-object v0

    .line 28
    nop

    .line 29
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-byte v0, p0, La/rpl0;->i:B

    .line 2
    .line 3
    check-cast p1, Ljava/lang/Throwable;

    .line 4
    .line 5
    check-cast p2, La/yje;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0, p1, p2}, La/rpl0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, La/rpl0;

    .line 15
    .line 16
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, La/rpl0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    invoke-virtual {p0, p1, p2}, La/rpl0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    check-cast p0, La/rpl0;

    .line 28
    .line 29
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 30
    .line 31
    invoke-virtual {p0, p1}, La/rpl0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    return-object p0

    .line 36
    nop

    .line 37
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 24

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/rpl0;->i:B

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    iget-object v3, v0, La/rpl0;->l:La/vne;

    .line 7
    .line 8
    iget-object v4, v0, La/rpl0;->k:La/xpl0;

    .line 9
    .line 10
    iget-object v0, v0, La/rpl0;->j:Ljava/lang/Object;

    .line 11
    .line 12
    packed-switch v1, :pswitch_data_0

    .line 13
    .line 14
    .line 15
    move-object v1, v0

    .line 16
    check-cast v1, Ljava/lang/Throwable;

    .line 17
    .line 18
    sget-object v0, La/wne;->a:La/wne;

    .line 19
    .line 20
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 21
    .line 22
    .line 23
    invoke-virtual {v1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 24
    .line 25
    .line 26
    sget v0, La/xpl0;->P:I

    .line 27
    .line 28
    iget-object v0, v4, La/i3t0;->i:La/ocj;

    .line 29
    .line 30
    iget-object v5, v0, La/ocj;->a:La/p7m0;

    .line 31
    .line 32
    :cond_0
    invoke-virtual {v5}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 37
    .line 38
    .line 39
    move-object v6, v0

    .line 40
    check-cast v6, La/hpl0;

    .line 41
    .line 42
    new-instance v14, La/jhh0;

    .line 43
    .line 44
    invoke-direct {v14, v1}, La/jhh0;-><init>(Ljava/lang/Throwable;)V

    .line 45
    .line 46
    .line 47
    const/16 v22, 0x0

    .line 48
    .line 49
    const v23, 0x3ff7f

    .line 50
    .line 51
    .line 52
    const/4 v7, 0x0

    .line 53
    const/4 v8, 0x0

    .line 54
    const/4 v9, 0x0

    .line 55
    const/4 v10, 0x0

    .line 56
    const/4 v11, 0x0

    .line 57
    const/4 v12, 0x0

    .line 58
    const/4 v13, 0x0

    .line 59
    const/4 v15, 0x0

    .line 60
    const/16 v16, 0x0

    .line 61
    .line 62
    const/16 v17, 0x0

    .line 63
    .line 64
    const/16 v18, 0x0

    .line 65
    .line 66
    const/16 v19, 0x0

    .line 67
    .line 68
    const/16 v20, 0x0

    .line 69
    .line 70
    const/16 v21, 0x0

    .line 71
    .line 72
    invoke-static/range {v6 .. v23}, La/hpl0;->a(La/hpl0;ZZLjava/lang/String;Ljava/lang/String;ZLa/dnf0;La/dhh0;La/thh0;La/thh0;Ljava/lang/Integer;Ljava/util/List;Ljava/lang/Boolean;Ljava/lang/Boolean;La/wcb;La/v5l0;ZI)La/hpl0;

    .line 73
    .line 74
    .line 75
    move-result-object v4

    .line 76
    invoke-virtual {v5, v0, v4}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 77
    .line 78
    .line 79
    move-result v0

    .line 80
    if-eqz v0, :cond_0

    .line 81
    .line 82
    instance-of v0, v1, La/hr30;

    .line 83
    .line 84
    if-eqz v0, :cond_1

    .line 85
    .line 86
    invoke-static {v3, v2}, La/d5c;->G(La/vne;Ljava/util/concurrent/CancellationException;)V

    .line 87
    .line 88
    .line 89
    :cond_1
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 90
    .line 91
    return-object v0

    .line 92
    :pswitch_0
    check-cast v0, Ljava/lang/Throwable;

    .line 93
    .line 94
    sget-object v1, La/wne;->a:La/wne;

    .line 95
    .line 96
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 97
    .line 98
    .line 99
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 100
    .line 101
    .line 102
    sget v1, La/xpl0;->P:I

    .line 103
    .line 104
    iget-object v1, v4, La/i3t0;->i:La/ocj;

    .line 105
    .line 106
    iget-object v1, v1, La/ocj;->a:La/p7m0;

    .line 107
    .line 108
    :cond_2
    invoke-virtual {v1}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 109
    .line 110
    .line 111
    move-result-object v4

    .line 112
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 113
    .line 114
    .line 115
    move-object v5, v4

    .line 116
    check-cast v5, La/hpl0;

    .line 117
    .line 118
    new-instance v14, La/jhh0;

    .line 119
    .line 120
    invoke-direct {v14, v0}, La/jhh0;-><init>(Ljava/lang/Throwable;)V

    .line 121
    .line 122
    .line 123
    const/16 v21, 0x0

    .line 124
    .line 125
    const v22, 0x3feff

    .line 126
    .line 127
    .line 128
    const/4 v6, 0x0

    .line 129
    const/4 v7, 0x0

    .line 130
    const/4 v8, 0x0

    .line 131
    const/4 v9, 0x0

    .line 132
    const/4 v10, 0x0

    .line 133
    const/4 v11, 0x0

    .line 134
    const/4 v12, 0x0

    .line 135
    const/4 v13, 0x0

    .line 136
    const/4 v15, 0x0

    .line 137
    const/16 v16, 0x0

    .line 138
    .line 139
    const/16 v17, 0x0

    .line 140
    .line 141
    const/16 v18, 0x0

    .line 142
    .line 143
    const/16 v19, 0x0

    .line 144
    .line 145
    const/16 v20, 0x0

    .line 146
    .line 147
    invoke-static/range {v5 .. v22}, La/hpl0;->a(La/hpl0;ZZLjava/lang/String;Ljava/lang/String;ZLa/dnf0;La/dhh0;La/thh0;La/thh0;Ljava/lang/Integer;Ljava/util/List;Ljava/lang/Boolean;Ljava/lang/Boolean;La/wcb;La/v5l0;ZI)La/hpl0;

    .line 148
    .line 149
    .line 150
    move-result-object v5

    .line 151
    invoke-virtual {v1, v4, v5}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 152
    .line 153
    .line 154
    move-result v4

    .line 155
    if-eqz v4, :cond_2

    .line 156
    .line 157
    instance-of v0, v0, La/hr30;

    .line 158
    .line 159
    if-eqz v0, :cond_3

    .line 160
    .line 161
    invoke-static {v3, v2}, La/d5c;->G(La/vne;Ljava/util/concurrent/CancellationException;)V

    .line 162
    .line 163
    .line 164
    :cond_3
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 165
    .line 166
    return-object v0

    .line 167
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
