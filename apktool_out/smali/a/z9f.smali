.class public final synthetic La/z9f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/tasks/Continuation;
.implements Lcom/google/android/gms/tasks/OnSuccessListener;
.implements La/wyg;
.implements La/pg60;
.implements La/k4r;
.implements La/sg00;
.implements La/pyj;
.implements La/diq;
.implements La/zf60;
.implements La/qg60;
.implements La/zon0;
.implements Lcom/google/android/gms/tasks/OnFailureListener;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(La/ft2;La/wn00;La/in30;Ljava/io/IOException;Z)V
    .locals 0

    .line 1
    const/16 p1, 0xa

    iput-byte p1, p0, La/z9f;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p3, p0, La/z9f;->b:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(La/ft2;Ljava/lang/Object;B)V
    .locals 0

    .line 2
    iput-byte p3, p0, La/z9f;->a:B

    iput-object p2, p0, La/z9f;->b:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;B)V
    .locals 0

    .line 3
    iput-byte p2, p0, La/z9f;->a:B

    iput-object p1, p0, La/z9f;->b:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(ILa/ccs0;[I)La/rcf0;
    .locals 6

    .line 1
    iget-object p0, p0, La/z9f;->b:Ljava/lang/Object;

    .line 2
    .line 3
    move-object v4, p0

    .line 4
    check-cast v4, La/nyj;

    .line 5
    .line 6
    invoke-static {}, La/b4x;->l()La/u3x;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    const/4 v0, 0x0

    .line 11
    move v3, v0

    .line 12
    :goto_0
    iget v0, p2, La/ccs0;->a:I

    .line 13
    .line 14
    if-ge v3, v0, :cond_0

    .line 15
    .line 16
    new-instance v0, La/kyj;

    .line 17
    .line 18
    aget v5, p3, v3

    .line 19
    .line 20
    move v1, p1

    .line 21
    move-object v2, p2

    .line 22
    invoke-direct/range {v0 .. v5}, La/kyj;-><init>(ILa/ccs0;ILa/nyj;I)V

    .line 23
    .line 24
    .line 25
    invoke-virtual {p0, v0}, La/r3x;->b(Ljava/lang/Object;)V

    .line 26
    .line 27
    .line 28
    add-int/lit8 v3, v3, 0x1

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_0
    invoke-virtual {p0}, La/u3x;->g()La/rcf0;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    return-object p0
.end method

.method public b()V
    .locals 1

    .line 1
    iget-object p0, p0, La/z9f;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Lorg/xplatform/favorites/impl/presentation/category/f;

    .line 4
    .line 5
    sget-object v0, Lorg/xplatform/favorites/impl/presentation/category/e;->V1:La/sek;

    .line 6
    .line 7
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0}, Lorg/xplatform/favorites/impl/presentation/category/f;->w()V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public c(F)V
    .locals 1

    .line 1
    iget-object p0, p0, La/z9f;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, La/ueu0;

    .line 4
    .line 5
    iget-object p0, p0, La/ueu0;->b:La/zeu0;

    .line 6
    .line 7
    iget v0, p0, La/zeu0;->f:F

    .line 8
    .line 9
    cmpl-float v0, v0, p1

    .line 10
    .line 11
    if-nez v0, :cond_0

    .line 12
    .line 13
    return-void

    .line 14
    :cond_0
    iput p1, p0, La/zeu0;->f:F

    .line 15
    .line 16
    const/4 p1, 0x0

    .line 17
    invoke-virtual {p0, p1}, La/zeu0;->c(Z)V

    .line 18
    .line 19
    .line 20
    return-void
.end method

