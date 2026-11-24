.class public final La/wcr;
.super La/i3t0;
.source "SourceFile"


# static fields
.field public static final synthetic t:I


# instance fields
.field public final o:Ljava/lang/String;

.field public final p:I

.field public final q:La/i1w0;

.field public final r:La/nvu;

.field public final s:La/ctf0;


# direct methods
.method public constructor <init>(Ljava/lang/String;ILa/i1w0;La/yiu;La/ocl;La/m1e;La/mne;La/nvu;La/ctf0;)V
    .locals 6

    .line 1
    invoke-virtual {p6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    new-instance v2, La/yip;

    .line 8
    .line 9
    const/16 v0, 0x13

    .line 10
    .line 11
    invoke-direct {v2, p4, v0}, La/yip;-><init>(Ljava/lang/Object;B)V

    .line 12
    .line 13
    .line 14
    new-instance v3, La/yar;

    .line 15
    .line 16
    const/4 p4, 0x1

    .line 17
    invoke-direct {v3, p5, p4}, La/yar;-><init>(La/ocl;B)V

    .line 18
    .line 19
    .line 20
    iget-object p5, p7, La/mne;->a:La/rwj;

    .line 21
    .line 22
    invoke-static {p5, p5}, La/cvm0;->p(La/lne;La/lne;)La/g090;

    .line 23
    .line 24
    .line 25
    move-result-object v4

    .line 26
    const/4 v5, 0x0

    .line 27
    const/4 v1, 0x0

    .line 28
    move-object v0, p0

    .line 29
    invoke-direct/range {v0 .. v5}, La/i3t0;-><init>(La/vzg0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;La/g090;La/yzn0;)V

    .line 30
    .line 31
    .line 32
    iput-object p1, v0, La/wcr;->o:Ljava/lang/String;

    .line 33
    .line 34
    iput p2, v0, La/wcr;->p:I

    .line 35
    .line 36
    iput-object p3, v0, La/wcr;->q:La/i1w0;

    .line 37
    .line 38
    iput-object p8, v0, La/wcr;->r:La/nvu;

    .line 39
    .line 40
    iput-object p9, v0, La/wcr;->s:La/ctf0;

    .line 41
    .line 42
    invoke-virtual {v0}, La/wcr;->M()V

    .line 43
    .line 44
    .line 45
    invoke-interface {p6}, La/m1e;->a()La/gmq;

    .line 46
    .line 47
    .line 48
    move-result-object p0

    .line 49
    new-instance p1, La/hij;

    .line 50
    .line 51
    const/16 p2, 0x1d

    .line 52
    .line 53
    const/4 p3, 0x0

    .line 54
    invoke-direct {p1, v0, p3, p2}, La/hij;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 55
    .line 56
    .line 57
    new-instance p2, La/fnq;

    .line 58
    .line 59
    const/4 p6, 0x4

    .line 60
    invoke-direct {p2, p0, p1, p6}, La/fnq;-><init>(La/gmq;Lkotlin/jvm/functions/Function2;B)V

    .line 61
    .line 62
    .line 63
    new-instance p0, La/lo3;

    .line 64
    .line 65
    const/4 p1, 0x3

    .line 66
    const/16 p6, 0xb

    .line 67
    .line 68
    invoke-direct {p0, p1, p3, p6}, La/lo3;-><init>(ILa/yje;B)V

    .line 69
    .line 70
    .line 71
    new-instance p1, La/dnq;

    .line 72
    .line 73
    invoke-direct {p1, p2, p0, p4}, La/dnq;-><init>(La/gmq;La/xdr;B)V

    .line 74
    .line 75
    .line 76
    invoke-static {v0}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 77
    .line 78
    .line 79
    move-result-object p0

    .line 80
    invoke-static {p0, p5}, La/d5c;->S(La/vne;Lkotlin/coroutines/CoroutineContext;)La/sje;

    .line 81
    .line 82
    .line 83
    move-result-object p0

    .line 84
    new-instance p2, La/f1e;

    .line 85
    .line 86
    const/4 p4, 0x2

    .line 87
    const/16 p5, 0x1c

    .line 88
    .line 89
    invoke-direct {p2, p4, p3, p5}, La/f1e;-><init>(ILa/yje;B)V

    .line 90
    .line 91
    .line 92
    invoke-static {p1, p0, p2}, La/sac;->T(La/gmq;La/vne;Lkotlin/jvm/functions/Function2;)La/c4m0;

    .line 93
    .line 94
    .line 95
    return-void
.end method


# virtual methods
.method public final M()V
    .locals 9

    .line 1
    invoke-static {}, La/cy7;->c()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    iget-object v1, p0, La/wcr;->s:La/ctf0;

    .line 6
    .line 7
    iget-object v1, v1, La/ctf0;->e:La/ihk;

    .line 8
    .line 9
    iget-object v1, v1, La/ihk;->a:La/us00;

    .line 10
    .line 11
    invoke-virtual {v1}, La/us00;->getResources()Landroid/content/res/Resources;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    invoke-virtual {v1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    iget v1, v1, Landroid/util/DisplayMetrics;->widthPixels:I

    .line 20
    .line 21
    iget-object v2, p0, La/wcr;->r:La/nvu;

    .line 22
    .line 23
    iget v3, p0, La/wcr;->p:I

    .line 24
    .line 25
    iget-object v4, p0, La/wcr;->o:Ljava/lang/String;

    .line 26
    .line 27
    invoke-virtual {v2, v3, v1, v4, v0}, La/nvu;->H(IILjava/lang/String;Z)La/s4v0;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    iget-object v1, v0, La/s4v0;->a:Ljava/lang/String;

    .line 32
    .line 33
    const-string v2, "http"

    .line 34
    .line 35
    const/4 v3, 0x0

    .line 36
    invoke-static {v1, v2, v3}, Lkotlin/text/c;->x(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 37
    .line 38
    .line 39
    move-result v2

    .line 40
    if-nez v2, :cond_0

    .line 41
    .line 42
    const-string v2, "mailto"

    .line 43
    .line 44
    invoke-static {v1, v2, v3}, Lkotlin/text/c;->x(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 45
    .line 46
    .line 47
    move-result v2

    .line 48
    if-nez v2, :cond_0

    .line 49
    .line 50
    const-string v2, "tel"

    .line 51
    .line 52
    invoke-static {v1, v2, v3}, Lkotlin/text/c;->x(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 53
    .line 54
    .line 55
    move-result v2

    .line 56
    if-nez v2, :cond_0

    .line 57
    .line 58
    const-string v2, "http://"

    .line 59
    .line 60
    invoke-virtual {v2, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    move-result-object v1

    .line 64
    :cond_0
    move-object v5, v1

    .line 65
    iget-object v1, p0, La/i3t0;->i:La/ocj;

    .line 66
    .line 67
    iget-object v1, v1, La/ocj;->a:La/p7m0;

    .line 68
    .line 69
    :cond_1
    invoke-virtual {v1}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    move-result-object v8

    .line 73
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 74
    .line 75
    .line 76
    move-object v2, v8

    .line 77
    check-cast v2, La/scr;

    .line 78
    .line 79
    iget-object v3, p0, La/i3t0;->f:La/oyg0;

    .line 80
    .line 81
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 82
    .line 83
    .line 84
    iget v3, v0, La/s4v0;->b:I

    .line 85
    .line 86
    invoke-static {v3}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 87
    .line 88
    .line 89
    move-result-object v3

    .line 90
    new-instance v4, Lkotlin/Pair;

    .line 91
    .line 92
    const-string v6, "HTTP_X_PROJECT_ID"

    .line 93
    .line 94
    invoke-direct {v4, v6, v3}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 95
    .line 96
    .line 97
    invoke-static {v4}, La/wp20;->b(Lkotlin/Pair;)Ljava/util/Map;

    .line 98
    .line 99
    .line 100
    move-result-object v6

    .line 101
    const/16 v7, 0xd

    .line 102
    .line 103
    const/4 v3, 0x0

    .line 104
    const/4 v4, 0x0

    .line 105
    invoke-static/range {v2 .. v7}, La/scr;->a(La/scr;ZZLjava/lang/String;Ljava/util/Map;I)La/scr;

    .line 106
    .line 107
    .line 108
    move-result-object v2

    .line 109
    invoke-virtual {v1, v8, v2}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 110
    .line 111
    .line 112
    move-result v2

    .line 113
    if-eqz v2, :cond_1

    .line 114
    .line 115
    return-void
.end method

.method public final x(Ljava/lang/Object;)V
    .locals 8

    .line 1
    check-cast p1, La/ncr;

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    sget-object v0, La/jcr;->a:La/jcr;

    .line 7
    .line 8
    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    if-eqz v0, :cond_1

    .line 13
    .line 14
    iget-object p0, p0, La/wcr;->q:La/i1w0;

    .line 15
    .line 16
    invoke-static {p0}, La/b1j;->q(La/i1w0;)Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    new-instance v0, La/c8d;

    .line 21
    .line 22
    sget-object v1, La/y7d;->a:La/v7d;

    .line 23
    .line 24
    sget-object v2, La/p0w0;->a:La/p0w0;

    .line 25
    .line 26
    invoke-direct {v0, v1, v2}, La/c8d;-><init>(La/w7d;La/g1w0;)V

    .line 27
    .line 28
    .line 29
    const/4 v1, 0x0

    .line 30
    invoke-static {p1, v0, p0, p1, v1}, La/b1j;->p(Ljava/util/concurrent/CopyOnWriteArrayList;La/c8d;La/i1w0;Ljava/util/concurrent/CopyOnWriteArrayList;I)Ljava/util/ListIterator;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    :goto_0
    move-object v0, p1

    .line 35
    check-cast v0, La/paw;

    .line 36
    .line 37
    invoke-virtual {v0}, La/paw;->hasNext()Z

    .line 38
    .line 39
    .line 40
    move-result v1

    .line 41
    if-eqz v1, :cond_0

    .line 42
    .line 43
    invoke-virtual {v0}, La/paw;->next()Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    check-cast v0, La/oe50;

    .line 48
    .line 49
    invoke-virtual {p0, v0}, La/i1w0;->a(La/oe50;)V

    .line 50
    .line 51
    .line 52
    goto :goto_0

    .line 53
    :cond_0
    return-void

    .line 54
    :cond_1
    sget-object v0, La/lcr;->a:La/lcr;

    .line 55
    .line 56
    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 57
    .line 58
    .line 59
    move-result v0

    .line 60
    iget-object v1, p0, La/i3t0;->f:La/oyg0;

    .line 61
    .line 62
    iget-object p0, p0, La/i3t0;->i:La/ocj;

    .line 63
    .line 64
    if-eqz v0, :cond_3

    .line 65
    .line 66
    iget-object v0, p0, La/ocj;->a:La/p7m0;

    .line 67
    .line 68
    :cond_2
    invoke-virtual {v0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    move-result-object p0

    .line 72
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 73
    .line 74
    .line 75
    move-object v2, p0

    .line 76
    check-cast v2, La/scr;

    .line 77
    .line 78
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 79
    .line 80
    .line 81
    const/4 v6, 0x0

    .line 82
    const/16 v7, 0x3e

    .line 83
    .line 84
    const/4 v3, 0x0

    .line 85
    const/4 v4, 0x0

    .line 86
    const/4 v5, 0x0

    .line 87
    invoke-static/range {v2 .. v7}, La/scr;->a(La/scr;ZZLjava/lang/String;Ljava/util/Map;I)La/scr;

    .line 88
    .line 89
    .line 90
    move-result-object p1

    .line 91
    invoke-virtual {v0, p0, p1}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 92
    .line 93
    .line 94
    move-result p0

    .line 95
    if-eqz p0, :cond_2

    .line 96
    .line 97
    return-void

    .line 98
    :cond_3
    sget-object v0, La/kcr;->a:La/kcr;

    .line 99
    .line 100
    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 101
    .line 102
    .line 103
    move-result v0

    .line 104
    if-eqz v0, :cond_5

    .line 105
    .line 106
    iget-object v0, p0, La/ocj;->a:La/p7m0;

    .line 107
    .line 108
    :cond_4
    invoke-virtual {v0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 109
    .line 110
    .line 111
    move-result-object p0

    .line 112
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 113
    .line 114
    .line 115
    move-object v2, p0

    .line 116
    check-cast v2, La/scr;

    .line 117
    .line 118
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 119
    .line 120
    .line 121
    const/4 v6, 0x0

    .line 122
    const/16 v7, 0x3d

    .line 123
    .line 124
    const/4 v3, 0x0

    .line 125
    const/4 v4, 0x1

    .line 126
    const/4 v5, 0x0

    .line 127
    invoke-static/range {v2 .. v7}, La/scr;->a(La/scr;ZZLjava/lang/String;Ljava/util/Map;I)La/scr;

    .line 128
    .line 129
    .line 130
    move-result-object p1

    .line 131
    invoke-virtual {v0, p0, p1}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 132
    .line 133
    .line 134
    move-result p0

    .line 135
    if-eqz p0, :cond_4

    .line 136
    .line 137
    return-void

    .line 138
    :cond_5
    sget-object v0, La/mcr;->a:La/mcr;

    .line 139
    .line 140
    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 141
    .line 142
    .line 143
    move-result p1

    .line 144
    if-eqz p1, :cond_7

    .line 145
    .line 146
    iget-object p0, p0, La/ocj;->a:La/p7m0;

    .line 147
    .line 148
    :cond_6
    invoke-virtual {p0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 149
    .line 150
    .line 151
    move-result-object p1

    .line 152
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 153
    .line 154
    .line 155
    move-object v2, p1

    .line 156
    check-cast v2, La/scr;

    .line 157
    .line 158
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 159
    .line 160
    .line 161
    const/4 v6, 0x0

    .line 162
    const/16 v7, 0x3e

    .line 163
    .line 164
    const/4 v3, 0x1

    .line 165
    const/4 v4, 0x0

    .line 166
    const/4 v5, 0x0

    .line 167
    invoke-static/range {v2 .. v7}, La/scr;->a(La/scr;ZZLjava/lang/String;Ljava/util/Map;I)La/scr;

    .line 168
    .line 169
    .line 170
    move-result-object v0

    .line 171
    invoke-virtual {p0, p1, v0}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 172
    .line 173
    .line 174
    move-result p1

    .line 175
    if-eqz p1, :cond_6

    .line 176
    .line 177
    return-void

    .line 178
    :cond_7
    invoke-static {}, La/t9f;->b()V

    .line 179
    .line 180
    .line 181
    return-void
.end method