.method public e(La/p6t0;)V
    .locals 12

    .line 1
    iget-byte v0, p0, La/z9f;->a:B

    .line 2
    .line 3
    iget-object p0, p0, La/z9f;->b:Ljava/lang/Object;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    check-cast p0, La/ptk;

    .line 9
    .line 10
    sget-object v0, La/ptk;->U1:La/ddk;

    .line 11
    .line 12
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    iget-object p0, p0, La/ptk;->O1:La/kiu0;

    .line 16
    .line 17
    invoke-virtual {p0}, La/kiu0;->getValue()Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    check-cast p0, La/xtk;

    .line 22
    .line 23
    iget-object v0, p0, La/xtk;->b:Lorg/xplatform/cyber/section/api/discipline/presentation/model/DisciplineListParams;

    .line 24
    .line 25
    instance-of v1, p1, La/hok;

    .line 26
    .line 27
    if-eqz v1, :cond_0

    .line 28
    .line 29
    iget-object v1, v0, Lorg/xplatform/cyber/section/api/discipline/presentation/model/DisciplineListParams;->a:Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;

    .line 30
    .line 31
    check-cast p1, La/hok;

    .line 32
    .line 33
    iget-wide v2, p1, La/hok;->a:J

    .line 34
    .line 35
    invoke-static {v2, v3, v1}, Lorg/xplatform/cyber/section/api/domain/entity/d;->c(JLorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;)Lkotlin/Pair;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    iget-object v1, p1, Lkotlin/Pair;->a:Ljava/lang/Object;

    .line 40
    .line 41
    check-cast v1, Ljava/lang/Number;

    .line 42
    .line 43
    invoke-virtual {v1}, Ljava/lang/Number;->longValue()J

    .line 44
    .line 45
    .line 46
    move-result-wide v5

    .line 47
    iget-object p1, p1, Lkotlin/Pair;->b:Ljava/lang/Object;

    .line 48
    .line 49
    check-cast p1, Ljava/lang/Number;

    .line 50
    .line 51
    invoke-virtual {p1}, Ljava/lang/Number;->longValue()J

    .line 52
    .line 53
    .line 54
    move-result-wide v7

    .line 55
    iget-object v4, p0, La/xtk;->d:La/ih5;

    .line 56
    .line 57
    sget-object v9, La/r1g;->j:La/r1g;

    .line 58
    .line 59
    const/4 v10, 0x0

    .line 60
    const/4 v11, 0x0

    .line 61
    invoke-virtual/range {v4 .. v11}, La/ih5;->l(JJLa/r1g;Ljava/lang/Long;Ljava/lang/Boolean;)V

    .line 62
    .line 63
    .line 64
    iget-object v4, p0, La/xtk;->h:La/zr1;

    .line 65
    .line 66
    const-string v9, "cybersport_popular"

    .line 67
    .line 68
    invoke-virtual/range {v4 .. v11}, La/zr1;->m(JJLjava/lang/String;Ljava/lang/Long;Ljava/lang/Boolean;)V

    .line 69
    .line 70
    .line 71
    iget-object p0, p0, La/xtk;->c:La/hzg;

    .line 72
    .line 73
    iget-object p1, v0, Lorg/xplatform/cyber/section/api/discipline/presentation/model/DisciplineListParams;->a:Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;

    .line 74
    .line 75
    sget-object v0, La/k1g;->b:La/k1g;

    .line 76
    .line 77
    check-cast p0, La/uzg;

    .line 78
    .line 79
    invoke-virtual {p0, v2, v3, p1, v0}, La/uzg;->c(JLorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;La/k1g;)V

    .line 80
    .line 81
    .line 82
    :cond_0
    return-void

    .line 83
    :pswitch_0
    check-cast p0, La/upg;

    .line 84
    .line 85
    sget-object v0, La/upg;->X1:La/kwd;

    .line 86
    .line 87
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 88
    .line 89
    .line 90
    instance-of p1, p1, La/mgh;

    .line 91
    .line 92
    if-eqz p1, :cond_1

    .line 93
    .line 94
    invoke-virtual {p0}, La/upg;->H0()La/vqg;

    .line 95
    .line 96
    .line 97
    move-result-object p0

    .line 98
    invoke-static {p0}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 99
    .line 100
    .line 101
    move-result-object p1

    .line 102
    new-instance v0, La/sqg;

    .line 103
    .line 104
    const/4 v1, 0x0

    .line 105
    const/4 v2, 0x3

    .line 106
    invoke-direct {v0, p0, v1, v2}, La/sqg;-><init>(La/vqg;La/yje;B)V

    .line 107
    .line 108
    .line 109
    invoke-static {p1, v1, v1, v0, v2}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 110
    .line 111
    .line 112
    :cond_1
    return-void

    .line 113
    :pswitch_data_0
    .packed-switch 0x5
        :pswitch_0
    .end packed-switch
.end method

.method public i(Landroid/os/Bundle;Ljava/lang/String;)V
    .locals 4

    .line 1
    iget-byte v0, p0, La/z9f;->a:B

    .line 2
    .line 3
    const/4 v1, 0x2

    .line 4
    const-string v2, "REQUEST_FINISH_MAKE_BET_DIALOG_KEY"

    .line 5
    .line 6
    iget-object p0, p0, La/z9f;->b:Ljava/lang/Object;

    .line 7
    .line 8
    sparse-switch v0, :sswitch_data_0

    .line 9
    .line 10
    .line 11
    check-cast p0, La/n9q;

    .line 12
    .line 13
    sget-object v0, La/n9q;->S1:[La/iiy;

    .line 14
    .line 15
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 16
    .line 17
    .line 18
    invoke-virtual {p2, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 19
    .line 20
    .line 21
    move-result p2

    .line 22
    if-nez p2, :cond_0

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_0
    invoke-virtual {p1, v2}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    .line 26
    .line 27
    .line 28
    move-result p1

    .line 29
    if-eqz p1, :cond_1

    .line 30
    .line 31
    invoke-virtual {p0}, La/n9q;->G0()La/k3t0;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    sget-object p1, La/y8q;->a:La/y8q;

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
    :sswitch_0
    check-cast p0, La/i6q;

    .line 42
    .line 43
    sget-object v0, La/i6q;->V1:[La/iiy;

    .line 44
    .line 45
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 46
    .line 47
    .line 48
    invoke-virtual {p2, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 49
    .line 50
    .line 51
    move-result p2

    .line 52
    if-nez p2, :cond_2

    .line 53
    .line 54
    goto :goto_1

    .line 55
    :cond_2
    invoke-virtual {p1, v2}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    .line 56
    .line 57
    .line 58
    move-result p1

    .line 59
    if-eqz p1, :cond_3

    .line 60
    .line 61
    invoke-virtual {p0}, La/i6q;->H0()La/r8q;

    .line 62
    .line 63
    .line 64
    move-result-object p0

    .line 65
    iget-object p1, p0, La/r8q;->X:La/sje;

    .line 66
    .line 67
    iget-object p2, p0, La/r8q;->i:La/mne;

    .line 68
    .line 69
    iget-object p2, p2, La/mne;->b:La/dvj;

    .line 70
    .line 71
    new-instance v0, La/l8q;

    .line 72
    .line 73
    const/4 v2, 0x3

    .line 74
    const/4 v3, 0x0

    .line 75
    invoke-direct {v0, p0, v3, v2}, La/l8q;-><init>(La/r8q;La/yje;B)V

    .line 76
    .line 77
    .line 78
    invoke-static {p1, p2, v3, v0, v1}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 79
    .line 80
    .line 81
    :cond_3
    :goto_1
    return-void

    .line 82
    :sswitch_1
    check-cast p0, La/cio;

    .line 83
    .line 84
    sget-object v0, La/cio;->P1:La/ddk;

    .line 85
    .line 86
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 87
    .line 88
    .line 89
    sget p2, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 90
    .line 91
    const/16 v0, 0x21

    .line 92
    .line 93
    if-lt p2, v0, :cond_4

    .line 94
    .line 95
    invoke-static {p1}, La/uq6;->l(Landroid/os/Bundle;)Ljava/util/ArrayList;

    .line 96
    .line 97
    .line 98
    move-result-object p1

    .line 99
    goto :goto_2

    .line 100
    :cond_4
    const-string p2, "REMOVE_ALL_SPORT_EVENTS_RESULT"

    .line 101
    .line 102
    invoke-virtual {p1, p2}, Landroid/os/Bundle;->getParcelableArrayList(Ljava/lang/String;)Ljava/util/ArrayList;

    .line 103
    .line 104
    .line 105
    move-result-object p1

    .line 106
    :goto_2
    if-nez p1, :cond_5

    .line 107
    .line 108
    sget-object p1, La/iun;->a:La/iun;

    .line 109
    .line 110
    :cond_5
    invoke-interface {p1}, Ljava/util/Collection;->isEmpty()Z

    .line 111
    .line 112
    .line 113
    move-result p2

    .line 114
    if-nez p2, :cond_6

    .line 115
    .line 116
    invoke-virtual {p0}, La/cio;->H0()La/k3t0;

    .line 117
    .line 118
    .line 119
    move-result-object p0

    .line 120
    new-instance p2, La/yf2;

    .line 121
    .line 122
    invoke-direct {p2, p1}, La/yf2;-><init>(Ljava/util/List;)V

    .line 123
    .line 124
    .line 125
    invoke-virtual {p0, p2}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 126
    .line 127
    .line 128
    :cond_6
    return-void

    .line 129
    :sswitch_2
    check-cast p0, La/j4j;

    .line 130
    .line 131
    sget-object v0, La/j4j;->R1:La/kud;

    .line 132
    .line 133
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 134
    .line 135
    .line 136
    const-string p2, "BUNDLE_TASK_KIND_ID_KEY"

    .line 137
    .line 138
    invoke-virtual {p1, p2}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    .line 139
    .line 140
    .line 141
    move-result v0

    .line 142
    if-nez v0, :cond_7

    .line 143
    .line 144
    goto :goto_3

    .line 145
    :cond_7
    invoke-virtual {p1, p2}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;)I

    .line 146
    .line 147
    .line 148
    move-result p2

    .line 149
    sget-object v0, La/sba0;->b:La/jh70;

    .line 150
    .line 151
    if-ne p2, v1, :cond_8

    .line 152
    .line 153
    invoke-virtual {p0}, La/j4j;->G0()La/k3t0;

    .line 154
    .line 155
    .line 156
    move-result-object p0

    .line 157
    new-instance p2, La/s3j;

    .line 158
    .line 159
    const-string v0, "BUNDLE_PRODUCT_ID_KEY"

    .line 160
    .line 161
    invoke-virtual {p1, v0}, Landroid/os/BaseBundle;->getLong(Ljava/lang/String;)J

    .line 162
    .line 163
    .line 164
    move-result-wide v0

    .line 165
    const-string v2, "BUNDLE_PROGRESS_KEY"

    .line 166
    .line 167
    invoke-virtual {p1, v2}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;)I

    .line 168
    .line 169
    .line 170
    move-result p1

    .line 171
    invoke-direct {p2, v0, v1, p1}, La/s3j;-><init>(JI)V

    .line 172
    .line 173
    .line 174
    invoke-virtual {p0, p2}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 175
    .line 176
    .line 177
    :cond_8
    :goto_3
    return-void

    .line 178
    nop

    .line 179
    :sswitch_data_0
    .sparse-switch
        0x7 -> :sswitch_2
        0x11 -> :sswitch_1
        0x19 -> :sswitch_0
    .end sparse-switch
.end method

.method public invoke(Ljava/lang/Object;)V
    .locals 2

    .line 1
    iget-byte v0, p0, La/z9f;->a:B

    .line 2
    .line 3
    iget-object p0, p0, La/z9f;->b:Ljava/lang/Object;

    .line 4
    .line 5
    sparse-switch v0, :sswitch_data_0

    .line 6
    .line 7
    .line 8
    check-cast p0, La/ed40;

    .line 9
    .line 10
    check-cast p1, La/ky90;

    .line 11
    .line 12
    invoke-interface {p1, p0}, La/ky90;->t(La/ed40;)V

    .line 13
    .line 14
    .line 15
    return-void

    .line 16
    :sswitch_0
    check-cast p0, La/qlo;

    .line 17
    .line 18
    check-cast p1, La/ky90;

    .line 19
    .line 20
    iget-object p0, p0, La/qlo;->a:La/ulo;

    .line 21
    .line 22
    iget-object p0, p0, La/ulo;->R:La/jn30;

    .line 23
    .line 24
    invoke-interface {p1, p0}, La/ky90;->A(La/jn30;)V

    .line 25
    .line 26
    .line 27
    return-void

    .line 28
    :sswitch_1
    check-cast p0, La/dtf;

    .line 29
    .line 30
    check-cast p1, La/ky90;

    .line 31
    .line 32
    invoke-interface {p1, p0}, La/ky90;->C(La/dtf;)V

    .line 33
    .line 34
    .line 35
    return-void

    .line 36
    :sswitch_2
    check-cast p0, La/scs0;

    .line 37
    .line 38
    check-cast p1, La/ky90;

    .line 39
    .line 40
    invoke-interface {p1, p0}, La/ky90;->s(La/scs0;)V

    .line 41
    .line 42
    .line 43
    return-void

    .line 44
    :sswitch_3
    check-cast p0, La/jn30;

    .line 45
    .line 46
    check-cast p1, La/ky90;

    .line 47
    .line 48
    invoke-interface {p1, p0}, La/ky90;->A(La/jn30;)V

    .line 49
    .line 50
    .line 51
    return-void

    .line 52
    :sswitch_4
    check-cast p0, La/in30;

    .line 53
    .line 54
    check-cast p1, La/gt2;

    .line 55
    .line 56
    check-cast p1, La/kn30;

    .line 57
    .line 58
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 59
    .line 60
    .line 61
    iget-byte p0, p0, La/in30;->a:B

    .line 62
    .line 63
    iput-byte p0, p1, La/kn30;->w:B

    .line 64
    .line 65
    return-void

    .line 66
    :sswitch_5
    check-cast p0, La/tkj;

    .line 67
    .line 68
    check-cast p1, La/gt2;

    .line 69
    .line 70
    check-cast p1, La/kn30;

    .line 71
    .line 72
    iget v0, p1, La/kn30;->y:I

    .line 73
    .line 74
    iget v1, p0, La/tkj;->g:I

    .line 75
    .line 76
    add-int/2addr v0, v1

    .line 77
    iput v0, p1, La/kn30;->y:I

    .line 78
    .line 79
    iget v0, p1, La/kn30;->z:I

    .line 80
    .line 81
    iget p0, p0, La/tkj;->e:I

    .line 82
    .line 83
    add-int/2addr v0, p0

    .line 84
    iput v0, p1, La/kn30;->z:I

    .line 85
    .line 86
    return-void

    .line 87
    :sswitch_6
    check-cast p0, La/dlo;

    .line 88
    .line 89
    check-cast p1, La/gt2;

    .line 90
    .line 91
    check-cast p1, La/kn30;

    .line 92
    .line 93
    iput-object p0, p1, La/kn30;->o:La/dlo;

    .line 94
    .line 95
    return-void

    .line 96
    nop

    .line 97
    :sswitch_data_0
    .sparse-switch
        0x8 -> :sswitch_6
        0x9 -> :sswitch_5
        0xa -> :sswitch_4
        0x12 -> :sswitch_3
        0x13 -> :sswitch_2
        0x14 -> :sswitch_1
        0x15 -> :sswitch_0
    .end sparse-switch
.end method

.method public l(Landroid/view/View;La/xiv0;)La/xiv0;
    .locals 3

    .line 1
    iget-byte v0, p0, La/z9f;->a:B

    .line 2
    .line 3
    const/4 v1, 0x2

    .line 4
    iget-object p0, p0, La/z9f;->b:Ljava/lang/Object;

    .line 5
    .line 6
    packed-switch v0, :pswitch_data_0

    .line 7
    .line 8
    .line 9
    check-cast p0, Lorg/xplatform/uikit/components/tabbar/DsTabBar;

    .line 10
    .line 11
    sget v0, Lorg/xplatform/uikit/components/tabbar/DsTabBar;->n:I

    .line 12
    .line 13
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    iget-object p1, p2, La/xiv0;->a:La/uiv0;

    .line 17
    .line 18
    invoke-virtual {p1, v1}, La/uiv0;->i(I)La/pfx;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    iget p1, p1, La/pfx;->d:I

    .line 23
    .line 24
    iget v0, p0, Lorg/xplatform/uikit/components/tabbar/DsTabBar;->i:I

    .line 25
    .line 26
    if-eq p1, v0, :cond_0

    .line 27
    .line 28
    iput p1, p0, Lorg/xplatform/uikit/components/tabbar/DsTabBar;->i:I

    .line 29
    .line 30
    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    .line 31
    .line 32
    .line 33
    :cond_0
    return-object p2

    .line 34
    :pswitch_0
    check-cast p0, Lorg/xplatform/uikit/components/bottom_bar/DsBottomBar;

    .line 35
    .line 36
    sget v0, Lorg/xplatform/uikit/components/bottom_bar/DsBottomBar;->v:I

    .line 37
    .line 38
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 39
    .line 40
    .line 41
    iget-object v0, p2, La/xiv0;->a:La/uiv0;

    .line 42
    .line 43
    invoke-virtual {v0, v1}, La/uiv0;->i(I)La/pfx;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    iget v0, v0, La/pfx;->d:I

    .line 48
    .line 49
    iget v1, p0, Lorg/xplatform/uikit/components/bottom_bar/DsBottomBar;->u:I

    .line 50
    .line 51
    if-eq v0, v1, :cond_1

    .line 52
    .line 53
    iput v0, p0, Lorg/xplatform/uikit/components/bottom_bar/DsBottomBar;->u:I

    .line 54
    .line 55
    iget p0, p0, Lorg/xplatform/uikit/components/bottom_bar/DsBottomBar;->t:I

    .line 56
    .line 57
    add-int/2addr p0, v0

    .line 58
    invoke-virtual {p1}, Landroid/view/View;->getPaddingLeft()I

    .line 59
    .line 60
    .line 61
    move-result v0

    .line 62
    invoke-virtual {p1}, Landroid/view/View;->getPaddingTop()I

    .line 63
    .line 64
    .line 65
    move-result v1

    .line 66
    invoke-virtual {p1}, Landroid/view/View;->getPaddingRight()I

    .line 67
    .line 68
    .line 69
    move-result v2

    .line 70
    invoke-virtual {p1, v0, v1, v2, p0}, Landroid/view/View;->setPadding(IIII)V

    .line 71
    .line 72
    .line 73
    :cond_1
    return-object p2

    .line 74
    nop

    .line 75
    :pswitch_data_0
    .packed-switch 0xe
        :pswitch_0
    .end packed-switch
.end method

.method public onFailure(Ljava/lang/Exception;)V
    .locals 3

    .line 1
    iget-object p0, p0, La/z9f;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, La/hgq;

    .line 4
    .line 5
    sget-object v0, La/hgq;->g2:La/nek;

    .line 6
    .line 7
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    instance-of v0, p1, La/rfq;

    .line 11
    .line 12
    if-eqz v0, :cond_1

    .line 13
    .line 14
    check-cast p1, La/rfq;

    .line 15
    .line 16
    iget-object p1, p1, La/rfq;->b:Ljava/lang/String;

    .line 17
    .line 18
    const-string v0, "ERROR_WEB_CONTEXT_CANCELED"

    .line 19
    .line 20
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 21
    .line 22
    .line 23
    move-result p1

    .line 24
    if-eqz p1, :cond_1

    .line 25
    .line 26
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->N()Z

    .line 27
    .line 28
    .line 29
    move-result p1

    .line 30
    if-eqz p1, :cond_0

    .line 31
    .line 32
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->F()Landroidx/fragment/app/e;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    new-instance v0, Lkotlin/Pair;

    .line 37
    .line 38
    const-string v1, "CLOSE_SOCIAL"

    .line 39
    .line 40
    const-string v2, ""

    .line 41
    .line 42
    invoke-direct {v0, v1, v2}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 43
    .line 44
    .line 45
    filled-new-array {v0}, [Lkotlin/Pair;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    invoke-static {v0}, La/i120;->V([Lkotlin/Pair;)Landroid/os/Bundle;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    invoke-virtual {p1, v0, v1}, Landroidx/fragment/app/e;->t0(Landroid/os/Bundle;Ljava/lang/String;)V

    .line 54
    .line 55
    .line 56
    :cond_0
    invoke-virtual {p0}, La/sik;->y0()V

    .line 57
    .line 58
    .line 59
    return-void

    .line 60
    :cond_1
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->D()Landroid/content/Context;

    .line 61
    .line 62
    .line 63
    move-result-object p1

    .line 64
    if-eqz p1, :cond_2

    .line 65
    .line 66
    const v0, 0x7f1307f9

    .line 67
    .line 68
    .line 69
    invoke-virtual {p1, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 70
    .line 71
    .line 72
    move-result-object p1

    .line 73
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 74
    .line 75
    .line 76
    invoke-virtual {p0, p1}, La/hgq;->R0(Ljava/lang/String;)V

    .line 77
    .line 78
    .line 79
    :cond_2
    return-void
.end method

.method public onSuccess(Ljava/lang/Object;)V
    .locals 1

    .line 1
    iget-byte v0, p0, La/z9f;->a:B

    .line 2
    .line 3
    iget-object p0, p0, La/z9f;->b:Ljava/lang/Object;

    .line 4
    .line 5
    sparse-switch v0, :sswitch_data_0

    .line 6
    .line 7
    .line 8
    check-cast p0, La/f8m;

    .line 9
    .line 10
    sget-object v0, La/hgq;->g2:La/nek;

    .line 11
    .line 12
    invoke-virtual {p0, p1}, La/f8m;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    return-void

    .line 16
    :sswitch_0
    check-cast p0, La/g7p;

    .line 17
    .line 18
    sget-object v0, La/hgq;->g2:La/nek;

    .line 19
    .line 20
    invoke-virtual {p0, p1}, La/g7p;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    return-void

    .line 24
    :sswitch_1
    check-cast p0, La/mcf;

    .line 25
    .line 26
    invoke-static {p0, p1}, Landroidx/credentials/playservices/CredentialProviderPlayServicesImpl;->$r8$lambda$wNyRQU4FRR3qZkFIXqBcIQRWXcc(La/mcf;Ljava/lang/Object;)V

    .line 27
    .line 28
    .line 29
    return-void

    .line 30
    :sswitch_2
    check-cast p0, La/v4f;

    .line 31
    .line 32
    invoke-virtual {p0, p1}, La/v4f;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    return-void

    .line 36
    :sswitch_3
    check-cast p0, La/v4f;

    .line 37
    .line 38
    invoke-virtual {p0, p1}, La/v4f;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    return-void

    .line 42
    nop

    .line 43
    :sswitch_data_0
    .sparse-switch
        0x2 -> :sswitch_3
        0x3 -> :sswitch_2
        0x4 -> :sswitch_1
        0x1b -> :sswitch_0
    .end sparse-switch
.end method

.method public then(Lcom/google/android/gms/tasks/Task;)Ljava/lang/Object;
    .locals 0

    .line 1
    iget-byte p1, p0, La/z9f;->a:B

    .line 2
    .line 3
    iget-object p0, p0, La/z9f;->b:Ljava/lang/Object;

    .line 4
    .line 5
    packed-switch p1, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    check-cast p0, Ljava/lang/Runnable;

    .line 9
    .line 10
    invoke-interface {p0}, Ljava/lang/Runnable;->run()V

    .line 11
    .line 12
    .line 13
    const/4 p0, 0x0

    .line 14
    invoke-static {p0}, Lcom/google/android/gms/tasks/Tasks;->forResult(Ljava/lang/Object;)Lcom/google/android/gms/tasks/Task;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    return-object p0

    .line 19
    :pswitch_0
    check-cast p0, Ljava/util/concurrent/Callable;

    .line 20
    .line 21
    invoke-interface {p0}, Ljava/util/concurrent/Callable;->call()Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    check-cast p0, Lcom/google/android/gms/tasks/Task;

    .line 26
    .line 27
    return-object p0

    .line 28
    nop

    .line 29
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
